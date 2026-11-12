package defpackage;

import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.nfc.di.NfcEventModule;

/* JADX INFO: loaded from: classes9.dex */
public final class qmg implements dei {
    public static TabContentItem a() {
        return (TabContentItem) f6i.c(NfcEventModule.INSTANCE.provideYoYoCardItem());
    }
}
