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
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.OutcomeReceiverKt;
import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.PermissionController;
import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByDuration;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByPeriod;
import androidx.health.connect.client.changes.DeletionChange;
import androidx.health.connect.client.changes.UpsertionChange;
import androidx.health.connect.client.impl.platform.ExceptionConverterKt;
import androidx.health.connect.client.impl.platform.records.RecordConvertersKt;
import androidx.health.connect.client.impl.platform.records.RequestConvertersKt;
import androidx.health.connect.client.impl.platform.records.ResponseConvertersKt;
import androidx.health.connect.client.impl.platform.response.InsertRecordsResponseConverterKt;
import androidx.health.connect.client.permission.HealthPermission;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.request.AggregateGroupByDurationRequest;
import androidx.health.connect.client.request.AggregateGroupByPeriodRequest;
import androidx.health.connect.client.request.AggregateRequest;
import androidx.health.connect.client.request.ChangesTokenRequest;
import androidx.health.connect.client.request.ReadRecordsRequest;
import androidx.health.connect.client.response.ChangesResponse;
import androidx.health.connect.client.response.InsertRecordsResponse;
import androidx.health.connect.client.response.ReadRecordResponse;
import androidx.health.connect.client.time.TimeRangeFilter;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import defpackage.aqb;
import defpackage.eqb;
import defpackage.iqb;
import defpackage.jqb;
import defpackage.kqb;
import defpackage.lqb;
import defpackage.mqb;
import defpackage.nqb;
import defpackage.spb;
import defpackage.tpb;
import defpackage.tqb;
import defpackage.wpb;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 34)
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B)\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0015\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010\u001cJ\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00192\u0006\u0010\u0015\u001a\u00020\u001fH\u0096@¢\u0006\u0002\u0010 J&\u0010!\u001a\u00020\n2\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0#2\u0006\u0010%\u001a\u00020&H\u0096@¢\u0006\u0002\u0010'J:\u0010!\u001a\u00020\n2\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0#2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\u00192\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\u0019H\u0096@¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010.J\u0016\u0010/\u001a\u00020\t2\u0006\u0010\u0015\u001a\u000200H\u0096@¢\u0006\u0002\u00101J\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\t03H\u0096@¢\u0006\u0002\u00104J\u001c\u00105\u001a\u0002062\f\u00107\u001a\b\u0012\u0004\u0012\u00020$0\u0019H\u0096@¢\u0006\u0002\u00108J4\u00109\u001a\b\u0012\u0004\u0012\u0002H;0:\"\b\b\u0000\u0010;*\u00020$2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H;0#2\u0006\u0010<\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010=J,\u0010>\u001a\b\u0012\u0004\u0012\u0002H;0?\"\b\b\u0000\u0010;*\u00020$2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H;0@H\u0096@¢\u0006\u0002\u0010AJ\u000e\u0010B\u001a\u00020\nH\u0096@¢\u0006\u0002\u00104J\u001c\u0010C\u001a\u00020\n2\f\u00107\u001a\b\u0012\u0004\u0012\u00020$0\u0019H\u0096@¢\u0006\u0002\u00108J2\u0010D\u001a\u0002H;\"\u0004\b\u0000\u0010;2\u001c\u0010E\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H;0F\u0012\u0006\u0012\u0004\u0018\u00010G0\u0007H\u0082@¢\u0006\u0002\u0010HR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Landroidx/health/connect/client/impl/HealthConnectClientUpsideDownImpl;", "Landroidx/health/connect/client/HealthConnectClient;", "Landroidx/health/connect/client/PermissionController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "revokePermissionsFunction", "Lkotlin/Function1;", "", "", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "executor", "Ljava/util/concurrent/Executor;", "healthConnectManager", "Landroid/health/connect/HealthConnectManager;", "permissionController", "getPermissionController", "()Landroidx/health/connect/client/PermissionController;", "aggregate", "Landroidx/health/connect/client/aggregate/AggregationResult;", "request", "Landroidx/health/connect/client/request/AggregateRequest;", "(Landroidx/health/connect/client/request/AggregateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregateGroupByDuration", "", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByDuration;", "Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;", "(Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregateGroupByPeriod", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByPeriod;", "Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;", "(Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRecords", "recordType", "Lkotlin/reflect/KClass;", "Landroidx/health/connect/client/records/Record;", "timeRangeFilter", "Landroidx/health/connect/client/time/TimeRangeFilter;", "(Lkotlin/reflect/KClass;Landroidx/health/connect/client/time/TimeRangeFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordIdsList", "clientRecordIdsList", "(Lkotlin/reflect/KClass;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChanges", "Landroidx/health/connect/client/response/ChangesResponse;", "changesToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChangesToken", "Landroidx/health/connect/client/request/ChangesTokenRequest;", "(Landroidx/health/connect/client/request/ChangesTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGrantedPermissions", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertRecords", "Landroidx/health/connect/client/response/InsertRecordsResponse;", "records", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRecord", "Landroidx/health/connect/client/response/ReadRecordResponse;", "T", "recordId", "(Lkotlin/reflect/KClass;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRecords", "Landroidx/health/connect/client/response/ReadRecordsResponse;", "Landroidx/health/connect/client/request/ReadRecordsRequest;", "(Landroidx/health/connect/client/request/ReadRecordsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "revokeAllPermissions", "updateRecords", "wrapPlatformException", "function", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHealthConnectClientUpsideDownImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectClientUpsideDownImpl.kt\nandroidx/health/connect/client/impl/HealthConnectClientUpsideDownImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,353:1\n1549#2:354\n1620#2,3:355\n1549#2:359\n1620#2,3:360\n1559#2:363\n1590#2,4:364\n1855#2,2:379\n1855#2,2:381\n1#3:358\n314#4,11:368\n3792#5:383\n4307#5,2:384\n*S KotlinDebug\n*F\n+ 1 HealthConnectClientUpsideDownImpl.kt\nandroidx/health/connect/client/impl/HealthConnectClientUpsideDownImpl\n*L\n198#1:354\n198#1:355,3\n229#1:359\n229#1:360,3\n245#1:363\n245#1:364,4\n298#1:379,2\n299#1:381,2\n289#1:368,11\n341#1:383\n341#1:384,2\n*E\n"})
public final class HealthConnectClientUpsideDownImpl implements HealthConnectClient, PermissionController {

