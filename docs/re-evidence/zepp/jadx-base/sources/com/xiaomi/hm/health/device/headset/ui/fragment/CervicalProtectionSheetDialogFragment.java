package com.xiaomi.hm.health.device.headset.ui.fragment;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RawRes;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.airbnb.lottie.LottieAnimationView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.button.MaterialButton;
import com.huami.android.design.dialog.loading.LoadingView;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.LfType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.headset.ui.fragment.CervicalProtectionSheetDialogFragment;
import com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel;
import de.greenrobot.event.EventBus;
import java.lang.reflect.Field;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000£\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001E\u0018\u0000 V2\u00020\u00012\u00020\u0002:\u0001VB\u0007¢\u0006\u0004\bT\u0010UJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u000e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 R\u0018\u0010%\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010/\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u001d\u00108\u001a\u0002048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u00107R\u001d\u0010;\u001a\u0002048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010,\u001a\u0004\b:\u00107R\u001d\u0010?\u001a\u00020\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010,\u001a\u0004\b=\u0010>R\u001f\u0010D\u001a\u0004\u0018\u00010@8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010,\u001a\u0004\bB\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010NR\u0018\u0010S\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010R¨\u0006W"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/fragment/CervicalProtectionSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lorg/koin/core/component/KoinComponent;", "", "u", "", "rawRes", "t", "", "isPlaAnimation", "w", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onActivityCreated", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/xiaomi/hm/health/bt/profile/slre/HMLFEvent;", "event", "onEvent", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "onDestroy", "Landroidx/fragment/app/FragmentManager;", "manager", "", "tag", "showAllowingStateLoss", "a", "Ljava/lang/String;", "address", "Lcom/xiaomi/hm/health/databases/model/Device;", "b", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "Lcom/huami/devicex/manager/DeviceManagerApi;", "c", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.b, "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CervicalProtectionViewModel;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/headset/viewmodel/CervicalProtectionViewModel;", "viewModel", "Landroid/content/res/ColorStateList;", "e", "l", "()Landroid/content/res/ColorStateList;", "colorBlue", "f", hl.k, "colorBlack", "g", "m", "()I", "colorTransparent", "Landroid/graphics/drawable/Drawable;", "h", "o", "()Landroid/graphics/drawable/Drawable;", "drawablePlay", "com/xiaomi/hm/health/device/headset/ui/fragment/CervicalProtectionSheetDialogFragment$animationListener$1", "i", "Lcom/xiaomi/hm/health/device/headset/ui/fragment/CervicalProtectionSheetDialogFragment$animationListener$1;", "animationListener", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", z.j, "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "animatorUpdateListener", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "message", "tips", "Lcom/huami/android/design/dialog/loading/LoadingView;", "Lcom/huami/android/design/dialog/loading/LoadingView;", "loadingView", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class CervicalProtectionSheetDialogFragment extends BottomSheetDialogFragment implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "CervicalProtectionSheetDialogFragment";

    @NotNull
    private static final String n = "address";
    private static final long o = 500;
    private static final long p = 800;
    private static final long q = 1000;
    private static final float r = 19.0f;
    private static final float s = 0.5f;
    private static final int t = 0;
    private static final int u = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String address;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Device device;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private CervicalProtectionViewModel viewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy colorBlue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy colorBlack;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy colorTransparent;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy drawablePlay;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final CervicalProtectionSheetDialogFragment$animationListener$1 animationListener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final ValueAnimator.AnimatorUpdateListener animatorUpdateListener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private TextView message;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private TextView tips;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private LoadingView loadingView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0016\u0010\u0014\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0016\u0010\u0015\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/fragment/CervicalProtectionSheetDialogFragment$Companion;", "", "", "address", "Lcom/xiaomi/hm/health/device/headset/ui/fragment/CervicalProtectionSheetDialogFragment;", "newInstance", "ADDRESS", "Ljava/lang/String;", "", "CORNER_RADIUS", "F", "", "DELAY_TIME_500_MILLIS", "J", "DELAY_TIME_800_MILLIS", "", "ONE", LogUtil.I, "STROKE_WIDTH", "TAG", "TIME_1000_MILLIS", "ZERO", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CervicalProtectionSheetDialogFragment newInstance(@NotNull String address) {
            CervicalProtectionSheetDialogFragment cervicalProtectionSheetDialogFragment = new CervicalProtectionSheetDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("address", address);
            Unit unit = Unit.INSTANCE;
            cervicalProtectionSheetDialogFragment.setArguments(bundle);
            return cervicalProtectionSheetDialogFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/res/ColorStateList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ColorStateList> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ColorStateList getA() {
            return ColorStateList.valueOf(ContextCompat.getColor(CervicalProtectionSheetDialogFragment.this.requireContext(), R.color.s1));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/res/ColorStateList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ColorStateList> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ColorStateList getA() {
            return ColorStateList.valueOf(ContextCompat.getColor(CervicalProtectionSheetDialogFragment.this.requireContext(), R.color.cl_3c88ff));
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
            return ContextCompat.getColor(CervicalProtectionSheetDialogFragment.this.requireContext(), android.R.color.transparent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/graphics/drawable/Drawable;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Drawable> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Drawable getA() {
            return ContextCompat.getDrawable(CervicalProtectionSheetDialogFragment.this.requireContext(), R.drawable.private_haydn_audition_play_new);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ HMLFEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HMLFEvent hMLFEvent) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<View, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "result", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Boolean, Unit> {
            public final /* synthetic */ CervicalProtectionSheetDialogFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(CervicalProtectionSheetDialogFragment cervicalProtectionSheetDialogFragment) {
                super(1);
                this.a = cervicalProtectionSheetDialogFragment;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (z) {
                    this.a.w(true);
                } else {
                    this.a.u();
                }
            }
        }

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            CervicalProtectionViewModel cervicalProtectionViewModel = CervicalProtectionSheetDialogFragment.this.viewModel;
            Objects.requireNonNull(cervicalProtectionViewModel);
            cervicalProtectionViewModel.doCervicalProtectionSound(true, new a(CervicalProtectionSheetDialogFragment.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ NoSuchFieldException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(NoSuchFieldException noSuchFieldException) {
            super(0);
            this.a = noSuchFieldException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ IllegalAccessException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(IllegalAccessException illegalAccessException) {
            super(0);
            this.a = illegalAccessException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ NoSuchFieldException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(NoSuchFieldException noSuchFieldException) {
            super(0);
            this.a = noSuchFieldException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ IllegalAccessException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(IllegalAccessException illegalAccessException) {
            super(0);
            this.a = illegalAccessException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.getMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.xiaomi.hm.health.device.headset.ui.fragment.CervicalProtectionSheetDialogFragment$animationListener$1] */
    public CervicalProtectionSheetDialogFragment() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.ui.fragment.CervicalProtectionSheetDialogFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        this.colorBlue = LazyKt__LazyJVMKt.lazy(new b());
        this.colorBlack = LazyKt__LazyJVMKt.lazy(new a());
        this.colorTransparent = LazyKt__LazyJVMKt.lazy(new c());
        this.drawablePlay = LazyKt__LazyJVMKt.lazy(new d());
        this.animationListener = new Animator.AnimatorListener() { // from class: com.xiaomi.hm.health.device.headset.ui.fragment.CervicalProtectionSheetDialogFragment$animationListener$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@Nullable Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@Nullable Animator animation) {
                this.a.w(false);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@Nullable Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@Nullable Animator animation) {
            }
        };
        this.animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: an0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CervicalProtectionSheetDialogFragment.i(this.a, valueAnimator);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(final CervicalProtectionSheetDialogFragment cervicalProtectionSheetDialogFragment, final ValueAnimator valueAnimator) {
        View view = cervicalProtectionSheetDialogFragment.getView();
        if (view == null) {
            return;
        }
        view.post(new Runnable() { // from class: en0
            @Override // java.lang.Runnable
            public final void run() {
                CervicalProtectionSheetDialogFragment.j(valueAnimator, cervicalProtectionSheetDialogFragment);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ValueAnimator valueAnimator, CervicalProtectionSheetDialogFragment cervicalProtectionSheetDialogFragment) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = 1 - ((Float) animatedValue).floatValue();
        View view = cervicalProtectionSheetDialogFragment.getView();
        int iRoundToInt = kotlin.math.c.roundToInt(fFloatValue * ((LottieAnimationView) (view == null ? null : view.findViewById(R.id.animation_view))).getDuration());
        View view2 = cervicalProtectionSheetDialogFragment.getView();
        ((MaterialButton) (view2 == null ? null : view2.findViewById(R.id.cervical_protection_audition))).setText(cervicalProtectionSheetDialogFragment.getString(R.string.format_second, Long.valueOf(((long) iRoundToInt) / 1000)));
        View view3 = cervicalProtectionSheetDialogFragment.getView();
        if (Intrinsics.areEqual(((MaterialButton) (view3 == null ? null : view3.findViewById(R.id.cervical_protection_audition))).getTextColors(), cervicalProtectionSheetDialogFragment.l())) {
            return;
        }
        View view4 = cervicalProtectionSheetDialogFragment.getView();
        ((MaterialButton) (view4 != null ? view4.findViewById(R.id.cervical_protection_audition) : null)).setTextColor(cervicalProtectionSheetDialogFragment.l());
    }

    private final ColorStateList k() {
        return (ColorStateList) this.colorBlack.getValue();
    }

    private final ColorStateList l() {
        return (ColorStateList) this.colorBlue.getValue();
    }

    private final int m() {
        return ((Number) this.colorTransparent.getValue()).intValue();
    }

    private final DeviceManagerApi n() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    @JvmStatic
    @NotNull
    public static final CervicalProtectionSheetDialogFragment newInstance(@NotNull String str) {
        return INSTANCE.newInstance(str);
    }

    private final Drawable o() {
        return (Drawable) this.drawablePlay.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(CervicalProtectionSheetDialogFragment cervicalProtectionSheetDialogFragment, Boolean bool) {
        if (bool == null || bool.booleanValue()) {
            return;
        }
        View view = cervicalProtectionSheetDialogFragment.getView();
        ((LottieAnimationView) (view == null ? null : view.findViewById(R.id.animation_view))).cancelAnimation();
        cervicalProtectionSheetDialogFragment.w(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(CervicalProtectionSheetDialogFragment cervicalProtectionSheetDialogFragment, View view) {
        CervicalProtectionViewModel cervicalProtectionViewModel = cervicalProtectionSheetDialogFragment.viewModel;
        Objects.requireNonNull(cervicalProtectionViewModel);
        CervicalProtectionViewModel.doCervicalProtectionSound$default(cervicalProtectionViewModel, false, null, 2, null);
        cervicalProtectionSheetDialogFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(View view, final CervicalProtectionSheetDialogFragment cervicalProtectionSheetDialogFragment) {
        view.postDelayed(new Runnable() { // from class: gn0
            @Override // java.lang.Runnable
            public final void run() {
                CervicalProtectionSheetDialogFragment.s(this.a);
            }
        }, p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(CervicalProtectionSheetDialogFragment cervicalProtectionSheetDialogFragment) {
        LoadingView loadingView = cervicalProtectionSheetDialogFragment.loadingView;
        if (loadingView != null) {
            loadingView.reset();
        }
        View view = cervicalProtectionSheetDialogFragment.getView();
        (view == null ? null : view.findViewById(R.id.headset_loading)).setVisibility(8);
    }

    private final void t(@RawRes int rawRes) {
        View view = getView();
        ((LottieAnimationView) (view == null ? null : view.findViewById(R.id.animation_view))).setAnimation(rawRes);
        View view2 = getView();
        if (((LottieAnimationView) (view2 == null ? null : view2.findViewById(R.id.animation_view))).isAnimating()) {
            View view3 = getView();
            ((LottieAnimationView) (view3 == null ? null : view3.findViewById(R.id.animation_view))).cancelAnimation();
        }
        View view4 = getView();
        ((LottieAnimationView) (view4 != null ? view4.findViewById(R.id.animation_view) : null)).playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        LoadingView loadingView = this.loadingView;
        if (loadingView != null) {
            loadingView.startLoading();
        }
        View view = getView();
        (view == null ? null : view.findViewById(R.id.headset_loading)).setVisibility(0);
        TextView textView = this.message;
        if (textView != null) {
            textView.setText(getString(R.string.headset_audition_failed));
        }
        TextView textView2 = this.tips;
        if (textView2 != null) {
            textView2.setText("");
        }
        View view2 = getView();
        if (view2 == null) {
            return;
        }
        view2.postDelayed(new Runnable() { // from class: fn0
            @Override // java.lang.Runnable
            public final void run() {
                CervicalProtectionSheetDialogFragment.v(this.a);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(CervicalProtectionSheetDialogFragment cervicalProtectionSheetDialogFragment) {
        LoadingView loadingView = cervicalProtectionSheetDialogFragment.loadingView;
        if (loadingView == null) {
            return;
        }
        loadingView.setFailed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(final boolean isPlaAnimation) {
        View view = getView();
        if (view == null) {
            return;
        }
        view.post(new Runnable() { // from class: hn0
            @Override // java.lang.Runnable
            public final void run() {
                CervicalProtectionSheetDialogFragment.x(isPlaAnimation, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(boolean z, CervicalProtectionSheetDialogFragment cervicalProtectionSheetDialogFragment) {
        if (z) {
            View view = cervicalProtectionSheetDialogFragment.getView();
            ((TextView) (view == null ? null : view.findViewById(R.id.cervical_protection_calibration_hint))).setText(cervicalProtectionSheetDialogFragment.getString(R.string.headset_cervical_protection_notification_close_sound));
            View view2 = cervicalProtectionSheetDialogFragment.getView();
            ((MaterialButton) (view2 == null ? null : view2.findViewById(R.id.cervical_protection_audition))).setBackgroundColor(cervicalProtectionSheetDialogFragment.m());
            View view3 = cervicalProtectionSheetDialogFragment.getView();
            ((MaterialButton) (view3 == null ? null : view3.findViewById(R.id.cervical_protection_audition))).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            View view4 = cervicalProtectionSheetDialogFragment.getView();
            ((MaterialButton) (view4 == null ? null : view4.findViewById(R.id.cervical_protection_audition))).setStrokeColor(ColorStateList.valueOf(ContextCompat.getColor(cervicalProtectionSheetDialogFragment.requireContext(), R.color.transparent)));
            View view5 = cervicalProtectionSheetDialogFragment.getView();
            ((MaterialButton) (view5 == null ? null : view5.findViewById(R.id.cervical_protection_audition))).setClickable(false);
            View view6 = cervicalProtectionSheetDialogFragment.getView();
            ((LottieAnimationView) (view6 == null ? null : view6.findViewById(R.id.animation_view))).addAnimatorUpdateListener(cervicalProtectionSheetDialogFragment.animatorUpdateListener);
            View view7 = cervicalProtectionSheetDialogFragment.getView();
            ((LottieAnimationView) (view7 == null ? null : view7.findViewById(R.id.animation_view))).addAnimatorListener(cervicalProtectionSheetDialogFragment.animationListener);
            View view8 = cervicalProtectionSheetDialogFragment.getView();
            ((LottieAnimationView) (view8 != null ? view8.findViewById(R.id.animation_view) : null)).setRepeatCount(0);
            cervicalProtectionSheetDialogFragment.t(R.raw.cervical_protection_total);
            return;
        }
        View view9 = cervicalProtectionSheetDialogFragment.getView();
        ((TextView) (view9 == null ? null : view9.findViewById(R.id.cervical_protection_calibration_hint))).setText(cervicalProtectionSheetDialogFragment.getString(R.string.headset_cervical_protection_notification));
        View view10 = cervicalProtectionSheetDialogFragment.getView();
        ((MaterialButton) (view10 == null ? null : view10.findViewById(R.id.cervical_protection_audition))).setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(cervicalProtectionSheetDialogFragment.requireContext(), R.color.s38)));
        View view11 = cervicalProtectionSheetDialogFragment.getView();
        ((MaterialButton) (view11 == null ? null : view11.findViewById(R.id.cervical_protection_audition))).setCornerRadius((int) ViewUtils.dp2px(cervicalProtectionSheetDialogFragment.requireContext(), r));
        View view12 = cervicalProtectionSheetDialogFragment.getView();
        ((MaterialButton) (view12 == null ? null : view12.findViewById(R.id.cervical_protection_audition))).setStrokeColor(ColorStateList.valueOf(ContextCompat.getColor(cervicalProtectionSheetDialogFragment.requireContext(), R.color.s1)));
        View view13 = cervicalProtectionSheetDialogFragment.getView();
        ((MaterialButton) (view13 == null ? null : view13.findViewById(R.id.cervical_protection_audition))).setStrokeWidth((int) ViewUtils.dp2px(cervicalProtectionSheetDialogFragment.requireContext(), 0.5f));
        View view14 = cervicalProtectionSheetDialogFragment.getView();
        ((MaterialButton) (view14 == null ? null : view14.findViewById(R.id.cervical_protection_audition))).setTextColor(cervicalProtectionSheetDialogFragment.k());
        View view15 = cervicalProtectionSheetDialogFragment.getView();
        ((MaterialButton) (view15 == null ? null : view15.findViewById(R.id.cervical_protection_audition))).setText(cervicalProtectionSheetDialogFragment.getString(R.string.headset_hr_cervical_protection_hint_audition));
        View view16 = cervicalProtectionSheetDialogFragment.getView();
        ((MaterialButton) (view16 == null ? null : view16.findViewById(R.id.cervical_protection_audition))).setCompoundDrawablesWithIntrinsicBounds(cervicalProtectionSheetDialogFragment.o(), (Drawable) null, (Drawable) null, (Drawable) null);
        View view17 = cervicalProtectionSheetDialogFragment.getView();
        ((MaterialButton) (view17 == null ? null : view17.findViewById(R.id.cervical_protection_audition))).setClickable(true);
        View view18 = cervicalProtectionSheetDialogFragment.getView();
        ((LottieAnimationView) (view18 == null ? null : view18.findViewById(R.id.animation_view))).removeAnimatorListener(cervicalProtectionSheetDialogFragment.animationListener);
        View view19 = cervicalProtectionSheetDialogFragment.getView();
        ((LottieAnimationView) (view19 == null ? null : view19.findViewById(R.id.animation_view))).removeUpdateListener(cervicalProtectionSheetDialogFragment.animatorUpdateListener);
        View view20 = cervicalProtectionSheetDialogFragment.getView();
        ((LottieAnimationView) (view20 != null ? view20.findViewById(R.id.animation_view) : null)).setRepeatCount(-1);
        cervicalProtectionSheetDialogFragment.t(R.raw.cervical_protection_preview);
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
        DeviceManagerApi deviceManagerApiN = n();
        HMDeviceType hMDeviceType = HMDeviceType.HEADSET;
        String str = this.address;
        if (str == null) {
            str = "";
        }
        this.device = deviceManagerApiN.getBindDevice(hMDeviceType, str);
        if (TextUtils.isEmpty(this.address)) {
            dismiss();
        }
        CervicalProtectionViewModel cervicalProtectionViewModel = (CervicalProtectionViewModel) new ViewModelProvider(requireActivity()).get(CervicalProtectionViewModel.class);
        this.viewModel = cervicalProtectionViewModel;
        Objects.requireNonNull(cervicalProtectionViewModel);
        cervicalProtectionViewModel.getSoundPlayStatus().observe(getViewLifecycleOwner(), new Observer() { // from class: cn0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CervicalProtectionSheetDialogFragment.p(this.a, (Boolean) obj);
            }
        });
        View view = getView();
        ((ImageView) (view == null ? null : view.findViewById(R.id.bind_headset_device_cancel))).setOnClickListener(new View.OnClickListener() { // from class: bn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CervicalProtectionSheetDialogFragment.q(this.a, view2);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R.style.CustomBottomSheetDialogTheme);
        Bundle arguments = getArguments();
        this.address = arguments == null ? null : arguments.getString("address");
        EventBus.getDefault().register(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_headset_cervical_protection_notification, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        super.onDismiss(dialog);
        LoadingView loadingView = this.loadingView;
        if (loadingView == null) {
            return;
        }
        loadingView.stopLoading();
    }

    public final void onEvent(@NotNull HMLFEvent event) {
        if (event.getLfType() == LfType.CERVICAL_PROTECTION_SOUND) {
            CervicalProtectionViewModel cervicalProtectionViewModel = this.viewModel;
            Objects.requireNonNull(cervicalProtectionViewModel);
            CervicalProtectionViewModel.handleLfEvent$default(cervicalProtectionViewModel, event, null, 2, null);
            HMLog.debug(TAG, new e(event));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.message = (TextView) view.findViewById(R.id.message);
        this.tips = (TextView) view.findViewById(R.id.tv_tips);
        LoadingView loadingView = (LoadingView) view.findViewById(R.id.loading);
        this.loadingView = loadingView;
        if (loadingView != null) {
            loadingView.setOnAnimEndListener(new LoadingView.OnAnimEndListener() { // from class: dn0
                @Override // com.huami.android.design.dialog.loading.LoadingView.OnAnimEndListener
                public final void onAnimEnd() {
                    CervicalProtectionSheetDialogFragment.r(view, this);
                }
            });
        }
        w(false);
        View view2 = getView();
        ExtKt.smartClick$default(view2 == null ? null : view2.findViewById(R.id.cervical_protection_audition), 0L, new f(), 1, null);
    }

    public final void showAllowingStateLoss(@NotNull FragmentManager manager, @Nullable String tag) {
        boolean z;
        boolean z2 = true;
        try {
            Field declaredField = DialogFragment.class.getDeclaredField("mDismissed");
            declaredField.setAccessible(true);
            declaredField.set(this, Boolean.FALSE);
            z = true;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            HMLog.info(TAG, new h(e2));
            z = false;
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
            HMLog.info(TAG, new g(e3));
            z = false;
        }
        try {
            Field declaredField2 = DialogFragment.class.getDeclaredField("mShownByMe");
            declaredField2.setAccessible(true);
            declaredField2.set(this, Boolean.TRUE);
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
            HMLog.info(TAG, new j(e4));
            z2 = false;
        } catch (NoSuchFieldException e5) {
            e5.printStackTrace();
            HMLog.info(TAG, new i(e5));
            z2 = false;
        }
        if (!z || !z2) {
            show(manager, tag);
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = manager.beginTransaction();
        fragmentTransactionBeginTransaction.add(this, tag);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }
}
