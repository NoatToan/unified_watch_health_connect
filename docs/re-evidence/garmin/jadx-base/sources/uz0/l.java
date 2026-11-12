package uz0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Luz0/l;", "", "", "jsonString", "", "displayResID", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum l {
    /* JADX INFO: Fake field, exist only in values array */
    RUN_COACH("Running", R.string.garmin_run_coach),
    /* JADX INFO: Fake field, exist only in values array */
    CYCLING_COACH("Cycling", R.string.garmin_cycling_coach),
    /* JADX INFO: Fake field, exist only in values array */
    FITNESS_COACH("Generic", R.string.garmin_fitness_coach),
    /* JADX INFO: Fake field, exist only in values array */
    TRIATHLON_COACH("Triathlon", R.string.garmin_triathlon_coach);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f173587b;

    l(String str, int i14) {
        this.f173586a = str;
        this.f173587b = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF173587b() {
        return this.f173587b;
    }
}
