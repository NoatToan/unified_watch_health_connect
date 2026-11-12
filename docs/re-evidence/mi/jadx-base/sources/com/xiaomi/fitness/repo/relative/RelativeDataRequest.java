package com.xiaomi.fitness.repo.relative;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudKey;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.sp.RelativeDataPreference;
import com.xiaomi.fit.fitness.persist.dailyreport.utils.DataCloudUtilKt;
import com.xiaomi.fit.fitness.persist.server.FitnessDataRequest;
import com.xiaomi.fit.fitness.persist.server.data.GetDetailDataParam;
import com.xiaomi.fit.fitness.persist.server.data.GetRelativeDataResult;
import com.xiaomi.fit.fitness.persist.server.data.RelativeDataModel;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.repo.relative.RelativeDataRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 -2\u00020\u0001:\u0001-B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\n\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r0\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u0011JJ\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00130\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ>\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u001cJ8\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0082@¢\u0006\u0002\u0010%JK\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H'0\f0\u000b\"\b\b\u0000\u0010'*\u00020\u00012\u001c\u0010(\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0*\u0012\u0006\u0012\u0004\u0018\u00010\u00010)2\u0006\u0010+\u001a\u00020$H\u0002¢\u0006\u0002\u0010,R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/repo/relative/RelativeDataRequest;", "", "<init>", "()V", "request", "Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "getRequest", "()Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "request$delegate", "Lkotlin/Lazy;", "getHomeData", "Lkotlinx/coroutines/flow/Flow;", "Lcom/xiaomi/fit/fitness/export/data/CloudDataResult;", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "Lcom/xiaomi/fit/fitness/persist/server/data/RelativeDataModel;", "relativeId", "", "getFitnessData", "", "homeType", "startTime", "endTime", "tzOffsetInSec", "", "isGetSrcData", "", "getAbnormalFitnessData", "(JLcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRelativeFitnessData", "", "resultList", "", "param", "Lcom/xiaomi/fit/fitness/persist/server/data/GetDetailDataParam;", "nextKey", "", "(Ljava/util/List;Lcom/xiaomi/fit/fitness/persist/server/data/GetDetailDataParam;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cloudRequestAsync", "T", "realCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "callName", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRelativeDataRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelativeDataRequest.kt\ncom/xiaomi/fitness/repo/relative/RelativeDataRequest\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,158:1\n13402#2,2:159\n*S KotlinDebug\n*F\n+ 1 RelativeDataRequest.kt\ncom/xiaomi/fitness/repo/relative/RelativeDataRequest\n*L\n89#1:159,2\n*E\n"})
public final class RelativeDataRequest {

    @NotNull
    private static final String TAG = "RelativeDataRequest";

    /* JADX INFO: renamed from: request$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy request = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wgk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RelativeDataRequest.request_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final RelativeDataRequest instance = new RelativeDataRequest();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/repo/relative/RelativeDataRequest$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Lcom/xiaomi/fitness/repo/relative/RelativeDataRequest;", "getInstance", "()Lcom/xiaomi/fitness/repo/relative/RelativeDataRequest;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RelativeDataRequest getInstance() {
            return RelativeDataRequest.instance;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HomeDataType.values().length];
            try {
                iArr[HomeDataType.HR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeDataType.SPO2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.relative.RelativeDataRequest$cloudRequestAsync$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fit/fitness/export/data/CloudDataResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.relative.RelativeDataRequest$cloudRequestAsync$1", f = "RelativeDataRequest.kt", i = {0, 1}, l = {145, 146, 150, 152}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class AnonymousClass1<T> extends SuspendLambda implements Function2<FlowCollector<? super CloudDataResult<T>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $callName;
        final /* synthetic */ Function1<Continuation<? super T>, Object> $realCall;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super Continuation<? super T>, ? extends Object> function1, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$realCall = function1;
            this.$callName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$realCall, this.$callName, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
        	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
        	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
        	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
        	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                if (r1 != 0) {
                    if (r1 == 1) {
                        flowCollector = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else if (r1 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (r1 != 3 && r1 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                Function1<Continuation<? super T>, Object> function1 = this.$realCall;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = function1.invoke2(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                CloudDataResult cloudDataResult = new CloudDataResult(obj, 0, null, 6, null);
                this.L$0 = flowCollector;
                this.label = 2;
                if (flowCollector.emit(cloudDataResult, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e) {
                FitnessLogUtils.e(RelativeDataRequest.TAG, this.$callName, e);
                if (e instanceof ApiException) {
                    CloudDataResult cloudDataResult2 = new CloudDataResult(null, ((ApiException) e).getErrorCode(), e.getMessage());
                    this.L$0 = null;
                    this.label = 3;
                    if (r1.emit(cloudDataResult2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    CloudDataResult cloudDataResult3 = new CloudDataResult(null, 1, e.getMessage());
                    this.L$0 = null;
                    this.label = 4;
                    if (r1.emit(cloudDataResult3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super CloudDataResult<T>> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.relative.RelativeDataRequest$getAbnormalFitnessData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.relative.RelativeDataRequest", f = "RelativeDataRequest.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}, l = {94, 112}, m = "getAbnormalFitnessData", n = {"this", "resultList", "latestTime", "$this$forEach$iv", "hrList", "relativeId", "startTime", "endTime", "tzOffsetInSec", "resultList", "relativeId"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "J$1", "J$2", "I$0", "L$0", "J$0"})
    public static final class C28411 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        long J$1;
        long J$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C28411(Continuation<? super C28411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeDataRequest.this.getAbnormalFitnessData(0L, null, 0L, 0L, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.relative.RelativeDataRequest$getFitnessData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/xiaomi/fit/fitness/persist/server/data/RelativeDataModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.relative.RelativeDataRequest$getFitnessData$1", f = "RelativeDataRequest.kt", i = {0}, l = {71}, m = "invokeSuspend", n = {"cloudResultList"}, s = {"L$0"})
    public static final class C28421 extends SuspendLambda implements Function1<Continuation<? super List<? extends RelativeDataModel>>, Object> {
        final /* synthetic */ long $endTime;
        final /* synthetic */ HomeDataType $homeType;
        final /* synthetic */ boolean $isGetSrcData;
        final /* synthetic */ long $relativeId;
        final /* synthetic */ long $startTime;
        final /* synthetic */ int $tzOffsetInSec;
        Object L$0;
        int label;
        final /* synthetic */ RelativeDataRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28421(HomeDataType homeDataType, long j, long j2, int i, long j3, RelativeDataRequest relativeDataRequest, boolean z, Continuation<? super C28421> continuation) {
            super(1, continuation);
            this.$homeType = homeDataType;
            this.$relativeId = j;
            this.$startTime = j2;
            this.$tzOffsetInSec = i;
            this.$endTime = j3;
            this.this$0 = relativeDataRequest;
            this.$isGetSrcData = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C28421(this.$homeType, this.$relativeId, this.$startTime, this.$tzOffsetInSec, this.$endTime, this.this$0, this.$isGetSrcData, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object invoke2(Continuation<? super List<? extends RelativeDataModel>> continuation) {
            return invoke2((Continuation<? super List<RelativeDataModel>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                return list;
            }
            ResultKt.throwOnFailure(obj);
            String cloudRequestKey = CloudKey.INSTANCE.getCloudRequestKey(this.$homeType);
            long j = this.$relativeId;
            long j2 = this.$startTime;
            int i2 = this.$tzOffsetInSec;
            GetDetailDataParam getDetailDataParam = new GetDetailDataParam(j, cloudRequestKey, j2 + ((long) i2), this.$endTime + ((long) i2), null, null, null, null, 240, null);
            getDetailDataParam.setTag(DataCloudUtilKt.getRequestTag(this.$homeType));
            ArrayList arrayList = new ArrayList();
            RelativeDataRequest relativeDataRequest = this.this$0;
            boolean z = this.$isGetSrcData;
            this.L$0 = arrayList;
            this.label = 1;
            return RelativeDataRequest.getRelativeFitnessData$default(relativeDataRequest, arrayList, getDetailDataParam, z, null, this, 8, null) == coroutine_suspended ? coroutine_suspended : arrayList;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<RelativeDataModel>> continuation) {
            return ((C28421) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.relative.RelativeDataRequest$getHomeData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "Lcom/xiaomi/fit/fitness/persist/server/data/RelativeDataModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.relative.RelativeDataRequest$getHomeData$1", f = "RelativeDataRequest.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRelativeDataRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelativeDataRequest.kt\ncom/xiaomi/fitness/repo/relative/RelativeDataRequest$getHomeData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n1863#2,2:159\n*S KotlinDebug\n*F\n+ 1 RelativeDataRequest.kt\ncom/xiaomi/fitness/repo/relative/RelativeDataRequest$getHomeData$1\n*L\n39#1:159,2\n*E\n"})
    public static final class C28431 extends SuspendLambda implements Function1<Continuation<? super Map<HomeDataType, ? extends RelativeDataModel>>, Object> {
        final /* synthetic */ long $relativeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28431(long j, Continuation<? super C28431> continuation) {
            super(1, continuation);
            this.$relativeId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RelativeDataRequest.this.new C28431(this.$relativeId, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object invoke2(Continuation<? super Map<HomeDataType, ? extends RelativeDataModel>> continuation) {
            return invoke2((Continuation<? super Map<HomeDataType, RelativeDataModel>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FitnessDataRequest request = RelativeDataRequest.this.getRequest();
                long j = this.$relativeId;
                this.label = 1;
                obj = request.getRelativeLatestData(j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            GetRelativeDataResult getRelativeDataResult = (GetRelativeDataResult) obj;
            RelativeDataPreference.INSTANCE.setLatestDataTime(this.$relativeId, getRelativeDataResult.getLatestDataTime());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (RelativeDataModel relativeDataModel : getRelativeDataResult.getDataList()) {
                if (!TextUtils.isEmpty(relativeDataModel.getKey())) {
                    linkedHashMap.put(CloudKey.INSTANCE.getHomeDataType(relativeDataModel.getKey()), relativeDataModel);
                }
            }
            return linkedHashMap;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Map<HomeDataType, RelativeDataModel>> continuation) {
            return ((C28431) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.relative.RelativeDataRequest$getRelativeFitnessData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.relative.RelativeDataRequest", f = "RelativeDataRequest.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {131, 132, 137}, m = "getRelativeFitnessData", n = {"this", "resultList", "param", "isGetSrcData", "this", "resultList", "param", "isGetSrcData"}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "Z$0"})
    public static final class C28441 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C28441(Continuation<? super C28441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeDataRequest.this.getRelativeFitnessData(null, null, false, null, this);
        }
    }

    private RelativeDataRequest() {
    }

    private final <T> Flow<CloudDataResult<T>> cloudRequestAsync(Function1<? super Continuation<? super T>, ? extends Object> realCall, String callName) {
        return FlowKt.flowOn(FlowKt.flow(new AnonymousClass1(realCall, callName, null)), Dispatchers.getIO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getAbnormalFitnessData$lambda$2$lambda$1(RelativeDataModel relativeDataModel, RelativeDataModel relativeDataModel2) {
        return (int) (relativeDataModel2.getTime() - relativeDataModel.getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getAbnormalFitnessData$lambda$3(RelativeDataModel relativeDataModel, RelativeDataModel relativeDataModel2) {
        return (int) (relativeDataModel2.getTime() - relativeDataModel.getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object getRelativeFitnessData(List<RelativeDataModel> list, GetDetailDataParam getDetailDataParam, boolean z, String str, Continuation<? super Unit> continuation) {
        C28441 c28441;
        RelativeDataRequest relativeDataRequest;
        GetRelativeDataResult getRelativeDataResult;
        String nextKey;
        if (continuation instanceof C28441) {
            c28441 = (C28441) continuation;
            int i = c28441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28441.label = i - Integer.MIN_VALUE;
            } else {
                c28441 = new C28441(continuation);
            }
        } else {
            c28441 = new C28441(continuation);
        }
        C28441 c28442 = c28441;
        Object relativeAggregatedData = c28442.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28442.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(relativeAggregatedData);
            getDetailDataParam.setNextKey(str);
            if (z) {
                FitnessDataRequest request = getRequest();
                c28442.L$0 = this;
                c28442.L$1 = list;
                c28442.L$2 = getDetailDataParam;
                c28442.Z$0 = z;
                c28442.label = 1;
                relativeAggregatedData = request.getRelativeFitnessData(getDetailDataParam, c28442);
                if (relativeAggregatedData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                relativeDataRequest = this;
                getRelativeDataResult = (GetRelativeDataResult) relativeAggregatedData;
                GetDetailDataParam getDetailDataParam2 = getDetailDataParam;
                boolean z2 = z;
                RelativeDataRequest relativeDataRequest2 = relativeDataRequest;
                list.addAll(getRelativeDataResult.getDataList());
                nextKey = getRelativeDataResult.getNextKey();
                if (nextKey != null) {
                }
                return Unit.INSTANCE;
            }
            FitnessDataRequest request2 = getRequest();
            c28442.L$0 = this;
            c28442.L$1 = list;
            c28442.L$2 = getDetailDataParam;
            c28442.Z$0 = z;
            c28442.label = 2;
            relativeAggregatedData = request2.getRelativeAggregatedData(getDetailDataParam, c28442);
            if (relativeAggregatedData == coroutine_suspended) {
                return coroutine_suspended;
            }
            relativeDataRequest = this;
            getRelativeDataResult = (GetRelativeDataResult) relativeAggregatedData;
            GetDetailDataParam getDetailDataParam3 = getDetailDataParam;
            boolean z3 = z;
            RelativeDataRequest relativeDataRequest3 = relativeDataRequest;
            list.addAll(getRelativeDataResult.getDataList());
            nextKey = getRelativeDataResult.getNextKey();
            if (nextKey != null) {
            }
            return Unit.INSTANCE;
        }
        if (i2 == 1) {
            z = c28442.Z$0;
            getDetailDataParam = (GetDetailDataParam) c28442.L$2;
            list = (List) c28442.L$1;
            relativeDataRequest = (RelativeDataRequest) c28442.L$0;
            ResultKt.throwOnFailure(relativeAggregatedData);
            getRelativeDataResult = (GetRelativeDataResult) relativeAggregatedData;
            GetDetailDataParam getDetailDataParam4 = getDetailDataParam;
            boolean z4 = z;
            RelativeDataRequest relativeDataRequest4 = relativeDataRequest;
            list.addAll(getRelativeDataResult.getDataList());
            nextKey = getRelativeDataResult.getNextKey();
            if (nextKey != null) {
            }
            return Unit.INSTANCE;
        }
        if (i2 == 2) {
            z = c28442.Z$0;
            getDetailDataParam = (GetDetailDataParam) c28442.L$2;
            list = (List) c28442.L$1;
            relativeDataRequest = (RelativeDataRequest) c28442.L$0;
            ResultKt.throwOnFailure(relativeAggregatedData);
            getRelativeDataResult = (GetRelativeDataResult) relativeAggregatedData;
            GetDetailDataParam getDetailDataParam5 = getDetailDataParam;
            boolean z5 = z;
            RelativeDataRequest relativeDataRequest5 = relativeDataRequest;
            list.addAll(getRelativeDataResult.getDataList());
            nextKey = getRelativeDataResult.getNextKey();
            if (nextKey != null || nextKey.length() == 0) {
                return Unit.INSTANCE;
            }
            String nextKey2 = getRelativeDataResult.getNextKey();
            c28442.L$0 = null;
            c28442.L$1 = null;
            c28442.L$2 = null;
            c28442.label = 3;
            if (relativeDataRequest5.getRelativeFitnessData(list, getDetailDataParam5, z5, nextKey2, c28442) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(relativeAggregatedData);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object getRelativeFitnessData$default(RelativeDataRequest relativeDataRequest, List list, GetDetailDataParam getDetailDataParam, boolean z, String str, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            str = null;
        }
        return relativeDataRequest.getRelativeFitnessData(list, getDetailDataParam, z, str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FitnessDataRequest getRequest() {
        return (FitnessDataRequest) this.request.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRequest request_delegate$lambda$0() {
        return FitnessDataRequest.INSTANCE.getInstance();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x011f  */
    /* JADX WARN: Code duplicated, block: B:34:0x017c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x017d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0191  */
    /* JADX WARN: Code duplicated, block: B:40:0x01af  */
    /* JADX WARN: Code duplicated, block: B:41:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:44:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x017d -> B:36:0x0184). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAbnormalFitnessData(long r41, @org.jetbrains.annotations.NotNull com.xiaomi.fit.fitness.export.data.annotation.HomeDataType r43, long r44, long r46, int r48, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<com.xiaomi.fit.fitness.persist.server.data.RelativeDataModel>> r49) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.repo.relative.RelativeDataRequest.getAbnormalFitnessData(long, com.xiaomi.fit.fitness.export.data.annotation.HomeDataType, long, long, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final Flow<CloudDataResult<List<RelativeDataModel>>> getFitnessData(long relativeId, @NotNull HomeDataType homeType, long startTime, long endTime, int tzOffsetInSec, boolean isGetSrcData) {
        Intrinsics.checkNotNullParameter(homeType, "homeType");
        return cloudRequestAsync(new C28421(homeType, relativeId, startTime, tzOffsetInSec, endTime, this, isGetSrcData, null), "getFitnessData");
    }

    @NotNull
    public final Flow<CloudDataResult<? extends Map<HomeDataType, RelativeDataModel>>> getHomeData(long relativeId) {
        return cloudRequestAsync(new C28431(relativeId, null), "getHomeData");
    }
}
