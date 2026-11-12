package i11;

import android.content.Intent;
import i3.d3;
import i3.f0;
import p005kotlin.Unit;
import p5.h0;
import p5.k0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f87087b;

    public /* synthetic */ g(String str, int i14) {
        this.f87086a = i14;
        this.f87087b = str;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        int i14 = this.f87086a;
        String str = this.f87087b;
        switch (i14) {
            case 0:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                h0.n(k0Var, str);
                return Unit.INSTANCE;
            case 1:
                f0 f0Var = f0.f88041a;
                h0.n((k0) obj, str);
                return Unit.INSTANCE;
            case 2:
                k0 k0Var2 = (k0) obj;
                d3 d3Var = d3.f87817a;
                p5.i.f136017b.getClass();
                h0.s(k0Var2, 0);
                h0.n(k0Var2, str);
                return Unit.INSTANCE;
            case 3:
                k0 k0Var3 = (k0) obj;
                h0.B(k0Var3, new s5.c(str, null, 2, null));
                p5.l.f136032b.getClass();
                h0.w(k0Var3, 0);
                return Unit.INSTANCE;
            case 4:
                k0 k0Var4 = (k0) obj;
                h0.B(k0Var4, new s5.c(str, null, 2, null));
                p5.l.f136032b.getClass();
                h0.w(k0Var4, 0);
                return Unit.INSTANCE;
            case 5:
                h0.t((k0) obj, str);
                return Unit.INSTANCE;
            case 6:
                k0 k0Var5 = (k0) obj;
                p5.i.f136017b.getClass();
                h0.s(k0Var5, 0);
                h0.n(k0Var5, str);
                return Unit.INSTANCE;
            case 7:
                h0.t((k0) obj, str);
                return Unit.INSTANCE;
            case 8:
                k0 k0Var6 = (k0) obj;
                h0.n(k0Var6, str);
                p5.l.f136032b.getClass();
                h0.w(k0Var6, p5.l.f136037g);
                return Unit.INSTANCE;
            case 9:
                k0 k0Var7 = (k0) obj;
                h0.t(k0Var7, str);
                h0.E(k0Var7, 0.0f);
                return Unit.INSTANCE;
            case 10:
                h0.n((k0) obj, str);
                return Unit.INSTANCE;
            case 11:
                h0.n((k0) obj, str);
                return Unit.INSTANCE;
            case 12:
                h0.n((k0) obj, str);
                return Unit.INSTANCE;
            case 13:
                k0 k0Var8 = (k0) obj;
                h0.D(k0Var8);
                h0.n(k0Var8, str);
                return Unit.INSTANCE;
            case 14:
                k0 k0Var9 = (k0) obj;
                p5.l.f136032b.getClass();
                h0.w(k0Var9, p5.l.f136035e);
                h0.n(k0Var9, str);
                return Unit.INSTANCE;
            case 15:
                h0.n((k0) obj, str);
                return Unit.INSTANCE;
            case 16:
                h0.n((k0) obj, str);
                return Unit.INSTANCE;
            case 17:
                ud.a aVar = (ud.a) obj;
                com.garmin.android.apps.connectmobile.webtranslation.b.c cVar = com.garmin.android.apps.connectmobile.webtranslation.b.f47973e;
                aVar.getClass();
                ud.c cVarM0 = aVar.M0("DELETE FROM installation_record WHERE version_name != ?");
                try {
                    cVarM0.q3(1, str);
                    cVarM0.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM0.close();
                }
            case 18:
                k0 k0Var10 = (k0) obj;
                k0Var10.getClass();
                h0.n(k0Var10, str);
                return Unit.INSTANCE;
            case 19:
                k0 k0Var11 = (k0) obj;
                k0Var11.getClass();
                h0.n(k0Var11, str);
                return Unit.INSTANCE;
            case 20:
                Intent intent = (Intent) obj;
                int i15 = ig2.e.f93438b;
                intent.getClass();
                intent.putExtra("extra_workout_name", str);
                return Unit.INSTANCE;
            case 21:
                k0 k0Var12 = (k0) obj;
                k0Var12.getClass();
                h0.n(k0Var12, str);
                return Unit.INSTANCE;
            case 22:
                k0 k0Var13 = (k0) obj;
                k0Var13.getClass();
                h0.n(k0Var13, str);
                return Unit.INSTANCE;
            case 23:
                k0 k0Var14 = (k0) obj;
                k0Var14.getClass();
                h0.n(k0Var14, str);
                return Unit.INSTANCE;
            case 24:
                k0 k0Var15 = (k0) obj;
                k0Var15.getClass();
                h0.n(k0Var15, str != null ? str : "");
                return Unit.INSTANCE;
            case 25:
                k0 k0Var16 = (k0) obj;
                k0Var16.getClass();
                h0.n(k0Var16, str);
                return Unit.INSTANCE;
            case 26:
                k0 k0Var17 = (k0) obj;
                k0Var17.getClass();
                h0.n(k0Var17, str);
                p5.l.f136032b.getClass();
                h0.w(k0Var17, 0);
                return Unit.INSTANCE;
            case 27:
                k0 k0Var18 = (k0) obj;
                k0Var18.getClass();
                h0.n(k0Var18, str != null ? str : "");
                return Unit.INSTANCE;
            case 28:
                k0 k0Var19 = (k0) obj;
                k0Var19.getClass();
                h0.n(k0Var19, str != null ? str : "");
                return Unit.INSTANCE;
            default:
                k0 k0Var20 = (k0) obj;
                k0Var20.getClass();
                h0.n(k0Var20, str);
                return Unit.INSTANCE;
        }
    }
}
