package com.huawei.sim.esim.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.sim.R;
import com.huawei.sim.esim.view.adapter.EsimProfileAdapter;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.eeq;
import defpackage.lrx;
import defpackage.npz;
import defpackage.pve;
import defpackage.pxk;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public class EsimProfileActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f23040a;
    private int aa;
    private View ac;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f23042c;
    private EsimProfileAdapter d;
    private View e;
    private View f;
    private ImageView i;
    private View j;
    private Context k;
    private CustomTitleBar l;
    private CustomTextAlertDialog m;
    private ListView r;
    private boolean s;
    private lrx u;
    private View v;
    private HealthTextView x;
    private ImageView y;
    private ArrayList<pve> t = new ArrayList<>(16);
    private CommonDialog21 p = null;
    private int g = 3;
    private boolean o = true;
    private byte[] w = null;
    private boolean q = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBaseResponseCallback f23041b = new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.EsimProfileActivity.2
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("EsimProfileActivity", "errorCode:", Integer.valueOf(i));
            Message messageObtain = Message.obtain();
            messageObtain.what = 5;
            messageObtain.arg1 = i;
            if (i == 0 && EsimProfileActivity.this.q) {
                EsimProfileActivity.this.n.sendMessageDelayed(messageObtain, 5000L);
                return;
            }
            xjt.q("mBaseResponseCallback not is SUCCESS: " + i);
            EsimProfileActivity.this.n.sendMessage(messageObtain);
        }
    };
    private Handler n = new Handler() { // from class: com.huawei.sim.esim.view.EsimProfileActivity.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("EsimProfileActivity", "message is null");
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        EsimProfileActivity.this.a();
                        return;
                    } else if (i == 5) {
                        EsimProfileActivity.this.e(message.arg1);
                        return;
                    } else if (i != 6) {
                        LogUtil.j("EsimProfileActivity", "message:", Integer.valueOf(message.what));
                        return;
                    }
                }
                EsimProfileActivity.this.e();
                return;
            }
            EsimProfileActivity.this.d();
        }
    };
    private IBaseResponseCallback h = new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.EsimProfileActivity.5
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("EsimProfileActivity", "errorCode:", Integer.valueOf(i));
            EsimProfileActivity.this.n.removeMessages(6);
            if (i == 1) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                EsimProfileActivity.this.n.sendMessage(messageObtain);
            } else if (i == 2) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 2;
                EsimProfileActivity.this.n.sendMessage(messageObtain2);
            } else {
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 3;
                EsimProfileActivity.this.n.sendMessage(messageObtain3);
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_esim_profile);
        this.k = this;
        this.q = pxk.i();
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("eSim_profile");
            if (stringExtra != null) {
                this.u = (lrx) c(stringExtra, lrx.class);
            }
            this.s = intent.getBooleanExtra("confirm_status", false);
            this.aa = intent.getIntExtra("esim_new_original_key", 0);
        }
        i();
        h();
        npz.b().b(this.h);
    }

    private static <T> T c(String str, Class<T> cls) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = "{}";
            }
            return (T) new Gson().fromJson(CommonUtil.ac(str), (Class) cls);
        } catch (JsonSyntaxException unused) {
            LogUtil.e("EsimProfileActivity", "getModelFromJson JSONException");
            return null;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        int iC = npz.b().c();
        this.g = iC;
        if (iC == 2) {
            LogUtil.a("EsimProfileActivity", "mBtStatus is DEVICE_CONNECTED");
            d();
        } else if (iC == 1) {
            a();
        } else {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b();
        this.j.setVisibility(8);
        this.f.setVisibility(0);
        this.f23040a.setVisibility(8);
        this.v.setEnabled(false);
        this.x.setTextColor(getResources().getColor(R.color.IDS_plugin_sim_ext_back_color_20alpha));
        if (LanguageUtil.ba(this)) {
            this.y.setImageResource(R.drawable.sim_back_arrow_disable);
        } else {
            this.y.setImageResource(R.drawable.sim_next_arrow_disable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.j.setVisibility(8);
        this.f.setVisibility(8);
        if (!this.s && !this.o) {
            this.f23040a.setVisibility(0);
            this.x.setText(R.string.IDS_plugin_sim_esim_button_retry);
        } else {
            this.f23040a.setVisibility(8);
            this.x.setText(R.string.IDS_plugin_sim_next);
        }
        this.v.setEnabled(true);
        this.x.setTextColor(getResources().getColor(R.color.IDS_plugin_sim_next_back_color));
        if (LanguageUtil.ba(this)) {
            this.y.setImageResource(R.drawable.sim_back_arrow);
        } else {
            this.y.setImageResource(R.drawable.sim_next_arrow);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.j.setVisibility(0);
        this.f.setVisibility(8);
        this.f23040a.setVisibility(8);
        this.i.startAnimation(AnimationUtils.loadAnimation(this, R.anim.bt_connecting));
        this.v.setEnabled(false);
        this.x.setTextColor(getResources().getColor(R.color.IDS_plugin_sim_ext_back_color_20alpha));
        if (LanguageUtil.ba(this)) {
            this.y.setImageResource(R.drawable.sim_back_arrow_disable);
        } else {
            this.y.setImageResource(R.drawable.sim_next_arrow_disable);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        b();
        super.onDestroy();
        npz.b().a(this.h);
    }

    private void h() {
        byte b2;
        this.r = (ListView) findViewById(R.id.esim_profile);
        EsimProfileAdapter esimProfileAdapter = new EsimProfileAdapter(this.t, this);
        this.d = esimProfileAdapter;
        this.r.setAdapter((ListAdapter) esimProfileAdapter);
        this.l = (CustomTitleBar) findViewById(R.id.esim_profile_title_bar);
        j();
        this.f = findViewById(R.id.bt_disconnect);
        View viewFindViewById = findViewById(R.id.set_bt_reconnect);
        this.ac = viewFindViewById;
        if (this.q) {
            viewFindViewById.setVisibility(8);
        } else {
            viewFindViewById.setVisibility(0);
            this.ac.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimProfileActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    new Handler().post(new Runnable() { // from class: com.huawei.sim.esim.view.EsimProfileActivity.3.2
                        @Override // java.lang.Runnable
                        public void run() {
                            pxk.n(EsimProfileActivity.this);
                        }
                    });
                }
            });
        }
        this.j = findViewById(R.id.bt_connecting);
        this.i = (ImageView) findViewById(R.id.bt_connecting_imgage);
        LogUtil.a("EsimProfileActivity", "mProfilePolicyRules:", eeq.e(this.w));
        byte[] bArr = this.w;
        if (bArr != null && bArr.length > 0 && ((b2 = bArr[0]) == -128 || b2 == -64 || b2 == -32 || b2 == -96)) {
            LogUtil.a("EsimProfileActivity", "have PPR1 count");
            o();
        }
        this.e = findViewById(R.id.back_button_layout);
        this.f23042c = (ImageView) findViewById(R.id.back_button);
        this.v = findViewById(R.id.next_button_layout);
        f();
    }

    private void j() {
        this.l.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimProfileActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!EsimProfileActivity.this.q) {
                    npz.b().b(null, 1, EsimProfileActivity.this.f23041b, null);
                } else {
                    npz.b().b(null, 1, null, null);
                }
                EsimProfileActivity.this.g();
            }
        });
    }

    private void f() {
        c();
        this.v.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimProfileActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("EsimProfileActivity", "mNextButton setOnClickListener");
                if (EsimProfileActivity.this.w == null || (EsimProfileActivity.this.w.length > 0 && (EsimProfileActivity.this.w[0] == 0 || EsimProfileActivity.this.w[0] == -128))) {
                    LogUtil.a("EsimProfileActivity", "mProfilePolicyRules is null");
                    if (!EsimProfileActivity.this.s) {
                        if (EsimProfileActivity.this.q) {
                            npz.b().b(null, 0, null, EsimProfileActivity.this.f23041b);
                        } else {
                            npz.b().b(null, 0, EsimProfileActivity.this.f23041b, null);
                        }
                        EsimProfileActivity.this.d(R.string.IDS_plugin_sim_esim_handling);
                        return;
                    }
                    EsimProfileActivity.this.startActivity(new Intent(EsimProfileActivity.this, (Class<?>) ConfirmActivity.class));
                    EsimProfileActivity.this.finish();
                    return;
                }
                LogUtil.a("EsimProfileActivity", "PPR1&PPR2");
                Intent intent = new Intent(EsimProfileActivity.this, (Class<?>) EsimPprActivity.class);
                intent.putExtra("profile_policy_rules", EsimProfileActivity.this.w);
                intent.putExtra("confirm_status", EsimProfileActivity.this.s);
                EsimProfileActivity.this.startActivity(intent);
            }
        });
        this.x = (HealthTextView) findViewById(R.id.next_button_text);
        this.y = (ImageView) findViewById(R.id.next_button);
        View viewFindViewById = findViewById(R.id.bt_comunictaion_fail);
        this.f23040a = viewFindViewById;
        viewFindViewById.setVisibility(8);
        if (LanguageUtil.ba(this)) {
            this.y.setImageResource(R.drawable.sim_back_arrow);
            this.f23042c.setImageResource(R.drawable.sim_next_arrow);
        }
    }

    private void c() {
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimProfileActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("EsimProfileActivity", "mBackButton setOnClickListener");
                if (!EsimProfileActivity.this.q) {
                    npz.b().b(null, 1, EsimProfileActivity.this.f23041b, null);
                } else {
                    npz.b().b(null, 1, null, null);
                }
                EsimProfileActivity.this.g();
            }
        });
    }

    private void o() {
        LogUtil.a("EsimProfileActivity", "enter showHavePpr1CountDialog");
        String string = this.k.getResources().getString(R.string.IDS_plugin_multi_have_ppr_count_dialog_msg);
        if (this.m == null) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.k).a(R.string.IDS_service_area_notice_title).a(string).a(R.string.IDS_apphelp_pwindows_continue_button, new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimProfileActivity.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("EsimProfileActivity", "showUnbindDialog ok click");
                    EsimProfileActivity.this.m.dismiss();
                    EsimProfileActivity.this.m = null;
                }
            }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimProfileActivity.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("EsimProfileActivity", "showLoginFail cancel click");
                    EsimProfileActivity.this.m.dismiss();
                    EsimProfileActivity.this.m = null;
                    if (EsimProfileActivity.this.q) {
                        npz.b().b(null, 1, null, null);
                    } else {
                        npz.b().b(null, 1, EsimProfileActivity.this.f23041b, null);
                    }
                    EsimProfileActivity.this.finish();
                }
            }).b();
            this.m = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
            this.m.show();
        }
    }

    private void i() {
        lrx lrxVar = this.u;
        if (lrxVar != null) {
            if (!TextUtils.isEmpty(lrxVar.d()) && !Constants.NULL.equalsIgnoreCase(this.u.d())) {
                pve pveVar = new pve();
                pveVar.c(getString(R.string.IDS_plugin_sim_esim_profile_SPN));
                pveVar.d(this.u.d());
                pveVar.c(this.u.c());
                pveVar.c(1);
                this.t.add(pveVar);
            } else {
                LogUtil.j("EsimProfileActivity", "initData() SPN is null or empty");
            }
            if (!TextUtils.isEmpty(this.u.b()) && !Constants.NULL.equalsIgnoreCase(this.u.b())) {
                pve pveVar2 = new pve();
                pveVar2.c(getString(R.string.IDS_plugin_sim_esim_profile_name));
                pveVar2.d(this.u.b());
                pveVar2.c(0);
                this.t.add(pveVar2);
            } else {
                LogUtil.j("EsimProfileActivity", "initData() profile name is null or empty");
            }
            if (!TextUtils.isEmpty(this.u.a()) && !Constants.NULL.equalsIgnoreCase(this.u.a())) {
                pve pveVar3 = new pve();
                pveVar3.c(getString(R.string.IDS_plugin_sim_esim_profile_ICCID));
                pveVar3.d(this.u.a());
                pveVar3.c(0);
                this.t.add(pveVar3);
            } else {
                LogUtil.j("EsimProfileActivity", "initData() ICCID is null or empty");
            }
            this.w = this.u.e();
            return;
        }
        LogUtil.j("EsimProfileActivity", "initData() mProfile is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        LogUtil.a("EsimProfileActivity", "commandResult errorCode:", Integer.valueOf(i));
        if (this.s) {
            b();
            return;
        }
        pxk.a(i, true);
        if (i == 0) {
            this.o = true;
            Intent intent = new Intent(this, (Class<?>) EsimProfileSuccessActivity.class);
            intent.putExtra("confirm_status", false);
            startActivity(intent);
        } else {
            this.o = false;
            if (npz.b().c() == 2) {
                d();
            }
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        LogUtil.a("EsimProfileActivity", "showLoadingDialog");
        CommonDialog21 commonDialog21 = this.p;
        if (commonDialog21 == null) {
            new CommonDialog21(this, R.style.common_dialog21);
            CommonDialog21 commonDialog21B = CommonDialog21.b(this);
            this.p = commonDialog21B;
            commonDialog21B.b(getResources().getString(i));
            this.p.setCancelable(false);
        } else {
            commonDialog21.b(getResources().getString(i));
        }
        this.p.c();
    }

    private void b() {
        LogUtil.a("EsimProfileActivity", "enter dismissLoadingDialog");
        CommonDialog21 commonDialog21 = this.p;
        if (commonDialog21 == null || !commonDialog21.isShowing()) {
            return;
        }
        LogUtil.a("EsimProfileActivity", "dismissLoadingDialog");
        this.p.cancel();
        this.p = null;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        LogUtil.a("EsimProfileActivity", "onKeyDown");
        if (i == 4) {
            if (npz.b() != null) {
                if (this.q) {
                    npz.b().b(null, 1, null, null);
                } else {
                    npz.b().b(null, 1, this.f23041b, null);
                }
            }
            g();
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Intent intent = new Intent();
        if (this.aa == 1) {
            intent.setClass(this, EsimManagerActivity.class);
        } else {
            intent.setClass(this, EsimActivationActivity.class);
        }
        startActivity(intent);
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
