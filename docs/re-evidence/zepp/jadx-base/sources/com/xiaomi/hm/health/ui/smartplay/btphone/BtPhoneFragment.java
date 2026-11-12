package com.xiaomi.hm.health.ui.smartplay.btphone;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p010navigation.fragment.FragmentKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.tbruyelle.rxpermissions2.Permission;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.xiaomi.hm.health.databinding.FragmentBtPhoneBinding;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneFragment;
import com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneViewSetting;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.DelayTimeWheelDialog;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.ShowAuthInfo;
import com.xiaomi.hm.health.utils.TelephonyUtil;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B\u0007¢\u0006\u0004\b;\u0010<J\b\u0010\u0004\u001a\u00020\u0003H\u0002J!\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J&\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\u0012\u0010\u001d\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016R\u001d\u0010#\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010,\u001a\u00020(8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010+R\u001d\u00101\u001a\u00020-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b/\u00100R\u001d\u00106\u001a\u0002028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010 \u001a\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006>"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhoneFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/core/component/KoinComponent;", "", "G", "", "show", "", "titleRes", "O", "(ZLjava/lang/Integer;)V", "r", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhoneViewSetting;", "config", "Q", "w", "P", "L", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onStart", "onActivityCreated", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhoneViewModel;", "a", "Lkotlin/Lazy;", "t", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhoneViewModel;", "mBtPhoneViewModel", "Lcom/xiaomi/hm/health/databinding/FragmentBtPhoneBinding;", "b", "Lcom/xiaomi/hm/health/databinding/FragmentBtPhoneBinding;", "binding", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/DelayTimeWheelDialog;", "c", "v", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/DelayTimeWheelDialog;", "timeWheelDialog", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", GoogleApiAvailabilityLight.a, "u", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "e", SOAP.XMLNS, "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Landroid/content/DialogInterface$OnClickListener;", "f", "Landroid/content/DialogInterface$OnClickListener;", "dialogClick", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BtPhoneFragment extends Fragment implements KoinComponent {

    @NotNull
    private static final String g = "BtPhoneFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mBtPhoneViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private FragmentBtPhoneBinding binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeWheelDialog;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mLoadingDialog;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final DialogInterface.OnClickListener dialogClick;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LoadingDialog> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog getA() {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(BtPhoneFragment.this.getContext());
            loadingDialogShowDialog.setCancelable(false);
            return loadingDialogShowDialog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ BtPhoneViewSetting a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BtPhoneViewSetting btPhoneViewSetting) {
            super(0);
            this.a = btPhoneViewSetting;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "config changed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String[] strArr) {
            super(0);
            this.a = strArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "there is no needePermissions and needePermissions are : " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Permission a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Permission permission) {
            super(0);
            this.a = permission;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "user operate permission: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "user denied permission";
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "activity is null or alert msg is null; alert msg: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/DelayTimeWheelDialog;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<DelayTimeWheelDialog> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DelayTimeWheelDialog getA() {
            return new DelayTimeWheelDialog(BtPhoneFragment.this.requireContext());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BtPhoneFragment() {
        super(R.layout.fragment_bt_phone);
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneFragment$special$$inlined$viewModels$default$1
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
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BtPhoneViewModel.class);
        Function0<ViewModelStore> function1 = new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneFragment$special$$inlined$viewModels$default$2
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
        };
        final Qualifier qualifier = null;
        this.mBtPhoneViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, orCreateKotlinClass, function1, null);
        this.timeWheelDialog = LazyKt__LazyJVMKt.lazy(new h());
        this.mLoadingDialog = LazyKt__LazyJVMKt.lazy(new a());
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), qualifier, objArr);
            }
        });
        this.dialogClick = new DialogInterface.OnClickListener() { // from class: r80
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BtPhoneFragment.q(this.a, dialogInterface, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(BtPhoneFragment btPhoneFragment, ShowAuthInfo showAuthInfo) {
        if (!showAuthInfo.getShow()) {
            FragmentBtPhoneBinding fragmentBtPhoneBinding = btPhoneFragment.binding;
            Objects.requireNonNull(fragmentBtPhoneBinding);
            fragmentBtPhoneBinding.permissionTips.setVisibility(8);
            return;
        }
        Integer titleRes = showAuthInfo.getTitleRes();
        if (titleRes == null) {
            return;
        }
        int iIntValue = titleRes.intValue();
        FragmentBtPhoneBinding fragmentBtPhoneBinding2 = btPhoneFragment.binding;
        Objects.requireNonNull(fragmentBtPhoneBinding2);
        fragmentBtPhoneBinding2.permissionTips.setVisibility(0);
        FragmentBtPhoneBinding fragmentBtPhoneBinding3 = btPhoneFragment.binding;
        Objects.requireNonNull(fragmentBtPhoneBinding3);
        fragmentBtPhoneBinding3.permissionTips.setTitle(iIntValue);
        btPhoneFragment.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(BtPhoneFragment btPhoneFragment, View view) {
        FragmentActivity activity = btPhoneFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(BtPhoneFragment btPhoneFragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            btPhoneFragment.t().enableBtPhone(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(BtPhoneFragment btPhoneFragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            btPhoneFragment.t().enableAlertDelay(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(BtPhoneFragment btPhoneFragment, View view) {
        btPhoneFragment.P();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.CALL_DELAY_SETTING_VIEW_NUM));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(BtPhoneFragment btPhoneFragment, View view) {
        FragmentKt.findNavController(btPhoneFragment).navigate(R.id.to_contact_fragment);
    }

    private final void G() {
        FragmentBtPhoneBinding fragmentBtPhoneBinding = this.binding;
        Objects.requireNonNull(fragmentBtPhoneBinding);
        fragmentBtPhoneBinding.permissionTips.setActionGoto(new View.OnClickListener() { // from class: s80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BtPhoneFragment.H(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(final BtPhoneFragment btPhoneFragment, View view) {
        final ShowAuthInfo showAuthInfo = btPhoneFragment.t().getShowAuthInfo();
        String[] permission = showAuthInfo.getPermission();
        if (permission != null) {
            if (!(permission.length == 0)) {
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                new RxPermissions(btPhoneFragment.requireActivity()).requestEach((String[]) Arrays.copyOf(permission, permission.length)).subscribe(new Consumer() { // from class: o80
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        BtPhoneFragment.I(this.a, booleanRef, (Permission) obj);
                    }
                }, new Consumer() { // from class: p80
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        BtPhoneFragment.J((Throwable) obj);
                    }
                }, new Action() { // from class: n80
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        BtPhoneFragment.K(this.a, booleanRef, showAuthInfo);
                    }
                });
                return;
            }
        }
        HMLog.info(g, new c(permission));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(BtPhoneFragment btPhoneFragment, Ref.BooleanRef booleanRef, Permission permission) {
        HMLog.info(g, new d(permission));
        if (permission.granted) {
            TelephonyUtil.INSTANCE.preReadContacts(btPhoneFragment.requireContext(), g);
            btPhoneFragment.t().onPermission(permission);
        } else if (permission.shouldShowRequestPermissionRationale) {
            HMLog.info(g, e.a);
        } else {
            booleanRef.element = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(Throwable th) {
        HMLog.warn$default(null, th, f.a, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(BtPhoneFragment btPhoneFragment, Ref.BooleanRef booleanRef, ShowAuthInfo showAuthInfo) {
        btPhoneFragment.O(booleanRef.element, showAuthInfo.getTitleRes());
    }

    private final void L() {
        new AlertDialogFragment.Builder(getContext()).setTitle(R.string.bt_phone_tips).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: q80
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BtPhoneFragment.M(this.a, dialogInterface, i);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: j80
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BtPhoneFragment.N(this.a, dialogInterface, i);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(BtPhoneFragment btPhoneFragment, DialogInterface dialogInterface, int i) {
        FragmentKt.findNavController(btPhoneFragment).navigate(R.id.to_guide_fragment);
        btPhoneFragment.t().resetPairDialogData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(BtPhoneFragment btPhoneFragment, DialogInterface dialogInterface, int i) {
        FragmentBtPhoneBinding fragmentBtPhoneBinding = btPhoneFragment.binding;
        Objects.requireNonNull(fragmentBtPhoneBinding);
        fragmentBtPhoneBinding.btPhoneIv.setChecked(false);
    }

    private final void O(boolean show, Integer titleRes) {
        if (show) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) requireActivity();
            String string = titleRes == null ? null : getString(titleRes.intValue());
            if (appCompatActivity == null || string == null) {
                HMLog.info(g, new g(string));
            } else {
                s().showPermissionDenieDialog(appCompatActivity, string);
            }
        }
    }

    private final void P() {
        v().setListener(this.dialogClick);
        v().show(t().getDelayAlertTime(), getChildFragmentManager());
    }

    private final void Q(BtPhoneViewSetting config) {
        FragmentBtPhoneBinding fragmentBtPhoneBinding = this.binding;
        Objects.requireNonNull(fragmentBtPhoneBinding);
        fragmentBtPhoneBinding.btPhoneIv.setChecked(config.getBtPhoneEnable());
        FragmentBtPhoneBinding fragmentBtPhoneBinding2 = this.binding;
        Objects.requireNonNull(fragmentBtPhoneBinding2);
        fragmentBtPhoneBinding2.delayIv.setChecked(config.getDelayAlertEnable());
        if (config.getDeviceEnable()) {
            FragmentBtPhoneBinding fragmentBtPhoneBinding3 = this.binding;
            Objects.requireNonNull(fragmentBtPhoneBinding3);
            fragmentBtPhoneBinding3.btPhoneIv.setEnabled(true);
            FragmentBtPhoneBinding fragmentBtPhoneBinding4 = this.binding;
            Objects.requireNonNull(fragmentBtPhoneBinding4);
            fragmentBtPhoneBinding4.delayIv.setEnabled(config.getBtPhoneEnable());
            FragmentBtPhoneBinding fragmentBtPhoneBinding5 = this.binding;
            Objects.requireNonNull(fragmentBtPhoneBinding5);
            fragmentBtPhoneBinding5.delayTimeIv.setEnabled(config.getBtPhoneEnable() && config.getDelayAlertEnable());
            FragmentBtPhoneBinding fragmentBtPhoneBinding6 = this.binding;
            Objects.requireNonNull(fragmentBtPhoneBinding6);
            fragmentBtPhoneBinding6.contactIv.setEnabled(config.getContactPermissionGained());
        } else {
            FragmentBtPhoneBinding fragmentBtPhoneBinding7 = this.binding;
            Objects.requireNonNull(fragmentBtPhoneBinding7);
            fragmentBtPhoneBinding7.btPhoneIv.setEnabled(false);
            FragmentBtPhoneBinding fragmentBtPhoneBinding8 = this.binding;
            Objects.requireNonNull(fragmentBtPhoneBinding8);
            fragmentBtPhoneBinding8.delayIv.setEnabled(false);
            FragmentBtPhoneBinding fragmentBtPhoneBinding9 = this.binding;
            Objects.requireNonNull(fragmentBtPhoneBinding9);
            fragmentBtPhoneBinding9.delayTimeIv.setEnabled(false);
            FragmentBtPhoneBinding fragmentBtPhoneBinding10 = this.binding;
            Objects.requireNonNull(fragmentBtPhoneBinding10);
            fragmentBtPhoneBinding10.contactIv.setEnabled(false);
        }
        FragmentBtPhoneBinding fragmentBtPhoneBinding11 = this.binding;
        Objects.requireNonNull(fragmentBtPhoneBinding11);
        ListTile listTile = fragmentBtPhoneBinding11.delayTimeIv;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        listTile.setTips(String.format(getString(R.string.incoming_call_delay_alert_tips), Arrays.copyOf(new Object[]{String.valueOf(config.getDelayAlertTime())}, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(BtPhoneFragment btPhoneFragment, DialogInterface dialogInterface, int i) {
        if (i == -1) {
            int currentDelay = btPhoneFragment.v().getCurrentDelay();
            FragmentBtPhoneBinding fragmentBtPhoneBinding = btPhoneFragment.binding;
            Objects.requireNonNull(fragmentBtPhoneBinding);
            ListTile listTile = fragmentBtPhoneBinding.delayTimeIv;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            listTile.setTips(String.format(btPhoneFragment.getString(R.string.incoming_call_delay_alert_tips), Arrays.copyOf(new Object[]{String.valueOf(currentDelay)}, 1)));
            btPhoneFragment.t().changeAlertDelayTime(currentDelay);
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.CALL_OUT_DELAY_SETTING).setValue(currentDelay + SOAP.XMLNS));
        }
    }

    private final void r() {
        FragmentBtPhoneBinding fragmentBtPhoneBinding = this.binding;
        Objects.requireNonNull(fragmentBtPhoneBinding);
        fragmentBtPhoneBinding.btPhoneIv.setEnabled(false);
        FragmentBtPhoneBinding fragmentBtPhoneBinding2 = this.binding;
        Objects.requireNonNull(fragmentBtPhoneBinding2);
        fragmentBtPhoneBinding2.delayIv.setEnabled(false);
        FragmentBtPhoneBinding fragmentBtPhoneBinding3 = this.binding;
        Objects.requireNonNull(fragmentBtPhoneBinding3);
        fragmentBtPhoneBinding3.delayTimeIv.setEnabled(false);
        FragmentBtPhoneBinding fragmentBtPhoneBinding4 = this.binding;
        Objects.requireNonNull(fragmentBtPhoneBinding4);
        fragmentBtPhoneBinding4.contactIv.setEnabled(false);
    }

    private final DeviceUtilsApi s() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    private final BtPhoneViewModel t() {
        return (BtPhoneViewModel) this.mBtPhoneViewModel.getValue();
    }

    private final LoadingDialog u() {
        return (LoadingDialog) this.mLoadingDialog.getValue();
    }

    private final DelayTimeWheelDialog v() {
        return (DelayTimeWheelDialog) this.timeWheelDialog.getValue();
    }

    private final void w() {
        BTStatusFragment.newInstance(R.id.container, getChildFragmentManager()).setBLEStatusListener(t().getBleStatusListener());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(BtPhoneFragment btPhoneFragment, BtPhoneViewSetting btPhoneViewSetting) {
        HMLog.info(g, new b(btPhoneViewSetting));
        btPhoneFragment.Q(btPhoneViewSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(BtPhoneFragment btPhoneFragment, Boolean bool) {
        if (bool.booleanValue()) {
            btPhoneFragment.L();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(BtPhoneFragment btPhoneFragment, Boolean bool) {
        if (bool.booleanValue() && !btPhoneFragment.u().isShowing()) {
            btPhoneFragment.u().show();
        } else {
            if (bool.booleanValue() || !btPhoneFragment.u().isShowing()) {
                return;
            }
            btPhoneFragment.u().dismiss();
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
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t().getBtPhoneConfigData().observe(getViewLifecycleOwner(), new Observer() { // from class: y80
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BtPhoneFragment.x(this.a, (BtPhoneViewSetting) obj);
            }
        });
        t().getShowPairDialogData().observe(getViewLifecycleOwner(), new Observer() { // from class: l80
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BtPhoneFragment.y(this.a, (Boolean) obj);
            }
        });
        t().getLoadingData().observe(getViewLifecycleOwner(), new Observer() { // from class: m80
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BtPhoneFragment.z(this.a, (Boolean) obj);
            }
        });
        t().getShowAuthInfoData().observe(getViewLifecycleOwner(), new Observer() { // from class: k80
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BtPhoneFragment.A(this.a, (ShowAuthInfo) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        if (viewOnCreateView == null) {
            return null;
        }
        this.binding = FragmentBtPhoneBinding.bind(viewOnCreateView);
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        t().checkAuth();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        w();
        FragmentBtPhoneBinding fragmentBtPhoneBinding = this.binding;
        Objects.requireNonNull(fragmentBtPhoneBinding);
        fragmentBtPhoneBinding.titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: u80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BtPhoneFragment.B(this.a, view2);
            }
        });
        FragmentBtPhoneBinding fragmentBtPhoneBinding2 = this.binding;
        Objects.requireNonNull(fragmentBtPhoneBinding2);
        fragmentBtPhoneBinding2.btPhoneIv.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: w80
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                BtPhoneFragment.C(this.a, compoundButton, z);
            }
        });
        FragmentBtPhoneBinding fragmentBtPhoneBinding3 = this.binding;
        Objects.requireNonNull(fragmentBtPhoneBinding3);
        fragmentBtPhoneBinding3.delayIv.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: x80
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                BtPhoneFragment.D(this.a, compoundButton, z);
            }
        });
        FragmentBtPhoneBinding fragmentBtPhoneBinding4 = this.binding;
        Objects.requireNonNull(fragmentBtPhoneBinding4);
        fragmentBtPhoneBinding4.delayTimeIv.setOnClickListener(new View.OnClickListener() { // from class: t80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BtPhoneFragment.E(this.a, view2);
            }
        });
        FragmentBtPhoneBinding fragmentBtPhoneBinding5 = this.binding;
        Objects.requireNonNull(fragmentBtPhoneBinding5);
        fragmentBtPhoneBinding5.contactIv.setOnClickListener(new View.OnClickListener() { // from class: v80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BtPhoneFragment.F(this.a, view2);
            }
        });
        G();
        FragmentBtPhoneBinding fragmentBtPhoneBinding6 = this.binding;
        Objects.requireNonNull(fragmentBtPhoneBinding6);
        fragmentBtPhoneBinding6.contactIv.setVisibility(HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(36) ? 0 : 8);
    }
}
