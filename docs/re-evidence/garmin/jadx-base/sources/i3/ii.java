package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ii implements e23.l<z4.b, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ri f88464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1<x5.l0> f88465b;

    public ii(ri riVar, p3.p1<x5.l0> p1Var) {
        this.f88464a = riVar;
        this.f88465b = p1Var;
    }

    @Override // e23.l
    public final Boolean invoke(z4.b bVar) {
        int unicodeChar = bVar.f202306a.getUnicodeChar();
        if (48 <= unicodeChar && unicodeChar < 58) {
            float f14 = bi.f87631a;
            p3.p1<x5.l0> p1Var = this.f88465b;
            long j8 = p1Var.getF182175a().f188879b;
            s5.w0.a aVar = s5.w0.f157315b;
            if (((int) (j8 >> 32)) == 2 && p1Var.getF182175a().f188878a.f157138b.length() == 2) {
                qi.f89469b.getClass();
                this.f88464a.d(qi.f89470c);
            }
        }
        return Boolean.FALSE;
    }
}
