package br2;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import c2.x2;
import com.garmin.android.apps.connectmobile.GCMWebViewActivity;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.LivetrackGroupRideEnabledActivity;
import com.garmin.android.apps.connectmobile.navigation.EditBottomNavBarActivity;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DeviceFeaturesActivity;
import com.google.android.exoplayer2.C;
import com.google.android.gms.common.ConnectionResult;
import e23.p;
import h4.r;
import i3.h1;
import i3.h7;
import java.util.ArrayList;
import l72.f3;
import l72.s;
import o4.e0;
import o72.k1;
import o72.v;
import org.koin.android.ext.koin.KoinExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p3.n;
import p3.x1;
import u1.w;
import u1.y0;
import v62.b1;
import v62.m2;
import v62.n8;
import v62.u;
import z6.h0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f19582b;

    public /* synthetic */ a(Context context, int i14) {
        this.f19581a = i14;
        this.f19582b = context;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:118:0x0359  */
    /* JADX WARN: Code duplicated, block: B:123:0x0377  */
    /* JADX WARN: Code duplicated, block: B:137:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:13:0x0054  */
    /* JADX WARN: Code duplicated, block: B:142:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:156:0x045f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x0117  */
    /* JADX WARN: Code duplicated, block: B:57:0x017c  */
    /* JADX WARN: Code duplicated, block: B:71:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:76:0x021c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0282  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f19581a;
        p3.m.a aVar = p3.m.f135153a;
        Context context = this.f19582b;
        switch (i14) {
            case 0:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                c cVar = c.f19585a;
                dialogInterface.getClass();
                wr2.i.f186861a.getClass();
                Uri uri = Uri.parse("https://support.garmin.com/sas/gcapp/?productId=125677&contentId=9BcXLSQ4A22gasLarkUvH6");
                uri.getClass();
                context.startActivity(new Intent("android.intent.action.VIEW", uri));
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 1:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                c cVar2 = c.f19585a;
                dialogInterface2.getClass();
                context.startActivity(new Intent("android.settings.SETTINGS"));
                dialogInterface2.dismiss();
                return Unit.INSTANCE;
            case 2:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                GCMWebViewActivity.fa(context, str, str2);
                return Unit.INSTANCE;
            case 3:
                DialogInterface dialogInterface3 = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                dialogInterface3.getClass();
                dialogInterface3.dismiss();
                cb1.a.f26640a.getClass();
                cb1.a.C0408a.c();
                com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                Intent intent = new Intent(context, (Class<?>) DashboardActivity.class);
                intent.addFlags(335544320);
                context.startActivity(intent);
                return Unit.INSTANCE;
            case 4:
                DialogInterface dialogInterface4 = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                dialogInterface4.getClass();
                dialogInterface4.dismiss();
                cb1.a.f26640a.getClass();
                cb1.a.C0408a.c();
                com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                Intent intent2 = new Intent(context, (Class<?>) DashboardActivity.class);
                intent2.addFlags(67108864);
                h0 h0VarE = h0.e(context);
                ArrayList<Intent> arrayList = h0VarE.f202637a;
                arrayList.add(intent2);
                arrayList.add(new Intent(context, (Class<?>) EditBottomNavBarActivity.class));
                h0VarE.g();
                return Unit.INSTANCE;
            case 5:
                return DeviceFeaturesActivity.onCreate$lambda$0$0$1$2$3(context, (p3.m) obj, ((Integer) obj2).intValue());
            case 6:
                Integer num = (Integer) obj;
                num.intValue();
                Integer num2 = (Integer) obj2;
                num2.intValue();
                String string = context.getString(R.string.page_indicator_photo_content_description, num, num2);
                string.getClass();
                return string;
            case 7:
                boolean z14 = false;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if ((iIntValue & 3) != 2) {
                    z14 = true;
                }
                if (mVar.n(1 & iIntValue, z14)) {
                    x1 x1Var = n.f135158a;
                    s sVar = s.f111232a;
                    g6.f.a aVar2 = g6.f.f75994b;
                    r rVarZ = c2.l.z(r.S, 16, 4);
                    boolean zR = mVar.r(context);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new l71.g(context, 29);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new l71.g(context, 29);
                            mVar.K(objQ);
                        }
                    }
                    sVar.c(rVarZ, null, null, null, null, "Cras mattis consectetur purus sit amet amet fermentum.", null, false, (e23.a) objQ, null, mVar, 196614, 0, 1502);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 8:
                boolean z15 = false;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if ((iIntValue2 & 3) != 2) {
                    z15 = true;
                }
                if (mVar2.n(1 & iIntValue2, z15)) {
                    x1 x1Var2 = n.f135158a;
                    s sVar2 = s.f111232a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = u.a(t62.b.f162798a);
                    g6.f.a aVar3 = g6.f.f75994b;
                    r rVarZ2 = c2.l.z(r.S, 16, 4);
                    boolean zR2 = mVar2.r(context);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new l71.g(context, 22);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new l71.g(context, 22);
                            mVar2.K(objQ2);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ2;
                    boolean zR3 = mVar2.r(context);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new l71.g(context, 23);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new l71.g(context, 23);
                            mVar2.K(objQ3);
                        }
                    }
                    sVar2.c(rVarZ2, dVarA, null, null, "Title", "Cras mattis consectetur purus sit amet amet fermentum.", "Action", false, aVar4, (e23.a) objQ3, mVar2, 1794054, 0, 396);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 9:
                boolean z16 = false;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if ((iIntValue3 & 3) != 2) {
                    z16 = true;
                }
                if (mVar3.n(1 & iIntValue3, z16)) {
                    x1 x1Var3 = n.f135158a;
                    s sVar3 = s.f111232a;
                    g6.f.a aVar5 = g6.f.f75994b;
                    r rVarZ3 = c2.l.z(r.S, 16, 4);
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = n8.a(t62.b.f162798a);
                    s.a aVar6 = s.a.KNOCKOUT;
                    boolean zR4 = mVar3.r(context);
                    Object objQ4 = mVar3.q();
                    if (zR4) {
                        objQ4 = new l71.g(context, 25);
                        mVar3.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new l71.g(context, 25);
                            mVar3.K(objQ4);
                        }
                    }
                    e23.a aVar7 = (e23.a) objQ4;
                    boolean zR5 = mVar3.r(context);
                    Object objQ5 = mVar3.q();
                    if (zR5) {
                        objQ5 = new l71.g(context, 26);
                        mVar3.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new l71.g(context, 26);
                            mVar3.K(objQ5);
                        }
                    }
                    sVar3.c(rVarZ3, dVarA2, aVar6, null, null, "Cras mattis consectetur purus sit amet amet fermentum.", "Action", false, aVar7, (e23.a) objQ5, mVar3, 1769862, 0, 408);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 10:
                boolean z17 = false;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if ((iIntValue4 & 3) != 2) {
                    z17 = true;
                }
                if (mVar4.n(1 & iIntValue4, z17)) {
                    x1 x1Var4 = n.f135158a;
                    s sVar4 = s.f111232a;
                    g6.f.a aVar8 = g6.f.f75994b;
                    r rVarZ4 = c2.l.z(r.S, 16, 4);
                    s62.a.f157643a.getClass();
                    u4.d dVarA3 = m2.a(t62.b.f162798a);
                    boolean zR6 = mVar4.r(context);
                    Object objQ6 = mVar4.q();
                    if (zR6) {
                        objQ6 = new l71.g(context, 21);
                        mVar4.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new l71.g(context, 21);
                            mVar4.K(objQ6);
                        }
                    }
                    sVar4.c(rVarZ4, dVarA3, null, null, null, "Cras mattis consectetur purus sit amet amet fermentum.", null, false, (e23.a) objQ6, null, mVar4, 196614, 0, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 11:
                boolean z18 = false;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if ((iIntValue5 & 3) != 2) {
                    z18 = true;
                }
                if (mVar5.n(1 & iIntValue5, z18)) {
                    x1 x1Var5 = n.f135158a;
                    s sVar5 = s.f111232a;
                    g6.f.a aVar9 = g6.f.f75994b;
                    r rVarZ5 = c2.l.z(r.S, 16, 4);
                    v.f130621a.getClass();
                    z3.e eVar = v.f130622b;
                    boolean zR7 = mVar5.r(context);
                    Object objQ7 = mVar5.q();
                    if (zR7) {
                        objQ7 = new l71.g(context, 24);
                        mVar5.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new l71.g(context, 24);
                            mVar5.K(objQ7);
                        }
                    }
                    sVar5.c(rVarZ5, null, null, eVar, "Title", "Cras mattis consectetur purus sit amet amet fermentum.", "Action", false, (e23.a) objQ7, null, mVar5, 1797126, 0, 1414);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 12:
                boolean z19 = false;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if ((iIntValue6 & 3) != 2) {
                    z19 = true;
                }
                if (mVar6.n(1 & iIntValue6, z19)) {
                    x1 x1Var6 = n.f135158a;
                    s sVar6 = s.f111232a;
                    g6.f.a aVar10 = g6.f.f75994b;
                    r rVarZ6 = c2.l.z(r.S, 16, 4);
                    boolean zR8 = mVar6.r(context);
                    Object objQ8 = mVar6.q();
                    if (zR8) {
                        objQ8 = new l71.g(context, 27);
                        mVar6.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new l71.g(context, 27);
                            mVar6.K(objQ8);
                        }
                    }
                    e23.a aVar11 = (e23.a) objQ8;
                    boolean zR9 = mVar6.r(context);
                    Object objQ9 = mVar6.q();
                    if (zR9) {
                        objQ9 = new l71.g(context, 28);
                        mVar6.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new l71.g(context, 28);
                            mVar6.K(objQ9);
                        }
                    }
                    sVar6.c(rVarZ6, null, null, null, null, "Cras mattis consectetur purus sit amet amet fermentum.", "Action", false, aVar11, (e23.a) objQ9, mVar6, 1769478, 0, 414);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 13:
                boolean z24 = false;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if ((iIntValue7 & 3) != 2) {
                    z24 = true;
                }
                if (mVar7.n(1 & iIntValue7, z24)) {
                    x1 x1Var7 = n.f135158a;
                    b3.b.f15502a.getClass();
                    u4.d dVarA4 = d3.a.a();
                    r.a aVar12 = r.S;
                    boolean zR10 = mVar7.r(context);
                    Object objQ10 = mVar7.q();
                    if (zR10) {
                        objQ10 = new o72.f(context, 5);
                        mVar7.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new o72.f(context, 5);
                            mVar7.K(objQ10);
                        }
                    }
                    r rVarD = w.d(aVar12, false, null, null, (e23.a) objQ10, 15);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    y0.b(dVarA4, "", x2.q(rVarD, j92.b.f97901d.f97903b), e0.a.a(e0.f128843b, d92.b.a(mVar7).f().a()), mVar7, 48, 56);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA5 = b1.a(t62.b.f162798a);
                    boolean zR11 = mVar8.r(context);
                    Object objQ11 = mVar8.q();
                    if (zR11) {
                        objQ11 = new o72.f(context, 8);
                        mVar8.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new o72.f(context, 8);
                            mVar8.K(objQ11);
                        }
                    }
                    f3.a("Total Time", dVarA5, "23:07", null, (e23.a) objQ11, mVar8, 390, 8);
                    f3.a("Elapsed Time", null, "23:07", null, null, mVar8, 390, 26);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    boolean zR12 = mVar9.r(context);
                    Object objQ12 = mVar9.q();
                    if (zR12) {
                        objQ12 = new o72.f(context, 20);
                        mVar9.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            objQ12 = new o72.f(context, 20);
                            mVar9.K(objQ12);
                        }
                    }
                    k1.f130459a.getClass();
                    h7.a((e23.a) objQ12, null, false, null, null, k1.f130460b, mVar9, 1572864, 62);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 16:
                return KoinExtKt.androidContext$lambda$2$lambda$1(context, (Scope) obj, (ParametersHolder) obj2);
            default:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i15 = LivetrackGroupRideEnabledActivity.f38673a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    r.a aVar13 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarY = c2.l.y(aVar13, j92.b.f97899b.f97920e);
                    boolean zR13 = mVar10.r(context);
                    Object objQ13 = mVar10.q();
                    if (zR13) {
                        objQ13 = new tz1.h(context, 18);
                        mVar10.K(objQ13);
                    } else {
                        aVar.getClass();
                        if (objQ13 == p3.m.a.f135155b) {
                            objQ13 = new tz1.h(context, 18);
                            mVar10.K(objQ13);
                        }
                    }
                    wu0.a.f187235a.getClass();
                    h1.c((e23.a) objQ13, rVarY, false, null, null, null, null, null, wu0.a.f187237c, mVar10, C.ENCODING_PCM_32BIT, 508);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
        }
    }
}
