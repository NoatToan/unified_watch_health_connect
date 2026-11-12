package com.miui.headset.api;

import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0011H\u0016J\"\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0014\u0010\n\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0003\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/miui/headset/api/RequestSyncImpl;", "K", "Lcom/miui/headset/api/RequestSync;", "key", "(Ljava/lang/Object;)V", "blockObj", "", "isBlocking", "", "()Z", "isCanceled", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "requestInvokeSync", "Lcom/miui/headset/api/RequestInvokeSync;", "blockInvoke", "", "id", "", "timeOutMillis", "", "resultId", "blockObjInvoke", BroadcastsKt.SILENT_PUSHING_CANCEL, "", "signal", "result", "signalObj", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RequestSyncImpl<K> implements RequestSync<K> {

    @Nullable
    private Object blockObj;
    private final K key;

    @NotNull
    private final RequestInvokeSync requestInvokeSync = new RequestInvokeSync();

    public RequestSyncImpl(K k2) {
        this.key = k2;
    }

    @Override // com.miui.headset.api.RequestSync
    public int blockInvoke(@NotNull String id, long timeOutMillis, int resultId) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.requestInvokeSync.blockInvoke(id, timeOutMillis, resultId);
    }

    @Override // com.miui.headset.api.RequestSync
    @Nullable
    public Object blockObjInvoke(@NotNull String id, long timeOutMillis) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.blockObj = null;
        if (RequestInvokeSync.blockInvoke$default(this.requestInvokeSync, id, timeOutMillis, 0, 4, null) == 100) {
            return this.blockObj;
        }
        return null;
    }

    @Override // com.miui.headset.api.RequestSync
    public void cancel() {
        this.requestInvokeSync.cancel();
    }

    @Override // com.miui.headset.api.RequestSync
    public K getKey() {
        return this.key;
    }

    @Override // com.miui.headset.api.RequestSync
    public boolean isBlocking() {
        return this.requestInvokeSync.isBlocking();
    }

    @Override // com.miui.headset.api.RequestSync
    public boolean isCanceled() {
        return this.requestInvokeSync.isCanceled();
    }

    @Override // com.miui.headset.api.RequestSync
    public void signal(@NotNull String id, int result) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.requestInvokeSync.signal(id, result);
    }

    @Override // com.miui.headset.api.RequestSync
    public void signalObj(@NotNull String id, int result, @Nullable Object signalObj) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.blockObj = signalObj;
        this.requestInvokeSync.signal(id, result);
    }
}
