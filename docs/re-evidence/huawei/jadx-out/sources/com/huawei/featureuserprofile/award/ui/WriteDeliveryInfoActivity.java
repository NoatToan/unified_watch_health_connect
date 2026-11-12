package com.huawei.featureuserprofile.award.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.award.model.AddressInfo;
import com.huawei.featureuserprofile.award.model.AddressResp;
import com.huawei.featureuserprofile.award.model.SaveInfoItem;
import com.huawei.featureuserprofile.award.presenter.WriteDeliveryInfoContract;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.edittext.HealthEditText;
import defpackage.cve;
import defpackage.qpx;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public class WriteDeliveryInfoActivity extends BaseActivity implements WriteDeliveryInfoContract.View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AddressInfo f5551a;
    private HealthEditText ab;
    private int ac;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f5553c;
    private String d;
    private HealthEditText f;
    private HealthEditText g;
    private int h;
    private HealthEditText i;
    private Context j;
    private int k;
    private int n;
    private int o;
    private String p;
    private String q;
    private String s;
    private String t;
    private WriteDeliveryInfoContract.Presenter u;
    private String v;
    private String w;
    private String x;
    private String y;
    private HealthButton z;
    private TextWatcher l = new TextWatcher() { // from class: com.huawei.featureuserprofile.award.ui.WriteDeliveryInfoActivity.4
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = editable.toString().trim().length();
            WriteDeliveryInfoActivity.this.o = length;
            if (length == 0) {
                WriteDeliveryInfoActivity.this.b(false);
            } else {
                if (WriteDeliveryInfoActivity.this.k <= 0 || WriteDeliveryInfoActivity.this.h <= 0) {
                    return;
                }
                WriteDeliveryInfoActivity.this.b(true);
            }
        }
    };
    private TextWatcher r = new TextWatcher() { // from class: com.huawei.featureuserprofile.award.ui.WriteDeliveryInfoActivity.2
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = editable.toString().trim().length();
            WriteDeliveryInfoActivity.this.k = length;
            if (length == 0) {
                WriteDeliveryInfoActivity.this.b(false);
            } else {
                if (WriteDeliveryInfoActivity.this.o <= 0 || WriteDeliveryInfoActivity.this.h <= 0) {
                    return;
                }
                WriteDeliveryInfoActivity.this.b(true);
            }
        }
    };
    private TextWatcher e = new TextWatcher() { // from class: com.huawei.featureuserprofile.award.ui.WriteDeliveryInfoActivity.3
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = editable.toString().trim().length();
            WriteDeliveryInfoActivity.this.h = length;
            if (length == 0) {
                WriteDeliveryInfoActivity.this.b(false);
            } else {
                if (WriteDeliveryInfoActivity.this.o <= 0 || WriteDeliveryInfoActivity.this.k <= 0) {
                    return;
                }
                WriteDeliveryInfoActivity.this.b(true);
            }
        }
    };
    private View.OnClickListener m = new View.OnClickListener() { // from class: com.huawei.featureuserprofile.award.ui.WriteDeliveryInfoActivity.5
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WriteDeliveryInfoActivity.this.showLoading();
            WriteDeliveryInfoActivity writeDeliveryInfoActivity = WriteDeliveryInfoActivity.this;
            writeDeliveryInfoActivity.y = writeDeliveryInfoActivity.f.getText().toString().trim();
            WriteDeliveryInfoActivity writeDeliveryInfoActivity2 = WriteDeliveryInfoActivity.this;
            writeDeliveryInfoActivity2.v = writeDeliveryInfoActivity2.i.getText().toString().trim();
            WriteDeliveryInfoActivity writeDeliveryInfoActivity3 = WriteDeliveryInfoActivity.this;
            writeDeliveryInfoActivity3.w = writeDeliveryInfoActivity3.g.getText().toString().trim();
            WriteDeliveryInfoActivity writeDeliveryInfoActivity4 = WriteDeliveryInfoActivity.this;
            writeDeliveryInfoActivity4.x = writeDeliveryInfoActivity4.ab.getText().toString().trim();
            if (TextUtils.isEmpty(WriteDeliveryInfoActivity.this.y) || TextUtils.isEmpty(WriteDeliveryInfoActivity.this.v) || TextUtils.isEmpty(WriteDeliveryInfoActivity.this.w)) {
                WriteDeliveryInfoActivity.this.b(false);
                LogUtil.e("WriteDeliveryInfoActivity award", "Required input data is empty");
                return;
            }
            String str = new SimpleDateFormat("Z").format(Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.getDefault()).getTime());
            if (WriteDeliveryInfoActivity.this.n == 1) {
                if (TextUtils.isEmpty(WriteDeliveryInfoActivity.this.y) || TextUtils.isEmpty(WriteDeliveryInfoActivity.this.v) || TextUtils.isEmpty(WriteDeliveryInfoActivity.this.w)) {
                    return;
                }
                WriteDeliveryInfoActivity.this.showLoading();
                SaveInfoItem saveInfoItem = new SaveInfoItem();
                saveInfoItem.setActivityId(WriteDeliveryInfoActivity.this.d);
                saveInfoItem.setAwardRecordId(WriteDeliveryInfoActivity.this.f5553c);
                saveInfoItem.setName(WriteDeliveryInfoActivity.this.y);
                saveInfoItem.setTelephone(WriteDeliveryInfoActivity.this.v);
                saveInfoItem.setAddress(WriteDeliveryInfoActivity.this.w);
                saveInfoItem.setRemark(WriteDeliveryInfoActivity.this.x);
                WriteDeliveryInfoActivity.this.u.saveInfo(WriteDeliveryInfoActivity.this.ac, saveInfoItem, str, WriteDeliveryInfoActivity.this.f5552b);
                return;
            }
            if (WriteDeliveryInfoActivity.this.n == 2) {
                WriteDeliveryInfoActivity.this.b(str);
            } else {
                LogUtil.e("WriteDeliveryInfoActivity award", "data from type error");
            }
        }
    };

    @Override // com.huawei.featureuserprofile.award.presenter.WriteDeliveryInfoContract.View
    public void hideLoading() {
    }

    @Override // com.huawei.featureuserprofile.award.presenter.WriteDeliveryInfoContract.View
    public void showLoading() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (c()) {
            if (TextUtils.isEmpty(this.y) || TextUtils.isEmpty(this.v) || TextUtils.isEmpty(this.w)) {
                return;
            }
            showLoading();
            SaveInfoItem saveInfoItem = new SaveInfoItem();
            saveInfoItem.setActivityId(this.d);
            saveInfoItem.setAwardRecordId(this.f5553c);
            saveInfoItem.setName(this.y);
            saveInfoItem.setTelephone(this.v);
            saveInfoItem.setAddress(this.w);
            saveInfoItem.setRemark(this.x);
            this.u.saveInfo(this.ac, saveInfoItem, str, this.f5552b);
            return;
        }
        finish();
    }

    private boolean c() {
        return (this.y.equals(this.s) && this.v.equals(this.p) && this.w.equals(this.t) && this.x.equals(this.q)) ? false : true;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("WriteDeliveryInfoActivity award", "onCreate()");
        setContentView(R.layout.activity_write_delivery_info);
        cancelAdaptRingRegion();
        this.j = this;
        a();
        b();
        this.u = new cve(this);
    }

    @Override // com.huawei.featureuserprofile.award.BaseView
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void setPresenter(WriteDeliveryInfoContract.Presenter presenter) {
        this.u = presenter;
    }

    private void a() {
        this.f = (HealthEditText) findViewById(R.id.contact_name);
        this.i = (HealthEditText) findViewById(R.id.contact_phone);
        this.g = (HealthEditText) findViewById(R.id.contact_address);
        this.ab = (HealthEditText) findViewById(R.id.remark_info);
        this.z = (HealthButton) findViewById(R.id.save_btn);
    }

    private void b() {
        if (getIntent() != null) {
            Serializable serializableExtra = getIntent().getSerializableExtra("address_info");
            if (serializableExtra instanceof AddressInfo) {
                this.f5551a = (AddressInfo) serializableExtra;
            }
        }
        AddressInfo addressInfo = this.f5551a;
        if (addressInfo != null && addressInfo.getItem() != null) {
            this.f5553c = this.f5551a.getItem().getAwardRecordId();
            this.d = this.f5551a.getItem().getActivityId();
            this.f5552b = this.f5551a.getClickPos();
            this.ac = this.f5551a.getSource();
            if (!TextUtils.isEmpty(this.f5551a.getItem().getName())) {
                this.n = 2;
                this.s = this.f5551a.getItem().getName();
                this.p = this.f5551a.getItem().getTelephone();
                this.t = this.f5551a.getItem().getAddress();
                d();
                this.o = this.s.length();
                this.k = this.p.length();
                this.h = this.t.length();
                this.f.setText(this.s);
                this.i.setText(this.p);
                this.g.setText(this.t);
                this.ab.setText(this.q);
                b(true);
            } else {
                this.n = 1;
                this.s = "";
                this.p = "";
                this.t = "";
                this.q = "";
            }
        } else if (getIntent() != null) {
            this.n = 1;
            this.s = "";
            this.p = "";
            this.t = "";
            this.q = "";
            this.f5552b = 0;
            this.f5553c = getIntent().getStringExtra("awardRecordId");
            this.d = getIntent().getStringExtra("activityId");
            this.ac = 20002;
        }
        e();
    }

    private void d() {
        if (!TextUtils.isEmpty(this.f5551a.getItem().getRemark())) {
            this.q = this.f5551a.getItem().getRemark();
        } else {
            this.q = "";
        }
    }

    private void e() {
        this.f.addTextChangedListener(this.l);
        this.i.addTextChangedListener(this.r);
        this.g.addTextChangedListener(this.e);
        this.z.setOnClickListener(this.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        if (z) {
            this.z.setEnabled(true);
        } else {
            this.z.setEnabled(false);
        }
    }

    @Override // com.huawei.featureuserprofile.award.presenter.WriteDeliveryInfoContract.View
    public void onModifyDataSuccess(String str) {
        AddressResp addressResp;
        hideLoading();
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WriteDeliveryInfoActivity award", "result is empty");
            return;
        }
        try {
            addressResp = (AddressResp) new Gson().fromJson(str, AddressResp.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.e("WriteDeliveryInfoActivity award", "JsonSyntaxException");
            addressResp = null;
        }
        if (addressResp != null) {
            int resultCode = addressResp.getResultCode();
            LogUtil.a("WriteDeliveryInfoActivity award", "resultCode: ", Integer.valueOf(resultCode), ", resultDesc: ", addressResp.getResultDesc());
            if (resultCode == 0) {
                qpx.e(this, R.string.IDS_hwh_show_save_success);
                Intent intent = new Intent();
                intent.putExtra("mail_name", this.y);
                intent.putExtra("mail_phone", this.v);
                intent.putExtra("mail_address", this.w);
                intent.putExtra("mail_remark", this.x);
                intent.putExtra("click_pos", this.f5552b);
                setResult(-1, intent);
                finish();
                return;
            }
            qpx.e(this, R.string.IDS_update_network_abnormal);
        }
    }

    @Override // com.huawei.featureuserprofile.award.presenter.WriteDeliveryInfoContract.View
    public void onModifyDataFailed(String str) {
        hideLoading();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
