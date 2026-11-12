package defpackage;

import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.xms.wearable.di.FeatureItemModule;

/* JADX INFO: loaded from: classes2.dex */
public final class kf9 implements dei {
    public static TabContentItem a(FeatureItemModule featureItemModule) {
        return (TabContentItem) f6i.c(featureItemModule.provideAppShopItem());
    }
}
