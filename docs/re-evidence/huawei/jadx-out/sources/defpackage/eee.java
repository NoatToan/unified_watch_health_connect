package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class eee extends eec {
    private long d = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32838a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f32839c = null;

    public long d() {
        return this.d;
    }

    public void a(long j) {
        this.d = j;
    }

    public int b() {
        return this.f32838a;
    }

    public void a(int i) {
        this.f32838a = i;
    }

    public byte[] c() {
        return this.f32839c;
    }

    public void e(byte[] bArr) {
        this.f32839c = bArr;
    }

    @Override // defpackage.eec
    public String toString() {
        return "SampleEvent{mSrcPkgName=" + getSrcPkgName() + ", mWearPkgName=" + getWearPkgName() + ", mCommandId=" + getCommandId() + ", mEventId=" + this.d + ", mEventLevel=" + this.f32838a + ", mEventData=" + cpl.e(cph.d(this.f32839c)) + '}';
    }
}
