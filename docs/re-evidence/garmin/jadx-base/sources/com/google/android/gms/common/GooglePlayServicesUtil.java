package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.errorprone.annotations.InlineMe;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes14.dex */
public final class GooglePlayServicesUtil extends GooglePlayServicesUtilLight {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i14, Activity activity, int i15, DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i14)) {
            i14 = 18;
        }
        return GoogleApiAvailability.getInstance().getErrorDialog(activity, i14, i15, onCancelListener);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i14, Context context, int i15) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i14, i15);
    }

    @Deprecated
    public static String getErrorString(int i14) {
        return GooglePlayServicesUtilLight.getErrorString(i14);
    }

    public static Context getRemoteContext(Context context) {
        return GooglePlayServicesUtilLight.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        return GooglePlayServicesUtilLight.getRemoteResource(context);
    }

    @ResultIgnorabilityUnspecified
    @HideFirstParty
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i14) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i14);
    }

    @ResultIgnorabilityUnspecified
    public static boolean showErrorDialogFragment(int i14, Activity activity, Fragment fragment, int i15, DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i14)) {
            i14 = 18;
        }
        int i16 = i14;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (fragment == null) {
            return googleApiAvailability.showErrorDialogFragment(activity, i16, i15, onCancelListener);
        }
        Dialog dialogZaa = googleApiAvailability.zaa(activity, i16, zag.zac(fragment, GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity, i16, "d"), i15), onCancelListener, null);
        if (dialogZaa == null) {
            return false;
        }
        googleApiAvailability.zad(activity, dialogZaa, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @Deprecated
    public static void showErrorNotification(int i14, Context context) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i14) || GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i14)) {
            googleApiAvailability.zaf(context);
        } else {
            googleApiAvailability.showErrorNotification(context, i14);
        }
    }

    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i14) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i14);
    }

    @Deprecated
    public static Dialog getErrorDialog(int i14, Activity activity, int i15) {
        return getErrorDialog(i14, activity, i15, null);
    }

    @ResultIgnorabilityUnspecified
    @InlineMe(imports = {"androidx.fragment.app.Fragment", "com.google.android.gms.common.GooglePlayServicesUtil"}, replacement = "GooglePlayServicesUtil.showErrorDialogFragment(errorCode, activity, (Fragment) null, requestCode, cancelListener)")
    @Deprecated
    public static boolean showErrorDialogFragment(int i14, Activity activity, int i15, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i14, activity, null, i15, onCancelListener);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i14, Activity activity, int i15) {
        return showErrorDialogFragment(i14, activity, i15, null);
    }
}
