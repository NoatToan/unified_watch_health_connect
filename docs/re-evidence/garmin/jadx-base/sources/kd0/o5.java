package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.SQLException;
import android.preference.PreferenceManager;
import android.util.Pair;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.targetedselection.TDSActivity;
import com.garmin.android.apps.connectmobile.segments.SegmentsFilterDTO;
import com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO;
import com.garmin.android.apps.connectmobile.segments.model.StravaStatusDTO;
import com.garmin.android.apps.connectmobile.segments.presentation.ExploreSegmentsFilterActivity;
import com.garmin.android.apps.connectmobile.segments.presentation.MySegmentsActivity;
import com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.SegmentLeaderboardFilterActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.strava.StravaConfigActivity;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkd0/o5;", "Lag1/a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o5 implements ag1.a {

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"kd0/o5$b", "Llm2/i$b;", "Ljava/lang/Void;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements lm2.i.b<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ xf1.g f104270a;

        public b(xf1.g gVar) {
            this.f104270a = gVar;
        }

        @Override // lm2.i.b
        public final void a(Void r14) {
            xf1.g gVar = this.f104270a;
            if (gVar != null) {
                xf1.g.a[] aVarArr = xf1.g.a.f190684a;
                gVar.a();
            }
        }

        @Override // lm2.i.b
        public final void onFailure(Throwable th3) {
            th3.getClass();
            if (this.f104270a != null) {
                lj0.b bVar = lj0.b.f112950d;
            }
        }
    }

    static {
        new a(null);
    }

    @Override // ag1.a
    public final void a(ExploreSegmentsFilterActivity exploreSegmentsFilterActivity, SegmentsFilterDTO segmentsFilterDTO) {
        try {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(exploreSegmentsFilterActivity).edit();
            String string = exploreSegmentsFilterActivity.getString(R.string.key_segments_explore_filter);
            segmentsFilterDTO.getClass();
            JSONObject jSONObjectB = segmentsFilterDTO.b();
            jSONObjectB.put("isAdvancedOn", segmentsFilterDTO.f41204p);
            jSONObjectB.put("distanceGroupOrdinal", segmentsFilterDTO.f41201m.ordinal());
            jSONObjectB.put("avgGradeOrdinal", segmentsFilterDTO.f41202n.ordinal());
            String string2 = jSONObjectB.toString();
            string2.getClass();
            editorEdit.putString(string, string2).commit();
        } catch (JSONException e4) {
            com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            String str = "saveExploreSegmentsFilterInPrefs: " + e4.getMessage();
            aVar.getClass();
            com.garmin.android.apps.connectmobile.i2.a.e(a2Var, str);
        }
    }

    @Override // ag1.a
    public final void b(long j8, am.h hVar, Context context, String str) {
        hVar.getClass();
        aq.b bVar = new aq.b();
        bVar.f11823b = j8;
        bVar.f11824c = hVar;
        bVar.f11827f = str;
        context.startActivity(bVar.a(context));
    }

    @Override // ag1.a
    public final SegmentsFilterDTO c(com.garmin.android.apps.connectmobile.c cVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(cVar);
        try {
            SegmentsFilterDTO.c cVar2 = SegmentsFilterDTO.f41188q;
            String string = defaultSharedPreferences.getString(cVar.getString(R.string.key_segments_explore_filter), "");
            cVar2.getClass();
            return SegmentsFilterDTO.c.a(string);
        } catch (JSONException e4) {
            com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            String str = "getExploreSegmentsFilterFromPrefs: " + e4.getMessage();
            aVar.getClass();
            com.garmin.android.apps.connectmobile.i2.a.e(a2Var, str);
            return new SegmentsFilterDTO();
        }
    }

    @Override // ag1.a
    public final ArrayList d() {
        rd2.f.a().f152045a.getClass();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            cursorQuery = rd2.a.b().query(true, "devices", new String[]{"unit_id", "product_display_name"}, "unit_id is not null and is_segment_capable=1", new String[0], null, null, null, null);
            while (cursorQuery != null && cursorQuery.moveToNext()) {
                try {
                    arrayList.add(new Pair(Long.valueOf(Long.parseLong(cursorQuery.getString(0))), cursorQuery.getString(1)));
                } catch (NumberFormatException unused) {
                }
            }
        } catch (SQLException e4) {
            rd2.j.f152077a.error("allSegmentCapableDevices", (Throwable) e4);
        } finally {
            rd2.a.a(cursorQuery);
        }
        return arrayList;
    }

    @Override // ag1.a
    public final SegmentLeaderboardFilterDTO e(com.garmin.android.apps.connectmobile.c cVar) {
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(cVar);
            SegmentLeaderboardFilterDTO.c cVar2 = SegmentLeaderboardFilterDTO.f41285i;
            String string = defaultSharedPreferences.getString(cVar.getString(R.string.key_segments_leaderboard_filter), "");
            cVar2.getClass();
            return SegmentLeaderboardFilterDTO.c.a(string);
        } catch (JSONException e4) {
            com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            String str = "getUserSegmentsFilterFromPrefs: " + e4.getMessage();
            aVar.getClass();
            com.garmin.android.apps.connectmobile.i2.a.e(a2Var, str);
            return new SegmentLeaderboardFilterDTO("");
        }
    }

    @Override // ag1.a
    public final void f(SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity, SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO) {
        if (segmentLeaderboardFilterDTO != null) {
            try {
                PreferenceManager.getDefaultSharedPreferences(segmentLeaderboardFilterActivity).edit().putString(segmentLeaderboardFilterActivity.getString(R.string.key_segments_leaderboard_filter), segmentLeaderboardFilterDTO.b()).commit();
            } catch (JSONException e4) {
                com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                String str = "saveUserSegmentsFilterInPrefs: " + e4.getMessage();
                aVar.getClass();
                com.garmin.android.apps.connectmobile.i2.a.e(a2Var, str);
            }
        }
    }

    @Override // ag1.a
    public final void g() {
        qd2.a aVarB = qd2.a.b();
        if (aVarB != null) {
            aVarB.i(qd2.a.b.MY_SEGMENTS);
        }
    }

    @Override // ag1.a
    public final void h(StravaStatusDTO stravaStatusDTO, cg1.i iVar) {
        if (iVar != null) {
            cw.v.f55954b.getClass();
            cw.v vVarA = cw.v.a.a();
            if (vVarA != null) {
                vVarA.N(stravaStatusDTO, iVar);
            }
        }
    }

    @Override // ag1.a
    public final long i() {
        return GCMSettingManager.r(fd0.d.SEGMENTS, null);
    }

    @Override // ag1.a
    public final void j(Activity activity, String str, String str2, String str3) {
        if (activity == null || str == null) {
            return;
        }
        UserProfileActivity.f46494x.getClass();
        UserProfileActivity.a.c(activity, str, str2, str3);
    }

    @Override // ag1.a
    public final void k(Context context) {
        if (context != null) {
            androidx.room.a0.r(context, StravaConfigActivity.class);
        }
    }

    @Override // ag1.a
    public final void l(xf1.g gVar) {
        ed0.a.m("SegmentsConfiguration", new b(gVar));
    }

    @Override // ag1.a
    public final long m(MySegmentsActivity.b bVar) {
        if (bVar == null) {
            return -1L;
        }
        cw.v.f55954b.getClass();
        cw.v vVarA = cw.v.a.a();
        Long lValueOf = vVarA != null ? Long.valueOf(vVarA.M(false, bVar)) : null;
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return -1L;
    }

    @Override // ag1.a
    public final void n(com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, d80.b bVar) {
        am.b bVarM = am.b.M();
        bVarM.getClass();
        JSONObject jSONObjectA = lo.r3.a(hVar, hVar.C());
        if (jSONObjectA == null) {
            bVar.a(lj0.b.f112956j);
            return;
        }
        long j8 = hVar.f29448a;
        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var = hVar.f29460m;
        bVarM.N(j8, i0Var != null ? i0Var.f29492c : 0L, jSONObjectA.toString(), bVar);
    }

    @Override // ag1.a
    public final void o(com.garmin.android.apps.connectmobile.segments.presentation.a aVar, int i14) {
        TDSActivity.f34565f.getClass();
        Intent intent = new Intent(aVar, (Class<?>) TDSActivity.class);
        intent.putExtra("arg.module.type", fd0.d.SEGMENTS);
        aVar.startActivityForResult(intent, i14);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkd0/o5$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
