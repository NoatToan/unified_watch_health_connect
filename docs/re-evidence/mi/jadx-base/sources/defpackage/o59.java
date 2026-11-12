package defpackage;

import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.watch.face.di.FaceSingleModel;

/* JADX INFO: loaded from: classes10.dex */
public final class o59 implements dei {
    public static TabContentItem a() {
        return (TabContentItem) f6i.c(FaceSingleModel.INSTANCE.provideFaceItem());
    }
}
