package com.huami.treadmill.eventbus;

import com.huami.treadmill.data.InMachineStatus;
import com.huami.treadmill.data.InTreadmillData;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/treadmill/eventbus/SportFTMEvent;", "", "Lcom/huami/treadmill/data/InTreadmillData;", "a", "Lcom/huami/treadmill/data/InTreadmillData;", "getTreadmillData", "()Lcom/huami/treadmill/data/InTreadmillData;", "setTreadmillData", "(Lcom/huami/treadmill/data/InTreadmillData;)V", "treadmillData", "Lcom/huami/treadmill/data/InMachineStatus;", "b", "Lcom/huami/treadmill/data/InMachineStatus;", "getMachineStatus", "()Lcom/huami/treadmill/data/InMachineStatus;", "setMachineStatus", "(Lcom/huami/treadmill/data/InMachineStatus;)V", "machineStatus", "<init>", "(Lcom/huami/treadmill/data/InTreadmillData;Lcom/huami/treadmill/data/InMachineStatus;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class SportFTMEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private InTreadmillData treadmillData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private InMachineStatus machineStatus;

    public SportFTMEvent(@Nullable InTreadmillData inTreadmillData, @Nullable InMachineStatus inMachineStatus) {
        this.treadmillData = inTreadmillData;
        this.machineStatus = inMachineStatus;
    }

    @Nullable
    public final InMachineStatus getMachineStatus() {
        return this.machineStatus;
    }

    @Nullable
    public final InTreadmillData getTreadmillData() {
        return this.treadmillData;
    }

    public final void setMachineStatus(@Nullable InMachineStatus inMachineStatus) {
        this.machineStatus = inMachineStatus;
    }

    public final void setTreadmillData(@Nullable InTreadmillData inTreadmillData) {
        this.treadmillData = inTreadmillData;
    }
}
