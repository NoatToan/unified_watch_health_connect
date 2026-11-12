package com.huami.bloodoxygen.core.local.process;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.algo.healthcare.HealthCare;
import com.huami.algo.healthcare.Spo2Info;
import com.huami.bloodoxygen.core.koin.BoSleepInfo;
import com.huami.bloodoxygen.core.local.config.BloodOxygenCoroutineScope;
import com.huami.bloodoxygen.core.local.database.entity.Odi;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaEvent;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaProcess;
import com.huami.bloodoxygen.core.local.database.entity.OsaEvent;
import com.huami.bloodoxygen.core.remote.upload.IUploader;
import com.huami.bloodoxygen.core.repository.IBloodOxygenRepo;
import com.huami.bloodoxygen.core.usecase.sleep.GetSleepInfoUseCase;
import com.huami.bloodoxygen.core.utils.BloodOxygenUtils;
import com.huami.bloodoxygen.core.utils.ExtensionKt;
import com.huami.bloodoxygen.core.utils.PackagefunctionKt;
import com.huami.bloodoxygen.core.utils.SharedInstanceKt;
import com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 @2\u00020\u0001:\u0001@B'\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u00104\u001a\u000202\u0012\u0006\u00107\u001a\u000205\u0012\u0006\u0010:\u001a\u000208¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J@\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\fH\u0002J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002J\u0018\u0010!\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0002J;\u0010(\u001a\u00020'2'\u0010&\u001a#\b\u0001\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040$\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"¢\u0006\u0002\b%H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0014\u0010,\u001a\u00020\u00042\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*J\u000e\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0002J\u0014\u00100\u001a\u00020\u00042\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0*R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00101R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00106R\u0016\u0010:\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00109R\"\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020'0;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010<\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006A"}, d2 = {"Lcom/huami/bloodoxygen/core/local/process/OdiFactory;", "", "Lcom/huami/bloodoxygen/core/koin/BoSleepInfo;", "boSleepInfo", "", "g", GoogleApiAvailabilityLight.a, "(Lcom/huami/bloodoxygen/core/koin/BoSleepInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", CommonLanguageSettingFragment.KEY_REPO, "", "date", "", "start", "end", "e", "userId", "Lcom/huami/algo/healthcare/Spo2Info;", "spo2Info", "", "deviceSource", "deviceId", "sn", "sleepEndTime", "f", "Lcom/huami/bloodoxygen/core/local/database/entity/Odi;", "dbOdi", "newOdi", "", "a", "Lcom/huami/bloodoxygen/core/local/database/entity/OsaEvent;", "dbOsaEvent", "newOsaEvent", "b", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "Lkotlinx/coroutines/Job;", "c", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "", "infoListBo", "produce", "infoBo", "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaProcess;", "osaProcesses", "filterToProduce", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygenCoroutineScope;", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygenCoroutineScope;", "scope", "Lcom/huami/bloodoxygen/core/usecase/sleep/GetSleepInfoUseCase;", "Lcom/huami/bloodoxygen/core/usecase/sleep/GetSleepInfoUseCase;", "getSleepInfoUseCase", "Lcom/huami/bloodoxygen/core/remote/upload/IUploader;", "Lcom/huami/bloodoxygen/core/remote/upload/IUploader;", "uploader", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "dates", "<init>", "(Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;Lcom/huami/bloodoxygen/core/local/config/BloodOxygenCoroutineScope;Lcom/huami/bloodoxygen/core/usecase/sleep/GetSleepInfoUseCase;Lcom/huami/bloodoxygen/core/remote/upload/IUploader;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class OdiFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String f = "OdiFactory";
    private static final int g = 250;
    private static final long h = 5000;
    private static final int i = 1800000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IBloodOxygenRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final BloodOxygenCoroutineScope scope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final GetSleepInfoUseCase getSleepInfoUseCase;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final IUploader uploader;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentHashMap<String, Job> dates = new ConcurrentHashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/bloodoxygen/core/local/process/OdiFactory$Companion;", "", "", HMFwOnlineAnalyticsKt.COST, "", "odi", "Lcom/huami/algo/healthcare/Spo2Info;", "getSpo2ScoreAndDispCode", "", "DEFAULT_ECG_SAMPLING_RATE", LogUtil.I, "MILLISECOND_IN_HALF_HOUR", "", "TAG", "Ljava/lang/String;", "TIME_OUT", "J", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Spo2Info getSpo2ScoreAndDispCode(long cost, float odi) {
            int[] spo2ScoreAndDispCode = new HealthCare(250).getSpo2ScoreAndDispCode((int) cost, odi);
            Spo2Info spo2Info = new Spo2Info();
            spo2Info.sleepBreathingScore = spo2ScoreAndDispCode[0];
            spo2Info.sleepBreathingScoreCode = spo2ScoreAndDispCode[1];
            return spo2Info;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.local.process.OdiFactory$filterToProduce$1", f = "OdiFactory.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ List<OriginOsaProcess> b;
        public final /* synthetic */ OdiFactory c;

        /* JADX INFO: renamed from: com.huami.bloodoxygen.core.local.process.OdiFactory$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0294a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<OriginOsaProcess> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0294a(List<OriginOsaProcess> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "filterToProduce " + this.a.size();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Odi a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Odi odi) {
                super(0);
                this.a = odi;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "filterToProduce latestOdi timestamp " + this.a.getTimestamp();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<OriginOsaProcess> list, OdiFactory odiFactory, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = list;
            this.c = odiFactory;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.b.isEmpty()) {
                return Unit.INSTANCE;
            }
            PackagefunctionKt.bloodOxygenDebugLog(OdiFactory.f, new C0294a(this.b));
            List<OriginOsaProcess> list = this.b;
            Odi localLatestOdi = this.c.repo.getLocalLatestOdi();
            if (localLatestOdi != null) {
                HMLog.info(OdiFactory.f, new b(localLatestOdi));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (Boxing.boxBoolean(((OriginOsaProcess) obj2).getTimestamp() > localLatestOdi.getTimestamp() - 86400000).booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(ExtensionKt.toYMD(((OriginOsaProcess) it2.next()).getTimestamp()));
            }
            HashSet hashSet = CollectionsKt___CollectionsKt.toHashSet(arrayList2);
            OdiFactory odiFactory = this.c;
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                odiFactory.g(new BoSleepInfo((String) it3.next(), 0L, 0L, null, 14, null));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.local.process.OdiFactory", f = "OdiFactory.kt", i = {}, l = {106}, m = "processSleep", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return OdiFactory.this.d(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ BoSleepInfo a;
        public final /* synthetic */ BoSleepInfo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BoSleepInfo boSleepInfo, BoSleepInfo boSleepInfo2) {
            super(0);
            this.a = boSleepInfo;
            this.b = boSleepInfo2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "processSleep " + this.a.getDate() + " " + SharedInstanceKt.getGson().toJson(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ BoSleepInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(BoSleepInfo boSleepInfo) {
            super(0);
            this.a = boSleepInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "processSleep sleep start or end not valid " + this.a.getDate();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bloodoxygen/core/koin/BoSleepInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.local.process.OdiFactory$processSleep$2$info$1$1", f = "OdiFactory.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BoSleepInfo>, Object> {
        public int a;
        public final /* synthetic */ BoSleepInfo c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(BoSleepInfo boSleepInfo, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = boSleepInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OdiFactory.this.new e(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super BoSleepInfo> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GetSleepInfoUseCase getSleepInfoUseCase = OdiFactory.this.getSleepInfoUseCase;
                String date = this.c.getDate();
                this.a = 1;
                obj = getSleepInfoUseCase.execute(date, this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "query sleep error " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, long j, long j2) {
            super(0);
            this.a = str;
            this.b = j;
            this.c = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "osaProcesses is empty " + this.a + " " + this.b + " " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ List<OriginOsaEvent> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<OriginOsaEvent> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "processOdi ODEvent spo2 size:" + ((OriginOsaEvent) CollectionsKt.first((List) this.a)).getSpo2().size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ List<OriginOsaProcess> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(List<OriginOsaProcess> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "processOdi OSA timestamp:" + ((OriginOsaProcess) CollectionsKt.first((List) this.a)).getUtcTimestamp() + ", extended:" + ((OriginOsaProcess) CollectionsKt.first((List) this.a)).getExtended();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Spo2Info b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, Spo2Info spo2Info) {
            super(0);
            this.a = str;
            this.b = spo2Info;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            String str = this.a;
            Spo2Info spo2Info = this.b;
            return "processOdi " + str + " odi： " + spo2Info.odiValue + "， monitor: " + spo2Info.odiMonitorTime + ", score: " + spo2Info.sleepBreathingScore + ", desCode: " + spo2Info.sleepBreathingScoreCode + ", resultSpo2ArrayLen: " + spo2Info.processSpo2ResultArrayLength + ",oDResultArrayNum: " + spo2Info.osaEventArrayLength;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.local.process.OdiFactory$produce$1", f = "OdiFactory.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ List<BoSleepInfo> b;
        public final /* synthetic */ OdiFactory c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(List<BoSleepInfo> list, OdiFactory odiFactory, Continuation<? super k> continuation) {
            super(2, continuation);
            this.b = list;
            this.c = odiFactory;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new k(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<BoSleepInfo> list = this.b;
            OdiFactory odiFactory = this.c;
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                odiFactory.produce((BoSleepInfo) it2.next());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.local.process.OdiFactory$produce$2", f = "OdiFactory.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ BoSleepInfo c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(BoSleepInfo boSleepInfo, Continuation<? super l> continuation) {
            super(2, continuation);
            this.c = boSleepInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OdiFactory.this.new l(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OdiFactory.this.g(this.c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Spo2Info b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(int i, Spo2Info spo2Info) {
            super(0);
            this.a = i;
            this.b = spo2Info;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            int i = this.a;
            Spo2Info spo2Info = this.b;
            return "cost(" + i + ") or odiValue(" + spo2Info.odiValue + ") or sleepBreathScore(" + spo2Info.sleepBreathingScore + ") invalid";
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
            return "newOdi is same with dbOdi";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ Odi a;
        public final /* synthetic */ Odi b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Odi odi, Odi odi2) {
            super(0);
            this.a = odi;
            this.b = odi2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "odi not same " + (this.a == null) + " " + SharedInstanceKt.getGson().toJson(this.a) + " " + SharedInstanceKt.getGson().toJson(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "spo2Info odEventResultArray null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sleepEndTime not in range " + System.currentTimeMillis() + " " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ Odi a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Odi odi) {
            super(0);
            this.a = odi;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "odi processed " + SharedInstanceKt.getGson().toJson(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "startJob date already in calculate " + this.a + " " + System.currentTimeMillis();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.local.process.OdiFactory$startJob$2", f = "OdiFactory.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    public static final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ BoSleepInfo c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(BoSleepInfo boSleepInfo, String str, Continuation<? super t> continuation) {
            super(2, continuation);
            this.c = boSleepInfo;
            this.d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OdiFactory.this.new t(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OdiFactory odiFactory = OdiFactory.this;
                BoSleepInfo boSleepInfo = this.c;
                this.a = 1;
                obj = odiFactory.d(boSleepInfo, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BoSleepInfo boSleepInfo2 = (BoSleepInfo) obj;
            if (boSleepInfo2 != null) {
                OdiFactory odiFactory2 = OdiFactory.this;
                odiFactory2.e(odiFactory2.repo, boSleepInfo2.getDate(), boSleepInfo2.getStart(), boSleepInfo2.getEnd());
            }
            OdiFactory.this.dates.remove(this.d);
            return Unit.INSTANCE;
        }
    }

    public OdiFactory(@NotNull IBloodOxygenRepo iBloodOxygenRepo, @NotNull BloodOxygenCoroutineScope bloodOxygenCoroutineScope, @NotNull GetSleepInfoUseCase getSleepInfoUseCase, @NotNull IUploader iUploader) {
        this.repo = iBloodOxygenRepo;
        this.scope = bloodOxygenCoroutineScope;
        this.getSleepInfoUseCase = getSleepInfoUseCase;
        this.uploader = iUploader;
    }

    private final boolean a(Odi dbOdi, Odi newOdi) {
        if (dbOdi != null && Intrinsics.areEqual(dbOdi.getUserId(), newOdi.getUserId()) && dbOdi.getUtcTimestamp() == newOdi.getUtcTimestamp() && dbOdi.getOdTimes() == newOdi.getOdTimes() && dbOdi.getCost() == newOdi.getCost()) {
            return ((dbOdi.getOdi() > newOdi.getOdi() ? 1 : (dbOdi.getOdi() == newOdi.getOdi() ? 0 : -1)) == 0) && dbOdi.getDeviceSource() == newOdi.getDeviceSource() && Intrinsics.areEqual(dbOdi.getTimeZoneId(), newOdi.getTimeZoneId()) && dbOdi.getValid() == newOdi.getValid() && Intrinsics.areEqual(dbOdi.getDeviceId(), newOdi.getDeviceId()) && Intrinsics.areEqual(dbOdi.getSn(), newOdi.getSn()) && Intrinsics.areEqual(dbOdi.getVersion(), newOdi.getVersion()) && dbOdi.getScore() == newOdi.getScore() && dbOdi.getDispCode() == newOdi.getDispCode();
        }
        return false;
    }

    private final boolean b(OsaEvent dbOsaEvent, OsaEvent newOsaEvent) {
        return Intrinsics.areEqual(dbOsaEvent.getUserId(), newOsaEvent.getUserId()) && dbOsaEvent.getUtcTimestamp() == newOsaEvent.getUtcTimestamp() && Intrinsics.areEqual(dbOsaEvent.getSpo2(), newOsaEvent.getSpo2()) && Intrinsics.areEqual(dbOsaEvent.getHr(), newOsaEvent.getHr()) && dbOsaEvent.getSpo2Decrease() == newOsaEvent.getSpo2Decrease() && Intrinsics.areEqual(dbOsaEvent.getTimeZoneId(), newOsaEvent.getTimeZoneId()) && dbOsaEvent.getDeviceSource() == newOsaEvent.getDeviceSource() && Intrinsics.areEqual(dbOsaEvent.getDeviceId(), newOsaEvent.getDeviceId()) && Intrinsics.areEqual(dbOsaEvent.getSn(), newOsaEvent.getSn()) && Intrinsics.areEqual(dbOsaEvent.getVersion(), newOsaEvent.getVersion()) && dbOsaEvent.getToDelete() == newOsaEvent.getToDelete();
    }

    private final Job c(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        return kotlinx.coroutines.e.f(this.scope, null, null, block, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(BoSleepInfo boSleepInfo, Continuation<? super BoSleepInfo> continuation) {
        b bVar;
        BoSleepInfo boSleepInfo2;
        Object objM3845constructorimpl;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.e = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objWithTimeoutOrNull = bVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
            if (boSleepInfo.valid()) {
                return boSleepInfo;
            }
            try {
                Result.Companion companion = Result.Companion;
                e eVar = new e(boSleepInfo, null);
                bVar.a = boSleepInfo;
                bVar.b = boSleepInfo;
                bVar.e = 1;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(5000L, eVar, bVar);
                if (objWithTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                boSleepInfo2 = boSleepInfo;
            } catch (Throwable th) {
                th = th;
                boSleepInfo2 = boSleepInfo;
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boSleepInfo = (BoSleepInfo) bVar.b;
            boSleepInfo2 = (BoSleepInfo) bVar.a;
            try {
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion3 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        }
        objM3845constructorimpl = Result.m3845constructorimpl((BoSleepInfo) objWithTimeoutOrNull);
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(f, new f(thM3848exceptionOrNullimpl));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        BoSleepInfo boSleepInfo3 = (BoSleepInfo) objM3845constructorimpl;
        PackagefunctionKt.bloodOxygenDebugLog(f, new c(boSleepInfo, boSleepInfo3));
        if (boSleepInfo3 == null || !boSleepInfo3.valid()) {
            HMLog.info(f, new d(boSleepInfo));
            return null;
        }
        boSleepInfo.setStart(boSleepInfo3.getStart());
        boSleepInfo.setEnd(boSleepInfo3.getEnd());
        return boSleepInfo2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(IBloodOxygenRepo repo, String date, long start, long end) {
        List<OriginOsaEvent> localOriginOsaEvents = repo.getLocalOriginOsaEvents(start, end);
        for (OriginOsaEvent originOsaEvent : localOriginOsaEvents) {
            originOsaEvent.setUtcTimestamp(originOsaEvent.getUtcTimestamp() / ((long) 1000));
        }
        List<OriginOsaProcess> localOriginOsaProcesses = repo.getLocalOriginOsaProcesses(start, end);
        for (OriginOsaProcess originOsaProcess : localOriginOsaProcesses) {
            originOsaProcess.setUtcTimestamp(originOsaProcess.getUtcTimestamp() / ((long) 1000));
        }
        if (localOriginOsaProcesses.isEmpty()) {
            HMLog.info(f, new g(date, start, end));
            return;
        }
        if (!localOriginOsaEvents.isEmpty()) {
            HMLog.info(f, new h(localOriginOsaEvents));
        }
        if (!localOriginOsaProcesses.isEmpty()) {
            HMLog.info(f, new i(localOriginOsaProcesses));
        }
        Spo2Info spo2Info = new Spo2Info();
        long j2 = 1000;
        spo2Info.sleepStartTimeStamp = (int) (start / j2);
        spo2Info.sleepStopTimeStamp = (int) (end / j2);
        spo2Info.osaProcessesJsonString = SharedInstanceKt.getGson().toJson(localOriginOsaProcesses);
        spo2Info.osaEventsJsonString = SharedInstanceKt.getGson().toJson(localOriginOsaEvents);
        new HealthCare(250).calculateSpo2ValidInfo(spo2Info);
        new HealthCare(250).fitProcessSpo2Info(spo2Info);
        HMLog.info(f, new j(date, spo2Info));
        OriginOsaProcess originOsaProcess2 = (OriginOsaProcess) CollectionsKt.first((List) localOriginOsaProcesses);
        f(originOsaProcess2.getUserId(), date, spo2Info, originOsaProcess2.getDeviceSource(), originOsaProcess2.getDeviceId(), originOsaProcess2.getSn(), end);
    }

    private final void f(String userId, String date, Spo2Info spo2Info, int deviceSource, String deviceId, String sn, long sleepEndTime) {
        Odi odi;
        ArrayList arrayList;
        String str;
        HashMap map;
        String str2;
        Spo2Info spo2Info2 = spo2Info;
        String spo2AlgoVersion = new HealthCare(250).getSpo2AlgoVersion();
        int i2 = spo2Info2.odiMonitorTime;
        String str3 = f;
        if (i2 <= 0) {
            HMLog.info(f, new m(i2, spo2Info2));
            return;
        }
        long j2 = i2;
        long j3 = 1000;
        long jYMDToTimestamp = (BloodOxygenUtils.INSTANCE.yMDToTimestamp(date) / j3) * j3;
        Odi odi2 = new Odi(userId, jYMDToTimestamp, spo2Info2.osaEventArrayLength, j2, spo2Info2.odiValue, deviceSource, null, 0, deviceId, sn, spo2AlgoVersion, spo2Info2.sleepBreathingScore, spo2Info2.sleepBreathingScoreCode, ExtensionKt.toYMDHMS$default(jYMDToTimestamp, null, 1, null), false, 16576, null);
        odi2.setValid(ExtensionKt.getValid(odi2));
        HMLog.info(f, new r(odi2));
        Odi localOdi = this.repo.getLocalOdi(odi2.getTimestamp());
        int i3 = 0;
        if (a(localOdi, odi2)) {
            HMLog.info(f, n.a);
            if (localOdi != null && localOdi.getUploaded()) {
                return;
            }
            this.uploader.uploadAlgoResultData(date);
            return;
        }
        HMLog.info$default(null, new o(localOdi, odi2), 1, null);
        ArrayList arrayList2 = new ArrayList();
        List<OsaEvent> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        if (spo2Info2.odEventResultArray != null) {
            List<OsaEvent> localOsaEventBySleepDate = this.repo.getLocalOsaEventBySleepDate(date);
            HashMap map2 = new HashMap();
            for (Object obj : localOsaEventBySleepDate) {
                map2.put(Long.valueOf(((OsaEvent) obj).getUtcTimestamp()), obj);
            }
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, spo2Info2.odEventResultArray.length - 1, 3);
            if (progressionLastElement >= 0) {
                while (true) {
                    int i4 = i3 + 3;
                    int i5 = progressionLastElement;
                    long j4 = j3;
                    int i6 = i3;
                    ArrayList arrayList3 = arrayList2;
                    odi = odi2;
                    str2 = str3;
                    OsaEvent osaEvent = new OsaEvent(userId, ((long) spo2Info2.odEventResultArray[i3]) * j3, CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), spo2Info2.odEventResultArray[i6 + 1], null, deviceSource, deviceId, sn, spo2AlgoVersion, null, false, date, false, 11296, null);
                    map = map2;
                    if (map.get(Long.valueOf(osaEvent.getUtcTimestamp())) == null) {
                        arrayList = arrayList3;
                        arrayList.add(osaEvent);
                    } else {
                        arrayList = arrayList3;
                        if (b((OsaEvent) map.get(Long.valueOf(osaEvent.getUtcTimestamp())), osaEvent)) {
                            map.remove(Long.valueOf(osaEvent.getUtcTimestamp()));
                            arrayList.add(osaEvent);
                        } else {
                            map.remove(Long.valueOf(osaEvent.getUtcTimestamp()));
                        }
                    }
                    if (i6 == i5) {
                        break;
                    }
                    spo2Info2 = spo2Info;
                    map2 = map;
                    arrayList2 = arrayList;
                    i3 = i4;
                    j3 = j4;
                    odi2 = odi;
                    str3 = str2;
                    progressionLastElement = i5;
                }
            } else {
                odi = odi2;
                map = map2;
                arrayList = arrayList2;
                str2 = f;
            }
            listEmptyList = CollectionsKt___CollectionsKt.toList(map.values());
            Iterator<T> it2 = listEmptyList.iterator();
            while (it2.hasNext()) {
                ((OsaEvent) it2.next()).setToDelete(true);
            }
            str = str2;
        } else {
            odi = odi2;
            arrayList = arrayList2;
            p pVar = p.a;
            str = f;
            HMLog.info(str, pVar);
        }
        this.repo.addLocalOsaEvents(arrayList);
        this.repo.addLocalOsaEvents(listEmptyList);
        this.repo.addLocalOdi(odi);
        if (System.currentTimeMillis() - sleepEndTime < BloodPressureCorrectViewModel.NEED_RETURN_TIME) {
            HMLog.info(str, new q(sleepEndTime));
        } else {
            this.uploader.uploadAlgoResultData(date);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void g(BoSleepInfo boSleepInfo) {
        String date = boSleepInfo.getDate();
        if (this.dates.get(date) != null) {
            HMLog.info(f, new s(date));
        } else {
            this.dates.put(date, c(new t(boSleepInfo, date, null)));
        }
    }

    public final void filterToProduce(@NotNull List<OriginOsaProcess> osaProcesses) {
        c(new a(osaProcesses, this, null));
    }

    public final void produce(@NotNull List<BoSleepInfo> infoListBo) {
        c(new k(infoListBo, this, null));
    }

    public final void produce(@NotNull BoSleepInfo infoBo) {
        c(new l(infoBo, null));
    }
}
