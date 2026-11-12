package com.huami.snore.core.ext;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J&\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/huami/snore/core/ext/IPageStatusAnalyticsManager;", "", "", "id", "", "recordEvent", "", "extras", "Companion", "snore_release"}, k = 1, mv = {1, 5, 1})
public interface IPageStatusAnalyticsManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String INDEX_INTO_SNORE_PAGE = "SNORING_V";

    @NotNull
    public static final String INDEX_SNORE_RESULT_DIALOG_SHOW = "SNORING_RESULT_V";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/snore/core/ext/IPageStatusAnalyticsManager$Companion;", "", "", "INDEX_INTO_SNORE_PAGE", "Ljava/lang/String;", "INDEX_SNORE_RESULT_DIALOG_SHOW", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @NotNull
        public static final String INDEX_INTO_SNORE_PAGE = "SNORING_V";

        @NotNull
        public static final String INDEX_SNORE_RESULT_DIALOG_SHOW = "SNORING_RESULT_V";
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static void recordEvent(@NotNull IPageStatusAnalyticsManager iPageStatusAnalyticsManager, @NotNull String str) {
            iPageStatusAnalyticsManager.recordEvent(str, r.emptyMap());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void recordEvent$default(IPageStatusAnalyticsManager iPageStatusAnalyticsManager, String str, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recordEvent");
            }
            if ((i & 2) != 0) {
                map = r.emptyMap();
            }
            iPageStatusAnalyticsManager.recordEvent(str, map);
        }
    }

    void recordEvent(@NotNull String id);

    void recordEvent(@NotNull String id, @NotNull Map<String, String> extras);
}
