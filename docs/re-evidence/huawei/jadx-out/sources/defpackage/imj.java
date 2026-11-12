package defpackage;

/* JADX INFO: loaded from: classes32.dex */
public class imj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient long f37824c;

    protected imj(long j, boolean z) {
        this.f37824c = j;
    }

    protected imj() {
        this.f37824c = 0L;
    }

    protected static long a(imj imjVar) {
        if (imjVar == null) {
            return 0L;
        }
        return imjVar.f37824c;
    }
}
