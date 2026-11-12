package com.xiaomi.fitness.sport;

import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.sport.sporttab.SportTabV4Fragment;
import defpackage.c1j;
import defpackage.eoi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sport/SportModule;", "", "<init>", "()V", "provideSportTab", "Lcom/xiaomi/fitness/main/export/MainTab;", "fragment", "Lcom/xiaomi/fitness/sport/sporttab/SportTabV4Fragment;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportModule {
    @NotNull
    public final MainTab provideSportTab(@NotNull SportTabV4Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        MainTab.Companion companion = MainTab.INSTANCE;
        companion.registerTabFragment(SportTabV4Fragment.SPORT_HOME_PATH, companion.getINDEX_SPORT());
        return new MainTab(companion.getINDEX_SPORT(), c1j.d5, eoi.W1, fragment, -1);
    }
}
