package com.xiaomi.yrn.view.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.react.a;
import com.facebook.react.devsupport.DevSupportManagerImpl;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.a1d;
import defpackage.b1d;
import defpackage.bzr;
import defpackage.fv5;
import defpackage.iur;
import defpackage.jzr;
import defpackage.prh;
import defpackage.sk1;
import defpackage.tsi;
import defpackage.vwr;
import defpackage.zvi;
import defpackage.zxr;

/* JADX INFO: loaded from: classes2.dex */
public class YRNFragment extends Fragment {
    protected String mAppName;
    protected Bundle mBundle;
    protected String mModule;
    protected YRNRootView mRootView;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$0(View view) {
        YRNRootView yRNRootView = this.mRootView;
        if (yRNRootView != null) {
            yRNRootView.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$1(View view) {
        a reactInstanceManager = this.mRootView.getReactInstanceManager();
        if (reactInstanceManager != null) {
            if (reactInstanceManager.D() instanceof DevSupportManagerImpl) {
                reactInstanceManager.i0();
            } else {
                bzr.k("请确保在RN调试页面设置模块IP参数！");
            }
        }
    }

    public YRNRootView createReactRootView() {
        if (getActivity() != null) {
            return new YRNRootView(getActivity(), this.mAppName, this.mModule, this.mBundle);
        }
        zxr.g("YRN_YRNV3_SDK", "YRNFragment.createReactRootView:getActivity() is null");
        return null;
    }

    public void handleNoExtendBaseActivity() {
        String str = "";
        if (getActivity() instanceof b1d) {
            a1d activityDelegate = ((b1d) getActivity()).getActivityDelegate();
            if (activityDelegate != null) {
                activityDelegate.a(this.mAppName, this.mModule);
            } else {
                str = "Activity must create IYRNActivityDelegate,or react native will meet error\n";
            }
        } else {
            str = "Activity must implements IYRNActivityDelegateProvider,or animation will meet error\n";
        }
        if (!(getActivity() instanceof fv5)) {
            str = str + "Activity must implements DefaultHardwareBackBtnHandler,or back button will meet error\n";
        }
        if (!(getActivity() instanceof prh)) {
            str = str + "Activity must implements PermissionAwareActivity,or permission will meet error\n";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zxr.b("YRN_YRNV3_SDK", str);
        if (vwr.g().k()) {
            sk1.e(str);
        }
    }

    public boolean onBackPressed() {
        YRNRootView yRNRootView = this.mRootView;
        return yRNRootView != null && yRNRootView.x();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        YRNRootView yRNRootView;
        zxr.a("YRN_YRNV3_SDK", "YRNFragment.onCreateView");
        Bundle arguments = getArguments();
        this.mBundle = arguments;
        sk1.d(arguments, "bundle can not be null!");
        this.mAppName = this.mBundle.getString("appName");
        String string = this.mBundle.getString(RnReportConst.ApiReport.PARAM_MODULE);
        this.mModule = string;
        iur.b(this.mAppName, string);
        handleNoExtendBaseActivity();
        this.mRootView = createReactRootView();
        if (jzr.e().d() == null || !jzr.e().d().c(this.mAppName) || (yRNRootView = this.mRootView) == null) {
            return this.mRootView;
        }
        ViewGroup viewGroup2 = (ViewGroup) yRNRootView.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.mRootView);
        }
        View viewInflate = layoutInflater.inflate(zvi.f41716a, viewGroup, false);
        ((FrameLayout) viewInflate.findViewById(tsi.f34997b)).addView(this.mRootView);
        View viewFindViewById = viewInflate.findViewById(tsi.f);
        viewFindViewById.setVisibility(0);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: ywr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f40650a.lambda$onCreateView$0(view);
            }
        });
        View viewFindViewById2 = viewInflate.findViewById(tsi.e);
        viewFindViewById2.setVisibility(0);
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: zwr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f41759a.lambda$onCreateView$1(view);
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        YRNRootView yRNRootView = this.mRootView;
        if (yRNRootView != null) {
            yRNRootView.z();
            this.mRootView = null;
        }
    }
}
