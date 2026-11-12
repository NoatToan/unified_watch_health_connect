package com.huami.sync;

import com.huami.sync.job.JobHandler;
import com.huami.sync.job.JobHandlerKt;
import com.huami.sync.job.JobQueue;
import com.huami.sync.job.LoggingKt;
import com.huami.sync.job.Poller;
import com.huami.sync.job.PollerKt;
import com.huami.watch.companion.mediac.Command;
import io.netty.util.internal.StringUtil;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0014\u0010\u0006\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\t\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/sync/TransmissionPoller;", "", "", Command.STOP, "Lkotlin/Function0;", "onPoll", "start", "Lcom/huami/sync/job/JobHandler;", "Lcom/huami/sync/TransmissionJob;", "a", "Lcom/huami/sync/job/JobHandler;", "jobHandler", "Lcom/huami/sync/job/Poller;", "b", "Lcom/huami/sync/job/Poller;", "poller", "Lcom/huami/sync/NetSourceImpl;", "c", "Lkotlin/Lazy;", "()Lcom/huami/sync/NetSourceImpl;", "netSource", "<init>", "()V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class TransmissionPoller {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static JobHandler<TransmissionJob> jobHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static Poller poller;

    @NotNull
    public static final TransmissionPoller INSTANCE = new TransmissionPoller();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy netSource = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sync/NetSourceImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<NetSourceImpl> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetSourceImpl invoke() {
            return new NetSourceImpl();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/sync/job/JobQueue;", "Lcom/huami/sync/TransmissionJob;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<JobQueue<TransmissionJob>, Unit> {
            public static final a a = new a();

            /* JADX INFO: renamed from: com.huami.sync.TransmissionPoller$b$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sync/TransmissionJob;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0610a extends Lambda implements Function1<TransmissionJob, Unit> {
                public static final C0610a a = new C0610a();

                public C0610a() {
                    super(1);
                }

                public final void a(@NotNull TransmissionJob transmissionJob) throws Exception {
                    UploadResult uploadResultUpload = TransmissionPoller.INSTANCE.a().upload(transmissionJob.getHeartRate(), transmissionJob.getSteps(), transmissionJob.getCalories(), transmissionJob.getTime());
                    if (uploadResultUpload != null) {
                        long realTimeRate = uploadResultUpload.getRealTimeRate() * ((long) 1000);
                        if (realTimeRate > 0) {
                            Config config = Config.INSTANCE;
                            config.setPollPeriod(realTimeRate);
                            Poller poller = TransmissionPoller.poller;
                            if (poller != null) {
                                poller.setPeriod(config.getPollPeriod());
                            }
                        }
                    }
                    LoggingKt.log("执行上传操作" + transmissionJob.getHeartRate() + StringUtil.SPACE + transmissionJob.getSteps() + StringUtil.SPACE + transmissionJob.getCalories() + StringUtil.SPACE);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TransmissionJob transmissionJob) throws Exception {
                    a(transmissionJob);
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.huami.sync.TransmissionPoller$b$a$b, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sync/TransmissionJob;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0611b extends Lambda implements Function1<TransmissionJob, Unit> {
                public static final C0611b a = new C0611b();

                public C0611b() {
                    super(1);
                }

                public final void a(@NotNull TransmissionJob transmissionJob) {
                    LoggingKt.log("action操作执行完毕" + transmissionJob.getHeartRate() + StringUtil.SPACE + transmissionJob.getSteps() + StringUtil.SPACE + transmissionJob.getCalories() + StringUtil.SPACE);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TransmissionJob transmissionJob) {
                    a(transmissionJob);
                    return Unit.INSTANCE;
                }
            }

            public a() {
                super(1);
            }

            public final void a(@NotNull JobQueue<TransmissionJob> jobQueue) {
                jobQueue.action(C0610a.a);
                jobQueue.finish(C0611b.a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JobQueue<TransmissionJob> jobQueue) {
                a(jobQueue);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0<Unit> function0) {
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
            this.a.invoke();
            StringBuilder sb = new StringBuilder();
            sb.append("当前轮询间隔 ");
            Poller poller = TransmissionPoller.poller;
            sb.append(poller == null ? null : Long.valueOf(poller.getPeriod()));
            sb.append(" 毫秒");
            LoggingKt.log(sb.toString());
            if (TransmissionPoller.jobHandler == null) {
                TransmissionPoller transmissionPoller = TransmissionPoller.INSTANCE;
                TransmissionPoller.jobHandler = JobHandlerKt.JobHandler$default(Config.INSTANCE.getThreadNum(), null, null, 6, null);
            }
            TransmissionJob transmissionJobGenerateJob = DataReceiver.INSTANCE.generateJob();
            if (transmissionJobGenerateJob == null) {
                return;
            }
            JobHandler jobHandler = TransmissionPoller.jobHandler;
            if (jobHandler != null) {
                jobHandler.enqueue(transmissionJobGenerateJob, a.a);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("当前队列情况");
            JobHandler jobHandler2 = TransmissionPoller.jobHandler;
            sb2.append(jobHandler2 != null ? jobHandler2.getQueue() : null);
            sb2.append(StringUtil.SPACE);
            LoggingKt.log(sb2.toString());
        }
    }

    private TransmissionPoller() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetSourceImpl a() {
        return (NetSourceImpl) netSource.getValue();
    }

    @JvmStatic
    public static final void stop() {
        LoggingKt.log("终止轮询线程，清除任务队列");
        Poller poller2 = poller;
        if (poller2 != null) {
            poller2.stop();
        }
        LoggingKt.log("轮询线程已终止");
        JobHandler<TransmissionJob> jobHandler2 = jobHandler;
        if (jobHandler2 != null) {
            jobHandler2.cancelAll(TransmissionJob.TAG);
        }
        LoggingKt.log("任务队列已清除");
    }

    public final void start(@NotNull Function0<Unit> onPoll) {
        stop();
        LoggingKt.log("开启轮询");
        poller = PollerKt.Poll$default(0L, Config.INSTANCE.getPollPeriod(), null, new b(onPoll), 5, null);
    }
}
