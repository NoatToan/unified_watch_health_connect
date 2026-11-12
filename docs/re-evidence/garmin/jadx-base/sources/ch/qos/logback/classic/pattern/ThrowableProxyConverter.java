package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.status.ErrorStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ThrowableProxyConverter extends ThrowableHandlingConverter {
    protected static final int BUILDER_CAPACITY = 2048;
    int lengthOption;
    List<EventEvaluator<ILoggingEvent>> evaluatorList = null;
    List<String> ignoredStackTraceLines = null;
    int errorCount = 0;

    private void addEvaluator(EventEvaluator<ILoggingEvent> eventEvaluator) {
        if (this.evaluatorList == null) {
            this.evaluatorList = new ArrayList();
        }
        this.evaluatorList.add(eventEvaluator);
    }

    private void addIgnoreStackTraceLine(String str) {
        if (this.ignoredStackTraceLines == null) {
            this.ignoredStackTraceLines = new ArrayList();
        }
        this.ignoredStackTraceLines.add(str);
    }

    private boolean isIgnoredStackTraceLine(String str) {
        List<String> list = this.ignoredStackTraceLines;
        if (list == null) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    private void printIgnoredCount(StringBuilder sb3, int i14) {
        sb3.append(" [");
        sb3.append(i14);
        sb3.append(" skipped]");
    }

    private void printStackLine(StringBuilder sb3, int i14, StackTraceElementProxy stackTraceElementProxy) {
        sb3.append(stackTraceElementProxy);
        extraData(sb3, stackTraceElementProxy);
        if (i14 > 0) {
            printIgnoredCount(sb3, i14);
        }
    }

    private void recursiveAppend(StringBuilder sb3, String str, int i14, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy == null) {
            return;
        }
        subjoinFirstLine(sb3, str, i14, iThrowableProxy);
        sb3.append(CoreConstants.LINE_SEPARATOR);
        subjoinSTEPArray(sb3, i14, iThrowableProxy);
        IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
        if (suppressed != null) {
            for (IThrowableProxy iThrowableProxy2 : suppressed) {
                recursiveAppend(sb3, CoreConstants.SUPPRESSED, i14 + 1, iThrowableProxy2);
            }
        }
        recursiveAppend(sb3, CoreConstants.CAUSED_BY, i14, iThrowableProxy.getCause());
    }

    private void subjoinExceptionMessage(StringBuilder sb3, IThrowableProxy iThrowableProxy) {
        sb3.append(iThrowableProxy.getClassName());
        sb3.append(": ");
        sb3.append(iThrowableProxy.getMessage());
    }

    private void subjoinFirstLine(StringBuilder sb3, String str, int i14, IThrowableProxy iThrowableProxy) {
        ThrowableProxyUtil.indent(sb3, i14 - 1);
        if (str != null) {
            sb3.append(str);
        }
        subjoinExceptionMessage(sb3, iThrowableProxy);
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        IThrowableProxy throwableProxy = iLoggingEvent.getThrowableProxy();
        if (throwableProxy == null) {
            return "";
        }
        if (this.evaluatorList != null) {
            for (int i14 = 0; i14 < this.evaluatorList.size(); i14++) {
                EventEvaluator<ILoggingEvent> eventEvaluator = this.evaluatorList.get(i14);
                try {
                    if (eventEvaluator.evaluate(iLoggingEvent)) {
                        return "";
                    }
                } catch (EvaluationException e4) {
                    this.errorCount++;
                    if (this.errorCount < 4) {
                        addError("Exception thrown for evaluator named [" + eventEvaluator.getName() + "]", e4);
                    } else if (this.errorCount == 4) {
                        ErrorStatus errorStatus = new ErrorStatus("Exception thrown for evaluator named [" + eventEvaluator.getName() + "].", this, e4);
                        errorStatus.add(new ErrorStatus("This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.", this));
                        addStatus(errorStatus);
                    }
                }
            }
        }
        return throwableProxyToString(throwableProxy);
    }

    public void extraData(StringBuilder sb3, StackTraceElementProxy stackTraceElementProxy) {
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String firstOption = getFirstOption();
        if (firstOption == null) {
            this.lengthOption = Integer.MAX_VALUE;
        } else {
            String lowerCase = firstOption.toLowerCase(Locale.US);
            if ("full".equals(lowerCase)) {
                this.lengthOption = Integer.MAX_VALUE;
            } else if ("short".equals(lowerCase)) {
                this.lengthOption = 1;
            } else {
                try {
                    this.lengthOption = Integer.parseInt(lowerCase);
                } catch (NumberFormatException unused) {
                    addError("Could not parse [" + lowerCase + "] as an integer");
                    this.lengthOption = Integer.MAX_VALUE;
                }
            }
        }
        List<String> optionList = getOptionList();
        if (optionList != null && optionList.size() > 1) {
            int size = optionList.size();
            for (int i14 = 1; i14 < size; i14++) {
                String str = optionList.get(i14);
                EventEvaluator<ILoggingEvent> eventEvaluator = (EventEvaluator) ((Map) getContext().getObject(CoreConstants.EVALUATOR_MAP)).get(str);
                if (eventEvaluator != null) {
                    addEvaluator(eventEvaluator);
                } else {
                    addIgnoreStackTraceLine(str);
                }
            }
        }
        super.start();
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.evaluatorList = null;
        super.stop();
    }

    public void subjoinSTEPArray(StringBuilder sb3, int i14, IThrowableProxy iThrowableProxy) {
        StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
        int commonFrames = iThrowableProxy.getCommonFrames();
        int length = this.lengthOption;
        boolean z14 = length > stackTraceElementProxyArray.length;
        if (z14) {
            length = stackTraceElementProxyArray.length;
        }
        if (commonFrames > 0 && z14) {
            length -= commonFrames;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArray[i16];
            if (isIgnoredStackTraceLine(stackTraceElementProxy.toString())) {
                i15++;
                if (length < stackTraceElementProxyArray.length) {
                    length++;
                }
            } else {
                ThrowableProxyUtil.indent(sb3, i14);
                printStackLine(sb3, i15, stackTraceElementProxy);
                sb3.append(CoreConstants.LINE_SEPARATOR);
                i15 = 0;
            }
        }
        if (i15 > 0) {
            printIgnoredCount(sb3, i15);
            sb3.append(CoreConstants.LINE_SEPARATOR);
        }
        if (commonFrames <= 0 || !z14) {
            return;
        }
        ThrowableProxyUtil.indent(sb3, i14);
        sb3.append("... ");
        sb3.append(iThrowableProxy.getCommonFrames());
        sb3.append(" common frames omitted");
        sb3.append(CoreConstants.LINE_SEPARATOR);
    }

    public String throwableProxyToString(IThrowableProxy iThrowableProxy) {
        StringBuilder sb3 = new StringBuilder(2048);
        recursiveAppend(sb3, null, 1, iThrowableProxy);
        return sb3.toString();
    }
}
