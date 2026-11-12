package com.xiaomi.yrn.controller.ui;

import android.content.res.Configuration;
import android.os.Bundle;
import com.xiaomi.yrn.view.ui.YRNFragment;
import com.xiaomi.yrn.view.ui.YRNRootView;
import defpackage.hvr;
import defpackage.i1d;
import defpackage.ivr;
import defpackage.iz6;
import defpackage.lwr;
import defpackage.tvr;
import defpackage.vvr;

/* JADX INFO: loaded from: classes2.dex */
public class YRNCFragment extends YRNFragment {
    protected Configuration mConfiguration;
    protected boolean mNeedMultiResize;
    protected String mUrl;

    private boolean checkRNWidthChanged() {
        return (getContext() != null && Math.abs(hvr.h(getContext()) - getContext().getResources().getDisplayMetrics().widthPixels) > 10) || Math.abs(iz6.e().widthPixels - getContext().getResources().getDisplayMetrics().widthPixels) > 10;
    }

    private synchronized void reSizePage() {
        if (getContext() != null && this.mRootView != null && checkRNWidthChanged()) {
            this.mRootView.w();
            this.mNeedMultiResize = false;
        }
    }

    @Override // com.xiaomi.yrn.view.ui.YRNFragment
    public YRNRootView createReactRootView() {
        return new YRNCRootView(requireActivity(), this.mAppName, this.mModule, this.mBundle);
    }

    public YRNCRootView getRootView() {
        YRNRootView yRNRootView = this.mRootView;
        if (yRNRootView instanceof YRNCRootView) {
            return (YRNCRootView) yRNRootView;
        }
        return null;
    }

    @Override // com.xiaomi.yrn.view.ui.YRNFragment
    public void handleNoExtendBaseActivity() {
        i1d infoProvider = lwr.b().getMIYRNControllerInfoProvider();
        if (infoProvider == null || infoProvider.assertIfFragmentParentActivityNoExtendBase() == null || infoProvider.assertIfFragmentParentActivityNoExtendBase().booleanValue()) {
            super.handleNoExtendBaseActivity();
        }
    }

    @Override // com.xiaomi.yrn.view.ui.YRNFragment
    public boolean onBackPressed() {
        return super.onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hvr.a(configuration);
        ivr.b(getContext(), this.mAppName, this.mConfiguration, configuration, this.mUrl);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.mUrl = getArguments().getString("url");
        }
        if (getContext() != null) {
            this.mConfiguration = new Configuration(getContext().getResources().getConfiguration());
        }
    }

    @Override // com.xiaomi.yrn.view.ui.YRNFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (getRootView() != null) {
            getRootView().z();
            this.mRootView = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (getRootView() != null) {
            if (z) {
                getRootView().M();
            } else {
                getRootView().N();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        if (z) {
            this.mNeedMultiResize = true;
        } else {
            reSizePage();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (getRootView() != null) {
            getRootView().M();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        vvr.c(getActivity());
        if (getRootView() != null) {
            getRootView().N();
        }
        if (!this.mNeedMultiResize || getContext() == null) {
            return;
        }
        reSizePage();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (getActivity() != null) {
            tvr.a(getActivity().getWindow());
        }
        if (getRootView() != null) {
            getRootView().O();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (getRootView() != null) {
            getRootView().P();
        }
    }
}
