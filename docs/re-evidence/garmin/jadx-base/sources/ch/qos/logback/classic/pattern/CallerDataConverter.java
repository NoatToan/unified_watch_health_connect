package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.status.ErrorStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class CallerDataConverter extends ClassicConverter {
    public static final String DEFAULT_CALLER_LINE_PREFIX = "Caller+";
    public static final String DEFAULT_RANGE_DELIMITER = "..";
    private int depthStart = 0;
    private int depthEnd = 5;
    List<EventEvaluator<ILoggingEvent>> evaluatorList = null;
    final int MAX_ERROR_COUNT = 4;
    int errorCount = 0;

    private void addEvaluator(EventEvaluator<ILoggingEvent> eventEvaluator) {
        if (this.evaluatorList == null) {
            this.evaluatorList = new ArrayList();
        }
        this.evaluatorList.add(eventEvaluator);
    }

    private void checkRange() {
        StringBuilder sb3;
        String str;
        int i14;
        int i15 = this.depthStart;
        if (i15 < 0 || (i14 = this.depthEnd) < 0) {
            sb3 = new StringBuilder("Invalid depthStart/depthEnd range [");
            sb3.append(this.depthStart);
            sb3.append(", ");
            sb3.append(this.depthEnd);
            str = "] (negative values are not allowed)";
        } else {
            if (i15 < i14) {
                return;
            }
            sb3 = new StringBuilder("Invalid depthEnd range [");
            sb3.append(this.depthStart);
            sb3.append(", ");
            sb3.append(this.depthEnd);
            str = "] (start greater or equal to end)";
        }
        sb3.append(str);
        addError(sb3.toString());
    }

    private boolean isRange(String str) {
        return str.contains(getDefaultRangeDelimiter());
    }

    private String[] splitRange(String str) {
        return str.split(Pattern.quote(getDefaultRangeDelimiter()), 2);
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        StringBuilder sb3 = new StringBuilder();
        if (this.evaluatorList != null) {
            for (int i14 = 0; i14 < this.evaluatorList.size(); i14++) {
                EventEvaluator<ILoggingEvent> eventEvaluator = this.evaluatorList.get(i14);
                try {
                    if (!eventEvaluator.evaluate(iLoggingEvent)) {
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
            return "";
        }
        StackTraceElement[] callerData = iLoggingEvent.getCallerData();
        if (callerData != null) {
            int length = callerData.length;
            int i15 = this.depthStart;
            if (length > i15) {
                int length2 = this.depthEnd;
                if (length2 >= callerData.length) {
                    length2 = callerData.length;
                }
                while (i15 < length2) {
                    sb3.append(getCallerLinePrefix());
                    sb3.append(i15);
                    sb3.append("\t at ");
                    sb3.append(callerData[i15]);
                    sb3.append(CoreConstants.LINE_SEPARATOR);
                    i15++;
                }
                return sb3.toString();
            }
        }
        return CallerData.CALLER_DATA_NA;
    }

    public String getCallerLinePrefix() {
        return DEFAULT_CALLER_LINE_PREFIX;
    }

    public String getDefaultRangeDelimiter() {
        return DEFAULT_RANGE_DELIMITER;
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        EventEvaluator<ILoggingEvent> eventEvaluator;
        String firstOption = getFirstOption();
        if (firstOption == null) {
            return;
        }
        try {
            if (isRange(firstOption)) {
                String[] strArrSplitRange = splitRange(firstOption);
                if (strArrSplitRange.length == 2) {
                    this.depthStart = Integer.parseInt(strArrSplitRange[0]);
                    this.depthEnd = Integer.parseInt(strArrSplitRange[1]);
                    checkRange();
                } else {
                    addError("Failed to parse depth option as range [" + firstOption + "]");
                }
            } else {
                this.depthEnd = Integer.parseInt(firstOption);
            }
        } catch (NumberFormatException e4) {
            addError("Failed to parse depth option [" + firstOption + "]", e4);
        }
        List<String> optionList = getOptionList();
        if (optionList == null || optionList.size() <= 1) {
            return;
        }
        int size = optionList.size();
        for (int i14 = 1; i14 < size; i14++) {
            String str = optionList.get(i14);
            Context context = getContext();
            if (context != null && (eventEvaluator = (EventEvaluator) ((Map) context.getObject(CoreConstants.EVALUATOR_MAP)).get(str)) != null) {
                addEvaluator(eventEvaluator);
            }
        }
    }
}
