package com.huami.femalehealth.uilib.viewmodel;

import android.app.Application;
import android.widget.Toast;
import androidx.annotation.StringRes;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.OnLifecycleEvent;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.femalehealth.logiclib.device.DeviceStatus;
import com.huami.femalehealth.logiclib.helper.NetUtil;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.ContextHolder;
import com.huami.femalehealth.uilib.helper.FHLifecycleObserver;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.femalehealth.uilib.koin.ScopesAndQualifersKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0007¢\u0006\u0004\b&\u0010'JV\u0010\u0011\u001a\u00020\u000e*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052)\b\u0004\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007¢\u0006\u0002\b\fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\nJ\u001e\u0010\u001a\u001a\u00020\n2\b\b\u0003\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0018J0\u0010\u001a\u001a\u00020\n2\b\b\u0003\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00182\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0018J0\u0010\u001c\u001a\u00020\n2\b\b\u0003\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00182\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0018J&\u0010\u001d\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00182\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0018J\u0014\u0010\u001f\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u0018R\u001d\u0010%\u001a\u00020 8D@\u0004X\u0084\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/huami/femalehealth/uilib/viewmodel/FHBaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/femalehealth/uilib/helper/FHLifecycleObserver;", "Lkotlin/coroutines/CoroutineContext;", DbUtils.Const.Table.CONTEXT, "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "Lkotlinx/coroutines/Job;", "safeLaunch$uilib_release", "(Landroidx/lifecycle/ViewModel;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "safeLaunch", "", "sticky", "safeRegisterEvent", "safeUnregisterEvent", "", "toast", "Lkotlin/Function0;", "task", "runIfNetworkConnect", "failCallBack", "runIfDeviceConnect", "runIfDeviceSupport", "job", "runOnUiThread", "Lcom/huami/femalehealth/logiclib/device/DeviceStatus;", "a", "Lkotlin/Lazy;", "getDeviceConnectStatus", "()Lcom/huami/femalehealth/logiclib/device/DeviceStatus;", "deviceConnectStatus", "<init>", "()V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public abstract class FHBaseViewModel extends ViewModel implements FHLifecycleObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final ContextHolder b;

    @NotNull
    private static final com.huami.femalehealth.uilib.viewmodel.a c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceConnectStatus;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/femalehealth/uilib/viewmodel/FHBaseViewModel$Companion;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/femalehealth/uilib/helper/ContextHolder;", "contextHolder", "Lcom/huami/femalehealth/uilib/helper/ContextHolder;", "Lcom/huami/femalehealth/uilib/viewmodel/a;", "exceptionHandler", "Lcom/huami/femalehealth/uilib/viewmodel/a;", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion implements KoinComponent {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // org.koin.core.component.KoinComponent
        @NotNull
        public Koin getKoin() {
            return KoinComponent.DefaultImpls.getKoin(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Application a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Application application, int i) {
            super(0);
            this.a = application;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ResourceHelper.ToastUtil toastUtil = ResourceHelper.ToastUtil.INSTANCE;
            Application application = this.a;
            toastUtil.showToastOnce(application, application.getString(this.b), 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("runIfSupportFemaleHealth:", Boolean.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Toast.makeText(FHBaseViewModel.b.getApp(), this.a, 0).show();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Application a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Application application, int i) {
            super(0);
            this.a = application;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ResourceHelper.ToastUtil toastUtil = ResourceHelper.ToastUtil.INSTANCE;
            Application application = this.a;
            toastUtil.showToastOnce(application, application.getString(this.b), 0);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        b = (ContextHolder) ScopesAndQualifersKt.femaleHealthContextScope(companion.getKoin()).get(Reflection.getOrCreateKotlinClass(ContextHolder.class), null, null);
        c = new com.huami.femalehealth.uilib.viewmodel.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FHBaseViewModel() {
        final Companion companion = INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceConnectStatus = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceStatus>() { // from class: com.huami.femalehealth.uilib.viewmodel.FHBaseViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.femalehealth.logiclib.device.DeviceStatus, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceStatus invoke() {
                KoinComponent koinComponent = companion;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceStatus.class), qualifier, objArr);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void runIfDeviceConnect$default(FHBaseViewModel fHBaseViewModel, int i, Function0 function0, Function0 function1, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runIfDeviceConnect");
        }
        if ((i2 & 1) != 0) {
            i = R.string.fh_device_connect_require;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        fHBaseViewModel.runIfDeviceConnect(i, function0, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void runIfDeviceSupport$default(FHBaseViewModel fHBaseViewModel, Function0 function0, Function0 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runIfDeviceSupport");
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        fHBaseViewModel.runIfDeviceSupport(function0, function1);
    }

    public static /* synthetic */ void runIfNetworkConnect$default(FHBaseViewModel fHBaseViewModel, int i, Function0 function0, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runIfNetworkConnect");
        }
        if ((i2 & 1) != 0) {
            i = R.string.fh_network_error;
        }
        fHBaseViewModel.runIfNetworkConnect(i, function0);
    }

    public static /* synthetic */ Job safeLaunch$uilib_release$default(FHBaseViewModel fHBaseViewModel, ViewModel viewModel, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: safeLaunch");
        }
        if ((i & 1) != 0) {
            coroutineContext = c;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        if (!Intrinsics.areEqual(coroutineContext, c)) {
            coroutineContext = coroutineContext.plus(c);
        }
        return BuildersKt.launch(ViewModelKt.getViewModelScope(viewModel), coroutineContext, coroutineStart, new FHBaseViewModel$safeLaunch$1(function2, null));
    }

    public static /* synthetic */ void safeRegisterEvent$default(FHBaseViewModel fHBaseViewModel, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: safeRegisterEvent");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        fHBaseViewModel.safeRegisterEvent(z);
    }

    @NotNull
    public final DeviceStatus getDeviceConnectStatus() {
        return (DeviceStatus) this.deviceConnectStatus.getValue();
    }

    @Override // com.huami.femalehealth.uilib.helper.FHLifecycleObserver
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
        FHLifecycleObserver.DefaultImpls.onCreate(this, lifecycleOwner);
    }

    @Override // com.huami.femalehealth.uilib.helper.FHLifecycleObserver
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        FHLifecycleObserver.DefaultImpls.onDestroy(this, lifecycleOwner);
    }

    @Override // com.huami.femalehealth.uilib.helper.FHLifecycleObserver
    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public void onLifecycleChanged(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event event) {
        FHLifecycleObserver.DefaultImpls.onLifecycleChanged(this, lifecycleOwner, event);
    }

    @Override // com.huami.femalehealth.uilib.helper.FHLifecycleObserver
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(@NotNull LifecycleOwner lifecycleOwner) {
        FHLifecycleObserver.DefaultImpls.onPause(this, lifecycleOwner);
    }

    @Override // com.huami.femalehealth.uilib.helper.FHLifecycleObserver
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(@NotNull LifecycleOwner lifecycleOwner) {
        FHLifecycleObserver.DefaultImpls.onResume(this, lifecycleOwner);
    }

    @Override // com.huami.femalehealth.uilib.helper.FHLifecycleObserver
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@NotNull LifecycleOwner lifecycleOwner) {
        FHLifecycleObserver.DefaultImpls.onStart(this, lifecycleOwner);
    }

    @Override // com.huami.femalehealth.uilib.helper.FHLifecycleObserver
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(@NotNull LifecycleOwner lifecycleOwner) {
        FHLifecycleObserver.DefaultImpls.onStop(this, lifecycleOwner);
    }

    public final void runIfDeviceConnect(@StringRes int toast, @NotNull Function0<Unit> task, @Nullable Function0<Unit> failCallBack) {
        Application app = b.getApp();
        if (getDeviceConnectStatus().isConnected()) {
            task.invoke();
            return;
        }
        runOnUiThread(new a(app, toast));
        if (failCallBack == null) {
            return;
        }
        failCallBack.invoke();
    }

    public final void runIfDeviceSupport(@NotNull Function0<Unit> task, @Nullable Function0<Unit> failCallBack) {
        boolean z = getDeviceConnectStatus().hasActiveDevice() && getDeviceConnectStatus().supportFemaleHealth();
        HMLog.debug("xys", new b(z));
        if (z) {
            task.invoke();
        } else {
            if (failCallBack == null) {
                return;
            }
            failCallBack.invoke();
        }
    }

    public final void runIfNetworkConnect(@StringRes int toast, @NotNull Function0<Unit> task) {
        if (NetUtil.INSTANCE.isNetworkConnected(b.getApp())) {
            task.invoke();
        } else {
            runOnUiThread(new c(toast));
        }
    }

    @NotNull
    public final Job runOnUiThread(@NotNull Function0<Unit> job) {
        CoroutineContext main = Dispatchers.getMain();
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        if (!Intrinsics.areEqual(main, c)) {
            main = main.plus(c);
        }
        return BuildersKt.launch(ViewModelKt.getViewModelScope(this), main, coroutineStart, new FHBaseViewModel$runOnUiThread$$inlined$safeLaunch$uilib_release$default$1(null, job));
    }

    @NotNull
    public final Job safeLaunch$uilib_release(@NotNull ViewModel viewModel, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        if (!Intrinsics.areEqual(coroutineContext, c)) {
            coroutineContext = coroutineContext.plus(c);
        }
        return BuildersKt.launch(ViewModelKt.getViewModelScope(viewModel), coroutineContext, coroutineStart, new FHBaseViewModel$safeLaunch$1(function2, null));
    }

    public final void safeRegisterEvent(boolean sticky) {
        safeUnregisterEvent();
        if (sticky) {
            EventBus.getDefault().registerSticky(this);
        } else {
            EventBus.getDefault().register(this);
        }
    }

    public final void safeUnregisterEvent() {
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void runIfNetworkConnect$default(FHBaseViewModel fHBaseViewModel, int i, Function0 function0, Function0 function1, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runIfNetworkConnect");
        }
        if ((i2 & 1) != 0) {
            i = R.string.fh_network_error;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        fHBaseViewModel.runIfNetworkConnect(i, function0, function1);
    }

    public final void runIfNetworkConnect(@StringRes int toast, @NotNull Function0<Unit> task, @Nullable Function0<Unit> failCallBack) {
        Application app = b.getApp();
        if (!NetUtil.INSTANCE.isNetworkConnected(app)) {
            runOnUiThread(new d(app, toast));
            if (failCallBack == null) {
                return;
            }
            failCallBack.invoke();
            return;
        }
        task.invoke();
    }
}
