package com.xiaomi.hm.health.utils;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.os.strictmode.Violation;
import androidx.annotation.RequiresApi;
import com.huami.apm.prod.service.ApmCrashApi;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.utils.StrictModeHelper;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.q;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003R\u001e\u0010\r\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/utils/StrictModeHelper;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", PointCategory.INIT, "Landroid/os/strictmode/Violation;", "v", "e", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "a", "Ljava/util/concurrent/ExecutorService;", "executor", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class StrictModeHelper {

    @NotNull
    public static final StrictModeHelper INSTANCE = new StrictModeHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final ExecutorService executor = Executors.newSingleThreadExecutor();

    private StrictModeHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Violation violation) {
        INSTANCE.e(violation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Violation violation) {
        INSTANCE.e(violation);
    }

    @RequiresApi(28)
    private final void e(Violation v) {
        ApmCrashApi apmCrashApi;
        Koin orNull = GlobalContext.INSTANCE.getOrNull();
        if (orNull == null || (apmCrashApi = (ApmCrashApi) orNull.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(ApmCrashApi.class), null, null)) == null) {
            return;
        }
        apmCrashApi.recordException(q.mapOf(TuplesKt.to("type", "StrictMode")), v);
    }

    @JvmStatic
    public static final void init(@NotNull Context context) {
        File file = new File(FileUtils.getLogRootDir(context));
        if (!file.exists()) {
            file.mkdirs();
        }
        StrictMode.ThreadPolicy.Builder builderDetectDiskReads = new StrictMode.ThreadPolicy.Builder().detectAll().detectDiskReads();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            builderDetectDiskReads.penaltyListener(executor, new StrictMode.OnThreadViolationListener() { // from class: ih7
                @Override // android.os.StrictMode.OnThreadViolationListener
                public final void onThreadViolation(Violation violation) {
                    StrictModeHelper.c(violation);
                }
            });
        }
        StrictMode.setThreadPolicy(builderDetectDiskReads.build());
        StrictMode.VmPolicy.Builder builderDetectAll = new StrictMode.VmPolicy.Builder().detectAll();
        if (i >= 28) {
            builderDetectAll.penaltyListener(executor, new StrictMode.OnVmViolationListener() { // from class: jh7
                @Override // android.os.StrictMode.OnVmViolationListener
                public final void onVmViolation(Violation violation) {
                    StrictModeHelper.d(violation);
                }
            });
        }
        StrictMode.setVmPolicy(builderDetectAll.build());
    }
}
