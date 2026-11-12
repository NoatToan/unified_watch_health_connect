package ch.qos.logback.classic.util;

import am.j;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.android.AndroidContextUtil;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import ch.qos.logback.core.util.StatusListenerConfigHelper;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
public class ContextInitializer {
    public static final String AUTOCONFIG_FILE = "assets/logback.xml";
    public static final String CONFIG_FILE_PROPERTY = "logback.configurationFile";
    final ClassLoader classLoader = Loader.getClassLoaderOfObject(this);
    final LoggerContext loggerContext;

    public ContextInitializer(LoggerContext loggerContext) {
        this.loggerContext = loggerContext;
    }

    private URL findConfigFileFromSystemProperties(boolean z14) {
        URL url;
        String systemProperty = OptionHelper.getSystemProperty(CONFIG_FILE_PROPERTY);
        try {
            if (systemProperty != null) {
                try {
                    File file = new File(systemProperty);
                    if (file.exists() && file.isFile()) {
                        if (z14) {
                            statusOnResourceSearch(systemProperty, this.classLoader, systemProperty);
                        }
                        url = file.toURI().toURL();
                    } else {
                        url = new URL(systemProperty);
                    }
                    if (z14) {
                        statusOnResourceSearch(systemProperty, this.classLoader, url != null ? url.toString() : null);
                    }
                    return url;
                } catch (MalformedURLException unused) {
                    URL resource = Loader.getResource(systemProperty, this.classLoader);
                    if (resource != null) {
                        if (z14) {
                            statusOnResourceSearch(systemProperty, this.classLoader, resource.toString());
                        }
                        return resource;
                    }
                    if (z14) {
                        statusOnResourceSearch(systemProperty, this.classLoader, resource != null ? resource.toString() : null);
                    }
                }
            }
            return null;
        } catch (Throwable th3) {
            if (z14) {
                statusOnResourceSearch(systemProperty, this.classLoader, null);
            }
            throw th3;
        }
    }

    private URL findConfigFileURLFromAssets(boolean z14) {
        return getResource(AUTOCONFIG_FILE, this.classLoader, z14);
    }

    private URL getResource(String str, ClassLoader classLoader, boolean z14) {
        URL resource = classLoader.getResource(str);
        if (z14) {
            statusOnResourceSearch(str, classLoader, resource != null ? str : null);
        }
        return resource;
    }

    private void statusOnResourceSearch(String str, ClassLoader classLoader, String str2) {
        StatusManager statusManager = this.loggerContext.getStatusManager();
        if (str2 == null) {
            statusManager.add(new InfoStatus(j.m("Could NOT find resource [", str, "]"), this.loggerContext));
        } else {
            statusManager.add(new InfoStatus(e0.g("Found resource [", str, "] at [", str2, "]"), this.loggerContext));
        }
    }

    public void autoConfig() {
        StatusListenerConfigHelper.installIfAsked(this.loggerContext);
        new AndroidContextUtil().setupProperties(this.loggerContext);
        JoranConfigurator joranConfigurator = new JoranConfigurator();
        joranConfigurator.setContext(this.loggerContext);
        URL urlFindConfigFileFromSystemProperties = findConfigFileFromSystemProperties(true);
        if (urlFindConfigFileFromSystemProperties != null) {
            joranConfigurator.doConfigure(urlFindConfigFileFromSystemProperties);
            return;
        }
        URL urlFindConfigFileURLFromAssets = findConfigFileURLFromAssets(true);
        if (urlFindConfigFileURLFromAssets != null) {
            joranConfigurator.doConfigure(urlFindConfigFileURLFromAssets);
        }
    }
}
