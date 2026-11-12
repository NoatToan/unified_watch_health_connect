package com.xiaomi.infra.galaxy.fds;

/* JADX INFO: loaded from: classes22.dex */
public enum SubResource {
    ACL("acl"),
    QUOTA("quota"),
    UPLOADS("uploads"),
    PART_NUMBER("partNumber"),
    UPLOAD_ID("uploadId"),
    STORAGE_ACCESS_TOKEN("storageAccessToken"),
    COMPRESSION("compression"),
    METADATA("metadata");

    private final String name;

    SubResource(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
