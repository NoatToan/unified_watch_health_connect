package com.facebook.internal;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.FacebookSdkNotInitializedException;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b2\u00103J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J$\u0010\n\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J$\u0010\u000b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J \u0010\f\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J$\u0010\r\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u000e\u001a\u00020\u0005H\u0007J\u001a\u0010\u000f\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J9\u0010\u0012\u001a\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0010\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0005H\u0007J\b\u0010\u0015\u001a\u00020\u0003H\u0007J\b\u0010\u0016\u001a\u00020\u0003H\u0007J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0007J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007J\u0018\u0010!\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0003H\u0007J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0007J\u0018\u0010\"\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J\u001a\u0010$\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0007R\u0016\u0010(\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010,\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010'R\u0016\u0010.\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010'R\u0016\u00100\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010'R\u0016\u00101\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010'¨\u00064"}, d2 = {"Lcom/facebook/internal/Validate;", "", "arg", "", "name", "", "notNull", ExifInterface.GPS_DIRECTION_TRUE, "", "container", "notEmpty", "containsNoNulls", "containsNoNullOrEmpty", "notEmptyAndContainsNoNulls", "runningOnUiThread", "notNullOrEmpty", "", "values", "oneOf", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V", "sdkInitialized", "hasAppID", "hasClientToken", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "hasInternetPermissions", "", "shouldThrow", "hasWiFiPermission", "hasChangeWifiStatePermission", "hasLocationPermission", "hasBluetoothPermission", PointCategory.PERMISSION, "hasPermission", "hasFacebookActivity", "redirectURI", "hasCustomTabRedirectActivity", "hasContentProvider", "a", "Ljava/lang/String;", "TAG", "b", "NO_INTERNET_PERMISSION_REASON", "c", "FACEBOOK_ACTIVITY_NOT_FOUND_REASON", GoogleApiAvailabilityLight.a, "CONTENT_PROVIDER_NOT_FOUND_REASON", "e", "CONTENT_PROVIDER_BASE", "CUSTOM_TAB_REDIRECT_URI_PREFIX", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class Validate {

    @NotNull
    public static final String CUSTOM_TAB_REDIRECT_URI_PREFIX = "fbconnect://cct.";

    @NotNull
    public static final Validate INSTANCE = new Validate();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = Validate.class.getName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String NO_INTERNET_PERMISSION_REASON = "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String FACEBOOK_ACTIVITY_NOT_FOUND_REASON = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String CONTENT_PROVIDER_NOT_FOUND_REASON = "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final String CONTENT_PROVIDER_BASE = "com.facebook.app.FacebookContentProvider";

    private Validate() {
    }

    @JvmStatic
    public static final void containsNoNullOrEmpty(@NotNull Collection<String> container, @NotNull String name) {
        notNull(container, name);
        for (String str : container) {
            if (str == null) {
                throw new NullPointerException("Container '" + name + "' cannot contain null values");
            }
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException(("Container '" + name + "' cannot contain empty values").toString());
            }
        }
    }

    @JvmStatic
    public static final <T> void containsNoNulls(@NotNull Collection<? extends T> container, @NotNull String name) {
        notNull(container, name);
        Iterator<? extends T> it2 = container.iterator();
        while (it2.hasNext()) {
            if (it2.next() == null) {
                throw new NullPointerException("Container '" + name + "' cannot contain null values");
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final String hasAppID() {
        String applicationId = FacebookSdk.getApplicationId();
        if (applicationId != null) {
            return applicationId;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.".toString());
    }

    @JvmStatic
    public static final boolean hasBluetoothPermission(@NotNull Context context) {
        return hasPermission(context, "android.permission.BLUETOOTH") && hasPermission(context, "android.permission.BLUETOOTH_ADMIN");
    }

    @JvmStatic
    public static final boolean hasChangeWifiStatePermission(@NotNull Context context) {
        return hasPermission(context, "android.permission.CHANGE_WIFI_STATE");
    }

    @JvmStatic
    @NotNull
    public static final String hasClientToken() {
        String clientToken = FacebookSdk.getClientToken();
        if (clientToken != null) {
            return clientToken;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.".toString());
    }

    @JvmStatic
    public static final void hasContentProvider(@NotNull Context context) {
        notNull(context, DbUtils.Const.Table.CONTEXT);
        String strHasAppID = hasAppID();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            String str = CONTENT_PROVIDER_BASE + strHasAppID;
            if (packageManager.resolveContentProvider(str, 0) != null) {
                return;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            throw new IllegalStateException(String.format(CONTENT_PROVIDER_NOT_FOUND_REASON, Arrays.copyOf(new Object[]{str}, 1)).toString());
        }
    }

    @JvmStatic
    public static final boolean hasCustomTabRedirectActivity(@NotNull Context context, @Nullable String redirectURI) {
        List<ResolveInfo> listQueryIntentActivities;
        notNull(context, DbUtils.Const.Table.CONTEXT);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(redirectURI));
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        } else {
            listQueryIntentActivities = null;
        }
        if (listQueryIntentActivities == null) {
            return false;
        }
        Iterator<ResolveInfo> it2 = listQueryIntentActivities.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            ActivityInfo activityInfo = it2.next().activityInfo;
            if (!Intrinsics.areEqual(activityInfo.name, "com.facebook.CustomTabActivity") || !Intrinsics.areEqual(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    @JvmStatic
    public static final void hasFacebookActivity(@NotNull Context context) {
        hasFacebookActivity(context, true);
    }

    @JvmStatic
    public static final void hasInternetPermissions(@NotNull Context context) {
        hasInternetPermissions(context, true);
    }

    @JvmStatic
    public static final boolean hasLocationPermission(@NotNull Context context) {
        return hasPermission(context, "android.permission.ACCESS_COARSE_LOCATION") || hasPermission(context, "android.permission.ACCESS_FINE_LOCATION");
    }

    @JvmStatic
    public static final boolean hasPermission(@NotNull Context context, @NotNull String permission) {
        return context.checkCallingOrSelfPermission(permission) == 0;
    }

    @JvmStatic
    public static final boolean hasWiFiPermission(@NotNull Context context) {
        return hasPermission(context, "android.permission.ACCESS_WIFI_STATE");
    }

    @JvmStatic
    public static final <T> void notEmpty(@NotNull Collection<? extends T> container, @NotNull String name) {
        if (!container.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException(("Container '" + name + "' cannot be empty").toString());
    }

    @JvmStatic
    public static final <T> void notEmptyAndContainsNoNulls(@NotNull Collection<? extends T> container, @NotNull String name) {
        containsNoNulls(container, name);
        notEmpty(container, name);
    }

    @JvmStatic
    public static final void notNull(@Nullable Object arg, @NotNull String name) {
        if (arg != null) {
            return;
        }
        throw new NullPointerException("Argument '" + name + "' cannot be null");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010  */
    @JvmStatic
    @NotNull
    public static final String notNullOrEmpty(@Nullable String arg, @NotNull String name) {
        boolean z;
        if (arg != null) {
            z = arg.length() > 0;
        }
        if (z) {
            return arg;
        }
        throw new IllegalArgumentException(("Argument '" + name + "' cannot be null or empty").toString());
    }

    @JvmStatic
    public static final void oneOf(@Nullable Object arg, @NotNull String name, @NotNull Object... values) {
        for (Object obj : values) {
            if (Intrinsics.areEqual(obj, arg)) {
                return;
            }
        }
        throw new IllegalArgumentException("Argument '" + name + "' was not one of the allowed values");
    }

    @JvmStatic
    public static final void runningOnUiThread() {
        if (!Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            throw new FacebookException("This method should be called from the UI thread");
        }
    }

    @JvmStatic
    public static final void sdkInitialized() {
        if (!FacebookSdk.isInitialized()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    @JvmStatic
    @SuppressLint({"WrongConstant"})
    public static final void hasFacebookActivity(@NotNull Context context, boolean shouldThrow) {
        ActivityInfo activityInfo;
        notNull(context, DbUtils.Const.Table.CONTEXT);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
                activityInfo = null;
            }
        } else {
            activityInfo = null;
        }
        if (activityInfo == null) {
            if (!(!shouldThrow)) {
                throw new IllegalStateException(FACEBOOK_ACTIVITY_NOT_FOUND_REASON.toString());
            }
            Log.w(TAG, FACEBOOK_ACTIVITY_NOT_FOUND_REASON);
        }
    }

    @JvmStatic
    public static final void hasInternetPermissions(@NotNull Context context, boolean shouldThrow) {
        notNull(context, DbUtils.Const.Table.CONTEXT);
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (!(!shouldThrow)) {
                throw new IllegalStateException(NO_INTERNET_PERMISSION_REASON.toString());
            }
            Log.w(TAG, NO_INTERNET_PERMISSION_REASON);
        }
    }

    @JvmStatic
    public static final void notEmpty(@NotNull String arg, @NotNull String name) {
        if (arg.length() > 0) {
            return;
        }
        throw new IllegalArgumentException(("Argument '" + name + "' cannot be empty").toString());
    }
}
