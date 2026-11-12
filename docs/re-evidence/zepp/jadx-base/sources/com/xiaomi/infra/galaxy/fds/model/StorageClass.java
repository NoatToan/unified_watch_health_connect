package com.xiaomi.infra.galaxy.fds.model;

/* JADX INFO: loaded from: classes22.dex */
public enum StorageClass {
    Standard("STANDARD"),
    StandardInfrequentAccess("STANDARD_IA"),
    Archive("ARCHIVE");

    private final String storageClassId;

    StorageClass(String str) {
        this.storageClassId = str;
    }

    public static StorageClass fromValue(String str) throws IllegalArgumentException {
        for (StorageClass storageClass : values()) {
            if (storageClass.toString().equalsIgnoreCase(str)) {
                return storageClass;
            }
        }
        throw new IllegalArgumentException("Cannot create enum from " + str + " value!");
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.storageClassId;
    }
}
