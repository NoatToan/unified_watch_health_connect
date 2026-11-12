package androidx.health.connect.client.impl;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.PermissionController;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByDuration;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByPeriod;
import androidx.health.connect.client.impl.converters.aggregate.ProtoToAggregateDataRowKt;
import androidx.health.connect.client.impl.converters.datatype.DataTypeConverterKt;
import androidx.health.connect.client.impl.converters.datatype.DataTypeIdPairConverterKt;
import androidx.health.connect.client.impl.converters.records.ProtoToRecordConvertersKt;
import androidx.health.connect.client.impl.converters.records.RecordToProtoConvertersKt;
import androidx.health.connect.client.impl.converters.request.AggregateRequestToProtoKt;
import androidx.health.connect.client.impl.converters.request.DeleteDataRangeRequestToProtoKt;
import androidx.health.connect.client.impl.converters.request.ReadDataRangeRequestToProtoKt;
import androidx.health.connect.client.impl.converters.request.ReadDataRequestToProtoKt;
import androidx.health.connect.client.impl.converters.response.ProtoToChangesResponseKt;
import androidx.health.connect.client.impl.converters.response.ProtoToReadRecordsResponseKt;
import androidx.health.connect.client.permission.HealthPermission;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.records.metadata.DataOrigin;
import androidx.health.connect.client.request.AggregateGroupByDurationRequest;
import androidx.health.connect.client.request.AggregateGroupByPeriodRequest;
import androidx.health.connect.client.request.AggregateRequest;
import androidx.health.connect.client.request.ChangesTokenRequest;
import androidx.health.connect.client.request.ReadRecordsRequest;
import androidx.health.connect.client.response.ChangesResponse;
import androidx.health.connect.client.response.InsertRecordsResponse;
import androidx.health.connect.client.response.ReadRecordResponse;
import androidx.health.connect.client.response.ReadRecordsResponse;
import androidx.health.connect.client.time.TimeRangeFilter;
import androidx.health.platform.client.HealthDataAsyncClient;
import androidx.health.platform.client.impl.logger.Logger;
import androidx.health.platform.client.proto.d1;
import androidx.health.platform.client.proto.e1;
import androidx.health.platform.client.proto.l;
import androidx.health.platform.client.proto.n;
import androidx.health.platform.client.proto.o;
import androidx.health.platform.client.proto.o1;
import androidx.health.platform.client.proto.p1;
import androidx.health.platform.client.proto.q1;
import androidx.health.platform.client.proto.s1;
import androidx.health.platform.client.proto.u0;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import defpackage.lhe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.guava.ListenableFutureKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0006\u0010\u000e\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\u0006\u0010\u000e\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u0018J&\u0010\u0019\u001a\u00020\u001a2\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@¢\u0006\u0002\u0010 J:\u0010\u0019\u001a\u00020\u001a2\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0002\u0010#J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010'J\u0016\u0010(\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020)H\u0096@¢\u0006\u0002\u0010*J\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070,H\u0096@¢\u0006\u0002\u0010-J\u001c\u0010.\u001a\u00020/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0006H\u0096@¢\u0006\u0002\u00101J4\u00102\u001a\b\u0012\u0004\u0012\u0002H403\"\b\b\u0000\u00104*\u00020\u001d2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H40\u001c2\u0006\u00105\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u00106J,\u00107\u001a\b\u0012\u0004\u0012\u0002H408\"\b\b\u0000\u00104*\u00020\u001d2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H409H\u0096@¢\u0006\u0002\u0010:J\u000e\u0010;\u001a\u00020\u001aH\u0096@¢\u0006\u0002\u0010-J\u001c\u0010<\u001a\u00020\u001a2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0006H\u0096@¢\u0006\u0002\u00101J\"\u0010=\u001a\u0002H4\"\u0004\b\u0000\u001042\f\u0010>\u001a\b\u0012\u0004\u0012\u0002H40?H\u0082\b¢\u0006\u0002\u0010@R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006A"}, d2 = {"Landroidx/health/connect/client/impl/HealthConnectClientImpl;", "Landroidx/health/connect/client/HealthConnectClient;", "Landroidx/health/connect/client/PermissionController;", "delegate", "Landroidx/health/platform/client/HealthDataAsyncClient;", "allPermissions", "", "", "(Landroidx/health/platform/client/HealthDataAsyncClient;Ljava/util/List;)V", "permissionController", "getPermissionController", "()Landroidx/health/connect/client/PermissionController;", "aggregate", "Landroidx/health/connect/client/aggregate/AggregationResult;", "request", "Landroidx/health/connect/client/request/AggregateRequest;", "(Landroidx/health/connect/client/request/AggregateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregateGroupByDuration", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByDuration;", "Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;", "(Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregateGroupByPeriod", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByPeriod;", "Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;", "(Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRecords", "", "recordType", "Lkotlin/reflect/KClass;", "Landroidx/health/connect/client/records/Record;", "timeRangeFilter", "Landroidx/health/connect/client/time/TimeRangeFilter;", "(Lkotlin/reflect/KClass;Landroidx/health/connect/client/time/TimeRangeFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordIdsList", "clientRecordIdsList", "(Lkotlin/reflect/KClass;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChanges", "Landroidx/health/connect/client/response/ChangesResponse;", "changesToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChangesToken", "Landroidx/health/connect/client/request/ChangesTokenRequest;", "(Landroidx/health/connect/client/request/ChangesTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGrantedPermissions", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertRecords", "Landroidx/health/connect/client/response/InsertRecordsResponse;", "records", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRecord", "Landroidx/health/connect/client/response/ReadRecordResponse;", "T", "recordId", "(Lkotlin/reflect/KClass;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRecords", "Landroidx/health/connect/client/response/ReadRecordsResponse;", "Landroidx/health/connect/client/request/ReadRecordsRequest;", "(Landroidx/health/connect/client/request/ReadRecordsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "revokeAllPermissions", "updateRecords", "wrapRemoteException", "function", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHealthConnectClientImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectClientImpl.kt\nandroidx/health/connect/client/impl/HealthConnectClientImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,287:1\n274#1,2:294\n276#1,8:304\n274#1,10:312\n274#1,2:322\n276#1,8:328\n274#1,2:336\n276#1,8:342\n274#1,10:350\n274#1,10:360\n274#1,10:370\n274#1,2:380\n276#1,8:390\n274#1,10:398\n274#1,10:408\n274#1,10:418\n274#1,10:428\n274#1,10:442\n76#2:288\n96#2,5:289\n1549#3:296\n1620#3,3:297\n1549#3:300\n1620#3,3:301\n1549#3:324\n1620#3,3:325\n1549#3:338\n1620#3,3:339\n1549#3:382\n1620#3,3:383\n1549#3:386\n1620#3,3:387\n1549#3:438\n1620#3,3:439\n1549#3:452\n1620#3,3:453\n*S KotlinDebug\n*F\n+ 1 HealthConnectClientImpl.kt\nandroidx/health/connect/client/impl/HealthConnectClientImpl\n*L\n85#1:294,2\n85#1:304,8\n106#1:312,10\n117#1:322,2\n117#1:328,8\n125#1:336,2\n125#1:342,8\n136#1:350,10\n154#1:360,10\n166#1:370,10\n176#1:380,2\n176#1:390,8\n199#1:398,10\n220#1:408,10\n230#1:418,10\n243#1:428,10\n258#1:442,10\n71#1:288\n71#1:289,5\n89#1:296\n89#1:297,3\n95#1:300\n95#1:301,3\n118#1:324\n118#1:325,3\n126#1:338\n126#1:339,3\n180#1:382\n180#1:383,3\n182#1:386\n182#1:387,3\n246#1:438\n246#1:439,3\n261#1:452\n261#1:453,3\n*E\n"})
public final class HealthConnectClientImpl implements HealthConnectClient, PermissionController {

