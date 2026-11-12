package com.huawei.ui.main.stories.soical;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.h5pro.core.H5ProBridgeManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.knit.section.view.CustomH5ProWebview;
import com.huawei.health.operationbundle.R;
import com.huawei.ui.commonui.base.BaseFragment;
import defpackage.ddv;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class MemberCenterH5Fragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomH5ProWebview f28854a;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.b("MemberCenterH5Fragment", "MemberCenterH5Fragment onCreateView");
        ddv.b().initH5Pro();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_member_center_h5, viewGroup, false);
        this.f28854a = (CustomH5ProWebview) viewInflate.findViewById(R.id.h5_webview);
        d();
        return viewInflate;
    }

    private void d() {
        LogUtil.b("MemberCenterH5Fragment", "MemberCenterH5Fragment loadH5Page");
        final String str = "#/VipTabPage";
        HandlerExecutor.b(new Runnable() { // from class: wni
            @Override // java.lang.Runnable
            public final void run() {
                this.f52231b.a(str);
            }
        });
        this.f28854a.getInstance().setIsEnableOnResumeCallback(true);
    }

    public /* synthetic */ void a(String str) {
        ddv.b().loadEmbeddedH5(this.f28854a, "com.huawei.health.h5.vip", new H5ProLaunchOption.Builder().addPath(str));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f28854a != null) {
            H5ProBridgeManager.getInstance().notifyActivityResult(this.f28854a.getInstance(), i, i2, intent);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LogUtil.b("MemberCenterH5Fragment", "onConfigurationChanged onResume");
        this.f28854a.onResume();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LogUtil.b("MemberCenterH5Fragment", "MemberCenterH5Fragment onResume");
        this.f28854a.onResume();
    }
}
