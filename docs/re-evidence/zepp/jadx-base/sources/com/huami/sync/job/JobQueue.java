package com.huami.sync.job;

import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.sync.job.Job;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.notification.TransportUri;
import com.loc.z;
import com.twitter.sdk.android.tweetcomposer.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 Q*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003:\u0002QRB!\u0012\b\b\u0002\u0010N\u001a\u00020K\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0004\bO\u0010PJ\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\fJ/\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040\u000eJ\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013J/\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040\u000eJ/\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040\u000eJ/\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040\u000eJ\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019J\u0014\u0010\u001d\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bJ\u0010\u0010\u001d\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010'0&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R,\u00103\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001000/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00107\u001a\b\u0012\u0004\u0012\u00028\u0000048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001e\u0010F\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u001e\u0010J\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010ER\u0016\u0010M\u001a\u00020K8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010L¨\u0006S"}, d2 = {"Lcom/huami/sync/job/JobQueue;", "Lcom/huami/sync/job/Job;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "start", Command.STOP, "element", TransportUri.ACTION_ADD, "(Lcom/huami/sync/job/Job;)Lcom/huami/sync/job/JobQueue;", "finish", "(Lcom/huami/sync/job/Job;)V", "Lcom/huami/sync/job/Action;", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "job", NotificationCompat.CATEGORY_CALL, "Lcom/huami/sync/job/JobHandlerListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", TransportUri.ACTION_BLOCK, "prepare", g.g, "Ljava/util/concurrent/PriorityBlockingQueue;", "getQueue", "Lcom/huami/sync/job/JobQueue$JobFilter;", "filter", "cancelAll", "tag", "Lcom/huami/sync/job/Interceptor;", "a", "Lcom/huami/sync/job/Interceptor;", "interceptor", "b", "Ljava/util/concurrent/PriorityBlockingQueue;", "jobQueue", "", "Lcom/huami/sync/job/JobDispatcher;", "c", "[Lcom/huami/sync/job/JobDispatcher;", "jobDispatchers", "Lcom/huami/sync/job/Delivery;", GoogleApiAvailabilityLight.a, "Lcom/huami/sync/job/Delivery;", "delivery", "", "Ljava/util/Queue;", "e", "Ljava/util/Map;", "waitingJobQueues", "", "f", "Ljava/util/Set;", "currentJobs", "", "g", "Ljava/util/List;", "jobHandlerListener", "Ljava/util/concurrent/atomic/AtomicInteger;", "h", "Ljava/util/concurrent/atomic/AtomicInteger;", "sequenceGenerator", "i", "Lcom/huami/sync/job/JobHandlerListener;", "jobHandlerCallback", "Lcom/huami/sync/job/JobHandlerListenerAdapter;", z.j, "Lcom/huami/sync/job/JobHandlerListenerAdapter;", "prepareListener", hl.k, "finishListener", "l", "cancelListener", "", "()I", "sequenceNumber", "threadPoolSize", "<init>", "(ILcom/huami/sync/job/Interceptor;)V", "Companion", "JobFilter", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class JobQueue<T extends Job<T>> {
    public static final int DEFAULT_THREAD_POOL_SIZE = 4;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Interceptor<T> interceptor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final PriorityBlockingQueue<T> jobQueue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final JobDispatcher<T>[] jobDispatchers;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Delivery<T> delivery;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Map<Object, Queue<T>> waitingJobQueues;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Set<T> currentJobs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final List<JobHandlerListener<T>> jobHandlerListener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final AtomicInteger sequenceGenerator;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private JobHandlerListener<T> jobHandlerCallback;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private JobHandlerListenerAdapter<T> prepareListener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private JobHandlerListenerAdapter<T> finishListener;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private JobHandlerListenerAdapter<T> cancelListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/huami/sync/job/JobQueue$JobFilter;", ExifInterface.GPS_DIRECTION_TRUE, "", "job", "", "apply", "(Ljava/lang/Object;)Z", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
    public interface JobFilter<T> {
        boolean apply(T job);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JobQueue() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public JobQueue(int i, @NotNull Interceptor<T> interceptor) {
        this.interceptor = interceptor;
        this.jobQueue = new PriorityBlockingQueue<>();
        this.jobDispatchers = new JobDispatcher[i];
        this.delivery = new DefaultDelivery(new Handler(Looper.getMainLooper()));
        this.waitingJobQueues = new HashMap();
        this.currentJobs = new HashSet();
        this.jobHandlerListener = new ArrayList();
        this.sequenceGenerator = new AtomicInteger();
    }

    private final int a() {
        return this.sequenceGenerator.incrementAndGet();
    }

    @NotNull
    public final JobQueue<T> action(@Nullable Action<T> action) {
        int length = this.jobDispatchers.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JobDispatcher<T> jobDispatcher = this.jobDispatchers[i];
                if (jobDispatcher != null) {
                    jobDispatcher.setAction(action);
                }
                if (i2 > length) {
                    break;
                }
                i = i2;
            }
        }
        return this;
    }

    @NotNull
    public final JobQueue<T> add(@NotNull T element) {
        LoggingKt.log("add to queue");
        element.sequence(a());
        synchronized (this.currentJobs) {
            this.currentJobs.add(element);
        }
        if (this.jobHandlerCallback == null) {
            JobHandlerListener<T> jobHandlerListener = new JobHandlerListenerAdapter<T>(this) { // from class: com.huami.sync.job.JobQueue.add.2
                public final /* synthetic */ JobQueue<T> a;

                {
                    this.a = this;
                }

                @Override // com.huami.sync.job.JobHandlerListenerAdapter, com.huami.sync.job.JobHandlerListener
                public void onCancel(@NotNull T job) {
                    this.a.finish(job);
                }

                @Override // com.huami.sync.job.JobHandlerListenerAdapter, com.huami.sync.job.JobHandlerListener
                public void onFinish(@NotNull T job) {
                    this.a.finish(job);
                }
            };
            this.jobHandlerCallback = jobHandlerListener;
            addListener(jobHandlerListener);
        }
        Object repeatFilterKey = element.getRepeatFilterKey();
        if (repeatFilterKey == null) {
            this.jobQueue.add(element);
            return this;
        }
        synchronized (this.waitingJobQueues) {
            if (this.waitingJobQueues.containsKey(repeatFilterKey)) {
                Queue<T> linkedList = this.waitingJobQueues.get(repeatFilterKey);
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                }
                linkedList.add(element);
                this.waitingJobQueues.put(repeatFilterKey, linkedList);
                LoggingKt.log("Job for filterTag =" + repeatFilterKey + " is in flight, putting on hold.");
            } else {
                this.waitingJobQueues.put(repeatFilterKey, null);
                this.jobQueue.add(element);
            }
        }
        return this;
    }

    @NotNull
    public final JobQueue<T> addListener(@NotNull JobHandlerListener<T> listener) {
        if (this.jobHandlerListener.contains(listener)) {
            return this;
        }
        this.jobHandlerListener.add(listener);
        return this;
    }

    @NotNull
    public final JobQueue<T> cancel(@NotNull final Function1<? super T, Unit> block) {
        if (this.cancelListener == null) {
            this.cancelListener = (JobHandlerListenerAdapter<T>) new JobHandlerListenerAdapter<T>() { // from class: com.huami.sync.job.JobQueue.cancel.1
                @Override // com.huami.sync.job.JobHandlerListenerAdapter, com.huami.sync.job.JobHandlerListener
                public void onCancel(@NotNull T job) {
                    block.invoke(job);
                }
            };
        }
        JobHandlerListenerAdapter<T> jobHandlerListenerAdapter = this.cancelListener;
        if (jobHandlerListenerAdapter != null && !this.jobHandlerListener.contains(jobHandlerListenerAdapter)) {
            this.jobHandlerListener.add(jobHandlerListenerAdapter);
        }
        return this;
    }

    public final void cancelAll(@NotNull JobFilter<T> filter) {
        synchronized (this.currentJobs) {
            for (T t : this.currentJobs) {
                if (filter.apply(t)) {
                    t.cancel();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void finish(@NotNull T element) {
        synchronized (this.currentJobs) {
            this.currentJobs.remove(element);
        }
        Object repeatFilterKey = element.getRepeatFilterKey();
        if (repeatFilterKey != null) {
            synchronized (this.waitingJobQueues) {
                Queue<T> queueRemove = this.waitingJobQueues.remove(repeatFilterKey);
                if (queueRemove != null) {
                    LoggingKt.log("Releasing " + queueRemove.size() + " waiting jobs for filterTag=" + repeatFilterKey);
                    this.jobQueue.addAll(queueRemove);
                }
                Unit unit = Unit.INSTANCE;
            }
            return;
        }
        if (!this.waitingJobQueues.isEmpty()) {
            synchronized (this.waitingJobQueues) {
                Iterator<Map.Entry<Object, Queue<T>>> it2 = this.waitingJobQueues.entrySet().iterator();
                while (it2.hasNext()) {
                    Object key = it2.next().getKey();
                    Queue<T> queueRemove2 = this.waitingJobQueues.remove(key);
                    if (queueRemove2 != null) {
                        LoggingKt.log("Releasing " + queueRemove2.size() + " waiting jobs for filterTag=" + key);
                        this.jobQueue.addAll(queueRemove2);
                    }
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    @NotNull
    public final PriorityBlockingQueue<T> getQueue() {
        return this.jobQueue;
    }

    @NotNull
    public final JobQueue<T> prepare(@NotNull final Function1<? super T, Unit> block) {
        if (this.prepareListener == null) {
            this.prepareListener = (JobHandlerListenerAdapter<T>) new JobHandlerListenerAdapter<T>() { // from class: com.huami.sync.job.JobQueue.prepare.1
                @Override // com.huami.sync.job.JobHandlerListenerAdapter, com.huami.sync.job.JobHandlerListener
                public void onPrepare(@NotNull T job) {
                    block.invoke(job);
                }
            };
        }
        JobHandlerListenerAdapter<T> jobHandlerListenerAdapter = this.prepareListener;
        if (jobHandlerListenerAdapter != null && !this.jobHandlerListener.contains(jobHandlerListenerAdapter)) {
            this.jobHandlerListener.add(jobHandlerListenerAdapter);
        }
        return this;
    }

    public final void start() {
        stop();
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(this.jobDispatchers.length);
        Objects.requireNonNull(executorServiceNewFixedThreadPool, "null cannot be cast to non-null type java.util.concurrent.ThreadPoolExecutor");
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorServiceNewFixedThreadPool;
        int i = 0;
        int length = this.jobDispatchers.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = i + 1;
            JobDispatcher<T> jobDispatcher = new JobDispatcher<>(this.jobQueue, this.interceptor, this.delivery, this.jobHandlerListener);
            this.jobDispatchers[i] = jobDispatcher;
            threadPoolExecutor.submit(jobDispatcher);
            if (i2 > length) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final void stop() {
        for (JobDispatcher<T> jobDispatcher : this.jobDispatchers) {
            if (jobDispatcher != null) {
                jobDispatcher.quit();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final JobQueue<T> action(@NotNull final Function1<? super T, Unit> call) {
        int length = this.jobDispatchers.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JobDispatcher jobDispatcher = this.jobDispatchers[i];
                if (jobDispatcher != 0) {
                    jobDispatcher.setAction(new Action<T>() { // from class: com.huami.sync.job.JobQueue.action.1
                        @Override // com.huami.sync.job.Action
                        public void call(@NotNull T element) {
                            call.invoke(element);
                        }
                    });
                }
                if (i2 > length) {
                    break;
                }
                i = i2;
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void cancelAll(@Nullable final Object tag) {
        if (tag != null) {
            cancelAll((JobFilter) new JobFilter<T>() { // from class: com.huami.sync.job.JobQueue.cancelAll.3
                @Override // com.huami.sync.job.JobQueue.JobFilter
                public boolean apply(@NotNull T job) {
                    return job.getTag() == tag;
                }
            });
            return;
        }
        throw new IllegalArgumentException("Cannot cancelAll with a null tag".toString());
    }

    public /* synthetic */ JobQueue(int i, Interceptor interceptor, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 4 : i, (i2 & 2) != 0 ? new Interceptor<T>() { // from class: com.huami.sync.job.JobQueue.1
            @Override // com.huami.sync.job.Interceptor
            public boolean onIntercept(@NotNull T job) {
                return false;
            }
        } : interceptor);
    }

    @NotNull
    public final JobQueue<T> finish(@NotNull final Function1<? super T, Unit> block) {
        if (this.finishListener == null) {
            this.finishListener = (JobHandlerListenerAdapter<T>) new JobHandlerListenerAdapter<T>() { // from class: com.huami.sync.job.JobQueue.finish.4
                @Override // com.huami.sync.job.JobHandlerListenerAdapter, com.huami.sync.job.JobHandlerListener
                public void onFinish(@NotNull T job) {
                    block.invoke(job);
                }
            };
        }
        JobHandlerListenerAdapter<T> jobHandlerListenerAdapter = this.finishListener;
        if (jobHandlerListenerAdapter != null && !this.jobHandlerListener.contains(jobHandlerListenerAdapter)) {
            this.jobHandlerListener.add(jobHandlerListenerAdapter);
        }
        return this;
    }
}
