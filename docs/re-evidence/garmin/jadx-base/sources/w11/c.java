package w11;

import b21.o4;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o4 f181198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f181199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f181200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f181201e;

    public /* synthetic */ c(o4 o4Var, e23.a aVar, e23.a aVar2, e23.a aVar3, int i14, int i15) {
        this.f181197a = i15;
        this.f181198b = o4Var;
        this.f181199c = aVar;
        this.f181200d = aVar2;
        this.f181201e = aVar3;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f181197a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                d.a(this.f181198b, this.f181199c, this.f181200d, this.f181201e, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                d.h(this.f181198b, this.f181199c, this.f181200d, this.f181201e, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
