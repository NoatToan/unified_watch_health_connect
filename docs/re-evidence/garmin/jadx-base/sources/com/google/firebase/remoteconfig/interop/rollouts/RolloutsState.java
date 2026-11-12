package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.auto.value.AutoValue;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class RolloutsState {
    public static RolloutsState create(Set<RolloutAssignment> set) {
        return new AutoValue_RolloutsState(set);
    }

    public abstract Set<RolloutAssignment> getRolloutAssignments();
}
