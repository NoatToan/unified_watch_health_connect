package com.xiaomi.fitness.aggregation.health.entity;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/entity/CloudContract;", "", "<init>", "()V", "TABLE_DAILY_REPORT", "", "TABLE_RED_DOT", "TABLE_DEVICE_LIST", "TABLE_RAINBOW", "TABLE_STAT", "TABLE_DATA_PROJECT", "COL_SID", "COL_DATA_TYPE", "COL_TIME_IN_ZERO", "COL_VALUE", "COL_VIEW_TAG", "COL_IS_UPLOAD", "COL_IS_DELETED", "COL_UPDATE_TIME", "COL_KEY", "COL_TAG", "COL_TIME", "COL_ZONE_OFFSET", "COL_TENANT_ID", "COL_PROJECT_ID", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CloudContract {

    @NotNull
    public static final String COL_DATA_TYPE = "dataType";

    @NotNull
    public static final String COL_IS_DELETED = "isDeleted";

    @NotNull
    public static final String COL_IS_UPLOAD = "isUpload";

    @NotNull
    public static final String COL_KEY = "key";

    @NotNull
    public static final String COL_PROJECT_ID = "projectId";

    @NotNull
    public static final String COL_SID = "sid";

    @NotNull
    public static final String COL_TAG = "tag";

    @NotNull
    public static final String COL_TENANT_ID = "tenantId";

    @NotNull
    public static final String COL_TIME = "time";

    @NotNull
    public static final String COL_TIME_IN_ZERO = "timeInZero";

    @NotNull
    public static final String COL_UPDATE_TIME = "updateTime";

    @NotNull
    public static final String COL_VALUE = "value";

    @NotNull
    public static final String COL_VIEW_TAG = "viewTag";

    @NotNull
    public static final String COL_ZONE_OFFSET = "zoneOffset";

    @NotNull
    public static final CloudContract INSTANCE = new CloudContract();

    @NotNull
    public static final String TABLE_DAILY_REPORT = "daily_report";

    @NotNull
    public static final String TABLE_DATA_PROJECT = "data_project";

    @NotNull
    public static final String TABLE_DEVICE_LIST = "device_list";

    @NotNull
    public static final String TABLE_RAINBOW = "rainbow";

    @NotNull
    public static final String TABLE_RED_DOT = "red_dot";

    @NotNull
    public static final String TABLE_STAT = "stat_data";

    private CloudContract() {
    }
}
