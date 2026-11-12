package com.huawei.ui.main.stories.health.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.InvoiceApplicationActivity;
import defpackage.qsp;
import defpackage.vdf;

/* JADX INFO: loaded from: classes19.dex */
public class InvoiceOngoingFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthSubHeader f27892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f27893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f27894c;
    private int d;
    private String e;
    private String g;
    private View h;
    private HealthTextView j;

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        LogUtil.a("InvoiceOngoingFragment", "onCreate");
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity instanceof InvoiceApplicationActivity) {
            this.f27893b = ((InvoiceApplicationActivity) activity).b();
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.g = arguments.getString("orderId");
            this.e = arguments.getString("orderCode");
            this.d = arguments.getInt("invoiceHeader");
        }
        LogUtil.a("InvoiceOngoingFragment", "mOrderId" + this.g);
        LogUtil.a("InvoiceOngoingFragment", "mOrderCode" + this.e);
        LogUtil.a("InvoiceOngoingFragment", "mInvoiceHeader" + this.d);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a("InvoiceOngoingFragment", "onCreateView");
        this.h = layoutInflater.inflate(R.layout.activity_invoice_ongoing, viewGroup, false);
        b();
        vdf.a(this.e, this.f27893b);
        vdf.d(this.e, this.f27893b);
        vdf.c(this.e, this.f27893b, 20000L);
        return this.h;
    }

    private void b() {
        LogUtil.a("InvoiceOngoingFragment", "initView");
        HealthSubHeader healthSubHeader = (HealthSubHeader) qsp.a(this.h, R.id.Invoicing_information_subheader_ongoing);
        this.f27892a = healthSubHeader;
        healthSubHeader.setSubHeaderBackgroundColor(ContextCompat.getColor(BaseApplication.b(), com.huawei.health.servicesui.R.color.common_transparent));
        HealthTextView healthTextView = (HealthTextView) this.h.findViewById(R.id.transaction_no_display);
        this.j = healthTextView;
        healthTextView.setText(this.g);
        HealthTextView healthTextView2 = (HealthTextView) this.h.findViewById(R.id.invoice_header_display);
        this.f27894c = healthTextView2;
        healthTextView2.setText(getString(this.d));
    }
}
