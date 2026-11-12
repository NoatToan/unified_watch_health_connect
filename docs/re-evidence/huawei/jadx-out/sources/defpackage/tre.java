package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hms.framework.network.restclient.hwhttp.Response;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.main.R;
import com.huawei.ui.openservice.ui.OpenServiceActivity;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class tre {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static NoTitleCustomAlertDialog f49576b = null;
    private static CustomTextAlertDialog d = null;
    private static String e = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[][] f49575a = {new int[]{1, 2, 3, 4, 5, 10, 11, 12, 14}, new int[]{1, 2, 3, 4, 5, 14}, new int[]{6, 14}, new int[]{1, 2, 3, 4, 5, 6, 7, 9, 11, 14}, new int[]{2, 4, 8, 9, 14}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int[] f49577c = new int[5];

    static {
        for (int i = 0; i < f49575a.length; i++) {
            int i2 = 0;
            int iA = 0;
            while (true) {
                int[] iArr = f49575a[i];
                if (i2 < iArr.length) {
                    iA += a(iArr[i2]);
                    i2++;
                }
            }
            f49577c[i] = iA;
        }
    }

    public static boolean e(int i, int i2) {
        if (i < 1 || i > f49575a.length) {
            LogUtil.j("isCapabilitySupported() moduleType is not valid. please check.", new Object[0]);
            return false;
        }
        if (i2 < 1 || i2 > 32) {
            LogUtil.j("isCapabilitySupported() currentLayout is not valid. please check.", new Object[0]);
            return false;
        }
        int iA = a(i2);
        return (f49577c[i - 1] & iA) == iA;
    }

    private static int a(int i) {
        if (i < 1 || i > 32) {
            LogUtil.j("ConfiguredUtils", "convertNumber() number is outof bounds, please check.");
            return -1;
        }
        return (int) Math.pow(2.0d, i - 1);
    }

    public static void c(Context context, dlm dlmVar) {
        if (dlmVar == null || context == null) {
            LogUtil.j("ConfiguredUtils", "goToDetailActivity itemObject is null or context is null.");
            return;
        }
        d(dlmVar.r());
        String strC = dlmVar.c();
        int iM = dlmVar.m();
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("ConfiguredUtils", "goToDetailActivity detailUrl is isEmpty.");
            return;
        }
        String strTrim = strC.trim();
        LogUtil.a("ConfiguredUtils", "goToDetailActivity serviceUrlType = ", Integer.valueOf(iM));
        if (strTrim.contains("h5pro=true")) {
            iM = 3;
        }
        if (iM == 0) {
            c(context, strTrim, dlmVar);
            return;
        }
        if (iM == 1) {
            d(context, strTrim, dlmVar);
            return;
        }
        if (iM == 2) {
            prf.c(context, strTrim);
        } else if (iM == 3) {
            d(context, strTrim);
        } else {
            c(context, strTrim, dlmVar);
        }
    }

    private static void d(final int i) {
        if (i <= 0) {
            LogUtil.j("ConfiguredUtils", "reportInfoReadNumber() informationId is empty.");
            return;
        }
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("messageCenterUrl");
        e = url;
        if (TextUtils.isEmpty(url)) {
            LogUtil.j("ConfiguredUtils", "reportInfoReadNumber() MESSAGE_CENTER_KEY sMessageCenterDomainUrl is empty,try again.");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: tre.5
                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    AutoCloseable autoCloseable = null;
                    try {
                        try {
                            jSONObject.put("id", i);
                            jSONObject.put("appType", 1);
                            jSONObject.put("ts", System.currentTimeMillis());
                            Response responseB = lqb.b(tre.e + "/messageCenter/information/readCountPlusOne", jSONObject);
                            int code = responseB.getCode();
                            if (code == 200 && responseB.getBody() != null) {
                                LogUtil.a("ConfiguredUtils", "getRequestResult success");
                            } else {
                                LogUtil.j("ConfiguredUtils", "getRequestResult responseCode = ", Integer.valueOf(code));
                            }
                            if (responseB != null) {
                                try {
                                    responseB.close();
                                } catch (IOException e2) {
                                    LogUtil.e("ConfiguredUtils", "IOException: ", e2);
                                }
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                try {
                                    autoCloseable.close();
                                } catch (IOException e3) {
                                    LogUtil.e("ConfiguredUtils", "IOException: ", e3);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException | JSONException unused) {
                        LogUtil.e("ConfiguredUtils", "reportInfoReadNumber meet json exception or ioexception.");
                        if (0 != 0) {
                            try {
                                autoCloseable.close();
                            } catch (IOException e4) {
                                LogUtil.e("ConfiguredUtils", "IOException: ", e4);
                            }
                        }
                    }
                }
            });
        }
    }

    public static void d(Context context, String str) {
        Activity activity = BaseApplication.getActivity();
        if (activity == null || TextUtils.isEmpty(str)) {
            LogUtil.j("ConfiguredUtils", "jumpToH5Pro() activity is null or detailUrl is empty.");
            return;
        }
        if (context == null) {
            LogUtil.j("ConfiguredUtils", "jumpToH5Pro() context is null");
            return;
        }
        if (!CommonUtil.ab(context)) {
            g();
            return;
        }
        String strTrim = str.trim();
        H5proUtil.initH5pro();
        H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().addCustomizeJsModule(RemoteMessageConst.NOTIFICATION, ddv.b().getCommonJsModule(RemoteMessageConst.NOTIFICATION)).addCustomizeJsModule("notificationAudioControl", ddv.b().getCommonJsModule("notificationAudioControl")).addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("achievement", ddq.d().getCommonJsModule("achievement")).build();
        if (b(strTrim)) {
            LogUtil.a("ConfiguredUtils", "jumpToH5Application() is url.");
            H5ProClient.startH5LightApp(activity, strTrim, h5ProLaunchOptionBuild);
        } else {
            LogUtil.a("ConfiguredUtils", "jumpToH5Application() is h5 mini program.");
            H5ProClient.startH5MiniProgram(activity, strTrim, h5ProLaunchOptionBuild);
        }
    }

    private static boolean b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith("http://") || str.startsWith("https://") || str.startsWith(Constants.PREFIX_FILE);
        }
        LogUtil.j("ConfiguredUtils", "isUrlScheme() serviceDetailUrl is empty.");
        return false;
    }

    private static void d(Context context, String str, dlm dlmVar) {
        LogUtil.a("ConfiguredUtils", "enter jumpToApk");
        if (lsj.c(context, str)) {
            e(str, String.valueOf(dlmVar.v()), AnalyticsValue.HEALTH_TO_THIRD_PART_APP_2041080.value());
            String strT = dlmVar.t();
            if (strT != null) {
                strT = strT.trim();
            }
            try {
                if (TextUtils.isEmpty(strT)) {
                    b(context, str);
                    return;
                }
                LogUtil.a("ConfiguredUtils", "enter scheme skip");
                Intent intent = new Intent();
                intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                intent.setFlags(268435456);
                intent.setData(Uri.parse(strT));
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("ConfiguredUtils", "jumpToApk Exception: not found");
                b(context, str);
                return;
            }
        }
        LogUtil.e("ConfiguredUtils", "thirdPart_setOnClickListener detailUrl is not install,jump to Market.");
        e(context, str, dlmVar);
    }

    private static void b(Context context, String str) {
        try {
            context.startActivity(context.getPackageManager().getLaunchIntentForPackage(str));
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("ConfiguredUtils", "ActivityNotFoundException", e2.getMessage());
        }
    }

    private static void c(Context context, String str, dlm dlmVar) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ConfiguredUtils", "jumpToWebView() detailUrl is empty.");
            return;
        }
        String strTrim = str.trim();
        try {
            if (strTrim.contains("localeUrl:moduleName=openService")) {
                Intent intent = new Intent(context, (Class<?>) OpenServiceActivity.class);
                intent.addFlags(268435456);
                context.startActivity(intent);
            } else {
                if (strTrim.startsWith("huaweischeme://")) {
                    Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(strTrim));
                    intent2.setPackage(context.getPackageName());
                    intent2.addFlags(268435456);
                    lsx.c(intent2, context);
                    return;
                }
                Intent intent3 = new Intent(context, (Class<?>) WebViewActivity.class);
                intent3.setFlags(268435456);
                intent3.putExtra("url", str);
                intent3.putExtra("EXTRA_BI_ID", String.valueOf(dlmVar.g()));
                intent3.putExtra("EXTRA_BI_NAME", dlmVar.o());
                intent3.putExtra("EXTRA_BI_SOURCE", "CONFIGURE_PAGE_CARD");
                intent3.putExtra("EXTRA_BI_SHOWTIME", "SHOW_TIME_BI");
                context.startActivity(intent3);
            }
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("ConfiguredUtils", "ActivityNotFoundException", e2.getMessage());
        }
    }

    private static void e(Context context, String str, dlm dlmVar) {
        LogUtil.a("ConfiguredUtils", "enter jumpToMarket");
        String strAd = dlmVar.ad();
        String strZ = dlmVar.z();
        int iV = dlmVar.v();
        String configuredContents = new tra().c(dlmVar.v()).getConfiguredContents(strZ);
        if (TextUtils.isEmpty(configuredContents)) {
            int iV2 = dlmVar.v();
            e(str, String.valueOf(iV2), AnalyticsValue.HEALTH_TO_APP_MARKET_2041084.value());
            c(context, str, strAd);
            return;
        }
        d(configuredContents, str, strAd, String.valueOf(iV));
    }

    private static void g() {
        LogUtil.a("ConfiguredUtils", "ENTER showNetworkErrorDialog");
        Activity activity = BaseApplication.getActivity();
        if (activity == null) {
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
        builder.a(activity.getResources().getString(R.string.IDS_hwh_ali_sport_net_error)).d(activity.getResources().getString(R.string.IDS_user_permission_know), new View.OnClickListener() { // from class: tre.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                tre.f49576b.dismiss();
                NoTitleCustomAlertDialog unused = tre.f49576b = null;
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        f49576b = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        f49576b.show();
    }

    private static void d(String str, final String str2, final String str3, final String str4) {
        LogUtil.a("ConfiguredUtils", "enter showInstallDialog");
        final Activity activity = BaseApplication.getActivity();
        if (activity == null) {
            return;
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(activity).e(activity.getResources().getString(R.string.IDS_device_release_user_profile_log_privacy_tip_title)).a(str).a(R.string.IDS_hw_watchface_go_hms_install, new View.OnClickListener() { // from class: tre.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                tre.d.dismiss();
                CustomTextAlertDialog unused = tre.d = null;
                tre.e(str2, str4, AnalyticsValue.HEALTH_CONFIRM_TO_THIRD_PART_APP_2041082.value());
                tre.c(activity, str2, str3);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: tre.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                tre.d.dismiss();
                CustomTextAlertDialog unused = tre.d = null;
                tre.e(str2, str4, AnalyticsValue.HEALTH_CANCEL_TO_THIRD_PART_APP_2041081.value());
            }
        }).b();
        d = customTextAlertDialogB;
        customTextAlertDialogB.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, String str, String str2) {
        if (lsj.c(context, "com.huawei.appmarket")) {
            try {
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=" + str));
                intent.addFlags(268468224);
                intent.setPackage("com.huawei.appmarket");
                d(context, intent);
                return;
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("ConfiguredUtils", "showInstallDialog Exception: not found");
                return;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("ConfiguredUtils", "weburl is empty");
            String string = context.getString(R.string.IDS_main_sns_app_store_content);
            if (qrs.ah(BaseApplication.getContext())) {
                string = context.getString(R.string.IDS_main_sns_app_content_pad);
            }
            qpx.e(context, string);
            return;
        }
        Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str2));
        intent2.setFlags(268435456);
        try {
            context.startActivity(intent2);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("ConfiguredUtils", "ActivityNotFoundException", e2.getMessage());
        }
    }

    private static void d(Context context, Intent intent) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536)) == null) {
            return;
        }
        intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("ConfiguredUtils", "ActivityNotFoundException", e2.getMessage());
        }
    }

    public static long j() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeInMillis);
        return calendar.getTimeInMillis();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static List<dlm> a(int i, int i2, List<dlm> list) {
        if (njy.e(list)) {
            LogUtil.j("ConfiguredUtils", "getConfiguredDataIsShown list is empty.");
            return null;
        }
        switch (i) {
            case 1:
                return e(list, 1);
            case 2:
                return c(list, 2);
            case 3:
            case 9:
                return e(list, 3);
            case 4:
                return c(list, 4);
            case 5:
                return e(list, 6);
            case 6:
            case 7:
            case 11:
            case 12:
                return list;
            case 8:
                return e(list, 2);
            case 10:
                int size = list.size();
                if (size > 4) {
                    return list.subList(0, 4);
                }
                if (size < 3) {
                    return new ArrayList(10);
                }
                return list;
            case 13:
            default:
                return new ArrayList(10);
            case 14:
                return c(list, 6);
        }
    }

    private static List<dlm> e(List<dlm> list, int i) {
        ArrayList arrayList = new ArrayList(10);
        if (njy.e(list)) {
            LogUtil.j("ConfiguredUtils", "getConfiguredPageShowList() list is empty.");
            return arrayList;
        }
        if (list.size() >= i) {
            return list.subList(0, i);
        }
        LogUtil.j("ConfiguredUtils", "getConfiguredPageShowList() ");
        return arrayList;
    }

    private static List<dlm> c(List<dlm> list, int i) {
        ArrayList arrayList = new ArrayList(10);
        if (njy.e(list)) {
            LogUtil.j("ConfiguredUtils", "getHorizonThreeGirdShowList() list is empty.");
            return arrayList;
        }
        if (list.size() >= i) {
            return list.subList(0, i);
        }
        LogUtil.j("ConfiguredUtils", "getHorizonThreeGirdShowList() ");
        return list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(Context context, int i, int i2) {
        int iD = qrs.d(context, 8.0f);
        int i3 = 1;
        int i4 = 2;
        int i5 = 4;
        switch (i) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 11:
                break;
            case 2:
            case 4:
                iD = context.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
                i3 = 2;
                i4 = i5;
                break;
            case 3:
            case 5:
                iD = context.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
                i3 = 3;
                i4 = i3;
                break;
            case 9:
                i5 = 3;
                i3 = 2;
                i4 = i5;
                break;
            case 10:
            case 13:
            default:
                i4 = i3;
                break;
            case 12:
                iD = qrs.d(context, 16.0f);
                i3 = 4;
                i4 = i3;
                break;
            case 14:
                iD = context.getResources().getDimensionPixelSize(R.dimen.emui_card_device_8dp);
                i4 = 5;
                i3 = 3;
                break;
        }
        return b(context, i, i3, i4, iD);
    }

    private static int b(Context context, int i, int i2, int i3, int i4) {
        int iA = a();
        if (i2 < 1 || i3 < 1) {
            return iA;
        }
        int dimensionPixelSize = i == 14 ? context.getResources().getDimensionPixelSize(R.dimen.emui_card_device_4dp) : 0;
        if (qrs.af(BaseApplication.getContext())) {
            return ((iA - ((i3 - 1) * qqp.b(context))) - dimensionPixelSize) / i3;
        }
        return ((iA - ((i2 - 1) * i4)) - dimensionPixelSize) / i2;
    }

    public static int a() {
        Context activity = BaseApplication.getActivity();
        if (activity == null) {
            LogUtil.j("ConfiguredUtils", "getActivity = null");
            activity = BaseApplication.getContext();
        }
        int i = qrs.i(activity);
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        float f = i;
        try {
            float dimension = activity.getResources().getDimension(R.dimen.defaultPaddingStart);
            return (int) ((((f - dimension) - activity.getResources().getDimension(R.dimen.defaultPaddingEnd)) - ((Integer) safeRegionWidth.first).intValue()) - ((Integer) safeRegionWidth.second).intValue());
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("ConfiguredUtils", "getItemsTotalWidth dimen id is not found.");
            return i;
        }
    }

    public static void e(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("packageName", str);
        map.put(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE, str2);
        lmf.d().c(BaseApplication.getContext(), str3, map, 0);
    }

    public static int c(int i, boolean z, int i2, int i3) {
        switch (i) {
            case 1:
            case 7:
            case 8:
            case 9:
            case 11:
                if (z) {
                    return i3;
                }
                return 0;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                if (!z) {
                    return BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
                }
                return i3;
            case 10:
                if (i2 == 3) {
                    return qrs.d(BaseApplication.getContext(), 40.0f);
                }
                if (i2 == 4) {
                    return 0;
                }
                LogUtil.j("ConfiguredUtils", "LAYOUT_DISCOVER_ICON cardItemSize = ", Integer.valueOf(i2));
                return 0;
            case 12:
                int iB = b(12, z, i2);
                return (a() - qrs.d(BaseApplication.getContext(), iB * 64.0f)) / (iB - 1);
            case 13:
            default:
                return 0;
            case 14:
                if (!z) {
                    return BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.emui_card_device_8dp);
                }
                return i3;
        }
    }

    public static int b(int i) {
        if (i == 4 || i == 5 || i == 6 || i == 8 || i == 11) {
            return BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
        }
        return 0;
    }

    public static int b(int i, boolean z, int i2) {
        switch (i) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 11:
                return z ? 2 : 1;
            case 2:
            case 4:
                return z ? 4 : 2;
            case 3:
            case 5:
            case 14:
                return 3;
            case 9:
                return z ? 3 : 1;
            case 10:
                if (i2 == 3) {
                    return 3;
                }
                if (i2 == 4) {
                    return 4;
                }
                LogUtil.j("ConfiguredUtils", "getLayoutGridNumber LAYOUT_DISCOVER_ICON cardItemSize = ", Integer.valueOf(i2));
                return 1;
            case 12:
                return z ? 8 : 4;
            case 13:
            default:
                return 1;
        }
    }

    public static int[] a(int i, int i2) {
        int[] iArr = new int[4];
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        if (i2 == 7) {
            iArr[0] = 0;
            iArr[2] = 0;
            iArr[1] = qrs.d(BaseApplication.getContext(), 4.0f);
            iArr[3] = qrs.d(BaseApplication.getContext(), 4.0f);
            return iArr;
        }
        iArr[1] = 0;
        iArr[3] = 0;
        iArr[0] = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart) + ((Integer) safeRegionWidth.first).intValue();
        iArr[2] = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd) + ((Integer) safeRegionWidth.second).intValue();
        return iArr;
    }

    public static BaseActivity d() {
        Activity activity = BaseApplication.getActivity();
        if (activity instanceof BaseActivity) {
            return (BaseActivity) activity;
        }
        return null;
    }
}
