package ot0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.model.o;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lot0/c;", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/o;", "category", "", "textResId", "<init>", "(Ljava/lang/String;ILcom/garmin/android/apps/connectmobile/leaderboard/model/o;I)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum c {
    ALL(null, R.string.common_all),
    HIKES(o.VIRTUAL_HIKE, R.string.lbl_hike_adventures),
    CLIMBS(o.VIRTUAL_CLIMB, R.string.lbl_climb_adventures);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f133724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f133725b;

    c(o oVar, int i14) {
        this.f133724a = oVar;
        this.f133725b = i14;
    }
}
