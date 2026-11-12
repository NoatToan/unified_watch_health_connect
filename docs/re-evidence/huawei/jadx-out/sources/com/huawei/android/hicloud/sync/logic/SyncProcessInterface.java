package com.huawei.android.hicloud.sync.logic;

import com.huawei.android.hicloud.sync.service.aidl.LocalId;
import com.huawei.android.hicloud.sync.service.aidl.SyncData;
import com.huawei.android.hicloud.sync.service.aidl.UnstructData;
import defpackage.bbz;
import defpackage.bcd;
import defpackage.bcf;
import defpackage.bcp;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public interface SyncProcessInterface {
    @Deprecated
    bbz addCompare(String str, List<String> list, SyncData syncData) throws bcp;

    @Deprecated
    bbz conflictCompare(String str, String str2, SyncData syncData) throws bcp;

    List<bcf> dataQueryByID(String str, List<String> list) throws bcp;

    List<String> deleteData(String str, List<String> list) throws bcp;

    List<Object> getUpdateDataResults() throws bcp;

    void hiCloudVersionTooLow(int i);

    void onDataSyncEnd(String str, int i) throws bcp;

    void onDownloadSyncStart(String str, Map<String, Integer> map) throws bcp;

    void onGetExceedLimitsResult(String str, Map<String, Long> map) throws bcp;

    void onGetStructDataCountResult(String str, Map<String, Integer> map) throws bcp;

    void onSyncEnd();

    void onUnstructDataDownloadEnd(String str, List<UnstructData> list, List<UnstructData> list2, Map<Integer, List<String>> map, boolean z, int i) throws bcp;

    void onUploadSyncStart(String str) throws bcp;

    @Deprecated
    List<bbz> processLocalModifyCloudDelete(String str, List<String> list) throws bcp;

    List<LocalId> queryLocalIds(String str, int i) throws bcp;

    List<bcd> updateStructData(String str, List<SyncData> list, List<SyncData> list2) throws bcp;

    void updateSyncResult(String str, List<SyncData> list, List<SyncData> list2, List<String> list3, Map<Integer, List<String>> map) throws bcp;
}
