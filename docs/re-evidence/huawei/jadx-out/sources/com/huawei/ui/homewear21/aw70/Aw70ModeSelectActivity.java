package com.huawei.ui.homewear21.aw70;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.homewear21.R;
import defpackage.eej;
import defpackage.eel;
import defpackage.eeq;
import defpackage.lmf;
import defpackage.qpx;
import defpackage.qqz;
import defpackage.tfn;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public class Aw70ModeSelectActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceInfo f26181a;
    private String aa;
    private RelativeLayout ac;
    private RelativeLayout ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f26182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f26183c;
    private int d = 1;
    private HealthTextView e;
    private ImageView f;
    private ImageView g;
    private RelativeLayout h;
    private HealthTextView i;
    private HealthTextView j;
    private String k;
    private DeviceSettingsInteractors l;
    private CustomViewDialog m;
    private b n;
    private HealthRadioButton o;
    private ImageView p;
    private HealthRadioButton q;
    private LinearLayout r;
    private HealthTextView s;
    private int t;
    private HealthTextView u;
    private HealthTextView v;
    private ImageView w;
    private HealthTextView x;
    private HealthTextView y;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("AW70_Aw70ModeSelectActivity", "AW70onCreate");
        setContentView(R.layout.fragment_aw70_select_mode);
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.a("AW70_Aw70ModeSelectActivity", "onCreate intent is null");
            finish();
            return;
        }
        this.k = intent.getStringExtra("device_id");
        DeviceInfo deviceInfoE = tfn.a().e(this.k);
        this.f26181a = deviceInfoE;
        if (deviceInfoE != null) {
            int productType = deviceInfoE.getProductType();
            this.t = productType;
            LogUtil.a("AW70_Aw70ModeSelectActivity", "onCreate mProductType is ", Integer.valueOf(productType));
            d();
            j();
            return;
        }
        LogUtil.a("AW70_Aw70ModeSelectActivity", "onCreate mProductType is null");
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("AW70_Aw70ModeSelectActivity", "Inside onResume!");
        b(new IBaseResponseCallback() { // from class: com.huawei.ui.homewear21.aw70.Aw70ModeSelectActivity.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof byte[]) {
                    String strE = eeq.e((byte[]) obj);
                    LogUtil.a("AW70_Aw70ModeSelectActivity", "getSwitch berfore onResponse objectData is ", strE);
                    try {
                        int i2 = Integer.parseInt(strE.substring(strE.length() - 2, strE.length()));
                        if (i2 == 0) {
                            Aw70ModeSelectActivity.this.c(4);
                            Aw70ModeSelectActivity.this.d = 0;
                            LogUtil.a("AW70_Aw70ModeSelectActivity", "onResponse AUTO_SELECT_OFF value is ", Integer.valueOf(i2));
                        } else {
                            if (i2 == 1) {
                                Aw70ModeSelectActivity.this.c(3);
                                Aw70ModeSelectActivity.this.d = 1;
                                LogUtil.a("AW70_Aw70ModeSelectActivity", "onResponse AUTO_SELECT_ON value is ", Integer.valueOf(i2));
                                return;
                            }
                            LogUtil.j("AW70_Aw70ModeSelectActivity", "onResponse other value is wrong");
                        }
                    } catch (NumberFormatException e) {
                        LogUtil.e("AW70_Aw70ModeSelectActivity", "onResponse() e ", e.getMessage());
                    }
                }
            }
        });
        this.aa = SharedPreferenceManager.e(this, Integer.toString(10000), "KEY_AW70_WARE_MODE");
        h();
    }

    private void h() {
        if (c()) {
            f();
            return;
        }
        if ("HANDRING_MODE".equals(this.aa)) {
            this.j.setText(getString(R.string.IDS_aw_enable, new Object[]{getString(R.string.IDS_aw_handring_mode)}));
            this.x.setText(getString(R.string.IDS_aw_running_mode));
        } else if ("RUNNING_MODE".equals(this.aa)) {
            this.j.setText(getString(R.string.IDS_aw_handring_mode));
            this.x.setText(getString(R.string.IDS_aw_enable, new Object[]{getString(R.string.IDS_aw_running_mode)}));
        } else {
            LogUtil.a("AW70_Aw70ModeSelectActivity", "judgeViewWordShow get wareMode failed");
        }
    }

    private void f() {
        if ("HANDRING_MODE".equals(this.aa)) {
            this.j.setText(getString(R.string.IDS_aw_enable, new Object[]{getString(R.string.IDS_aw_handring_mode)}));
            this.x.setText(getString(R.string.IDS_aw_pro_shoe_buckle));
        } else if ("RUNNING_MODE".equals(this.aa)) {
            this.j.setText(getString(R.string.IDS_aw_handring_mode));
            this.x.setText(getString(R.string.IDS_aw_enable, new Object[]{getString(R.string.IDS_aw_pro_shoe_buckle)}));
        } else {
            LogUtil.a("AW70_Aw70ModeSelectActivity", "judgeViewWordShow get wareMode failed");
            return;
        }
        if (e()) {
            this.r.setVisibility(0);
            this.s.setText(getString(R.string.IDS_aw70_support_sport_type));
            this.u.setText(getString(R.string.IDS_aw70_support_running));
            this.v.setText(getString(R.string.IDS_aw70_support_basketball));
            this.y.setText(getString(R.string.IDS_aw70_support_cycling));
            return;
        }
        if (eel.b(this.t)) {
            this.r.setVisibility(8);
            this.s.setText(getString(R.string.IDS_aw_pro_support_run_basketball_function));
        } else {
            LogUtil.j("AW70_Aw70ModeSelectActivity", "showRunModeDescribeAw70 is other device");
        }
    }

    private boolean e() {
        DeviceInfo deviceInfo = this.f26181a;
        if (deviceInfo == null) {
            return false;
        }
        int productType = deviceInfo.getProductType();
        LogUtil.a("AW70_Aw70ModeSelectActivity", "productType:", Integer.valueOf(productType));
        if (productType == 63) {
            return true;
        }
        DeviceCapability deviceCapabilityA = eej.a(this.f26181a.getDeviceIdentify());
        return productType == 36 && deviceCapabilityA != null && deviceCapabilityA.isSupportWorkoutCapabilicy();
    }

    private void b() {
        this.j = (HealthTextView) findViewById(R.id.aw70_handring_mode_tv);
        this.x = (HealthTextView) findViewById(R.id.aw70_running_mode_tv);
        this.s = (HealthTextView) findViewById(R.id.aw70_running_mode_describe_tv);
        this.i = (HealthTextView) findViewById(R.id.aw70_change_mode_tv);
        this.f26182b = (HealthTextView) findViewById(R.id.aw70_run_mode_position_describe_tv);
        this.e = (HealthTextView) findViewById(R.id.aw70_auto_change_mode_describe_tv);
        this.u = (HealthTextView) findViewById(R.id.aw70_support_running_tv);
        this.v = (HealthTextView) findViewById(R.id.aw70_support_basketball);
        this.y = (HealthTextView) findViewById(R.id.aw70_support_cycling);
        this.h = (RelativeLayout) findViewById(R.id.aw70_auto_change_mode_rly);
        this.r = (LinearLayout) findViewById(R.id.aw70_running_mode_describe_lv);
        this.g = (ImageView) findViewById(R.id.aw70_change_mode_img);
        this.w = (ImageView) findViewById(R.id.aw70_running_mode_select_img);
        this.f = (ImageView) findViewById(R.id.aw70_handring_mode_describe_iv);
        this.p = (ImageView) findViewById(R.id.aw70_running_mode_describe_iv);
        this.h.setOnClickListener(this);
    }

    private void d() {
        b();
        if (getResources().getDrawable(R.drawable.ic_health_list_arrow_gray) instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawableE = (BitmapDrawable) getResources().getDrawable(R.drawable.ic_health_list_arrow_gray);
            if (LanguageUtil.ba(this)) {
                bitmapDrawableE = qqz.e(this, R.drawable.ic_health_list_arrow_gray);
            }
            this.g.setImageDrawable(bitmapDrawableE);
            this.w.setImageDrawable(bitmapDrawableE);
        }
        Context context = BaseApplication.getContext();
        this.f26183c = context;
        this.l = DeviceSettingsInteractors.e(context);
        this.n = new b(this);
        this.i.setText(getString(R.string.IDS_aw_auto_mode));
        this.e.setText(getString(R.string.IDS_aw_auto_change_mode_close));
        if (c()) {
            this.f.setImageResource(R.mipmap.pic_wearing_aw70_pro_hand);
            this.p.setImageResource(R.mipmap.pic_wearing_aw70_pro_foot);
            this.f26182b.setText(getString(R.string.IDS_aw_run_mode_position_describe, new Object[]{getString(R.string.IDS_aw_pro_shoe_buckle)}));
        } else {
            this.f26182b.setText(getString(R.string.IDS_aw_run_mode_position_describe, new Object[]{getString(R.string.IDS_aw_running_mode)}));
        }
        this.aa = SharedPreferenceManager.e(this, Integer.toString(10000), "KEY_AW70_WARE_MODE");
        h();
        a();
    }

    private void a() {
        b(new IBaseResponseCallback() { // from class: com.huawei.ui.homewear21.aw70.Aw70ModeSelectActivity.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                try {
                    String strE = eeq.e((byte[]) obj);
                    LogUtil.a("AW70_Aw70ModeSelectActivity", "getSwitch berfore onResponse objData is ", strE);
                    int i2 = Integer.parseInt(strE.substring(strE.length() - 2));
                    if (i2 == 0) {
                        Aw70ModeSelectActivity.this.c(4);
                        Aw70ModeSelectActivity.this.d = 0;
                        LogUtil.a("AW70_Aw70ModeSelectActivity", "onResponse AUTO_SELECT_OFF value is ", Integer.valueOf(i2));
                    } else {
                        if (i2 == 1) {
                            Aw70ModeSelectActivity.this.c(3);
                            Aw70ModeSelectActivity.this.d = 1;
                            LogUtil.a("AW70_Aw70ModeSelectActivity", "onResponse AUTO_SELECT_ON value is ", Integer.valueOf(i2));
                            return;
                        }
                        LogUtil.a("AW70_Aw70ModeSelectActivity", "onResponse other value is wrong");
                    }
                } catch (NumberFormatException e) {
                    LogUtil.a("AW70_Aw70ModeSelectActivity", "onResponse() e = ", e.getMessage());
                }
            }
        });
    }

    /* JADX INFO: renamed from: com.huawei.ui.homewear21.aw70.Aw70ModeSelectActivity$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogUtil.a("AW70_Aw70ModeSelectActivity", "setRunningModePosition() dialog start");
            View viewInflate = ((LayoutInflater) Aw70ModeSelectActivity.this.getSystemService("layout_inflater")).inflate(R.layout.fragment_aw70_select_auto_mode, (ViewGroup) null);
            CustomViewDialog.Builder builder = new CustomViewDialog.Builder(Aw70ModeSelectActivity.this);
            builder.a(Aw70ModeSelectActivity.this.getString(R.string.IDS_aw_auto_change_mode_title)).d(viewInflate).c(com.huawei.ui.main.R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: tfm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LogUtil.a("AW70_Aw70ModeSelectActivity", "onClick dialog dismiss is fail");
                }
            });
            Aw70ModeSelectActivity.this.m = builder.d();
            if (Aw70ModeSelectActivity.this.d(viewInflate)) {
                Aw70ModeSelectActivity.this.m.show();
            } else {
                LogUtil.d("AW70_Aw70ModeSelectActivity", "setRunningModePosition() dialog layout fail");
                Aw70ModeSelectActivity.this.m = null;
            }
        }
    }

    private void j() {
        this.h.setClickable(true);
        this.h.setOnClickListener(new AnonymousClass1());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.h) {
            CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this);
            this.m = builder.d();
            builder.c(com.huawei.ui.main.R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: tfj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LogUtil.a("AW70_Aw70ModeSelectActivity", "onClick dialog is dismiss");
                }
            });
            this.m.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.l.e(this.k, this.d, new IBaseResponseCallback() { // from class: com.huawei.ui.homewear21.aw70.Aw70ModeSelectActivity.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("AW70_Aw70ModeSelectActivity", "setActivityReminder errCode is " + i + ", objData is " + obj);
                if (i != 0) {
                    qpx.b(Aw70ModeSelectActivity.this.f26183c, R.string.IDS_music_management_operation_failed);
                }
            }
        });
        if (this.d == 1) {
            c(3);
        } else {
            c(4);
        }
        HashMap map = new HashMap(1);
        map.put("click", "1");
        String strValue = AnalyticsValue.HEALTH_PLUGIN_DEVICE_AW70_AUTO_SELECT_2060028.value();
        lmf.d().c(this, strValue, map, 0);
        LogUtil.a("AW70_Aw70ModeSelectActivity", "BI save notification click event finish, value is " + strValue);
    }

    private void b(IBaseResponseCallback iBaseResponseCallback) {
        this.l.a(this.k, iBaseResponseCallback);
    }

    static class b extends Handler {
        private final WeakReference<Aw70ModeSelectActivity> d;

        b(Aw70ModeSelectActivity aw70ModeSelectActivity) {
            this.d = new WeakReference<>(aw70ModeSelectActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Aw70ModeSelectActivity aw70ModeSelectActivity = this.d.get();
            if (aw70ModeSelectActivity == null) {
                super.handleMessage(message);
                return;
            }
            LogUtil.a("AW70_Aw70ModeSelectActivity", "Handle Message is " + message.what);
            int i = message.what;
            if (i == 3) {
                aw70ModeSelectActivity.e(3);
            } else {
                if (i != 4) {
                    return;
                }
                aw70ModeSelectActivity.e(4);
            }
        }
    }

    private boolean c() {
        return eel.b(this.t) || e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        if (c()) {
            if (i == 3) {
                this.e.setText(getString(R.string.IDS_aw_pro_automatically_switch_shoe_button_mode));
                this.i.setText(R.string.IDS_aw_auto_mode);
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.e.setText(getString(R.string.IDS_aw_auto_change_mode_close));
                this.i.setText(R.string.IDS_aw_manual_mode);
                return;
            }
        }
        if (i == 3) {
            this.e.setText(getString(R.string.IDS_aw_auto_change_mode_open));
            this.i.setText(R.string.IDS_aw_auto_mode);
        } else {
            if (i != 4) {
                return;
            }
            this.e.setText(getString(R.string.IDS_aw_auto_change_mode_close));
            this.i.setText(R.string.IDS_aw_manual_mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        Message messageObtainMessage = this.n.obtainMessage();
        messageObtainMessage.what = i;
        this.n.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(View view) {
        LogUtil.a("AW70_Aw70ModeSelectActivity", "initializeSettingModeDialogLayout()");
        if (view == null) {
            return false;
        }
        this.q = (HealthRadioButton) view.findViewById(R.id.settings_mode_imgview1);
        this.o = (HealthRadioButton) view.findViewById(R.id.settings_mode_imgview2);
        this.ac = (RelativeLayout) view.findViewById(R.id.settings_mode_view_layout1);
        this.ad = (RelativeLayout) view.findViewById(R.id.settings_mode_view_layout2);
        this.ac.setOnClickListener(new a(this));
        this.ad.setOnClickListener(new c(this));
        int i = this.d;
        if (i == 1) {
            this.q.setChecked(true);
            this.o.setChecked(false);
        } else if (i == 0) {
            this.o.setChecked(true);
            this.q.setChecked(false);
        } else {
            LogUtil.a("AW70_Aw70ModeSelectActivity", "initializeSettingModeDialogLayout() fail! data uninitialize");
        }
        return true;
    }

    class a implements View.OnClickListener {
        private final WeakReference<Aw70ModeSelectActivity> d;

        a(Aw70ModeSelectActivity aw70ModeSelectActivity) {
            this.d = new WeakReference<>(aw70ModeSelectActivity);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogUtil.a("AW70_Aw70ModeSelectActivity", "MyOpenOnClickListener onClick()");
            Aw70ModeSelectActivity aw70ModeSelectActivity = this.d.get();
            if (aw70ModeSelectActivity != null) {
                aw70ModeSelectActivity.o.setChecked(false);
                aw70ModeSelectActivity.q.setChecked(true);
                aw70ModeSelectActivity.d = 1;
                Aw70ModeSelectActivity.this.i();
                Aw70ModeSelectActivity.this.m.dismiss();
                return;
            }
            LogUtil.e("AW70_Aw70ModeSelectActivity", "MyOpenOnClickListener Aw70ModeSelectActivity is null");
        }
    }

    class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<Aw70ModeSelectActivity> f26188b;

        c(Aw70ModeSelectActivity aw70ModeSelectActivity) {
            this.f26188b = new WeakReference<>(aw70ModeSelectActivity);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogUtil.a("AW70_Aw70ModeSelectActivity", "MyCloseOnClickListener onClick()");
            Aw70ModeSelectActivity aw70ModeSelectActivity = this.f26188b.get();
            if (aw70ModeSelectActivity != null) {
                aw70ModeSelectActivity.o.setChecked(true);
                aw70ModeSelectActivity.q.setChecked(false);
                aw70ModeSelectActivity.d = 0;
                Aw70ModeSelectActivity.this.i();
                Aw70ModeSelectActivity.this.m.dismiss();
                return;
            }
            LogUtil.e("AW70_Aw70ModeSelectActivity", "MyCloseOnClickListener Aw70ModeSelectActivity is null");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
