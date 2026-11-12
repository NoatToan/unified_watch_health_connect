package qo;

import am.h;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsActivity;
import com.garmin.android.library.mapsdkadapter.i;
import de0.b;
import f12.l;
import g22.n;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqo/a;", "Lde0/b;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements b {
    @Override // de0.b
    public final void a(Context context, Long l14, String str) {
        context.getClass();
        if (l14 == null || l14.longValue() <= 0 || !n.d(str)) {
            return;
        }
        l.f68084a.getClass();
        l.a.a().D(str, i.d.MAPBOX);
        l.a.a().s(str, true);
        Intent intent = new Intent(context, (Class<?>) ActivityDetailsActivity.class);
        Bundle bundle = new Bundle();
        bundle.putLong("GCM_extra_activity_id", l14.longValue());
        bundle.putString("GCM_extra_activity_type", str);
        bundle.putInt("GCM_extra_activity_open_mode", h.VIEW_EDIT.ordinal());
        bundle.putBoolean("GCM_extra_activity_allow_activity_type_navigation", true);
        bundle.putBoolean("GCM_extra_activity_allow_diving_app_redirection", false);
        intent.setFlags(536870912);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
}
