package com.huami.femalehealth.logiclib.api;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/WebConst;", "", "<init>", "()V", MAPCookie.KEY_PATH, "QueryParam", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class WebConst {

    @NotNull
    public static final WebConst INSTANCE = new WebConst();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/WebConst$Path;", "", "", "HISTORY", "Ljava/lang/String;", "FIRST_INIT", "HISTORY_DETAIL", "MENSTRUATION_BEGIN", "MENSTRUATION_STATUS", "MENSTRUATION_END", "MENSTRUATION_DELETE", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Path {

        @NotNull
        public static final String FIRST_INIT = "v4/women";

        @NotNull
        public static final String HISTORY = "v4/women/menstruation/history/list";

        @NotNull
        public static final String HISTORY_DETAIL = "v4/women/menstruation/history/detail";

        @NotNull
        public static final Path INSTANCE = new Path();

        @NotNull
        public static final String MENSTRUATION_BEGIN = "v4/women/menstruation";

        @NotNull
        public static final String MENSTRUATION_DELETE = "v4/women/menstruation";

        @NotNull
        public static final String MENSTRUATION_END = "v4/women/menstruation/end";

        @NotNull
        public static final String MENSTRUATION_STATUS = "v4/women/menstruation/sympto";

        private Path() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/WebConst$QueryParam;", "", "", "ID", "Ljava/lang/String;", "END", "NEXT", "MONTHLY_STATISTICS", "LIMIT", "DELETE_TYPE", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryParam {

        @NotNull
        public static final String DELETE_TYPE = "type";

        @NotNull
        public static final String END = "end";

        @NotNull
        public static final String ID = "id";

        @NotNull
        public static final QueryParam INSTANCE = new QueryParam();

        @NotNull
        public static final String LIMIT = "limit";

        @NotNull
        public static final String MONTHLY_STATISTICS = "monthlyStatistics";

        @NotNull
        public static final String NEXT = "next";

        private QueryParam() {
        }
    }

    private WebConst() {
    }
}
