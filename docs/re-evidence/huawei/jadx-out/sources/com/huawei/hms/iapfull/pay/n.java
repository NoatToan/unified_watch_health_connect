package com.huawei.hms.iapfull.pay;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.huawei.hms.iapfull.R;
import com.huawei.secure.android.common.intent.SafeBundle;

/* JADX INFO: loaded from: classes34.dex */
public class n extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f13758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f13759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f13760c;
    private View.OnClickListener d = new a();

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_trade_sign_result, viewGroup, false);
        this.f13758a = (TextView) viewInflate.findViewById(R.id.pay_product_name);
        this.f13759b = (TextView) viewInflate.findViewById(R.id.pay_order_id);
        this.f13760c = (TextView) viewInflate.findViewById(R.id.tv_payType);
        ((TextView) viewInflate.findViewById(R.id.sign_result_ok)).setOnClickListener(this.d);
        SafeBundle safeBundle = new SafeBundle(getArguments());
        this.f13758a.setText(safeBundle.getString("product_name"));
        this.f13759b.setText(safeBundle.getString("pay_order"));
        this.f13760c.setText(safeBundle.getString("pay_type"));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    class a implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n.this.getActivity().finish();
        }

        a() {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }
}
