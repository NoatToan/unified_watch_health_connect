package ch.qos.logback.classic.util;

import ch.qos.logback.classic.ClassicConstants;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.selector.ContextSelector;
import ch.qos.logback.classic.selector.DefaultContextSelector;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import com.nimbusds.jose.shaded.gson.internal.a;
import kg.f;

/* JADX INFO: loaded from: classes7.dex */
public class ContextSelectorStaticBinder {
    static ContextSelectorStaticBinder singleton = new ContextSelectorStaticBinder();
    ContextSelector contextSelector;
    Object key;

    public static ContextSelector dynamicalContextSelector(LoggerContext loggerContext, String str) {
        return (ContextSelector) Loader.loadClass(str).getConstructor(LoggerContext.class).newInstance(loggerContext);
    }

    public static ContextSelectorStaticBinder getSingleton() {
        return singleton;
    }

    public ContextSelector getContextSelector() {
        return this.contextSelector;
    }

    public void init(LoggerContext loggerContext, Object obj) {
        Object obj2 = this.key;
        if (obj2 == null) {
            this.key = obj;
        } else if (obj2 != obj) {
            a.t("Only certain classes can access this method.");
            return;
        }
        String systemProperty = OptionHelper.getSystemProperty(ClassicConstants.LOGBACK_CONTEXT_SELECTOR);
        if (systemProperty == null) {
            this.contextSelector = new DefaultContextSelector(loggerContext);
        } else if (systemProperty.equals("JNDI")) {
            f.n("JNDI not supported");
        } else {
            this.contextSelector = dynamicalContextSelector(loggerContext, systemProperty);
        }
    }
}
