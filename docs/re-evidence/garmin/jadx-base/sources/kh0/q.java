package kh0;

import p005kotlin.Unit;
import p3.p0;
import t21.q0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f104752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f104753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b92.a f104754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f104755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f104756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f104757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f104758h;

    public /* synthetic */ q(String str, String str2, b92.a aVar, boolean z14, e23.a aVar2, int i14, int i15, int i16) {
        this.f104751a = i16;
        this.f104752b = str;
        this.f104753c = str2;
        this.f104754d = aVar;
        this.f104755e = z14;
        this.f104756f = aVar2;
        this.f104757g = i14;
        this.f104758h = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f104751a) {
            case 0:
                ((Integer) obj2).getClass();
                s.g(p0.t(this.f104757g | 1), this.f104758h, this.f104754d, this.f104756f, this.f104752b, this.f104753c, (p3.m) obj, this.f104755e);
                break;
            default:
                ((Integer) obj2).getClass();
                q0.a(p0.t(this.f104757g | 1), this.f104758h, this.f104754d, this.f104756f, this.f104752b, this.f104753c, (p3.m) obj, this.f104755e);
                break;
        }
        return Unit.INSTANCE;
    }
}
