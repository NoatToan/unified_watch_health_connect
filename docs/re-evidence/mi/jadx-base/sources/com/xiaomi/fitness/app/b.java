package com.xiaomi.fitness.app;

import com.xiaomi.fitness.net.HttpConfig;
import defpackage.dei;
import defpackage.f6i;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements dei {
    public static HttpConfig a() {
        return (HttpConfig) f6i.c(AppModule.INSTANCE.provideHttpConfig());
    }
}
