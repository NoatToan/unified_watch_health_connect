package com.huami.treadmill.ui.setting;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p008lifecycle.Observer;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.tools.log.HMLog;
import com.huami.treadmill.R;
import com.huami.treadmill.ext.AppCompatActivityExtKt;
import com.huami.treadmill.ext.ViewExtKt;
import com.huami.treadmill.proxy.ProxyTreadmill;
import com.huami.treadmill.ui.setting.VariableSpeedFragment;
import com.huami.treadmill.util.BlurBitmapUtil;
import com.huami.widget.typeface.TypefaceTextView;
import com.loc.z;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 .2\u00020\u0001:\u0001.B\t\b\u0002¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J \u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J&\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016J&\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u000bR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/huami/treadmill/ui/setting/VariableSpeedFragment;", "Landroidx/fragment/app/DialogFragment;", "", "g", GoogleApiAvailabilityLight.a, "", "speed", hl.k, "currentSpeed", "Lcom/huami/treadmill/ui/setting/AdjustMode;", "mode", "", "rangePer", "i", "", z.j, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onResume", "Landroidx/fragment/app/FragmentManager;", "supportFragmentManager", "range", "showVsFragment", "Lcom/huami/treadmill/ui/setting/VariableSpeedViewModel;", "viewModel", "Lcom/huami/treadmill/ui/setting/VariableSpeedViewModel;", "getViewModel", "()Lcom/huami/treadmill/ui/setting/VariableSpeedViewModel;", "setViewModel", "(Lcom/huami/treadmill/ui/setting/VariableSpeedViewModel;)V", "a", LogUtil.I, "b", "Lcom/huami/treadmill/ui/setting/AdjustMode;", "c", "F", "<init>", "()V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class VariableSpeedFragment extends DialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String d = VariableSpeedFragment.class.getSimpleName();

    @Nullable
    private static VariableSpeedFragment e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int currentSpeed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private AdjustMode mode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float range;
    public VariableSpeedViewModel viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00028B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/treadmill/ui/setting/VariableSpeedFragment$Companion;", "", "Lcom/huami/treadmill/ui/setting/VariableSpeedFragment;", "newInstance", DefaultSettingsSpiCall.n, "Lcom/huami/treadmill/ui/setting/VariableSpeedFragment;", "a", "()Lcom/huami/treadmill/ui/setting/VariableSpeedFragment;", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final VariableSpeedFragment a() {
            if (VariableSpeedFragment.e == null) {
                VariableSpeedFragment.e = new VariableSpeedFragment(null);
            }
            return VariableSpeedFragment.e;
        }

        @NotNull
        public final VariableSpeedFragment newInstance() {
            return a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdjustMode.values().length];
            iArr[AdjustMode.ADJUST_SLOW.ordinal()] = 1;
            iArr[AdjustMode.ADJUST_FAST.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            View view2 = VariableSpeedFragment.this.getView();
            VariableSpeedFragment.this.k(Integer.parseInt(((TypefaceTextView) (view2 == null ? null : view2.findViewById(R.id.td_vs_start_btn_tx))).getText().toString()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            View view2 = VariableSpeedFragment.this.getView();
            VariableSpeedFragment.this.k(Integer.parseInt(((TypefaceTextView) (view2 == null ? null : view2.findViewById(R.id.td_vs_middle_btn_tx))).getText().toString()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<View, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            View view2 = VariableSpeedFragment.this.getView();
            VariableSpeedFragment.this.k(Integer.parseInt(((TypefaceTextView) (view2 == null ? null : view2.findViewById(R.id.td_vs_end_btn_tx))).getText().toString()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<View, Unit> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            VariableSpeedFragment.this.requireDialog().dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "";
        }
    }

    private VariableSpeedFragment() {
        this.mode = AdjustMode.ADJUST_FAST;
    }

    public /* synthetic */ VariableSpeedFragment(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void d() {
        View view = getView();
        ViewExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.td_vs_start_btn), 0L, new a(), 1, null);
        View view2 = getView();
        ViewExtKt.smartClick$default(view2 == null ? null : view2.findViewById(R.id.td_vs_middle_btn), 0L, new b(), 1, null);
        View view3 = getView();
        ViewExtKt.smartClick$default(view3 == null ? null : view3.findViewById(R.id.td_vs_end_btn), 0L, new c(), 1, null);
        View view4 = getView();
        ViewExtKt.smartClick$default(view4 != null ? view4.findViewById(R.id.td_vs_container) : null, 0L, new d(), 1, null);
        Observable.timer(5L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: v88
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                VariableSpeedFragment.e(this.a, (Long) obj);
            }
        }, new Action1() { // from class: w88
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                VariableSpeedFragment.f((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(VariableSpeedFragment variableSpeedFragment, Long l) {
        variableSpeedFragment.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Throwable th) {
        HMLog.warn$default(null, th, e.a, 1, null);
    }

    private final void g() {
        getViewModel().getSpeedArrays().observe(this, new Observer() { // from class: u88
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                VariableSpeedFragment.h(this.a, (Triple) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(VariableSpeedFragment variableSpeedFragment, Triple triple) {
        View view = variableSpeedFragment.getView();
        ((TypefaceTextView) (view == null ? null : view.findViewById(R.id.td_vs_start_btn_tx))).setText(String.valueOf(((Number) triple.getFirst()).intValue()));
        View view2 = variableSpeedFragment.getView();
        ((TypefaceTextView) (view2 == null ? null : view2.findViewById(R.id.td_vs_middle_btn_tx))).setText(String.valueOf(((Number) triple.getSecond()).intValue()));
        View view3 = variableSpeedFragment.getView();
        ((TypefaceTextView) (view3 != null ? view3.findViewById(R.id.td_vs_end_btn_tx) : null)).setText(String.valueOf(((Number) triple.getThird()).intValue()));
    }

    private final void i(int currentSpeed, AdjustMode mode, float rangePer) {
        if (rangePer > 0.3f) {
            boolean z = false;
            if (currentSpeed >= 0 && currentSpeed < 3) {
                if (WhenMappings.$EnumSwitchMapping$0[mode.ordinal()] != 2) {
                    return;
                }
                getViewModel().setSpeedArrays(new Triple<>(3, 6, 9));
                return;
            }
            if (3 <= currentSpeed && currentSpeed < 6) {
                int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
                if (i == 1) {
                    getViewModel().setSpeedArrays(new Triple<>(3, 6, 9));
                    return;
                } else {
                    if (i != 2) {
                        return;
                    }
                    getViewModel().setSpeedArrays(new Triple<>(3, 6, 9));
                    return;
                }
            }
            if (6 <= currentSpeed && currentSpeed < 9) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
                if (i2 == 1) {
                    getViewModel().setSpeedArrays(new Triple<>(3, 6, 9));
                    return;
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    getViewModel().setSpeedArrays(new Triple<>(6, 9, 12));
                    return;
                }
            }
            if (12 <= currentSpeed && currentSpeed < Integer.MAX_VALUE) {
                if (WhenMappings.$EnumSwitchMapping$0[mode.ordinal()] != 1) {
                    return;
                }
                getViewModel().setSpeedArrays(new Triple<>(6, 9, 12));
                return;
            }
            if (9 <= currentSpeed && currentSpeed < 12) {
                z = true;
            }
            if (z) {
                int i3 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
                if (i3 == 1) {
                    getViewModel().setSpeedArrays(new Triple<>(6, 9, 12));
                } else {
                    if (i3 != 2) {
                        return;
                    }
                    getViewModel().setSpeedArrays(new Triple<>(9, 12, 15));
                }
            }
        }
    }

    private final boolean j(int currentSpeed, AdjustMode mode, float rangePer) {
        if (rangePer <= 0.3f) {
            return false;
        }
        if (currentSpeed >= 0 && currentSpeed < 3) {
            int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (3 <= currentSpeed && currentSpeed < 6) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
                if (i2 != 1 && i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (6 <= currentSpeed && currentSpeed < 9) {
                    int i3 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
                    if (i3 != 1 && i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (9 <= currentSpeed && currentSpeed < 12) {
                        int i4 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
                        if (i4 != 1 && i4 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        if (!(12 <= currentSpeed && currentSpeed < Integer.MAX_VALUE)) {
                            return false;
                        }
                        int i5 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
                        if (i5 != 1) {
                            if (i5 == 2) {
                                return false;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(int speed) {
        ProxyTreadmill.INSTANCE.getInstance().adjustSpeed(speed * 10);
        requireDialog().dismiss();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final VariableSpeedViewModel getViewModel() {
        VariableSpeedViewModel variableSpeedViewModel = this.viewModel;
        Objects.requireNonNull(variableSpeedViewModel);
        return variableSpeedViewModel;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.td_fragment_vs, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window window = requireDialog().getWindow();
        WindowManager.LayoutParams attributes = window == null ? null : window.getAttributes();
        if (attributes != null) {
            attributes.width = -1;
        }
        if (attributes != null) {
            attributes.height = -1;
        }
        Window window2 = requireDialog().getWindow();
        if (window2 != null) {
            window2.setAttributes(attributes);
        }
        super.onResume();
        i(this.currentSpeed, this.mode, this.range);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity activity = getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        setViewModel((VariableSpeedViewModel) AppCompatActivityExtKt.obtainViewModel((AppCompatActivity) activity, VariableSpeedViewModel.class));
        FragmentActivity activity2 = getActivity();
        FrameLayout frameLayout = activity2 == null ? null : (FrameLayout) activity2.findViewById(R.id.content);
        if (frameLayout != null) {
            frameLayout.setDrawingCacheEnabled(true);
            frameLayout.buildDrawingCache();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout.getDrawingCache());
            frameLayout.setDrawingCacheEnabled(false);
            Bitmap bitmapBlurBitmap = BlurBitmapUtil.INSTANCE.blurBitmap(getContext(), bitmapCreateBitmap);
            View view2 = getView();
            ((ConstraintLayout) (view2 != null ? view2.findViewById(R.id.td_vs_container) : null)).setBackground(new BitmapDrawable(getResources(), bitmapBlurBitmap));
        }
        d();
        g();
    }

    public final void setViewModel(@NotNull VariableSpeedViewModel variableSpeedViewModel) {
        this.viewModel = variableSpeedViewModel;
    }

    public final void showVsFragment(@NotNull FragmentManager supportFragmentManager, int currentSpeed, @NotNull AdjustMode mode, float range) {
        setStyle(0, R.style.Dialog_FullScreen);
        if (j(currentSpeed, mode, range)) {
            if (!isAdded() && !isVisible()) {
                String str = d;
                if (supportFragmentManager.findFragmentByTag(str) == null) {
                    show(supportFragmentManager, str);
                    supportFragmentManager.executePendingTransactions();
                }
            }
            this.currentSpeed = currentSpeed;
            this.mode = mode;
            this.range = range;
            i(currentSpeed, mode, range);
        }
    }
}
