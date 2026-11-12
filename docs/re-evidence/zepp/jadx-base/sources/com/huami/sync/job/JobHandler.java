package com.huami.sync.job;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.share.model.ShareStoryContent;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huami.sync.job.Job;
import com.huami.watch.notification.TransportUri;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003:\u0001\"B\u0017\b\u0002\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b \u0010!J:\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u001d\u0010\t\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0001\u0010\f2\u0006\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0013\u0010\u001c¨\u0006#"}, d2 = {"Lcom/huami/sync/job/JobHandler;", "Lcom/huami/sync/job/Job;", ExifInterface.GPS_DIRECTION_TRUE, "", "element", "Lkotlin/Function1;", "Lcom/huami/sync/job/JobQueue;", "", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "enqueue", "(Lcom/huami/sync/job/Job;Lkotlin/jvm/functions/Function1;)Lcom/huami/sync/job/JobQueue;", "TAG", "tag", "cancelAll", "(Ljava/lang/Object;)Lcom/huami/sync/job/JobQueue;", "Ljava/util/concurrent/PriorityBlockingQueue;", "getQueue", "", "a", LogUtil.I, "threadPoolSize", "Lcom/huami/sync/job/Interceptor;", "b", "Lcom/huami/sync/job/Interceptor;", "interceptor", "c", "Lkotlin/Lazy;", "()Lcom/huami/sync/job/JobQueue;", "jobQueue", "Lcom/huami/sync/job/JobHandler$Builder;", "builder", "<init>", "(Lcom/huami/sync/job/JobHandler$Builder;)V", ShareStoryContent.Builder.k, "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class JobHandler<T extends Job<T>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int threadPoolSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Interceptor<T> interceptor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy jobQueue;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000*\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/sync/job/JobHandler$Builder;", "Lcom/huami/sync/job/Job;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "threadPoolSize", "Lcom/huami/sync/job/Interceptor;", "interceptor", "Lcom/huami/sync/job/JobHandler;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "a", LogUtil.I, "getThreadPoolSize$realtime_transmission_release", "()I", "setThreadPoolSize$realtime_transmission_release", "(I)V", "b", "Lcom/huami/sync/job/Interceptor;", "getInterceptor$realtime_transmission_release", "()Lcom/huami/sync/job/Interceptor;", "setInterceptor$realtime_transmission_release", "(Lcom/huami/sync/job/Interceptor;)V", "<init>", "()V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder<T extends Job<T>> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private int threadPoolSize = 4;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private Interceptor<T> interceptor = (Interceptor<T>) new Interceptor<T>() { // from class: com.huami.sync.job.JobHandler$Builder$interceptor$1
            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            @Override // com.huami.sync.job.Interceptor
            public boolean onIntercept(@NotNull Job job) {
                return false;
            }
        };

        @NotNull
        public final JobHandler<T> build() {
            return new JobHandler<>(this, null);
        }

        @NotNull
        public final Interceptor<T> getInterceptor$realtime_transmission_release() {
            return this.interceptor;
        }

        /* JADX INFO: renamed from: getThreadPoolSize$realtime_transmission_release, reason: from getter */
        public final int getThreadPoolSize() {
            return this.threadPoolSize;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final Builder<?> interceptor(@NotNull Interceptor<T> interceptor) {
            this.interceptor = interceptor;
            return this;
        }

        public final void setInterceptor$realtime_transmission_release(@NotNull Interceptor<T> interceptor) {
            this.interceptor = interceptor;
        }

        public final void setThreadPoolSize$realtime_transmission_release(int i) {
            this.threadPoolSize = i;
        }

        @NotNull
        public final Builder<T> threadPoolSize(int threadPoolSize) {
            this.threadPoolSize = threadPoolSize;
            return this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000H\n"}, d2 = {"Lcom/huami/sync/job/Job;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/sync/job/JobQueue;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<JobQueue<T>> {
        public final /* synthetic */ JobHandler<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JobHandler<T> jobHandler) {
            super(0);
            this.a = jobHandler;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JobQueue<T> invoke() {
            return new JobQueue<>(((JobHandler) this.a).threadPoolSize, ((JobHandler) this.a).interceptor);
        }
    }

    private JobHandler(Builder<T> builder) {
        this.threadPoolSize = builder.getThreadPoolSize();
        this.interceptor = builder.getInterceptor$realtime_transmission_release();
        this.jobQueue = LazyKt__LazyJVMKt.lazy(new a(this));
        a().start();
    }

    public /* synthetic */ JobHandler(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    private final JobQueue<T> a() {
        return (JobQueue) this.jobQueue.getValue();
    }

    @NotNull
    public final <TAG> JobQueue<T> cancelAll(TAG tag) {
        a().cancelAll(tag);
        return a();
    }

    @NotNull
    public final JobQueue<T> enqueue(@NotNull T element, @NotNull Function1<? super JobQueue<T>, Unit> block) {
        JobQueue<T> jobQueueAdd = a().add(element);
        block.invoke(jobQueueAdd);
        return jobQueueAdd;
    }

    @NotNull
    public final PriorityBlockingQueue<T> getQueue() {
        return a().getQueue();
    }
}
