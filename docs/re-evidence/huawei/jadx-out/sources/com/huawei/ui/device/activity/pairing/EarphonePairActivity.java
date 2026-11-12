package com.huawei.ui.device.activity.pairing;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import defpackage.edj;
import defpackage.lxb;
import defpackage.mgg;
import defpackage.qsp;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
public class EarphonePairActivity extends BaseActivity implements EarPhoneResponseCallback, View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AnimationDrawable f24632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthButton f24633c;
    private LinearLayout e;
    private Handler f;
    private ImageView g;
    private DeviceInfo h;
    private String i;
    private String j;
    private HealthTextView k;
    private LinearLayout l;
    private HealthTextView m;
    private ImageView n;
    private LinearLayout o;
    private RelativeLayout p;
    private HealthButton q;
    private HealthTextView r;
    private HealthButton s;
    private RelativeLayout t;
    private CustomTitleBar y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24631a = false;
    private boolean d = false;

    static class b extends Handler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<EarphonePairActivity> f24635c;

        b(EarphonePairActivity earphonePairActivity) {
            this.f24635c = new WeakReference<>(earphonePairActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            EarphonePairActivity earphonePairActivity = this.f24635c.get();
            if (earphonePairActivity == null) {
                LogUtil.j("EarphonePairActivity", "handleMessage, activity is null");
                return;
            }
            int i = message.what;
            if (i == -2) {
                LogUtil.j("EarphonePairActivity", "pair time out");
                lxb.c().e(earphonePairActivity.h);
                earphonePairActivity.h();
                return;
            }
            if (i == -1) {
                LogUtil.a("EarphonePairActivity", "handleMessage, pair fail");
                removeMessages(-2);
                earphonePairActivity.h();
                return;
            }
            if (i == 1) {
                LogUtil.a("EarphonePairActivity", "handleMessage, pair success");
                removeMessages(-2);
                earphonePairActivity.g();
                return;
            }
            if (i == 4) {
                LogUtil.a("EarphonePairActivity", "handleMessage, get info success");
                earphonePairActivity.a(message);
                return;
            }
            if (i == 5) {
                LogUtil.a("EarphonePairActivity", "handleMessage, device skip pair");
                removeMessages(-2);
                if (earphonePairActivity.f24631a) {
                    return;
                }
                earphonePairActivity.f();
                return;
            }
            if (i == 6) {
                LogUtil.a("EarphonePairActivity", "handleMessage, device retry pair");
                removeMessages(-2);
                if (earphonePairActivity.f24631a) {
                    return;
                }
                earphonePairActivity.b();
                return;
            }
            e(message.what, earphonePairActivity);
        }

        private void e(int i, EarphonePairActivity earphonePairActivity) {
            if (i == 0) {
                LogUtil.j("EarphonePairActivity", "earphone is ou side");
                removeMessages(-2);
                earphonePairActivity.c();
            } else if (i != 2) {
                LogUtil.j("EarphonePairActivity", "other status");
            } else {
                LogUtil.j("EarphonePairActivity", "device ignore pair");
                earphonePairActivity.m();
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_ear_phone_pair_layout);
        e();
        a();
        d();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.cancel_button) {
            lxb.c().d(this.h, this.j);
            c();
        } else if (view.getId() == R.id.pair_guide_again) {
            b();
        } else if (view.getId() == R.id.skip_pair_guide) {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        lxb.c().c(this.h);
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        setResult(6);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        lxb.c().b(this.h);
        i();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    private void e() {
        this.y = (CustomTitleBar) qsp.a(this, R.id.pair_guide_custom_title);
        this.t = (RelativeLayout) qsp.a(this, R.id.pair_result_progress_img);
        this.g = (ImageView) qsp.a(this, R.id.pair_guide_progress_anim);
        this.n = (ImageView) qsp.a(this, R.id.pair_result_show_img);
        this.p = (RelativeLayout) qsp.a(this, R.id.pair_result_img_text);
        this.k = (HealthTextView) qsp.a(this, R.id.pairing_progress_guide_single_note);
        this.r = (HealthTextView) qsp.a(this, R.id.pair_result_show_txt);
        this.e = (LinearLayout) qsp.a(this, R.id.cancel_button_layout);
        this.f24633c = (HealthButton) qsp.a(this, R.id.cancel_button);
        this.o = (LinearLayout) qsp.a(this, R.id.ll_pairing_guide_choose);
        this.q = (HealthButton) qsp.a(this, R.id.pair_guide_again);
        this.s = (HealthButton) qsp.a(this, R.id.skip_pair_guide);
        this.l = (LinearLayout) qsp.a(this, R.id.connecting_name_layout);
        this.m = (HealthTextView) qsp.a(this, R.id.connecting_name);
    }

    private void a() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("EarphonePairActivity", "initData intent is null");
            return;
        }
        String stringExtra = intent.getStringExtra("device_identify");
        this.i = stringExtra;
        this.h = mgg.b(stringExtra, "EarphonePairActivity");
        this.f = new b(this);
        lxb.c().e(this);
        i();
    }

    private void j() {
        this.f24631a = true;
        this.g.setVisibility(0);
        this.n.setVisibility(8);
        this.k.setVisibility(8);
        this.o.setVisibility(8);
        this.e.setVisibility(8);
        this.t.setVisibility(0);
        if (this.g.getDrawable() instanceof AnimationDrawable) {
            this.f24632b = (AnimationDrawable) this.g.getDrawable();
        }
        this.f24632b.start();
        this.p.setVisibility(0);
        this.r.setVisibility(0);
        this.r.setText(R.string.IDS_blite_guide_paire_opt_title);
        this.k.setVisibility(8);
        this.k.setText(R.string.IDS_ear_phone_pair_guide_note);
        this.e.setVisibility(0);
    }

    private void d() {
        this.f24633c.setOnClickListener(this);
        this.s.setOnClickListener(this);
        this.q.setOnClickListener(this);
        this.y.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.EarphonePairActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                lxb.c().d(EarphonePairActivity.this.h, EarphonePairActivity.this.j);
                EarphonePairActivity.this.setResult(6);
                EarphonePairActivity.this.finish();
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f = null;
        }
        lxb.c().b(this);
    }

    private void i() {
        if (!this.f.hasMessages(-2)) {
            this.f.sendEmptyMessageDelayed(-2, 60000L);
        }
        j();
        if (this.h == null) {
            LogUtil.j("EarphonePairActivity", "mCurrentDeviceInfo is null");
        } else {
            lxb.c().d(this.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        if (message.obj instanceof edj) {
            j();
            edj edjVar = (edj) message.obj;
            String strC = edjVar.c();
            this.j = edjVar.d();
            if (TextUtils.isEmpty(strC)) {
                this.m.setText("");
            } else {
                String string = getResources().getString(R.string.IDS_blite_guide_paire_current_device, strC);
                this.l.setVisibility(0);
                this.m.setText(string);
            }
            if (!b(edjVar)) {
                c();
                return;
            }
            if (TextUtils.isEmpty(this.j) || !BluetoothAdapter.checkBluetoothAddress(this.j)) {
                h();
                lxb.c().e(this.h);
                this.f.removeMessages(-2);
            } else if (c(edjVar) || this.d) {
                LogUtil.a("EarphonePairActivity", "start pair");
                lxb.c().a(this.h);
            } else {
                LogUtil.a("EarphonePairActivity", "waite device ignore");
                this.k.setVisibility(0);
                this.k.setText(R.string.IDS_ear_phone_pair_guide_note);
            }
        }
    }

    private boolean b(edj edjVar) {
        return (edjVar.b() & 1) != 0;
    }

    private boolean c(edj edjVar) {
        int iE = edjVar.e();
        int iA = edjVar.a();
        int iG = edjVar.g();
        LogUtil.a("EarphonePairActivity", "earphone status is: ", Integer.valueOf(iE), " earCloseStatus: ", Integer.valueOf(iA), " earphoneIgnore: ", Integer.valueOf(iG));
        if (iE == 3 && iA == 1) {
            return true;
        }
        return iG == 1 && iA == 1 && iE != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.k.setVisibility(8);
        this.d = true;
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.f24631a = false;
        this.f24632b.stop();
        this.g.setVisibility(8);
        this.l.setVisibility(8);
        this.n.setVisibility(0);
        this.n.setImageResource(R.drawable.ic_pairing_result_failure);
        this.r.setText(R.string.IDS_ear_phone_pair_guide_error);
        this.k.setVisibility(0);
        this.k.setText(R.string.IDS_ear_phone_pair_guide_error_note);
        this.o.setVisibility(0);
        this.e.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.f24631a = false;
        LogUtil.a("EarphonePairActivity", "updatePairSuccessView");
        setResult(5);
        finish();
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
    public void onResponse(int i, edj edjVar) {
        LogUtil.a("EarphonePairActivity", "executeResponse, errCode: ", Integer.valueOf(i));
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = edjVar;
        this.f.sendMessage(messageObtain);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        super.initViewTahiti();
        LogUtil.a("EarphonePairActivity", "initViewTahiti()");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("EarphonePairActivity", "onBackPressed()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
