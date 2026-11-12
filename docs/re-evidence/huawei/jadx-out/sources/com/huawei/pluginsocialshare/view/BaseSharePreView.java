package com.huawei.pluginsocialshare.view;

import android.graphics.Bitmap;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.pluginsocialshare.shareconfig.bean.PageViewModel;
import com.huawei.pluginsocialshare.view.template.BaseShareTemplate;
import defpackage.pmw;
import defpackage.pnb;
import defpackage.pnd;

/* JADX INFO: loaded from: classes42.dex */
public abstract class BaseSharePreView {
    public abstract FragmentActivity getActivity();

    public abstract View getShareContentView();

    public abstract BaseShareTemplate.VideoInfoManager getVideoInfoManager();

    public abstract View getView();

    public abstract void hidePage(int i);

    public abstract void initContentView();

    public abstract void playerPause();

    public abstract void playerRelease();

    public abstract void playerStart(int i);

    public abstract void refreshBackground(ShareDataInfo shareDataInfo);

    public abstract void refreshData(pmw pmwVar);

    public abstract void refreshStickerConfig(pnb pnbVar);

    public abstract void refreshViewHeight(pnd pndVar);

    public abstract void setActivity(FragmentActivity fragmentActivity);

    public abstract void setLogoInfo(boolean z);

    public abstract void setPageId(int i);

    public abstract void setPageViewModel(PageViewModel pageViewModel);

    public abstract void setUserInfo(Bitmap bitmap, String str);

    public abstract void showTipInfo(int i);
}
