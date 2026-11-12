package jd0;

import am.f0;
import am.g2;
import am.z0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListActivity;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.activities.photos.ViewImageActivity;
import com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsActivity;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgeDetailsActivity;
import com.garmin.android.apps.connectmobile.badges.redesign.ConnectionBadgeDetailsActivity;
import com.garmin.android.apps.connectmobile.courses.create.CourseTypeActivity;
import com.garmin.android.apps.connectmobile.devices.TroubleConnectingActivity;
import com.garmin.android.apps.connectmobile.devices.targetedselection.TDSActivity;
import com.garmin.android.apps.connectmobile.dogs.presentation.AllDogsActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity;
import com.garmin.android.apps.connectmobile.performance.stats.TrainingEffectDetailActivity;
import com.garmin.android.apps.connectmobile.personalrecords.presentation.activity.PersonalRecordsActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.setup.presentation.RecordActivitySettingsActivity;
import com.garmin.android.apps.connectmobile.social.share.ShareImageActivity;
import com.garmin.android.apps.connectmobile.social.share.UCropImageActivity;
import com.garmin.android.apps.connectmobile.solarcharge.EdgeSolarChargeChartActivity;
import com.garmin.android.apps.connectmobile.trails.presentation.UserTrailReviewsActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.framework.datamanagement.datasource.CacheDatabase;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import dm.t0;
import im.d0;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import lc.u0;
import okhttp3.OkHttpClient;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p3.o0;
import p3.p2;
import p3.x1;
import ps.a2;
import ro1.g0;
import zb0.g1;
import zb0.x0;
import zo1.f1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljd0/a;", "Lam/d;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements am.d {

    /* JADX INFO: renamed from: jd0.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1884a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98329a;

        static {
            int[] iArr = new int[am.g.values().length];
            try {
                iArr[am.g.f3950n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[am.g.f3946j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[am.g.f3945i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[am.g.f3947k.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[am.g.f3948l.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[am.g.f3953q.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[am.g.f3952p.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f98329a = iArr;
        }
    }

    @Override // am.d
    public final Object A(String str, long j8, f0 f0Var) {
        return ((zu.k) KoinJavaComponent.get$default(zu.k.class, null, null, 6, null)).a(str, String.valueOf(j8), f0Var);
    }

    @Override // am.d
    public final Intent B(androidx.fragment.app.m mVar) {
        fd0.d dVar = fd0.d.ACTIVITY_TO_COURSE;
        GCMSettingManager.J(dVar, null, -1L);
        TDSActivity.f34565f.getClass();
        Intent intent = new Intent(mVar, (Class<?>) TDSActivity.class);
        intent.putExtra("arg.module.type", dVar);
        intent.putExtra("arg.course.coordinate.system", com.garmin.android.library.mapsdkadapter.i.b.WGS84);
        return intent;
    }

    @Override // am.d
    public final Object C(long j8, long j14, boolean z14, boolean z15, v13.i iVar) {
        ez0.b bVar = ez0.b.f67468a;
        return new ss1.z((ps1.a) ez0.b.a(bVar, ez0.c.TRAILS, ps1.a.class, new c83.h.a[0], null, null, null, 120), (d60.a) ez0.b.a(bVar, ez0.c.GC, d60.a.class, new c83.h.a[0], null, null, null, 120)).a(j8, j14, z14, z15, iVar);
    }

    @Override // am.d
    public final String D(Context context) {
        g0.f153957a.getClass();
        return g0.d(context);
    }

    @Override // am.d
    public final void E(ViewImageActivity viewImageActivity, ps.q qVar, String str) {
        qVar.getClass();
        str.getClass();
        ShareImageActivity.f44607f.getClass();
        Intent intent = new Intent(viewImageActivity, (Class<?>) ShareImageActivity.class);
        intent.putExtra("activity_stats_brief", qVar);
        intent.putExtra("imageUrl", str);
        intent.putExtra("ratio", (String) null);
        viewImageActivity.startActivity(intent);
    }

    @Override // am.d
    public final boolean F(String str) {
        x0 x0Var;
        x0.a aVar = x0.f203871b;
        x0[] x0VarArr = {x0.RUNNING_DYNAMICS_POD};
        aVar.getClass();
        return (str == null || str.length() == 0 || (x0Var = (x0) x0.f203872c.get(str)) == null || !p005kotlin.jvm.internal.s.g(x0VarArr[0].f203875a, x0Var.f203875a)) ? false : true;
    }

    @Override // am.d
    public final void G(Context context, sn.h hVar) {
        context.getClass();
        hVar.getClass();
        new pa2.b();
        bz0.o.f22274a.getClass();
        OkHttpClient okHttpClientB = bz0.o.b();
        DateTime dateTimeT = hVar.t();
        Date date = dateTimeT != null ? new Date(dateTimeT.withZoneRetainFields(DateTimeZone.UTC).getMillis()) : null;
        DateTime dateTimeJ = hVar.j();
        Date date2 = dateTimeJ != null ? new Date(dateTimeJ.withZoneRetainFields(DateTimeZone.UTC).getMillis()) : null;
        String strB = new wn.c(context).b(hVar);
        String strK = ((zy0.l) KoinJavaComponent.get$default(zy0.l.class, null, null, 6, null)).k(ez0.c.GC);
        String strC = hVar.C();
        wa2.a.f183799a.getClass();
        rn.c cVar = new rn.c(strC, null, null, null, wa2.a.C3407a.d(), 14, null);
        String strD = d53.u.q(Locale.getDefault().getLanguage(), Locale.SIMPLIFIED_CHINESE.getLanguage(), true) ? hb2.h.d(Locale.getDefault()) : Locale.getDefault().getLanguage();
        strD.getClass();
        pa2.b.a(context, new pa2.a(strB, "wellnessactivity", strK, okHttpClientB, R.layout.er_loading_view, true, strD, date, date2, d53.u.v(d53.u.v(new d53.k("[<>:\"\\\\/|?*-]").f("Garmin_".concat(strB), ""), "  ", StringUtils.SPACE, false), StringUtils.SPACE, "_", false), cVar, context.getString(R.string.lbl_feature_pdf, strB)));
    }

    @Override // am.d
    public final void H(androidx.fragment.app.m mVar, am.x0 x0Var, long j8, List list) {
        CourseTypeActivity.f32753j.getClass();
        Intent intent = new Intent(mVar, (Class<?>) CourseTypeActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("GCM_extra_activity_type", x0Var);
        bundle.putLong("GCM_extra_activity_id", j8);
        if (list != null) {
            bundle.putParcelableArrayList("GCM_extra_activity_splits", new ArrayList<>(list));
        }
        l2.f37135b.getClass();
        l2.a.b().a(intent, bundle);
        mVar.startActivity(intent);
    }

    @Override // am.d
    public final String I(Context context, am.x0 x0Var, String str) {
        String string;
        x0Var.getClass();
        str.getClass();
        g0.f153957a.getClass();
        if (x0Var != am.x0.f4346x) {
            string = context.getString(R.string.social_activity_sharing_message, hb.a.i(dh.b.A(context, x0Var.f4360c)));
            string.getClass();
        } else {
            string = context.getString(R.string.social_activity_sharing_general_message);
            string.getClass();
        }
        return j20.x.d(string, StringUtils.SPACE, context.getString(R.string.beat_yesterday_hashtag), "\n", g0.a(str));
    }

    @Override // am.d
    public final boolean J() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return gh2.i.f77458c.a().f77477b.c("garmin_trek_setup_enabled");
    }

    @Override // am.d
    public final String K(l22.b bVar, long j8, com.garmin.android.apps.connectmobile.repcounting.model.f fVar) {
        z91.a.f203130a.getClass();
        return z91.a.d(bVar, j8, fVar);
    }

    @Override // am.d
    public final Intent L(Context context) {
        GearActivity.f35500b.getClass();
        return GearActivity.a.a(context);
    }

    @Override // am.d
    public final j M() {
        return new j();
    }

    @Override // am.d
    public final boolean N() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return gh2.i.f77458c.a().f77477b.c("workout_execution_metrics");
    }

    @Override // am.d
    public final o13.l O(ActivityDetailsActivity activityDetailsActivity) {
        return o13.m.a(o13.n.NONE, new b(activityDetailsActivity, null, null, null));
    }

    @Override // am.d
    public final String P(String str) {
        str.getClass();
        g0.f153957a.getClass();
        return g0.a(str);
    }

    @Override // am.d
    public final cp0.b Q() {
        return new cp0.b((com.garmin.android.apps.connectmobile.dashboard.data.datasource.o) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.dashboard.data.datasource.o.class, null, null, 6, null));
    }

    @Override // am.d
    public final void R(androidx.fragment.app.m mVar, Intent intent) {
        intent.getClass();
        g0.f153957a.getClass();
        g0.g(mVar, intent);
    }

    @Override // am.d
    public final l S() {
        return l.f98350a;
    }

    @Override // am.d
    public final am.x0 T() throws IOException {
        am.x0 x0VarI = GCMSettingManager.i();
        boolean zL0 = k1.f37122a.l0();
        com.garmin.android.apps.connectmobile.i.f36758a.getClass();
        to.o oVarB = com.garmin.android.apps.connectmobile.i.b(x0VarI);
        if (oVarB != null ? oVarB.getRestricted() : false) {
            return zL0 ? am.x0.f4271b3 : am.x0.f4308n;
        }
        return GCMSettingManager.i();
    }

    @Override // am.d
    public final Intent U(androidx.fragment.app.m mVar, Uri uri, int i14, int i15) {
        uri.getClass();
        return UCropImageActivity.a.a(UCropImageActivity.f44623o, mVar, uri, i14, i15, null, null, 0.0f, PsExtractor.VIDEO_STREAM_MASK);
    }

    @Override // am.d
    public final void V(Context context, Long l14, String str) {
        EventDetailsActivity.a.d(EventDetailsActivity.f45692o, context, l14, str);
    }

    @Override // am.d
    public final void W(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        g0.f153957a.getClass();
        g0.f(context, intent);
    }

    @Override // am.d
    public final void X(double d14, String str) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Double.toString(d14));
        sb3.append(StringUtils.SPACE);
        if (str != null) {
            sb3.append(str);
        }
        GCMSettingManager.f41536b.edit().putString(GCMSettingManager.f41535a.getString(R.string.key_last_manual_activity_pool_length), sb3.toString()).apply();
    }

    @Override // am.d
    public final am.f Y() {
        return new am.f((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null));
    }

    @Override // am.d
    public final ok0.b Z() {
        return new ok0.b();
    }

    @Override // am.d
    public final Object a0(t0.a aVar) {
        yf1.b.f196866b.getClass();
        yf1.b bVarA = yf1.b.a.a();
        return com.garmin.android.apps.connectmobile.f0.J(bVarA, new yf1.e(bVarA, null), aVar);
    }

    @Override // am.d
    public final void b(Context context) {
        context.getClass();
        context.startActivity(new Intent(context, (Class<?>) TroubleConnectingActivity.class));
    }

    @Override // am.d
    public final void b0(Context context, int i14, String str) {
        str.getClass();
        ConnectionBadgeDetailsActivity.f30365i.getClass();
        context.startActivity(ConnectionBadgeDetailsActivity.a.a(context, i14, str));
    }

    @Override // am.d
    public final long c(String str, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<com.garmin.android.apps.connectmobile.courses.model.e> interfaceC0995b) {
        str.getClass();
        interfaceC0995b.getClass();
        t20.h.f161777b.getClass();
        return t20.h.a.a().c(str, interfaceC0995b);
    }

    @Override // am.d
    public final void c0(am.x0 x0Var) {
        if (x0Var == null) {
            bv.b.f21240b.getClass();
            x0Var = k1.f37122a.l0() ? am.x0.f4271b3 : am.x0.f4308n;
        }
        GCMSettingManager.f41536b.edit().putString(GCMSettingManager.f41535a.getString(R.string.key_last_manual_activity_type), x0Var.f4358a).apply();
    }

    @Override // am.d
    public final Intent d(Context context, String str, String str2, String str3) {
        context.getClass();
        str.getClass();
        UserProfileActivity.f46494x.getClass();
        return UserProfileActivity.a.b(context, str, str2, str3);
    }

    @Override // am.d
    public final void d0(Context context, String str) {
        str.getClass();
        MultiDayActivitiesDetailActivity.f39233a.getClass();
        MultiDayActivitiesDetailActivity.a.b(context, str);
    }

    @Override // am.d
    public final Intent e(Context context, long j8) {
        AllDogsActivity.f34686g.getClass();
        Intent intentPutExtra = new Intent(context, (Class<?>) AllDogsActivity.class).putExtra("extra_start_at_dog_profile", true).putExtra("extra_dog_id", j8);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // am.d
    public final void e0(long j8) {
        CacheDatabase.i().e().a(j8);
    }

    @Override // am.d
    public final Intent f(Context context, Long l14) {
        Intent intent = new Intent(context, (Class<?>) UserTrailReviewsActivity.class);
        intent.putExtra("reviewId", l14);
        return intent;
    }

    @Override // am.d
    public final String f0(Context context) {
        k42.b.f102880a.getClass();
        return k42.b.q(context);
    }

    @Override // am.d
    public final boolean g(String str) {
        if (str != null) {
            return str.equals("garminMobileAndroid") || str.equals("garminMobileiOS") || str.equals(GCMSettingManager.k().a().concat("/"));
        }
        return false;
    }

    @Override // am.d
    public final String g0() {
        String string = GCMSettingManager.f41536b.getString(GCMSettingManager.f41535a.getString(R.string.key_last_manual_activity_pool_length), null);
        if (string != null) {
            return string;
        }
        g2 g2Var = ((f12.l) KoinJavaComponent.get(f12.l.class)).y() ? g2.f3977f : g2.f3976e;
        double d14 = g2Var.f3984c;
        return Double.toString(d14) + StringUtils.SPACE + g2Var.f3985d;
    }

    @Override // am.d
    public final long h() {
        return GCMSettingManager.r(fd0.d.ACTIVITY_TO_COURSE, null);
    }

    @Override // am.d
    public final Intent h0(Context context, b63.o oVar, i53.c<c80.a> cVar, long j8, am.x0 x0Var) {
        oVar.getClass();
        cVar.getClass();
        x0Var.getClass();
        ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
        for (c80.a aVar : cVar) {
            String str = aVar.f25286a;
            if (str == null) {
                str = "";
            }
            c80.u.Companion companion = c80.u.INSTANCE;
            String str2 = aVar.f25287b;
            companion.getClass();
            c80.u uVarA = c80.u.Companion.a(str2);
            String str3 = "";
            String str4 = aVar.f25288c;
            String str5 = aVar.f25289d;
            if (str5 != null) {
                str3 = str5;
            }
            arrayList.add(new uk0.a(str, uVarA, str4, str3, aVar.f25290e));
        }
        i53.c cVarE = i53.a.e(arrayList);
        GearActivity.f35500b.getClass();
        cVarE.getClass();
        Intent intent = new Intent(context, (Class<?>) GearActivity.class);
        intent.putExtra("StartDestinationKey", new GearRoute.k(j8, oVar, cVarE, x0Var));
        return intent;
    }

    @Override // am.d
    public final com.garmin.android.apps.connectmobile.repcounting.model.c i() {
        return GCMSettingManager.n();
    }

    @Override // am.d
    public final Intent i0(Context context, String str) {
        zo1.z.f206495h.getClass();
        Bundle bundleD = str != null ? b71.i.d("KEY_GROUP_RIDE_UUID", str) : null;
        HelpActivity.a aVar = HelpActivity.f36653a;
        ro0.l lVar = ro0.l.SOCIAL_GROUP_RIDE;
        aVar.getClass();
        return HelpActivity.a.a(context, lVar, null, bundleD);
    }

    @Override // am.d
    public final void j(int i14, Context context) {
        BadgeDetailsActivity.f30322l.getClass();
        context.startActivity(BadgeDetailsActivity.a.a(i14, context));
    }

    @Override // am.d
    public final Intent j0(Context context) {
        context.getClass();
        AllDogsActivity.f34686g.getClass();
        Intent intentPutExtra = new Intent(context, (Class<?>) AllDogsActivity.class).putExtra("extra_start_at_add_dog", true);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // am.d
    public final Intent k(Activity activity) {
        activity.getClass();
        fd0.d dVar = fd0.d.TRAILS;
        GCMSettingManager.J(dVar, null, -1L);
        TDSActivity.f34565f.getClass();
        Intent intent = new Intent(activity, (Class<?>) TDSActivity.class);
        intent.putExtra("arg.module.type", dVar);
        intent.putExtra("arg.course.coordinate.system", com.garmin.android.library.mapsdkadapter.i.b.WGS84);
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // am.d
    public final Object k0(Long l14, Integer num, v13.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f98344c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f98344c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj = dVar.f98342a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f98344c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        fl1.c cVar2 = (fl1.c) KoinJavaComponent.get$default(fl1.c.class, null, null, 6, null);
        dVar.f98344c = 1;
        Serializable serializableA = cVar2.a(l14, num, dVar);
        return serializableA == aVar ? aVar : serializableA;
    }

    @Override // am.d
    public final String l() {
        return c22.b0.c();
    }

    @Override // am.d
    public final Intent l0(Context context, am.g gVar) {
        q91.g gVar2;
        gVar.getClass();
        PersonalRecordsActivity.a aVar = PersonalRecordsActivity.f40337b;
        switch (C1884a.f98329a[gVar.ordinal()]) {
            case 1:
                gVar2 = q91.g.RUNNING;
                break;
            case 2:
                gVar2 = q91.g.CYCLING;
                break;
            case 3:
                gVar2 = q91.g.STEPS;
                break;
            case 4:
                gVar2 = q91.g.SWIMMING;
                break;
            case 5:
                gVar2 = q91.g.PARASPORTS;
                break;
            case 6:
            case 7:
                gVar2 = q91.g.TRAINING;
                break;
            default:
                gVar2 = q91.g.RUNNING;
                break;
        }
        return PersonalRecordsActivity.a.b(aVar, context, gVar2, null, null, 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // am.d
    public final Object m(DateTime dateTime, boolean z14, v13.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f98340c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f98340c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objJ = cVar2.f98338a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f98340c;
        if (i15 == 0) {
            o13.r.b(objJ);
            LocalDate localDate = dateTime.toLocalDate();
            localDate.getClass();
            b63.o oVarT = g22.k.t(localDate);
            m42.b bVarB = m42.b.a.b(m42.b.f116608a);
            cVar2.f98340c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVarB, new m42.g(oVarT, z14, null), cVar2);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            return new v2.b(((l42.h) bVar.f47386a).getWeight(), bVar.f47387b, null, null, 12, null);
        }
        if (v2Var instanceof v2.a) {
            return new v2.a(((v2.a) v2Var).f47383a, null, null, 6, null);
        }
        u0.r();
        return null;
    }

    @Override // am.d
    public final Object m0(long j8, qr.y yVar) {
        av.g gVar = (av.g) KoinJavaComponent.get$default(av.g.class, null, null, 6, null);
        com.garmin.android.apps.connectmobile.badges.service.model.n nVar = new com.garmin.android.apps.connectmobile.badges.service.model.n(32, j8);
        gVar.getClass();
        return com.garmin.android.apps.connectmobile.f0.J(gVar, new av.h(gVar, nVar, null), yVar);
    }

    @Override // am.d
    public final void n(ActivitiesListActivity activitiesListActivity) {
        yr1.a aVar = yr1.a.f199058a;
        synchronized (yr1.a.class) {
            yr1.a.b(activitiesListActivity, 13);
        }
    }

    @Override // am.d
    public final void n0(nr.g.t tVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(-600004464);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(tVar) : o0VarE.r(tVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            yo1.j jVar = tVar.f127133a;
            String str = tVar.f127137e;
            List<ps.x1> list = tVar.f127134b;
            Long l14 = tVar.f127138f;
            String str2 = tVar.f127139g;
            ActivityDetailChartDTO activityDetailChartDTO = tVar.f127135c;
            yo1.f fVar = tVar.f127136d;
            boolean z14 = tVar.f127140h;
            a2 a2Var = tVar.f127141i;
            o0Var = o0VarE;
            f1.f(jVar, str, list, l14, str2, activityDetailChartDTO, fVar, z14, a2Var != null ? a2Var.getFullName() : null, tVar.f127142j, tVar.f127143k, tVar.f127144l, tVar.f127145m, o0Var, yo1.j.f198503j | (yo1.f.f198451e << 18));
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(this, tVar, i14, 10);
        }
    }

    @Override // am.d
    public final void o(androidx.fragment.app.m mVar, long j8, long j14, long j15, long j16) {
        EdgeSolarChargeChartActivity.f44767b.getClass();
        if (mVar != null) {
            Intent intent = new Intent(mVar, (Class<?>) EdgeSolarChargeChartActivity.class);
            intent.putExtra("GCM_deviceUnitID", j8);
            intent.putExtra("GCM_extra_start_date", j14);
            intent.putExtra("GCM_extra_end_date", j15);
            intent.putExtra("extra_ride_time_gained", j16);
            mVar.startActivity(intent);
        }
    }

    @Override // am.d
    public final void o0(com.garmin.android.apps.connectmobile.repcounting.model.d dVar) {
        com.garmin.android.apps.connectmobile.repcounting.model.c cVarN = GCMSettingManager.n();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, cVarN.F());
        if (!arrayList.contains(dVar)) {
            arrayList.add(0, dVar);
        }
        cVarN.I((com.garmin.android.apps.connectmobile.repcounting.model.d[]) arrayList.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[arrayList.size()]));
        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArrF = cVarN.F();
        cVarN.I((com.garmin.android.apps.connectmobile.repcounting.model.d[]) Arrays.copyOf(dVarArrF, dVarArrF.length <= 50 ? dVarArrF.length : 50));
        GCMSettingManager.f41536b.edit().putString("STRENGTH_TRAINING_RECENT_EXERCISES", cVarN.M()).apply();
    }

    @Override // am.d
    public final cp0.a p() {
        return new cp0.a((l70.c) KoinJavaComponent.get$default(l70.c.class, null, null, 6, null), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.o) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.dashboard.data.datasource.o.class, null, null, 6, null));
    }

    @Override // am.d
    public final zb0.b0 p0(Context context, long j8) {
        context.getClass();
        g1.a(context).getClass();
        return g1.c(j8);
    }

    @Override // am.d
    public final void q(Context context, String str, d0 d0Var, d0 d0Var2) {
        TrainingEffectDetailActivity.f40000v.getClass();
        Intent intent = new Intent(context, (Class<?>) TrainingEffectDetailActivity.class);
        intent.putExtra("EXTRA_AEROBIC_TRAINING_EFFECT", d0Var2);
        intent.putExtra("EXTRA_ANAEROBIC_TRAINING_EFFECT", d0Var);
        intent.putExtra("EXTRA_TRAINING_EFFECT_LABEL", str);
        context.startActivity(intent);
    }

    @Override // am.d
    public final void r(Context context) {
        context.getClass();
        RecordActivitySettingsActivity.f44210b.getClass();
        context.startActivity(new Intent(context, (Class<?>) RecordActivitySettingsActivity.class));
    }

    @Override // am.d
    public final void s() {
        cw.l.b().getClass();
        String strName = f12.a.ROLE_FITNESS_USER.name();
        f12.l.f68084a.getClass();
        Set<String> setN = f12.l.a.a().N();
        if (TextUtils.isEmpty(strName) || !setN.contains(strName)) {
            return;
        }
        int i14 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_feedback_count), 0) + 1;
        com.airbnb.lottie.animation.keyframe.a.p(GCMSettingManager.f41535a, R.string.key_feedback_count, GCMSettingManager.f41536b.edit(), i14);
    }

    @Override // am.d
    public final String t() {
        g0.f153957a.getClass();
        return g0.c(true);
    }

    @Override // am.d
    public final void u(Activity activity, am.g gVar) {
        q91.g gVar2;
        gVar.getClass();
        PersonalRecordsActivity.a aVar = PersonalRecordsActivity.f40337b;
        switch (C1884a.f98329a[gVar.ordinal()]) {
            case 1:
                gVar2 = q91.g.RUNNING;
                break;
            case 2:
                gVar2 = q91.g.CYCLING;
                break;
            case 3:
                gVar2 = q91.g.STEPS;
                break;
            case 4:
                gVar2 = q91.g.SWIMMING;
                break;
            case 5:
                gVar2 = q91.g.PARASPORTS;
                break;
            case 6:
            case 7:
                gVar2 = q91.g.TRAINING;
                break;
            default:
                gVar2 = q91.g.RUNNING;
                break;
        }
        aVar.getClass();
        activity.startActivityForResult(PersonalRecordsActivity.a.a(activity, gVar2, null, null), 0);
    }

    @Override // am.d
    public final Intent v(Context context, am.x0 x0Var, Long l14) {
        String str;
        q91.g gVar;
        PersonalRecordsActivity.a aVar = PersonalRecordsActivity.f40337b;
        if (x0Var == null || (str = x0Var.f4358a) == null) {
            str = "";
        }
        z0 z0Var = z0.f4390a;
        if (z0.b(am.x0.f4312o, str)) {
            gVar = q91.g.CYCLING;
        } else if (z0.b(am.x0.f4324r, str)) {
            gVar = q91.g.SWIMMING;
        } else if (z0.b(am.x0.f4308n, str)) {
            gVar = q91.g.RUNNING;
        } else if (z0.b(am.x0.f4316p, str)) {
            gVar = q91.g.TRAINING;
        } else {
            gVar = z0.b(am.x0.f4268a3, str) ? q91.g.PARASPORTS : q91.g.RUNNING;
        }
        return PersonalRecordsActivity.a.b(aVar, context, gVar, null, l14, 4);
    }

    @Override // am.d
    public final Intent w(Context context, long j8, Long l14, Long l15, Integer num, Long l16) {
        Intent intent = new Intent("android.intent.action.VIEW");
        ot1.u uVar = ot1.u.f133824a;
        Long lValueOf = Long.valueOf(j8);
        uVar.getClass();
        intent.setData(Uri.parse(ot1.u.e(lValueOf, l14, l15, num, l16)));
        return intent;
    }

    @Override // am.d
    public final String x() {
        GarminConnectMobileApp.f28685g.getClass();
        Context contextA = GarminConnectMobileApp.a.a();
        try {
            return "Garmin Connect Mobile Android " + contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e4) {
            i2.i("AndroidDeviceUtil", e4.getMessage());
            return null;
        }
    }

    @Override // am.d
    public final Intent y(Context context, q91.d dVar) {
        dVar.getClass();
        return PersonalRecordsActivity.a.b(PersonalRecordsActivity.f40337b, context, null, dVar, null, 10);
    }

    @Override // am.d
    public final Object z(long j8, po.h.b bVar) {
        return am.m.b(am.m.a.a(am.m.f4066e, 7), j8, bVar);
    }
}
