package com.xiaomi.fitness.electronic.scale.register;

import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.electronic.scale.schema.ShareDeviceSchema;
import com.xiaomi.fitness.electronic.scale.schema.YunMaiPageScheme;
import defpackage.xfl;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/register/YunMaiComponet;", "", "<init>", "()V", "registerActivityCreate", "", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "YunMai")
public final class YunMaiComponet {
    @ComponentTask(notEarlierThan = 4, onMainThread = true)
    public final void registerActivityCreate() {
        xfl.a().d(new YunMaiPageScheme());
        xfl.a().d(new ShareDeviceSchema());
    }
}
