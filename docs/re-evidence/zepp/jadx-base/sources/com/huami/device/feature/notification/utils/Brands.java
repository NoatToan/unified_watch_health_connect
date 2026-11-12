package com.huami.device.feature.notification.utils;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/huami/device/feature/notification/utils/Brands;", "", "", "isHuawei", "", "a", "Ljava/lang/String;", "HUAWEI", "b", Brands.HONOR, "<init>", "()V", "notification_release"}, k = 1, mv = {1, 5, 1})
public final class Brands {

    @NotNull
    public static final Brands INSTANCE = new Brands();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String HUAWEI = "HUAWEI";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String HONOR = "HONOR";

    private Brands() {
    }

    public final boolean isHuawei() {
        String str = Build.BRAND;
        return Intrinsics.areEqual(str, HONOR) | Intrinsics.areEqual(str, "HUAWEI");
    }
}
