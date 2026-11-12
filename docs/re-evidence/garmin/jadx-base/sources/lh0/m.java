package lh0;

import c2.t2;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f112427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f112428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f112429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f112430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f112431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f112432g;

    public /* synthetic */ m(t2 t2Var, String str, String str2, String str3, int i14, int i15, int i16) {
        this.f112426a = i16;
        this.f112427b = t2Var;
        this.f112428c = str;
        this.f112429d = str2;
        this.f112430e = str3;
        this.f112431f = i14;
        this.f112432g = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f112426a) {
            case 0:
                ((Integer) obj2).getClass();
                n.a(this.f112427b, this.f112428c, this.f112429d, this.f112430e, (p3.m) obj, p0.t(this.f112431f | 1), this.f112432g);
                break;
            default:
                ((Integer) obj2).getClass();
                n.e(this.f112427b, this.f112428c, this.f112429d, this.f112430e, (p3.m) obj, p0.t(this.f112431f | 1), this.f112432g);
                break;
        }
        return Unit.INSTANCE;
    }
}
