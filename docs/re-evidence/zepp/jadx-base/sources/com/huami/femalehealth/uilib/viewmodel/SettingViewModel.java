package com.huami.femalehealth.uilib.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.device.DeviceCallback;
import com.huami.femalehealth.logiclib.device.MenstruationDataManager;
import com.huami.femalehealth.logiclib.dto.MenstruationConfigDto;
import com.huami.femalehealth.logiclib.dto.MenstruationTotalDto;
import com.huami.femalehealth.logiclib.event.EventFHSettingChanged;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.repo.MenstruationRepo;
import com.huami.femalehealth.logiclib.repo.SettingRepo;
import com.huami.femalehealth.logiclib.vo.SettingVo;
import com.huami.femalehealth.uilib.viewmodel.SettingViewModel;
import com.huami.tools.log.HMLog;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.loc.z;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import de.greenrobot.event.EventBus;
import java.util.Date;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 Z2\u00020\u0001:\u0001ZB\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010-\u001a\u00020+¢\u0006\u0004\bX\u0010YJ\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0002J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0004J0\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u0014J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0004J&\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010 \u001a\u00020\u001dJ\u0006\u0010!\u001a\u00020\fJ\u0006\u0010\"\u001a\u00020\u001dR\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R(\u00105\u001a\b\u0012\u0004\u0012\u00020\u001d0.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00100\u001a\u0004\b<\u00102\"\u0004\b=\u00104R(\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00100\u001a\u0004\b@\u00102\"\u0004\bA\u00104R\u0016\u0010E\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010I\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR%\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR0\u0010Q\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b O*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00030\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010KR%\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\bR\u0010K\u001a\u0004\bS\u0010MR\u001f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001d0.8\u0006@\u0006¢\u0006\f\n\u0004\bU\u00100\u001a\u0004\bV\u00102¨\u0006["}, d2 = {"Lcom/huami/femalehealth/uilib/viewmodel/SettingViewModel;", "Lcom/huami/femalehealth/uilib/viewmodel/FHBaseViewModel;", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "Lcom/huami/femalehealth/logiclib/vo/SettingVo;", "f", "settingVo", "keep", "Lcom/huami/femalehealth/logiclib/repo/SettingRepo$SettingResult;", "i", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "", "onCreate", "onDestroy", "refreshSetting", "setSettingRequireNet", "setSettingRequireDevConnect", "Lkotlin/Function0;", "succeedCallBack", "Lkotlin/Function1;", "failedCallBack", "setSettingRequireDevSupport", "keepSetting", "", "periodLen", "cycleLen", "", "lastMenstruationTime", "", "enablePredict", "setInitSetting", "isFirstTimeLocal", "refreshPeriodSettings", "isCurrentDeviceNotSupport", "Lcom/huami/femalehealth/logiclib/repo/SettingRepo;", GoogleApiAvailabilityLight.a, "Lcom/huami/femalehealth/logiclib/repo/SettingRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;", "e", "Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;", "menstruationRepo", "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;", "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;", "manager", "Landroidx/lifecycle/MutableLiveData;", "g", "Landroidx/lifecycle/MutableLiveData;", "getTrigger", "()Landroidx/lifecycle/MutableLiveData;", "setTrigger", "(Landroidx/lifecycle/MutableLiveData;)V", "trigger", "h", "Lcom/huami/femalehealth/logiclib/vo/SettingVo;", "getKeepSetting", "()Lcom/huami/femalehealth/logiclib/vo/SettingVo;", "setKeepSetting", "(Lcom/huami/femalehealth/logiclib/vo/SettingVo;)V", "getInputLive", "setInputLive", "inputLive", z.j, "getInputStatus", "setInputStatus", "inputStatus", hl.k, "Z", "isDestroyed", "Landroidx/lifecycle/Observer;", "l", "Landroidx/lifecycle/Observer;", "inputResultExternalObserver", "m", "Landroidx/lifecycle/LiveData;", "getSetting", "()Landroidx/lifecycle/LiveData;", "setting", "kotlin.jvm.PlatformType", GoogleApiAvailabilityLight.b, "inputResult", "o", "getSettings", "settings", com.google.android.exoplayer2.text.ttml.b.r, "getEnablePeriodSettings", "enablePeriodSettings", "<init>", "(Lcom/huami/femalehealth/logiclib/repo/SettingRepo;Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class SettingViewModel extends FHBaseViewModel {
    public static final int MENSTRUATION_DEF_DAY = 1;
    public static final int OVULATION_DEF_DAY = 0;
    public static final long REMOVE_OBSERVER_DELAY = 3000;

    @NotNull
    public static final String TAG = "SettingViewModel";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final SettingRepo repo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MenstruationRepo menstruationRepo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MenstruationDataManager manager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private SettingVo keepSetting;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isDestroyed;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private Observer<Resource<SettingRepo.SettingResult>> inputResultExternalObserver;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<SettingRepo.SettingResult>> inputResult;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<SettingVo>> settings;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> enablePeriodSettings;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Boolean> trigger = new MutableLiveData<>(Boolean.TRUE);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<SettingVo> inputLive = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<SettingRepo.SettingResult> inputStatus = new MutableLiveData<>();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<SettingVo>> setting = Transformations.switchMap(this.trigger, new Function() { // from class: zr6
        @Override // androidx.arch.core.util.Function
        public final Object apply(Object obj) {
            return SettingViewModel.j(this.a, (Boolean) obj);
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("inputLive change trigger inputResult change ");
            SettingVo keepSetting = SettingViewModel.this.getKeepSetting();
            sb.append(keepSetting == null ? null : Integer.valueOf(keepSetting.getEstimatedMenstrualDays()));
            sb.append(" - ");
            SettingVo keepSetting2 = SettingViewModel.this.getKeepSetting();
            sb.append(keepSetting2 != null ? Integer.valueOf(keepSetting2.getMenstrualCycle()) : null);
            return sb.toString();
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
            return "onCreate";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "inputResultExternalObserver, set setting callback, send event and refresh";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ LifecycleOwner a;
        public final /* synthetic */ SettingViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LifecycleOwner lifecycleOwner, SettingViewModel settingViewModel) {
            super(0);
            this.a = lifecycleOwner;
            this.b = settingViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onDestroy, owner=" + this.a + ", currState=" + this.a.getLifecycle().getCurrentState() + ", this=" + this.b.hashCode();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.SettingViewModel$onDestroy$2", f = "SettingViewModel.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SettingViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SettingViewModel settingViewModel) {
                super(0);
                this.a = settingViewModel;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.a.inputResult.hasObservers()) {
                    this.a.inputResult.removeObserver(this.a.inputResultExternalObserver);
                }
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SettingViewModel.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SettingViewModel settingViewModel = SettingViewModel.this;
            settingViewModel.runOnUiThread(new a(settingViewModel));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SettingVo b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SettingViewModel a;
            public final /* synthetic */ SettingVo b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SettingViewModel settingViewModel, SettingVo settingVo) {
                super(0);
                this.a = settingViewModel;
                this.b = settingVo;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.getInputLive().setValue(this.b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SettingViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SettingViewModel settingViewModel) {
                super(0);
                this.a = settingViewModel;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.getInputStatus().setValue(SettingRepo.SettingResult.NET_DISCONNECT);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(SettingVo settingVo) {
            super(0);
            this.b = settingVo;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SettingViewModel settingViewModel = SettingViewModel.this;
            FHBaseViewModel.runIfNetworkConnect$default(settingViewModel, 0, new a(settingViewModel, this.b), new b(SettingViewModel.this), 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Unit> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SettingViewModel.this.getInputStatus().setValue(SettingRepo.SettingResult.DEV_DISCONNECT);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SettingVo b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ Function1<SettingRepo.SettingResult, Unit> d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SettingViewModel a;
            public final /* synthetic */ SettingVo b;
            public final /* synthetic */ Function0<Unit> c;
            public final /* synthetic */ Function1<SettingRepo.SettingResult, Unit> d;

            /* JADX INFO: renamed from: com.huami.femalehealth.uilib.viewmodel.SettingViewModel$h$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0416a extends Lambda implements Function0<Unit> {
                public final /* synthetic */ SettingViewModel a;
                public final /* synthetic */ SettingVo b;
                public final /* synthetic */ Function0<Unit> c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0416a(SettingViewModel settingViewModel, SettingVo settingVo, Function0<Unit> function0) {
                    super(0);
                    this.a = settingViewModel;
                    this.b = settingVo;
                    this.c = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.a.getInputLive().setValue(this.b);
                    this.c.invoke();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<Unit> {
                public final /* synthetic */ SettingViewModel a;
                public final /* synthetic */ Function1<SettingRepo.SettingResult, Unit> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(SettingViewModel settingViewModel, Function1<? super SettingRepo.SettingResult, Unit> function1) {
                    super(0);
                    this.a = settingViewModel;
                    this.b = function1;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    MutableLiveData<SettingRepo.SettingResult> inputStatus = this.a.getInputStatus();
                    SettingRepo.SettingResult settingResult = SettingRepo.SettingResult.NET_DISCONNECT;
                    inputStatus.setValue(settingResult);
                    this.b.invoke(settingResult);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(SettingViewModel settingViewModel, SettingVo settingVo, Function0<Unit> function0, Function1<? super SettingRepo.SettingResult, Unit> function1) {
                super(0);
                this.a = settingViewModel;
                this.b = settingVo;
                this.c = function0;
                this.d = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SettingViewModel settingViewModel = this.a;
                FHBaseViewModel.runIfNetworkConnect$default(settingViewModel, 0, new C0416a(settingViewModel, this.b, this.c), new b(this.a, this.d), 1, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SettingViewModel a;
            public final /* synthetic */ Function1<SettingRepo.SettingResult, Unit> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(SettingViewModel settingViewModel, Function1<? super SettingRepo.SettingResult, Unit> function1) {
                super(0);
                this.a = settingViewModel;
                this.b = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MutableLiveData<SettingRepo.SettingResult> inputStatus = this.a.getInputStatus();
                SettingRepo.SettingResult settingResult = SettingRepo.SettingResult.DEV_DISCONNECT;
                inputStatus.setValue(settingResult);
                this.b.invoke(settingResult);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(SettingVo settingVo, Function0<Unit> function0, Function1<? super SettingRepo.SettingResult, Unit> function1) {
            super(0);
            this.b = settingVo;
            this.c = function0;
            this.d = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SettingViewModel settingViewModel = SettingViewModel.this;
            FHBaseViewModel.runIfDeviceConnect$default(settingViewModel, 0, new a(settingViewModel, this.b, this.c, this.d), new b(SettingViewModel.this, this.d), 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Function1<SettingRepo.SettingResult, Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Function1<? super SettingRepo.SettingResult, Unit> function1) {
            super(0);
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableLiveData<SettingRepo.SettingResult> inputStatus = SettingViewModel.this.getInputStatus();
            SettingRepo.SettingResult settingResult = SettingRepo.SettingResult.DEV_NOt_SUPPORT;
            inputStatus.setValue(settingResult);
            this.b.invoke(settingResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SettingVo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(SettingVo settingVo) {
            super(0);
            this.b = settingVo;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SettingViewModel.this.getInputLive().setValue(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<Unit> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SettingViewModel.this.getInputStatus().setValue(SettingRepo.SettingResult.NET_DISCONNECT);
        }
    }

    public SettingViewModel(@NotNull SettingRepo settingRepo, @NotNull MenstruationRepo menstruationRepo, @NotNull MenstruationDataManager menstruationDataManager) {
        this.repo = settingRepo;
        this.menstruationRepo = menstruationRepo;
        this.manager = menstruationDataManager;
        LiveData<Resource<SettingRepo.SettingResult>> liveDataSwitchMap = Transformations.switchMap(this.inputLive, new Function() { // from class: yr6
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return SettingViewModel.g(this.a, (SettingVo) obj);
            }
        });
        this.inputResult = liveDataSwitchMap;
        this.settings = Transformations.switchMap(liveDataSwitchMap, new Function() { // from class: xr6
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return SettingViewModel.k(this.a, (Resource) obj);
            }
        });
        this.enablePeriodSettings = new MutableLiveData<>();
    }

    private final LiveData<Resource<SettingVo>> f() {
        return this.repo.loadSettings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData g(SettingViewModel settingViewModel, SettingVo settingVo) {
        if (settingVo == null) {
            return null;
        }
        HMLog.debug(TAG, settingViewModel.new a());
        SettingVo keepSetting = settingViewModel.getKeepSetting();
        if (keepSetting == null) {
            return null;
        }
        return settingViewModel.i(settingVo, keepSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(SettingViewModel settingViewModel, Resource resource) {
        if (resource.getData() == SettingRepo.SettingResult.SUCCESS && settingViewModel.isDestroyed) {
            HMLog.info(TAG, c.a);
            EventBus.getDefault().post(new EventFHSettingChanged());
        }
    }

    private final LiveData<Resource<SettingRepo.SettingResult>> i(SettingVo settingVo, SettingVo keep) {
        return this.repo.setSetting(settingVo, keep, getDeviceConnectStatus().isConnected(), getDeviceConnectStatus().supportFemaleHealth());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData j(SettingViewModel settingViewModel, Boolean bool) {
        if (bool == null) {
            return null;
        }
        bool.booleanValue();
        return settingViewModel.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData k(SettingViewModel settingViewModel, Resource resource) {
        if (resource == null) {
            return null;
        }
        settingViewModel.getInputStatus().setValue(resource.getData());
        if (SettingRepo.SettingResult.SUCCESS == resource.getData()) {
            return settingViewModel.f();
        }
        return null;
    }

    @NotNull
    public final MutableLiveData<Boolean> getEnablePeriodSettings() {
        return this.enablePeriodSettings;
    }

    @NotNull
    public final MutableLiveData<SettingVo> getInputLive() {
        return this.inputLive;
    }

    @NotNull
    public final MutableLiveData<SettingRepo.SettingResult> getInputStatus() {
        return this.inputStatus;
    }

    @Nullable
    public final SettingVo getKeepSetting() {
        return this.keepSetting;
    }

    @NotNull
    public final LiveData<Resource<SettingVo>> getSetting() {
        return this.setting;
    }

    @NotNull
    public final LiveData<Resource<SettingVo>> getSettings() {
        return this.settings;
    }

    @NotNull
    public final MutableLiveData<Boolean> getTrigger() {
        return this.trigger;
    }

    public final boolean isCurrentDeviceNotSupport() {
        return getDeviceConnectStatus().hasActiveDevice() && !getDeviceConnectStatus().supportFemaleHealth();
    }

    public final boolean isFirstTimeLocal() {
        return this.repo.isFirstTime();
    }

    public final void keepSetting(@NotNull SettingVo settingVo) {
        this.keepSetting = settingVo;
    }

    @Override // com.huami.femalehealth.uilib.viewmodel.FHBaseViewModel, com.huami.femalehealth.uilib.helper.FHLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        super.onCreate(owner);
        HMLog.debug(TAG, b.a);
        Observer<Resource<SettingRepo.SettingResult>> observer = new Observer() { // from class: as6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SettingViewModel.h(this.a, (Resource) obj);
            }
        };
        this.inputResultExternalObserver = observer;
        this.inputResult.observeForever(observer);
    }

    @Override // com.huami.femalehealth.uilib.viewmodel.FHBaseViewModel, com.huami.femalehealth.uilib.helper.FHLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        super.onDestroy(owner);
        HMLog.debug(TAG, new d(owner, this));
        if (owner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            this.isDestroyed = true;
        }
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, null, null, new e(null), 3, null);
    }

    public final void refreshPeriodSettings() {
        CoroutineContext io2 = Dispatchers.getIO();
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        if (!Intrinsics.areEqual(io2, FHBaseViewModel.c)) {
            io2 = io2.plus(FHBaseViewModel.c);
        }
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), io2, coroutineStart, new SettingViewModel$refreshPeriodSettings$$inlined$safeLaunch$uilib_release$default$1(null, this));
    }

    public final void refreshSetting() {
        MutableLiveData<Boolean> mutableLiveData = this.trigger;
        mutableLiveData.setValue(Boolean.valueOf(!mutableLiveData.getValue().booleanValue()));
    }

    public final void setInitSetting(final int periodLen, final int cycleLen, final long lastMenstruationTime, final boolean enablePredict) {
        FHBaseViewModel.runIfNetworkConnect$default(this, 0, new Function0<Unit>() { // from class: com.huami.femalehealth.uilib.viewmodel.SettingViewModel.setInitSetting.1

            /* JADX INFO: renamed from: com.huami.femalehealth.uilib.viewmodel.SettingViewModel$setInitSetting$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.SettingViewModel$setInitSetting$1$1", f = "SettingViewModel.kt", i = {}, l = {237}, m = "invokeSuspend", n = {}, s = {})
            public static final class C04171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ long b;
                public final /* synthetic */ int c;
                public final /* synthetic */ SettingViewModel d;
                public final /* synthetic */ SettingVo e;
                public final /* synthetic */ boolean f;

                /* JADX INFO: renamed from: com.huami.femalehealth.uilib.viewmodel.SettingViewModel$setInitSetting$1$1$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ MenstruationTotalDto a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(MenstruationTotalDto menstruationTotalDto) {
                        super(0);
                        this.a = menstruationTotalDto;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return Intrinsics.stringPlus("setInitSetting, dto=", this.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04171(long j, int i, SettingViewModel settingViewModel, SettingVo settingVo, boolean z, Continuation<? super C04171> continuation) {
                    super(2, continuation);
                    this.b = j;
                    this.c = i;
                    this.d = settingViewModel;
                    this.e = settingVo;
                    this.f = z;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C04171(this.b, this.c, this.d, this.e, this.f, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C04171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Date date = new Date(this.b);
                        Date date2 = AidKt.toDate(DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null));
                        long time = date.getTime() + (((long) (this.c - 1)) * 86400000);
                        boolean z = time <= date2.getTime();
                        MenstruationRepo menstruationRepo = this.d.menstruationRepo;
                        Date date3 = new Date(time);
                        this.a = 1;
                        if (menstruationRepo.add(date, date3, z, (32 & 8) != 0 ? false : false, (32 & 16) != 0, (32 & 32) != 0 ? false : false, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    MenstruationTotalDto menstruationTotalDtoCreateInitMenstruationTotalDto = this.d.manager.createInitMenstruationTotalDto();
                    HMLog.info(SettingViewModel.TAG, new a(menstruationTotalDtoCreateInitMenstruationTotalDto));
                    EventBus.getDefault().post(new EventFHSettingChanged());
                    MenstruationDataManager menstruationDataManager = this.d.manager;
                    final SettingViewModel settingViewModel = this.d;
                    final SettingVo settingVo = this.e;
                    final boolean z2 = this.f;
                    MenstruationDataManager.writeToDevice$default(menstruationDataManager, menstruationTotalDtoCreateInitMenstruationTotalDto, null, false, new DeviceCallback() { // from class: com.huami.femalehealth.uilib.viewmodel.SettingViewModel.setInitSetting.1.1.2
                        @Override // com.huami.femalehealth.logiclib.device.DeviceCallback
                        public void onFinish(boolean success) {
                            MenstruationDataManager.writeConfigToDevice$default(settingViewModel.manager, new MenstruationConfigDto(Boolean.valueOf(settingVo.getHardwarePush()), Boolean.valueOf(settingVo.getHardwarePush()), Byte.valueOf((byte) settingVo.getHardwareBeforeMenstruationPush()), Boolean.FALSE, Byte.valueOf((byte) settingVo.getHardwareBeforeOvulationPush()), Boolean.valueOf(z2)), null, 2, null);
                        }
                    }, 6, null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                boolean z = enablePredict;
                SettingVo settingVo = z ? new SettingVo(1, 0, false, periodLen, false, 1, 0, true, z, lastMenstruationTime, cycleLen) : new SettingVo(0, 0, false, periodLen, false, 0, 0, false, z, lastMenstruationTime, cycleLen);
                this.repo.setInitSetting(settingVo);
                kotlinx.coroutines.e.f(GlobalScope.INSTANCE, null, null, new C04171(lastMenstruationTime, periodLen, this, settingVo, enablePredict, null), 3, null);
            }
        }, 1, null);
    }

    public final void setInputLive(@NotNull MutableLiveData<SettingVo> mutableLiveData) {
        this.inputLive = mutableLiveData;
    }

    public final void setInputStatus(@NotNull MutableLiveData<SettingRepo.SettingResult> mutableLiveData) {
        this.inputStatus = mutableLiveData;
    }

    public final void setKeepSetting(@Nullable SettingVo settingVo) {
        this.keepSetting = settingVo;
    }

    public final void setSettingRequireDevConnect(@NotNull SettingVo settingVo) {
        FHBaseViewModel.runIfDeviceConnect$default(this, 0, new f(settingVo), new g(), 1, null);
    }

    public final void setSettingRequireDevSupport(@NotNull SettingVo settingVo, @NotNull Function0<Unit> succeedCallBack, @NotNull Function1<? super SettingRepo.SettingResult, Unit> failedCallBack) {
        runIfDeviceSupport(new h(settingVo, succeedCallBack, failedCallBack), new i(failedCallBack));
    }

    public final void setSettingRequireNet(@NotNull SettingVo settingVo) {
        FHBaseViewModel.runIfNetworkConnect$default(this, 0, new j(settingVo), new k(), 1, null);
    }

    public final void setTrigger(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        this.trigger = mutableLiveData;
    }
}
