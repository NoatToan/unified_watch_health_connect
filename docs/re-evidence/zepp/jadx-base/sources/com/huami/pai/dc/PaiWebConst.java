package com.huami.pai.dc;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.huami.hmchartui.utils.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/huami/pai/dc/PaiWebConst;", "", "<init>", "()V", "Param", MAPCookie.KEY_PATH, "Tag", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiWebConst {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/huami/pai/dc/PaiWebConst$Param;", "", "", "SUB_TYPE", "Ljava/lang/String;", "TIMESTAMP", Constant.USER_ID, "EVENT_TYPE", "FROM", "TO", "NEXT", "LIMIT", "REVERSE", "APP_NAME", "PAI_EVENT_TYPE", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Param {

        @NotNull
        public static final String APP_NAME = "com.huami.midong";

        @NotNull
        public static final String EVENT_TYPE = "eventType";

        @NotNull
        public static final String FROM = "from";

        @NotNull
        public static final Param INSTANCE = new Param();

        @NotNull
        public static final String LIMIT = "limit";

        @NotNull
        public static final String NEXT = "next";

        @NotNull
        public static final String PAI_EVENT_TYPE = "PaiHealthInfo";

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/huami/pai/dc/PaiWebConst$Path;", "", "", "USER_EVENTS", "Ljava/lang/String;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Path {

        @NotNull
        public static final Path INSTANCE = new Path();

        @NotNull
        public static final String USER_EVENTS = "users/{userId}/events";

        private Path() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/huami/pai/dc/PaiWebConst$Tag;", "", "", "HTTP_TAG", "Ljava/lang/String;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Tag {

        @NotNull
        public static final String HTTP_TAG = "HMPaiJob";

        @NotNull
        public static final Tag INSTANCE = new Tag();

        private Tag() {
        }
    }
}
