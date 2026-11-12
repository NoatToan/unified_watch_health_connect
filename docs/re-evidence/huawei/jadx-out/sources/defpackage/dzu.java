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
import com.huawei.health.device.callback.VersionNoSupportCallback;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.pluginmgr.hwwear.bean.DeviceDownloadSourceInfo;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import health.compact.a.GRSManager;
import health.compact.a.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class dzu {
    public static boolean e(String str, String str2) {
        List<phz> listC;
        DeviceDownloadSourceInfo deviceDownloadSourceInfoG;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("VersionVerifyUtil", "getPluginIndexInfo uuid is empty");
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("VersionVerifyUtil", "getPluginIndexInfo deviceType is empty");
            return false;
        }
        if ((!Utils.o() || CommonUtil.cl()) && pip.f45449c.containsKey(str2)) {
            List<pjc> listC2 = piq.e().c(str);
            LogUtil.a("VersionVerifyUtil", "isPublishVersion devicePluginInfoBeans is ", HiJsonUtil.d(listC2));
            if (njy.b(listC2)) {
                pjc pjcVar = listC2.get(0);
                if (pjcVar.a() != null && pjcVar.a().size() > 0) {
                    deviceDownloadSourceInfoG = listC2.get(0).a().get(0).a();
                } else {
                    deviceDownloadSourceInfoG = listC2.get(0).g();
                }
                if (deviceDownloadSourceInfoG != null && deviceDownloadSourceInfoG.getSite() == 1) {
                    listC = efz.b().e(deviceDownloadSourceInfoG.getIndexName());
                } else {
                    listC = EzPluginManager.b().c(str2);
                }
            } else {
                listC = EzPluginManager.b().c(str2);
            }
        } else {
            listC = EzPluginManager.b().d();
        }
        if (listC == null) {
            LogUtil.j("VersionVerifyUtil", "deviceList == null");
            return true;
        }
        LogUtil.a("VersionVerifyUtil", "deviceList.size() = ", Integer.valueOf(listC.size()));
        for (phz phzVar : listC) {
            if (str.equals(phzVar.a())) {
                return eev.d(phzVar.f());
            }
        }
        LogUtil.j("VersionVerifyUtil", "not in the deviceList");
        return true;
    }

    public static void e(Context context, Activity activity) {
        c(context, activity, null);
    }

    public static void c(final Context context, final Activity activity, final VersionNoSupportCallback versionNoSupportCallback) {
        if (context != null && activity != null) {
            NoTitleCustomAlertDialog.Builder builderA = new NoTitleCustomAlertDialog.Builder(activity).a(context.getResources().getString(R.string.IDS_device_mgr_no_support_device_tips) + System.lineSeparator() + context.getResources().getString(R.string.IDS_device_mgr_no_support_device_common_content)).c(R.string.IDS_device_to_go_into_app_market, new View.OnClickListener() { // from class: dzu.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    boolean zBg = CommonUtil.bg();
                    boolean zO = Utils.o();
                    LogUtil.a("VersionVerifyUtil", "noSupportDevice isHuaweiSystem:", Boolean.valueOf(zBg), " isOverSea:", Boolean.valueOf(zO));
                    if (zBg && !zO) {
                        dzu.a(context, activity, versionNoSupportCallback);
                    } else if (zO) {
                        dzu.b(context, activity, versionNoSupportCallback);
                    } else {
                        dzu.b(activity, versionNoSupportCallback);
                    }
                }
            }).a(R.string.IDS_startup_wizard_cancel, new View.OnClickListener() { // from class: dzu.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    VersionNoSupportCallback versionNoSupportCallback2 = versionNoSupportCallback;
                    if (versionNoSupportCallback2 != null) {
                        versionNoSupportCallback2.onDialogClose();
                    }
                }
            });
            if (activity.isFinishing()) {
                return;
            }
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builderA.c();
            noTitleCustomAlertDialogC.setCancelable(false);
            noTitleCustomAlertDialogC.show();
            return;
        }
        LogUtil.a("VersionVerifyUtil", "noSupportDevice parameters contain null");
    }

    private static void d(final Context context, final Activity activity) {
        ThreadPoolManager.c().a("jumpToAppGalleryView", new Runnable() { // from class: dzu.4
            @Override // java.lang.Runnable
            public void run() {
                String commonCountryCode = GRSManager.c(context).getCommonCountryCode();
                String noCheckUrl = GRSManager.c(context).getNoCheckUrl("domainAppgalleryCloudHuawei", commonCountryCode);
                LogUtil.a("VersionVerifyUtil", "jumpToAppGalleryView countryCode:", commonCountryCode);
                if (TextUtils.isEmpty(noCheckUrl)) {
                    LogUtil.j("VersionVerifyUtil", "jumpToAppGalleryView appGalleryUrl is invalid");
                } else {
                    activity.runOnUiThread(new AnonymousClass5(noCheckUrl));
                }
            }

            /* JADX INFO: renamed from: dzu$4$5, reason: invalid class name */
            class AnonymousClass5 implements Runnable {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f32555c;

                AnonymousClass5(String str) {
                    this.f32555c = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    final Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(this.f32555c + "/uowap/index.html#/detailApp/C10414141"));
                    PackageManager packageManager = activity.getPackageManager();
                    if (packageManager != null) {
                        LogUtil.a("VersionVerifyUtil", "jumpToBrowserDownload packageManager is not null");
                        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                        if (resolveInfoResolveActivity != null) {
                            LogUtil.a("VersionVerifyUtil", "jumpToBrowserDownload resolveInfo is not null");
                            intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
                            String str = resolveInfoResolveActivity.activityInfo.packageName;
                            Activity activity = activity;
                            String string = activity.getString(R.string.IDS_browser_app_name);
                            final Activity activity2 = activity;
                            qrs.e(str, activity, string, new View.OnClickListener() { // from class: eab
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    activity2.startActivity(intent);
                                }
                            }, null);
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Context context, final Activity activity, final VersionNoSupportCallback versionNoSupportCallback) {
        try {
            final Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=com.huawei.health"));
            intent.addFlags(268435456);
            if (!lsj.c(context, "com.huawei.appmarket")) {
                LogUtil.a("VersionVerifyUtil", "Not installed Market");
                qpx.e(activity, context.getResources().getString(R.string.IDS_main_sns_app_store_content));
                if (versionNoSupportCallback != null) {
                    versionNoSupportCallback.onDialogClose();
                    return;
                }
                return;
            }
            intent.setPackage("com.huawei.appmarket");
            qrs.e("com.huawei.appmarket", activity, activity.getString(R.string.IDS_device_fragment_application_market), new View.OnClickListener() { // from class: dzx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dzu.d(activity, intent, versionNoSupportCallback, view);
                }
            }, new View.OnClickListener() { // from class: eaa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dzu.c(versionNoSupportCallback, view);
                }
            });
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("VersionVerifyUtil", "jumpToMarket ActivityNotFoundException");
        }
    }

    static /* synthetic */ void d(Activity activity, Intent intent, VersionNoSupportCallback versionNoSupportCallback, View view) {
        activity.startActivity(intent);
        if (versionNoSupportCallback != null) {
            versionNoSupportCallback.onDialogClose();
        }
    }

    static /* synthetic */ void c(VersionNoSupportCallback versionNoSupportCallback, View view) {
        if (versionNoSupportCallback != null) {
            versionNoSupportCallback.onDialogClose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, final Activity activity, final VersionNoSupportCallback versionNoSupportCallback) {
        try {
            if (lsj.c(context, "com.huawei.appmarket")) {
                LogUtil.a("VersionVerifyUtil", "jumpToAppGallery AppGallery is installed");
                final Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=com.huawei.health"));
                intent.addFlags(268435456);
                intent.setPackage("com.huawei.appmarket");
                qrs.e("com.huawei.appmarket", activity, activity.getString(R.string.IDS_device_fragment_application_market), new View.OnClickListener() { // from class: dzz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        dzu.a(activity, intent, versionNoSupportCallback, view);
                    }
                }, new View.OnClickListener() { // from class: dzy
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        dzu.a(versionNoSupportCallback, view);
                    }
                });
                return;
            }
            LogUtil.j("VersionVerifyUtil", "jumpToAppGallery Not installed AppGallery");
            d(context, activity);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("VersionVerifyUtil", "jumpToAppGallery ActivityNotFoundException");
        }
    }

    static /* synthetic */ void a(Activity activity, Intent intent, VersionNoSupportCallback versionNoSupportCallback, View view) {
        activity.startActivity(intent);
        if (versionNoSupportCallback != null) {
            versionNoSupportCallback.onDialogClose();
        }
    }

    static /* synthetic */ void a(VersionNoSupportCallback versionNoSupportCallback, View view) {
        if (versionNoSupportCallback != null) {
            versionNoSupportCallback.onDialogClose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final Activity activity, final VersionNoSupportCallback versionNoSupportCallback) {
        lsy.a(new Runnable() { // from class: dzu.3

            /* JADX INFO: renamed from: dzu$3$5, reason: invalid class name */
            class AnonymousClass5 implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f32550a;

                AnonymousClass5(String str) {
                    this.f32550a = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        final Intent intent = new Intent();
                        intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                        intent.setData(Uri.parse(this.f32550a + "/app/C10414141?appId=C10414141&channel=4026633"));
                        PackageManager packageManager = activity.getPackageManager();
                        if (packageManager != null) {
                            LogUtil.a("VersionVerifyUtil", "jumpToBrowserDownload packageManager is not null");
                            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                            if (resolveInfoResolveActivity != null) {
                                LogUtil.a("VersionVerifyUtil", "jumpToBrowserDownload resolveInfo is not null");
                                intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
                                String str = resolveInfoResolveActivity.activityInfo.packageName;
                                Activity activity = activity;
                                String string = activity.getString(R.string.IDS_browser_app_name);
                                final Activity activity2 = activity;
                                final VersionNoSupportCallback versionNoSupportCallback = versionNoSupportCallback;
                                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: eae
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        dzu.AnonymousClass3.AnonymousClass5.c(activity2, intent, versionNoSupportCallback, view);
                                    }
                                };
                                final VersionNoSupportCallback versionNoSupportCallback2 = versionNoSupportCallback;
                                qrs.e(str, activity, string, onClickListener, new View.OnClickListener() { // from class: ead
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        dzu.AnonymousClass3.AnonymousClass5.b(versionNoSupportCallback2, view);
                                    }
                                });
                            }
                        }
                    } catch (ActivityNotFoundException unused) {
                        LogUtil.e("VersionVerifyUtil", "jumpToBrowserDownload ActivityNotFoundException");
                    }
                }

                static /* synthetic */ void c(Activity activity, Intent intent, VersionNoSupportCallback versionNoSupportCallback, View view) {
                    activity.startActivity(intent);
                    if (versionNoSupportCallback != null) {
                        versionNoSupportCallback.onDialogClose();
                    }
                }

                static /* synthetic */ void b(VersionNoSupportCallback versionNoSupportCallback, View view) {
                    if (versionNoSupportCallback != null) {
                        versionNoSupportCallback.onDialogClose();
                    }
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                activity.runOnUiThread(new AnonymousClass5(GRSManager.c(BaseApplication.getContext()).getUrl("domainAVmall")));
            }
        });
    }
}
