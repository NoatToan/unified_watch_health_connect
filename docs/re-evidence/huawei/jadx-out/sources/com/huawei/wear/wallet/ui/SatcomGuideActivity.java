package com.huawei.wear.wallet.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.secure.android.common.intent.SafeIntent;
import com.huawei.uikit.phone.hwbutton.widget.HwButton;
import com.huawei.wallet.proxy.utils.WearActivityManager;
import com.huawei.wear.R;
import com.huawei.wear.oversea.overseamanger.OverSeaMangerUtil;
import com.huawei.wear.oversea.overseamanger.QueryReviewResultCallback;
import com.huawei.wear.wallet.ui.dialog.HwDialogInterface;
import com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface;
import com.huawei.wear.wallet.ui.dialog.WidgetBuilder;
import defpackage.xml;
import defpackage.xnd;
import defpackage.xnv;
import defpackage.xoi;
import defpackage.xol;
import defpackage.xom;
import defpackage.xon;
import defpackage.xoo;
import defpackage.xor;
import defpackage.xpd;
import defpackage.xpe;
import defpackage.xpi;
import defpackage.xpl;
import defpackage.xpp;
import defpackage.xpq;
import defpackage.xxy;
import defpackage.xxz;
import java.lang.ref.WeakReference;
import java.util.Date;

