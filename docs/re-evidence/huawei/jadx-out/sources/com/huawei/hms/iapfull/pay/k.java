package com.huawei.hms.iapfull.pay;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.huawei.hms.iapfull.R;
import com.huawei.hms.iapfull.a1;
import com.huawei.secure.android.common.intent.SafeBundle;

/* JADX INFO: loaded from: classes34.dex */
public class k extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f13750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f13751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View.OnClickListener f13752c = new a();

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_trade_pay_result, viewGroup, false);
        this.f13750a = (TextView) viewInflate.findViewById(R.id.product_name_text);
        this.f13751b = (TextView) viewInflate.findViewById(R.id.product_price_text);
        ((TextView) viewInflate.findViewById(R.id.pay_result_ok)).setOnClickListener(this.f13752c);
        SafeBundle safeBundle = new SafeBundle(getArguments());
        this.f13750a.setText(safeBundle.getString("product_name"));
        this.f13751b.setText(a1.a(getContext(), safeBundle.getString("product_price"), "string_cny_normal", safeBundle.getString("product_currency")));
        return viewInflate;
    }

    class a implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k.this.getActivity().finish();
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
