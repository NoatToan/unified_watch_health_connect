package gw0;

import i3.mc;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class x implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f79819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f79820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f79821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mc f79822e;

    public /* synthetic */ x(o53.b0 b0Var, p1 p1Var, e23.a aVar, mc mcVar, int i14) {
        this.f79818a = i14;
        this.f79819b = b0Var;
        this.f79820c = p1Var;
        this.f79821d = aVar;
        this.f79822e = mcVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        pv0.c cVar = (pv0.c) obj;
        switch (this.f79818a) {
            case 0:
                cVar.getClass();
                ge1.b.T(this.f79819b, null, null, new z(this.f79822e, null), 3);
                this.f79820c.setValue(cVar);
                this.f79821d.invoke();
                break;
            case 1:
                cVar.getClass();
                ge1.b.T(this.f79819b, null, null, new a0(this.f79822e, null), 3);
                this.f79820c.setValue(cVar);
                this.f79821d.invoke();
                break;
            case 2:
                cVar.getClass();
                ge1.b.T(this.f79819b, null, null, new b0(this.f79822e, null), 3);
                this.f79820c.setValue(cVar);
                this.f79821d.invoke();
                break;
            default:
                cVar.getClass();
                ge1.b.T(this.f79819b, null, null, new y(this.f79822e, null), 3);
                this.f79820c.setValue(cVar);
                this.f79821d.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
