package com.huami.treadmill.paging;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/treadmill/paging/PageKey;", "", "", PageKey.TD_PROMOTION_LINE, "Ljava/lang/String;", PageKey.TD_LINE, PageKey.TD_KING_DILIGENT, PageKey.TD_KING_SPEED, "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class PageKey {

    @NotNull
    public static final PageKey INSTANCE = new PageKey();

    @NotNull
    public static final String TD_KING_DILIGENT = "TD_KING_DILIGENT";

    @NotNull
    public static final String TD_KING_SPEED = "TD_KING_SPEED";

    @NotNull
    public static final String TD_LINE = "TD_LINE";

    @NotNull
    public static final String TD_PROMOTION_LINE = "TD_PROMOTION_LINE";

    private PageKey() {
    }
}
