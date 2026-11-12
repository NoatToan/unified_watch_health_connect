package com.huami.watch.companion.esim.ui.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.midong.webview.ui.JsBridgeActivity;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.esim.ESimCallback;
import com.huami.watch.companion.esim.ESimUrl;
import com.huami.watch.companion.esim.EsimOperationHelper;
import com.huami.watch.companion.esim.EsimOperationHelperFactory;
import com.huami.watch.companion.esim.R;
import com.huami.watch.qr.QRUtil;
import com.huami.watch.util.Rx;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class EsimCategoryActivity extends AppCompatActivity {
    private static final String c = "ESimCategoryActivity";
    private static final String d = "esim_url";
    private ESimUrl a;
    private String b;

    private void initView() {
        ((RainbowTitleBar) findViewById(R.id.actionbar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: vq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.k(view);
            }
        });
        findViewById(R.id.offline).setOnClickListener(new View.OnClickListener() { // from class: wq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.l(view);
            }
        });
        findViewById(R.id.online_share).setOnClickListener(new View.OnClickListener() { // from class: uq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.m(view);
            }
        });
        findViewById(R.id.online_separate).setOnClickListener(new View.OnClickListener() { // from class: tq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.n(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(View view) {
        QRUtil.startScan(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(View view) {
        ESimCallback.Companion companion = ESimCallback.INSTANCE;
        if (companion.getEsimDeviceManager() == null || this.a == null) {
            return;
        }
        JsBridgeActivity.load(this, this.a.getShareUrl() + companion.getEsimDeviceManager().getMetaValue(), getString(R.string.esim_web_title));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(View view) {
        ESimCallback.Companion companion = ESimCallback.INSTANCE;
        if (companion.getEsimDeviceManager() == null || this.a == null) {
            return;
        }
        JsBridgeActivity.load(this, this.a.getSeparateUrl() + companion.getEsimDeviceManager().getMetaValue(), getString(R.string.esim_web_title));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String o() {
        return "qr result:" + this.b;
    }

    public static void open(Activity activity, ESimUrl eSimUrl, int i) {
        Intent intent = new Intent(activity, (Class<?>) EsimCategoryActivity.class);
        intent.putExtra(d, eSimUrl);
        activity.startActivityForResult(intent, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        EsimOperationHelperFactory.INSTANCE.createOperationHelper(this).startDownloadProfile(this.b, EsimOperationHelper.CARRIER_QR, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(DialogInterface dialogInterface, int i) {
        Rx.io(new Runnable() { // from class: xq1
            @Override // java.lang.Runnable
            public final void run() {
                this.a.p();
            }
        }).subscribe();
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(DialogInterface dialogInterface, int i) {
        setResult(-1);
        finish();
    }

    private void s() {
        new AlertDialogFragment.Builder(this).setTitle(getString(R.string.esim_open_confirm_title)).setMessage(getString(R.string.esim_open_confirm_message)).setNegativeButton(getString(R.string.btn_cancel), (DialogInterface.OnClickListener) null).setPositiveButton(getString(R.string.esim_open_confirm_ok), new DialogInterface.OnClickListener() { // from class: rq1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.q(dialogInterface, i);
            }
        }).show(getSupportFragmentManager(), "confirm_dialog");
    }

    private void t() {
        new AlertDialogFragment.Builder(this).setTitle(getString(R.string.esim_opening_title)).setMessage(getString(R.string.esim_opening_message)).setNeutralButton(getString(R.string.btn_known), new DialogInterface.OnClickListener() { // from class: sq1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.r(dialogInterface, i);
            }
        }).setCancelable(false).show(getSupportFragmentManager(), "opening_dialog");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (QRUtil.REQUEST_QR != i) {
            super.onActivityResult(i, i2, intent);
        } else if (intent != null) {
            this.b = intent.getStringExtra("SCAN_RESULT");
            HMLog.info(c, new Function0() { // from class: yq1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.o();
                }
            });
            s();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_esim_category);
        if (getIntent() != null) {
            this.a = (ESimUrl) getIntent().getParcelableExtra(d);
        }
        initView();
    }
}
