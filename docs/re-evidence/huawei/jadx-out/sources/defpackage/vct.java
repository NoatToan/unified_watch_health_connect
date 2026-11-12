package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwarkuix.oHBrigdePlugin.health.UICustomizeBridge;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.datatype.BaseDeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceBenefits;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.trade.datatype.DevicePerfPurchaseInfo;
import com.huawei.trade.datatype.Product;
import com.huawei.ui.commonui.dialog.VibrantLifeDialog;
import com.huawei.ui.main.R;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class vct {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f50943b;
    private static long d;
    private static long e;

    public static boolean a(long j, long j2) {
        long jH = ltb.h();
        return jH > j && jH < j2;
    }

    public static long c(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -i);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final Context context, final BaseDeviceBenefitInfo baseDeviceBenefitInfo, Drawable drawable, int i, int i2) {
        if (context == null || baseDeviceBenefitInfo == null || drawable == null) {
            LogUtil.e("EquityUtils", "showEquityDialog failed, empty param");
            return;
        }
        String deviceName = baseDeviceBenefitInfo.getDeviceName();
        String strE = e(baseDeviceBenefitInfo);
        if (TextUtils.isEmpty(deviceName) || TextUtils.isEmpty(strE)) {
            LogUtil.e("EquityUtils", "showEquityDialog failed, deviceName or benefitsTime empty");
            return;
        }
        ReleaseLogUtil.d("R_EquityUtils", "showEquityDialog");
        a(i2, i);
        final VibrantLifeDialog vibrantLifeDialog = new VibrantLifeDialog(context);
        vibrantLifeDialog.a(drawable);
        String str = String.format(Locale.ENGLISH, context.getResources().getString(R.string.IDS_equity_first), deviceName);
        String str2 = String.format(Locale.ENGLISH, context.getResources().getString(R.string.IDS_equity_guardian_service), strE);
        LogUtil.a("EquityUtils", "showVibrantLifeDialog,", str, str2);
        vibrantLifeDialog.a(str);
        vibrantLifeDialog.d(str2);
        vibrantLifeDialog.a(R.string.IDS_hw_activate_text);
        vibrantLifeDialog.d(new View.OnClickListener() { // from class: vct.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("EquityUtils", "onclick activate");
                vct.e(1, context, 1);
                Context context2 = context;
                BaseDeviceBenefitInfo baseDeviceBenefitInfo2 = baseDeviceBenefitInfo;
                irz.e(context2, baseDeviceBenefitInfo2, 6, ((DeviceInboxInfo) baseDeviceBenefitInfo2).getDeviceBenefitInfos());
                vibrantLifeDialog.dismiss();
            }
        });
        d(1, context, (int) (System.currentTimeMillis() - d));
        vibrantLifeDialog.enqueueShowing(vibrantLifeDialog);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: vct.4
            @Override // java.lang.Runnable
            public void run() {
                ObserverManagerUtil.e("EQUITY_AND_VIBRANT", new Object[0]);
            }
        }, 800L);
    }

    private static String e(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        String strD;
        if (baseDeviceBenefitInfo instanceof DeviceInboxInfo) {
            strD = irx.e((DeviceInboxInfo) baseDeviceBenefitInfo);
        } else if (baseDeviceBenefitInfo instanceof DevicePerfPurchaseInfo) {
            strD = irx.d((DevicePerfPurchaseInfo) baseDeviceBenefitInfo);
        } else {
            LogUtil.e("EquityUtils", "getBenefitsTimeStr unknown deviceBenefitInfo type ", baseDeviceBenefitInfo);
            return "";
        }
        if (strD != null) {
            return irz.b(strD);
        }
        return irz.b(Product.YEAR_DURATION_FLAG);
    }

    private static void a(int i, int i2) {
        String str;
        String str2;
        String str3;
        if (i == 1) {
            str = "FRAGMENT_SHOW_DIALOG";
            str2 = "FRAGMENT_SHOW_DIALOG_COUNT";
            str3 = "FRAGMENT_START_TIME";
        } else {
            str = UICustomizeBridge.IS_FIRST_LOGIN_SHOW_DIALOG;
            str2 = UICustomizeBridge.SHOW_DIALOG_COUNT;
            str3 = UICustomizeBridge.START_TIME;
        }
        qrg.a(str, false);
        e = System.currentTimeMillis();
        qrg.b(str2, i2 + 1);
        qrg.b(str3, e);
    }

    public static void b(Object obj, Context context, int i, long j, int i2) {
        if (obj == null) {
            ReleaseLogUtil.d("R_EquityUtils", "objData  = ", null);
            return;
        }
        List<DeviceBenefits> list = (List) obj;
        if (njy.e(list)) {
            LogUtil.d("EquityUtils", "deviceBenefitsList  =  null ");
            return;
        }
        ReleaseLogUtil.d("R_EquityUtils", "startTime : ", Long.valueOf(j), ", showDialogCount : ", Integer.valueOf(i2), ", tag : ", Integer.valueOf(i), ", deviceBenefitsList== ", Integer.valueOf(list.size()));
        for (DeviceBenefits deviceBenefits : list) {
            List<DeviceInboxInfo> inboxInfos = deviceBenefits.getInboxInfos();
            LogUtil.a("EquityUtils", "inboxInfos  = ", inboxInfos);
            if (!njy.e(inboxInfos)) {
                for (DeviceInboxInfo deviceInboxInfo : inboxInfos) {
                    deviceInboxInfo.setDeviceBenefitInfos(deviceBenefits.getBenefitInfos());
                    deviceInboxInfo.setDeviceSn(deviceBenefits.getDeviceSn());
                    b((BaseDeviceBenefitInfo) deviceInboxInfo, context, i, j, i2);
                }
            }
            List<DevicePerfPurchaseInfo> perfPurchaseInfos = deviceBenefits.getPerfPurchaseInfos();
            if (!njy.e(perfPurchaseInfos)) {
                for (DevicePerfPurchaseInfo devicePerfPurchaseInfo : perfPurchaseInfos) {
                    LogUtil.a("EquityUtils", "purchaseInfo  = ", devicePerfPurchaseInfo);
                    devicePerfPurchaseInfo.setDeviceSn(deviceBenefits.getDeviceSn());
                    b((BaseDeviceBenefitInfo) devicePerfPurchaseInfo, context, i, j, i2);
                }
            }
        }
    }

    public static void a(int i, Context context) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("equityType", Integer.valueOf(i));
        String strValue = AnalyticsValue.VIBRANT_LIFE_AND_EQUITY_NO_LOGIN_EVENT.value();
        lmf.d().c(context, strValue, map, 0);
        LogUtil.d("EquityUtils", i + ", equityType," + strValue);
    }

    public static void e(int i, Context context, int i2) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("equityType", Integer.valueOf(i));
        map.put("event", Integer.valueOf(i2));
        String strValue = AnalyticsValue.VIBRANT_LIFE_AND_EQUITY_CLICK_EVENT.value();
        lmf.d().c(context, strValue, map, 0);
        LogUtil.d("EquityUtils", i + ", equityType," + strValue + "event," + i2);
    }

    public static void d(int i, Context context, int i2) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("equityType", Integer.valueOf(i));
        map.put("duration", Integer.valueOf(i2));
        String strValue = AnalyticsValue.VIBRANT_LIFE_AND_EQUITY_SHOWTIME_EVENT.value();
        lmf.d().c(context, strValue, map, 0);
        LogUtil.d("EquityUtils", i + ", equityType," + strValue + "duration," + i2);
    }

    public static void b(BaseDeviceBenefitInfo baseDeviceBenefitInfo, Context context, int i, long j, int i2) {
        int benefitType = baseDeviceBenefitInfo.getBenefitType();
        ReleaseLogUtil.d("R_EquityUtils", "benefitType== ", Integer.valueOf(benefitType));
        if (benefitType != 2) {
            return;
        }
        int activeStatus = baseDeviceBenefitInfo.getActiveStatus();
        boolean zA = a(baseDeviceBenefitInfo.getEffectiveStartTime(), baseDeviceBenefitInfo.getEffectiveEndTime());
        int i3 = 1;
        if (activeStatus == 1 && zA) {
            a(1, context);
            if (i == 1) {
                i3 = 3;
            } else if (i != 2) {
                LogUtil.j("EquityUtils", "tag error");
                return;
            }
            long jC = c(7);
            f50943b = jC;
            ReleaseLogUtil.d("R_EquityUtils", "startTime：", Long.valueOf(j), " intervalDays:", Long.valueOf(jC), " showDialogCount:", Integer.valueOf(i2), " maxTimes:", Integer.valueOf(i3));
            if (j == 0 || (j < f50943b && i2 < i3)) {
                e(baseDeviceBenefitInfo, context, i, i2);
            }
        }
    }

    private static void e(final BaseDeviceBenefitInfo baseDeviceBenefitInfo, final Context context, final int i, final int i2) {
        String strD = d(baseDeviceBenefitInfo);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("EquityUtils", "get empty background");
            return;
        }
        d = System.currentTimeMillis();
        final Drawable drawableB = qqf.b(context, strD);
        HandlerExecutor.b(new Runnable() { // from class: vcv
            @Override // java.lang.Runnable
            public final void run() {
                vct.e(context, baseDeviceBenefitInfo, drawableB, i2, i);
            }
        });
    }

    private static String d(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        if (baseDeviceBenefitInfo instanceof DeviceInboxInfo) {
            return ((DeviceInboxInfo) baseDeviceBenefitInfo).getIntroductionUrl();
        }
        if (baseDeviceBenefitInfo instanceof DevicePerfPurchaseInfo) {
            return ((DevicePerfPurchaseInfo) baseDeviceBenefitInfo).getBackgroundUrl();
        }
        LogUtil.e("EquityUtils", "getBackgroundUrl unknown deviceBenefitInfo type ", baseDeviceBenefitInfo);
        return "";
    }
}
