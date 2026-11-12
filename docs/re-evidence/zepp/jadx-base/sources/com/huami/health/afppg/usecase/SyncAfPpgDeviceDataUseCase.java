package com.huami.health.afppg.usecase;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.health.afppg.PpgCoroutineScope;
import com.huami.health.afppg.data.local.RRDataKeeper;
import com.huami.health.afppg.data.local.bean.AFibData;
import com.huami.health.afppg.data.local.bean.HREventData;
import com.huami.health.afppg.data.local.bean.RRPeak;
import com.huami.health.afppg.koin.KoinModuleKt;
import com.huami.health.afppg.model.AFPPGDataFragment;
import com.huami.health.afppg.model.AFPPGDataType;
import com.huami.health.afppg.model.AFPPGDeviceGeneralInfo;
import com.huami.health.afppg.model.DeviceConfig;
import com.huami.health.afppg.repository.PPGRepository;
import com.huami.health.afppg.service.AFHandleService;
import com.huami.health.afppg.service.ISaveHandledData;
import com.huami.health.afppg.service.ISyncAfPPGDeviceApi;
import com.huami.health.afppg.service.RRPackageDataAnalysis;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b*\u0001&\u0018\u0000 ,2\u00020\u0001:\u0001,B/\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010%\u001a\u00020#¢\u0006\u0004\b*\u0010+J[\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052-\u0010\u000f\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tH\u0002J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002J\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\nH\u0002JU\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112-\u0010\u000f\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tH\u0002JI\u0010\u001a\u001a\u00020\u000e2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052-\u0010\u000f\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010$R\u001d\u0010)\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b\u001c\u0010(¨\u0006-"}, d2 = {"Lcom/huami/health/afppg/usecase/SyncAfPpgDeviceDataUseCase;", "", "", "userId", "appName", "", "", "Ljava/util/Calendar;", "typeTimeMap", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "typeSaveTimeMap", "", "saveSyncTime", "e", "", "Lcom/huami/health/afppg/model/AFPPGDataFragment;", "f", "results", "b", "data", "time", GoogleApiAvailabilityLight.a, "c", Constant.METHOD_EXECUTE, "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/lang/String;", "Lcom/huami/health/afppg/service/ISyncAfPPGDeviceApi;", "Lcom/huami/health/afppg/service/ISyncAfPPGDeviceApi;", "deviceApi", "Lcom/huami/health/afppg/repository/PPGRepository;", "Lcom/huami/health/afppg/repository/PPGRepository;", "ppgRepository", "com/huami/health/afppg/usecase/SyncAfPpgDeviceDataUseCase$saveHandledData$2$1", "Lkotlin/Lazy;", "()Lcom/huami/health/afppg/usecase/SyncAfPpgDeviceDataUseCase$saveHandledData$2$1;", "saveHandledData", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huami/health/afppg/service/ISyncAfPPGDeviceApi;Lcom/huami/health/afppg/repository/PPGRepository;)V", "Companion", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class SyncAfPpgDeviceDataUseCase {

    @NotNull
    private static final String g = "af_ppg_SyncAfPpgDeviceDataUseCase";
    private static final long h = 1000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String appName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ISyncAfPPGDeviceApi deviceApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final PPGRepository ppgRepository;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy saveHandledData = LazyKt__LazyJVMKt.lazy(new Function0<SyncAfPpgDeviceDataUseCase$saveHandledData$2.AnonymousClass1>() { // from class: com.huami.health.afppg.usecase.SyncAfPpgDeviceDataUseCase$saveHandledData$2
        {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.huami.health.afppg.usecase.SyncAfPpgDeviceDataUseCase$saveHandledData$2$1] */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass1 getA() {
            final SyncAfPpgDeviceDataUseCase syncAfPpgDeviceDataUseCase = this.a;
            return new ISaveHandledData() { // from class: com.huami.health.afppg.usecase.SyncAfPpgDeviceDataUseCase$saveHandledData$2.1
                @Override // com.huami.health.afppg.service.ISaveHandledData
                public void onHandleAFibFinished(@NotNull List<AFibData> aFibList) {
                    syncAfPpgDeviceDataUseCase.ppgRepository.insertNewAFibData(aFibList);
                }

                @Override // com.huami.health.afppg.service.ISaveHandledData
                public void onHandleHRFinished(@NotNull List<HREventData> hrEventList) {
                    syncAfPpgDeviceDataUseCase.ppgRepository.insertHrEventData(hrEventList);
                }

                @Override // com.huami.health.afppg.service.ISaveHandledData
                public void onHandleRRFinished(@NotNull List<RRPeak> rrPeakList) {
                    syncAfPpgDeviceDataUseCase.ppgRepository.insertNewRRData(rrPeakList);
                }
            };
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "handleAFPPGData deviceInfo isNull";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/health/afppg/service/RRPackageDataAnalysis$RRSingleData;", "pkgs", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<List<? extends RRPackageDataAnalysis.RRSingleData>, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ RRPackageDataAnalysis.RRSingleData a;
            public final /* synthetic */ Ref.IntRef b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(RRPackageDataAnalysis.RRSingleData rRSingleData, Ref.IntRef intRef) {
                super(0);
                this.a = rRSingleData;
                this.b = intRef;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "rr index not consecutive: " + this.a.getIndex() + ", " + this.b.element;
            }
        }

        /* JADX INFO: renamed from: com.huami.health.afppg.usecase.SyncAfPpgDeviceDataUseCase$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0432b extends Lambda implements Function0<String> {
            public final /* synthetic */ List<RRPackageDataAnalysis.RRSingleData> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0432b(List<RRPackageDataAnalysis.RRSingleData> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "rr index first: time: " + ((RRPackageDataAnalysis.RRSingleData) CollectionsKt.first((List) this.a)).getTimestamp() + " index:" + ((RRPackageDataAnalysis.RRSingleData) CollectionsKt.first((List) this.a)).getIndex() + " ,last: time: " + ((RRPackageDataAnalysis.RRSingleData) CollectionsKt.last((List) this.a)).getTimestamp() + " index: " + ((RRPackageDataAnalysis.RRSingleData) CollectionsKt.last((List) this.a)).getIndex();
            }
        }

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RRPackageDataAnalysis.RRSingleData> list) {
            invoke2((List<RRPackageDataAnalysis.RRSingleData>) list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<RRPackageDataAnalysis.RRSingleData> list) {
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = RRDataKeeper.INSTANCE.getRRIndex();
            for (RRPackageDataAnalysis.RRSingleData rRSingleData : list) {
                int index = rRSingleData.getIndex();
                int i = intRef.element;
                if (index - i != 1 && i != -1) {
                    HMLog.info(SyncAfPpgDeviceDataUseCase.g, new a(rRSingleData, intRef));
                }
                intRef.element = rRSingleData.getIndex();
            }
            HMLog.info(SyncAfPpgDeviceDataUseCase.g, new C0432b(list));
            RRDataKeeper.INSTANCE.saveRRIndex(intRef.element);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.health.afppg.usecase.SyncAfPpgDeviceDataUseCase$syncAfPpgSeriesDataFromDevice$1", f = "SyncAfPpgDeviceDataUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ List<AFPPGDataFragment> e;
        public final /* synthetic */ Function1<Map<Integer, Long>, Unit> f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("thread = ", Thread.currentThread().getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, String str2, List<AFPPGDataFragment> list, Function1<? super Map<Integer, Long>, Unit> function1, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = str2;
            this.e = list;
            this.f = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SyncAfPpgDeviceDataUseCase.this.new c(this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.info("SyncAfPpgDeviceDataUseCase", a.a);
            SyncAfPpgDeviceDataUseCase.this.c(this.c, this.d, this.e, this.f);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Calendar b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, Calendar calendar) {
            super(0);
            this.a = i;
            this.b = calendar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "type = " + this.a + " - calendar ms = " + this.b.getTimeInMillis();
        }
    }

    public SyncAfPpgDeviceDataUseCase(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull ISyncAfPPGDeviceApi iSyncAfPPGDeviceApi, @NotNull PPGRepository pPGRepository) {
        this.context = context;
        this.userId = str;
        this.appName = str2;
        this.deviceApi = iSyncAfPPGDeviceApi;
        this.ppgRepository = pPGRepository;
    }

    private final SyncAfPpgDeviceDataUseCase$saveHandledData$2.AnonymousClass1 a() {
        return (SyncAfPpgDeviceDataUseCase$saveHandledData$2.AnonymousClass1) this.saveHandledData.getValue();
    }

    private final Map<Integer, Long> b(List<AFPPGDataFragment> results) {
        Iterator it2 = results.iterator();
        long jD = 0;
        long jD2 = 0;
        long jD3 = 0;
        long jD4 = 0;
        long jD5 = 0;
        long jD6 = 0;
        while (it2.hasNext()) {
            AFPPGDataFragment aFPPGDataFragment = (AFPPGDataFragment) it2.next();
            int type = aFPPGDataFragment.getType();
            Iterator it3 = it2;
            if (type == AFPPGDataType.AF_PPG.getValue()) {
                jD = d(aFPPGDataFragment, jD);
            } else if (type == AFPPGDataType.RR.getValue()) {
                jD2 = d(aFPPGDataFragment, jD2);
            } else if (type == AFPPGDataType.DIAGNOSIS.getValue()) {
                jD3 = d(aFPPGDataFragment, jD3);
            } else if (type == AFPPGDataType.HR_PG.getValue()) {
                jD4 = d(aFPPGDataFragment, jD4);
            } else if (type == AFPPGDataType.AF_ACC.getValue()) {
                jD5 = d(aFPPGDataFragment, jD5);
            } else if (type == AFPPGDataType.HL_HR.getValue()) {
                jD6 = d(aFPPGDataFragment, jD6);
            }
            it2 = it3;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jD > 0) {
            linkedHashMap.put(Integer.valueOf(AFPPGDataType.AF_PPG.getValue()), Long.valueOf(jD + 1000));
        }
        if (jD2 > 0) {
            linkedHashMap.put(Integer.valueOf(AFPPGDataType.RR.getValue()), Long.valueOf(jD2 + 1000));
        }
        if (jD3 > 0) {
            linkedHashMap.put(Integer.valueOf(AFPPGDataType.DIAGNOSIS.getValue()), Long.valueOf(jD3 + 1000));
        }
        if (jD4 > 0) {
            linkedHashMap.put(Integer.valueOf(AFPPGDataType.HR_PG.getValue()), Long.valueOf(jD4 + 1000));
        }
        if (jD5 > 0) {
            linkedHashMap.put(Integer.valueOf(AFPPGDataType.AF_ACC.getValue()), Long.valueOf(jD5 + 1000));
        }
        if (jD6 > 0) {
            linkedHashMap.put(Integer.valueOf(AFPPGDataType.HL_HR.getValue()), Long.valueOf(jD6 + 1000));
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(String userId, String appName, List<AFPPGDataFragment> results, Function1<? super Map<Integer, Long>, Unit> saveSyncTime) {
        AFPPGDeviceGeneralInfo deviceInfo = this.deviceApi.getDeviceInfo();
        if (deviceInfo.isNull()) {
            HMLog.error$default(g, null, null, a.a, 6, null);
            return;
        }
        AFHandleService.INSTANCE.inputAFData(this.context, new DeviceConfig(deviceInfo.getFwVerStr(), deviceInfo.getSn(), deviceInfo.getDeviceId(), userId, appName, deviceInfo.getDeviceSource()), results, null, a(), b.a);
        saveSyncTime.invoke(b(results));
    }

    private final long d(AFPPGDataFragment data, long time) {
        return data.getTimestamp().getTimeInMillis() > time ? data.getTimestamp().getTimeInMillis() : time;
    }

    private final void e(String userId, String appName, Map<Integer, ? extends Calendar> typeTimeMap, Function1<? super Map<Integer, Long>, Unit> saveSyncTime) {
        e.f((CoroutineScope) KoinModuleKt.ppgScope().get(Reflection.getOrCreateKotlinClass(PpgCoroutineScope.class), null, null), null, null, new c(userId, appName, f(typeTimeMap), saveSyncTime, null), 3, null);
    }

    private final List<AFPPGDataFragment> f(Map<Integer, ? extends Calendar> typeTimeMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, ? extends Calendar> entry : typeTimeMap.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Calendar value = entry.getValue();
            HMLog.info(g, new d(iIntValue, value));
            if (iIntValue == AFPPGDataType.AF_PPG.getValue()) {
                arrayList.addAll(this.deviceApi.syncAfPpgFromDevice(value));
            } else if (iIntValue == AFPPGDataType.DIAGNOSIS.getValue()) {
                arrayList.addAll(this.deviceApi.syncAfResultFromDevice(value));
            } else if (iIntValue == AFPPGDataType.HR_PG.getValue()) {
                arrayList.addAll(this.deviceApi.syncHighLowPpgFromDevice(value));
            } else if (iIntValue == AFPPGDataType.AF_ACC.getValue()) {
                arrayList.addAll(this.deviceApi.syncAfAccFromDevice(value));
            } else if (iIntValue == AFPPGDataType.RR.getValue()) {
                arrayList.addAll(this.deviceApi.syncRRPeakFromDevice(value));
            } else if (iIntValue == AFPPGDataType.HL_HR.getValue()) {
                arrayList.addAll(this.deviceApi.syncHighLowHRFromDevice(value));
            }
        }
        return arrayList;
    }

    public final void execute(@NotNull Map<Integer, ? extends Calendar> typeTimeMap, @NotNull Function1<? super Map<Integer, Long>, Unit> saveSyncTime) {
        e(this.userId, this.appName, typeTimeMap, saveSyncTime);
    }
}
