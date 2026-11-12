package com.xiaomi.fitness.watch.face.base;

import com.xiaomi.fitness.account.token.CookieFetcher;
import defpackage.dei;
import defpackage.f6i;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements dei {
    public static CookieFetcher a() {
        return (CookieFetcher) f6i.c(CommonBaseModel.INSTANCE.provideCookie());
    }
}
