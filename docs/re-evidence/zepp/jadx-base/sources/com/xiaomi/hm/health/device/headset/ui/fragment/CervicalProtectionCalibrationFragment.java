package com.xiaomi.hm.health.device.headset.ui.fragment;

import android.content.res.ColorStateList;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcherKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.LfType;
import com.xiaomi.hm.health.device.headset.help.MediaController;
import com.xiaomi.hm.health.device.headset.ui.CervicalProtectionActivity;
import com.xiaomi.hm.health.device.headset.ui.fragment.CervicalProtectionCalibrationFragment;
import com.xiaomi.hm.health.device.headset.viewmodel.CalibrationResultCode;
import com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel;
import com.xiaomi.hm.health.imageload.DisplayConfig;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.ext.ImageLoadExtentionsKt;
import de.greenrobot.event.EventBus;
import java.io.IOException;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 42\u00020\u0001:\u000254B\u0007¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003J#\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\u001a\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u001c\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017J\u001a\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017J\u000e\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"J\b\u0010%\u001a\u00020\u0002H\u0016R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00066"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/fragment/CervicalProtectionCalibrationFragment;", "Landroidx/fragment/app/Fragment;", "", "f", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode;", "code", "g", "Lcom/xiaomi/hm/health/device/headset/ui/fragment/CervicalProtectionCalibrationFragment$CaliProcess;", "process", "", "second", com.google.android.exoplayer2.text.ttml.b.r, "(Lcom/xiaomi/hm/health/device/headset/ui/fragment/CervicalProtectionCalibrationFragment$CaliProcess;Ljava/lang/Integer;)V", "", "isSuccessful", "l", "o", "msg", GoogleApiAvailabilityLight.b, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onActivityCreated", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/xiaomi/hm/health/bt/profile/slre/HMLFEvent;", "event", "onEvent", "Lcom/huami/bluetooth/device/HeadsetDevice$HeadsetDeviceState;", "state", "onEventMainThread", "onDestroy", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CervicalProtectionViewModel;", "a", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CervicalProtectionViewModel;", "viewModel", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "b", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "setLoadingDlg", "Lcom/xiaomi/hm/health/device/headset/help/MediaController;", "c", "Lcom/xiaomi/hm/health/device/headset/help/MediaController;", "mediaController", "<init>", "()V", "Companion", "CaliProcess", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class CervicalProtectionCalibrationFragment extends Fragment {

    @NotNull
    private static final String d = "CervicalProtectionCalibrationFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private CervicalProtectionViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog setLoadingDlg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private MediaController mediaController;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/fragment/CervicalProtectionCalibrationFragment$CaliProcess;", "", "<init>", "(Ljava/lang/String;I)V", "NULL", "COUNT_DOWN", "CALIBRATION", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public enum CaliProcess {
        NULL,
        COUNT_DOWN,
        CALIBRATION
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CaliProcess.values().length];
            iArr[CaliProcess.CALIBRATION.ordinal()] = 1;
            iArr[CaliProcess.NULL.ordinal()] = 2;
            iArr[CaliProcess.COUNT_DOWN.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/viewmodel/CalibrationResultCode;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<CalibrationResultCode, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull CalibrationResultCode calibrationResultCode) throws IOException {
            CervicalProtectionCalibrationFragment.this.g(calibrationResultCode);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CalibrationResultCode calibrationResultCode) throws IOException {
            a(calibrationResultCode);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<OnBackPressedCallback, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull OnBackPressedCallback onBackPressedCallback) {
            FragmentKt.findNavController(CervicalProtectionCalibrationFragment.this).popBackStack();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OnBackPressedCallback onBackPressedCallback) {
            a(onBackPressedCallback);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ HMLFEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HMLFEvent hMLFEvent) {
            super(0);
            this.a = hMLFEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onEvent:" + this.a;
        }
    }

    @RequiresApi(21)
    private final void f() throws Throwable {
        CervicalProtectionViewModel cervicalProtectionViewModel = this.viewModel;
        Objects.requireNonNull(cervicalProtectionViewModel);
        if (!cervicalProtectionViewModel.isDualWear()) {
            l(false);
            n(R.string.headset_cervical_protection_calibration_result_unwear, false);
        } else {
            q(this, CaliProcess.COUNT_DOWN, null, 2, null);
            CervicalProtectionViewModel cervicalProtectionViewModel2 = this.viewModel;
            Objects.requireNonNull(cervicalProtectionViewModel2);
            cervicalProtectionViewModel2.calibration(5, new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(21)
    public final void g(CalibrationResultCode code) throws IOException {
        if (!(Intrinsics.areEqual(code, CalibrationResultCode.OutputValue.INSTANCE) ? true : Intrinsics.areEqual(code, CalibrationResultCode.Successful.INSTANCE))) {
            CalibrationResultCode.UnWear unWear = CalibrationResultCode.UnWear.INSTANCE;
            if (!Intrinsics.areEqual(code, unWear)) {
                l(false);
            }
            n(Intrinsics.areEqual(code, unWear) ? R.string.headset_cervical_protection_calibration_result_unwear : R.string.headset_cervical_protection_calibration_result_falied, false);
            q(this, CaliProcess.NULL, null, 2, null);
            return;
        }
        l(true);
        n(R.string.headset_cervical_protection_calibration_result_successful, true);
        View view = getView();
        if (view == null) {
            return;
        }
        view.postDelayed(new Runnable() { // from class: nm0
            @Override // java.lang.Runnable
            public final void run() {
                CervicalProtectionCalibrationFragment.h(this.a);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(CervicalProtectionCalibrationFragment cervicalProtectionCalibrationFragment) {
        FragmentKt.findNavController(cervicalProtectionCalibrationFragment).navigate(R.id.action_cervicalProtectionCalibrationFragment_to_cervicalProtectionDetailFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(CervicalProtectionCalibrationFragment cervicalProtectionCalibrationFragment, View view) {
        FragmentKt.findNavController(cervicalProtectionCalibrationFragment).popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(CervicalProtectionCalibrationFragment cervicalProtectionCalibrationFragment, Pair pair) {
        if (pair == null) {
            return;
        }
        if (((Boolean) pair.getSecond()).booleanValue()) {
            q(cervicalProtectionCalibrationFragment, CaliProcess.CALIBRATION, null, 2, null);
        } else {
            cervicalProtectionCalibrationFragment.p(CaliProcess.COUNT_DOWN, (Integer) pair.getFirst());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(CervicalProtectionCalibrationFragment cervicalProtectionCalibrationFragment, View view) throws Throwable {
        cervicalProtectionCalibrationFragment.f();
    }

    private final void l(boolean isSuccessful) throws IOException {
        String str = isSuccessful ? "calibration_successful.mp3" : "calibration_failed.mp3";
        MediaController mediaController = this.mediaController;
        if (mediaController != null) {
            mediaController.reset();
        }
        MediaController mediaController2 = this.mediaController;
        if (mediaController2 != null) {
            mediaController2.setDataSource(false, str);
        }
        MediaController mediaController3 = this.mediaController;
        if (mediaController3 == null) {
            return;
        }
        mediaController3.prepare(true, new MediaPlayer.OnPreparedListener() { // from class: jm0
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                CervicalProtectionCalibrationFragment.m(this.a, mediaPlayer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(CervicalProtectionCalibrationFragment cervicalProtectionCalibrationFragment, MediaPlayer mediaPlayer) {
        MediaController mediaController = cervicalProtectionCalibrationFragment.mediaController;
        if (mediaController == null) {
            return;
        }
        mediaController.startRing();
    }

    private final void n(@StringRes int msg, boolean isSuccessful) {
        LoadingDialog loadingDialog = this.setLoadingDlg;
        if (loadingDialog == null) {
            return;
        }
        if (!(!loadingDialog.isShowing())) {
            loadingDialog = null;
        }
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.show();
        if (isSuccessful) {
            loadingDialog.setSuccess(getString(msg));
        } else {
            loadingDialog.setFailed(getString(msg));
        }
    }

    private final void o() {
        MediaController mediaController = this.mediaController;
        if (mediaController != null) {
            mediaController.stopRing();
        }
        MediaController mediaController2 = this.mediaController;
        if (mediaController2 != null) {
            mediaController2.release();
        }
        this.mediaController = null;
    }

    @RequiresApi(21)
    private final void p(CaliProcess process, Integer second) {
        String string;
        View view = getView();
        Button button = (Button) (view == null ? null : view.findViewById(R.id.cervical_protection_calibration_btn));
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = 8;
        button.setVisibility(iArr[process.ordinal()] == 1 ? 8 : 0);
        int i2 = iArr[process.ordinal()] == 2 ? R.drawable.private_haydn_cervical_protection_calibration_animator : R.drawable.private_haydn_gif_cervical_calibration;
        View view2 = getView();
        ImageView imageView = (ImageView) (view2 == null ? null : view2.findViewById(R.id.cervical_protection_img));
        try {
            DisplayConfig.ConfigBuilder configBuilderWith = HMImageLoader.with(imageView);
            DisplayConfig.ConfigBuilder.DiskCacheStrategy diskCacheStrategy = DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL;
            configBuilderWith.diskCacheStrategy(diskCacheStrategy).load(i2).diskCacheStrategy(diskCacheStrategy).crossFade().into(imageView);
        } catch (Exception e) {
            HMLog.e(ImageLoadExtentionsKt.TAG, e);
        }
        View view3 = getView();
        View viewFindViewById = view3 == null ? null : view3.findViewById(R.id.cervical_protection_calibration_ing);
        int i3 = WhenMappings.$EnumSwitchMapping$0[process.ordinal()];
        if (i3 != 2 && i3 != 3) {
            i = 0;
        }
        viewFindViewById.setVisibility(i);
        View view4 = getView();
        if ((view4 == null ? null : view4.findViewById(R.id.cervical_protection_calibration_ing)).getVisibility() == 0) {
            View view5 = getView();
            ImageView imageView2 = (ImageView) (view5 == null ? null : view5.findViewById(R.id.bind_headset_search_image));
            try {
                DisplayConfig.ConfigBuilder configBuilderWith2 = HMImageLoader.with(imageView2);
                DisplayConfig.ConfigBuilder.DiskCacheStrategy diskCacheStrategy2 = DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL;
                configBuilderWith2.diskCacheStrategy(diskCacheStrategy2).load(R.drawable.gif_headset_search_loading).diskCacheStrategy(diskCacheStrategy2).crossFade().into(imageView2);
            } catch (Exception e2) {
                HMLog.e(ImageLoadExtentionsKt.TAG, e2);
            }
        }
        int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
        int i4 = iArr2[process.ordinal()];
        int i5 = (i4 == 1 || i4 == 3) ? R.string.headset_cervical_protection_calibration_ing_hint : R.string.headset_cervical_protection_calibration_hint;
        View view6 = getView();
        ((TextView) (view6 != null ? view6.findViewById(R.id.cervical_protection_hint) : null)).setText(getString(i5));
        String string2 = "";
        if (iArr2[process.ordinal()] != 3) {
            string2 = getString(R.string.headset_cervical_protection_calibration_start);
        } else if (second != null && (string = second.toString()) != null) {
            string2 = string;
        }
        int color = iArr2[process.ordinal()] == 3 ? ContextCompat.getColor(requireContext(), R.color.s38) : ContextCompat.getColor(requireContext(), R.color.p4);
        int color2 = iArr2[process.ordinal()] == 3 ? ContextCompat.getColor(requireContext(), R.color.s1) : ContextCompat.getColor(requireContext(), R.color.s10);
        button.setText(string2);
        AppCompatButton appCompatButton = (AppCompatButton) button;
        appCompatButton.setBackgroundTintList(ColorStateList.valueOf(color));
        button.setTextColor(color2);
        appCompatButton.setClickable(process != CaliProcess.COUNT_DOWN);
    }

    public static /* synthetic */ void q(CervicalProtectionCalibrationFragment cervicalProtectionCalibrationFragment, CaliProcess caliProcess, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        cervicalProtectionCalibrationFragment.p(caliProcess, num);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @RequiresApi(21)
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        CervicalProtectionActivity cervicalProtectionActivity;
        super.onActivityCreated(savedInstanceState);
        FragmentActivity activity = getActivity();
        if ((activity == null ? true : activity instanceof CervicalProtectionActivity) && (cervicalProtectionActivity = (CervicalProtectionActivity) getActivity()) != null) {
            cervicalProtectionActivity.setRainbowTitle("");
            cervicalProtectionActivity.setBackClick(new View.OnClickListener() { // from class: km0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CervicalProtectionCalibrationFragment.i(this.a, view);
                }
            });
        }
        OnBackPressedDispatcherKt.addCallback$default(requireActivity().getOnBackPressedDispatcher(), this, false, new b(), 2, null);
        CervicalProtectionViewModel cervicalProtectionViewModel = (CervicalProtectionViewModel) new ViewModelProvider(requireActivity()).get(CervicalProtectionViewModel.class);
        this.viewModel = cervicalProtectionViewModel;
        Objects.requireNonNull(cervicalProtectionViewModel);
        cervicalProtectionViewModel.getCountDown().observe(getViewLifecycleOwner(), new Observer() { // from class: mm0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CervicalProtectionCalibrationFragment.j(this.a, (Pair) obj);
            }
        });
        this.mediaController = new MediaController(requireContext());
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cervical_protection_calibration, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        o();
        EventBus.getDefault().unregister(this);
        CervicalProtectionViewModel cervicalProtectionViewModel = this.viewModel;
        if (cervicalProtectionViewModel != null) {
            Objects.requireNonNull(cervicalProtectionViewModel);
            cervicalProtectionViewModel.cancelCalibration();
            CervicalProtectionViewModel cervicalProtectionViewModel2 = this.viewModel;
            Objects.requireNonNull(cervicalProtectionViewModel2);
            cervicalProtectionViewModel2.closeCalibration();
        }
        super.onDestroy();
    }

    public final void onEvent(@NotNull HMLFEvent event) {
        if (event.getLfType() == LfType.HEAD_NECK_ANGLE_CHANGE || event.getLfType() == LfType.MULTI_DEVICE_CONNECTION_CHANGED) {
            CervicalProtectionViewModel cervicalProtectionViewModel = this.viewModel;
            Objects.requireNonNull(cervicalProtectionViewModel);
            CervicalProtectionViewModel.handleLfEvent$default(cervicalProtectionViewModel, event, null, 2, null);
            HMLog.debug(d, new c(event));
        }
    }

    public final void onEventMainThread(@NotNull HeadsetDevice.HeadsetDeviceState state) {
        CervicalProtectionViewModel cervicalProtectionViewModel = this.viewModel;
        Objects.requireNonNull(cervicalProtectionViewModel);
        CervicalProtectionViewModel.handleLfEvent$default(cervicalProtectionViewModel, null, state, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @RequiresApi(21)
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (this.setLoadingDlg == null) {
            LoadingDialog loadingDialog = new LoadingDialog(requireContext());
            loadingDialog.setCancelable(false);
            Unit unit = Unit.INSTANCE;
            this.setLoadingDlg = loadingDialog;
        }
        View view2 = getView();
        ((Button) (view2 == null ? null : view2.findViewById(R.id.cervical_protection_calibration_btn))).setOnClickListener(new View.OnClickListener() { // from class: lm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) throws Throwable {
                CervicalProtectionCalibrationFragment.k(this.a, view3);
            }
        });
        View view3 = getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.bind_headset_search_hint_text))).setText(getString(R.string.headset_cervical_protection_calibration_ing));
        View view4 = getView();
        ImageView imageView = (ImageView) (view4 != null ? view4.findViewById(R.id.cervical_protection_img) : null);
        try {
            DisplayConfig.ConfigBuilder configBuilderWith = HMImageLoader.with(imageView);
            DisplayConfig.ConfigBuilder.DiskCacheStrategy diskCacheStrategy = DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL;
            configBuilderWith.diskCacheStrategy(diskCacheStrategy).load(R.drawable.private_haydn_cervical_protection_calibration_animator).diskCacheStrategy(diskCacheStrategy).crossFade().into(imageView);
        } catch (Exception e) {
            HMLog.e(ImageLoadExtentionsKt.TAG, e);
        }
    }
}
