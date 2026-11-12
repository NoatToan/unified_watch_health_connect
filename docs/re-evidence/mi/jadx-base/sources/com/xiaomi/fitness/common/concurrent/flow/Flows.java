package com.xiaomi.fitness.common.concurrent.flow;

import com.miui.tsmclient.util.ServiceUtils;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.fitness.common.concurrent.FutureImpl;
import com.xiaomi.fitness.common.concurrent.ListenableFuture;
import com.xiaomi.fitness.common.concurrent.ListenableFutureImpl;
import com.xiaomi.fitness.common.concurrent.Result;
import com.xiaomi.fitness.common.concurrent.flow.Flows;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 '*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001'B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\t\u001a\u00020\nJ&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0002\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\rJ&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0002\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010J2\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0002\u0010\u000e\"\u0004\b\u0003\u0010\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u000b0\u0012J\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0014\u001a\u00020\u0015J-\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00180\u00172\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001a\"\u00028\u0000H\u0007¢\u0006\u0002\u0010\u001bJ<\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00180!H\u0002JJ\u0010\"\u001a\u00020\u001d2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00032\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00180!H\u0002J\u001c\u0010$\u001a\u0004\u0018\u00010\u00032\u0006\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0003H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/flow/Flows;", "P", "R", "", "<init>", "()V", "mFlowList", "Ljava/util/LinkedList;", ServiceUtils.EXTRA_PROCESS, "func0", "Lcom/xiaomi/fitness/common/concurrent/flow/Func0;", "R1", "func1", "Lcom/xiaomi/fitness/common/concurrent/flow/Func1;", "P1", "func2", "Lcom/xiaomi/fitness/common/concurrent/flow/Func2;", "func3", "Lcom/xiaomi/fitness/common/concurrent/flow/Func3;", DebugKt.DEBUG_PROPERTY_VALUE_ON, "executor", "Ljava/util/concurrent/Executor;", StatConstants.PARAM_START, "Lcom/xiaomi/fitness/common/concurrent/ListenableFuture;", "Lcom/xiaomi/fitness/common/concurrent/Result;", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "", "([Ljava/lang/Object;)Lcom/xiaomi/fitness/common/concurrent/ListenableFuture;", "perform", "", "flowList", "prevExec", "future", "Lcom/xiaomi/fitness/common/concurrent/FutureImpl;", "execTasks", "tasks", "performFunc", "func", "param", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlows.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Flows.kt\ncom/xiaomi/fitness/common/concurrent/flow/Flows\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1#2:149\n*E\n"})
public final class Flows<P, R> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final LinkedList<Object> mFlowList;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0002\u0010\u0006\"\u0004\b\u0003\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/flow/Flows$Companion;", "", "<init>", "()V", "create", "Lcom/xiaomi/fitness/common/concurrent/flow/Flows;", "P", "R", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <P, R> Flows<P, R> create() {
            return new Flows<>(null);
        }
    }

    public /* synthetic */ Flows(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void execTasks(LinkedList<?> flowList, Object p, LinkedList<Object> tasks, Executor executor, FutureImpl<Result<R>> future) {
        Iterator<Object> it = tasks.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            it.remove();
            try {
                p = performFunc(next, p);
            } catch (Exception unused) {
                future.set(Result.INSTANCE.failure());
                return;
            }
        }
        perform(flowList, executor, p, future);
    }

    private final void perform(final LinkedList<?> flowList, Executor prevExec, final Object p, final FutureImpl<Result<R>> future) {
        if (flowList.isEmpty()) {
            future.set(Result.INSTANCE.success(0, p));
            return;
        }
        Iterator<?> it = flowList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        final LinkedList<Object> linkedList = new LinkedList<>();
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNull(next);
            it.remove();
            if (next instanceof Executor) {
                prevExec = (Executor) next;
                break;
            }
            linkedList.add(next);
        }
        if (linkedList.isEmpty()) {
            future.set(Result.INSTANCE.success(0, p));
        } else if (prevExec == null) {
            execTasks(flowList, p, linkedList, null, future);
        } else {
            final Executor executor = prevExec;
            prevExec.execute(new Runnable() { // from class: gz9
                @Override // java.lang.Runnable
                public final void run() {
                    Flows.perform$lambda$1(this.f19489a, flowList, p, linkedList, executor, future);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void perform$lambda$1(Flows this$0, LinkedList flowList, Object obj, LinkedList funcList, Executor executor, FutureImpl future) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(flowList, "$flowList");
        Intrinsics.checkNotNullParameter(funcList, "$funcList");
        Intrinsics.checkNotNullParameter(executor, "$executor");
        Intrinsics.checkNotNullParameter(future, "$future");
        this$0.execTasks(flowList, obj, funcList, executor, future);
    }

    private final Object performFunc(Object func, Object param) {
        if (func instanceof Func0) {
            ((Func0) func).apply();
            return param;
        }
        if (func instanceof Func1) {
            return ((Func1) func).apply();
        }
        if (func instanceof Func2) {
            Intrinsics.checkNotNull(func, "null cannot be cast to non-null type com.xiaomi.fitness.common.concurrent.flow.Func2<kotlin.Any?>");
            ((Func2) func).apply(param);
            return param;
        }
        if (func instanceof Func3) {
            Intrinsics.checkNotNull(func, "null cannot be cast to non-null type com.xiaomi.fitness.common.concurrent.flow.Func3<kotlin.Any?, kotlin.Any?>");
            return ((Func3) func).apply(param);
        }
        throw new IllegalArgumentException("unknown func " + func.getClass());
    }

    @NotNull
    public final Flows<P, R> on(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        if (!(!this.mFlowList.isEmpty())) {
            throw new IllegalStateException("call process first".toString());
        }
        if (this.mFlowList.getLast() instanceof Executor) {
            this.mFlowList.removeLast();
        }
        LinkedList<Object> linkedList = this.mFlowList;
        Objects.requireNonNull(executor);
        linkedList.addLast(executor);
        return this;
    }

    @NotNull
    public final Flows<P, R> process(@NotNull Func0 func0) {
        Intrinsics.checkNotNullParameter(func0, "func0");
        LinkedList<Object> linkedList = this.mFlowList;
        Objects.requireNonNull(func0);
        linkedList.add(func0);
        return this;
    }

    @SafeVarargs
    @NotNull
    public final ListenableFuture<Result<R>> start(@NotNull P... p) {
        Intrinsics.checkNotNullParameter(p, "p");
        ListenableFutureImpl listenableFutureImpl = new ListenableFutureImpl();
        if (this.mFlowList.isEmpty()) {
            listenableFutureImpl.set(Result.INSTANCE.failure());
            return listenableFutureImpl;
        }
        LinkedList<?> linkedList = new LinkedList<>(this.mFlowList);
        this.mFlowList.clear();
        perform(linkedList, null, p.length == 0 ? null : p[0], listenableFutureImpl);
        return listenableFutureImpl;
    }

    private Flows() {
        this.mFlowList = new LinkedList<>();
    }

    @NotNull
    public final <R1> Flows<P, R> process(@NotNull Func1<R1> func1) {
        Intrinsics.checkNotNullParameter(func1, "func1");
        LinkedList<Object> linkedList = this.mFlowList;
        Objects.requireNonNull(func1);
        linkedList.add(func1);
        return this;
    }

    @NotNull
    public final <P1> Flows<P, R> process(@NotNull Func2<P1> func2) {
        Intrinsics.checkNotNullParameter(func2, "func2");
        LinkedList<Object> linkedList = this.mFlowList;
        Objects.requireNonNull(func2);
        linkedList.add(func2);
        return this;
    }

    @NotNull
    public final <P1, R1> Flows<P, R> process(@NotNull Func3<P1, R1> func3) {
        Intrinsics.checkNotNullParameter(func3, "func3");
        LinkedList<Object> linkedList = this.mFlowList;
        Objects.requireNonNull(func3);
        linkedList.add(func3);
        return this;
    }
}
