package com.xiaomi.hm.health.device.sleep;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import androidx.p010navigation.fragment.FragmentKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import com.huami.ui.widget.sleepdial.ScrollWrapper;
import com.huami.ui.widget.sleepdial.TimeDialView;
import com.xiaomi.hm.health.device.setting.ui.subview.AbstractDeviceFragment;
import com.xiaomi.hm.health.device.sleep.SleepSettingFragment;
import java.util.ArrayList;
import java.util.BitSet;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b!\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J&\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R=\u0010 \u001a\"\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a0\u0019j\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a`\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/device/sleep/SleepSettingFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/AbstractDeviceFragment;", "Lcom/huami/ui/widget/sleepdial/ScrollWrapper;", "", "i", "f", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "", "disallowIntercept", "requestDisallowInterceptTouchEvent", "Lcom/xiaomi/hm/health/device/sleep/SleepSettingViewModel;", "g", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/xiaomi/hm/health/device/sleep/SleepSettingViewModel;", "viewModel", "Ljava/util/ArrayList;", "Landroidx/appcompat/widget/AppCompatTextView;", "kotlin.jvm.PlatformType", "Lkotlin/collections/ArrayList;", "h", "e", "()Ljava/util/ArrayList;", "weekArray", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepSettingFragment extends AbstractDeviceFragment implements ScrollWrapper {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy weekArray = LazyKt__LazyJVMKt.lazy(new b());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/sleep/SleepSettingViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SleepSettingViewModel> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepSettingViewModel invoke() {
            return (SleepSettingViewModel) SleepSettingFragment.this.loadViewModel(SleepSettingViewModel.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\"\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000j\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001`\u0003H\n"}, d2 = {"Ljava/util/ArrayList;", "Landroidx/appcompat/widget/AppCompatTextView;", "kotlin.jvm.PlatformType", "Lkotlin/collections/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ArrayList<AppCompatTextView>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList<AppCompatTextView> invoke() {
            AppCompatTextView[] appCompatTextViewArr = new AppCompatTextView[7];
            View view = SleepSettingFragment.this.getView();
            appCompatTextViewArr[0] = (AppCompatTextView) (view == null ? null : view.findViewById(R.id.tv_monday));
            View view2 = SleepSettingFragment.this.getView();
            appCompatTextViewArr[1] = (AppCompatTextView) (view2 == null ? null : view2.findViewById(R.id.tv_tuesday));
            View view3 = SleepSettingFragment.this.getView();
            appCompatTextViewArr[2] = (AppCompatTextView) (view3 == null ? null : view3.findViewById(R.id.tv_wednesday));
            View view4 = SleepSettingFragment.this.getView();
            appCompatTextViewArr[3] = (AppCompatTextView) (view4 == null ? null : view4.findViewById(R.id.tv_thursday));
            View view5 = SleepSettingFragment.this.getView();
            appCompatTextViewArr[4] = (AppCompatTextView) (view5 == null ? null : view5.findViewById(R.id.tv_friday));
            View view6 = SleepSettingFragment.this.getView();
            appCompatTextViewArr[5] = (AppCompatTextView) (view6 == null ? null : view6.findViewById(R.id.tv_saturday));
            View view7 = SleepSettingFragment.this.getView();
            appCompatTextViewArr[6] = (AppCompatTextView) (view7 != null ? view7.findViewById(R.id.tv_sunday) : null);
            return CollectionsKt__CollectionsKt.arrayListOf(appCompatTextViewArr);
        }
    }

    private final SleepSettingViewModel d() {
        return (SleepSettingViewModel) this.viewModel.getValue();
    }

    private final ArrayList<AppCompatTextView> e() {
        return (ArrayList) this.weekArray.getValue();
    }

    private final void f() {
        LiveData<BitSet> liveDataLoadWeeklySetting;
        SleepSettingViewModel sleepSettingViewModelD = d();
        if (sleepSettingViewModelD != null && (liveDataLoadWeeklySetting = sleepSettingViewModelD.loadWeeklySetting()) != null) {
            liveDataLoadWeeklySetting.observe(getViewLifecycleOwner(), new Observer() { // from class: p17
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    SleepSettingFragment.g(this.a, (BitSet) obj);
                }
            });
        }
        SleepSettingViewModel sleepSettingViewModelD2 = d();
        if (sleepSettingViewModelD2 == null) {
            return;
        }
        sleepSettingViewModelD2.initTimes();
        sleepSettingViewModelD2.getEnterSleepTimeLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.sleep.SleepSettingFragment$observe$lambda-8$$inlined$observeNotNull$1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(String str) {
                if (str == null) {
                    return;
                }
                try {
                    String str2 = str;
                    View view = this.a.getView();
                    ((AppCompatTextView) (view == null ? null : view.findViewById(R.id.tv_enter_sleep_time))).setText(str2);
                } catch (Exception e) {
                    HMLog.e("ObserveError", e);
                }
            }
        });
        sleepSettingViewModelD2.getWakeUpTimeLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.sleep.SleepSettingFragment$observe$lambda-8$$inlined$observeNotNull$2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(String str) {
                if (str == null) {
                    return;
                }
                try {
                    String str2 = str;
                    View view = this.a.getView();
                    ((AppCompatTextView) (view == null ? null : view.findViewById(R.id.tv_wake_up_time))).setText(str2);
                } catch (Exception e) {
                    HMLog.e("ObserveError", e);
                }
            }
        });
        View view = getView();
        ((TimeDialView) (view == null ? null : view.findViewById(R.id.sleep_dial))).setOnTimeChangeListener(sleepSettingViewModelD2);
        sleepSettingViewModelD2.getRestoreTimesLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.sleep.SleepSettingFragment$observe$lambda-8$$inlined$observeNotNull$3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Pair<? extends Integer, ? extends Integer> pair) {
                if (pair == null) {
                    return;
                }
                try {
                    Pair<? extends Integer, ? extends Integer> pair2 = pair;
                    View view2 = this.a.getView();
                    View viewFindViewById = null;
                    ((TimeDialView) (view2 == null ? null : view2.findViewById(R.id.sleep_dial))).updateStartTime(pair2.getFirst().intValue());
                    View view3 = this.a.getView();
                    if (view3 != null) {
                        viewFindViewById = view3.findViewById(R.id.sleep_dial);
                    }
                    ((TimeDialView) viewFindViewById).updateStartTime(pair2.getSecond().intValue());
                } catch (Exception e) {
                    HMLog.e("ObserveError", e);
                }
            }
        });
        sleepSettingViewModelD2.getTimeDiffLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.sleep.SleepSettingFragment$observe$lambda-8$$inlined$observeNotNull$4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Pair<? extends String, ? extends String> pair) {
                if (pair == null) {
                    return;
                }
                try {
                    Pair<? extends String, ? extends String> pair2 = pair;
                    View view2 = this.a.getView();
                    View viewFindViewById = null;
                    ((AppCompatTextView) (view2 == null ? null : view2.findViewById(R.id.tv_hours))).setText(pair2.getFirst());
                    View view3 = this.a.getView();
                    if (view3 != null) {
                        viewFindViewById = view3.findViewById(R.id.tv_minutes);
                    }
                    ((AppCompatTextView) viewFindViewById).setText(pair2.getSecond());
                } catch (Exception e) {
                    HMLog.e("ObserveError", e);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SleepSettingFragment sleepSettingFragment, BitSet bitSet) {
        int length = bitSet.length();
        if (length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            sleepSettingFragment.e().get(i).setActivated(bitSet.get(i));
            if (i2 >= length) {
                return;
            } else {
                i = i2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(SleepSettingFragment sleepSettingFragment, View view) {
        FragmentKt.findNavController(sleepSettingFragment).navigateUp();
    }

    private final void i() {
        final int i = 0;
        for (Object obj : e()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ((AppCompatTextView) obj).setOnClickListener(new View.OnClickListener() { // from class: o17
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepSettingFragment.j(this.a, i, view);
                }
            });
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SleepSettingFragment sleepSettingFragment, int i, View view) {
        SleepSettingViewModel sleepSettingViewModelD = sleepSettingFragment.d();
        if (sleepSettingViewModelD == null) {
            return;
        }
        sleepSettingViewModelD.reversSetValue(i);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.AbstractDeviceFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sleep_setting, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View view2 = getView();
        ((AppCompatImageView) (view2 == null ? null : view2.findViewById(R.id.btn_back))).setOnClickListener(new View.OnClickListener() { // from class: n17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                SleepSettingFragment.h(this.a, view3);
            }
        });
        f();
        i();
        View view3 = getView();
        ((TimeDialView) (view3 == null ? null : view3.findViewById(R.id.sleep_dial))).attachScrollView(this);
        View view4 = getView();
        ((TimeDialView) (view4 != null ? view4.findViewById(R.id.sleep_dial) : null)).setVibrateEnable(true);
    }

    @Override // com.huami.ui.widget.sleepdial.ScrollWrapper
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        View view = getView();
        ((NestedScrollView) (view == null ? null : view.findViewById(R.id.scrollView2))).requestDisallowInterceptTouchEvent(disallowIntercept);
    }
}
