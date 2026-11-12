package com.xiaomi.fitness.main.register;

import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.main.scheme.MainPageScheme;
import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import defpackage.xfl;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/main/register/MainComponet;", "", "<init>", "()V", "registerActivityCreate", "", "main_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = FaceSchema.FACE_PAGE_MAIN)
public final class MainComponet {
    @ComponentTask(notLaterThan = 2, onMainThread = true)
    public final void registerActivityCreate() {
        xfl.a().d(new MainPageScheme());
    }
}
