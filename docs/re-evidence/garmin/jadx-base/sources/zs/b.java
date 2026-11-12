package zs;

import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.activityrecording.presentation.ActivityRecordingActivity;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityRecordingActivity f206783b;

    public /* synthetic */ b(ActivityRecordingActivity activityRecordingActivity, int i14) {
        this.f206782a = i14;
        this.f206783b = activityRecordingActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        Bundle extras;
        Bundle extras2;
        Bundle extras3;
        int i14 = this.f206782a;
        ActivityRecordingActivity activityRecordingActivity = this.f206783b;
        switch (i14) {
            case 0:
                ActivityRecordingActivity.a aVar = ActivityRecordingActivity.f30163b;
                Intent intent = activityRecordingActivity.getIntent();
                String string = null;
                Long lValueOf = (intent == null || (extras3 = intent.getExtras()) == null) ? null : Long.valueOf(extras3.getLong("GCM_deviceUnitID", -1L));
                Intent intent2 = activityRecordingActivity.getIntent();
                String string2 = (intent2 == null || (extras2 = intent2.getExtras()) == null) ? null : extras2.getString("GCM_deviceName", "");
                Intent intent3 = activityRecordingActivity.getIntent();
                if (intent3 != null && (extras = intent3.getExtras()) != null) {
                    string = extras.getString("GCM_extra_device_image_url", null);
                }
                return ParametersHolderKt.parametersOf(lValueOf, string2, string);
            default:
                ActivityRecordingActivity.a aVar2 = ActivityRecordingActivity.f30163b;
                activityRecordingActivity.onBackPressed();
                return Unit.INSTANCE;
        }
    }
}
