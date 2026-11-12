package ch.qos.logback.classic.android;

import android.util.Log;
import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
public class LogcatAppender extends UnsynchronizedAppenderBase<ILoggingEvent> {
    private static final int MAX_TAG_LENGTH = 23;
    private PatternLayoutEncoder encoder = null;
    private PatternLayoutEncoder tagEncoder = null;
    private boolean checkLoggable = false;

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase
    public void append(ILoggingEvent iLoggingEvent) {
        if (isStarted()) {
            String tag = getTag(iLoggingEvent);
            int i14 = iLoggingEvent.getLevel().levelInt;
            if (i14 == Integer.MIN_VALUE || i14 == 5000) {
                if (this.checkLoggable && !Log.isLoggable(tag, 2)) {
                    return;
                }
            } else if (i14 != 10000) {
                if (i14 != 20000) {
                    if (i14 != 30000) {
                        if (i14 != 40000) {
                            return;
                        }
                        if (this.checkLoggable && !Log.isLoggable(tag, 6)) {
                            return;
                        }
                    } else if (this.checkLoggable && !Log.isLoggable(tag, 5)) {
                        return;
                    }
                } else if (this.checkLoggable && !Log.isLoggable(tag, 4)) {
                    return;
                }
            } else if (this.checkLoggable && !Log.isLoggable(tag, 3)) {
                return;
            }
            this.encoder.getLayout().doLayout(iLoggingEvent);
        }
    }

    public boolean getCheckLoggable() {
        return this.checkLoggable;
    }

    public PatternLayoutEncoder getEncoder() {
        return this.encoder;
    }

    public String getTag(ILoggingEvent iLoggingEvent) {
        PatternLayoutEncoder patternLayoutEncoder = this.tagEncoder;
        String strDoLayout = patternLayoutEncoder != null ? patternLayoutEncoder.getLayout().doLayout(iLoggingEvent) : iLoggingEvent.getLoggerName();
        return (!this.checkLoggable || strDoLayout.length() <= 23) ? strDoLayout : strDoLayout.substring(0, 22).concat(Marker.ANY_MARKER);
    }

    public PatternLayoutEncoder getTagEncoder() {
        return this.tagEncoder;
    }

    public void setCheckLoggable(boolean z14) {
        this.checkLoggable = z14;
    }

    public void setEncoder(PatternLayoutEncoder patternLayoutEncoder) {
        this.encoder = patternLayoutEncoder;
    }

    public void setTagEncoder(PatternLayoutEncoder patternLayoutEncoder) {
        this.tagEncoder = patternLayoutEncoder;
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        StringBuilder sb3;
        PatternLayoutEncoder patternLayoutEncoder = this.encoder;
        if (patternLayoutEncoder != null && patternLayoutEncoder.getLayout() != null) {
            PatternLayoutEncoder patternLayoutEncoder2 = this.tagEncoder;
            if (patternLayoutEncoder2 != null) {
                Layout<ILoggingEvent> layout = patternLayoutEncoder2.getLayout();
                if (layout == null) {
                    sb3 = new StringBuilder("No tag layout set for the appender named [");
                } else if (layout instanceof PatternLayout) {
                    String pattern = this.tagEncoder.getPattern();
                    if (!pattern.contains("%nopex")) {
                        this.tagEncoder.stop();
                        this.tagEncoder.setPattern(pattern.concat("%nopex"));
                        this.tagEncoder.start();
                    }
                    ((PatternLayout) layout).setPostCompileProcessor(null);
                }
            }
            super.start();
            return;
        }
        sb3 = new StringBuilder("No layout set for the appender named [");
        sb3.append(this.name);
        sb3.append("].");
        addError(sb3.toString());
    }
}
