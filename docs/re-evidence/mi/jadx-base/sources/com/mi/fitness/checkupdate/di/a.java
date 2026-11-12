package com.mi.fitness.checkupdate.di;

import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import defpackage.dei;
import defpackage.f6i;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements dei {
    public static TabContentItem a() {
        return (TabContentItem) f6i.c(CheckUpdateModule.INSTANCE.provideCheckUpdateItem());
    }
}
