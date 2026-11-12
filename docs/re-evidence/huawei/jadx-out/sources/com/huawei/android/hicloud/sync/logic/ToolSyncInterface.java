package com.huawei.android.hicloud.sync.logic;

import com.huawei.android.hicloud.sync.service.aidl.UnstructData;
import defpackage.bcp;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public interface ToolSyncInterface {
    void onGetExceedLimitsResult(String str, Map<String, Long> map) throws bcp;

    void onUnstructDataDownloadEnd(String str, String str2, List<UnstructData> list, List<UnstructData> list2, Map<Integer, List<String>> map, int i) throws bcp;
}
