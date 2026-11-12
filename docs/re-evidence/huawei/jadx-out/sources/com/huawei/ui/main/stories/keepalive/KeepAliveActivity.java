package com.huawei.ui.main.stories.keepalive;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationManagerCompat;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.ads.dynamic.a;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.EventMonitorRecord;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.keepalive.KeepAliveActivity;
import defpackage.ecu;
import defpackage.fga;
import defpackage.nzz;
import defpackage.qpx;
import defpackage.qre;
import defpackage.vrw;
import defpackage.vsa;
import defpackage.vsb;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class KeepAliveActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28367a;
    private Context f;
    private TextView g;
    private List<vrw> h;
    private String j;
    private TextView k;
    private LinearLayout l;
    private TextView m;
    private LinearLayout n;
    private HealthOpenSDK o;
    private TextView p;
    private ConstraintLayout q;
    private TextView r;
    private static final Pattern e = Pattern.compile("cid=(\\d+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f28366b = Pattern.compile("/([a-zA-Z]{2}-[a-zA-Z]{2})/");
    private static final List<String> d = Arrays.asList("ar-EG", MLAsrConstants.LAN_DE_DE, "en-GB", "en-US", "es-us", "in-ID", "ja-JP", "pt-BR", MLAsrConstants.LAN_TH_TH, MLAsrConstants.LAN_TR_TR, "vi-VN", "bg-BG", "cs-CZ", MLAsrConstants.LAN_ES_ES, MLAsrConstants.LAN_FR_FR, MLAsrConstants.LAN_IT_IT, "pl-PL", "pt-PT", MLAsrConstants.LAN_RU_RU, "zh-CN");
    private String t = "";
    private String i = "";
    private String s = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28368c = false;

    public static /* synthetic */ void c(View view) {
    }

    public static /* synthetic */ void d(DialogInterface dialogInterface, int i) {
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.keep_alive_activity);
        this.f = this;
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("keepAliveUrl");
        boolean booleanExtra = intent.getBooleanExtra("isDeviceJump", false);
        LogUtil.d("keepAliveActivity", "onCreate keepAliveUrl:", stringExtra);
        c(booleanExtra);
        try {
            URL url = new URL(stringExtra);
            this.t = url.getHost();
            this.i = e(url.getQuery());
            String strA = a(url.getQuery());
            this.f28367a = strA;
            LogUtil.a("keepAliveActivity", "urlDomain=", this.t, ", language=", this.i, ", cid=", strA);
        } catch (MalformedURLException unused) {
            LogUtil.e("keepAliveActivity", "Invalid keepAliveUrl:" + stringExtra);
        }
        a();
    }

    private void c(boolean z) {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.keep_alive_title);
        LogUtil.a("keepAliveActivity", "isDeviceJump:", Boolean.valueOf(z));
        if (z) {
            this.s = qre.f(R.string.IDS_keepalive_protection);
        } else {
            this.s = qre.f(R.string.IDS_keepalive_background_protection_2);
        }
        customTitleBar.setTitleText(this.s);
    }

    private static String e(String str) {
        if (StringUtils.g(str)) {
            return d(CommonUtil.z());
        }
        String[] strArrSplit = str.split("&");
        HashMap map = new HashMap();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split("=");
            if (strArrSplit2 != null && strArrSplit2.length == 2) {
                map.put(strArrSplit2[0], strArrSplit2[1]);
            }
        }
        String strZ = (String) map.get("lang");
        if (StringUtils.g(strZ)) {
            strZ = CommonUtil.z();
        }
        return d(strZ);
    }

    private static String d(String str) {
        List<String> list = d;
        if (list.contains(str)) {
            return str;
        }
        String strI = i(str);
        if (StringUtils.g(strI) || MLAsrConstants.LAN_ZH.equals(strI)) {
            return "en-US";
        }
        for (String str2 : list) {
            String strI2 = i(str2);
            if (!StringUtils.g(strI2) && strI2.equals(strI)) {
                return str2;
            }
        }
        return "en-US";
    }

    private static String i(String str) {
        String[] strArrSplit;
        return (StringUtils.g(str) || (strArrSplit = str.split(Constants.LINK)) == null || strArrSplit.length != 2) ? "" : strArrSplit[0];
    }

    private static String a(String str) {
        Matcher matcher = e.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }

    private void a() {
        this.g = (TextView) findViewById(R.id.brand);
        this.q = (ConstraintLayout) findViewById(R.id.choose_phone_brand_layout);
        this.m = (TextView) findViewById(R.id.identifyError);
        this.k = (TextView) findViewById(R.id.clickFix);
        this.p = (TextView) findViewById(R.id.identifyError2);
        this.r = (TextView) findViewById(R.id.clickFix2);
        this.n = (LinearLayout) findViewById(R.id.keep_alive_item_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.unrecognized_layout);
        this.l = linearLayout;
        linearLayout.setVisibility(0);
        this.n.setVisibility(8);
        try {
            this.h = (List) HiJsonUtil.d("[{\"type\":\"relate\",\"title\":\"允许应用关联启动\",\"subtitle\":\"应用可被其他应用或系统服务拉起\",\"btn\":\"setup\",\"manufactures\":[\"vivo\"],\"jumpToManager\":[\"vivo\"]},{\"type\":\"ignore\",\"title\":\"忽略电池优化\",\"subtitle\":\"保证应用在后台正常运行，以便及时接收通知消息和来电\",\"btn\":\"setup\",\"manufactures\":[\"samsung\",\"vivo\",\"realme\",\"oppo\",\"meizu\",\"lenovo\",\"honor\",\"oneplus\",\"xiaomi\",\"redmi\",\"poco\",\"motorola\",\"google\",\"sharp\",\"sony\"],\"jumpDetail\":[\"xiaomi\",\"redmi\",\"poco\"]},{\"type\":\"allow\",\"title\":\"允许后台活动\",\"subtitle\":\"避免应用被系统清理，计步、睡眠等数据更准确\",\"btn\":\"setup\",\"manufactures\":[\"vivo\",\"realme\",\"oppo\",\"meizu\",\"honor\",\"lenovo\",\"oneplus\",\"other\"],\"jumpToManager\":[\"meizu\",\"lenovo\",\"vivo\"]},{\"type\":\"auto\",\"title\":\"允许应用自启动\",\"subtitle\":\"在应用异常退出后可自恢复，设备连接更稳定\",\"btn\":\"setup\",\"manufactures\":[\"vivo\",\"lenovo\",\"xiaomi\",\"redmi\",\"poco\",\"other\"],\"jumpToManager\":[\"lenovo\",\"xiaomi\",\"redmi\",\"poco\",\"vivo\"]},{\"type\":\"lock\",\"title\":\"锁定后台任务\",\"subtitle\":\"避免运动健康被系统或自己手动误清理\",\"btn\":\"know\",\"manufactures\":[\"samsung\",\"vivo\",\"realme\",\"oppo\",\"meizu\",\"honor\",\"oneplus\",\"xiaomi\",\"huawei\",\"redmi\",\"poco\",\"other\"]},{\"type\":\"step\",\"title\":\"开启通知栏步数显示\",\"subtitle\":\"提升计步准确性和实时性\",\"btn\":\"setup\",\"manufactures\":[\"samsung\",\"vivo\",\"realme\",\"oppo\",\"meizu\",\"lenovo\",\"honor\",\"oneplus\",\"xiaomi\",\"huawei\",\"redmi\",\"poco\",\"motorola\",\"pixel\",\"aquos\",\"xperia\",\"sharp\",\"sony\",\"other\"]}]", new TypeToken<List<vrw>>() { // from class: com.huawei.ui.main.stories.keepalive.KeepAliveActivity.1
            }.getType());
        } catch (Exception e2) {
            ReleaseLogUtil.a("keepAliveActivity", "Failed to fromJson in keepAliveBeanList", ExceptionUtils.c(e2));
            this.h = new ArrayList(0);
        }
        this.q.post(new Runnable() { // from class: com.huawei.ui.main.stories.keepalive.KeepAliveActivity.5
            @Override // java.lang.Runnable
            public void run() {
                Rect rect = new Rect();
                KeepAliveActivity.this.g.getHitRect(rect);
                KeepAliveActivity keepAliveActivity = KeepAliveActivity.this;
                keepAliveActivity.d(keepAliveActivity.m);
                KeepAliveActivity keepAliveActivity2 = KeepAliveActivity.this;
                keepAliveActivity2.d(keepAliveActivity2.k);
                int i = rect.right;
                int measuredWidth = KeepAliveActivity.this.m.getMeasuredWidth();
                if (i + measuredWidth + KeepAliveActivity.this.k.getMeasuredWidth() + KeepAliveActivity.this.q.getPaddingEnd() > KeepAliveActivity.this.q.getWidth()) {
                    KeepAliveActivity.this.m.setVisibility(8);
                    KeepAliveActivity.this.k.setVisibility(8);
                    KeepAliveActivity.this.p.setVisibility(0);
                    KeepAliveActivity.this.r.setVisibility(0);
                    KeepAliveActivity.this.p.setText(KeepAliveActivity.this.m.getText());
                    KeepAliveActivity.this.r.setText(KeepAliveActivity.this.k.getText());
                    return;
                }
                KeepAliveActivity.this.m.setVisibility(0);
                KeepAliveActivity.this.k.setVisibility(0);
                KeepAliveActivity.this.p.setVisibility(8);
                KeepAliveActivity.this.r.setVisibility(8);
            }
        });
        String lowerCase = d().toLowerCase(Locale.ROOT);
        HashMap map = new HashMap();
        map.put("brand", lowerCase);
        map.put("cid", this.f28367a);
        map.put("title", this.s);
        vsb.d(map, "home");
        this.j = vsa.f51543c.contains(lowerCase) ? lowerCase : "other";
        this.g.setText(c(lowerCase));
        j(this.j);
    }

    private String d() {
        String str = Build.BRAND;
        return StringUtils.g(str) ? "other" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    private String c(String str) {
        if (!vsa.f51543c.contains(str)) {
            str = "other";
        }
        str.hashCode();
        switch (str) {
            case "oneplus":
                return qre.f(R.string.IDS_keepalive_manufactures_oneplus);
            case "huawei":
                return qre.f(R.string.IDS_keepalive_manufactures_huawei);
            case "lenovo":
                return qre.f(R.string.IDS_keepalive_manufactures_lenovo);
            case "realme":
                return qre.f(R.string.IDS_keepalive_manufactures_realme);
            case "xiaomi":
                return qre.f(R.string.IDS_keepalive_manufactures_xiaomi);
            case "motorola":
                return qre.f(R.string.IDS_keepalive_manufactures_motorola);
            case "oppo":
                return qre.f(R.string.IDS_keepalive_manufactures_oppo);
            case "poco":
                return qre.f(R.string.IDS_keepalive_manufactures_poco);
            case "vivo":
                return qre.f(R.string.IDS_keepalive_manufactures_vivo);
            case "honor":
                return qre.f(R.string.IDS_keepalive_manufactures_honor);
            case "meizu":
                return qre.f(R.string.IDS_keepalive_manufactures_meizu);
            case "redmi":
                return qre.f(R.string.IDS_keepalive_manufactures_redmi);
            case "samsung":
                return qre.f(R.string.IDS_keepalive_manufactures_samsung);
            default:
                return b(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    private String b(String str) {
        byte b2;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -1240244679) {
            if (iHashCode != 3536167) {
                if (iHashCode == 109400042 && str.equals("sharp")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("sony")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("google")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return qre.f(R.string.IDS_keepalive_manufactures_google);
        }
        if (b2 == 1) {
            return qre.f(R.string.IDS_keepalive_manufactures_sony);
        }
        if (b2 == 2) {
            return qre.f(R.string.IDS_keepalive_manufactures_sharp);
        }
        return qre.f(R.string.IDS_keepalive_manufactures_other);
    }

    private String[] e(List<String> list) {
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = c(list.get(i));
        }
        return strArr;
    }

    public void showSelectPicker(View view) {
        LogUtil.a("keepAliveActivity", "enter fix");
        final HashMap map = new HashMap();
        map.put("brand", this.j);
        map.put("cid", this.f28367a);
        map.put(EventMonitorRecord.EVENT_ID, HiAnalyticsConstant.KeyAndValue.NUMBER_01);
        map.put("title", this.s);
        vsb.d(map, "home");
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this);
        View viewInflate = getLayoutInflater().inflate(com.huawei.health.servicesui.R.layout.health_healthdata_userinfo_dialog_set, (ViewGroup) null);
        final HealthNumberPicker healthNumberPicker = (HealthNumberPicker) viewInflate.findViewById(com.huawei.health.servicesui.R.id.userinfo_number_picker_v9);
        final List<String> list = vsa.f51543c;
        healthNumberPicker.setDisplayedValues(e(list));
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setMaxValue(list.size() - 1);
        int iIndexOf = list.indexOf(this.j);
        if (iIndexOf <= 0) {
            iIndexOf = 0;
        }
        healthNumberPicker.setValue(iIndexOf);
        healthNumberPicker.setWrapSelectorWheel(false);
        final String strF = qre.f(R.string.IDS_keepalive_brand_name);
        builder.b(strF).a(viewInflate).d(R.string.IDS_keepalive_confirm_btn, new DialogInterface.OnClickListener() { // from class: vrp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f51533a.c(list, healthNumberPicker, map, strF, dialogInterface, i);
            }
        }).a(R.string.IDS_keepalive_cancel_btn, new DialogInterface.OnClickListener() { // from class: vrs
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                KeepAliveActivity.d(dialogInterface, i);
            }
        });
        builder.b().show();
    }

    public /* synthetic */ void c(List list, HealthNumberPicker healthNumberPicker, Map map, String str, DialogInterface dialogInterface, int i) {
        String str2 = (String) list.get(healthNumberPicker.getValue());
        HashMap map2 = new HashMap();
        map2.put("brand", this.j);
        map2.put("cid", this.f28367a);
        map2.put(EventMonitorRecord.EVENT_ID, a.t);
        map.put("title", str);
        map2.put("to", str2);
        vsb.d(map2, "home");
        this.j = str2;
        this.g.setText(c(str2));
        j(str2);
    }

    private void j(String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.h.size(); i++) {
            vrw vrwVar = this.h.get(i);
            if (!CollectionUtils.a(vrwVar.e()) && (!"relate".equals(vrwVar.h()) || PermissionUtil.f())) {
                if ("allow".equals(vrwVar.h()) && "honor".equals(g(str)) && e()) {
                    LogUtil.a("keepAliveActivity", "device isConnection filter allow");
                } else if (vrwVar.e().contains(str)) {
                    arrayList.add(vrwVar);
                }
            }
        }
        this.l.setVisibility(8);
        this.n.setVisibility(0);
        this.n.removeAllViews();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            this.n.addView(e((vrw) arrayList.get(i2)));
        }
    }

    private static String g(String str) {
        return str == null ? "" : str.toLowerCase(Locale.ROOT);
    }

    private boolean e() {
        return !CollectionUtils.a(ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "keepAliveActivity"));
    }

    private View e(final vrw vrwVar) {
        View viewInflate = LayoutInflater.from(this.f).inflate(R.layout.keep_alive_item_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.desc);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.setting_name);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.setting_btn_layout);
        textView.setText(vsb.d(vrwVar.h(), true));
        textView2.setText(vsb.d(vrwVar.h(), false));
        if ("setup".equals(vrwVar.d())) {
            textView3.setText(qre.f(R.string.IDS_keepalive_go_Setup));
        } else {
            textView3.setText(qre.f(R.string.IDS_keepalive_how_todo));
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: vrv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51538a.c(vrwVar, view);
            }
        });
        return viewInflate;
    }

    public /* synthetic */ void c(vrw vrwVar, View view) {
        LogUtil.a("keepAliveActivity", "settingBtn click");
        a(vrwVar);
    }

    private void a(vrw vrwVar) {
        LogUtil.a("keepAliveActivity", "keepAliveType : ", vrwVar.h());
        if ("ignore".equals(vrwVar.h())) {
            c(vrwVar);
            return;
        }
        if ("step".equals(vrwVar.h())) {
            HashMap map = new HashMap();
            map.put("brand", this.j);
            map.put("cid", this.f28367a);
            map.put(EventMonitorRecord.EVENT_ID, "05");
            map.put("title", this.f.getResources().getString(R.string.IDS_keepalive_enable_step_notification));
            vsb.d(map, "home");
            b();
            return;
        }
        d(vrwVar);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        HealthOpenSDK healthOpenSDK;
        super.onResume();
        if (this.f28368c && c() && (healthOpenSDK = this.o) != null) {
            healthOpenSDK.b(true, null);
            Context context = this.f;
            qpx.e(context, context.getResources().getString(R.string.IDS_keepalive_notification_enabled));
            this.f28368c = false;
        }
    }

    private boolean c() {
        boolean zAreNotificationsEnabled = NotificationManagerCompat.from(BaseApplication.getContext()).areNotificationsEnabled();
        LogUtil.a("keepAliveActivity", "enabledNotify : ", Boolean.valueOf(zAreNotificationsEnabled));
        return zAreNotificationsEnabled;
    }

    private void i() {
        LogUtil.a("keepAliveActivity", "enter jumpToSysNotifySetting");
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", BaseApplication.getAppPackage());
        intent.setFlags(268435456);
        try {
            this.f.startActivity(intent);
            this.f28368c = true;
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("keepAliveActivity", "otherType ActivityNotFoundException");
        }
    }

    private void b() {
        HealthOpenSDK healthOpenSDKE = fga.d(this.f).e();
        this.o = healthOpenSDKE;
        if (healthOpenSDKE == null) {
            LogUtil.j("keepAliveActivity", "mHealthOpenSdk is null.");
        } else {
            healthOpenSDKE.d(new IExecuteResult() { // from class: com.huawei.ui.main.stories.keepalive.KeepAliveActivity.4
                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onSuccess(Object obj) {
                    if (!(obj instanceof Bundle)) {
                        LogUtil.a("keepAliveActivity", "object invalid.");
                        return;
                    }
                    boolean z = ((Bundle) obj).getBoolean("stepsNotifiState");
                    LogUtil.a("keepAliveActivity", "onSuccess mIsOpenRealTimeStep :", Boolean.valueOf(z));
                    KeepAliveActivity.this.b(z);
                }

                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onFailed(Object obj) {
                    LogUtil.j("keepAliveActivity", "OpenSdkCommonCallback onFailed.");
                }

                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onServiceException(Object obj) {
                    LogUtil.e("keepAliveActivity", "OpenSdkCommonCallback onServiceException.");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        if (!c()) {
            HandlerExecutor.c(new Runnable() { // from class: vrr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51536c.h();
                }
            });
        } else if (z) {
            g();
        } else {
            this.o.b(true, null);
            g();
        }
    }

    private void g() {
        Context context = this.f;
        qpx.e(context, context.getResources().getString(R.string.IDS_keepalive_notification_enabled));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f);
        builder.a(this.f.getString(R.string.IDS_keepalive_open_notification_switch));
        builder.a(this.f.getString(R.string.IDS_go_setting), new View.OnClickListener() { // from class: vru
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51537c.b(view);
            }
        }).a(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: vrz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("keepAliveActivity", "cancel");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void b(View view) {
        LogUtil.a("keepAliveActivity", "goSetting");
        i();
    }

    private void c(vrw vrwVar) {
        List<String> listA = vrwVar.a();
        if (!CollectionUtils.a(listA) && listA.contains(this.j)) {
            d(vrwVar);
            return;
        }
        if (nzz.c(this)) {
            LogUtil.a("keepAliveActivity", "show detailLog");
            j();
            return;
        }
        LogUtil.a("keepAliveActivity", "agreeWhite= false, requestWhiteSet");
        HashMap map = new HashMap();
        map.put("brand", this.j);
        map.put("cid", this.f28367a);
        map.put(EventMonitorRecord.EVENT_ID, "03");
        map.put("title", this.s);
        vsb.d(map, "home");
        nzz.b(this, 10002);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 10002 || i2 < 0) {
            return;
        }
        boolean zC = nzz.c(this);
        HashMap map = new HashMap();
        map.put("brand", this.j);
        map.put("cid", this.f28367a);
        map.put(EventMonitorRecord.EVENT_ID, "04");
        map.put("title", this.s);
        map.put("isAgreeWhite", Boolean.valueOf(zC));
        vsb.d(map, "home");
        LogUtil.a("keepAliveActivity", "onActivityResult requestCode: " + i, ", resultCode: ", Integer.valueOf(i2), ",isAgreeWhite: ", Boolean.valueOf(zC));
    }

    private void d(vrw vrwVar) {
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainTipsKeepAlive");
        LogUtil.a("keepAliveActivity", "startNewPage language:" + this.i);
        if (CommonUtil.n(this, LoginInit.getInstance(this).getAccountInfo(1009)) == 1) {
            this.i = "zh-CN".equals(this.i) ? this.i : "en-US";
        }
        String strH = vrwVar.h();
        String str = String.format("%s/hwtips/protection_setup/%s/%s/%s.html?from=%s&hideHeader=1&hideBottomBtn=1", url, this.i, strH, this.j, strH);
        Intent intent = new Intent();
        LogUtil.d("keepAliveActivity", "startNewPage pageUrl:" + str);
        intent.putExtra("KeepAliveBean", HiJsonUtil.d(vrwVar));
        intent.putExtra("url", str);
        intent.putExtra("currentBrand", this.j);
        intent.setClass(this.f, KeepAliveDetailActivity.class);
        this.f.startActivity(intent);
    }

    private void j() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f);
        builder.b(R.string.IDS_keepalive_disable_battery_optimisation);
        builder.c(R.string.IDS_keepalive_got_it, new View.OnClickListener() { // from class: vrt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeepAliveActivity.c(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(true);
        noTitleCustomAlertDialogC.show();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
