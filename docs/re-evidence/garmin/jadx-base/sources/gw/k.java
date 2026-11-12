package gw;

import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;

/* JADX INFO: loaded from: classes7.dex */
public class k extends com.garmin.android.library.backgroundtaskmanagement.e<UserSettingsDTO> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f79518m;

    public k(String str, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        this.f79518m = str;
        b(new jw.u(this, new com.google.android.exoplayer2.analytics.q(28, this, new com.google.android.exoplayer2.analytics.q(27, this, new j(this, 0)))));
        b(new jw.s(this));
    }

    public k(com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        this(null, aVar);
    }
}
