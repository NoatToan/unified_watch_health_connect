package com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.StringRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p010navigation.NavController;
import androidx.p010navigation.fragment.FragmentKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\b&\u0018\u00002\u00020\u0001:\u0001MB!\u0012\u0006\u00104\u001a\u00020/\u0012\u0006\u0010:\u001a\u000205\u0012\b\b\u0001\u0010=\u001a\u00020\u0019¢\u0006\u0004\bK\u0010LJ\b\u0010\u0003\u001a\u00020\u0002H\u0004J@\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\u000e\b\n\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\n\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006H\u0086\bø\u0001\u0000J0\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\u0010\b\n\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006H\u0087\bø\u0001\u0000J&\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J%\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0018*\u0004\u0018\u00010\u00142\b\b\u0001\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010 \u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dJ\b\u0010!\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010$\u001a\u00020#2\b\b\u0001\u0010\"\u001a\u00020\u0019J\u0006\u0010&\u001a\u00020%J\u001a\u0010(\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&J\u0012\u0010)\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&J\b\u0010+\u001a\u00020*H&J\u0012\u0010.\u001a\u00020\u00162\b\u0010-\u001a\u0004\u0018\u00010,H&R\u001c\u00104\u001a\u00020/8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010:\u001a\u0002058\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0016\u0010=\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R$\u0010F\u001a\u0004\u0018\u00010\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bA\u0010?\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001c\u0010J\u001a\u00020/8@@\u0001X\u0081\u0004¢\u0006\f\u0012\u0004\bH\u0010I\u001a\u0004\bG\u00103\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006N"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneSettingStubView;", "", "Landroidx/lifecycle/LifecycleOwner;", "getViewLifeCycleOwner", "Landroidx/lifecycle/ViewModel;", "VM", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStoreOwner;", "ownerProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Lkotlin/Lazy;", "viewModels", "activityViewModels", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "", "onResume", ExifInterface.GPS_DIRECTION_TRUE, "", "id", "findViewById", "(I)Landroid/view/View;", "", "show", "setVisibility", "showLoading", "isShown", "resId", "", "getString", "Landroidx/navigation/NavController;", "findNavController", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onActivityCreated", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/IController;", "getViewController", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;", "authInfo", "onPermissionTipClick", "Landroidx/fragment/app/Fragment;", "a", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "fragment", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneSettingStubView$IOnStubViewListener;", "b", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneSettingStubView$IOnStubViewListener;", "getListener", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneSettingStubView$IOnStubViewListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "c", LogUtil.I, "layoutId", GoogleApiAvailabilityLight.a, "Landroid/view/View;", "containerView", "e", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "rootView", "getAccess$fragment", "getAccess$fragment$annotations", "()V", "access$fragment", "<init>", "(Landroidx/fragment/app/Fragment;Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneSettingStubView$IOnStubViewListener;I)V", "IOnStubViewListener", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public abstract class PhoneSettingStubView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Fragment fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IOnStubViewListener listener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int layoutId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private View containerView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private View rootView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneSettingStubView$IOnStubViewListener;", "", "", "show", "", "showLoading", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public interface IOnStubViewListener {
        void showLoading(boolean show);
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneSettingStubView$viewModels$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass1 extends Lambda implements Function0<Fragment> {
        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Fragment invoke() {
            return PhoneSettingStubView.this.getFragment();
        }
    }

    public PhoneSettingStubView(@NotNull Fragment fragment, @NotNull IOnStubViewListener iOnStubViewListener, @LayoutRes int i) {
        this.fragment = fragment;
        this.listener = iOnStubViewListener;
        this.layoutId = i;
    }

    public static /* synthetic */ Lazy activityViewModels$default(PhoneSettingStubView phoneSettingStubView, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: activityViewModels");
        }
        if ((i & 1) != 0) {
            function0 = null;
        }
        Fragment fragment = phoneSettingStubView.getFragment();
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        PhoneSettingStubView$activityViewModels$$inlined$activityViewModels$1 phoneSettingStubView$activityViewModels$$inlined$activityViewModels$1 = new PhoneSettingStubView$activityViewModels$$inlined$activityViewModels$1(fragment);
        if (function0 == null) {
            function0 = new PhoneSettingStubView$activityViewModels$$inlined$activityViewModels$2(fragment);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, orCreateKotlinClass, phoneSettingStubView$activityViewModels$$inlined$activityViewModels$1, function0);
    }

    @PublishedApi
    public static /* synthetic */ void getAccess$fragment$annotations() {
    }

    public static /* synthetic */ Lazy viewModels$default(PhoneSettingStubView phoneSettingStubView, Function0 function0, Function0 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: viewModels");
        }
        if ((i & 1) != 0) {
            function0 = phoneSettingStubView.new AnonymousClass1();
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        Fragment fragment = phoneSettingStubView.getFragment();
        Intrinsics.reifiedOperationMarker(4, "VM");
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, Reflection.getOrCreateKotlinClass(ViewModel.class), new PhoneSettingStubView$viewModels$$inlined$viewModels$1(function0), function1);
    }

    @MainThread
    public final /* synthetic */ <VM extends ViewModel> Lazy<VM> activityViewModels(Function0<? extends ViewModelProvider.Factory> factoryProducer) {
        Fragment fragment = getFragment();
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        PhoneSettingStubView$activityViewModels$$inlined$activityViewModels$1 phoneSettingStubView$activityViewModels$$inlined$activityViewModels$1 = new PhoneSettingStubView$activityViewModels$$inlined$activityViewModels$1(fragment);
        if (factoryProducer == null) {
            factoryProducer = new PhoneSettingStubView$activityViewModels$$inlined$activityViewModels$2(fragment);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, orCreateKotlinClass, phoneSettingStubView$activityViewModels$$inlined$activityViewModels$1, factoryProducer);
    }

    @NotNull
    public final NavController findNavController() {
        return FragmentKt.findNavController(this.fragment);
    }

    @Nullable
    public final <T extends View> T findViewById(@IdRes int id) {
        View view = this.rootView;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(id);
    }

    @NotNull
    /* JADX INFO: renamed from: getAccess$fragment, reason: from getter */
    public final Fragment getFragment() {
        return this.fragment;
    }

    @NotNull
    public final Fragment getFragment() {
        return this.fragment;
    }

    @NotNull
    public final IOnStubViewListener getListener() {
        return this.listener;
    }

    @Nullable
    public final View getRootView() {
        return this.rootView;
    }

    @NotNull
    public final String getString(@StringRes int resId) {
        return this.fragment.getString(resId);
    }

    @NotNull
    public abstract IController getViewController();

    @NotNull
    public final LifecycleOwner getViewLifeCycleOwner() {
        return this.fragment.getViewLifecycleOwner();
    }

    public boolean isShown() {
        View view = this.containerView;
        return view != null && view.getVisibility() == 0;
    }

    public abstract void onActivityCreated(@Nullable Bundle savedInstanceState);

    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.containerView = container;
        View viewInflate = inflater.inflate(this.layoutId, container, false);
        this.rootView = viewInflate;
        return viewInflate;
    }

    public abstract void onPermissionTipClick(@Nullable ShowAuthInfo authInfo);

    public void onResume() {
    }

    public abstract void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState);

    public final void setRootView(@Nullable View view) {
        this.rootView = view;
    }

    public final void setVisibility(boolean show) {
        View view = this.containerView;
        if (view == null) {
            return;
        }
        view.setVisibility(show ? 0 : 8);
    }

    public void show(boolean show) {
        boolean zIsShown = isShown();
        if (zIsShown && show) {
            return;
        }
        if (zIsShown || show) {
            setVisibility(show);
        }
    }

    public final void showLoading(boolean show) {
        this.listener.showLoading(show);
    }

    public final /* synthetic */ <VM extends ViewModel> Lazy<VM> viewModels(Function0<? extends ViewModelStoreOwner> ownerProducer, Function0<? extends ViewModelProvider.Factory> factoryProducer) {
        Fragment fragment = getFragment();
        Intrinsics.reifiedOperationMarker(4, "VM");
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, Reflection.getOrCreateKotlinClass(ViewModel.class), new PhoneSettingStubView$viewModels$$inlined$viewModels$1(ownerProducer), factoryProducer);
    }
}
