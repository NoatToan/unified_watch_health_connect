package com.huami.sky.lib.utils;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/huami/sky/lib/utils/AnalyticsConstant;", "", "", "EVENT_ID_UPLOAD_FAILURE", "Ljava/lang/String;", "EXTRA_UPLOAD_TYPE", "", "EXTRA_UPLOAD_TYPE_HR", LogUtil.I, "EXTRA_UPLOAD_TYPE_RR", "EXTRA_UPLOAD_TYPE_ACTION", "<init>", "()V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class AnalyticsConstant {

    @NotNull
    public static final String EVENT_ID_UPLOAD_FAILURE = "AIMUSIC_NETWORK_ANOMALY";

    @NotNull
    public static final String EXTRA_UPLOAD_TYPE = "type";
    public static final int EXTRA_UPLOAD_TYPE_ACTION = 2;
    public static final int EXTRA_UPLOAD_TYPE_HR = 0;
    public static final int EXTRA_UPLOAD_TYPE_RR = 1;

    @NotNull
    public static final AnalyticsConstant INSTANCE = new AnalyticsConstant();

    private AnalyticsConstant() {
    }
}
