package com.huami.sky.ui.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.devicestylepower.DeviceStyle;
import com.huami.devicestylepower.DeviceStyleKt;
import com.huami.devicestylepower.IPowerAndStyleManager;
import com.huami.sky.lib.assist.ISkyDeviceStatusAssistant;
import com.huami.sky.lib.assist.SkyDeviceStatus;
import com.huami.sky.ui.R;
import com.huami.sky.ui.databinding.FragmentSkyDeviceStatusBinding;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.sky.ui.view.SkyDeviceStatusFragment;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J$\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011R\u001d\u0010\u0019\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\"\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/huami/sky/ui/view/SkyDeviceStatusFragment;", "Landroidx/fragment/app/Fragment;", "", "e", "Lcom/huami/sky/lib/assist/SkyDeviceStatus;", "status", "g", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/sky/ui/view/OnConnectFailClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setConnectFailListener", "Lcom/huami/sky/ui/databinding/FragmentSkyDeviceStatusBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", GoogleApiAvailabilityLight.a, "()Lcom/huami/sky/ui/databinding/FragmentSkyDeviceStatusBinding;", "viewBinding", "Lcom/huami/devicestylepower/IPowerAndStyleManager;", "b", "Lkotlin/Lazy;", "c", "()Lcom/huami/devicestylepower/IPowerAndStyleManager;", "deviceStylePowerManager", "Lcom/huami/sky/lib/assist/ISkyDeviceStatusAssistant;", "()Lcom/huami/sky/lib/assist/ISkyDeviceStatusAssistant;", "deviceStatusAssist", "Lcom/huami/sky/lib/assist/SkyDeviceStatus;", "currentDeviceStatus", "", "Ljava/lang/Integer;", "currentDevicePower", "f", "Lcom/huami/sky/ui/view/OnConnectFailClickListener;", "onConnectFailClick", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyDeviceStatusFragment extends Fragment {
    public static final /* synthetic */ KProperty<Object>[] g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding = FragmentViewBindingKt.viewBinding(new SkyDeviceStatusFragment$special$$inlined$viewBinding$1(new InflateViewBinder(FragmentSkyDeviceStatusBinding.class)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceStylePowerManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceStatusAssist;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private SkyDeviceStatus currentDeviceStatus;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Integer currentDevicePower;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private OnConnectFailClickListener onConnectFailClick;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SkyDeviceStatus.values().length];
            iArr[SkyDeviceStatus.CONNECT_SUCCESS.ordinal()] = 1;
            iArr[SkyDeviceStatus.CONNECTING.ordinal()] = 2;
            iArr[SkyDeviceStatus.CONNECT_FAIL.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.view.SkyDeviceStatusFragment$setListeners$2", f = "SkyDeviceStatusFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ int b;

        /* JADX INFO: renamed from: com.huami.sky.ui.view.SkyDeviceStatusFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0573a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0573a(int i) {
                super(0);
                this.a = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "device power change: " + this.a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Nullable
        public final Object a(int i, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = SkyDeviceStatusFragment.this.new a(continuation);
            aVar.b = ((Number) obj).intValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return a(num.intValue(), continuation);
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
            HMLog.info("SkyDeviceStatusFragment", new C0573a(i));
            SkyDeviceStatusFragment skyDeviceStatusFragment = SkyDeviceStatusFragment.this;
            SkyDeviceStatus skyDeviceStatus = SkyDeviceStatus.CONNECT_SUCCESS;
            skyDeviceStatus.setDeviceTypeValue(i);
            Unit unit = Unit.INSTANCE;
            skyDeviceStatusFragment.g(skyDeviceStatus);
            return unit;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkyDeviceStatusFragment.class), "viewBinding", "getViewBinding()Lcom/huami/sky/ui/databinding/FragmentSkyDeviceStatusBinding;"));
        g = kPropertyArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkyDeviceStatusFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceStylePowerManager = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<IPowerAndStyleManager>() { // from class: com.huami.sky.ui.view.SkyDeviceStatusFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicestylepower.IPowerAndStyleManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IPowerAndStyleManager invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(IPowerAndStyleManager.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceStatusAssist = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ISkyDeviceStatusAssistant>() { // from class: com.huami.sky.ui.view.SkyDeviceStatusFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sky.lib.assist.ISkyDeviceStatusAssistant, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ISkyDeviceStatusAssistant invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(ISkyDeviceStatusAssistant.class), objArr2, objArr3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ISkyDeviceStatusAssistant b() {
        return (ISkyDeviceStatusAssistant) this.deviceStatusAssist.getValue();
    }

    private final IPowerAndStyleManager c() {
        return (IPowerAndStyleManager) this.deviceStylePowerManager.getValue();
    }

    private final FragmentSkyDeviceStatusBinding d() {
        return (FragmentSkyDeviceStatusBinding) this.viewBinding.getValue(this, g[0]);
    }

    private final void e() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new SkyDeviceStatusFragment$setListeners$1(this, null));
        FlowKt.launchIn(FlowKt.onEach(b().devicePowerNotifiers(), new a(null)), LifecycleOwnerKt.getLifecycleScope(this));
        d().failView.setOnClickListener(new View.OnClickListener() { // from class: ex6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyDeviceStatusFragment.f(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SkyDeviceStatusFragment skyDeviceStatusFragment, View view) {
        OnConnectFailClickListener onConnectFailClickListener;
        if (skyDeviceStatusFragment.currentDeviceStatus == null || (onConnectFailClickListener = skyDeviceStatusFragment.onConnectFailClick) == null) {
            return;
        }
        onConnectFailClickListener.onDeviceConnectFailClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(SkyDeviceStatus status) {
        int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            LottieAnimationView lottieAnimationView = d().connectingView;
            lottieAnimationView.cancelAnimation();
            lottieAnimationView.setVisibility(8);
            d().failView.setVisibility(8);
            d().deviceImage.setVisibility(0);
            DeviceStyle deviceStylePowerAndStyle = c().powerAndStyle(status.getDeviceTypeValue());
            this.currentDevicePower = deviceStylePowerAndStyle == null ? null : Integer.valueOf(DeviceStyleKt.getSingleBatteryRatio(deviceStylePowerAndStyle));
            d().deviceImage.setDeviceType(deviceStylePowerAndStyle);
            return;
        }
        if (i == 2) {
            d().failView.setVisibility(8);
            d().deviceImage.setVisibility(4);
            LottieAnimationView lottieAnimationView2 = d().connectingView;
            lottieAnimationView2.setVisibility(0);
            lottieAnimationView2.playAnimation();
            return;
        }
        if (i != 3) {
            return;
        }
        d().deviceImage.setVisibility(4);
        LottieAnimationView lottieAnimationView3 = d().connectingView;
        lottieAnimationView3.cancelAnimation();
        lottieAnimationView3.setVisibility(8);
        d().failView.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        d().deviceImage.setDeviceColor(-1, -1, SkyExtKt.toColorInt(R.color.sky_device_low_power, requireContext()));
        return d().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        SkyDeviceStatus deviceConnectStatus = b().getDeviceConnectStatus();
        g(deviceConnectStatus);
        Unit unit = Unit.INSTANCE;
        this.currentDeviceStatus = deviceConnectStatus;
        e();
    }

    public final void setConnectFailListener(@NotNull OnConnectFailClickListener listener) {
        this.onConnectFailClick = listener;
    }
}
