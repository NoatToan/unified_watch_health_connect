package com.huawei.pluginsocialshare.shareconfig.handler;

import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import defpackage.pmv;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public interface ShareDataHandlerInterface {
    void deleteData(pmv pmvVar, ShareDataInfo shareDataInfo);

    ShareDataInfo getShareDataById(int i);

    List<ShareDataInfo> getShareDataByIdList(List<Integer> list);

    void updateData(pmv pmvVar, ShareDataInfo shareDataInfo);

    void writeJson();
}
