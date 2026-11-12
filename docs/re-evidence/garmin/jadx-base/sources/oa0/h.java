package oa0;

import e23.l;
import e23.p;
import j90.o;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f131067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f131068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f131069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f131070e;

    public /* synthetic */ h(o oVar, l lVar, e23.a aVar, e23.a aVar2, int i14, int i15) {
        this.f131066a = i15;
        this.f131067b = oVar;
        this.f131068c = lVar;
        this.f131069d = aVar;
        this.f131070e = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f131066a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                i.b(this.f131067b, this.f131068c, this.f131069d, this.f131070e, (m) obj, iT);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                j.b(this.f131067b, this.f131068c, this.f131069d, this.f131070e, (m) obj, iT2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT3 = p0.t(1);
                j.a(this.f131067b, this.f131068c, this.f131069d, this.f131070e, (m) obj, iT3);
                break;
        }
        return Unit.INSTANCE;
    }
}
