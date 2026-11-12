package com.xiaomi.hm.health.mainpage;

import android.app.Activity;
import android.content.ComponentCallbacks;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.OnLifecycleEvent;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.femalehealth.logiclib.repo.MenstruationRepo;
import com.huami.femalehealth.logiclib.vo.SettingVo;
import com.huami.femalehealth.uilib.helper.FemaleAppNoticeHelper;
import com.huami.femalehealth.uilib.manager.FemaleHealthActivityManager;
import com.huami.femalehealth.uilib.manager.FemaleHealthTimeZoneReceiverManager;
import com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel;
import com.huami.tools.log.HMLog;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.xiaomi.hm.health.adapter.FemaleAppNoticeHelperAdapter;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.mainpage.FemaleHealthManager;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u0010R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/mainpage/FemaleHealthManager;", "", "", "initFemale", "refreshFemale", "Landroid/app/Activity;", "a", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/LifecycleOwner;", "b", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "Lcom/huami/femalehealth/uilib/viewmodel/FemaleMifitViewModel;", "c", "Lkotlin/Lazy;", "()Lcom/huami/femalehealth/uilib/viewmodel/FemaleMifitViewModel;", "viewModel", "Lkotlin/Lazy;", "Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;", GoogleApiAvailabilityLight.a, "menstruationRepo", "Lcom/huami/femalehealth/uilib/helper/FemaleAppNoticeHelper;", "e", "Lcom/huami/femalehealth/uilib/helper/FemaleAppNoticeHelper;", "noticeAdapter", "<init>", "(Landroid/app/Activity;Landroidx/lifecycle/LifecycleOwner;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class FemaleHealthManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Activity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LifecycleOwner owner;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy<MenstruationRepo> menstruationRepo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final FemaleAppNoticeHelper noticeAdapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ SettingVo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SettingVo settingVo) {
            super(0);
            this.a = settingVo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "initFemale, settingVo: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"Ljava/util/TimeZone;", "oldTimeZone", "newTimeZone", "", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function3<TimeZone, TimeZone, Boolean, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ TimeZone a;
            public final /* synthetic */ TimeZone b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TimeZone timeZone, TimeZone timeZone2) {
                super(0);
                this.a = timeZone;
                this.b = timeZone2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "时区切换 old:" + this.a + "new:" + this.b;
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.mainpage.FemaleHealthManager$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.mainpage.FemaleHealthManager$initFemale$2$2", f = "FemaleHealthManager.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0975b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ FemaleHealthManager b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0975b(FemaleHealthManager femaleHealthManager, Continuation<? super C0975b> continuation) {
                super(2, continuation);
                this.b = femaleHealthManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0975b(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0975b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MenstruationRepo menstruationRepo = (MenstruationRepo) this.b.menstruationRepo.getValue();
                    this.a = 1;
                    if (MenstruationRepo.clearLocalMenstruation$default(menstruationRepo, false, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ((MenstruationRepo) this.b.menstruationRepo.getValue()).updateAllFromCloud();
                this.b.noticeAdapter.refreshCalendarTimezone(this.b.activity);
                return Unit.INSTANCE;
            }
        }

        public b() {
            super(3);
        }

        public final void a(@Nullable TimeZone timeZone, @NotNull TimeZone timeZone2, @Nullable Boolean bool) {
            HMLog.info("MainTabActivity", new a(timeZone, timeZone2));
            if (timeZone == null || timeZone.getRawOffset() == timeZone2.getRawOffset()) {
                return;
            }
            FemaleHealthActivityManager.INSTANCE.finishAllActivity();
            e.f(GlobalScope.INSTANCE, null, null, new C0975b(FemaleHealthManager.this, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(TimeZone timeZone, TimeZone timeZone2, Boolean bool) {
            a(timeZone, timeZone2, bool);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FemaleHealthManager(@NotNull Activity activity, @NotNull LifecycleOwner lifecycleOwner) {
        this.activity = activity;
        this.owner = lifecycleOwner;
        final ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.mainpage.FemaleHealthManager$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks2 = componentCallbacks;
                return companion.from((ViewModelStoreOwner) componentCallbacks2, componentCallbacks2 instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks2 : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<FemaleMifitViewModel>() { // from class: com.xiaomi.hm.health.mainpage.FemaleHealthManager$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final FemaleMifitViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(componentCallbacks, qualifier, Reflection.getOrCreateKotlinClass(FemaleMifitViewModel.class), function0, objArr);
            }
        });
        this.menstruationRepo = KoinJavaComponent.inject$default(MenstruationRepo.class, null, null, 6, null);
        this.noticeAdapter = new FemaleAppNoticeHelperAdapter().getFemaleAppNoticeHelper();
    }

    private final FemaleMifitViewModel b() {
        return (FemaleMifitViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(FemaleHealthManager femaleHealthManager, Resource resource) {
        SettingVo settingVo = (SettingVo) resource.component2();
        HMLog.debug("MainTabActivity", new a(settingVo));
        femaleHealthManager.b().initCalcManager(settingVo);
        new FemaleAppNoticeHelperAdapter().getFemaleAppNoticeHelper().notice(femaleHealthManager.activity);
    }

    public final void initFemale() {
        b().getSetting().observe(this.owner, new Observer() { // from class: q52
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FemaleHealthManager.c(this.a, (Resource) obj);
            }
        });
        b().checkUnsyncData();
        FemaleHealthTimeZoneReceiverManager.INSTANCE.registerReceiver(this.activity, new b());
        this.owner.getLifecycle().addObserver(new LifecycleObserver() { // from class: com.xiaomi.hm.health.mainpage.FemaleHealthManager.initFemale.3
            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                FemaleHealthTimeZoneReceiverManager.INSTANCE.unregisterReceiver(FemaleHealthManager.this.activity);
                HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
                HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
                if (hMMiLiProDevice == null) {
                    return;
                }
                hMMiLiProDevice.setMenstrualNotifiedDataListener(null);
            }
        });
    }

    public final void refreshFemale() {
        b().refreshSetting();
    }
}
