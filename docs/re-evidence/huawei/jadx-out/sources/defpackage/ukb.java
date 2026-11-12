package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.marketing.utils.EcgFilterManager;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.heartrate.WarningHRActivity;
import health.compact.a.GRSManager;
import health.compact.a.Utils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class ukb {
    public static boolean d() {
        return c() || h();
    }

    public static boolean c() {
        if (!Utils.o() && !a()) {
            DeviceCapability deviceCapabilityC = eej.c();
            if (deviceCapabilityC != null && deviceCapabilityC.isSupportEcgAuth()) {
                return true;
            }
            LogUtil.j("HealthHeartRate_HeartRateUtils", "capability is null or not support ecg");
        }
        return false;
    }

    public static boolean h() {
        EcgFilterManager ecgFilterManagerB = EcgFilterManager.b();
        if (EcgFilterManager.c() && ecgFilterManagerB.o()) {
            return ecgFilterManagerB.j();
        }
        return false;
    }

    public static boolean g() {
        return fxn.d();
    }

    public static boolean a() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "HealthHeartRate_HeartRateUtils");
        return deviceInfo == null || deviceInfo.getDeviceConnectState() != 2;
    }

    public static boolean e() {
        DeviceCapability deviceCapabilityC = eej.c();
        return deviceCapabilityC != null && deviceCapabilityC.isSupportHeartRateRaiseAlarm();
    }

    public static boolean b() {
        DeviceCapability deviceCapabilityC = eej.c();
        return deviceCapabilityC != null && deviceCapabilityC.isSupportHeartRateDownAlarm();
    }

    public static void b(String str, String str2, HealthTextView healthTextView, int i, int i2) {
        Context context = BaseApplication.getContext();
        SpannableString spannableString = new SpannableString(str);
        int length = str.length() - str2.length();
        a aVar = new a(context, i, i2);
        if (length < 0 || spannableString.toString().length() > str.length()) {
            LogUtil.j("HealthHeartRate_HeartRateUtils", "HeartRateUtils setSpan IndexOutOfBounds ");
            return;
        }
        spannableString.setSpan(aVar, length, spannableString.toString().length(), 18);
        spannableString.setSpan(new TextAppearanceSpan(context, R.style.heart_rate_content_text), length, spannableString.toString().length(), 33);
        if (healthTextView == null) {
            LogUtil.j("HealthHeartRate_HeartRateUtils", "healthHwTextView is null");
            return;
        }
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
        healthTextView.setHighlightColor(context.getResources().getColor(android.R.color.transparent));
        healthTextView.setText(spannableString);
    }

    public static class a extends ClickableSpan {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f50284b;
        private int d;
        private int e;

        public a(Context context, int i, int i2) {
            this.f50284b = context;
            this.d = i;
            this.e = i2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            LogUtil.a("MyClickableSpan", "ClickableSpan_onClick");
            if (this.f50284b != null) {
                if (this.e == 0) {
                    HashMap map = new HashMap();
                    map.put("click", 1);
                    map.put("type", Integer.valueOf(this.d));
                    lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_HOME_HEART_RATE_RECODE_JUMP_2090013.value(), map, 0);
                    WarningHRActivity.d(this.f50284b);
                }
                int i = this.e;
                if (i == 1 || i == 2) {
                    LogUtil.a("MyClickableSpan", "heart rate ecg collection or diagram measure");
                    ukb.c(this.e);
                }
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            if (textPaint != null) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }
        }
    }

    public static void c(final int i) {
        final Context context = BaseApplication.getContext();
        GRSManager.c(context).d("domainContentcenterDbankcdnNew", new GrsQueryCallback() { // from class: ukb.3
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.d("HealthHeartRate_HeartRateUtils", "Url is :", str + "/sandbox/cch5/health/weixinScan/dist/index.html#/measureGuide");
                ddv.b().initH5Pro();
                H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
                String str2 = i == 2 ? "?support=1" : "";
                H5ProClient.startH5LightApp(context, str + "/sandbox/cch5/health/weixinScan/dist/index.html#/measureGuide" + str2, builder.build());
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i2) {
                LogUtil.e("HealthHeartRate_HeartRateUtils", "onCallBackFail errorCode = ", Integer.valueOf(i2));
            }
        });
    }

    public static void a(HiDataReadResultListener hiDataReadResultListener) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        hiDataReadOption.setType(new int[]{2101, 2102});
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, hiDataReadResultListener);
    }
}
