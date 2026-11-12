package cn.hutool.core.date;

import defpackage.g4h;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes.dex */
public class GroupTimeInterval implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Map<String, Long> groupMap = new ConcurrentHashMap();
    private final boolean isNano;

    public GroupTimeInterval(boolean z) {
        this.isNano = z;
    }

    private long getTime() {
        return this.isNano ? System.nanoTime() : System.currentTimeMillis();
    }

    public GroupTimeInterval clear() {
        this.groupMap.clear();
        return this;
    }

    public long interval(String str) {
        Long l = this.groupMap.get(str);
        if (l == null) {
            return 0L;
        }
        return getTime() - l.longValue();
    }

    public long intervalDay(String str) {
        return interval(str, DateUnit.DAY);
    }

    public long intervalHour(String str) {
        return interval(str, DateUnit.HOUR);
    }

    public long intervalMinute(String str) {
        return interval(str, DateUnit.MINUTE);
    }

    public long intervalMs(String str) {
        return interval(str, DateUnit.MS);
    }

    public String intervalPretty(String str) {
        return a.k(intervalMs(str));
    }

    public long intervalRestart(String str) {
        long time = getTime();
        return time - ((Long) g4h.e(this.groupMap.put(str, Long.valueOf(time)), Long.valueOf(time))).longValue();
    }

    public long intervalSecond(String str) {
        return interval(str, DateUnit.SECOND);
    }

    public long intervalWeek(String str) {
        return interval(str, DateUnit.WEEK);
    }

    public long start(String str) {
        long time = getTime();
        this.groupMap.put(str, Long.valueOf(time));
        return time;
    }

    public long interval(String str, DateUnit dateUnit) {
        long jInterval = this.isNano ? interval(str) / FolmeCore.NANOS_TO_MS : interval(str);
        return DateUnit.MS == dateUnit ? jInterval : jInterval / dateUnit.getMillis();
    }
}
