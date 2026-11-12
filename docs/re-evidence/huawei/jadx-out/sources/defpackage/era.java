package defpackage;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.huawei.ecologydevice.R;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.EventMonitorRecord;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.ble.BleJsInteractionCompact;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class era {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, ProductMapInfo> f33380a = new ConcurrentHashMap();

    public static int c(Context context, float f) {
        if (context == null) {
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static boolean l(String str) {
        return LanguageUtil.b(BaseApplication.getContext()).equalsIgnoreCase(str);
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        String strB = LanguageUtil.b(BaseApplication.getContext());
        LogUtil.d("DeviceUtils", "ProductIntroductionFragment langIsAr() currentLanguage is ", strB);
        return ((strB.endsWith("iw") || strB.endsWith("he")) || strB.endsWith("ar")) || (strB.endsWith("fa") || strB.endsWith(Constants.URDU_LANG));
    }

    public static int e(ListView listView) {
        ListAdapter adapter;
        if (listView == null || (adapter = listView.getAdapter()) == null) {
            return 0;
        }
        int measuredHeight = 0;
        for (int i = 0; i < adapter.getCount(); i++) {
            View view = adapter.getView(i, null, listView);
            if (view != null) {
                view.measure(0, 0);
                measuredHeight += view.getMeasuredHeight();
            }
        }
        return measuredHeight + (listView.getDividerHeight() * (adapter.getCount() - 1));
    }

    public static void d(ImageView imageView, String str) {
        elh elhVarD;
        if (imageView == null || TextUtils.isEmpty(str) || (elhVarD = ResourceManager.c().d(str)) == null || elhVarD.l() == null) {
            return;
        }
        if (njy.e(elhVarD.d())) {
            imageView.setImageResource(elo.a(elhVarD.l().b()));
        } else {
            imageView.setImageBitmap(elo.c(elg.e().d(elhVarD.t(), elhVarD.l().b())));
        }
    }

    public static void e(Activity activity) {
        if (activity == null) {
            LogUtil.j("DeviceUtils", "enterToMainActivity activity is null");
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.MainActivity");
        intent.setFlags(67108864);
        intent.putExtra(com.huawei.operation.utils.Constants.HOME_TAB_NAME, com.huawei.operation.utils.Constants.HOME);
        activity.startActivity(intent);
        activity.finish();
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("DeviceUtils", "getDeviceIdentification identification is null");
            return "";
        }
        if (str.replace(":", "").length() < 3) {
            LogUtil.a("DeviceUtils", "identification's length less than 3");
            return Constants.LINK + str.replace(":", "");
        }
        return Constants.LINK + str.replace(":", "").substring(str.replace(":", "").length() - 3);
    }

    public static boolean a(String str) {
        try {
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
            if (remoteDevice.getBondState() == 12) {
                Method method = BluetoothDevice.class.getMethod("removeBond", new Class[0]);
                Boolean bool = method.invoke(remoteDevice, new Object[0]) instanceof Boolean ? (Boolean) method.invoke(remoteDevice, new Object[0]) : null;
                if (bool == null) {
                    return false;
                }
                return bool.booleanValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            LogUtil.e("DeviceUtils", "disconnectBluetooth Exception:", ExceptionUtils.c(e));
        }
        return false;
    }

    public static void d(HealthDevice.HealthDeviceKind healthDeviceKind) {
        LogUtil.a("DeviceUtils", "saveDeviceKind");
        if (HealthDevice.HealthDeviceKind.HDK_WEIGHT.equals(healthDeviceKind)) {
            m("BIND_WEIGHT");
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_BLOOD_PRESSURE.equals(healthDeviceKind)) {
            m("BIND_BLOOD_PRESSURE");
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR.equals(healthDeviceKind)) {
            m("BIND_BLOOD_SUGAR");
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_HEART_RATE.equals(healthDeviceKind)) {
            m("BIND_HEART_RATE");
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_BODY_TEMPERATURE.equals(healthDeviceKind)) {
            m("BIND_BODY_TEMPERATURE");
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_BLOOD_OXYGEN.equals(healthDeviceKind)) {
            m("BIND_BLOOD_OXYGEN");
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_ROPE_SKIPPING.equals(healthDeviceKind)) {
            m("BIND_ROPE_SKIPPING");
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_TREADMILL.equals(healthDeviceKind)) {
            m("BIND_TREADMILL");
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_EXERCISE_BIKE.equals(healthDeviceKind)) {
            m("BIND_EXERCISE_BIKE");
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_ROWING_MACHINE.equals(healthDeviceKind)) {
            m("BIND_ROWING_MACHINE");
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_ELLIPTICAL_MACHINE.equals(healthDeviceKind)) {
            m("BIND_ELLIPTICAL_MACHINE");
        } else if (HealthDevice.HealthDeviceKind.HDK_WALKING_MACHINE.equals(healthDeviceKind)) {
            m("BIND_WALKING_MACHINE");
        } else {
            LogUtil.j("DeviceUtils", "saveDeviceKind else");
        }
    }

    private static void m(String str) {
        SharedPreferenceManager.e(dxw.d(), String.valueOf(10000), str, "1", new StorageParams());
    }

    public static void c(Context context, View view, double d, boolean z) {
        if (context != null && (context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR) instanceof WindowManager)) {
            WindowManager windowManager = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int iMin = (int) (Math.min(i, ((double) displayMetrics.heightPixels) * 0.5d) * d);
            if (z) {
                i = iMin;
            }
            view.setLayoutParams(new LinearLayout.LayoutParams(i, iMin));
        }
    }

    public static void a(Activity activity) {
        if (activity == null) {
            return;
        }
        new eqm(activity, null, null, "167P").c("HDK_BLOOD_SUGAR", true);
    }

    public static String d(long j) {
        return e(j / 1000.0d, 0);
    }

    public static String b(Context context, long j) {
        if (context == null) {
            return "";
        }
        return context.getResources().getQuantityString(R.plurals.IDS_device_rope_device_skip_unit, j < 2 ? 1 : 2, "");
    }

    public static String b(double d) {
        return e((d / 1000.0d) / 60.0d, 2);
    }

    private static String e(double d, int i) {
        return UnitUtil.e(d, 1, i);
    }

    public static boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceUtils", "isSecondRope productId is null");
            return false;
        }
        return dmz.ac.contains(b(str));
    }

    public static boolean o(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceUtils", "isSecondRope productId is null");
            return false;
        }
        return dmz.an.contains(b(str));
    }

    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceUtils", "isHighRopeType productId is null");
            return false;
        }
        return "2G98".equals(b(str));
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceUtils", "isAthleticsRopeType productId is empty");
            return false;
        }
        return "2IX6".equals(b(str));
    }

    public static boolean b(int i, int i2) {
        if (i == 283) {
            return dmz.al.contains(Integer.valueOf(i2));
        }
        return false;
    }

    public static boolean f(String str) {
        return dmz.an.contains(b(str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        elh elhVarD = ResourceManager.c().d(str2);
        if (elhVarD == null) {
            LogUtil.j("DeviceUtils", "isSupportIntermit productInfo is null");
            return "";
        }
        String strC = elhVarD.c(str);
        str.hashCode();
        switch (str) {
            case "isSupportAutoPauseSuprression":
            case "isSupportIntermit":
            case "isSupportWeight":
            case "isSupportScore":
                if ("true".equals(strC) || o(str2)) {
                    return "true";
                }
                return "false";
            case "marketing_position_id":
                return strC;
            case "pageVersion":
                if ("1".equals(strC) || h(str2)) {
                    return "1";
                }
                return "0";
            case "ota":
                if ("yes".equals(strC) || o(str2)) {
                    return "yes";
                }
                return "no";
            default:
                LogUtil.a("DeviceUtils", "getProductInfoExtraData extraKey is invalids");
                return "";
        }
    }

    public static void c(final Context context, final TextView textView) {
        final int[] iArr = {15};
        for (int i = 0; i < 6; i++) {
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: era.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (textView.getLineCount() > 1) {
                        Context context2 = context;
                        if (context2 == null) {
                            LogUtil.a("DeviceUtils", "adapterTextFonts, context is null!");
                            textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            return;
                        }
                        int width = context2.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR) instanceof WindowManager ? ((WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay().getWidth() : 0;
                        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                        if (width == layoutParams.width) {
                            int[] iArr2 = iArr;
                            int i2 = iArr2[0] - 1;
                            iArr2[0] = i2;
                            textView.setTextSize(1, i2);
                            return;
                        }
                        layoutParams.width = width - era.c(context, 64.0f);
                        textView.setLayoutParams(layoutParams);
                    }
                }
            });
        }
    }

    public static ProductMapInfo c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, ProductMapInfo> map = f33380a;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        ProductMapParseUtil.a(BaseApplication.getContext());
        List<ProductMapInfo> listC = ProductMap.c("productId", str);
        if (!njy.b(listC)) {
            return null;
        }
        ProductMapInfo productMapInfo = listC.get(0);
        map.put(str, productMapInfo);
        return productMapInfo;
    }

    public static String b(String str) {
        ProductMapInfo productMapInfoC = c(str);
        if (productMapInfoC == null) {
            return "";
        }
        LogUtil.d("DeviceUtils", "prodId = ", productMapInfoC.g());
        return TextUtils.isEmpty(productMapInfoC.g()) ? "" : productMapInfoC.g();
    }

    public static void e(Context context, String str, String str2) {
        String strI = emh.b().i();
        String strD = emh.b().d();
        if (TextUtils.isEmpty(strI)) {
            LogUtil.a("DeviceUtils", "productId is null");
            return;
        }
        elh elhVarD = ResourceManager.c().d(strI);
        if (elhVarD == null) {
            LogUtil.a("DeviceUtils", "productInfo is null");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("productId", strI);
        contentValues.put("uniqueId", strD);
        contentValues.put("name", elhVarD.l().d());
        contentValues.put("deviceType", elhVarD.m().name());
        contentValues.put(BleConstants.KEY_BR_MAC, str);
        new BleJsInteractionCompact().startH5Pro(context, "com.huawei.health.device." + strI, contentValues, str2);
    }

    public static boolean i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.contains("proto=2")) {
            return true;
        }
        return str.contains("ftmp=1");
    }

    public static boolean a(ContentValues contentValues) {
        if (contentValues == null) {
            LogUtil.j("DeviceUtils", "deviceInfo is null");
            return false;
        }
        return "0".equals(contentValues.getAsString(EventMonitorRecord.ADD_TIME));
    }

    public static boolean g(String str) {
        LogUtil.a("DeviceUtils", "isIntelligentDevice");
        return !TextUtils.isEmpty(str) && piq.e().a(str);
    }
}
