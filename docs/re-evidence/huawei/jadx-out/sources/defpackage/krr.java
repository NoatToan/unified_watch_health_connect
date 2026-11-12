package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class krr extends krl {
    public krr() {
        this(0, null, 0L, 0L);
    }

    public krr(int i, long j, long j2) {
        setType(i);
        setStartTime(j);
        setEndTime(j2);
    }

    public krr(int i, String str, long j, long j2) {
        setType(i);
        setStartTime(j);
        setEndTime(j2);
        setMetaData(str);
    }
}
