package com.unionpay.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelProvider;
import com.huami.tools.log.HMLog;
import com.unionpay.entity.UnionPayResource;
import com.unionpay.tsm.TsmDialogHelper;
import com.unionpay.util.UnionPayUtil;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BaseUnionPayFragment<T extends ViewModel> extends Fragment {
    public T a;
    public TsmDialogHelper b;

    public void a(UnionPayResource<?> unionPayResource, String str) {
        String strTag = tag();
        StringBuilder sb = new StringBuilder();
        sb.append("Call <");
        sb.append(str);
        sb.append(">, Success: ");
        sb.append(unionPayResource != null && unionPayResource.isSuccessful());
        sb.append(", Result: ");
        sb.append(UnionPayUtil.resourceToString(unionPayResource));
        HMLog.i(strTag, sb.toString(), new Object[0]);
    }

    @LayoutRes
    public abstract int getContentLayout();

    public abstract Class<T> getViewModelClass();

    public abstract void initView(View view);

    public abstract void observeViewModel();

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(getContentLayout(), viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.b = new TsmDialogHelper(getActivity());
        this.a = (T) new ViewModelProvider(this).get(getViewModelClass());
        initView(view);
        observeViewModel();
    }

    public abstract String tag();
}
