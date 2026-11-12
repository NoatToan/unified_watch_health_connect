package com.huawei.pluginsocialshare.view;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.pluginsocialshare.activity.SportDownloadInterface;
import defpackage.gyf;

/* JADX INFO: loaded from: classes42.dex */
public class BaseShareBottomView extends BaseBottomView implements SportDownloadInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f22574b;
    protected View e;

    @Override // com.huawei.pluginsocialshare.activity.SportDownloadInterface
    public void downloadedAllShareDataCallback(gyf gyfVar) {
    }

    @Override // com.huawei.pluginsocialshare.activity.SportDownloadInterface
    public void downloadedSingleCallback(ShareDataInfo shareDataInfo) {
    }

    @Override // com.huawei.pluginsocialshare.view.BaseBottomView
    public void onActivityResult(int i, Intent intent) {
    }

    @Override // com.huawei.pluginsocialshare.view.BaseBottomView
    public void onDeleteSticker(int i) {
    }

    @Override // com.huawei.pluginsocialshare.view.BaseBottomView
    public void onTemplateSelected(int i) {
    }

    public BaseShareBottomView(Context context) {
        this.f22574b = context;
    }

    @Override // com.huawei.pluginsocialshare.view.BaseBottomView
    public View getRootView() {
        return this.e;
    }
}
