package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.health.device.manager.DeviceCloudSharePreferencesManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class ecj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static byte[] f32739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static NoTitleCustomAlertDialog f32740c;
    private static byte[] d;

    static {
        b();
    }

    public static void b() {
        dyg.a(false, "CommonLibUtil", "getKeFromSo ");
        String strE = ecm.e();
        if (TextUtils.isEmpty(strE)) {
            dyg.a(false, "CommonLibUtil", "getKeFromSo ko is null");
            return;
        }
        try {
            d = ecg.b(Base64.decode(new String(ecm.b(Base64.decode(strE, 0)), "UTF-8"), 0));
        } catch (UnsupportedEncodingException e) {
            dyg.c(false, "CommonLibUtil", "getKeFromSo UnsupportedEncodingException:", e.getMessage());
        }
    }

    public static byte[] a(int i, byte[] bArr, String str) {
        byte[] bArrDecode;
        if (bArr == null || bArr.length == 0 || str == null) {
            dyg.c(false, "CommonLibUtil", "whiteBoxEncrypt para are wrong!");
            return new byte[0];
        }
        try {
            bArrDecode = Base64.decode(str, 0);
        } catch (IllegalArgumentException e) {
            dyg.c(false, "CommonLibUtil", "whiteBoxEncrypt IllegalArgumentException: ", e.getMessage());
            bArrDecode = null;
        }
        if (bArrDecode == null || bArrDecode.length == 0) {
            dyg.c(false, "CommonLibUtil", "whiteBoxEncrypt Base64 decode error!");
            return new byte[0];
        }
        return ecm.a(i, bArr, ecg.b(bArrDecode));
    }

    public static byte[] d(byte[] bArr, int i, int i2) throws NoSuchAlgorithmException, InvalidKeyException {
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArrA = eci.a();
        if (bArrA == null || bArrA.length == 0 || bArrA.length > 1024) {
            return new byte[0];
        }
        int i3 = bArrA[0];
        byte[] bArr2 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr2[i4] = bArrA[((i4 + i3) * 8) - 2];
        }
        for (int i5 = 0; i5 < i3 / 2; i5++) {
            byte b2 = bArr2[i5];
            int i6 = (i3 - 1) - i5;
            bArr2[i5] = bArr2[i6];
            bArr2[i6] = b2;
        }
        if (i3 == 0) {
            return new byte[0];
        }
        return eco.d(bArr2, bArr, i, i2);
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            dyg.c(false, "CommonLibUtil", "para is wrong!");
            return "";
        }
        return eeq.e(bArr);
    }

    public static byte[] c(String str) {
        if (TextUtils.isEmpty(str)) {
            dyg.c(true, "CommonLibUtil", "para is wrong!");
            return new byte[0];
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < str.length() / 2; i++) {
            try {
                int i2 = i * 2;
                int i3 = i2 + 1;
                bArr[i] = (byte) ((Integer.parseInt(str.substring(i2, i3), 16) * 16) + Integer.parseInt(str.substring(i3, i2 + 2), 16));
            } catch (NumberFormatException e) {
                dyg.c(true, "CommonLibUtil", e.getMessage());
                return new byte[0];
            }
        }
        return bArr;
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(16);
        for (String str2 : str.split(":")) {
            sb.append(str2);
        }
        dyg.a(true, "CommonLibUtil", "replaceMac:", dyg.b(sb.toString()));
        return sb.toString();
    }

    public static int[] b(int[] iArr) {
        if (iArr == null) {
            return new int[0];
        }
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = iArr[i] & 255;
        }
        return iArr2;
    }

    public static byte[] e(int[] iArr) {
        if (iArr == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            bArr[i] = (byte) (iArr[i] & 255);
        }
        return bArr;
    }

    public static void a(Context context) {
        String strE = e(context);
        if ("239.40.".equals(strE)) {
            c(context, "multicast_ip", "239.50.");
        } else if ("239.50.".equals(strE)) {
            c(context, "multicast_ip", "239.60.");
        } else {
            c(context, "multicast_ip", "239.40.");
        }
    }

    private static void c(Context context, String str, String str2) {
        new DeviceCloudSharePreferencesManager(context).a(str, str2);
    }

    public static String e(Context context) {
        String strE = new DeviceCloudSharePreferencesManager(context).e("multicast_ip");
        return (strE == null || "".equals(strE)) ? "239.40." : strE;
    }

    public static byte[] d(int i) {
        byte[] bArr = new byte[i];
        qrf.b().nextBytes(bArr);
        return bArr;
    }

    public static byte[] e() {
        byte[] bArr = d;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static byte[] a() {
        return c();
    }

    private static byte[] c() {
        byte[] bArr = f32739b;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrE = eeq.e(6636064304198646866L);
        byte[] bArrC = eeq.c(10207);
        byte[] bArr2 = new byte[10];
        System.arraycopy(bArrE, 0, bArr2, 0, bArrE.length);
        System.arraycopy(bArrC, 0, bArr2, bArrE.length, bArrC.length);
        f32739b = bArr2;
        return bArr2;
    }

    public static boolean b(Context context) {
        if (context == null) {
            dyg.c(false, "CommonLibUtil", "isNetworkConnected context is null");
            return false;
        }
        if (!(context.getSystemService("connectivity") instanceof ConnectivityManager)) {
            LogUtil.j("CommonLibUtil", "context.getSystemService(Context.CONNECTIVITY_SERVICE) not instanceof ConnectivityManager");
            return false;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean d() {
        String str = Build.FINGERPRINT;
        dyg.a(false, "CommonLibUtil", "system ro.build.fingerprint ", str);
        return str.toLowerCase(Locale.ENGLISH).lastIndexOf("samsung") != -1;
    }

    public static boolean e(Context context, LocationManager locationManager) {
        if (locationManager == null && context != null) {
            if (!(context.getSystemService("location") instanceof LocationManager)) {
                LogUtil.j("CommonLibUtil", "context.getSystemService(Context.LOCATION_SERVICE) ont instanceof LocationManager");
            } else {
                locationManager = (LocationManager) context.getSystemService("location");
            }
        }
        if (locationManager == null) {
            dyg.a(false, "CommonLibUtil", "isLocationSwitchOn locationManager is null");
            return false;
        }
        boolean zIsProviderEnabled = locationManager.isProviderEnabled(GeocodeSearch.GPS);
        boolean zIsProviderEnabled2 = locationManager.isProviderEnabled("network");
        dyg.a(false, "CommonLibUtil", "isLocationSwitchOn(): GpsEnable ", Boolean.valueOf(zIsProviderEnabled), " NetworkEnable ", Boolean.valueOf(zIsProviderEnabled2));
        return zIsProviderEnabled || zIsProviderEnabled2;
    }

    public static void c(Context context, String str, DialogInterface.OnClickListener onClickListener) {
        if (context == null) {
            dyg.c(false, "CommonLibUtil", "showPermissionSettingGuide context is null");
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        if (f32740c == null) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
            builder.a(str).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: ecj.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    dyg.e(false, "CommonLibUtil", "setNegativeButton onclick cancle");
                }
            }).c(R.string.IDS_hwh_motiontrack_permission_guide_go_set, new View.OnClickListener() { // from class: ecj.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    dyg.e(false, "CommonLibUtil", "setPositiveButton onclick called --- String");
                    Intent intent = new Intent();
                    intent.addFlags(268435456);
                    intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", applicationContext.getPackageName(), null));
                    ecj.e(applicationContext, intent);
                }
            });
            f32740c = builder.c();
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = f32740c;
        if (noTitleCustomAlertDialog == null || noTitleCustomAlertDialog.isShowing()) {
            return;
        }
        f32740c.show();
    }

    public static void d(final Context context) {
        if (context == null) {
            dyg.c(false, "CommonLibUtil", "showWiFiEnableDialog context is null");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        String string = context.getResources().getString(com.huawei.plugindevice.R.string.IDS_device_wifi_device_product_name);
        builder.a(String.format(Locale.ENGLISH, context.getResources().getString(com.huawei.plugindevice.R.string.IDS_device_wifi_measure_no_network_msg), string)).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: ecj.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dyg.a(false, "CommonLibUtil", "showWiFiEnableDialog: do nothing");
            }
        }).c(com.huawei.plugindevice.R.string.IDS_device_wifi_go_connect, new View.OnClickListener() { // from class: ecj.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ecs.l(context);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public static void e(String str, ImageView imageView, Drawable drawable) {
        if (imageView == null || drawable == null) {
            LogUtil.e("CommonLibUtil", "setUserPhoto: userPhotoLv or defaultUserPhoto is null");
            return;
        }
        if (!TextUtils.isEmpty(str) && !"default".equals(str)) {
            Bitmap bitmapA = qqf.a(BaseApplication.getContext(), str);
            if (bitmapA != null) {
                imageView.setImageBitmap(qqf.a(bitmapA));
                return;
            }
            return;
        }
        imageView.setImageDrawable(drawable);
    }

    public static boolean d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            dyg.a(false, "CommonLibUtil", "isMainUser mainUuid is null");
            return false;
        }
        if (str == null) {
            dyg.a(false, "CommonLibUtil", "isMainUser uuid is null");
            return true;
        }
        if ("0".equals(str) || "".equals(str)) {
            dyg.a(false, "CommonLibUtil", "isMainUser:", str);
            return true;
        }
        if (!Constants.NULL.equalsIgnoreCase(str) && !str.equals(str2)) {
            return false;
        }
        dyg.a(false, "CommonLibUtil", "isMainUser:", str);
        return true;
    }

    public static void e(Context context, Intent intent) {
        if (context == null) {
            dyg.a(false, "CommonLibUtil", "startSystemActivity activity is null");
            return;
        }
        if (intent == null) {
            dyg.a(false, "CommonLibUtil", "startSystemActivity intent is null");
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            dyg.a(false, "CommonLibUtil", "startSystemActivity packageManager is null");
            return;
        }
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 1048576);
        if (resolveInfoResolveActivity == null) {
            dyg.a(false, "CommonLibUtil", "startSystemActivity resolveInfo is null");
            return;
        }
        intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("CommonLibUtil", "startSystemActivity exception");
        }
    }
}
