package com.huami.bodymeasurements.temperature.model.usecase;

import com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
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
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/usecase/GetTempHistoryDataUseCase;", "", "", "userId", "", "Lcom/huami/bodymeasurements/temperature/view/vo/TemperatureVo;", Constant.METHOD_EXECUTE, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bodymeasurements/temperature/model/repository/TempBaseRepository;", "a", "Ljava/util/List;", "repoList", "b", "Ljava/lang/String;", "tag", "<init>", "(Ljava/util/List;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class GetTempHistoryDataUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<TempBaseRepository> repoList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String tag = "GetTempHistoryDataUseCase";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.usecase.GetTempHistoryDataUseCase", f = "GetTempHistoryDataUseCase.kt", i = {0}, l = {24}, m = Constant.METHOD_EXECUTE, n = {"result"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return GetTempHistoryDataUseCase.this.execute(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.usecase.GetTempHistoryDataUseCase$execute$2", f = "GetTempHistoryDataUseCase.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public final /* synthetic */ String g;
        public final /* synthetic */ ArrayList<TemperatureVo> h;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "allLocalTemp is empty";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ArrayList<TemperatureVo> arrayList, Continuation<? super b> continuation) {
            super(2, continuation);
            this.g = str;
            this.h = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GetTempHistoryDataUseCase.this.new b(this.g, this.h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x004c  */
        /* JADX WARN: Code duplicated, block: B:13:0x0062 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0063  */
        /* JADX WARN: Code duplicated, block: B:17:0x0073  */
        /* JADX WARN: Code duplicated, block: B:18:0x007d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0063 -> B:15:0x006b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.e
                r2 = 1
                if (r1 == 0) goto L2d
                if (r1 != r2) goto L25
                java.lang.Object r1 = r9.d
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r9.c
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                java.lang.Object r4 = r9.b
                com.huami.bodymeasurements.temperature.model.usecase.GetTempHistoryDataUseCase r4 = (com.huami.bodymeasurements.temperature.model.usecase.GetTempHistoryDataUseCase) r4
                java.lang.Object r5 = r9.a
                java.lang.String r5 = (java.lang.String) r5
                kotlin.ResultKt.throwOnFailure(r10)
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L6b
            L25:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L2d:
                kotlin.ResultKt.throwOnFailure(r10)
                com.huami.bodymeasurements.temperature.model.usecase.GetTempHistoryDataUseCase r10 = com.huami.bodymeasurements.temperature.model.usecase.GetTempHistoryDataUseCase.this
                java.util.List r10 = com.huami.bodymeasurements.temperature.model.usecase.GetTempHistoryDataUseCase.access$getRepoList$p(r10)
                java.lang.String r1 = r9.g
                com.huami.bodymeasurements.temperature.model.usecase.GetTempHistoryDataUseCase r3 = com.huami.bodymeasurements.temperature.model.usecase.GetTempHistoryDataUseCase.this
                java.util.ArrayList<com.huami.bodymeasurements.temperature.view.vo.TemperatureVo> r4 = r9.h
                java.util.Iterator r10 = r10.iterator()
                r5 = r1
                r1 = r10
                r10 = r9
                r8 = r4
                r4 = r3
                r3 = r8
            L46:
                boolean r6 = r1.hasNext()
                if (r6 == 0) goto L87
                java.lang.Object r6 = r1.next()
                com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository r6 = (com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository) r6
                r10.a = r5
                r10.b = r4
                r10.c = r3
                r10.d = r1
                r10.e = r2
                java.lang.Object r6 = r6.getAllLocalTemp(r5, r10)
                if (r6 != r0) goto L63
                return r0
            L63:
                r8 = r0
                r0 = r10
                r10 = r6
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L6b:
                java.util.List r10 = (java.util.List) r10
                boolean r7 = r10.isEmpty()
                if (r7 == 0) goto L7d
                java.lang.String r10 = com.huami.bodymeasurements.temperature.model.usecase.GetTempHistoryDataUseCase.access$getTag$p(r5)
                com.huami.bodymeasurements.temperature.model.usecase.GetTempHistoryDataUseCase$b$a r7 = com.huami.bodymeasurements.temperature.model.usecase.GetTempHistoryDataUseCase.b.a.a
                com.huami.tools.log.HMLog.info(r10, r7)
                goto L80
            L7d:
                r4.addAll(r10)
            L80:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                goto L46
            L87:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.bodymeasurements.temperature.model.usecase.GetTempHistoryDataUseCase.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetTempHistoryDataUseCase(@NotNull List<? extends TempBaseRepository> list) {
        this.repoList = list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object execute(@NotNull String str, @NotNull Continuation<? super List<TemperatureVo>> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ArrayList arrayList = (ArrayList) aVar.a;
            ResultKt.throwOnFailure(obj);
            return arrayList;
        }
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList2 = new ArrayList();
        CoroutineDispatcher io2 = Dispatchers.getIO();
        b bVar = new b(str, arrayList2, null);
        aVar.a = arrayList2;
        aVar.d = 1;
        return BuildersKt.withContext(io2, bVar, aVar) == coroutine_suspended ? coroutine_suspended : arrayList2;
    }
}
