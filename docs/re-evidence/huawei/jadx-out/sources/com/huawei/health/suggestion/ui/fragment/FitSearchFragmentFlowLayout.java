package com.huawei.health.suggestion.ui.fragment;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.view.FlowLayout;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes31.dex */
public class FitSearchFragmentFlowLayout extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FlowLayout f9538c;
    private FowAdapter d;

    public interface FowAdapter {
        LinkedList<String> getShowData();

        void saveShowData(String str);
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.sug_fragment_fit_search_flow, viewGroup, false);
        e(viewInflate);
        return viewInflate;
    }

    private void e(View view) {
        this.f9538c = (FlowLayout) view.findViewById(R.id.search_flowlayout);
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void a(FlowLayout.OnTextClickListener onTextClickListener) {
        this.f9538c.setTextOnClickListener(onTextClickListener);
    }

    public void c(FowAdapter fowAdapter) {
        if (fowAdapter == null) {
            return;
        }
        this.d = fowAdapter;
        this.f9538c.d(getActivity(), fowAdapter.getShowData());
    }

    public void c(Fragment fragment) {
        if (getActivity() == null || !isAdded()) {
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = fragment.getFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.hide(this);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public void b(Fragment fragment) {
        if (this.d != null && getActivity() != null) {
            this.f9538c.d(getActivity(), this.d.getShowData());
        }
        if (getActivity() == null || !isAdded()) {
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = fragment.getFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.show(this);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public void e(String str) {
        FowAdapter fowAdapter = this.d;
        if (fowAdapter != null) {
            fowAdapter.saveShowData(str);
        }
    }
}
