package com.huawei.health.knit.data;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.lmf;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class BaseKnitDataProvider<T> implements KnitDataProvider<T> {
    public static final int INVALID_GROUP_ID = -1;
    private static final String TAG = "BaseKnitDataProvider";
    private boolean mIsActive = true;
    private int mGroupId = -1;
    private Bundle mExtra = new Bundle();

    @Override // com.huawei.health.knit.data.KnitDataProvider
    public List<KnitDataProvider<T>> getDataProviderList() {
        return null;
    }

    @Override // com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
    }

    @Override // com.huawei.health.knit.data.KnitDataProvider
    public void loadDataLite(Context context) {
    }

    @Override // com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
    }

    @Override // com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap<String, Object> map, T t) {
    }

    @Override // com.huawei.health.knit.data.KnitDataProvider
    public void updateGpsSignal(int i) {
    }

    @Override // com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return this.mIsActive;
    }

    @Override // com.huawei.health.knit.data.KnitDataProvider
    public void setIsActive(boolean z) {
        this.mIsActive = z;
    }

    @Override // com.huawei.health.knit.data.KnitDataProvider
    public void setGroupId(int i) {
        this.mGroupId = i;
    }

    @Override // com.huawei.health.knit.data.KnitDataProvider
    public int getGroupId() {
        return this.mGroupId;
    }

    @Override // com.huawei.health.knit.data.KnitDataProvider
    public void setExtra(Bundle bundle) {
        if (this.mExtra == null || bundle == null || bundle.isEmpty()) {
            return;
        }
        this.mExtra.putAll(bundle);
    }

    @Override // com.huawei.health.knit.data.KnitDataProvider
    public Bundle getExtra() {
        return this.mExtra;
    }

    protected String getLogTag() {
        return TAG;
    }

    @Override // com.huawei.health.knit.data.IKnitLifeCycle
    public void onCreate() {
        LogUtil.a("BaseKnitDataProvider_" + getLogTag(), "onCreate");
    }

    @Override // com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        LogUtil.a("BaseKnitDataProvider_" + getLogTag(), BaseDialog.LIFE_CYCLE_ON_RESUME);
    }

    @Override // com.huawei.health.knit.data.IKnitLifeCycle
    public void onPause() {
        LogUtil.a("BaseKnitDataProvider_" + getLogTag(), BaseDialog.LIFE_CYCLE_ON_PAUSE);
    }

    @Override // com.huawei.health.knit.data.IKnitLifeCycle
    public void onStop() {
        LogUtil.a("BaseKnitDataProvider_" + getLogTag(), "onStop");
    }

    @Override // com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        LogUtil.a("BaseKnitDataProvider_" + getLogTag(), "onDestroy");
    }

    @Override // com.huawei.health.knit.data.IKnitLifeCycle
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a("BaseKnitDataProvider_" + getLogTag(), "onActivityResult");
    }

    @Override // com.huawei.health.knit.data.IKnitLifeCycle
    public void setUserVisibleHint(boolean z) {
        LogUtil.a("BaseKnitDataProvider_" + getLogTag(), "setUserVisibleHint");
    }

    @Override // com.huawei.health.knit.data.IKnitLifeCycle
    public void onConfigurationChanged() {
        LogUtil.a("BaseKnitDataProvider_" + getLogTag(), "onConfigurationChanged");
    }

    @Override // com.huawei.health.knit.data.IKnitLifeCycle
    public void onMultiWindowModeChanged() {
        LogUtil.a("BaseKnitDataProvider_" + getLogTag(), "onMultiWindowModeChanged");
    }

    public static class c implements OnClickSectionListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f7210b;

        public c() {
        }

        public c(String str) {
            this.f7210b = str;
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(String str) {
            b();
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i) {
            b();
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i, int i2) {
            b();
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i, String str) {
            b();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b();
        }

        private void b() {
            if (TextUtils.isEmpty(this.f7210b)) {
                return;
            }
            HashMap map = new HashMap();
            map.put("click", 1);
            lmf.d().c(BaseApplication.getContext(), this.f7210b, map, 0);
        }
    }
}
