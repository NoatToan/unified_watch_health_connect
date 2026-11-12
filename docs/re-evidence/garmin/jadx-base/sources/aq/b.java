package aq;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Laq/b;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActivityListItemDTO f11822a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11827f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11823b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public am.h f11824c = am.h.VIEW_EDIT;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11825d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11826e = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11828g = true;

    public final Intent a(Context context) {
        Intent intentB;
        if (context == null) {
            return b(context);
        }
        if (!am.z0.a(this.f11827f, hb2.g.b(context, hb2.g.a.GARMIN_DIVE)) || !this.f11828g || this.f11824c != am.h.VIEW_EDIT) {
            return b(context);
        }
        ActivityListItemDTO activityListItemDTO = this.f11822a;
        long j8 = activityListItemDTO != null ? activityListItemDTO.f29250b : this.f11823b;
        return (j8 == -1 || (intentB = new en.f(context, j8).b()) == null) ? b(context) : intentB;
    }

    public final Intent b(Context context) {
        if (context == null) {
            return new Intent();
        }
        Bundle bundle = new Bundle();
        ActivityListItemDTO activityListItemDTO = this.f11822a;
        if (activityListItemDTO != null) {
            bundle.putParcelable("GCM_extra_activity_metadata", activityListItemDTO);
            bundle.putLong("GCM_extra_activity_id", activityListItemDTO.f29250b);
        }
        long j8 = this.f11823b;
        if (j8 >= 0) {
            bundle.putLong("GCM_extra_activity_id", j8);
        }
        if (g22.n.d(this.f11827f)) {
            bundle.putString("GCM_extra_activity_type", this.f11827f);
        }
        bundle.putInt("GCM_extra_activity_open_mode", this.f11824c.ordinal());
        bundle.putBoolean("GCM_extra_activity_allow_activity_type_navigation", this.f11825d);
        bundle.putBoolean("GCM_extra_activity_allow_personal_record_banner", this.f11826e);
        bundle.putBoolean("GCM_extra_activity_allow_diving_app_redirection", this.f11828g && this.f11824c == am.h.VIEW_EDIT);
        Intent intent = new Intent(context, (Class<?>) ActivityDetailsActivity.class);
        intent.setFlags(536870912);
        intent.putExtras(bundle);
        return intent;
    }
}
