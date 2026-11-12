package com.xiaomi.fitness.app;

import com.xiaomi.fitness.common.app.AppManager;
import defpackage.dei;
import defpackage.f6i;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements dei {
    public static AppManager a() {
        return (AppManager) f6i.c(AppModule.INSTANCE.provideAppManager());
    }
}
