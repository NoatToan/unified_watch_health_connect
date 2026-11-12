package com.huawei.openalliance.ad.inter.data;

/* JADX INFO: loaded from: classes12.dex */
public class JSFeedbackInfo extends FeedbackInfo {
    private String idStr;

    public JSFeedbackInfo(FeedbackInfo feedbackInfo) {
        if (feedbackInfo != null) {
            a(feedbackInfo.a());
            a(feedbackInfo.getType());
            a(feedbackInfo.getLabel());
            this.idStr = String.valueOf(feedbackInfo.a());
        }
    }
}
