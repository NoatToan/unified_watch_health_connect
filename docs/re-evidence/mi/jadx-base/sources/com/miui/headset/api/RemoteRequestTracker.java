package com.miui.headset.api;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ(\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u00072\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006R8\u0010\u0003\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/miui/headset/api/RemoteRequestTracker;", "", "()V", "remoteCallSyncs", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Pair;", "", "Lcom/miui/headset/api/RequestSync;", "tag", "cancelAll", "", "obtainRequest", "id", "action", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Kit.kt\ncom/miui/headset/api/RemoteRequestTracker\n+ 2 Kit.kt\ncom/miui/headset/api/KitKt\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,223:1\n24#2:224\n57#2:229\n33#2:230\n27#2:231\n58#2:232\n73#3,2:225\n1#4:227\n1855#5:228\n1856#5:233\n*S KotlinDebug\n*F\n+ 1 Kit.kt\ncom/miui/headset/api/RemoteRequestTracker\n*L\n182#1:224\n197#1:229\n197#1:230\n197#1:231\n197#1:232\n189#1:225,2\n189#1:227\n195#1:228\n195#1:233\n*E\n"})
public final class RemoteRequestTracker {

    @NotNull
    private final ConcurrentHashMap<Pair<String, String>, RequestSync<Pair<String, String>>> remoteCallSyncs;

    @NotNull
    private final String tag;

    public RemoteRequestTracker() {
        String simpleName = RemoteRequestTracker.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "this::class.java.simpleName");
        this.tag = simpleName;
        this.remoteCallSyncs = new ConcurrentHashMap<>();
    }

    public final void cancelAll() {
        synchronized (this.remoteCallSyncs) {
            try {
                Collection<RequestSync<Pair<String, String>>> collectionValues = this.remoteCallSyncs.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "remoteCallSyncs.values");
                Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    RequestSync requestSync = (RequestSync) it.next();
                    if (requestSync.isBlocking()) {
                        String str = this.tag;
                        StringBuilder sb = new StringBuilder();
                        sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                        sb.append(str);
                        sb.append(' ');
                        sb.append((Object) ("cancelAll, " + requestSync.getKey() + " canceled"));
                        requestSync.cancel();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NotNull
    public final RequestSync<Pair<String, String>> obtainRequest(@NotNull String id, @NotNull String action) {
        RequestSync<Pair<String, String>> requestSync;
        RequestSync<Pair<String, String>> requestSyncPutIfAbsent;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(action, "action");
        synchronized (this.remoteCallSyncs) {
            try {
                Pair<String, String> pair = new Pair<>(id, action);
                ConcurrentHashMap<Pair<String, String>, RequestSync<Pair<String, String>>> concurrentHashMap = this.remoteCallSyncs;
                RequestSync<Pair<String, String>> requestSyncImpl = concurrentHashMap.get(pair);
                if (requestSyncImpl == null && (requestSyncPutIfAbsent = concurrentHashMap.putIfAbsent(pair, (requestSyncImpl = new RequestSyncImpl<>(pair)))) != null) {
                    requestSyncImpl = requestSyncPutIfAbsent;
                }
                Intrinsics.checkNotNullExpressionValue(requestSyncImpl, "remoteCallSyncs.getOrPut… { RequestSyncImpl(key) }");
                requestSync = requestSyncImpl;
            } catch (Throwable th) {
                throw th;
            }
        }
        return requestSync;
    }
}
