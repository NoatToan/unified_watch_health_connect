package com.huawei.hwarkuix;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hwarkuix.oHBrigdePlugin.load.IPluginLoad;
import com.huawei.hwarkuix.oHBrigdePlugin.load.PluginLoadFactory;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lsk;
import ohos.stage.ability.adapter.StageFragment;

/* JADX INFO: loaded from: classes.dex */
public class EntryAbilityFragment extends StageFragment {
    private static final int ILLEGAL = -1;
    private static final String INSTANCE_NAME = "com.huawei.hmos.health:arkuix:ArkuixAbility:";
    private static final String TAG = "EntryAbilityFragment";
    private Context mBaseApplicationContext;
    private View mChildView;
    private FrameLayout mFrameLayout;
    private int mInstanceId;
    private int mLastInstanceId;
    private IPluginLoad mPluginLoad;
    private boolean reInjectBridge;

    @Override // ohos.stage.ability.adapter.StageFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.setInstanceName(INSTANCE_NAME);
        super.onCreate(bundle);
        this.mBaseApplicationContext = BaseApplication.getContext();
        LogUtil.a(TAG, "onCreate setInstanceName");
        initModules();
        int instanceId = getInstanceId();
        this.mInstanceId = instanceId;
        this.mLastInstanceId = instanceId;
    }

    private void initModules() {
        int i = getArguments() != null ? getArguments().getInt(ArkUIXConstants.ARKUIX_MODULE_TYPE_KEY, 0) : 0;
        LogUtil.a(TAG, "initModules moduleType:", Integer.valueOf(i));
        this.reInjectBridge = i == 4;
        IPluginLoad iPluginLoadGeneratedPluginLoad = PluginLoadFactory.generatedPluginLoad(i);
        this.mPluginLoad = iPluginLoadGeneratedPluginLoad;
        if (iPluginLoadGeneratedPluginLoad == null) {
            LogUtil.j(TAG, "initModules pluginLoad == null");
        } else {
            iPluginLoadGeneratedPluginLoad.loadPlugin(this.mBaseApplicationContext, getBridgeManager(), this.reInjectBridge);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LogUtil.a(TAG, "onViewCreated");
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            this.mFrameLayout = frameLayout;
            this.mChildView = frameLayout.getChildAt(0);
        }
        if (getParentFragment() != null) {
            boolean userVisibleHint = getParentFragment().getUserVisibleHint();
            LogUtil.a(TAG, "isParentVisibleToUser:", Boolean.valueOf(userVisibleHint));
            setUserVisibleHint(userVisibleHint);
            return;
        }
        setUserVisibleHint(false);
    }

    @Override // ohos.stage.ability.adapter.StageFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        if (this.mFrameLayout == null) {
            return;
        }
        super.onHiddenChanged(z);
    }

    @Override // ohos.stage.ability.adapter.StageFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LogUtil.a(TAG, "onStart:");
        super.onResume();
    }

    @Override // ohos.stage.ability.adapter.StageFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        LogUtil.a(TAG, "setUserVisibleHint:", Boolean.valueOf(z));
        FrameLayout frameLayout = this.mFrameLayout;
        if (frameLayout == null) {
            return;
        }
        if (z) {
            if (frameLayout.getChildCount() > 0) {
                this.mFrameLayout.removeAllViews();
            }
            this.mFrameLayout.addView(this.mChildView);
            return;
        }
        frameLayout.removeAllViews();
    }

    @Override // ohos.stage.ability.adapter.StageFragment, androidx.fragment.app.Fragment
    public void onResume() {
        LogUtil.a(TAG, "onResume mInstanceId:", Integer.valueOf(this.mInstanceId), " mLastInstanceId:", Integer.valueOf(this.mLastInstanceId));
        super.onResume();
    }

    private int getInstanceId() {
        String instanceName = getInstanceName();
        if (TextUtils.isEmpty(instanceName)) {
            return -1;
        }
        String[] strArrSplit = instanceName.split(":");
        int iA = lsk.a(strArrSplit[strArrSplit.length - 1], 10);
        if (iA > 0) {
            return iA;
        }
        return -1;
    }

    @Override // ohos.stage.ability.adapter.StageFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        IPluginLoad iPluginLoad = this.mPluginLoad;
        if (iPluginLoad != null) {
            iPluginLoad.onDestroy();
        }
    }
}
