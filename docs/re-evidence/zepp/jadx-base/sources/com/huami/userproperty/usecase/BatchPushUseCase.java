package com.huami.userproperty.usecase;

import com.huami.passport.Configs;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.UserPropertyModuleKt;
import com.huami.userproperty.api.UserPropertyApi;
import com.huami.userproperty.datasource.InternalLocalDataSource;
import com.huami.userproperty.service.entity.ErrorCode;
import com.huami.userproperty.service.entity.local.LocalProperty;
import com.huami.userproperty.service.entity.remote.BatchPushItem;
import com.huami.userproperty.service.entity.remote.PushProperty;
import com.huami.userproperty.service.entity.remote.PushResult;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/huami/userproperty/usecase/BatchPushUseCase;", "", "", "Lcom/huami/userproperty/service/entity/local/LocalProperty;", Configs.Params.PROPERTIES, "Lcom/huami/userproperty/service/entity/remote/BatchPushResult;", Constant.METHOD_EXECUTE, "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/userproperty/datasource/InternalLocalDataSource;", "a", "Lcom/huami/userproperty/datasource/InternalLocalDataSource;", "internalLocalDataSource", "<init>", "(Lcom/huami/userproperty/datasource/InternalLocalDataSource;)V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public final class BatchPushUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final InternalLocalDataSource internalLocalDataSource;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.userproperty.usecase.BatchPushUseCase", f = "BatchPushUseCase.kt", i = {0}, l = {43, 60}, m = Constant.METHOD_EXECUTE, n = {"destination$iv$iv"}, s = {"L$1"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return BatchPushUseCase.this.execute(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/Deferred;", "com/huami/userproperty/usecase/BatchPushUseCase$execute$BatchPushResultItem", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.userproperty.usecase.BatchPushUseCase$execute$pushResult$1$1", f = "BatchPushUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Deferred<? extends BatchPushResultItem>>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ List<PushProperty> c;
        public final /* synthetic */ String d;
        public final /* synthetic */ List<LocalProperty> e;
        public final /* synthetic */ BatchPushUseCase f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0001\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "com/huami/userproperty/usecase/BatchPushUseCase$execute$BatchPushResultItem", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.userproperty.usecase.BatchPushUseCase$execute$pushResult$1$1$1", f = "BatchPushUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BatchPushResultItem>, Object> {
            public int a;
            public final /* synthetic */ List<PushProperty> b;
            public final /* synthetic */ String c;
            public final /* synthetic */ List<LocalProperty> d;
            public final /* synthetic */ BatchPushUseCase e;

            /* JADX INFO: renamed from: com.huami.userproperty.usecase.BatchPushUseCase$b$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0638a extends Lambda implements Function0<String> {
                public final /* synthetic */ PushResult a;
                public final /* synthetic */ List<LocalProperty> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0638a(PushResult pushResult, List<LocalProperty> list) {
                    super(0);
                    this.a = pushResult;
                    this.b = list;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Batch push 失败：");
                    sb.append(((PushResult.Failed) this.a).getErrorCode());
                    sb.append(" - ");
                    List<LocalProperty> list = this.b;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((LocalProperty) it2.next()).getKey());
                    }
                    sb.append(CollectionsKt___CollectionsKt.toList(arrayList));
                    return sb.toString();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<PushProperty> list, String str, List<LocalProperty> list2, BatchPushUseCase batchPushUseCase, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = list;
                this.c = str;
                this.d = list2;
                this.e = batchPushUseCase;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super BatchPushResultItem> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PushResult pushResultPush = UserPropertyApi.INSTANCE.push(this.b, this.c);
                if (Intrinsics.areEqual(pushResultPush, PushResult.Success.INSTANCE)) {
                    List<PushProperty> list = this.b;
                    BatchPushUseCase batchPushUseCase = this.e;
                    String str = this.c;
                    for (PushProperty pushProperty : list) {
                        batchPushUseCase.internalLocalDataSource.saveLastSync(pushProperty.getKey(), str, pushProperty.getValue());
                    }
                }
                if (pushResultPush instanceof PushResult.Failed) {
                    HMLog.verbose(UserPropertyModuleKt.MODULE_TAG, new C0638a(pushResultPush, this.d));
                }
                return new BatchPushResultItem(this.d, pushResultPush);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<PushProperty> list, String str, List<LocalProperty> list2, BatchPushUseCase batchPushUseCase, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = list;
            this.d = str;
            this.e = list2;
            this.f = batchPushUseCase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.c, this.d, this.e, this.f, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Deferred<? extends BatchPushResultItem>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Deferred<BatchPushResultItem>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Deferred<BatchPushResultItem>> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return e.b((CoroutineScope) this.b, null, null, new a(this.c, this.d, this.e, this.f, null), 3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J*\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"com/huami/userproperty/usecase/BatchPushUseCase$execute$BatchPushResultItem", "", "", "Lcom/huami/userproperty/service/entity/local/LocalProperty;", "component1", "Lcom/huami/userproperty/service/entity/remote/PushResult;", "component2", "props", "result", "copy", "(Ljava/util/List;Lcom/huami/userproperty/service/entity/remote/PushResult;)Lcom/huami/userproperty/usecase/BatchPushUseCase$execute$BatchPushResultItem;", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getProps", "()Ljava/util/List;", "b", "Lcom/huami/userproperty/service/entity/remote/PushResult;", "getResult", "()Lcom/huami/userproperty/service/entity/remote/PushResult;", "<init>", "(Ljava/util/List;Lcom/huami/userproperty/service/entity/remote/PushResult;)V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class BatchPushResultItem {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final List<LocalProperty> props;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final PushResult result;

        public BatchPushResultItem(@NotNull List<LocalProperty> list, @NotNull PushResult pushResult) {
            this.props = list;
            this.result = pushResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BatchPushResultItem copy$default(BatchPushResultItem batchPushResultItem, List list, PushResult pushResult, int i, Object obj) {
            if ((i & 1) != 0) {
                list = batchPushResultItem.props;
            }
            if ((i & 2) != 0) {
                pushResult = batchPushResultItem.result;
            }
            return batchPushResultItem.copy(list, pushResult);
        }

        @NotNull
        public final List<LocalProperty> component1() {
            return this.props;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final PushResult getResult() {
            return this.result;
        }

        @NotNull
        public final BatchPushResultItem copy(@NotNull List<LocalProperty> props, @NotNull PushResult result) {
            return new BatchPushResultItem(props, result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BatchPushResultItem)) {
                return false;
            }
            BatchPushResultItem batchPushResultItem = (BatchPushResultItem) other;
            return Intrinsics.areEqual(this.props, batchPushResultItem.props) && Intrinsics.areEqual(this.result, batchPushResultItem.result);
        }

        @NotNull
        public final List<LocalProperty> getProps() {
            return this.props;
        }

        @NotNull
        public final PushResult getResult() {
            return this.result;
        }

        public int hashCode() {
            return (this.props.hashCode() * 31) + this.result.hashCode();
        }

        @NotNull
        public String toString() {
            return "BatchPushResultItem(props=" + this.props + ", result=" + this.result + ')';
        }
    }

    public BatchPushUseCase(@NotNull InternalLocalDataSource internalLocalDataSource) {
        this.internalLocalDataSource = internalLocalDataSource;
    }

    private static final boolean a(BatchPushResultItem batchPushResultItem) {
        return (batchPushResultItem.getResult() instanceof PushResult.Failed) && Intrinsics.areEqual(((PushResult.Failed) batchPushResultItem.getResult()).getErrorCode(), ErrorCode.ApiMissed.INSTANCE);
    }

    private static final List<BatchPushItem> b(BatchPushResultItem batchPushResultItem) {
        List<LocalProperty> props = batchPushResultItem.getProps();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(props, 10));
        for (LocalProperty localProperty : props) {
            arrayList.add(new BatchPushItem(localProperty.getKey(), localProperty.getApi()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0094  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bc A[LOOP:5: B:27:0x00b6->B:29:0x00bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ff -> B:37:0x0102). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object execute(@org.jetbrains.annotations.NotNull java.util.List<com.huami.userproperty.service.entity.local.LocalProperty> r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.huami.userproperty.service.entity.remote.BatchPushResult> r14) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.userproperty.usecase.BatchPushUseCase.execute(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
