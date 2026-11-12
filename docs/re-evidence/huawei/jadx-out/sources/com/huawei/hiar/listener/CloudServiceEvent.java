package com.huawei.hiar.listener;

import com.huawei.hiar.common.CloudServiceState;
import java.util.EventObject;

/* JADX INFO: loaded from: classes33.dex */
public class CloudServiceEvent extends EventObject {
    private static final long serialVersionUID = 3097405229771875942L;
    private CloudServiceState cloudServiceState;

    public CloudServiceState getCloudServiceState() {
        return this.cloudServiceState;
    }

    public CloudServiceEvent(Object obj, CloudServiceState cloudServiceState) {
        super(obj);
        this.cloudServiceState = cloudServiceState;
    }
}
