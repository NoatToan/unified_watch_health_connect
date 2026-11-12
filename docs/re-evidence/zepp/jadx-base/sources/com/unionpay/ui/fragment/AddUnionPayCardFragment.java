package com.unionpay.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.p008lifecycle.Observer;
import com.huami.watch.companion.nfc.unionpay.R;
import com.unionpay.entity.UnionPayResource;
import com.unionpay.entity.UnionPayStatus;
import com.unionpay.tsmservice.result.GetActivityUniteApplyResult;
import com.unionpay.ui.activity.SmsCodeVerifyActivity;
import com.unionpay.ui.activity.SupportUnionPayBankActivity;
import com.unionpay.ui.activity.UnionPayCardDetailActivity;
import com.unionpay.ui.viewmodel.AddUnionCardViewModel;
import com.unionpay.ui.widget.BankCardEditText;

/* JADX INFO: loaded from: classes18.dex */
public class AddUnionPayCardFragment extends BaseUnionPayFragment<AddUnionCardViewModel> {
    private static final String h = "success";
    private static final int i = 0;
    private static final int j = 1;
    private static final int k = 2;
    private BankCardEditText c;
    private View d;
    private CheckBox e;
    private ProgressDialogFragment f;
    private int g = 0;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AddUnionPayCardFragment.this.g = 0;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    private void j(String str) {
        Intent intent = new Intent(getContext(), (Class<?>) SmsCodeVerifyActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("PanId", str);
        intent.putExtras(bundle);
        startActivityForResult(intent, 18);
    }

    private void k() {
        String bankCardText = this.c.getBankCardText();
        if (TextUtils.isEmpty(bankCardText)) {
            return;
        }
        ((AddUnionCardViewModel) this.a).checkBinCode(bankCardText);
    }

    private void l() {
        if (((AddUnionCardViewModel) this.a).appApplyResultData.getValue() == null || ((AddUnionCardViewModel) this.a).appApplyResultData.getValue().data == null) {
            return;
        }
        ProgressDialogFragment progressDialogFragment = this.f;
        if (progressDialogFragment != null) {
            progressDialogFragment.dismissAllowingStateLoss();
            this.f = null;
        }
        ((AddUnionCardViewModel) this.a).downloadCard(((AddUnionCardViewModel) this.a).appApplyResultData.getValue().data.getApplyResult());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(View view) {
        ((AddUnionCardViewModel) this.a).showProtocol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(View view) {
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(View view) {
        if (this.e.isChecked()) {
            int i2 = this.g;
            if (i2 == 0) {
                k();
                return;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    l();
                }
            } else {
                GetActivityUniteApplyResult getActivityUniteApplyResult = ((AddUnionCardViewModel) this.a).appApplyResultData.getValue() != null ? ((AddUnionCardViewModel) this.a).appApplyResultData.getValue().data : null;
                if (getActivityUniteApplyResult != null) {
                    j(getActivityUniteApplyResult.getApplyResult().getMPanId());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(CompoundButton compoundButton, boolean z) {
        this.d.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(UnionPayResource unionPayResource) {
        if (unionPayResource == null) {
            return;
        }
        this.b.showOrError(unionPayResource);
        a(unionPayResource, "Check Bin Code");
        if (!unionPayResource.isSuccessful() || unionPayResource.data == 0) {
            return;
        }
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void r(UnionPayResource unionPayResource) {
        if (unionPayResource == null) {
            return;
        }
        this.b.onError(unionPayResource);
        a(unionPayResource, "Card Apply");
        T t = unionPayResource.data;
        if (t == 0 || !"success".equalsIgnoreCase(((GetActivityUniteApplyResult) t).getApplyResult().getResult())) {
            this.b.hideLoadingDialog();
        } else {
            this.g = 1;
            j(((GetActivityUniteApplyResult) unionPayResource.data).getApplyResult().getMPanId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void s(UnionPayResource unionPayResource) {
        if (unionPayResource == null) {
            return;
        }
        a(unionPayResource, "Download Card");
        View view = this.d;
        UnionPayStatus unionPayStatus = unionPayResource.status;
        UnionPayStatus unionPayStatus2 = UnionPayStatus.ERROR;
        view.setVisibility(unionPayStatus == unionPayStatus2 ? 0 : 8);
        if (unionPayResource.status == unionPayStatus2) {
            ProgressDialogFragment progressDialogFragment = this.f;
            if (progressDialogFragment != null) {
                progressDialogFragment.dismissAllowingStateLoss();
            }
            this.b.onError(unionPayResource);
        } else {
            T t = unionPayResource.data;
            v(t != 0 ? ((Integer) t).intValue() : 0);
        }
        if (unionPayResource.isSuccessful()) {
            String bankCardId = ((AddUnionCardViewModel) this.a).getBankCardId();
            ((AddUnionCardViewModel) this.a).syncIssueToDevice(bankCardId);
            Intent intent = new Intent(getActivity(), (Class<?>) UnionPayCardDetailActivity.class);
            intent.putExtra(UnionPayCardDetailActivity.KEY_CARD_ID, bankCardId);
            intent.putExtra("refresh", true);
            startActivity(intent);
        }
    }

    private void t() {
        String bankCardText = this.c.getBankCardText();
        if (((AddUnionCardViewModel) this.a).checkBinData.getValue() == null || ((AddUnionCardViewModel) this.a).checkBinData.getValue().data == null) {
            return;
        }
        ((AddUnionCardViewModel) this.a).openUniteCardApply(getActivity(), bankCardText, ((AddUnionCardViewModel) this.a).checkBinData.getValue().data.getCheckBinCodeInfo());
    }

    private void u() {
        startActivity(new Intent(getActivity(), (Class<?>) SupportUnionPayBankActivity.class));
    }

    private void v(int i2) {
        if (i2 == 100) {
            ProgressDialogFragment progressDialogFragment = this.f;
            if (progressDialogFragment != null) {
                progressDialogFragment.dismissAllowingStateLoss();
                return;
            }
            return;
        }
        if (this.f == null) {
            ProgressDialogFragment progressDialogFragment2 = new ProgressDialogFragment();
            this.f = progressDialogFragment2;
            progressDialogFragment2.setMessage(getString(R.string.wl_bank_download_tips));
            this.f.setCancelable(false);
        }
        if (!this.f.isVisible()) {
            this.f.show(getChildFragmentManager(), "union_card_download");
        }
        this.f.setTitle(getString(R.string.wl_bank_download_progress, Integer.valueOf(i2)));
        this.f.setProgress(i2);
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment
    public int getContentLayout() {
        return R.layout.wl_fragment_add_bank_card;
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment
    public Class<AddUnionCardViewModel> getViewModelClass() {
        return AddUnionCardViewModel.class;
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment
    public void initView(View view) {
        this.c = (BankCardEditText) view.findViewById(R.id.add_union_card_nm);
        this.d = view.findViewById(R.id.next_button);
        this.e = (CheckBox) view.findViewById(R.id.protocol_agree);
        TextView textView = (TextView) view.findViewById(R.id.protocol_text);
        textView.setText(getString(R.string.wl_bank_protocol_name, ((AddUnionCardViewModel) this.a).getProtocolTitle()));
        textView.setOnClickListener(new View.OnClickListener() { // from class: aa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.m(view2);
            }
        });
        view.findViewById(R.id.add_support_bank).setOnClickListener(new View.OnClickListener() { // from class: y9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.n(view2);
            }
        });
        this.d.setOnClickListener(new View.OnClickListener() { // from class: z9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.o(view2);
            }
        });
        this.e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ba
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.p(compoundButton, z);
            }
        });
        this.c.addTextChangedListener(new a());
    }

    public boolean needRefreshCardList() {
        return this.g != 0;
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment
    public void observeViewModel() {
        ((AddUnionCardViewModel) this.a).checkBinData.observe(this, new Observer() { // from class: ca
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.q((UnionPayResource) obj);
            }
        });
        ((AddUnionCardViewModel) this.a).appApplyResultData.observe(this, new Observer() { // from class: da
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.r((UnionPayResource) obj);
            }
        });
        ((AddUnionCardViewModel) this.a).mDownloadProgressData.observe(this, new Observer() { // from class: ea
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.s((UnionPayResource) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 18 && i3 == -1) {
            this.g = 2;
            l();
        }
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment
    public String tag() {
        return "UnionPay-AddUnionPayCardFragment";
    }
}
