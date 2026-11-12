package com.huami.sleep.data.remote;

import kotlin.Metadata;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/huami/sleep/data/remote/CloudApiConstant;", "", "", "POST_TYPE", "Ljava/lang/String;", HTTP.SID, "TONALITY_RATING_URL", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class CloudApiConstant {

    @NotNull
    public static final CloudApiConstant INSTANCE = new CloudApiConstant();

    @NotNull
    public static final String POST_TYPE = "application/json; charset=utf-8";

    @NotNull
    public static final String SID = "sid";

    @NotNull
    public static final String TONALITY_RATING_URL = "survey/result/{sid}";

    private CloudApiConstant() {
    }
}
