package com.xiaomi.fitness.rn.util;

import com.xiaomi.smarthome.library.common.util.StringUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/rn/util/RnStringUtil;", "", "<init>", "()V", "isSpecialCharInName", "", "name", "", "containsEmoji", "getStringCharLen1", "", "charString", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RnStringUtil {

    @NotNull
    public static final RnStringUtil INSTANCE = new RnStringUtil();

    private RnStringUtil() {
    }

    public final boolean containsEmoji(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringUtil.containsEmoji(name);
    }

    public final int getStringCharLen1(@NotNull String charString) {
        Intrinsics.checkNotNullParameter(charString, "charString");
        return StringUtil.getStringCharLen1(charString);
    }

    public final boolean isSpecialCharInName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringUtil.isSpecialCharInName(name);
    }
}
