package com.huami.third.wechat.ui.bind.result;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcherKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.zxing.Intents;
import com.huami.lib.rainbow.button.RainbowButton;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.third.wechat.ui.R;
import com.huami.third.wechat.ui.StateEvent;
import com.huami.third.wechat.ui.WeChatParams;
import com.huami.third.wechat.ui.bind.result.WeChatBindSuccessFragment;
import com.huami.third.wechat.ui.databinding.FragmentBindResultWechatBinding;
import com.huami.tools.log.HMLog;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/third/wechat/ui/bind/result/WeChatBindSuccessFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/core/component/KoinComponent;", "", "h", GoogleApiAvailabilityLight.a, "e", hl.k, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "Lcom/huami/third/wechat/ui/databinding/FragmentBindResultWechatBinding;", "a", "Lcom/huami/third/wechat/ui/databinding/FragmentBindResultWechatBinding;", "binding", "Lcom/huami/third/wechat/ui/WeChatParams;", "b", "Lkotlin/Lazy;", "g", "()Lcom/huami/third/wechat/ui/WeChatParams;", "weChatParams", "Lcom/huami/third/wechat/ui/bind/result/WeChatBindSuccessViewModel;", "c", "f", "()Lcom/huami/third/wechat/ui/bind/result/WeChatBindSuccessViewModel;", "viewModel", "<init>", "()V", "Companion", "wechat-ui_release"}, k = 1, mv = {1, 5, 1})
public final class WeChatBindSuccessFragment extends Fragment implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DEVICE_NAME = "device_name";

    @NotNull
    public static final String TYPE = "bind_type";

    @NotNull
    public static final String TYPE_SPORTS = "sports";

    @NotNull
    public static final String TYPE_STEP = "step";

    @NotNull
    public static final String WECHAT_ADD_DEVICE_PATH_PREFIX = "pages/discover-new/discover-new?from=wxsport&&ticket=";

    @NotNull
    public static final String WECHAT_DELETE_DEVICE_PATH_PREFIX = "pages/delete-devices/delete-devices?from=wxsport&&sdkIdList=";

    @NotNull
    public static final String WECHAT_USER_NAME = "gh_471f5f7b25a9";

    @NotNull
    public static final String WX_DEVICE_ID = "wx_device_id";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private FragmentBindResultWechatBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy weChatParams;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u0012\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/huami/third/wechat/ui/bind/result/WeChatBindSuccessFragment$Companion;", "", "", "DEVICE_NAME", "Ljava/lang/String;", Intents.WifiConnect.TYPE, "TYPE_SPORTS", "TYPE_STEP", "getTYPE_STEP$annotations", "()V", "WECHAT_ADD_DEVICE_PATH_PREFIX", "WECHAT_DELETE_DEVICE_PATH_PREFIX", "WECHAT_USER_NAME", "WX_DEVICE_ID", "<init>", "wechat-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getTYPE_STEP$annotations() {
        }
    }

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
            return "开始解绑微信，但是没有获取到微信 device id";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<OnBackPressedCallback, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull OnBackPressedCallback onBackPressedCallback) {
            WeChatBindSuccessFragment.this.d();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OnBackPressedCallback onBackPressedCallback) {
            a(onBackPressedCallback);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "微信解绑的结果：" + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WeChatBindSuccessFragment() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.weChatParams = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<WeChatParams>() { // from class: com.huami.third.wechat.ui.bind.result.WeChatBindSuccessFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.third.wechat.ui.WeChatParams, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WeChatParams getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(WeChatParams.class), qualifier, objArr);
            }
        });
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.huami.third.wechat.ui.bind.result.WeChatBindSuccessFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Fragment getA() {
                return this;
            }
        };
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(WeChatBindSuccessViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.third.wechat.ui.bind.result.WeChatBindSuccessFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return ((ViewModelStoreOwner) function0.getA()).getViewModelStore();
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        FragmentActivity activity;
        if (!FragmentKt.findNavController(this).navigateUp() && (activity = getActivity()) != null) {
            activity.finish();
        }
        StateEvent.INSTANCE.getNotifyRefreshDeviceList().setValue(Boolean.TRUE);
    }

    private final void e() {
        Bundle arguments = getArguments();
        String string = arguments == null ? null : arguments.getString(WX_DEVICE_ID);
        if (string == null || string.length() == 0) {
            HMLog.error$default("wechat", null, null, a.a, 6, null);
        } else {
            f().unBindWeChatDevice(requireContext(), string, g().getAppID());
            k();
        }
    }

    private final WeChatBindSuccessViewModel f() {
        return (WeChatBindSuccessViewModel) this.viewModel.getValue();
    }

    private final WeChatParams g() {
        return (WeChatParams) this.weChatParams.getValue();
    }

    private final void h() {
        Object objM3845constructorimpl;
        Bundle arguments = getArguments();
        if (Intrinsics.areEqual(arguments == null ? null : arguments.get("bind_type"), TYPE_SPORTS)) {
            FragmentBindResultWechatBinding fragmentBindResultWechatBinding = this.binding;
            Objects.requireNonNull(fragmentBindResultWechatBinding);
            RainbowTitleBar rainbowTitleBar = fragmentBindResultWechatBinding.titleBar;
            Bundle arguments2 = getArguments();
            rainbowTitleBar.setTitle(arguments2 != null ? arguments2.getString(DEVICE_NAME) : null);
            FragmentBindResultWechatBinding fragmentBindResultWechatBinding2 = this.binding;
            Objects.requireNonNull(fragmentBindResultWechatBinding2);
            fragmentBindResultWechatBinding2.img.setImageResource(R.drawable.ic_sports_bind);
            FragmentBindResultWechatBinding fragmentBindResultWechatBinding3 = this.binding;
            Objects.requireNonNull(fragmentBindResultWechatBinding3);
            fragmentBindResultWechatBinding3.bindSuccessTips.setText(getResources().getString(R.string.device_bind_success_tips));
            FragmentBindResultWechatBinding fragmentBindResultWechatBinding4 = this.binding;
            Objects.requireNonNull(fragmentBindResultWechatBinding4);
            fragmentBindResultWechatBinding4.tvDescSteps.setVisibility(8);
            FragmentBindResultWechatBinding fragmentBindResultWechatBinding5 = this.binding;
            Objects.requireNonNull(fragmentBindResultWechatBinding5);
            RainbowButton rainbowButton = fragmentBindResultWechatBinding5.btnDeleteDevice;
            rainbowButton.setVisibility(0);
            rainbowButton.setOnClickListener(new View.OnClickListener() { // from class: ln8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WeChatBindSuccessFragment.i(this.a, view);
                }
            });
            FragmentBindResultWechatBinding fragmentBindResultWechatBinding6 = this.binding;
            Objects.requireNonNull(fragmentBindResultWechatBinding6);
            fragmentBindResultWechatBinding6.bindTips.setVisibility(0);
            return;
        }
        Integer bindSuccessImg = g().getBindSuccessImg();
        if (bindSuccessImg == null) {
            return;
        }
        int iIntValue = bindSuccessImg.intValue();
        try {
            Result.Companion companion = Result.Companion;
            FragmentBindResultWechatBinding fragmentBindResultWechatBinding7 = this.binding;
            if (fragmentBindResultWechatBinding7 == null) {
                throw null;
            }
            fragmentBindResultWechatBinding7.img.setImageResource(iIntValue);
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            Result.m3844boximpl(objM3845constructorimpl);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(WeChatBindSuccessFragment weChatBindSuccessFragment, View view) {
        weChatBindSuccessFragment.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(WeChatBindSuccessFragment weChatBindSuccessFragment, View view) {
        weChatBindSuccessFragment.d();
    }

    private final void k() {
        StateEvent.INSTANCE.getWechatResult().observe(getViewLifecycleOwner(), new Observer() { // from class: mn8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeChatBindSuccessFragment.l(this.a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(WeChatBindSuccessFragment weChatBindSuccessFragment, String str) {
        HMLog.info("wechat", new c(str));
        if (weChatBindSuccessFragment.f().checkBindSuccess(str)) {
            weChatBindSuccessFragment.d();
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OnBackPressedDispatcherKt.addCallback$default(requireActivity().getOnBackPressedDispatcher(), this, false, new b(), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentBindResultWechatBinding fragmentBindResultWechatBindingInflate = FragmentBindResultWechatBinding.inflate(inflater);
        this.binding = fragmentBindResultWechatBindingInflate;
        Objects.requireNonNull(fragmentBindResultWechatBindingInflate);
        fragmentBindResultWechatBindingInflate.titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: kn8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeChatBindSuccessFragment.j(this.a, view);
            }
        });
        h();
        FragmentBindResultWechatBinding fragmentBindResultWechatBinding = this.binding;
        Objects.requireNonNull(fragmentBindResultWechatBinding);
        return fragmentBindResultWechatBinding.getRoot();
    }
}
