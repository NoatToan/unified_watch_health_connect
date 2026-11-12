package com.huami.device.feature.health.ui.bloodpressure.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p010navigation.fragment.FragmentKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.health.bloodpressure_ui.R;
import com.huami.device.feature.health.ui.bloodpressure.fragment.BloodPressureMeasureFragment;
import com.huami.device.feature.health.ui.bloodpressure.model.BloodPressureMeasureStatus;
import com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel;
import com.huami.device.feature.health.ui.view.BloodPressureMeasureProgress;
import com.huami.device.feature.health.util.BloodPressureExtKt;
import com.huami.tools.log.HMLog;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/fragment/BloodPressureMeasureFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "initViewModel", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureMeasureStatus;", "status", "", "times", GoogleApiAvailabilityLight.b, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/device/feature/health/ui/bloodpressure/viewmodel/BloodPressureCorrectViewModel;", "a", "Lkotlin/Lazy;", "g", "()Lcom/huami/device/feature/health/ui/bloodpressure/viewmodel/BloodPressureCorrectViewModel;", "mViewModel", "b", LogUtil.I, "mTotalRestTimes", "", "c", "Z", "mNeedRest", "<init>", "()V", "Companion", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureMeasureFragment extends Fragment {

    @NotNull
    public static final String NEED_REST_PARAM = "need_rest";

    @NotNull
    private static final String d = "BloodPressureMeasureFragment";
    private static long e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BloodPressureCorrectViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.device.feature.health.ui.bloodpressure.fragment.BloodPressureMeasureFragment$special$$inlined$activityViewModels$default$1
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
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.device.feature.health.ui.bloodpressure.fragment.BloodPressureMeasureFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mTotalRestTimes = 300;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean mNeedRest = true;

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
            return "user measure over time,start measure time:" + BloodPressureMeasureFragment.e;
        }
    }

    private final BloodPressureCorrectViewModel g() {
        return (BloodPressureCorrectViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(BloodPressureMeasureFragment bloodPressureMeasureFragment, View view) {
        bloodPressureMeasureFragment.mTotalRestTimes = 60;
        if (bloodPressureMeasureFragment.g().checkDeviceConnect()) {
            bloodPressureMeasureFragment.g().startMeasure();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(BloodPressureMeasureFragment bloodPressureMeasureFragment, View view) {
        bloodPressureMeasureFragment.mTotalRestTimes = 60;
        if (bloodPressureMeasureFragment.g().checkDeviceConnect()) {
            bloodPressureMeasureFragment.g().startMeasure();
        }
    }

    private final void initView() {
        View view = getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.btn_skip_rest))).setOnClickListener(new View.OnClickListener() { // from class: h10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BloodPressureMeasureFragment.h(this.a, view2);
            }
        });
        View view2 = getView();
        ((Button) (view2 == null ? null : view2.findViewById(R.id.btn_start))).setOnClickListener(new View.OnClickListener() { // from class: g10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                BloodPressureMeasureFragment.i(this.a, view3);
            }
        });
        View view3 = getView();
        ((Button) (view3 != null ? view3.findViewById(R.id.btn_record) : null)).setOnClickListener(new View.OnClickListener() { // from class: i10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                BloodPressureMeasureFragment.j(this.a, view4);
            }
        });
    }

    private final void initViewModel() {
        g().getMeasureTimes().observe(getViewLifecycleOwner(), new Observer() { // from class: l10
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureMeasureFragment.k(this.a, (Integer) obj);
            }
        });
        g().getCorrectMeasureStatus().observe(getViewLifecycleOwner(), new Observer() { // from class: j10
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureMeasureFragment.l(this.a, (BloodPressureMeasureStatus) obj);
            }
        });
        g().getRestRemainSeconds().observe(getViewLifecycleOwner(), new Observer() { // from class: k10
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureMeasureFragment.m(this.a, (Integer) obj);
            }
        });
        if (this.mNeedRest) {
            g().startRest(this.mTotalRestTimes);
        } else {
            this.mTotalRestTimes = 60;
            g().startMeasure();
        }
        g().checkMeasureTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(BloodPressureMeasureFragment bloodPressureMeasureFragment, View view) {
        bloodPressureMeasureFragment.mTotalRestTimes = 60;
        if (bloodPressureMeasureFragment.g().checkDeviceConnect()) {
            FragmentKt.findNavController(bloodPressureMeasureFragment).navigate(R.id.measure_to_input);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(BloodPressureMeasureFragment bloodPressureMeasureFragment, Integer num) {
        BloodPressureMeasureStatus value = bloodPressureMeasureFragment.g().getCorrectMeasureStatus().getValue();
        if (value == null) {
            value = BloodPressureMeasureStatus.REST.INSTANCE;
        }
        bloodPressureMeasureFragment.n(value, num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(BloodPressureMeasureFragment bloodPressureMeasureFragment, BloodPressureMeasureStatus bloodPressureMeasureStatus) {
        Integer value = bloodPressureMeasureFragment.g().getMeasureTimes().getValue();
        if (value == null) {
            value = 1;
        }
        bloodPressureMeasureFragment.n(bloodPressureMeasureStatus, value.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(BloodPressureMeasureFragment bloodPressureMeasureFragment, Integer num) {
        View view = bloodPressureMeasureFragment.getView();
        ((BloodPressureMeasureProgress) (view == null ? null : view.findViewById(R.id.rest_progress))).setPercent((num.intValue() * 100) / bloodPressureMeasureFragment.mTotalRestTimes);
        View view2 = bloodPressureMeasureFragment.getView();
        ((Button) (view2 == null ? null : view2.findViewById(R.id.btn_start))).setEnabled(num.intValue() == 0);
        View view3 = bloodPressureMeasureFragment.getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.rest_time))).setText(bloodPressureMeasureFragment.getString(R.string.blood_pressure_rest_time_formatter, Integer.valueOf(num.intValue() / 60), Integer.valueOf(num.intValue() % 60)));
        View view4 = bloodPressureMeasureFragment.getView();
        BloodPressureExtKt.setVisible(view4 != null ? view4.findViewById(R.id.btn_skip_rest) : null, num.intValue() > 0);
    }

    private final void n(BloodPressureMeasureStatus status, int times) {
        if (Intrinsics.areEqual(status, BloodPressureMeasureStatus.REST.INSTANCE)) {
            View view = getView();
            ((BloodPressureMeasureProgress) (view == null ? null : view.findViewById(R.id.rest_progress))).setVisibility(0);
            View view2 = getView();
            ((TextView) (view2 == null ? null : view2.findViewById(R.id.btn_skip_rest))).setVisibility(0);
            if (times > 1) {
                View view3 = getView();
                ((TextView) (view3 == null ? null : view3.findViewById(R.id.measure_summary))).setText(R.string.blood_pressure_measure_rest_summary_one);
                View view4 = getView();
                ((TextView) (view4 == null ? null : view4.findViewById(R.id.measure_title))).setText(R.string.blood_pressure_measure_rest_title_other);
            } else {
                View view5 = getView();
                ((TextView) (view5 == null ? null : view5.findViewById(R.id.measure_summary))).setText(R.string.blood_pressure_measure_rest_summary_five);
                View view6 = getView();
                ((TextView) (view6 == null ? null : view6.findViewById(R.id.measure_title))).setText(R.string.blood_pressure_measure_rest_title);
            }
            View view7 = getView();
            ((TextView) (view7 == null ? null : view7.findViewById(R.id.measure_title))).setText(R.string.blood_pressure_measure_rest_title);
            View view8 = getView();
            ((ImageView) (view8 == null ? null : view8.findViewById(R.id.measure_img))).setImageResource(R.drawable.bg_measure_rest);
            View view9 = getView();
            ((Button) (view9 == null ? null : view9.findViewById(R.id.btn_record))).setVisibility(8);
            View view10 = getView();
            ((Button) (view10 == null ? null : view10.findViewById(R.id.btn_start))).setVisibility(0);
            View view11 = getView();
            ((TextView) (view11 != null ? view11.findViewById(R.id.rest_time) : null)).setVisibility(0);
            return;
        }
        if (!Intrinsics.areEqual(status, BloodPressureMeasureStatus.MEASURE.INSTANCE)) {
            if (Intrinsics.areEqual(status, BloodPressureMeasureStatus.SUCCESS.INSTANCE)) {
                if (g().checkDeviceConnect()) {
                    FragmentKt.findNavController(this).navigate(R.id.measure_to_correct);
                    return;
                }
                return;
            } else {
                if (Intrinsics.areEqual(status, BloodPressureMeasureStatus.DISCONNECT.INSTANCE)) {
                    g().checkDeviceConnect();
                    return;
                }
                return;
            }
        }
        View view12 = getView();
        ((BloodPressureMeasureProgress) (view12 == null ? null : view12.findViewById(R.id.rest_progress))).setVisibility(8);
        View view13 = getView();
        ((TextView) (view13 == null ? null : view13.findViewById(R.id.btn_skip_rest))).setVisibility(8);
        if (1 <= times && times <= 3) {
            View view14 = getView();
            ((TextView) (view14 == null ? null : view14.findViewById(R.id.measure_title))).setText(getResources().getStringArray(R.array.blood_pressure_measure_title)[times - 1]);
        } else {
            View view15 = getView();
            ((TextView) (view15 == null ? null : view15.findViewById(R.id.measure_title))).setText(R.string.blood_pressure_re_measure);
        }
        View view16 = getView();
        ((TextView) (view16 == null ? null : view16.findViewById(R.id.measure_summary))).setText(R.string.blood_pressure_measure_summary);
        View view17 = getView();
        ((ImageView) (view17 == null ? null : view17.findViewById(R.id.measure_img))).setImageResource(R.drawable.bg_measure);
        View view18 = getView();
        ((Button) (view18 == null ? null : view18.findViewById(R.id.btn_record))).setVisibility(0);
        View view19 = getView();
        ((Button) (view19 == null ? null : view19.findViewById(R.id.btn_start))).setVisibility(8);
        View view20 = getView();
        ((TextView) (view20 != null ? view20.findViewById(R.id.rest_time) : null)).setVisibility(8);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        e = 0L;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blood_pressure_measure, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (e == 0) {
            e = System.currentTimeMillis();
            return;
        }
        if (System.currentTimeMillis() - e >= BloodPressureCorrectViewModel.NEED_RETURN_TIME) {
            HMLog.info(d, a.a);
            FragmentActivity activity = getActivity();
            if (activity == null) {
                return;
            }
            activity.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        this.mNeedRest = arguments != null ? arguments.getBoolean(NEED_REST_PARAM, true) : true;
        initView();
        initViewModel();
    }
}
