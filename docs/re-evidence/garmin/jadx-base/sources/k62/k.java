package k62;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.EditText;
import android.widget.Toast;
import androidx.lifecycle.a0;
import androidx.lifecycle.n0;
import au0.m0;
import ch.qos.logback.classic.net.SyslogAppender;
import coil3.request.NullRequestDataException;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import com.garmin.android.apps.connectmobile.golf.courses.presentation.GolfCourseFullScreenMapActivity;
import com.garmin.android.apps.connectmobile.group.create.GroupCreationActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripFlightFragment;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity;
import com.garmin.android.apps.connectmobile.view.GCMMapPreview;
import com.garmin.android.apps.connectmobile.view.view_3_0.StyledInlineTextFieldViewDark;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import com.garmin.android.livesessionview.LiveActivityActivity;
import com.garmin.feature.garminpay.ui.devicesettings.RapidPassSettingActivity;
import com.google.android.gms.maps.model.LatLng;
import e2.f0;
import e23.r;
import f5.b1;
import f5.v1;
import i3.ij;
import i3.mc;
import ii0.v;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ky0.y;
import l30.z;
import l72.o1;
import lc.k0;
import lc.u0;
import li0.x;
import m4.g0;
import o4.d0;
import o4.q1;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p005kotlin.math.MathKt;
import p006l2.b2;
import p006l2.i3;
import p006l2.s1;
import p006l2.s3;
import p006l2.t2;
import p006l2.w2;
import p006l2.x2;
import p13.j0;
import p13.w;
import p3.p1;
import p3.x3;
import p5.h0;
import s5.i0;
import s5.q0;
import s5.w0;
import vr2.q;
import wd2.m1;
import x5.c0;
import x5.l0;
import x5.p0;
import yc.z0;
import z2.s2;
import z2.y1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f103203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f103204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f103205d;

    public /* synthetic */ k(int i14, Context context, Object obj, Object obj2) {
        this.f103202a = i14;
        this.f103203b = obj;
        this.f103205d = obj2;
        this.f103204c = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj) {
        Object next;
        String str;
        nj2.a aVar = (nj2.a) this.f103203b;
        p1 p1Var = (p1) this.f103204c;
        p1 p1Var2 = (p1) this.f103205d;
        String str2 = (String) obj;
        if (str2 != null) {
            aVar.O4(nj2.a.b.CITY, str2);
            p1Var.setValue(str2);
        }
        Iterator it = ((List) p1Var2.getF182175a()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.g(((o13.p) next).f128594a, str2));
        o13.p pVar = (o13.p) next;
        if (pVar != null && (str = (String) pVar.f128595b) != null) {
            aVar.Q4(nj2.a.b.CITY, str);
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj) {
        List list = (List) this.f103203b;
        e23.l lVar = (e23.l) this.f103204c;
        e23.l lVar2 = (e23.l) this.f103205d;
        f0 f0Var = (f0) obj;
        f0Var.getClass();
        f0Var.a(list.size(), null, new ll0.c.d(ll0.c.C2165c.f113343a, list), new z3.e(802480018, true, new ll0.c.e(list, lVar, lVar2)));
        return Unit.INSTANCE;
    }

    private final Object c(Object obj) throws IOException {
        Object obj2;
        Object obj3;
        Float f14;
        Object obj4;
        Object obj5;
        Object objFromFile;
        km0.e eVar = (km0.e) this.f103203b;
        e23.l lVar = (e23.l) this.f103205d;
        Context context = (Context) this.f103204c;
        f.a aVar = (f.a) obj;
        aVar.getClass();
        if (aVar.f67585a == -1) {
            Intent intent = aVar.f67586b;
            Object obj6 = null;
            if (intent != null) {
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 33) {
                    obj4 = (Parcelable) intent.getParcelableExtra("original_uri", Uri.class);
                } else {
                    Parcelable parcelableExtra = intent.getParcelableExtra("original_uri");
                    if (!(parcelableExtra instanceof Uri)) {
                        parcelableExtra = null;
                    }
                    obj4 = (Uri) parcelableExtra;
                }
                if (i14 >= 33) {
                    obj5 = (Parcelable) intent.getParcelableExtra("input_uri", Uri.class);
                } else {
                    Parcelable parcelableExtra2 = intent.getParcelableExtra("input_uri");
                    if (!(parcelableExtra2 instanceof Uri)) {
                        parcelableExtra2 = null;
                    }
                    obj5 = (Uri) parcelableExtra2;
                }
                if (i14 >= 33) {
                    obj3 = (Parcelable) intent.getParcelableExtra("crop_rect", Rect.class);
                } else {
                    Parcelable parcelableExtra3 = intent.getParcelableExtra("crop_rect");
                    if (!(parcelableExtra3 instanceof Rect)) {
                        parcelableExtra3 = null;
                    }
                    obj3 = (Rect) parcelableExtra3;
                }
                Float fValueOf = Float.valueOf(intent.getFloatExtra("rotate_angle", 0.0f));
                if (obj5 != null) {
                    File fileCreateTempFile = File.createTempFile(org.apache.commons.lang3.e.e(System.currentTimeMillis(), "group_photo_"), null, context.getCacheDir());
                    InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream((Uri) obj5);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            fileCreateTempFile.getClass();
                            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                            try {
                                dh.b.p(inputStreamOpenInputStream, fileOutputStream, 8192);
                                fileOutputStream.close();
                                inputStreamOpenInputStream.close();
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    jg.b.l(fileOutputStream, th3);
                                    throw th4;
                                }
                            }
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                jg.b.l(inputStreamOpenInputStream, th5);
                                throw th6;
                            }
                        }
                    }
                    objFromFile = Uri.fromFile(fileCreateTempFile);
                } else {
                    objFromFile = obj5;
                }
                f14 = fValueOf;
                obj2 = objFromFile;
                obj6 = obj4;
            } else {
                obj2 = null;
                obj3 = null;
                f14 = null;
            }
            if (obj6 == null || obj2 == null || obj3 == null || f14 == null) {
                Toast.makeText(context, R.string.lbl_error_occurred, 0).show();
            } else {
                km0.c.a(eVar);
                lVar.invoke(new km0.e.b((Uri) obj6, (Uri) obj2, (Rect) obj3, f14.floatValue()));
            }
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj) {
        yq2.b.a aVarD;
        yq2.b bVar = (yq2.b) this.f103203b;
        q qVar = (q) this.f103204c;
        RapidPassSettingActivity.a aVar = (RapidPassSettingActivity.a) this.f103205d;
        ((Integer) obj).getClass();
        int i14 = RapidPassSettingActivity.a.f52031f;
        if (bVar == null || (aVarD = bVar.d(qVar.f179658e)) == null) {
            return Unit.INSTANCE;
        }
        aVar.Z5(new lr2.s(aVarD.f198842a, aVarD.f198843b, 0));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:334:0x0859  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.internal.j, u41.a] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.l
    public final Object invoke(Object obj) {
        long j8;
        s5.c.d dVar;
        Integer numC;
        Integer numD;
        Integer numD2;
        Integer numC2;
        q0 q0Var;
        q0 q0Var2;
        i3 i3Var;
        i3 i3Var2;
        Integer numC3;
        Integer numD3;
        Integer numD4;
        Integer numC4;
        q0 q0Var3;
        q0 q0Var4;
        i3 i3Var3;
        i3 i3Var4;
        s3.a aVar;
        int i14 = this.f103202a;
        int i15 = 25;
        float f14 = 1.0f;
        int i16 = 27;
        int i17 = 6;
        int i18 = 4;
        final int i19 = 0;
        d0 d0Var = 0;
        l0 l0Var = null;
        l0Var = null;
        l0 l0Var2 = null;
        final int i24 = 1;
        final ?? r14 = this.f103205d;
        Object obj2 = this.f103204c;
        Object obj3 = this.f103203b;
        switch (i14) {
            case 0:
                Context context = (Context) obj2;
                long jLongValue = ((Long) obj).longValue();
                context.getClass();
                WorkoutDetailsActivity.f48482f.getClass();
                ((c.q) obj3).a(WorkoutDetailsActivity.a.a(context, jLongValue, (Long) r14), null);
                return Unit.INSTANCE;
            case 1:
                Activity activity = (Activity) obj3;
                r0 r0Var = (r0) obj2;
                i.c cVar = (i.c) r14;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i25 = kd0.m.f104216a;
                if (zBooleanValue) {
                    bu0.j jVar = (bu0.j) KoinJavaComponent.get$default(bu0.j.class, null, null, 6, null);
                    if (jVar.a(jVar.f21211b.a(null))) {
                        LiveActivityActivity.f50544d.getClass();
                        activity.startActivity(LiveActivityActivity.a.a(activity));
                    }
                } else {
                    T t7 = r0Var.f105810a;
                    if (t7 == 0) {
                        s.m("dialog");
                        throw null;
                    }
                    ((m0) t7).y6(true);
                    ge1.b.T(o53.f0.w(cVar), null, null, new kd0.p(r0Var, activity, null), 3);
                }
                return Unit.INSTANCE;
            case 2:
                t4.d dVar2 = (t4.d) obj3;
                t4.d dVar3 = (t4.d) obj2;
                t4.d dVar4 = (t4.d) r14;
                jf.d.c cVar2 = (jf.d.c) obj;
                if (cVar2 instanceof jf.d.c.C1893c) {
                    return dVar2 != null ? new jf.d.c.C1893c(dVar2) : (jf.d.c.C1893c) cVar2;
                }
                if (!(cVar2 instanceof jf.d.c.b)) {
                    return cVar2;
                }
                jf.d.c.b bVar = (jf.d.c.b) cVar2;
                wf.e eVar = bVar.f98638b;
                if (eVar.f184901c instanceof NullRequestDataException) {
                    return dVar3 != null ? new jf.d.c.b(dVar3, eVar) : bVar;
                }
                return dVar4 != null ? new jf.d.c.b(dVar4, eVar) : bVar;
            case 3:
                e23.l lVar = (e23.l) obj3;
                e23.l lVar2 = (e23.l) obj2;
                e23.l lVar3 = (e23.l) r14;
                jf.d.c cVar3 = (jf.d.c) obj;
                if (cVar3 instanceof jf.d.c.C1893c) {
                    if (lVar != null) {
                        lVar.invoke(cVar3);
                    }
                } else if (cVar3 instanceof jf.d.c.C1894d) {
                    if (lVar2 != null) {
                        lVar2.invoke(cVar3);
                    }
                } else if (cVar3 instanceof jf.d.c.b) {
                    if (lVar3 != null) {
                        lVar3.invoke(cVar3);
                    }
                } else if (!(cVar3 instanceof jf.d.c.a)) {
                    u0.r();
                    return null;
                }
                return Unit.INSTANCE;
            case 4:
                tz.a aVar2 = (tz.a) obj3;
                ((CustomLineChart) obj).getClass();
                aVar2.c();
                qz.a.b(aVar2, (List) obj2, ((CustomLineChart) r14).getContext().getString(R.string.lbl_no_fitness_age_data), 4);
                return Unit.INSTANCE;
            case 5:
                ih0.s sVar = (ih0.s) obj2;
                dh0.g gVar = (dh0.g) obj;
                gVar.getClass();
                ge1.b.T((b0) obj3, null, null, new kh0.g.b((mc) r14, null), 3);
                if (gVar == dh0.g.BMI) {
                    sVar.f93488g = true;
                }
                sVar.A4();
                return Unit.INSTANCE;
            case 6:
                final il0.a aVar3 = (il0.a) r14;
                final Context context2 = (Context) obj2;
                GCMMapPreview gCMMapPreview = (GCMMapPreview) obj;
                gCMMapPreview.getClass();
                gCMMapPreview.b();
                ((e23.l) obj3).invoke(gCMMapPreview.getMapProvider());
                Integer latitude = aVar3.getLatitude();
                Integer longitude = aVar3.getLongitude();
                if (latitude != null && longitude != null) {
                    final int iIntValue = longitude.intValue();
                    final int iIntValue2 = latitude.intValue();
                    gCMMapPreview.setOnMapClickListener(new com.garmin.android.library.mapsdkadapter.i.j() { // from class: kl0.a
                        @Override // com.garmin.android.library.mapsdkadapter.i.j
                        public final void X(com.garmin.android.library.mapsdkadapter.f fVar) {
                            GolfCourseFullScreenMapActivity.a aVar4 = GolfCourseFullScreenMapActivity.f35749d;
                            String name = aVar3.getName();
                            aVar4.getClass();
                            Context context3 = context2;
                            context3.getClass();
                            name.getClass();
                            Intent intent = new Intent(context3, (Class<?>) GolfCourseFullScreenMapActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putString("GOLF_COURSE_NAME", name);
                            bundle.putInt("GOLF_COURSE_LATITUDE", iIntValue2);
                            bundle.putInt("GOLF_COURSE_LONGITUDE", iIntValue);
                            intent.putExtras(bundle);
                            context3.startActivity(intent);
                        }
                    });
                    com.garmin.android.library.mapsdkadapter.f fVar = new com.garmin.android.library.mapsdkadapter.f(lb2.b.b(iIntValue2), lb2.b.b(iIntValue), com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                    com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
                    pVar.d(fVar);
                    gCMMapPreview.g(pVar);
                }
                gCMMapPreview.setMapType(4);
                gCMMapPreview.getMapProxy().d(true, true, 1.0f);
                return Unit.INSTANCE;
            case 7:
                GroupCreationActivity groupCreationActivity = (GroupCreationActivity) obj3;
                lc.m0 m0Var = (lc.m0) obj2;
                k0 k0Var = (k0) obj;
                int i26 = GroupCreationActivity.f36131b;
                k0Var.getClass();
                nc.n.b(k0Var, "wizard_route", null, null, null, null, null, null, new z3.e(-467286176, true, new ao1.f(i15, groupCreationActivity, m0Var)), 254);
                nc.n.b(k0Var, "search_invite_route", null, null, null, null, null, null, new z3.e(-1047498551, true, new i91.e((zc.d) r14, 9, groupCreationActivity, m0Var)), 254);
                return Unit.INSTANCE;
            case 8:
                Context context3 = (Context) obj2;
                p1 p1Var = (p1) r14;
                e23.a aVar4 = (e23.a) obj;
                aVar4.getClass();
                if (((Collection) ((kv0.j) obj3).f106670g.getValue()).isEmpty()) {
                    aVar4.invoke();
                } else {
                    String string = context3.getString(R.string.lbl_settings_disabled);
                    p1Var.setValue(new lv0.a.b(string, p6.b.d(context3, R.string.msg_livetrack_disabled_during_active_session, string)));
                }
                return Unit.INSTANCE;
            case 9:
                kv0.j jVar2 = (kv0.j) obj3;
                m1 m1Var = (m1) obj2;
                ff2.d dVar5 = (ff2.d) r14;
                if (((Boolean) obj).booleanValue()) {
                    jVar2.f106668e = m1Var;
                    dVar5.invoke(m1Var);
                } else {
                    int i27 = kv0.j.f106663m;
                }
                return Unit.INSTANCE;
            case 10:
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                f0.b(f0Var, null, new z3.e(709076020, true, new ky0.i((ky0.f) obj3, (p1) obj2, (p1) r14, i19)), 3);
                return Unit.INSTANCE;
            case 11:
                MultiDayActivitiesDetailActivity multiDayActivitiesDetailActivity = (MultiDayActivitiesDetailActivity) obj3;
                final lc.m0 m0Var2 = (lc.m0) obj2;
                k0 k0Var2 = (k0) obj;
                MultiDayActivitiesDetailActivity.a aVar5 = MultiDayActivitiesDetailActivity.f39233a;
                k0Var2.getClass();
                z3.e eVar2 = new z3.e(1113347305, true, new y(multiDayActivitiesDetailActivity, m0Var2, (o13.l) r14));
                p13.k0 k0Var3 = p13.k0.f134949a;
                k0Var3.getClass();
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                nc.n.a(k0Var2, t0Var.b(com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.a.c.class), k0Var3, j0Var, null, null, null, null, eVar2);
                nc.n.a(k0Var2, t0Var.b(com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.a.C0698a.class), k0Var3, j0Var, null, null, null, null, new z3.e(-2119661870, true, new y((o13.l) r14, multiDayActivitiesDetailActivity, m0Var2)));
                nc.n.a(k0Var2, t0Var.b(com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.a.b.class), k0Var3, j0Var, null, null, null, null, new z3.e(1255527473, true, new r() { // from class: ky0.z
                    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o13.l] */
                    @Override // e23.r
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i28 = i19;
                        lc.m0 m0Var3 = m0Var2;
                        final ?? r15 = r14;
                        r1.l lVar4 = (r1.l) obj4;
                        lc.v vVar = (lc.v) obj5;
                        p3.m mVar = (p3.m) obj6;
                        switch (i28) {
                            case 0:
                                ((Integer) obj7).getClass();
                                MultiDayActivitiesDetailActivity.a aVar6 = MultiDayActivitiesDetailActivity.f39233a;
                                lVar4.getClass();
                                vVar.getClass();
                                p3.x1 x1Var = p3.n.f135158a;
                                final p3.p1 p1VarC = s9.c.c(((w0) r15.getValue()).A1, mVar);
                                final int i29 = 0;
                                z02.d.a(false, z3.f.c(-1304055370, new b21.j0(m0Var3, 13), mVar), null, null, null, z3.f.c(2111789498, new e23.p() { // from class: ky0.u
                                    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
                                    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
                                    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
                                    @Override // e23.p
                                    public final Object invoke(Object obj8, Object obj9) {
                                        int i30 = i29;
                                        p3.m.a aVar7 = p3.m.f135153a;
                                        x3 x3Var = p1VarC;
                                        Object obj10 = r15;
                                        p3.m mVar2 = (p3.m) obj8;
                                        int iIntValue3 = ((Integer) obj9).intValue();
                                        switch (i30) {
                                            case 0:
                                                MultiDayActivitiesDetailActivity.a aVar8 = MultiDayActivitiesDetailActivity.f39233a;
                                                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    p3.x1 x1Var2 = p3.n.f135158a;
                                                    k30.n nVar = (k30.n) x3Var.getF182175a();
                                                    boolean zR = mVar2.r(obj10);
                                                    Object objQ = mVar2.q();
                                                    if (zR) {
                                                        objQ = new e2.k(obj10, 1);
                                                        mVar2.K(objQ);
                                                    } else {
                                                        aVar7.getClass();
                                                        if (objQ == p3.m.a.f135155b) {
                                                            objQ = new e2.k(obj10, 1);
                                                            mVar2.K(objQ);
                                                        }
                                                    }
                                                    e23.l lVar5 = (e23.l) objQ;
                                                    boolean zR2 = mVar2.r(obj10);
                                                    Object objQ2 = mVar2.q();
                                                    if (zR2) {
                                                        objQ2 = new e2.k(obj10, 2);
                                                        mVar2.K(objQ2);
                                                    } else {
                                                        aVar7.getClass();
                                                        if (objQ2 == p3.m.a.f135155b) {
                                                            objQ2 = new e2.k(obj10, 2);
                                                            mVar2.K(objQ2);
                                                        }
                                                    }
                                                    jy0.k.a(nVar, lVar5, (e23.l) objQ2, mVar2, 0);
                                                } else {
                                                    mVar2.e();
                                                }
                                                break;
                                            default:
                                                MultiDayActivitiesDetailActivity.a aVar9 = MultiDayActivitiesDetailActivity.f39233a;
                                                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    p3.x1 x1Var3 = p3.n.f135158a;
                                                    i53.g gVar2 = (i53.g) x3Var.getF182175a();
                                                    boolean zR3 = mVar2.r(obj10);
                                                    Object objQ3 = mVar2.q();
                                                    if (zR3) {
                                                        objQ3 = new kk1.h(obj10, 8);
                                                        mVar2.K(objQ3);
                                                    } else {
                                                        aVar7.getClass();
                                                        if (objQ3 == p3.m.a.f135155b) {
                                                            objQ3 = new kk1.h(obj10, 8);
                                                            mVar2.K(objQ3);
                                                        }
                                                    }
                                                    z1.b(gVar2, (e23.p) objQ3, mVar2, 0);
                                                } else {
                                                    mVar2.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar), mVar, 196656, 29);
                                break;
                            default:
                                ((Integer) obj7).getClass();
                                MultiDayActivitiesDetailActivity.a aVar7 = MultiDayActivitiesDetailActivity.f39233a;
                                lVar4.getClass();
                                vVar.getClass();
                                p3.x1 x1Var2 = p3.n.f135158a;
                                final p3.p1 p1VarC2 = s9.c.c(((w0) r15.getValue()).D1, mVar);
                                final int i30 = 1;
                                z02.d.a(false, z3.f.c(2071133973, new b21.j0(m0Var3, 14), mVar), null, null, null, z3.f.c(1192011545, new e23.p() { // from class: ky0.u
                                    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
                                    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
                                    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
                                    @Override // e23.p
                                    public final Object invoke(Object obj8, Object obj9) {
                                        int i34 = i30;
                                        p3.m.a aVar8 = p3.m.f135153a;
                                        x3 x3Var = p1VarC2;
                                        Object obj10 = r15;
                                        p3.m mVar2 = (p3.m) obj8;
                                        int iIntValue3 = ((Integer) obj9).intValue();
                                        switch (i34) {
                                            case 0:
                                                MultiDayActivitiesDetailActivity.a aVar9 = MultiDayActivitiesDetailActivity.f39233a;
                                                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    p3.x1 x1Var3 = p3.n.f135158a;
                                                    k30.n nVar = (k30.n) x3Var.getF182175a();
                                                    boolean zR = mVar2.r(obj10);
                                                    Object objQ = mVar2.q();
                                                    if (zR) {
                                                        objQ = new e2.k(obj10, 1);
                                                        mVar2.K(objQ);
                                                    } else {
                                                        aVar8.getClass();
                                                        if (objQ == p3.m.a.f135155b) {
                                                            objQ = new e2.k(obj10, 1);
                                                            mVar2.K(objQ);
                                                        }
                                                    }
                                                    e23.l lVar5 = (e23.l) objQ;
                                                    boolean zR2 = mVar2.r(obj10);
                                                    Object objQ2 = mVar2.q();
                                                    if (zR2) {
                                                        objQ2 = new e2.k(obj10, 2);
                                                        mVar2.K(objQ2);
                                                    } else {
                                                        aVar8.getClass();
                                                        if (objQ2 == p3.m.a.f135155b) {
                                                            objQ2 = new e2.k(obj10, 2);
                                                            mVar2.K(objQ2);
                                                        }
                                                    }
                                                    jy0.k.a(nVar, lVar5, (e23.l) objQ2, mVar2, 0);
                                                } else {
                                                    mVar2.e();
                                                }
                                                break;
                                            default:
                                                MultiDayActivitiesDetailActivity.a aVar10 = MultiDayActivitiesDetailActivity.f39233a;
                                                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    p3.x1 x1Var4 = p3.n.f135158a;
                                                    i53.g gVar2 = (i53.g) x3Var.getF182175a();
                                                    boolean zR3 = mVar2.r(obj10);
                                                    Object objQ3 = mVar2.q();
                                                    if (zR3) {
                                                        objQ3 = new kk1.h(obj10, 8);
                                                        mVar2.K(objQ3);
                                                    } else {
                                                        aVar8.getClass();
                                                        if (objQ3 == p3.m.a.f135155b) {
                                                            objQ3 = new kk1.h(obj10, 8);
                                                            mVar2.K(objQ3);
                                                        }
                                                    }
                                                    z1.b(gVar2, (e23.p) objQ3, mVar2, 0);
                                                } else {
                                                    mVar2.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar), mVar, 196656, 29);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                nc.n.a(k0Var2, t0Var.b(com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.a.d.class), k0Var3, j0Var, null, null, null, null, new z3.e(335749520, true, new r() { // from class: ky0.z
                    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o13.l] */
                    @Override // e23.r
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i28 = i24;
                        lc.m0 m0Var3 = m0Var2;
                        final o13.l r15 = r14;
                        r1.l lVar4 = (r1.l) obj4;
                        lc.v vVar = (lc.v) obj5;
                        p3.m mVar = (p3.m) obj6;
                        switch (i28) {
                            case 0:
                                ((Integer) obj7).getClass();
                                MultiDayActivitiesDetailActivity.a aVar6 = MultiDayActivitiesDetailActivity.f39233a;
                                lVar4.getClass();
                                vVar.getClass();
                                p3.x1 x1Var = p3.n.f135158a;
                                final p3.p1 p1VarC = s9.c.c(((w0) r15.getValue()).A1, mVar);
                                final int i29 = 0;
                                z02.d.a(false, z3.f.c(-1304055370, new b21.j0(m0Var3, 13), mVar), null, null, null, z3.f.c(2111789498, new e23.p() { // from class: ky0.u
                                    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
                                    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
                                    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
                                    @Override // e23.p
                                    public final Object invoke(Object obj8, Object obj9) {
                                        int i34 = i29;
                                        p3.m.a aVar8 = p3.m.f135153a;
                                        x3 x3Var = p1VarC;
                                        Object obj10 = r15;
                                        p3.m mVar2 = (p3.m) obj8;
                                        int iIntValue3 = ((Integer) obj9).intValue();
                                        switch (i34) {
                                            case 0:
                                                MultiDayActivitiesDetailActivity.a aVar9 = MultiDayActivitiesDetailActivity.f39233a;
                                                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    p3.x1 x1Var3 = p3.n.f135158a;
                                                    k30.n nVar = (k30.n) x3Var.getF182175a();
                                                    boolean zR = mVar2.r(obj10);
                                                    Object objQ = mVar2.q();
                                                    if (zR) {
                                                        objQ = new e2.k(obj10, 1);
                                                        mVar2.K(objQ);
                                                    } else {
                                                        aVar8.getClass();
                                                        if (objQ == p3.m.a.f135155b) {
                                                            objQ = new e2.k(obj10, 1);
                                                            mVar2.K(objQ);
                                                        }
                                                    }
                                                    e23.l lVar5 = (e23.l) objQ;
                                                    boolean zR2 = mVar2.r(obj10);
                                                    Object objQ2 = mVar2.q();
                                                    if (zR2) {
                                                        objQ2 = new e2.k(obj10, 2);
                                                        mVar2.K(objQ2);
                                                    } else {
                                                        aVar8.getClass();
                                                        if (objQ2 == p3.m.a.f135155b) {
                                                            objQ2 = new e2.k(obj10, 2);
                                                            mVar2.K(objQ2);
                                                        }
                                                    }
                                                    jy0.k.a(nVar, lVar5, (e23.l) objQ2, mVar2, 0);
                                                } else {
                                                    mVar2.e();
                                                }
                                                break;
                                            default:
                                                MultiDayActivitiesDetailActivity.a aVar10 = MultiDayActivitiesDetailActivity.f39233a;
                                                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    p3.x1 x1Var4 = p3.n.f135158a;
                                                    i53.g gVar2 = (i53.g) x3Var.getF182175a();
                                                    boolean zR3 = mVar2.r(obj10);
                                                    Object objQ3 = mVar2.q();
                                                    if (zR3) {
                                                        objQ3 = new kk1.h(obj10, 8);
                                                        mVar2.K(objQ3);
                                                    } else {
                                                        aVar8.getClass();
                                                        if (objQ3 == p3.m.a.f135155b) {
                                                            objQ3 = new kk1.h(obj10, 8);
                                                            mVar2.K(objQ3);
                                                        }
                                                    }
                                                    z1.b(gVar2, (e23.p) objQ3, mVar2, 0);
                                                } else {
                                                    mVar2.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar), mVar, 196656, 29);
                                break;
                            default:
                                ((Integer) obj7).getClass();
                                MultiDayActivitiesDetailActivity.a aVar7 = MultiDayActivitiesDetailActivity.f39233a;
                                lVar4.getClass();
                                vVar.getClass();
                                p3.x1 x1Var2 = p3.n.f135158a;
                                final p3.p1 p1VarC2 = s9.c.c(((w0) r15.getValue()).D1, mVar);
                                final int i30 = 1;
                                z02.d.a(false, z3.f.c(2071133973, new b21.j0(m0Var3, 14), mVar), null, null, null, z3.f.c(1192011545, new e23.p() { // from class: ky0.u
                                    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
                                    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
                                    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
                                    @Override // e23.p
                                    public final Object invoke(Object obj8, Object obj9) {
                                        int i34 = i30;
                                        p3.m.a aVar8 = p3.m.f135153a;
                                        x3 x3Var = p1VarC2;
                                        Object obj10 = r15;
                                        p3.m mVar2 = (p3.m) obj8;
                                        int iIntValue3 = ((Integer) obj9).intValue();
                                        switch (i34) {
                                            case 0:
                                                MultiDayActivitiesDetailActivity.a aVar9 = MultiDayActivitiesDetailActivity.f39233a;
                                                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    p3.x1 x1Var3 = p3.n.f135158a;
                                                    k30.n nVar = (k30.n) x3Var.getF182175a();
                                                    boolean zR = mVar2.r(obj10);
                                                    Object objQ = mVar2.q();
                                                    if (zR) {
                                                        objQ = new e2.k(obj10, 1);
                                                        mVar2.K(objQ);
                                                    } else {
                                                        aVar8.getClass();
                                                        if (objQ == p3.m.a.f135155b) {
                                                            objQ = new e2.k(obj10, 1);
                                                            mVar2.K(objQ);
                                                        }
                                                    }
                                                    e23.l lVar5 = (e23.l) objQ;
                                                    boolean zR2 = mVar2.r(obj10);
                                                    Object objQ2 = mVar2.q();
                                                    if (zR2) {
                                                        objQ2 = new e2.k(obj10, 2);
                                                        mVar2.K(objQ2);
                                                    } else {
                                                        aVar8.getClass();
                                                        if (objQ2 == p3.m.a.f135155b) {
                                                            objQ2 = new e2.k(obj10, 2);
                                                            mVar2.K(objQ2);
                                                        }
                                                    }
                                                    jy0.k.a(nVar, lVar5, (e23.l) objQ2, mVar2, 0);
                                                } else {
                                                    mVar2.e();
                                                }
                                                break;
                                            default:
                                                MultiDayActivitiesDetailActivity.a aVar10 = MultiDayActivitiesDetailActivity.f39233a;
                                                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    p3.x1 x1Var4 = p3.n.f135158a;
                                                    i53.g gVar2 = (i53.g) x3Var.getF182175a();
                                                    boolean zR3 = mVar2.r(obj10);
                                                    Object objQ3 = mVar2.q();
                                                    if (zR3) {
                                                        objQ3 = new kk1.h(obj10, 8);
                                                        mVar2.K(objQ3);
                                                    } else {
                                                        aVar8.getClass();
                                                        if (objQ3 == p3.m.a.f135155b) {
                                                            objQ3 = new kk1.h(obj10, 8);
                                                            mVar2.K(objQ3);
                                                        }
                                                    }
                                                    z1.b(gVar2, (e23.p) objQ3, mVar2, 0);
                                                } else {
                                                    mVar2.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar), mVar, 196656, 29);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                return Unit.INSTANCE;
            case 12:
                b2 b2Var = (b2) obj3;
                l0 l0Var3 = (l0) obj2;
                c0 c0Var = (c0) r14;
                q4.f fVar2 = (q4.f) obj;
                i3 i3VarD = b2Var.d();
                if (i3VarD != null) {
                    o4.y yVarA = fVar2.getF142543b().a();
                    t2.a aVar6 = t2.f108797a;
                    long j14 = ((w0) b2Var.A.getF182175a()).f157317a;
                    long j15 = ((w0) b2Var.B.getF182175a()).f157317a;
                    q0 q0Var5 = i3VarD.f108575a;
                    o4.h hVar = b2Var.f108415y;
                    long j16 = b2Var.f108416z;
                    aVar6.getClass();
                    if (!w0.e(j14)) {
                        hVar.e(j16);
                        t2.a.a(yVarA, j14, c0Var, q0Var5, hVar);
                    } else if (!w0.e(j15)) {
                        d0 d0VarA = d0.a(q0Var5.f157280a.f157266b.c());
                        d0Var = d0VarA.f128833a != 16 ? d0VarA : 0;
                        if (d0Var != 0) {
                            j8 = d0Var.f128833a;
                        } else {
                            d0.f128823b.getClass();
                            j8 = d0.f128824c;
                        }
                        hVar.e(d0.c(d0.e(j8) * 0.2f, j8, 14));
                        t2.a.a(yVarA, j15, c0Var, q0Var5, hVar);
                    } else if (!w0.e(l0Var3.f188879b)) {
                        hVar.e(j16);
                        t2.a.a(yVarA, l0Var3.f188879b, c0Var, q0Var5, hVar);
                    }
                    s5.u0.f157305a.getClass();
                    s5.u0.a(yVarA, q0Var5);
                }
                return Unit.INSTANCE;
            case 13:
                p005kotlin.jvm.internal.m0 m0Var3 = (p005kotlin.jvm.internal.m0) obj3;
                s5.c.d dVar6 = (s5.c.d) obj2;
                i0 i0Var = (i0) r14;
                s5.c.d dVar7 = (s5.c.d) obj;
                if (m0Var3.f105804a) {
                    T t14 = dVar7.f157149a;
                    int i28 = dVar7.f157151c;
                    int i29 = dVar7.f157150b;
                    if ((t14 instanceof i0) && i29 == dVar6.f157150b && i28 == dVar6.f157151c) {
                        if (i0Var == null) {
                            i0Var = new i0(0L, 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65535, (p005kotlin.jvm.internal.j) null);
                        }
                        dVar = new s5.c.d(i0Var, i29, i28);
                    } else {
                        dVar = dVar7;
                    }
                } else {
                    dVar = dVar7;
                }
                m0Var3.f105804a = dVar6.equals(dVar7);
                return dVar;
            case 14:
                e23.l lVar4 = (e23.l) obj2;
                t2.a aVar7 = t2.f108797a;
                p0 p0Var = (p0) ((r0) r14).f105810a;
                aVar7.getClass();
                l0 l0VarA = ((x5.l) obj3).a((List) obj);
                if (p0Var != null && s.g(p0Var.f188928a.f188887b.get(), p0Var)) {
                    p0Var.f188929b.c(null, l0VarA);
                }
                lVar4.invoke(l0VarA);
                return Unit.INSTANCE;
            case 15:
                x2 x2Var = (x2) obj2;
                p005kotlin.jvm.internal.m0 m0Var4 = (p005kotlin.jvm.internal.m0) r14;
                y1 y1Var = (y1) obj;
                switch (x2.a.f108888a[((s1) obj3).ordinal()]) {
                    case 1:
                        x2Var.f108877b.j(false);
                        break;
                    case 2:
                        x2Var.f108877b.w();
                        break;
                    case 3:
                        x2Var.f108877b.l();
                        break;
                    case 4:
                        y1Var.f201547e.f201787a = null;
                        if (y1Var.f201549g.f157138b.length() > 0) {
                            if (!w0.e(y1Var.f201548f)) {
                                boolean zE = y1Var.e();
                                long j17 = y1Var.f201548f;
                                if (!zE) {
                                    int iG = w0.g(j17);
                                    y1Var.o(iG, iG);
                                } else {
                                    int iH = w0.h(j17);
                                    y1Var.o(iH, iH);
                                }
                            } else {
                                y1Var.g();
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                        break;
                    case 5:
                        y1Var.f201547e.f201787a = null;
                        if (y1Var.f201549g.f157138b.length() > 0) {
                            if (!w0.e(y1Var.f201548f)) {
                                boolean zE2 = y1Var.e();
                                long j18 = y1Var.f201548f;
                                if (!zE2) {
                                    int iH2 = w0.h(j18);
                                    y1Var.o(iH2, iH2);
                                } else {
                                    int iG2 = w0.g(j18);
                                    y1Var.o(iG2, iG2);
                                }
                            } else {
                                y1Var.k();
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                        break;
                    case 6:
                        s2 s2Var = y1Var.f201547e;
                        s2Var.f201787a = null;
                        s5.c cVar4 = y1Var.f201549g;
                        String str = cVar4.f157138b;
                        String str2 = cVar4.f157138b;
                        if (str.length() > 0) {
                            if (!y1Var.e()) {
                                s2Var.f201787a = null;
                                if (str2.length() > 0 && (numC = y1Var.c()) != null) {
                                    int iIntValue3 = numC.intValue();
                                    y1Var.o(iIntValue3, iIntValue3);
                                }
                            } else {
                                s2Var.f201787a = null;
                                if (str2.length() > 0 && (numD = y1Var.d()) != null) {
                                    int iIntValue4 = numD.intValue();
                                    y1Var.o(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        break;
                    case 7:
                        s2 s2Var2 = y1Var.f201547e;
                        s2Var2.f201787a = null;
                        s5.c cVar5 = y1Var.f201549g;
                        String str3 = cVar5.f157138b;
                        String str4 = cVar5.f157138b;
                        if (str3.length() > 0) {
                            if (!y1Var.e()) {
                                s2Var2.f201787a = null;
                                if (str4.length() > 0 && (numD2 = y1Var.d()) != null) {
                                    int iIntValue5 = numD2.intValue();
                                    y1Var.o(iIntValue5, iIntValue5);
                                }
                            } else {
                                s2Var2.f201787a = null;
                                if (str4.length() > 0 && (numC2 = y1Var.c()) != null) {
                                    int iIntValue6 = numC2.intValue();
                                    y1Var.o(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        break;
                    case 8:
                        y1Var.j();
                        break;
                    case 9:
                        y1Var.h();
                        break;
                    case 10:
                        if (y1Var.f201549g.f157138b.length() > 0 && (q0Var = y1Var.f201545c) != null) {
                            int iF = y1Var.f(q0Var, -1);
                            y1Var.o(iF, iF);
                        }
                        break;
                    case 11:
                        if (y1Var.f201549g.f157138b.length() > 0 && (q0Var2 = y1Var.f201545c) != null) {
                            int iF2 = y1Var.f(q0Var2, 1);
                            y1Var.o(iF2, iF2);
                        }
                        break;
                    case 12:
                        if (y1Var.f201549g.f157138b.length() > 0 && (i3Var = y1Var.f201847i) != null) {
                            int iR = y1Var.r(i3Var, -1);
                            y1Var.o(iR, iR);
                        }
                        break;
                    case 13:
                        if (y1Var.f201549g.f157138b.length() > 0 && (i3Var2 = y1Var.f201847i) != null) {
                            int iR2 = y1Var.r(i3Var2, 1);
                            y1Var.o(iR2, iR2);
                        }
                        break;
                    case 14:
                        y1Var.m();
                        break;
                    case 15:
                        y1Var.l();
                        break;
                    case 16:
                        y1Var.f201547e.f201787a = null;
                        if (y1Var.f201549g.f157138b.length() > 0) {
                            if (!y1Var.e()) {
                                y1Var.l();
                            } else {
                                y1Var.m();
                            }
                        }
                        break;
                    case 17:
                        y1Var.f201547e.f201787a = null;
                        if (y1Var.f201549g.f157138b.length() > 0) {
                            if (!y1Var.e()) {
                                y1Var.m();
                            } else {
                                y1Var.l();
                            }
                        }
                        break;
                    case 18:
                        y1Var.f201547e.f201787a = null;
                        if (y1Var.f201549g.f157138b.length() > 0) {
                            y1Var.o(0, 0);
                        }
                        break;
                    case 19:
                        y1Var.f201547e.f201787a = null;
                        s5.c cVar6 = y1Var.f201549g;
                        if (cVar6.f157138b.length() > 0) {
                            int length = cVar6.f157138b.length();
                            y1Var.o(length, length);
                        }
                        break;
                    case 20:
                        List<x5.k> listQ = y1Var.q(new kn1.m(26));
                        if (listQ != null) {
                            x2Var.a(listQ);
                            Unit unit3 = Unit.INSTANCE;
                        }
                        break;
                    case 21:
                        List<x5.k> listQ2 = y1Var.q(new kn1.m(i16));
                        if (listQ2 != null) {
                            x2Var.a(listQ2);
                            Unit unit4 = Unit.INSTANCE;
                        }
                        break;
                    case 22:
                        List<x5.k> listQ3 = y1Var.q(new kn1.m(28));
                        if (listQ3 != null) {
                            x2Var.a(listQ3);
                            Unit unit5 = Unit.INSTANCE;
                        }
                        break;
                    case 23:
                        List<x5.k> listQ4 = y1Var.q(new kn1.m(29));
                        if (listQ4 != null) {
                            x2Var.a(listQ4);
                            Unit unit6 = Unit.INSTANCE;
                        }
                        break;
                    case 24:
                        List<x5.k> listQ5 = y1Var.q(new w2(i19));
                        if (listQ5 != null) {
                            x2Var.a(listQ5);
                            Unit unit7 = Unit.INSTANCE;
                        }
                        break;
                    case 25:
                        List<x5.k> listQ6 = y1Var.q(new w2(i24));
                        if (listQ6 != null) {
                            x2Var.a(listQ6);
                            Unit unit8 = Unit.INSTANCE;
                        }
                        break;
                    case 26:
                        if (x2Var.f108880e) {
                            m0Var4.f105804a = ((Boolean) x2Var.f108876a.f108414x.invoke(x5.p.a(x2Var.f108887l))).booleanValue();
                        } else {
                            x2Var.a(w.c(new x5.b("\n", 1)));
                        }
                        Unit unit9 = Unit.INSTANCE;
                        break;
                    case 27:
                        if (x2Var.f108880e) {
                            m0Var4.f105804a = false;
                        } else {
                            x2Var.a(w.c(new x5.b(SyslogAppender.DEFAULT_STACKTRACE_PATTERN, 1)));
                        }
                        Unit unit10 = Unit.INSTANCE;
                        break;
                    case 28:
                        y1Var.f201547e.f201787a = null;
                        s5.c cVar7 = y1Var.f201549g;
                        if (cVar7.f157138b.length() > 0) {
                            y1Var.o(0, cVar7.f157138b.length());
                        }
                        break;
                    case 29:
                        y1Var.g();
                        y1Var.n();
                        break;
                    case 30:
                        y1Var.k();
                        y1Var.n();
                        break;
                    case 31:
                        s2 s2Var3 = y1Var.f201547e;
                        s2Var3.f201787a = null;
                        s5.c cVar8 = y1Var.f201549g;
                        String str5 = cVar8.f157138b;
                        String str6 = cVar8.f157138b;
                        if (str5.length() > 0) {
                            if (y1Var.e()) {
                                s2Var3.f201787a = null;
                                if (str6.length() > 0 && (numD3 = y1Var.d()) != null) {
                                    int iIntValue7 = numD3.intValue();
                                    y1Var.o(iIntValue7, iIntValue7);
                                }
                            } else {
                                s2Var3.f201787a = null;
                                if (str6.length() > 0 && (numC3 = y1Var.c()) != null) {
                                    int iIntValue8 = numC3.intValue();
                                    y1Var.o(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        y1Var.n();
                        break;
                    case 32:
                        s2 s2Var4 = y1Var.f201547e;
                        s2Var4.f201787a = null;
                        s5.c cVar9 = y1Var.f201549g;
                        String str7 = cVar9.f157138b;
                        String str8 = cVar9.f157138b;
                        if (str7.length() > 0) {
                            if (y1Var.e()) {
                                s2Var4.f201787a = null;
                                if (str8.length() > 0 && (numC4 = y1Var.c()) != null) {
                                    int iIntValue9 = numC4.intValue();
                                    y1Var.o(iIntValue9, iIntValue9);
                                }
                            } else {
                                s2Var4.f201787a = null;
                                if (str8.length() > 0 && (numD4 = y1Var.d()) != null) {
                                    int iIntValue10 = numD4.intValue();
                                    y1Var.o(iIntValue10, iIntValue10);
                                }
                            }
                        }
                        y1Var.n();
                        break;
                    case 33:
                        y1Var.j();
                        y1Var.n();
                        break;
                    case 34:
                        y1Var.h();
                        y1Var.n();
                        break;
                    case 35:
                        y1Var.m();
                        y1Var.n();
                        break;
                    case 36:
                        y1Var.l();
                        y1Var.n();
                        break;
                    case 37:
                        y1Var.f201547e.f201787a = null;
                        if (y1Var.f201549g.f157138b.length() > 0) {
                            if (y1Var.e()) {
                                y1Var.m();
                            } else {
                                y1Var.l();
                            }
                        }
                        y1Var.n();
                        break;
                    case 38:
                        y1Var.f201547e.f201787a = null;
                        if (y1Var.f201549g.f157138b.length() > 0) {
                            if (y1Var.e()) {
                                y1Var.l();
                            } else {
                                y1Var.m();
                            }
                        }
                        y1Var.n();
                        break;
                    case 39:
                        if (y1Var.f201549g.f157138b.length() > 0 && (q0Var3 = y1Var.f201545c) != null) {
                            int iF3 = y1Var.f(q0Var3, -1);
                            y1Var.o(iF3, iF3);
                        }
                        y1Var.n();
                        break;
                    case 40:
                        if (y1Var.f201549g.f157138b.length() > 0 && (q0Var4 = y1Var.f201545c) != null) {
                            int iF4 = y1Var.f(q0Var4, 1);
                            y1Var.o(iF4, iF4);
                        }
                        y1Var.n();
                        break;
                    case 41:
                        if (y1Var.f201549g.f157138b.length() > 0 && (i3Var3 = y1Var.f201847i) != null) {
                            int iR3 = y1Var.r(i3Var3, -1);
                            y1Var.o(iR3, iR3);
                        }
                        y1Var.n();
                        break;
                    case 42:
                        if (y1Var.f201549g.f157138b.length() > 0 && (i3Var4 = y1Var.f201847i) != null) {
                            int iR4 = y1Var.r(i3Var4, 1);
                            y1Var.o(iR4, iR4);
                        }
                        y1Var.n();
                        break;
                    case 43:
                        y1Var.f201547e.f201787a = null;
                        if (y1Var.f201549g.f157138b.length() > 0) {
                            y1Var.o(0, 0);
                        }
                        y1Var.n();
                        break;
                    case 44:
                        y1Var.f201547e.f201787a = null;
                        s5.c cVar10 = y1Var.f201549g;
                        if (cVar10.f157138b.length() > 0) {
                            int length2 = cVar10.f157138b.length();
                            y1Var.o(length2, length2);
                        }
                        y1Var.n();
                        break;
                    case 45:
                        y1Var.f201547e.f201787a = null;
                        if (y1Var.f201549g.f157138b.length() > 0) {
                            long j19 = y1Var.f201548f;
                            w0.a aVar8 = w0.f157315b;
                            int i30 = (int) (j19 & 4294967295L);
                            y1Var.o(i30, i30);
                        }
                        break;
                    case 46:
                        s3 s3Var = x2Var.f108883h;
                        if (s3Var != null) {
                            s3Var.a(l0.b(y1Var.f201846h, y1Var.f201549g, y1Var.f201548f, 4));
                        }
                        s3 s3Var2 = x2Var.f108883h;
                        if (s3Var2 != null) {
                            s3.a aVar9 = s3Var2.f108785b;
                            if (aVar9 != null && (aVar = aVar9.f108790a) != null) {
                                s3Var2.f108785b = aVar;
                                s3Var2.f108787d -= aVar9.f108791b.f188878a.f157138b.length();
                                s3Var2.f108786c = new s3.a(s3Var2.f108786c, aVar9.f108791b);
                                l0Var2 = aVar.f108791b;
                            }
                            if (l0Var2 != null) {
                                x2Var.f108886k.invoke(l0Var2);
                                Unit unit11 = Unit.INSTANCE;
                            }
                        }
                        break;
                    case 47:
                        s3 s3Var3 = x2Var.f108883h;
                        if (s3Var3 != null) {
                            s3.a aVar10 = s3Var3.f108786c;
                            if (aVar10 != null) {
                                s3Var3.f108786c = aVar10.f108790a;
                                s3Var3.f108785b = new s3.a(s3Var3.f108785b, aVar10.f108791b);
                                s3Var3.f108787d = aVar10.f108791b.f188878a.f157138b.length() + s3Var3.f108787d;
                                l0Var = aVar10.f108791b;
                            }
                            if (l0Var != null) {
                                x2Var.f108886k.invoke(l0Var);
                                Unit unit12 = Unit.INSTANCE;
                            }
                        }
                        break;
                    case 48:
                    case 49:
                        Unit unit13 = Unit.INSTANCE;
                        break;
                    default:
                        u0.r();
                        return null;
                }
                return Unit.INSTANCE;
            case 16:
                n0 n0Var = (n0) obj3;
                a0 a0Var = new a0((e23.l) obj2, i17);
                n0Var.getF158016a().a(a0Var);
                return new l3.a((e23.a) r14, n0Var, a0Var);
            case 17:
                k11.h hVar2 = new k11.h(i15, (b0) obj2, (ij) r14);
                k23.l<Object>[] lVarArr = h0.f136016a;
                p5.p.f136057a.getClass();
                ((p5.k0) obj).a(p5.p.f136060d, new p5.a((String) obj3, hVar2));
                return Unit.INSTANCE;
            case 18:
                l3.s0 s0Var = (l3.s0) obj2;
                v1 v1Var = (v1) r14;
                v1.a aVar11 = (v1.a) obj;
                boolean zT1 = ((b1) obj3).t1();
                l3.m<T> mVar = s0Var.f109415a;
                float fC = zT1 ? mVar.e().c(s0Var.f109415a.f109326h.getF182175a()) : mVar.h();
                p008y1.b2 b2Var2 = s0Var.f109417c;
                float f15 = b2Var2 == p008y1.b2.Horizontal ? fC : 0.0f;
                if (b2Var2 != p008y1.b2.Vertical) {
                    fC = 0.0f;
                }
                aVar11.f69149a = true;
                aVar11.r(v1Var, MathKt.c(f15), MathKt.c(fC), 0.0f);
                Unit unit14 = Unit.INSTANCE;
                aVar11.f69149a = false;
                return Unit.INSTANCE;
            case 19:
                l3.t0 t0Var2 = (l3.t0) obj2;
                v1 v1Var2 = (v1) r14;
                v1.a aVar12 = (v1.a) obj;
                boolean zT2 = ((b1) obj3).t1();
                p008y1.r<T> rVar = t0Var2.f109420a;
                float fC2 = zT2 ? rVar.b().c(t0Var2.f109420a.f193587i.getF182175a()) : rVar.e();
                if (h5.k.g(t0Var2).B == g6.o.Rtl && t0Var2.f109422c == p008y1.b2.Horizontal) {
                    f14 = -1.0f;
                }
                p008y1.b2 b2Var3 = t0Var2.f109422c;
                float f16 = b2Var3 == p008y1.b2.Horizontal ? f14 * fC2 : 0.0f;
                if (b2Var3 != p008y1.b2.Vertical) {
                    fC2 = 0.0f;
                }
                aVar12.f69149a = true;
                aVar12.r(v1Var2, MathKt.c(f16), MathKt.c(fC2), 0.0f);
                Unit unit15 = Unit.INSTANCE;
                aVar12.f69149a = false;
                return Unit.INSTANCE;
            case 20:
                p1 p1Var2 = (p1) r14;
                n4.g gVar2 = (n4.g) obj;
                float fFloatValue = ((Number) ((x3) obj2).getF182175a()).floatValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar2.f123561a >> 32)) * fFloatValue;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (gVar2.f123561a & 4294967295L)) * fFloatValue;
                if (Float.intBitsToFloat((int) (((n4.g) p1Var2.getF182175a()).f123561a >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((n4.g) p1Var2.getF182175a()).f123561a & 4294967295L)) != fIntBitsToFloat2) {
                    p1Var2.setValue(n4.g.a((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)));
                }
                return Unit.INSTANCE;
            case 21:
                CreateCourseActivity createCourseActivity = (CreateCourseActivity) obj3;
                String str9 = (String) obj2;
                String str10 = (String) r14;
                GeoPointDTO geoPointDTO = (GeoPointDTO) obj;
                CreateCourseActivity.a aVar13 = CreateCourseActivity.f32989g;
                geoPointDTO.getClass();
                createCourseActivity.ea().y4();
                createCourseActivity.ea().x4();
                z zVarEa = createCourseActivity.ea();
                Double d14 = geoPointDTO.latitude;
                double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                Double d15 = geoPointDTO.longitude;
                LatLng latLng = new LatLng(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d);
                Double d16 = geoPointDTO.distance;
                zVarEa.getClass();
                str9.getClass();
                zVarEa.z4(new n30.c.a(str9, latLng, str10, true, d16));
                return Unit.INSTANCE;
            case 22:
                lc.m0 m0Var5 = (lc.m0) obj3;
                p51.c cVar11 = (p51.c) r14;
                k0 k0Var4 = (k0) obj;
                k0Var4.getClass();
                z3.e eVar3 = new z3.e(-1261450667, true, new ao1.f(i16, m0Var5, cVar11));
                p13.k0 k0Var5 = p13.k0.f134949a;
                k0Var5.getClass();
                j0 j0Var2 = j0.f134944a;
                t0 t0Var3 = s0.f105811a;
                nc.n.a(k0Var4, t0Var3.b(n51.b.f.class), k0Var5, j0Var2, null, null, null, null, eVar3);
                m0Var5.getClass();
                ge1.b.U(k0Var4, t0Var3.b(n51.b.l.class), n51.b.j.INSTANCE, k0Var5, new c42.o(m0Var5, i17));
                ge1.b.U(k0Var4, t0Var3.b(n51.b.k.class), new n51.b.C2324b((u41.a) d0Var, i24, (p005kotlin.jvm.internal.j) d0Var), k0Var5, new l3.p1(8, m0Var5, new l51.j(cVar11, (Context) obj2, i19)));
                return Unit.INSTANCE;
            case 23:
                e23.l lVar5 = (e23.l) obj3;
                b0 b0Var = (b0) obj2;
                i2.a aVar14 = (i2.a) r14;
                g0 g0Var = (g0) obj;
                g0Var.getClass();
                if (lVar5 != null) {
                    lVar5.invoke(g0Var);
                }
                if (g0Var.a()) {
                    ge1.b.T(b0Var, null, null, new o1(aVar14, null), 3);
                }
                return Unit.INSTANCE;
            case 24:
                zc.d dVar8 = (zc.d) obj3;
                f0 f0Var2 = (f0) obj;
                f0Var2.getClass();
                f0.f(f0Var2, dVar8.b(), new zc.a(new x(i17), dVar8), new z3.e(1959681254, true, new v(dVar8, (li0.f) r14, i18)), 4);
                if (s.g(((yc.s) obj2).f196387c, z0.b.f196664b)) {
                    li0.b.f112624a.getClass();
                    f0.b(f0Var2, null, li0.b.f112625b, 3);
                }
                return Unit.INSTANCE;
            case 25:
                return a(obj);
            case 26:
                return b(obj);
            case 27:
                return c(obj);
            case 28:
                return d(obj);
            default:
                TripFlightFragment tripFlightFragment = (TripFlightFragment) obj3;
                ms0.e eVar4 = (ms0.e) obj2;
                yr0.n nVar = (yr0.n) obj;
                int i34 = TripFlightFragment.f37039n;
                nVar.getClass();
                tripFlightFragment.w6().f114746c.f198995c = nVar.f199033a;
                tripFlightFragment.w6().f114746c.f198996d = nVar.f199034b;
                StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = eVar4.f120466b;
                styledInlineTextFieldViewDark.getClass();
                EditText editText = styledInlineTextFieldViewDark.editText;
                editText.getClass();
                editText.removeTextChangedListener((com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.d) r14);
                Unit unit16 = Unit.INSTANCE;
                StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = eVar4.f120466b;
                EditText editText2 = styledInlineTextFieldViewDark2.editText;
                editText2.clearFocus();
                v22.e.c(editText2, styledInlineTextFieldViewDark2);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ k(Object obj, int i14, Object obj2, Object obj3) {
        this.f103202a = i14;
        this.f103203b = obj;
        this.f103204c = obj2;
        this.f103205d = obj3;
    }
}
