package com.huami.wallet.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.adapter.PaymentModeListAdapter;
import com.huami.wallet.ui.decoration.DividerDecoration;
import com.huami.wallet.ui.entity.RichPayMode;
import com.huami.wallet.ui.utils.ListUtils;
import com.huami.wallet.ui.utils.MoneyUtils;
import com.huami.wallet.ui.utils.SpannableUtils;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class PayRechargeDialogFragment extends DialogFragment {
    private a a;
    private Builder b;
    private PaymentModeListAdapter c;
    private int d = 0;

    public static class Builder {
        public String a;
        public int b;
        public OnPayButtonClickListener c;
        public ArrayList<RichPayMode> d;

        public PayRechargeDialogFragment create() {
            PayRechargeDialogFragment payRechargeDialogFragment = new PayRechargeDialogFragment();
            payRechargeDialogFragment.g(this);
            return payRechargeDialogFragment;
        }

        public Builder setOnPayButtonClickListener(OnPayButtonClickListener onPayButtonClickListener) {
            this.c = onPayButtonClickListener;
            return this;
        }

        public Builder setPayModes(ArrayList<RichPayMode> arrayList) {
            this.d = arrayList;
            return this;
        }

        public Builder setPayMoney(int i) {
            this.b = i;
            return this;
        }

        public Builder setTitle(String str) {
            this.a = str;
            return this;
        }
    }

    public interface OnPayButtonClickListener {
        void onPay(RichPayMode richPayMode);
    }

    public static class a {
        public final TextView a;
        public final TextView b;
        public final RecyclerView c;
        public final Button d;

        public a(Dialog dialog) {
            this.a = (TextView) dialog.findViewById(R.id.dialog_message);
            this.b = (TextView) dialog.findViewById(R.id.recharge_money);
            this.c = (RecyclerView) dialog.findViewById(R.id.payment_mode_list);
            this.d = (Button) dialog.findViewById(R.id.pay_button);
        }
    }

    private void d() {
        RecyclerView recyclerView = this.a.c;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(true);
        recyclerView.setFocusable(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerDecoration(ListUtils.getMiddleDividerStyle(getContext())));
        final PaymentModeListAdapter paymentModeListAdapter = new PaymentModeListAdapter(R.layout.wl_item_payment_mode, this.b.d);
        paymentModeListAdapter.bindToRecyclerView(this.a.c);
        paymentModeListAdapter.setItemChecked(paymentModeListAdapter.getItem(this.d));
        paymentModeListAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: vs5
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                this.a.e(paymentModeListAdapter, baseQuickAdapter, view, i);
            }
        });
        this.c = paymentModeListAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(PaymentModeListAdapter paymentModeListAdapter, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        RichPayMode item = paymentModeListAdapter.getItem(i);
        this.d = i;
        paymentModeListAdapter.setItemChecked(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        OnPayButtonClickListener onPayButtonClickListener;
        Builder builder = this.b;
        if (builder != null && (onPayButtonClickListener = builder.c) != null) {
            onPayButtonClickListener.onPay(this.c.getCheckedItem());
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Builder builder) {
        this.b = builder;
    }

    private void initViews() {
        this.a.d.setOnClickListener(new View.OnClickListener() { // from class: us5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.f(view);
            }
        });
        Builder builder = this.b;
        if (builder != null) {
            this.a.a.setText(builder.a);
            String centRMB = MoneyUtils.formatCentRMB(this.b.b);
            this.a.b.setText(SpannableUtils.stylizePartialString(getContext(), getString(R.string.wl_format_x_yuan, centRMB), centRMB, R.style.TextAppearance_MiFit_Display1_Blue));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        initViews();
        d();
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        Objects.requireNonNull(context);
        Dialog dialog = new Dialog(context);
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
}
