package com.huami.tools.analytics.rt.timer;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.Config;
import com.huami.tools.analytics.Event;
import com.huami.tools.analytics.HitEvent;
import com.huami.tools.analytics.Logger;
import com.huami.tools.analytics.rt.queue.EventQueueManager;
import com.huami.watch.companion.mediac.Command;
import java.util.List;
import java.util.Timer;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b&\u0010'J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR(\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00040\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001d\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u0013\u0010\u001cR\u001d\u0010!\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u000f\u0010 R\u001d\u0010%\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b\t\u0010$¨\u0006("}, d2 = {"Lcom/huami/tools/analytics/rt/timer/TimerTaskManager;", "", "Lcom/huami/tools/analytics/HitEvent;", "e", "", "enQueue", "start", Command.STOP, "Lcom/huami/tools/analytics/Config;", "a", "Lcom/huami/tools/analytics/Config;", "config", "Lkotlin/Function1;", "", "Lcom/huami/tools/analytics/Event;", "b", "Lkotlin/jvm/functions/Function1;", "uploadFun", "", "c", "Ljava/lang/String;", "tag", "", GoogleApiAvailabilityLight.a, "Z", "enable", "Ljava/util/Timer;", "Lkotlin/Lazy;", "()Ljava/util/Timer;", "timer", "Lcom/huami/tools/analytics/rt/timer/UploadEventTask;", "f", "()Lcom/huami/tools/analytics/rt/timer/UploadEventTask;", "task", "Lcom/huami/tools/analytics/rt/queue/EventQueueManager;", "g", "()Lcom/huami/tools/analytics/rt/queue/EventQueueManager;", "queueManager", "<init>", "(Lcom/huami/tools/analytics/Config;Lkotlin/jvm/functions/Function1;)V", "analytics_release"}, k = 1, mv = {1, 5, 1})
public final class TimerTaskManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Config config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function1<List<Event>, Unit> uploadFun;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean enable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy timer = LazyKt__LazyJVMKt.lazy(e.a);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy task = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy queueManager = LazyKt__LazyJVMKt.lazy(c.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/tools/analytics/Logger;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Logger, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Logger logger) {
            logger.e(TimerTaskManager.this.tag, "超出队列最大值限制");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Logger logger) {
            a(logger);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/tools/analytics/Logger;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Logger, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull Logger logger) {
            logger.v(TimerTaskManager.this.tag, "条数达到限制自动触发了上传机制");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Logger logger) {
            a(logger);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/tools/analytics/rt/queue/EventQueueManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<EventQueueManager> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EventQueueManager invoke() {
            return new EventQueueManager();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/tools/analytics/rt/timer/UploadEventTask;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<UploadEventTask> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UploadEventTask invoke() {
            return new UploadEventTask(TimerTaskManager.this.config, TimerTaskManager.this.a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/util/Timer;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Timer> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Timer invoke() {
            return new Timer();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TimerTaskManager(@NotNull Config config, @NotNull Function1<? super List<Event>, Unit> function1) {
        this.config = config;
        this.uploadFun = function1;
        this.tag = config.getTag();
        this.enable = config.getAutoStart();
        b().setUploadEvent(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EventQueueManager a() {
        return (EventQueueManager) this.queueManager.getValue();
    }

    private final UploadEventTask b() {
        return (UploadEventTask) this.task.getValue();
    }

    private final Timer c() {
        return (Timer) this.timer.getValue();
    }

    public final void enQueue(@NotNull HitEvent e2) {
        if (a().count() > this.config.getQueueMaxSize()) {
            this.config.printlnLog(new a());
            return;
        }
        a().enQueue(e2);
        if (a().count() > this.config.getLimitSize()) {
            if (this.config.getDebug()) {
                this.config.printlnLog(new b());
            }
            this.config.getUploadExecutor().execute(new QuickUploadEventTask(a(), this.uploadFun));
        }
    }

    public final void start() {
        if (this.enable) {
            c().scheduleAtFixedRate(b(), this.config.getTicker(), this.config.getTicker());
        }
    }

    public final void stop() {
        c().cancel();
    }
}
