package com.huawei.health.device.ui.measure.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.manager.DeviceCloudSharePreferencesManager;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.DeviceServiceInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceControlDataModelReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceDeleteAuthorizeSubUserReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceUpdateAuthorizeSubUserReq;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.dxw;
import defpackage.dyg;
import defpackage.eaj;
import defpackage.ecf;
import defpackage.ecj;
import defpackage.lqo;
import defpackage.qlo;
import defpackage.qpx;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class WifiDeviceShareAccountActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f6358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f6359b;
    private NoTitleCustomAlertDialog d;
    private HealthButton e;
    private CustomViewDialog.Builder g;
    private ImageView h;
    private CustomViewDialog i;
    private HealthDivider j;
    private a k;
    private CommonDialog21 m;
    private HealthEditText o;
    private HealthTextView p;
    private HealthTextView q;
    private HealthTextView r;
    private LinearLayout s;
    private HealthButton t;
    private NoTitleCustomAlertDialog u;
    private CustomTitleBar v;
    private eaj y;
    private String f = "";
    private String n = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6360c = false;
    private boolean l = false;

    static class a extends StaticHandler<WifiDeviceShareAccountActivity> {
        a(WifiDeviceShareAccountActivity wifiDeviceShareAccountActivity) {
            super(wifiDeviceShareAccountActivity);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessage(WifiDeviceShareAccountActivity wifiDeviceShareAccountActivity, Message message) throws Throwable {
            if (wifiDeviceShareAccountActivity == null || wifiDeviceShareAccountActivity.isDestroyed() || wifiDeviceShareAccountActivity.isFinishing()) {
                dyg.a(false, "WifiDeviceShareAccountActivity", "activity is not exist");
                return;
            }
            dyg.a(false, "WifiDeviceShareAccountActivity", "MyHandler what:", Integer.valueOf(message.what));
            switch (message.what) {
                case 1001:
                    wifiDeviceShareAccountActivity.b();
                    qpx.e(wifiDeviceShareAccountActivity.f6358a, wifiDeviceShareAccountActivity.f6358a.getResources().getString(R.string.IDS_device_wifi_share_input_note_success));
                    wifiDeviceShareAccountActivity.r.setText(wifiDeviceShareAccountActivity.n);
                    wifiDeviceShareAccountActivity.q.setText(wifiDeviceShareAccountActivity.n);
                    wifiDeviceShareAccountActivity.y.b(wifiDeviceShareAccountActivity.n);
                    wifiDeviceShareAccountActivity.f6360c = true;
                    ecf.e(wifiDeviceShareAccountActivity.f, wifiDeviceShareAccountActivity.y);
                    break;
                case 1002:
                    wifiDeviceShareAccountActivity.e();
                    break;
                case 1003:
                    wifiDeviceShareAccountActivity.b();
                    ecf.d(wifiDeviceShareAccountActivity.f, wifiDeviceShareAccountActivity.y);
                    wifiDeviceShareAccountActivity.setResult(12);
                    wifiDeviceShareAccountActivity.finish();
                    break;
                case 1004:
                    wifiDeviceShareAccountActivity.b();
                    qpx.e(wifiDeviceShareAccountActivity.f6358a, R.string.IDS_update_server_bussy);
                    break;
                case 1005:
                    wifiDeviceShareAccountActivity.b();
                    wifiDeviceShareAccountActivity.m();
                    break;
                default:
                    dyg.d(false, "MyHandler what is other", new Object[0]);
                    break;
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dyg.a(false, "WifiDeviceShareAccountActivity", "onCreate");
        setContentView(R.layout.wifi_device_share_account_layout);
        this.f6358a = this;
        this.k = new a(this);
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.getSerializableExtra("share_sub_user_info") instanceof eaj) {
                this.y = (eaj) intent.getSerializableExtra("share_sub_user_info");
            } else {
                LogUtil.j("WifiDeviceShareAccountActivity", "onCreate, SHARE_SUB_USER_INFO isn't SubUser");
            }
            this.f = intent.getStringExtra("deviceId");
            this.l = intent.getBooleanExtra("isSubUser", false);
        }
        g();
        c();
        i();
    }

    private void g() {
        this.v = (CustomTitleBar) qsp.a(this, R.id.wifi_device_share_title);
        this.h = (ImageView) qsp.a(this, R.id.share_member_header_img);
        this.r = (HealthTextView) qsp.a(this, R.id.share_member_header_title_tv);
        this.p = (HealthTextView) qsp.a(this, R.id.share_member_sub_title_tv);
        this.q = (HealthTextView) qsp.a(this, R.id.share_member_note_tv);
        this.j = (HealthDivider) findViewById(R.id.item_divide_line_view);
        this.s = (LinearLayout) qsp.a(this, R.id.share_member_note_layout);
        this.e = (HealthButton) qsp.a(this, R.id.delete_member_btn);
        this.f6359b = (ImageView) qsp.a(this, R.id.share_arrow_img);
        this.j.setVisibility(8);
        if (this.l) {
            this.e.setVisibility(8);
        }
        if (LanguageUtil.ba(this)) {
            this.f6359b.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            this.f6359b.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
        }
    }

    private void c() {
        this.v.setLeftButtonClickable(true);
        this.v.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: dum
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32390c.e(view);
            }
        });
        this.s.setOnClickListener(this);
        this.e.setOnClickListener(this);
    }

    public /* synthetic */ void e(View view) {
        if (this.f6360c) {
            setResult(11);
        }
        finish();
    }

    private void i() {
        if (this.y != null) {
            if (this.l) {
                DeviceCloudSharePreferencesManager deviceCloudSharePreferencesManager = new DeviceCloudSharePreferencesManager(dxw.d());
                StringBuilder sb = new StringBuilder(16);
                sb.append(this.f);
                sb.append("_");
                sb.append(this.y.a());
                String strE = deviceCloudSharePreferencesManager.e(sb.toString());
                if (!TextUtils.isEmpty(strE)) {
                    this.y.b(strE);
                }
            }
            if (!TextUtils.isEmpty(this.y.c())) {
                this.r.setText(this.y.c());
                this.q.setText(this.y.c());
            } else {
                this.r.setText(this.y.e());
            }
            this.p.setText(this.y.e());
            ecj.e(this.y.b(), this.h, qlo.b(this.f6358a.getResources(), new qlo.e(null, this.y.a(), true)));
            return;
        }
        LogUtil.j("WifiDeviceShareAccountActivity", "WifiDeviceShareAccountActivity initUserInfo mSubUserInfo is null");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.a("WifiDeviceShareAccountActivity", "onClick view is null");
            return;
        }
        int id = view.getId();
        if (id == R.id.share_member_note_layout) {
            k();
        } else if (id != R.id.delete_member_btn) {
            dyg.d(false, "WifiDeviceShareAccountActivity", "onClick default");
        } else {
            o();
        }
    }

    private void k() {
        dyg.a(false, "WifiDeviceShareAccountActivity", "showEditNickDialog");
        CustomViewDialog customViewDialog = this.i;
        if (customViewDialog == null || !customViewDialog.isShowing()) {
            if (!(this.f6358a.getSystemService("layout_inflater") instanceof LayoutInflater)) {
                LogUtil.j("WifiDeviceShareAccountActivity", "mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) not instance of LayoutInflater");
                return;
            }
            View viewInflate = ((LayoutInflater) this.f6358a.getSystemService("layout_inflater")).inflate(R.layout.commonui_dialog_single_edit, (ViewGroup) null);
            if (viewInflate == null) {
                dyg.a(false, "WifiDeviceShareAccountActivity", "showSettingUnitPickerDialog() dialog layout fail");
                return;
            }
            a(viewInflate);
            String string = this.f6358a.getResources().getString(R.string.IDS_device_wifi_share_note);
            String string2 = this.f6358a.getResources().getString(R.string.IDS_contact_confirm_ios_btn);
            String string3 = this.f6358a.getResources().getString(R.string.IDS_settings_button_cancal);
            CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f6358a);
            this.g = builder;
            builder.a(string).d(viewInflate).a(string2, new View.OnClickListener() { // from class: dup
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32392a.c(view);
                }
            }).c(string3, new View.OnClickListener() { // from class: duq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.d(view);
                }
            });
            this.i = this.g.d();
            HealthButton healthButtonB = this.g.b();
            this.t = healthButtonB;
            b(healthButtonB);
            this.i.setCancelable(false);
            this.i.show();
        }
    }

    public /* synthetic */ void c(View view) {
        dyg.a(false, "WifiDeviceShareAccountActivity", "showNickEditDialog setPositiveButton");
        if (this.l) {
            n();
        } else {
            l();
        }
        d();
    }

    public /* synthetic */ void d(View view) {
        dyg.a(false, "WifiDeviceShareAccountActivity", "showNickEditDialog setNegativeButton");
        d();
    }

    private void d() {
        if (this.t != null) {
            this.t = null;
        }
        if (this.i != null) {
            this.i = null;
        }
    }

    private void a(View view) {
        this.o = (HealthEditText) view.findViewById(R.id.edit);
        if (!TextUtils.isEmpty(this.y.c())) {
            this.o.setText(this.y.c());
        }
        this.o.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
        this.o.setInputType(1);
        this.o.setHint(R.string.IDS_device_wifi_share_input_note);
        this.o.setSingleLine();
        this.o.setLongClickable(false);
        this.o.setTextIsSelectable(false);
        f();
        this.o.setImeOptions(268435456);
        this.o.setCustomSelectionActionModeCallback(new ActionMode.Callback() { // from class: com.huawei.health.device.ui.measure.activity.WifiDeviceShareAccountActivity.2
            @Override // android.view.ActionMode.Callback
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public void onDestroyActionMode(ActionMode actionMode) {
            }

            @Override // android.view.ActionMode.Callback
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }
        });
        this.o.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.huawei.health.device.ui.measure.activity.WifiDeviceShareAccountActivity$$ExternalSyntheticLambda0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return WifiDeviceShareAccountActivity.c(textView, i, keyEvent);
            }
        });
        h();
    }

    static /* synthetic */ boolean c(TextView textView, int i, KeyEvent keyEvent) {
        return (i == 4 || i == 6) || (keyEvent != null && keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 0);
    }

    private void h() {
        this.o.addTextChangedListener(new TextWatcher() { // from class: com.huawei.health.device.ui.measure.activity.WifiDeviceShareAccountActivity.4
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                WifiDeviceShareAccountActivity wifiDeviceShareAccountActivity = WifiDeviceShareAccountActivity.this;
                wifiDeviceShareAccountActivity.b(wifiDeviceShareAccountActivity.t);
            }
        });
    }

    private void f() {
        Editable text = this.o.getText();
        if (text != null) {
            if (text instanceof Spannable) {
                Selection.setSelection(text, text.length());
            } else {
                LogUtil.j("WifiDeviceShareAccountActivity", "spanText is not instanceof Spannable!");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(HealthButton healthButton) {
        if (healthButton != null) {
            String strTrim = this.o.getText().toString().trim();
            if (TextUtils.isEmpty(strTrim) || strTrim.equals(this.y.c())) {
                healthButton.setTextColor(this.f6358a.getResources().getColor(R.color.color_orange_30alpha));
                healthButton.setClickable(false);
            } else {
                healthButton.setTextColor(this.f6358a.getResources().getColor(R.color.common_colorAccent));
                healthButton.setClickable(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        dyg.a(false, "WifiDeviceShareAccountActivity", "showSubUserNoExistDialog");
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.u;
        if (noTitleCustomAlertDialog == null || !noTitleCustomAlertDialog.isShowing()) {
            String str = String.format(Locale.ENGLISH, this.f6358a.getResources().getString(R.string.IDS_device_wifi_share_sub_user_release), this.y.c());
            String string = this.f6358a.getResources().getString(R.string.IDS_common_notification_know_tips);
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f6358a);
            builder.a(str).c(true).a(string, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.activity.WifiDeviceShareAccountActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (WifiDeviceShareAccountActivity.this.u != null) {
                        WifiDeviceShareAccountActivity.this.u = null;
                    }
                    WifiDeviceShareAccountActivity.this.setResult(11);
                    WifiDeviceShareAccountActivity.this.finish();
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            this.u = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCancelable(false);
            this.u.show();
        }
    }

    private void o() {
        String str;
        dyg.a(false, "WifiDeviceShareAccountActivity", "showDeleteMemberDialog");
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.d;
        if (noTitleCustomAlertDialog == null || !noTitleCustomAlertDialog.isShowing()) {
            String string = this.f6358a.getResources().getString(R.string.IDS_device_wifi_share_remove_member1);
            if (!TextUtils.isEmpty(this.y.c())) {
                str = String.format(Locale.ENGLISH, string, this.y.c(), "");
            } else {
                str = String.format(Locale.ENGLISH, string, this.y.e(), "");
            }
            String string2 = this.f6358a.getResources().getString(R.string.IDS_common_remove_text);
            String string3 = this.f6358a.getResources().getString(R.string.IDS_settings_button_cancal);
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f6358a);
            builder.a(str).a(string2, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.activity.WifiDeviceShareAccountActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    WifiDeviceShareAccountActivity.this.a();
                    if (WifiDeviceShareAccountActivity.this.d != null) {
                        WifiDeviceShareAccountActivity.this.d = null;
                    }
                }
            }).d(string3, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.activity.WifiDeviceShareAccountActivity.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (WifiDeviceShareAccountActivity.this.d != null) {
                        WifiDeviceShareAccountActivity.this.d = null;
                    }
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            this.d = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCancelable(false);
            this.d.show();
        }
    }

    private void n() {
        if (TextUtils.isEmpty(this.f) || this.y == null) {
            dyg.d(false, "WifiDeviceShareAccountActivity", "updateSubUserInfo mDeviceId is null or mSubUserInfo is null");
            return;
        }
        b(this.f6358a.getResources().getString(R.string.IDS_sns_saveing));
        this.n = this.o.getText().toString();
        new DeviceCloudSharePreferencesManager(dxw.d()).b(this.f + "_" + this.y.a(), this.n);
        this.k.sendEmptyMessage(1001);
    }

    private void l() {
        dyg.a(false, "WifiDeviceShareAccountActivity", "updateSubUserInfo");
        if (j()) {
            if (TextUtils.isEmpty(this.f) || this.y == null) {
                dyg.c(false, "WifiDeviceShareAccountActivity", "updateSubUserInfo mDeviceId is null or mSubUserInfo is null");
                return;
            }
            b(this.f6358a.getResources().getString(R.string.IDS_sns_saveing));
            this.n = this.o.getText().toString();
            WifiDeviceUpdateAuthorizeSubUserReq wifiDeviceUpdateAuthorizeSubUserReq = new WifiDeviceUpdateAuthorizeSubUserReq();
            wifiDeviceUpdateAuthorizeSubUserReq.setDevId(this.f);
            wifiDeviceUpdateAuthorizeSubUserReq.setSubHuid(this.y.a());
            wifiDeviceUpdateAuthorizeSubUserReq.setNickName(this.n);
            lqo.b(this.f6358a).e(wifiDeviceUpdateAuthorizeSubUserReq, new ICloudOperationResult() { // from class: dui
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str, boolean z) {
                    this.f32386c.b((CloudCommonReponse) obj, str, z);
                }
            });
        }
    }

    public /* synthetic */ void b(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        int iIntValue;
        String resultDesc;
        if (z) {
            if (cloudCommonReponse != null) {
                dyg.a(false, "WifiDeviceShareAccountActivity", "updateSubUserInfo() errorCode = " + cloudCommonReponse.getResultCode() + "|resultDesc = " + cloudCommonReponse.getResultDesc());
            }
            this.k.sendEmptyMessage(1001);
            return;
        }
        if (cloudCommonReponse == null) {
            iIntValue = Constants.CODE_UNKNOWN_ERROR;
            resultDesc = "unknown error";
        } else {
            iIntValue = cloudCommonReponse.getResultCode().intValue();
            resultDesc = cloudCommonReponse.getResultDesc();
        }
        dyg.a(false, "WifiDeviceShareAccountActivity", "updateSubUserInfo() errorCode = " + iIntValue + "resultDesc" + resultDesc);
        if (iIntValue == 112000030) {
            this.k.sendEmptyMessage(1005);
        } else {
            this.k.sendEmptyMessage(1004);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        dyg.a(false, "WifiDeviceShareAccountActivity", "deleteSubUserToCloud");
        if (j()) {
            if (TextUtils.isEmpty(this.f) || this.y == null) {
                dyg.c(false, "WifiDeviceShareAccountActivity", "deleteSubUserToCloud mDeviceId is null or mSubUserInfo is null");
                return;
            }
            b(this.f6358a.getResources().getString(R.string.IDS_device_wifi_share_removing));
            WifiDeviceDeleteAuthorizeSubUserReq wifiDeviceDeleteAuthorizeSubUserReq = new WifiDeviceDeleteAuthorizeSubUserReq();
            wifiDeviceDeleteAuthorizeSubUserReq.setDevId(this.f);
            wifiDeviceDeleteAuthorizeSubUserReq.setSubHuid(this.y.a());
            lqo.b(this.f6358a).a(wifiDeviceDeleteAuthorizeSubUserReq, new ICloudOperationResult() { // from class: dul
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str, boolean z) {
                    this.e.c((CloudCommonReponse) obj, str, z);
                }
            });
        }
    }

    public /* synthetic */ void c(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        int iIntValue;
        String resultDesc;
        if (!z) {
            if (cloudCommonReponse == null) {
                iIntValue = Constants.CODE_UNKNOWN_ERROR;
                resultDesc = "unknown error";
            } else {
                iIntValue = cloudCommonReponse.getResultCode().intValue();
                resultDesc = cloudCommonReponse.getResultDesc();
            }
            dyg.a(false, "WifiDeviceShareAccountActivity", "deleteSubUserToCloud() errorCode = ", Integer.valueOf(iIntValue), " resultDesc = ", resultDesc);
            if (iIntValue == 112000030) {
                this.k.sendEmptyMessage(1002);
                return;
            } else {
                this.k.sendEmptyMessage(1004);
                return;
            }
        }
        if (cloudCommonReponse != null) {
            dyg.a(false, "WifiDeviceShareAccountActivity", "deleteSubUserToCloud() errorCode = ", cloudCommonReponse.getResultCode(), "|resultDesc = ", cloudCommonReponse.getResultDesc());
        }
        this.k.sendEmptyMessage(1002);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        dyg.a(false, "WifiDeviceShareAccountActivity", "deleteSubUserToDevice");
        if (j()) {
            if (TextUtils.isEmpty(this.f) || this.y == null) {
                dyg.a(false, "WifiDeviceShareAccountActivity", "deleteSubUserToDevice deviceid is null or mSubUserInfo is null");
                return;
            }
            ArrayList arrayList = new ArrayList(16);
            DeviceServiceInfo deviceServiceInfo = new DeviceServiceInfo();
            HashMap map = new HashMap(16);
            map.put(this.y.d(), this.y.a());
            deviceServiceInfo.setData(map);
            deviceServiceInfo.setSid("setDevParam");
            arrayList.add(deviceServiceInfo);
            WifiDeviceControlDataModelReq wifiDeviceControlDataModelReq = new WifiDeviceControlDataModelReq();
            wifiDeviceControlDataModelReq.setDeviceServiceInfo(arrayList);
            wifiDeviceControlDataModelReq.setDevId(this.f);
            lqo.b(this.f6358a).e(wifiDeviceControlDataModelReq, new ICloudOperationResult() { // from class: duo
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str, boolean z) {
                    this.f32391c.a((CloudCommonReponse) obj, str, z);
                }
            });
        }
    }

    public /* synthetic */ void a(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        if (z) {
            dyg.a(false, "WifiDeviceShareAccountActivity", "deleteSubUserToDevice success ");
            this.k.sendEmptyMessage(1003);
            return;
        }
        if (cloudCommonReponse != null) {
            dyg.a(false, "WifiDeviceShareAccountActivity", "deleteSubUserToDevice errorCode = " + cloudCommonReponse.getResultCode().intValue() + " | errorDes = " + cloudCommonReponse.getResultDesc());
        }
        this.k.sendEmptyMessage(1004);
    }

    private boolean j() {
        if (CommonUtil.ab(this.f6358a)) {
            return true;
        }
        qpx.e(this.f6358a, R.string.IDS_network_connect_error);
        return false;
    }

    private void b(String str) {
        if (this.m == null) {
            new CommonDialog21(this, R.style.app_update_dialogActivity);
            this.m = CommonDialog21.b(this);
        }
        this.m.setCancelable(false);
        this.m.b(str);
        this.m.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        CommonDialog21 commonDialog21;
        if (isFinishing() || (commonDialog21 = this.m) == null || !commonDialog21.isShowing()) {
            return;
        }
        this.m.dismiss();
        this.m = null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f6360c) {
            setResult(11);
        }
        super.onBackPressed();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