    @NotNull
    private final Context context;

    @NotNull
    private final Executor executor;

    @NotNull
    private final HealthConnectManager healthConnectManager;

    @NotNull
    private final Function1<Collection<String>, Unit> revokePermissionsFunction;

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Collection<String>, Unit> {
        public AnonymousClass1(Object obj) {
            super(1, obj, Context.class, "revokeSelfPermissionsOnKill", "revokeSelfPermissionsOnKill(Ljava/util/Collection;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Collection<String> collection) {
            invoke2(collection);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Collection<String> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((Context) this.receiver).revokeSelfPermissionsOnKill(p0);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", i = {0}, l = {204}, m = "aggregate", n = {"request"}, s = {"L$0"})
    public static final class C12171 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12171(Continuation<? super C12171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientUpsideDownImpl.this.aggregate(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregate$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroid/health/connect/AggregateRecordsResponse;", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregate$2", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {354}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHealthConnectClientUpsideDownImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectClientUpsideDownImpl.kt\nandroidx/health/connect/client/impl/HealthConnectClientUpsideDownImpl$aggregate$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,353:1\n314#2,11:354\n*S KotlinDebug\n*F\n+ 1 HealthConnectClientUpsideDownImpl.kt\nandroidx/health/connect/client/impl/HealthConnectClientUpsideDownImpl$aggregate$2\n*L\n205#1:354,11\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super AggregateRecordsResponse<Object>>, Object> {
        final /* synthetic */ AggregateRequest $request;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AggregateRequest aggregateRequest, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$request = aggregateRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return HealthConnectClientUpsideDownImpl.this.new AnonymousClass2(this.$request, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = HealthConnectClientUpsideDownImpl.this;
                AggregateRequest aggregateRequest = this.$request;
                this.L$0 = healthConnectClientUpsideDownImpl;
                this.L$1 = aggregateRequest;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                healthConnectClientUpsideDownImpl.healthConnectManager.aggregate(RequestConvertersKt.toPlatformRequest(aggregateRequest), healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
                obj = cancellableContinuationImpl.getResult();
                if (obj == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super AggregateRecordsResponse<Object>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", i = {0}, l = {219}, m = "aggregateGroupByDuration", n = {"request"}, s = {"L$0"})
    public static final class C12181 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12181(Continuation<? super C12181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientUpsideDownImpl.this.aggregateGroupByDuration(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \u0010\u0000\u001a^\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0002 \u0004*.\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00050\u0001H\u008a@"}, d2 = {"<anonymous>", "", "Landroid/health/connect/AggregateRecordsGroupedByDurationResponse;", "", "kotlin.jvm.PlatformType", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$2", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {354}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHealthConnectClientUpsideDownImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectClientUpsideDownImpl.kt\nandroidx/health/connect/client/impl/HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,353:1\n314#2,11:354\n*S KotlinDebug\n*F\n+ 1 HealthConnectClientUpsideDownImpl.kt\nandroidx/health/connect/client/impl/HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$2\n*L\n220#1:354,11\n*E\n"})
    public static final class C12192 extends SuspendLambda implements Function1<Continuation<? super List<AggregateRecordsGroupedByDurationResponse<Object>>>, Object> {
        final /* synthetic */ AggregateGroupByDurationRequest $request;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12192(AggregateGroupByDurationRequest aggregateGroupByDurationRequest, Continuation<? super C12192> continuation) {
            super(1, continuation);
            this.$request = aggregateGroupByDurationRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return HealthConnectClientUpsideDownImpl.this.new C12192(this.$request, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = HealthConnectClientUpsideDownImpl.this;
                AggregateGroupByDurationRequest aggregateGroupByDurationRequest = this.$request;
                this.L$0 = healthConnectClientUpsideDownImpl;
                this.L$1 = aggregateGroupByDurationRequest;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                healthConnectClientUpsideDownImpl.healthConnectManager.aggregateGroupByDuration(RequestConvertersKt.toPlatformRequest(aggregateGroupByDurationRequest), aggregateGroupByDurationRequest.getTimeRangeSlicer(), healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
                obj = cancellableContinuationImpl.getResult();
                if (obj == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super List<AggregateRecordsGroupedByDurationResponse<Object>>> continuation) {
            return ((C12192) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregateGroupByPeriod$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", i = {0}, l = {235}, m = "aggregateGroupByPeriod", n = {"request"}, s = {"L$0"})
    public static final class C12201 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12201(Continuation<? super C12201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientUpsideDownImpl.this.aggregateGroupByPeriod(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregateGroupByPeriod$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \u0010\u0000\u001a^\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0002 \u0004*.\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00050\u0001H\u008a@"}, d2 = {"<anonymous>", "", "Landroid/health/connect/AggregateRecordsGroupedByPeriodResponse;", "", "kotlin.jvm.PlatformType", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregateGroupByPeriod$2", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {354}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHealthConnectClientUpsideDownImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectClientUpsideDownImpl.kt\nandroidx/health/connect/client/impl/HealthConnectClientUpsideDownImpl$aggregateGroupByPeriod$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,353:1\n314#2,11:354\n*S KotlinDebug\n*F\n+ 1 HealthConnectClientUpsideDownImpl.kt\nandroidx/health/connect/client/impl/HealthConnectClientUpsideDownImpl$aggregateGroupByPeriod$2\n*L\n236#1:354,11\n*E\n"})
    public static final class C12212 extends SuspendLambda implements Function1<Continuation<? super List<AggregateRecordsGroupedByPeriodResponse<Object>>>, Object> {
        final /* synthetic */ AggregateGroupByPeriodRequest $request;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12212(AggregateGroupByPeriodRequest aggregateGroupByPeriodRequest, Continuation<? super C12212> continuation) {
            super(1, continuation);
            this.$request = aggregateGroupByPeriodRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return HealthConnectClientUpsideDownImpl.this.new C12212(this.$request, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = HealthConnectClientUpsideDownImpl.this;
                AggregateGroupByPeriodRequest aggregateGroupByPeriodRequest = this.$request;
                this.L$0 = healthConnectClientUpsideDownImpl;
                this.L$1 = aggregateGroupByPeriodRequest;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                healthConnectClientUpsideDownImpl.healthConnectManager.aggregateGroupByPeriod(RequestConvertersKt.toPlatformRequest(aggregateGroupByPeriodRequest), aggregateGroupByPeriodRequest.getTimeRangeSlicer(), healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
                obj = cancellableContinuationImpl.getResult();
                if (obj == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super List<AggregateRecordsGroupedByPeriodResponse<Object>>> continuation) {
            return ((C12212) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteRecords$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteRecords$2", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {354}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHealthConnectClientUpsideDownImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectClientUpsideDownImpl.kt\nandroidx/health/connect/client/impl/HealthConnectClientUpsideDownImpl$deleteRecords$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,353:1\n314#2,9:354\n323#2,2:367\n1855#3,2:363\n1855#3,2:365\n*S KotlinDebug\n*F\n+ 1 HealthConnectClientUpsideDownImpl.kt\nandroidx/health/connect/client/impl/HealthConnectClientUpsideDownImpl$deleteRecords$2\n*L\n124#1:354,9\n124#1:367,2\n127#1:363,2\n130#1:365,2\n*E\n"})
    public static final class C12222 extends SuspendLambda implements Function1<Continuation<? super Void>, Object> {
        final /* synthetic */ List<String> $clientRecordIdsList;
        final /* synthetic */ List<String> $recordIdsList;
        final /* synthetic */ KClass<? extends Record> $recordType;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12222(List<String> list, List<String> list2, KClass<? extends Record> kClass, Continuation<? super C12222> continuation) {
            super(1, continuation);
            this.$recordIdsList = list;
            this.$clientRecordIdsList = list2;
            this.$recordType = kClass;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return HealthConnectClientUpsideDownImpl.this.new C12222(this.$recordIdsList, this.$clientRecordIdsList, this.$recordType, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = HealthConnectClientUpsideDownImpl.this;
                List<String> list = this.$recordIdsList;
                List<String> list2 = this.$clientRecordIdsList;
                KClass<? extends Record> kClass = this.$recordType;
                this.L$0 = healthConnectClientUpsideDownImpl;
                this.L$1 = list;
                this.L$2 = list2;
                this.L$3 = kClass;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                HealthConnectManager healthConnectManager = healthConnectClientUpsideDownImpl.healthConnectManager;
                List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    listCreateListBuilder.add(RecordIdFilter.fromId(RecordConvertersKt.toPlatformRecordClass(kClass), (String) it.next()));
                }
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    listCreateListBuilder.add(RecordIdFilter.fromClientRecordId(RecordConvertersKt.toPlatformRecordClass(kClass), (String) it2.next()));
                }
                healthConnectManager.deleteRecords(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder), healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
                obj = cancellableContinuationImpl.getResult();
                if (obj == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super Void> continuation) {
            return ((C12222) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteRecords$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteRecords$4", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {354}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHealthConnectClientUpsideDownImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectClientUpsideDownImpl.kt\nandroidx/health/connect/client/impl/HealthConnectClientUpsideDownImpl$deleteRecords$4\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,353:1\n314#2,11:354\n*S KotlinDebug\n*F\n+ 1 HealthConnectClientUpsideDownImpl.kt\nandroidx/health/connect/client/impl/HealthConnectClientUpsideDownImpl$deleteRecords$4\n*L\n151#1:354,11\n*E\n"})
    public static final class AnonymousClass4 extends SuspendLambda implements Function1<Continuation<? super Void>, Object> {
        final /* synthetic */ KClass<? extends Record> $recordType;
        final /* synthetic */ TimeRangeFilter $timeRangeFilter;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(KClass<? extends Record> kClass, TimeRangeFilter timeRangeFilter, Continuation<? super AnonymousClass4> continuation) {
            super(1, continuation);
            this.$recordType = kClass;
            this.$timeRangeFilter = timeRangeFilter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return HealthConnectClientUpsideDownImpl.this.new AnonymousClass4(this.$recordType, this.$timeRangeFilter, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = HealthConnectClientUpsideDownImpl.this;
                KClass<? extends Record> kClass = this.$recordType;
                TimeRangeFilter timeRangeFilter = this.$timeRangeFilter;
                this.L$0 = healthConnectClientUpsideDownImpl;
                this.L$1 = kClass;
                this.L$2 = timeRangeFilter;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                healthConnectClientUpsideDownImpl.healthConnectManager.deleteRecords(RecordConvertersKt.toPlatformRecordClass(kClass), RequestConvertersKt.toPlatformTimeRangeFilter(timeRangeFilter), healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
                obj = cancellableContinuationImpl.getResult();
                if (obj == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super Void> continuation) {
            return ((AnonymousClass4) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$getChanges$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", i = {0, 0}, l = {354}, m = "getChanges", n = {"this", "changesToken"}, s = {"L$0", "L$1"})
    public static final class C12231 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12231(Continuation<? super C12231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientUpsideDownImpl.this.getChanges(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$getChangesToken$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {275}, m = "getChangesToken", n = {}, s = {})
    public static final class C12241 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C12241(Continuation<? super C12241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientUpsideDownImpl.this.getChangesToken(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$getChangesToken$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroid/health/connect/changelog/ChangeLogTokenResponse;", "kotlin.jvm.PlatformType"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$getChangesToken$2", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {354}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHealthConnectClientUpsideDownImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectClientUpsideDownImpl.kt\nandroidx/health/connect/client/impl/HealthConnectClientUpsideDownImpl$getChangesToken$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,353:1\n314#2,11:354\n*S KotlinDebug\n*F\n+ 1 HealthConnectClientUpsideDownImpl.kt\nandroidx/health/connect/client/impl/HealthConnectClientUpsideDownImpl$getChangesToken$2\n*L\n276#1:354,11\n*E\n"})
    public static final class C12252 extends SuspendLambda implements Function1<Continuation<? super ChangeLogTokenResponse>, Object> {
        final /* synthetic */ ChangesTokenRequest $request;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12252(ChangesTokenRequest changesTokenRequest, Continuation<? super C12252> continuation) {
            super(1, continuation);
            this.$request = changesTokenRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return HealthConnectClientUpsideDownImpl.this.new C12252(this.$request, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = HealthConnectClientUpsideDownImpl.this;
                ChangesTokenRequest changesTokenRequest = this.$request;
                this.L$0 = healthConnectClientUpsideDownImpl;
                this.L$1 = changesTokenRequest;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                healthConnectClientUpsideDownImpl.healthConnectManager.getChangeLogToken(RequestConvertersKt.toPlatformRequest(changesTokenRequest), healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
                obj = cancellableContinuationImpl.getResult();
                if (obj == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super ChangeLogTokenResponse> continuation) {
            return ((C12252) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$insertRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {94}, m = "insertRecords", n = {}, s = {})
    public static final class C12261 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C12261(Continuation<? super C12261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientUpsideDownImpl.this.insertRecords(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$readRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {167}, m = "readRecord", n = {}, s = {})
    public static final class C12271<T extends Record> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C12271(Continuation<? super C12271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientUpsideDownImpl.this.readRecord(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$readRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {SportReportBaseParser.ReportType.avgDescentRate}, m = "readRecords", n = {}, s = {})
    public static final class C12281<T extends Record> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C12281(Continuation<? super C12281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientUpsideDownImpl.this.readRecords(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$updateRecords$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$updateRecords$2", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {354}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHealthConnectClientUpsideDownImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectClientUpsideDownImpl.kt\nandroidx/health/connect/client/impl/HealthConnectClientUpsideDownImpl$updateRecords$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,353:1\n314#2,9:354\n323#2,2:367\n1549#3:363\n1620#3,3:364\n*S KotlinDebug\n*F\n+ 1 HealthConnectClientUpsideDownImpl.kt\nandroidx/health/connect/client/impl/HealthConnectClientUpsideDownImpl$updateRecords$2\n*L\n108#1:354,9\n108#1:367,2\n110#1:363\n110#1:364,3\n*E\n"})
    public static final class C12292 extends SuspendLambda implements Function1<Continuation<? super Void>, Object> {
        final /* synthetic */ List<Record> $records;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12292(List<? extends Record> list, Continuation<? super C12292> continuation) {
            super(1, continuation);
            this.$records = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return HealthConnectClientUpsideDownImpl.this.new C12292(this.$records, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = HealthConnectClientUpsideDownImpl.this;
                List<Record> list = this.$records;
                this.L$0 = healthConnectClientUpsideDownImpl;
                this.L$1 = list;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                HealthConnectManager healthConnectManager = healthConnectClientUpsideDownImpl.healthConnectManager;
                List<Record> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(RecordConvertersKt.toPlatformRecord((Record) it.next()));
                }
                healthConnectManager.updateRecords(arrayList, healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
                obj = cancellableContinuationImpl.getResult();
                if (obj == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super Void> continuation) {
            return ((C12292) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$wrapPlatformException$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {347}, m = "wrapPlatformException", n = {}, s = {})
    public static final class C12301<T> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C12301(Continuation<? super C12301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectClientUpsideDownImpl.this.wrapPlatformException(null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HealthConnectClientUpsideDownImpl(@NotNull Context context) {
        this(context, new AnonymousClass1(context));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final <T> Object wrapPlatformException(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) throws Exception {
        C12301 c12301;
        if (continuation instanceof C12301) {
            c12301 = (C12301) continuation;
            int i = c12301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12301.label = i - Integer.MIN_VALUE;
            } else {
                c12301 = new C12301(continuation);
            }
        } else {
            c12301 = new C12301(continuation);
        }
        Object objInvoke2 = c12301.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12301.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objInvoke2);
                c12301.label = 1;
                objInvoke2 = function1.invoke2(c12301);
                if (objInvoke2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInvoke2);
            }
            return objInvoke2;
        } catch (HealthConnectException e) {
            throw ExceptionConverterKt.toKtException(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public Object aggregate(@NotNull AggregateRequest aggregateRequest, @NotNull Continuation<? super AggregationResult> continuation) throws Exception {
        C12171 c12171;
        if (continuation instanceof C12171) {
            c12171 = (C12171) continuation;
            int i = c12171.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12171.label = i - Integer.MIN_VALUE;
            } else {
                c12171 = new C12171(continuation);
            }
        } else {
            c12171 = new C12171(continuation);
        }
        Object objWrapPlatformException = c12171.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12171.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWrapPlatformException);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(aggregateRequest, null);
            c12171.L$0 = aggregateRequest;
            c12171.label = 1;
            objWrapPlatformException = wrapPlatformException(anonymousClass2, c12171);
            if (objWrapPlatformException == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aggregateRequest = (AggregateRequest) c12171.L$0;
            ResultKt.throwOnFailure(objWrapPlatformException);
        }
        Intrinsics.checkNotNullExpressionValue(objWrapPlatformException, "override suspend fun agg…se(request.metrics)\n    }");
        return ResponseConvertersKt.toSdkResponse((AggregateRecordsResponse<Object>) iqb.a(objWrapPlatformException), aggregateRequest.getMetrics$connect_client_release());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public Object aggregateGroupByDuration(@NotNull AggregateGroupByDurationRequest aggregateGroupByDurationRequest, @NotNull Continuation<? super List<AggregationResultGroupedByDuration>> continuation) throws Exception {
        C12181 c12181;
        if (continuation instanceof C12181) {
            c12181 = (C12181) continuation;
            int i = c12181.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12181.label = i - Integer.MIN_VALUE;
            } else {
                c12181 = new C12181(continuation);
            }
        } else {
            c12181 = new C12181(continuation);
        }
        Object objWrapPlatformException = c12181.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12181.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWrapPlatformException);
            C12192 c12192 = new C12192(aggregateGroupByDurationRequest, null);
            c12181.L$0 = aggregateGroupByDurationRequest;
            c12181.label = 1;
            objWrapPlatformException = wrapPlatformException(c12192, c12181);
            if (objWrapPlatformException == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aggregateGroupByDurationRequest = (AggregateGroupByDurationRequest) c12181.L$0;
            ResultKt.throwOnFailure(objWrapPlatformException);
        }
        Intrinsics.checkNotNullExpressionValue(objWrapPlatformException, "override suspend fun agg…(request.metrics) }\n    }");
        Iterable iterable = (Iterable) objWrapPlatformException;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AggregateRecordsGroupedByDurationResponse it2 = jqb.a(it.next());
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            arrayList.add(ResponseConvertersKt.toSdkResponse((AggregateRecordsGroupedByDurationResponse<Object>) it2, aggregateGroupByDurationRequest.getMetrics$connect_client_release()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public Object aggregateGroupByPeriod(@NotNull AggregateGroupByPeriodRequest aggregateGroupByPeriodRequest, @NotNull Continuation<? super List<AggregationResultGroupedByPeriod>> continuation) throws Exception {
        C12201 c12201;
        AggregationResultGroupedByPeriod sdkResponse;
        if (continuation instanceof C12201) {
            c12201 = (C12201) continuation;
            int i = c12201.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12201.label = i - Integer.MIN_VALUE;
            } else {
                c12201 = new C12201(continuation);
            }
        } else {
            c12201 = new C12201(continuation);
        }
        Object objWrapPlatformException = c12201.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12201.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWrapPlatformException);
            C12212 c12212 = new C12212(aggregateGroupByPeriodRequest, null);
            c12201.L$0 = aggregateGroupByPeriodRequest;
            c12201.label = 1;
            objWrapPlatformException = wrapPlatformException(c12212, c12201);
            if (objWrapPlatformException == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aggregateGroupByPeriodRequest = (AggregateGroupByPeriodRequest) c12201.L$0;
            ResultKt.throwOnFailure(objWrapPlatformException);
        }
        Intrinsics.checkNotNullExpressionValue(objWrapPlatformException, "override suspend fun agg…    }\n            }\n    }");
        Iterable iterable = (Iterable) objWrapPlatformException;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        int i3 = 0;
        for (Object obj : iterable) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            AggregateRecordsGroupedByPeriodResponse platformResponse = nqb.a(obj);
            if (SdkExtensions.getExtensionVersion(34) >= 10 || (aggregateGroupByPeriodRequest.getTimeRangeSlicer().getMonths() == 0 && aggregateGroupByPeriodRequest.getTimeRangeSlicer().getYears() == 0)) {
                Intrinsics.checkNotNullExpressionValue(platformResponse, "platformResponse");
                sdkResponse = ResponseConvertersKt.toSdkResponse((AggregateRecordsGroupedByPeriodResponse<Object>) platformResponse, aggregateGroupByPeriodRequest.getMetrics$connect_client_release());
            } else {
                LocalTimeRangeFilter platformLocalTimeRangeFilter = RequestConvertersKt.toPlatformLocalTimeRangeFilter(aggregateGroupByPeriodRequest.getTimeRangeFilter());
                LocalDateTime startTime = platformLocalTimeRangeFilter.getStartTime();
                Intrinsics.checkNotNull(startTime);
                LocalDateTime bucketStartTime = startTime.plus((TemporalAmount) aggregateGroupByPeriodRequest.getTimeRangeSlicer().multipliedBy(i3));
                LocalDateTime localDateTimePlus = bucketStartTime.plus((TemporalAmount) aggregateGroupByPeriodRequest.getTimeRangeSlicer());
                Intrinsics.checkNotNullExpressionValue(platformResponse, "platformResponse");
                Set<AggregateMetric<?>> metrics$connect_client_release = aggregateGroupByPeriodRequest.getMetrics$connect_client_release();
                Intrinsics.checkNotNullExpressionValue(bucketStartTime, "bucketStartTime");
                LocalDateTime endTime = platformLocalTimeRangeFilter.getEndTime();
                Intrinsics.checkNotNull(endTime);
                if (endTime.isBefore(localDateTimePlus)) {
                    localDateTimePlus = platformLocalTimeRangeFilter.getEndTime();
                    Intrinsics.checkNotNull(localDateTimePlus);
                }
                Intrinsics.checkNotNullExpressionValue(localDateTimePlus, "if (requestTimeRangeFilt…                        }");
                sdkResponse = ResponseConvertersKt.toSdkResponse(platformResponse, metrics$connect_client_release, bucketStartTime, localDateTimePlus);
            }
            arrayList.add(sdkResponse);
            i3 = i4;
        }
        return arrayList;
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public Object deleteRecords(@NotNull KClass<? extends Record> kClass, @NotNull List<String> list, @NotNull List<String> list2, @NotNull Continuation<? super Unit> continuation) throws Exception {
        Object objWrapPlatformException = wrapPlatformException(new C12222(list, list2, kClass, null), continuation);
        return objWrapPlatformException == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWrapPlatformException : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public Object getChanges(@NotNull String str, @NotNull Continuation<? super ChangesResponse> continuation) throws Exception {
        C12231 c12231;
        if (continuation instanceof C12231) {
            c12231 = (C12231) continuation;
            int i = c12231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12231.label = i - Integer.MIN_VALUE;
            } else {
                c12231 = new C12231(continuation);
            }
        } else {
            c12231 = new C12231(continuation);
        }
        Object result = c12231.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12231.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(result);
                c12231.L$0 = this;
                c12231.L$1 = str;
                c12231.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(c12231), 1);
                cancellableContinuationImpl.initCancellability();
                HealthConnectManager healthConnectManager = this.healthConnectManager;
                lqb.a();
                healthConnectManager.getChangeLogs(kqb.a(str).build(), this.executor, OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
                result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(c12231);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(result);
            }
            ChangeLogsResponse changeLogsResponseA = aqb.a(result);
            List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            List upsertedRecords = changeLogsResponseA.getUpsertedRecords();
            Intrinsics.checkNotNullExpressionValue(upsertedRecords, "response.upsertedRecords");
            Iterator it = upsertedRecords.iterator();
            while (it.hasNext()) {
                android.health.connect.datatypes.Record it2 = mqb.a(it.next());
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                listCreateListBuilder.add(new UpsertionChange(RecordConvertersKt.toSdkRecord(it2)));
            }
            List deletedLogs = changeLogsResponseA.getDeletedLogs();
            Intrinsics.checkNotNullExpressionValue(deletedLogs, "response.deletedLogs");
            Iterator it3 = deletedLogs.iterator();
            while (it3.hasNext()) {
                String deletedRecordId = eqb.a(it3.next()).getDeletedRecordId();
                Intrinsics.checkNotNullExpressionValue(deletedRecordId, "it.deletedRecordId");
                listCreateListBuilder.add(new DeletionChange(deletedRecordId));
            }
            List listBuild = CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder);
            String nextChangesToken = changeLogsResponseA.getNextChangesToken();
            Intrinsics.checkNotNullExpressionValue(nextChangesToken, "response.nextChangesToken");
            return new ChangesResponse(listBuild, nextChangesToken, changeLogsResponseA.hasMorePages(), false);
        } catch (HealthConnectException e) {
            if (e.getErrorCode() == 3) {
                return new ChangesResponse(CollectionsKt__CollectionsKt.emptyList(), "", false, true);
            }
            throw ExceptionConverterKt.toKtException(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public Object getChangesToken(@NotNull ChangesTokenRequest changesTokenRequest, @NotNull Continuation<? super String> continuation) throws Exception {
        C12241 c12241;
        if (continuation instanceof C12241) {
            c12241 = (C12241) continuation;
            int i = c12241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12241.label = i - Integer.MIN_VALUE;
            } else {
                c12241 = new C12241(continuation);
            }
        } else {
            c12241 = new C12241(continuation);
        }
        Object objWrapPlatformException = c12241.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12241.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWrapPlatformException);
            C12252 c12252 = new C12252(changesTokenRequest, null);
            c12241.label = 1;
            objWrapPlatformException = wrapPlatformException(c12252, c12241);
            if (objWrapPlatformException == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWrapPlatformException);
        }
        String token = tpb.a(objWrapPlatformException).getToken();
        Intrinsics.checkNotNullExpressionValue(token, "override suspend fun get…\n            .token\n    }");
        return token;
    }

    @Override // androidx.health.connect.client.PermissionController
    @Nullable
    public Object getGrantedPermissions(@NotNull Continuation<? super Set<String>> continuation) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L));
        Set setCreateSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
        int length = packageInfo.requestedPermissions.length;
        for (int i = 0; i < length; i++) {
            String str = packageInfo.requestedPermissions[i];
            Intrinsics.checkNotNullExpressionValue(str, "it.requestedPermissions[i]");
            if (StringsKt__StringsJVMKt.startsWith$default(str, HealthPermission.PERMISSION_PREFIX, false, 2, null) && (packageInfo.requestedPermissionsFlags[i] & 2) > 0) {
                String str2 = packageInfo.requestedPermissions[i];
                Intrinsics.checkNotNullExpressionValue(str2, "it.requestedPermissions[i]");
                setCreateSetBuilder.add(str2);
            }
        }
        return SetsKt__SetsJVMKt.build(setCreateSetBuilder);
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    @NotNull
    public PermissionController getPermissionController() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public Object insertRecords(@NotNull List<? extends Record> list, @NotNull Continuation<? super InsertRecordsResponse> continuation) throws Exception {
        C12261 c12261;
        if (continuation instanceof C12261) {
            c12261 = (C12261) continuation;
            int i = c12261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12261.label = i - Integer.MIN_VALUE;
            } else {
                c12261 = new C12261(continuation);
            }
        } else {
            c12261 = new C12261(continuation);
        }
        Object objWrapPlatformException = c12261.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWrapPlatformException);
            HealthConnectClientUpsideDownImpl$insertRecords$response$1 healthConnectClientUpsideDownImpl$insertRecords$response$1 = new HealthConnectClientUpsideDownImpl$insertRecords$response$1(this, list, null);
            c12261.label = 1;
            objWrapPlatformException = wrapPlatformException(healthConnectClientUpsideDownImpl$insertRecords$response$1, c12261);
            if (objWrapPlatformException == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWrapPlatformException);
        }
        android.health.connect.InsertRecordsResponse response = tqb.a(objWrapPlatformException);
        Intrinsics.checkNotNullExpressionValue(response, "response");
        return InsertRecordsResponseConverterKt.toKtResponse(response);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public <T extends Record> Object readRecord(@NotNull KClass<T> kClass, @NotNull String str, @NotNull Continuation<? super ReadRecordResponse<T>> continuation) throws Exception {
        C12271 c12271;
        if (continuation instanceof C12271) {
            c12271 = (C12271) continuation;
            int i = c12271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12271.label = i - Integer.MIN_VALUE;
            } else {
                c12271 = new C12271(continuation);
            }
        } else {
            c12271 = new C12271(continuation);
        }
        Object objWrapPlatformException = c12271.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12271.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWrapPlatformException);
            HealthConnectClientUpsideDownImpl$readRecord$response$1 healthConnectClientUpsideDownImpl$readRecord$response$1 = new HealthConnectClientUpsideDownImpl$readRecord$response$1(this, kClass, str, null);
            c12271.label = 1;
            objWrapPlatformException = wrapPlatformException(healthConnectClientUpsideDownImpl$readRecord$response$1, c12271);
            if (objWrapPlatformException == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWrapPlatformException);
        }
        ReadRecordsResponse readRecordsResponseA = spb.a(objWrapPlatformException);
        if (readRecordsResponseA.getRecords().isEmpty()) {
            throw new RemoteException("No records");
        }
        Object obj = readRecordsResponseA.getRecords().get(0);
        Intrinsics.checkNotNullExpressionValue(obj, "response.records[0]");
        Record sdkRecord = RecordConvertersKt.toSdkRecord(mqb.a(obj));
        Intrinsics.checkNotNull(sdkRecord, "null cannot be cast to non-null type T of androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl.readRecord");
        return new ReadRecordResponse(sdkRecord);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public <T extends Record> Object readRecords(@NotNull ReadRecordsRequest<T> readRecordsRequest, @NotNull Continuation<? super androidx.health.connect.client.response.ReadRecordsResponse<T>> continuation) throws Exception {
        C12281 c12281;
        if (continuation instanceof C12281) {
            c12281 = (C12281) continuation;
            int i = c12281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12281.label = i - Integer.MIN_VALUE;
            } else {
                c12281 = new C12281(continuation);
            }
        } else {
            c12281 = new C12281(continuation);
        }
        Object objWrapPlatformException = c12281.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12281.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWrapPlatformException);
            HealthConnectClientUpsideDownImpl$readRecords$response$1 healthConnectClientUpsideDownImpl$readRecords$response$1 = new HealthConnectClientUpsideDownImpl$readRecords$response$1(this, readRecordsRequest, null);
            c12281.label = 1;
            objWrapPlatformException = wrapPlatformException(healthConnectClientUpsideDownImpl$readRecords$response$1, c12281);
            if (objWrapPlatformException == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWrapPlatformException);
        }
        ReadRecordsResponse readRecordsResponseA = spb.a(objWrapPlatformException);
        List records = readRecordsResponseA.getRecords();
        Intrinsics.checkNotNullExpressionValue(records, "response.records");
        List list = records;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            android.health.connect.datatypes.Record it2 = mqb.a(it.next());
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            Record sdkRecord = RecordConvertersKt.toSdkRecord(it2);
            Intrinsics.checkNotNull(sdkRecord, "null cannot be cast to non-null type T of androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl.readRecords$lambda$0");
            arrayList.add(sdkRecord);
        }
        Long lBoxLong = Boxing.boxLong(readRecordsResponseA.getNextPageToken());
        if (lBoxLong.longValue() == -1) {
            lBoxLong = null;
        }
        return new androidx.health.connect.client.response.ReadRecordsResponse(arrayList, lBoxLong != null ? lBoxLong.toString() : null);
    }

    @Override // androidx.health.connect.client.PermissionController
    @Nullable
    public Object revokeAllPermissions(@NotNull Continuation<? super Unit> continuation) {
        String[] strArr = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L)).requestedPermissions;
        Intrinsics.checkNotNullExpressionValue(strArr, "context.packageManager\n …    .requestedPermissions");
        ArrayList arrayList = new ArrayList();
        for (String it : strArr) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (StringsKt__StringsJVMKt.startsWith$default(it, HealthPermission.PERMISSION_PREFIX, false, 2, null)) {
                arrayList.add(it);
            }
        }
        this.revokePermissionsFunction.invoke2(arrayList);
        return Unit.INSTANCE;
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public Object updateRecords(@NotNull List<? extends Record> list, @NotNull Continuation<? super Unit> continuation) throws Exception {
        Object objWrapPlatformException = wrapPlatformException(new C12292(list, null), continuation);
        return objWrapPlatformException == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWrapPlatformException : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    public HealthConnectClientUpsideDownImpl(@NotNull Context context, @NotNull Function1<? super Collection<String>, Unit> revokePermissionsFunction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(revokePermissionsFunction, "revokePermissionsFunction");
        this.executor = ExecutorsKt.asExecutor(Dispatchers.getDefault());
        this.context = context;
        Object systemService = context.getSystemService("healthconnect");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.health.connect.HealthConnectManager");
        this.healthConnectManager = wpb.a(systemService);
        this.revokePermissionsFunction = revokePermissionsFunction;
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    @Nullable
    public Object deleteRecords(@NotNull KClass<? extends Record> kClass, @NotNull TimeRangeFilter timeRangeFilter, @NotNull Continuation<? super Unit> continuation) throws Exception {
        Object objWrapPlatformException = wrapPlatformException(new AnonymousClass4(kClass, timeRangeFilter, null), continuation);
        return objWrapPlatformException == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWrapPlatformException : Unit.INSTANCE;
    }
}
