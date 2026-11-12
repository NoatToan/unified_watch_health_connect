package com.huami.userproperty.usecase;

import com.huami.userproperty.entity.AbsFetchParams;
import com.huami.userproperty.service.entity.remote.FetchResult;
import com.tekartik.sqflite.Constant;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/huami/userproperty/usecase/FetchRegisteredPropsUseCase;", "", "Lcom/huami/userproperty/entity/BatchFetchResult;", Constant.METHOD_EXECUTE, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/userproperty/usecase/FetchPropertyUseCase;", "a", "Lcom/huami/userproperty/usecase/FetchPropertyUseCase;", "fetchPropertyUseCase", "<init>", "(Lcom/huami/userproperty/usecase/FetchPropertyUseCase;)V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public final class FetchRegisteredPropsUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final FetchPropertyUseCase fetchPropertyUseCase;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.userproperty.usecase.FetchRegisteredPropsUseCase", f = "FetchRegisteredPropsUseCase.kt", i = {0, 0}, l = {19, 24}, m = Constant.METHOD_EXECUTE, n = {"this", "destination$iv$iv"}, s = {"L$0", "L$1"})
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
            return FetchRegisteredPropsUseCase.this.execute(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u0003\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u00070\u00040\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/Deferred;", "Lkotlin/Pair;", "Lcom/huami/userproperty/entity/AbsFetchParams;", "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "", "", "Lcom/huami/userproperty/entity/RawResult;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.userproperty.usecase.FetchRegisteredPropsUseCase$execute$resultMap$1$1", f = "FetchRegisteredPropsUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Deferred<? extends Pair<? extends AbsFetchParams, ? extends FetchResult<Map<String, ? extends String>>>>>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ AbsFetchParams c;
        public final /* synthetic */ FetchRegisteredPropsUseCase d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\u0002`\u00060\u00030\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Pair;", "Lcom/huami/userproperty/entity/AbsFetchParams;", "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "", "", "Lcom/huami/userproperty/entity/RawResult;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.userproperty.usecase.FetchRegisteredPropsUseCase$execute$resultMap$1$1$1", f = "FetchRegisteredPropsUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends AbsFetchParams, ? extends FetchResult<Map<String, ? extends String>>>>, Object> {
            public int a;
            public final /* synthetic */ AbsFetchParams b;
            public final /* synthetic */ FetchRegisteredPropsUseCase c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbsFetchParams absFetchParams, FetchRegisteredPropsUseCase fetchRegisteredPropsUseCase, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = absFetchParams;
                this.c = fetchRegisteredPropsUseCase;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends AbsFetchParams, ? extends FetchResult<Map<String, ? extends String>>>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super Pair<? extends AbsFetchParams, ? extends FetchResult<Map<String, String>>>>) continuation);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Pair<? extends AbsFetchParams, ? extends FetchResult<Map<String, String>>>> continuation) {
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
                return TuplesKt.to(this.b, this.c.fetchPropertyUseCase.execute(this.b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbsFetchParams absFetchParams, FetchRegisteredPropsUseCase fetchRegisteredPropsUseCase, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = absFetchParams;
            this.d = fetchRegisteredPropsUseCase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.c, this.d, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Deferred<? extends Pair<? extends AbsFetchParams, ? extends FetchResult<Map<String, ? extends String>>>>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Deferred<? extends Pair<? extends AbsFetchParams, ? extends FetchResult<Map<String, String>>>>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Deferred<? extends Pair<? extends AbsFetchParams, ? extends FetchResult<Map<String, String>>>>> continuation) {
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
            return e.b((CoroutineScope) this.b, Dispatchers.getIO(), null, new a(this.c, this.d, null), 2, null);
        }
    }

    public FetchRegisteredPropsUseCase(@NotNull FetchPropertyUseCase fetchPropertyUseCase) {
        this.fetchPropertyUseCase = fetchPropertyUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0086 -> B:23:0x0087). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object execute(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.huami.userproperty.entity.BatchFetchResult> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.huami.userproperty.usecase.FetchRegisteredPropsUseCase.a
            if (r0 == 0) goto L13
            r0 = r10
            com.huami.userproperty.usecase.FetchRegisteredPropsUseCase$a r0 = (com.huami.userproperty.usecase.FetchRegisteredPropsUseCase.a) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            com.huami.userproperty.usecase.FetchRegisteredPropsUseCase$a r0 = new com.huami.userproperty.usecase.FetchRegisteredPropsUseCase$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r10)
            goto La1
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L35:
            java.lang.Object r2 = r0.d
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r5 = r0.c
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.b
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r7 = r0.a
            com.huami.userproperty.usecase.FetchRegisteredPropsUseCase r7 = (com.huami.userproperty.usecase.FetchRegisteredPropsUseCase) r7
            kotlin.ResultKt.throwOnFailure(r10)
            goto L87
        L49:
            kotlin.ResultKt.throwOnFailure(r10)
            com.huami.userproperty.UserPropertyManager r10 = com.huami.userproperty.UserPropertyManager.INSTANCE
            java.util.List r10 = r10.getRegisterFetchProperties$userproperty_release()
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r10, r5)
            r2.<init>(r5)
            java.util.Iterator r10 = r10.iterator()
            r7 = r9
            r5 = r10
        L63:
            boolean r10 = r5.hasNext()
            r6 = 0
            if (r10 == 0) goto L8e
            java.lang.Object r10 = r5.next()
            com.huami.userproperty.entity.AbsFetchParams r10 = (com.huami.userproperty.entity.AbsFetchParams) r10
            com.huami.userproperty.usecase.FetchRegisteredPropsUseCase$b r8 = new com.huami.userproperty.usecase.FetchRegisteredPropsUseCase$b
            r8.<init>(r10, r7, r6)
            r0.a = r7
            r0.b = r2
            r0.c = r5
            r0.d = r2
            r0.g = r4
            java.lang.Object r10 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r8, r0)
            if (r10 != r1) goto L86
            return r1
        L86:
            r6 = r2
        L87:
            kotlinx.coroutines.Deferred r10 = (kotlinx.coroutines.Deferred) r10
            r2.add(r10)
            r2 = r6
            goto L63
        L8e:
            java.util.List r2 = (java.util.List) r2
            r0.a = r6
            r0.b = r6
            r0.c = r6
            r0.d = r6
            r0.g = r3
            java.lang.Object r10 = kotlinx.coroutines.AwaitKt.awaitAll(r2, r0)
            if (r10 != r1) goto La1
            return r1
        La1:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Map r10 = kotlin.collections.MapsKt.toMap(r10)
            com.huami.userproperty.entity.BatchFetchResult r0 = new com.huami.userproperty.entity.BatchFetchResult
            r0.<init>(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.userproperty.usecase.FetchRegisteredPropsUseCase.execute(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
