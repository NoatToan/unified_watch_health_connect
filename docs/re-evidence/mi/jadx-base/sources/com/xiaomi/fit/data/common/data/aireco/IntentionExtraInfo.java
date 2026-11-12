package com.xiaomi.fit.data.common.data.aireco;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/data/common/data/aireco/IntentionExtraInfo;", "", "<init>", "()V", "expId", "", "getExpId", "()Ljava/lang/String;", "setExpId", "(Ljava/lang/String;)V", "traceId", "getTraceId", "setTraceId", "topicName", "getTopicName", "setTopicName", "domain", "getDomain", "setDomain", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntentionExtraInfo {

    @NotNull
    private String expId = "";

    @NotNull
    private String traceId = "";

    @NotNull
    private String topicName = "";

    @NotNull
    private String domain = "";

    @NotNull
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    public final String getExpId() {
        return this.expId;
    }

    @NotNull
    public final String getTopicName() {
        return this.topicName;
    }

    @NotNull
    public final String getTraceId() {
        return this.traceId;
    }

    public final void setDomain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.domain = str;
    }

    public final void setExpId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.expId = str;
    }

    public final void setTopicName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.topicName = str;
    }

    public final void setTraceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.traceId = str;
    }
}
