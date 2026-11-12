package com.xiaomi.fitness.map.export;

import com.xiaomi.fitness.res.preload.export.ResRegistryModel;
import defpackage.dei;
import defpackage.f6i;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements dei {
    public static Set<ResRegistryModel> a() {
        return (Set) f6i.c(MapSoPreloadModule.INSTANCE.provides());
    }
}
