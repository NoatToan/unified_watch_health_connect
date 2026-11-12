package com.huami.message.ui.base.ext;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0013\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "", "formatRedDotCount", "formatRealCount", "(Ljava/lang/Integer;)Ljava/lang/String;", "MAX_COUNT_MESSAGE_SHOW", LogUtil.I, "common-message_release"}, k = 2, mv = {1, 5, 1})
public final class IntExKt {
    public static final int MAX_COUNT_MESSAGE_SHOW = 99;

    @NotNull
    public static final String formatRealCount(@Nullable Integer num) {
        int iIntValue = num == null ? 0 : num.intValue();
        return iIntValue > 0 ? String.valueOf(iIntValue) : "";
    }

    @NotNull
    public static final String formatRedDotCount(int i) {
        return Math.min(99, i) + (i > 99 ? "+" : "");
    }
}
