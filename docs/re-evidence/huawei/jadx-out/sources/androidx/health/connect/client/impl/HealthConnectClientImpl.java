package androidx.health.connect.client.impl;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.HealthConnectFeatures;
import androidx.health.connect.client.PermissionController;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByDuration;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByPeriod;
import androidx.health.connect.client.feature.HealthConnectFeaturesApkImpl;
import androidx.health.connect.client.feature.HealthConnectFeaturesUnavailableImpl;
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
import androidx.health.platform.client.HealthDataService;
import androidx.health.platform.client.impl.logger.Logger;
import androidx.health.platform.client.proto.DataProto;
import androidx.health.platform.client.proto.PermissionProto;
import androidx.health.platform.client.proto.RequestProto;
import androidx.health.platform.client.proto.ResponseProto;
import androidx.media3.extractor.ts.PsExtractor;
import com.google.common.util.concurrent.ListenableFuture;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import defpackage.asDeferred;
import defpackage.createFailure;
import defpackage.yyr;
import defpackage.yzc;
import defpackage.yzp;
import defpackage.zbg;
import defpackage.zcp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0096@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0096@¢\u0006\u0002\u0010\u001dJ\u001c\u0010\u001e\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0096@¢\u0006\u0002\u0010\u001dJ:\u0010\u001f\u001a\u00020\u00142\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u001bH\u0096@¢\u0006\u0002\u0010$J&\u0010\u001f\u001a\u00020\u00142\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0!2\u0006\u0010%\u001a\u00020&H\u0096@¢\u0006\u0002\u0010'J4\u0010(\u001a\b\u0012\u0004\u0012\u0002H*0)\"\b\b\u0000\u0010**\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H*0!2\u0006\u0010+\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010,J\u0016\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020/H\u0096@¢\u0006\u0002\u00100J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\fH\u0096@¢\u0006\u0002\u00104J,\u00105\u001a\b\u0012\u0004\u0012\u0002H*06\"\b\b\u0000\u0010**\u00020\u001c2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002H*07H\u0096@¢\u0006\u0002\u00108J\u0016\u00109\u001a\u00020:2\u0006\u0010.\u001a\u00020;H\u0096@¢\u0006\u0002\u0010<J\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u001b2\u0006\u0010.\u001a\u00020?H\u0096@¢\u0006\u0002\u0010@J\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u001b2\u0006\u0010.\u001a\u00020CH\u0096@¢\u0006\u0002\u0010DJ\"\u0010E\u001a\u0002H*\"\u0004\b\u0000\u0010*2\f\u0010F\u001a\b\u0012\u0004\u0012\u0002H*0GH\u0082\b¢\u0006\u0002\u0010HR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006I"}, d2 = {"Landroidx/health/connect/client/impl/HealthConnectClientImpl;", "Landroidx/health/connect/client/HealthConnectClient;", "Landroidx/health/connect/client/PermissionController;", "delegate", "Landroidx/health/platform/client/HealthDataAsyncClient;", "features", "Landroidx/health/connect/client/HealthConnectFeatures;", "<init>", "(Landroidx/health/platform/client/HealthDataAsyncClient;Landroidx/health/connect/client/HealthConnectFeatures;)V", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "providerPackageName", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getFeatures", "()Landroidx/health/connect/client/HealthConnectFeatures;", "getGrantedPermissions", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "revokeAllPermissions", "", "permissionController", "getPermissionController", "()Landroidx/health/connect/client/PermissionController;", "insertRecords", "Landroidx/health/connect/client/response/InsertRecordsResponse;", ParsedFieldTag.KAKA_CHECKED_IN_RECORDES, "", "Landroidx/health/connect/client/records/Record;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRecords", "deleteRecords", "recordType", "Lkotlin/reflect/KClass;", "recordIdsList", "clientRecordIdsList", "(Lkotlin/reflect/KClass;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeRangeFilter", "Landroidx/health/connect/client/time/TimeRangeFilter;", "(Lkotlin/reflect/KClass;Landroidx/health/connect/client/time/TimeRangeFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRecord", "Landroidx/health/connect/client/response/ReadRecordResponse;", ExifInterface.GPS_DIRECTION_TRUE, "recordId", "(Lkotlin/reflect/KClass;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChangesToken", "request", "Landroidx/health/connect/client/request/ChangesTokenRequest;", "(Landroidx/health/connect/client/request/ChangesTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChanges", "Landroidx/health/connect/client/response/ChangesResponse;", "changesToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRecords", "Landroidx/health/connect/client/response/ReadRecordsResponse;", "Landroidx/health/connect/client/request/ReadRecordsRequest;", "(Landroidx/health/connect/client/request/ReadRecordsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregate", "Landroidx/health/connect/client/aggregate/AggregationResult;", "Landroidx/health/connect/client/request/AggregateRequest;", "(Landroidx/health/connect/client/request/AggregateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregateGroupByDuration", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByDuration;", "Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;", "(Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregateGroupByPeriod", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByPeriod;", "Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;", "(Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wrapRemoteException", "function", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthConnectClientImpl implements HealthConnectClient, PermissionController {
    private final HealthDataAsyncClient delegate;
    private final HealthConnectFeatures features;

    public HealthConnectClientImpl(HealthDataAsyncClient healthDataAsyncClient, HealthConnectFeatures healthConnectFeatures) {
        zcp.c(healthDataAsyncClient, "");
        zcp.c(healthConnectFeatures, "");
        this.delegate = healthDataAsyncClient;
        this.features = healthConnectFeatures;
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public HealthConnectFeatures getFeatures() {
        return this.features;
    }

    public HealthConnectClientImpl(Context context, String str) {
        HealthConnectFeaturesUnavailableImpl healthConnectFeaturesApkImpl;
        zcp.c(context, "");
        zcp.c(str, "");
        HealthDataAsyncClient client = HealthDataService.INSTANCE.getClient(context, str);
        if (zcp.b((Object) str, (Object) "com.google.android.apps.healthdata")) {
            healthConnectFeaturesApkImpl = new HealthConnectFeaturesApkImpl(context, str);
        } else {
            healthConnectFeaturesApkImpl = HealthConnectFeaturesUnavailableImpl.INSTANCE;
        }
        this(client, healthConnectFeaturesApkImpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.PermissionController
    public Object getGrantedPermissions(Continuation<? super Set<String>> continuation) throws Throwable {
        C03851 c03851;
        DeadObjectException deadObjectException;
        if (continuation instanceof C03851) {
            c03851 = (C03851) continuation;
            if ((c03851.label & Integer.MIN_VALUE) != 0) {
                c03851.label -= Integer.MIN_VALUE;
            } else {
                c03851 = new C03851(continuation);
            }
        } else {
            c03851 = new C03851(continuation);
        }
        Object objC = c03851.result;
        Object objA = zbg.a();
        int i = c03851.label;
        try {
            if (i == 0) {
                createFailure.c(objC);
                HealthDataAsyncClient healthDataAsyncClient = this.delegate;
                List<String> list = HealthPermission.ALL_PERMISSIONS;
                ArrayList arrayList = new ArrayList(yzp.e(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(PermissionProto.Permission.newBuilder().setPermission((String) it.next()).build());
                }
                ListenableFuture<Set<PermissionProto.Permission>> listenableFutureFilterGrantedPermissions = healthDataAsyncClient.filterGrantedPermissions(yzp.g((Iterable) arrayList));
                c03851.label = 1;
                objC = asDeferred.c(listenableFutureFilterGrantedPermissions, c03851);
                if (objC == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(objC);
            }
            Iterable iterable = (Iterable) objC;
            ArrayList arrayList2 = new ArrayList(yzp.e(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((PermissionProto.Permission) it2.next()).getPermission());
            }
            Set setG = yzp.g((Iterable) arrayList2);
            Logger.debug("HealthConnectClient", "Granted " + setG.size() + " out of " + HealthPermission.ALL_PERMISSIONS.size() + " permissions.");
            return setG;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.PermissionController
    public Object revokeAllPermissions(Continuation<? super yzc> continuation) throws RemoteException {
        C03891 c03891;
        DeadObjectException deadObjectException;
        if (continuation instanceof C03891) {
            c03891 = (C03891) continuation;
            if ((c03891.label & Integer.MIN_VALUE) != 0) {
                c03891.label -= Integer.MIN_VALUE;
            } else {
                c03891 = new C03891(continuation);
            }
        } else {
            c03891 = new C03891(continuation);
        }
        Object obj = c03891.result;
        Object objA = zbg.a();
        int i = c03891.label;
        try {
            if (i == 0) {
                createFailure.c(obj);
                ListenableFuture<yzc> listenableFutureRevokeAllPermissions = this.delegate.revokeAllPermissions();
                c03891.label = 1;
                if (asDeferred.c(listenableFutureRevokeAllPermissions, c03891) == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(obj);
            }
            Logger.debug("HealthConnectClient", "Revoked all permissions.");
            return yzc.e;
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
    public PermissionController getPermissionController() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.HealthConnectClient
    public Object insertRecords(List<? extends Record> list, Continuation<? super InsertRecordsResponse> continuation) throws Throwable {
        C03861 c03861;
        DeadObjectException deadObjectException;
        if (continuation instanceof C03861) {
            c03861 = (C03861) continuation;
            if ((c03861.label & Integer.MIN_VALUE) != 0) {
                c03861.label -= Integer.MIN_VALUE;
            } else {
                c03861 = new C03861(continuation);
            }
        } else {
            c03861 = new C03861(continuation);
        }
        Object objC = c03861.result;
        Object objA = zbg.a();
        int i = c03861.label;
        try {
            if (i == 0) {
                createFailure.c(objC);
                HealthDataAsyncClient healthDataAsyncClient = this.delegate;
                List<? extends Record> list2 = list;
                ArrayList arrayList = new ArrayList(yzp.e(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(RecordToProtoConvertersKt.toProto((Record) it.next()));
                }
                ListenableFuture<List<String>> listenableFutureInsertData = healthDataAsyncClient.insertData(arrayList);
                c03861.L$0 = list;
                c03861.label = 1;
                objC = asDeferred.c(listenableFutureInsertData, c03861);
                if (objC == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) c03861.L$0;
                createFailure.c(objC);
            }
            List list3 = (List) objC;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.HealthConnectClient
    public Object updateRecords(List<? extends Record> list, Continuation<? super yzc> continuation) throws RemoteException {
        C03901 c03901;
        DeadObjectException deadObjectException;
        if (continuation instanceof C03901) {
            c03901 = (C03901) continuation;
            if ((c03901.label & Integer.MIN_VALUE) != 0) {
                c03901.label -= Integer.MIN_VALUE;
            } else {
                c03901 = new C03901(continuation);
            }
        } else {
            c03901 = new C03901(continuation);
        }
        Object obj = c03901.result;
        Object objA = zbg.a();
        int i = c03901.label;
        try {
            if (i == 0) {
                createFailure.c(obj);
                HealthDataAsyncClient healthDataAsyncClient = this.delegate;
                List<? extends Record> list2 = list;
                ArrayList arrayList = new ArrayList(yzp.e(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(RecordToProtoConvertersKt.toProto((Record) it.next()));
                }
                ListenableFuture<yzc> listenableFutureUpdateData = healthDataAsyncClient.updateData(arrayList);
                c03901.L$0 = list;
                c03901.label = 1;
                if (asDeferred.c(listenableFutureUpdateData, c03901) == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) c03901.L$0;
                createFailure.c(obj);
            }
            Logger.debug("HealthConnectClient", list.size() + " records updated.");
            return yzc.e;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.HealthConnectClient
    public Object deleteRecords(KClass<? extends Record> kClass, List<String> list, List<String> list2, Continuation<? super yzc> continuation) throws RemoteException {
        C03821 c03821;
        DeadObjectException deadObjectException;
        if (continuation instanceof C03821) {
            c03821 = (C03821) continuation;
            if ((c03821.label & Integer.MIN_VALUE) != 0) {
                c03821.label -= Integer.MIN_VALUE;
            } else {
                c03821 = new C03821(continuation);
            }
        } else {
            c03821 = new C03821(continuation);
        }
        Object obj = c03821.result;
        Object objA = zbg.a();
        int i = c03821.label;
        try {
            if (i == 0) {
                createFailure.c(obj);
                ListenableFuture<yzc> listenableFutureDeleteData = this.delegate.deleteData(DataTypeIdPairConverterKt.toDataTypeIdPairProtoList(kClass, list), DataTypeIdPairConverterKt.toDataTypeIdPairProtoList(kClass, list2));
                c03821.L$0 = list;
                c03821.L$1 = list2;
                c03821.label = 1;
                if (asDeferred.c(listenableFutureDeleteData, c03821) == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) c03821.L$1;
                list = (List) c03821.L$0;
                createFailure.c(obj);
            }
            Logger.debug("HealthConnectClient", (list.size() + list2.size()) + " records deleted.");
            return yzc.e;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.HealthConnectClient
    public Object deleteRecords(KClass<? extends Record> kClass, TimeRangeFilter timeRangeFilter, Continuation<? super yzc> continuation) throws RemoteException {
        AnonymousClass3 anonymousClass3;
        DeadObjectException deadObjectException;
        if (continuation instanceof AnonymousClass3) {
            anonymousClass3 = (AnonymousClass3) continuation;
            if ((anonymousClass3.label & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new AnonymousClass3(continuation);
            }
        } else {
            anonymousClass3 = new AnonymousClass3(continuation);
        }
        Object obj = anonymousClass3.result;
        Object objA = zbg.a();
        int i = anonymousClass3.label;
        try {
            if (i == 0) {
                createFailure.c(obj);
                ListenableFuture<yzc> listenableFutureDeleteDataRange = this.delegate.deleteDataRange(DeleteDataRangeRequestToProtoKt.toDeleteDataRangeRequestProto(kClass, timeRangeFilter));
                anonymousClass3.label = 1;
                if (asDeferred.c(listenableFutureDeleteDataRange, anonymousClass3) == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(obj);
            }
            Logger.debug("HealthConnectClient", "Records deletion successful.");
            return yzc.e;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.HealthConnectClient
    public <T extends Record> Object readRecord(KClass<T> kClass, String str, Continuation<? super ReadRecordResponse<T>> continuation) throws Throwable {
        C03871 c03871;
        DeadObjectException deadObjectException;
        if (continuation instanceof C03871) {
            c03871 = (C03871) continuation;
            if ((c03871.label & Integer.MIN_VALUE) != 0) {
                c03871.label -= Integer.MIN_VALUE;
            } else {
                c03871 = new C03871(continuation);
            }
        } else {
            c03871 = new C03871(continuation);
        }
        Object objC = c03871.result;
        Object objA = zbg.a();
        int i = c03871.label;
        try {
            if (i == 0) {
                createFailure.c(objC);
                ListenableFuture<DataProto.DataPoint> data = this.delegate.readData(ReadDataRequestToProtoKt.toReadDataRequestProto(kClass, str));
                c03871.L$0 = str;
                c03871.label = 1;
                objC = asDeferred.c(data, c03871);
                if (objC == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) c03871.L$0;
                createFailure.c(objC);
            }
            Record record = ProtoToRecordConvertersKt.toRecord((DataProto.DataPoint) objC);
            zcp.e(record, "");
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

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.HealthConnectClient
    public Object getChangesToken(ChangesTokenRequest changesTokenRequest, Continuation<? super String> continuation) throws Throwable {
        C03841 c03841;
        DeadObjectException deadObjectException;
        if (continuation instanceof C03841) {
            c03841 = (C03841) continuation;
            if ((c03841.label & Integer.MIN_VALUE) != 0) {
                c03841.label -= Integer.MIN_VALUE;
            } else {
                c03841 = new C03841(continuation);
            }
        } else {
            c03841 = new C03841(continuation);
        }
        Object objC = c03841.result;
        Object objA = zbg.a();
        int i = c03841.label;
        try {
            if (i == 0) {
                createFailure.c(objC);
                HealthDataAsyncClient healthDataAsyncClient = this.delegate;
                RequestProto.GetChangesTokenRequest.Builder builderNewBuilder = RequestProto.GetChangesTokenRequest.newBuilder();
                Set<KClass<? extends Record>> recordTypes = changesTokenRequest.getRecordTypes();
                ArrayList arrayList = new ArrayList(yzp.e(recordTypes, 10));
                Iterator<T> it = recordTypes.iterator();
                while (it.hasNext()) {
                    arrayList.add(DataTypeConverterKt.toDataType((KClass) it.next()));
                }
                RequestProto.GetChangesTokenRequest.Builder builderAddAllDataType = builderNewBuilder.addAllDataType(arrayList);
                Set<DataOrigin> dataOriginFilters = changesTokenRequest.getDataOriginFilters();
                ArrayList arrayList2 = new ArrayList(yzp.e(dataOriginFilters, 10));
                Iterator<T> it2 = dataOriginFilters.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(DataProto.DataOrigin.newBuilder().setApplicationId(((DataOrigin) it2.next()).getPackageName()).build());
                }
                RequestProto.GetChangesTokenRequest getChangesTokenRequestBuild = builderAddAllDataType.addAllDataOriginFilters(arrayList2).build();
                zcp.b((Object) getChangesTokenRequestBuild, "");
                ListenableFuture<ResponseProto.GetChangesTokenResponse> changesToken = healthDataAsyncClient.getChangesToken(getChangesTokenRequestBuild);
                c03841.label = 1;
                objC = asDeferred.c(changesToken, c03841);
                if (objC == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(objC);
            }
            String changesToken2 = ((ResponseProto.GetChangesTokenResponse) objC).getChangesToken();
            Logger.debug("HealthConnectClient", "Retrieved change token " + changesToken2 + FilenameUtils.EXTENSION_SEPARATOR);
            zcp.e((Object) changesToken2);
            return changesToken2;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.HealthConnectClient
    public Object getChanges(String str, Continuation<? super ChangesResponse> continuation) throws Throwable {
        C03831 c03831;
        DeadObjectException deadObjectException;
        if (continuation instanceof C03831) {
            c03831 = (C03831) continuation;
            if ((c03831.label & Integer.MIN_VALUE) != 0) {
                c03831.label -= Integer.MIN_VALUE;
            } else {
                c03831 = new C03831(continuation);
            }
        } else {
            c03831 = new C03831(continuation);
        }
        Object objC = c03831.result;
        Object objA = zbg.a();
        int i = c03831.label;
        try {
            if (i == 0) {
                createFailure.c(objC);
                HealthDataAsyncClient healthDataAsyncClient = this.delegate;
                RequestProto.GetChangesRequest getChangesRequestBuild = RequestProto.GetChangesRequest.newBuilder().setChangesToken(str).build();
                zcp.b((Object) getChangesRequestBuild, "");
                ListenableFuture<ResponseProto.GetChangesResponse> changes = healthDataAsyncClient.getChanges(getChangesRequestBuild);
                c03831.L$0 = str;
                c03831.label = 1;
                objC = asDeferred.c(changes, c03831);
                if (objC == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) c03831.L$0;
                createFailure.c(objC);
            }
            ResponseProto.GetChangesResponse getChangesResponse = (ResponseProto.GetChangesResponse) objC;
            Logger.debug("HealthConnectClient", "Retrieved changes successful with " + str + ", next token " + getChangesResponse.getNextChangesToken() + FilenameUtils.EXTENSION_SEPARATOR);
            return ProtoToChangesResponseKt.toChangesResponse(getChangesResponse);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.HealthConnectClient
    public <T extends Record> Object readRecords(ReadRecordsRequest<T> readRecordsRequest, Continuation<? super ReadRecordsResponse<T>> continuation) throws Throwable {
        C03881 c03881;
        DeadObjectException deadObjectException;
        if (continuation instanceof C03881) {
            c03881 = (C03881) continuation;
            if ((c03881.label & Integer.MIN_VALUE) != 0) {
                c03881.label -= Integer.MIN_VALUE;
            } else {
                c03881 = new C03881(continuation);
            }
        } else {
            c03881 = new C03881(continuation);
        }
        Object objC = c03881.result;
        Object objA = zbg.a();
        int i = c03881.label;
        try {
            if (i == 0) {
                createFailure.c(objC);
                if (readRecordsRequest.getDeduplicateStrategy() != 0) {
                    throw new yyr("An operation is not implemented: Not yet implemented");
                }
                ListenableFuture<ResponseProto.ReadDataRangeResponse> dataRange = this.delegate.readDataRange(ReadDataRangeRequestToProtoKt.toReadDataRangeRequestProto(readRecordsRequest));
                c03881.label = 1;
                objC = asDeferred.c(dataRange, c03881);
                if (objC == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(objC);
            }
            ReadRecordsResponse readRecordsResponse = ProtoToReadRecordsResponseKt.toReadRecordsResponse((ResponseProto.ReadDataRangeResponse) objC);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.HealthConnectClient
    public Object aggregate(AggregateRequest aggregateRequest, Continuation<? super AggregationResult> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        DeadObjectException deadObjectException;
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
        Object objC = anonymousClass1.result;
        Object objA = zbg.a();
        int i = anonymousClass1.label;
        try {
            if (i == 0) {
                createFailure.c(objC);
                ListenableFuture<ResponseProto.AggregateDataResponse> listenableFutureAggregate = this.delegate.aggregate(AggregateRequestToProtoKt.toProto(aggregateRequest));
                anonymousClass1.label = 1;
                objC = asDeferred.c(listenableFutureAggregate, anonymousClass1);
                if (objC == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(objC);
            }
            List<DataProto.AggregateDataRow> rowsList = ((ResponseProto.AggregateDataResponse) objC).getRowsList();
            zcp.b((Object) rowsList, "");
            Object objI = yzp.i((List<? extends Object>) rowsList);
            zcp.b(objI, "");
            AggregationResult aggregationResultRetrieveAggregateDataRow = ProtoToAggregateDataRowKt.retrieveAggregateDataRow((DataProto.AggregateDataRow) objI);
            Logger.debug("HealthConnectClient", "Retrieved " + (aggregationResultRetrieveAggregateDataRow.getLongValues().size() + aggregationResultRetrieveAggregateDataRow.getDoubleValues().size()) + " metrics.");
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

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.HealthConnectClient
    public Object aggregateGroupByDuration(AggregateGroupByDurationRequest aggregateGroupByDurationRequest, Continuation<? super List<AggregationResultGroupedByDuration>> continuation) throws Throwable {
        C03801 c03801;
        DeadObjectException deadObjectException;
        if (continuation instanceof C03801) {
            c03801 = (C03801) continuation;
            if ((c03801.label & Integer.MIN_VALUE) != 0) {
                c03801.label -= Integer.MIN_VALUE;
            } else {
                c03801 = new C03801(continuation);
            }
        } else {
            c03801 = new C03801(continuation);
        }
        Object objC = c03801.result;
        Object objA = zbg.a();
        int i = c03801.label;
        try {
            if (i == 0) {
                createFailure.c(objC);
                ListenableFuture<ResponseProto.AggregateDataResponse> listenableFutureAggregate = this.delegate.aggregate(AggregateRequestToProtoKt.toProto(aggregateGroupByDurationRequest));
                c03801.label = 1;
                objC = asDeferred.c(listenableFutureAggregate, c03801);
                if (objC == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(objC);
            }
            List<DataProto.AggregateDataRow> rowsList = ((ResponseProto.AggregateDataResponse) objC).getRowsList();
            zcp.b((Object) rowsList, "");
            List<DataProto.AggregateDataRow> list = rowsList;
            ArrayList arrayList = new ArrayList(yzp.e(list, 10));
            for (DataProto.AggregateDataRow aggregateDataRow : list) {
                zcp.e(aggregateDataRow);
                arrayList.add(ProtoToAggregateDataRowKt.toAggregateDataRowGroupByDuration(aggregateDataRow));
            }
            List listI = yzp.i((Iterable) arrayList);
            Logger.debug("HealthConnectClient", "Retrieved " + listI.size() + " duration aggregation buckets.");
            return listI;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.health.connect.client.HealthConnectClient
    public Object aggregateGroupByPeriod(AggregateGroupByPeriodRequest aggregateGroupByPeriodRequest, Continuation<? super List<AggregationResultGroupedByPeriod>> continuation) throws Throwable {
        C03811 c03811;
        DeadObjectException deadObjectException;
        if (continuation instanceof C03811) {
            c03811 = (C03811) continuation;
            if ((c03811.label & Integer.MIN_VALUE) != 0) {
                c03811.label -= Integer.MIN_VALUE;
            } else {
                c03811 = new C03811(continuation);
            }
        } else {
            c03811 = new C03811(continuation);
        }
        Object objC = c03811.result;
        Object objA = zbg.a();
        int i = c03811.label;
        try {
            if (i == 0) {
                createFailure.c(objC);
                ListenableFuture<ResponseProto.AggregateDataResponse> listenableFutureAggregate = this.delegate.aggregate(AggregateRequestToProtoKt.toProto(aggregateGroupByPeriodRequest));
                c03811.label = 1;
                objC = asDeferred.c(listenableFutureAggregate, c03811);
                if (objC == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(objC);
            }
            List<DataProto.AggregateDataRow> rowsList = ((ResponseProto.AggregateDataResponse) objC).getRowsList();
            zcp.b((Object) rowsList, "");
            List<DataProto.AggregateDataRow> list = rowsList;
            ArrayList arrayList = new ArrayList(yzp.e(list, 10));
            for (DataProto.AggregateDataRow aggregateDataRow : list) {
                zcp.e(aggregateDataRow);
                arrayList.add(ProtoToAggregateDataRowKt.toAggregateDataRowGroupByPeriod(aggregateDataRow));
            }
            List listI = yzp.i((Iterable) arrayList);
            Logger.debug("HealthConnectClient", "Retrieved " + listI.size() + " period aggregation buckets.");
            return listI;
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

    private final <T> T wrapRemoteException(Function0<? extends T> function) throws RemoteException {
        DeadObjectException deadObjectException;
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

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$aggregate$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {}, l = {233}, m = "aggregate", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.aggregate(null, this);
        }

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$aggregateGroupByDuration$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {}, l = {243}, m = "aggregateGroupByDuration", n = {}, s = {})
    static final class C03801 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.aggregateGroupByDuration(null, this);
        }

        C03801(Continuation<? super C03801> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$aggregateGroupByPeriod$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {}, l = {255}, m = "aggregateGroupByPeriod", n = {}, s = {})
    static final class C03811 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.aggregateGroupByPeriod(null, this);
        }

        C03811(Continuation<? super C03811> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$deleteRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {0, 0}, l = {144}, m = "deleteRecords", n = {"recordIdsList", "clientRecordIdsList"}, s = {"L$0", "L$1"})
    static final class C03821 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.deleteRecords(null, null, null, this);
        }

        C03821(Continuation<? super C03821> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$deleteRecords$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {}, l = {159}, m = "deleteRecords", n = {}, s = {})
    static final class AnonymousClass3 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.deleteRecords(null, null, this);
        }

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$getChanges$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {0}, l = {a.w}, m = "getChanges", n = {"changesToken"}, s = {"L$0"})
    static final class C03831 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.getChanges(null, this);
        }

        C03831(Continuation<? super C03831> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$getChangesToken$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {}, l = {PsExtractor.AUDIO_STREAM}, m = "getChangesToken", n = {}, s = {})
    static final class C03841 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.getChangesToken(null, this);
        }

        C03841(Continuation<? super C03841> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$getGrantedPermissions$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {}, l = {101}, m = "getGrantedPermissions", n = {}, s = {})
    static final class C03851 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.getGrantedPermissions(this);
        }

        C03851(Continuation<? super C03851> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$insertRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {0}, l = {122}, m = "insertRecords", n = {ParsedFieldTag.KAKA_CHECKED_IN_RECORDES}, s = {"L$0"})
    static final class C03861 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.insertRecords(null, this);
        }

        C03861(Continuation<? super C03861> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$readRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {0}, l = {170}, m = "readRecord", n = {"recordId"}, s = {"L$0"})
    static final class C03871<T extends Record> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.readRecord(null, null, this);
        }

        C03871(Continuation<? super C03871> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$readRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {}, l = {225}, m = "readRecords", n = {}, s = {})
    static final class C03881<T extends Record> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.readRecords(null, this);
        }

        C03881(Continuation<? super C03881> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$revokeAllPermissions$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {}, l = {CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON}, m = "revokeAllPermissions", n = {}, s = {})
    static final class C03891 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.revokeAllPermissions(this);
        }

        C03891(Continuation<? super C03891> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientImpl$updateRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {0}, l = {129}, m = "updateRecords", n = {ParsedFieldTag.KAKA_CHECKED_IN_RECORDES}, s = {"L$0"})
    static final class C03901 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientImpl.this.updateRecords(null, this);
        }

        C03901(Continuation<? super C03901> continuation) {
            super(continuation);
        }
    }
}
