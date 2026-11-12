package com.huami.userproperty.throttle;

import android.util.Log;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.UserPropertyModuleKt;
import com.huami.userproperty.throttle.PushThrottleManager;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R$\u0010\n\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u00030\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/userproperty/throttle/PushThrottleManager;", "", "Lkotlin/Function0;", "", "pushAction", "scheduleNextPush", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "a", "Lio/reactivex/subjects/PublishSubject;", "events", "", "b", "J", "throttlePeriodMillis", "<init>", "()V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public final class PushThrottleManager {

    @NotNull
    public static final PushThrottleManager INSTANCE = new PushThrottleManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final PublishSubject<Unit> events = PublishSubject.create();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static long throttlePeriodMillis = 10000;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("规划批量上传任务：", new Date());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("执行批量上传任务：", new Date());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("上传失败：", Log.getStackTraceString(this.a));
        }
    }

    private PushThrottleManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function0 function0, Unit unit) {
        function0.getA();
        HMLog.verbose(UserPropertyModuleKt.MODULE_TAG, b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Throwable th) {
        HMLog.info(UserPropertyModuleKt.MODULE_TAG, new c(th));
    }

    public final void scheduleNextPush(@NotNull final Function0<Unit> pushAction) {
        HMLog.verbose(UserPropertyModuleKt.MODULE_TAG, a.a);
        PublishSubject<Unit> publishSubject = events;
        synchronized (publishSubject) {
            if (publishSubject.hasObservers()) {
                publishSubject.onNext(Unit.INSTANCE);
            } else {
                publishSubject.toFlowable(BackpressureStrategy.LATEST).throttleLast(throttlePeriodMillis, TimeUnit.MILLISECONDS).observeOn(Schedulers.io()).subscribe(new Consumer() { // from class: a56
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        PushThrottleManager.c(pushAction, (Unit) obj);
                    }
                }, new Consumer() { // from class: b56
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        PushThrottleManager.d((Throwable) obj);
                    }
                });
                publishSubject.onNext(Unit.INSTANCE);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
