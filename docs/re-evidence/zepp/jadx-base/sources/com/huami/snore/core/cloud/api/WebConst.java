package com.huami.snore.core.cloud.api;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.huami.hmchartui.utils.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/huami/snore/core/cloud/api/WebConst;", "", "<init>", "()V", "FileType", "Param", MAPCookie.KEY_PATH, "snore_release"}, k = 1, mv = {1, 5, 1})
public final class WebConst {

    @NotNull
    public static final WebConst INSTANCE = new WebConst();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/huami/snore/core/cloud/api/WebConst$FileType;", "", "", "TYPE_SNORE", "Ljava/lang/String;", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
    public static final class FileType {

        @NotNull
        public static final FileType INSTANCE = new FileType();

        @NotNull
        public static final String TYPE_SNORE = "SNORE_DATA";

        private FileType() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/huami/snore/core/cloud/api/WebConst$Param;", "", "", Constant.USER_ID, "Ljava/lang/String;", "APP_NAME", "FILE_NAME", "FILE_TYPE", FileType.TYPE_SNORE, "FROM", "TO", "NEXT", "LIMIT", "RESERSE", "TIMESTAMP", "FINDONE", "START_TIME", "END_TIME", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
    public static final class Param {

        @NotNull
        public static final String APP_NAME = "appName";

        @NotNull
        public static final String END_TIME = "endTime";

        @NotNull
        public static final String FILE_NAME = "fileName";

        @NotNull
        public static final String FILE_TYPE = "fileType";

        @NotNull
        public static final String FINDONE = "findOne";

        @NotNull
        public static final String FROM = "from";

        @NotNull
        public static final Param INSTANCE = new Param();

        @NotNull
        public static final String LIMIT = "limit";

        @NotNull
        public static final String NEXT = "next";

        @NotNull
        public static final String RESERSE = "reverse";

        @NotNull
        public static final String SNORE_DATA = "snoreData";

        @NotNull
        public static final String START_TIME = "startTime";

        @NotNull
        public static final String TIMESTAMP = "timestamp";

        @NotNull
        public static final String TO = "to";

        @NotNull
        public static final String USER_ID = "userId";

        private Param() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/huami/snore/core/cloud/api/WebConst$Path;", "", "", "UPLOAD_SNORE", "Ljava/lang/String;", "USER_EVENTS", "BATCH_DELETE", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
    public static final class Path {

        @NotNull
        public static final String BATCH_DELETE = "snore/batchDelete";

        @NotNull
        public static final Path INSTANCE = new Path();

        @NotNull
        public static final String UPLOAD_SNORE = "users/{userId}/apps/{appName}/fileAccessURIs";

        @NotNull
        public static final String USER_EVENTS = "snore";

        private Path() {
        }
    }

    private WebConst() {
    }
}
