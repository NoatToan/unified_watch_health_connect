package cq;

import c22.l3;
import p005kotlin.Unit;
import p5.h0;
import p5.k0;
import x5.l0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f55101b;

    public /* synthetic */ t(String str, int i14) {
        this.f55100a = i14;
        this.f55101b = str;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        int i14 = this.f55100a;
        String str = this.f55101b;
        switch (i14) {
            case 0:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                h0.n(k0Var, str);
                return Unit.INSTANCE;
            case 1:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                if (str != null) {
                    h0.n(k0Var2, str);
                }
                return Unit.INSTANCE;
            case 2:
                Double d14 = (Double) obj;
                if (d14 == null) {
                    return str;
                }
                l3.a aVar = l3.f23124b;
                double dDoubleValue = d14.doubleValue();
                aVar.getClass();
                return l3.a.B(dDoubleValue);
            case 3:
                k0 k0Var3 = (k0) obj;
                k0Var3.getClass();
                h0.n(k0Var3, str != null ? str : "");
                return Unit.INSTANCE;
            case 4:
                k0 k0Var4 = (k0) obj;
                k0Var4.getClass();
                h0.n(k0Var4, str != null ? str : "");
                return Unit.INSTANCE;
            case 5:
                k0 k0Var5 = (k0) obj;
                k0Var5.getClass();
                h0.n(k0Var5, str);
                return Unit.INSTANCE;
            case 6:
                k0 k0Var6 = (k0) obj;
                k0Var6.getClass();
                h0.n(k0Var6, str != null ? str : "");
                return Unit.INSTANCE;
            case 7:
                k0 k0Var7 = (k0) obj;
                k0Var7.getClass();
                h0.n(k0Var7, str);
                return Unit.INSTANCE;
            case 8:
                k0 k0Var8 = (k0) obj;
                k0Var8.getClass();
                h0.n(k0Var8, str);
                return Unit.INSTANCE;
            case 9:
                String str2 = (String) obj;
                str2.getClass();
                if (d53.w.J(str2)) {
                    return str2.length() < str.length() ? str : str2;
                }
                return str.concat(str2);
            case 10:
                k0 k0Var9 = (k0) obj;
                k0Var9.getClass();
                h0.n(k0Var9, str);
                return Unit.INSTANCE;
            case 11:
                k0 k0Var10 = (k0) obj;
                k0Var10.getClass();
                h0.n(k0Var10, str);
                return Unit.INSTANCE;
            case 12:
                k0 k0Var11 = (k0) obj;
                k0Var11.getClass();
                h0.n(k0Var11, str);
                return Unit.INSTANCE;
            case 13:
                k0 k0Var12 = (k0) obj;
                k0Var12.getClass();
                str.getClass();
                h0.n(k0Var12, str);
                return Unit.INSTANCE;
            case 14:
                k0 k0Var13 = (k0) obj;
                k0Var13.getClass();
                h0.n(k0Var13, str);
                return Unit.INSTANCE;
            case 15:
                l0 l0Var = (l0) obj;
                l0Var.getClass();
                s5.c cVar = l0Var.f188878a;
                String str3 = cVar.f157138b;
                if (!d53.w.J(str3) && str.length() != 0) {
                    String strR = d53.w.R(str, "/");
                    if (str3.length() < strR.length() && d53.u.y(strR, str3, true)) {
                        return null;
                    }
                }
                String strG = tn.k.g(str, dv0.o.c(cVar.f157138b, str));
                int length = strG.length();
                return l0.a(l0Var, strG, og.a.l(length, length), 4);
            case 16:
                k0 k0Var14 = (k0) obj;
                k0Var14.getClass();
                h0.n(k0Var14, str);
                return Unit.INSTANCE;
            case 17:
                k0 k0Var15 = (k0) obj;
                k0Var15.getClass();
                h0.n(k0Var15, str);
                return Unit.INSTANCE;
            case 18:
                k0 k0Var16 = (k0) obj;
                k0Var16.getClass();
                h0.n(k0Var16, str);
                return Unit.INSTANCE;
            case 19:
                k0 k0Var17 = (k0) obj;
                k0Var17.getClass();
                h0.n(k0Var17, str);
                return Unit.INSTANCE;
            case 20:
                k0 k0Var18 = (k0) obj;
                k0Var18.getClass();
                h0.n(k0Var18, str);
                return Unit.INSTANCE;
            case 21:
                ud.a aVar2 = (ud.a) obj;
                es2.f.b bVar = es2.f.f65227d;
                aVar2.getClass();
                ud.c cVarM0 = aVar2.M0("delete from wallet_items where item_id = ?");
                try {
                    cVarM0.q3(1, str);
                    cVarM0.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM0.close();
                }
            case 22:
                k0 k0Var19 = (k0) obj;
                k0Var19.getClass();
                h0.n(k0Var19, str);
                return Unit.INSTANCE;
            case 23:
                k0 k0Var20 = (k0) obj;
                k0Var20.getClass();
                h0.n(k0Var20, str);
                return Unit.INSTANCE;
            case 24:
                k0 k0Var21 = (k0) obj;
                k0Var21.getClass();
                h0.n(k0Var21, str);
                return Unit.INSTANCE;
            case 25:
                k0 k0Var22 = (k0) obj;
                k0Var22.getClass();
                h0.n(k0Var22, str);
                return Unit.INSTANCE;
            case 26:
                k0 k0Var23 = (k0) obj;
                k0Var23.getClass();
                h0.n(k0Var23, str);
                return Unit.INSTANCE;
            case 27:
                k0 k0Var24 = (k0) obj;
                k0Var24.getClass();
                h0.n(k0Var24, str);
                return Unit.INSTANCE;
            case 28:
                k0 k0Var25 = (k0) obj;
                k0Var25.getClass();
                h0.n(k0Var25, str);
                return Unit.INSTANCE;
            default:
                k0 k0Var26 = (k0) obj;
                k0Var26.getClass();
                h0.n(k0Var26, str);
                return Unit.INSTANCE;
        }
    }
}
