package com.xiaomi.fitness.detail;

import com.mi.health.data.sportmodel.view.SportPathMapView;
import com.mi.health.map.data.GpsValues;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fitness.util.SportRecordUtil;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.detail.SportDetailGpsFragment$insertIntegerPoint$1$1", f = "SportDetailGpsFragment.kt", i = {}, l = {478}, m = "invokeSuspend", n = {}, s = {})
public final class SportDetailGpsFragment$insertIntegerPoint$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GpsValues $it;
    final /* synthetic */ Map<SportRecordKey, List<Object>> $resultMap;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SportDetailGpsFragment this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.SportDetailGpsFragment$insertIntegerPoint$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.SportDetailGpsFragment$insertIntegerPoint$1$1$1", f = "SportDetailGpsFragment.kt", i = {}, l = {483}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSportDetailGpsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailGpsFragment.kt\ncom/xiaomi/fitness/detail/SportDetailGpsFragment$insertIntegerPoint$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,716:1\n1863#2,2:717\n*S KotlinDebug\n*F\n+ 1 SportDetailGpsFragment.kt\ncom/xiaomi/fitness/detail/SportDetailGpsFragment$insertIntegerPoint$1$1$1\n*L\n490#1:717,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Deferred<GpsValues> $gpsValuesTask;
        final /* synthetic */ Map<SportRecordKey, List<Object>> $resultMap;
        int label;
        final /* synthetic */ SportDetailGpsFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(SportDetailGpsFragment sportDetailGpsFragment, Deferred<? extends GpsValues> deferred, Map<SportRecordKey, List<Object>> map, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = sportDetailGpsFragment;
            this.$gpsValuesTask = deferred;
            this.$resultMap = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$gpsValuesTask, this.$resultMap, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SportPathMapView sportPathView;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SportBasicReport mBasicReport = this.this$0.getMBasicReport();
                if (mBasicReport != null && mBasicReport.getProtoType() == 21) {
                    return Unit.INSTANCE;
                }
                if (!this.this$0.isInvalid()) {
                    Deferred<GpsValues> deferred = this.$gpsValuesTask;
                    this.label = 1;
                    obj = deferred.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GpsValues gpsValues = (GpsValues) obj;
            SportRecordKey sportRecordKey = SportRecordKey.RecordPauseDetailInfo;
            if (this.$resultMap.containsKey(sportRecordKey)) {
                List<Object> list = this.$resultMap.get(sportRecordKey);
                Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.data.common.data.sport.SportRecordItem>");
                List<Object> list2 = list;
                List<Location> locationList = gpsValues.locationList;
                Intrinsics.checkNotNullExpressionValue(locationList, "locationList");
                int i2 = 0;
                Location location = null;
                for (Location location2 : locationList) {
                    if (!SportRecordUtil.INSTANCE.gpsIsInSport(location2.timeStamp, list2, i2)) {
                        if (i2 >= 0 && i2 < list2.size()) {
                            if (location2.timeStamp > ((SportRecordItem) list2.get(i2)).getEndTime()) {
                                if (location != null) {
                                    location.isPause = true;
                                }
                                i2++;
                            }
                        }
                        location2.isPause = true;
                    }
                    location = location2;
                }
            }
            if (GpsValues.validGpsValue(gpsValues) && (sportPathView = this.this$0.getSportPathView()) != null) {
                sportPathView.rebindData(gpsValues);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportDetailGpsFragment$insertIntegerPoint$1$1(GpsValues gpsValues, Map<SportRecordKey, List<Object>> map, SportDetailGpsFragment sportDetailGpsFragment, Continuation<? super SportDetailGpsFragment$insertIntegerPoint$1$1> continuation) {
        super(2, continuation);
        this.$it = gpsValues;
        this.$resultMap = map;
        this.this$0 = sportDetailGpsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SportDetailGpsFragment$insertIntegerPoint$1$1 sportDetailGpsFragment$insertIntegerPoint$1$1 = new SportDetailGpsFragment$insertIntegerPoint$1$1(this.$it, this.$resultMap, this.this$0, continuation);
        sportDetailGpsFragment$insertIntegerPoint$1$1.L$0 = obj;
        return sportDetailGpsFragment$insertIntegerPoint$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, Dispatchers.getIO(), null, new SportDetailGpsFragment$insertIntegerPoint$1$1$gpsValuesTask$1(this.$it, this.$resultMap, this.this$0, null), 2, null);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, deferredAsync$default, this.$resultMap, null);
            this.label = 1;
            if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
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
        return ((SportDetailGpsFragment$insertIntegerPoint$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
