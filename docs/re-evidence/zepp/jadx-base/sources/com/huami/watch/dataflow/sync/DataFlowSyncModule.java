package com.huami.watch.dataflow.sync;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/watch/dataflow/sync/DataFlowSyncModule;", "", "Lcom/huami/watch/dataflow/sync/IDataFlowSyncModule;", "module", "", "setModule", "", "type", "", "syncData", "a", "Lcom/huami/watch/dataflow/sync/IDataFlowSyncModule;", "sModule", "<init>", "()V", "companionlib_release"}, k = 1, mv = {1, 4, 0})
public final class DataFlowSyncModule {
    public static final DataFlowSyncModule INSTANCE = new DataFlowSyncModule();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static IDataFlowSyncModule sModule;

    private DataFlowSyncModule() {
    }

    @JvmStatic
    public static final void setModule(@NotNull IDataFlowSyncModule module) {
        sModule = module;
    }

    @JvmStatic
    public static final boolean syncData(int type) {
        IDataFlowSyncModule iDataFlowSyncModule = sModule;
        if (iDataFlowSyncModule != null) {
            return iDataFlowSyncModule.syncData(type);
        }
        return false;
    }
}
