package com.xiaomi.wearable.yrn.helper;

import defpackage.gur;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/wearable/yrn/helper/WearableRNRegisterInfoManager;", "", "", "Lgur;", "appConfigs", "", "init", "(Ljava/util/List;)V", "yrnAppConfigList", "()Ljava/util/List;", "mAppConfigs", "Ljava/util/List;", "<init>", "()V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WearableRNRegisterInfoManager {

    @NotNull
    public static final WearableRNRegisterInfoManager INSTANCE = new WearableRNRegisterInfoManager();
    private static List<? extends gur> mAppConfigs;

    private WearableRNRegisterInfoManager() {
    }

    public final void init(@NotNull List<? extends gur> appConfigs) {
        Intrinsics.checkNotNullParameter(appConfigs, "appConfigs");
        mAppConfigs = appConfigs;
    }

    @NotNull
    public final List<gur> yrnAppConfigList() {
        List list = mAppConfigs;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAppConfigs");
        return null;
    }
}
