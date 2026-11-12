package ch.qos.logback.core.status;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class StatusUtil {

    /* JADX INFO: renamed from: sm, reason: collision with root package name */
    StatusManager f27287sm;

    public StatusUtil(Context context) {
        this.f27287sm = context.getStatusManager();
    }

    public static boolean contextHasStatusListener(Context context) {
        List<StatusListener> copyOfStatusListenerList;
        StatusManager statusManager = context.getStatusManager();
        return (statusManager == null || (copyOfStatusListenerList = statusManager.getCopyOfStatusListenerList()) == null || copyOfStatusListenerList.size() == 0) ? false : true;
    }

    public static List<Status> filterStatusListByTimeThreshold(List<Status> list, long j8) {
        ArrayList arrayList = new ArrayList();
        for (Status status : list) {
            if (status.getDate().longValue() >= j8) {
                arrayList.add(status);
            }
        }
        return arrayList;
    }

    public void addError(Object obj, String str, Throwable th3) {
        addStatus(new ErrorStatus(str, obj, th3));
    }

    public void addInfo(Object obj, String str) {
        addStatus(new InfoStatus(str, obj));
    }

    public void addStatus(Status status) {
        StatusManager statusManager = this.f27287sm;
        if (statusManager != null) {
            statusManager.add(status);
        }
    }

    public void addWarn(Object obj, String str) {
        addStatus(new WarnStatus(str, obj));
    }

    public boolean containsException(Class<?> cls) {
        Iterator<Status> it = this.f27287sm.getCopyOfStatusList().iterator();
        while (it.hasNext()) {
            for (Throwable throwable = it.next().getThrowable(); throwable != null; throwable = throwable.getCause()) {
                if (throwable.getClass().getName().equals(cls.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsMatch(long j8, int i14, String str) {
        List<Status> listFilterStatusListByTimeThreshold = filterStatusListByTimeThreshold(this.f27287sm.getCopyOfStatusList(), j8);
        Pattern patternCompile = Pattern.compile(str);
        for (Status status : listFilterStatusListByTimeThreshold) {
            if (i14 == status.getLevel() && patternCompile.matcher(status.getMessage()).lookingAt()) {
                return true;
            }
        }
        return false;
    }

    public int getHighestLevel(long j8) {
        int level = 0;
        for (Status status : filterStatusListByTimeThreshold(this.f27287sm.getCopyOfStatusList(), j8)) {
            if (status.getLevel() > level) {
                level = status.getLevel();
            }
        }
        return level;
    }

    public boolean hasXMLParsingErrors(long j8) {
        return containsMatch(j8, 2, CoreConstants.XML_PARSING);
    }

    public boolean isErrorFree(long j8) {
        return 2 > getHighestLevel(j8);
    }

    public boolean isWarningOrErrorFree(long j8) {
        return 1 > getHighestLevel(j8);
    }

    public int matchCount(String str) {
        Pattern patternCompile = Pattern.compile(str);
        Iterator<Status> it = this.f27287sm.getCopyOfStatusList().iterator();
        int i14 = 0;
        while (it.hasNext()) {
            if (patternCompile.matcher(it.next().getMessage()).lookingAt()) {
                i14++;
            }
        }
        return i14;
    }

    public boolean noXMLParsingErrorsOccurred(long j8) {
        return !hasXMLParsingErrors(j8);
    }

    public long timeOfLastReset() {
        List<Status> copyOfStatusList = this.f27287sm.getCopyOfStatusList();
        if (copyOfStatusList == null) {
            return -1L;
        }
        for (int size = copyOfStatusList.size() - 1; size >= 0; size--) {
            Status status = copyOfStatusList.get(size);
            if (CoreConstants.RESET_MSG_PREFIX.equals(status.getMessage())) {
                return status.getDate().longValue();
            }
        }
        return -1L;
    }

    public StatusUtil(StatusManager statusManager) {
        this.f27287sm = statusManager;
    }

    public boolean containsMatch(int i14, String str) {
        return containsMatch(0L, i14, str);
    }

    public boolean containsMatch(String str) {
        Pattern patternCompile = Pattern.compile(str);
        Iterator<Status> it = this.f27287sm.getCopyOfStatusList().iterator();
        while (it.hasNext()) {
            if (patternCompile.matcher(it.next().getMessage()).lookingAt()) {
                return true;
            }
        }
        return false;
    }
}
