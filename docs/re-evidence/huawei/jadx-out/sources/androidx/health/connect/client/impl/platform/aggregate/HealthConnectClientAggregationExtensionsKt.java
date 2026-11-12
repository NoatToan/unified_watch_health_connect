package androidx.health.connect.client.impl.platform.aggregate;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.records.BloodPressureRecord;
import androidx.health.connect.client.records.CyclingPedalingCadenceRecord;
import androidx.health.connect.client.records.NutritionRecord;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.records.SpeedRecord;
import androidx.health.connect.client.records.StepsCadenceRecord;
import androidx.health.connect.client.request.AggregateGroupByDurationRequest;
import androidx.health.connect.client.request.AggregateGroupByPeriodRequest;
import androidx.health.connect.client.request.AggregateRequest;
import androidx.health.connect.client.request.ReadRecordsRequest;
import androidx.health.connect.client.response.ReadRecordsResponse;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import defpackage.createFailure;
import defpackage.yzc;
import defpackage.zaj;
import defpackage.zbg;
import defpackage.zcp;
import defpackage.zcv;
import defpackage.zjn;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0080@¢\u0006\u0002\u0010\t\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\fH\u0080@¢\u0006\u0002\u0010\r\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000e0\n*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000fH\u0080@¢\u0006\u0002\u0010\u0010\u001aD\u0010\u0011\u001a\u0002H\u0012\"\b\b\u0000\u0010\u0013*\u00020\u0003\"\u0004\b\u0001\u0010\u0012*\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00120\u0017H\u0080@¢\u0006\u0002\u0010\u0018\u001a0\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130\n0\u001a\"\b\b\u0000\u0010\u0013*\u00020\u0003*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0015H\u0000\"\u001c\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"AGGREGATION_FALLBACK_RECORD_TYPES", "", "Lkotlin/reflect/KClass;", "Landroidx/health/connect/client/records/Record;", "aggregateFallback", "Landroidx/health/connect/client/aggregate/AggregationResult;", "Landroidx/health/connect/client/HealthConnectClient;", "request", "Landroidx/health/connect/client/request/AggregateRequest;", "(Landroidx/health/connect/client/HealthConnectClient;Landroidx/health/connect/client/request/AggregateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByPeriod;", "Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;", "(Landroidx/health/connect/client/HealthConnectClient;Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByDuration;", "Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;", "(Landroidx/health/connect/client/HealthConnectClient;Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregate", "R", ExifInterface.GPS_DIRECTION_TRUE, "readRecordsRequest", "Landroidx/health/connect/client/request/ReadRecordsRequest;", "aggregator", "Landroidx/health/connect/client/impl/platform/aggregate/Aggregator;", "(Landroidx/health/connect/client/HealthConnectClient;Landroidx/health/connect/client/request/ReadRecordsRequest;Landroidx/health/connect/client/impl/platform/aggregate/Aggregator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRecordsFlow", "Lkotlinx/coroutines/flow/Flow;", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HealthConnectClientAggregationExtensionsKt {
    private static final Set<KClass<? extends Record>> AGGREGATION_FALLBACK_RECORD_TYPES = zaj.e((Object[]) new KClass[]{zcv.b(BloodPressureRecord.class), zcv.b(CyclingPedalingCadenceRecord.class), zcv.b(NutritionRecord.class), zcv.b(SpeedRecord.class), zcv.b(StepsCadenceRecord.class)});

    /* JADX WARN: Code duplicated, block: B:35:0x013d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0174  */
    /* JADX WARN: Code duplicated, block: B:49:0x01db  */
    /* JADX WARN: Code duplicated, block: B:56:0x0200  */
    /* JADX WARN: Code duplicated, block: B:58:0x020c  */
    /* JADX WARN: Code duplicated, block: B:61:0x025f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0265  */
    /* JADX WARN: Code duplicated, block: B:65:0x0271  */
    /* JADX WARN: Code duplicated, block: B:68:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x02c4 -> B:69:0x02c7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object aggregateFallback(androidx.health.connect.client.HealthConnectClient r22, androidx.health.connect.client.request.AggregateRequest r23, kotlin.coroutines.Continuation<? super androidx.health.connect.client.aggregate.AggregationResult> r24) {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt.aggregateFallback(androidx.health.connect.client.HealthConnectClient, androidx.health.connect.client.request.AggregateRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0126  */
    /* JADX WARN: Code duplicated, block: B:42:0x015d  */
    /* JADX WARN: Code duplicated, block: B:49:0x01be  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:61:0x023a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0242  */
    /* JADX WARN: Code duplicated, block: B:65:0x024e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0299  */
    /* JADX WARN: Code duplicated, block: B:71:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0299 -> B:69:0x029e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object aggregateFallback(androidx.health.connect.client.HealthConnectClient r22, androidx.health.connect.client.request.AggregateGroupByPeriodRequest r23, kotlin.coroutines.Continuation<? super java.util.List<androidx.health.connect.client.aggregate.AggregationResultGroupedByPeriod>> r24) {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt.aggregateFallback(androidx.health.connect.client.HealthConnectClient, androidx.health.connect.client.request.AggregateGroupByPeriodRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0126  */
    /* JADX WARN: Code duplicated, block: B:42:0x015d  */
    /* JADX WARN: Code duplicated, block: B:49:0x01be  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:61:0x023a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0242  */
    /* JADX WARN: Code duplicated, block: B:65:0x024e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0299  */
    /* JADX WARN: Code duplicated, block: B:71:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0299 -> B:69:0x029e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object aggregateFallback(androidx.health.connect.client.HealthConnectClient r22, androidx.health.connect.client.request.AggregateGroupByDurationRequest r23, kotlin.coroutines.Continuation<? super java.util.List<androidx.health.connect.client.aggregate.AggregationResultGroupedByDuration>> r24) {
        /*
            Method dump skipped, instruction units count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt.aggregateFallback(androidx.health.connect.client.HealthConnectClient, androidx.health.connect.client.request.AggregateGroupByDurationRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T extends Record, R> Object aggregate(HealthConnectClient healthConnectClient, ReadRecordsRequest<T> readRecordsRequest, final Aggregator<T, R> aggregator, Continuation<? super R> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object objA = zbg.a();
        int i = anonymousClass1.label;
        if (i == 0) {
            createFailure.c(obj);
            Flow recordsFlow = readRecordsFlow(healthConnectClient, readRecordsRequest);
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt.aggregate.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation2) {
                    return emit((List) obj2, (Continuation<? super yzc>) continuation2);
                }

                public final Object emit(List<? extends T> list, Continuation<? super yzc> continuation2) {
                    Aggregator<T, R> aggregator2 = aggregator;
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        aggregator2.filterAndAggregate((Record) it.next());
                    }
                    return yzc.e;
                }
            };
            anonymousClass1.L$0 = aggregator;
            anonymousClass1.label = 1;
            if (recordsFlow.collect(flowCollector, anonymousClass1) == objA) {
                return objA;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aggregator = (Aggregator) anonymousClass1.L$0;
            createFailure.c(obj);
        }
        return aggregator.getResult();
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt$readRecordsFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/health/connect/client/records/Record;", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt$readRecordsFlow$1", f = "HealthConnectClientAggregationExtensions.kt", i = {0, 0, 1, 1, 1}, l = {173, 174}, m = "invokeSuspend", n = {"$this$flow", "currentRequest", "$this$flow", "currentRequest", "response"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class C04131<T> extends SuspendLambda implements Function2<FlowCollector<? super List<? extends T>>, Continuation<? super yzc>, Object> {
        final /* synthetic */ ReadRecordsRequest<T> $request;
        final /* synthetic */ HealthConnectClient $this_readRecordsFlow;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: Code duplicated, block: B:16:0x0053  */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
        
            if (r5.emit(r1.getRecords(), r7) == r0) goto L19;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006c -> B:7:0x001d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            ReadRecordsRequest<T> readRecordsRequestWithPageToken$connect_client_release;
            FlowCollector flowCollector2;
            ReadRecordsRequest<T> readRecordsRequest;
            ReadRecordsResponse readRecordsResponse;
            Object records;
            Object objA = zbg.a();
            int i = this.label;
            if (i == 0) {
                createFailure.c(obj);
                flowCollector = (FlowCollector) this.L$0;
                readRecordsRequestWithPageToken$connect_client_release = this.$request;
                this.L$0 = flowCollector;
                this.L$1 = readRecordsRequestWithPageToken$connect_client_release;
                this.L$2 = null;
                this.label = 1;
                records = this.$this_readRecordsFlow.readRecords(readRecordsRequestWithPageToken$connect_client_release, this);
                if (records != objA) {
                    flowCollector2 = flowCollector;
                    obj = records;
                    readRecordsRequest = readRecordsRequestWithPageToken$connect_client_release;
                    readRecordsResponse = (ReadRecordsResponse) obj;
                    this.L$0 = flowCollector2;
                    this.L$1 = readRecordsRequest;
                    this.L$2 = readRecordsResponse;
                    this.label = 2;
                }
                return objA;
            }
            if (i == 1) {
                readRecordsRequestWithPageToken$connect_client_release = (ReadRecordsRequest) this.L$1;
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                createFailure.c(obj);
                flowCollector2 = flowCollector3;
                readRecordsRequest = readRecordsRequestWithPageToken$connect_client_release;
                readRecordsResponse = (ReadRecordsResponse) obj;
                this.L$0 = flowCollector2;
                this.L$1 = readRecordsRequest;
                this.L$2 = readRecordsResponse;
                this.label = 2;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                readRecordsResponse = (ReadRecordsResponse) this.L$2;
                readRecordsRequest = (ReadRecordsRequest) this.L$1;
                flowCollector2 = (FlowCollector) this.L$0;
                createFailure.c(obj);
            }
            flowCollector = flowCollector2;
            readRecordsRequestWithPageToken$connect_client_release = readRecordsRequest.withPageToken$connect_client_release(readRecordsResponse.getPageToken());
            if (readRecordsRequestWithPageToken$connect_client_release.getPageToken() == null) {
                return yzc.e;
            }
            this.L$0 = flowCollector;
            this.L$1 = readRecordsRequestWithPageToken$connect_client_release;
            this.L$2 = null;
            this.label = 1;
            records = this.$this_readRecordsFlow.readRecords(readRecordsRequestWithPageToken$connect_client_release, this);
            if (records != objA) {
                flowCollector2 = flowCollector;
                obj = records;
                readRecordsRequest = readRecordsRequestWithPageToken$connect_client_release;
                readRecordsResponse = (ReadRecordsResponse) obj;
                this.L$0 = flowCollector2;
                this.L$1 = readRecordsRequest;
                this.L$2 = readRecordsResponse;
                this.label = 2;
            }
            return objA;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super List<? extends T>> flowCollector, Continuation<? super yzc> continuation) {
            return ((C04131) create(flowCollector, continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
            C04131 c04131 = new C04131(this.$request, this.$this_readRecordsFlow, continuation);
            c04131.L$0 = obj;
            return c04131;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04131(ReadRecordsRequest<T> readRecordsRequest, HealthConnectClient healthConnectClient, Continuation<? super C04131> continuation) {
            super(2, continuation);
            this.$request = readRecordsRequest;
            this.$this_readRecordsFlow = healthConnectClient;
        }
    }

    public static final <T extends Record> Flow<List<T>> readRecordsFlow(HealthConnectClient healthConnectClient, ReadRecordsRequest<T> readRecordsRequest) {
        zcp.c(healthConnectClient, "");
        zcp.c(readRecordsRequest, "");
        return zjn.e(new C04131(readRecordsRequest, healthConnectClient, null));
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt$aggregate$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt", f = "HealthConnectClientAggregationExtensions.kt", i = {0}, l = {160}, m = "aggregate", n = {"aggregator"}, s = {"L$0"})
    static final class AnonymousClass1<T extends Record, R> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientAggregationExtensionsKt.aggregate(null, null, null, this);
        }

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt$aggregateFallback$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt", f = "HealthConnectClientAggregationExtensions.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, l = {64, 197, 67, a.w, 217}, m = "aggregateFallback", n = {"$this$aggregateFallback", "destination$iv$iv", "$this$aggregateFallback", "destination$iv$iv", "$this$aggregateFallback", "destination$iv$iv", "$this$aggregateFallback", "destination$iv$iv", "$this$aggregateFallback", "destination$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    static final class C04111 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientAggregationExtensionsKt.aggregateFallback((HealthConnectClient) null, (AggregateRequest) null, this);
        }

        C04111(Continuation<? super C04111> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt$aggregateFallback$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt", f = "HealthConnectClientAggregationExtensions.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, l = {90, 196, 93, 205, a.M}, m = "aggregateFallback", n = {"$this$aggregateFallback", "destination$iv$iv", "$this$aggregateFallback", "destination$iv$iv", "$this$aggregateFallback", "destination$iv$iv", "$this$aggregateFallback", "destination$iv$iv", "$this$aggregateFallback", "destination$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    static final class C04122 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientAggregationExtensionsKt.aggregateFallback((HealthConnectClient) null, (AggregateGroupByPeriodRequest) null, this);
        }

        C04122(Continuation<? super C04122> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt$aggregateFallback$9, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt", f = "HealthConnectClientAggregationExtensions.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, l = {123, 196, 126, 205, a.M}, m = "aggregateFallback", n = {"$this$aggregateFallback", "destination$iv$iv", "$this$aggregateFallback", "destination$iv$iv", "$this$aggregateFallback", "destination$iv$iv", "$this$aggregateFallback", "destination$iv$iv", "$this$aggregateFallback", "destination$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass9 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientAggregationExtensionsKt.aggregateFallback((HealthConnectClient) null, (AggregateGroupByDurationRequest) null, this);
        }

        AnonymousClass9(Continuation<? super AnonymousClass9> continuation) {
            super(continuation);
        }
    }
}
