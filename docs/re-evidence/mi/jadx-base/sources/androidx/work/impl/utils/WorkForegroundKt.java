package androidx.work.impl.utils;

import android.content.Context;
import android.os.Build;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.work.impl.WorkerWrapperKt;
import androidx.work.impl.model.WorkSpec;
import defpackage.lhe;
import defpackage.m1p;
import defpackage.ppe;
import defpackage.q0a;
import defpackage.t0a;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/work/impl/model/WorkSpec;", "spec", "Landroidx/work/a;", "worker", "Lt0a;", "foregroundUpdater", "Lm1p;", "taskExecutor", "", "workForeground", "(Landroid/content/Context;Landroidx/work/impl/model/WorkSpec;Landroidx/work/a;Lt0a;Lm1p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "TAG", "Ljava/lang/String;", "work-runtime_release"}, k = 2, mv = {1, 8, 0})
public final class WorkForegroundKt {

    @NotNull
    private static final String TAG;

    /* JADX INFO: renamed from: androidx.work.impl.utils.WorkForegroundKt$workForeground$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", f = "WorkForeground.kt", i = {}, l = {42, 50}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nWorkForeground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkForeground.kt\nandroidx/work/impl/utils/WorkForegroundKt$workForeground$2\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n*L\n1#1,55:1\n19#2:56\n*S KotlinDebug\n*F\n+ 1 WorkForeground.kt\nandroidx/work/impl/utils/WorkForegroundKt$workForeground$2\n*L\n49#1:56\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Void>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ t0a $foregroundUpdater;
        final /* synthetic */ WorkSpec $spec;
        final /* synthetic */ androidx.work.a $worker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(androidx.work.a aVar, WorkSpec workSpec, t0a t0aVar, Context context, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$worker = aVar;
            this.$spec = workSpec;
            this.$foregroundUpdater = t0aVar;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$worker, this.$spec, this.$foregroundUpdater, this.$context, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            }
            ResultKt.throwOnFailure(obj);
            lhe<q0a> foregroundInfoAsync = this.$worker.getForegroundInfoAsync();
            Intrinsics.checkNotNullExpressionValue(foregroundInfoAsync, "worker.getForegroundInfoAsync()");
            androidx.work.a aVar = this.$worker;
            this.label = 1;
            obj = WorkerWrapperKt.awaitWithin(foregroundInfoAsync, aVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            q0a q0aVar = (q0a) obj;
            if (q0aVar == null) {
                throw new IllegalStateException("Worker was marked important (" + this.$spec.workerClassName + ") but did not provide ForegroundInfo");
            }
            String str = WorkForegroundKt.TAG;
            WorkSpec workSpec = this.$spec;
            ppe.e().a(str, "Updating notification for " + workSpec.workerClassName);
            lhe<Void> lheVarA = this.$foregroundUpdater.a(this.$context, this.$worker.getId(), q0aVar);
            Intrinsics.checkNotNullExpressionValue(lheVarA, "foregroundUpdater.setFor…orker.id, foregroundInfo)");
            this.label = 2;
            obj = ListenableFutureKt.await(lheVarA, this);
            return obj == coroutine_suspended ? coroutine_suspended : obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Void> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static {
        String strI = ppe.i("WorkForegroundRunnable");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"WorkForegroundRunnable\")");
        TAG = strI;
    }

    @Nullable
    public static final Object workForeground(@NotNull Context context, @NotNull WorkSpec workSpec, @NotNull androidx.work.a aVar, @NotNull t0a t0aVar, @NotNull m1p m1pVar, @NotNull Continuation<? super Unit> continuation) {
        if (!workSpec.expedited || Build.VERSION.SDK_INT >= 31) {
            return Unit.INSTANCE;
        }
        Executor executorC = m1pVar.c();
        Intrinsics.checkNotNullExpressionValue(executorC, "taskExecutor.mainThreadExecutor");
        Object objWithContext = BuildersKt.withContext(ExecutorsKt.from(executorC), new AnonymousClass2(aVar, workSpec, t0aVar, context, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
