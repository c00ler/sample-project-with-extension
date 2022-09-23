package com.github.sample.extension;

import org.apache.maven.AbstractMavenLifecycleParticipant;
import org.apache.maven.MavenExecutionException;
import org.apache.maven.execution.MavenSession;
import org.codehaus.plexus.component.annotations.Component;
import org.codehaus.plexus.component.annotations.Requirement;
import org.codehaus.plexus.logging.Logger;
import org.slf4j.LoggerFactory;

@Component(role = AbstractMavenLifecycleParticipant.class, hint = "simple")
public class SimpleMavenLifecycleParticipant extends AbstractMavenLifecycleParticipant {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(SimpleMavenLifecycleParticipant.class);

    @Requirement
    private Logger plexusLogger;

    @Override
    public void afterSessionEnd(MavenSession session) throws MavenExecutionException {
        LOGGER.debug("Simple :: Slf4j");
        plexusLogger.debug("Simple :: Plexus");
    }
}
