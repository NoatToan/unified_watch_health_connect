package com.huami.message.api;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/huami/message/api/WebConst;", "", "", "PAGE_SIZE", LogUtil.I, "<init>", "()V", MAPCookie.KEY_PATH, "QueryParam", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final class WebConst {

    @NotNull
    public static final WebConst INSTANCE = new WebConst();
    public static final int PAGE_SIZE = 10;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/huami/message/api/WebConst$Path;", "", "", "MESSAGE_CENTER", "Ljava/lang/String;", "MESSAGE_STATUS", "MESSAGE_CENTER_V2", "<init>", "()V", "common-message_release"}, k = 1, mv = {1, 5, 1})
    public static final class Path {

        @NotNull
        public static final Path INSTANCE = new Path();

        @NotNull
        public static final String MESSAGE_CENTER = "users/{userId}/messageCenter";

        @NotNull
        public static final String MESSAGE_CENTER_V2 = "users/{userId}/messageCenter/{status}/list";

        @NotNull
        public static final String MESSAGE_STATUS = "users/{userId}/messageCenter/{status}";

        private Path() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/huami/message/api/WebConst$QueryParam;", "", "", "NEXT", "Ljava/lang/String;", "LIMIT", "NOTICE_TYPE", "MESSAGE_TYPE", "MESSAGE_SUB_TYPE", "MESSAGE_ID", "STATUS", "FIG", "TIMESTAMP", "<init>", "()V", "common-message_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryParam {

        @NotNull
        public static final String FIG = "fig";

        @NotNull
        public static final QueryParam INSTANCE = new QueryParam();

        @NotNull
        public static final String LIMIT = "limit";

        @NotNull
        public static final String MESSAGE_ID = "messageId";

        @NotNull
        public static final String MESSAGE_SUB_TYPE = "messageSubType";

        @NotNull
        public static final String MESSAGE_TYPE = "messageType";

        @NotNull
        public static final String NEXT = "next";

        @NotNull
        public static final String NOTICE_TYPE = "noticeType";

        @NotNull
        public static final String STATUS = "status";

        @NotNull
        public static final String TIMESTAMP = "timestamp";

        private QueryParam() {
        }
    }

    private WebConst() {
    }
}
