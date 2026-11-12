package ch.qos.logback.classic.turbo;

import androidx.room.a0;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.android.AndroidContextUtil;
import ch.qos.logback.core.joran.GenericConfigurator;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.spi.ConfigurationWatchList;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.status.StatusUtil;
import java.net.URL;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.commons.text.lookup.StringLookupFactory;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
public class ReconfigureOnChangeFilter extends TurboFilter {
    public static final long DEFAULT_REFRESH_PERIOD = 60000;
    private static final long MASK_DECREASE_THRESHOLD = 800;
    private static final long MASK_INCREASE_THRESHOLD = 100;
    private static final int MAX_MASK = 65535;
    ConfigurationWatchList configurationWatchList;
    URL mainConfigurationURL;
    protected volatile long nextCheck;
    long refreshPeriod = 60000;
    private long invocationCounter = 0;
    private volatile long mask = 15;
    private volatile long lastMaskCheck = System.currentTimeMillis();

    public class ReconfiguringThread implements Runnable {
        public ReconfiguringThread() {
        }

        private void fallbackConfiguration(LoggerContext loggerContext, List<SaxEvent> list, URL url) {
            JoranConfigurator joranConfigurator = new JoranConfigurator();
            joranConfigurator.setContext(loggerContext);
            ReconfigureOnChangeFilter reconfigureOnChangeFilter = ReconfigureOnChangeFilter.this;
            if (list == null) {
                reconfigureOnChangeFilter.addWarn("No previous configuration to fall back on.");
                return;
            }
            reconfigureOnChangeFilter.addWarn("Falling back to previously registered safe configuration.");
            try {
                loggerContext.reset();
                new AndroidContextUtil().setupProperties(loggerContext);
                GenericConfigurator.informContextOfURLUsedForConfiguration(loggerContext, url);
                joranConfigurator.doConfigure(list);
                ReconfigureOnChangeFilter.this.addInfo("Re-registering previous fallback configuration once more as a fallback configuration point");
                joranConfigurator.registerSafeConfiguration(list);
            } catch (JoranException e4) {
                ReconfigureOnChangeFilter.this.addError("Unexpected exception thrown by a configuration considered safe.", e4);
            }
        }

        private void performXMLConfiguration(LoggerContext loggerContext) {
            JoranConfigurator joranConfigurator = new JoranConfigurator();
            joranConfigurator.setContext(loggerContext);
            StatusUtil statusUtil = new StatusUtil(loggerContext);
            List<SaxEvent> listRecallSafeConfiguration = joranConfigurator.recallSafeConfiguration();
            URL mainWatchURL = ConfigurationWatchListUtil.getMainWatchURL(loggerContext);
            loggerContext.reset();
            new AndroidContextUtil().setupProperties(loggerContext);
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                joranConfigurator.doConfigure(ReconfigureOnChangeFilter.this.mainConfigurationURL);
                if (statusUtil.hasXMLParsingErrors(jCurrentTimeMillis)) {
                    fallbackConfiguration(loggerContext, listRecallSafeConfiguration, mainWatchURL);
                }
            } catch (JoranException unused) {
                fallbackConfiguration(loggerContext, listRecallSafeConfiguration, mainWatchURL);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ReconfigureOnChangeFilter reconfigureOnChangeFilter = ReconfigureOnChangeFilter.this;
            if (reconfigureOnChangeFilter.mainConfigurationURL == null) {
                reconfigureOnChangeFilter.addInfo("Due to missing top level configuration file, skipping reconfiguration");
                return;
            }
            LoggerContext loggerContext = (LoggerContext) ((ContextAwareBase) reconfigureOnChangeFilter).context;
            ReconfigureOnChangeFilter.this.addInfo("Will reset and reconfigure context named [" + ((ContextAwareBase) ReconfigureOnChangeFilter.this).context.getName() + "]");
            if (ReconfigureOnChangeFilter.this.mainConfigurationURL.toString().endsWith(StringLookupFactory.KEY_XML)) {
                performXMLConfiguration(loggerContext);
            }
        }
    }

    private void updateMaskIfNecessary(long j8) {
        long j14;
        long j15 = j8 - this.lastMaskCheck;
        this.lastMaskCheck = j8;
        if (j15 < MASK_INCREASE_THRESHOLD && this.mask < WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            j14 = (this.mask << 1) | 1;
        } else if (j15 <= MASK_DECREASE_THRESHOLD) {
            return;
        } else {
            j14 = this.mask >>> 2;
        }
        this.mask = j14;
    }

    public boolean changeDetected(long j8) {
        if (j8 < this.nextCheck) {
            return false;
        }
        updateNextCheck(j8);
        return this.configurationWatchList.changeDetected();
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter
    public FilterReply decide(Marker marker, Logger logger, Level level, String str, Object[] objArr, Throwable th3) {
        if (!isStarted()) {
            return FilterReply.NEUTRAL;
        }
        long j8 = this.invocationCounter;
        this.invocationCounter = 1 + j8;
        if ((j8 & this.mask) != this.mask) {
            return FilterReply.NEUTRAL;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.configurationWatchList) {
            try {
                updateMaskIfNecessary(jCurrentTimeMillis);
                if (changeDetected(jCurrentTimeMillis)) {
                    disableSubsequentReconfiguration();
                    detachReconfigurationToNewThread();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return FilterReply.NEUTRAL;
    }

    public void detachReconfigurationToNewThread() {
        addInfo("Detected change in [" + this.configurationWatchList.getCopyOfFileWatchList() + "]");
        this.context.getScheduledExecutorService().submit(new ReconfiguringThread());
    }

    public void disableSubsequentReconfiguration() {
        this.nextCheck = Long.MAX_VALUE;
    }

    public long getRefreshPeriod() {
        return this.refreshPeriod;
    }

    public void setRefreshPeriod(long j8) {
        this.refreshPeriod = j8;
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String str;
        ConfigurationWatchList configurationWatchList = ConfigurationWatchListUtil.getConfigurationWatchList(this.context);
        this.configurationWatchList = configurationWatchList;
        if (configurationWatchList != null) {
            URL mainURL = configurationWatchList.getMainURL();
            this.mainConfigurationURL = mainURL;
            if (mainURL != null) {
                addInfo("Will scan for changes in [" + this.configurationWatchList.getCopyOfFileWatchList() + "] every " + (this.refreshPeriod / 1000) + " seconds. ");
                synchronized (this.configurationWatchList) {
                    updateNextCheck(System.currentTimeMillis());
                }
                super.start();
                return;
            }
            str = "Due to missing top level configuration file, automatic reconfiguration is impossible.";
        } else {
            str = "Empty ConfigurationWatchList in context";
        }
        addWarn(str);
    }

    public String toString() {
        return a0.l(new StringBuilder("ReconfigureOnChangeFilter{invocationCounter="), this.invocationCounter, CoreConstants.CURLY_RIGHT);
    }

    public void updateNextCheck(long j8) {
        this.nextCheck = j8 + this.refreshPeriod;
    }
}
