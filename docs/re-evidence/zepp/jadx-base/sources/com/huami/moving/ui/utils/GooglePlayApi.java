package com.huami.moving.ui.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.common.GoogleApiAvailability;

/* JADX INFO: loaded from: classes4.dex */
public class GooglePlayApi {
    private static final int a = 1024;

    public class a implements DialogInterface.OnCancelListener {
        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    public static boolean isGooglePlayServicesAvailable(Context context) {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }

    public static boolean isGooglePlayServicesAvailableWithErrDialog(Activity activity) {
        int iIsGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(activity);
        if (iIsGooglePlayServicesAvailable == 0) {
            return true;
        }
        GoogleApiAvailability.getInstance().getErrorDialog(activity, iIsGooglePlayServicesAvailable, 1024, new a()).show();
        return false;
    }
}
