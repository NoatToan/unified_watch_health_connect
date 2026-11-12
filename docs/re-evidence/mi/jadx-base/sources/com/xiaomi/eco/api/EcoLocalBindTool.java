package com.xiaomi.eco.api;

import com.xiaomi.fitness.common.utils.MD5Util;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/eco/api/EcoLocalBindTool;", "", "<init>", "()V", "TAG", "", "generateAppDeviceId", "mac", "userId", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoLocalBindTool {

    @NotNull
    public static final EcoLocalBindTool INSTANCE = new EcoLocalBindTool();

    @NotNull
    public static final String TAG = "[EcoDeviceBinderLocalV2]";

    private EcoLocalBindTool() {
    }

    @Nullable
    public final String generateAppDeviceId(@NotNull String mac, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase = mac.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return MD5Util.MD5(upperCase + userId);
    }
}
