package com.miui.headset.api;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00062\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0005R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/miui/headset/api/BinderRequestTracker;", "", "()V", "remoteCallSyncs", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/miui/headset/api/RequestSync;", "obtainRequest", "requestId", "remove", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Kit.kt\ncom/miui/headset/api/BinderRequestTracker\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n73#2,2:224\n1#3:226\n*S KotlinDebug\n*F\n+ 1 Kit.kt\ncom/miui/headset/api/BinderRequestTracker\n*L\n211#1:224,2\n211#1:226\n*E\n"})
public final class BinderRequestTracker {

    @NotNull
    private final ConcurrentHashMap<Long, RequestSync<Long>> remoteCallSyncs = new ConcurrentHashMap<>();

    @NotNull
    public final RequestSync<Long> obtainRequest(long requestId) {
        RequestSync<Long> requestSync;
        RequestSync<Long> requestSyncPutIfAbsent;
        synchronized (this.remoteCallSyncs) {
            try {
                ConcurrentHashMap<Long, RequestSync<Long>> concurrentHashMap = this.remoteCallSyncs;
                Long lValueOf = Long.valueOf(requestId);
                RequestSync<Long> requestSyncImpl = concurrentHashMap.get(lValueOf);
                if (requestSyncImpl == null && (requestSyncPutIfAbsent = concurrentHashMap.putIfAbsent(lValueOf, (requestSyncImpl = new RequestSyncImpl<>(Long.valueOf(requestId))))) != null) {
                    requestSyncImpl = requestSyncPutIfAbsent;
                }
                Intrinsics.checkNotNullExpressionValue(requestSyncImpl, "remoteCallSyncs.getOrPut…uestSyncImpl(requestId) }");
                requestSync = requestSyncImpl;
            } catch (Throwable th) {
                throw th;
            }
        }
        return requestSync;
    }

    public final void remove(long requestId) {
        synchronized (this.remoteCallSyncs) {
            this.remoteCallSyncs.remove(Long.valueOf(requestId));
        }
    }
}
