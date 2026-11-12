package com.xiaomi.wearable.core.client;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.c;
import com.xiaomi.wearable.core.client.DataHandlerAdapter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/xiaomi/wearable/core/client/DataHandlerAdapter;", "Lcom/xiaomi/wearable/core/c$a;", "Lcom/xiaomi/wearable/core/client/IDataHandler;", "dataHandler", "", "contains", "(Lcom/xiaomi/wearable/core/client/IDataHandler;)Z", "add", "remove", "isEmpty", "()Z", "", CervicalMucusRecord.Appearance.CLEAR, "()V", "", "did", "", "type", "", "data", "handleData", "(Ljava/lang/String;I[B)V", "Ljava/lang/String;", "getDid", "()Ljava/lang/String;", "I", "getType", "()I", "Ljava/util/concurrent/CopyOnWriteArrayList;", "dataHandlers", "Ljava/util/concurrent/CopyOnWriteArrayList;", "<init>", "(Ljava/lang/String;I)V", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDataHandlerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataHandlerAdapter.kt\ncom/xiaomi/wearable/core/client/DataHandlerAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n1863#2,2:54\n*S KotlinDebug\n*F\n+ 1 DataHandlerAdapter.kt\ncom/xiaomi/wearable/core/client/DataHandlerAdapter\n*L\n39#1:54,2\n*E\n"})
public final class DataHandlerAdapter extends c.a {

    @NotNull
    private static final String TAG = "DataHandlerAdapter";

    @NotNull
    private final CopyOnWriteArrayList<IDataHandler> dataHandlers;

    @NotNull
    private final String did;
    private final int type;

    public DataHandlerAdapter(@NotNull String did, int i) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.did = did;
        this.type = i;
        this.dataHandlers = new CopyOnWriteArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleData$lambda$1(DataHandlerAdapter this$0, String str, int i, byte[] bArr) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Iterator<T> it = this$0.dataHandlers.iterator();
            while (it.hasNext()) {
                ((IDataHandler) it.next()).handleData(str, i, bArr);
            }
        } catch (Exception e) {
            e.printStackTrace();
            CoreExtKt.getLogger().e(TAG, "handleData exception", e);
        }
    }

    public final boolean add(@NotNull IDataHandler dataHandler) {
        Intrinsics.checkNotNullParameter(dataHandler, "dataHandler");
        return this.dataHandlers.add(dataHandler);
    }

    public final void clear() {
        this.dataHandlers.clear();
    }

    public final boolean contains(@NotNull IDataHandler dataHandler) {
        Intrinsics.checkNotNullParameter(dataHandler, "dataHandler");
        return this.dataHandlers.contains(dataHandler);
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    public final int getType() {
        return this.type;
    }

    @Override // com.xiaomi.wearable.core.c
    public void handleData(@Nullable final String did, final int type, @Nullable final byte[] data) {
        CoreExtKt.getLogger().i(TAG, "handleData() called with: did = " + did + ", type = " + type);
        com.xiaomi.wearable.CoreExtKt.getWorkerHandler().post(new Runnable() { // from class: ml5
            @Override // java.lang.Runnable
            public final void run() {
                DataHandlerAdapter.handleData$lambda$1(this.f26975a, did, type, data);
            }
        });
    }

    public final boolean isEmpty() {
        return this.dataHandlers.isEmpty();
    }

    public final boolean remove(@NotNull IDataHandler dataHandler) {
        Intrinsics.checkNotNullParameter(dataHandler, "dataHandler");
        return this.dataHandlers.remove(dataHandler);
    }
}
