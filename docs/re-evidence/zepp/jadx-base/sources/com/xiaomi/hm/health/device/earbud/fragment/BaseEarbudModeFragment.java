package com.xiaomi.hm.health.device.earbud.fragment;

import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.view.basetitle.BaseTitleActivity;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.earbud.model.CurrentMusicState;
import com.xiaomi.hm.health.bt.profile.earbud.model.MusicControlCmd;
import com.xiaomi.hm.health.device.earbud.fragment.BaseEarbudModeFragment;
import com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 E2\u00020\u0001:\u0001EB'\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\bC\u0010DJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0006\u0010\u0013\u001a\u00020\u0005R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010'R\u0016\u0010+\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010'R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u0010'R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0004\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010!R\u001d\u0010?\u001a\u00020;8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b-\u0010>R\u001d\u0010B\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\b*\u0010A¨\u0006F"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/fragment/BaseEarbudModeFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", hl.k, "", "isLeft", "", "g", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "shouldFinishActivity", "a", "Landroidx/fragment/app/Fragment;", "getContentFragment", "()Landroidx/fragment/app/Fragment;", "contentFragment", "b", "Z", "isWhiteMode", "()Z", "c", LogUtil.I, "mMainBg", GoogleApiAvailabilityLight.a, "Landroid/view/View;", "mMainView", "e", "mTitleContent", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "mLeftBatteryText", "mRightBatteryText", "h", "mMusicName", "Landroid/widget/SeekBar;", "i", "Landroid/widget/SeekBar;", "mVolumeSeek", z.j, "mVolumeText", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "mPlayCheck", "Landroid/graphics/drawable/AnimationDrawable;", "l", "Landroid/graphics/drawable/AnimationDrawable;", "animationDrawable", "m", "mUpdateRedDot", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudMusicViewModel;", GoogleApiAvailabilityLight.b, "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudMusicViewModel;", "mViewModel", "o", "()I", "contentViewId", "<init>", "(Landroidx/fragment/app/Fragment;ZI)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BaseEarbudModeFragment extends Fragment {
    private static final int p = 5;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Fragment contentFragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isWhiteMode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int mMainBg;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private View mMainView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private View mTitleContent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private TextView mLeftBatteryText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private TextView mRightBatteryText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private TextView mMusicName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private SeekBar mVolumeSeek;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private TextView mVolumeText;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private ImageView mPlayCheck;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private AnimationDrawable animationDrawable;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private View mUpdateRedDot;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Lazy contentViewId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Integer> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return BaseEarbudModeFragment.this.getIsWhiteMode() ? R.layout.fragment_base_earbud_mode_white : R.layout.fragment_base_earbud_mode_normal;
        }
    }

    public BaseEarbudModeFragment() {
        this(null, false, 0, 7, null);
    }

    public BaseEarbudModeFragment(@Nullable Fragment fragment, boolean z, int i) {
        this.contentFragment = fragment;
        this.isWhiteMode = z;
        this.mMainBg = i;
        this.mViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EarbudMusicViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.device.earbud.fragment.BaseEarbudModeFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.device.earbud.fragment.BaseEarbudModeFragment$special$$inlined$activityViewModels$default$2
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
        this.contentViewId = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final int g(boolean isLeft) {
        HmBaseEarbudDevice rightDevice;
        boolean z;
        Integer numValueOf = null;
        if (isLeft) {
            HmEarbudDevice value = i().getDeviceData().getValue();
            z = (value == null ? null : value.getBatteryInfo()) == null;
            BatteryInfo value2 = i().getLeftBatteryData().getValue();
            if (value2 != null) {
                numValueOf = Integer.valueOf(value2.getLevel());
            }
        } else {
            HmEarbudDevice value3 = i().getDeviceData().getValue();
            z = ((value3 != null && (rightDevice = value3.getRightDevice()) != null) ? rightDevice.getBatteryInfo() : null) == null;
            BatteryInfo value4 = i().getRightBatteryData().getValue();
            if (value4 != null) {
                numValueOf = Integer.valueOf(value4.getLevel());
            }
        }
        int iIntValue = numValueOf == null ? -1 : numValueOf.intValue();
        if (z) {
            return Color.parseColor("#4d000000");
        }
        if (iIntValue >= 0 && iIntValue <= 20) {
            return Color.parseColor("#c84d67");
        }
        return this.isWhiteMode ? Color.parseColor("#ffffffff") : ContextCompat.getColor(requireContext(), R.color.s1);
    }

    private final int h() {
        return ((Number) this.contentViewId.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EarbudMusicViewModel i() {
        return (EarbudMusicViewModel) this.mViewModel.getValue();
    }

    private final void initView() {
        View view = this.mMainView;
        Objects.requireNonNull(view);
        view.setBackgroundResource(this.mMainBg);
        Fragment fragment = this.contentFragment;
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().add(R.id.content_view, fragment).commit();
        }
        View view2 = this.mTitleContent;
        Objects.requireNonNull(view2);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = BaseTitleActivity.getStatusBarHeight(requireContext());
        View view3 = this.mTitleContent;
        Objects.requireNonNull(view3);
        view3.setLayoutParams(layoutParams2);
        SeekBar seekBar = this.mVolumeSeek;
        Objects.requireNonNull(seekBar);
        seekBar.setMax(95);
        SeekBar seekBar2 = this.mVolumeSeek;
        Objects.requireNonNull(seekBar2);
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.xiaomi.hm.health.device.earbud.fragment.BaseEarbudModeFragment.initView.2
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@Nullable SeekBar p0, int p1, boolean p2) {
                TextView textView = BaseEarbudModeFragment.this.mVolumeText;
                Objects.requireNonNull(textView);
                textView.setText(BaseEarbudModeFragment.this.getString(R.string.volume_precent, String.valueOf(p1 + 5)));
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@Nullable SeekBar p0) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@Nullable SeekBar p0) {
                if (p0 == null) {
                    return;
                }
                BaseEarbudModeFragment.this.i().setVolume((short) (p0.getProgress() + 5));
            }
        });
        ImageView imageView = this.mPlayCheck;
        Objects.requireNonNull(imageView);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: oq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                BaseEarbudModeFragment.j(this.a, view4);
            }
        });
        i().setDarkMode(!this.isWhiteMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(BaseEarbudModeFragment baseEarbudModeFragment, View view) {
        CurrentMusicState value = baseEarbudModeFragment.i().getMusicStateData().getValue();
        boolean z = false;
        if (value != null && value.isPlay()) {
            z = true;
        }
        baseEarbudModeFragment.i().musicControl(z ? MusicControlCmd.PAUSE : MusicControlCmd.PLAY);
    }

    private final void k() {
        i().getMusicStateData().observe(getViewLifecycleOwner(), new Observer() { // from class: rq
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BaseEarbudModeFragment.l(this.a, (CurrentMusicState) obj);
            }
        });
        i().getLeftBatteryData().observe(getViewLifecycleOwner(), new Observer() { // from class: pq
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BaseEarbudModeFragment.m(this.a, (BatteryInfo) obj);
            }
        });
        i().getRightBatteryData().observe(getViewLifecycleOwner(), new Observer() { // from class: qq
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BaseEarbudModeFragment.n(this.a, (BatteryInfo) obj);
            }
        });
        i().getShowUpdateRedDot().observe(getViewLifecycleOwner(), new Observer() { // from class: sq
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BaseEarbudModeFragment.o(this.a, (Boolean) obj);
            }
        });
        i().getVolumeData().observe(getViewLifecycleOwner(), new Observer() { // from class: tq
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BaseEarbudModeFragment.p(this.a, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(BaseEarbudModeFragment baseEarbudModeFragment, CurrentMusicState currentMusicState) {
        if (currentMusicState != null) {
            TextView textView = baseEarbudModeFragment.mMusicName;
            Objects.requireNonNull(textView);
            textView.setText(baseEarbudModeFragment.i().getMusicName(currentMusicState.getMusicId()));
        }
        boolean z = false;
        if (currentMusicState != null && currentMusicState.isPlay()) {
            z = true;
        }
        if (z) {
            AnimationDrawable animationDrawable = baseEarbudModeFragment.animationDrawable;
            Objects.requireNonNull(animationDrawable);
            animationDrawable.start();
            ImageView imageView = baseEarbudModeFragment.mPlayCheck;
            Objects.requireNonNull(imageView);
            imageView.setImageResource(baseEarbudModeFragment.getIsWhiteMode() ? R.drawable.icon_music_pause_grey : R.drawable.icon_music_pause_red);
            return;
        }
        AnimationDrawable animationDrawable2 = baseEarbudModeFragment.animationDrawable;
        Objects.requireNonNull(animationDrawable2);
        animationDrawable2.stop();
        ImageView imageView2 = baseEarbudModeFragment.mPlayCheck;
        Objects.requireNonNull(imageView2);
        imageView2.setImageResource(R.drawable.icon_music_start_grey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(BaseEarbudModeFragment baseEarbudModeFragment, BatteryInfo batteryInfo) {
        TextView textView = baseEarbudModeFragment.mLeftBatteryText;
        Objects.requireNonNull(textView);
        int i = R.string.battery_level_mili_setting;
        Object[] objArr = new Object[1];
        String string = batteryInfo == null ? null : Integer.valueOf(batteryInfo.getLevel()).toString();
        if (string == null) {
            string = baseEarbudModeFragment.getString(R.string.earbud_battery_disable);
        }
        objArr[0] = string;
        textView.setText(baseEarbudModeFragment.getString(i, objArr));
        TextView textView2 = baseEarbudModeFragment.mLeftBatteryText;
        Objects.requireNonNull(textView2);
        textView2.setTextColor(baseEarbudModeFragment.g(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(BaseEarbudModeFragment baseEarbudModeFragment, BatteryInfo batteryInfo) {
        TextView textView = baseEarbudModeFragment.mRightBatteryText;
        Objects.requireNonNull(textView);
        int i = R.string.battery_level_mili_setting;
        Object[] objArr = new Object[1];
        String string = batteryInfo == null ? null : Integer.valueOf(batteryInfo.getLevel()).toString();
        if (string == null) {
            string = baseEarbudModeFragment.getString(R.string.earbud_battery_disable);
        }
        objArr[0] = string;
        textView.setText(baseEarbudModeFragment.getString(i, objArr));
        TextView textView2 = baseEarbudModeFragment.mRightBatteryText;
        Objects.requireNonNull(textView2);
        textView2.setTextColor(baseEarbudModeFragment.g(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(BaseEarbudModeFragment baseEarbudModeFragment, Boolean bool) {
        View view = baseEarbudModeFragment.mUpdateRedDot;
        Objects.requireNonNull(view);
        view.setVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(BaseEarbudModeFragment baseEarbudModeFragment, Integer num) {
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        TextView textView = baseEarbudModeFragment.mVolumeText;
        Objects.requireNonNull(textView);
        textView.setText(baseEarbudModeFragment.getString(R.string.volume_precent, String.valueOf(iIntValue)));
        SeekBar seekBar = baseEarbudModeFragment.mVolumeSeek;
        Objects.requireNonNull(seekBar);
        seekBar.setProgress(iIntValue - 5);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final Fragment getContentFragment() {
        return this.contentFragment;
    }

    /* JADX INFO: renamed from: isWhiteMode, reason: from getter */
    public final boolean getIsWhiteMode() {
        return this.isWhiteMode;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(h(), container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.mMainView = view;
        this.mTitleContent = view.findViewById(R.id.title_content);
        this.mLeftBatteryText = (TextView) view.findViewById(R.id.left_battery);
        this.mRightBatteryText = (TextView) view.findViewById(R.id.right_battery);
        Drawable drawable = ((ImageView) view.findViewById(R.id.ic_play)).getDrawable();
        Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        this.animationDrawable = (AnimationDrawable) drawable;
        this.mMusicName = (TextView) view.findViewById(R.id.music_name);
        this.mVolumeSeek = (SeekBar) view.findViewById(R.id.volume_seek);
        this.mVolumeText = (TextView) view.findViewById(R.id.volume_percent);
        this.mPlayCheck = (ImageView) view.findViewById(R.id.music_control);
        this.mUpdateRedDot = view.findViewById(R.id.update_red_dot);
        initView();
        k();
    }

    public final boolean shouldFinishActivity() {
        return !(this.contentFragment instanceof EarbudModeSettingFragment);
    }

    public /* synthetic */ BaseEarbudModeFragment(Fragment fragment, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : fragment, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? R.drawable.bg_earbud_music : i);
    }
}
