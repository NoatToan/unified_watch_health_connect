package com.xiaomi.hm.health.modules;

import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.tools.log.HMLog;
import com.huami.watch.dataflow.sync.IDataFlowSyncModule;
import com.huami.watch.dataflow.sync.bean.DataType;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/modules/DataFlowSyncBleModule;", "Lcom/huami/watch/dataflow/sync/IDataFlowSyncModule;", "", "type", "", "syncData", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DataFlowSyncBleModule implements IDataFlowSyncModule {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Start Sync Data, Type: " + this.a;
        }
    }

    @Override // com.huami.watch.dataflow.sync.IDataFlowSyncModule
    @ExperimentalCoroutinesApi
    public boolean syncData(int type) throws SyncException {
        HMBaseDevice currentDeviceWatch = ModulesUtil.getCurrentDeviceWatch();
        if (currentDeviceWatch == null) {
            return true;
        }
        HMLog.info("DataFlowSyncModule", new a(type));
        if (type != DataType.STRESS.getValue()) {
            return true;
        }
        SmartWatchStressJob smartWatchStressJob = new SmartWatchStressJob();
        smartWatchStressJob.onInject(currentDeviceWatch);
        smartWatchStressJob.start();
        return true;
    }
}
