package androidx.health.connect.client.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.health.connect.AggregateRecordsGroupedByDurationResponse;
import android.health.connect.AggregateRecordsGroupedByPeriodResponse;
import android.health.connect.AggregateRecordsResponse;
import android.health.connect.HealthConnectException;
import android.health.connect.HealthConnectManager;
import android.health.connect.LocalTimeRangeFilter;
import android.health.connect.ReadRecordsResponse;
import android.health.connect.RecordIdFilter;
import android.health.connect.changelog.ChangeLogTokenResponse;
import android.health.connect.changelog.ChangeLogsResponse;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.OutcomeReceiverKt;
import androidx.core.view.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.HealthConnectFeatures;
import androidx.health.connect.client.PermissionController;
import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByDuration;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByPeriod;
import androidx.health.connect.client.changes.DeletionChange;
import androidx.health.connect.client.changes.UpsertionChange;
import androidx.health.connect.client.feature.FeatureUtilsKt;
import androidx.health.connect.client.feature.HealthConnectFeaturesPlatformImpl;
import androidx.health.connect.client.impl.platform.ExceptionConverterKt;
import androidx.health.connect.client.impl.platform.ExceptionConverterKt$$ExternalSyntheticApiModelOutline0;
import androidx.health.connect.client.impl.platform.aggregate.AggregationExtensionsKt;
import androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt;
import androidx.health.connect.client.impl.platform.records.RecordConvertersKt;
import androidx.health.connect.client.impl.platform.request.RequestConvertersKt;
import androidx.health.connect.client.impl.platform.response.InsertRecordsResponseConverterKt;
import androidx.health.connect.client.impl.platform.response.ResponseConvertersKt;
import androidx.health.connect.client.permission.HealthPermission;
import androidx.health.connect.client.records.MedicalDataSource;
import androidx.health.connect.client.records.MedicalResource;
import androidx.health.connect.client.records.MedicalResourceId;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.request.AggregateGroupByDurationRequest;
import androidx.health.connect.client.request.AggregateGroupByPeriodRequest;
import androidx.health.connect.client.request.AggregateRequest;
import androidx.health.connect.client.request.ChangesTokenRequest;
import androidx.health.connect.client.request.CreateMedicalDataSourceRequest;
import androidx.health.connect.client.request.DeleteMedicalResourcesRequest;
import androidx.health.connect.client.request.GetMedicalDataSourcesRequest;
import androidx.health.connect.client.request.ReadMedicalResourcesRequest;
import androidx.health.connect.client.request.ReadRecordsRequest;
import androidx.health.connect.client.request.UpsertMedicalResourceRequest;
import androidx.health.connect.client.response.ChangesResponse;
import androidx.health.connect.client.response.InsertRecordsResponse;
import androidx.health.connect.client.response.ReadMedicalResourcesResponse;
import androidx.health.connect.client.response.ReadRecordResponse;
import androidx.health.connect.client.time.TimeRangeFilter;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSleepType;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import defpackage.asCoroutineDispatcher;
import defpackage.boxBoolean;
import defpackage.createFailure;
import defpackage.probeCoroutineCreated;
import defpackage.yyr;
import defpackage.yzc;
import defpackage.yzp;
import defpackage.zaj;
import defpackage.zay;
import defpackage.zbg;
import defpackage.zcn;
import defpackage.zcp;
import defpackage.zcv;
import defpackage.zes;
import defpackage.zgf;
import defpackage.zhf;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.Grouping;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\u0005\u0010\fJ\u001c\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0096@¢\u0006\u0002\u0010\u001dJ\u001c\u0010\u001e\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0096@¢\u0006\u0002\u0010\u001dJ:\u0010\u001f\u001a\u00020\u000b2\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u001bH\u0096@¢\u0006\u0002\u0010$J&\u0010\u001f\u001a\u00020\u000b2\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0!2\u0006\u0010%\u001a\u00020&H\u0096@¢\u0006\u0002\u0010'J4\u0010(\u001a\b\u0012\u0004\u0012\u0002H*0)\"\b\b\u0000\u0010**\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H*0!2\u0006\u0010+\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010,J,\u0010-\u001a\b\u0012\u0004\u0012\u0002H*0.\"\b\b\u0000\u0010**\u00020\u001c2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002H*00H\u0096@¢\u0006\u0002\u00101J\u0016\u00102\u001a\u0002032\u0006\u0010/\u001a\u000204H\u0096@¢\u0006\u0002\u00105J\u001c\u00106\u001a\b\u0012\u0004\u0012\u0002070\u001b2\u0006\u0010/\u001a\u000208H\u0096@¢\u0006\u0002\u00109J\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u001b2\u0006\u0010/\u001a\u00020<H\u0096@¢\u0006\u0002\u0010=J\u001a\u0010>\u001a\u00020\u000b2\u0010\u0010?\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030A0@H\u0002J\u0016\u0010B\u001a\u00020\n2\u0006\u0010/\u001a\u00020CH\u0096@¢\u0006\u0002\u0010DJ\u0016\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010HJ\u0014\u0010I\u001a\b\u0012\u0004\u0012\u00020\n0@H\u0096@¢\u0006\u0002\u0010JJ\u000e\u0010K\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010JJ\u0016\u0010L\u001a\u00020M2\u0006\u0010/\u001a\u00020NH\u0097@¢\u0006\u0002\u0010OJ\u0016\u0010P\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\nH\u0097@¢\u0006\u0002\u0010HJ\u001c\u0010R\u001a\b\u0012\u0004\u0012\u00020M0\u001b2\u0006\u0010/\u001a\u00020SH\u0097@¢\u0006\u0002\u0010TJ\"\u0010R\u001a\b\u0012\u0004\u0012\u00020M0\u001b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\n0\u001bH\u0097@¢\u0006\u0002\u0010\u001dJ\"\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u001b2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0\u001bH\u0097@¢\u0006\u0002\u0010\u001dJ\u0016\u0010Z\u001a\u00020[2\u0006\u0010/\u001a\u00020\\H\u0097@¢\u0006\u0002\u0010]J\"\u0010Z\u001a\b\u0012\u0004\u0012\u00020W0\u001b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020^0\u001bH\u0097@¢\u0006\u0002\u0010\u001dJ\u001c\u0010_\u001a\u00020\u000b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020^0\u001bH\u0097@¢\u0006\u0002\u0010\u001dJ\u0016\u0010_\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020`H\u0097@¢\u0006\u0002\u0010aJ2\u0010b\u001a\u0002H*\"\u0004\b\u0000\u0010*2\u001c\u0010c\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H*0d\u0012\u0006\u0012\u0004\u0018\u00010e0\bH\u0082@¢\u0006\u0002\u0010fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006g"}, d2 = {"Landroidx/health/connect/client/impl/HealthConnectClientUpsideDownImpl;", "Landroidx/health/connect/client/HealthConnectClient;", "Landroidx/health/connect/client/PermissionController;", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "revokePermissionsFunction", "Lkotlin/Function1;", "", "", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "executor", "Ljava/util/concurrent/Executor;", "healthConnectManager", "Landroid/health/connect/HealthConnectManager;", "permissionController", "getPermissionController", "()Landroidx/health/connect/client/PermissionController;", "features", "Landroidx/health/connect/client/HealthConnectFeatures;", "getFeatures", "()Landroidx/health/connect/client/HealthConnectFeatures;", "insertRecords", "Landroidx/health/connect/client/response/InsertRecordsResponse;", ParsedFieldTag.KAKA_CHECKED_IN_RECORDES, "", "Landroidx/health/connect/client/records/Record;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRecords", "deleteRecords", "recordType", "Lkotlin/reflect/KClass;", "recordIdsList", "clientRecordIdsList", "(Lkotlin/reflect/KClass;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeRangeFilter", "Landroidx/health/connect/client/time/TimeRangeFilter;", "(Lkotlin/reflect/KClass;Landroidx/health/connect/client/time/TimeRangeFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRecord", "Landroidx/health/connect/client/response/ReadRecordResponse;", ExifInterface.GPS_DIRECTION_TRUE, "recordId", "(Lkotlin/reflect/KClass;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRecords", "Landroidx/health/connect/client/response/ReadRecordsResponse;", "request", "Landroidx/health/connect/client/request/ReadRecordsRequest;", "(Landroidx/health/connect/client/request/ReadRecordsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregate", "Landroidx/health/connect/client/aggregate/AggregationResult;", "Landroidx/health/connect/client/request/AggregateRequest;", "(Landroidx/health/connect/client/request/AggregateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregateGroupByDuration", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByDuration;", "Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;", "(Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregateGroupByPeriod", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByPeriod;", "Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;", "(Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requireAggregationMetrics", "metrics", "", "Landroidx/health/connect/client/aggregate/AggregateMetric;", "getChangesToken", "Landroidx/health/connect/client/request/ChangesTokenRequest;", "(Landroidx/health/connect/client/request/ChangesTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChanges", "Landroidx/health/connect/client/response/ChangesResponse;", "changesToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGrantedPermissions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "revokeAllPermissions", "createMedicalDataSource", "Landroidx/health/connect/client/records/MedicalDataSource;", "Landroidx/health/connect/client/request/CreateMedicalDataSourceRequest;", "(Landroidx/health/connect/client/request/CreateMedicalDataSourceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMedicalDataSourceWithData", "id", "getMedicalDataSources", "Landroidx/health/connect/client/request/GetMedicalDataSourcesRequest;", "(Landroidx/health/connect/client/request/GetMedicalDataSourcesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ids", "upsertMedicalResources", "Landroidx/health/connect/client/records/MedicalResource;", "requests", "Landroidx/health/connect/client/request/UpsertMedicalResourceRequest;", "readMedicalResources", "Landroidx/health/connect/client/response/ReadMedicalResourcesResponse;", "Landroidx/health/connect/client/request/ReadMedicalResourcesRequest;", "(Landroidx/health/connect/client/request/ReadMedicalResourcesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/health/connect/client/records/MedicalResourceId;", "deleteMedicalResources", "Landroidx/health/connect/client/request/DeleteMedicalResourcesRequest;", "(Landroidx/health/connect/client/request/DeleteMedicalResourcesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wrapPlatformException", "function", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthConnectClientUpsideDownImpl implements HealthConnectClient, PermissionController {
    private final Context context;
    private final Executor executor;
    private final HealthConnectFeatures features;
    private final HealthConnectManager healthConnectManager;
    private final Function1<Collection<String>, yzc> revokePermissionsFunction;

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends zcn implements Function1<Collection<String>, yzc> {
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ yzc invoke(Collection<String> collection) {
            invoke2(collection);
            return yzc.e;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Collection<String> collection) {
            zcp.c(collection, "");
            ((Context) this.receiver).revokeSelfPermissionsOnKill(collection);
        }

        AnonymousClass1(Object obj) {
            super(1, obj, Context.class, "revokeSelfPermissionsOnKill", "revokeSelfPermissionsOnKill(Ljava/util/Collection;)V", 0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HealthConnectClientUpsideDownImpl(Context context) {
        this(context, new AnonymousClass1(context));
        zcp.c(context, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthConnectClientUpsideDownImpl(Context context, Function1<? super Collection<String>, yzc> function1) {
        zcp.c(context, "");
        zcp.c(function1, "");
        this.executor = asCoroutineDispatcher.d(zhf.e());
        this.features = new HealthConnectFeaturesPlatformImpl();
        this.context = context;
        Object systemService = context.getSystemService("healthconnect");
        zcp.e(systemService, "");
        this.healthConnectManager = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m73m(systemService);
        this.revokePermissionsFunction = function1;
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public PermissionController getPermissionController() {
        return this;
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public HealthConnectFeatures getFeatures() {
        return this.features;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.HealthConnectClient
    public Object insertRecords(List<? extends Record> list, Continuation<? super InsertRecordsResponse> continuation) throws Exception {
        C04031 c04031;
        if (continuation instanceof C04031) {
            c04031 = (C04031) continuation;
            if ((c04031.label & Integer.MIN_VALUE) != 0) {
                c04031.label -= Integer.MIN_VALUE;
            } else {
                c04031 = new C04031(continuation);
            }
        } else {
            c04031 = new C04031(continuation);
        }
        Object objWrapPlatformException = c04031.result;
        Object objA = zbg.a();
        int i = c04031.label;
        if (i == 0) {
            createFailure.c(objWrapPlatformException);
            HealthConnectClientUpsideDownImpl$insertRecords$response$1 healthConnectClientUpsideDownImpl$insertRecords$response$1 = new HealthConnectClientUpsideDownImpl$insertRecords$response$1(this, list, null);
            c04031.label = 1;
            objWrapPlatformException = wrapPlatformException(healthConnectClientUpsideDownImpl$insertRecords$response$1, c04031);
            if (objWrapPlatformException == objA) {
                return objA;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            createFailure.c(objWrapPlatformException);
        }
        android.health.connect.InsertRecordsResponse insertRecordsResponseM74m = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m74m(objWrapPlatformException);
        zcp.e(insertRecordsResponseM74m);
        return InsertRecordsResponseConverterKt.toKtResponse(insertRecordsResponseM74m);
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$updateRecords$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$updateRecords$2", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {634}, m = "invokeSuspend", n = {}, s = {})
    static final class C04082 extends SuspendLambda implements Function1<Continuation<? super Void>, Object> {
        final /* synthetic */ List<Record> $records;
        Object L$0;
        Object L$1;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA = zbg.a();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(obj);
                return obj;
            }
            createFailure.c(obj);
            HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = HealthConnectClientUpsideDownImpl.this;
            List<Record> list = this.$records;
            this.L$0 = healthConnectClientUpsideDownImpl;
            this.L$1 = list;
            this.label = 1;
            C04082 c04082 = this;
            zgf zgfVar = new zgf(zbg.c(c04082), 1);
            zgfVar.initCancellability();
            zgf zgfVar2 = zgfVar;
            HealthConnectManager healthConnectManager = healthConnectClientUpsideDownImpl.healthConnectManager;
            List<Record> list2 = list;
            ArrayList arrayList = new ArrayList(yzp.e(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(RecordConvertersKt.toPlatformRecord((Record) it.next()));
            }
            healthConnectManager.updateRecords(arrayList, healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(zgfVar2));
            Object objB = zgfVar.b();
            if (objB == zbg.a()) {
                probeCoroutineCreated.e(c04082);
            }
            return objB == objA ? objA : objB;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Void> continuation) {
            return ((C04082) create(continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Continuation<?> continuation) {
            return HealthConnectClientUpsideDownImpl.this.new C04082(this.$records, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04082(List<? extends Record> list, Continuation<? super C04082> continuation) {
            super(1, continuation);
            this.$records = list;
        }
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public Object updateRecords(List<? extends Record> list, Continuation<? super yzc> continuation) throws Exception {
        Object objWrapPlatformException = wrapPlatformException(new C04082(list, null), continuation);
        return objWrapPlatformException == zbg.a() ? objWrapPlatformException : yzc.e;
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteRecords$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteRecords$2", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {634}, m = "invokeSuspend", n = {}, s = {})
    static final class C03962 extends SuspendLambda implements Function1<Continuation<? super Void>, Object> {
        final /* synthetic */ List<String> $clientRecordIdsList;
        final /* synthetic */ List<String> $recordIdsList;
        final /* synthetic */ KClass<? extends Record> $recordType;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA = zbg.a();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(obj);
                return obj;
            }
            createFailure.c(obj);
            HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = HealthConnectClientUpsideDownImpl.this;
            List<String> list = this.$recordIdsList;
            List<String> list2 = this.$clientRecordIdsList;
            KClass<? extends Record> kClass = this.$recordType;
            this.L$0 = healthConnectClientUpsideDownImpl;
            this.L$1 = list;
            this.L$2 = list2;
            this.L$3 = kClass;
            this.label = 1;
            C03962 c03962 = this;
            zgf zgfVar = new zgf(zbg.c(c03962), 1);
            zgfVar.initCancellability();
            zgf zgfVar2 = zgfVar;
            HealthConnectManager healthConnectManager = healthConnectClientUpsideDownImpl.healthConnectManager;
            List listC = yzp.c();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listC.add(RecordIdFilter.fromId(RecordConvertersKt.toPlatformRecordClass(kClass), (String) it.next()));
            }
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                listC.add(RecordIdFilter.fromClientRecordId(RecordConvertersKt.toPlatformRecordClass(kClass), (String) it2.next()));
            }
            healthConnectManager.deleteRecords(yzp.c(listC), healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(zgfVar2));
            Object objB = zgfVar.b();
            if (objB == zbg.a()) {
                probeCoroutineCreated.e(c03962);
            }
            return objB == objA ? objA : objB;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Void> continuation) {
            return ((C03962) create(continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Continuation<?> continuation) {
            return HealthConnectClientUpsideDownImpl.this.new C03962(this.$recordIdsList, this.$clientRecordIdsList, this.$recordType, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03962(List<String> list, List<String> list2, KClass<? extends Record> kClass, Continuation<? super C03962> continuation) {
            super(1, continuation);
            this.$recordIdsList = list;
            this.$clientRecordIdsList = list2;
            this.$recordType = kClass;
        }
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public Object deleteRecords(KClass<? extends Record> kClass, List<String> list, List<String> list2, Continuation<? super yzc> continuation) throws Exception {
        Object objWrapPlatformException = wrapPlatformException(new C03962(list, list2, kClass, null), continuation);
        return objWrapPlatformException == zbg.a() ? objWrapPlatformException : yzc.e;
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteRecords$4, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteRecords$4", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {634}, m = "invokeSuspend", n = {}, s = {})
    static final class C03974 extends SuspendLambda implements Function1<Continuation<? super Void>, Object> {
        final /* synthetic */ KClass<? extends Record> $recordType;
        final /* synthetic */ TimeRangeFilter $timeRangeFilter;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA = zbg.a();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(obj);
                return obj;
            }
            createFailure.c(obj);
            HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = HealthConnectClientUpsideDownImpl.this;
            KClass<? extends Record> kClass = this.$recordType;
            TimeRangeFilter timeRangeFilter = this.$timeRangeFilter;
            this.L$0 = healthConnectClientUpsideDownImpl;
            this.L$1 = kClass;
            this.L$2 = timeRangeFilter;
            this.label = 1;
            C03974 c03974 = this;
            zgf zgfVar = new zgf(zbg.c(c03974), 1);
            zgfVar.initCancellability();
            healthConnectClientUpsideDownImpl.healthConnectManager.deleteRecords(RecordConvertersKt.toPlatformRecordClass(kClass), RequestConvertersKt.toPlatformTimeRangeFilter(timeRangeFilter), healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(zgfVar));
            Object objB = zgfVar.b();
            if (objB == zbg.a()) {
                probeCoroutineCreated.e(c03974);
            }
            return objB == objA ? objA : objB;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Void> continuation) {
            return ((C03974) create(continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Continuation<?> continuation) {
            return HealthConnectClientUpsideDownImpl.this.new C03974(this.$recordType, this.$timeRangeFilter, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03974(KClass<? extends Record> kClass, TimeRangeFilter timeRangeFilter, Continuation<? super C03974> continuation) {
            super(1, continuation);
            this.$recordType = kClass;
            this.$timeRangeFilter = timeRangeFilter;
        }
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public Object deleteRecords(KClass<? extends Record> kClass, TimeRangeFilter timeRangeFilter, Continuation<? super yzc> continuation) throws Exception {
        Object objWrapPlatformException = wrapPlatformException(new C03974(kClass, timeRangeFilter, null), continuation);
        return objWrapPlatformException == zbg.a() ? objWrapPlatformException : yzc.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.HealthConnectClient
    public <T extends Record> Object readRecord(KClass<T> kClass, String str, Continuation<? super ReadRecordResponse<T>> continuation) throws Exception {
        C04061 c04061;
        if (continuation instanceof C04061) {
            c04061 = (C04061) continuation;
            if ((c04061.label & Integer.MIN_VALUE) != 0) {
                c04061.label -= Integer.MIN_VALUE;
            } else {
                c04061 = new C04061(continuation);
            }
        } else {
            c04061 = new C04061(continuation);
        }
        Object objWrapPlatformException = c04061.result;
        Object objA = zbg.a();
        int i = c04061.label;
        if (i == 0) {
            createFailure.c(objWrapPlatformException);
            HealthConnectClientUpsideDownImpl$readRecord$response$1 healthConnectClientUpsideDownImpl$readRecord$response$1 = new HealthConnectClientUpsideDownImpl$readRecord$response$1(this, kClass, str, null);
            c04061.label = 1;
            objWrapPlatformException = wrapPlatformException(healthConnectClientUpsideDownImpl$readRecord$response$1, c04061);
            if (objWrapPlatformException == objA) {
                return objA;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            createFailure.c(objWrapPlatformException);
        }
        ReadRecordsResponse readRecordsResponseM75m = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m75m(objWrapPlatformException);
        if (readRecordsResponseM75m.getRecords().isEmpty()) {
            throw new RemoteException("No records");
        }
        Object obj = readRecordsResponseM75m.getRecords().get(0);
        zcp.b(obj, "");
        Record sdkRecord = RecordConvertersKt.toSdkRecord(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m(obj));
        zcp.e(sdkRecord, "");
        return new ReadRecordResponse(sdkRecord);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.HealthConnectClient
    public <T extends Record> Object readRecords(ReadRecordsRequest<T> readRecordsRequest, Continuation<? super androidx.health.connect.client.response.ReadRecordsResponse<T>> continuation) throws Exception {
        C04071 c04071;
        if (continuation instanceof C04071) {
            c04071 = (C04071) continuation;
            if ((c04071.label & Integer.MIN_VALUE) != 0) {
                c04071.label -= Integer.MIN_VALUE;
            } else {
                c04071 = new C04071(continuation);
            }
        } else {
            c04071 = new C04071(continuation);
        }
        Object objWrapPlatformException = c04071.result;
        Object objA = zbg.a();
        int i = c04071.label;
        if (i == 0) {
            createFailure.c(objWrapPlatformException);
            if (readRecordsRequest.getDeduplicateStrategy() != 0) {
                throw new yyr("An operation is not implemented: Not yet implemented");
            }
            HealthConnectClientUpsideDownImpl$readRecords$response$1 healthConnectClientUpsideDownImpl$readRecords$response$1 = new HealthConnectClientUpsideDownImpl$readRecords$response$1(this, readRecordsRequest, null);
            c04071.label = 1;
            objWrapPlatformException = wrapPlatformException(healthConnectClientUpsideDownImpl$readRecords$response$1, c04071);
            if (objWrapPlatformException == objA) {
                return objA;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            createFailure.c(objWrapPlatformException);
        }
        ReadRecordsResponse readRecordsResponseM75m = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m75m(objWrapPlatformException);
        List records = readRecordsResponseM75m.getRecords();
        zcp.b((Object) records, "");
        List list = records;
        ArrayList arrayList = new ArrayList(yzp.e(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            android.health.connect.datatypes.Record recordM79m = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m(it.next());
            zcp.e(recordM79m);
            Record sdkRecord = RecordConvertersKt.toSdkRecord(recordM79m);
            zcp.e(sdkRecord, "");
            arrayList.add(sdkRecord);
        }
        ArrayList arrayList2 = arrayList;
        Long lD = boxBoolean.d(readRecordsResponseM75m.getNextPageToken());
        if (lD.longValue() == -1) {
            lD = null;
        }
        return new androidx.health.connect.client.response.ReadRecordsResponse(arrayList2, lD != null ? lD.toString() : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.HealthConnectClient
    public Object aggregate(AggregateRequest aggregateRequest, Continuation<? super AggregationResult> continuation) throws Exception {
        C03911 c03911;
        AggregationResult aggregationResult;
        Set set;
        if (continuation instanceof C03911) {
            c03911 = (C03911) continuation;
            if ((c03911.label & Integer.MIN_VALUE) != 0) {
                c03911.label -= Integer.MIN_VALUE;
            } else {
                c03911 = new C03911(continuation);
            }
        } else {
            c03911 = new C03911(continuation);
        }
        Object objAggregateFallback = c03911.result;
        Object objA = zbg.a();
        int i = c03911.label;
        if (i == 0) {
            createFailure.c(objAggregateFallback);
            requireAggregationMetrics(aggregateRequest.getMetrics$connect_client_release());
            c03911.L$0 = aggregateRequest;
            c03911.label = 1;
            objAggregateFallback = HealthConnectClientAggregationExtensionsKt.aggregateFallback(this, aggregateRequest, c03911);
            if (objAggregateFallback != objA) {
            }
            return objA;
        }
        if (i == 1) {
            aggregateRequest = (AggregateRequest) c03911.L$0;
            createFailure.c(objAggregateFallback);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = (Set) c03911.L$1;
            aggregationResult = (AggregationResult) c03911.L$0;
            createFailure.c(objAggregateFallback);
        }
        zcp.b(objAggregateFallback, "");
        return ResponseConvertersKt.toSdkResponse((AggregateRecordsResponse<Object>) WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m72m(objAggregateFallback), (Set<? extends AggregateMetric<? extends Object>>) set).plus$connect_client_release(aggregationResult);
        AggregationResult aggregationResult2 = (AggregationResult) objAggregateFallback;
        Set<AggregateMetric<?>> metrics$connect_client_release = aggregateRequest.getMetrics$connect_client_release();
        ArrayList arrayList = new ArrayList();
        for (Object obj : metrics$connect_client_release) {
            if (AggregationExtensionsKt.isPlatformSupportedMetric((AggregateMetric) obj)) {
                arrayList.add(obj);
            }
        }
        Set setG = yzp.g((Iterable) arrayList);
        if (setG.isEmpty()) {
            return aggregationResult2;
        }
        HealthConnectClientUpsideDownImpl$aggregate$platformResponse$1 healthConnectClientUpsideDownImpl$aggregate$platformResponse$1 = new HealthConnectClientUpsideDownImpl$aggregate$platformResponse$1(this, aggregateRequest, null);
        c03911.L$0 = aggregationResult2;
        c03911.L$1 = setG;
        c03911.label = 2;
        Object objWrapPlatformException = wrapPlatformException(healthConnectClientUpsideDownImpl$aggregate$platformResponse$1, c03911);
        if (objWrapPlatformException != objA) {
            aggregationResult = aggregationResult2;
            objAggregateFallback = objWrapPlatformException;
            set = setG;
            zcp.b(objAggregateFallback, "");
            return ResponseConvertersKt.toSdkResponse((AggregateRecordsResponse<Object>) WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m72m(objAggregateFallback), (Set<? extends AggregateMetric<? extends Object>>) set).plus$connect_client_release(aggregationResult);
        }
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00cd A[LOOP:0: B:33:0x00c7->B:35:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0104  */
    /* JADX WARN: Code duplicated, block: B:44:0x0119  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.HealthConnectClient
    public Object aggregateGroupByDuration(AggregateGroupByDurationRequest aggregateGroupByDurationRequest, Continuation<? super List<AggregationResultGroupedByDuration>> continuation) throws Exception {
        C03921 c03921;
        List list;
        Set set;
        ArrayList arrayList;
        Iterator it;
        Grouping<AggregationResultGroupedByDuration, Instant> grouping;
        LinkedHashMap linkedHashMap;
        Iterator<AggregationResultGroupedByDuration> itSourceIterator;
        AggregationResultGroupedByDuration next;
        Instant instantKeyOf;
        Object obj;
        if (continuation instanceof C03921) {
            c03921 = (C03921) continuation;
            if ((c03921.label & Integer.MIN_VALUE) != 0) {
                c03921.label -= Integer.MIN_VALUE;
            } else {
                c03921 = new C03921(continuation);
            }
        } else {
            c03921 = new C03921(continuation);
        }
        Object objAggregateFallback = c03921.result;
        Object objA = zbg.a();
        int i = c03921.label;
        if (i == 0) {
            createFailure.c(objAggregateFallback);
            requireAggregationMetrics(aggregateGroupByDurationRequest.getMetrics$connect_client_release());
            c03921.L$0 = aggregateGroupByDurationRequest;
            c03921.label = 1;
            objAggregateFallback = HealthConnectClientAggregationExtensionsKt.aggregateFallback(this, aggregateGroupByDurationRequest, c03921);
            if (objAggregateFallback != objA) {
            }
            return objA;
        }
        if (i == 1) {
            aggregateGroupByDurationRequest = (AggregateGroupByDurationRequest) c03921.L$0;
            createFailure.c(objAggregateFallback);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = (Set) c03921.L$1;
            list = (List) c03921.L$0;
            createFailure.c(objAggregateFallback);
        }
        zcp.b(objAggregateFallback, "");
        Iterable iterable = (Iterable) objAggregateFallback;
        arrayList = new ArrayList(yzp.e(iterable, 10));
        it = iterable.iterator();
        while (it.hasNext()) {
            AggregateRecordsGroupedByDurationResponse aggregateRecordsGroupedByDurationResponseM = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m(it.next());
            zcp.e(aggregateRecordsGroupedByDurationResponseM);
            arrayList.add(ResponseConvertersKt.toSdkResponse((AggregateRecordsGroupedByDurationResponse<Object>) aggregateRecordsGroupedByDurationResponseM, (Set<? extends AggregateMetric<? extends Object>>) set));
        }
        final List listD = yzp.d((Collection) list, (Iterable) arrayList);
        grouping = new Grouping<AggregationResultGroupedByDuration, Instant>() { // from class: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$$inlined$groupingBy$1
            @Override // kotlin.collections.Grouping
            public Iterator<AggregationResultGroupedByDuration> sourceIterator() {
                return listD.iterator();
            }

            @Override // kotlin.collections.Grouping
            public Instant keyOf(AggregationResultGroupedByDuration element) {
                return element.getStartTime();
            }
        };
        linkedHashMap = new LinkedHashMap();
        itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            next = itSourceIterator.next();
            instantKeyOf = grouping.keyOf(next);
            obj = linkedHashMap.get(instantKeyOf);
            if (obj == null || linkedHashMap.containsKey(instantKeyOf)) {
                AggregationResultGroupedByDuration aggregationResultGroupedByDuration = (AggregationResultGroupedByDuration) obj;
                next = new AggregationResultGroupedByDuration(aggregationResultGroupedByDuration.getResult().plus$connect_client_release(next.getResult()), instantKeyOf, aggregationResultGroupedByDuration.getEndTime(), aggregationResultGroupedByDuration.getZoneOffset(), false, 16, null);
            }
            linkedHashMap.put(instantKeyOf, next);
        }
        return yzp.e((Iterable) linkedHashMap.values(), new Comparator() { // from class: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return zay.d(((AggregationResultGroupedByDuration) t).getStartTime(), ((AggregationResultGroupedByDuration) t2).getStartTime());
            }
        });
        List list2 = (List) objAggregateFallback;
        Set<AggregateMetric<?>> metrics$connect_client_release = aggregateGroupByDurationRequest.getMetrics$connect_client_release();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : metrics$connect_client_release) {
            if (AggregationExtensionsKt.isPlatformSupportedMetric((AggregateMetric) obj2)) {
                arrayList2.add(obj2);
            }
        }
        Set setG = yzp.g((Iterable) arrayList2);
        if (setG.isEmpty()) {
            return list2;
        }
        HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$platformResponse$1 healthConnectClientUpsideDownImpl$aggregateGroupByDuration$platformResponse$1 = new HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$platformResponse$1(this, aggregateGroupByDurationRequest, null);
        c03921.L$0 = list2;
        c03921.L$1 = setG;
        c03921.label = 2;
        Object objWrapPlatformException = wrapPlatformException(healthConnectClientUpsideDownImpl$aggregateGroupByDuration$platformResponse$1, c03921);
        if (objWrapPlatformException != objA) {
            list = list2;
            objAggregateFallback = objWrapPlatformException;
            set = setG;
            zcp.b(objAggregateFallback, "");
            Iterable iterable2 = (Iterable) objAggregateFallback;
            arrayList = new ArrayList(yzp.e(iterable2, 10));
            it = iterable2.iterator();
            while (it.hasNext()) {
                AggregateRecordsGroupedByDurationResponse aggregateRecordsGroupedByDurationResponseM2 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m(it.next());
                zcp.e(aggregateRecordsGroupedByDurationResponseM2);
                arrayList.add(ResponseConvertersKt.toSdkResponse((AggregateRecordsGroupedByDurationResponse<Object>) aggregateRecordsGroupedByDurationResponseM2, (Set<? extends AggregateMetric<? extends Object>>) set));
            }
            final Iterable listD2 = yzp.d((Collection) list, (Iterable) arrayList);
            grouping = new Grouping<AggregationResultGroupedByDuration, Instant>() { // from class: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$$inlined$groupingBy$1
                @Override // kotlin.collections.Grouping
                public Iterator<AggregationResultGroupedByDuration> sourceIterator() {
                    return listD2.iterator();
                }

                @Override // kotlin.collections.Grouping
                public Instant keyOf(AggregationResultGroupedByDuration element) {
                    return element.getStartTime();
                }
            };
            linkedHashMap = new LinkedHashMap();
            itSourceIterator = grouping.sourceIterator();
            while (itSourceIterator.hasNext()) {
                next = itSourceIterator.next();
                instantKeyOf = grouping.keyOf(next);
                obj = linkedHashMap.get(instantKeyOf);
                if (obj == null) {
                    AggregationResultGroupedByDuration aggregationResultGroupedByDuration2 = (AggregationResultGroupedByDuration) obj;
                    next = new AggregationResultGroupedByDuration(aggregationResultGroupedByDuration2.getResult().plus$connect_client_release(next.getResult()), instantKeyOf, aggregationResultGroupedByDuration2.getEndTime(), aggregationResultGroupedByDuration2.getZoneOffset(), false, 16, null);
                } else {
                    AggregationResultGroupedByDuration aggregationResultGroupedByDuration3 = (AggregationResultGroupedByDuration) obj;
                    next = new AggregationResultGroupedByDuration(aggregationResultGroupedByDuration3.getResult().plus$connect_client_release(next.getResult()), instantKeyOf, aggregationResultGroupedByDuration3.getEndTime(), aggregationResultGroupedByDuration3.getZoneOffset(), false, 16, null);
                }
                linkedHashMap.put(instantKeyOf, next);
            }
            return yzp.e((Iterable) linkedHashMap.values(), new Comparator() { // from class: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return zay.d(((AggregationResultGroupedByDuration) t).getStartTime(), ((AggregationResultGroupedByDuration) t2).getStartTime());
                }
            });
        }
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00db  */
    /* JADX WARN: Code duplicated, block: B:46:0x0145  */
    /* JADX WARN: Code duplicated, block: B:51:0x0177  */
    /* JADX WARN: Code duplicated, block: B:56:0x018c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.HealthConnectClient
    public Object aggregateGroupByPeriod(AggregateGroupByPeriodRequest aggregateGroupByPeriodRequest, Continuation<? super List<AggregationResultGroupedByPeriod>> continuation) throws Exception {
        C03931 c03931;
        List list;
        AggregateGroupByPeriodRequest aggregateGroupByPeriodRequest2;
        Set set;
        ArrayList arrayList;
        int i;
        Grouping<AggregationResultGroupedByPeriod, LocalDateTime> grouping;
        LinkedHashMap linkedHashMap;
        Iterator<AggregationResultGroupedByPeriod> itSourceIterator;
        AggregationResultGroupedByPeriod next;
        LocalDateTime localDateTimeKeyOf;
        Object obj;
        AggregateRecordsGroupedByPeriodResponse aggregateRecordsGroupedByPeriodResponseM71m;
        AggregationResultGroupedByPeriod sdkResponse;
        if (continuation instanceof C03931) {
            c03931 = (C03931) continuation;
            if ((c03931.label & Integer.MIN_VALUE) != 0) {
                c03931.label -= Integer.MIN_VALUE;
            } else {
                c03931 = new C03931(continuation);
            }
        } else {
            c03931 = new C03931(continuation);
        }
        Object objAggregateFallback = c03931.result;
        Object objA = zbg.a();
        int i2 = c03931.label;
        if (i2 == 0) {
            createFailure.c(objAggregateFallback);
            requireAggregationMetrics(aggregateGroupByPeriodRequest.getMetrics$connect_client_release());
            c03931.L$0 = aggregateGroupByPeriodRequest;
            c03931.label = 1;
            objAggregateFallback = HealthConnectClientAggregationExtensionsKt.aggregateFallback(this, aggregateGroupByPeriodRequest, c03931);
            if (objAggregateFallback != objA) {
            }
            return objA;
        }
        if (i2 == 1) {
            aggregateGroupByPeriodRequest = (AggregateGroupByPeriodRequest) c03931.L$0;
            createFailure.c(objAggregateFallback);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = (Set) c03931.L$2;
            list = (List) c03931.L$1;
            aggregateGroupByPeriodRequest2 = (AggregateGroupByPeriodRequest) c03931.L$0;
            createFailure.c(objAggregateFallback);
        }
        zcp.b(objAggregateFallback, "");
        Iterable iterable = (Iterable) objAggregateFallback;
        arrayList = new ArrayList(yzp.e(iterable, 10));
        i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                yzp.a();
            }
            aggregateRecordsGroupedByPeriodResponseM71m = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m71m(obj2);
            if (SdkExtensions.getExtensionVersion(34) < 10 || (aggregateGroupByPeriodRequest2.getTimeRangeSlicer().getMonths() == 0 && aggregateGroupByPeriodRequest2.getTimeRangeSlicer().getYears() == 0)) {
                zcp.e(aggregateRecordsGroupedByPeriodResponseM71m);
                sdkResponse = ResponseConvertersKt.toSdkResponse((AggregateRecordsGroupedByPeriodResponse<Object>) aggregateRecordsGroupedByPeriodResponseM71m, (Set<? extends AggregateMetric<? extends Object>>) set);
            } else {
                LocalTimeRangeFilter platformLocalTimeRangeFilter = RequestConvertersKt.toPlatformLocalTimeRangeFilter(aggregateGroupByPeriodRequest2.getTimeRangeFilter());
                LocalDateTime startTime = platformLocalTimeRangeFilter.getStartTime();
                zcp.e(startTime);
                LocalDateTime localDateTimePlus = startTime.plus((TemporalAmount) aggregateGroupByPeriodRequest2.getTimeRangeSlicer().multipliedBy(i));
                zcp.e(aggregateRecordsGroupedByPeriodResponseM71m);
                zcp.e(localDateTimePlus);
                LocalDateTime localDateTimePlus2 = localDateTimePlus.plus((TemporalAmount) aggregateGroupByPeriodRequest2.getTimeRangeSlicer());
                zcp.b((Object) localDateTimePlus2, "");
                LocalDateTime endTime = platformLocalTimeRangeFilter.getEndTime();
                zcp.e(endTime);
                sdkResponse = ResponseConvertersKt.toSdkResponse(aggregateRecordsGroupedByPeriodResponseM71m, set, localDateTimePlus, (LocalDateTime) zay.a(localDateTimePlus2, endTime));
            }
            arrayList.add(sdkResponse);
            i++;
        }
        final List listD = yzp.d((Collection) list, (Iterable) arrayList);
        grouping = new Grouping<AggregationResultGroupedByPeriod, LocalDateTime>() { // from class: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregateGroupByPeriod$$inlined$groupingBy$1
            @Override // kotlin.collections.Grouping
            public Iterator<AggregationResultGroupedByPeriod> sourceIterator() {
                return listD.iterator();
            }

            @Override // kotlin.collections.Grouping
            public LocalDateTime keyOf(AggregationResultGroupedByPeriod element) {
                return element.getStartTime();
            }
        };
        linkedHashMap = new LinkedHashMap();
        itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            next = itSourceIterator.next();
            localDateTimeKeyOf = grouping.keyOf(next);
            obj = linkedHashMap.get(localDateTimeKeyOf);
            if (obj == null || linkedHashMap.containsKey(localDateTimeKeyOf)) {
                AggregationResultGroupedByPeriod aggregationResultGroupedByPeriod = (AggregationResultGroupedByPeriod) obj;
                next = new AggregationResultGroupedByPeriod(aggregationResultGroupedByPeriod.getResult().plus$connect_client_release(next.getResult()), localDateTimeKeyOf, aggregationResultGroupedByPeriod.getEndTime(), false, 8, null);
            }
            linkedHashMap.put(localDateTimeKeyOf, next);
        }
        return yzp.e((Iterable) linkedHashMap.values(), new Comparator() { // from class: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregateGroupByPeriod$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return zay.d(((AggregationResultGroupedByPeriod) t).getStartTime(), ((AggregationResultGroupedByPeriod) t2).getStartTime());
            }
        });
        List list2 = (List) objAggregateFallback;
        Set<AggregateMetric<?>> metrics$connect_client_release = aggregateGroupByPeriodRequest.getMetrics$connect_client_release();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : metrics$connect_client_release) {
            if (AggregationExtensionsKt.isPlatformSupportedMetric((AggregateMetric) obj3)) {
                arrayList2.add(obj3);
            }
        }
        Set setG = yzp.g((Iterable) arrayList2);
        if (setG.isEmpty()) {
            return list2;
        }
        HealthConnectClientUpsideDownImpl$aggregateGroupByPeriod$platformResponse$1 healthConnectClientUpsideDownImpl$aggregateGroupByPeriod$platformResponse$1 = new HealthConnectClientUpsideDownImpl$aggregateGroupByPeriod$platformResponse$1(this, aggregateGroupByPeriodRequest, null);
        c03931.L$0 = aggregateGroupByPeriodRequest;
        c03931.L$1 = list2;
        c03931.L$2 = setG;
        c03931.label = 2;
        Object objWrapPlatformException = wrapPlatformException(healthConnectClientUpsideDownImpl$aggregateGroupByPeriod$platformResponse$1, c03931);
        if (objWrapPlatformException != objA) {
            list = list2;
            objAggregateFallback = objWrapPlatformException;
            aggregateGroupByPeriodRequest2 = aggregateGroupByPeriodRequest;
            set = setG;
            zcp.b(objAggregateFallback, "");
            Iterable iterable2 = (Iterable) objAggregateFallback;
            arrayList = new ArrayList(yzp.e(iterable2, 10));
            i = 0;
            while (r13.hasNext()) {
                if (i < 0) {
                    yzp.a();
                }
                aggregateRecordsGroupedByPeriodResponseM71m = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m71m(obj2);
                if (SdkExtensions.getExtensionVersion(34) < 10) {
                    zcp.e(aggregateRecordsGroupedByPeriodResponseM71m);
                    sdkResponse = ResponseConvertersKt.toSdkResponse((AggregateRecordsGroupedByPeriodResponse<Object>) aggregateRecordsGroupedByPeriodResponseM71m, (Set<? extends AggregateMetric<? extends Object>>) set);
                } else {
                    zcp.e(aggregateRecordsGroupedByPeriodResponseM71m);
                    sdkResponse = ResponseConvertersKt.toSdkResponse((AggregateRecordsGroupedByPeriodResponse<Object>) aggregateRecordsGroupedByPeriodResponseM71m, (Set<? extends AggregateMetric<? extends Object>>) set);
                }
                arrayList.add(sdkResponse);
                i++;
            }
            final Iterable listD2 = yzp.d((Collection) list, (Iterable) arrayList);
            grouping = new Grouping<AggregationResultGroupedByPeriod, LocalDateTime>() { // from class: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregateGroupByPeriod$$inlined$groupingBy$1
                @Override // kotlin.collections.Grouping
                public Iterator<AggregationResultGroupedByPeriod> sourceIterator() {
                    return listD2.iterator();
                }

                @Override // kotlin.collections.Grouping
                public LocalDateTime keyOf(AggregationResultGroupedByPeriod element) {
                    return element.getStartTime();
                }
            };
            linkedHashMap = new LinkedHashMap();
            itSourceIterator = grouping.sourceIterator();
            while (itSourceIterator.hasNext()) {
                next = itSourceIterator.next();
                localDateTimeKeyOf = grouping.keyOf(next);
                obj = linkedHashMap.get(localDateTimeKeyOf);
                if (obj == null) {
                    AggregationResultGroupedByPeriod aggregationResultGroupedByPeriod2 = (AggregationResultGroupedByPeriod) obj;
                    next = new AggregationResultGroupedByPeriod(aggregationResultGroupedByPeriod2.getResult().plus$connect_client_release(next.getResult()), localDateTimeKeyOf, aggregationResultGroupedByPeriod2.getEndTime(), false, 8, null);
                } else {
                    AggregationResultGroupedByPeriod aggregationResultGroupedByPeriod3 = (AggregationResultGroupedByPeriod) obj;
                    next = new AggregationResultGroupedByPeriod(aggregationResultGroupedByPeriod3.getResult().plus$connect_client_release(next.getResult()), localDateTimeKeyOf, aggregationResultGroupedByPeriod3.getEndTime(), false, 8, null);
                }
                linkedHashMap.put(localDateTimeKeyOf, next);
            }
            return yzp.e((Iterable) linkedHashMap.values(), new Comparator() { // from class: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregateGroupByPeriod$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return zay.d(((AggregationResultGroupedByPeriod) t).getStartTime(), ((AggregationResultGroupedByPeriod) t2).getStartTime());
                }
            });
        }
        return objA;
    }

    private final void requireAggregationMetrics(Set<? extends AggregateMetric<?>> metrics) {
        if (metrics.isEmpty()) {
            throw new IllegalArgumentException("At least one of the aggregation types must be set".toString());
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$getChangesToken$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "Landroid/health/connect/changelog/ChangeLogTokenResponse;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$getChangesToken$2", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {634}, m = "invokeSuspend", n = {}, s = {})
    static final class C04002 extends SuspendLambda implements Function1<Continuation<? super ChangeLogTokenResponse>, Object> {
        final /* synthetic */ ChangesTokenRequest $request;
        Object L$0;
        Object L$1;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA = zbg.a();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(obj);
                return obj;
            }
            createFailure.c(obj);
            HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = HealthConnectClientUpsideDownImpl.this;
            ChangesTokenRequest changesTokenRequest = this.$request;
            this.L$0 = healthConnectClientUpsideDownImpl;
            this.L$1 = changesTokenRequest;
            this.label = 1;
            C04002 c04002 = this;
            zgf zgfVar = new zgf(zbg.c(c04002), 1);
            zgfVar.initCancellability();
            healthConnectClientUpsideDownImpl.healthConnectManager.getChangeLogToken(RequestConvertersKt.toPlatformRequest(changesTokenRequest), healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(zgfVar));
            Object objB = zgfVar.b();
            if (objB == zbg.a()) {
                probeCoroutineCreated.e(c04002);
            }
            return objB == objA ? objA : objB;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super ChangeLogTokenResponse> continuation) {
            return ((C04002) create(continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Continuation<?> continuation) {
            return HealthConnectClientUpsideDownImpl.this.new C04002(this.$request, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04002(ChangesTokenRequest changesTokenRequest, Continuation<? super C04002> continuation) {
            super(1, continuation);
            this.$request = changesTokenRequest;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.HealthConnectClient
    public Object getChangesToken(ChangesTokenRequest changesTokenRequest, Continuation<? super String> continuation) throws Exception {
        C03991 c03991;
        if (continuation instanceof C03991) {
            c03991 = (C03991) continuation;
            if ((c03991.label & Integer.MIN_VALUE) != 0) {
                c03991.label -= Integer.MIN_VALUE;
            } else {
                c03991 = new C03991(continuation);
            }
        } else {
            c03991 = new C03991(continuation);
        }
        Object objWrapPlatformException = c03991.result;
        Object objA = zbg.a();
        int i = c03991.label;
        if (i == 0) {
            createFailure.c(objWrapPlatformException);
            C04002 c04002 = new C04002(changesTokenRequest, null);
            c03991.label = 1;
            objWrapPlatformException = wrapPlatformException(c04002, c03991);
            if (objWrapPlatformException == objA) {
                return objA;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            createFailure.c(objWrapPlatformException);
        }
        String token = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m76m(objWrapPlatformException).getToken();
        zcp.b((Object) token, "");
        return token;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.HealthConnectClient
    public Object getChanges(String str, Continuation<? super ChangesResponse> continuation) throws Exception {
        C03981 c03981;
        if (continuation instanceof C03981) {
            c03981 = (C03981) continuation;
            if ((c03981.label & Integer.MIN_VALUE) != 0) {
                c03981.label -= Integer.MIN_VALUE;
            } else {
                c03981 = new C03981(continuation);
            }
        } else {
            c03981 = new C03981(continuation);
        }
        Object objB = c03981.result;
        Object objA = zbg.a();
        int i = c03981.label;
        try {
            if (i == 0) {
                createFailure.c(objB);
                c03981.L$0 = str;
                c03981.label = 1;
                zgf zgfVar = new zgf(zbg.c(c03981), 1);
                zgfVar.initCancellability();
                HealthConnectManager healthConnectManager = this.healthConnectManager;
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m91m();
                healthConnectManager.getChangeLogs(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m(str).build(), this.executor, OutcomeReceiverKt.asOutcomeReceiver(zgfVar));
                objB = zgfVar.b();
                if (objB == zbg.a()) {
                    probeCoroutineCreated.e(c03981);
                }
                if (objB == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(objB);
            }
            ChangeLogsResponse changeLogsResponseM78m = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m78m(objB);
            List listC = yzp.c();
            List upsertedRecords = changeLogsResponseM78m.getUpsertedRecords();
            zcp.b((Object) upsertedRecords, "");
            Iterator it = upsertedRecords.iterator();
            while (it.hasNext()) {
                android.health.connect.datatypes.Record recordM79m = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m79m(it.next());
                zcp.e(recordM79m);
                listC.add(new UpsertionChange(RecordConvertersKt.toSdkRecord(recordM79m)));
            }
            List deletedLogs = changeLogsResponseM78m.getDeletedLogs();
            zcp.b((Object) deletedLogs, "");
            Iterator it2 = deletedLogs.iterator();
            while (it2.hasNext()) {
                String deletedRecordId = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m77m(it2.next()).getDeletedRecordId();
                zcp.b((Object) deletedRecordId, "");
                listC.add(new DeletionChange(deletedRecordId));
            }
            List listC2 = yzp.c(listC);
            String nextChangesToken = changeLogsResponseM78m.getNextChangesToken();
            zcp.b((Object) nextChangesToken, "");
            return new ChangesResponse(listC2, nextChangesToken, changeLogsResponseM78m.hasMorePages(), false);
        } catch (HealthConnectException e) {
            if (e.getErrorCode() == 3) {
                return new ChangesResponse(yzp.e(), "", false, true);
            }
            throw ExceptionConverterKt.toKtException(e);
        }
    }

    @Override // androidx.health.connect.client.PermissionController
    public Object getGrantedPermissions(Continuation<? super Set<String>> continuation) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L));
        Set setE = zaj.e();
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr == null) {
            strArr = new String[0];
        }
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            zcp.b((Object) str, "");
            if (zes.e(str, HealthPermission.PERMISSION_PREFIX, false, 2, (Object) null)) {
                int[] iArr = packageInfo.requestedPermissionsFlags;
                zcp.e(iArr);
                if ((iArr[i] & 2) > 0) {
                    String str2 = strArr[i];
                    zcp.b((Object) str2, "");
                    setE.add(str2);
                }
            }
        }
        return zaj.d(setE);
    }

    @Override // androidx.health.connect.client.PermissionController
    public Object revokeAllPermissions(Continuation<? super yzc> continuation) {
        String[] strArr = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L)).requestedPermissions;
        if (strArr == null) {
            strArr = new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            zcp.e((Object) str);
            if (zes.e(str, HealthPermission.PERMISSION_PREFIX, false, 2, (Object) null)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            this.revokePermissionsFunction.invoke(arrayList2);
        }
        return yzc.e;
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public Object createMedicalDataSource(CreateMedicalDataSourceRequest createMedicalDataSourceRequest, Continuation<? super MedicalDataSource> continuation) {
        return FeatureUtilsKt.withPhrFeatureCheckSuspend(zcv.b(getClass()), "createMedicalDataSource(request: CreateMedicalDataSourceRequest)", new AnonymousClass2(createMedicalDataSourceRequest, null), continuation);
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$createMedicalDataSource$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/health/connect/client/records/MedicalDataSource;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$createMedicalDataSource$2", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {454}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super MedicalDataSource>, Object> {
        final /* synthetic */ CreateMedicalDataSourceRequest $request;
        int label;

        /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$createMedicalDataSource$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "Landroid/health/connect/datatypes/MedicalDataSource;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$createMedicalDataSource$2$1", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {634}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super android.health.connect.datatypes.MedicalDataSource>, Object> {
            final /* synthetic */ CreateMedicalDataSourceRequest $request;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ HealthConnectClientUpsideDownImpl this$0;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objA = zbg.a();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    createFailure.c(obj);
                    return obj;
                }
                createFailure.c(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = this.this$0;
                CreateMedicalDataSourceRequest createMedicalDataSourceRequest = this.$request;
                this.L$0 = healthConnectClientUpsideDownImpl;
                this.L$1 = createMedicalDataSourceRequest;
                this.label = 1;
                AnonymousClass1 anonymousClass1 = this;
                zgf zgfVar = new zgf(zbg.c(anonymousClass1), 1);
                zgfVar.initCancellability();
                healthConnectClientUpsideDownImpl.healthConnectManager.createMedicalDataSource(createMedicalDataSourceRequest.getPlatformCreateMedicalDataSourceRequest(), healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(zgfVar));
                Object objB = zgfVar.b();
                if (objB == zbg.a()) {
                    probeCoroutineCreated.e(anonymousClass1);
                }
                return objB == objA ? objA : objB;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super android.health.connect.datatypes.MedicalDataSource> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(yzc.e);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<yzc> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$request, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl, CreateMedicalDataSourceRequest createMedicalDataSourceRequest, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = healthConnectClientUpsideDownImpl;
                this.$request = createMedicalDataSourceRequest;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objA = zbg.a();
            int i = this.label;
            if (i == 0) {
                createFailure.c(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = HealthConnectClientUpsideDownImpl.this;
                this.label = 1;
                obj = healthConnectClientUpsideDownImpl.wrapPlatformException(new AnonymousClass1(healthConnectClientUpsideDownImpl, this.$request, null), this);
                if (obj == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(obj);
            }
            zcp.b(obj, "");
            return RecordConvertersKt.toSdkMedicalDataSource(ExceptionConverterKt$$ExternalSyntheticApiModelOutline0.m122m(obj));
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super MedicalDataSource> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Continuation<?> continuation) {
            return HealthConnectClientUpsideDownImpl.this.new AnonymousClass2(this.$request, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CreateMedicalDataSourceRequest createMedicalDataSourceRequest, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$request = createMedicalDataSourceRequest;
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteMedicalDataSourceWithData$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteMedicalDataSourceWithData$2", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {471}, m = "invokeSuspend", n = {}, s = {})
    static final class C03942 extends SuspendLambda implements Function1<Continuation<? super Void>, Object> {
        final /* synthetic */ String $id;
        int label;

        /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteMedicalDataSourceWithData$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteMedicalDataSourceWithData$2$1", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {634}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Void>, Object> {
            final /* synthetic */ String $id;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ HealthConnectClientUpsideDownImpl this$0;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objA = zbg.a();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    createFailure.c(obj);
                    return obj;
                }
                createFailure.c(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = this.this$0;
                String str = this.$id;
                this.L$0 = healthConnectClientUpsideDownImpl;
                this.L$1 = str;
                this.label = 1;
                AnonymousClass1 anonymousClass1 = this;
                zgf zgfVar = new zgf(zbg.c(anonymousClass1), 1);
                zgfVar.initCancellability();
                healthConnectClientUpsideDownImpl.healthConnectManager.deleteMedicalDataSourceWithData(str, healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(zgfVar));
                Object objB = zgfVar.b();
                if (objB == zbg.a()) {
                    probeCoroutineCreated.e(anonymousClass1);
                }
                return objB == objA ? objA : objB;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Void> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(yzc.e);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<yzc> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$id, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl, String str, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = healthConnectClientUpsideDownImpl;
                this.$id = str;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objA = zbg.a();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(obj);
                return obj;
            }
            createFailure.c(obj);
            HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = HealthConnectClientUpsideDownImpl.this;
            this.label = 1;
            Object objWrapPlatformException = healthConnectClientUpsideDownImpl.wrapPlatformException(new AnonymousClass1(healthConnectClientUpsideDownImpl, this.$id, null), this);
            return objWrapPlatformException == objA ? objA : objWrapPlatformException;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Void> continuation) {
            return ((C03942) create(continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Continuation<?> continuation) {
            return HealthConnectClientUpsideDownImpl.this.new C03942(this.$id, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03942(String str, Continuation<? super C03942> continuation) {
            super(1, continuation);
            this.$id = str;
        }
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public Object deleteMedicalDataSourceWithData(String str, Continuation<? super yzc> continuation) {
        Object objWithPhrFeatureCheckSuspend = FeatureUtilsKt.withPhrFeatureCheckSuspend(zcv.b(getClass()), "deleteMedicalDataSourceWithData(id: String)", new C03942(str, null), continuation);
        return objWithPhrFeatureCheckSuspend == zbg.a() ? objWithPhrFeatureCheckSuspend : yzc.e;
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public Object getMedicalDataSources(GetMedicalDataSourcesRequest getMedicalDataSourcesRequest, Continuation<? super List<MedicalDataSource>> continuation) {
        return FeatureUtilsKt.withPhrFeatureCheckSuspend(zcv.b(getClass()), "getMedicalDataSources(request: GetMedicalDataSourcesRequest)", new C04012(getMedicalDataSourcesRequest, null), continuation);
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$getMedicalDataSources$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Landroidx/health/connect/client/records/MedicalDataSource;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$getMedicalDataSources$2", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {492}, m = "invokeSuspend", n = {}, s = {})
    static final class C04012 extends SuspendLambda implements Function1<Continuation<? super List<? extends MedicalDataSource>>, Object> {
        final /* synthetic */ GetMedicalDataSourcesRequest $request;
        int label;

        /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$getMedicalDataSources$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001H\n"}, d2 = {"<anonymous>", "", "Landroid/health/connect/datatypes/MedicalDataSource;", "kotlin.jvm.PlatformType", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$getMedicalDataSources$2$1", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {634}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super List<android.health.connect.datatypes.MedicalDataSource>>, Object> {
            final /* synthetic */ GetMedicalDataSourcesRequest $request;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ HealthConnectClientUpsideDownImpl this$0;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objA = zbg.a();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    createFailure.c(obj);
                    return obj;
                }
                createFailure.c(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = this.this$0;
                GetMedicalDataSourcesRequest getMedicalDataSourcesRequest = this.$request;
                this.L$0 = healthConnectClientUpsideDownImpl;
                this.L$1 = getMedicalDataSourcesRequest;
                this.label = 1;
                AnonymousClass1 anonymousClass1 = this;
                zgf zgfVar = new zgf(zbg.c(anonymousClass1), 1);
                zgfVar.initCancellability();
                healthConnectClientUpsideDownImpl.healthConnectManager.getMedicalDataSources(getMedicalDataSourcesRequest.getPlatformGetMedicalDataSourcesRequest(), healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(zgfVar));
                Object objB = zgfVar.b();
                if (objB == zbg.a()) {
                    probeCoroutineCreated.e(anonymousClass1);
                }
                return objB == objA ? objA : objB;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super List<android.health.connect.datatypes.MedicalDataSource>> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(yzc.e);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<yzc> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$request, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl, GetMedicalDataSourcesRequest getMedicalDataSourcesRequest, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = healthConnectClientUpsideDownImpl;
                this.$request = getMedicalDataSourcesRequest;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objA = zbg.a();
            int i = this.label;
            if (i == 0) {
                createFailure.c(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = HealthConnectClientUpsideDownImpl.this;
                this.label = 1;
                obj = healthConnectClientUpsideDownImpl.wrapPlatformException(new AnonymousClass1(healthConnectClientUpsideDownImpl, this.$request, null), this);
                if (obj == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(obj);
            }
            zcp.b(obj, "");
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(yzp.e(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                android.health.connect.datatypes.MedicalDataSource medicalDataSourceM122m = ExceptionConverterKt$$ExternalSyntheticApiModelOutline0.m122m(it.next());
                zcp.e(medicalDataSourceM122m);
                arrayList.add(RecordConvertersKt.toSdkMedicalDataSource(medicalDataSourceM122m));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<MedicalDataSource>> continuation) {
            return ((C04012) create(continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends MedicalDataSource>> continuation) {
            return invoke2((Continuation<? super List<MedicalDataSource>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Continuation<?> continuation) {
            return HealthConnectClientUpsideDownImpl.this.new C04012(this.$request, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04012(GetMedicalDataSourcesRequest getMedicalDataSourcesRequest, Continuation<? super C04012> continuation) {
            super(1, continuation);
            this.$request = getMedicalDataSourcesRequest;
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$getMedicalDataSources$4, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Landroidx/health/connect/client/records/MedicalDataSource;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$getMedicalDataSources$4", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {TypedValues.PositionType.TYPE_CURVE_FIT}, m = "invokeSuspend", n = {}, s = {})
    static final class C04024 extends SuspendLambda implements Function1<Continuation<? super List<? extends MedicalDataSource>>, Object> {
        final /* synthetic */ List<String> $ids;
        int label;

        /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$getMedicalDataSources$4$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001H\n"}, d2 = {"<anonymous>", "", "Landroid/health/connect/datatypes/MedicalDataSource;", "kotlin.jvm.PlatformType", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$getMedicalDataSources$4$1", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {634}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super List<android.health.connect.datatypes.MedicalDataSource>>, Object> {
            final /* synthetic */ List<String> $ids;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ HealthConnectClientUpsideDownImpl this$0;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objA = zbg.a();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    createFailure.c(obj);
                    return obj;
                }
                createFailure.c(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = this.this$0;
                List<String> list = this.$ids;
                this.L$0 = healthConnectClientUpsideDownImpl;
                this.L$1 = list;
                this.label = 1;
                AnonymousClass1 anonymousClass1 = this;
                zgf zgfVar = new zgf(zbg.c(anonymousClass1), 1);
                zgfVar.initCancellability();
                healthConnectClientUpsideDownImpl.healthConnectManager.getMedicalDataSources(list, healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(zgfVar));
                Object objB = zgfVar.b();
                if (objB == zbg.a()) {
                    probeCoroutineCreated.e(anonymousClass1);
                }
                return objB == objA ? objA : objB;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super List<android.health.connect.datatypes.MedicalDataSource>> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(yzc.e);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<yzc> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$ids, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl, List<String> list, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = healthConnectClientUpsideDownImpl;
                this.$ids = list;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objA = zbg.a();
            int i = this.label;
            if (i == 0) {
                createFailure.c(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = HealthConnectClientUpsideDownImpl.this;
                this.label = 1;
                obj = healthConnectClientUpsideDownImpl.wrapPlatformException(new AnonymousClass1(healthConnectClientUpsideDownImpl, this.$ids, null), this);
                if (obj == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(obj);
            }
            zcp.b(obj, "");
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(yzp.e(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                android.health.connect.datatypes.MedicalDataSource medicalDataSourceM122m = ExceptionConverterKt$$ExternalSyntheticApiModelOutline0.m122m(it.next());
                zcp.e(medicalDataSourceM122m);
                arrayList.add(RecordConvertersKt.toSdkMedicalDataSource(medicalDataSourceM122m));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<MedicalDataSource>> continuation) {
            return ((C04024) create(continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends MedicalDataSource>> continuation) {
            return invoke2((Continuation<? super List<MedicalDataSource>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Continuation<?> continuation) {
            return HealthConnectClientUpsideDownImpl.this.new C04024(this.$ids, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04024(List<String> list, Continuation<? super C04024> continuation) {
            super(1, continuation);
            this.$ids = list;
        }
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public Object getMedicalDataSources(List<String> list, Continuation<? super List<MedicalDataSource>> continuation) {
        return FeatureUtilsKt.withPhrFeatureCheckSuspend(zcv.b(getClass()), "getMedicalDataSources(ids: List<String>)", new C04024(list, null), continuation);
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$upsertMedicalResources$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Landroidx/health/connect/client/records/MedicalResource;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$upsertMedicalResources$2", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {527}, m = "invokeSuspend", n = {}, s = {})
    static final class C04092 extends SuspendLambda implements Function1<Continuation<? super List<? extends MedicalResource>>, Object> {
        final /* synthetic */ List<UpsertMedicalResourceRequest> $requests;
        int label;

        /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$upsertMedicalResources$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001H\n"}, d2 = {"<anonymous>", "", "Landroid/health/connect/datatypes/MedicalResource;", "kotlin.jvm.PlatformType", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$upsertMedicalResources$2$1", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {634}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super List<android.health.connect.datatypes.MedicalResource>>, Object> {
            final /* synthetic */ List<UpsertMedicalResourceRequest> $requests;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ HealthConnectClientUpsideDownImpl this$0;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objA = zbg.a();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    createFailure.c(obj);
                    return obj;
                }
                createFailure.c(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = this.this$0;
                List<UpsertMedicalResourceRequest> list = this.$requests;
                this.L$0 = healthConnectClientUpsideDownImpl;
                this.L$1 = list;
                this.label = 1;
                AnonymousClass1 anonymousClass1 = this;
                zgf zgfVar = new zgf(zbg.c(anonymousClass1), 1);
                zgfVar.initCancellability();
                zgf zgfVar2 = zgfVar;
                HealthConnectManager healthConnectManager = healthConnectClientUpsideDownImpl.healthConnectManager;
                List<UpsertMedicalResourceRequest> list2 = list;
                ArrayList arrayList = new ArrayList(yzp.e(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UpsertMedicalResourceRequest) it.next()).getPlatformUpsertMedicalResourceRequest());
                }
                healthConnectManager.upsertMedicalResources(arrayList, healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(zgfVar2));
                Object objB = zgfVar.b();
                if (objB == zbg.a()) {
                    probeCoroutineCreated.e(anonymousClass1);
                }
                return objB == objA ? objA : objB;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super List<android.health.connect.datatypes.MedicalResource>> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(yzc.e);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<yzc> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$requests, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl, List<UpsertMedicalResourceRequest> list, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = healthConnectClientUpsideDownImpl;
                this.$requests = list;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objA = zbg.a();
            int i = this.label;
            if (i == 0) {
                createFailure.c(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = HealthConnectClientUpsideDownImpl.this;
                this.label = 1;
                obj = healthConnectClientUpsideDownImpl.wrapPlatformException(new AnonymousClass1(healthConnectClientUpsideDownImpl, this.$requests, null), this);
                if (obj == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(obj);
            }
            zcp.b(obj, "");
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(yzp.e(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                android.health.connect.datatypes.MedicalResource medicalResourceM123m = ExceptionConverterKt$$ExternalSyntheticApiModelOutline0.m123m(it.next());
                zcp.e(medicalResourceM123m);
                arrayList.add(RecordConvertersKt.toSdkMedicalResource(medicalResourceM123m));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<MedicalResource>> continuation) {
            return ((C04092) create(continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends MedicalResource>> continuation) {
            return invoke2((Continuation<? super List<MedicalResource>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Continuation<?> continuation) {
            return HealthConnectClientUpsideDownImpl.this.new C04092(this.$requests, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04092(List<UpsertMedicalResourceRequest> list, Continuation<? super C04092> continuation) {
            super(1, continuation);
            this.$requests = list;
        }
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public Object upsertMedicalResources(List<UpsertMedicalResourceRequest> list, Continuation<? super List<MedicalResource>> continuation) {
        return FeatureUtilsKt.withPhrFeatureCheckSuspend(zcv.b(getClass()), "upsertMedicalResources()", new C04092(list, null), continuation);
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public Object readMedicalResources(ReadMedicalResourcesRequest readMedicalResourcesRequest, Continuation<? super ReadMedicalResourcesResponse> continuation) {
        return FeatureUtilsKt.withPhrFeatureCheckSuspend(zcv.b(getClass()), "readMedicalResources(request: ReadMedicalResourcesRequest)", new C04042(readMedicalResourcesRequest, null), continuation);
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$readMedicalResources$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/health/connect/client/response/ReadMedicalResourcesResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$readMedicalResources$2", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {548}, m = "invokeSuspend", n = {}, s = {})
    static final class C04042 extends SuspendLambda implements Function1<Continuation<? super ReadMedicalResourcesResponse>, Object> {
        final /* synthetic */ ReadMedicalResourcesRequest $request;
        int label;

        /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$readMedicalResources$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "Landroid/health/connect/ReadMedicalResourcesResponse;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$readMedicalResources$2$1", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {634}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super android.health.connect.ReadMedicalResourcesResponse>, Object> {
            final /* synthetic */ ReadMedicalResourcesRequest $request;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ HealthConnectClientUpsideDownImpl this$0;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objA = zbg.a();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    createFailure.c(obj);
                    return obj;
                }
                createFailure.c(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = this.this$0;
                ReadMedicalResourcesRequest readMedicalResourcesRequest = this.$request;
                this.L$0 = healthConnectClientUpsideDownImpl;
                this.L$1 = readMedicalResourcesRequest;
                this.label = 1;
                AnonymousClass1 anonymousClass1 = this;
                zgf zgfVar = new zgf(zbg.c(anonymousClass1), 1);
                zgfVar.initCancellability();
                healthConnectClientUpsideDownImpl.healthConnectManager.readMedicalResources(readMedicalResourcesRequest.getPlatformReadMedicalResourcesRequest(), healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(zgfVar));
                Object objB = zgfVar.b();
                if (objB == zbg.a()) {
                    probeCoroutineCreated.e(anonymousClass1);
                }
                return objB == objA ? objA : objB;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super android.health.connect.ReadMedicalResourcesResponse> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(yzc.e);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<yzc> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$request, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl, ReadMedicalResourcesRequest readMedicalResourcesRequest, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = healthConnectClientUpsideDownImpl;
                this.$request = readMedicalResourcesRequest;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objA = zbg.a();
            int i = this.label;
            if (i == 0) {
                createFailure.c(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = HealthConnectClientUpsideDownImpl.this;
                this.label = 1;
                obj = healthConnectClientUpsideDownImpl.wrapPlatformException(new AnonymousClass1(healthConnectClientUpsideDownImpl, this.$request, null), this);
                if (obj == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(obj);
            }
            android.health.connect.ReadMedicalResourcesResponse readMedicalResourcesResponseM = ExceptionConverterKt$$ExternalSyntheticApiModelOutline0.m(obj);
            List medicalResources = readMedicalResourcesResponseM.getMedicalResources();
            zcp.b((Object) medicalResources, "");
            List list = medicalResources;
            ArrayList arrayList = new ArrayList(yzp.e(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                android.health.connect.datatypes.MedicalResource medicalResourceM123m = ExceptionConverterKt$$ExternalSyntheticApiModelOutline0.m123m(it.next());
                zcp.e(medicalResourceM123m);
                arrayList.add(RecordConvertersKt.toSdkMedicalResource(medicalResourceM123m));
            }
            return new ReadMedicalResourcesResponse(arrayList, readMedicalResourcesResponseM.getNextPageToken(), readMedicalResourcesResponseM.getRemainingCount());
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super ReadMedicalResourcesResponse> continuation) {
            return ((C04042) create(continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Continuation<?> continuation) {
            return HealthConnectClientUpsideDownImpl.this.new C04042(this.$request, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04042(ReadMedicalResourcesRequest readMedicalResourcesRequest, Continuation<? super C04042> continuation) {
            super(1, continuation);
            this.$request = readMedicalResourcesRequest;
        }
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public Object readMedicalResources(List<MedicalResourceId> list, Continuation<? super List<MedicalResource>> continuation) {
        return FeatureUtilsKt.withPhrFeatureCheckSuspend(zcv.b(getClass()), "readMedicalResources(ids: List<MedicalResourceId>)", new C04054(list, null), continuation);
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$readMedicalResources$4, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Landroidx/health/connect/client/records/MedicalResource;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$readMedicalResources$4", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {573}, m = "invokeSuspend", n = {}, s = {})
    static final class C04054 extends SuspendLambda implements Function1<Continuation<? super List<? extends MedicalResource>>, Object> {
        final /* synthetic */ List<MedicalResourceId> $ids;
        int label;

        /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$readMedicalResources$4$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001H\n"}, d2 = {"<anonymous>", "", "Landroid/health/connect/datatypes/MedicalResource;", "kotlin.jvm.PlatformType", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$readMedicalResources$4$1", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {634}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super List<android.health.connect.datatypes.MedicalResource>>, Object> {
            final /* synthetic */ List<MedicalResourceId> $ids;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ HealthConnectClientUpsideDownImpl this$0;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objA = zbg.a();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    createFailure.c(obj);
                    return obj;
                }
                createFailure.c(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = this.this$0;
                List<MedicalResourceId> list = this.$ids;
                this.L$0 = healthConnectClientUpsideDownImpl;
                this.L$1 = list;
                this.label = 1;
                AnonymousClass1 anonymousClass1 = this;
                zgf zgfVar = new zgf(zbg.c(anonymousClass1), 1);
                zgfVar.initCancellability();
                zgf zgfVar2 = zgfVar;
                HealthConnectManager healthConnectManager = healthConnectClientUpsideDownImpl.healthConnectManager;
                List<MedicalResourceId> list2 = list;
                ArrayList arrayList = new ArrayList(yzp.e(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MedicalResourceId) it.next()).getPlatformMedicalResourceId());
                }
                healthConnectManager.readMedicalResources(arrayList, healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(zgfVar2));
                Object objB = zgfVar.b();
                if (objB == zbg.a()) {
                    probeCoroutineCreated.e(anonymousClass1);
                }
                return objB == objA ? objA : objB;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super List<android.health.connect.datatypes.MedicalResource>> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(yzc.e);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<yzc> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$ids, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl, List<MedicalResourceId> list, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = healthConnectClientUpsideDownImpl;
                this.$ids = list;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objA = zbg.a();
            int i = this.label;
            if (i == 0) {
                createFailure.c(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = HealthConnectClientUpsideDownImpl.this;
                this.label = 1;
                obj = healthConnectClientUpsideDownImpl.wrapPlatformException(new AnonymousClass1(healthConnectClientUpsideDownImpl, this.$ids, null), this);
                if (obj == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(obj);
            }
            zcp.b(obj, "");
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(yzp.e(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                android.health.connect.datatypes.MedicalResource medicalResourceM123m = ExceptionConverterKt$$ExternalSyntheticApiModelOutline0.m123m(it.next());
                zcp.e(medicalResourceM123m);
                arrayList.add(RecordConvertersKt.toSdkMedicalResource(medicalResourceM123m));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<MedicalResource>> continuation) {
            return ((C04054) create(continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends MedicalResource>> continuation) {
            return invoke2((Continuation<? super List<MedicalResource>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Continuation<?> continuation) {
            return HealthConnectClientUpsideDownImpl.this.new C04054(this.$ids, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04054(List<MedicalResourceId> list, Continuation<? super C04054> continuation) {
            super(1, continuation);
            this.$ids = list;
        }
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public Object deleteMedicalResources(List<MedicalResourceId> list, Continuation<? super yzc> continuation) {
        Object objWithPhrFeatureCheckSuspend = FeatureUtilsKt.withPhrFeatureCheckSuspend(zcv.b(HealthConnectClientUpsideDownImpl.class), "deleteMedicalResources(ids: List<MedicalResourceId>)", new C03952(list, null), continuation);
        return objWithPhrFeatureCheckSuspend == zbg.a() ? objWithPhrFeatureCheckSuspend : yzc.e;
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteMedicalResources$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteMedicalResources$2", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {593}, m = "invokeSuspend", n = {}, s = {})
    static final class C03952 extends SuspendLambda implements Function1<Continuation<? super Void>, Object> {
        final /* synthetic */ List<MedicalResourceId> $ids;
        int label;

        /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteMedicalResources$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteMedicalResources$2$1", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {634}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Void>, Object> {
            final /* synthetic */ List<MedicalResourceId> $ids;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ HealthConnectClientUpsideDownImpl this$0;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objA = zbg.a();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    createFailure.c(obj);
                    return obj;
                }
                createFailure.c(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = this.this$0;
                List<MedicalResourceId> list = this.$ids;
                this.L$0 = healthConnectClientUpsideDownImpl;
                this.L$1 = list;
                this.label = 1;
                AnonymousClass1 anonymousClass1 = this;
                zgf zgfVar = new zgf(zbg.c(anonymousClass1), 1);
                zgfVar.initCancellability();
                zgf zgfVar2 = zgfVar;
                HealthConnectManager healthConnectManager = healthConnectClientUpsideDownImpl.healthConnectManager;
                List<MedicalResourceId> list2 = list;
                ArrayList arrayList = new ArrayList(yzp.e(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MedicalResourceId) it.next()).getPlatformMedicalResourceId());
                }
                healthConnectManager.deleteMedicalResources(arrayList, healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(zgfVar2));
                Object objB = zgfVar.b();
                if (objB == zbg.a()) {
                    probeCoroutineCreated.e(anonymousClass1);
                }
                return objB == objA ? objA : objB;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Void> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(yzc.e);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<yzc> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$ids, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl, List<MedicalResourceId> list, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = healthConnectClientUpsideDownImpl;
                this.$ids = list;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objA = zbg.a();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(obj);
                return obj;
            }
            createFailure.c(obj);
            HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = HealthConnectClientUpsideDownImpl.this;
            this.label = 1;
            Object objWrapPlatformException = healthConnectClientUpsideDownImpl.wrapPlatformException(new AnonymousClass1(healthConnectClientUpsideDownImpl, this.$ids, null), this);
            return objWrapPlatformException == objA ? objA : objWrapPlatformException;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Void> continuation) {
            return ((C03952) create(continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Continuation<?> continuation) {
            return HealthConnectClientUpsideDownImpl.this.new C03952(this.$ids, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03952(List<MedicalResourceId> list, Continuation<? super C03952> continuation) {
            super(1, continuation);
            this.$ids = list;
        }
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public Object deleteMedicalResources(DeleteMedicalResourcesRequest deleteMedicalResourcesRequest, Continuation<? super yzc> continuation) {
        Object objWithPhrFeatureCheckSuspend = FeatureUtilsKt.withPhrFeatureCheckSuspend(zcv.b(HealthConnectClientUpsideDownImpl.class), "deleteMedicalResources(request: DeleteMedicalResourcesRequest)", new AnonymousClass4(deleteMedicalResourcesRequest, null), continuation);
        return objWithPhrFeatureCheckSuspend == zbg.a() ? objWithPhrFeatureCheckSuspend : yzc.e;
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteMedicalResources$4, reason: invalid class name */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteMedicalResources$4", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {613}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass4 extends SuspendLambda implements Function1<Continuation<? super Void>, Object> {
        final /* synthetic */ DeleteMedicalResourcesRequest $request;
        int label;

        /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteMedicalResources$4$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteMedicalResources$4$1", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {634}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Void>, Object> {
            final /* synthetic */ DeleteMedicalResourcesRequest $request;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ HealthConnectClientUpsideDownImpl this$0;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objA = zbg.a();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    createFailure.c(obj);
                    return obj;
                }
                createFailure.c(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = this.this$0;
                DeleteMedicalResourcesRequest deleteMedicalResourcesRequest = this.$request;
                this.L$0 = healthConnectClientUpsideDownImpl;
                this.L$1 = deleteMedicalResourcesRequest;
                this.label = 1;
                AnonymousClass1 anonymousClass1 = this;
                zgf zgfVar = new zgf(zbg.c(anonymousClass1), 1);
                zgfVar.initCancellability();
                healthConnectClientUpsideDownImpl.healthConnectManager.deleteMedicalResources(deleteMedicalResourcesRequest.getPlatformReadMedicalResourcesRequest(), healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(zgfVar));
                Object objB = zgfVar.b();
                if (objB == zbg.a()) {
                    probeCoroutineCreated.e(anonymousClass1);
                }
                return objB == objA ? objA : objB;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Void> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(yzc.e);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<yzc> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$request, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl, DeleteMedicalResourcesRequest deleteMedicalResourcesRequest, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = healthConnectClientUpsideDownImpl;
                this.$request = deleteMedicalResourcesRequest;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objA = zbg.a();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(obj);
                return obj;
            }
            createFailure.c(obj);
            HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = HealthConnectClientUpsideDownImpl.this;
            this.label = 1;
            Object objWrapPlatformException = healthConnectClientUpsideDownImpl.wrapPlatformException(new AnonymousClass1(healthConnectClientUpsideDownImpl, this.$request, null), this);
            return objWrapPlatformException == objA ? objA : objWrapPlatformException;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Void> continuation) {
            return ((AnonymousClass4) create(continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Continuation<?> continuation) {
            return HealthConnectClientUpsideDownImpl.this.new AnonymousClass4(this.$request, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(DeleteMedicalResourcesRequest deleteMedicalResourcesRequest, Continuation<? super AnonymousClass4> continuation) {
            super(1, continuation);
            this.$request = deleteMedicalResourcesRequest;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final <T> Object wrapPlatformException(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) throws Exception {
        C04101 c04101;
        if (continuation instanceof C04101) {
            c04101 = (C04101) continuation;
            if ((c04101.label & Integer.MIN_VALUE) != 0) {
                c04101.label -= Integer.MIN_VALUE;
            } else {
                c04101 = new C04101(continuation);
            }
        } else {
            c04101 = new C04101(continuation);
        }
        Object obj = c04101.result;
        Object objA = zbg.a();
        int i = c04101.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(obj);
                return obj;
            }
            createFailure.c(obj);
            c04101.label = 1;
            Object objInvoke = function1.invoke(c04101);
            return objInvoke == objA ? objA : objInvoke;
        } catch (HealthConnectException e) {
            throw ExceptionConverterKt.toKtException(e);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", i = {0, 1, 1}, l = {FitnessSleepType.HW_FITNESS_WAKE, 244}, m = "aggregate", n = {"request", "fallbackResponse", "platformSupportedMetrics"}, s = {"L$0", "L$0", "L$1"})
    static final class C03911 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientUpsideDownImpl.this.aggregate(null, this);
        }

        C03911(Continuation<? super C03911> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", i = {0, 1, 1}, l = {263, OldToNewMotionPath.SPORT_TYPE_CROSS_TRAINER}, m = "aggregateGroupByDuration", n = {"request", "fallbackResponse", "platformSupportedMetrics"}, s = {"L$0", "L$0", "L$1"})
    static final class C03921 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientUpsideDownImpl.this.aggregateGroupByDuration(null, this);
        }

        C03921(Continuation<? super C03921> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregateGroupByPeriod$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", i = {0, 1, 1, 1}, l = {304, 314}, m = "aggregateGroupByPeriod", n = {"request", "request", "fallbackResponse", "platformSupportedMetrics"}, s = {"L$0", "L$0", "L$1", "L$2"})
    static final class C03931 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientUpsideDownImpl.this.aggregateGroupByPeriod(null, this);
        }

        C03931(Continuation<? super C03931> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$getChanges$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", i = {0}, l = {634}, m = "getChanges", n = {"changesToken"}, s = {"L$0"})
    static final class C03981 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientUpsideDownImpl.this.getChanges(null, this);
        }

        C03981(Continuation<? super C03981> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$getChangesToken$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {370}, m = "getChangesToken", n = {}, s = {})
    static final class C03991 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientUpsideDownImpl.this.getChangesToken(null, this);
        }

        C03991(Continuation<? super C03991> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$insertRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {AgrConstant.HEALTH_AGREEMENT_CODE}, m = "insertRecords", n = {}, s = {})
    static final class C04031 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientUpsideDownImpl.this.insertRecords(null, this);
        }

        C04031(Continuation<? super C04031> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$readRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {191}, m = "readRecord", n = {}, s = {})
    static final class C04061<T extends Record> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientUpsideDownImpl.this.readRecord(null, null, this);
        }

        C04061(Continuation<? super C04061> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$readRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {216}, m = "readRecords", n = {}, s = {})
    static final class C04071<T extends Record> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientUpsideDownImpl.this.readRecords(null, this);
        }

        C04071(Continuation<? super C04071> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$wrapPlatformException$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {627}, m = "wrapPlatformException", n = {}, s = {})
    static final class C04101<T> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientUpsideDownImpl.this.wrapPlatformException(null, this);
        }

        C04101(Continuation<? super C04101> continuation) {
            super(continuation);
        }
    }
}
