package p42;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsActivity;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp42/a;", "Lce0/a;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements ce0.a {
    @Override // ce0.a
    public final void a(Context context, DateTime dateTime) {
        context.getClass();
        Intent intentZ = dh.b.z(WeightReportsActivity.class, context, dateTime, false);
        intentZ.putExtra("EXTRA_SHOW_INDEX_S2_WHATS_NEW", true);
        context.startActivity(intentZ);
    }
}
