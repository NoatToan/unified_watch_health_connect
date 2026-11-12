package wk2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwk2/g;", "Lwk2/b;", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f185850d;

    public g() {
        super(new w72.f(26));
        this.f185850d = new byte[0];
    }

    @Override // wk2.b, wk2.d
    public final void a() {
        e();
        super.a();
    }

    @Override // wk2.d
    public final dz2.b b() {
        e();
        return new dz2.f(this.f185850d);
    }

    @Override // wk2.b
    public final e23.a<dz2.a> c() {
        return new wd.c(this, 7);
    }

    public final synchronized void e() {
        if (this.f185850d.length != ((int) d().get().getSize())) {
            dz2.a aVar = d().get();
            aVar.getClass();
            byte[] byteArray = ((dz2.e) aVar).f61807b.toByteArray();
            byteArray.getClass();
            this.f185850d = byteArray;
        }
    }

    @Override // wk2.d
    public final synchronized boolean reset() {
        this.f185850d = new byte[0];
        super.a();
        return true;
    }
}