/* JADX INFO: loaded from: classes46.dex */
public class SatcomGuideActivity extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f30714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30715c;
    private String d;
    private RelativeLayout f;
    private TextView i;
    private Context j;
    private String k;
    private HwProgressDialogInterface m;
    private HwButton n;
    private boolean g = false;
    private int e = 1;
    private e h = new e(this);

    public class e extends Handler {
        private final WeakReference<SatcomGuideActivity> e;

        public e(SatcomGuideActivity satcomGuideActivity) {
            this.e = new WeakReference<>(satcomGuideActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            WeakReference<SatcomGuideActivity> weakReference = this.e;
            if (weakReference == null) {
                if (message.getTarget() != null) {
                    message.getTarget().removeCallbacksAndMessages(null);
                    return;
                }
                return;
            }
            SatcomGuideActivity satcomGuideActivity = weakReference.get();
            if (satcomGuideActivity != null) {
                switch (message.what) {
                    case 0:
                        SatcomGuideActivity.this.i.setText(SatcomGuideActivity.this.getResources().getQuantityString(R.plurals.under_review_tip, SatcomGuideActivity.this.e, Integer.valueOf(SatcomGuideActivity.this.e)));
                        SatcomGuideActivity.this.f.setVisibility(0);
                        SatcomGuideActivity.this.n.setVisibility(8);
                        SatcomGuideActivity.this.f30714b.setBackground(SatcomGuideActivity.this.j.getResources().getDrawable(R.drawable.satcom_button_tip_bg));
                        SatcomGuideActivity.this.f30714b.setPadding(180, 36, 180, 36);
                        SatcomGuideActivity.this.f30714b.setTextColor(SatcomGuideActivity.this.j.getResources().getColor(R.color.dialog_bg_color_wallet));
                        break;
                    case 1:
                        SatcomGuideActivity.this.t();
                        break;
                    case 2:
                        Toast.makeText(satcomGuideActivity, SatcomGuideActivity.this.getString(R.string.ac_system_error), 0).show();
                        break;
                    case 3:
                        SatcomGuideActivity.this.n.setText(R.string.sign_up_mass_test);
                        SatcomGuideActivity.this.n.setVisibility(0);
                        SatcomGuideActivity.this.n.setOnClickListener(new View.OnClickListener() { // from class: ybl
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.d.a(view);
                            }
                        });
                        break;
                    case 4:
                        SatcomGuideActivity satcomGuideActivity2 = SatcomGuideActivity.this;
                        satcomGuideActivity2.c(satcomGuideActivity2.getString(R.string.under_review_prompt));
                        break;
                    case 5:
                        SatcomGuideActivity.this.n.setVisibility(0);
                        break;
                    case 6:
                        SatcomGuideActivity.this.b();
                        if (message.obj != null) {
                            SatcomGuideActivity.this.d((String) message.obj);
                        } else {
                            xnd.d("SatcomGuideActivity", "message{QUERY_REVIEW_RESULT_FINISH} content is null");
                            SatcomGuideActivity.this.d("1");
                        }
                        break;
                    default:
                        xnd.d("SatcomGuideActivity", "UIHandler msg.what is invalid");
                        break;
                }
                return;
            }
            if (message.getTarget() != null) {
                message.getTarget().removeCallbacksAndMessages(null);
            }
        }

        public /* synthetic */ void a(View view) {
            SatcomGuideActivity.this.o();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xnd.d("SatcomGuideActivity", "onCreate()");
        c((Activity) this);
        setContentView(R.layout.activity_satcom_guide);
        g();
        h();
        WearActivityManager.b(this);
    }

    private void h() {
        this.j = xml.d();
        this.f30713a = OverSeaMangerUtil.a(xml.d()).b().a();
        this.d = OverSeaMangerUtil.a(xml.d()).b().h();
        SafeIntent safeIntent = new SafeIntent(getIntent());
        this.g = safeIntent.getBooleanExtra("isFromWear", false);
        this.k = safeIntent.getStringExtra("wear_home_class_name");
        this.f30715c = safeIntent.getStringExtra("device_id");
        if (1 == m()) {
            k();
        } else {
            this.n.setVisibility(0);
        }
    }

    private void g() {
        this.n = (HwButton) findViewById(R.id.btn_open_start);
        this.f30714b = (TextView) findViewById(R.id.bottom_text);
        this.n.setOnClickListener(this);
        this.f30714b.setOnClickListener(this);
        this.f = (RelativeLayout) findViewById(R.id.rl_notice);
        this.i = (TextView) findViewById(R.id.tv_notice_content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        xnd.d("SatcomGuideActivity", "showApplyForParticipationSuccessDialog");
        HwDialogInterface hwDialogInterfaceC = WidgetBuilder.c(this);
        Resources resources = getResources();
        int i = R.plurals.satcom_card_mass_test_apply_success_new;
        int i2 = this.e;
        hwDialogInterfaceC.setMessage(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
        hwDialogInterfaceC.setCanceledOnTouchOutside(false);
        hwDialogInterfaceC.setPositiveButton(R.string.nfc_cvv_code_introduction_ok, new DialogInterface.OnClickListener() { // from class: ybg
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.f53321c.e(dialogInterface, i3);
            }
        });
        hwDialogInterfaceC.show();
    }

    public /* synthetic */ void e(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.h.sendEmptyMessage(0);
    }

    private int m() {
        String strF = f();
        if (xpi.d(strF, true) || !strF.contains("|")) {
            return 0;
        }
        String[] strArrSplit = strF.split("\\|");
        try {
            int i = Integer.parseInt(strArrSplit[0]);
            int i2 = Integer.parseInt(strArrSplit[1]);
            int i3 = Integer.parseInt(xpq.e(new Date(System.currentTimeMillis()), "yyyyMMdd"));
            return (i3 < i || i3 > i2) ? 0 : 1;
        } catch (NumberFormatException e2) {
            xnd.d("SatcomGuideActivity", "parse int failed", false);
            throw e2;
        }
    }

    private String f() {
        return xnv.e(getApplicationContext()).b("Mass_Test_Period", "");
    }

    private void k() {
        xnd.d("SatcomGuideActivity", "queryParticipationStatus");
        xpd.e().c(new Runnable() { // from class: ybh
            @Override // java.lang.Runnable
            public final void run() {
                this.f53322c.d();
            }
        });
    }

    public /* synthetic */ void d() {
        String strE = xpl.e(this.j, "/WiseCloudWalletPassService/api/v1/client/getParticipationStatus", "WALLETPASSCOMMON");
        xoo xooVar = new xoo();
        xooVar.e(this.f30713a);
        xooVar.a(this.d);
        xooVar.d("UDID");
        xon xonVarProcessTask = new xor(this.j, strE).processTask(xooVar);
        if (xonVarProcessTask != null && xonVarProcessTask.f53201b == 0) {
            xnd.d("SatcomGuideActivity", "queryParticipationStatus response success");
            String strE2 = xonVarProcessTask.e();
            xnd.d("SatcomGuideActivity", "queryParticipationStatus status : " + strE2);
            if (xpi.d(strE2, true)) {
                return;
            }
            this.e = xnv.e(this.j).c("Beidou_Audit_Wait_Day", 1);
            if ("0".equals(strE2)) {
                this.h.sendEmptyMessage(3);
                return;
            } else if ("1".equals(strE2)) {
                this.h.sendEmptyMessage(0);
                return;
            } else {
                this.h.sendEmptyMessage(5);
                return;
            }
        }
        xnd.d("SatcomGuideActivity", "queryParticipationStatus response fail errorCode : " + xonVarProcessTask.f53201b + " , errorMessage : " + xonVarProcessTask.a());
        this.h.sendEmptyMessage(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        xnd.d("SatcomGuideActivity", "showApplyForParticipationDialog");
        HwDialogInterface hwDialogInterfaceC = WidgetBuilder.c(this);
        hwDialogInterfaceC.setCancelable(false);
        hwDialogInterfaceC.setMessage(R.string.satcom_card_mass_test_apply);
        hwDialogInterfaceC.setNegativeButton(R.string.nfc_cancel, new DialogInterface.OnClickListener() { // from class: ybi
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        hwDialogInterfaceC.setPositiveButton(R.string.walletbase_confirmation_claim, new DialogInterface.OnClickListener() { // from class: ybf
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.d.c(dialogInterface, i);
            }
        });
        hwDialogInterfaceC.show();
    }

    public /* synthetic */ void c(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        c();
    }

    private void c() {
        xnd.d("SatcomGuideActivity", "applyForParticipation");
        xpd.e().c(new Runnable() { // from class: ybj
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a();
            }
        });
    }

    public /* synthetic */ void a() {
        String strE = xpl.e(this.j, "/WiseCloudWalletPassService/api/v1/client/applyForParticipation", "WALLETPASSCOMMON");
        xoi xoiVar = new xoi();
        xoiVar.e(this.f30713a);
        xoiVar.b(this.d);
        xom xomVarProcessTask = new xol(xml.d(), strE).processTask(xoiVar);
        if (xomVarProcessTask != null && xomVarProcessTask.f53201b == 0) {
            xnd.d("SatcomGuideActivity", "applyForParticipation response success");
            e();
        } else {
            xnd.d("SatcomGuideActivity", "applyForParticipation response fail returnCode : " + xomVarProcessTask.f53201b);
            this.h.sendEmptyMessage(2);
        }
    }

    private void e() {
        if (xnv.e(this.j).c("BeiDou_Audit_Cycle", 0) == 0) {
            this.h.sendEmptyMessage(4);
            new xpe(new QueryReviewResultCallback() { // from class: com.huawei.wear.wallet.ui.SatcomGuideActivity.5
                @Override // com.huawei.wear.oversea.overseamanger.QueryReviewResultCallback
                public boolean checkReviewResult() {
                    return SatcomGuideActivity.this.l();
                }

                @Override // com.huawei.wear.oversea.overseamanger.QueryReviewResultCallback
                public void onQueryReviewResultCallback(String str) {
                    xnd.d("SatcomGuideActivity", "onQueryReviewResultCallback resultCode = " + str);
                    Message message = new Message();
                    message.what = 6;
                    message.obj = str;
                    SatcomGuideActivity.this.h.sendMessage(message);
                }
            });
        } else {
            this.h.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l() {
        String strE = xpl.e(this.j, "/WiseCloudWalletPassService/api/v1/client/getParticipationStatus", "WALLETPASSCOMMON");
        xoo xooVar = new xoo();
        xooVar.e(this.f30713a);
        xooVar.a(this.d);
        xooVar.d("UDID");
        xon xonVarProcessTask = new xor(this.j, strE).processTask(xooVar);
        if (xonVarProcessTask != null && xonVarProcessTask.f53201b == 0) {
            xnd.d("SatcomGuideActivity", "queryParticipationStatus response success");
            String strE2 = xonVarProcessTask.e();
            xnd.d("SatcomGuideActivity", "queryParticipationStatus status : " + strE2);
            if (!xpi.d(strE2, true) && "2".equals(strE2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if ("2".equals(str)) {
            c(getString(R.string.review_success_prompt));
            i();
            return;
        }
        HwDialogInterface hwDialogInterfaceC = WidgetBuilder.c(this);
        hwDialogInterfaceC.setMessage(getString(R.string.nfc_virtual_server_exception));
        hwDialogInterfaceC.setCanceledOnTouchOutside(false);
        hwDialogInterfaceC.setPositiveButton(R.string.nfc_cvv_code_introduction_ok, new DialogInterface.OnClickListener() { // from class: yba
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        hwDialogInterfaceC.show();
    }

    private boolean n() {
        HwProgressDialogInterface hwProgressDialogInterface = this.m;
        return hwProgressDialogInterface != null && hwProgressDialogInterface.isShowing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        HwProgressDialogInterface hwProgressDialogInterface;
        if (isFinishing() || (hwProgressDialogInterface = this.m) == null) {
            return;
        }
        hwProgressDialogInterface.dismiss();
        this.m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        xnd.d("SatcomGuideActivity", FaqConstants.FAQ_SHOW_PROGRESS);
        if (isFinishing()) {
            return;
        }
        if (this.m != null && n()) {
            this.m.setMessage(str);
            this.m.setCanceledOnTouchOutside(false);
            this.m.setCancelable(false);
        } else {
            HwProgressDialogInterface hwProgressDialogInterfaceA = WidgetBuilder.a(this);
            this.m = hwProgressDialogInterfaceA;
            hwProgressDialogInterfaceA.setMessage(str);
            this.m.setCanceledOnTouchOutside(false);
            this.m.setCancelable(false);
            this.m.show();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (xxy.c(id)) {
            xnd.d("SatcomGuideActivity", "DoubleClick");
        } else if (id == R.id.btn_open_start) {
            i();
        } else if (id == R.id.bottom_text) {
            j();
        }
    }

    private void i() {
        if (xml.a() == null) {
            xnd.a("SatcomGuideActivity", "HealthPackageUtil.getAdapter() is null and return.");
            return;
        }
        try {
            SafeIntent safeIntent = new SafeIntent(new Intent());
            safeIntent.setClassName(this, ComponentInfo.PluginPay_A_70);
            safeIntent.putExtra("isFromWear", this.g);
            safeIntent.putExtra("device_id", this.f30715c);
            safeIntent.putExtra("wear_home_class_name", this.k);
            xml.a().launchActivity(this, safeIntent);
        } catch (ActivityNotFoundException unused) {
            xnd.a("SatcomGuideActivity", "gotoSatcomCardActivity() : occur ActivityNotFoundException");
        }
    }

    private void j() {
        xnd.a("SatcomGuideActivity", "targetClass = :" + this.k);
        SafeIntent safeIntent = new SafeIntent(new Intent());
        safeIntent.setClassName(this, this.k);
        safeIntent.putExtra("isFromWear", this.g);
        safeIntent.putExtra("device_id", this.f30715c);
        safeIntent.putExtra("wear_home_class_name", this.k);
        xxz.d(this.j, safeIntent);
        finish();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    private static void c(Activity activity) {
        Window window = activity.getWindow();
        View decorView = window.getDecorView();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        if (xpp.c(activity)) {
            decorView.setSystemUiVisibility(256);
            window.setStatusBarColor(0);
        } else {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            window.setStatusBarColor(ViewCompat.MEASURED_SIZE_MASK);
        }
        activity.getWindow().setNavigationBarColor(activity.getResources().getColor(R.color.emui_color_subbg));
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.h.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
