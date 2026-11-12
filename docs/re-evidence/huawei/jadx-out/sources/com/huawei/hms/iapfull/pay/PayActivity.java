package com.huawei.hms.iapfull.pay;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.iapfull.R;
import com.huawei.hms.iapfull.a1;
import com.huawei.hms.iapfull.bean.PayRequest;
import com.huawei.hms.iapfull.bean.PayResult;
import com.huawei.hms.iapfull.e1;
import com.huawei.hms.iapfull.m0;
import com.huawei.hms.iapfull.n0;
import com.huawei.hms.iapfull.network.model.MyPayType;
import com.huawei.hms.iapfull.network.model.ReportPayResultResponse;
import com.huawei.hms.iapfull.o0;
import com.huawei.hms.iapfull.p0;
import com.huawei.hms.iapfull.s0;
import com.huawei.hms.iapfull.widget.actionbar.CustomActionBar;
import com.huawei.hms.iapfull.x0;
import com.huawei.hms.iapfull.y0;
import com.huawei.secure.android.common.detect.RootDetect;
import com.huawei.secure.android.common.intent.SafeBundle;
import com.huawei.secure.android.common.intent.SafeIntent;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class PayActivity extends n0 implements View.OnClickListener, p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PayRequest f13724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m0 f13725c;
    private CustomActionBar d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private ListView i;
    private j j;
    private List<MyPayType> l;
    private boolean n;
    private int k = 0;
    private PayResult m = new PayResult();

    static void a(PayActivity payActivity, x0 x0Var) {
        payActivity.getClass();
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putString("product_name", x0Var.d());
        bundle.putString("product_price", x0Var.e());
        bundle.putString("product_currency", payActivity.f13724b.getCurrency());
        kVar.setArguments(bundle);
        payActivity.a(kVar, R.id.door_contents_fl, true);
        com.huawei.hms.iapfull.b.a(payActivity, "iap_payment_cashier_result", payActivity.j.a(payActivity.f13724b));
    }

    static void b(PayActivity payActivity, x0 x0Var) {
        payActivity.getClass();
        n nVar = new n();
        Bundle bundle = new Bundle();
        bundle.putString("product_name", x0Var.d());
        bundle.putString("pay_order", x0Var.b());
        bundle.putString("pay_type", x0Var.c());
        nVar.setArguments(bundle);
        payActivity.a(nVar, R.id.door_contents_fl, true);
    }

    public void c(x0 x0Var) {
        if (isFinishing() || isDestroyed()) {
            y0.a("PayActivity", "onWithholdFinish activity dead");
            return;
        }
        b();
        a(x0Var);
        this.j.a(new c(x0Var));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getSupportFragmentManager().getFragments().size() > 0) {
            finish();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.hwpay_check_to_cancel_pay);
        builder.setPositiveButton(R.string.hwpay_exitpay_yes, new d(this));
        builder.setNegativeButton(R.string.hwpay_exitpay_no, new e(this));
        builder.create().show();
    }

    @Override // com.huawei.hms.iapfull.n0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pay);
        if (getIntent() == null) {
            y0.a("PayActivity", "receivePayRequestFromIntent getIntent is null");
        } else {
            SafeBundle safeBundle = new SafeBundle(new SafeIntent(getIntent()).getExtras());
            PayRequest payRequest = new PayRequest();
            this.f13724b = payRequest;
            payRequest.fromBundle(safeBundle);
        }
        CustomActionBar customActionBar = (CustomActionBar) findViewById(R.id.action_bar);
        this.d = customActionBar;
        customActionBar.setOnBackClickListener(new a());
        y0.b("PayActivity", "Agree License,obtainSystemInfoFromServer and refresh GPSLocation");
        if (!RootDetect.isRoot()) {
            c();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.hwpay_pay_root_tips_new);
        builder.setPositiveButton(R.string.hwpay_continue, new com.huawei.hms.iapfull.pay.a(this));
        builder.setNegativeButton(R.string.hwpay_exitpay_no, new com.huawei.hms.iapfull.pay.b(this));
        builder.create().show();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        String str;
        y0.b("PayActivity", "onNewIntent");
        super.onNewIntent(intent);
        if (intent == null) {
            str = "onCreateFromScheme intent is null";
        } else {
            SafeIntent safeIntent = new SafeIntent(intent);
            if ("hwid".equals(safeIntent.getScheme())) {
                Uri data = safeIntent.getData();
                if (data == null) {
                    str = "scheme getData isEmpty.";
                } else {
                    String path = data.getPath();
                    if (TextUtils.isEmpty(path)) {
                        str = "scheme getPath isEmpty.";
                    } else {
                        if ("/result".equals(path)) {
                            String encodedQuery = data.getEncodedQuery();
                            y0.b("PayActivity", "queryParams is in alipay sign result");
                            if (TextUtils.isEmpty(encodedQuery)) {
                                return;
                            }
                            this.j.a(a1.a(encodedQuery));
                            return;
                        }
                        str = "scheme getPath illegal.";
                    }
                }
            } else {
                str = "scheme illegal.";
            }
        }
        y0.b("PayActivity", str);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        y0.b("PayActivity", "start onResume");
        if (this.j == null || !this.n || getSupportFragmentManager().getFragments().size() > 0) {
            return;
        }
        y0.a("PayActivity", "hasResultShow check show pay page first time.");
        List<MyPayType> list = this.l;
        if (list == null || this.k >= list.size() || this.l.get(this.k).getPayType() != 17) {
            return;
        }
        this.n = false;
        this.j.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        findViewById(R.id.door_contents_fl).setVisibility(8);
        findViewById(R.id.pay_layout).setVisibility(0);
        TextView textView = (TextView) findViewById(R.id.huaweipay_recharge);
        this.e = textView;
        textView.setOnClickListener(this);
        this.e.setClickable(false);
        this.f = (TextView) findViewById(R.id.b_product_fullname);
        this.g = (TextView) findViewById(R.id.b_meramount);
        this.h = (TextView) findViewById(R.id.b_pay_amount);
        this.i = (ListView) findViewById(R.id.pay_type_list);
        PayRequest payRequest = this.f13724b;
        if (payRequest != null) {
            this.f.setText(payRequest.getProductName());
            if ("toSign".equals(this.f13724b.getTradeType())) {
                findViewById(R.id.rl_b_meramount).setVisibility(8);
                findViewById(R.id.ll_b_pay_amount).setVisibility(8);
            } else {
                String strA = a1.a(this, this.f13724b.getAmount(), "string_cny_normal", this.f13724b.getCurrency());
                this.g.setText(strA);
                this.h.setText(strA);
            }
            this.e.setText(a1.a(this, this.f13724b.getAmount(), "string_cny_confirm", this.f13724b.getCurrency()));
        }
        this.i.setOnItemClickListener(new com.huawei.hms.iapfull.pay.c(this));
        getWindow().setNavigationBarColor(getResources().getColor(R.color.navigation_bar_back_color));
        this.j = new j(this.f13724b, this);
    }

    public void a(List<MyPayType> list) {
        if (list == null || list.isEmpty() || !g.a.f13739a.b()) {
            e1.a().a(this, R.string.hwpay_iap_payment_not_available);
            this.m.setReturnCode(30011);
            this.m.setErrMsg(getString(R.string.hwpay_iap_payment_not_available));
            Intent intent = new Intent();
            intent.putExtras(this.m.toBundle());
            setResult(-1, intent);
            finish();
            return;
        }
        this.l = list;
        m0 m0Var = this.f13725c;
        if (m0Var != null) {
            m0Var.a(list);
            return;
        }
        m0 m0Var2 = new m0(this, this.l, 0);
        this.f13725c = m0Var2;
        this.i.setAdapter((ListAdapter) m0Var2);
    }

    public void b(x0 x0Var) {
        if (isFinishing() || isDestroyed()) {
            y0.a("PayActivity", "onPayFinish activity dead");
            return;
        }
        b();
        a(x0Var);
        this.j.a(new b(x0Var));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        y0.b("PayActivity", "start onStop");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        y0.b("PayActivity", "start onStart");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        y0.b("PayActivity", "start onPause");
        this.n = true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        List<MyPayType> list;
        if (!a1.a(this)) {
            y0.a("PayActivity", "click: withHold net error");
            a(getString(R.string.hwpay_subscribe_network_error_tips), "30005");
            a(30005, getString(R.string.hwpay_subscribe_network_error_tips));
        } else if (view.getId() == R.id.huaweipay_recharge) {
            j jVar = this.j;
            if (jVar == null || (list = this.l) == null) {
                y0.a("PayActivity", "onClick: parameters are invalid");
            } else {
                jVar.c(list.get(this.k).getPayType());
            }
        }
    }

    public void a(boolean z) {
        this.e.setClickable(z);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 int, still in use, count: 2, list:
      (r0v1 int) from 0x002b: IF  (r0v1 int) == (54 int)  -> B:28:0x0062 A[HIDDEN]
      (r0v1 int) from 0x0030: IF  (r0v1 int) != (1677668281 int)  -> B:10:0x0032 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    public void a(String str, String str2) {
        byte b2;
        int payType;
        if (TextUtils.isEmpty(str2)) {
            y0.a("PayActivity", "showErrorMsgDialog is null");
            a(30006, getString(R.string.hwpay_returnCodeE200999des));
            return;
        }
        str2.hashCode();
        str2.hashCode();
        if (iHashCode == 54) {
            b2 = !str2.equals("6") ? (byte) -1 : (byte) 0;
        } else if (iHashCode != 1677668281) {
            switch (str2) {
                case "900000":
                    b2 = 1;
                    break;
                case "900001":
                    b2 = 2;
                    break;
                case "900002":
                    b2 = 3;
                    break;
                default:
                    b2 = -1;
                    break;
            }
        } else {
            b2 = !str2.equals("900013") ? (byte) -1 : (byte) 4;
        }
        if (b2 != 0) {
            if (b2 == 1 || b2 == 2 || b2 == 3) {
                e1.a().a(this, o0.a(this, str2, str));
                List<MyPayType> list = this.l;
                if (list != null) {
                    int size = list.size();
                    int i = this.k;
                    if (size > i) {
                        payType = this.l.get(i).getPayType();
                    } else {
                        payType = 17;
                    }
                } else {
                    payType = 17;
                }
                if ("toSign".equals(this.f13724b.getTradeType())) {
                    this.j.a((String) null, payType);
                    return;
                } else {
                    this.j.b(payType);
                    return;
                }
            }
            if (b2 != 4) {
                a(-1, getString(R.string.hwpay_returnCodeE200999des));
                return;
            }
        }
        e1.a().a(this, o0.a(this, str2, str));
        a(-1, str);
    }

    public void a(PayResult payResult) {
        payResult.setTime(null);
        payResult.createPayResult(this.f13724b);
        Intent intent = new Intent();
        intent.putExtras(payResult.toBundle());
        setResult(-1, intent);
    }

    public void a(int i) {
        this.e.setText(i);
    }

    private void b() {
        this.d.setTitle(getString(R.string.hwpay_pay_result));
        findViewById(R.id.door_contents_fl).setVisibility(0);
        findViewById(R.id.pay_layout).setVisibility(8);
    }

    private void a(x0 x0Var) {
        this.m.createPayResult(this.f13724b);
        this.m.setReturnCode(0);
        this.m.setErrMsg(x0Var.a());
        this.m.setTime(x0Var.f());
        this.m.setOrderID(x0Var.b());
        if (TextUtils.isEmpty(x0Var.g())) {
            return;
        }
        this.m.setWithHoldID(x0Var.g());
    }

    class b implements s0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0 f13727a;

        @Override // com.huawei.hms.iapfull.s0
        public void a(String str, String str2) {
            PayActivity.this.a();
            y0.a("PayActivity", "errorCode " + str + ", desc = " + str2);
            Intent intent = new Intent();
            intent.putExtras(PayActivity.this.m.toBundle());
            PayActivity.this.setResult(-1, intent);
            PayActivity.a(PayActivity.this, this.f13727a);
        }

        @Override // com.huawei.hms.iapfull.s0
        public void a(ReportPayResultResponse reportPayResultResponse) {
            PayActivity.this.a();
            PayActivity.this.m.setSign(reportPayResultResponse.getReturnDevSign());
            PayActivity.this.m.setNewSign(reportPayResultResponse.getNewSign());
            PayActivity.this.m.setSignatureAlgorithm(reportPayResultResponse.getSignatureAlgorithm());
            Intent intent = new Intent();
            intent.putExtras(PayActivity.this.m.toBundle());
            PayActivity.this.setResult(-1, intent);
            PayActivity.a(PayActivity.this, this.f13727a);
        }

        b(x0 x0Var) {
            this.f13727a = x0Var;
        }
    }

    class c implements s0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0 f13729a;

        @Override // com.huawei.hms.iapfull.s0
        public void a(String str, String str2) {
            PayActivity.this.a();
            y0.a("PayActivity", "errorCode " + str + ", desc = " + str2);
            Intent intent = new Intent();
            intent.putExtras(PayActivity.this.m.toBundle());
            PayActivity.this.setResult(-1, intent);
            PayActivity.b(PayActivity.this, this.f13729a);
        }

        @Override // com.huawei.hms.iapfull.s0
        public void a(ReportPayResultResponse reportPayResultResponse) {
            PayActivity.this.a();
            PayActivity.this.m.setSign(reportPayResultResponse.getReturnDevSign());
            PayActivity.this.m.setNewSign(reportPayResultResponse.getNewSign());
            PayActivity.this.m.setSignatureAlgorithm(reportPayResultResponse.getSignatureAlgorithm());
            Intent intent = new Intent();
            intent.putExtras(PayActivity.this.m.toBundle());
            PayActivity.this.setResult(-1, intent);
            PayActivity.b(PayActivity.this, this.f13729a);
        }

        c(x0 x0Var) {
            this.f13729a = x0Var;
        }
    }

    class a implements CustomActionBar.OnBackClickListener {
        @Override // com.huawei.hms.iapfull.widget.actionbar.CustomActionBar.OnBackClickListener
        public void onBackClick() {
            PayActivity.this.onBackPressed();
        }

        a() {
        }
    }

    private void a(int i, String str) {
        this.m.setErrMsg(str);
        this.m.setReturnCode(i);
        Intent intent = new Intent();
        intent.putExtras(this.m.toBundle());
        setResult(-1, intent);
        finish();
    }
}
