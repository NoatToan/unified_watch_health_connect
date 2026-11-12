package com.huami.ai.speech.xiaoai.event;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/ai/speech/xiaoai/event/RecognizerEventIdKeeper;", "", "", "a", "Ljava/lang/String;", "getStartRequestId", "()Ljava/lang/String;", "setStartRequestId", "(Ljava/lang/String;)V", "startRequestId", "<init>", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class RecognizerEventIdKeeper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private String startRequestId;

    public RecognizerEventIdKeeper(@NotNull String str) {
        this.startRequestId = str;
    }

    @NotNull
    public final String getStartRequestId() {
        return this.startRequestId;
    }

    public final void setStartRequestId(@NotNull String str) {
        this.startRequestId = str;
    }
}
