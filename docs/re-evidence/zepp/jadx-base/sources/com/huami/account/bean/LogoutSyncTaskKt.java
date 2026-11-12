package com.huami.account.bean;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000*\b\u0012\u0004\u0012\u00020\u00030\u0000¨\u0006\u0007"}, d2 = {"", "Lcom/huami/account/bean/LogoutSyncTask;", "tasks", "Lcom/huami/account/bean/LogoutSyncTask$Result;", "executeSyncTasks", "Lcom/huami/account/bean/LogoutSyncTask$Result$Failed;", "filterFailed", "accountui_release"}, k = 2, mv = {1, 5, 1})
public final class LogoutSyncTaskKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/account/bean/LogoutSyncTask$Result;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.bean.LogoutSyncTaskKt$executeSyncTasks$1", f = "LogoutSyncTask.kt", i = {0}, l = {86}, m = "invokeSuspend", n = {"destination$iv$iv"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends LogoutSyncTask.Result>>, Object> {
        public Object a;
        public Object b;
        public int c;
        private /* synthetic */ Object d;
        public final /* synthetic */ List<LogoutSyncTask> e;

        /* JADX INFO: renamed from: com.huami.account.bean.LogoutSyncTaskKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/account/bean/LogoutSyncTask$Result;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.account.bean.LogoutSyncTaskKt$executeSyncTasks$1$1$1", f = "LogoutSyncTask.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0264a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LogoutSyncTask.Result>, Object> {
            public int a;
            public final /* synthetic */ LogoutSyncTask b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0264a(LogoutSyncTask logoutSyncTask, Continuation<? super C0264a> continuation) {
                super(2, continuation);
                this.b = logoutSyncTask;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0264a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super LogoutSyncTask.Result> continuation) {
                return ((C0264a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return this.b.execute();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<LogoutSyncTask> list, Continuation<? super a> continuation) {
            super(2, continuation);
            this.e = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.e, continuation);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<? extends LogoutSyncTask.Result>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0078  */
        /* JADX WARN: Code duplicated, block: B:17:0x008c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:18:0x008d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008d -> B:19:0x0093). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.c
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r11.b
                java.util.Collection r1 = (java.util.Collection) r1
                java.lang.Object r3 = r11.a
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r11.d
                java.util.Collection r4 = (java.util.Collection) r4
                kotlin.ResultKt.throwOnFailure(r12)
                r5 = r3
                r3 = r1
                r1 = r0
                r0 = r11
                goto L93
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                kotlin.ResultKt.throwOnFailure(r12)
                java.lang.Object r12 = r11.d
                kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
                java.util.List<com.huami.account.bean.LogoutSyncTask> r1 = r11.e
                java.util.ArrayList r9 = new java.util.ArrayList
                r10 = 10
                int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r10)
                r9.<init>(r3)
                java.util.Iterator r1 = r1.iterator()
            L40:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L62
                java.lang.Object r3 = r1.next()
                com.huami.account.bean.LogoutSyncTask r3 = (com.huami.account.bean.LogoutSyncTask) r3
                kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()
                r5 = 0
                com.huami.account.bean.LogoutSyncTaskKt$a$a r6 = new com.huami.account.bean.LogoutSyncTaskKt$a$a
                r7 = 0
                r6.<init>(r3, r7)
                r7 = 2
                r8 = 0
                r3 = r12
                kotlinx.coroutines.Deferred r3 = kotlinx.coroutines.BuildersKt.async$default(r3, r4, r5, r6, r7, r8)
                r9.add(r3)
                goto L40
            L62:
                java.util.ArrayList r12 = new java.util.ArrayList
                int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r9, r10)
                r12.<init>(r1)
                java.util.Iterator r1 = r9.iterator()
                r3 = r1
                r1 = r12
                r12 = r11
            L72:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L9d
                java.lang.Object r4 = r3.next()
                kotlinx.coroutines.Deferred r4 = (kotlinx.coroutines.Deferred) r4
                r12.d = r1
                r12.a = r3
                r12.b = r1
                r12.c = r2
                java.lang.Object r4 = r4.await(r12)
                if (r4 != r0) goto L8d
                return r0
            L8d:
                r5 = r3
                r3 = r1
                r1 = r0
                r0 = r12
                r12 = r4
                r4 = r3
            L93:
                com.huami.account.bean.LogoutSyncTask$Result r12 = (com.huami.account.bean.LogoutSyncTask.Result) r12
                r3.add(r12)
                r12 = r0
                r0 = r1
                r1 = r4
                r3 = r5
                goto L72
            L9d:
                java.util.List r1 = (java.util.List) r1
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.account.bean.LogoutSyncTaskKt.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @NotNull
    public static final List<LogoutSyncTask.Result> executeSyncTasks(@NotNull List<LogoutSyncTask> list) {
        return (List) d.b(null, new a(list, null), 1, null);
    }

    @NotNull
    public static final List<LogoutSyncTask.Result.Failed> filterFailed(@NotNull List<? extends LogoutSyncTask.Result> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof LogoutSyncTask.Result.Failed) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
