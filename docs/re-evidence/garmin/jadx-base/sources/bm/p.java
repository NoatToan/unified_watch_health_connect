package bm;

import c22.l3;

/* JADX INFO: loaded from: classes7.dex */
public class p extends q.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f18848d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, boolean z14, String str) {
        super();
        this.f18848d = qVar;
        this.f18846b = z14;
        this.f18847c = str;
    }

    @Override // bm.q.d, gz.f
    public final String b(float f14) {
        float fAbs = Math.abs(f14);
        int i14 = q.D;
        l3.a aVar = l3.f23124b;
        aVar.getClass();
        return String.format(f14 < 0.0f ? "- %s %s" : "%s %s", aVar.r0(this.f18848d.f134441a, fAbs, this.f18846b, false, ""), this.f18847c);
    }
}
