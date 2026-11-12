package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ji implements e23.l<z4.b, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ri f88633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1<x5.l0> f88634b;

    public ji(ri riVar, p3.p1<x5.l0> p1Var) {
        this.f88633a = riVar;
        this.f88634b = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    @Override // e23.l
    public final Boolean invoke(z4.b bVar) {
        boolean z14;
        if (bVar.f202306a.getUnicodeChar() == 0) {
            float f14 = bi.f87631a;
            long j8 = this.f88634b.getF182175a().f188879b;
            s5.w0.a aVar = s5.w0.f157315b;
            if (((int) (j8 >> 32)) == 0) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        if (z14) {
            qi.f89469b.getClass();
            this.f88633a.d(0);
        }
        return Boolean.valueOf(z14);
    }
}
