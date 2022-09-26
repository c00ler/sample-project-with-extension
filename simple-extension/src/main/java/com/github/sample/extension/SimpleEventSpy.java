package com.github.sample.extension;

import org.apache.maven.eventspy.AbstractEventSpy;
import org.apache.maven.eventspy.EventSpy;
import org.codehaus.plexus.component.annotations.Component;
import org.codehaus.plexus.component.annotations.Requirement;
import org.codehaus.plexus.logging.Logger;
import org.slf4j.LoggerFactory;

@Component(role = EventSpy.class)
public class SimpleEventSpy extends AbstractEventSpy {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(SimpleEventSpy.class);

    @Requirement
    private Logger plexusLogger;

    @Override
    public void init(Context context) throws Exception {
        LOGGER.info("Simple :: spy :: init :: slf4j");
        plexusLogger.info("Simple :: spy :: init :: plexus");

        LOGGER.debug("Simple :: spy :: init :: slf4j");
        plexusLogger.debug("Simple :: spy :: init :: plexus");
    }

    @Override
    public void close() throws Exception {
        LOGGER.info("Simple :: spy :: close :: slf4j");
        plexusLogger.info("Simple :: spy :: close :: plexus");

        LOGGER.debug("Simple :: spy :: close :: slf4j");
        plexusLogger.debug("Simple :: spy :: close :: plexus");
    }
}
