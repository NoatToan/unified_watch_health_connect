package com.facebook.bolts;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/facebook/bolts/AppLinks;", "", "Landroid/content/Intent;", "intent", "Landroid/os/Bundle;", "getAppLinkData", "getAppLinkExtras", "", "KEY_NAME_APPLINK_DATA", "Ljava/lang/String;", "KEY_NAME_EXTRAS", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AppLinks {

    @NotNull
    public static final AppLinks INSTANCE = new AppLinks();

    @NotNull
    public static final String KEY_NAME_APPLINK_DATA = "al_applink_data";

    @NotNull
    public static final String KEY_NAME_EXTRAS = "extras";

    private AppLinks() {
    }

    @JvmStatic
    @Nullable
    public static final Bundle getAppLinkData(@NotNull Intent intent) {
        return intent.getBundleExtra(KEY_NAME_APPLINK_DATA);
    }

    @JvmStatic
    @Nullable
    public static final Bundle getAppLinkExtras(@NotNull Intent intent) {
        Bundle appLinkData = getAppLinkData(intent);
        if (appLinkData != null) {
            return appLinkData.getBundle("extras");
        }
        return null;
    }
}
