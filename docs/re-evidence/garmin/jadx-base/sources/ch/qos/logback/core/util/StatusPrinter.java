package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.helpers.ThrowableToStringArray;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.StatusUtil;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class StatusPrinter {

    /* JADX INFO: renamed from: ps, reason: collision with root package name */
    private static PrintStream f27289ps = System.out;
    static CachingDateFormatter cachingDateFormat = new CachingDateFormatter("HH:mm:ss,SSS");

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1104)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1058)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    private static void appendThrowable(StringBuilder sb3, Throwable th3) {
        for (String str : ThrowableToStringArray.convert(th3)) {
            if (!str.startsWith(CoreConstants.CAUSED_BY)) {
                sb3.append(Character.isDigit(str.charAt(0)) ? "\t... " : "\tat ");
            }
            sb3.append(str);
            sb3.append(CoreConstants.LINE_SEPARATOR);
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1104)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1058)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public static void buildStr(StringBuilder sb3, String str, Status status) {
        String strG = k.g(str, status.hasChildren() ? "+ " : "|-");
        CachingDateFormatter cachingDateFormatter = cachingDateFormat;
        if (cachingDateFormatter != null) {
            sb3.append(cachingDateFormatter.format(status.getDate().longValue()));
            sb3.append(StringUtils.SPACE);
        }
        sb3.append(strG);
        sb3.append(status);
        sb3.append(CoreConstants.LINE_SEPARATOR);
        if (status.getThrowable() != null) {
            appendThrowable(sb3, status.getThrowable());
        }
        if (status.hasChildren()) {
            Iterator<Status> it = status.iterator();
            while (it.hasNext()) {
                buildStr(sb3, str + "  ", it.next());
            }
        }
    }

    private static void buildStrFromStatusList(StringBuilder sb3, List<Status> list) {
        if (list == null) {
            return;
        }
        Iterator<Status> it = list.iterator();
        while (it.hasNext()) {
            buildStr(sb3, "", it.next());
        }
    }

    public static void print(Context context, long j8) {
        if (context == null) {
            h.s("Context argument cannot be null");
            return;
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager != null) {
            print(statusManager, j8);
            return;
        }
        f27289ps.println("WARN: Context named \"" + context.getName() + "\" has no status manager");
    }

    public static void printIfErrorsOccured(Context context) {
        if (context == null) {
            h.s("Context argument cannot be null");
            return;
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager != null) {
            if (new StatusUtil(context).getHighestLevel(0L) == 2) {
                print(statusManager);
            }
        } else {
            f27289ps.println("WARN: Context named \"" + context.getName() + "\" has no status manager");
        }
    }

    public static void printInCaseOfErrorsOrWarnings(Context context, long j8) {
        if (context == null) {
            h.s("Context argument cannot be null");
            return;
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager != null) {
            if (new StatusUtil(context).getHighestLevel(j8) >= 1) {
                print(statusManager, j8);
            }
        } else {
            f27289ps.println("WARN: Context named \"" + context.getName() + "\" has no status manager");
        }
    }

    public static void setPrintStream(PrintStream printStream) {
        f27289ps = printStream;
    }

    public static void print(Context context) {
        print(context, 0L);
    }

    public static void print(StatusManager statusManager) {
        print(statusManager, 0L);
    }

    public static void print(StatusManager statusManager, long j8) {
        StringBuilder sb3 = new StringBuilder();
        buildStrFromStatusList(sb3, StatusUtil.filterStatusListByTimeThreshold(statusManager.getCopyOfStatusList(), j8));
        f27289ps.println(sb3.toString());
    }

    public static void print(List<Status> list) {
        StringBuilder sb3 = new StringBuilder();
        buildStrFromStatusList(sb3, list);
        f27289ps.println(sb3.toString());
    }

    public static void printInCaseOfErrorsOrWarnings(Context context) {
        printInCaseOfErrorsOrWarnings(context, 0L);
    }
}
