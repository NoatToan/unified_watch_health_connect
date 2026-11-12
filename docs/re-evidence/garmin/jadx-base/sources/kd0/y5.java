package kd0;

import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQAppStoreActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.strava.StravaLiveSufferScoreActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/y5;", "Lfr1/i;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y5 implements fr1.i {
    @Override // fr1.i
    public final void a(zf1.a aVar) {
        aVar.getClass();
        GCMSettingManager.f41536b.edit().putString(GCMSettingManager.f41535a.getString(R.string.key_segment_source_enum_name), aVar.name()).apply();
    }

    @Override // fr1.i
    public final void b(boolean z14) {
        com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_user_wants_live_track_strava_share, GCMSettingManager.f41536b.edit(), z14);
    }

    @Override // fr1.i
    public final Intent c(StravaLiveSufferScoreActivity stravaLiveSufferScoreActivity, String str) {
        Intent intent = new Intent(stravaLiveSufferScoreActivity, (Class<?>) ConnectIQAppStoreActivity.class);
        intent.putExtra("CONNECT_IQ_APP_ID", str);
        return intent;
    }

    @Override // fr1.i
    public final zf1.a d() {
        SharedPreferences sharedPreferences = GCMSettingManager.f41536b;
        String string = GCMSettingManager.f41535a.getString(R.string.key_segment_source_enum_name);
        zf1.a aVarValueOf = zf1.a.GARMIN;
        String string2 = sharedPreferences.getString(string, aVarValueOf.name());
        if (!TextUtils.isEmpty(string2)) {
            try {
                aVarValueOf = zf1.a.valueOf(string2);
            } catch (IllegalArgumentException unused) {
                aVarValueOf = zf1.a.GARMIN;
            }
        }
        aVarValueOf.getClass();
        return aVarValueOf;
    }

    @Override // fr1.i
    public final void e() {
        GCMSettingManager.f41536b.edit().remove(GCMSettingManager.f41535a.getString(R.string.key_user_wants_live_track_strava_share)).apply();
    }
}
