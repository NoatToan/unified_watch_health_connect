package com.huawei.ui.main.stories.fitness.activity.coresleep;

import defpackage.gxl;
import defpackage.gxq;

/* JADX INFO: loaded from: classes43.dex */
public class SleepYearCommonTimeProvider extends SleepTimeProvider {
    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepTimeProvider
    protected boolean e() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepTimeProvider
    protected boolean a(gxq gxqVar) {
        return gxqVar != null && ((gxl) gxqVar.b()).v() > 0;
    }
}
