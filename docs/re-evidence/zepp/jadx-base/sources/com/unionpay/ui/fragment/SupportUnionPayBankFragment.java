package com.unionpay.ui.fragment;

import android.view.View;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.watch.companion.nfc.unionpay.R;
import com.unionpay.entity.UnionPayResource;
import com.unionpay.entity.UnionPayStatus;
import com.unionpay.ui.adapter.SupportUnionPayBankAdapter;
import com.unionpay.ui.viewmodel.SupportBankViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class SupportUnionPayBankFragment extends BaseUnionPayFragment<SupportBankViewModel> {
    private RecyclerView c;
    private SupportUnionPayBankAdapter d;
    private View e;

    private void d() {
        this.c.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        SupportUnionPayBankAdapter supportUnionPayBankAdapter = new SupportUnionPayBankAdapter();
        this.d = supportUnionPayBankAdapter;
        supportUnionPayBankAdapter.bindToRecyclerView(this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        ((SupportBankViewModel) this.a).loadSupportBank();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(UnionPayResource unionPayResource) {
        if (unionPayResource == null) {
            return;
        }
        this.b.showOrError(unionPayResource);
        a(unionPayResource, "Get Support Bank");
        this.e.setVisibility(unionPayResource.status == UnionPayStatus.ERROR ? 0 : 8);
        T t = unionPayResource.data;
        if (t != 0) {
            this.d.setNewData((List) t);
        }
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment
    public int getContentLayout() {
        return R.layout.wl_fragment_support_bank;
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment
    public Class<SupportBankViewModel> getViewModelClass() {
        return SupportBankViewModel.class;
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment
    public void initView(View view) {
        this.c = (RecyclerView) view.findViewById(R.id.support_bank_list);
        this.e = view.findViewById(R.id.error_view);
        view.findViewById(R.id.wl_load_failure_retry).setOnClickListener(new View.OnClickListener() { // from class: ki7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.e(view2);
            }
        });
        d();
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment
    public void observeViewModel() {
        ((SupportBankViewModel) this.a).mSupportBankData.observe(this, new Observer() { // from class: li7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.f((UnionPayResource) obj);
            }
        });
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment
    public String tag() {
        return "UnionPay-SupportUnionPayBankFragment";
    }
}