    @NotNull
    private final List<String> allPermissions;

    @NotNull
    private final HealthDataAsyncClient delegate;

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$aggregate$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {}, l = {ErrorCode.ERROR_SP_NOTICE_NOT_READY}, m = "aggregate", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.aggregate(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$aggregateGroupByDuration$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {}, l = {244}, m = "aggregateGroupByDuration", n = {}, s = {})
    public static final class C12061 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C12061(Continuation<? super C12061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.aggregateGroupByDuration(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$aggregateGroupByPeriod$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {}, l = {SportSummary.VERSION_103}, m = "aggregateGroupByPeriod", n = {}, s = {})
    public static final class C12071 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C12071(Continuation<? super C12071> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.aggregateGroupByPeriod(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$deleteRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {0, 0}, l = {142}, m = "deleteRecords", n = {"recordIdsList", "clientRecordIdsList"}, s = {"L$0", "L$1"})
    public static final class C12081 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12081(Continuation<? super C12081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.deleteRecords(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$deleteRecords$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {}, l = {156}, m = "deleteRecords", n = {}, s = {})
    public static final class AnonymousClass3 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.deleteRecords(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$getChanges$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {0}, l = {206}, m = "getChanges", n = {"changesToken"}, s = {"L$0"})
    public static final class C12091 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12091(Continuation<? super C12091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.getChanges(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$getChangesToken$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {}, l = {SportReportBaseParser.ReportType.maxWaterTemperature}, m = "getChangesToken", n = {}, s = {})
    public static final class C12101 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C12101(Continuation<? super C12101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.getChangesToken(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$getGrantedPermissions$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {0}, l = {94}, m = "getGrantedPermissions", n = {"this"}, s = {"L$0"})
    public static final class C12111 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12111(Continuation<? super C12111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.getGrantedPermissions(this);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$insertRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {0}, l = {118}, m = "insertRecords", n = {"records"}, s = {"L$0"})
    public static final class C12121 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12121(Continuation<? super C12121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.insertRecords(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$readRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {0}, l = {167}, m = "readRecord", n = {"recordId"}, s = {"L$0"})
    public static final class C12131<T extends Record> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12131(Continuation<? super C12131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.readRecord(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$readRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {}, l = {221}, m = "readRecords", n = {}, s = {})
    public static final class C12141<T extends Record> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C12141(Continuation<? super C12141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.readRecords(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$revokeAllPermissions$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {}, l = {107}, m = "revokeAllPermissions", n = {}, s = {})
    public static final class C12151 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C12151(Continuation<? super C12151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.revokeAllPermissions(this);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$updateRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {0}, l = {126}, m = "updateRecords", n = {"records"}, s = {"L$0"})
    public static final class C12161 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12161(Continuation<? super C12161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.updateRecords(null, this);
        }
    }

    public HealthConnectClientImpl(@NotNull HealthDataAsyncClient delegate, @NotNull List<String> allPermissions) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(allPermissions, "allPermissions");
        this.delegate = delegate;
        this.allPermissions = allPermissions;
    }

    private final <T> T wrapRemoteException(Function0<? extends T> function) throws Throwable {
        Throwable deadObjectException;
        try {
            return function.invoke();
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public Object aggregate(@NotNull AggregateRequest aggregateRequest, @NotNull Continuation<? super AggregationResult> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Throwable deadObjectException;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objAwait = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwait);
                lhe<o1> lheVarAggregate = this.delegate.aggregate(AggregateRequestToProtoKt.toProto(aggregateRequest));
                anonymousClass1.label = 1;
                objAwait = ListenableFutureKt.await(lheVarAggregate, anonymousClass1);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwait);
            }
            List<l> listO = ((o1) objAwait).O();
            Intrinsics.checkNotNullExpressionValue(listO, "responseProto.rowsList");
            Object objFirst = CollectionsKt___CollectionsKt.first((List<? extends Object>) listO);
            Intrinsics.checkNotNullExpressionValue(objFirst, "responseProto.rowsList.first()");
            AggregationResult aggregationResultRetrieveAggregateDataRow = ProtoToAggregateDataRowKt.retrieveAggregateDataRow((l) objFirst);
            Logger.debug("HealthConnectClient", "Retrieved " + (aggregationResultRetrieveAggregateDataRow.getLongValues$connect_client_release().size() + aggregationResultRetrieveAggregateDataRow.getDoubleValues$connect_client_release().size()) + " metrics.");
            return aggregationResultRetrieveAggregateDataRow;
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public Object aggregateGroupByDuration(@NotNull AggregateGroupByDurationRequest aggregateGroupByDurationRequest, @NotNull Continuation<? super List<AggregationResultGroupedByDuration>> continuation) throws Throwable {
        C12061 c12061;
        if (continuation instanceof C12061) {
            c12061 = (C12061) continuation;
            int i = c12061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12061.label = i - Integer.MIN_VALUE;
            } else {
                c12061 = new C12061(continuation);
            }
        } else {
            c12061 = new C12061(continuation);
        }
        Object objAwait = c12061.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12061.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwait);
                lhe<o1> lheVarAggregate = this.delegate.aggregate(AggregateRequestToProtoKt.toProto(aggregateGroupByDurationRequest));
                c12061.label = 1;
                objAwait = ListenableFutureKt.await(lheVarAggregate, c12061);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwait);
            }
            List<l> listO = ((o1) objAwait).O();
            Intrinsics.checkNotNullExpressionValue(listO, "responseProto.rowsList");
            List<l> list = listO;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (l it : list) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                arrayList.add(ProtoToAggregateDataRowKt.toAggregateDataRowGroupByDuration(it));
            }
            List list2 = CollectionsKt___CollectionsKt.toList(arrayList);
            Logger.debug("HealthConnectClient", "Retrieved " + list2.size() + " duration aggregation buckets.");
            return list2;
        } catch (RemoteException e) {
            Throwable deadObjectException = e instanceof DeadObjectException ? new DeadObjectException(e.getMessage()) : e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public Object aggregateGroupByPeriod(@NotNull AggregateGroupByPeriodRequest aggregateGroupByPeriodRequest, @NotNull Continuation<? super List<AggregationResultGroupedByPeriod>> continuation) throws Throwable {
        C12071 c12071;
        if (continuation instanceof C12071) {
            c12071 = (C12071) continuation;
            int i = c12071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12071.label = i - Integer.MIN_VALUE;
            } else {
                c12071 = new C12071(continuation);
            }
        } else {
            c12071 = new C12071(continuation);
        }
        Object objAwait = c12071.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12071.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwait);
                lhe<o1> lheVarAggregate = this.delegate.aggregate(AggregateRequestToProtoKt.toProto(aggregateGroupByPeriodRequest));
                c12071.label = 1;
                objAwait = ListenableFutureKt.await(lheVarAggregate, c12071);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwait);
            }
            List<l> listO = ((o1) objAwait).O();
            Intrinsics.checkNotNullExpressionValue(listO, "responseProto.rowsList");
            List<l> list = listO;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (l it : list) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                arrayList.add(ProtoToAggregateDataRowKt.toAggregateDataRowGroupByPeriod(it));
            }
            List list2 = CollectionsKt___CollectionsKt.toList(arrayList);
            Logger.debug("HealthConnectClient", "Retrieved " + list2.size() + " period aggregation buckets.");
            return list2;
        } catch (RemoteException e) {
            Throwable deadObjectException = e instanceof DeadObjectException ? new DeadObjectException(e.getMessage()) : e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public Object deleteRecords(@NotNull KClass<? extends Record> kClass, @NotNull List<String> list, @NotNull List<String> list2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C12081 c12081;
        Throwable deadObjectException;
        if (continuation instanceof C12081) {
            c12081 = (C12081) continuation;
            int i = c12081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12081.label = i - Integer.MIN_VALUE;
            } else {
                c12081 = new C12081(continuation);
            }
        } else {
            c12081 = new C12081(continuation);
        }
        Object obj = c12081.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12081.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                lhe<Unit> lheVarDeleteData = this.delegate.deleteData(DataTypeIdPairConverterKt.toDataTypeIdPairProtoList(kClass, list), DataTypeIdPairConverterKt.toDataTypeIdPairProtoList(kClass, list2));
                c12081.L$0 = list;
                c12081.L$1 = list2;
                c12081.label = 1;
                if (ListenableFutureKt.await(lheVarDeleteData, c12081) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) c12081.L$1;
                list = (List) c12081.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Logger.debug("HealthConnectClient", (list.size() + list2.size()) + " records deleted.");
            return Unit.INSTANCE;
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public Object getChanges(@NotNull String str, @NotNull Continuation<? super ChangesResponse> continuation) throws Throwable {
        C12091 c12091;
        Throwable deadObjectException;
        if (continuation instanceof C12091) {
            c12091 = (C12091) continuation;
            int i = c12091.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12091.label = i - Integer.MIN_VALUE;
            } else {
                c12091 = new C12091(continuation);
            }
        } else {
            c12091 = new C12091(continuation);
        }
        Object objAwait = c12091.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12091.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwait);
                HealthDataAsyncClient healthDataAsyncClient = this.delegate;
                d1 d1VarBuild = d1.Q().y(str).build();
                Intrinsics.checkNotNullExpressionValue(d1VarBuild, "newBuilder()\n           …                 .build()");
                lhe<p1> changes = healthDataAsyncClient.getChanges(d1VarBuild);
                c12091.L$0 = str;
                c12091.label = 1;
                objAwait = ListenableFutureKt.await(changes, c12091);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) c12091.L$0;
                ResultKt.throwOnFailure(objAwait);
            }
            p1 p1Var = (p1) objAwait;
            Logger.debug("HealthConnectClient", "Retrieved changes successful with " + str + ", next token " + p1Var.S() + '.');
            return ProtoToChangesResponseKt.toChangesResponse(p1Var);
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public Object getChangesToken(@NotNull ChangesTokenRequest changesTokenRequest, @NotNull Continuation<? super String> continuation) throws Throwable {
        C12101 c12101;
        Throwable deadObjectException;
        if (continuation instanceof C12101) {
            c12101 = (C12101) continuation;
            int i = c12101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12101.label = i - Integer.MIN_VALUE;
            } else {
                c12101 = new C12101(continuation);
            }
        } else {
            c12101 = new C12101(continuation);
        }
        Object objAwait = c12101.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12101.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwait);
                HealthDataAsyncClient healthDataAsyncClient = this.delegate;
                e1.a aVarV = e1.V();
                Set<KClass<? extends Record>> recordTypes$connect_client_release = changesTokenRequest.getRecordTypes$connect_client_release();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(recordTypes$connect_client_release, 10));
                Iterator<T> it = recordTypes$connect_client_release.iterator();
                while (it.hasNext()) {
                    arrayList.add(DataTypeConverterKt.toDataType((KClass) it.next()));
                }
                e1.a aVarZ = aVarV.z(arrayList);
                Set<DataOrigin> dataOriginFilters$connect_client_release = changesTokenRequest.getDataOriginFilters$connect_client_release();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(dataOriginFilters$connect_client_release, 10));
                Iterator<T> it2 = dataOriginFilters$connect_client_release.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(n.S().y(((DataOrigin) it2.next()).getPackageName()).build());
                }
                e1 e1VarBuild = aVarZ.y(arrayList2).build();
                Intrinsics.checkNotNullExpressionValue(e1VarBuild, "newBuilder()\n           …                 .build()");
                lhe<q1> changesToken = healthDataAsyncClient.getChangesToken(e1VarBuild);
                c12101.label = 1;
                objAwait = ListenableFutureKt.await(changesToken, c12101);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwait);
            }
            String changeToken = ((q1) objAwait).O();
            Logger.debug("HealthConnectClient", "Retrieved change token " + changeToken + '.');
            Intrinsics.checkNotNullExpressionValue(changeToken, "changeToken");
            return changeToken;
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.PermissionController
    @Nullable
    public Object getGrantedPermissions(@NotNull Continuation<? super Set<String>> continuation) throws Throwable {
        C12111 c12111;
        Throwable deadObjectException;
        HealthConnectClientImpl healthConnectClientImpl;
        if (continuation instanceof C12111) {
            c12111 = (C12111) continuation;
            int i = c12111.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12111.label = i - Integer.MIN_VALUE;
            } else {
                c12111 = new C12111(continuation);
            }
        } else {
            c12111 = new C12111(continuation);
        }
        Object objAwait = c12111.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12111.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwait);
                HealthDataAsyncClient healthDataAsyncClient = this.delegate;
                List<String> list = this.allPermissions;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(u0.V().A((String) it.next()).build());
                }
                lhe<Set<u0>> lheVarFilterGrantedPermissions = healthDataAsyncClient.filterGrantedPermissions(CollectionsKt___CollectionsKt.toSet(arrayList));
                c12111.L$0 = this;
                c12111.label = 1;
                objAwait = ListenableFutureKt.await(lheVarFilterGrantedPermissions, c12111);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                healthConnectClientImpl = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                healthConnectClientImpl = (HealthConnectClientImpl) c12111.L$0;
                ResultKt.throwOnFailure(objAwait);
            }
            Iterable iterable = (Iterable) objAwait;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((u0) it2.next()).U());
            }
            Set set = CollectionsKt___CollectionsKt.toSet(arrayList2);
            Logger.debug("HealthConnectClient", "Granted " + set.size() + " out of " + healthConnectClientImpl.allPermissions.size() + " permissions.");
            return set;
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    @NotNull
    public PermissionController getPermissionController() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public Object insertRecords(@NotNull List<? extends Record> list, @NotNull Continuation<? super InsertRecordsResponse> continuation) throws Throwable {
        C12121 c12121;
        Throwable deadObjectException;
        if (continuation instanceof C12121) {
            c12121 = (C12121) continuation;
            int i = c12121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12121.label = i - Integer.MIN_VALUE;
            } else {
                c12121 = new C12121(continuation);
            }
        } else {
            c12121 = new C12121(continuation);
        }
        Object objAwait = c12121.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12121.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwait);
                HealthDataAsyncClient healthDataAsyncClient = this.delegate;
                List<? extends Record> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(RecordToProtoConvertersKt.toProto((Record) it.next()));
                }
                lhe<List<String>> lheVarInsertData = healthDataAsyncClient.insertData(arrayList);
                c12121.L$0 = list;
                c12121.label = 1;
                objAwait = ListenableFutureKt.await(lheVarInsertData, c12121);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) c12121.L$0;
                ResultKt.throwOnFailure(objAwait);
            }
            List list3 = (List) objAwait;
            Logger.debug("HealthConnectClient", list.size() + " records inserted.");
            return new InsertRecordsResponse(list3);
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public <T extends Record> Object readRecord(@NotNull KClass<T> kClass, @NotNull String str, @NotNull Continuation<? super ReadRecordResponse<T>> continuation) throws Throwable {
        C12131 c12131;
        Throwable deadObjectException;
        if (continuation instanceof C12131) {
            c12131 = (C12131) continuation;
            int i = c12131.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12131.label = i - Integer.MIN_VALUE;
            } else {
                c12131 = new C12131(continuation);
            }
        } else {
            c12131 = new C12131(continuation);
        }
        Object objAwait = c12131.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12131.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwait);
                lhe<o> data = this.delegate.readData(ReadDataRequestToProtoKt.toReadDataRequestProto(kClass, str));
                c12131.L$0 = str;
                c12131.label = 1;
                objAwait = ListenableFutureKt.await(data, c12131);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) c12131.L$0;
                ResultKt.throwOnFailure(objAwait);
            }
            Record record = ProtoToRecordConvertersKt.toRecord((o) objAwait);
            Intrinsics.checkNotNull(record, "null cannot be cast to non-null type T of androidx.health.connect.client.impl.HealthConnectClientImpl.readRecord");
            ReadRecordResponse readRecordResponse = new ReadRecordResponse(record);
            Logger.debug("HealthConnectClient", "Reading record of " + str + " successful.");
            return readRecordResponse;
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public <T extends Record> Object readRecords(@NotNull ReadRecordsRequest<T> readRecordsRequest, @NotNull Continuation<? super ReadRecordsResponse<T>> continuation) throws Throwable {
        C12141 c12141;
        Throwable deadObjectException;
        if (continuation instanceof C12141) {
            c12141 = (C12141) continuation;
            int i = c12141.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12141.label = i - Integer.MIN_VALUE;
            } else {
                c12141 = new C12141(continuation);
            }
        } else {
            c12141 = new C12141(continuation);
        }
        Object objAwait = c12141.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12141.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwait);
                lhe<s1> dataRange = this.delegate.readDataRange(ReadDataRangeRequestToProtoKt.toReadDataRangeRequestProto(readRecordsRequest));
                c12141.label = 1;
                objAwait = ListenableFutureKt.await(dataRange, c12141);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwait);
            }
            ReadRecordsResponse readRecordsResponse = ProtoToReadRecordsResponseKt.toReadRecordsResponse((s1) objAwait);
            Logger.debug("HealthConnectClient", "Retrieve records successful.");
            return readRecordsResponse;
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.PermissionController
    @Nullable
    public Object revokeAllPermissions(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        C12151 c12151;
        Throwable deadObjectException;
        if (continuation instanceof C12151) {
            c12151 = (C12151) continuation;
            int i = c12151.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12151.label = i - Integer.MIN_VALUE;
            } else {
                c12151 = new C12151(continuation);
            }
        } else {
            c12151 = new C12151(continuation);
        }
        Object obj = c12151.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12151.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                lhe<Unit> lheVarRevokeAllPermissions = this.delegate.revokeAllPermissions();
                c12151.label = 1;
                if (ListenableFutureKt.await(lheVarRevokeAllPermissions, c12151) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Logger.debug("HealthConnectClient", "Revoked all permissions.");
            return Unit.INSTANCE;
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public Object updateRecords(@NotNull List<? extends Record> list, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C12161 c12161;
        Throwable deadObjectException;
        if (continuation instanceof C12161) {
            c12161 = (C12161) continuation;
            int i = c12161.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12161.label = i - Integer.MIN_VALUE;
            } else {
                c12161 = new C12161(continuation);
            }
        } else {
            c12161 = new C12161(continuation);
        }
        Object obj = c12161.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12161.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                HealthDataAsyncClient healthDataAsyncClient = this.delegate;
                List<? extends Record> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(RecordToProtoConvertersKt.toProto((Record) it.next()));
                }
                lhe<Unit> lheVarUpdateData = healthDataAsyncClient.updateData(arrayList);
                c12161.L$0 = list;
                c12161.label = 1;
                if (ListenableFutureKt.await(lheVarUpdateData, c12161) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) c12161.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Logger.debug("HealthConnectClient", list.size() + " records updated.");
            return Unit.INSTANCE;
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
    }

    public /* synthetic */ HealthConnectClientImpl(HealthDataAsyncClient healthDataAsyncClient, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            Map<KClass<? extends Record>, String> rECORD_TYPE_TO_PERMISSION$connect_client_release = HealthPermission.INSTANCE.getRECORD_TYPE_TO_PERMISSION$connect_client_release();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<KClass<? extends Record>, String> entry : rECORD_TYPE_TO_PERMISSION$connect_client_release.entrySet()) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{HealthPermission.WRITE_PERMISSION_PREFIX + entry.getValue(), HealthPermission.READ_PERMISSION_PREFIX + entry.getValue()}));
            }
            listCreateListBuilder.addAll(arrayList);
            listCreateListBuilder.add(HealthPermission.PERMISSION_WRITE_EXERCISE_ROUTE);
            listCreateListBuilder.add(HealthPermission.PERMISSION_READ_HEALTH_DATA_IN_BACKGROUND);
            list = CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder);
        }
        this(healthDataAsyncClient, list);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public Object deleteRecords(@NotNull KClass<? extends Record> kClass, @NotNull TimeRangeFilter timeRangeFilter, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass3 anonymousClass3;
        Throwable deadObjectException;
        if (continuation instanceof AnonymousClass3) {
            anonymousClass3 = (AnonymousClass3) continuation;
            int i = anonymousClass3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new AnonymousClass3(continuation);
            }
        } else {
            anonymousClass3 = new AnonymousClass3(continuation);
        }
        Object obj = anonymousClass3.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass3.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                lhe<Unit> lheVarDeleteDataRange = this.delegate.deleteDataRange(DeleteDataRangeRequestToProtoKt.toDeleteDataRangeRequestProto(kClass, timeRangeFilter));
                anonymousClass3.label = 1;
                if (ListenableFutureKt.await(lheVarDeleteDataRange, anonymousClass3) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Logger.debug("HealthConnectClient", "Records deletion successful.");
            return Unit.INSTANCE;
        } catch (RemoteException e) {
            if (!(e instanceof DeadObjectException)) {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            } else {
                deadObjectException = new DeadObjectException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
    }
}
