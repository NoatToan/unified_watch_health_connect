package com.xiaomi.fitness.connect.export;

import android.util.SparseArray;
import defpackage.u7r;
import defpackage.zrc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0015\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/connect/export/EcoDeviceHandlerImpl;", "Lzrc;", "", "type", "dataHandler", "", "addDataHandler", "(ILzrc;)V", "removeDataHandler", "Lu7r;", "packet", "", "handlePacket", "(ILu7r;)Z", "", "data", "handleData", "(I[B)Z", "", "nodeId", "path", "handleEcoData", "(Ljava/lang/String;Ljava/lang/String;[B)V", "did", "updateDid", "(Ljava/lang/String;)V", "Landroid/util/SparseArray;", "", "mDataHandlers", "Landroid/util/SparseArray;", "<init>", "()V", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcoDeviceHandlerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoDeviceHandlerImpl.kt\ncom/xiaomi/fitness/connect/export/EcoDeviceHandlerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n1863#2,2:57\n1863#2,2:59\n1863#2,2:61\n*S KotlinDebug\n*F\n+ 1 EcoDeviceHandlerImpl.kt\ncom/xiaomi/fitness/connect/export/EcoDeviceHandlerImpl\n*L\n26#1:57,2\n36#1:59,2\n50#1:61,2\n*E\n"})
public final class EcoDeviceHandlerImpl implements zrc {

    @NotNull
    private final SparseArray<List<zrc>> mDataHandlers = new SparseArray<>();

    public final void addDataHandler(int type, @NotNull zrc dataHandler) {
        Intrinsics.checkNotNullParameter(dataHandler, "dataHandler");
        List<zrc> arrayList = this.mDataHandlers.get(type);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.mDataHandlers.put(type, arrayList);
        }
        if (arrayList.contains(dataHandler)) {
            return;
        }
        arrayList.add(dataHandler);
    }

    @Override // defpackage.zrc
    public boolean handleData(int type, @Nullable byte[] data) {
        List<zrc> list = this.mDataHandlers.get(type);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext() && !((zrc) it.next()).handleData(type, data)) {
            }
        }
        return true;
    }

    @Override // defpackage.zrc
    public void handleEcoData(@Nullable String nodeId, @Nullable String path, @Nullable byte[] data) {
    }

    @Override // defpackage.zrc
    public boolean handlePacket(int type, @Nullable u7r packet) {
        List<zrc> list = this.mDataHandlers.get(type);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext() && !((zrc) it.next()).handlePacket(type, packet)) {
            }
        }
        return true;
    }

    public final void removeDataHandler(int type, @NotNull zrc dataHandler) {
        Intrinsics.checkNotNullParameter(dataHandler, "dataHandler");
        List<zrc> list = this.mDataHandlers.get(type);
        if (list != null) {
            list.remove(dataHandler);
        }
    }

    @Override // defpackage.zrc
    public void updateDid(@Nullable String did) {
        int size = this.mDataHandlers.size();
        for (int i = 0; i < size; i++) {
            List<zrc> list = this.mDataHandlers.get(this.mDataHandlers.keyAt(i));
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((zrc) it.next()).updateDid(did);
                }
            }
        }
    }
}
