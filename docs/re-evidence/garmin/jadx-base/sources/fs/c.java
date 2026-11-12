package fs;

import e23.l;
import f5.c0;
import g6.m;
import p005kotlin.Unit;
import p3.m1;
import s5.o;
import s5.q0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f73361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m1 f73362c;

    public /* synthetic */ c(m1 m1Var, m1 m1Var2, int i14) {
        this.f73360a = i14;
        this.f73361b = m1Var;
        this.f73362c = m1Var2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f73360a) {
            case 0:
                c0 c0Var = (c0) obj;
                c0Var.getClass();
                this.f73361b.i((int) (c0Var.a() >> 32));
                this.f73362c.i((int) (c0Var.a() & 4294967295L));
                break;
            case 1:
                m mVar = (m) obj;
                this.f73361b.i((int) (mVar.f76013a >> 32));
                this.f73362c.i((int) (mVar.f76013a & 4294967295L));
                break;
            default:
                q0 q0Var = (q0) obj;
                q0Var.getClass();
                o oVar = q0Var.f157281b;
                this.f73361b.i(oVar.f(0));
                this.f73362c.i(oVar.b(0));
                break;
        }
        return Unit.INSTANCE;
    }
}
