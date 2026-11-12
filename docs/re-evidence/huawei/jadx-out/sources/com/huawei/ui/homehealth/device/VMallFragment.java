package com.huawei.ui.homehealth.device;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.view.VmallWebHelper;
import defpackage.rvr;

/* JADX INFO: loaded from: classes17.dex */
public class VMallFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f25234a;
    private VmallWebHelper d;
    private boolean e = false;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewD = d(layoutInflater, viewGroup, 3);
        this.f25234a = viewD;
        return viewD;
    }

    private View d(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        try {
            return layoutInflater.inflate(R.layout.fragment_vmall, viewGroup, false);
        } catch (IllegalStateException e) {
            String message = e.getMessage();
            LogUtil.j("VMallFragment", "inflateView:", message, ":", Integer.valueOf(i));
            if (TextUtils.isEmpty(message) || !message.contains("AwContents must be created if we are not posting") || i < 0) {
                return null;
            }
            return d(layoutInflater, viewGroup, i - 1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        c();
    }

    private void c() {
        if (!rvr.e() || this.f25234a == null) {
            return;
        }
        VmallWebHelper vmallWebHelper = new VmallWebHelper(getContext(), this.f25234a);
        this.d = vmallWebHelper;
        vmallWebHelper.b();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        VmallWebHelper vmallWebHelper = this.d;
        if (vmallWebHelper != null) {
            vmallWebHelper.f();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        VmallWebHelper vmallWebHelper;
        super.setUserVisibleHint(z);
        LogUtil.j("VMallFragment", "setUserVisibleHint:", Boolean.valueOf(z));
        this.e = z;
        if (!z || (vmallWebHelper = this.d) == null) {
            return;
        }
        vmallWebHelper.c();
        this.d.e();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        VmallWebHelper vmallWebHelper;
        super.onResume();
        LogUtil.j("VMallFragment", "VMallFragment onResume:");
        if (!this.e || (vmallWebHelper = this.d) == null) {
            return;
        }
        vmallWebHelper.c();
        this.d.e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        VmallWebHelper vmallWebHelper = this.d;
        if (vmallWebHelper != null) {
            vmallWebHelper.a();
        }
    }
}
