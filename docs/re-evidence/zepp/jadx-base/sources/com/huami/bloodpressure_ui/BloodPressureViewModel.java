package com.huami.bloodpressure_ui;

import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure.service.BloodPressureExpireVo;
import com.huami.bloodpressure.service.IBloodPressureExpireService;
import com.huami.bloodpressure_core.dc.research.BloodPressureResearchVo;
import com.huami.bloodpressure_core.dc.research.IResearchApi;
import com.huami.bloodpressure_core.di.KoinExKt;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.bloodpressure_core.sharedpreference.ISharedPref;
import com.huami.bloodpressure_core.url.IBPResearchConfig;
import com.huami.bloodpressure_ui.expire.BloodPressureExpireDialogLogic;
import com.huami.bloodpressure_ui.usercase.BloodPressureLogicRepoUserCase;
import com.huami.chart.util.Index;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\ba\u0010bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0002J\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u0015\u001a\u00020\u0004J\u0006\u0010\u0016\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010%R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010!R\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010%R\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010!R!\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010%R(\u00105\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010!\u001a\u0004\b2\u0010%\"\u0004\b3\u00104R\u001f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f8\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010!\u001a\u0004\b7\u0010%R2\u0010=\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b09j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b`:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R2\u0010?\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b09j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b`:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R2\u0010A\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b09j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b`:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010<R2\u0010C\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b09j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b`:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010<R\u001e\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010D0\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010!R!\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010D0\u001f8\u0006@\u0006¢\u0006\f\n\u0004\bG\u0010!\u001a\u0004\bH\u0010%R\u001d\u0010N\u001a\u00020J8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\b\u001c\u0010MR\u001d\u0010R\u001a\u00020O8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010L\u001a\u0004\b#\u0010QR\u001d\u0010V\u001a\u00020S8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010L\u001a\u0004\b \u0010UR\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00180W8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00180[8\u0006@\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_¨\u0006c"}, d2 = {"Lcom/huami/bloodpressure_ui/BloodPressureViewModel;", "Landroidx/lifecycle/ViewModel;", "", "showTimeStamp", "", "setDayTimeStamp", "setMonthTimeStamp", "", "enable", "setAvgLineEnable", "key", "Lcom/huami/chart/util/Index;", "index", "saveDayIndex", "getDayIndex", "saveWeekIndex", "getWeekIndex", "saveMonthIndex", "getMonthIndex", "saveYearIndex", "getYearIndex", "loadLastData", "loadResearch", "loadExpireDialog", "", "deviceId", "setDialogNoMore", "Lcom/huami/bloodpressure_ui/usercase/BloodPressureLogicRepoUserCase;", "a", "Lcom/huami/bloodpressure_ui/usercase/BloodPressureLogicRepoUserCase;", "iBloodPressureLogicRepo", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "_currentDayTimeStamp", "c", "getCurrentDayTimeStamp", "()Landroidx/lifecycle/MutableLiveData;", "currentDayTimeStamp", GoogleApiAvailabilityLight.a, "_currentMonthTimeStamp", "e", "getCurrentMonthTimeStamp", "currentMonthTimeStamp", "f", "_lastDataTimeStamp", "g", "getLastDataTimeStamp", "lastDataTimeStamp", "h", "get_avgLineEnable", "set_avgLineEnable", "(Landroidx/lifecycle/MutableLiveData;)V", "_avgLineEnable", "i", "getAvgLineEnable", "avgLineEnable", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", z.j, "Ljava/util/HashMap;", "_dayIndexMap", hl.k, "_weekIndexMap", "l", "_monthIndexMap", "m", "_yearIndexMap", "Lcom/huami/bloodpressure_core/dc/research/BloodPressureResearchVo;", GoogleApiAvailabilityLight.b, "_researchResult", "o", "getResearchEntity", "researchEntity", "Lcom/huami/bloodpressure_core/dc/research/IResearchApi;", com.google.android.exoplayer2.text.ttml.b.r, "Lkotlin/Lazy;", "()Lcom/huami/bloodpressure_core/dc/research/IResearchApi;", "bpResearchApi", "Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", DTransferConstants.SEARCH_KEY, "()Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", "mResearchConfig", "Lcom/huami/bloodpressure_ui/expire/BloodPressureExpireDialogLogic;", "r", "()Lcom/huami/bloodpressure_ui/expire/BloodPressureExpireDialogLogic;", "mExpireDialogLogic", "Lkotlinx/coroutines/channels/Channel;", SOAP.XMLNS, "Lkotlinx/coroutines/channels/Channel;", "_mDialogSharedFlow", "Landroidx/lifecycle/LiveData;", "t", "Landroidx/lifecycle/LiveData;", "getMDialogSharedFlow", "()Landroidx/lifecycle/LiveData;", "mDialogSharedFlow", "<init>", "(Lcom/huami/bloodpressure_ui/usercase/BloodPressureLogicRepoUserCase;)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BloodPressureLogicRepoUserCase iBloodPressureLogicRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> _currentDayTimeStamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> currentDayTimeStamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> _currentMonthTimeStamp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> currentMonthTimeStamp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> _lastDataTimeStamp;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> lastDataTimeStamp;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Boolean> _avgLineEnable;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> avgLineEnable;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final HashMap<Long, Index> _dayIndexMap;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final HashMap<Long, Index> _weekIndexMap;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final HashMap<Long, Index> _monthIndexMap;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final HashMap<Long, Index> _yearIndexMap;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BloodPressureResearchVo> _researchResult;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BloodPressureResearchVo> researchEntity;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final Lazy bpResearchApi;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final Lazy mResearchConfig;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final Lazy mExpireDialogLogic;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final Channel<String> _mDialogSharedFlow;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> mDialogSharedFlow;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodpressure_core/dc/research/IResearchApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<IResearchApi> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IResearchApi getA() {
            return (IResearchApi) KoinExKt.bloodPressureScope(KoinExKt.bloodPressureScope().getKoin()).get(Reflection.getOrCreateKotlinClass(IResearchApi.class), null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/bloodpressure/service/BloodPressureExpireVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_ui.BloodPressureViewModel$loadExpireDialog$1", f = "BloodPressureViewModel.kt", i = {0}, l = {172}, m = "invokeSuspend", n = {"bloodPressureExpireVo"}, s = {"L$1"})
    public static final class b extends SuspendLambda implements Function2<BloodPressureExpireVo, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public /* synthetic */ Object c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ BloodPressureExpireVo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BloodPressureExpireVo bloodPressureExpireVo) {
                super(0);
                this.a = bloodPressureExpireVo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "loadExpireDialog " + this.a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable BloodPressureExpireVo bloodPressureExpireVo, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(bloodPressureExpireVo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = BloodPressureViewModel.this.new b(continuation);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            BloodPressureViewModel bloodPressureViewModel;
            BloodPressureExpireVo bloodPressureExpireVo;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BloodPressureExpireVo bloodPressureExpireVo2 = (BloodPressureExpireVo) this.c;
                HMLog.info(BloodPressureConst.INSTANCE.getTAG(), new a(bloodPressureExpireVo2));
                if (bloodPressureExpireVo2 != null) {
                    bloodPressureViewModel = BloodPressureViewModel.this;
                    if (bloodPressureExpireVo2.getExpire()) {
                        Channel channel = bloodPressureViewModel._mDialogSharedFlow;
                        String deviceId = bloodPressureExpireVo2.getDeviceId();
                        this.c = bloodPressureViewModel;
                        this.a = bloodPressureExpireVo2;
                        this.b = 1;
                        if (channel.send(deviceId, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        bloodPressureExpireVo = bloodPressureExpireVo2;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bloodPressureExpireVo = (BloodPressureExpireVo) this.a;
            bloodPressureViewModel = (BloodPressureViewModel) this.c;
            ResultKt.throwOnFailure(obj);
            bloodPressureViewModel.b().setDayDialog(bloodPressureExpireVo.getDeviceId());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/bloodpressure/service/BloodPressureExpireVo;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_ui.BloodPressureViewModel$loadExpireDialog$2", f = "BloodPressureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function3<FlowCollector<? super BloodPressureExpireVo>, Throwable, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "loadExpireDialog error " + this.a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super BloodPressureExpireVo> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            c cVar = new c(continuation);
            cVar.b = th;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.info(BloodPressureConst.INSTANCE.getTAG(), new a((Throwable) this.b));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_ui.BloodPressureViewModel$loadLastData$1", f = "BloodPressureViewModel.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureViewModel.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData mutableLiveData2 = BloodPressureViewModel.this._lastDataTimeStamp;
                BloodPressureLogicRepoUserCase bloodPressureLogicRepoUserCase = BloodPressureViewModel.this.iBloodPressureLogicRepo;
                this.a = mutableLiveData2;
                this.b = 1;
                Object maxTimeByUserId = bloodPressureLogicRepoUserCase.getMaxTimeByUserId(this);
                if (maxTimeByUserId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = mutableLiveData2;
                obj = maxTimeByUserId;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = (MutableLiveData) this.a;
                ResultKt.throwOnFailure(obj);
            }
            mutableLiveData.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/bloodpressure_core/dc/research/BloodPressureResearchVo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_ui.BloodPressureViewModel$loadResearch$1", f = "BloodPressureViewModel.kt", i = {}, l = {142, 142}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<FlowCollector<? super BloodPressureResearchVo>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            e eVar = BloodPressureViewModel.this.new e(continuation);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super BloodPressureResearchVo> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.b;
            IResearchApi iResearchApiA = BloodPressureViewModel.this.a();
            this.b = flowCollector;
            this.a = 1;
            obj = iResearchApiA.getResearch("2", this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.b = null;
            this.a = 2;
            if (flowCollector.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/bloodpressure_core/dc/research/BloodPressureResearchVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_ui.BloodPressureViewModel$loadResearch$2", f = "BloodPressureViewModel.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<BloodPressureResearchVo, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ BloodPressureResearchVo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BloodPressureResearchVo bloodPressureResearchVo) {
                super(0);
                this.a = bloodPressureResearchVo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "loadResearchResult " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bloodpressure_ui.BloodPressureViewModel$loadResearch$2$2", f = "BloodPressureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ BloodPressureViewModel b;
            public final /* synthetic */ BloodPressureResearchVo c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(BloodPressureViewModel bloodPressureViewModel, BloodPressureResearchVo bloodPressureResearchVo, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = bloodPressureViewModel;
                this.c = bloodPressureResearchVo;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, this.c, continuation);
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
                this.b._researchResult.postValue(this.c);
                return Unit.INSTANCE;
            }
        }

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable BloodPressureResearchVo bloodPressureResearchVo, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(bloodPressureResearchVo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            f fVar = BloodPressureViewModel.this.new f(continuation);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BloodPressureResearchVo bloodPressureResearchVo = (BloodPressureResearchVo) this.b;
                HMLog.info(BloodPressureConst.INSTANCE.getTAG(), new a(bloodPressureResearchVo));
                MainCoroutineDispatcher main = Dispatchers.getMain();
                b bVar = new b(BloodPressureViewModel.this, bloodPressureResearchVo, null);
                this.a = 1;
                if (BuildersKt.withContext(main, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/bloodpressure_core/dc/research/BloodPressureResearchVo;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_ui.BloodPressureViewModel$loadResearch$3", f = "BloodPressureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function3<FlowCollector<? super BloodPressureResearchVo>, Throwable, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "loadResearch " + this.a;
            }
        }

        public g(Continuation<? super g> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super BloodPressureResearchVo> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            g gVar = new g(continuation);
            gVar.b = th;
            return gVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.info(BloodPressureConst.INSTANCE.getTAG(), new a((Throwable) this.b));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodpressure_ui/expire/BloodPressureExpireDialogLogic;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<BloodPressureExpireDialogLogic> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BloodPressureExpireDialogLogic getA() {
            return new BloodPressureExpireDialogLogic((ISharedPref) KoinExKt.bloodPressureScope(KoinExKt.bloodPressureScope().getKoin()).get(Reflection.getOrCreateKotlinClass(ISharedPref.class), null, null), (IBloodPressureExpireService) KoinExKt.bloodPressureScope(KoinExKt.bloodPressureScope().getKoin()).get(Reflection.getOrCreateKotlinClass(IBloodPressureExpireService.class), null, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<IBPResearchConfig> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IBPResearchConfig getA() {
            return (IBPResearchConfig) KoinExKt.bloodPressureScope(KoinExKt.bloodPressureScope().getKoin()).get(Reflection.getOrCreateKotlinClass(IBPResearchConfig.class), null, null);
        }
    }

    public BloodPressureViewModel(@NotNull BloodPressureLogicRepoUserCase bloodPressureLogicRepoUserCase) {
        this.iBloodPressureLogicRepo = bloodPressureLogicRepoUserCase;
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>();
        this._currentDayTimeStamp = mutableLiveData;
        this.currentDayTimeStamp = mutableLiveData;
        MutableLiveData<Long> mutableLiveData2 = new MutableLiveData<>();
        this._currentMonthTimeStamp = mutableLiveData2;
        this.currentMonthTimeStamp = mutableLiveData2;
        MutableLiveData<Long> mutableLiveData3 = new MutableLiveData<>();
        this._lastDataTimeStamp = mutableLiveData3;
        this.lastDataTimeStamp = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>(Boolean.FALSE);
        this._avgLineEnable = mutableLiveData4;
        this.avgLineEnable = mutableLiveData4;
        this._dayIndexMap = new HashMap<>();
        this._weekIndexMap = new HashMap<>();
        this._monthIndexMap = new HashMap<>();
        this._yearIndexMap = new HashMap<>();
        MutableLiveData<BloodPressureResearchVo> mutableLiveData5 = new MutableLiveData<>();
        this._researchResult = mutableLiveData5;
        this.researchEntity = mutableLiveData5;
        this.bpResearchApi = LazyKt__LazyJVMKt.lazy(a.a);
        this.mResearchConfig = LazyKt__LazyJVMKt.lazy(i.a);
        this.mExpireDialogLogic = LazyKt__LazyJVMKt.lazy(h.a);
        Channel<String> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this._mDialogSharedFlow = channelChannel$default;
        this.mDialogSharedFlow = FlowLiveDataConversions.asLiveData$default(FlowKt.receiveAsFlow(channelChannel$default), ViewModelKt.getViewModelScope(this).getCoroutineContext().plus(Dispatchers.getMain()), 0L, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IResearchApi a() {
        return (IResearchApi) this.bpResearchApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BloodPressureExpireDialogLogic b() {
        return (BloodPressureExpireDialogLogic) this.mExpireDialogLogic.getValue();
    }

    private final IBPResearchConfig c() {
        return (IBPResearchConfig) this.mResearchConfig.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getAvgLineEnable() {
        return this.avgLineEnable;
    }

    @NotNull
    public final MutableLiveData<Long> getCurrentDayTimeStamp() {
        return this.currentDayTimeStamp;
    }

    @NotNull
    public final MutableLiveData<Long> getCurrentMonthTimeStamp() {
        return this.currentMonthTimeStamp;
    }

    @Nullable
    public final Index getDayIndex(long key) {
        return this._dayIndexMap.get(Long.valueOf(key));
    }

    @NotNull
    public final MutableLiveData<Long> getLastDataTimeStamp() {
        return this.lastDataTimeStamp;
    }

    @NotNull
    public final LiveData<String> getMDialogSharedFlow() {
        return this.mDialogSharedFlow;
    }

    @Nullable
    public final Index getMonthIndex(long key) {
        return this._monthIndexMap.get(Long.valueOf(key));
    }

    @NotNull
    public final MutableLiveData<BloodPressureResearchVo> getResearchEntity() {
        return this.researchEntity;
    }

    @Nullable
    public final Index getWeekIndex(long key) {
        return this._weekIndexMap.get(Long.valueOf(key));
    }

    @Nullable
    public final Index getYearIndex(long key) {
        return this._yearIndexMap.get(Long.valueOf(key));
    }

    @NotNull
    public final MutableLiveData<Boolean> get_avgLineEnable() {
        return this._avgLineEnable;
    }

    public final void loadExpireDialog() {
        if (c().researchEnable()) {
            FlowKt.launchIn(FlowKt.m4456catch(FlowKt.onEach(b().getDeviceExpireState(), new b(null)), new c(null)), ViewModelKt.getViewModelScope(this));
        }
    }

    public final void loadLastData() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new d(null), 3, null);
    }

    public final void loadResearch() {
        if (c().onResearchCardEnabled()) {
            FlowKt.launchIn(FlowKt.m4456catch(FlowKt.flowOn(FlowKt.onEach(FlowKt.flow(new e(null)), new f(null)), Dispatchers.getIO()), new g(null)), ViewModelKt.getViewModelScope(this));
        }
    }

    public final void saveDayIndex(long key, @NotNull Index index) {
        this._dayIndexMap.put(Long.valueOf(key), index);
    }

    public final void saveMonthIndex(long key, @NotNull Index index) {
        this._monthIndexMap.put(Long.valueOf(key), index);
    }

    public final void saveWeekIndex(long key, @NotNull Index index) {
        this._weekIndexMap.put(Long.valueOf(key), index);
    }

    public final void saveYearIndex(long key, @NotNull Index index) {
        this._yearIndexMap.put(Long.valueOf(key), index);
    }

    public final void setAvgLineEnable(boolean enable) {
        this._avgLineEnable.postValue(Boolean.valueOf(enable));
    }

    public final void setDayTimeStamp(long showTimeStamp) {
        this._currentDayTimeStamp.postValue(Long.valueOf(showTimeStamp));
    }

    public final void setDialogNoMore(@NotNull String deviceId) {
        b().setLocalNoMoreShowState(deviceId, true);
    }

    public final void setMonthTimeStamp(long showTimeStamp) {
        this._currentMonthTimeStamp.postValue(Long.valueOf(showTimeStamp));
    }

    public final void set_avgLineEnable(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        this._avgLineEnable = mutableLiveData;
    }
}
