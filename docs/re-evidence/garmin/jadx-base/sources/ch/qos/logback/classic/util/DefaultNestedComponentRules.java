package ch.qos.logback.classic.util;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.net.ssl.SSLNestedComponentRegistryRules;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultNestedComponentRules {
    public static void addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry defaultNestedComponentRegistry) {
        defaultNestedComponentRegistry.add(AppenderBase.class, TtmlNode.TAG_LAYOUT, PatternLayout.class);
        defaultNestedComponentRegistry.add(UnsynchronizedAppenderBase.class, TtmlNode.TAG_LAYOUT, PatternLayout.class);
        defaultNestedComponentRegistry.add(AppenderBase.class, "encoder", PatternLayoutEncoder.class);
        defaultNestedComponentRegistry.add(UnsynchronizedAppenderBase.class, "encoder", PatternLayoutEncoder.class);
        SSLNestedComponentRegistryRules.addDefaultNestedComponentRegistryRules(defaultNestedComponentRegistry);
    }
}
