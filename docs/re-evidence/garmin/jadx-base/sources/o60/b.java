package o60;

import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.v;
import com.garmin.android.library.mapsdkadapter.i;
import com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardActivity;
import d53.u;
import e23.l;
import jo1.e;
import o13.p;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p5.h0;
import p5.k0;
import pc0.o0;
import qc.h;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f129553b;

    public /* synthetic */ b(String str, int i14) {
        this.f129552a = i14;
        this.f129553b = str;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f129552a;
        boolean z14 = false;
        String str = this.f129553b;
        switch (i14) {
            case 0:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                h0.n(k0Var, str);
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736c = (com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c) obj;
                enumC0736c.getClass();
                return Boolean.valueOf(u.q(enumC0736c.f39973a, str, true));
            case 2:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                h0.n(k0Var2, str);
                return Unit.INSTANCE;
            case 3:
                k0 k0Var3 = (k0) obj;
                k0Var3.getClass();
                h0.n(k0Var3, str != null ? str : "");
                return Unit.INSTANCE;
            case 4:
                p pVar = (p) obj;
                int i15 = androidx.navigation.fragment.a.f10129j;
                pVar.getClass();
                return Boolean.valueOf(s.g(pVar.f128594a, str));
            case 5:
                v vVar = (v) obj;
                int i16 = o0.f137273b;
                vVar.getClass();
                return v.a(vVar, this.f129553b, 0L, false, 13);
            case 6:
                k0 k0Var4 = (k0) obj;
                k0Var4.getClass();
                h0.n(k0Var4, str);
                return Unit.INSTANCE;
            case 7:
                Context context = (Context) obj;
                SnowballAddCardActivity.a aVar = SnowballAddCardActivity.f51227j;
                context.getClass();
                String string = context.getString(R.string.wallet_rapid_pass_settled_hint, str);
                string.getClass();
                return string;
            case 8:
                k0 k0Var5 = (k0) obj;
                k0Var5.getClass();
                h0.n(k0Var5, str);
                return Unit.INSTANCE;
            case 9:
                int i17 = h.B;
                return Boolean.valueOf(s.g((String) obj, str));
            case 10:
                i iVar = (i) obj;
                iVar.getClass();
                iVar.p(str, false);
                return Unit.INSTANCE;
            case 11:
                wg0.a aVar2 = (wg0.a) obj;
                int i18 = qm0.p.f145525h;
                aVar2.getClass();
                if (aVar2.m()) {
                    e eVar = aVar2.f185061v;
                    if (s.g(eVar != null ? eVar.getUuid() : null, str)) {
                        z14 = true;
                    }
                }
                return Boolean.valueOf(z14);
            case 12:
                Double d14 = (Double) obj;
                if (d14 == null) {
                    return str;
                }
                l3.a aVar3 = l3.f23124b;
                int iDoubleValue = (int) d14.doubleValue();
                aVar3.getClass();
                return l3.a.Z0(iDoubleValue);
            case 13:
                Double d15 = (Double) obj;
                if (d15 == null) {
                    return str;
                }
                l3.a aVar4 = l3.f23124b;
                int iDoubleValue2 = (int) d15.doubleValue();
                aVar4.getClass();
                return l3.a.Z0(iDoubleValue2);
            case 14:
                obj.getClass();
                return str + obj;
            case 15:
                k0 k0Var6 = (k0) obj;
                k0Var6.getClass();
                h0.n(k0Var6, str);
                return Unit.INSTANCE;
            case 16:
                k0 k0Var7 = (k0) obj;
                k0Var7.getClass();
                h0.n(k0Var7, str);
                return Unit.INSTANCE;
            case 17:
                k0 k0Var8 = (k0) obj;
                k0Var8.getClass();
                h0.n(k0Var8, str);
                return Unit.INSTANCE;
            case 18:
                k0 k0Var9 = (k0) obj;
                k0Var9.getClass();
                h0.n(k0Var9, str != null ? str : "");
                return Unit.INSTANCE;
            case 19:
                k0 k0Var10 = (k0) obj;
                k0Var10.getClass();
                h0.n(k0Var10, str != null ? str : "");
                return Unit.INSTANCE;
            case 20:
                obj.getClass();
                return str + obj;
            case 21:
                k0 k0Var11 = (k0) obj;
                k0Var11.getClass();
                h0.n(k0Var11, str);
                return Unit.INSTANCE;
            case 22:
                k0 k0Var12 = (k0) obj;
                k0Var12.getClass();
                h0.n(k0Var12, str);
                return Unit.INSTANCE;
            case 23:
                k0 k0Var13 = (k0) obj;
                k0Var13.getClass();
                h0.n(k0Var13, str);
                return Unit.INSTANCE;
            case 24:
                k0 k0Var14 = (k0) obj;
                k0Var14.getClass();
                h0.n(k0Var14, str);
                return Unit.INSTANCE;
            case 25:
                k0 k0Var15 = (k0) obj;
                k0Var15.getClass();
                h0.n(k0Var15, str);
                return Unit.INSTANCE;
            case 26:
                k0 k0Var16 = (k0) obj;
                k0Var16.getClass();
                h0.n(k0Var16, str);
                return Unit.INSTANCE;
            case 27:
                k0 k0Var17 = (k0) obj;
                k0Var17.getClass();
                h0.n(k0Var17, str);
                return Unit.INSTANCE;
            case 28:
                k0 k0Var18 = (k0) obj;
                k0Var18.getClass();
                h0.n(k0Var18, str);
                return Unit.INSTANCE;
            default:
                k0 k0Var19 = (k0) obj;
                k0Var19.getClass();
                h0.n(k0Var19, str);
                return Unit.INSTANCE;
        }
    }
}
