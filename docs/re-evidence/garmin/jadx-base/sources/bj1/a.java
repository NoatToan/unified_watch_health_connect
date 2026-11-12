package bj1;

import c83.a0;
import com.garmin.android.apps.connectmobile.settings.notifications.model.NotificationPreferencesDTO;
import i83.f;
import i83.p;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lbj1/a;", "", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/settings/notifications/model/NotificationPreferencesDTO;", "a", "()Lo53/i0;", "notificationPrefs", "", "b", "(Lcom/garmin/android/apps/connectmobile/settings/notifications/model/NotificationPreferencesDTO;)Lo53/i0;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/notification-service/preference/userPreference")
    i0<a0<NotificationPreferencesDTO>> a();

    @p("/notification-service/preference/userPreference")
    i0<a0<Unit>> b(@i83.a NotificationPreferencesDTO notificationPrefs);
}
