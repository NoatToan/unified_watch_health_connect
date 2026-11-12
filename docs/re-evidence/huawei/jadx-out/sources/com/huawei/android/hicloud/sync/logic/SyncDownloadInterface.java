package com.huawei.android.hicloud.sync.logic;

import com.huawei.android.hicloud.sync.service.aidl.FileDownloadProgress;
import com.huawei.android.hicloud.sync.service.aidl.UnstructData;
import defpackage.bcp;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public interface SyncDownloadInterface {
    void onDownloadFileAbort(String str, String str2, UnstructData unstructData) throws bcp;

    void onDownloadFileFail(String str, String str2, UnstructData unstructData, int i) throws bcp;

    void onDownloadFileProgress(String str, String str2, FileDownloadProgress fileDownloadProgress) throws bcp;

    void onDownloadFileSuccess(String str, String str2, UnstructData unstructData) throws bcp;

    void onDownloadFilesComplete(String str, String str2, List<String> list, Map<Integer, List<String>> map, String str3) throws bcp;

    void onDownloadFilesError(String str, String str2, String str3, String str4) throws bcp;
}
