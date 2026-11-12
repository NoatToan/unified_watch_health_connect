package com.huami.sleep.api;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.huami.hmchartui.utils.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/huami/sleep/api/WebConst;", "", "<init>", "()V", "Param", MAPCookie.KEY_PATH, "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class WebConst {

    @NotNull
    public static final WebConst INSTANCE = new WebConst();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/huami/sleep/api/WebConst$Param;", "", "", "SUB_TYPE", "Ljava/lang/String;", "TIMESTAMP", Constant.USER_ID, "EVENT_TYPE", "MASTER_TYPE", "BLOOD_OXYGEN_MASTER_TYPE", "FROM", "TO", "NEXT", "LIMIT", "REVERSE", "APP_NAME", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Param {

        @NotNull
        public static final String APP_NAME = "com.huami.midong";

        @NotNull
        public static final String BLOOD_OXYGEN_MASTER_TYPE = "blood_oxygen";

        @NotNull
        public static final String EVENT_TYPE = "eventType";

        @NotNull
        public static final String FROM = "from";

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/huami/sleep/api/WebConst$Path;", "", "", "USER_EVENTS", "Ljava/lang/String;", "FIND_BY_EVENT_TYPE", "DELETE_USER_EVENT", "UPLOAD_EVENTS", "USER_DATE_EVENTS", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Path {

        @NotNull
        public static final String DELETE_USER_EVENT = "users/{userId}/event/{eventType}";

        @NotNull
        public static final String FIND_BY_EVENT_TYPE = "users/{userId}/event/{eventType}";

        @NotNull
        public static final Path INSTANCE = new Path();

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
