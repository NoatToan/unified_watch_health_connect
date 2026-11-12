package com.huawei.hianalytics.framework.data;

/* JADX INFO: loaded from: classes3.dex */
public interface IAesKeyGetter {
    WorkKeyHandler.WorkKeyBean getWorkKeyBeanFromDisk();

    void saveWorkKeyBeanToDisk(WorkKeyHandler.WorkKeyBean workKeyBean);
}
