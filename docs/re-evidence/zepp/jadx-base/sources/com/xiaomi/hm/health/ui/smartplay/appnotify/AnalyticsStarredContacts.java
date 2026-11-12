package com.xiaomi.hm.health.ui.smartplay.appnotify;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.watch.util.Analytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006R\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/AnalyticsStarredContacts;", "", "", "recordEntrance", "recordAddContactClicked", "recordAddContactSucceed", "", "appName", "recordUsedStarredContactApps", "", "contactSize", "recordSingleAppStarredContactSize", "vibrationList", "recordSingleAppVibrationUsage", "a", "Ljava/lang/String;", "EVENT_ENTRANCE", "b", "EVENT_ADD_CONTACT_CLICKED", "c", "EVENT_ADD_CONTACT_SUCCEED", GoogleApiAvailabilityLight.a, "EVENT_APPS_USE_STARRED_CONTACTS", "e", "EVENT_APP_STARRED_CONTACTS_SIZE", "f", "EVENT_APP_VIBRATIONS", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AnalyticsStarredContacts {

    @NotNull
    public static final AnalyticsStarredContacts INSTANCE = new AnalyticsStarredContacts();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String EVENT_ENTRANCE = "STARREDCONTACT_ENTER";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String EVENT_ADD_CONTACT_CLICKED = "STARREDCONTACT_ADD";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String EVENT_ADD_CONTACT_SUCCEED = "STARREDCONTACT_ADD_SUC";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String EVENT_APPS_USE_STARRED_CONTACTS = "STARREDCONTACT_APP";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String EVENT_APP_STARRED_CONTACTS_SIZE = "STARREDCONTACT_CONTACT";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String EVENT_APP_VIBRATIONS = "STARREDCONTACT_VIBRATE";

    private AnalyticsStarredContacts() {
    }

    public final void recordAddContactClicked() {
        Analytics.event(DeviceXFunctionsKt.getContext(), EVENT_ADD_CONTACT_CLICKED);
    }

    public final void recordAddContactSucceed() {
        Analytics.event(DeviceXFunctionsKt.getContext(), EVENT_ADD_CONTACT_SUCCEED);
    }

    public final void recordEntrance() {
        Analytics.event(DeviceXFunctionsKt.getContext(), EVENT_ENTRANCE);
    }

    public final void recordSingleAppStarredContactSize(@NotNull String appName, int contactSize) {
        Analytics.event(DeviceXFunctionsKt.getContext(), EVENT_APP_STARRED_CONTACTS_SIZE, appName, String.valueOf(contactSize));
    }

    public final void recordSingleAppVibrationUsage(@NotNull String appName, @NotNull String vibrationList) {
        Analytics.event(DeviceXFunctionsKt.getContext(), EVENT_APP_VIBRATIONS, appName, vibrationList);
    }

    public final void recordUsedStarredContactApps(@NotNull String appName) {
        Analytics.event(DeviceXFunctionsKt.getContext(), EVENT_APPS_USE_STARRED_CONTACTS, appName);
    }
}
