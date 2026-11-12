package kd0;

import android.content.Context;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.SwingSensorProtobufRequestManager;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.gfdi.configuration.Configuration;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/y2;", "Lcl0/b;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y2 implements cl0.b {
    @Override // cl0.b
    public final void A(boolean z14) {
        com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_golf_swing_animation_slow_motion, GCMSettingManager.f41536b.edit(), z14);
    }

    @Override // cl0.b
    public final long B() {
        return GCMSettingManager.f41536b.getLong(GCMSettingManager.f41535a.getString(R.string.key_current_session_selected_club_id), -1L);
    }

    @Override // cl0.b
    public final boolean C() {
        return TextUtils.isEmpty(GCMSettingManager.u(R.string.key_golf_real_time_swing_compare_id_list));
    }

    @Override // cl0.b
    public final boolean D() {
        return TextUtils.isEmpty(GCMSettingManager.u(R.string.key_golf_historical_swing_compare_id_list));
    }

    @Override // cl0.b
    public final boolean E() {
        return GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_should_show_leave_connect_to_golf), true);
    }

    @Override // cl0.b
    public final void F(boolean z14) {
        com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_golf_swing_animation_loop, GCMSettingManager.f41536b.edit(), z14);
    }

    @Override // cl0.b
    public final boolean G() {
        return GCMSettingManager.f41536b.edit().remove(GCMSettingManager.f41535a.getString(R.string.key_golf_real_time_swing_compare_id_list)).commit() && GCMSettingManager.f41536b.edit().remove(GCMSettingManager.f41535a.getString(R.string.key_golf_historical_swing_compare_id_list)).commit();
    }

    @Override // cl0.b
    public final boolean H() {
        return GCMSettingManager.f41536b.edit().remove(GCMSettingManager.f41535a.getString(R.string.key_golf_historical_swing_compare_id_list)).commit();
    }

    @Override // cl0.b
    public final boolean I() {
        return GCMSettingManager.f41536b.edit().remove(GCMSettingManager.f41535a.getString(R.string.key_golf_real_time_swing_compare_id_list)).commit();
    }

    @Override // cl0.b
    public final void J(androidx.fragment.app.m mVar, long j8, com.garmin.android.apps.connectmobile.golf.truswing.b bVar) {
        mVar.getClass();
        SwingSensorProtobufRequestManager.setActiveClub(mVar, j8, bVar);
    }

    @Override // cl0.b
    public final boolean a(long j8) {
        return hk0.p.k(j8);
    }

    @Override // cl0.b
    public final String d(long j8) {
        return c22.u1.a(j8);
    }

    @Override // cl0.b
    public final boolean e(sd2.f fVar) {
        return hk0.p.m(fVar);
    }

    @Override // cl0.b
    public final String f(sd2.f fVar) {
        return zb0.t.d(fVar);
    }

    @Override // cl0.b
    public final boolean g() {
        return GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_golf_swing_animation_slow_motion), false);
    }

    @Override // cl0.b
    public final cl0.d h() {
        return GCMSettingManager.l();
    }

    @Override // cl0.b
    public final boolean i(int i14, long j8) {
        return km2.a.i(j8, null, i14);
    }

    @Override // cl0.b
    public final boolean j() {
        Iterator it = hk0.p.d().iterator();
        while (it.hasNext()) {
            Configuration configuration = ((DeviceProfile) it.next()).getConfiguration();
            configuration.getClass();
            if (yc.l2.q(SupportedCapability.SWING_SENSOR, configuration.getCapabilityFlagsAsSet())) {
                return true;
            }
        }
        return false;
    }

    @Override // cl0.b
    public final String k(String str) {
        HashMap mapG = GCMSettingManager.g();
        if (str == null || !mapG.keySet().contains(str)) {
            return null;
        }
        return (String) mapG.get(str);
    }

    @Override // cl0.b
    public final ArrayList l() {
        return GCMSettingManager.e(R.string.key_golf_real_time_swing_compare_id_list);
    }

    @Override // cl0.b
    public final boolean m(long j8) {
        return GCMSettingManager.a(R.string.key_golf_real_time_swing_compare_id_list, j8);
    }

    @Override // cl0.b
    public final void n(int i14) {
        com.airbnb.lottie.animation.keyframe.a.p(GCMSettingManager.f41535a, R.string.key_swing_animation_height, GCMSettingManager.f41536b.edit(), i14);
    }

    @Override // cl0.b
    public final boolean o(String str) {
        str.getClass();
        return zb0.u0.n(str, zb0.u0.E5);
    }

    @Override // cl0.b
    public final boolean p() {
        return GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_golf_swing_animation_loop), false);
    }

    @Override // cl0.b
    public final long q() {
        for (DeviceProfile deviceProfile : hk0.p.d()) {
            Configuration configuration = deviceProfile.getConfiguration();
            configuration.getClass();
            if (yc.l2.q(SupportedCapability.SWING_SENSOR, configuration.getCapabilityFlagsAsSet())) {
                return deviceProfile.getF92746j();
            }
        }
        return -1L;
    }

    @Override // cl0.b
    public final void r(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            GCMSettingManager.A(str);
            return;
        }
        HashMap mapG = GCMSettingManager.g();
        mapG.put(str, str2);
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry entry : mapG.entrySet()) {
            sb3.append((String) entry.getKey());
            sb3.append(",");
            sb3.append((String) entry.getValue());
        }
        GCMSettingManager.f41536b.edit().putString(GCMSettingManager.f41535a.getString(R.string.key_swing_session_note), sb3.toString()).apply();
    }

    @Override // cl0.b
    public final void s(Context context, long j8, wl0.e eVar) {
        context.getClass();
        eVar.getClass();
        SwingSensorProtobufRequestManager.getGolfClubList(context, j8, eVar);
    }

    @Override // cl0.b
    public final void t(long j8) {
        GCMSettingManager.f41536b.edit().putLong(GCMSettingManager.f41535a.getString(R.string.key_current_session_selected_club_id), j8).apply();
    }

    @Override // cl0.b
    public final boolean u(long j8) {
        return GCMSettingManager.a(R.string.key_golf_historical_swing_compare_id_list, j8);
    }

    @Override // cl0.b
    public final boolean v() {
        Iterator it = hk0.p.d().iterator();
        while (it.hasNext()) {
            Configuration configuration = ((DeviceProfile) it.next()).getConfiguration();
            configuration.getClass();
            if (yc.l2.q(SupportedCapability.SWING_SENSOR_REMOTE, configuration.getCapabilityFlagsAsSet())) {
                return true;
            }
        }
        return false;
    }

    @Override // cl0.b
    public final void w(String str) {
        GCMSettingManager.A(str);
    }

    @Override // cl0.b
    public final int x() {
        return GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_swing_animation_height), -1);
    }

    @Override // cl0.b
    public final ArrayList y() {
        return GCMSettingManager.e(R.string.key_golf_historical_swing_compare_id_list);
    }

    @Override // cl0.b
    public final void z() {
        com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_should_show_leave_connect_to_golf, GCMSettingManager.f41536b.edit(), false);
    }
}
