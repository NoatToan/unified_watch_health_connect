package vk1;

import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BE\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvk1/e;", "", "Lc22/c3;", "mStrResZonesLabel", "", "mStrResAdvancedTrainingMsg", "mStrResRemoveTitle", "mStrResRemoveMsg", "mStrResResetTitle", "mIconRes", "<init>", "(Ljava/lang/String;ILc22/c3;IIIII)V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum e {
    DEFAULT(null, -1, -1, -1, R.string.hr_zones_title_reset_generic, R.drawable.health_stats),
    RUNNING(c22.i.b(R.string.hr_zones_lbl_zones_running), R.string.hr_zones_msg_advanced_training_sport_running, R.string.hr_zones_title_remove_zones_confirm_running, R.string.hr_zones_msg_remove_zones_confirm_running, R.string.hr_zones_title_reset_sport_running, R.drawable.run),
    CYCLING(c22.i.b(R.string.hr_zones_lbl_zones_cycling), R.string.hr_zones_msg_advanced_training_sport_cycling, R.string.hr_zones_title_remove_zones_confirm_cycling, R.string.hr_zones_msg_remove_zones_confirm_cycling, R.string.hr_zones_title_reset_sport_cycling, R.drawable.bike),
    SWIMMING(c22.i.b(R.string.hr_zones_lbl_zones_swimming), R.string.hr_zones_msg_advanced_training_sport_swimming, R.string.hr_zones_title_remove_zones_confirm_swimming, R.string.hr_zones_msg_remove_zones_confirm_swimming, R.string.hr_zones_title_reset_sport_swimming, R.drawable.swim_pool),
    CROSS_COUNTRY_SKIING(c22.i.b(R.string.sport_type_cross_country_skiing), -1, -1, -1, -1, -1),
    ROWING(c22.i.b(R.string.hr_zones_lbl_zones_rowing), -1, -1, -1, -1, -1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f178605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f178606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f178607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f178608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f178609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f178610f;

    e(c3 c3Var, int i14, int i15, int i16, int i17, int i18) {
        this.f178605a = c3Var;
        this.f178606b = i14;
        this.f178607c = i15;
        this.f178608d = i16;
        this.f178609e = i17;
        this.f178610f = i18;
    }
}
