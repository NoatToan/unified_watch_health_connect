package defpackage;

import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.userinfo.di.GoalNotifySingleModule;

/* JADX INFO: loaded from: classes10.dex */
public final class a2b implements dei {
    public static TabContentItem a(GoalNotifySingleModule goalNotifySingleModule) {
        return (TabContentItem) f6i.c(goalNotifySingleModule.provideAlarmItem());
    }
}
