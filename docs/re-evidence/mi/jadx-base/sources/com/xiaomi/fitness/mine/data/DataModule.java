package com.xiaomi.fitness.mine.data;

import androidx.fragment.app.Fragment;
import com.fitness.banner.export.compare.ICompare;
import com.fitness.banner.export.compare.ICompareKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.mine.MineFragment;
import com.xiaomi.fitness.mine.v4.MineFragmentV4;
import defpackage.m0j;
import defpackage.vni;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/mine/data/DataModule;", "", "<init>", "()V", "provideMineTab", "Lcom/xiaomi/fitness/main/export/MainTab;", "fragment", "Lcom/xiaomi/fitness/mine/MineFragment;", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataModule {
    @NotNull
    public final MainTab provideMineTab(@NotNull MineFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Fragment mineFragmentV4 = ICompareKt.getINSTANCE(ICompare.INSTANCE).showAppV4Enable() ? new MineFragmentV4() : fragment;
        MainTab.Companion companion = MainTab.INSTANCE;
        String name = fragment.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        companion.registerTabFragment(name, companion.getINDEX_ME());
        return new MainTab(companion.getINDEX_ME(), m0j.h0, vni.G, mineFragmentV4, -1);
    }
}
