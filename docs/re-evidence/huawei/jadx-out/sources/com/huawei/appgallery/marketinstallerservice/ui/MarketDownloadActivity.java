package com.huawei.appgallery.marketinstallerservice.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.huawei.appgallery.marketinstallerservice.R;
import com.huawei.appgallery.marketinstallerservice.api.Constant;
import com.huawei.appgallery.marketinstallerservice.api.InstallParamSpec;
import com.huawei.appgallery.marketinstallerservice.api.MarketInfo;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.secure.android.common.activity.SafeActivity;
import com.huawei.secure.android.common.intent.SafeIntent;
import defpackage.bip;
import defpackage.bir;
import defpackage.biu;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes23.dex */
public class MarketDownloadActivity extends SafeActivity implements com.huawei.appgallery.marketinstallerservice.ui.b, com.huawei.appgallery.marketinstallerservice.ui.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.huawei.appgallery.marketinstallerservice.ui.a f5244a = new biu(this, this);
    private TextView d = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f5245b = null;
    private ProgressBar e = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f5246c = null;
    private AlertDialog g = null;
    private AlertDialog h = null;
    private AlertDialog i = null;
    private AlertDialog j = null;
    private int f = 0;
    private boolean l = false;

    @Override // com.huawei.secure.android.common.activity.SafeActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.f5244a == null) {
            finish();
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        int i = extras.getInt("android.content.pm.extra.STATUS");
        if (i == 0) {
            this.f5244a.a(0, 0, 0);
            finish();
        } else {
            this.f5244a.a(-2, 0, 0, i);
            e(-2);
        }
    }

    @Override // com.huawei.secure.android.common.activity.SafeActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AlertDialog alertDialog = this.g;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.g.dismiss();
        }
        AlertDialog alertDialog2 = this.h;
        if (alertDialog2 != null && alertDialog2.isShowing()) {
            this.h.dismiss();
        }
        AlertDialog alertDialog3 = this.i;
        if (alertDialog3 == null || !alertDialog3.isShowing()) {
            return;
        }
        this.i.dismiss();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    @Override // com.huawei.secure.android.common.activity.SafeActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        MarketInfo marketInfo;
        String stringExtra;
        String stringExtra2;
        requestWindowFeature(1);
        super.onCreate(bundle);
        SafeIntent safeIntent = new SafeIntent(getIntent());
        String stringExtra3 = safeIntent.getStringExtra("callback_key");
        ArrayList parcelableArrayListExtra = safeIntent.getParcelableArrayListExtra("market_info_key");
        String stringExtra4 = null;
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.size() == 0) {
            marketInfo = null;
        } else {
            Parcelable parcelable = (Parcelable) parcelableArrayListExtra.get(0);
            if (parcelable instanceof MarketInfo) {
                marketInfo = (MarketInfo) parcelable;
            } else {
                marketInfo = null;
            }
        }
        if (marketInfo == null) {
            stringExtra4 = safeIntent.getStringExtra("service_url_key");
            stringExtra = safeIntent.getStringExtra("sub_system_key");
            stringExtra2 = safeIntent.getStringExtra("market_pkg_key");
        } else {
            stringExtra = null;
            stringExtra2 = null;
        }
        this.f = safeIntent.getIntExtra("fail_result_type_key", 0);
        InstallParamSpec installParamSpec = new InstallParamSpec();
        installParamSpec.setMarketInfo(marketInfo);
        installParamSpec.setServerUrl(stringExtra4);
        installParamSpec.setSubsystem(stringExtra);
        installParamSpec.setMarketPkg(stringExtra2);
        installParamSpec.setFailResultPromptType(this.f);
        this.l = safeIntent.getBooleanExtra("is_update_key", false);
        com.huawei.appgallery.marketinstallerservice.ui.a aVar = this.f5244a;
        if (aVar != null) {
            aVar.a(installParamSpec, stringExtra3);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.secure.android.common.activity.SafeActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (1000 != i || this.f5244a == null) {
            finish();
            return;
        }
        int intExtra = Constant.INSTALL_FAILED_UNKNOW;
        if (intent != null) {
            intExtra = intent.getIntExtra("android.intent.extra.INSTALL_RESULT", Constant.INSTALL_FAILED_UNKNOW);
        }
        if (i2 == -1) {
            bir.e("MarketDownloadActivity", "market install succeed");
            this.f5244a.a(0, 0, 0);
            finish();
        } else if (i2 == 0) {
            bir.e("MarketDownloadActivity", "market install userCancel");
            this.f5244a.a(-5, 0, 0);
            finish();
        } else {
            bir.e("MarketDownloadActivity", "market install failed");
            e(-2);
            this.f5244a.a(-2, 0, 0, intExtra);
        }
    }

    @Override // com.huawei.secure.android.common.activity.SafeActivity, android.app.Activity
    public void finish() {
        if (isFinishing()) {
            return;
        }
        super.finish();
    }

    public void e() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(getResources().getText(R.string.market_install_app_download_cancels));
        builder.setPositiveButton(getResources().getText(R.string.market_install_confirm), new a());
        builder.setNegativeButton(R.string.market_install_cancel, (DialogInterface.OnClickListener) null);
        builder.setOnDismissListener(new d());
        AlertDialog alertDialogCreate = builder.create();
        this.j = alertDialogCreate;
        alertDialogCreate.show();
    }

    @Override // com.huawei.appgallery.marketinstallerservice.ui.b
    public void d() {
        bir.e("MarketDownloadActivity", "show market download dialog.");
        this.g = new AlertDialog.Builder(this).create();
        View viewInflate = LayoutInflater.from(this).inflate(getResources().getLayout(R.layout.market_install_app_dl_progress_dialog), (ViewGroup) null);
        ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(R.id.third_app_dl_progressbar);
        this.e = progressBar;
        progressBar.setMax(100);
        this.d = (TextView) viewInflate.findViewById(R.id.third_app_warn_text);
        this.f5245b = (TextView) viewInflate.findViewById(R.id.third_app_dl_progress_text);
        View viewFindViewById = viewInflate.findViewById(R.id.cancel_bg);
        this.f5246c = viewFindViewById;
        viewFindViewById.setOnClickListener(new b());
        this.g.setView(viewInflate);
        this.g.setCancelable(false);
        this.g.setCanceledOnTouchOutside(false);
        this.f5245b.setText(bip.e(0));
        d(this.g);
    }

    @Override // com.huawei.appgallery.marketinstallerservice.ui.b
    public void c() {
        bir.e("MarketDownloadActivity", "show net setting dialog");
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.market_install_no_available_network_prompt);
        builder.setPositiveButton(R.string.market_install_net_setting, new c());
        builder.setNegativeButton(R.string.market_install_cancel, (DialogInterface.OnClickListener) null);
        builder.setOnDismissListener(new e());
        AlertDialog alertDialogCreate = builder.create();
        this.h = alertDialogCreate;
        alertDialogCreate.setCancelable(true);
        d(this.h);
    }

    @Override // com.huawei.appgallery.marketinstallerservice.ui.c.a
    public void b() {
        this.f5244a.e();
        finish();
    }

    @Override // com.huawei.appgallery.marketinstallerservice.ui.b
    public void a(MarketInfo marketInfo) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(this.l ? getResources().getString(R.string.market_install_updating_market) : getResources().getString(R.string.market_install_app_dl_installing, ""));
        }
    }

    @Override // com.huawei.appgallery.marketinstallerservice.ui.b
    public void a(int i, int i2) {
        View view;
        TextView textView;
        if (i == 1 && this.e != null && (textView = this.f5245b) != null) {
            textView.setText(bip.e(i2));
            this.e.setProgress(i2);
            return;
        }
        if (i != 3 || (view = this.f5246c) == null) {
            return;
        }
        view.setClickable(false);
        TextView textView2 = this.d;
        if (textView2 != null && this.f5245b != null) {
            textView2.setText(getResources().getString(R.string.market_install_installing_market));
            this.f5245b.setVisibility(8);
        }
        AlertDialog alertDialog = this.j;
        if (alertDialog == null || !alertDialog.isShowing() || isFinishing()) {
            return;
        }
        this.j.setCancelable(false);
        this.j.dismiss();
    }

    @Override // com.huawei.appgallery.marketinstallerservice.ui.b
    public void a(int i) {
        e(i);
    }

    @Override // com.huawei.appgallery.marketinstallerservice.ui.c.a
    public void a() {
        this.f5244a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        bir.e("MarketDownloadActivity", "market cancelDownload");
        com.huawei.appgallery.marketinstallerservice.ui.a aVar = this.f5244a;
        if (aVar != null) {
            aVar.c();
            this.f5244a.a(-5, 0, 0);
        }
        this.g.dismiss();
        finish();
    }

    private void e(int i) {
        AlertDialog alertDialog = this.g;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.g.dismiss();
        }
        AlertDialog alertDialog2 = this.h;
        if (alertDialog2 != null && alertDialog2.isShowing()) {
            this.h.dismiss();
        }
        int i2 = this.f;
        if (i2 == 0) {
            Toast.makeText(this, getResources().getString(R.string.market_install_install_failed), 0).show();
            finish();
        } else {
            if (i2 != 2) {
                finish();
                return;
            }
            AlertDialog alertDialogD = com.huawei.appgallery.marketinstallerservice.ui.c.d(this, i, this, this.f5244a.d().getAppName());
            this.i = alertDialogD;
            d(alertDialogD);
        }
    }

    class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            MarketDownloadActivity.this.i();
        }

        a() {
        }
    }

    class b implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MarketDownloadActivity.this.e();
        }

        b() {
        }
    }

    class c implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.settings.WIRELESS_SETTINGS");
            intent.putExtra("use_emui_ui", true);
            intent.setPackage("com.android.settings");
            try {
                MarketDownloadActivity.this.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                bir.d("MarketDownloadActivity", "can not go Settings", e);
            }
        }

        c() {
        }
    }

    class d implements DialogInterface.OnDismissListener {
        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (dialogInterface == null || MarketDownloadActivity.this.isFinishing()) {
                return;
            }
            dialogInterface.dismiss();
        }

        d() {
        }
    }

    class e implements DialogInterface.OnDismissListener {
        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (MarketDownloadActivity.this.f5244a != null) {
                MarketDownloadActivity.this.f5244a.a(-1, 0, 0);
            }
            MarketDownloadActivity.this.finish();
        }

        e() {
        }
    }

    private void d(Dialog dialog) {
        if (isDestroyed() || isFinishing()) {
            return;
        }
        dialog.show();
    }
}
