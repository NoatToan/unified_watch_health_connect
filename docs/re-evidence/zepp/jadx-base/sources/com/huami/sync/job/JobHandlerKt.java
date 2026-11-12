package com.huami.sync.job;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.share.model.ShareStoryContent;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005\u001aW\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¨\u0006\u000e"}, d2 = {"Lcom/huami/sync/job/Job;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Lcom/huami/sync/job/JobHandler$Builder;", "", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "Lcom/huami/sync/job/JobHandler;", ShareStoryContent.Builder.k, "", "threadPoolSize", "Lcom/huami/sync/job/Interceptor;", "interceptor", "JobHandler", "realtime_transmission_release"}, k = 2, mv = {1, 5, 1})
public final class JobHandlerKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n"}, d2 = {"Lcom/huami/sync/job/Job;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/sync/job/JobHandler;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a<T> extends Lambda implements Function1<JobHandler<T>, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull JobHandler<T> jobHandler) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a((JobHandler) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n"}, d2 = {"Lcom/huami/sync/job/Job;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/sync/job/JobHandler$Builder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b<T> extends Lambda implements Function1<JobHandler.Builder<T>, Unit> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Interceptor<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, Interceptor<T> interceptor) {
            super(1);
            this.a = i;
            this.b = interceptor;
        }

        public final void a(@NotNull JobHandler.Builder<T> builder) {
            builder.setThreadPoolSize$realtime_transmission_release(this.a);
            builder.setInterceptor$realtime_transmission_release(this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a((JobHandler.Builder) obj);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final <T extends Job<T>> JobHandler<T> Builder(@NotNull Function1<? super JobHandler.Builder<T>, Unit> function1) {
        JobHandler.Builder builder = new JobHandler.Builder();
        function1.invoke(builder);
        return builder.build();
    }

    @NotNull
    public static final <T extends Job<T>> JobHandler<T> JobHandler(int i, @NotNull Interceptor<T> interceptor, @NotNull Function1<? super JobHandler<T>, Unit> function1) {
        JobHandler<T> jobHandlerBuilder = Builder(new b(i, interceptor));
        function1.invoke(jobHandlerBuilder);
        return jobHandlerBuilder;
    }

    public static /* synthetic */ JobHandler JobHandler$default(int i, Interceptor interceptor, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 4;
        }
        if ((i2 & 2) != 0) {
            interceptor = new Interceptor<T>() { // from class: com.huami.sync.job.JobHandlerKt.JobHandler.1
                /* JADX WARN: Incorrect types in method signature: (TT;)Z */
                @Override // com.huami.sync.job.Interceptor
                public boolean onIntercept(@NotNull Job job) {
                    return false;
                }
            };
        }
        if ((i2 & 4) != 0) {
            function1 = a.a;
        }
        return JobHandler(i, interceptor, function1);
    }
}
