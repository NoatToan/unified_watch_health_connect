package com.huami.heartrate.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p008lifecycle.ViewModelStoreOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.health.afppg.model.AtrialFibrillationEventDay;
import com.huami.heartrate.R;
import com.huami.heartrate.chart.HandleDataKt;
import com.huami.heartrate.chart.HeartRateInfo;
import com.huami.heartrate.chart.ShowValue;
import com.huami.heartrate.databinding.HeartRateFragmentDaySubDetailBinding;
import com.huami.heartrate.koin.KoinExtKt;
import com.huami.heartrate.model.HeartRateSection;
import com.huami.heartrate.model.UserOfHeartRate;
import com.huami.heartrate.ui.HeartRateSubDayDetailFragment;
import com.huami.heartrate.utils.ExtensionUtilsKt;
import com.huami.heartrate.utils.HeartRateAnalyticsHelperKt;
import com.huami.heartrate.utils.UIUtilsKt;
import com.huami.heartrate.viewmodel.AtrialFibViewModel;
import com.huami.heartrate.viewmodel.LocalHRDataViewModel;
import com.huami.heartrate.viewmodel.UserInfoViewModel;
import com.huami.midong.ppg.ui.midong.ui.activity.HMAtrialFibrillationHrActivity;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.widget.colorbar.ColorItem;
import com.huami.widget.typeface.TypefaceTextView;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b3\u00104J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J&\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010-\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010,R\u001d\u00102\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0018\u001a\u0004\b0\u00101¨\u00066"}, d2 = {"Lcom/huami/heartrate/ui/HeartRateSubDayDetailFragment;", "Landroidx/fragment/app/Fragment;", "", GoogleApiAvailabilityLight.b, "", "h", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/heartrate/databinding/HeartRateFragmentDaySubDetailBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "r", "()Lcom/huami/heartrate/databinding/HeartRateFragmentDaySubDetailBinding;", "viewBinding", "Lcom/huami/heartrate/viewmodel/UserInfoViewModel;", "b", "Lkotlin/Lazy;", DTransferConstants.SEARCH_KEY, "()Lcom/huami/heartrate/viewmodel/UserInfoViewModel;", "userInfoViewModel", "Lcom/huami/heartrate/viewmodel/LocalHRDataViewModel;", "c", "o", "()Lcom/huami/heartrate/viewmodel/LocalHRDataViewModel;", "localHRDataVM", "Lcom/huami/heartrate/viewmodel/AtrialFibViewModel;", GoogleApiAvailabilityLight.a, "m", "()Lcom/huami/heartrate/viewmodel/AtrialFibViewModel;", "atrialFibViewModel", "", "e", "Ljava/lang/String;", "hrUnitString", "f", "getUserId", "()Ljava/lang/String;", "userId", "", "g", com.google.android.exoplayer2.text.ttml.b.r, "()I", "userAge", "<init>", "()V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateSubDayDetailFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] h;

    @NotNull
    private static final String i = "date";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding = FragmentViewBindingKt.viewBinding(new HeartRateSubDayDetailFragment$special$$inlined$viewBinding$1(new InflateViewBinder(HeartRateFragmentDaySubDetailBinding.class)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy userInfoViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UserInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.heartrate.ui.HeartRateSubDayDetailFragment$special$$inlined$activityViewModels$default$1
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
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.heartrate.ui.HeartRateSubDayDetailFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy localHRDataVM;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy atrialFibViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String hrUnitString;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy userId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy userAge;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/heartrate/ui/HeartRateSubDayDetailFragment$Companion;", "", "", "date", "Lcom/huami/heartrate/ui/HeartRateSubDayDetailFragment;", "newInstance", "", "EXTRA_DATE", "Ljava/lang/String;", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HeartRateSubDayDetailFragment newInstance(long date) {
            HeartRateSubDayDetailFragment heartRateSubDayDetailFragment = new HeartRateSubDayDetailFragment();
            heartRateSubDayDetailFragment.setArguments(BundleKt.bundleOf(TuplesKt.to("date", Long.valueOf(date))));
            return heartRateSubDayDetailFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ViewModelStoreOwner> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner getA() {
            return HeartRateSubDayDetailFragment.this.requireParentFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ViewModelStoreOwner> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner getA() {
            return HeartRateSubDayDetailFragment.this.requireParentFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Integer> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            UserOfHeartRate value = HeartRateSubDayDetailFragment.this.q().getUserInfoLiveData().getValue();
            if (value == null) {
                return 0;
            }
            return value.getUserAge();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            String userId;
            UserOfHeartRate value = HeartRateSubDayDetailFragment.this.q().getUserInfoLiveData().getValue();
            return (value == null || (userId = value.getUserId()) == null) ? "" : userId;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[6];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(HeartRateSubDayDetailFragment.class), "viewBinding", "getViewBinding()Lcom/huami/heartrate/databinding/HeartRateFragmentDaySubDetailBinding;"));
        h = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    public HeartRateSubDayDetailFragment() {
        final b bVar = new b();
        this.localHRDataVM = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(LocalHRDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.heartrate.ui.HeartRateSubDayDetailFragment$special$$inlined$viewModels$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return ((ViewModelStoreOwner) bVar.getA()).getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.heartrate.ui.HeartRateSubDayDetailFragment$localHRDataVM$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelProvider.Factory getA() {
                final HeartRateSubDayDetailFragment heartRateSubDayDetailFragment = this.a;
                return new ViewModelProvider.Factory() { // from class: com.huami.heartrate.ui.HeartRateSubDayDetailFragment$localHRDataVM$3.1
                    @Override // androidx.lifecycle.ViewModelProvider.Factory
                    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
                        return new LocalHRDataViewModel(heartRateSubDayDetailFragment.getUserId());
                    }
                };
            }
        });
        final a aVar = new a();
        this.atrialFibViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AtrialFibViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.heartrate.ui.HeartRateSubDayDetailFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return ((ViewModelStoreOwner) aVar.getA()).getViewModelStore();
            }
        }, null);
        this.userId = LazyKt__LazyJVMKt.lazy(new d());
        this.userAge = LazyKt__LazyJVMKt.lazy(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUserId() {
        return (String) this.userId.getValue();
    }

    private final void h() {
        o().getHrChartDataLiveData().observe(requireParentFragment().getViewLifecycleOwner(), new Observer() { // from class: j04
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HeartRateSubDayDetailFragment.i(this.a, (SparseArray) obj);
            }
        });
        o().getHrMergedDataLiveData().observe(requireParentFragment().getViewLifecycleOwner(), new Observer() { // from class: m04
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HeartRateSubDayDetailFragment.j(this.a, (byte[]) obj);
            }
        });
        o().getRestHeartRateLiveData().observe(requireParentFragment().getViewLifecycleOwner(), new Observer() { // from class: l04
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HeartRateSubDayDetailFragment.k(this.a, (Integer) obj);
            }
        });
        m().getAbnormalHrLiveData().observe(requireParentFragment().getViewLifecycleOwner(), new Observer() { // from class: k04
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HeartRateSubDayDetailFragment.l(this.a, (AtrialFibrillationEventDay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(HeartRateSubDayDetailFragment heartRateSubDayDetailFragment, SparseArray sparseArray) {
        ShowValue showValueFindMaxMinAverage = HandleDataKt.findMaxMinAverage(sparseArray);
        int maxHR = showValueFindMaxMinAverage.getMaxHR();
        int minHR = showValueFindMaxMinAverage.getMinHR();
        heartRateSubDayDetailFragment.r().statisticsView.setDataText(showValueFindMaxMinAverage.getAverageValidValue(), maxHR, minHR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(HeartRateSubDayDetailFragment heartRateSubDayDetailFragment, byte[] bArr) {
        if (!KoinExtKt.getHeartRateDataDelegate().isOpenWholeDayHr(heartRateSubDayDetailFragment.requireContext()) || KoinExtKt.isHollywood()) {
            return;
        }
        HeartRateInfo wholeDayHeartRateData = HandleDataKt.parseWholeDayHeartRateData(bArr, heartRateSubDayDetailFragment.p());
        boolean visibility = wholeDayHeartRateData.getVisibility();
        List<ColorItem> listComponent2 = wholeDayHeartRateData.component2();
        List<HeartRateSection> listComponent3 = wholeDayHeartRateData.component3();
        heartRateSubDayDetailFragment.r().heartRateInfoLayout.setVisibility(visibility ? 0 : 8);
        if (visibility) {
            heartRateSubDayDetailFragment.r().hrWholeDaySection.setColorList(listComponent2);
            heartRateSubDayDetailFragment.r().hrSection.setSections(listComponent3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(HeartRateSubDayDetailFragment heartRateSubDayDetailFragment, Integer num) {
        String strStringFormat;
        TypefaceTextView typefaceTextView = heartRateSubDayDetailFragment.r().hrWholeDayRest;
        if (num.intValue() <= 0) {
            strStringFormat = "--";
        } else {
            String strI18n = ExtensionUtilsKt.i18n(num.intValue());
            String str = heartRateSubDayDetailFragment.hrUnitString;
            Objects.requireNonNull(str);
            strStringFormat = UIUtilsKt.stringFormat(strI18n, str);
        }
        typefaceTextView.setText(strStringFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(HeartRateSubDayDetailFragment heartRateSubDayDetailFragment, AtrialFibrillationEventDay atrialFibrillationEventDay) {
        heartRateSubDayDetailFragment.r().abnormalHeartBeatLayout.setVisibility(KoinExtKt.getHeartRateDataDelegate().isSupportAtrialFib() || atrialFibrillationEventDay.getDuration() > 0 ? 0 : 8);
        heartRateSubDayDetailFragment.r().tvAbnormalHeartBeat.setText(atrialFibrillationEventDay.getDuration() > 0 ? heartRateSubDayDetailFragment.getString(R.string.heart_rate_abnormal_heart_beat_total_duration, String.valueOf(atrialFibrillationEventDay.getDuration())) : heartRateSubDayDetailFragment.getString(R.string.heart_rate_no_abnormal_heart_rate_today));
    }

    private final AtrialFibViewModel m() {
        return (AtrialFibViewModel) this.atrialFibViewModel.getValue();
    }

    private final long n() {
        Bundle arguments = getArguments();
        Long lValueOf = arguments == null ? null : Long.valueOf(arguments.getLong("date"));
        return lValueOf == null ? System.currentTimeMillis() : lValueOf.longValue();
    }

    private final LocalHRDataViewModel o() {
        return (LocalHRDataViewModel) this.localHRDataVM.getValue();
    }

    private final int p() {
        return ((Number) this.userAge.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserInfoViewModel q() {
        return (UserInfoViewModel) this.userInfoViewModel.getValue();
    }

    private final HeartRateFragmentDaySubDetailBinding r() {
        return (HeartRateFragmentDaySubDetailBinding) this.viewBinding.getValue(this, h[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(HeartRateSubDayDetailFragment heartRateSubDayDetailFragment, View view) {
        KoinExtKt.getHeartRateDataDelegate().launchRestingHRActivity(heartRateSubDayDetailFragment.requireContext(), heartRateSubDayDetailFragment.getUserId(), heartRateSubDayDetailFragment.p(), heartRateSubDayDetailFragment.n());
        HeartRateAnalyticsHelperKt.recordEvent(HeartRateAnalyticsHelperKt.DETAIL_HR_RHR_C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(HeartRateSubDayDetailFragment heartRateSubDayDetailFragment, View view) {
        heartRateSubDayDetailFragment.requireContext().startActivity(new Intent(heartRateSubDayDetailFragment.getContext(), (Class<?>) HMAtrialFibrillationHrActivity.class));
        HeartRateAnalyticsHelperKt.recordEvent(HeartRateAnalyticsHelperKt.DETAIL_HR_AHB_C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(HeartRateSubDayDetailFragment heartRateSubDayDetailFragment, View view) {
        HeartRateMeasureListActivity.INSTANCE.launchForResult(heartRateSubDayDetailFragment);
        HeartRateAnalyticsHelperKt.recordEvent(HeartRateAnalyticsHelperKt.DETAIL_HR_MANUAL_C);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return r().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        TextView textView;
        super.onViewCreated(view, savedInstanceState);
        r().statisticsView.initText(getString(R.string.heart_rate_day_statistical_data));
        this.hrUnitString = requireContext().getString(R.string.heart_rate_unit_bpm);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.ic_arrow_forward_20);
        if (drawable == null) {
            drawable = null;
        } else {
            drawable.setBounds(0, 0, UIUtilsKt.dpToPx(requireContext(), 16.0f), UIUtilsKt.dpToPx(requireContext(), 16.0f));
        }
        r().hrWholeDayRest.setCompoundDrawablesRelative(null, null, drawable, null);
        r().tvAbnormalHeartBeat.setCompoundDrawablesRelative(null, null, drawable, null);
        h();
        r().heartRateRestLayout.setVisibility(KoinExtKt.getHeartRateDataDelegate().isShowRestingHRItem() ? 0 : 8);
        r().heartRateRestLayout.setOnClickListener(new View.OnClickListener() { // from class: g04
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HeartRateSubDayDetailFragment.s(this.a, view2);
            }
        });
        r().abnormalHeartBeatLayout.setOnClickListener(new View.OnClickListener() { // from class: i04
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HeartRateSubDayDetailFragment.t(this.a, view2);
            }
        });
        r().measureResultLayout.setOnClickListener(new View.OnClickListener() { // from class: h04
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HeartRateSubDayDetailFragment.u(this.a, view2);
            }
        });
        View view2 = getView();
        if (view2 == null || (textView = (TextView) view2.findViewById(R.id.tvDeviceSupportDesc)) == null) {
            return;
        }
        textView.setVisibility(Intrinsics.areEqual(Locale.getDefault(), Locale.JAPAN) || Intrinsics.areEqual(Locale.getDefault(), Locale.JAPANESE) ? 0 : 8);
    }
}
