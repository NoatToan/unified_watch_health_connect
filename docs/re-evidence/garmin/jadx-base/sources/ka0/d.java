package ka0;

import e23.p;
import o4.r1;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103729a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f103730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f103731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f103732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f103733e;

    public /* synthetic */ d(String str, r1 r1Var, boolean z14, e23.a aVar, int i14) {
        this.f103730b = str;
        this.f103731c = r1Var;
        this.f103732d = z14;
        this.f103733e = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f103729a) {
            case 0:
                ((Integer) obj2).getClass();
                f.a(p0.t(1), this.f103733e, this.f103730b, this.f103731c, (m) obj, this.f103732d);
                break;
            default:
                ((Integer) obj2).getClass();
                sa0.b.c(p0.t(1), this.f103733e, this.f103730b, this.f103731c, (m) obj, this.f103732d);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(boolean z14, String str, e23.a aVar, r1 r1Var, int i14) {
        this.f103732d = z14;
        this.f103730b = str;
        this.f103733e = aVar;
        this.f103731c = r1Var;
    }
}
