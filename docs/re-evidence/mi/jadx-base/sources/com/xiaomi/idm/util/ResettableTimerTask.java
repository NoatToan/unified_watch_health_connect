package com.xiaomi.idm.util;

import com.xiaomi.idm.util.ResettableTimerTask;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.gj8;
import defpackage.ij8;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.jodah.expiringmap.ExpirationPolicy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bRT\u0010\r\u001aB\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\f0\f \u000b* \u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\f0\f\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/idm/util/ResettableTimerTask;", "", "", "reschedule", "()V", BroadcastsKt.SILENT_PUSHING_CANCEL, "Lkotlin/Function0;", "task", "Lkotlin/jvm/functions/Function0;", "Lij8;", "", "kotlin.jvm.PlatformType", "Ljava/lang/Runnable;", "expiringMap", "Lij8;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "IDMSdk_release"}, k = 1, mv = {1, 5, 1})
public final class ResettableTimerTask {
    private final ij8<String, Runnable> expiringMap;

    @NotNull
    private final Function0<Unit> task;

    public ResettableTimerTask(@NotNull Function0<Unit> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.task = task;
        ij8<String, Runnable> expiringMap = ij8.d().m(ExpirationPolicy.ACCESSED).k(2L, TimeUnit.SECONDS).l(new gj8() { // from class: upk
            @Override // defpackage.gj8
            public final void a(Object obj, Object obj2) {
                ResettableTimerTask.m671expiringMap$lambda0((String) obj, (Runnable) obj2);
            }
        }).j();
        this.expiringMap = expiringMap;
        Intrinsics.checkNotNullExpressionValue(expiringMap, "expiringMap");
        expiringMap.put("", new Runnable() { // from class: vpk
            @Override // java.lang.Runnable
            public final void run() {
                ResettableTimerTask.m670_init_$lambda1(this.f37113a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    public static final void m670_init_$lambda1(ResettableTimerTask this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.task.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: expiringMap$lambda-0, reason: not valid java name */
    public static final void m671expiringMap$lambda0(String noName_0, Runnable value) {
        Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
        Intrinsics.checkNotNullParameter(value, "value");
        value.run();
    }

    public final void cancel() {
        this.expiringMap.clear();
    }

    public final void reschedule() {
        this.expiringMap.get("");
    }
}
