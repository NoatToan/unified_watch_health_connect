package defpackage;

import com.xiaomi.fitness.device.manager.di.ContentItemModule;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;

/* JADX INFO: loaded from: classes8.dex */
public final class zh4 implements dei {
    public static TabContentItem a(ContentItemModule contentItemModule) {
        return (TabContentItem) f6i.c(contentItemModule.provideDeviceStatusItem());
    }
}
