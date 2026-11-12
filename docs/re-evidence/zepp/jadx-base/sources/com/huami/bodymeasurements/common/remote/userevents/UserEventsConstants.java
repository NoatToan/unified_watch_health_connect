package com.huami.bodymeasurements.common.remote.userevents;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.huami.hmchartui.utils.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/huami/bodymeasurements/common/remote/userevents/UserEventsConstants;", "", "<init>", "()V", "Param", MAPCookie.KEY_PATH, "common_release"}, k = 1, mv = {1, 5, 1})
public final class UserEventsConstants {

    @NotNull
    public static final UserEventsConstants INSTANCE = new UserEventsConstants();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/huami/bodymeasurements/common/remote/userevents/UserEventsConstants$Param;", "", "", Constant.USER_ID, "Ljava/lang/String;", "EVENT_TYPE", "SUB_TYPE", "FROM", "TO", "LIMIT", "REVERSE", "APP_NAME", "<init>", "()V", "common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Param {

        @NotNull
        public static final String APP_NAME = "appName";

        @NotNull
        public static final String EVENT_TYPE = "eventType";

        @NotNull
        public static final String FROM = "from";

        @NotNull
        public static final Param INSTANCE = new Param();

        @NotNull
        public static final String LIMIT = "limit";

        @NotNull
        public static final String REVERSE = "reverse";

        @NotNull
        public static final String SUB_TYPE = "subType";

        @NotNull
        public static final String TO = "to";

        @NotNull
        public static final String USER_ID = "userId";

        private Param() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/huami/bodymeasurements/common/remote/userevents/UserEventsConstants$Path;", "", "", "USER_EVENTS", "Ljava/lang/String;", "<init>", "()V", "common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Path {

        @NotNull
        public static final Path INSTANCE = new Path();

        @NotNull
        public static final String USER_EVENTS = "users/%s/events";

        private Path() {
        }
    }

    private UserEventsConstants() {
    }
}
