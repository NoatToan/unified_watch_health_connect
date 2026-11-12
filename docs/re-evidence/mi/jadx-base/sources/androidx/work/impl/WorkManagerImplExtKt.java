package androidx.work.impl;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.impl.constraints.trackers.Trackers;
import com.miui.tsmclient.util.Constants;
import defpackage.enr;
import defpackage.fnr;
import defpackage.jfl;
import defpackage.m1p;
import defpackage.mwl;
import defpackage.qfl;
import defpackage.rii;
import defpackage.s3b;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aá\u0001\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0097\u0001\b\u0002\u0010\u0012\u001a\u0090\u0001\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\fj\u0002`\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a°\u0001\u0010\u001b\u001a\u0090\u0001\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\fj\u0002`\u00112\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u001a\"\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001c\u001aE\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010#\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b!\u0010\"\u001a\u0011\u0010%\u001a\u00020$*\u00020\u0013¢\u0006\u0004\b%\u0010&* \u0002\u0010'\"\u008c\u0001\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\f2\u008c\u0001\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\f¨\u0006("}, d2 = {"Landroid/content/Context;", "context", "Landroidx/work/Configuration;", "configuration", "Lm1p;", "workTaskExecutor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/impl/constraints/trackers/Trackers;", "trackers", "Landroidx/work/impl/a;", "processor", "Lkotlin/Function6;", "Lkotlin/ParameterName;", "name", "", "Ljfl;", "Landroidx/work/impl/SchedulersCreator;", "schedulersCreator", "Lenr;", "createWorkManager", "(Landroid/content/Context;Landroidx/work/Configuration;Lm1p;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/a;Lkotlin/jvm/functions/Function6;)Lenr;", "WorkManagerImpl", "createTestWorkManager", "(Landroid/content/Context;Landroidx/work/Configuration;Lm1p;)Lenr;", "TestWorkManagerImpl", "", "schedulers", "([Ljfl;)Lkotlin/jvm/functions/Function6;", "createSchedulers", "(Landroid/content/Context;Landroidx/work/Configuration;Lm1p;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/a;)Ljava/util/List;", "taskExecutor", "Lkotlinx/coroutines/CoroutineScope;", "createWorkManagerScope", "(Lm1p;)Lkotlinx/coroutines/CoroutineScope;", "WorkManagerScope", "", Constants.EXTRA_CLOSE_TAI, "(Lenr;)V", "SchedulersCreator", "work-runtime_release"}, k = 2, mv = {1, 8, 0})
public final class WorkManagerImplExtKt {

