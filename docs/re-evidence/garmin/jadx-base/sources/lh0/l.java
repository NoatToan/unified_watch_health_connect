package lh0;

import c2.t2;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f112422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f112423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f112424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f112425e;

    public /* synthetic */ l(t2 t2Var, String str, String str2, int i14, int i15) {
        this.f112421a = i15;
        this.f112422b = t2Var;
        this.f112423c = str;
        this.f112424d = str2;
        this.f112425e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f112421a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                n.g(this.f112422b, this.f112423c, this.f112424d, mVar, p0.t(this.f112425e | 1));
                break;
            case 1:
                n.b(this.f112422b, this.f112423c, this.f112424d, mVar, p0.t(this.f112425e | 1));
                break;
            default:
                n.c(this.f112422b, this.f112423c, this.f112424d, mVar, p0.t(this.f112425e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
