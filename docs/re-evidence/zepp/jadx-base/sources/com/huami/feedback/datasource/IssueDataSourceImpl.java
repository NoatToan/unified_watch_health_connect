package com.huami.feedback.datasource;

import com.huami.feedback.entity.Issue;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0007\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\bH\u0016R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/feedback/datasource/IssueDataSourceImpl;", "Lcom/huami/feedback/datasource/IssueDataSource;", "", "Lcom/huami/feedback/entity/Issue;", "localIssue", "remoteIssue", "", "a", "Lkotlinx/coroutines/flow/Flow;", "issue", "Lcom/huami/feedback/datasource/IssueLocalDataSource;", "Lcom/huami/feedback/datasource/IssueLocalDataSource;", "localDataSource", "Lcom/huami/feedback/datasource/IssueRemoteDataSource;", "b", "Lcom/huami/feedback/datasource/IssueRemoteDataSource;", "remoteDataSource", "<init>", "(Lcom/huami/feedback/datasource/IssueLocalDataSource;Lcom/huami/feedback/datasource/IssueRemoteDataSource;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class IssueDataSourceImpl implements IssueDataSource {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IssueLocalDataSource localDataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IssueRemoteDataSource remoteDataSource;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/huami/feedback/entity/Issue;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.datasource.IssueDataSourceImpl$issue$1", f = "IssueDataSourceImpl.kt", i = {0, 1, 1, 2, 2, 3}, l = {21, 23, 25, 29}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "issue", "$this$flow", "issue", "remoteIssue"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0"})
    public static final class a extends SuspendLambda implements Function2<FlowCollector<? super List<? extends Issue>>, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        private /* synthetic */ Object c;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = IssueDataSourceImpl.this.new a(continuation);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends Issue>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super List<Issue>>) flowCollector, continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull FlowCollector<? super List<Issue>> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x008a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x008b  */
        /* JADX WARN: Code duplicated, block: B:30:0x0095  */
        /* JADX WARN: Code duplicated, block: B:34:0x00aa A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FlowCollector flowCollector;
            FlowCollector flowCollector2;
            List list;
            FlowCollector flowCollector3;
            List<Issue> list2;
            List<Issue> list3;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.c;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        list = (List) this.a;
                        flowCollector2 = (FlowCollector) this.c;
                        ResultKt.throwOnFailure(obj);
                        IssueRemoteDataSource issueRemoteDataSource = IssueDataSourceImpl.this.remoteDataSource;
                        this.c = flowCollector2;
                        this.a = list;
                        this.b = 3;
                        obj = issueRemoteDataSource.issue(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        flowCollector3 = flowCollector2;
                        list2 = (List) obj;
                        if (!list2.isEmpty()) {
                            this.c = list2;
                            this.a = null;
                            this.b = 4;
                            if (flowCollector3.emit(list2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            list3 = list2;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i == 3) {
                        list = (List) this.a;
                        flowCollector3 = (FlowCollector) this.c;
                        ResultKt.throwOnFailure(obj);
                        list2 = (List) obj;
                        if ((!list2.isEmpty()) && IssueDataSourceImpl.this.a(list, list2)) {
                            this.c = list2;
                            this.a = null;
                            this.b = 4;
                            if (flowCollector3.emit(list2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            list3 = list2;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list3 = (List) this.c;
                    ResultKt.throwOnFailure(obj);
                }
                IssueDataSourceImpl.this.localDataSource.saveIssue(list3);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector4 = (FlowCollector) this.c;
            IssueLocalDataSource issueLocalDataSource = IssueDataSourceImpl.this.localDataSource;
            this.c = flowCollector4;
            this.b = 1;
            Object objIssue = issueLocalDataSource.issue(this);
            if (objIssue == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowCollector = flowCollector4;
            obj = objIssue;
            List list4 = (List) obj;
            if (!list4.isEmpty()) {
                this.c = flowCollector;
                this.a = list4;
                this.b = 2;
                if (flowCollector.emit(list4, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            flowCollector2 = flowCollector;
            list = list4;
            IssueRemoteDataSource issueRemoteDataSource2 = IssueDataSourceImpl.this.remoteDataSource;
            this.c = flowCollector2;
            this.a = list;
            this.b = 3;
            obj = issueRemoteDataSource2.issue(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowCollector3 = flowCollector2;
            list2 = (List) obj;
            if (!list2.isEmpty()) {
                this.c = list2;
                this.a = null;
                this.b = 4;
                if (flowCollector3.emit(list2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list3 = list2;
                IssueDataSourceImpl.this.localDataSource.saveIssue(list3);
            }
            return Unit.INSTANCE;
        }
    }

    public IssueDataSourceImpl(@NotNull IssueLocalDataSource issueLocalDataSource, @NotNull IssueRemoteDataSource issueRemoteDataSource) {
        this.localDataSource = issueLocalDataSource;
        this.remoteDataSource = issueRemoteDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(List<Issue> localIssue, List<Issue> remoteIssue) {
        boolean z;
        if (localIssue.size() != remoteIssue.size()) {
            return true;
        }
        List<Pair> listZip = CollectionsKt___CollectionsKt.zip(localIssue, remoteIssue);
        if ((listZip instanceof Collection) && listZip.isEmpty()) {
            z = true;
        } else {
            for (Pair pair : listZip) {
                if (!Intrinsics.areEqual((Issue) pair.component1(), (Issue) pair.component2())) {
                    z = false;
                }
            }
            z = true;
        }
        return !z;
    }

    @Override // com.huami.feedback.datasource.IssueDataSource
    @NotNull
    public Flow<List<Issue>> issue() {
        return FlowKt.flow(new a(null));
    }
}
