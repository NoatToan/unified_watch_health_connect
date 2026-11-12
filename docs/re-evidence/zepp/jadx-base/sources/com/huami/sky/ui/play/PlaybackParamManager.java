package com.huami.sky.ui.play;

import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.sky.lib.repo.SkyAppSettingRepo;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\bB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0013\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0010\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/sky/ui/play/PlaybackParamManager;", "Lorg/koin/core/component/KoinComponent;", "", "advanceReq", "", "", "fadeInOut", "", "a", "", "getPlaybackParam", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sky/lib/repo/SkyAppSettingRepo;", "Lkotlin/Lazy;", "b", "()Lcom/huami/sky/lib/repo/SkyAppSettingRepo;", "skyAppSettingRepo", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huami/sky/ui/play/SkyPlaybackParam;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_playbackParamFlow", "Lkotlinx/coroutines/flow/StateFlow;", "c", "Lkotlinx/coroutines/flow/StateFlow;", "getPlaybackParamFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "playbackParamFlow", "<init>", "()V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class PlaybackParamManager implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final PlaybackParamManager d = a.a.a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy skyAppSettingRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableStateFlow<SkyPlaybackParam> _playbackParamFlow;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final StateFlow<SkyPlaybackParam> playbackParamFlow;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/sky/ui/play/PlaybackParamManager$Companion;", "", "Lcom/huami/sky/ui/play/PlaybackParamManager;", DefaultSettingsSpiCall.n, "Lcom/huami/sky/ui/play/PlaybackParamManager;", "getInstance", "()Lcom/huami/sky/ui/play/PlaybackParamManager;", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PlaybackParamManager getInstance() {
            return PlaybackParamManager.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"com/huami/sky/ui/play/PlaybackParamManager$a", "", "Lcom/huami/sky/ui/play/PlaybackParamManager;", "b", "Lcom/huami/sky/ui/play/PlaybackParamManager;", "a", "()Lcom/huami/sky/ui/play/PlaybackParamManager;", "holder", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        @NotNull
        public static final a a = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final PlaybackParamManager holder = new PlaybackParamManager();

        private a() {
        }

        @NotNull
        public final PlaybackParamManager a() {
            return holder;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.PlaybackParamManager$getPlaybackParam$2", f = "PlaybackParamManager.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<FlowCollector<? super String>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = PlaybackParamManager.this.new b(continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super String> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                String playbackParam = PlaybackParamManager.this.b().getPlaybackParam();
                if (playbackParam != null) {
                    this.a = 1;
                    if (flowCollector.emit(playbackParam, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "播放器控制参数解析失败：" + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlaybackParamManager() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.skyAppSettingRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<SkyAppSettingRepo>() { // from class: com.huami.sky.ui.play.PlaybackParamManager$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sky.lib.repo.SkyAppSettingRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SkyAppSettingRepo invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SkyAppSettingRepo.class), qualifier, objArr);
            }
        });
        MutableStateFlow<SkyPlaybackParam> MutableStateFlow = StateFlowKt.MutableStateFlow(new SkyPlaybackParam(0, 0, null, 7, null));
        this._playbackParamFlow = MutableStateFlow;
        this.playbackParamFlow = MutableStateFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(int advanceReq, List<Float> fadeInOut) {
        int size = fadeInOut.size();
        return advanceReq - size > 2 && size / 2 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SkyAppSettingRepo b() {
        return (SkyAppSettingRepo) this.skyAppSettingRepo.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Nullable
    public final Object getPlaybackParam(@NotNull Continuation<? super Unit> continuation) {
        Object objCollect = FlowKt.flowOn(FlowKt.flow(new b(null)), Dispatchers.getIO()).collect(new FlowCollector<String>() { // from class: com.huami.sky.ui.play.PlaybackParamManager$getPlaybackParam$$inlined$collect$1
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            public Object emit(String str, @NotNull Continuation<? super Unit> continuation2) {
                Object objM3845constructorimpl;
                String str2 = str;
                try {
                    Result.Companion companion = Result.Companion;
                    JSONObject jSONObject = new JSONObject(str2);
                    int i = jSONObject.getInt("advanceReq");
                    JSONArray jSONArray = jSONObject.getJSONArray("fadeInOut");
                    int length = jSONArray.length();
                    ArrayList arrayList = new ArrayList();
                    int i2 = 0;
                    if (length > 0) {
                        while (true) {
                            int i3 = i2 + 1;
                            arrayList.add(Boxing.boxFloat(Float.parseFloat(jSONArray.get(i2).toString())));
                            if (i3 >= length) {
                                break;
                            }
                            i2 = i3;
                        }
                    }
                    if (this.a.a(i, arrayList)) {
                        this.a._playbackParamFlow.setValue(new SkyPlaybackParam(i, arrayList.size() / 2, arrayList));
                    }
                    objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    HMLog.info("PlaybackParamManager", new PlaybackParamManager.c(thM3848exceptionOrNullimpl));
                }
                return objM3845constructorimpl == a.getCOROUTINE_SUSPENDED() ? objM3845constructorimpl : Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    @NotNull
    public final StateFlow<SkyPlaybackParam> getPlaybackParamFlow() {
        return this.playbackParamFlow;
    }
}
