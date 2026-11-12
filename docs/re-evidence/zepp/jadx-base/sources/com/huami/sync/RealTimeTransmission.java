package com.huami.sync;

import android.app.Activity;
import android.app.Application;
import com.huami.sync.job.LoggingKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.dataflow.Constant;
import com.huami.watch.companion.mediac.Command;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0007J\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0014J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001c\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/huami/sync/RealTimeTransmission;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/app/Activity;", DbUtils.Const.Table.CONTEXT, "", "currentHr", "currentSteps", "currentCalories", "", "openTransmissionActivity", "Lkotlin/Function0;", "callback", "Lkotlinx/coroutines/Job;", Command.STOP, "Lcom/huami/sync/Step;", "step", "notifyStepReceived", "Lcom/huami/sync/HeartRate;", Constant.KEY_HR_VALUE, "notifyHeartRateReceived", "Landroid/app/Application;", PointCategory.INIT, "", "isOpen", "()Ljava/lang/Boolean;", "a", "Lkotlin/Lazy;", "()Lkotlinx/coroutines/Job;", "job", "Lcom/huami/sync/TransmissionSource;", "b", "Lcom/huami/sync/TransmissionSource;", "transmissionSource", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class RealTimeTransmission implements CoroutineScope {

    @NotNull
    public static final RealTimeTransmission INSTANCE = new RealTimeTransmission();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy job = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static TransmissionSource transmissionSource;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "success", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ TransmissionSource a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TransmissionSource transmissionSource) {
            super(1);
            this.a = transmissionSource;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            LoggingKt.log(Intrinsics.stringPlus("开启轮询", Boolean.valueOf(z)));
            this.a.saveToggle(z);
            this.a.saveLastSendTime(System.currentTimeMillis());
            if (z) {
                Config.INSTANCE.getOnAutoOpen().invoke();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<CompletableJob> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob invoke() {
            return JobKt__JobKt.d(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0<Unit> function0) {
            super(0);
            this.a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            TransmissionSource transmissionSource = RealTimeTransmission.transmissionSource;
            if (transmissionSource != null) {
                transmissionSource.saveToggle(false);
            }
            this.a.invoke();
        }
    }

    private RealTimeTransmission() {
    }

    private final Job a() {
        return (Job) job.getValue();
    }

    @JvmStatic
    public static final void openTransmissionActivity(@NotNull Activity context, int currentHr, int currentSteps, int currentCalories) {
        context.startActivity(TransmissionActivity.INSTANCE.getIntent(context, currentHr, currentSteps, currentCalories));
    }

    @JvmStatic
    @Nullable
    public static final Job stop(@NotNull Function0<Unit> callback) {
        TransmissionSource transmissionSource2 = transmissionSource;
        if (transmissionSource2 == null) {
            return null;
        }
        return transmissionSource2.stopPoll(new d(callback));
    }

    public static /* synthetic */ Job stop$default(Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = c.a;
        }
        return stop(function0);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return a().plus(Dispatchers.getIO());
    }

    public final void init(@NotNull Application context) {
        TransmissionSource transmissionSource2 = new TransmissionSource(context, this);
        transmissionSource = transmissionSource2;
        if (transmissionSource2.isOpen()) {
            LoggingKt.log("当前本地实时数据开关已开启");
            transmissionSource2.startPoll(new a(transmissionSource2));
        }
        LoggingKt.log("当前本地实时数据开关已关闭");
    }

    @Nullable
    public final Boolean isOpen() {
        TransmissionSource transmissionSource2 = transmissionSource;
        if (transmissionSource2 == null) {
            return null;
        }
        return Boolean.valueOf(transmissionSource2.isOpen());
    }

    public final void notifyHeartRateReceived(@NotNull HeartRate heartRate) {
        DataReceiver.INSTANCE.notifyHeartRateReceived(heartRate);
    }

    public final void notifyStepReceived(@NotNull Step step) {
        DataReceiver.INSTANCE.notifyStepReceived(step);
    }
}
