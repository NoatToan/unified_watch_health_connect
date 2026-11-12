package com.xiaomi.fitness.notify.di;

import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import defpackage.dei;
import defpackage.f6i;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements dei {
    public static TabContentItem a() {
        return (TabContentItem) f6i.c(NotifyModule.INSTANCE.provideCallNotifyItem());
    }
}
