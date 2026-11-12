package x9;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.m;
import androidx.lifecycle.b0;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y1;
import b.s;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling.steps.EmergencyCallingDetailsFragment;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling.steps.EmergencyCallingOptionFragment;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling.steps.EmergencyCallingServicesFragment;
import com.garmin.device.pairing.PairingException;
import dy1.j;
import e23.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import l72.i3;
import m92.c0;
import nr.g;
import o4.u1;
import o53.c2;
import o53.l1;
import org.joda.time.Duration;
import org.koin.core.KoinApplication;
import org.koin.core.logger.Level;
import org.koin.java.KoinJavaComponent;
import org.koin.mp.KoinPlatform;
import p005kotlin.Unit;
import p008y1.a1;
import p008y1.b2;
import p008y1.c1;
import p008y1.e0;
import p008y1.h3;
import p008y1.v0;
import p008y1.w;
import p008y1.x3;
import p008y1.z;
import p13.j0;
import p13.x;
import p3.p1;
import q4.f;
import q53.t;
import r53.p2;
import sm2.k;
import vj1.h;
import wd2.m1;
import xk1.v;
import xr.p;
import y40.i;
import ya1.r;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f189588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f189589c;

    public /* synthetic */ b(int i14, Object obj, Object obj2) {
        this.f189587a = i14;
        this.f189588b = obj;
        this.f189589c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        y1 y1Var;
        Object value;
        Object obj2;
        boolean z14;
        int i14 = this.f189587a;
        Object obj3 = this.f189589c;
        Object obj4 = this.f189588b;
        switch (i14) {
            case 0:
                y1 y1Var2 = (y1) obj3;
                if (((Boolean) ((e23.a) obj4).invoke()).booleanValue() && (y1Var = (y1) e.a(y1Var2).f189586a.remove(obj)) != null) {
                    y1Var.a();
                }
                return Unit.INSTANCE;
            case 1:
                m mVar = (m) obj3;
                s sVar = (s) obj;
                sVar.getClass();
                a7.e eVarRequireActivity = ((EmergencyCallingDetailsFragment) obj4).requireActivity();
                if (eVarRequireActivity instanceof h) {
                    ((h) eVarRequireActivity).j1();
                }
                sVar.e();
                mVar.finish();
                return Unit.INSTANCE;
            case 2:
                m mVar2 = (m) obj3;
                s sVar2 = (s) obj;
                int i15 = EmergencyCallingOptionFragment.f43815d;
                sVar2.getClass();
                a7.e eVarRequireActivity2 = ((EmergencyCallingOptionFragment) obj4).requireActivity();
                if (eVarRequireActivity2 instanceof h) {
                    ((h) eVarRequireActivity2).j1();
                }
                sVar2.e();
                mVar2.getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
            case 3:
                EmergencyCallingServicesFragment emergencyCallingServicesFragment = (EmergencyCallingServicesFragment) obj4;
                m mVar3 = (m) obj3;
                s sVar3 = (s) obj;
                int i16 = EmergencyCallingServicesFragment.f43825f;
                sVar3.getClass();
                emergencyCallingServicesFragment.v6().f178470r = null;
                a7.e eVarRequireActivity3 = emergencyCallingServicesFragment.requireActivity();
                if (eVarRequireActivity3 instanceof h) {
                    ((h) eVarRequireActivity3).j1();
                }
                sVar3.e();
                mVar3.finish();
                return Unit.INSTANCE;
            case 4:
                return xp2.c.P4((xp2.c) obj4, (l1) obj3, (Throwable) obj);
            case 5:
                xr.m.a aVar = (xr.m.a) obj4;
                xr.m mVar4 = (xr.m) obj3;
                int i17 = xr.m.a.f191996f;
                ((View) obj).getClass();
                if (aVar.getBindingAdapterPosition() >= 0) {
                    int bindingAdapterPosition = aVar.getBindingAdapterPosition();
                    int i18 = mVar4.f191993a;
                    ArrayList arrayList = mVar4.f191994b;
                    if (bindingAdapterPosition != i18) {
                        if (i18 >= 0) {
                            ((hr.b) arrayList.get(i18)).f85285b = false;
                        }
                        ((hr.b) arrayList.get(aVar.getBindingAdapterPosition())).f85285b = true;
                        mVar4.f191993a = aVar.getBindingAdapterPosition();
                        mVar4.f191995c.invoke(Double.valueOf(((hr.b) arrayList.get(aVar.getBindingAdapterPosition())).f85284a));
                        mVar4.notifyDataSetChanged();
                    }
                }
                return Unit.INSTANCE;
            case 6:
                p pVar = (p) obj4;
                g.w wVar = (g.w) obj3;
                Integer num = (Integer) obj;
                num.getClass();
                int i19 = p.f192009g;
                if (s3.b()) {
                    new androidx.appcompat.app.e.a(pVar.getContext()).setTitle(pVar.getContext().getString(R.string.lbl_feature_not_supported)).setMessage(pVar.getContext().getString(R.string.msg_trail_review_not_supported)).setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).show();
                } else {
                    l<Integer, Unit> lVar = wVar.f127178n;
                    if (lVar != null) {
                        lVar.invoke(num);
                    }
                }
                return Unit.INSTANCE;
            case 7:
                ((Boolean) obj).getClass();
                ((l) obj4).invoke((mx1.e) obj3);
                return Unit.INSTANCE;
            case 8:
                ((Boolean) obj).getClass();
                ((l) obj4).invoke(((j) obj3).f61569a);
                return Unit.INSTANCE;
            case 9:
                m1 m1Var = (m1) obj4;
                xy0.c cVar = (xy0.c) obj3;
                ((Boolean) obj).getClass();
                w0 w0VarB = m1Var.b(true);
                ge2.e eVar = w0VarB != null ? (ge2.e) w0VarB.d() : null;
                boolean z15 = eVar != null && p005kotlin.jvm.internal.s.g(eVar.f77024c, Boolean.TRUE);
                p2 p2Var = cVar.f192666i;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, xy0.c.C3603c.a((xy0.c.C3603c) value, false, null, m1Var, z15, false, 51)));
                return Unit.INSTANCE;
            case 10:
                ((w) obj4).f193690a.j((z.a) obj3);
                return Unit.INSTANCE;
            case 11:
                v0 v0Var = (v0) obj4;
                c1 c1Var = (c1) obj3;
                long j8 = ((e0.b) obj).f193174a;
                long jK = c1Var.C ? n4.c.k(-1.0f, j8) : n4.c.k(1.0f, j8);
                b2 b2Var = c1Var.f193135y;
                a1.a aVar2 = a1.f193076a;
                v0Var.a(Float.intBitsToFloat((int) (b2Var == b2.Vertical ? jK & 4294967295L : jK >> 32)));
                return Unit.INSTANCE;
            case 12:
                p008y1.y1 y1Var3 = (p008y1.y1) obj4;
                h3 h3Var = (h3) obj3;
                e0.b bVar = (e0.b) obj;
                float f14 = bVar.f193175b ? -1.0f : 1.0f;
                long j14 = bVar.f193174a;
                long jK2 = n4.c.k(f14, h3Var.f193257d == b2.Horizontal ? n4.c.b(0.0f, j14, 1) : n4.c.b(0.0f, j14, 2));
                a5.j.f1233b.getClass();
                y1Var3.a(a5.j.f1234c, jK2);
                return Unit.INSTANCE;
            case 13:
                x3 x3Var = (x3) obj4;
                ((Long) obj).getClass();
                float f15 = x3Var.f193716e;
                x3Var.f193716e = 0.0f;
                ((l) obj3).invoke(Float.valueOf(f15));
                return Unit.INSTANCE;
            case 14:
                y22.w wVar2 = (y22.w) obj4;
                p1 p1Var = (p1) obj3;
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var.f111063a, "Delete")) {
                    p1Var.setValue(wVar2);
                }
                return Unit.INSTANCE;
            case 15:
                y40.p pVar2 = (y40.p) obj4;
                int i24 = i.f194412l1;
                ((View) obj).getClass();
                pVar2.u6((com.garmin.android.library.mapsdkadapter.e) obj3, pVar2.f148290a);
                return Unit.INSTANCE;
            case 16:
                o51.b bVar2 = (o51.b) obj3;
                f fVar = (f) obj;
                fVar.getClass();
                g6.f.a aVar3 = g6.f.f75994b;
                u1.f129010b.getClass();
                return c0.e(fVar, 2, new m92.m.b((ArrayList) obj4, u1.f129011c, null), false, 0.0f, null, null, bVar2.f129208a, null, null, null, Float.valueOf(bVar2.f129214g), Float.valueOf(bVar2.f129213f), m92.e0.LINEAR, false, null, 25532);
            case 17:
                return KoinPlatform.startKoin$lambda$0((Level) obj4, (List) obj3, (KoinApplication) obj);
            case 18:
                ya0.g gVar = (ya0.g) obj4;
                Context context = (Context) obj3;
                ((Boolean) obj).getClass();
                context.getClass();
                ge1.b.T(v1.a(gVar), null, null, new ya0.h(context, gVar, null), 3);
                return Unit.INSTANCE;
            case 19:
                e23.a aVar4 = (e23.a) obj4;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                p90.c cVar2 = ((q90.a.f) obj3).f143477b;
                cVar2.getClass();
                a2 a2Var = a2.DEVICE_SETUP;
                String strH = com.airbnb.lottie.animation.keyframe.a.h("User chose to reset device: ", zBooleanValue);
                i2.f36769a.getClass();
                i2.a.b(a2Var, "BleDevicePairReset", strH);
                k kVar = (k) cVar2.f136467a;
                if (zBooleanValue) {
                    kVar.n();
                } else {
                    kVar.f160338d.f197846h = false;
                    kVar.e(new PairingException(kVar, yl2.e.ABORTED));
                }
                cVar2.f136468b.invoke(bool);
                aVar4.invoke();
                return Unit.INSTANCE;
            case 20:
                String str = (String) obj;
                str.getClass();
                ((ab1.g) obj4).f2569b = str;
                ((r) obj3).f195593d.invoke(str);
                return Unit.INSTANCE;
            case 21:
                yb1.b bVar3 = (yb1.b) obj4;
                View view2 = (View) obj3;
                ff2.a aVar5 = (ff2.a) obj;
                if (aVar5 != null) {
                    int i25 = yb1.b.f195683j;
                    bVar3.f195686c = aVar5;
                    m activity = bVar3.getActivity();
                    if (activity != null) {
                        activity.runOnUiThread(new vg1.d(20, bVar3, view2));
                    }
                    bVar3.w6(kf2.a.SHOWN);
                } else {
                    bVar3.f195684a.error("Got null campaign, dismissing");
                    bVar3.dismiss();
                }
                return Unit.INSTANCE;
            case 22:
                ((c2) obj4).c(null);
                ((t) obj3).i((ye.b) obj);
                return Unit.INSTANCE;
            case 23:
                androidx.appcompat.app.e.a aVar6 = (androidx.appcompat.app.e.a) obj;
                aVar6.getClass();
                aVar6.setTitle(R.string.wallet_title_maintenance_notice);
                String string = aVar6.getContext().getString(R.string.wallet_message_incoming_maintenance_notice);
                string.getClass();
                aVar6.setMessage(String.format(string, Arrays.copyOf(new Object[]{Long.valueOf(((Duration) obj3).getStandardMinutes())}, 1)));
                aVar6.setPositiveButton(R.string.lbl_yes, new c32.a((e23.a) obj4, 13));
                aVar6.setNegativeButton(R.string.lbl_cancel, new v(8));
                return Unit.INSTANCE;
            case 24:
                w0 w0Var = (w0) obj4;
                yo.e eVar2 = (yo.e) obj3;
                o13.p pVar3 = (o13.p) obj;
                int i26 = yo.e.f198230s;
                A a14 = pVar3.f128594a;
                int iIntValue = ((Number) pVar3.f128595b).intValue();
                o13.p pVar4 = (o13.p) w0Var.d();
                if (pVar4 == null || (obj2 = (List) pVar4.f128595b) == null) {
                    obj2 = j0.f134944a;
                }
                if (iIntValue == 201) {
                    w0Var.j(new o13.p(yo.a.TRIM_SUCCESSFUL, obj2));
                } else if (a14 instanceof Map) {
                    if (eVar2.f198243m == 5) {
                        w0Var.j(new o13.p(yo.a.TRIM_LONG_RUNNING, obj2));
                    } else {
                        w0Var.j(new o13.p(yo.a.TRIM_IN_PROGRESS, obj2));
                        eVar2.g(x.k(Integer.valueOf(iIntValue), a14));
                    }
                }
                return Unit.INSTANCE;
            case 25:
                ((w0) obj4).j(Boolean.valueOf(!p005kotlin.jvm.internal.s.g((List) obj, oi0.c.G(((yo.w) obj3).f()))));
                return Unit.INSTANCE;
            case 26:
                yo0.c cVar3 = (yo0.c) obj3;
                e23.a aVar7 = (e23.a) obj4;
                r22.v0 v0Var2 = (r22.v0) obj;
                if (v0Var2 != null) {
                    f12.l lVar2 = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
                    String f198360b = v0Var2.getF151109e();
                    m mVar5 = cVar3.f198339b;
                    z14 = mVar5.getSupportFragmentManager().G(f198360b) != null;
                    if (mVar5.getF158016a().getF7973d().a(b0.b.RESUMED) && !lVar2.p2() && !z14) {
                        androidx.fragment.app.v supportFragmentManager = mVar5.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        v0Var2.g(supportFragmentManager);
                    }
                } else {
                    aVar7.invoke();
                }
                return Unit.INSTANCE;
            case 27:
                yo0.c cVar4 = (yo0.c) obj4;
                r70.e eVar3 = (r70.e) obj3;
                r22.v0 v0Var3 = (r22.v0) obj;
                if (v0Var3 != null) {
                    f12.l lVar3 = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
                    String f198360b2 = v0Var3.getF151109e();
                    m mVar6 = cVar4.f198339b;
                    z14 = mVar6.getSupportFragmentManager().G(f198360b2) != null;
                    if (mVar6.getF158016a().getF7973d().a(b0.b.RESUMED) && !lVar3.p2() && !v0Var3.J5() && !z14) {
                        androidx.fragment.app.v supportFragmentManager2 = mVar6.getSupportFragmentManager();
                        supportFragmentManager2.getClass();
                        v0Var3.g(supportFragmentManager2);
                    }
                } else {
                    eVar3.invoke();
                }
                return Unit.INSTANCE;
            case 28:
                ((l) obj4).invoke(tq0.l.a((tq0.l) obj3, ((Integer) obj).intValue(), 0, 0, 13));
                return Unit.INSTANCE;
            default:
                ((l) obj4).invoke(((yq0.b) obj3).f198733a.f166048b.get(((Integer) obj).intValue()));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(Object obj, e23.a aVar, int i14) {
        this.f189587a = i14;
        this.f189589c = obj;
        this.f189588b = aVar;
    }
}
