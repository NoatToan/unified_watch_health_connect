package com.xiaomi.fitness.homepage;

import com.xiaomi.fitness.main.export.MainTab;
import defpackage.c0j;
import defpackage.pni;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/homepage/HealthModule;", "", "<init>", "()V", "provideHealthTab", "Lcom/xiaomi/fitness/main/export/MainTab;", "fragment", "Lcom/xiaomi/fitness/homepage/HealthV2Fragment;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthModule {

    @NotNull
    public static final String TAG = "HealthModule";

    @NotNull
    public final MainTab provideHealthTab(@NotNull HealthV2Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        MainTab.Companion companion = MainTab.INSTANCE;
        String name = fragment.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        companion.registerTabFragment(name, companion.getINDEX_HEALTH());
        return new MainTab(companion.getINDEX_HEALTH(), c0j.I9, pni.U0, fragment, -1);
    }
}
