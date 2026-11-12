package com.huami.bodymeasurements.temperature.model.usecase;

import com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/usecase/GetLatestTempUseCase;", "", "", "userId", "Lcom/huami/bodymeasurements/temperature/view/vo/TemperatureVo;", Constant.METHOD_EXECUTE, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/bodymeasurements/temperature/model/repository/TempBaseRepository;", "a", "Ljava/util/List;", "repoList", "<init>", "(Ljava/util/List;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class GetLatestTempUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<TempBaseRepository> repoList;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bodymeasurements/temperature/view/vo/TemperatureVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.usecase.GetLatestTempUseCase$execute$2", f = "GetLatestTempUseCase.kt", i = {0}, l = {21}, m = "invokeSuspend", n = {"destination$iv$iv"}, s = {"L$1"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TemperatureVo>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public int d;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GetLatestTempUseCase.this.new a(this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super TemperatureVo> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0045  */
        /* JADX WARN: Code duplicated, block: B:13:0x0059 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x005a  */
        /* JADX WARN: Code duplicated, block: B:17:0x0065  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005a -> B:15:0x0061). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.d
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r7.c
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r7.b
                java.util.Collection r3 = (java.util.Collection) r3
                java.lang.Object r4 = r7.a
                java.lang.String r4 = (java.lang.String) r4
                kotlin.ResultKt.throwOnFailure(r8)
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r7
                goto L61
            L20:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L28:
                kotlin.ResultKt.throwOnFailure(r8)
                com.huami.bodymeasurements.temperature.model.usecase.GetLatestTempUseCase r8 = com.huami.bodymeasurements.temperature.model.usecase.GetLatestTempUseCase.this
                java.util.List r8 = com.huami.bodymeasurements.temperature.model.usecase.GetLatestTempUseCase.access$getRepoList$p(r8)
                java.lang.String r1 = r7.f
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r8 = r8.iterator()
                r4 = r1
                r1 = r8
                r8 = r7
            L3f:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L6e
                java.lang.Object r5 = r1.next()
                com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository r5 = (com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository) r5
                r8.a = r4
                r8.b = r3
                r8.c = r1
                r8.d = r2
                java.lang.Object r5 = r5.getLatestTemp(r4, r8)
                if (r5 != r0) goto L5a
                return r0
            L5a:
                r6 = r0
                r0 = r8
                r8 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r6
            L61:
                com.huami.bodymeasurements.temperature.view.vo.TemperatureVo r8 = (com.huami.bodymeasurements.temperature.view.vo.TemperatureVo) r8
                if (r8 == 0) goto L68
                r4.add(r8)
            L68:
                r8 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3f
            L6e:
                java.util.List r3 = (java.util.List) r3
                java.util.Iterator r8 = r3.iterator()
                boolean r0 = r8.hasNext()
                if (r0 != 0) goto L7c
                r8 = 0
                goto Lb1
            L7c:
                java.lang.Object r0 = r8.next()
                boolean r1 = r8.hasNext()
                if (r1 != 0) goto L88
            L86:
                r8 = r0
                goto Lb1
            L88:
                r1 = r0
                com.huami.bodymeasurements.temperature.view.vo.TemperatureVo r1 = (com.huami.bodymeasurements.temperature.view.vo.TemperatureVo) r1
                long r1 = r1.getTimestamp()
                java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r1)
            L93:
                java.lang.Object r2 = r8.next()
                r3 = r2
                com.huami.bodymeasurements.temperature.view.vo.TemperatureVo r3 = (com.huami.bodymeasurements.temperature.view.vo.TemperatureVo) r3
                long r3 = r3.getTimestamp()
                java.lang.Long r3 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r3)
                int r4 = r1.compareTo(r3)
                if (r4 >= 0) goto Laa
                r0 = r2
                r1 = r3
            Laa:
                boolean r2 = r8.hasNext()
                if (r2 != 0) goto L93
                goto L86
            Lb1:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.bodymeasurements.temperature.model.usecase.GetLatestTempUseCase.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetLatestTempUseCase(@NotNull List<? extends TempBaseRepository> list) {
        this.repoList = list;
    }

    @Nullable
    public final Object execute(@NotNull String str, @NotNull Continuation<? super TemperatureVo> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(str, null), continuation);
    }
}
