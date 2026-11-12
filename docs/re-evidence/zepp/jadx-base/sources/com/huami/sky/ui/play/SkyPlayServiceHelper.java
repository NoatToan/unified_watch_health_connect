package com.huami.sky.ui.play;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.baseflow.permissionhandler.m;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.lib.constant.MusicPauseFrom;
import com.huami.sky.lib.constant.MusicPlayRecordEnum;
import com.huami.sky.lib.constant.UserActionEnum;
import com.huami.sky.lib.entity.MusicEntity;
import com.huami.sky.lib.entity.MusicPlayRecord;
import com.huami.sky.lib.entity.UserAction;
import com.huami.sky.lib.repo.DeviceDataRepository;
import com.huami.sky.lib.repo.settings.IPlaySettingRepo;
import com.huami.sky.lib.usecase.RecommendMusicUseCase;
import com.huami.sky.service.PlayState;
import com.huami.sky.ui.analytic.SkyPlayEventKt;
import com.huami.sky.ui.bean.MusicInfo;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.sky.ui.play.control.PlaybackManager;
import com.huami.sky.ui.service.SkyServiceHelperKt;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 _2\u00020\u0001:\u0001_B\u001f\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020'¢\u0006\u0004\b]\u0010^J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0007J\u0016\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002J\"\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\b\u0010\u0017\u001a\u00020\u0007H\u0007J\u000e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0007J\u0006\u0010\u001c\u001a\u00020\u0007J\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018R\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010,R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020.0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010>\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00020?8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00020C8\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0016\u0010K\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001c\u0010P\u001a\b\u0012\u0004\u0012\u00020M0L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001f\u0010V\u001a\b\u0012\u0004\u0012\u00020M0Q8\u0006@\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000e0Q8\u0006@\u0006¢\u0006\f\n\u0004\bW\u0010S\u001a\u0004\bX\u0010UR\u0016\u0010\\\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006`"}, d2 = {"Lcom/huami/sky/ui/play/SkyPlayServiceHelper;", "", "", "requestAction", "a", "(I)Ljava/lang/Integer;", "duration", "", "b", GoogleApiAvailabilityLight.a, "c", "e", "requestMusic", "uploadUserEvent", "", "musicId", "action", "updateUserAction", "Lcom/huami/sky/lib/constant/MusicPlayRecordEnum;", "playRecord", "Lcom/huami/sky/lib/constant/MusicPauseFrom;", "from", "updatePlayRecord", "observeMusicStop", "Lcom/huami/sky/service/PlayState;", "playState", "playStopTiming", "setPlayStart", "clear", "", "getDeviceStatusTipsShow", "updateDeviceStatusTipsShow", "updateSkyStartTime", "Lcom/huami/sky/lib/repo/DeviceDataRepository;", "Lcom/huami/sky/lib/repo/DeviceDataRepository;", "deviceRepo", "Lcom/huami/sky/lib/repo/settings/IPlaySettingRepo;", "Lcom/huami/sky/lib/repo/settings/IPlaySettingRepo;", "playSettingRepo", "Lcom/huami/sky/lib/usecase/RecommendMusicUseCase;", "Lcom/huami/sky/lib/usecase/RecommendMusicUseCase;", "recommendMusicUserCase", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/huami/sky/lib/entity/UserAction;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "userActionList", "Lcom/huami/sky/lib/entity/MusicPlayRecord;", "playRecordList", "Lkotlinx/coroutines/CoroutineScope;", "f", "Lkotlinx/coroutines/CoroutineScope;", "skyIOScope", "g", "skyMainScope", "Lkotlinx/coroutines/Job;", "h", "Lkotlinx/coroutines/Job;", "countDownJob", "i", "playStopCountDownJob", z.j, LogUtil.I, "playDuration", "Lkotlinx/coroutines/flow/MutableSharedFlow;", hl.k, "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_countDownTimeChangeFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "l", "Lkotlinx/coroutines/flow/SharedFlow;", "getCountDownTimeChangeFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "countDownTimeChangeFlow", "m", "Z", "deviceStateTipsShow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", GoogleApiAvailabilityLight.b, "Lkotlinx/coroutines/flow/MutableStateFlow;", "_playStartTimeFlow", "Lkotlinx/coroutines/flow/StateFlow;", "o", "Lkotlinx/coroutines/flow/StateFlow;", "getPlayStartTimeFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "playStartTimeFlow", com.google.android.exoplayer2.text.ttml.b.r, "getEventSessionId", "eventSessionId", DTransferConstants.SEARCH_KEY, "J", "requestNextMusicTime", "<init>", "(Lcom/huami/sky/lib/repo/DeviceDataRepository;Lcom/huami/sky/lib/repo/settings/IPlaySettingRepo;Lcom/huami/sky/lib/usecase/RecommendMusicUseCase;)V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyPlayServiceHelper {

    @NotNull
    private static final String r = "SkyPlayServiceHelper";
    private static final int s = 60;
    private static final long t = 1000;
    private static final long u = 30000;
    private static final long v = 600000;
    private static final long w = 1200000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceDataRepository deviceRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IPlaySettingRepo playSettingRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final RecommendMusicUseCase recommendMusicUserCase;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Job countDownJob;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Job playStopCountDownJob;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final MutableSharedFlow<Integer> _countDownTimeChangeFlow;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final SharedFlow<Integer> countDownTimeChangeFlow;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean deviceStateTipsShow;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final MutableStateFlow<Long> _playStartTimeFlow;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final StateFlow<Long> playStartTimeFlow;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final StateFlow<String> eventSessionId;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private long requestNextMusicTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private CopyOnWriteArrayList<UserAction> userActionList = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private CopyOnWriteArrayList<MusicPlayRecord> playRecordList = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private CoroutineScope skyIOScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private CoroutineScope skyMainScope = CoroutineScopeKt.MainScope();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int playDuration = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Long, String> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @NotNull
        public final String a(long j) {
            return j > 0 ? String.valueOf(j) : "";
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Long l) {
            return a(l.longValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayServiceHelper$observeMusicStop$1", f = "SkyPlayServiceHelper.kt", i = {}, l = {m.c}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"", "sleepState", "", "isSmartClose", "Lkotlin/Pair;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayServiceHelper$observeMusicStop$1$1", f = "SkyPlayServiceHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function3<Integer, Boolean, Continuation<? super Pair<? extends Integer, ? extends Boolean>>, Object> {
            public int a;
            public /* synthetic */ int b;
            public /* synthetic */ boolean c;

            public a(Continuation<? super a> continuation) {
                super(3, continuation);
            }

            @Nullable
            public final Object a(int i, boolean z, @Nullable Continuation<? super Pair<Integer, Boolean>> continuation) {
                a aVar = new a(continuation);
                aVar.b = i;
                aVar.c = z;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Integer num, Boolean bool, Continuation<? super Pair<? extends Integer, ? extends Boolean>> continuation) {
                return a(num.intValue(), bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return TuplesKt.to(Boxing.boxInt(this.b), Boxing.boxBoolean(this.c));
            }
        }

        /* JADX INFO: renamed from: com.huami.sky.ui.play.SkyPlayServiceHelper$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "", "", "", "cause", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayServiceHelper$observeMusicStop$1$2", f = "SkyPlayServiceHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0565b extends SuspendLambda implements Function3<FlowCollector<? super Pair<? extends Integer, ? extends Boolean>>, Throwable, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;

            /* JADX INFO: renamed from: com.huami.sky.ui.play.SkyPlayServiceHelper$b$b$a */
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
                public final String invoke() {
                    Throwable th = this.a;
                    return "SleepStateFlow 异常结束 " + (th == null ? null : th.getMessage());
                }
            }

            public C0565b(Continuation<? super C0565b> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull FlowCollector<? super Pair<Integer, Boolean>> flowCollector, @Nullable Throwable th, @Nullable Continuation<? super Unit> continuation) {
                C0565b c0565b = new C0565b(continuation);
                c0565b.b = th;
                return c0565b.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HMLog.info(SkyPlayServiceHelper.r, new a((Throwable) this.b));
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayServiceHelper$observeMusicStop$1$3", f = "SkyPlayServiceHelper.kt", i = {}, l = {213, FTPCodes.NAME_SYSTEM_TIME}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<Pair<? extends Integer, ? extends Boolean>, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ SkyPlayServiceHelper c;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Pair<Integer, Boolean> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Pair<Integer, Boolean> pair) {
                    super(0);
                    this.a = pair;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "检测到智能入睡提醒：" + this.a.getFirst() + ", " + this.a.getSecond();
                }
            }

            /* JADX INFO: renamed from: com.huami.sky.ui.play.SkyPlayServiceHelper$b$c$b, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0566b extends Lambda implements Function0<String> {
                public static final C0566b a = new C0566b();

                public C0566b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "stop music state=" + PlaybackManager.INSTANCE.getInstance().getPlayState();
                }
            }

            /* JADX INFO: renamed from: com.huami.sky.ui.play.SkyPlayServiceHelper$b$c$c, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayServiceHelper$observeMusicStop$1$3$3", f = "SkyPlayServiceHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0567c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ SkyPlayServiceHelper b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0567c(SkyPlayServiceHelper skyPlayServiceHelper, Continuation<? super C0567c> continuation) {
                    super(2, continuation);
                    this.b = skyPlayServiceHelper;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0567c(this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0567c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    PlaybackManager.Companion companion = PlaybackManager.INSTANCE;
                    if (companion.getInstance().getPlayState() != PlayState.IDLE) {
                        companion.getInstance().stop(MusicPauseFrom.SLEEP);
                        SkyPlayEventKt.recordEvent$default(SkyPlayEventKt.AIMUSIC_PLAYER_AUTOPAUSE_C, null, null, "0", this.b.getEventSessionId().getValue(), 6, null);
                        this.b.d();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SkyPlayServiceHelper skyPlayServiceHelper, Continuation<? super c> continuation) {
                super(2, continuation);
                this.c = skyPlayServiceHelper;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull Pair<Integer, Boolean> pair, @Nullable Continuation<? super Unit> continuation) {
                return ((c) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                c cVar = new c(this.c, continuation);
                cVar.b = obj;
                return cVar;
            }

            /* JADX WARN: Code duplicated, block: B:19:0x006c A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                MainCoroutineDispatcher main;
                C0567c c0567c;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.b;
                    HMLog.info(SkyPlayServiceHelper.r, new a(pair));
                    if (((Number) pair.getFirst()).intValue() == 0 && ((Boolean) pair.getSecond()).booleanValue()) {
                        this.a = 1;
                        if (DelayKt.delay(SkyPlayServiceHelper.w, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        HMLog.info(SkyPlayServiceHelper.r, C0566b.a);
                        main = Dispatchers.getMain();
                        c0567c = new C0567c(this.c, null);
                        this.a = 2;
                        if (BuildersKt.withContext(main, c0567c, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    HMLog.info(SkyPlayServiceHelper.r, C0566b.a);
                    main = Dispatchers.getMain();
                    c0567c = new C0567c(this.c, null);
                    this.a = 2;
                    if (BuildersKt.withContext(main, c0567c, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyPlayServiceHelper.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowOnCompletion = FlowKt.onCompletion(FlowKt.flowCombine(SkyPlayServiceHelper.this.deviceRepo.getSleepStateFlow(), SkyPlayServiceHelper.this.playSettingRepo.isSmartClose(), new a(null)), new C0565b(null));
                c cVar = new c(SkyPlayServiceHelper.this, null);
                this.a = 1;
                if (FlowKt.collectLatest(flowOnCompletion, cVar, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "request music action=" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayServiceHelper$requestMusic$2", f = "SkyPlayServiceHelper.kt", i = {1}, l = {95, 105}, m = "invokeSuspend", n = {"musicEntity"}, s = {"L$0"})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ int d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, boolean z) {
                super(0);
                this.a = i;
                this.b = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "request music action=" + this.a + ", relaunch: " + this.b;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayServiceHelper$requestMusic$2$2", f = "SkyPlayServiceHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, continuation);
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
                int i = this.b;
                if (i == 1) {
                    PlaybackManager.INSTANCE.getInstance().play();
                } else if (i == 2) {
                    PlaybackManager.INSTANCE.getInstance().playNextMusic();
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ MusicEntity a;
            public final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(MusicEntity musicEntity, int i) {
                super(0);
                this.a = musicEntity;
                this.b = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "request music " + this.a + " action=" + this.b;
            }
        }

        /* JADX INFO: renamed from: com.huami.sky.ui.play.SkyPlayServiceHelper$d$d, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0568d extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0568d(int i) {
                super(0);
                this.a = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "request music error action=" + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, Continuation<? super d> continuation) {
            super(2, continuation);
            this.d = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyPlayServiceHelper.this.new d(this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objExecute;
            MusicEntity musicEntity;
            MusicEntity musicEntity2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            try {
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        objExecute = obj;
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        musicEntity2 = (MusicEntity) this.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    musicEntity = musicEntity2;
                    HMLog.info(SkyPlayServiceHelper.r, new c(musicEntity, this.d));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                boolean z = !PlaybackManager.INSTANCE.getInstance().musicListNotEmpty();
                HMLog.info(SkyPlayServiceHelper.r, new a(this.d, z));
                RecommendMusicUseCase recommendMusicUseCase = SkyPlayServiceHelper.this.recommendMusicUserCase;
                boolean z2 = z;
                Integer numA = SkyPlayServiceHelper.this.a(this.d);
                this.b = 1;
                objExecute = recommendMusicUseCase.execute(z2, numA, this);
                if (objExecute == coroutine_suspended) {
                    return coroutine_suspended;
                }
                musicEntity = (MusicEntity) objExecute;
                if (musicEntity != null) {
                    PlaybackManager.INSTANCE.getInstance().updateMusicList(new MusicInfo(musicEntity.getMusicClip().getClipId(), musicEntity.getMusicClip().getUrl(), musicEntity.getAnimationUrl(), false, 0, 0, musicEntity.getTags(), 56, null));
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    b bVar = new b(this.d, null);
                    this.a = musicEntity;
                    this.b = 2;
                    if (BuildersKt.withContext(main, bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    musicEntity2 = musicEntity;
                    musicEntity = musicEntity2;
                } else {
                    if (this.d != 0) {
                        PlaybackManager.INSTANCE.getInstance().updatePlayState(PlayState.ERROR);
                    }
                    SkyPlayEventKt.recordPlayError("1");
                }
                HMLog.info(SkyPlayServiceHelper.r, new c(musicEntity, this.d));
            } catch (Exception e) {
                e.printStackTrace();
                if (this.d != 0) {
                    PlaybackManager.INSTANCE.getInstance().updatePlayState(PlayState.ERROR);
                }
                SkyPlayEventKt.recordPlayError("1");
                HMLog.info(SkyPlayServiceHelper.r, new C0568d(this.d));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            Job job = SkyPlayServiceHelper.this.countDownJob;
            return "开始播放：" + (job == null ? null : Boolean.valueOf(job.isActive())) + ", " + SkyPlayServiceHelper.this.playDuration;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayServiceHelper$startCountDown$1", f = "SkyPlayServiceHelper.kt", i = {}, l = {276, 277, 279}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ SkyPlayServiceHelper d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayServiceHelper$startCountDown$1$1", f = "SkyPlayServiceHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SkyPlayServiceHelper b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SkyPlayServiceHelper skyPlayServiceHelper, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = skyPlayServiceHelper;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
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
                PlaybackManager.INSTANCE.getInstance().stop(MusicPauseFrom.TIMING);
                SkyPlayEventKt.recordEvent$default(SkyPlayEventKt.AIMUSIC_PLAYER_AUTOPAUSE_C, null, null, "1", this.b.getEventSessionId().getValue(), 6, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i, SkyPlayServiceHelper skyPlayServiceHelper, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = skyPlayServiceHelper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            if (r9 >= 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        
            r5 = r9 - 1;
            r6 = r1.d._countDownTimeChangeFlow;
            r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r9);
            r1.a = r5;
            r1.b = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        
            if (r6.emit(r9, r1) != r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
        
            if (r9 < 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
        
            r9 = kotlinx.coroutines.Dispatchers.getMain();
            r3 = new com.huami.sky.ui.play.SkyPlayServiceHelper.f.a(r1.d, null);
            r1.b = 3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r9, r3, r1) != r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
        
            return r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0059 -> B:21:0x005a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            int i;
            f fVar;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = this.b;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                i = this.c;
                fVar = this;
            } else if (i2 == 1) {
                int i3 = this.a;
                ResultKt.throwOnFailure(obj);
                int i4 = i3;
                fVar = this;
                fVar.a = i4;
                fVar.b = 2;
                if (DelayKt.delay(1000L, fVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = i4;
            } else if (i2 == 2) {
                int i5 = this.a;
                ResultKt.throwOnFailure(obj);
                i = i5;
                fVar = this;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayServiceHelper$startPlayStopCountDown$1", f = "SkyPlayServiceHelper.kt", i = {}, l = {298, 299}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayServiceHelper$startPlayStopCountDown$1$1", f = "SkyPlayServiceHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(continuation);
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
                PlaybackManager.INSTANCE.getInstance().clearData();
                return Unit.INSTANCE;
            }
        }

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
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
            this.a = 1;
            if (DelayKt.delay(600000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            a aVar = new a(null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayServiceHelper$updateSkyStartTime$1", f = "SkyPlayServiceHelper.kt", i = {1}, l = {336, 341}, m = "invokeSuspend", n = {"startTime"}, s = {"J$0"})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public long a;
        public int b;
        public final /* synthetic */ PlayState c;
        public final /* synthetic */ SkyPlayServiceHelper d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ PlayState a;
            public final /* synthetic */ SkyPlayServiceHelper b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlayState playState, SkyPlayServiceHelper skyPlayServiceHelper) {
                super(0);
                this.a = playState;
                this.b = skyPlayServiceHelper;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "播放器：一次播放记录开始时间: " + this.a + ",  " + this.b._playStartTimeFlow.getValue();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "播放器：一次播放记录开始时间: -1L";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ long a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(long j) {
                super(0);
                this.a = j;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "播放器：一次播放记录开始时间: " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(PlayState playState, SkyPlayServiceHelper skyPlayServiceHelper, Continuation<? super h> continuation) {
            super(2, continuation);
            this.c = playState;
            this.d = skyPlayServiceHelper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            long j;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMLog.info(SkyPlayServiceHelper.r, new a(this.c, this.d));
                PlayState playState = this.c;
                if (playState == PlayState.IDLE) {
                    MutableStateFlow mutableStateFlow = this.d._playStartTimeFlow;
                    Long lBoxLong = Boxing.boxLong(-1L);
                    this.b = 1;
                    if (mutableStateFlow.emit(lBoxLong, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HMLog.info(SkyPlayServiceHelper.r, b.a);
                } else if (playState == PlayState.PLAYING && ((Number) this.d._playStartTimeFlow.getValue()).longValue() < 0) {
                    this.d.deviceStateTipsShow = true;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    MutableStateFlow mutableStateFlow2 = this.d._playStartTimeFlow;
                    Long lBoxLong2 = Boxing.boxLong(jCurrentTimeMillis);
                    this.a = jCurrentTimeMillis;
                    this.b = 2;
                    if (mutableStateFlow2.emit(lBoxLong2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j = jCurrentTimeMillis;
                    HMLog.info(SkyPlayServiceHelper.r, new c(j));
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                HMLog.info(SkyPlayServiceHelper.r, b.a);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.a;
                ResultKt.throwOnFailure(obj);
                HMLog.info(SkyPlayServiceHelper.r, new c(j));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayServiceHelper$uploadUserEvent$1", f = "SkyPlayServiceHelper.kt", i = {0}, l = {162}, m = "invokeSuspend", n = {"recordList"}, s = {"L$1"})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public Object b;
        public Object c;
        public int d;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyPlayServiceHelper.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int i;
            List list;
            List list2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = this.d;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MusicPlayRecord musicPlayRecord = (MusicPlayRecord) CollectionsKt.lastOrNull((List) SkyPlayServiceHelper.this.playRecordList);
                    int i3 = (musicPlayRecord == null ? null : musicPlayRecord.getStatus()) == MusicPlayRecordEnum.END ? 1 : 0;
                    ArrayList arrayList = new ArrayList();
                    SkyPlayServiceHelper skyPlayServiceHelper = SkyPlayServiceHelper.this;
                    if (i3 != 0) {
                        arrayList.addAll(skyPlayServiceHelper.userActionList);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(SkyPlayServiceHelper.this.playRecordList);
                    DeviceDataRepository deviceDataRepository = SkyPlayServiceHelper.this.deviceRepo;
                    this.b = arrayList;
                    this.c = arrayList2;
                    this.a = i3;
                    this.d = 1;
                    Object objUploadDeviceData = deviceDataRepository.uploadDeviceData(arrayList, arrayList2, null, null, this);
                    if (objUploadDeviceData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = i3;
                    obj = objUploadDeviceData;
                    list = arrayList;
                    list2 = arrayList2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.a;
                    list2 = (List) this.c;
                    list = (List) this.b;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    if (i != 0) {
                        SkyPlayServiceHelper.this.userActionList.removeAll(list);
                    }
                    SkyPlayServiceHelper.this.playRecordList.removeAll(list2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.huami.sky.ui.play.SkyPlayServiceHelper$observeMusicStop$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayServiceHelper$observeMusicStop$2", f = "SkyPlayServiceHelper.kt", i = {}, l = {371}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.sky.ui.play.SkyPlayServiceHelper$observeMusicStop$2$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i) {
                super(0);
                this.a = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "设置定时停止时间：" + this.a;
            }
        }

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyPlayServiceHelper.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Integer> playDuration = SkyPlayServiceHelper.this.playSettingRepo.getPlayDuration();
                final SkyPlayServiceHelper skyPlayServiceHelper = SkyPlayServiceHelper.this;
                FlowCollector<Integer> flowCollector = new FlowCollector<Integer>() { // from class: com.huami.sky.ui.play.SkyPlayServiceHelper$observeMusicStop$2$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(Integer num, @NotNull Continuation<? super Unit> continuation) {
                        int iIntValue = num.intValue();
                        int i2 = iIntValue * 60;
                        skyPlayServiceHelper.playDuration = i2;
                        HMLog.info("SkyPlayServiceHelper", new SkyPlayServiceHelper.AnonymousClass2.a(iIntValue));
                        if (iIntValue > 0) {
                            PlayState playState = SkyServiceHelperKt.getSkyService().getPlayState();
                            if (playState != PlayState.IDLE && playState != PlayState.ERROR) {
                                skyPlayServiceHelper.b(i2);
                            }
                        } else {
                            skyPlayServiceHelper.d();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.a = 1;
                if (playDuration.collect(flowCollector, this) == coroutine_suspended) {
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

    public SkyPlayServiceHelper(@NotNull DeviceDataRepository deviceDataRepository, @NotNull IPlaySettingRepo iPlaySettingRepo, @NotNull RecommendMusicUseCase recommendMusicUseCase) {
        this.deviceRepo = deviceDataRepository;
        this.playSettingRepo = iPlaySettingRepo;
        this.recommendMusicUserCase = recommendMusicUseCase;
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._countDownTimeChangeFlow = mutableSharedFlowMutableSharedFlow$default;
        this.countDownTimeChangeFlow = mutableSharedFlowMutableSharedFlow$default;
        MutableStateFlow<Long> MutableStateFlow = StateFlowKt.MutableStateFlow(-1L);
        this._playStartTimeFlow = MutableStateFlow;
        this.playStartTimeFlow = MutableStateFlow;
        this.eventSessionId = SkyExtKt.map(MutableStateFlow, this.skyIOScope, a.a);
        this.requestNextMusicTime = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer a(int requestAction) {
        if (requestAction != 2) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.requestNextMusicTime;
        this.requestNextMusicTime = System.currentTimeMillis();
        return jCurrentTimeMillis < 30000 ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int duration) {
        Job job = this.countDownJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.countDownJob = kotlinx.coroutines.e.f(this.skyIOScope, null, null, new f(duration, this, null), 3, null);
    }

    private final void c() {
        Job job = this.playStopCountDownJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.playStopCountDownJob = kotlinx.coroutines.e.f(this.skyIOScope, null, null, new g(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        Job job = this.countDownJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.countDownJob = null;
    }

    private final void e() {
        Job job = this.playStopCountDownJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.playStopCountDownJob = null;
    }

    public static /* synthetic */ void requestMusic$default(SkyPlayServiceHelper skyPlayServiceHelper, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        skyPlayServiceHelper.requestMusic(i2);
    }

    public static /* synthetic */ void updatePlayRecord$default(SkyPlayServiceHelper skyPlayServiceHelper, String str, MusicPlayRecordEnum musicPlayRecordEnum, MusicPauseFrom musicPauseFrom, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            musicPauseFrom = null;
        }
        skyPlayServiceHelper.updatePlayRecord(str, musicPlayRecordEnum, musicPauseFrom);
    }

    public final void clear() {
        updateSkyStartTime(PlayState.IDLE);
        this.deviceStateTipsShow = false;
        d();
        e();
        this.userActionList.clear();
        this.playRecordList.clear();
        CoroutineScopeKt.cancel$default(this.skyIOScope, null, 1, null);
        CoroutineScopeKt.cancel$default(this.skyMainScope, null, 1, null);
    }

    @NotNull
    public final SharedFlow<Integer> getCountDownTimeChangeFlow() {
        return this.countDownTimeChangeFlow;
    }

    /* JADX INFO: renamed from: getDeviceStatusTipsShow, reason: from getter */
    public final boolean getDeviceStateTipsShow() {
        return this.deviceStateTipsShow;
    }

    @NotNull
    public final StateFlow<String> getEventSessionId() {
        return this.eventSessionId;
    }

    @NotNull
    public final StateFlow<Long> getPlayStartTimeFlow() {
        return this.playStartTimeFlow;
    }

    @FlowPreview
    public final void observeMusicStop() {
        kotlinx.coroutines.e.f(this.skyIOScope, null, null, new b(null), 3, null);
        kotlinx.coroutines.e.f(this.skyIOScope, null, null, new AnonymousClass2(null), 3, null);
    }

    public final void playStopTiming(@NotNull PlayState playState) {
        if (playState == PlayState.PAUSE) {
            c();
        } else {
            e();
        }
    }

    public final void requestMusic(int requestAction) {
        HMLog.info(r, new c(requestAction));
        kotlinx.coroutines.e.f(this.skyIOScope, null, null, new d(requestAction, null), 3, null);
    }

    public final void setPlayStart() {
        int i2;
        HMLog.info(r, new e());
        Job job = this.countDownJob;
        boolean z = false;
        if (job != null && job.isActive()) {
            z = true;
        }
        if (z || (i2 = this.playDuration) <= 0) {
            return;
        }
        b(i2);
    }

    public final void updateDeviceStatusTipsShow() {
        this.deviceStateTipsShow = false;
    }

    public final void updatePlayRecord(@NotNull String musicId, @NotNull MusicPlayRecordEnum playRecord, @Nullable MusicPauseFrom from) {
        this.playRecordList.add(new MusicPlayRecord(musicId, playRecord, System.currentTimeMillis(), from));
    }

    public final void updateSkyStartTime(@NotNull PlayState playState) {
        kotlinx.coroutines.e.f(this.skyMainScope, null, null, new h(playState, this, null), 3, null);
    }

    public final void updateUserAction(@NotNull String musicId, int action) {
        Object next;
        Iterator<T> it2 = this.userActionList.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.areEqual(((UserAction) next).getId(), musicId));
        UserAction userAction = (UserAction) next;
        if (userAction != null && action == 0) {
            this.userActionList.remove(userAction);
        }
        if (action == 1) {
            this.userActionList.add(new UserAction(musicId, UserActionEnum.LIKE, System.currentTimeMillis()));
        } else {
            if (action != 2) {
                return;
            }
            this.userActionList.add(new UserAction(musicId, UserActionEnum.SKIP, System.currentTimeMillis()));
        }
    }

    public final void uploadUserEvent() {
        kotlinx.coroutines.e.f(this.skyIOScope, null, null, new i(null), 3, null);
    }
}
