package mp;

import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmp/j;", "", "Lc22/c3;", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;ILc22/c3;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum j {
    MATCHES(c22.i.b(R.string.gaming_matches)),
    AVG_WIN_STRESS(c22.i.b(R.string.gaming_avg_win_stress)),
    AVG_LOSS_STRESS(c22.i.b(R.string.gaming_avg_loss_stress)),
    AVG_DRAW_STRESS(c22.i.b(R.string.gaming_avg_tie_stress)),
    PACK_CALORIE_DETAILS(c22.i.b(R.string.lbl_pack_calorie_details));


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f120006a;

    j(c3 c3Var) {
        this.f120006a = c3Var;
    }
}
