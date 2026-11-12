package com.xiaomi.hm.health.atrialfibrillation;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.health.afppg.PpgCoroutineScope;
import com.huami.health.afppg.koin.KoinModuleKt;
import com.huami.health.afppg.model.AFPPGDataType;
import com.huami.health.afppg.usecase.ClearAllUserDataUseCase;
import com.huami.health.afppg.usecase.SyncAfPpgDeviceDataUseCase;
import com.huami.health.afppg.usecase.UploadAllUseCase;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.health.device.AtrialManagerKt;
import com.xiaomi.hm.health.device.health.synctime.HealthDataSyncTime;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0013\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\tR\u0016\u0010\u000f\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/atrialfibrillation/AtrialFibUseCaseUtils;", "Lorg/koin/core/component/KoinComponent;", "", "Ljava/util/TimeZone;", "timezone", "", "a", "", "uploadDataToServerBySync", "", "syncDeviceData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAllData", "clearDataWhenLogOut", "Ljava/lang/String;", "TAG", "b", "J", "lastSyncTime", "c", "TIME_ONE_MINUTE", GoogleApiAvailabilityLight.a, "YYYY_MM_DD_HH_MM_SS", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AtrialFibUseCaseUtils implements KoinComponent {

    @NotNull
    public static final AtrialFibUseCaseUtils INSTANCE = new AtrialFibUseCaseUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "af_ppg_AtrialSync";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static long lastSyncTime = 0;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final long TIME_ONE_MINUTE = 60000;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.xiaomi.hm.health.atrialfibrillation.AtrialFibUseCaseUtils$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0775a extends Lambda implements Function0<String> {
            public static final C0775a a = new C0775a();

            public C0775a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "clearAllData";
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info(AtrialFibUseCaseUtils.TAG, C0775a.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "clearAllData failed: " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public static final c a = new c();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "clearDataWhenLogOut";
            }
        }

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info(AtrialFibUseCaseUtils.TAG, a.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "AtrialFibUseCaseUtils syncDeviceData failed: " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.atrialfibrillation.AtrialFibUseCaseUtils", f = "AtrialFibUseCaseUtils.kt", i = {}, l = {57}, m = "syncDeviceData", n = {}, s = {})
    public static final class e extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return AtrialFibUseCaseUtils.this.syncDeviceData(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device not support atrial";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "syncDeviceData too frequent";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ Calendar a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Calendar calendar) {
            super(0);
            this.a = calendar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "af result sync time is:" + this.a.getTimeInMillis() + ", time: " + AtrialFibUseCaseUtils.b(AtrialFibUseCaseUtils.INSTANCE, this.a.getTimeInMillis(), null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ Calendar a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Calendar calendar) {
            super(0);
            this.a = calendar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "af acc sync time is:" + this.a.getTimeInMillis() + ", time: " + AtrialFibUseCaseUtils.b(AtrialFibUseCaseUtils.INSTANCE, this.a.getTimeInMillis(), null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ Calendar a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Calendar calendar) {
            super(0);
            this.a = calendar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "af ppg sync time is:" + this.a.getTimeInMillis() + ", time: " + AtrialFibUseCaseUtils.b(AtrialFibUseCaseUtils.INSTANCE, this.a.getTimeInMillis(), null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ Calendar a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Calendar calendar) {
            super(0);
            this.a = calendar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "af rrpeak sync time is:" + this.a.getTimeInMillis() + ", time: " + AtrialFibUseCaseUtils.b(AtrialFibUseCaseUtils.INSTANCE, this.a.getTimeInMillis(), null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "", "resultTime", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<Map<Integer, ? extends Long>, Unit> {
        public static final m a = new m();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Map<Integer, Long> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map<Integer, Long> map) {
                super(0);
                this.a = map;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "sync finish and save time:" + new Gson().toJson(this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.atrialfibrillation.AtrialFibUseCaseUtils$syncDeviceData$9$3", f = "AtrialFibUseCaseUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;

            public b(Continuation<? super b> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (AtrialFibUseCaseUtils.INSTANCE.uploadDataToServerBySync()) {
                    HealthDataSyncTime.INSTANCE.getInstance().syncToServer();
                }
                return Unit.INSTANCE;
            }
        }

        public m() {
            super(1);
        }

        public final void a(@NotNull Map<Integer, Long> map) {
            HMLog.info(AtrialFibUseCaseUtils.TAG, new a(map));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (iIntValue == AFPPGDataType.DIAGNOSIS.getValue()) {
                    HealthDataSyncTime.INSTANCE.getInstance().getAfSyncTime().save(((Number) entry.getValue()).longValue() / ((long) 1000));
                } else if (iIntValue == AFPPGDataType.AF_ACC.getValue()) {
                    HealthDataSyncTime.INSTANCE.getInstance().getAfAccSyncTime().save(((Number) entry.getValue()).longValue() / ((long) 1000));
                } else if (iIntValue == AFPPGDataType.AF_PPG.getValue()) {
                    HealthDataSyncTime.INSTANCE.getInstance().getAfPpgSyncTime().save(((Number) entry.getValue()).longValue() / ((long) 1000));
                } else if (iIntValue == AFPPGDataType.RR.getValue()) {
                    HealthDataSyncTime.INSTANCE.getInstance().getAfRrPeakSyncTime().save(((Number) entry.getValue()).longValue() / ((long) 1000));
                }
            }
            HealthDataSyncTime.INSTANCE.getInstance().saveSyncTimeToLocal();
            PpgCoroutineScope ppgCoroutineScope = (PpgCoroutineScope) KoinModuleKt.ppgScope().get(Reflection.getOrCreateKotlinClass(PpgCoroutineScope.class), null, null);
            kotlinx.coroutines.e.f(ppgCoroutineScope, ppgCoroutineScope.getNETWORK_DISPATCHER(), null, new b(null), 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<Integer, ? extends Long> map) {
            a(map);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sync afb data to server at logout";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sync afb data to server error:" + this.a.getMessage();
        }
    }

    private AtrialFibUseCaseUtils() {
    }

    private final String a(long j2, TimeZone timeZone) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            simpleDateFormat.setTimeZone(timeZone);
            objM3845constructorimpl = Result.m3845constructorimpl(simpleDateFormat.format(Long.valueOf(j2)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = "";
        }
        return (String) objM3845constructorimpl;
    }

    public static /* synthetic */ String b(AtrialFibUseCaseUtils atrialFibUseCaseUtils, long j2, TimeZone timeZone, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return atrialFibUseCaseUtils.a(j2, timeZone);
    }

    public final void clearAllData() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            ((ClearAllUserDataUseCase) KoinModuleKt.ppgScope().get(Reflection.getOrCreateKotlinClass(ClearAllUserDataUseCase.class), null, null)).execute(a.a);
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl == null) {
            return;
        }
        HMLog.error$default(TAG, null, null, new b(thM3848exceptionOrNullimpl), 6, null);
    }

    public final void clearDataWhenLogOut() {
        ClearAllUserDataUseCase clearAllUserDataUseCase = (ClearAllUserDataUseCase) KoinModuleKt.ppgScope().getOrNull(Reflection.getOrCreateKotlinClass(ClearAllUserDataUseCase.class), null, null);
        if (clearAllUserDataUseCase == null) {
            return;
        }
        clearAllUserDataUseCase.executeWhenMutexLogin(c.a);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object syncDeviceData(@NotNull Continuation<? super Unit> continuation) throws SyncException {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.d = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = eVar.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!AtrialManagerKt.isSupportAtrialFib(HMDeviceType.MILI)) {
                HMLog.info(TAG, f.a);
                return Unit.INSTANCE;
            }
            eVar.a = this;
            eVar.d = 1;
            if (TransAtrialDataUtilKt.transAtrialData(eVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (Math.abs(System.currentTimeMillis() - lastSyncTime) < 60000) {
            HMLog.info(TAG, g.a);
            return Unit.INSTANCE;
        }
        lastSyncTime = System.currentTimeMillis();
        SyncAfPpgDeviceDataUseCase syncAfPpgDeviceDataUseCase = (SyncAfPpgDeviceDataUseCase) KoinModuleKt.ppgScope().get(Reflection.getOrCreateKotlinClass(SyncAfPpgDeviceDataUseCase.class), null, null);
        try {
            Device bindInfo = HMDeviceManager.getInstance().getBindInfo(HMDeviceType.MILI);
            if (bindInfo == null) {
                HMLog.info(TAG, h.a);
                return Unit.INSTANCE;
            }
            HealthDataSyncTime.Companion companion = HealthDataSyncTime.INSTANCE;
            Calendar calendar = companion.getInstance().getAfSyncTime().get(bindInfo);
            HMLog.info(TAG, new i(calendar));
            Calendar calendar2 = companion.getInstance().getAfAccSyncTime().get(bindInfo);
            HMLog.info(TAG, new j(calendar2));
            Calendar calendar3 = companion.getInstance().getAfPpgSyncTime().get(bindInfo);
            HMLog.info(TAG, new k(calendar3));
            Calendar calendar4 = companion.getInstance().getAfRrPeakSyncTime().get(bindInfo);
            HMLog.info(TAG, new l(calendar4));
            HashMap map = new HashMap();
            map.put(Boxing.boxInt(AFPPGDataType.DIAGNOSIS.getValue()), calendar);
            map.put(Boxing.boxInt(AFPPGDataType.AF_ACC.getValue()), calendar2);
            map.put(Boxing.boxInt(AFPPGDataType.AF_PPG.getValue()), calendar3);
            map.put(Boxing.boxInt(AFPPGDataType.RR.getValue()), calendar4);
            syncAfPpgDeviceDataUseCase.execute(map, m.a);
            return Unit.INSTANCE;
        } catch (Exception e2) {
            HMLog.error$default(TAG, null, null, new d(e2), 6, null);
            throw new SyncException("同步房颤错误", e2, 0, 4, null);
        }
    }

    public final boolean uploadDataToServerBySync() {
        HMLog.info(TAG, n.a);
        try {
            return ((UploadAllUseCase) KoinModuleKt.ppgScope().get(Reflection.getOrCreateKotlinClass(UploadAllUseCase.class), null, null)).execute();
        } catch (Throwable th) {
            HMLog.error(TAG, "", th, new o(th));
            return false;
        }
    }
}