    /* JADX INFO: renamed from: androidx.work.impl.WorkManagerImplExtKt$close$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.WorkManagerImplExtKt$close$1", f = "WorkManagerImplExt.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ enr $this_close;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(enr enrVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_close = enrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_close, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext.Element element = this.$this_close.k().getCoroutineContext().get(Job.INSTANCE);
                Intrinsics.checkNotNull(element);
                this.label = 1;
                if (JobKt.cancelAndJoin((Job) element, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final void close(@NotNull enr enrVar) throws InterruptedException {
        Intrinsics.checkNotNullParameter(enrVar, "<this>");
        BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(enrVar, null), 1, null);
        enrVar.j().close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<jfl> createSchedulers(Context context, Configuration configuration, m1p m1pVar, WorkDatabase workDatabase, Trackers trackers, a aVar) {
        jfl jflVarC = qfl.c(context, workDatabase, configuration);
        Intrinsics.checkNotNullExpressionValue(jflVarC, "createBestAvailableBackg…kDatabase, configuration)");
        return CollectionsKt__CollectionsKt.listOf((Object[]) new jfl[]{jflVarC, new s3b(context, configuration, trackers, aVar, new WorkLauncherImpl(aVar, m1pVar), m1pVar)});
    }

    @JvmName(name = "createTestWorkManager")
    @NotNull
    public static final enr createTestWorkManager(@NotNull Context context, @NotNull Configuration configuration, @NotNull m1p workTaskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        WorkDatabase.Companion companion = WorkDatabase.INSTANCE;
        mwl mwlVarD = workTaskExecutor.d();
        Intrinsics.checkNotNullExpressionValue(mwlVarD, "workTaskExecutor.serialTaskExecutor");
        return createWorkManager$default(context, configuration, workTaskExecutor, companion.create(context, mwlVarD, configuration.getClock(), true), null, null, null, 112, null);
    }

    @JvmOverloads
    @JvmName(name = "createWorkManager")
    @NotNull
    public static final enr createWorkManager(@NotNull Context context, @NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return createWorkManager$default(context, configuration, null, null, null, null, null, 124, null);
    }

    public static /* synthetic */ enr createWorkManager$default(Context context, Configuration configuration, m1p m1pVar, WorkDatabase workDatabase, Trackers trackers, a aVar, Function6 function6, int i, Object obj) {
        WorkDatabase workDatabaseCreate;
        Trackers trackers2;
        m1p fnrVar = (i & 4) != 0 ? new fnr(configuration.getTaskExecutor()) : m1pVar;
        if ((i & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            mwl mwlVarD = fnrVar.d();
            Intrinsics.checkNotNullExpressionValue(mwlVarD, "workTaskExecutor.serialTaskExecutor");
            workDatabaseCreate = companion.create(applicationContext, mwlVarD, configuration.getClock(), context.getResources().getBoolean(rii.f32572a));
        } else {
            workDatabaseCreate = workDatabase;
        }
        if ((i & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
            trackers2 = new Trackers(applicationContext2, fnrVar, null, null, null, null, 60, null);
        } else {
            trackers2 = trackers;
        }
        return createWorkManager(context, configuration, fnrVar, workDatabaseCreate, trackers2, (i & 32) != 0 ? new a(context.getApplicationContext(), configuration, fnrVar, workDatabaseCreate) : aVar, (i & 64) != 0 ? WorkManagerImplExtKt$WorkManagerImpl$1.INSTANCE : function6);
    }

    @JvmName(name = "createWorkManagerScope")
    @NotNull
    public static final CoroutineScope createWorkManagerScope(@NotNull m1p taskExecutor) {
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        CoroutineDispatcher coroutineDispatcherA = taskExecutor.a();
        Intrinsics.checkNotNullExpressionValue(coroutineDispatcherA, "taskExecutor.taskCoroutineDispatcher");
        return CoroutineScopeKt.CoroutineScope(coroutineDispatcherA);
    }

    @NotNull
    public static final Function6<Context, Configuration, m1p, WorkDatabase, Trackers, a, List<jfl>> schedulers(@NotNull final jfl... schedulers) {
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        return new Function6<Context, Configuration, m1p, WorkDatabase, Trackers, a, List<? extends jfl>>() { // from class: androidx.work.impl.WorkManagerImplExtKt.schedulers.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            @Override // kotlin.jvm.functions.Function6
            public final List<jfl> invoke(Context context, Configuration configuration, m1p m1pVar, WorkDatabase workDatabase, Trackers trackers, a aVar) {
                Intrinsics.checkNotNullParameter(context, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(configuration, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter(m1pVar, "<anonymous parameter 2>");
                Intrinsics.checkNotNullParameter(workDatabase, "<anonymous parameter 3>");
                Intrinsics.checkNotNullParameter(trackers, "<anonymous parameter 4>");
                Intrinsics.checkNotNullParameter(aVar, "<anonymous parameter 5>");
                return ArraysKt___ArraysKt.toList(schedulers);
            }
        };
    }

    @JvmOverloads
    @JvmName(name = "createWorkManager")
    @NotNull
    public static final enr createWorkManager(@NotNull Context context, @NotNull Configuration configuration, @NotNull m1p workTaskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        return createWorkManager$default(context, configuration, workTaskExecutor, null, null, null, null, 120, null);
    }

    @JvmOverloads
    @JvmName(name = "createWorkManager")
    @NotNull
    public static final enr createWorkManager(@NotNull Context context, @NotNull Configuration configuration, @NotNull m1p workTaskExecutor, @NotNull WorkDatabase workDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, null, null, null, 112, null);
    }

    @JvmOverloads
    @JvmName(name = "createWorkManager")
    @NotNull
    public static final enr createWorkManager(@NotNull Context context, @NotNull Configuration configuration, @NotNull m1p workTaskExecutor, @NotNull WorkDatabase workDatabase, @NotNull Trackers trackers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, trackers, null, null, 96, null);
    }

    @JvmOverloads
    @JvmName(name = "createWorkManager")
    @NotNull
    public static final enr createWorkManager(@NotNull Context context, @NotNull Configuration configuration, @NotNull m1p workTaskExecutor, @NotNull WorkDatabase workDatabase, @NotNull Trackers trackers, @NotNull a processor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(processor, "processor");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, trackers, processor, null, 64, null);
    }

    @JvmOverloads
    @JvmName(name = "createWorkManager")
    @NotNull
    public static final enr createWorkManager(@NotNull Context context, @NotNull Configuration configuration, @NotNull m1p workTaskExecutor, @NotNull WorkDatabase workDatabase, @NotNull Trackers trackers, @NotNull a processor, @NotNull Function6<? super Context, ? super Configuration, ? super m1p, ? super WorkDatabase, ? super Trackers, ? super a, ? extends List<? extends jfl>> schedulersCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(schedulersCreator, "schedulersCreator");
        return new enr(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, schedulersCreator.invoke(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }
}
