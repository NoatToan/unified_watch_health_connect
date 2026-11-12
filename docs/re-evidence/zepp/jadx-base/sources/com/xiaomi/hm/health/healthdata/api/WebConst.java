package com.xiaomi.hm.health.healthdata.api;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.huami.hmchartui.utils.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/api/WebConst;", "", "<init>", "()V", "ExportType", "Param", MAPCookie.KEY_PATH, "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WebConst {

    @NotNull
    public static final WebConst INSTANCE = new WebConst();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/api/WebConst$ExportType;", "", "", "TYPE_WEEK", "Ljava/lang/String;", "TYPE_MONTH", "TYPE_YEAR", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class ExportType {

        @NotNull
        public static final ExportType INSTANCE = new ExportType();

        @NotNull
        public static final String TYPE_MONTH = "ODD_MONTH";

        @NotNull
        public static final String TYPE_WEEK = "ODD_WEEK";

        @NotNull
        public static final String TYPE_YEAR = "ODD_YEAR";

        private ExportType() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/api/WebConst$Param;", "", "", "SUB_TYPE", "Ljava/lang/String;", "TIMESTAMP", Constant.USER_ID, "EVENT_TYPE", "MASTER_TYPE", "BLOOD_OXYGEN_MASTER_TYPE", "FROM", "TO", "NEXT", "LIMIT", "REVERSE", "APP_NAME", "HEARING_HEALTH_RECORDS_TYPE", "EXPORT_KEY", "EXPORT_TIME", "DETAILS", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Param {

        @NotNull
        public static final String APP_NAME = "com.huami.midong";

        @NotNull
        public static final String BLOOD_OXYGEN_MASTER_TYPE = "blood_oxygen";

        @NotNull
        public static final String DETAILS = "details";

        @NotNull
        public static final String EVENT_TYPE = "eventType";

        @NotNull
        public static final String EXPORT_KEY = "eventType";

        @NotNull
        public static final String EXPORT_TIME = "exportTime";

        @NotNull
        public static final String FROM = "from";

        @NotNull
        public static final String HEARING_HEALTH_RECORDS_TYPE = "hearingHealthRecords";

        @NotNull
        public static final Param INSTANCE = new Param();

        @NotNull
        public static final String LIMIT = "limit";

        @NotNull
        public static final String MASTER_TYPE = "health_data";

        @NotNull
        public static final String NEXT = "next";

        @NotNull
        public static final String REVERSE = "reverse";

        @NotNull
        public static final String SUB_TYPE = "subType";

        @NotNull
        public static final String TIMESTAMP = "timestamp";

        @NotNull
        public static final String TO = "to";

        @NotNull
        public static final String USER_ID = "userId";

        private Param() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/api/WebConst$Path;", "", "", "USER_EVENTS", "Ljava/lang/String;", "FIND_BY_EVENT_TYPE", "DELETE_USER_EVENT", "UPLOAD_EVENTS", "USER_DATE_EVENTS", "STATISTICS_NAP_SLEEP_DATA", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Path {

        @NotNull
        public static final String DELETE_USER_EVENT = "users/{userId}/event/{eventType}";

        @NotNull
        public static final String FIND_BY_EVENT_TYPE = "users/{userId}/event/{eventType}";

        @NotNull
        public static final Path INSTANCE = new Path();

        @NotNull
        public static final String STATISTICS_NAP_SLEEP_DATA = "users/{userId}/bigDataExported/{eventType}";

        @NotNull
        public static final String UPLOAD_EVENTS = "users/{userId}/events";

        @NotNull
        public static final String USER_DATE_EVENTS = "users/{userId}/date/events";

        @NotNull
        public static final String USER_EVENTS = "users/{userId}/events";

        private Path() {
        }
    }

    private WebConst() {
    }
}
