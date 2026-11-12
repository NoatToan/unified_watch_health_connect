package com.xiaomi.fitness;

import android.content.Context;
import androidx.work.Configuration;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.component.AppCallbackMediator;
import com.xiaomi.fitness.component.ComponentConfigProvider;
import com.xiaomi.fitness.dataprovider.DataProviderManager;
import com.xiaomi.fitness.exception.ExceptionCapture;
import com.xiaomi.fitness.helper.CrashHandler;
import com.xiaomi.fitness.initialization.Initializer;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.wm5;
import java.lang.reflect.Constructor;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/FitnessApp;", "Lcom/xiaomi/fitness/baseui/BaseApplication;", "Landroidx/work/Configuration$Provider;", "<init>", "()V", "onCreate", "", "initWhenAttachBaseContext", "base", "Landroid/content/Context;", "attachBaseContext", MediaStoreUtil.MediaInfo.SIZE, "", "workManagerConfiguration", "Landroidx/work/Configuration;", "getWorkManagerConfiguration", "()Landroidx/work/Configuration;", "app_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class FitnessApp extends Hilt_FitnessApp implements Configuration.Provider {
    private final int size = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));

    @Override // com.xiaomi.fitness.baseui.BaseApplication, com.xiaomi.fitness.component.AbsComponentizedApplication, android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        super.attachBaseContext(base);
        DataProviderManager.INSTANCE.getInstance().deploy(wm5.a());
    }

    @Override // androidx.work.Configuration.Provider
    @NotNull
    public Configuration getWorkManagerConfiguration() {
        return new Configuration.Builder().setExecutor(ExecutorHelper.getBackgroundPool()).setTaskExecutor(new ExecutorHelper.Builder("worker-task").setCoreSize(this.size).setMaxSize(this.size).setKeepTimeSec(0L).setBlockingQueue(new LinkedBlockingQueue()).build()).setMaxSchedulerLimit(50).build();
    }

    @Override // com.xiaomi.fitness.baseui.BaseApplication, com.xiaomi.fitness.component.AbsComponentizedApplication
    public void initWhenAttachBaseContext(@NotNull Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Constructor<?> constructor = Initializer.class.getConstructors()[0];
            Intrinsics.checkNotNull(constructor);
            Object objNewInstance = constructor.newInstance(new Object[0]);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            StringBuilder sb = new StringBuilder();
            sb.append(" reflection duration:");
            sb.append(jCurrentTimeMillis2);
            AppCallbackMediator appCallbackMediator = AppCallbackMediator.INSTANCE;
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.xiaomi.fitness.component.ComponentConfigProvider");
            appCallbackMediator.init((ComponentConfigProvider) objNewInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.fitness.Hilt_FitnessApp, com.xiaomi.fitness.component.AbsComponentizedApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        CrashHandler.INSTANCE.getInstance().init(this);
        ExceptionCapture.INSTANCE.initExceptionMonitor(this);
    }
}
