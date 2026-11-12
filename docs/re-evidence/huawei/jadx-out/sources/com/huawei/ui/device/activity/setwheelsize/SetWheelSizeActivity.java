package com.huawei.ui.device.activity.setwheelsize;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.setwheelsize.SetWheelSizeActivity;
import defpackage.eeg;
import defpackage.med;
import defpackage.mef;
import defpackage.mhs;
import defpackage.mip;
import defpackage.qrs;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HEXUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.UnitUtil;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes16.dex */
public class SetWheelSizeActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f24710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomAlertDialog f24711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f24712c;
    private DeviceInfo d;
    private HealthNumberPicker e;
    private ImageView h;
    private HealthEditText i;
    private HealthTextView j;
    private CustomAlertDialog l;
    private RelativeLayout o;
    private String k = UnitUtil.e(1.0d, 1, 0);
    private String n = UnitUtil.e(2999.0d, 1, 0);
    private boolean m = false;
    private DialogInterface.OnClickListener f = new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.setwheelsize.SetWheelSizeActivity.2
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            med.c().a().c(0);
            int value = SetWheelSizeActivity.this.e.getValue();
            if (value >= 0 && value < mef.c().size()) {
                SetWheelSizeActivity.this.j.setText(mef.c().get(value));
                SetWheelSizeActivity.this.h();
                SetWheelSizeActivity.this.j();
                long jCurrentTimeMillis = System.currentTimeMillis();
                mhs.a().setSwitchSettingToDb(mip.a(SetWheelSizeActivity.this.d.getDeviceIdentify()), mip.e(String.valueOf(jCurrentTimeMillis), SetWheelSizeActivity.this.b()));
            }
            SetWheelSizeActivity.this.e();
        }
    };
    private final BroadcastReceiver g = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.setwheelsize.SetWheelSizeActivity.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("SetWheelSizeActivity", "mDeviceStatusReceiver onReceive intent is null.");
                return;
            }
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                LogUtil.j("SetWheelSizeActivity", "mDeviceStatusReceiver onReceive action is null");
                return;
            }
            LogUtil.a("SetWheelSizeActivity", "mDeviceStatusReceiver onReceive action :", action);
            if (!"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                LogUtil.j("SetWheelSizeActivity", "device status not change");
                return;
            }
            Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
            DeviceInfo deviceInfo = parcelableExtra instanceof DeviceInfo ? (DeviceInfo) parcelableExtra : null;
            if (deviceInfo == null || SetWheelSizeActivity.this.d == null || !deviceInfo.getDeviceIdentify().equals(SetWheelSizeActivity.this.d.getDeviceIdentify())) {
                LogUtil.j("SetWheelSizeActivity", "mDeviceStatusReceiver not current device");
                return;
            }
            med.c().e();
            LogUtil.a("SetWheelSizeActivity", "deviceInfo.getDeviceConnectState(),", Integer.valueOf(deviceInfo.getDeviceConnectState()));
            SetWheelSizeActivity.this.c(deviceInfo);
        }
    };

    public static /* synthetic */ void c(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceConnectState() != 2) {
            this.f24712c.setVisibility(0);
            this.o.setEnabled(false);
            e(this.o.getLayoutParams(), false);
            c();
            e();
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 2) {
            this.f24712c.setVisibility(4);
            this.o.setEnabled(true);
            e(this.o.getLayoutParams(), true);
            return;
        }
        LogUtil.j("SetWheelSizeActivity", "other status");
    }

    private void e(ViewGroup.LayoutParams layoutParams, boolean z) {
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (z) {
                layoutParams2.addRule(3, R.id.rimSizeBar);
            } else {
                layoutParams2.addRule(3, R.id.find_error_layout);
            }
            this.o.setLayoutParams(layoutParams2);
        }
    }

    private void c() {
        CustomAlertDialog customAlertDialog = this.f24711b;
        if (customAlertDialog == null || !customAlertDialog.isShowing()) {
            return;
        }
        this.f24711b.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        CustomAlertDialog customAlertDialog = this.l;
        if (customAlertDialog == null || !customAlertDialog.isShowing()) {
            return;
        }
        this.l.dismiss();
    }

    private void i() {
        BroadcastManagerUtil.c(this.f24710a, this.g, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    private void n() {
        try {
            LogUtil.a("SetWheelSizeActivity", "Enter unregisterBindDeviceBroadcast()!");
            unregisterReceiver(this.g);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("SetWheelSizeActivity", "unregisterBindDeviceBroadcast failed");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f24710a = this;
        setContentView(R.layout.activity_set_wheel_size);
        i();
        d();
    }

    private void d() {
        String stringExtra;
        Parcelable parcelableExtra;
        this.o = (RelativeLayout) findViewById(R.id.rim);
        this.j = (HealthTextView) findViewById(R.id.textView_size);
        this.h = (ImageView) findViewById(R.id.imageView_arrow);
        if (LanguageUtil.ba(this)) {
            this.h.setBackgroundResource(R.drawable.common_ui_arrow_left);
        } else {
            this.h.setBackgroundResource(R.drawable.common_ui_arrow_right);
        }
        this.f24712c = (RelativeLayout) findViewById(R.id.find_error_layout);
        this.o.setOnClickListener(this);
        Intent intent = getIntent();
        if (intent == null) {
            stringExtra = "";
            parcelableExtra = null;
        } else {
            stringExtra = intent.getStringExtra("rimSize");
            parcelableExtra = intent.getParcelableExtra("device");
        }
        if (parcelableExtra instanceof DeviceInfo) {
            this.d = (DeviceInfo) parcelableExtra;
        }
        if (this.d == null) {
            LogUtil.j("SetWheelSizeActivity", "onCreate mDeviceInfo is null");
        } else {
            this.j.setText(stringExtra);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.o) {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        int iC = med.c().a().c();
        int iE = med.c().a().e();
        return med.c().a().a() + "," + iC + "," + iE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (med.c().a().c() == 0) {
            med.c().a().b(this.e.getValue());
            med.c().a().e(3000);
        } else {
            med.c().a().b(1);
            try {
                med.c().a().e(Integer.parseInt(this.i.getText().toString().trim()));
            } catch (NumberFormatException unused) {
                LogUtil.e("SetWheelSizeActivity", "setSendData NumberFormatException");
                return;
            }
        }
        med.c().a().a(System.currentTimeMillis());
    }

    private void f() {
        if (this.l == null) {
            View viewInflate = getLayoutInflater().inflate(R.layout.dialog_set_wheel_size, (ViewGroup) null);
            HealthNumberPicker healthNumberPicker = (HealthNumberPicker) viewInflate.findViewById(R.id.bicycle_size_picker);
            this.e = healthNumberPicker;
            healthNumberPicker.setDisplayedValues((String[]) mef.c().toArray(new String[0]));
            this.e.setMinValue(0);
            this.e.setMaxValue(mef.c().size() - 1);
            this.e.setWrapSelectorWheel(false);
            int iE = med.c().a().e();
            if (med.c().a().c() == 0) {
                this.e.setValue(iE);
            } else {
                this.e.setValue(9);
            }
            HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.custom_setting_button);
            CustomAlertDialog.Builder builderA = new CustomAlertDialog.Builder(this).a(viewInflate).d(R.string.IDS_bolt_wheel_set_confirm, this.f).a(R.string.IDS_bolt_wheel_set_cancel, new DialogInterface.OnClickListener() { // from class: qzw
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f47042c.e(dialogInterface, i);
                }
            });
            healthTextView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.setwheelsize.SetWheelSizeActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SetWheelSizeActivity.this.g();
                    SetWheelSizeActivity.this.e();
                }
            });
            CustomAlertDialog customAlertDialogB = builderA.b();
            this.l = customAlertDialogB;
            customAlertDialogB.setCancelable(false);
        }
        this.l.show();
    }

    public /* synthetic */ void e(DialogInterface dialogInterface, int i) {
        e();
    }

    private void e(final View view, final HealthButton healthButton) {
        final HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.custom_target_unit);
        healthTextView.setText(this.f24710a.getResources().getQuantityString(R.plurals.IDS_bolt_wheel_set_unit, 0, ""));
        healthTextView.setVisibility(8);
        this.i.addTextChangedListener(new TextWatcher() { // from class: com.huawei.ui.device.activity.setwheelsize.SetWheelSizeActivity.5
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                LogUtil.a("SetWheelSizeActivity", "custom input before");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SetWheelSizeActivity.this.b(view, charSequence);
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (!SetWheelSizeActivity.this.m) {
                    boolean z = true;
                    SetWheelSizeActivity.this.m = true;
                    String strTrim = editable.toString().trim();
                    if (TextUtils.isEmpty(strTrim)) {
                        healthTextView.setVisibility(8);
                        healthButton.setEnabled(false);
                        SetWheelSizeActivity.this.m = false;
                        return;
                    }
                    healthTextView.setVisibility(0);
                    try {
                        int i = Integer.parseInt(strTrim);
                        if (i < 1 || i > 2999) {
                            z = false;
                        }
                        healthButton.setEnabled(z);
                    } catch (NumberFormatException unused) {
                        LogUtil.e("SetWheelSizeActivity", "setTextWatcher NumberFormatException");
                    }
                    SetWheelSizeActivity.this.m = false;
                    return;
                }
                LogUtil.a("SetWheelSizeActivity", "mIsFlag is true");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view, CharSequence charSequence) {
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.remind);
        if (charSequence == null || TextUtils.isEmpty(charSequence.toString())) {
            return;
        }
        try {
            int i = Integer.parseInt(String.valueOf(charSequence));
            if (i >= 1 && i <= 2999) {
                healthTextView.setVisibility(8);
                return;
            }
            healthTextView.setVisibility(0);
        } catch (NumberFormatException unused) {
            LogUtil.e("SetWheelSizeActivity", "handleTextChanged NumberFormatException");
        }
    }

    private SpannedString a() {
        SpannableString spannableString = new SpannableString(getString(R.string.IDS_bolt_wheel_prompt_message, new Object[]{this.k, this.n}));
        if (qrs.v()) {
            spannableString.setSpan(new AbsoluteSizeSpan(24, true), 0, spannableString.length(), 33);
        }
        return new SpannedString(spannableString);
    }

    private void e(View view, CustomAlertDialog.Builder builder) {
        HealthEditText healthEditText = (HealthEditText) view.findViewById(R.id.custom_target_editText);
        this.i = healthEditText;
        healthEditText.setHint(a());
        this.i.setMaxLines(2);
        this.i.setHorizontallyScrolling(false);
        this.i.setInputType(131074);
        new Timer("SetWheelSizeActivity").schedule(new TimerTask() { // from class: com.huawei.ui.device.activity.setwheelsize.SetWheelSizeActivity.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Object systemService = SetWheelSizeActivity.this.i.getContext().getSystemService("input_method");
                if (systemService instanceof InputMethodManager) {
                    ((InputMethodManager) systemService).showSoftInput(SetWheelSizeActivity.this.i, 0);
                }
            }
        }, 300L);
        this.i.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
        HealthButton healthButtonC = builder.c();
        healthButtonC.setEnabled(false);
        e(view, healthButtonC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LogUtil.j("SetWheelSizeActivity", "showDialog Entering");
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.custom_set_wheel_size, (ViewGroup) null);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this);
        e(viewInflate, builder);
        builder.d(R.string.IDS_bolt_wheel_size).a(viewInflate).a(R.string.IDS_bolt_wheel_set_cancel, new DialogInterface.OnClickListener() { // from class: qzx
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SetWheelSizeActivity.c(dialogInterface, i);
            }
        }).d(R.string.IDS_bolt_wheel_set_confirm, new DialogInterface.OnClickListener() { // from class: qzu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.d.b(dialogInterface, i);
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        this.f24711b = customAlertDialogB;
        if (customAlertDialogB == null || customAlertDialogB.isShowing()) {
            return;
        }
        this.f24711b.setCancelable(false);
        this.f24711b.show();
    }

    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        med.c().a().c(1);
        try {
            this.j.setText(this.f24710a.getResources().getQuantityString(R.plurals.IDS_bolt_wheel_set_unit, Integer.parseInt(this.i.getText().toString().trim()), UnitUtil.e(Integer.parseInt(this.i.getText().toString().trim()), 1, 0)));
        } catch (NumberFormatException unused) {
            LogUtil.e("SetWheelSizeActivity", "showDialog NumberFormatException");
            this.j.setText("");
        }
        h();
        j();
        mhs.a().setSwitchSettingToDb(mip.a(this.d.getDeviceIdentify()), mip.e(String.valueOf(System.currentTimeMillis()), b()));
        LogUtil.j("SetWheelSizeActivity", "custom set rimSize");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        med.c().c(this.d, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.setwheelsize.SetWheelSizeActivity.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("SetWheelSizeActivity", "onCreate sendSettingDeviceCommand onResponse errorCode,", Integer.valueOf(i));
                if (i == 100000 && (obj instanceof eeg)) {
                    eeg eegVar = (eeg) obj;
                    int iV = CommonUtil.v(HEXUtils.a(eegVar.e()));
                    LogUtil.a("SetWheelSizeActivity", "onCreate onResponse,", Integer.valueOf(eegVar.d()), Integer.valueOf(iV));
                    if (eegVar.d() == 1 && iV == 0) {
                        LogUtil.a("SetWheelSizeActivity", "sendSettingDeviceCommand success");
                    } else {
                        LogUtil.a("SetWheelSizeActivity", "sendSettingDeviceCommand showResponseFailedDialog");
                    }
                }
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("SetWheelSizeActivity", "onDestroy()");
        n();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
