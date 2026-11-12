package com.huami.device.core.sync.api.io;

import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.text.ttml.b;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/huami/device/core/sync/api/io/ReadApi;", "Param", "Data", "", b.r, "read", "(Ljava/lang/Object;)Ljava/lang/Object;", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public interface ReadApi<Param, Data> {
    @WorkerThread
    @Nullable
    Data read(Param p);
}
