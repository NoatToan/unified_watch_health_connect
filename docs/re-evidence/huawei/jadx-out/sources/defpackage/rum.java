package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbtsdk.btcommon.BluetoothSwitchStateUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.HealthButtonBarLayout;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.webview.WebViewActivity;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.callback.HonorPrivacyCallback;
import com.huawei.ui.homehealth.device.sitting.RecommendedItem;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class rum {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static CustomAlertDialog f47704a;

    public static void a(Context context, e eVar, HonorPrivacyCallback honorPrivacyCallback) {
        if (context == null) {
            LogUtil.j("HonorPrivacyUpdateUtils", "showUpdateDialog context is null.");
            return;
        }
        if (eVar == null) {
            LogUtil.j("HonorPrivacyUpdateUtils", "showUpdateDialog parameter is null.");
            return;
        }
        if (eVar.e() == null) {
            LogUtil.j("HonorPrivacyUpdateUtils", "showUpdateDialog deviceGroupInfo is null.");
            return;
        }
        if (honorPrivacyCallback == null) {
            LogUtil.j("HonorPrivacyUpdateUtils", "showUpdateDialog callback is null.");
            return;
        }
        LogUtil.a("HonorPrivacyUpdateUtils", "showUpdateDialog position: ", Integer.valueOf(eVar.d()), ", clickZoneType: ", Integer.valueOf(eVar.b()));
        View viewE = e(context, eVar, honorPrivacyCallback);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(context);
        builder.a(viewE);
        CustomAlertDialog customAlertDialogB = builder.b();
        f47704a = customAlertDialogB;
        customAlertDialogB.setCancelable(false);
        f47704a.show();
    }

    private static View e(final Context context, final e eVar, final HonorPrivacyCallback honorPrivacyCallback) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.dialog_honor_privacy_update_view, (ViewGroup) null);
        ((HealthTextView) viewInflate.findViewById(R.id.honor_privacy_main_title_tv)).setText(context.getResources().getString(R.string.IDS_honor_privacy_notify));
        ((HealthTextView) viewInflate.findViewById(R.id.honor_privacy_vice_title_tv)).setText(context.getResources().getString(R.string.IDS_honor_provide_services));
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.honor_privacy_message_tv);
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
        healthTextView.setHighlightColor(ContextCompat.getColor(context, android.R.color.transparent));
        healthTextView.setText(a(context));
        ((HealthButtonBarLayout) viewInflate.findViewById(R.id.honor_privacy_button_bar)).setDividerDrawable(context.getResources().getDrawable(R.drawable.custom_dialog_divider_vertical_trusparent, null));
        HealthButton healthButton = (HealthButton) viewInflate.findViewById(R.id.honor_privacy_btn_negative);
        HealthButton healthButton2 = (HealthButton) viewInflate.findViewById(R.id.honor_privacy_btn_positive);
        healthButton.setText(context.getResources().getString(R.string.IDS_common_disagree));
        healthButton2.setText(context.getResources().getString(R.string.IDS_hw_show_agree));
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: rum.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("HonorPrivacyUpdateUtils", "getUpdateDialogView click no agree.");
                rum.c(context, eVar, honorPrivacyCallback);
                rum.e();
            }
        });
        healthButton2.setOnClickListener(new View.OnClickListener() { // from class: rum.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("HonorPrivacyUpdateUtils", "getUpdateDialogView click agree.");
                dwq.c(true);
                eVar.b(true);
                honorPrivacyCallback.signResult(eVar);
                rdt.a(AnalyticsValue.HONOR_PRIVACY_UPDATE_AGREE.value());
                rum.e();
            }
        });
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() {
        CustomAlertDialog customAlertDialog = f47704a;
        if (customAlertDialog == null || !customAlertDialog.isShowing()) {
            return;
        }
        f47704a.dismiss();
        f47704a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final Context context, final e eVar, final HonorPrivacyCallback honorPrivacyCallback) {
        LogUtil.a("HonorPrivacyUpdateUtils", "Enter showConfirmDialog.");
        String string = context.getResources().getString(R.string.IDS_honor_privacy_no_agree);
        String string2 = context.getResources().getString(R.string.IDS_honor_common_disagree);
        String string3 = context.getResources().getString(R.string.IDS_hw_show_cancel);
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        builder.a(string);
        builder.d(string2, new View.OnClickListener() { // from class: rum.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("HonorPrivacyUpdateUtils", "showConfirmDialog click no agree.");
                rum.d(context, eVar, honorPrivacyCallback);
                rdt.a(AnalyticsValue.HONOR_PRIVACY_UPDATE_NO_AGREE.value());
            }
        }).a(string3, new View.OnClickListener() { // from class: rum.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("HonorPrivacyUpdateUtils", "showConfirmDialog click cancel.");
                eVar.b(false);
                honorPrivacyCallback.signResult(eVar);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private static SpannableString a(Context context) {
        LogUtil.a("HonorPrivacyUpdateUtils", "Enter getPrivacyContent.");
        String string = context.getResources().getString(R.string.IDS_honor_about_privacy);
        String string2 = context.getResources().getString(R.string.IDS_honor_license_agreement);
        String string3 = context.getResources().getString(R.string.IDS_honor_services_content_double, string2, string);
        if (qrs.ah(context)) {
            string3 = context.getResources().getString(R.string.IDS_honor_services_content_pad, string2, string);
        }
        int[] iArr = new int[2];
        if (string3.lastIndexOf(string2) != -1) {
            iArr[0] = string3.lastIndexOf(string2);
        }
        if (string3.lastIndexOf(string) != -1) {
            iArr[1] = string3.lastIndexOf(string);
        }
        SpannableString spannableString = new SpannableString(string3);
        a(context, spannableString, iArr[0], string2.length(), 2);
        a(context, spannableString, iArr[1], string.length(), 1);
        return spannableString;
    }

    private static void a(final Context context, SpannableString spannableString, int i, int i2, final int i3) {
        qri.d(spannableString, i, i2 + i, new ClickableSpan() { // from class: rum.4
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                String string;
                LogUtil.a("HonorPrivacyUpdateUtils", "setContentClick onClick.");
                int i4 = i3;
                if (i4 == 1) {
                    string = context.getResources().getString(R.string.IDS_honor_about_privacy);
                } else if (i4 == 2) {
                    string = context.getResources().getString(R.string.IDS_honor_license_agreement);
                } else {
                    string = "";
                }
                try {
                    Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
                    intent.putExtra("WebViewActivity.REQUEST_URL_KEY", rum.e(context, i3));
                    intent.putExtra(Constants.JUMP_MODE_KEY, 10);
                    intent.putExtra("WebViewActivity.TITLE", string);
                    context.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    LogUtil.e("HonorPrivacyUpdateUtils", "setContentClick ActivityNotFoundException");
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(context.getResources().getColor(R.color.common_colorAccent));
                textPaint.setUnderlineText(false);
            }
        });
    }

    public static void d(final Context context, final e eVar, final HonorPrivacyCallback honorPrivacyCallback) {
        if (BluetoothAdapter.getDefaultAdapter() != null && !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).a(context.getResources().getString(R.string.IDS_device_bluetooth_open_request)).c(R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: rum.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("HonorPrivacyUpdateUtils", "checkBluetoothStatus open bluetooth.");
                    new BluetoothSwitchStateUtil(context).e(new BtSwitchStateCallback() { // from class: rum.8.1
                        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
                        public void onBtSwitchStateCallback(int i) {
                            LogUtil.a("HonorPrivacyUpdateUtils", "checkBluetoothStatus bluetooth state is on.");
                            rum.b(context, eVar.e());
                            eVar.b(false);
                            honorPrivacyCallback.signResult(eVar);
                        }
                    });
                }
            }).a(R.string.IDS_device_bt_left_btn_info, new View.OnClickListener() { // from class: rum.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("HonorPrivacyUpdateUtils", "checkBluetoothStatus click barred.");
                }
            }).c();
            noTitleCustomAlertDialogC.setCancelable(false);
            noTitleCustomAlertDialogC.show();
        } else {
            b(context, eVar.e());
            eVar.b(false);
            honorPrivacyCallback.signResult(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, dru druVar) {
        LogUtil.j("HonorPrivacyUpdateUtils", "Enter deleteHonorWearDevice.");
        ArrayList arrayList = new ArrayList(16);
        if (druVar.i() instanceof dxy) {
            dxy dxyVar = (dxy) druVar.i();
            if (dxyVar != null) {
                arrayList.add(dxyVar.d());
                rcv.a(context).b((List<String>) arrayList, true);
                return;
            } else {
                LogUtil.j("HonorPrivacyUpdateUtils", "deleteHonorWearDevice deviceInfoForWear is null.");
                return;
            }
        }
        LogUtil.j("HonorPrivacyUpdateUtils", "deleteHonorWearDevice object is not DeviceInfoForWear.");
    }

    public static boolean e(Context context, dru druVar) {
        if (context == null) {
            LogUtil.j("HonorPrivacyUpdateUtils", "isShowUpdateDialog context is null.");
            return false;
        }
        if (!e(druVar)) {
            LogUtil.j("HonorPrivacyUpdateUtils", "isShowUpdateDialog current device is not honor.");
            return false;
        }
        if (!etn.d(context)) {
            LogUtil.j("HonorPrivacyUpdateUtils", "isShowUpdateDialog current zone no need sign.");
            return false;
        }
        if (e(context)) {
            return true;
        }
        LogUtil.j("HonorPrivacyUpdateUtils", "isShowUpdateDialog no exist update.");
        return false;
    }

    public static void c() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: ruk
            @Override // java.lang.Runnable
            public final void run() {
                rum.d();
            }
        });
    }

    static /* synthetic */ void d() {
        if (!etn.d(BaseApplication.getContext())) {
            LogUtil.j("HonorPrivacyUpdateUtils", "querySignResult current zone no need sign.");
            return;
        }
        if (!b(BaseApplication.getContext())) {
            LogUtil.j("HonorPrivacyUpdateUtils", "querySignResult current no honor device.");
        } else if (!c(BaseApplication.getContext())) {
            LogUtil.j("HonorPrivacyUpdateUtils", "querySignResult no more than one day.");
        } else {
            dwq.e();
        }
    }

    private static boolean c(Context context) {
        String strE = SharedPreferenceManager.e(context, String.valueOf(10008), "honor_privacy_query_time");
        if (!TextUtils.isEmpty(strE)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            LogUtil.a("HonorPrivacyUpdateUtils", "isQueryMoreThanOneDay nowTime: ", Long.valueOf(jCurrentTimeMillis), ", lastScanTime: ", strE);
            long jM = CommonUtil.m(context, strE);
            if (jM != 0 && jCurrentTimeMillis - jM > 86400000) {
                LogUtil.a("HonorPrivacyUpdateUtils", "isQueryMoreThanOneDay interval was more than one day.");
                return true;
            }
            LogUtil.j("HonorPrivacyUpdateUtils", "isQueryMoreThanOneDay interval was less than one day.");
            return false;
        }
        LogUtil.a("HonorPrivacyUpdateUtils", "isQueryMoreThanOneDay first query.");
        return true;
    }

    private static boolean e(dru druVar) {
        if (druVar == null) {
            LogUtil.j("HonorPrivacyUpdateUtils", "isHonorWearDevice deviceGroupInfo is null.");
            return false;
        }
        if (druVar.e() != 1) {
            LogUtil.j("HonorPrivacyUpdateUtils", "isHonorDevice is not wear device.");
            return false;
        }
        if (!(druVar.i() instanceof dxy)) {
            LogUtil.j("HonorPrivacyUpdateUtils", "isHonorDevice object is not DeviceInfoForWear.");
            return false;
        }
        dxy dxyVar = (dxy) druVar.i();
        if (dxyVar == null) {
            LogUtil.j("HonorPrivacyUpdateUtils", "isHonorWearDevice deviceInfoForWear is null.");
            return false;
        }
        if (dxyVar.h()) {
            LogUtil.j("HonorPrivacyUpdateUtils", "isHonorDevice is CloudDevice");
            return false;
        }
        if (lvi.l(dxyVar.g())) {
            LogUtil.j("HonorPrivacyUpdateUtils", "isHonorWearDevice is honor wear device.");
            return true;
        }
        LogUtil.j("HonorPrivacyUpdateUtils", "isHonorWearDevice is not honor wear device.");
        return false;
    }

    private static boolean b(Context context) {
        int iB = SharedPreferenceManager.b(context);
        LogUtil.a("HonorPrivacyUpdateUtils", "isBondHonorWearDevice wearDeviceCount: ", Integer.valueOf(iB));
        return iB > 0;
    }

    private static boolean e(Context context) {
        return !SharedPreferenceManager.c(context, LoginInit.getInstance(context).getAccountInfo(1011));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(Context context, int i) {
        String str;
        String strA = LanguageUtil.a(Locale.getDefault());
        String script = Locale.getDefault().getScript();
        String commonCountryCode = GRSManager.c(context).getCommonCountryCode();
        if (TextUtils.isEmpty(commonCountryCode)) {
            commonCountryCode = SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country");
            if (TextUtils.isEmpty(commonCountryCode)) {
                commonCountryCode = "GB";
            }
        }
        String country = Locale.getDefault().getCountry();
        if (TextUtils.isEmpty(script)) {
            str = strA + "_" + country;
        } else {
            str = strA + "_" + script + "_" + country;
        }
        String strD = lon.c().d("domain_honor");
        if (i == 1) {
            return strD + "/minisite/cloudservice/Health/privacy-statement.htm?country=" + commonCountryCode + com.huawei.openalliance.ad.constant.Constants.LANGUAGE + str;
        }
        if (i == 2) {
            return strD + "/minisite/cloudservice/Health/terms.htm?country=" + commonCountryCode + com.huawei.openalliance.ad.constant.Constants.LANGUAGE + str;
        }
        LogUtil.j("HonorPrivacyUpdateUtils", "getHonorPrivacyUrl error type");
        return "";
    }

    public static dru a(List<dru> list, RecommendedItem recommendedItem) {
        if (list == null || list.size() == 0) {
            LogUtil.j("HonorPrivacyUpdateUtils", "getDeviceInfoByMac productInfoList is empty.");
            return null;
        }
        if (recommendedItem == null || TextUtils.isEmpty(recommendedItem.getMac())) {
            LogUtil.j("HonorPrivacyUpdateUtils", "getDeviceInfoByMac mac is empty.");
            return null;
        }
        for (dru druVar : list) {
            if ((druVar.i() instanceof dxy) && nio.c(((dxy) druVar.i()).d()).equals(recommendedItem.getMac())) {
                return druVar;
            }
        }
        return null;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f47715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RecommendedItem f47716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f47717c = false;
        private int d;
        private dru e;

        public dru e() {
            return this.e;
        }

        public void e(dru druVar) {
            this.e = druVar;
        }

        public RecommendedItem c() {
            return this.f47716b;
        }

        public void b(RecommendedItem recommendedItem) {
            this.f47716b = recommendedItem;
        }

        public int d() {
            return this.d;
        }

        public void a(int i) {
            this.d = i;
        }

        public int b() {
            return this.f47715a;
        }

        public void e(int i) {
            this.f47715a = i;
        }

        public boolean a() {
            return this.f47717c;
        }

        public void b(boolean z) {
            this.f47717c = z;
        }
    }
}
