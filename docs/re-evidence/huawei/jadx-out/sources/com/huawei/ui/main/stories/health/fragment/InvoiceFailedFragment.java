package com.huawei.ui.main.stories.health.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.InvoiceApplicationActivity;
import defpackage.qsp;

/* JADX INFO: loaded from: classes19.dex */
public class InvoiceFailedFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f27891c;
    private String d;
    private String e;

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        LogUtil.a("InvoiceFailedFragment", "onCreate");
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.e = arguments.getString("orderId");
            this.d = arguments.getString("orderCode");
            this.f27889a = arguments.getInt("invoiceHeader");
            this.f27890b = arguments.getString(HwPayConstant.KEY_AMOUNT);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a("InvoiceFailedFragment", "onCreateView");
        this.f27891c = layoutInflater.inflate(R.layout.activity_invoice_falied, viewGroup, false);
        b();
        return this.f27891c;
    }

    private void b() {
        LogUtil.a("InvoiceFailedFragment", "initView");
        HealthTextView healthTextView = (HealthTextView) this.f27891c.findViewById(R.id.invoice_header_failed);
        int i = this.f27889a;
        healthTextView.setText(i != 0 ? getString(i) : "");
        ((HealthTextView) this.f27891c.findViewById(R.id.transaction_no_failed)).setText(this.e);
        ((HealthButton) this.f27891c.findViewById(R.id.btn_reapply)).setOnClickListener(new View.OnClickListener() { // from class: uuy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50597b.a(view);
            }
        });
        ((HealthSubHeader) qsp.a(this.f27891c, R.id.Invoicing_information_subheader_failed)).setSubHeaderBackgroundColor(ContextCompat.getColor(BaseApplication.b(), com.huawei.health.servicesui.R.color.common_transparent));
    }

    public /* synthetic */ void a(View view) {
        c();
    }

    private void c() {
        LogUtil.a("InvoiceFailedFragment", "switchActivity");
        Intent intent = new Intent(getActivity(), (Class<?>) InvoiceApplicationActivity.class);
        intent.putExtra("orderId", this.e);
        intent.putExtra("orderCode", this.d);
        intent.putExtra(ParsedFieldTag.PRICE, Double.valueOf(this.f27890b));
        startActivity(intent);
    }
}
