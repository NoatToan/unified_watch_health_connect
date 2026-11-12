package com.xiaomi.fitness.baseui;

import android.content.Context;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.component.AbsComponentizedApplication;
import defpackage.z9g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/baseui/BaseApplication;", "Lcom/xiaomi/fitness/component/AbsComponentizedApplication;", "<init>", "()V", "attachBaseContext", "", "base", "Landroid/content/Context;", "initWhenAttachBaseContext", "onTrimMemory", "level", "", "onLowMemory", "Companion", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BaseApplication extends AbsComponentizedApplication {

    @NotNull
    public static final String TAG = "HealthApplication";

    @Override // com.xiaomi.fitness.component.AbsComponentizedApplication, android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        AppUtil.INSTANCE.init(this);
        super.attachBaseContext(base);
    }

    @Override // com.xiaomi.fitness.component.AbsComponentizedApplication
    public void initWhenAttachBaseContext(@NotNull Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        super.initWhenAttachBaseContext(base);
        z9g.l(this);
    }

    @Override // com.xiaomi.fitness.component.AbsComponentizedApplication, android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        Logger.i(TAG, "onLowMemory");
    }

    @Override // com.xiaomi.fitness.component.AbsComponentizedApplication, android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Logger.i(TAG, "onTrimMemory level:" + level);
    }
}
