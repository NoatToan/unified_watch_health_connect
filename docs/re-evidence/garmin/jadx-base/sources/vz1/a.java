package vz1;

import i3.mc;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.p0;
import sz1.t;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DateTime f180891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f180892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f180893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mc f180894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0 f180895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oz1.a f180896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f180897h;

    public /* synthetic */ a(DateTime dateTime, DateTime dateTime2, t tVar, mc mcVar, b0 b0Var, oz1.a aVar, int i14, int i15) {
        this.f180890a = i15;
        this.f180891b = dateTime;
        this.f180892c = dateTime2;
        this.f180893d = tVar;
        this.f180894e = mcVar;
        this.f180895f = b0Var;
        this.f180896g = aVar;
        this.f180897h = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f180890a) {
            case 0:
                ((Integer) obj2).getClass();
                c.a(this.f180891b, this.f180892c, this.f180893d, this.f180894e, this.f180895f, this.f180896g, (p3.m) obj, p0.t(this.f180897h | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                o.a(this.f180891b, this.f180892c, this.f180893d, this.f180894e, this.f180895f, this.f180896g, (p3.m) obj, p0.t(this.f180897h | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                p.a(this.f180891b, this.f180892c, this.f180893d, this.f180894e, this.f180895f, this.f180896g, (p3.m) obj, p0.t(this.f180897h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                r.a(this.f180891b, this.f180892c, this.f180893d, this.f180894e, this.f180895f, this.f180896g, (p3.m) obj, p0.t(this.f180897h | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
