package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.InvoiceFailedFragment;
import com.huawei.ui.main.stories.health.fragment.InvoiceOngoingFragment;
import com.huawei.ui.main.stories.health.fragment.InvoiceSuccessfulFragment;
import defpackage.lmf;
import defpackage.out;
import defpackage.pjn;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.vdb;
import defpackage.vdf;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import java.text.DecimalFormat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class InvoiceApplicationActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthEditText f27542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthEditText f27543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f27544c;
    private HealthRadioButton d;
    private View e;
    private CustomTitleBar f;
    private InvoiceFailedFragment g;
    private Fragment h;
    private Context j;
    private InvoiceOngoingFragment l;
    private int n;
    private Handler o;
    private View p;
    private String q;
    private HealthEditText r;
    private String s;
    private HealthTextView t;
    private InvoiceSuccessfulFragment u;
    private HealthButton w;
    private String x;
    private HealthRadioButton y;
    private boolean m = true;
    private final TextWatcher v = new TextWatcher() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InvoiceApplicationActivity.4
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            LogUtil.a("InvoiceApplicationActivity", "mPersonNameTextWatcher onTextChanged");
            String strTrim = InvoiceApplicationActivity.this.r.getText().toString().trim();
            LogUtil.a("InvoiceApplicationActivity", "mPersonNameText = ", strTrim);
            if (TextUtils.isEmpty(strTrim)) {
                InvoiceApplicationActivity invoiceApplicationActivity = InvoiceApplicationActivity.this;
                invoiceApplicationActivity.e(invoiceApplicationActivity.w);
            } else {
                InvoiceApplicationActivity invoiceApplicationActivity2 = InvoiceApplicationActivity.this;
                invoiceApplicationActivity2.a(invoiceApplicationActivity2.w);
            }
        }
    };
    private final TextWatcher i = new TextWatcher() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InvoiceApplicationActivity.2
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            LogUtil.a("InvoiceApplicationActivity", "mBusinessTextWatcher onTextChanged");
            String strTrim = InvoiceApplicationActivity.this.f27543b.getText().toString().trim();
            String strTrim2 = InvoiceApplicationActivity.this.f27542a.getText().toString().trim();
            LogUtil.a("InvoiceApplicationActivity", "mBusinessNameText = ", strTrim);
            LogUtil.a("InvoiceApplicationActivity", "mBusinessTaxText = ", strTrim2);
            if (TextUtils.isEmpty(strTrim) || TextUtils.isEmpty(strTrim2)) {
                InvoiceApplicationActivity invoiceApplicationActivity = InvoiceApplicationActivity.this;
                invoiceApplicationActivity.e(invoiceApplicationActivity.w);
            } else {
                InvoiceApplicationActivity invoiceApplicationActivity2 = InvoiceApplicationActivity.this;
                invoiceApplicationActivity2.a(invoiceApplicationActivity2.w);
            }
        }
    };
    private final InputFilter[] k = {new InputFilter() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InvoiceApplicationActivity.3
        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (charSequence.toString().matches("[，@&<>\"':\\[\\]$()%+\\\\/#`*;=^|,\\-{}\\s\\n]+")) {
                d();
                return "";
            }
            a();
            return null;
        }

        private void a() {
            if (InvoiceApplicationActivity.this.m) {
                InvoiceApplicationActivity.this.t.setVisibility(8);
            } else {
                InvoiceApplicationActivity.this.f27544c.setVisibility(8);
            }
        }

        private void d() {
            if (InvoiceApplicationActivity.this.m) {
                InvoiceApplicationActivity.this.t.setVisibility(0);
            } else {
                InvoiceApplicationActivity.this.f27544c.setVisibility(0);
            }
        }
    }};

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("InvoiceApplicationActivity", "onCreate");
        super.onCreate(bundle);
        this.j = this;
        this.o = new InVoiceActivityHandler(this);
        cancelAdaptRingRegion();
        setContentView(R.layout.activity_invoice_application);
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.e("InvoiceApplicationActivity", "no intent passed in, failed to create invoice apply page!");
            return;
        }
        String stringExtra = intent.getStringExtra("orderCode");
        this.q = stringExtra;
        LogUtil.a("InvoiceApplicationActivity", "raw mOrderCode (not url)= ", stringExtra);
        this.s = intent.getStringExtra("orderId");
        this.x = new DecimalFormat("######0.00").format(intent.getDoubleExtra(ParsedFieldTag.PRICE, 0.0d));
        LogUtil.a("InvoiceApplicationActivity", "mOrderId = ", this.s);
        LogUtil.a("InvoiceApplicationActivity", "mPrice= ", this.x);
        e();
        a();
        c(intent);
    }

    private void c(Intent intent) {
        LogUtil.a("InvoiceApplicationActivity", "handleQueryResultPage");
        if (intent.getIntExtra(CommonUtil.PAGE_TYPE, 0) == 1) {
            vdf.e(this.q, this.o);
        }
    }

    private void e() {
        LogUtil.a("InvoiceApplicationActivity", "initView");
        CustomTitleBar customTitleBar = (CustomTitleBar) out.d(this, R.id.invoice_application_title_bar);
        this.f = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(ContextCompat.getColor(this, com.huawei.health.servicesui.R.color.common_transparent));
        HealthButton healthButton = (HealthButton) findViewById(R.id.btn_summit);
        this.w = healthButton;
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: upy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50455b.a(view);
            }
        });
        this.y = (HealthRadioButton) findViewById(R.id.person_radio_button);
        this.d = (HealthRadioButton) findViewById(R.id.business_radio_button);
        c();
        d();
    }

    public /* synthetic */ void a(View view) {
        g();
    }

    private void c() {
        LogUtil.a("InvoiceApplicationActivity", "initBusinessArea");
        View viewFindViewById = findViewById(R.id.invoice_business_area);
        this.e = viewFindViewById;
        this.f27543b = (HealthEditText) viewFindViewById.findViewById(R.id.business_name_edit_text);
        this.f27542a = (HealthEditText) this.e.findViewById(R.id.business_tax_edit_text);
        this.f27543b.addTextChangedListener(this.i);
        this.f27542a.addTextChangedListener(this.i);
        this.f27543b.setText(SharedPreferenceManager.e(this.j, String.valueOf(10050), "INVOICE_BUSINESS_NAME"));
        this.f27542a.setText(SharedPreferenceManager.e(this.j, String.valueOf(10050), "INVOICE_BUSINESS_TAX"));
        ((HealthTextView) this.e.findViewById(R.id.business_order_id_text)).setText(this.s);
        ((HealthTextView) this.e.findViewById(R.id.business_price_text)).setText("¥" + this.x);
        findViewById(R.id.business_button_area).setOnClickListener(new View.OnClickListener() { // from class: upx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(view);
            }
        });
        this.f27544c = (HealthTextView) this.e.findViewById(R.id.business_error_prompt);
        this.f27543b.setFilters(this.k);
    }

    public /* synthetic */ void b(View view) {
        if (this.m) {
            e(false);
            HealthEditText healthEditText = this.f27543b;
            healthEditText.setText(healthEditText.getText().toString().trim());
        }
    }

    private void d() {
        LogUtil.a("InvoiceApplicationActivity", "initPersonArea");
        View viewFindViewById = findViewById(R.id.invoice_person_area);
        this.p = viewFindViewById;
        HealthEditText healthEditText = (HealthEditText) viewFindViewById.findViewById(R.id.person_name_edit_text);
        this.r = healthEditText;
        healthEditText.addTextChangedListener(this.v);
        this.r.setText(SharedPreferenceManager.e(this.j, String.valueOf(10050), "INVOICE_PERSON_NAME"));
        ((HealthTextView) this.p.findViewById(R.id.person_order_id_text)).setText(this.s);
        ((HealthTextView) this.p.findViewById(R.id.person_price_text)).setText("¥" + this.x);
        findViewById(R.id.person_button_area).setOnClickListener(new View.OnClickListener() { // from class: upu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50454a.e(view);
            }
        });
        this.t = (HealthTextView) this.p.findViewById(R.id.person_error_prompt);
        this.r.setFilters(this.k);
    }

    public /* synthetic */ void e(View view) {
        if (this.m) {
            return;
        }
        e(true);
        HealthEditText healthEditText = this.r;
        healthEditText.setText(healthEditText.getText().toString().trim());
    }

    private void e(boolean z) {
        LogUtil.a("InvoiceApplicationActivity", "toggleInvoiceTypeArea");
        this.y.setChecked(z);
        this.d.setChecked(!z);
        this.p.setVisibility(z ? 0 : 8);
        this.e.setVisibility(z ? 8 : 0);
        this.m = !this.m;
    }

    private void a() {
        LogUtil.a("InvoiceApplicationActivity", "initListener");
        this.f.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: uqd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(view);
            }
        });
    }

    public /* synthetic */ void c(View view) {
        if (qrs.c(500)) {
            LogUtil.a("InvoiceApplicationActivity", "click title bar left button too fast");
        } else {
            finish();
        }
    }

    private void g() {
        LogUtil.a("InvoiceApplicationActivity", "showDialog");
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.j).b(R.string.IDS_invoice_verify_information).a(R.string.IDS_settings_button_nps_ok, new View.OnClickListener() { // from class: upv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.f(view);
            }
        }).e(com.huawei.ui.commonui.R.string.IDS_highland_cancel, new View.OnClickListener() { // from class: upw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("InvoiceApplicationActivity", "submit cancel");
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public /* synthetic */ void f(View view) {
        LogUtil.a("InvoiceApplicationActivity", "submit verify");
        d(AnalyticsValue.INVOICE_APPLY_2041099.value());
        Bundle bundleI = i();
        if (bundleI == null) {
            LogUtil.e("InvoiceApplicationActivity", "bundle is null");
        } else {
            vdb.e(bundleI, new UiCallback<Integer>() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.InvoiceApplicationActivity.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("InvoiceApplicationActivity", "apply failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Integer num) {
                    if (num.intValue() == 0) {
                        LogUtil.a("InvoiceApplicationActivity", "apply successful");
                    }
                    InvoiceApplicationActivity.this.b(num.intValue());
                }
            });
        }
    }

    private void d(String str) {
        LogUtil.a("InvoiceApplicationActivity", "invoice setBiEvent");
        HashMap map = new HashMap(16);
        map.put("click", 1);
        lmf.d().c(this.j, str, map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle i() {
        InvoiceOngoingFragment invoiceOngoingFragment = this.l;
        if (invoiceOngoingFragment != null && this.h == invoiceOngoingFragment) {
            LogUtil.j("InvoiceApplicationActivity", "switchToOnGoingFragment failed, cause mCurrentFragment is mOngoingFragment");
            return null;
        }
        LogUtil.a("InvoiceApplicationActivity", "switchToOnGoingFragment");
        if (this.l == null) {
            this.l = new InvoiceOngoingFragment();
        }
        Bundle bundleJ = j();
        e(this.l);
        return bundleJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(long j, int i, String str) {
        InvoiceSuccessfulFragment invoiceSuccessfulFragment = this.u;
        if (invoiceSuccessfulFragment != null && this.h == invoiceSuccessfulFragment) {
            LogUtil.j("InvoiceApplicationActivity", "switchToSuccessFragment failed, cause mCurrentFragment is mSuccessfulFragment");
            return;
        }
        LogUtil.a("InvoiceApplicationActivity", "switchToSuccessFragment");
        if (this.u == null) {
            this.u = new InvoiceSuccessfulFragment();
        }
        b(this.u, UnitUtil.d("yyyy/MM/dd HH:mm:ss", j), i, str);
        e(this.u);
        d(AnalyticsValue.INVOICE_SUCCESSFUL_2041100.value());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j, int i, String str) {
        InvoiceFailedFragment invoiceFailedFragment = this.g;
        if (invoiceFailedFragment != null && this.h == invoiceFailedFragment) {
            LogUtil.j("InvoiceApplicationActivity", "switchToFailedFragment failed, cause mCurrentFragment is mFailedFragment");
            return;
        }
        LogUtil.a("InvoiceApplicationActivity", "switchToFailedFragment");
        if (this.g == null) {
            this.g = new InvoiceFailedFragment();
        }
        b(this.g, UnitUtil.d("yyyy/MM/dd HH:mm:ss", j), i, str);
        e(this.g);
    }

    private void e(Fragment fragment) {
        LogUtil.a("InvoiceApplicationActivity", "switchFragment");
        this.f.setTitleText(getString(com.huawei.ui.commonui.R.string.IDS_invoice_details));
        getSupportFragmentManager().beginTransaction().replace(R.id.base_invoice_card, fragment).commitAllowingStateLoss();
        this.h = fragment;
    }

    private Bundle j() {
        LogUtil.a("InvoiceApplicationActivity", "setOnGoingData");
        Bundle bundle = new Bundle();
        bundle.putString("locale", pjn.b(null));
        bundle.putString("orderId", this.s);
        bundle.putString("orderCode", this.q);
        bundle.putString("invoiceType", "61");
        bundle.putString("content", getString(R.string.IDS_invoice_commodity_details));
        bundle.putDouble(HwPayConstant.KEY_AMOUNT, qrs.g(this.x));
        StorageParams storageParams = new StorageParams();
        int i = 0;
        storageParams.e(0);
        if (this.y.isChecked()) {
            this.n = R.string.IDS_invoice_personal;
            bundle.putString("customerName", this.r.getText().toString());
            SharedPreferenceManager.e(this.j, String.valueOf(10050), "INVOICE_PERSON_NAME", this.r.getText().toString(), storageParams);
            i = 1;
        } else if (this.d.isChecked()) {
            this.n = R.string.IDS_invoice_enterprise;
            bundle.putString("customerName", this.f27543b.getText().toString());
            bundle.putString("taxNo", this.f27542a.getText().toString());
            SharedPreferenceManager.e(this.j, String.valueOf(10050), "INVOICE_BUSINESS_NAME", this.f27543b.getText().toString(), storageParams);
            SharedPreferenceManager.e(this.j, String.valueOf(10050), "INVOICE_BUSINESS_TAX", this.f27542a.getText().toString(), storageParams);
            i = 2;
        } else {
            LogUtil.e("InvoiceApplicationActivity", "header is invalid");
        }
        bundle.putInt("invoiceHeader", this.n);
        bundle.putInt("customerType", i);
        this.l.setArguments(bundle);
        return bundle;
    }

    private void b(Fragment fragment, String str, int i, String str2) {
        int i2;
        LogUtil.a("InvoiceApplicationActivity", "setDataAndTime");
        Bundle bundle = new Bundle();
        if (i == 1) {
            i2 = R.string.IDS_invoice_personal;
        } else if (i == 2) {
            i2 = R.string.IDS_invoice_enterprise;
        } else {
            LogUtil.e("InvoiceApplicationActivity", "headerId is invalid");
            i2 = this.n;
        }
        bundle.putInt("invoiceHeader", i2);
        bundle.putString("orderId", this.s);
        bundle.putString("invoiceTime", str);
        bundle.putString(HwPayConstant.KEY_AMOUNT, this.x);
        bundle.putString("orderCode", this.q);
        bundle.putString("invoiceType", str2);
        fragment.setArguments(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HealthButton healthButton) {
        LogUtil.a("InvoiceApplicationActivity", "setButtonDisable");
        if (healthButton != null) {
            healthButton.setEnabled(false);
            healthButton.setClickable(false);
            healthButton.setFocusable(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HealthButton healthButton) {
        LogUtil.a("InvoiceApplicationActivity", "setButtonEnable");
        if (healthButton != null) {
            healthButton.setEnabled(true);
            healthButton.setClickable(true);
            healthButton.setFocusable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        switch (i) {
            case 2040001:
            case 2160002:
            case 2160011:
            case 2160013:
            case 2160016:
                Context context = this.j;
                qpx.b(context, context.getResources().getString(R.string.IDS_invoice_apply_token));
                break;
            case 2160003:
                Context context2 = this.j;
                qpx.b(context2, context2.getResources().getString(R.string.IDS_invoice_apply_zero));
                break;
            case 2160004:
                Context context3 = this.j;
                qpx.b(context3, context3.getResources().getString(R.string.IDS_invoice_apply_network));
                break;
            case 2160010:
                Context context4 = this.j;
                qpx.b(context4, context4.getResources().getString(R.string.IDS_invoice_apply_expired));
                break;
        }
    }

    public Handler b() {
        return this.o;
    }

    /* JADX INFO: loaded from: classes19.dex */
    static final class InVoiceActivityHandler extends BaseHandler<InvoiceApplicationActivity> {
        public InVoiceActivityHandler(InvoiceApplicationActivity invoiceApplicationActivity) {
            super(invoiceApplicationActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(InvoiceApplicationActivity invoiceApplicationActivity, Message message) {
            Bundle data = message.getData();
            int i = message.what;
            int i2 = data.getInt("customerType");
            long j = data.getLong("invoiceTime");
            String string = data.getString("invoiceType");
            if (i == 0) {
                invoiceApplicationActivity.i();
                return;
            }
            if (i == 1) {
                invoiceApplicationActivity.e(j, i2, string);
            } else if (i == 2) {
                invoiceApplicationActivity.d(j, i2, string);
            } else {
                LogUtil.e("InvoiceApplicationActivity", "handle msg failed, unknown message code = ", Integer.valueOf(i));
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
