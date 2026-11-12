package defpackage;

/* JADX INFO: loaded from: classes32.dex */
public class imi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient long f37823c;

    protected imi(long j, boolean z) {
        this.f37823c = j;
    }

    protected imi() {
        this.f37823c = 0L;
    }

    protected static long c(imi imiVar) {
        if (imiVar == null) {
            return 0L;
        }
        return imiVar.f37823c;
    }
}
