package com.huami.bodymeasurements.common.remote.friend;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/huami/bodymeasurements/common/remote/friend/FriendConstants;", "", "", "SUB_DAY", "Ljava/lang/String;", "<init>", "()V", "Param", MAPCookie.KEY_PATH, "common_release"}, k = 1, mv = {1, 5, 1})
public final class FriendConstants {

    @NotNull
    public static final FriendConstants INSTANCE = new FriendConstants();

    @NotNull
    public static final String SUB_DAY = "DAY";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/huami/bodymeasurements/common/remote/friend/FriendConstants$Param;", "", "", "EVENT_TYPE", "Ljava/lang/String;", "SUB_TYPE", "FROM_DATE", "TO_DATE", "LIMIT", "REVERSE", "SUB", "APP_NAME", "<init>", "()V", "common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Param {

        @NotNull
        public static final String APP_NAME = "appName";

        @NotNull
        public static final String EVENT_TYPE = "eventType";

        @NotNull
        public static final String FROM_DATE = "fromDate";

        @NotNull
        public static final Param INSTANCE = new Param();

        @NotNull
        public static final String LIMIT = "limit";

        @NotNull
        public static final String REVERSE = "reverse";

        @NotNull
        public static final String SUB = "sub";

        @NotNull
        public static final String SUB_TYPE = "subType";

        @NotNull
        public static final String TO_DATE = "toDate";

        private Param() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/huami/bodymeasurements/common/remote/friend/FriendConstants$Path;", "", "", "FRIEND_COMMON_DATA", "Ljava/lang/String;", "<init>", "()V", "common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Path {

        @NotNull
        public static final String FRIEND_COMMON_DATA = "friend/common/datas/%1s/%2s";

        @NotNull
        public static final Path INSTANCE = new Path();

        private Path() {
        }
    }

    private FriendConstants() {
    }
}
