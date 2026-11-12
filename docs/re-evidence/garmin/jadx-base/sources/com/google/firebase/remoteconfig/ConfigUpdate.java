package com.google.firebase.remoteconfig;

import com.google.auto.value.AutoValue;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class ConfigUpdate {
    public static ConfigUpdate create(Set<String> set) {
        return new AutoValue_ConfigUpdate(set);
    }

    public abstract Set<String> getUpdatedKeys();
}
