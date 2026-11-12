package com.mapbox.android.core.permissions;

import a7.b;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.common.MapboxCommonLogger;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.u;
import z6.a;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J(\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J#\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/mapbox/android/core/permissions/PermissionsManager;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mapbox/android/core/permissions/PermissionsListener;", "(Lcom/mapbox/android/core/permissions/PermissionsListener;)V", "onRequestPermissionsResult", "", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestLocationPermissions", "activity", "Landroid/app/Activity;", "requestFineLocation", "", "requestCoarseLocation", "requestBackgroundLocation", "requestPermissions", "(Landroid/app/Activity;[Ljava/lang/String;)V", "AccuracyAuthorization", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PermissionsManager {
    private static final String BACKGROUND_LOCATION_PERMISSION = "android.permission.ACCESS_BACKGROUND_LOCATION";
    private static final String COARSE_LOCATION_PERMISSION = "android.permission.ACCESS_COARSE_LOCATION";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FINE_LOCATION_PERMISSION = "android.permission.ACCESS_FINE_LOCATION";
    private static final int REQUEST_PERMISSIONS_CODE = 0;
    private static final String TAG = "PermissionsManager";
    private final PermissionsListener listener;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/mapbox/android/core/permissions/PermissionsManager$AccuracyAuthorization;", "", "(Ljava/lang/String;I)V", "NONE", "PRECISE", "APPROXIMATE", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum AccuracyAuthorization {
        NONE,
        PRECISE,
        APPROXIMATE
    }

    public PermissionsManager(PermissionsListener permissionsListener) {
        permissionsListener.getClass();
        this.listener = permissionsListener;
    }

    public static final AccuracyAuthorization accuracyAuthorization(Context context) {
        return INSTANCE.accuracyAuthorization(context);
    }

    public static final boolean areLocationPermissionsGranted(Context context) {
        return INSTANCE.areLocationPermissionsGranted(context);
    }

    public static final boolean isBackgroundLocationPermissionGranted(Context context) {
        return INSTANCE.isBackgroundLocationPermissionGranted(context);
    }

    private final void requestPermissions(Activity activity, String[] permissions) {
        ArrayList arrayList = new ArrayList();
        for (String str : permissions) {
            if (a.b(activity, str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            this.listener.onExplanationNeeded(arrayList);
        }
        a.a(activity, permissions, 0);
    }

    public final void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        if (requestCode == 0) {
            int length = permissions.length;
            boolean z14 = false;
            for (int i14 = 0; i14 < length; i14++) {
                String str = permissions[i14];
                if (s.g(str, FINE_LOCATION_PERMISSION) || s.g(str, COARSE_LOCATION_PERMISSION)) {
                    z14 = z14 || grantResults[i14] == 0;
                }
            }
            this.listener.onPermissionResult(z14);
        }
    }

    public final void requestLocationPermissions(Activity activity) {
        activity.getClass();
        try {
            String[] strArr = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                boolean z14 = u.z(strArr, BACKGROUND_LOCATION_PERMISSION);
                boolean z15 = u.z(strArr, FINE_LOCATION_PERMISSION);
                boolean z16 = u.z(strArr, COARSE_LOCATION_PERMISSION);
                if (!z15 && !z16) {
                    MapboxCommonLogger.INSTANCE.logW$common_release(TAG, "Location permissions are missing");
                    return;
                }
                requestLocationPermissions(activity, z15, z16, z14);
            }
        } catch (Exception e4) {
            MapboxCommonLogger mapboxCommonLogger = MapboxCommonLogger.INSTANCE;
            String message = e4.getMessage();
            message.getClass();
            mapboxCommonLogger.logW$common_release(TAG, message);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/mapbox/android/core/permissions/PermissionsManager$Companion;", "", "()V", "BACKGROUND_LOCATION_PERMISSION", "", "COARSE_LOCATION_PERMISSION", "FINE_LOCATION_PERMISSION", "REQUEST_PERMISSIONS_CODE", "", "TAG", "accuracyAuthorization", "Lcom/mapbox/android/core/permissions/PermissionsManager$AccuracyAuthorization;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "areLocationPermissionsGranted", "", "isBackgroundLocationPermissionGranted", "isCoarseLocationPermissionGranted", "isFineLocationPermissionGranted", "isPermissionGranted", "permission", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private final boolean isCoarseLocationPermissionGranted(Context context) {
            return isPermissionGranted(context, PermissionsManager.COARSE_LOCATION_PERMISSION);
        }

        private final boolean isFineLocationPermissionGranted(Context context) {
            return isPermissionGranted(context, PermissionsManager.FINE_LOCATION_PERMISSION);
        }

        private final boolean isPermissionGranted(Context context, String permission) {
            return b.checkSelfPermission(context, permission) == 0;
        }

        public final AccuracyAuthorization accuracyAuthorization(Context context) {
            context.getClass();
            if (isFineLocationPermissionGranted(context)) {
                return AccuracyAuthorization.PRECISE;
            }
            return isCoarseLocationPermissionGranted(context) ? AccuracyAuthorization.APPROXIMATE : AccuracyAuthorization.NONE;
        }

        public final boolean areLocationPermissionsGranted(Context context) {
            context.getClass();
            return isCoarseLocationPermissionGranted(context) || isFineLocationPermissionGranted(context);
        }

        public final boolean isBackgroundLocationPermissionGranted(Context context) {
            context.getClass();
            return Build.VERSION.SDK_INT >= 29 ? isPermissionGranted(context, PermissionsManager.BACKGROUND_LOCATION_PERMISSION) : areLocationPermissionsGranted(context);
        }

        private Companion() {
        }
    }

    private final void requestLocationPermissions(Activity activity, boolean requestFineLocation, boolean requestCoarseLocation, boolean requestBackgroundLocation) {
        ArrayList arrayList = new ArrayList();
        if (requestFineLocation) {
            arrayList.add(FINE_LOCATION_PERMISSION);
        }
        if (requestCoarseLocation) {
            arrayList.add(COARSE_LOCATION_PERMISSION);
        }
        if (Build.VERSION.SDK_INT >= 29 && requestBackgroundLocation) {
            arrayList.add(BACKGROUND_LOCATION_PERMISSION);
        }
        Object[] array = arrayList.toArray(new String[0]);
        array.getClass();
        requestPermissions(activity, (String[]) array);
    }
}
