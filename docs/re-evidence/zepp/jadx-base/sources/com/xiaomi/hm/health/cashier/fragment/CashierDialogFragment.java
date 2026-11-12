package com.xiaomi.hm.health.cashier.fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.huami.account.HMLoginManager;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.discovery.bridge.util.NetUtil;
import com.huami.wallet.ui.adapter.PaymentModeListAdapter;
import com.huami.wallet.ui.decoration.DividerDecoration;
import com.huami.wallet.ui.entity.RichPayMode;
import com.huami.wallet.ui.utils.ListUtils;
import com.huami.wallet.ui.utils.MoneyUtils;
import com.huami.wallet.ui.utils.SpannableUtils;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.cashier.CashierPay;
import com.xiaomi.hm.health.cashier.model.CashierPayChannel;
import com.xiaomi.hm.health.cashier.model.CashierPayResponse;
import com.xiaomi.hm.health.cashier.model.Product;
import com.xiaomi.hm.health.cashier.viewmodel.CashierViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class CashierDialogFragment extends DialogFragment {
    private static final String m = "fee";
    private static final String n = "id";
    private static final String o = "name";
    private a a;
    private Builder b;
    private PaymentModeListAdapter c;
    private LoadingDialog d;
    private IPayCallback e;
    private ArrayList<Product> g;
    private String i;
    private String j;
    private String k;
    private String l;
    private Lazy<CashierViewModel> f = KoinJavaComponent.inject(CashierViewModel.class);
    private int h = 0;

    public static class Builder {
        public String a;
        public int b;
        public ArrayList<RichPayMode> c;

        public CashierDialogFragment create() {
            CashierDialogFragment cashierDialogFragment = new CashierDialogFragment();
            cashierDialogFragment.m(this);
            return cashierDialogFragment;
        }

        public Builder setPayModes(ArrayList<RichPayMode> payModes) {
            this.c = payModes;
            return this;
        }

        public Builder setPayMoney(int payMoney) {
            this.b = payMoney;
            return this;
        }

        public Builder setTitle(String title) {
            this.a = title;
            return this;
        }
    }

    public interface IPayCallback {
        void accept(CashierPayResponse result);
    }

    public static class a {
        public final TextView a;
        public final TextView b;
        public final RecyclerView c;
        public final Button d;
        public final View e;

        public a(Dialog dialog) {
            TextView textView = (TextView) dialog.findViewById(R.id.dialog_message);
            this.a = textView;
            this.b = (TextView) dialog.findViewById(R.id.recharge_money);
            this.c = (RecyclerView) dialog.findViewById(R.id.payment_mode_list);
            this.d = (Button) dialog.findViewById(R.id.pay_button);
            this.e = textView.getRootView();
        }
    }

    private CashierViewModel f() {
        return this.f.getValue();
    }

    private void g() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.g = arguments.getParcelableArrayList("id");
            this.i = arguments.getString("name");
        }
        this.k = HMLoginManager.getHuamiId();
    }

    private void h() {
        if (getContext() == null) {
            return;
        }
        RecyclerView recyclerView = this.a.c;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(true);
        recyclerView.setFocusable(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerDecoration(ListUtils.getMiddleDividerStyle(getContext())));
        final PaymentModeListAdapter paymentModeListAdapter = new PaymentModeListAdapter(R.layout.cashier_payment_item, this.b.c);
        paymentModeListAdapter.bindToRecyclerView(this.a.c);
        paymentModeListAdapter.setItemChecked(paymentModeListAdapter.getItem(this.h));
        paymentModeListAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: yl0
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                this.a.i(paymentModeListAdapter, baseQuickAdapter, view, i);
            }
        });
        this.c = paymentModeListAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(PaymentModeListAdapter paymentModeListAdapter, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        RichPayMode item = paymentModeListAdapter.getItem(i);
        this.h = i;
        paymentModeListAdapter.setItemChecked(item);
    }

    private void initViewModel() {
        f().orderIdLiveData.observe(this, new Observer() { // from class: xl0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.j((String) obj);
            }
        });
        f().payResultLiveData.observe(this, new Observer() { // from class: wl0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.k((CashierPayResponse) obj);
            }
        });
    }

    private void initViews() {
        this.a.d.setOnClickListener(new View.OnClickListener() { // from class: vl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.l(view);
            }
        });
        Builder builder = this.b;
        if (builder != null) {
            this.a.a.setText(builder.a);
            String centRMB = MoneyUtils.formatCentRMB(this.b.b);
            this.a.b.setText(SpannableUtils.stylizePartialString(getContext(), getString(R.string.wl_format_x_yuan, centRMB), centRMB, 2132017876));
        }
        this.a.e.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(String str) {
        hideLoading();
        if (!TextUtils.isEmpty(str)) {
            this.j = str;
            this.a.e.setVisibility(0);
            return;
        }
        dismissAllowingStateLoss();
        IPayCallback iPayCallback = this.e;
        if (iPayCallback != null) {
            iPayCallback.accept(new CashierPayResponse(false, CashierPay.ERROR_OTHER));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(CashierPayResponse cashierPayResponse) {
        dismissAllowingStateLoss();
        IPayCallback iPayCallback = this.e;
        if (iPayCallback != null) {
            iPayCallback.accept(cashierPayResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(View view) {
        if (getContext() != null && !NetUtil.isNetworkConnected(getContext())) {
            CustomToast.showLong(getActivity(), getString(R.string.no_network_connection));
            return;
        }
        if (this.c.getCheckedItem() == RichPayMode.WECHAT_PAY) {
            this.l = CashierPayChannel.PAY_WX;
        } else {
            this.l = CashierPayChannel.PAY_ALI;
        }
        f().pay(getActivity(), this.k, this.j, this.l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(Builder builder) {
        this.b = builder;
    }

    public static void showCashier(FragmentActivity activity, int fee, List<Product> productList, String name, IPayCallback callback) {
        ArrayList<RichPayMode> arrayList = new ArrayList<>();
        arrayList.add(RichPayMode.WECHAT_PAY);
        arrayList.add(RichPayMode.ALIPAY);
        Bundle bundle = new Bundle();
        bundle.putInt(m, fee);
        bundle.putParcelableArrayList("id", new ArrayList<>(productList));
        bundle.putString("name", name);
        CashierDialogFragment cashierDialogFragmentCreate = new Builder().setTitle(name).setPayModes(arrayList).setPayMoney(fee).create();
        cashierDialogFragmentCreate.setArguments(bundle);
        cashierDialogFragmentCreate.setCallback(callback);
        cashierDialogFragmentCreate.show(activity.getSupportFragmentManager(), "CashierDialogFragment");
    }

    public void hideLoading() {
        LoadingDialog loadingDialog = this.d;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.d.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViews();
        initViewModel();
        h();
        if (getContext() != null && !NetUtil.isNetworkConnected(getContext())) {
            CustomToast.showLong(getActivity(), getString(R.string.no_network_connection));
        } else {
            showLoading(getString(R.string.wl_loading));
            f().bookOrder(this.k, this.g, this.i);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        if (getContext() == null) {
            throw new IllegalStateException("Context must not null");
        }
        g();
        Dialog dialog = new Dialog(getContext());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.requestFeature(1);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setContentView(R.layout.wl_dialog_pay_recharge);
        this.a = new a(dialog);
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialog) {
        super.onDismiss(dialog);
        if (f() == null || f().payResultLiveData.getValue() != null || this.e == null || TextUtils.isEmpty(this.j)) {
            return;
        }
        this.e.accept(new CashierPayResponse(false, -2));
    }

    public void setCallback(IPayCallback callback) {
        this.e = callback;
    }

    public void showLoading(String message) {
        if (this.d == null) {
            LoadingDialog loadingDialog = new LoadingDialog(getContext());
            this.d = loadingDialog;
            loadingDialog.setCancelable(false);
        }
        this.d.setMessage(message);
        if (this.d.isShowing()) {
            return;
        }
        this.d.show();
    }
}
