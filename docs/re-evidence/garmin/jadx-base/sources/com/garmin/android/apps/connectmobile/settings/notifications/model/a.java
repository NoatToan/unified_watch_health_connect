package com.garmin.android.apps.connectmobile.settings.notifications.model;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/notifications/model/a;", "", "Lcom/garmin/android/apps/connectmobile/settings/notifications/model/NotificationPreferencesDTO;", "notificationPreferencesDTO", "Lrl0/a;", "emailWeeklySummaryPreference", "emailMonthlySummaryPreference", "<init>", "(Lcom/garmin/android/apps/connectmobile/settings/notifications/model/NotificationPreferencesDTO;Lrl0/a;Lrl0/a;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NotificationPreferencesDTO f43659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rl0.a f43660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rl0.a f43661c;

    static {
        new C0809a(null);
    }

    public /* synthetic */ a(NotificationPreferencesDTO notificationPreferencesDTO, rl0.a aVar, rl0.a aVar2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : notificationPreferencesDTO, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? null : aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class.equals(obj.getClass())) {
            a aVar = (a) obj;
            if (s.g(this.f43659a, aVar.f43659a) && s.g(this.f43660b, aVar.f43660b) && s.g(this.f43661c, aVar.f43661c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        NotificationPreferencesDTO notificationPreferencesDTO = this.f43659a;
        int iHashCode = (notificationPreferencesDTO == null ? 0 : notificationPreferencesDTO.hashCode()) * 31;
        rl0.a aVar = this.f43660b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        rl0.a aVar2 = this.f43661c;
        return iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationPreferencesWrapper(notificationPreferencesDTO=" + this.f43659a + ", emailWeeklySummaryPreference=" + this.f43660b + ", emailMonthlySummaryPreference=" + this.f43661c + ")";
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.notifications.model.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/notifications/model/a$a;", "", "<init>", "()V", "", "KEY_ALLOW_EMAIL_WEEKLY_SUMMARY", "Ljava/lang/String;", "KEY_ALLOW_EMAIL_MONTHLY_SUMMARY", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0809a {
        public /* synthetic */ C0809a(j jVar) {
            this();
        }

        private C0809a() {
        }
    }

    public a(NotificationPreferencesDTO notificationPreferencesDTO, rl0.a aVar, rl0.a aVar2) {
        this.f43659a = notificationPreferencesDTO;
        this.f43660b = aVar;
        this.f43661c = aVar2;
    }

    public a() {
        this(null, null, null, 7, null);
    }
}
