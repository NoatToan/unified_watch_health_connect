package nt1;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.trails.presentation.UserTrailReviewsActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnt1/b;", "Lg/a;", "", "", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends g.a<Long, Boolean> {
    @Override // g.a
    public final Intent a(Context context, Long l14) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) UserTrailReviewsActivity.class);
        intent.putExtra("reviewId", l14);
        return intent;
    }

    @Override // g.a
    public final Boolean c(int i14, Intent intent) {
        return Boolean.valueOf(i14 == -1);
    }
}
