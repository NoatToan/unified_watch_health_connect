package ch.qos.logback.classic.html;

import am.j;
import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.pattern.MDCConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.helpers.Transform;
import ch.qos.logback.core.html.HTMLLayoutBase;
import ch.qos.logback.core.html.IThrowableRenderer;
import ch.qos.logback.core.pattern.Converter;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class HTMLLayout extends HTMLLayoutBase<ILoggingEvent> {
    static final String DEFAULT_CONVERSION_PATTERN = "%date%thread%level%logger%mdc%msg";
    IThrowableRenderer<ILoggingEvent> throwableRenderer;

    public HTMLLayout() {
        this.pattern = DEFAULT_CONVERSION_PATTERN;
        this.throwableRenderer = new DefaultThrowableRenderer();
        this.cssBuilder = new DefaultCssBuilder();
    }

    private void appendEventToBuffer(StringBuilder sb3, Converter<ILoggingEvent> converter, ILoggingEvent iLoggingEvent) {
        sb3.append("<td class=\"");
        sb3.append(computeConverterName(converter));
        sb3.append("\">");
        sb3.append(Transform.escapeTags(converter.convert(iLoggingEvent)));
        sb3.append("</td>");
        sb3.append(CoreConstants.LINE_SEPARATOR);
    }

    @Override // ch.qos.logback.core.html.HTMLLayoutBase
    public String computeConverterName(Converter<ILoggingEvent> converter) {
        if (!(converter instanceof MDCConverter)) {
            return super.computeConverterName(converter);
        }
        String firstOption = ((MDCConverter) converter).getFirstOption();
        return firstOption != null ? firstOption : "MDC";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ch.qos.logback.core.Layout
    public String doLayout(ILoggingEvent iLoggingEvent) {
        StringBuilder sb3 = new StringBuilder();
        startNewTableIfLimitReached(sb3);
        long j8 = this.counter;
        this.counter = j8 + 1;
        boolean z14 = (j8 & 1) != 0;
        String lowerCase = iLoggingEvent.getLevel().toString().toLowerCase(Locale.US);
        String str = CoreConstants.LINE_SEPARATOR;
        j.y(sb3, str, "<tr class=\"", lowerCase);
        sb3.append(z14 ? " odd\">" : " even\">");
        sb3.append(str);
        for (Converter next = this.head; next != null; next = next.getNext()) {
            appendEventToBuffer(sb3, next, iLoggingEvent);
        }
        sb3.append("</tr>");
        sb3.append(CoreConstants.LINE_SEPARATOR);
        if (iLoggingEvent.getThrowableProxy() != null) {
            this.throwableRenderer.render(sb3, iLoggingEvent);
        }
        return sb3.toString();
    }

    @Override // ch.qos.logback.core.html.HTMLLayoutBase
    public Map<String, String> getDefaultConverterMap() {
        return PatternLayout.defaultConverterMap;
    }

    public IThrowableRenderer<ILoggingEvent> getThrowableRenderer() {
        return this.throwableRenderer;
    }

    public void setThrowableRenderer(IThrowableRenderer<ILoggingEvent> iThrowableRenderer) {
        this.throwableRenderer = iThrowableRenderer;
    }

    @Override // ch.qos.logback.core.html.HTMLLayoutBase, ch.qos.logback.core.LayoutBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (this.throwableRenderer == null) {
            addError("ThrowableRender cannot be null.");
        } else {
            super.start();
        }
    }
}
