package qr;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsActivity;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityDetailsActivity f146102b;

    public /* synthetic */ b(ActivityDetailsActivity activityDetailsActivity, int i14) {
        this.f146101a = i14;
        this.f146102b = activityDetailsActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        nr.h hVar;
        Bundle extras;
        Parcelable parcelable;
        int i14 = this.f146101a;
        ActivityDetailsActivity activityDetailsActivity = this.f146102b;
        switch (i14) {
            case 0:
                ActivityDetailsActivity.da(activityDetailsActivity);
                return Boolean.TRUE;
            case 1:
                return Boolean.valueOf(ActivityDetailsActivity.ca(activityDetailsActivity));
            default:
                int i15 = ActivityDetailsActivity.f29967g;
                Intent intent = activityDetailsActivity.getIntent();
                if (intent == null || (extras = intent.getExtras()) == null) {
                    hVar = new nr.h(-1L, am.x0.f4346x, null, false, false, false, 60, null);
                } else {
                    String string = extras.getString("GCM_extra_activity_type");
                    long j8 = extras.getLong("GCM_extra_activity_id");
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = (Parcelable) extras.getParcelable("GCM_extra_activity_metadata", ActivityListItemDTO.class);
                    } else {
                        Parcelable parcelable2 = extras.getParcelable("GCM_extra_activity_metadata");
                        if (!(parcelable2 instanceof ActivityListItemDTO)) {
                            parcelable2 = null;
                        }
                        parcelable = (ActivityListItemDTO) parcelable2;
                    }
                    hVar = new nr.h(j8, am.z0.m(string), (ActivityListItemDTO) parcelable, extras.getBoolean("GCM_extra_activity_allow_activity_type_navigation", true), extras.getBoolean("GCM_extra_activity_allow_personal_record_banner", true), extras.getBoolean("GCM_extra_activity_allow_diving_app_redirection", false));
                }
                return ParametersHolderKt.parametersOf(hVar);
        }
    }
}
