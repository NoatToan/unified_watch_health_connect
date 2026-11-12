package com.garmin.android.apps.connectmobile.connectiq;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;

/* JADX INFO: loaded from: classes7.dex */
public enum l {
    APPS("watch-app", R.string.device_settings_activities_apps, R.string.help_app, R.string.connect_iq_get_more_applications),
    WIDGETS("widget", R.string.connect_iq_widgets, R.string.connect_iq_widget, R.string.connect_iq_get_more_widgets),
    WATCH_FACES("watchface", R.string.connect_iq_watch_faces, R.string.connect_iq_watch_face, R.string.connect_iq_get_more_watch_faces),
    DATA_FIELDS("datafield", R.string.connect_iq_data_fields, R.string.connect_iq_data_field, R.string.connect_iq_get_more_data_fields),
    MUSIC_PROVIDER("audio-content-provider-app", R.string.device_screen_music, R.string.device_screen_music, R.string.connect_iq_get_more_music_apps),
    UNKNOWN(PrivacyUpdateRequestError.UNKNOWN, R.string.unknown, R.string.unknown, R.string.unknown);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31896c;

    l(String str, int i14, int i15, int i16) {
        this.f31894a = str;
        this.f31895b = i15;
        this.f31896c = i16;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f31894a;
    }
}
