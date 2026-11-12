package com.huawei.ui.device.activity.pairing;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDataSourceFetchOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.device.R;
import defpackage.edl;
import defpackage.eey;
import defpackage.lvi;
import health.compact.a.Services;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class DevicePairGuideUtil {
    private static String d;

    public interface ShowKidDialogCallback {
        void onResult(boolean z);
    }

    public static void e(String str) {
        d = str;
    }

    public static String b() {
        return d;
    }

    public static void b(int i, ImageView imageView) {
        if (imageView == null) {
            LogUtil.a("DevicePairGuideUtil", "pairResultDeviceImage is null");
            return;
        }
        if (i != 5) {
            if (i != 18 && i != 7) {
                if (i != 8) {
                    if (i != 23 && i != 24 && i != 36 && i != 37) {
                        switch (i) {
                            case 10:
                                break;
                            case 11:
                                imageView.setImageResource(R.drawable.icon_head_setpair);
                                break;
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                                break;
                            default:
                                Bitmap bitmapD = d(i);
                                if (bitmapD == null) {
                                    c(i, imageView);
                                } else {
                                    imageView.setImageBitmap(bitmapD);
                                }
                                break;
                        }
                        return;
                    }
                }
            }
            imageView.setImageResource(R.drawable.icon_hand_pair);
            return;
        }
        imageView.setImageResource(R.drawable.icon_watch_pair);
    }

    private static void c(int i, ImageView imageView) {
        if (lvi.a(i).m() == 2) {
            imageView.setImageResource(R.drawable.icon_watch_pair_squares);
            return;
        }
        int iF = lvi.a(i).f();
        if (iF != -1) {
            if (iF == 1) {
                imageView.setImageResource(R.drawable.icon_hand_pair);
                return;
            }
            if (iF == 2) {
                imageView.setImageResource(R.drawable.icon_watch_pair);
                return;
            }
            if (iF == 6) {
                imageView.setImageResource(R.drawable.icon_sports_genie_pair);
            } else if (iF == 3) {
                imageView.setImageResource(R.drawable.icon_head_setpair);
            } else {
                LogUtil.j("DevicePairGuideUtil", "setImageResourceByType default.");
            }
        }
    }

    public static Bitmap d(int i) {
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(lvi.j(i));
        if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
            return null;
        }
        String strBi = pluginInfoByUuid.i().bi();
        LogUtil.a("DevicePairGuideUtil", "pairProcessOtherAnimation imageName: ", strBi);
        if (!TextUtils.isEmpty(strBi)) {
            return ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(pluginInfoByUuid, strBi);
        }
        LogUtil.j("DevicePairGuideUtil", "handlerIsPluginDownload imageName not contains productId");
        return null;
    }

    public static void d(final DeviceInfo deviceInfo, final ShowKidDialogCallback showKidDialogCallback) {
        if (deviceInfo == null || showKidDialogCallback == null) {
            LogUtil.j("DevicePairGuideUtil", "deviceInfo == null or callback == null");
            return;
        }
        boolean zIsKidAccount = LoginInit.getInstance(BaseApplication.getContext()).isKidAccount();
        boolean zD = eey.d(deviceInfo, 110);
        if (!eey.d(deviceInfo, 269) && zIsKidAccount && zD) {
            LogUtil.a("DevicePairGuideUtil", "isKidAccount:", Boolean.valueOf(zIsKidAccount), ", isUnSupportKid:", Boolean.valueOf(zD));
            HiHealthNativeApi.a(BaseApplication.getContext()).fetchDataSource(HiDataSourceFetchOption.builder().c(0).a(), new HiDataClientListener() { // from class: com.huawei.ui.device.activity.pairing.DevicePairGuideUtil.5
                @Override // com.huawei.hihealth.data.listener.HiDataClientListener
                public void onResult(List<HiHealthClient> list) {
                    String strReplace;
                    if (list == null) {
                        LogUtil.j("DevicePairGuideUtil", "clientList is null need show kid dialog");
                        showKidDialogCallback.onResult(true);
                        return;
                    }
                    String deviceName = deviceInfo.getDeviceName();
                    if (TextUtils.isEmpty(deviceName)) {
                        LogUtil.j("DevicePairGuideUtil", "currentDeviceName is empty.");
                        showKidDialogCallback.onResult(false);
                        return;
                    }
                    LogUtil.a("DevicePairGuideUtil", "currentDeviceName:", deviceName);
                    String[] strArrSplit = deviceName.split("\\-");
                    if (strArrSplit.length > 2) {
                        strReplace = deviceName.replace(Constants.LINK + strArrSplit[strArrSplit.length - 1], "");
                    } else if (strArrSplit.length == 2) {
                        strReplace = strArrSplit[0];
                    } else {
                        showKidDialogCallback.onResult(false);
                        return;
                    }
                    showKidDialogCallback.onResult(!DevicePairGuideUtil.b(strReplace, list));
                }
            });
            return;
        }
        showKidDialogCallback.onResult(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str, List<HiHealthClient> list) {
        boolean z;
        Iterator<HiHealthClient> it = list.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            HiDeviceInfo hiDeviceInfo = it.next().getHiDeviceInfo();
            if (hiDeviceInfo != null) {
                String deviceName = hiDeviceInfo.getDeviceName();
                if (TextUtils.isEmpty(deviceName)) {
                    continue;
                } else {
                    String[] strArrSplit = deviceName.split("\\-");
                    LogUtil.a("DevicePairGuideUtil", "deviceName:", deviceName);
                    if (strArrSplit.length > 2) {
                        deviceName = deviceName.replace(Constants.LINK + strArrSplit[strArrSplit.length - 1], "");
                    }
                    if (strArrSplit.length == 2) {
                        deviceName = strArrSplit[0];
                    }
                    if (str.equalsIgnoreCase(deviceName)) {
                        LogUtil.a("DevicePairGuideUtil", "device equals deviceName:", deviceName, ", currentDeviceName:", str);
                        z = true;
                        break;
                    }
                }
            }
        }
        LogUtil.a("DevicePairGuideUtil", "isBindDevice：", Boolean.valueOf(z));
        return z;
    }
}
