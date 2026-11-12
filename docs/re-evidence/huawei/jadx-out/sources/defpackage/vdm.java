package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.datatype.BaseDeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceBenefits;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.trade.datatype.DevicePerfPurchaseInfo;
import com.huawei.trade.datatype.Product;
import com.huawei.ui.commonui.dialog.VibrantLifeDialog;
import com.huawei.ui.main.R;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class vdm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f50965b;

    public static void e(Object obj, Context context) {
        if (obj instanceof List) {
            List<DeviceBenefits> list = (List) obj;
            if (njy.e(list)) {
                LogUtil.j("VibrantLifeMemberUtils", "deviceBenefitsList is empty!");
                return;
            }
            ReleaseLogUtil.d("R_VibrantLifeMemberUtils", "deviceBenefitsList size = ", Integer.valueOf(list.size()));
            for (DeviceBenefits deviceBenefits : list) {
                List<DeviceBenefitInfo> benefitInfos = deviceBenefits.getBenefitInfos();
                List<DeviceInboxInfo> inboxInfos = deviceBenefits.getInboxInfos();
                if (!njy.e(inboxInfos)) {
                    for (DeviceInboxInfo deviceInboxInfo : inboxInfos) {
                        deviceInboxInfo.setDeviceBenefitInfos(benefitInfos);
                        deviceInboxInfo.setDeviceSn(deviceBenefits.getDeviceSn());
                        e(deviceInboxInfo, context, deviceBenefits.getDeviceSn());
                    }
                }
                List<DevicePerfPurchaseInfo> perfPurchaseInfos = deviceBenefits.getPerfPurchaseInfos();
                if (!njy.e(perfPurchaseInfos)) {
                    for (DevicePerfPurchaseInfo devicePerfPurchaseInfo : perfPurchaseInfos) {
                        devicePerfPurchaseInfo.setDeviceSn(deviceBenefits.getDeviceSn());
                        e(devicePerfPurchaseInfo, context, deviceBenefits.getDeviceSn());
                    }
                }
            }
            return;
        }
        ReleaseLogUtil.d("R_VibrantLifeMemberUtils", "objData", null);
    }

    private static void e(BaseDeviceBenefitInfo baseDeviceBenefitInfo, Context context, String str) {
        if (baseDeviceBenefitInfo.getBenefitType() == 1 && baseDeviceBenefitInfo.getActiveStatus() == 1 && b(baseDeviceBenefitInfo.getEffectiveStartTime(), baseDeviceBenefitInfo.getEffectiveEndTime())) {
            a(baseDeviceBenefitInfo, context, str);
        }
    }

    public static void a(BaseDeviceBenefitInfo baseDeviceBenefitInfo, Context context, String str) {
        LogUtil.a("VibrantLifeMemberUtils", "benefitType,", Integer.valueOf(baseDeviceBenefitInfo.getBenefitType()), "deviceBenefitInfo, ", baseDeviceBenefitInfo);
        int activeStatus = baseDeviceBenefitInfo.getActiveStatus();
        boolean zB = b(baseDeviceBenefitInfo.getEffectiveStartTime(), baseDeviceBenefitInfo.getEffectiveEndTime());
        ReleaseLogUtil.d("R_VibrantLifeMemberUtils", "deviceBenefitInfo,", Integer.valueOf(activeStatus), Boolean.valueOf(zB));
        if (activeStatus == 1 && zB) {
            vct.a(2, context);
            boolean z = baseDeviceBenefitInfo instanceof DeviceInboxInfo;
            long jC = irz.c(z, str);
            ReleaseLogUtil.d("R_VibrantLifeMemberUtils", "ShowBenefitDialog isInbox:", Boolean.valueOf(z), " lastShowDialogTime:", Long.valueOf(jC));
            if (wig.a(jC, System.currentTimeMillis())) {
                e(context, baseDeviceBenefitInfo, z, str);
            }
        }
    }

    private static void e(Context context, BaseDeviceBenefitInfo baseDeviceBenefitInfo, boolean z, String str) {
        if (context == null || ((context instanceof Activity) && ((Activity) context).isDestroyed())) {
            LogUtil.e("VibrantLifeMemberUtils", "startShowDialog failed, cause app has been destroyed!");
            return;
        }
        f50965b = System.currentTimeMillis();
        a(context, baseDeviceBenefitInfo);
        irz.a(z, str);
    }

    private static void a(final Context context, final BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        String strD;
        int iB;
        String backgroundUrl;
        String strD2;
        int i = R.string.IDS_user_member_content;
        if (baseDeviceBenefitInfo instanceof DeviceInboxInfo) {
            DeviceInboxInfo deviceInboxInfo = (DeviceInboxInfo) baseDeviceBenefitInfo;
            strD = irx.e(deviceInboxInfo);
            backgroundUrl = deviceInboxInfo.getIntroductionUrl();
            iB = 1;
        } else if (baseDeviceBenefitInfo instanceof DevicePerfPurchaseInfo) {
            DevicePerfPurchaseInfo devicePerfPurchaseInfo = (DevicePerfPurchaseInfo) baseDeviceBenefitInfo;
            strD = irx.d(devicePerfPurchaseInfo);
            iB = irz.b(devicePerfPurchaseInfo);
            backgroundUrl = devicePerfPurchaseInfo.getBackgroundUrl();
            i = R.string.IDS_user_member_has_pick_device_tip;
        } else {
            LogUtil.e("VibrantLifeMemberUtils", "showVibrantLifeDialog unknown deviceBenefitInfo type ", baseDeviceBenefitInfo);
            return;
        }
        if (strD != null) {
            strD2 = irz.d(strD, iB);
        } else {
            strD2 = irz.d(Product.YEAR_DURATION_FLAG, iB);
        }
        final String str = String.format(Locale.ENGLISH, context.getResources().getString(i), strD2);
        vct.e(2, context, 0);
        final Drawable drawableB = qqf.b(context, backgroundUrl);
        HandlerExecutor.b(new Runnable() { // from class: vdq
            @Override // java.lang.Runnable
            public final void run() {
                vdm.b(context, baseDeviceBenefitInfo, drawableB, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final Context context, final BaseDeviceBenefitInfo baseDeviceBenefitInfo, Drawable drawable, String str) {
        ReleaseLogUtil.d("R_VibrantLifeMemberUtils", "scheduleShowDialog");
        final VibrantLifeDialog vibrantLifeDialog = new VibrantLifeDialog(context);
        if (drawable == null) {
            LogUtil.j("VibrantLifeMemberUtils", "drawable is null");
        }
        vibrantLifeDialog.a(drawable);
        String str2 = String.format(Locale.ENGLISH, context.getResources().getString(R.string.IDS_equity_first), baseDeviceBenefitInfo.getDeviceName());
        LogUtil.a("VibrantLifeMemberUtils", "showVibrantLifeDialog,", str2, str);
        vibrantLifeDialog.a(str2);
        vibrantLifeDialog.d(str);
        vct.d(2, context, (int) (System.currentTimeMillis() - f50965b));
        vibrantLifeDialog.d(new View.OnClickListener() { // from class: vdn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vdm.c(context, baseDeviceBenefitInfo, vibrantLifeDialog, view);
            }
        });
        vibrantLifeDialog.enqueueShowing(vibrantLifeDialog);
        ObserverManagerUtil.e("EQUITY_AND_VIBRANT", new Object[0]);
    }

    static /* synthetic */ void c(Context context, BaseDeviceBenefitInfo baseDeviceBenefitInfo, VibrantLifeDialog vibrantLifeDialog, View view) {
        vct.e(2, context, 1);
        if (baseDeviceBenefitInfo instanceof DeviceInboxInfo) {
            DeviceInboxInfo deviceInboxInfo = (DeviceInboxInfo) baseDeviceBenefitInfo;
            irz.e(context, deviceInboxInfo, 6, deviceInboxInfo.getDeviceBenefitInfos());
        } else {
            irz.e(context, baseDeviceBenefitInfo, 6, (List<DeviceBenefitInfo>) null);
        }
        vibrantLifeDialog.dismiss();
    }

    public static boolean b(long j, long j2) {
        long jH = ltb.h();
        return jH > j && jH < j2;
    }
}
