package ok0;

import am.x0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import c22.a4;
import ca0.o1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.device.passcode.DevicePasscodeResetWorker;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupManageMembersActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import d53.w;
import gs1.z;
import i3.yd;
import java.util.List;
import lc.h0;
import lc.m0;
import lc.y;
import nr.w0;
import o53.b0;
import o70.c0;
import org.joda.time.LocalDate;
import org.koin.android.compat.SharedViewModelCompat;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q0;
import p005kotlin.jvm.internal.r0;
import p1.i0;
import p3.i2;
import p3.j1;
import p3.n1;
import p3.o0;
import p3.p1;
import p3.x3;
import p40.u;
import p40.u0;
import rk0.f0;
import s1.n0;
import s1.r1;
import s70.y0;
import s70.z1;
import s70.z1.a;
import sk0.g1;
import ue.x;
import zd0.u1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f132457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f132458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f132459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f132460e;

    public /* synthetic */ d(ub1.b bVar, Context context, e23.a aVar, p1 p1Var) {
        this.f132456a = 29;
        this.f132457b = bVar;
        this.f132460e = context;
        this.f132458c = aVar;
        this.f132459d = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2, types: [T, java.lang.Object] */
    @Override // e23.a
    public final Object invoke() {
        q40.b bVar;
        z userDailySummary;
        gs1.l payload;
        z userDailySummary2;
        gs1.l payload2;
        int i14 = this.f132456a;
        LocalDate localDateQ = null;
        localDateQ = null;
        localDateQ = null;
        LocalDate localDateQ2 = null;
        localDateQ = null;
        localDateQ = null;
        Object obj = this.f132459d;
        Object obj2 = this.f132460e;
        Object obj3 = this.f132457b;
        Object obj4 = this.f132458c;
        switch (i14) {
            case 0:
                Context context = (Context) obj2;
                f0 f0VarH = ((uk0.g) obj3).h();
                Long lQ4 = ((m) obj4).q4();
                GearActivity.f35500b.getClass();
                context.getClass();
                Intent intent = new Intent(context, (Class<?>) GearActivity.class);
                intent.putExtra("StartDestinationKey", new GearRoute.i(f0VarH, lQ4));
                ((c.q) obj).a(intent, null);
                return Unit.INSTANCE;
            case 1:
                ok2.d dVar = (ok2.d) obj4;
                ok2.g gVar = (ok2.g) obj;
                q0 q0Var = (q0) obj2;
                T t7 = ((r0) obj3).f105810a;
                com.garmin.device.filetransfer.core.background.a.b.f50787e.getClass();
                ue.l lVar = p005kotlin.jvm.internal.s.g(t7, com.garmin.device.filetransfer.core.background.a.b.f50791i) ? ue.l.REPLACE : ue.l.APPEND_OR_REPLACE;
                Context context2 = dVar.f132622b;
                if (context2 != null) {
                    com.garmin.device.filetransfer.core.background.a aVar = gVar.f132685d;
                    com.garmin.device.filetransfer.core.background.a.b(context2, q0Var.f105808a, gVar.f132682a.getF92741e(), gVar.f132683b.b(), lVar);
                }
                return Unit.INSTANCE;
            case 2:
                GroupManageMembersActivity.a aVar2 = GroupManageMembersActivity.f36194d;
                ge1.b.T((b0) obj3, null, null, new GroupManageMembersActivity.d((zc.d) obj4, (GroupManageMembersActivity) obj, (p1) obj2, null), 3);
                return Unit.INSTANCE;
            case 3:
                Boolean bool = Boolean.FALSE;
                ((e23.p) obj3).invoke((sy0.q) obj4, bool);
                ((p1) obj).setValue(bool);
                ((p1) obj2).setValue(bool);
                return Unit.INSTANCE;
            case 4:
                o0 o0Var = (o0) obj3;
                t3.a aVar3 = (t3.a) obj4;
                s3.h hVar = (s3.h) obj;
                j1 j1Var = (j1) obj2;
                t3.b bVar2 = o0Var.N;
                t3.a aVar4 = bVar2.f162080b;
                try {
                    bVar2.f162080b = aVar3;
                    s3.h hVar2 = o0Var.H;
                    int[] iArr = o0Var.f135191p;
                    i0<i2> i0Var = o0Var.f135198w;
                    o0Var.f135191p = null;
                    o0Var.f135198w = null;
                    try {
                        o0Var.H = hVar;
                        boolean z14 = bVar2.f162083e;
                        try {
                            bVar2.f162083e = false;
                            o0Var.r0(j1Var.f135123a, j1Var.f135129g, j1Var.f135124b, true);
                            bVar2.f162083e = z14;
                            Unit unit = Unit.INSTANCE;
                            o0Var.H = hVar2;
                            o0Var.f135191p = iArr;
                            o0Var.f135198w = i0Var;
                            bVar2.f162080b = aVar4;
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            bVar2.f162083e = z14;
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        o0Var.H = hVar2;
                        o0Var.f135191p = iArr;
                        o0Var.f135198w = i0Var;
                        throw th4;
                    }
                } catch (Throwable th5) {
                    bVar2.f162080b = aVar4;
                    throw th5;
                }
            case 5:
                q40.b bVar3 = (q40.b) obj3;
                e23.l lVar2 = (e23.l) obj4;
                ((p1) obj).setValue(Boolean.FALSE);
                int i15 = u.b.f135762a[((u0) ((p1) obj2).getF182175a()).ordinal()];
                if (i15 == 1) {
                    bVar = new q40.b(bVar3.f142574a, bVar3.f142575b, bVar3.f142576c, bVar3.f142577d, bVar3.f142578e, bVar3.f142579f, bVar3.f142580g, bVar3.f142581h, null, bVar3.f142583j, bVar3.f142584k, bVar3.f142585l, bVar3.f142586m, bVar3.f142587n, bVar3.f142588o);
                } else {
                    if (i15 != 2) {
                        lc.u0.r();
                        return null;
                    }
                    bVar = new q40.b(bVar3.f142574a, bVar3.f142575b, bVar3.f142576c, bVar3.f142577d, bVar3.f142578e, bVar3.f142579f, bVar3.f142580g, bVar3.f142581h, bVar3.f142582i, null, bVar3.f142584k, bVar3.f142585l, bVar3.f142586m, bVar3.f142587n, bVar3.f142588o);
                }
                lVar2.invoke(bVar);
                return Unit.INSTANCE;
            case 6:
                return SharedViewModelCompat.getSharedViewModel((Fragment) obj3, (Class) obj4, (Qualifier) obj, (e23.a) obj2);
            case 7:
                return qk0.r.f((Context) obj2, (i53.c) ((x3) obj3).getF182175a(), ((Boolean) ((x3) obj4).getF182175a()).booleanValue(), (String) ((p1) obj).getF182175a());
            case 8:
                ((e23.l) obj3).invoke(qk0.r.e((p1) obj4, (qk0.c) obj, (p1) obj2));
                return Unit.INSTANCE;
            case 9:
                ((e23.l) obj3).invoke(qk0.r.e((p1) obj4, (qk0.c) obj, (x3) obj2));
                return Unit.INSTANCE;
            case 10:
                hx.c cVar = (hx.c) obj3;
                bx.b bVar4 = (bx.b) obj4;
                Context context3 = (Context) obj2;
                gs1.t tVar = (gs1.t) obj;
                fx.a aVar5 = (fx.a) KoinJavaComponent.get$default(fx.a.class, null, null, 6, null);
                int i16 = cVar == null ? -1 : qx.f.a.f148396a[cVar.ordinal()];
                if (i16 == 1) {
                    Long activityId = bVar4.getActivityId();
                    if (activityId != null) {
                        long jLongValue = activityId.longValue();
                        String activityType = bVar4.getActivityType();
                        if (activityType == null) {
                            activityType = x0.f4346x.f4358a;
                        }
                        aVar5.a(context3, jLongValue, activityType);
                    }
                } else if (i16 == 2) {
                    if (tVar != null && (userDailySummary = tVar.getUserDailySummary()) != null && (payload = userDailySummary.getPayload()) != null) {
                        localDateQ = payload.q();
                    }
                    aVar5.b(context3, localDateQ);
                } else if (i16 == 3) {
                    if (tVar != null && (userDailySummary2 = tVar.getUserDailySummary()) != null && (payload2 = userDailySummary2.getPayload()) != null) {
                        localDateQ2 = payload2.q();
                    }
                    aVar5.d(context3, localDateQ2);
                }
                return Unit.INSTANCE;
            case 11:
                MultiDayActivitiesEditActivity multiDayActivitiesEditActivity = (MultiDayActivitiesEditActivity) obj3;
                MultiDayActivitiesEditActivity.a aVar6 = MultiDayActivitiesEditActivity.f39291b;
                ge1.b.T(o53.f0.w(multiDayActivitiesEditActivity), null, null, new MultiDayActivitiesEditActivity.b((cy0.k) obj4, multiDayActivitiesEditActivity, (p1) obj, (p1) obj2, null), 3);
                return Unit.INSTANCE;
            case 12:
                ((p1) obj2).setValue(obj3);
                ((e23.l) obj4).invoke(Integer.valueOf(((i53.c) obj).indexOf(obj3)));
                return Unit.INSTANCE;
            case 13:
                rd0.a aVar7 = (rd0.a) obj4;
                rd0.b.e eVar = (rd0.b.e) obj;
                rd0.b.d dVar2 = (rd0.b.d) obj2;
                GCMSettingManager.K(-1L);
                oi2.a.f132270a.getClass();
                oi2.a.C2513a.c((rd0.b.c) obj3);
                com.garmin.android.apps.connectmobile.bikesensors.b bVar5 = aVar7.f152014i;
                if (bVar5 != null) {
                    bVar5.quitSafely();
                }
                aVar7.f152014i = null;
                com.garmin.android.apps.connectmobile.bikesensors.c cVar2 = aVar7.f152013h;
                if (cVar2 != null) {
                    cVar2.quitSafely();
                }
                aVar7.f152013h = null;
                aVar7.f152006a.unregisterReceiver(eVar);
                da2.d.b().f58886a.i(dVar2);
                return Unit.INSTANCE;
            case 14:
                ri1.s sVar = (ri1.s) obj3;
                c.q qVar = (c.q) obj;
                m0 m0Var = (m0) obj4;
                p1 p1Var = (p1) obj2;
                sVar.f152891e.a(sVar.f152887a, e31.a.ENTERED_GARMIN_MESSENGER);
                if (((si1.k) p1Var.getF182175a()).f159399f) {
                    qVar.a(Long.valueOf(((si1.k) p1Var.getF182175a()).f159396c), null);
                } else {
                    y.l(m0Var, new ri1.k(false));
                }
                return Unit.INSTANCE;
            case 15:
                ((rr.h) obj3).f154177a.a(new w0.c0((im.b) obj4, (List) obj, (SparseArray) obj2));
                return Unit.INSTANCE;
            case 16:
                e23.a aVar8 = (e23.a) obj3;
                e23.p pVar = (e23.p) obj;
                mx1.b bVar6 = (mx1.b) obj2;
                a4.a aVar9 = a4.f22995c;
                String strValueOf = String.valueOf(((n1) obj4).getIntValue());
                aVar9.getClass();
                a4 a4VarA = a4.a.a(strValueOf);
                if (a4VarA != null) {
                    pVar.invoke(a4VarA, bVar6);
                }
                aVar8.invoke();
                return Unit.INSTANCE;
            case 17:
                n0.a aVar10 = (n0.a) obj4;
                s1.m0 m0Var2 = (s1.m0) obj2;
                T t14 = aVar10.f155648a;
                ?? r14 = this.f132457b;
                boolean zEquals = r14.equals(t14);
                ?? r15 = this.f132459d;
                if (!zEquals || !r15.equals(aVar10.f155649b)) {
                    aVar10.f155648a = r14;
                    aVar10.f155649b = r15;
                    aVar10.getClass();
                    aVar10.f155653f = new r1<>(m0Var2, aVar10.f155650c, (Object) r14, (Object) r15, (s1.r) null, 16, (p005kotlin.jvm.internal.j) null);
                    n0.this.f155645b.setValue(Boolean.TRUE);
                    aVar10.f155654g = false;
                    aVar10.f155655h = true;
                }
                return Unit.INSTANCE;
            case 18:
                b0 b0Var = (b0) obj4;
                s70.u0 u0Var = (s70.u0) obj;
                p1 p1Var2 = (p1) obj2;
                if (((j70.q) obj3).f97622d) {
                    ge1.b.T(b0Var, null, null, new s70.u0.a(u0Var, null), 3);
                } else {
                    p1Var2.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 19:
                o70.m mVar = (o70.m) obj3;
                r70.q qVar2 = (r70.q) obj4;
                Context context4 = (Context) obj2;
                y0 y0Var = (y0) obj;
                boolean z15 = mVar.f130031d;
                long j8 = mVar.f130028a;
                if (z15) {
                    String string = context4.getString(R.string.msg_device_passcode_being_reset);
                    string.getClass();
                    r70.q.d(qVar2, string, yd.Long, 22);
                    DevicePasscodeResetWorker.f33749g.getClass();
                    com.garmin.android.apps.connectmobile.i2.a aVar11 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar11.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "DeviceResetPasscodeWorker", "Start device passcode reset worker for device unit id: " + j8);
                    androidx.work.c.a aVar12 = new androidx.work.c.a();
                    aVar12.f11467a.put("device_unit_id", Long.valueOf(j8));
                    com.airbnb.lottie.animation.keyframe.a.o(ue.i0.f170088a, context4).a(org.apache.commons.lang3.e.e(j8, "DeviceResetPasscodeWorker_"), ue.l.KEEP, new x.a((Class<? extends androidx.work.d>) DevicePasscodeResetWorker.class).f(aVar12.a()).a()).a();
                } else {
                    v80.a aVar13 = y0Var.f157833a.f194672a;
                    ge1.b.T(aVar13, null, null, new v80.b(j8, aVar13, null), 3);
                }
                return Unit.INSTANCE;
            case 20:
                e23.a aVar14 = (e23.a) obj4;
                p1 p1Var3 = (p1) obj2;
                ((p1) obj).setValue(Boolean.FALSE);
                if (((o70.m) obj3).f130031d) {
                    aVar14.invoke();
                } else {
                    p1Var3.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 21:
                b0 b0Var2 = (b0) obj4;
                z1 z1Var = (z1) obj;
                p1 p1Var4 = (p1) obj2;
                if (((c0) obj3).f129943a) {
                    ge1.b.T(b0Var2, null, null, z1Var.new a(null), 3);
                } else {
                    p1Var4.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 22:
                Activity activity = (Activity) obj3;
                c.q qVar3 = (c.q) obj;
                u1 u1Var = (u1) obj4;
                if (activity != null) {
                    try {
                        qVar3.a(u1.d(u1Var, activity), null);
                    } catch (Exception e4) {
                        String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Error while launching SOS info update flow: ");
                        p92.y.f136664a.getClass();
                        p92.y.a.b(strD);
                        Toast.makeText(activity, R.string.msg_something_went_wrong_please_try_again_later, 0).show();
                    }
                    break;
                }
                return Unit.INSTANCE;
            case 23:
                e23.q qVar4 = (e23.q) obj4;
                e23.q qVar5 = (e23.q) obj;
                p1 p1Var5 = (p1) obj2;
                i53.c<jk0.h> cVarT4 = ((g1) obj3).t4(((sk0.n0) p1Var5.getF182175a()).f159762a);
                String str = ((sk0.n0) p1Var5.getF182175a()).f159763b;
                boolean z16 = str == null || w.J(str);
                if (!cVarT4.isEmpty() && z16) {
                    qVar5.invoke(((sk0.n0) p1Var5.getF182175a()).f159762a, ((sk0.n0) p1Var5.getF182175a()).f159763b, ((sk0.n0) p1Var5.getF182175a()).f159764c);
                } else {
                    qVar4.invoke(((sk0.n0) p1Var5.getF182175a()).f159762a, ((sk0.n0) p1Var5.getF182175a()).f159763b, ((sk0.n0) p1Var5.getF182175a()).f159764c);
                }
                return Unit.INSTANCE;
            case 24:
                e23.a aVar15 = (e23.a) obj;
                ca0.u0 u0Var2 = (ca0.u0) obj2;
                ((ta0.x) obj3).x4();
                if (ta0.w.a.f163451a[((o1) obj4).ordinal()] == 1) {
                    aVar15.invoke();
                } else {
                    u0Var2.invoke();
                }
                return Unit.INSTANCE;
            case 25:
                return ParametersHolderKt.parametersOf(Boolean.FALSE, (String) obj3, (String) obj4, (String) obj, (o90.a) obj2);
            case 26:
                m0 m0Var3 = (m0) obj4;
                int i17 = tn.m.f165476e;
                boolean zG = p005kotlin.jvm.internal.s.g((String) ((p1) obj).getF182175a(), ((tn.m) obj3).f165477a);
                ((p1) obj2).setValue(Boolean.valueOf(!zG));
                if (zG) {
                    h0 h0VarJ = m0Var3.f111904b.j();
                    if ("health_snapshot_edit_name".equals(String.valueOf(h0VarJ != null ? h0VarJ.f111773b.f144347f : null))) {
                        m0Var3.n();
                    }
                }
                return Unit.INSTANCE;
            case 27:
                ww1.a aVar16 = (ww1.a) obj3;
                ww1.c cVar3 = (ww1.c) obj4;
                ActiveTrainingPlansActivity activeTrainingPlansActivity = (ActiveTrainingPlansActivity) obj;
                List list = (List) obj2;
                ActiveTrainingPlansActivity.a aVar17 = ActiveTrainingPlansActivity.f45098w;
                if (aVar16 != null && cVar3 != null) {
                    ut1.e eVar2 = activeTrainingPlansActivity.f45108n;
                    if (eVar2 == null) {
                        p005kotlin.jvm.internal.s.m("viewModel");
                        throw null;
                    }
                    ge1.b.T(v1.a(eVar2), null, null, new ut1.f(eVar2, aVar16, cVar3, list, null), 3);
                }
                return Unit.INSTANCE;
            case 28:
                e23.p pVar2 = (e23.p) obj;
                q91.d dVar3 = (q91.d) obj2;
                ((e23.a) obj3).invoke();
                Long l14 = ((aa1.d) obj4).f2256h;
                if (l14 != null) {
                    pVar2.invoke(l14, dVar3);
                }
                return Unit.INSTANCE;
            default:
                int i18 = ub1.b.f169785e;
                ((p1) obj).setValue(Boolean.FALSE);
                ((ub1.b) obj3).f169789d.invoke((Context) obj2);
                ((e23.a) obj4).invoke();
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(Context context, x3 x3Var, x3 x3Var2, p1 p1Var) {
        this.f132456a = 7;
        this.f132460e = context;
        this.f132457b = x3Var;
        this.f132458c = x3Var2;
        this.f132459d = p1Var;
    }

    public /* synthetic */ d(Object obj, c.q qVar, Object obj2, Object obj3, int i14) {
        this.f132456a = i14;
        this.f132457b = obj;
        this.f132459d = qVar;
        this.f132458c = obj2;
        this.f132460e = obj3;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f132456a = i14;
        this.f132457b = obj;
        this.f132458c = obj2;
        this.f132459d = obj3;
        this.f132460e = obj4;
    }

    public /* synthetic */ d(int i14, Context context, Object obj, Object obj2, Object obj3) {
        this.f132456a = i14;
        this.f132457b = obj;
        this.f132458c = obj2;
        this.f132460e = context;
        this.f132459d = obj3;
    }
}
