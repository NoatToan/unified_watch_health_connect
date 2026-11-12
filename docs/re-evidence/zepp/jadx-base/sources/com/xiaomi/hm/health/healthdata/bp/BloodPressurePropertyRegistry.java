package com.xiaomi.hm.health.healthdata.bp;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.userproperty.UserPropertyManager;
import com.huami.userproperty.service.UserProperty;
import com.huami.userproperty.service.UserPropertyRegistry;
import com.huami.userproperty.service.entity.remote.FetchResult;
import com.huami.userproperty.service.entity.remote.PushResult;
import com.huami.userproperty.service.entity.remote.ResultFuture;
import com.huami.userproperty.service.entity.remote.SimpleResultFuture;
import com.huami.userproperty.service.interceptor.FetchInterceptor;
import com.huami.userproperty.service.interceptor.GetInterceptor;
import com.huami.userproperty.service.interceptor.Interceptor;
import com.huami.userproperty.service.interceptor.PushInterceptor;
import com.huami.userproperty.service.interceptor.SetInterceptor;
import com.huami.userproperty.service.repo.UserPropertyRepo;
import com.loc.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0002R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0017\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001f¨\u0006/"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/bp/BloodPressurePropertyRegistry;", "Lcom/huami/userproperty/service/UserPropertyRegistry;", "", "timeStamp", "", "saveBloodPressureMeasuredDataTime", "getBloodPressureMeasuredDataTime", "saveBpMeasuredRawDataTime", "getBpMeasuredRawDataTime", "saveBpCalibrationTime", "getBpCalibrationTime", "saveBpFeatureTime", "getBpFeatureTime", "saveBpNightTime", "getBpNightTime", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "PREFIX", "e", "PROPERTY_MEASURED_DATA", "PROPERTY_MEASURED_RAW_DATA", "PROPERTY_CALIBRATION_DATA", "PROPERTY_CALIBRATION_FEATURE_DATA", "PROPERTY_NIGHT_DATA", "RAWDATA_TIME_INTERVAL", "J", "Lcom/huami/userproperty/service/UserProperty;", "f", "Lcom/huami/userproperty/service/UserProperty;", "getBloodPressureMeasuredData", "()Lcom/huami/userproperty/service/UserProperty;", "bloodPressureMeasuredData", "g", "getBpMeasuredRawData", "bpMeasuredRawData", "h", "getBpCalibrationData", "bpCalibrationData", "i", "getBpFeatureData", "bpFeatureData", z.j, "getBpNightDataTime", "bpNightDataTime", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BloodPressurePropertyRegistry extends UserPropertyRegistry {

    @NotNull
    public static final BloodPressurePropertyRegistry INSTANCE;

    @NotNull
    public static final String PROPERTY_CALIBRATION_DATA = "huami.midong.user.bloodpressure.calibrationrawdata.latest.time";

    @NotNull
    public static final String PROPERTY_CALIBRATION_FEATURE_DATA = "huami.midong.user.bloodpressure.calibrationfeaturesrawdata.latest.time";

    @NotNull
    public static final String PROPERTY_MEASURED_RAW_DATA = "huami.midong.user.bloodpressure.originalrawdata.latest.time";

    @NotNull
    public static final String PROPERTY_NIGHT_DATA = "user.bloodpressure.continuous.synctime";
    public static final long RAWDATA_TIME_INTERVAL = 1000;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String PREFIX = "huami.midong.user.bloodpressure";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String PROPERTY_MEASURED_DATA = "huami.midong.user.bloodpressure.originaldata.latest.time";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final UserProperty<Long> bloodPressureMeasuredData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final UserProperty<Long> bpMeasuredRawData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final UserProperty<Long> bpCalibrationData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final UserProperty<Long> bpFeatureData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private static final UserProperty<Long> bpNightDataTime;

    static {
        final BloodPressurePropertyRegistry bloodPressurePropertyRegistry = new BloodPressurePropertyRegistry();
        INSTANCE = bloodPressurePropertyRegistry;
        final String str = PROPERTY_MEASURED_DATA;
        final Function0 function0 = null;
        bloodPressureMeasuredData = new UserProperty<Long>(str, function0, bloodPressurePropertyRegistry) { // from class: com.xiaomi.hm.health.healthdata.bp.BloodPressurePropertyRegistry$special$$inlined$userProperty$default$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final String key;
            public final /* synthetic */ String b;
            public final /* synthetic */ Function0 c;
            public final /* synthetic */ UserPropertyRegistry d;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.bp.BloodPressurePropertyRegistry$special$$inlined$userProperty$default$1$1, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$fetch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$fetch$1", f = "UserPropertyRegistry.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super FetchResult<Long>>, Object> {
                public int a;
                public final /* synthetic */ BloodPressurePropertyRegistry$special$$inlined$userProperty$default$1 b;
                public final /* synthetic */ UserPropertyRegistry c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(UserPropertyRegistry userPropertyRegistry, BloodPressurePropertyRegistry$special$$inlined$userProperty$default$1 bloodPressurePropertyRegistry$special$$inlined$userProperty$default$1, Continuation continuation) {
                    super(1, continuation);
                    this.c = userPropertyRegistry;
                    this.b = bloodPressurePropertyRegistry$special$$inlined$userProperty$default$1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.c, this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@Nullable Continuation<? super FetchResult<Long>> continuation) {
                    return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        UserPropertyRepo propertyRepo = this.c.getPropertyRepo();
                        BloodPressurePropertyRegistry$special$$inlined$userProperty$default$1 bloodPressurePropertyRegistry$special$$inlined$userProperty$default$1 = this.b;
                        List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : registryInterceptors) {
                            if (obj2 instanceof FetchInterceptor) {
                                arrayList.add(obj2);
                            }
                        }
                        Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                        this.a = 1;
                        obj = propertyRepo.fetch(bloodPressurePropertyRegistry$special$$inlined$userProperty$default$1, arrayList, registryUrlProvider, this);
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
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.bp.BloodPressurePropertyRegistry$special$$inlined$userProperty$default$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/PushResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$push$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$push$1", f = "UserPropertyRegistry.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super PushResult>, Object> {
                public int a;
                public final /* synthetic */ BloodPressurePropertyRegistry$special$$inlined$userProperty$default$1 b;
                public final /* synthetic */ UserPropertyRegistry c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(UserPropertyRegistry userPropertyRegistry, BloodPressurePropertyRegistry$special$$inlined$userProperty$default$1 bloodPressurePropertyRegistry$special$$inlined$userProperty$default$1, Continuation continuation) {
                    super(1, continuation);
                    this.c = userPropertyRegistry;
                    this.b = bloodPressurePropertyRegistry$special$$inlined$userProperty$default$1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                    return new AnonymousClass2(this.c, this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@Nullable Continuation<? super PushResult> continuation) {
                    return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        UserPropertyRepo propertyRepo = this.c.getPropertyRepo();
                        BloodPressurePropertyRegistry$special$$inlined$userProperty$default$1 bloodPressurePropertyRegistry$special$$inlined$userProperty$default$1 = this.b;
                        List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : registryInterceptors) {
                            if (obj2 instanceof PushInterceptor) {
                                arrayList.add(obj2);
                            }
                        }
                        Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                        this.a = 1;
                        obj = propertyRepo.push(bloodPressurePropertyRegistry$special$$inlined$userProperty$default$1, arrayList, registryUrlProvider, this);
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
            }

            {
                this.b = str;
                this.c = function0;
                this.d = bloodPressurePropertyRegistry;
                this.key = str;
            }

            @Override // com.huami.userproperty.service.UserProperty
            @Nullable
            public Function0<String> customApi() {
                Function0<String> function1 = this.c;
                return function1 == null ? this.d.getRegistryUrlProvider() : function1;
            }

            @Override // com.huami.userproperty.service.UserProperty
            @NotNull
            public ResultFuture<FetchResult<Long>> fetch() {
                return SimpleResultFuture.INSTANCE.createFuture(new AnonymousClass1(this.d, this, null));
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Long, java.lang.Object] */
            @Override // com.huami.userproperty.service.UserProperty
            @Nullable
            public Long get() {
                UserPropertyRepo propertyRepo = this.d.getPropertyRepo();
                Function0<String> registryUrlProvider = this.d.getRegistryUrlProvider();
                String strInvoke = registryUrlProvider == null ? null : registryUrlProvider.invoke();
                List<Interceptor<?, ?>> registryInterceptors = this.d.getRegistryInterceptors();
                ArrayList arrayList = new ArrayList();
                for (Object obj : registryInterceptors) {
                    if (obj instanceof GetInterceptor) {
                        arrayList.add(obj);
                    }
                }
                return propertyRepo.get(this, strInvoke, arrayList);
            }

            @Override // com.huami.userproperty.service.UserProperty
            @NotNull
            public String getKey() {
                return this.key;
            }

            @Override // com.huami.userproperty.service.UserProperty
            @NotNull
            public ResultFuture<PushResult> push() {
                return SimpleResultFuture.INSTANCE.createFuture(new AnonymousClass2(this.d, this, null));
            }

            @Override // com.huami.userproperty.service.UserProperty
            public void set(@Nullable Long value) {
                UserPropertyRepo propertyRepo = this.d.getPropertyRepo();
                Function0<String> registryUrlProvider = this.d.getRegistryUrlProvider();
                String strInvoke = registryUrlProvider == null ? null : registryUrlProvider.invoke();
                List<Interceptor<?, ?>> registryInterceptors = this.d.getRegistryInterceptors();
                ArrayList arrayList = new ArrayList();
                for (Object obj : registryInterceptors) {
                    if (obj instanceof SetInterceptor) {
                        arrayList.add(obj);
                    }
                }
                propertyRepo.set(this, value, strInvoke, arrayList);
            }
        };
        final String str2 = PROPERTY_MEASURED_RAW_DATA;
        bpMeasuredRawData = new UserProperty<Long>(str2, function0, bloodPressurePropertyRegistry) { // from class: com.xiaomi.hm.health.healthdata.bp.BloodPressurePropertyRegistry$special$$inlined$userProperty$default$2

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final String key;
            public final /* synthetic */ String b;
            public final /* synthetic */ Function0 c;
            public final /* synthetic */ UserPropertyRegistry d;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.bp.BloodPressurePropertyRegistry$special$$inlined$userProperty$default$2$1, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$fetch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$fetch$1", f = "UserPropertyRegistry.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super FetchResult<Long>>, Object> {
                public int a;
                public final /* synthetic */ BloodPressurePropertyRegistry$special$$inlined$userProperty$default$2 b;
                public final /* synthetic */ UserPropertyRegistry c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(UserPropertyRegistry userPropertyRegistry, BloodPressurePropertyRegistry$special$$inlined$userProperty$default$2 bloodPressurePropertyRegistry$special$$inlined$userProperty$default$2, Continuation continuation) {
                    super(1, continuation);
                    this.c = userPropertyRegistry;
                    this.b = bloodPressurePropertyRegistry$special$$inlined$userProperty$default$2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.c, this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@Nullable Continuation<? super FetchResult<Long>> continuation) {
                    return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        UserPropertyRepo propertyRepo = this.c.getPropertyRepo();
                        BloodPressurePropertyRegistry$special$$inlined$userProperty$default$2 bloodPressurePropertyRegistry$special$$inlined$userProperty$default$2 = this.b;
                        List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : registryInterceptors) {
                            if (obj2 instanceof FetchInterceptor) {
                                arrayList.add(obj2);
                            }
                        }
                        Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                        this.a = 1;
                        obj = propertyRepo.fetch(bloodPressurePropertyRegistry$special$$inlined$userProperty$default$2, arrayList, registryUrlProvider, this);
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
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.bp.BloodPressurePropertyRegistry$special$$inlined$userProperty$default$2$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/PushResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$push$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$push$1", f = "UserPropertyRegistry.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super PushResult>, Object> {
                public int a;
                public final /* synthetic */ BloodPressurePropertyRegistry$special$$inlined$userProperty$default$2 b;
                public final /* synthetic */ UserPropertyRegistry c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(UserPropertyRegistry userPropertyRegistry, BloodPressurePropertyRegistry$special$$inlined$userProperty$default$2 bloodPressurePropertyRegistry$special$$inlined$userProperty$default$2, Continuation continuation) {
                    super(1, continuation);
                    this.c = userPropertyRegistry;
                    this.b = bloodPressurePropertyRegistry$special$$inlined$userProperty$default$2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                    return new AnonymousClass2(this.c, this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@Nullable Continuation<? super PushResult> continuation) {
                    return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        UserPropertyRepo propertyRepo = this.c.getPropertyRepo();
                        BloodPressurePropertyRegistry$special$$inlined$userProperty$default$2 bloodPressurePropertyRegistry$special$$inlined$userProperty$default$2 = this.b;
                        List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : registryInterceptors) {
                            if (obj2 instanceof PushInterceptor) {
                                arrayList.add(obj2);
                            }
                        }
                        Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                        this.a = 1;
                        obj = propertyRepo.push(bloodPressurePropertyRegistry$special$$inlined$userProperty$default$2, arrayList, registryUrlProvider, this);
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
            }

            {
                this.b = str2;
                this.c = function0;
                this.d = bloodPressurePropertyRegistry;
                this.key = str2;
            }

            @Override // com.huami.userproperty.service.UserProperty
            @Nullable
            public Function0<String> customApi() {
                Function0<String> function1 = this.c;
                return function1 == null ? this.d.getRegistryUrlProvider() : function1;
            }

            @Override // com.huami.userproperty.service.UserProperty
            @NotNull
            public ResultFuture<FetchResult<Long>> fetch() {
                return SimpleResultFuture.INSTANCE.createFuture(new AnonymousClass1(this.d, this, null));
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Long, java.lang.Object] */
            @Override // com.huami.userproperty.service.UserProperty
            @Nullable
            public Long get() {
                UserPropertyRepo propertyRepo = this.d.getPropertyRepo();
                Function0<String> registryUrlProvider = this.d.getRegistryUrlProvider();
                String strInvoke = registryUrlProvider == null ? null : registryUrlProvider.invoke();
                List<Interceptor<?, ?>> registryInterceptors = this.d.getRegistryInterceptors();
                ArrayList arrayList = new ArrayList();
                for (Object obj : registryInterceptors) {
                    if (obj instanceof GetInterceptor) {
                        arrayList.add(obj);
                    }
                }
                return propertyRepo.get(this, strInvoke, arrayList);
            }

            @Override // com.huami.userproperty.service.UserProperty
            @NotNull
            public String getKey() {
                return this.key;
            }

            @Override // com.huami.userproperty.service.UserProperty
            @NotNull
            public ResultFuture<PushResult> push() {
                return SimpleResultFuture.INSTANCE.createFuture(new AnonymousClass2(this.d, this, null));
            }

            @Override // com.huami.userproperty.service.UserProperty
            public void set(@Nullable Long value) {
                UserPropertyRepo propertyRepo = this.d.getPropertyRepo();
                Function0<String> registryUrlProvider = this.d.getRegistryUrlProvider();
                String strInvoke = registryUrlProvider == null ? null : registryUrlProvider.invoke();
                List<Interceptor<?, ?>> registryInterceptors = this.d.getRegistryInterceptors();
                ArrayList arrayList = new ArrayList();
                for (Object obj : registryInterceptors) {
                    if (obj instanceof SetInterceptor) {
                        arrayList.add(obj);
                    }
                }
                propertyRepo.set(this, value, strInvoke, arrayList);
            }
        };
        final String str3 = PROPERTY_CALIBRATION_DATA;
        bpCalibrationData = new UserProperty<Long>(str3, function0, bloodPressurePropertyRegistry) { // from class: com.xiaomi.hm.health.healthdata.bp.BloodPressurePropertyRegistry$special$$inlined$userProperty$default$3

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final String key;
            public final /* synthetic */ String b;
            public final /* synthetic */ Function0 c;
            public final /* synthetic */ UserPropertyRegistry d;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.bp.BloodPressurePropertyRegistry$special$$inlined$userProperty$default$3$1, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$fetch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$fetch$1", f = "UserPropertyRegistry.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super FetchResult<Long>>, Object> {
                public int a;
                public final /* synthetic */ BloodPressurePropertyRegistry$special$$inlined$userProperty$default$3 b;
                public final /* synthetic */ UserPropertyRegistry c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(UserPropertyRegistry userPropertyRegistry, BloodPressurePropertyRegistry$special$$inlined$userProperty$default$3 bloodPressurePropertyRegistry$special$$inlined$userProperty$default$3, Continuation continuation) {
                    super(1, continuation);
                    this.c = userPropertyRegistry;
                    this.b = bloodPressurePropertyRegistry$special$$inlined$userProperty$default$3;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.c, this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@Nullable Continuation<? super FetchResult<Long>> continuation) {
                    return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        UserPropertyRepo propertyRepo = this.c.getPropertyRepo();
                        BloodPressurePropertyRegistry$special$$inlined$userProperty$default$3 bloodPressurePropertyRegistry$special$$inlined$userProperty$default$3 = this.b;
                        List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : registryInterceptors) {
                            if (obj2 instanceof FetchInterceptor) {
                                arrayList.add(obj2);
                            }
                        }
                        Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                        this.a = 1;
                        obj = propertyRepo.fetch(bloodPressurePropertyRegistry$special$$inlined$userProperty$default$3, arrayList, registryUrlProvider, this);
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
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.bp.BloodPressurePropertyRegistry$special$$inlined$userProperty$default$3$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/PushResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$push$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$push$1", f = "UserPropertyRegistry.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super PushResult>, Object> {
                public int a;
                public final /* synthetic */ BloodPressurePropertyRegistry$special$$inlined$userProperty$default$3 b;
                public final /* synthetic */ UserPropertyRegistry c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(UserPropertyRegistry userPropertyRegistry, BloodPressurePropertyRegistry$special$$inlined$userProperty$default$3 bloodPressurePropertyRegistry$special$$inlined$userProperty$default$3, Continuation continuation) {
                    super(1, continuation);
                    this.c = userPropertyRegistry;
                    this.b = bloodPressurePropertyRegistry$special$$inlined$userProperty$default$3;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                    return new AnonymousClass2(this.c, this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@Nullable Continuation<? super PushResult> continuation) {
                    return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        UserPropertyRepo propertyRepo = this.c.getPropertyRepo();
                        BloodPressurePropertyRegistry$special$$inlined$userProperty$default$3 bloodPressurePropertyRegistry$special$$inlined$userProperty$default$3 = this.b;
                        List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : registryInterceptors) {
                            if (obj2 instanceof PushInterceptor) {
                                arrayList.add(obj2);
                            }
                        }
                        Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                        this.a = 1;
                        obj = propertyRepo.push(bloodPressurePropertyRegistry$special$$inlined$userProperty$default$3, arrayList, registryUrlProvider, this);
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
            }

            {
                this.b = str3;
                this.c = function0;
                this.d = bloodPressurePropertyRegistry;
                this.key = str3;
            }

            @Override // com.huami.userproperty.service.UserProperty
            @Nullable
            public Function0<String> customApi() {
                Function0<String> function1 = this.c;
                return function1 == null ? this.d.getRegistryUrlProvider() : function1;
            }

            @Override // com.huami.userproperty.service.UserProperty
            @NotNull
            public ResultFuture<FetchResult<Long>> fetch() {
                return SimpleResultFuture.INSTANCE.createFuture(new AnonymousClass1(this.d, this, null));
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Long, java.lang.Object] */
            @Override // com.huami.userproperty.service.UserProperty
            @Nullable
            public Long get() {
                UserPropertyRepo propertyRepo = this.d.getPropertyRepo();
                Function0<String> registryUrlProvider = this.d.getRegistryUrlProvider();
                String strInvoke = registryUrlProvider == null ? null : registryUrlProvider.invoke();
                List<Interceptor<?, ?>> registryInterceptors = this.d.getRegistryInterceptors();
                ArrayList arrayList = new ArrayList();
                for (Object obj : registryInterceptors) {
                    if (obj instanceof GetInterceptor) {
                        arrayList.add(obj);
                    }
                }
                return propertyRepo.get(this, strInvoke, arrayList);
            }

            @Override // com.huami.userproperty.service.UserProperty
            @NotNull
            public String getKey() {
                return this.key;
            }

            @Override // com.huami.userproperty.service.UserProperty
            @NotNull
            public ResultFuture<PushResult> push() {
                return SimpleResultFuture.INSTANCE.createFuture(new AnonymousClass2(this.d, this, null));
            }

            @Override // com.huami.userproperty.service.UserProperty
            public void set(@Nullable Long value) {
                UserPropertyRepo propertyRepo = this.d.getPropertyRepo();
                Function0<String> registryUrlProvider = this.d.getRegistryUrlProvider();
                String strInvoke = registryUrlProvider == null ? null : registryUrlProvider.invoke();
                List<Interceptor<?, ?>> registryInterceptors = this.d.getRegistryInterceptors();
                ArrayList arrayList = new ArrayList();
                for (Object obj : registryInterceptors) {
                    if (obj instanceof SetInterceptor) {
                        arrayList.add(obj);
                    }
                }
                propertyRepo.set(this, value, strInvoke, arrayList);
            }
        };
        final String str4 = PROPERTY_CALIBRATION_FEATURE_DATA;
        bpFeatureData = new UserProperty<Long>(str4, function0, bloodPressurePropertyRegistry) { // from class: com.xiaomi.hm.health.healthdata.bp.BloodPressurePropertyRegistry$special$$inlined$userProperty$default$4

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final String key;
            public final /* synthetic */ String b;
            public final /* synthetic */ Function0 c;
            public final /* synthetic */ UserPropertyRegistry d;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.bp.BloodPressurePropertyRegistry$special$$inlined$userProperty$default$4$1, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$fetch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$fetch$1", f = "UserPropertyRegistry.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super FetchResult<Long>>, Object> {
                public int a;
                public final /* synthetic */ BloodPressurePropertyRegistry$special$$inlined$userProperty$default$4 b;
                public final /* synthetic */ UserPropertyRegistry c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(UserPropertyRegistry userPropertyRegistry, BloodPressurePropertyRegistry$special$$inlined$userProperty$default$4 bloodPressurePropertyRegistry$special$$inlined$userProperty$default$4, Continuation continuation) {
                    super(1, continuation);
                    this.c = userPropertyRegistry;
                    this.b = bloodPressurePropertyRegistry$special$$inlined$userProperty$default$4;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.c, this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@Nullable Continuation<? super FetchResult<Long>> continuation) {
                    return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        UserPropertyRepo propertyRepo = this.c.getPropertyRepo();
                        BloodPressurePropertyRegistry$special$$inlined$userProperty$default$4 bloodPressurePropertyRegistry$special$$inlined$userProperty$default$4 = this.b;
                        List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : registryInterceptors) {
                            if (obj2 instanceof FetchInterceptor) {
                                arrayList.add(obj2);
                            }
                        }
                        Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                        this.a = 1;
                        obj = propertyRepo.fetch(bloodPressurePropertyRegistry$special$$inlined$userProperty$default$4, arrayList, registryUrlProvider, this);
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
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.bp.BloodPressurePropertyRegistry$special$$inlined$userProperty$default$4$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/PushResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$push$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$push$1", f = "UserPropertyRegistry.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super PushResult>, Object> {
                public int a;
                public final /* synthetic */ BloodPressurePropertyRegistry$special$$inlined$userProperty$default$4 b;
                public final /* synthetic */ UserPropertyRegistry c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(UserPropertyRegistry userPropertyRegistry, BloodPressurePropertyRegistry$special$$inlined$userProperty$default$4 bloodPressurePropertyRegistry$special$$inlined$userProperty$default$4, Continuation continuation) {
                    super(1, continuation);
                    this.c = userPropertyRegistry;
                    this.b = bloodPressurePropertyRegistry$special$$inlined$userProperty$default$4;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                    return new AnonymousClass2(this.c, this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@Nullable Continuation<? super PushResult> continuation) {
                    return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        UserPropertyRepo propertyRepo = this.c.getPropertyRepo();
                        BloodPressurePropertyRegistry$special$$inlined$userProperty$default$4 bloodPressurePropertyRegistry$special$$inlined$userProperty$default$4 = this.b;
                        List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : registryInterceptors) {
                            if (obj2 instanceof PushInterceptor) {
                                arrayList.add(obj2);
                            }
                        }
                        Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                        this.a = 1;
                        obj = propertyRepo.push(bloodPressurePropertyRegistry$special$$inlined$userProperty$default$4, arrayList, registryUrlProvider, this);
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
            }

            {
                this.b = str4;
                this.c = function0;
                this.d = bloodPressurePropertyRegistry;
                this.key = str4;
            }

            @Override // com.huami.userproperty.service.UserProperty
            @Nullable
            public Function0<String> customApi() {
                Function0<String> function1 = this.c;
                return function1 == null ? this.d.getRegistryUrlProvider() : function1;
            }

            @Override // com.huami.userproperty.service.UserProperty
            @NotNull
            public ResultFuture<FetchResult<Long>> fetch() {
                return SimpleResultFuture.INSTANCE.createFuture(new AnonymousClass1(this.d, this, null));
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Long, java.lang.Object] */
            @Override // com.huami.userproperty.service.UserProperty
            @Nullable
            public Long get() {
                UserPropertyRepo propertyRepo = this.d.getPropertyRepo();
                Function0<String> registryUrlProvider = this.d.getRegistryUrlProvider();
                String strInvoke = registryUrlProvider == null ? null : registryUrlProvider.invoke();
                List<Interceptor<?, ?>> registryInterceptors = this.d.getRegistryInterceptors();
                ArrayList arrayList = new ArrayList();
                for (Object obj : registryInterceptors) {
                    if (obj instanceof GetInterceptor) {
                        arrayList.add(obj);
                    }
                }
                return propertyRepo.get(this, strInvoke, arrayList);
            }

            @Override // com.huami.userproperty.service.UserProperty
            @NotNull
            public String getKey() {
                return this.key;
            }

            @Override // com.huami.userproperty.service.UserProperty
            @NotNull
            public ResultFuture<PushResult> push() {
                return SimpleResultFuture.INSTANCE.createFuture(new AnonymousClass2(this.d, this, null));
            }

            @Override // com.huami.userproperty.service.UserProperty
            public void set(@Nullable Long value) {
                UserPropertyRepo propertyRepo = this.d.getPropertyRepo();
                Function0<String> registryUrlProvider = this.d.getRegistryUrlProvider();
                String strInvoke = registryUrlProvider == null ? null : registryUrlProvider.invoke();
                List<Interceptor<?, ?>> registryInterceptors = this.d.getRegistryInterceptors();
                ArrayList arrayList = new ArrayList();
                for (Object obj : registryInterceptors) {
                    if (obj instanceof SetInterceptor) {
                        arrayList.add(obj);
                    }
                }
                propertyRepo.set(this, value, strInvoke, arrayList);
            }
        };
        final String str5 = PROPERTY_NIGHT_DATA;
        bpNightDataTime = new UserProperty<Long>(str5, function0, bloodPressurePropertyRegistry) { // from class: com.xiaomi.hm.health.healthdata.bp.BloodPressurePropertyRegistry$special$$inlined$userProperty$default$5

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final String key;
            public final /* synthetic */ String b;
            public final /* synthetic */ Function0 c;
            public final /* synthetic */ UserPropertyRegistry d;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.bp.BloodPressurePropertyRegistry$special$$inlined$userProperty$default$5$1, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$fetch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$fetch$1", f = "UserPropertyRegistry.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super FetchResult<Long>>, Object> {
                public int a;
                public final /* synthetic */ BloodPressurePropertyRegistry$special$$inlined$userProperty$default$5 b;
                public final /* synthetic */ UserPropertyRegistry c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(UserPropertyRegistry userPropertyRegistry, BloodPressurePropertyRegistry$special$$inlined$userProperty$default$5 bloodPressurePropertyRegistry$special$$inlined$userProperty$default$5, Continuation continuation) {
                    super(1, continuation);
                    this.c = userPropertyRegistry;
                    this.b = bloodPressurePropertyRegistry$special$$inlined$userProperty$default$5;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.c, this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@Nullable Continuation<? super FetchResult<Long>> continuation) {
                    return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        UserPropertyRepo propertyRepo = this.c.getPropertyRepo();
                        BloodPressurePropertyRegistry$special$$inlined$userProperty$default$5 bloodPressurePropertyRegistry$special$$inlined$userProperty$default$5 = this.b;
                        List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : registryInterceptors) {
                            if (obj2 instanceof FetchInterceptor) {
                                arrayList.add(obj2);
                            }
                        }
                        Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                        this.a = 1;
                        obj = propertyRepo.fetch(bloodPressurePropertyRegistry$special$$inlined$userProperty$default$5, arrayList, registryUrlProvider, this);
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
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.bp.BloodPressurePropertyRegistry$special$$inlined$userProperty$default$5$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/PushResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$push$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$push$1", f = "UserPropertyRegistry.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super PushResult>, Object> {
                public int a;
                public final /* synthetic */ BloodPressurePropertyRegistry$special$$inlined$userProperty$default$5 b;
                public final /* synthetic */ UserPropertyRegistry c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(UserPropertyRegistry userPropertyRegistry, BloodPressurePropertyRegistry$special$$inlined$userProperty$default$5 bloodPressurePropertyRegistry$special$$inlined$userProperty$default$5, Continuation continuation) {
                    super(1, continuation);
                    this.c = userPropertyRegistry;
                    this.b = bloodPressurePropertyRegistry$special$$inlined$userProperty$default$5;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                    return new AnonymousClass2(this.c, this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@Nullable Continuation<? super PushResult> continuation) {
                    return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        UserPropertyRepo propertyRepo = this.c.getPropertyRepo();
                        BloodPressurePropertyRegistry$special$$inlined$userProperty$default$5 bloodPressurePropertyRegistry$special$$inlined$userProperty$default$5 = this.b;
                        List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : registryInterceptors) {
                            if (obj2 instanceof PushInterceptor) {
                                arrayList.add(obj2);
                            }
                        }
                        Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                        this.a = 1;
                        obj = propertyRepo.push(bloodPressurePropertyRegistry$special$$inlined$userProperty$default$5, arrayList, registryUrlProvider, this);
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
            }

            {
                this.b = str5;
                this.c = function0;
                this.d = bloodPressurePropertyRegistry;
                this.key = str5;
            }

            @Override // com.huami.userproperty.service.UserProperty
            @Nullable
            public Function0<String> customApi() {
                Function0<String> function1 = this.c;
                return function1 == null ? this.d.getRegistryUrlProvider() : function1;
            }

            @Override // com.huami.userproperty.service.UserProperty
            @NotNull
            public ResultFuture<FetchResult<Long>> fetch() {
                return SimpleResultFuture.INSTANCE.createFuture(new AnonymousClass1(this.d, this, null));
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Long, java.lang.Object] */
            @Override // com.huami.userproperty.service.UserProperty
            @Nullable
            public Long get() {
                UserPropertyRepo propertyRepo = this.d.getPropertyRepo();
                Function0<String> registryUrlProvider = this.d.getRegistryUrlProvider();
                String strInvoke = registryUrlProvider == null ? null : registryUrlProvider.invoke();
                List<Interceptor<?, ?>> registryInterceptors = this.d.getRegistryInterceptors();
                ArrayList arrayList = new ArrayList();
                for (Object obj : registryInterceptors) {
                    if (obj instanceof GetInterceptor) {
                        arrayList.add(obj);
                    }
                }
                return propertyRepo.get(this, strInvoke, arrayList);
            }

            @Override // com.huami.userproperty.service.UserProperty
            @NotNull
            public String getKey() {
                return this.key;
            }

            @Override // com.huami.userproperty.service.UserProperty
            @NotNull
            public ResultFuture<PushResult> push() {
                return SimpleResultFuture.INSTANCE.createFuture(new AnonymousClass2(this.d, this, null));
            }

            @Override // com.huami.userproperty.service.UserProperty
            public void set(@Nullable Long value) {
                UserPropertyRepo propertyRepo = this.d.getPropertyRepo();
                Function0<String> registryUrlProvider = this.d.getRegistryUrlProvider();
                String strInvoke = registryUrlProvider == null ? null : registryUrlProvider.invoke();
                List<Interceptor<?, ?>> registryInterceptors = this.d.getRegistryInterceptors();
                ArrayList arrayList = new ArrayList();
                for (Object obj : registryInterceptors) {
                    if (obj instanceof SetInterceptor) {
                        arrayList.add(obj);
                    }
                }
                propertyRepo.set(this, value, strInvoke, arrayList);
            }
        };
    }

    private BloodPressurePropertyRegistry() {
    }

    @NotNull
    public final UserProperty<Long> getBloodPressureMeasuredData() {
        return bloodPressureMeasuredData;
    }

    public final long getBloodPressureMeasuredDataTime() {
        Long l = bloodPressureMeasuredData.get();
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    @NotNull
    public final UserProperty<Long> getBpCalibrationData() {
        return bpCalibrationData;
    }

    public final long getBpCalibrationTime() {
        Long l = bpCalibrationData.get();
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    @NotNull
    public final UserProperty<Long> getBpFeatureData() {
        return bpFeatureData;
    }

    public final long getBpFeatureTime() {
        Long l = bpFeatureData.get();
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    @NotNull
    public final UserProperty<Long> getBpMeasuredRawData() {
        return bpMeasuredRawData;
    }

    public final long getBpMeasuredRawDataTime() {
        Long l = bpMeasuredRawData.get();
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    @NotNull
    public final UserProperty<Long> getBpNightDataTime() {
        return bpNightDataTime;
    }

    public final long getBpNightTime() {
        Long l = bpNightDataTime.get();
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public final void saveBloodPressureMeasuredDataTime(long timeStamp) {
        bloodPressureMeasuredData.set(Long.valueOf(timeStamp));
        UserPropertyManager.INSTANCE.schedulePushAll();
    }

    public final void saveBpCalibrationTime(long timeStamp) {
        bpCalibrationData.set(Long.valueOf(timeStamp));
        UserPropertyManager.INSTANCE.schedulePushAll();
    }

    public final void saveBpFeatureTime(long timeStamp) {
        bpFeatureData.set(Long.valueOf(timeStamp));
        UserPropertyManager.INSTANCE.schedulePushAll();
    }

    public final void saveBpMeasuredRawDataTime(long timeStamp) {
        bpMeasuredRawData.set(Long.valueOf(timeStamp));
        UserPropertyManager.INSTANCE.schedulePushAll();
    }

    public final void saveBpNightTime(long timeStamp) {
        bpNightDataTime.set(Long.valueOf(timeStamp));
        UserPropertyManager.INSTANCE.schedulePushAll();
    }
}
