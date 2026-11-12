package androidx.health.connect.client;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.UserManager;
import androidx.core.content.pm.PackageInfoCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByDuration;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByPeriod;
import androidx.health.connect.client.feature.FeatureUtilsKt;
import androidx.health.connect.client.feature.HealthConnectFeaturesUnavailableImpl;
import androidx.health.connect.client.impl.HealthConnectClientImpl;
import androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl;
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
import androidx.health.connect.client.response.ReadRecordsResponse;
import androidx.health.connect.client.time.TimeRangeFilter;
import androidx.health.platform.client.HealthDataService;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import defpackage.yzc;
import defpackage.zbg;
import defpackage.zcp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 O2\u00020\u0001:\u0002OPJ\u001c\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH¦@¢\u0006\u0002\u0010\u000fJ\u001c\u0010\u0010\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH¦@¢\u0006\u0002\u0010\u000fJ:\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\rH¦@¢\u0006\u0002\u0010\u0018J&\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u00142\u0006\u0010\u0019\u001a\u00020\u001aH¦@¢\u0006\u0002\u0010\u001bJ4\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u001d\"\b\b\u0000\u0010\u001e*\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u00142\u0006\u0010\u001f\u001a\u00020\u0016H¦@¢\u0006\u0002\u0010 J,\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001e0\"\"\b\b\u0000\u0010\u001e*\u00020\u000e2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u001e0$H¦@¢\u0006\u0002\u0010%J\u0016\u0010&\u001a\u00020'2\u0006\u0010#\u001a\u00020(H¦@¢\u0006\u0002\u0010)J\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\r2\u0006\u0010#\u001a\u00020,H¦@¢\u0006\u0002\u0010-J\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\r2\u0006\u0010#\u001a\u000200H¦@¢\u0006\u0002\u00101J\u0016\u00102\u001a\u00020\u00162\u0006\u0010#\u001a\u000203H¦@¢\u0006\u0002\u00104J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0016H¦@¢\u0006\u0002\u00108J\"\u00109\u001a\b\u0012\u0004\u0012\u00020:0\r2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\rH\u0097@¢\u0006\u0002\u0010\u000fJ\u0016\u0010=\u001a\u00020>2\u0006\u0010#\u001a\u00020?H\u0097@¢\u0006\u0002\u0010@J\"\u0010=\u001a\b\u0012\u0004\u0012\u00020:0\r2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\rH\u0097@¢\u0006\u0002\u0010\u000fJ\u001c\u0010C\u001a\u00020\u00112\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\rH\u0097@¢\u0006\u0002\u0010\u000fJ\u0016\u0010C\u001a\u00020\u00112\u0006\u0010#\u001a\u00020DH\u0097@¢\u0006\u0002\u0010EJ\u0016\u0010F\u001a\u00020G2\u0006\u0010#\u001a\u00020HH\u0097@¢\u0006\u0002\u0010IJ\u0016\u0010J\u001a\u00020\u00112\u0006\u0010K\u001a\u00020\u0016H\u0097@¢\u0006\u0002\u00108J\u001c\u0010L\u001a\b\u0012\u0004\u0012\u00020G0\r2\u0006\u0010#\u001a\u00020MH\u0097@¢\u0006\u0002\u0010NJ\"\u0010L\u001a\b\u0012\u0004\u0012\u00020G0\r2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00160\rH\u0097@¢\u0006\u0002\u0010\u000fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006QÀ\u0006\u0003"}, d2 = {"Landroidx/health/connect/client/HealthConnectClient;", "", "permissionController", "Landroidx/health/connect/client/PermissionController;", "getPermissionController", "()Landroidx/health/connect/client/PermissionController;", "features", "Landroidx/health/connect/client/HealthConnectFeatures;", "getFeatures", "()Landroidx/health/connect/client/HealthConnectFeatures;", "insertRecords", "Landroidx/health/connect/client/response/InsertRecordsResponse;", ParsedFieldTag.KAKA_CHECKED_IN_RECORDES, "", "Landroidx/health/connect/client/records/Record;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRecords", "", "deleteRecords", "recordType", "Lkotlin/reflect/KClass;", "recordIdsList", "", "clientRecordIdsList", "(Lkotlin/reflect/KClass;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeRangeFilter", "Landroidx/health/connect/client/time/TimeRangeFilter;", "(Lkotlin/reflect/KClass;Landroidx/health/connect/client/time/TimeRangeFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRecord", "Landroidx/health/connect/client/response/ReadRecordResponse;", ExifInterface.GPS_DIRECTION_TRUE, "recordId", "(Lkotlin/reflect/KClass;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRecords", "Landroidx/health/connect/client/response/ReadRecordsResponse;", "request", "Landroidx/health/connect/client/request/ReadRecordsRequest;", "(Landroidx/health/connect/client/request/ReadRecordsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregate", "Landroidx/health/connect/client/aggregate/AggregationResult;", "Landroidx/health/connect/client/request/AggregateRequest;", "(Landroidx/health/connect/client/request/AggregateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregateGroupByDuration", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByDuration;", "Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;", "(Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregateGroupByPeriod", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByPeriod;", "Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;", "(Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChangesToken", "Landroidx/health/connect/client/request/ChangesTokenRequest;", "(Landroidx/health/connect/client/request/ChangesTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChanges", "Landroidx/health/connect/client/response/ChangesResponse;", "changesToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsertMedicalResources", "Landroidx/health/connect/client/records/MedicalResource;", "requests", "Landroidx/health/connect/client/request/UpsertMedicalResourceRequest;", "readMedicalResources", "Landroidx/health/connect/client/response/ReadMedicalResourcesResponse;", "Landroidx/health/connect/client/request/ReadMedicalResourcesRequest;", "(Landroidx/health/connect/client/request/ReadMedicalResourcesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ids", "Landroidx/health/connect/client/records/MedicalResourceId;", "deleteMedicalResources", "Landroidx/health/connect/client/request/DeleteMedicalResourcesRequest;", "(Landroidx/health/connect/client/request/DeleteMedicalResourcesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createMedicalDataSource", "Landroidx/health/connect/client/records/MedicalDataSource;", "Landroidx/health/connect/client/request/CreateMedicalDataSourceRequest;", "(Landroidx/health/connect/client/request/CreateMedicalDataSourceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMedicalDataSourceWithData", "id", "getMedicalDataSources", "Landroidx/health/connect/client/request/GetMedicalDataSourcesRequest;", "(Landroidx/health/connect/client/request/GetMedicalDataSourcesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "Api34Impl", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HealthConnectClient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int DEFAULT_PROVIDER_MIN_VERSION_CODE = 68623;
    public static final String DEFAULT_PROVIDER_PACKAGE_NAME = "com.google.android.apps.healthdata";
    public static final String HEALTH_CONNECT_CLIENT_TAG = "HealthConnectClient";
    public static final int SDK_AVAILABLE = 3;
    public static final int SDK_UNAVAILABLE = 1;
    public static final int SDK_UNAVAILABLE_PROVIDER_UPDATE_REQUIRED = 2;

    Object aggregate(AggregateRequest aggregateRequest, Continuation<? super AggregationResult> continuation);

    Object aggregateGroupByDuration(AggregateGroupByDurationRequest aggregateGroupByDurationRequest, Continuation<? super List<AggregationResultGroupedByDuration>> continuation);

    Object aggregateGroupByPeriod(AggregateGroupByPeriodRequest aggregateGroupByPeriodRequest, Continuation<? super List<AggregationResultGroupedByPeriod>> continuation);

    Object deleteRecords(KClass<? extends Record> kClass, TimeRangeFilter timeRangeFilter, Continuation<? super yzc> continuation);

    Object deleteRecords(KClass<? extends Record> kClass, List<String> list, List<String> list2, Continuation<? super yzc> continuation);

    Object getChanges(String str, Continuation<? super ChangesResponse> continuation);

    Object getChangesToken(ChangesTokenRequest changesTokenRequest, Continuation<? super String> continuation);

    PermissionController getPermissionController();

    Object insertRecords(List<? extends Record> list, Continuation<? super InsertRecordsResponse> continuation);

    <T extends Record> Object readRecord(KClass<T> kClass, String str, Continuation<? super ReadRecordResponse<T>> continuation);

    <T extends Record> Object readRecords(ReadRecordsRequest<T> readRecordsRequest, Continuation<? super ReadRecordsResponse<T>> continuation);

    Object updateRecords(List<? extends Record> list, Continuation<? super yzc> continuation);

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static HealthConnectFeatures getFeatures(HealthConnectClient healthConnectClient) {
            return HealthConnectClient.super.getFeatures();
        }

        @Deprecated
        public static Object upsertMedicalResources(HealthConnectClient healthConnectClient, List<UpsertMedicalResourceRequest> list, Continuation<? super List<MedicalResource>> continuation) {
            return HealthConnectClient.super.upsertMedicalResources(list, continuation);
        }

        @Deprecated
        public static Object readMedicalResources(HealthConnectClient healthConnectClient, ReadMedicalResourcesRequest readMedicalResourcesRequest, Continuation<? super ReadMedicalResourcesResponse> continuation) {
            return HealthConnectClient.super.readMedicalResources(readMedicalResourcesRequest, continuation);
        }

        @Deprecated
        public static Object readMedicalResources(HealthConnectClient healthConnectClient, List<MedicalResourceId> list, Continuation<? super List<MedicalResource>> continuation) {
            return HealthConnectClient.super.readMedicalResources(list, continuation);
        }

        @Deprecated
        public static Object deleteMedicalResources(HealthConnectClient healthConnectClient, List<MedicalResourceId> list, Continuation<? super yzc> continuation) {
            Object objDeleteMedicalResources = HealthConnectClient.super.deleteMedicalResources(list, continuation);
            return objDeleteMedicalResources == zbg.a() ? objDeleteMedicalResources : yzc.e;
        }

        @Deprecated
        public static Object deleteMedicalResources(HealthConnectClient healthConnectClient, DeleteMedicalResourcesRequest deleteMedicalResourcesRequest, Continuation<? super yzc> continuation) {
            Object objDeleteMedicalResources = HealthConnectClient.super.deleteMedicalResources(deleteMedicalResourcesRequest, continuation);
            return objDeleteMedicalResources == zbg.a() ? objDeleteMedicalResources : yzc.e;
        }

        @Deprecated
        public static Object createMedicalDataSource(HealthConnectClient healthConnectClient, CreateMedicalDataSourceRequest createMedicalDataSourceRequest, Continuation<? super MedicalDataSource> continuation) {
            return HealthConnectClient.super.createMedicalDataSource(createMedicalDataSourceRequest, continuation);
        }

        @Deprecated
        public static Object deleteMedicalDataSourceWithData(HealthConnectClient healthConnectClient, String str, Continuation<? super yzc> continuation) {
            Object objDeleteMedicalDataSourceWithData = HealthConnectClient.super.deleteMedicalDataSourceWithData(str, continuation);
            return objDeleteMedicalDataSourceWithData == zbg.a() ? objDeleteMedicalDataSourceWithData : yzc.e;
        }

        @Deprecated
        public static Object getMedicalDataSources(HealthConnectClient healthConnectClient, GetMedicalDataSourcesRequest getMedicalDataSourcesRequest, Continuation<? super List<MedicalDataSource>> continuation) {
            return HealthConnectClient.super.getMedicalDataSources(getMedicalDataSourcesRequest, continuation);
        }

        @Deprecated
        public static Object getMedicalDataSources(HealthConnectClient healthConnectClient, List<String> list, Continuation<? super List<MedicalDataSource>> continuation) {
            return HealthConnectClient.super.getMedicalDataSources(list, continuation);
        }
    }

    default HealthConnectFeatures getFeatures() {
        return HealthConnectFeaturesUnavailableImpl.INSTANCE;
    }

    static /* synthetic */ Object upsertMedicalResources$suspendImpl(HealthConnectClient healthConnectClient, List<UpsertMedicalResourceRequest> list, Continuation<? super List<MedicalResource>> continuation) {
        throw FeatureUtilsKt.createExceptionDueToFeatureUnavailable(FeatureUtilsKt.FEATURE_CONSTANT_NAME_PHR, "HealthConnectClient#upsetMedicalResources()");
    }

    static /* synthetic */ Object readMedicalResources$suspendImpl(HealthConnectClient healthConnectClient, ReadMedicalResourcesRequest readMedicalResourcesRequest, Continuation<? super ReadMedicalResourcesResponse> continuation) {
        throw FeatureUtilsKt.createExceptionDueToFeatureUnavailable(FeatureUtilsKt.FEATURE_CONSTANT_NAME_PHR, "HealthConnectClient#readMedicalResources(request: ReadMedicalResourcesRequest)");
    }

    static /* synthetic */ Object readMedicalResources$suspendImpl(HealthConnectClient healthConnectClient, List<MedicalResourceId> list, Continuation<? super List<MedicalResource>> continuation) {
        throw FeatureUtilsKt.createExceptionDueToFeatureUnavailable(FeatureUtilsKt.FEATURE_CONSTANT_NAME_PHR, "HealthConnectClient#readMedicalResources(ids: List<MedicalResourceId>)");
    }

    static /* synthetic */ Object deleteMedicalResources$suspendImpl(HealthConnectClient healthConnectClient, List<MedicalResourceId> list, Continuation<? super yzc> continuation) {
        throw FeatureUtilsKt.createExceptionDueToFeatureUnavailable(FeatureUtilsKt.FEATURE_CONSTANT_NAME_PHR, "HealthConnectClient#deleteMedicalResources(ids: List<MedicalResourceId>)");
    }

    static /* synthetic */ Object deleteMedicalResources$suspendImpl(HealthConnectClient healthConnectClient, DeleteMedicalResourcesRequest deleteMedicalResourcesRequest, Continuation<? super yzc> continuation) {
        throw FeatureUtilsKt.createExceptionDueToFeatureUnavailable(FeatureUtilsKt.FEATURE_CONSTANT_NAME_PHR, "HealthConnectClient#deleteMedicalResources(request: DeleteMedicalResourcesRequest)");
    }

    static /* synthetic */ Object createMedicalDataSource$suspendImpl(HealthConnectClient healthConnectClient, CreateMedicalDataSourceRequest createMedicalDataSourceRequest, Continuation<? super MedicalDataSource> continuation) {
        throw FeatureUtilsKt.createExceptionDueToFeatureUnavailable(FeatureUtilsKt.FEATURE_CONSTANT_NAME_PHR, "HealthConnectClient#createMedicalDataSource()");
    }

    static /* synthetic */ Object deleteMedicalDataSourceWithData$suspendImpl(HealthConnectClient healthConnectClient, String str, Continuation<? super yzc> continuation) {
        throw FeatureUtilsKt.createExceptionDueToFeatureUnavailable(FeatureUtilsKt.FEATURE_CONSTANT_NAME_PHR, "HealthConnectClient#deleteMedicalDataSourceWithData()");
    }

    static /* synthetic */ Object getMedicalDataSources$suspendImpl(HealthConnectClient healthConnectClient, GetMedicalDataSourcesRequest getMedicalDataSourcesRequest, Continuation<? super List<MedicalDataSource>> continuation) {
        throw FeatureUtilsKt.createExceptionDueToFeatureUnavailable(FeatureUtilsKt.FEATURE_CONSTANT_NAME_PHR, "HealthConnectClient#getMedicalDataSources()");
    }

    static /* synthetic */ Object getMedicalDataSources$suspendImpl(HealthConnectClient healthConnectClient, List<String> list, Continuation<? super List<MedicalDataSource>> continuation) {
        throw FeatureUtilsKt.createExceptionDueToFeatureUnavailable(FeatureUtilsKt.FEATURE_CONSTANT_NAME_PHR, "HealthConnectClient#getMedicalDataSources()");
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0005H\u0007J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0005H\u0007J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0005H\u0007J\"\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u0007H\u0002J\u001d\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005H\u0000¢\u0006\u0002\b R\u0010\u0010\u0004\u001a\u00020\u00058\u0000X\u0081T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081T¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u00020\u00058GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u00020\u00058\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Landroidx/health/connect/client/HealthConnectClient$Companion;", "", "<init>", "()V", "DEFAULT_PROVIDER_PACKAGE_NAME", "", "DEFAULT_PROVIDER_MIN_VERSION_CODE", "", "ACTION_HEALTH_CONNECT_SETTINGS", "getHealthConnectSettingsAction$annotations", "getHealthConnectSettingsAction", "()Ljava/lang/String;", "ACTION_HEALTH_CONNECT_MANAGE_DATA", "getACTION_HEALTH_CONNECT_MANAGE_DATA$connect_client_release", "SDK_UNAVAILABLE", "SDK_UNAVAILABLE_PROVIDER_UPDATE_REQUIRED", "SDK_AVAILABLE", "getSdkStatus", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "providerPackageName", "getOrCreate", "Landroidx/health/connect/client/HealthConnectClient;", "getHealthConnectManageDataIntent", "Landroid/content/Intent;", "isPackageInstalled", "", "packageManager", "Landroid/content/pm/PackageManager;", "packageName", "versionCode", "hasBindableService", "hasBindableService$connect_client_release", "HEALTH_CONNECT_CLIENT_TAG", "AvailabilityStatus", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String ACTION_HEALTH_CONNECT_MANAGE_DATA;
        private static final String ACTION_HEALTH_CONNECT_SETTINGS;
        public static final int DEFAULT_PROVIDER_MIN_VERSION_CODE = 68623;
        public static final String DEFAULT_PROVIDER_PACKAGE_NAME = "com.google.android.apps.healthdata";
        public static final String HEALTH_CONNECT_CLIENT_TAG = "HealthConnectClient";
        public static final int SDK_AVAILABLE = 3;
        public static final int SDK_UNAVAILABLE = 1;
        public static final int SDK_UNAVAILABLE_PROVIDER_UPDATE_REQUIRED = 2;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/HealthConnectClient$Companion$AvailabilityStatus;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface AvailabilityStatus {
        }

        @JvmStatic
        public static /* synthetic */ void getHealthConnectSettingsAction$annotations() {
        }

        private Companion() {
        }

        public final String getHealthConnectSettingsAction() {
            return ACTION_HEALTH_CONNECT_SETTINGS;
        }

        static {
            String str;
            String str2;
            if (Build.VERSION.SDK_INT >= 34) {
                str = "android.health.connect.action.HEALTH_HOME_SETTINGS";
            } else {
                str = "androidx.health.ACTION_HEALTH_CONNECT_SETTINGS";
            }
            ACTION_HEALTH_CONNECT_SETTINGS = str;
            if (Build.VERSION.SDK_INT >= 34) {
                str2 = "android.health.connect.action.MANAGE_HEALTH_DATA";
            } else {
                str2 = "androidx.health.ACTION_MANAGE_HEALTH_DATA";
            }
            ACTION_HEALTH_CONNECT_MANAGE_DATA = str2;
        }

        public final String getACTION_HEALTH_CONNECT_MANAGE_DATA$connect_client_release() {
            return ACTION_HEALTH_CONNECT_MANAGE_DATA;
        }

        public static /* synthetic */ int getSdkStatus$default(Companion companion, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "com.google.android.apps.healthdata";
            }
            return companion.getSdkStatus(context, str);
        }

        @JvmStatic
        public final int getSdkStatus(Context context, String providerPackageName) {
            zcp.c(context, "");
            zcp.c(providerPackageName, "");
            int i = Build.VERSION.SDK_INT;
            if (34 <= i) {
                return Api34Impl.getSdkStatus(context);
            }
            if (28 > i || i >= 34) {
                return 1;
            }
            PackageManager packageManager = context.getPackageManager();
            zcp.b((Object) packageManager, "");
            return isPackageInstalled$default(this, packageManager, providerPackageName, 0, 4, null) ? 3 : 2;
        }

        public static /* synthetic */ HealthConnectClient getOrCreate$default(Companion companion, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "com.google.android.apps.healthdata";
            }
            return companion.getOrCreate(context, str);
        }

        @JvmStatic
        public final HealthConnectClient getOrCreate(Context context, String providerPackageName) {
            zcp.c(context, "");
            zcp.c(providerPackageName, "");
            int sdkStatus = getSdkStatus(context, providerPackageName);
            if (sdkStatus == 1) {
                throw new UnsupportedOperationException("SDK version too low or running in a profile");
            }
            if (sdkStatus == 2) {
                throw new IllegalStateException("Service not available");
            }
            if (Build.VERSION.SDK_INT >= 34) {
                return new HealthConnectClientUpsideDownImpl(context);
            }
            return new HealthConnectClientImpl(context, providerPackageName);
        }

        public static /* synthetic */ Intent getHealthConnectManageDataIntent$default(Companion companion, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "com.google.android.apps.healthdata";
            }
            return companion.getHealthConnectManageDataIntent(context, str);
        }

        @JvmStatic
        public final Intent getHealthConnectManageDataIntent(Context context, String providerPackageName) {
            zcp.c(context, "");
            zcp.c(providerPackageName, "");
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(ACTION_HEALTH_CONNECT_MANAGE_DATA);
            return (getSdkStatus(context, providerPackageName) != 3 || packageManager.resolveActivity(intent, 0) == null) ? new Intent(ACTION_HEALTH_CONNECT_SETTINGS) : intent;
        }

        static /* synthetic */ boolean isPackageInstalled$default(Companion companion, PackageManager packageManager, String str, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = 68623;
            }
            return companion.isPackageInstalled(packageManager, str, i);
        }

        private final boolean isPackageInstalled(PackageManager packageManager, String packageName, int versionCode) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                zcp.e(packageInfo);
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                return applicationInfo != null && applicationInfo.enabled && (!zcp.b((Object) packageName, (Object) "com.google.android.apps.healthdata") || PackageInfoCompat.getLongVersionCode(packageInfo) >= ((long) versionCode)) && hasBindableService$connect_client_release(packageManager, packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }

        public final boolean hasBindableService$connect_client_release(PackageManager packageManager, String packageName) {
            zcp.c(packageManager, "");
            zcp.c(packageName, "");
            Intent intent = new Intent();
            intent.setPackage(packageName);
            intent.setAction(HealthDataService.ANDROID_HEALTH_PLATFORM_SERVICE_BIND_ACTION);
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            zcp.b((Object) listQueryIntentServices, "");
            return !listQueryIntentServices.isEmpty();
        }

        @JvmStatic
        public final int getSdkStatus(Context context) {
            zcp.c(context, "");
            return getSdkStatus$default(this, context, null, 2, null);
        }

        @JvmStatic
        public final HealthConnectClient getOrCreate(Context context) {
            zcp.c(context, "");
            return getOrCreate$default(this, context, null, 2, null);
        }

        @JvmStatic
        public final Intent getHealthConnectManageDataIntent(Context context) {
            zcp.c(context, "");
            return getHealthConnectManageDataIntent$default(this, context, null, 2, null);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\n"}, d2 = {"Landroidx/health/connect/client/HealthConnectClient$Api34Impl;", "", "<init>", "()V", "getSdkStatus", "", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "isProfile", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        @JvmStatic
        public static final int getSdkStatus(Context context) {
            zcp.c(context, "");
            return (INSTANCE.isProfile(context) || context.getSystemService("healthconnect") == null) ? 1 : 3;
        }

        private final boolean isProfile(Context context) {
            Object systemService = context.getSystemService("user");
            zcp.e(systemService, "");
            return ((UserManager) systemService).isProfile();
        }
    }

    default Object upsertMedicalResources(List<UpsertMedicalResourceRequest> list, Continuation<? super List<MedicalResource>> continuation) {
        return upsertMedicalResources$suspendImpl(this, list, continuation);
    }

    default Object readMedicalResources(List<MedicalResourceId> list, Continuation<? super List<MedicalResource>> continuation) {
        return readMedicalResources$suspendImpl(this, list, continuation);
    }

    default Object readMedicalResources(ReadMedicalResourcesRequest readMedicalResourcesRequest, Continuation<? super ReadMedicalResourcesResponse> continuation) {
        return readMedicalResources$suspendImpl(this, readMedicalResourcesRequest, continuation);
    }

    default Object getMedicalDataSources(List<String> list, Continuation<? super List<MedicalDataSource>> continuation) {
        return getMedicalDataSources$suspendImpl(this, list, continuation);
    }

    default Object getMedicalDataSources(GetMedicalDataSourcesRequest getMedicalDataSourcesRequest, Continuation<? super List<MedicalDataSource>> continuation) {
        return getMedicalDataSources$suspendImpl(this, getMedicalDataSourcesRequest, continuation);
    }

    default Object deleteMedicalResources(List<MedicalResourceId> list, Continuation<? super yzc> continuation) {
        return deleteMedicalResources$suspendImpl(this, list, continuation);
    }

    default Object deleteMedicalResources(DeleteMedicalResourcesRequest deleteMedicalResourcesRequest, Continuation<? super yzc> continuation) {
        return deleteMedicalResources$suspendImpl(this, deleteMedicalResourcesRequest, continuation);
    }

    default Object deleteMedicalDataSourceWithData(String str, Continuation<? super yzc> continuation) {
        return deleteMedicalDataSourceWithData$suspendImpl(this, str, continuation);
    }

    default Object createMedicalDataSource(CreateMedicalDataSourceRequest createMedicalDataSourceRequest, Continuation<? super MedicalDataSource> continuation) {
        return createMedicalDataSource$suspendImpl(this, createMedicalDataSourceRequest, continuation);
    }

    @JvmStatic
    static int getSdkStatus(Context context, String str) {
        return INSTANCE.getSdkStatus(context, str);
    }

    @JvmStatic
    static int getSdkStatus(Context context) {
        return INSTANCE.getSdkStatus(context);
    }

    @JvmStatic
    static HealthConnectClient getOrCreate(Context context, String str) {
        return INSTANCE.getOrCreate(context, str);
    }

    @JvmStatic
    static HealthConnectClient getOrCreate(Context context) {
        return INSTANCE.getOrCreate(context);
    }

    static String getHealthConnectSettingsAction() {
        return INSTANCE.getHealthConnectSettingsAction();
    }

    @JvmStatic
    static Intent getHealthConnectManageDataIntent(Context context, String str) {
        return INSTANCE.getHealthConnectManageDataIntent(context, str);
    }

    @JvmStatic
    static Intent getHealthConnectManageDataIntent(Context context) {
        return INSTANCE.getHealthConnectManageDataIntent(context);
    }
}
