package com.huami.treadmill.data;

import com.huami.nfc.bus.NoticesEntity;
import kotlin.Metadata;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/huami/treadmill/data/BoltSportState;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", DebugCoroutineInfoImplKt.RUNNING, "PAUSED", NoticesEntity.LOOP_TYPE_NONE, "treadmill_release"}, k = 1, mv = {1, 5, 1})
public enum BoltSportState {
    RUNNING(0),
    PAUSED(1),
    NONE(2);

    BoltSportState(int i) {
    }
}
