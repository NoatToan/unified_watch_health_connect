package com.miui.headset.api;

import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH&J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0012\u001a\u00020\u0013H&J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000bH&J$\u0010\u0016\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0012\u0010\u0007\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/miui/headset/api/RequestSync;", "K", "", "isBlocking", "", "()Z", "isCanceled", "key", "getKey", "()Ljava/lang/Object;", "blockInvoke", "", "id", "", "timeOutMillis", "", "resultId", "blockObjInvoke", BroadcastsKt.SILENT_PUSHING_CANCEL, "", "signal", "result", "signalObj", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface RequestSync<K> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ int blockInvoke$default(RequestSync requestSync, String str, long j, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blockInvoke");
            }
            if ((i2 & 4) != 0) {
                i = 202;
            }
            return requestSync.blockInvoke(str, j, i);
        }

        public static /* synthetic */ void signalObj$default(RequestSync requestSync, String str, int i, Object obj, int i2, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signalObj");
            }
            if ((i2 & 4) != 0) {
                obj = null;
            }
            requestSync.signalObj(str, i, obj);
        }
    }

    int blockInvoke(@NotNull String id, long timeOutMillis, int resultId);

    @Nullable
    Object blockObjInvoke(@NotNull String id, long timeOutMillis);

    void cancel();

    K getKey();

    boolean isBlocking();

    boolean isCanceled();

    void signal(@NotNull String id, int result);

    void signalObj(@NotNull String id, int result, @Nullable Object signalObj);
}
