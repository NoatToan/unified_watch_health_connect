package com.huawei.skinner.base;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.LayoutInflaterCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultOwner;
import com.huawei.skinner.internal.IDynamicNewView;
import defpackage.pye;
import defpackage.pzd;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class SkinBaseFragment extends Fragment implements IDynamicNewView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23170a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IDynamicNewView f23171b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IDynamicNewView) {
            this.f23171b = (IDynamicNewView) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f23170a) {
            return;
        }
        Fragment parentFragment = getParentFragment();
        boolean z = false;
        boolean z2 = parentFragment == null || !(parentFragment instanceof SkinBaseFragment) || ((SkinBaseFragment) parentFragment).f23170a;
        FragmentActivity activity = getActivity();
        boolean zIsSkinEnable = activity instanceof SkinBaseFragmentActivity ? ((SkinBaseFragmentActivity) activity).isSkinEnable() : true;
        boolean z3 = parentFragment != null && z2;
        if (parentFragment == null && zIsSkinEnable) {
            z = true;
        }
        if (z3 || z) {
            view.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.white, getActivity().getTheme()));
        }
    }

    @Override // com.huawei.skinner.internal.IDynamicNewView
    public void dynamicAddSkinableView(View view, String str, int i) {
        IDynamicNewView iDynamicNewView;
        if (!this.f23170a || (iDynamicNewView = this.f23171b) == null) {
            return;
        }
        iDynamicNewView.dynamicAddSkinableView(view, str, i);
    }

    @Override // com.huawei.skinner.internal.IDynamicNewView
    public void dynamicAddSkinableView(View view, List<pye> list) {
        IDynamicNewView iDynamicNewView;
        if (!this.f23170a || (iDynamicNewView = this.f23171b) == null) {
            return;
        }
        iDynamicNewView.dynamicAddSkinableView(view, list);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        if (!c()) {
            FragmentResultOwner childFragmentManager = getChildFragmentManager();
            if (childFragmentManager instanceof LayoutInflater.Factory2) {
                LayoutInflater layoutInflaterCloneInContext = getActivity().getLayoutInflater().cloneInContext(getContext());
                pzd.b(LayoutInflater.class, layoutInflaterCloneInContext, "mFactory", null);
                pzd.b(LayoutInflater.class, layoutInflaterCloneInContext, "mFactory2", null);
                LayoutInflaterCompat.setFactory2(layoutInflaterCloneInContext, (LayoutInflater.Factory2) childFragmentManager);
                return layoutInflaterCloneInContext;
            }
        }
        return super.onGetLayoutInflater(bundle);
    }

    public boolean c() {
        return this.f23170a;
    }
}
