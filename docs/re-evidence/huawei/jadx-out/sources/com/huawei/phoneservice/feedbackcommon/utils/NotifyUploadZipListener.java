package com.huawei.phoneservice.feedbackcommon.utils;

import com.huawei.phoneservice.feedbackcommon.entity.FeedbackZipBean;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public interface NotifyUploadZipListener {
    void notifyUpload(List<FeedbackZipBean> list, boolean z);

    void notifyUploadAgain(long j);
}
