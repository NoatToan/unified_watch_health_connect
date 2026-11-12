package com.xiaomi.ai.android.capability;

/* JADX INFO: loaded from: classes6.dex */
public abstract class StorageCapability implements Capability {
    public abstract void clearKeyValue();

    public abstract String readKeyValue(String str);

    public abstract void removeKeyValue(String str);

    public abstract boolean writeKeyValue(String str, String str2);
}
