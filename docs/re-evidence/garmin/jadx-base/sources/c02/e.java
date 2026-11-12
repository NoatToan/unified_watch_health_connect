package c02;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f22368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Double f22369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Double f22370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f22371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f22372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f22373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22374h;

    public /* synthetic */ e(r rVar, Double d14, Double d15, e23.l lVar, e23.l lVar2, String str, int i14, int i15) {
        this.f22367a = i15;
        this.f22368b = rVar;
        this.f22369c = d14;
        this.f22370d = d15;
        this.f22371e = lVar;
        this.f22372f = lVar2;
        this.f22373g = str;
        this.f22374h = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22367a) {
            case 0:
                ((Integer) obj2).intValue();
                h.a(this.f22368b, this.f22369c, this.f22370d, this.f22371e, this.f22372f, this.f22373g, (p3.m) obj, p0.t(this.f22374h | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                zz1.c.a(this.f22368b, this.f22369c, this.f22370d, this.f22371e, this.f22372f, this.f22373g, (p3.m) obj, p0.t(this.f22374h | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
