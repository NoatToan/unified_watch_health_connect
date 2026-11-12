package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.gesture;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p010navigation.fragment.FragmentKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.devicex.databinding.FragmentGuestureTrainingBinding;
import com.huami.tools.log.HMLog;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.xiaomi.hm.health.device.setting.ui.subview.AbstractDeviceFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.gesture.GestureTrainStateVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.gesture.TrainingFragment;
import com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u001a\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/TrainingFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/AbstractDeviceFragment;", "", "enable", "", "text", "Lkotlin/Function0;", "", "action", "g", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/huami/devicex/databinding/FragmentGuestureTrainingBinding;", "Lcom/huami/devicex/databinding/FragmentGuestureTrainingBinding;", "_binding", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureViewModel;", "h", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureViewModel;", "viewModel", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TrainingFragment extends AbstractDeviceFragment {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private FragmentGuestureTrainingBinding _binding;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(GestureViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.gesture.TrainingFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelStore getA() {
            return this.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.gesture.TrainingFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.Factory getA() {
            return this.requireActivity().getDefaultViewModelProviderFactory();
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GestureTrainState.values().length];
            iArr[GestureTrainState.IDLE.ordinal()] = 1;
            iArr[GestureTrainState.TRAINING.ordinal()] = 2;
            iArr[GestureTrainState.TRAIN_COMPLETE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            TrainingFragment.this.d().updateGestureTrainState(GestureType.INSTANCE.fromValue(this.b), GestureTrainState.TRAINING);
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "init device error.";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GestureViewModel d() {
        return (GestureViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(TrainingFragment trainingFragment, View view) {
        FragmentKt.findNavController(trainingFragment).navigateUp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(TrainingFragment trainingFragment, GestureTrainStateVo gestureTrainStateVo) {
        if (gestureTrainStateVo == null) {
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[gestureTrainStateVo.getTrainState().ordinal()];
        if (i == 1) {
            FragmentGuestureTrainingBinding fragmentGuestureTrainingBinding = trainingFragment._binding;
            Objects.requireNonNull(fragmentGuestureTrainingBinding);
            fragmentGuestureTrainingBinding.btnNextStep.setEnabled(true);
            FragmentGuestureTrainingBinding fragmentGuestureTrainingBinding2 = trainingFragment._binding;
            Objects.requireNonNull(fragmentGuestureTrainingBinding2);
            fragmentGuestureTrainingBinding2.btnNextStep.setText(trainingFragment.getString(R.string.gesture_start_train));
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            new LoadingDialogHelper(trainingFragment.getActivity()).setSuccess(R.string.gesture_enabled);
            FragmentKt.findNavController(trainingFragment).navigateUp();
            return;
        }
        FragmentGuestureTrainingBinding fragmentGuestureTrainingBinding3 = trainingFragment._binding;
        Objects.requireNonNull(fragmentGuestureTrainingBinding3);
        fragmentGuestureTrainingBinding3.btnNextStep.setEnabled(false);
        FragmentGuestureTrainingBinding fragmentGuestureTrainingBinding4 = trainingFragment._binding;
        Objects.requireNonNull(fragmentGuestureTrainingBinding4);
        fragmentGuestureTrainingBinding4.btnNextStep.setText(trainingFragment.getString(R.string.gesture_training));
    }

    private final void g(boolean enable, String text, final Function0<Unit> action) {
        FragmentGuestureTrainingBinding fragmentGuestureTrainingBinding = this._binding;
        Objects.requireNonNull(fragmentGuestureTrainingBinding);
        AppCompatButton appCompatButton = fragmentGuestureTrainingBinding.btnNextStep;
        appCompatButton.setEnabled(enable);
        appCompatButton.setText(text);
        appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: vv7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingFragment.h(action, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Function0 function0, View view) {
        function0.getA();
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.AbstractDeviceFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("title")) != null) {
            str = string;
        }
        Bundle arguments2 = getArguments();
        int i = arguments2 == null ? 0 : arguments2.getInt("type");
        FragmentGuestureTrainingBinding fragmentGuestureTrainingBinding = this._binding;
        Objects.requireNonNull(fragmentGuestureTrainingBinding);
        fragmentGuestureTrainingBinding.toolbar.setTitle(str);
        FragmentGuestureTrainingBinding fragmentGuestureTrainingBinding2 = this._binding;
        Objects.requireNonNull(fragmentGuestureTrainingBinding2);
        fragmentGuestureTrainingBinding2.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: uv7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TrainingFragment.e(this.a, view2);
            }
        });
        g(true, getString(R.string.gesture_start_train), new a(i));
        DeviceFeatureViewModel deviceFeatureViewModel = getDeviceFeatureViewModel();
        if ((deviceFeatureViewModel == null ? null : deviceFeatureViewModel.findDevice()) == null) {
            HMLog.error$default(null, null, null, b.a, 7, null);
        }
        d().getGestureTrainState().observe(getViewLifecycleOwner(), new Observer() { // from class: wv7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TrainingFragment.f(this.a, (GestureTrainStateVo) obj);
            }
        });
        d().queryGestureTrainState(i);
    }
}
