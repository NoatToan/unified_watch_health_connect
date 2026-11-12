package com.xiaomi.infra.galaxy.fds.bean;

import java.util.UUID;

/* JADX INFO: loaded from: classes22.dex */
public class QuotaApply {
    public static final String DONE_PREFIX = "done";
    public static final String PENDING_PREFIX = "pending";
    public static final String QUOTA_APPLY_DELIMITER = "_";
    private static final long h = Long.MAX_VALUE;
    private static final long i = 1073741824;
    private String a;
    private String b;
    private long c;
    private ApplyStatus d;
    private long e;
    private String f;
    private ApplyType g;

    public enum ApplyStatus {
        PENDING,
        ACCEPT,
        REJECT
    }

    public enum ApplyType {
        SPACE(1073741824, "空间配额"),
        BUCKET_LIMIT(1, "Bucket配额"),
        CDN_PREFETCH(1, "CDN预取配额"),
        CDN_REFRESH(1, "CDN刷新配额");

        private String displayName;
        private long unit;

        ApplyType(long j, String str) {
            this.unit = j;
            this.displayName = str;
        }

        public static ApplyType fromString(String str) {
            for (ApplyType applyType : values()) {
                if (applyType.name().equalsIgnoreCase(str)) {
                    return applyType;
                }
            }
            return null;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public long getUnit() {
            return this.unit;
        }
    }

    public QuotaApply() {
    }

    private String a(long j) {
        return String.format("%020d", Long.valueOf(Long.MAX_VALUE - j));
    }

    private String b(String str, long j) {
        String string = UUID.randomUUID().toString();
        return (this.d == ApplyStatus.PENDING ? PENDING_PREFIX : "done") + "_" + str + "_" + a(j) + "_" + string;
    }

    public String getApplyId() {
        return this.f;
    }

    public ApplyStatus getApplyStatus() {
        return this.d;
    }

    public long getApplyTime() {
        return this.c;
    }

    public ApplyType getApplyType() {
        return this.g;
    }

    public String getApplyUser() {
        return this.b;
    }

    public long getFdsQuota() {
        return this.e;
    }

    public String getOrgId() {
        return this.a;
    }

    public void setApplyId(String str) {
        this.f = str;
    }

    public void setApplyStatus(ApplyStatus applyStatus) {
        this.d = applyStatus;
    }

    public void setApplyTime(long j) {
        this.c = j;
    }

    public void setApplyType(ApplyType applyType) {
        this.g = applyType;
    }

    public void setApplyUser(String str) {
        this.b = str;
    }

    public void setFdsQuota(long j) {
        this.e = j;
    }

    public void setOrgId(String str) {
        this.a = str;
    }

    public QuotaApply(String str, String str2, long j, ApplyStatus applyStatus, long j2) {
        this(str, str2, j, applyStatus, ApplyType.SPACE, j2);
    }

    public QuotaApply(String str, String str2, long j, ApplyStatus applyStatus, ApplyType applyType, long j2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = applyStatus;
        this.g = applyType;
        this.e = j2;
        this.f = b(str, j);
    }
}
