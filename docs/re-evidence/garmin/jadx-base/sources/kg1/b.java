package kg1;

import android.content.SharedPreferences;
import com.garmin.android.library.mapsdkadapter.i;
import gg1.u0;
import kd0.j5;
import kg.f;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import w13.c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkg1/b;", "Lkg1/a;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements kg1.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f104704c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f104705b = m.b(new j5(this));

    static {
        new a(null);
    }

    @Override // kg1.a
    public final void A(boolean z14) {
        f.u(this, "dev_onboarding_date_override_enabled", z14);
    }

    @Override // kg1.a
    public final boolean B() {
        return U().getBoolean("dev_annual_report_force_allow_screenshot", false);
    }

    @Override // kg1.a
    public final void C(boolean z14) {
        f.u(this, "gcm_oauth2_for_sync_enabled", z14);
    }

    @Override // kg1.a
    public final boolean D() {
        return U().getBoolean("dev_movement_hr_enabled", false);
    }

    @Override // kg1.a
    public final int E() {
        return U().getInt("dev_min_version_system_bond", 24);
    }

    @Override // kg1.a
    public final void F(boolean z14) {
        f.u(this, "dev_new_livetrack_user", z14);
    }

    @Override // kg1.a
    public final void G(boolean z14) {
        f.u(this, "dev_mlr_logging", z14);
    }

    @Override // kg1.a
    public final boolean H() {
        return U().getBoolean("KEY_FORCE_BASIC_FLOW", false);
    }

    @Override // kg1.a
    public final void I(boolean z14) {
        f.u(this, "dev_show_test_devices", z14);
    }

    @Override // kg1.a
    public final boolean J() {
        return U().getBoolean("gcm_novice_cycling_enabled", false);
    }

    @Override // kg1.a
    public final boolean K() {
        return U().getBoolean("dev_workout_benefit_enabled", false);
    }

    @Override // kg1.a
    public final boolean L() {
        return U().getBoolean("dev_remote_config_dev_mode_enabled", false);
    }

    @Override // kg1.a
    public final void M(int i14) {
        SharedPreferences.Editor editorEdit = U().edit();
        editorEdit.putInt("dev_min_version_support_server", i14);
        editorEdit.apply();
    }

    @Override // kg1.a
    public final boolean N() {
        return U().getBoolean("pref_all_paired_devices_for_screenless_device_feature", false);
    }

    @Override // kg1.a
    public final boolean O() {
        return U().getBoolean("dev_onboarding_date_override_enabled", false);
    }

    @Override // kg1.a
    public final boolean P() {
        return U().getBoolean("dev_omt_demo_upload_config", false);
    }

    @Override // kg1.a
    public final Integer Q() {
        if (U().contains("dev_min_version_support_server")) {
            return Integer.valueOf(U().getInt("dev_min_version_support_server", 0));
        }
        return null;
    }

    @Override // kg1.a
    public final boolean R() {
        return U().getBoolean("dev_protobuf_logger", false);
    }

    @Override // kg1.a
    public final void S(int i14) {
        SharedPreferences.Editor editorEdit = U().edit();
        editorEdit.putInt("dev_min_version_system_bond", i14);
        editorEdit.apply();
    }

    @Override // kg1.a
    public final boolean T() {
        return U().getBoolean("dev_enable_sync_button", false);
    }

    public final SharedPreferences U() {
        return (SharedPreferences) this.f104705b.getValue();
    }

    @Override // kg1.a
    public final i.d a() {
        c cVar = i.d.f50295h;
        SharedPreferences sharedPreferencesU = U();
        i.d dVar = i.d.NULL;
        i.d dVar2 = (i.d) h0.e0(sharedPreferencesU.getInt("dev_map_provider", dVar.ordinal()), cVar);
        return dVar2 == null ? dVar : dVar2;
    }

    @Override // kg1.a
    public final void b(boolean z14) {
        f.u(this, "dev_http_events", z14);
    }

    @Override // kg1.a
    public final void c(boolean z14) {
        f.u(this, "dev_strict_memory_mode", z14);
    }

    @Override // kg1.a
    public final void d(boolean z14) {
        f.u(this, "dev_movement_hr_enabled", z14);
    }

    @Override // kg1.a
    public final boolean e() {
        return U().getBoolean("dev_mct_refactor_available", false);
    }

    @Override // kg1.a
    public final void f(boolean z14) {
        f.u(this, "dev_push_notification_toast", z14);
    }

    @Override // kg1.a
    public final boolean g() {
        return U().getBoolean("dev_mlr_logging", false);
    }

    @Override // kg1.a
    public final boolean h() {
        return U().getBoolean("dev_new_livetrack_user", false);
    }

    @Override // kg1.a
    public final boolean i() {
        return U().getBoolean("dev_push_notification_toast", false);
    }

    @Override // kg1.a
    public final u0 j() {
        u0.a aVar = u0.f77321d;
        String string = U().getString("dev_remote_config_env", "");
        String str = string != null ? string : "";
        aVar.getClass();
        for (u0 u0Var : u0.values()) {
            if (s.g(u0Var.f77328a, str)) {
                return u0Var;
            }
        }
        return null;
    }

    @Override // kg1.a
    public final void k(boolean z14) {
        f.u(this, "dev_remote_config_dev_mode_enabled", z14);
    }

    @Override // kg1.a
    public final void l(boolean z14) {
        f.u(this, "gcm_novice_cycling_enabled", z14);
    }

    @Override // kg1.a
    public final boolean m() {
        return U().getBoolean("dev_http_events", false);
    }

    @Override // kg1.a
    public final void n() {
        f.u(this, "dev_mimic_device_software_version", false);
    }

    @Override // kg1.a
    public final boolean o() {
        return U().getBoolean("gcm_oauth2_for_sync_enabled", true);
    }

    @Override // kg1.a
    public final void p(boolean z14) {
        f.u(this, "dev_workout_benefit_enabled", z14);
    }

    @Override // kg1.a
    public final void q(boolean z14) {
        f.u(this, "pref_all_paired_devices_for_screenless_device_feature", z14);
    }

    @Override // kg1.a
    public final void r(boolean z14) {
        f.u(this, "dev_mct_refactor_available", z14);
    }

    @Override // kg1.a
    public final void s(boolean z14) {
        f.u(this, "dev_annual_report_force_allow_screenshot", z14);
    }

    @Override // kg1.a
    public final void t(boolean z14) {
        f.u(this, "dev_enable_sync_button", z14);
    }

    @Override // kg1.a
    public final void u(u0 u0Var) {
        SharedPreferences.Editor editorEdit = U().edit();
        editorEdit.putString("dev_remote_config_env", u0Var.f77328a);
        editorEdit.apply();
    }

    @Override // kg1.a
    public final void v(boolean z14) {
        f.u(this, "dev_omt_demo_upload_config", z14);
    }

    @Override // kg1.a
    public final void w(boolean z14) {
        f.u(this, "KEY_FORCE_BASIC_FLOW", z14);
    }

    @Override // kg1.a
    public final boolean x() {
        return U().getBoolean("dev_mimic_device_software_version", false);
    }

    @Override // kg1.a
    public final void y(boolean z14) {
        f.u(this, "dev_protobuf_logger", z14);
    }

    @Override // kg1.a
    public final void z(i.d dVar) {
        dVar.getClass();
        SharedPreferences.Editor editorEdit = U().edit();
        editorEdit.putInt("dev_map_provider", dVar.ordinal());
        editorEdit.apply();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006¨\u0006 "}, d2 = {"Lkg1/b$a;", "", "<init>", "()V", "", "DEVELOPER_PREFS", "Ljava/lang/String;", "DEV_LEAK_CANARY", "DEV_MIMIC_DEVICE_SW_VERSION", "DEV_ENABLE_SYNC_BUTTON", "DEV_SHOW_TEST_DEVICES", "DEV_MIN_VERSION_SUPPORT_SERVER", "DEV_STRICT_MEMORY_MODE", "DEV_PUSH_NOTIFICATION_TOAST", "DEV_OMT_DEMO_UPLOAD_CONFIG", "DEV_NEW_LIVETRACK_USER", "DEV_MIN_VERSION_SYSTEM_BOND", "DEV_REMOTE_CONFIG_ENV", "DEV_REMOTE_CONFIG_DEV_MODE_ENABLED", "DEV_HTTP_EVENTS", "DEV_MLR_LOGGING", "DEV_PROTOBUF_LOGGER", "DEV_MAP_PROVIDER", "DEV_WORKOUT_BENEFIT_ENABLED", "KEY_OAUTH2_FOR_SYNC_ENABLED", "KEY_ONBOARDING_DATE_OVERRIDE_ENABLED", "DEV_ANNUAL_REPORT_FORCE_ALLOW_SCREENSHOT", "KEY_NOVICE_CYCLING_ENABLED", "DEV_MCT_REFACTOR_AVAILABLE", "PREF_ALL_PAIRED_DEVICES_FOR_SCREENLESS_DEVICE_FEATURE", "KEY_FORCE_BASIC_FLOW", "DEV_PREVIEW_MOVEMENT_HR_CHART_ENABLED", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
