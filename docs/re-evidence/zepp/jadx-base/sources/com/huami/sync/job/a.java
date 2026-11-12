package com.huami.sync.job;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/sync/job/a;", "Lcom/huami/sync/job/Logger;", "", "message", "", "log", "<init>", "()V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
final class a implements Logger {
    @Override // com.huami.sync.job.Logger
    public void log(@Nullable String message) {
        System.out.println((Object) Intrinsics.stringPlus("Job: ", message));
    }
}
