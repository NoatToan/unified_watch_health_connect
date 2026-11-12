package com.xiaomi.fitness.login.di;

import com.xiaomi.fitness.account.token.CookieFetcher;
import defpackage.dei;
import defpackage.f6i;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements dei {
    public static CookieFetcher a() {
        return (CookieFetcher) f6i.c(CookieSingleModule.INSTANCE.provideRegionCookie());
    }
}
