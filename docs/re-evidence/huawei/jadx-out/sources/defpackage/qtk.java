package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceBindingFragment;
import com.huawei.health.versionmgr.api.VersionMgrApi;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.device.R;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class qtk {
    private static boolean b(int i) {
        return i == 3 || i == 10 || i == 32;
    }

    public static boolean c(edl edlVar, int i, int i2) {
        int iIntValue = -1;
        if (i == -1) {
            LogUtil.j("AddDeviceChildUtils", "deviceType is -1");
            return true;
        }
        boolean zE = e(i);
        if (edlVar == null || edlVar.i() == null) {
            ReleaseLogUtil.e("R_AddDeviceChildUtils", "ezPluginInfo is null or WearDeviceInfo is null");
            return zE;
        }
        Map<String, Integer> mapA = edlVar.i().a();
        if (mapA == null) {
            ReleaseLogUtil.e("R_AddDeviceChildUtils", "appVersionMap is null");
            return zE;
        }
        if (Utils.o()) {
            if (mapA.get("overseas") != null) {
                iIntValue = mapA.get("overseas").intValue();
            }
        } else if (mapA.get("domestic") != null) {
            iIntValue = mapA.get("domestic").intValue();
        }
        if (iIntValue <= 0) {
            LogUtil.j("AddDeviceChildUtils", "appversion <= 0");
            return zE;
        }
        boolean z = iIntValue > i2;
        ReleaseLogUtil.d("R_AddDeviceChildUtils", "appversion", edlVar.i().a());
        LogUtil.a("AddDeviceChildUtils", "CommonUtil.getAppVersion(mContext)", Integer.valueOf(i2));
        return z;
    }

    private static boolean e(int i) {
        HashMap<String, Integer> mapF = lvi.f();
        LogUtil.a("AddDeviceChildUtils", "getDefaultUpdate() :", Integer.valueOf(i), " uuidTypeMap:", Boolean.valueOf(mapF == null));
        if (mapF == null) {
            return true;
        }
        for (Map.Entry<String, Integer> entry : mapF.entrySet()) {
            if (entry != null && entry.getKey() != null) {
                if ((mapF.get(entry.getKey()) != null ? mapF.get(entry.getKey()).intValue() : 0) == i) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int a(edl edlVar) {
        if (edlVar == null) {
            return -1;
        }
        String strC = edlVar.c();
        LogUtil.a("AddDeviceChildUtils", "getDeviceTypeOfPluginInfo pluginUuid is ", strC);
        int iB = lvi.b(strC);
        if (iB != -1) {
            return iB;
        }
        LogUtil.a("AddDeviceChildUtils", "getDeviceTypeOfPluginInfo");
        lvi.b(edlVar);
        return lvi.b(strC);
    }

    public static void d(Context context, Activity activity) {
        c(context, activity, false);
    }

    public static void c(Context context, final Activity activity, final boolean z) {
        try {
            final Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=com.huawei.health"));
            intent.addFlags(268435456);
            if (!lsj.c(context, "com.huawei.appmarket")) {
                LogUtil.a("AddDeviceChildUtils", "Not installed Market");
                qpx.e(activity, context.getResources().getString(R.string.IDS_main_sns_app_store_content));
                d(activity, z);
            } else {
                intent.setPackage("com.huawei.appmarket");
                qrs.e("com.huawei.appmarket", activity, activity.getString(R.string.IDS_device_fragment_application_market), new View.OnClickListener() { // from class: qtr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        qtk.b(activity, intent, z);
                    }
                }, new View.OnClickListener() { // from class: qtp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        qtk.d(activity, z);
                    }
                });
            }
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("AddDeviceChildUtils", "jumpToMarket ActivityNotFoundException");
        }
    }

    public static void a(Context context, Activity activity) {
        try {
            if (lsj.c(context, "com.android.vending") && lsn.c(context)) {
                LogUtil.a("AddDeviceChildUtils", "jumpToGooglePlayOrAppGallery GooglePlay is installed");
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=" + context.getPackageName()));
                intent.addFlags(268435456);
                intent.setPackage("com.android.vending");
                activity.startActivity(intent);
                return;
            }
            if (lsj.c(context, "com.huawei.appmarket")) {
                LogUtil.a("AddDeviceChildUtils", "jumpToGooglePlayOrAppGallery AppGallery is installed");
                Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=" + context.getPackageName()));
                intent2.addFlags(268435456);
                intent2.setPackage("com.huawei.appmarket");
                activity.startActivity(intent2);
                return;
            }
            LogUtil.j("AddDeviceChildUtils", "jumpToGooglePlayOrAppGallery Not installed GooglePlay and AppGallery");
            c(context, activity);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("AddDeviceChildUtils", "jumpToGooglePlayOrAppGallery ActivityNotFoundException");
        }
    }

    private static void c(Context context, Activity activity) {
        e(context, activity, false);
    }

    private static void e(final Context context, final Activity activity, final boolean z) {
        ThreadPoolManager.c().a("jumpToAppGalleryView", new Runnable() { // from class: qtk.3
            @Override // java.lang.Runnable
            public void run() {
                String commonCountryCode = GRSManager.c(context).getCommonCountryCode();
                String noCheckUrl = GRSManager.c(context).getNoCheckUrl("domainUrlDreCloudHuawei", commonCountryCode);
                LogUtil.a("AddDeviceChildUtils", "jumpToGooglePlayOrAppGallery countryCode:", commonCountryCode);
                if (TextUtils.isEmpty(noCheckUrl)) {
                    LogUtil.j("AddDeviceChildUtils", "jumpToGooglePlayOrAppGallery appGalleryUrl is invalid");
                } else {
                    activity.runOnUiThread(new RunnableC03573(noCheckUrl));
                }
            }

            /* JADX INFO: renamed from: qtk$3$3, reason: invalid class name and collision with other inner class name */
            class RunnableC03573 implements Runnable {
                final /* synthetic */ String d;

                RunnableC03573(String str) {
                    this.d = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    final Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(this.d + "/97J6mTfn5S"));
                    PackageManager packageManager = activity.getPackageManager();
                    if (packageManager != null) {
                        LogUtil.a("AddDeviceChildUtils", "jumpToBrowserDownload packageManager is not null");
                        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                        if (resolveInfoResolveActivity != null) {
                            LogUtil.a("AddDeviceChildUtils", "jumpToBrowserDownload resolveInfo is not null");
                            intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
                            String str = resolveInfoResolveActivity.activityInfo.packageName;
                            Activity activity = activity;
                            String string = activity.getString(R.string.IDS_browser_app_name);
                            final Activity activity2 = activity;
                            final boolean z = z;
                            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: qts
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    qtk.AnonymousClass3.RunnableC03573.e(activity2, intent, z, view);
                                }
                            };
                            final Activity activity3 = activity;
                            final boolean z2 = z;
                            qrs.e(str, activity, string, onClickListener, new View.OnClickListener() { // from class: qty
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    qtk.d(activity3, z2);
                                }
                            });
                        }
                    }
                }

                static /* synthetic */ void e(Activity activity, Intent intent, boolean z, View view) {
                    activity.startActivity(intent);
                    qtk.d(activity, z);
                }
            }
        });
    }

    public static void e(Context context, Activity activity) {
        a(context, activity, true);
    }

    public static void a(Context context, Activity activity, boolean z) {
        boolean zBg = CommonUtil.bg();
        boolean zO = Utils.o();
        VersionMgrApi versionMgrApi = (VersionMgrApi) Services.b("HWVersionMgr", VersionMgrApi.class);
        boolean zHaveNewAppVersion = versionMgrApi.haveNewAppVersion(context);
        if (!zO) {
            if (zBg || !zHaveNewAppVersion) {
                i(context, activity, z);
                return;
            } else {
                c(context, activity, versionMgrApi, z);
                return;
            }
        }
        if (!nvd.j() && (lsj.c(context, "com.huawei.appmarket") || !zHaveNewAppVersion)) {
            i(context, activity, z);
        } else {
            c(context, activity, versionMgrApi, z);
        }
    }

    private static void i(final Context context, final Activity activity, final boolean z) {
        NoTitleCustomAlertDialog.Builder builderA = new NoTitleCustomAlertDialog.Builder(activity).a(context.getResources().getString(R.string.IDS_device_mgr_no_support_device_tips) + System.lineSeparator() + context.getResources().getString(R.string.IDS_device_mgr_no_support_device_common_content)).c(R.string.IDS_device_to_go_into_app_market, new View.OnClickListener() { // from class: qtk.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean zBg = CommonUtil.bg();
                boolean zO = Utils.o();
                rdt.b(100097, "");
                LogUtil.a("AddDeviceChildUtils", "noSupportDevice isHuaweiSystem:", Boolean.valueOf(zBg), " isOverSea:", Boolean.valueOf(zO));
                if (zBg && !zO) {
                    qtk.c(context, activity, z);
                } else if (zO) {
                    qtk.b(context, activity, z);
                } else {
                    qtk.e(activity, z);
                }
            }
        }).a(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: qtk.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Activity activity2;
                rdt.b(100098, "");
                if (!z || (activity2 = activity) == null || activity2.isFinishing()) {
                    return;
                }
                activity.finish();
            }
        });
        if (activity.isFinishing()) {
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builderA.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, final Activity activity, final boolean z) {
        try {
            if (lsj.c(context, "com.huawei.appmarket")) {
                LogUtil.a("AddDeviceChildUtils", "jumpToAppGallery AppGallery is installed");
                final Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=com.huawei.health"));
                intent.addFlags(268435456);
                intent.setPackage("com.huawei.appmarket");
                qrs.e("com.huawei.appmarket", activity, activity.getString(R.string.IDS_device_fragment_application_market), new View.OnClickListener() { // from class: qtq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        qtk.d(activity, intent, z, view);
                    }
                }, new View.OnClickListener() { // from class: qtt
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        qtk.d(activity, z);
                    }
                });
                return;
            }
            LogUtil.j("AddDeviceChildUtils", "jumpToAppGallery Not installed AppGallery");
            e(context, activity, z);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("AddDeviceChildUtils", "jumpToAppGallery ActivityNotFoundException");
        }
    }

    static /* synthetic */ void d(Activity activity, Intent intent, boolean z, View view) {
        activity.startActivity(intent);
        d(activity, z);
    }

    private static void c(final Context context, final Activity activity, final VersionMgrApi versionMgrApi, final boolean z) {
        NoTitleCustomAlertDialog.Builder builderA = new NoTitleCustomAlertDialog.Builder(activity).a(context.getResources().getString(R.string.IDS_hw_update_app_tips)).c(R.string.IDS_app_update_now, new View.OnClickListener() { // from class: qtk.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Activity activity2;
                rdt.b(100097, "");
                versionMgrApi.downloadAppPackage();
                Context context2 = context;
                qpx.b(context2, context2.getString(R.string.IDS_app_updating_background));
                if (!z || (activity2 = activity) == null || activity2.isFinishing()) {
                    return;
                }
                activity.finish();
            }
        }).a(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: qtk.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Activity activity2;
                rdt.b(100098, "");
                if (!z || (activity2 = activity) == null || activity2.isFinishing()) {
                    return;
                }
                activity.finish();
            }
        });
        if (activity.isFinishing()) {
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builderA.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final Activity activity, final boolean z) {
        lsy.a(new Runnable() { // from class: qtk.6

            /* JADX INFO: renamed from: qtk$6$4, reason: invalid class name */
            class AnonymousClass4 implements Runnable {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f46815b;

                AnonymousClass4(String str) {
                    this.f46815b = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    final Intent intent = new Intent();
                    intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                    intent.setData(Uri.parse(this.f46815b + "/1Lfn1eswP6"));
                    PackageManager packageManager = activity.getPackageManager();
                    if (packageManager != null) {
                        LogUtil.a("AddDeviceChildUtils", "jumpToBrowserDownload packageManager is not null");
                        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                        if (resolveInfoResolveActivity != null) {
                            LogUtil.a("AddDeviceChildUtils", "jumpToBrowserDownload resolveInfo is not null");
                            intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
                            String str = resolveInfoResolveActivity.activityInfo.packageName;
                            Activity activity = activity;
                            String string = activity.getString(R.string.IDS_browser_app_name);
                            final Activity activity2 = activity;
                            final boolean z = z;
                            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: qtu
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    qtk.b(activity2, intent, z);
                                }
                            };
                            final Activity activity3 = activity;
                            final boolean z2 = z;
                            qrs.e(str, activity, string, onClickListener, new View.OnClickListener() { // from class: qtw
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    qtk.d(activity3, z2);
                                }
                            });
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                activity.runOnUiThread(new AnonymousClass4(GRSManager.c(BaseApplication.getContext()).getUrl("domainUrlCloudHuawei")));
            }
        });
    }

    public static Intent a(Intent intent, int i, rcv rcvVar) {
        if (intent != null) {
            if (!b(i)) {
                intent.putExtra("pairGuideW1Success", false);
                return intent;
            }
            DeviceInfo deviceInfoD = rcvVar.d();
            if (deviceInfoD != null && deviceInfoD.getDeviceBluetoothType() != 5) {
                LogUtil.a("AddDeviceChildUtils", "enterW1PairGuide deviceInfo ", deviceInfoD.toString());
                if (b(deviceInfoD.getProductType()) && deviceInfoD.getDeviceConnectState() == 2) {
                    intent.putExtra("pairGuideW1Success", true);
                }
            }
        }
        return intent;
    }

    public static void c() {
        if (DeviceBindingFragment.getInstance() == null || DeviceBindingFragment.getInstance().get() == null) {
            return;
        }
        DeviceBindingFragment.getInstance().get().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Activity activity, Intent intent, boolean z) {
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("AddDeviceChildUtils", "startActivity exception: ");
        }
        d(activity, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Activity activity, boolean z) {
        if (!z || activity == null || activity.isFinishing()) {
            return;
        }
        activity.finish();
    }
}
