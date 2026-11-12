package am;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lam/f;", "Lam/e;", "Lf12/l;", "prefs", "<init>", "(Lf12/l;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.l f3932a;

    static {
        new a(null);
    }

    public f(f12.l lVar) {
        lVar.getClass();
        this.f3932a = lVar;
    }

    @Override // am.e
    public final void a(boolean z14) {
        this.f3932a.O2("keyShowActivityLaps", z14);
    }

    @Override // am.e
    public final void b() {
        this.f3932a.O2("key_activity_change_color_tip", false);
    }

    @Override // am.e
    public final void c() {
        this.f3932a.O2("key_activity_muscle_map_tip", false);
    }

    @Override // am.e
    public final boolean d() {
        return this.f3932a.W2("key_activity_share_tip", true);
    }

    @Override // am.e
    public final boolean e() {
        return this.f3932a.W2("keyShowActivityLaps", false);
    }

    @Override // am.e
    public final void f(boolean z14) {
        this.f3932a.O2("keyShowActivityObstacles", z14);
    }

    @Override // am.e
    public final boolean g() {
        return this.f3932a.W2("key_show_ciq_promotion_banner", true);
    }

    @Override // am.e
    public final void h(String str) {
        this.f3932a.S("key_start_date_power_curve", str);
    }

    @Override // am.e
    public final void i() {
        this.f3932a.O2("key_activity_share_tip", false);
    }

    @Override // am.e
    public final void j(String str) {
        this.f3932a.S("key_end_date_power_curve", str);
    }

    @Override // am.e
    public final boolean k() {
        return this.f3932a.W2("key_activity_muscle_map_tip", true);
    }

    @Override // am.e
    public final void l() {
        this.f3932a.O2("key_activity_upload_a_photo_tip", false);
    }

    @Override // am.e
    public final boolean m(long j8, String str) {
        return this.f3932a.W2(v.h.u(j8, "keyDismissEventBanner_", "_", str), false);
    }

    @Override // am.e
    public final boolean n() {
        return this.f3932a.W2("keyShowActivityObstacles", false);
    }

    @Override // am.e
    public final void o() {
        this.f3932a.O2("key_show_ciq_promotion_banner", false);
    }

    @Override // am.e
    public final void p(long j8, String str) {
        this.f3932a.O2(v.h.u(j8, "keyDismissEventBanner_", "_", str), true);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Lam/f$a;", "", "<init>", "()V", "", "USER_ADD_PILATES_HINT", "Ljava/lang/String;", "USER_ACTIVITY_CHART_DISPLAY_COUNT", "USER_ACTIVITY_CHART_TIP_FLAGS", "USER_ACTIVITY_MUSCLE_MAP_TIP", "USER_ACTIVITY_SHARE_TIP", "USER_SHOW_MAP_ACTIVITY_LAPS", "USER_SHOW_MAP_ACTIVITY_OBSTACLES", "USER_LINKED_EVENT_BANNER", "USER_ACTIVITY_CHANGE_COLOR_TIP", "USER_ACTIVITY_UPLOAD_A_PHOTO_TIP", "USER_SHOW_CIQ_PROMOTION_BANNER", "START_DATE_POWER_CURVE", "END_DATE_POWER_CURVE", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
