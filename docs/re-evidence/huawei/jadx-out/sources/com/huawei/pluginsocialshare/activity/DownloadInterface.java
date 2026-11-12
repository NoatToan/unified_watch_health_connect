package com.huawei.pluginsocialshare.activity;

import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import defpackage.gyg;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface DownloadInterface {
    void notifyBackgroudChanged(gyg gygVar);

    void notifyBackgroudFail();

    void notifyDownloadDataFail();

    void notifyShareDataChanged(gyg gygVar);

    void refreshDataMark(List<ShareDataInfo> list);

    void refreshShareLayoutNoRecommend();

    void showDownloadError();

    void updateAllFragment(boolean z);
}
