package au0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f12901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f12902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f12903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12904g;

    public /* synthetic */ f(String str, boolean z14, e23.l lVar, e23.l lVar2, e23.a aVar, int i14, int i15) {
        this.f12898a = i15;
        this.f12899b = str;
        this.f12900c = z14;
        this.f12901d = lVar;
        this.f12902e = lVar2;
        this.f12903f = aVar;
        this.f12904g = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12898a) {
            case 0:
                ((Integer) obj2).getClass();
                p.d(this.f12899b, this.f12900c, this.f12901d, this.f12902e, this.f12903f, (p3.m) obj, p0.t(this.f12904g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                wg2.d.d(this.f12899b, this.f12900c, this.f12901d, this.f12902e, this.f12903f, (p3.m) obj, p0.t(this.f12904g | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
