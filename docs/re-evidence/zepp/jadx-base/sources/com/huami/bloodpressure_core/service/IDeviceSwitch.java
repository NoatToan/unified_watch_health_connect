package com.huami.bloodpressure_core.service;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lcom/huami/bloodpressure_core/service/IDeviceSwitch;", "", "", "supportDeviceMeasureBP", "Lkotlinx/coroutines/flow/Flow;", "deviceSupportBPFlow", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public interface IDeviceSwitch {
    @NotNull
    Flow<Boolean> deviceSupportBPFlow();

    boolean supportDeviceMeasureBP();
}
