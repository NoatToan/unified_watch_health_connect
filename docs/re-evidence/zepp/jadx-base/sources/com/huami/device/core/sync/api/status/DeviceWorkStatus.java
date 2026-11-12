package com.huami.device.core.sync.api.status;

import com.huami.wallet.datasource.cloud.Const;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourse;
import kotlin.Metadata;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/huami/device/core/sync/api/status/DeviceWorkStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", DebugCoroutineInfoImplKt.RUNNING, Const.CardState.EXCEPTION, "INTERVAL", TrainingCourse.FINISHED, "sync-center_release"}, k = 1, mv = {1, 5, 1})
public enum DeviceWorkStatus {
    NORMAL,
    RUNNING,
    EXCEPTION,
    INTERVAL,
    FINISHED
}
