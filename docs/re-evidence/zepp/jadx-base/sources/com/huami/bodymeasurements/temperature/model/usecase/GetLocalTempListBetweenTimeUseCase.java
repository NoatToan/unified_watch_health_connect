package com.huami.bodymeasurements.temperature.model.usecase;

import com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00058\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/usecase/GetLocalTempListBetweenTimeUseCase;", "", "", "start", "end", "", "userId", "", "Lcom/huami/bodymeasurements/temperature/view/vo/TemperatureVo;", Constant.METHOD_EXECUTE, "(JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bodymeasurements/temperature/model/repository/TempBaseRepository;", "a", "Ljava/util/List;", "repoList", "b", "Ljava/lang/String;", "tag", "<init>", "(Ljava/util/List;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class GetLocalTempListBetweenTimeUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<TempBaseRepository> repoList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String tag = "GetTempListBetweenTimeUseCase";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.usecase.GetLocalTempListBetweenTimeUseCase", f = "GetLocalTempListBetweenTimeUseCase.kt", i = {0}, l = {30}, m = Constant.METHOD_EXECUTE, n = {"result"}, s = {"L$1"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return GetLocalTempListBetweenTimeUseCase.this.execute(0L, 0L, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, long j2) {
            super(0);
            this.a = j;
            this.b = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "execute start:" + this.a + ",end:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.usecase.GetLocalTempListBetweenTimeUseCase$execute$3", f = "GetLocalTempListBetweenTimeUseCase.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public long a;
        public long b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public int g;
        public final /* synthetic */ long i;
        public final /* synthetic */ long j;
        public final /* synthetic */ String k;
        public final /* synthetic */ ArrayList<TemperatureVo> l;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "localTemp is empty";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, long j2, String str, ArrayList<TemperatureVo> arrayList, Continuation<? super c> continuation) {
            super(2, continuation);
            this.i = j;
            this.j = j2;
            this.k = str;
            this.l = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GetLocalTempListBetweenTimeUseCase.this.new c(this.i, this.j, this.k, this.l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x005b  */
        /* JADX WARN: Code duplicated, block: B:13:0x007f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0080  */
        /* JADX WARN: Code duplicated, block: B:17:0x008e  */
        /* JADX WARN: Code duplicated, block: B:18:0x0098  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0080 -> B:15:0x0086). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.g
                r3 = 1
                if (r2 == 0) goto L38
                if (r2 != r3) goto L30
                long r4 = r0.b
                long r6 = r0.a
                java.lang.Object r2 = r0.f
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r8 = r0.e
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                java.lang.Object r9 = r0.d
                com.huami.bodymeasurements.temperature.model.usecase.GetLocalTempListBetweenTimeUseCase r9 = (com.huami.bodymeasurements.temperature.model.usecase.GetLocalTempListBetweenTimeUseCase) r9
                java.lang.Object r10 = r0.c
                java.lang.String r10 = (java.lang.String) r10
                kotlin.ResultKt.throwOnFailure(r21)
                r11 = r4
                r13 = r6
                r15 = r8
                r4 = r21
                r7 = r0
                r19 = r10
                r10 = r9
                r9 = r19
                goto L86
            L30:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L38:
                kotlin.ResultKt.throwOnFailure(r21)
                com.huami.bodymeasurements.temperature.model.usecase.GetLocalTempListBetweenTimeUseCase r2 = com.huami.bodymeasurements.temperature.model.usecase.GetLocalTempListBetweenTimeUseCase.this
                java.util.List r2 = com.huami.bodymeasurements.temperature.model.usecase.GetLocalTempListBetweenTimeUseCase.access$getRepoList$p(r2)
                long r4 = r0.i
                long r6 = r0.j
                java.lang.String r8 = r0.k
                com.huami.bodymeasurements.temperature.model.usecase.GetLocalTempListBetweenTimeUseCase r9 = com.huami.bodymeasurements.temperature.model.usecase.GetLocalTempListBetweenTimeUseCase.this
                java.util.ArrayList<com.huami.bodymeasurements.temperature.view.vo.TemperatureVo> r10 = r0.l
                java.util.Iterator r2 = r2.iterator()
                r13 = r4
                r11 = r6
                r15 = r10
                r7 = r0
                r10 = r9
                r9 = r8
            L55:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L9c
                java.lang.Object r4 = r2.next()
                com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository r4 = (com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository) r4
                r7.c = r9
                r7.d = r10
                r7.e = r15
                r7.f = r2
                r7.a = r13
                r7.b = r11
                r7.g = r3
                r5 = r13
                r16 = r7
                r7 = r11
                r17 = r9
                r18 = r10
                r10 = r16
                java.lang.Object r4 = r4.getLocalTempBetweenTime(r5, r7, r9, r10)
                if (r4 != r1) goto L80
                return r1
            L80:
                r7 = r16
                r9 = r17
                r10 = r18
            L86:
                java.util.List r4 = (java.util.List) r4
                boolean r5 = r4.isEmpty()
                if (r5 == 0) goto L98
                java.lang.String r4 = com.huami.bodymeasurements.temperature.model.usecase.GetLocalTempListBetweenTimeUseCase.access$getTag$p(r10)
                com.huami.bodymeasurements.temperature.model.usecase.GetLocalTempListBetweenTimeUseCase$c$a r5 = com.huami.bodymeasurements.temperature.model.usecase.GetLocalTempListBetweenTimeUseCase.c.a.a
                com.huami.tools.log.HMLog.info(r4, r5)
                goto L55
            L98:
                r15.addAll(r4)
                goto L55
            L9c:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.bodymeasurements.temperature.model.usecase.GetLocalTempListBetweenTimeUseCase.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<TemperatureVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ArrayList<TemperatureVo> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("result size:", Integer.valueOf(this.a.size()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetLocalTempListBetweenTimeUseCase(@NotNull List<? extends TempBaseRepository> list) {
        this.repoList = list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object execute(long j, long j2, @NotNull String str, @NotNull Continuation<? super List<TemperatureVo>> continuation) {
        a aVar;
        GetLocalTempListBetweenTimeUseCase getLocalTempListBetweenTimeUseCase;
        ArrayList arrayList;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object obj = aVar2.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar2.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            HMLog.info(this.tag, new b(j, j2));
            ArrayList arrayList2 = new ArrayList();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            c cVar = new c(j, j2, str, arrayList2, null);
            aVar2.a = this;
            aVar2.b = arrayList2;
            aVar2.e = 1;
            if (BuildersKt.withContext(io2, cVar, aVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            getLocalTempListBetweenTimeUseCase = this;
            arrayList = arrayList2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (ArrayList) aVar2.b;
            getLocalTempListBetweenTimeUseCase = (GetLocalTempListBetweenTimeUseCase) aVar2.a;
            ResultKt.throwOnFailure(obj);
        }
        HMLog.info(getLocalTempListBetweenTimeUseCase.tag, new d(arrayList));
        return arrayList;
    }
}
