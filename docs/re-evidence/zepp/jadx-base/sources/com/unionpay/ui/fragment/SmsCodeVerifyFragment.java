package com.unionpay.ui.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.Observer;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.nfc.unionpay.R;
import com.unionpay.entity.UnionPayResource;
import com.unionpay.ui.viewmodel.SmsCodeVerifyViewModel;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes18.dex */
public class SmsCodeVerifyFragment extends BaseUnionPayFragment<SmsCodeVerifyViewModel> implements View.OnClickListener {
    private EditText c;
    private TextView d;
    private TextView e;
    private String f;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            SmsCodeVerifyFragment.this.e.setEnabled(!TextUtils.isEmpty(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Integer num) {
        if (num == null || num.intValue() <= 0) {
            this.d.setEnabled(true);
            this.d.setText(R.string.wl_get_verify_code);
            return;
        }
        this.d.setEnabled(false);
        this.d.setText(num + SOAP.XMLNS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(UnionPayResource unionPayResource) {
        if (unionPayResource == null) {
            return;
        }
        this.b.showOrError(unionPayResource);
        a(unionPayResource, "Get Sms Code");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(UnionPayResource unionPayResource) {
        if (unionPayResource == null || getActivity() == null) {
            return;
        }
        this.b.showOrError(unionPayResource);
        a(unionPayResource, "Verify Sms Code");
        if (unionPayResource.isSuccessful()) {
            Toast.makeText(getActivity(), R.string.wl_sms_code_verify_success, 0).show();
            getActivity().setResult(-1);
            getActivity().finish();
        }
    }

    private void i() {
        String string = this.c.getText().toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        ((SmsCodeVerifyViewModel) this.a).verifySmsCode(this.f, string);
    }

    private void initData() {
        if (getArguments() != null) {
            this.f = getArguments().getString("PanId");
        }
        HMLog.i(tag(), "PanId:" + this.f, new Object[0]);
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment
    public int getContentLayout() {
        return R.layout.wl_fragment_code_verify;
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment
    public Class<SmsCodeVerifyViewModel> getViewModelClass() {
        return SmsCodeVerifyViewModel.class;
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment
    public void initView(View view) {
        this.c = (EditText) view.findViewById(R.id.sms_code);
        this.d = (TextView) view.findViewById(R.id.get_sms_code);
        this.e = (TextView) view.findViewById(R.id.submit);
        this.d.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.c.addTextChangedListener(new a());
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment
    @SuppressLint({"SetTextI18n"})
    public void observeViewModel() {
        ((SmsCodeVerifyViewModel) this.a).remainTimeData.observe(this, new Observer() { // from class: p47
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.f((Integer) obj);
            }
        });
        ((SmsCodeVerifyViewModel) this.a).getSmsCodeData.observe(this, new Observer() { // from class: n47
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.g((UnionPayResource) obj);
            }
        });
        ((SmsCodeVerifyViewModel) this.a).verifySmsCodeData.observe(this, new Observer() { // from class: o47
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.h((UnionPayResource) obj);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.get_sms_code) {
            ((SmsCodeVerifyViewModel) this.a).getSmsCode(this.f);
        } else if (view.getId() == R.id.submit) {
            i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        initData();
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.wl_fragment_code_verify, viewGroup, false);
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((SmsCodeVerifyViewModel) this.a).getSmsCode(this.f);
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment
    public String tag() {
        return "UnionPay-SmsCodeVerifyFragment";
    }
}
