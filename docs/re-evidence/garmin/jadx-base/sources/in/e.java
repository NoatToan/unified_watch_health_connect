package in;

import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lin/e;", "", "", "titleResId", "Lc22/c3;", "onDemandTitleResId", "<init>", "(Ljava/lang/String;IILc22/c3;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum e {
    ACTIVITY_IN_PROGRESS(R.string.lbl_activity_in_progress, null, 2, null),
    RECORD_ACTIVITY(R.string.lbl_record_activity, null, 2, null),
    CREATE_MANUAL_ACTIVITY(R.string.lbl_create_manual_activities, null, 2, null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f94413b;

    /* synthetic */ e(int i14, c3 c3Var, int i15, j jVar) {
        this((i15 & 1) != 0 ? 0 : i14, (i15 & 2) != 0 ? null : c3Var);
    }

    e(int i14, c3 c3Var) {
        this.f94412a = i14;
        this.f94413b = c3Var;
    }
}
