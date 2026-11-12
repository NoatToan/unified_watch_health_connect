package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.gesture;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p010navigation.NavController;
import androidx.p010navigation.fragment.FragmentKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.devicex.R;
import com.huami.devicex.databinding.FragmentGestureBinding;
import com.xiaomi.hm.health.device.setting.ui.subview.AbstractDeviceFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.gesture.GestureFragment;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/AbstractDeviceFragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "onResume", "Lcom/huami/devicex/databinding/FragmentGestureBinding;", "g", "Lcom/huami/devicex/databinding/FragmentGestureBinding;", "_binding", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureViewModel;", "h", "Lkotlin/Lazy;", "e", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureViewModel;", "viewModel", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class GestureFragment extends AbstractDeviceFragment {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private FragmentGestureBinding _binding;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(GestureViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.gesture.GestureFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return this.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.gesture.GestureFragment$special$$inlined$activityViewModels$default$2
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GestureType.values().length];
            iArr[GestureType.GESTURE_TYPE_SQUEEZE.ordinal()] = 1;
            iArr[GestureType.GESTURE_TYPE_TAP.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final GestureViewModel e() {
        return (GestureViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(GestureFragment gestureFragment, View view) {
        FragmentKt.findNavController(gestureFragment).navigateUp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(GestureFragment gestureFragment, List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            GestureStatusVo gestureStatusVo = (GestureStatusVo) it2.next();
            int i = WhenMappings.$EnumSwitchMapping$0[gestureStatusVo.getGesture().ordinal()];
            if (i == 1) {
                FragmentGestureBinding fragmentGestureBinding = gestureFragment._binding;
                Objects.requireNonNull(fragmentGestureBinding);
                fragmentGestureBinding.gestureFist.setTitle(gestureFragment.getString(R.string.gesture_fist));
                FragmentGestureBinding fragmentGestureBinding2 = gestureFragment._binding;
                Objects.requireNonNull(fragmentGestureBinding2);
                fragmentGestureBinding2.gestureFist.setChecked(gestureStatusVo.getStatus());
            } else if (i == 2) {
                FragmentGestureBinding fragmentGestureBinding3 = gestureFragment._binding;
                Objects.requireNonNull(fragmentGestureBinding3);
                fragmentGestureBinding3.gestureKnock.setTitle(gestureFragment.getString(R.string.gesture_knock));
                FragmentGestureBinding fragmentGestureBinding4 = gestureFragment._binding;
                Objects.requireNonNull(fragmentGestureBinding4);
                fragmentGestureBinding4.gestureKnock.setChecked(gestureStatusVo.getStatus() == gestureStatusVo.getStatus());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(GestureFragment gestureFragment, CompoundButton compoundButton, boolean z) {
        if (!z) {
            gestureFragment.e().disableGesture(GestureType.GESTURE_TYPE_SQUEEZE.getType());
            return;
        }
        NavController navControllerFindNavController = FragmentKt.findNavController(gestureFragment);
        int i = R.id.action_to_gesture_training;
        Bundle bundle = new Bundle();
        bundle.putString("title", gestureFragment.getString(R.string.gesture_fist));
        bundle.putInt("type", GestureType.GESTURE_TYPE_SQUEEZE.getType());
        Unit unit = Unit.INSTANCE;
        navControllerFindNavController.navigate(i, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(GestureFragment gestureFragment, CompoundButton compoundButton, boolean z) {
        if (!z) {
            gestureFragment.e().disableGesture(GestureType.GESTURE_TYPE_TAP.getType());
            return;
        }
        NavController navControllerFindNavController = FragmentKt.findNavController(gestureFragment);
        int i = R.id.action_to_gesture_training;
        Bundle bundle = new Bundle();
        bundle.putString("title", gestureFragment.getString(R.string.gesture_knock));
        bundle.putInt("type", GestureType.GESTURE_TYPE_TAP.getType());
        Unit unit = Unit.INSTANCE;
        navControllerFindNavController.navigate(i, bundle);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.AbstractDeviceFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        e().queryAllGestureState();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentGestureBinding fragmentGestureBinding = this._binding;
        Objects.requireNonNull(fragmentGestureBinding);
        fragmentGestureBinding.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: lf2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GestureFragment.f(this.a, view2);
            }
        });
        e().getSwitchStateLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: of2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                GestureFragment.g(this.a, (List) obj);
            }
        });
        FragmentGestureBinding fragmentGestureBinding2 = this._binding;
        Objects.requireNonNull(fragmentGestureBinding2);
        fragmentGestureBinding2.gestureFist.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: nf2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                GestureFragment.h(this.a, compoundButton, z);
            }
        });
        FragmentGestureBinding fragmentGestureBinding3 = this._binding;
        Objects.requireNonNull(fragmentGestureBinding3);
        fragmentGestureBinding3.gestureKnock.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: mf2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                GestureFragment.i(this.a, compoundButton, z);
            }
        });
    }
}
