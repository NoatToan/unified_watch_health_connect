package com.xiaomi.hm.health.play.sort;

import com.xiaomi.hm.health.play.PlayTabType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/play/sort/SortKeyManager;", "", "Lcom/xiaomi/hm/health/play/PlayTabType;", "tabType", "", "getSortKeyByTabType", "a", "Ljava/lang/String;", "PLAY_INTELLIGENCE_SORT_KEY", "b", "PLAY_HEALTH_SORT_KEY", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SortKeyManager {

    @NotNull
    public static final SortKeyManager INSTANCE = new SortKeyManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String PLAY_INTELLIGENCE_SORT_KEY = "huami.mifit.user.settings.play.intelligence.order";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String PLAY_HEALTH_SORT_KEY = "huami.mifit.user.settings.play.health.order";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayTabType.values().length];
            iArr[PlayTabType.INTELLIGENCE.ordinal()] = 1;
            iArr[PlayTabType.HEALTH.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SortKeyManager() {
    }

    @Nullable
    public final String getSortKeyByTabType(@NotNull PlayTabType tabType) {
        int i = WhenMappings.$EnumSwitchMapping$0[tabType.ordinal()];
        if (i == 1) {
            return PLAY_INTELLIGENCE_SORT_KEY;
        }
        if (i != 2) {
            return null;
        }
        return PLAY_HEALTH_SORT_KEY;
    }
}
