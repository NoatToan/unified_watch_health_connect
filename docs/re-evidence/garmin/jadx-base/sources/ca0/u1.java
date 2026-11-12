package ca0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x80.e f26485c;

    public /* synthetic */ u1(x80.e eVar, lc.m0 m0Var) {
        this.f26483a = 5;
        this.f26485c = eVar;
        this.f26484b = m0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f26483a) {
            case 0:
                z1 z1VarA4 = this.f26485c.A4(b2.DEVICE_CUSTOMIZATION);
                lc.m0 m0Var = this.f26484b;
                m0Var.h(zf.b.G(m0Var), z1VarA4);
                break;
            case 1:
                lc.y.l(this.f26484b, this.f26485c.A4(b2.PERMISSIONS));
                break;
            case 2:
                z1 z1VarA5 = this.f26485c.A4(b2.SYNC);
                lc.m0 m0Var2 = this.f26484b;
                m0Var2.h(zf.b.g(m0Var2), z1VarA5);
                break;
            case 3:
                z1 z1VarA6 = this.f26485c.A4(b2.IN_REACH);
                lc.m0 m0Var3 = this.f26484b;
                m0Var3.h(zf.b.g(m0Var3), z1VarA6);
                break;
            case 4:
                z1 z1VarA7 = this.f26485c.A4(b2.WIFI);
                lc.m0 m0Var4 = this.f26484b;
                m0Var4.h(zf.b.g(m0Var4), z1VarA7);
                break;
            case 5:
                this.f26485c.f189502d.d();
                z1.g gVar = z1.g.INSTANCE;
                lc.m0 m0Var5 = this.f26484b;
                m0Var5.h(zf.b.g(m0Var5), gVar);
                break;
            case 6:
                z1 z1VarA8 = this.f26485c.A4(b2.BLE_CONNECTION_MODE);
                lc.m0 m0Var6 = this.f26484b;
                m0Var6.h(zf.b.g(m0Var6), z1VarA8);
                break;
            case 7:
                z1 z1VarA9 = this.f26485c.A4(b2.DEVICE_MIGRATION);
                lc.m0 m0Var7 = this.f26484b;
                m0Var7.h(zf.b.g(m0Var7), z1VarA9);
                break;
            case 8:
                lc.y.l(this.f26484b, this.f26485c.A4(b2.GESTURE_TUTORIAL));
                break;
            default:
                z1 z1VarA10 = this.f26485c.A4(b2.FAVORITE_ACTIVITIES);
                lc.m0 m0Var8 = this.f26484b;
                m0Var8.h(zf.b.g(m0Var8), z1VarA10);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ u1(int i14, lc.m0 m0Var, x80.e eVar) {
        this.f26483a = i14;
        this.f26484b = m0Var;
        this.f26485c = eVar;
    }
}
