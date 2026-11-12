package defpackage;

import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.sport.SportModule;
import com.xiaomi.fitness.sport.sporttab.SportTabV4Fragment;

/* JADX INFO: loaded from: classes10.dex */
public final class lrn implements dei {
    public static MainTab a(SportModule sportModule, SportTabV4Fragment sportTabV4Fragment) {
        return (MainTab) f6i.c(sportModule.provideSportTab(sportTabV4Fragment));
    }
}
