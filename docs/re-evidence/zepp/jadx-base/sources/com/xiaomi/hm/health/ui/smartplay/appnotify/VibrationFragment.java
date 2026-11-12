package com.xiaomi.hm.health.ui.smartplay.appnotify;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.devicex.R;
import com.huami.devicex.databinding.FragmentVibrationBinding;
import com.huami.femalehealth.uilib.helper.ExtKt;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.widget.toast.CustomToast;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/VibrationFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "", "onViewCreated", "Lcom/xiaomi/hm/health/ui/smartplay/appnotify/ContactItemViewModel;", "a", "Lkotlin/Lazy;", "c", "()Lcom/xiaomi/hm/health/ui/smartplay/appnotify/ContactItemViewModel;", "mViewModel", "Lcom/huami/devicex/databinding/FragmentVibrationBinding;", "b", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "()Lcom/huami/devicex/databinding/FragmentVibrationBinding;", "mViewBinding", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class VibrationFragment extends Fragment {
    public static final /* synthetic */ KProperty<Object>[] c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ContactItemViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.ui.smartplay.appnotify.VibrationFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return this.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.ui.smartplay.appnotify.VibrationFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            return this.requireActivity().getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty mViewBinding = FragmentViewBindingKt.viewBinding(new VibrationFragment$special$$inlined$viewBinding$1(new InflateViewBinder(FragmentVibrationBinding.class)));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ int a;
        public final /* synthetic */ List<Integer> b;
        public final /* synthetic */ VibrationFragment c;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.smartplay.appnotify.VibrationFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C1030a extends Lambda implements Function1<Integer, Unit> {
            public final /* synthetic */ VibrationFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1030a(VibrationFragment vibrationFragment) {
                super(1);
                this.a = vibrationFragment;
            }

            public final void a(int i) {
                this.a.c().newVibration(i);
                this.a.c().vibrate(i);
                CustomToast.showShort(this.a.requireContext(), this.a.requireContext().getString(R.string.toast_vibrating));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                a(num.intValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, List<Integer> list, VibrationFragment vibrationFragment) {
            super(0);
            this.a = i;
            this.b = list;
            this.c = vibrationFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VibrationListAdapter vibrationListAdapter = new VibrationListAdapter(this.a, this.b);
            vibrationListAdapter.setOnSelectListener(new C1030a(this.c));
            this.c.b().rvVibration.setLayoutManager(new LinearLayoutManager(this.c.getContext(), 1, false));
            this.c.b().rvVibration.setAdapter(vibrationListAdapter);
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(VibrationFragment.class), "mViewBinding", "getMViewBinding()Lcom/huami/devicex/databinding/FragmentVibrationBinding;"));
        c = kPropertyArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentVibrationBinding b() {
        return (FragmentVibrationBinding) this.mViewBinding.getValue(this, c[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactItemViewModel c() {
        return (ContactItemViewModel) this.mViewModel.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return b().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        Integer numValueOf = arguments == null ? null : Integer.valueOf(arguments.getInt(ContactSettingItemActivity.KEY_VIBRATION));
        int iM3453default = numValueOf == null ? Vibration.INSTANCE.m3453default() : numValueOf.intValue();
        List<Integer> listSupportVibrations = c().supportVibrations();
        if (listSupportVibrations == null) {
            return;
        }
        ExtKt.runOnUiThread(new a(iM3453default, listSupportVibrations, this));
    }
}
