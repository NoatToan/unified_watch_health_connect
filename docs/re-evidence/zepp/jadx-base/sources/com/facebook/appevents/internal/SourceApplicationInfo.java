package com.facebook.appevents.internal;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import com.facebook.bolts.AppLinks;
import com.huami.device.feature.notification.statistics.NotificationEvent;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u001b\b\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/facebook/appevents/internal/SourceApplicationInfo;", "", "", "toString", "", "writeSourceApplicationInfoToDisk", "a", "Ljava/lang/String;", "getCallingApplicationPackage", "()Ljava/lang/String;", "callingApplicationPackage", "", "b", "Z", "isOpenedByAppLink", "()Z", "<init>", "(Ljava/lang/String;Z)V", "Companion", "Factory", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class SourceApplicationInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String c = "_fbSourceApplicationHasBeenSet";
    private static final String d = "com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage";
    private static final String e = "com.facebook.appevents.SourceApplicationInfo.openedByApplink";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final String callingApplicationPackage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isOpenedByAppLink;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/facebook/appevents/internal/SourceApplicationInfo$Companion;", "", "Lcom/facebook/appevents/internal/SourceApplicationInfo;", "getStoredSourceApplicatioInfo", "", "clearSavedSourceApplicationInfoFromDisk", "", "CALL_APPLICATION_PACKAGE_KEY", "Ljava/lang/String;", "OPENED_BY_APP_LINK_KEY", "SOURCE_APPLICATION_HAS_BEEN_SET_BY_THIS_INTENT", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final void clearSavedSourceApplicationInfoFromDisk() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
            editorEdit.remove(SourceApplicationInfo.d);
            editorEdit.remove(SourceApplicationInfo.e);
            editorEdit.apply();
        }

        @JvmStatic
        @Nullable
        public final SourceApplicationInfo getStoredSourceApplicatioInfo() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext());
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (defaultSharedPreferences.contains(SourceApplicationInfo.d)) {
                return new SourceApplicationInfo(defaultSharedPreferences.getString(SourceApplicationInfo.d, null), defaultSharedPreferences.getBoolean(SourceApplicationInfo.e, false), defaultConstructorMarker);
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/internal/SourceApplicationInfo$Factory;", "", "Landroid/app/Activity;", "activity", "Lcom/facebook/appevents/internal/SourceApplicationInfo;", "create", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Factory {

        @NotNull
        public static final Factory INSTANCE = new Factory();

        private Factory() {
        }

        @JvmStatic
        @Nullable
        public static final SourceApplicationInfo create(@NotNull Activity activity) {
            String string;
            ComponentName callingActivity = activity.getCallingActivity();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (callingActivity != null) {
                string = callingActivity.getPackageName();
                if (Intrinsics.areEqual(string, activity.getPackageName())) {
                    return null;
                }
            } else {
                string = "";
            }
            Intent intent = activity.getIntent();
            boolean z = false;
            if (intent != null && !intent.getBooleanExtra(SourceApplicationInfo.c, false)) {
                intent.putExtra(SourceApplicationInfo.c, true);
                Bundle appLinkData = AppLinks.getAppLinkData(intent);
                if (appLinkData != null) {
                    Bundle bundle = appLinkData.getBundle("referer_app_link");
                    if (bundle != null) {
                        string = bundle.getString(NotificationEvent.KEY_PACKAGE);
                    }
                    z = true;
                }
            }
            if (intent != null) {
                intent.putExtra(SourceApplicationInfo.c, true);
            }
            return new SourceApplicationInfo(string, z, defaultConstructorMarker);
        }
    }

    public /* synthetic */ SourceApplicationInfo(String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z);
    }

    @JvmStatic
    public static final void clearSavedSourceApplicationInfoFromDisk() {
        INSTANCE.clearSavedSourceApplicationInfoFromDisk();
    }

    @JvmStatic
    @Nullable
    public static final SourceApplicationInfo getStoredSourceApplicatioInfo() {
        return INSTANCE.getStoredSourceApplicatioInfo();
    }

    @Nullable
    public final String getCallingApplicationPackage() {
        return this.callingApplicationPackage;
    }

    /* JADX INFO: renamed from: isOpenedByAppLink, reason: from getter */
    public final boolean getIsOpenedByAppLink() {
        return this.isOpenedByAppLink;
    }

    @NotNull
    public String toString() {
        String str = this.isOpenedByAppLink ? "Applink" : "Unclassified";
        if (this.callingApplicationPackage == null) {
            return str;
        }
        return str + '(' + this.callingApplicationPackage + ')';
    }

    public final void writeSourceApplicationInfoToDisk() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
        editorEdit.putString(d, this.callingApplicationPackage);
        editorEdit.putBoolean(e, this.isOpenedByAppLink);
        editorEdit.apply();
    }

    private SourceApplicationInfo(String str, boolean z) {
        this.callingApplicationPackage = str;
        this.isOpenedByAppLink = z;
    }
}
