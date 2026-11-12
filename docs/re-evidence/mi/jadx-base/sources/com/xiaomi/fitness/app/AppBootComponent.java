package com.xiaomi.fitness.app;

import android.app.Application;
import coil.Coil;
import coil.ImageLoader;
import coil.util.DebugLogger;
import com.tencent.mmkv.MMKV;
import com.tencent.mmkv.MMKVLogLevel;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.fitness.account.logger.XiaomiAccountLogger;
import com.xiaomi.fitness.auto.start.AutoStartExtKt;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainHelper;
import com.xiaomi.fitness.service.Validator;
import defpackage.kb;
import defpackage.ow3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\r\u001a\u00020\u0005H\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/app/AppBootComponent;", "", "<init>", "()V", "initLibInAllProcess", "", "app", "Landroid/app/Application;", "isDevelopment", "", "initAppManager", "initAppInMain", "initARouter", "initSignValidate", "fit-app_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "AppBoot")
public final class AppBootComponent {
    private final boolean isDevelopment;

    @ComponentTask(onMainThread = false)
    public final void initARouter(@NotNull Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        kb.d(app);
        kb.g();
        kb.h();
        Logger.i("ARouter initialization completed", new Object[0]);
    }

    @ComponentTask(notLaterThan = 5, onMainThread = true)
    public final void initAppInMain(@NotNull Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        AutoStartExtKt.openAutoStartOnce(app);
        Logger.i("StatusPage initialization completed", new Object[0]);
        Coil.setImageLoader(new ImageLoader.Builder(app).logger(new DebugLogger(0, 1, null)).build());
    }

    @ComponentTask(multiProcess = true, notLaterThan = 2)
    public final void initAppManager(@NotNull Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        AppManager.INSTANCE.getInstance().init(app, MainExtKt.getInstance(MainHelper.INSTANCE).getMainActivityName(), "com.xiaomi.fitness.login.SplashActivity");
    }

    @ComponentTask(multiProcess = true, name = "initLibs", notLaterThan = 1, onMainThread = true)
    public final void initLibInAllProcess(@NotNull Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        MMKV.B(app, MMKVLogLevel.LevelError);
        ow3.i(app);
        Logger.INSTANCE.init(this.isDevelopment);
        if (this.isDevelopment) {
            AccountLogger.setInstance(new XiaomiAccountLogger());
        }
        AccountLogger.setInstance(new XiaomiAccountLogger());
    }

    @ComponentTask(notEarlierThan = 1, notLaterThan = 1, processName = ":device")
    public final void initSignValidate() {
        Validator.INSTANCE.addSignature("6284E60CF9322E5D356D715520C294A2B94E0174");
    }
}
