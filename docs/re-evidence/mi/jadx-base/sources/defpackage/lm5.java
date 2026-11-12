package defpackage;

import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.mine.MineFragment;
import com.xiaomi.fitness.mine.data.DataModule;

/* JADX INFO: loaded from: classes9.dex */
public final class lm5 implements dei {
    public static MainTab a(DataModule dataModule, MineFragment mineFragment) {
        return (MainTab) f6i.c(dataModule.provideMineTab(mineFragment));
    }
}
