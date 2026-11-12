package com.facebook.appevents;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/facebook/appevents/FlushStatistics;", "", "", "a", LogUtil.I, "getNumEvents", "()I", "setNumEvents", "(I)V", "numEvents", "Lcom/facebook/appevents/FlushResult;", "b", "Lcom/facebook/appevents/FlushResult;", "getResult", "()Lcom/facebook/appevents/FlushResult;", "setResult", "(Lcom/facebook/appevents/FlushResult;)V", "result", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FlushStatistics {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int numEvents;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private FlushResult result = FlushResult.SUCCESS;

    public final int getNumEvents() {
        return this.numEvents;
    }

    @NotNull
    public final FlushResult getResult() {
        return this.result;
    }

    public final void setNumEvents(int i) {
        this.numEvents = i;
    }

    public final void setResult(@NotNull FlushResult flushResult) {
        this.result = flushResult;
    }
}
