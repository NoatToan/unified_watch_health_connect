package com.huami.treadmill.ui.setting;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.mifit.sportlib.common.Keeper;
import com.huami.mifit.sportlib.tts.RunningPlayer;
import com.huami.treadmill.R;
import com.huami.treadmill.data.BoltSportCommand;
import com.huami.treadmill.data.ErrorStatus;
import com.huami.treadmill.eventbus.SportCommandEvent;
import com.huami.treadmill.ext.AppCompatActivityExtKt;
import com.huami.treadmill.ext.ViewExtKt;
import com.huami.treadmill.proxy.ProxyTreadmill;
import com.huami.treadmill.ui.component.CustomRoundProgressBar;
import com.huami.treadmill.ui.setting.PauseFragment;
import com.huami.treadmill.util.BlurBitmapUtil;
import com.loc.z;
import de.greenrobot.event.EventBus;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 >2\u00020\u0001:\u0002>?B\u0007¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00020\u0006\"\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\u000e\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018J\b\u0010\u001b\u001a\u00020\u0002H\u0016J\u001e\u0010!\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fR\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006@"}, d2 = {"Lcom/huami/treadmill/ui/setting/PauseFragment;", "Landroidx/fragment/app/DialogFragment;", "", "e", "", "duration", "", "", "values", "Landroid/animation/ValueAnimator;", z.j, "", "g", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroyView", "Lcom/huami/treadmill/eventbus/SportCommandEvent;", "commandEvent", "onEventMainThread", "onResume", "Landroidx/fragment/app/FragmentManager;", "supportFragmentManager", "distance", "Lcom/huami/treadmill/ui/setting/PauseFragment$StatusListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "showPauseFragment", "Lcom/huami/treadmill/ui/setting/PauseViewModel;", "mViewModel", "Lcom/huami/treadmill/ui/setting/PauseViewModel;", "getMViewModel", "()Lcom/huami/treadmill/ui/setting/PauseViewModel;", "setMViewModel", "(Lcom/huami/treadmill/ui/setting/PauseViewModel;)V", "a", "Lcom/huami/treadmill/ui/setting/PauseFragment;", "mFragment", "b", "Landroid/animation/ValueAnimator;", "mValueAnimator", "c", LogUtil.I, "mTotalDistance", GoogleApiAvailabilityLight.a, "Lcom/huami/treadmill/ui/setting/PauseFragment$StatusListener;", "mListener", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "mAlertDialog", "Lcom/huami/treadmill/ui/component/CustomRoundProgressBar;", "f", "Lcom/huami/treadmill/ui/component/CustomRoundProgressBar;", "mStopView", "<init>", "()V", "Companion", "StatusListener", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class PauseFragment extends DialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String g = PauseFragment.class.getSimpleName();

    @NotNull
    private static final String h = "distance";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private PauseFragment mFragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ValueAnimator mValueAnimator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mTotalDistance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private StatusListener mListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment mAlertDialog;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private CustomRoundProgressBar mStopView;
    public PauseViewModel mViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/treadmill/ui/setting/PauseFragment$Companion;", "", "Lcom/huami/treadmill/ui/setting/PauseFragment;", "newInstance", "", "DISTANCE", "Ljava/lang/String;", "TAG", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PauseFragment newInstance() {
            return new PauseFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/treadmill/ui/setting/PauseFragment$StatusListener;", "", "", "showDetail", "", "onFinish", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public interface StatusListener {
        void onFinish(boolean showDetail);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BoltSportCommand.values().length];
            iArr[BoltSportCommand.RESUME.ordinal()] = 1;
            iArr[BoltSportCommand.STOP.ordinal()] = 2;
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
            RunningPlayer runningPlayer;
            ProxyTreadmill.Companion companion = ProxyTreadmill.INSTANCE;
            if (companion.getInstance().getErrorStatus() != ErrorStatus.NONE) {
                Toast toastMakeText = Toast.makeText(PauseFragment.this.getContext(), "", 0);
                toastMakeText.setText(R.string.td_pause_continue_error_toast);
                toastMakeText.show();
            } else {
                if (Intrinsics.areEqual(companion.getInstance().getConfigVoicePlay(), Boolean.TRUE) && (runningPlayer = RunningPlayer.getInstance()) != null) {
                    runningPlayer.playResume(25);
                }
                companion.getInstance().resumeTreadmill();
                PauseFragment.this.dismissAllowingStateLoss();
            }
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
            ProxyTreadmill.INSTANCE.getInstance().stopAndDelete();
            PauseFragment.this.dismissAllowingStateLoss();
            StatusListener statusListener = PauseFragment.this.mListener;
            if (statusListener == null) {
                return;
            }
            statusListener.onFinish(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        View view = getView();
        ViewExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.td_pause_continue_btn), 0L, new a(), 1, null);
        View view2 = getView();
        ViewExtKt.smartClick$default(view2 != null ? view2.findViewById(R.id.td_unsave_btn) : null, 0L, new b(), 1, null);
        CustomRoundProgressBar customRoundProgressBar = this.mStopView;
        if (customRoundProgressBar != null) {
            customRoundProgressBar.setTotal(1000);
        }
        CustomRoundProgressBar customRoundProgressBar2 = this.mStopView;
        if (customRoundProgressBar2 != null) {
            customRoundProgressBar2.setOnTouchListener(new View.OnTouchListener() { // from class: ns5
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    return PauseFragment.f(this.a, view3, motionEvent);
                }
            });
        }
        ProxyTreadmill.INSTANCE.getInstance().setErrorStatusListener(new Function1<ErrorStatus, Unit>() { // from class: com.huami.treadmill.ui.setting.PauseFragment$initClick$4
            {
                super(1);
            }

            public final void a(@NotNull ErrorStatus errorStatus) {
                if (errorStatus != ErrorStatus.NONE) {
                    ErrorFragment errorFragmentNewInstance = ErrorFragment.INSTANCE.newInstance();
                    FragmentActivity activity = this.a.getActivity();
                    FragmentManager supportFragmentManager = activity == null ? null : activity.getSupportFragmentManager();
                    int iOrdinal = errorStatus.ordinal();
                    final PauseFragment pauseFragment = this.a;
                    errorFragmentNewInstance.showErrorFragment(supportFragmentManager, iOrdinal, new ErrorFragment.ErrorListener() { // from class: com.huami.treadmill.ui.setting.PauseFragment$initClick$4.1
                        @Override // com.huami.treadmill.ui.setting.ErrorFragment.ErrorListener
                        public void onFinish() {
                            pauseFragment.e();
                        }
                    });
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ErrorStatus errorStatus) {
                a(errorStatus);
                return Unit.INSTANCE;
            }
        });
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.huami.treadmill.ui.setting.PauseFragment$initClick$5
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(@NotNull DialogInterface dialog2, int keyCode, @NotNull KeyEvent event) {
                return keyCode == 4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(PauseFragment pauseFragment, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            ValueAnimator valueAnimator = pauseFragment.mValueAnimator;
            if (valueAnimator != null) {
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                CustomRoundProgressBar customRoundProgressBar = pauseFragment.mStopView;
                if (customRoundProgressBar != null) {
                    customRoundProgressBar.clearAnimation();
                }
            }
            pauseFragment.j(1000L, 0, 1000);
        } else if (action == 1) {
            ValueAnimator valueAnimator2 = pauseFragment.mValueAnimator;
            if (valueAnimator2 != null) {
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                CustomRoundProgressBar customRoundProgressBar2 = pauseFragment.mStopView;
                if (customRoundProgressBar2 != null) {
                    customRoundProgressBar2.clearAnimation();
                }
            }
            int[] iArr = new int[2];
            CustomRoundProgressBar customRoundProgressBar3 = pauseFragment.mStopView;
            iArr[0] = (customRoundProgressBar3 == null ? null : Integer.valueOf(customRoundProgressBar3.getProgress())).intValue();
            iArr[1] = 0;
            pauseFragment.j(100L, iArr);
        }
        return true;
    }

    private final boolean g() {
        AlertDialogFragment alertDialogFragment;
        if (this.mTotalDistance < Keeper.getMinNoticeDisThreshold(getContext())) {
            if (this.mAlertDialog == null) {
                this.mAlertDialog = new AlertDialogFragment.Builder(getContext()).setCancelable(true).setTitle(R.string.td_running_stop_sport_confirm).setMessage(R.string.td_running_short_tip).setNegativeButton(getString(R.string.td_running_btn_continue), new DialogInterface.OnClickListener() { // from class: ms5
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        PauseFragment.h(dialogInterface, i);
                    }
                }).setPositiveButton(getString(R.string.td_running_btn_confirm), new DialogInterface.OnClickListener() { // from class: ls5
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        PauseFragment.i(this.a, dialogInterface, i);
                    }
                }).create();
            }
            AlertDialogFragment alertDialogFragment2 = this.mAlertDialog;
            if (!(alertDialogFragment2 == null ? null : Boolean.valueOf(alertDialogFragment2.isShowing())).booleanValue() && (alertDialogFragment = this.mAlertDialog) != null) {
                alertDialogFragment.show(getFragmentManager());
            }
        } else {
            ProxyTreadmill.INSTANCE.getInstance().stopTreadmill();
            dismissAllowingStateLoss();
            StatusListener statusListener = this.mListener;
            if (statusListener != null) {
                statusListener.onFinish(true);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(PauseFragment pauseFragment, DialogInterface dialogInterface, int i) {
        ProxyTreadmill.INSTANCE.getInstance().stopTreadmill();
        dialogInterface.dismiss();
        pauseFragment.dismissAllowingStateLoss();
        StatusListener statusListener = pauseFragment.mListener;
        if (statusListener == null) {
            return;
        }
        statusListener.onFinish(true);
    }

    private final ValueAnimator j(long duration, int... values) {
        ValueAnimator duration2 = ValueAnimator.ofInt(Arrays.copyOf(values, values.length)).setDuration(duration);
        this.mValueAnimator = duration2;
        if (duration2 != null) {
            duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ks5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PauseFragment.k(this.a, valueAnimator);
                }
            });
        }
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        }
        ValueAnimator valueAnimator2 = this.mValueAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
        return this.mValueAnimator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(PauseFragment pauseFragment, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        CustomRoundProgressBar customRoundProgressBar = pauseFragment.mStopView;
        if (customRoundProgressBar != null) {
            customRoundProgressBar.setProgress(iIntValue);
        }
        CustomRoundProgressBar customRoundProgressBar2 = pauseFragment.mStopView;
        boolean z = false;
        if (customRoundProgressBar2 != null && iIntValue == customRoundProgressBar2.getTotal()) {
            z = true;
        }
        if (z) {
            pauseFragment.g();
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final PauseViewModel getMViewModel() {
        PauseViewModel pauseViewModel = this.mViewModel;
        Objects.requireNonNull(pauseViewModel);
        return pauseViewModel;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.td_fragment_pause, container, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        super.onDestroyView();
    }

    public final void onEventMainThread(@NotNull SportCommandEvent commandEvent) {
        RunningPlayer runningPlayer;
        int i = WhenMappings.$EnumSwitchMapping$0[commandEvent.getCommand().ordinal()];
        if (i == 1) {
            if (Intrinsics.areEqual(ProxyTreadmill.INSTANCE.getInstance().getConfigVoicePlay(), Boolean.TRUE) && (runningPlayer = RunningPlayer.getInstance()) != null) {
                runningPlayer.playResume(25);
            }
            dismissAllowingStateLoss();
            return;
        }
        if (i != 2) {
            return;
        }
        dismissAllowingStateLoss();
        StatusListener statusListener = this.mListener;
        if (statusListener == null) {
            return;
        }
        statusListener.onFinish(true);
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
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity activity = getActivity();
        FrameLayout frameLayout = activity == null ? null : (FrameLayout) activity.findViewById(R.id.content);
        if (frameLayout != null) {
            frameLayout.setDrawingCacheEnabled(true);
            frameLayout.buildDrawingCache();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout.getDrawingCache());
            frameLayout.setDrawingCacheEnabled(false);
            Bitmap bitmapBlurBitmap = BlurBitmapUtil.INSTANCE.blurBitmap(getContext(), bitmapCreateBitmap);
            View view2 = getView();
            ((FrameLayout) (view2 != null ? view2.findViewById(R.id.container) : null)).setBackground(new BitmapDrawable(getResources(), bitmapBlurBitmap));
        }
        this.mTotalDistance = requireArguments().getInt("distance");
        FragmentActivity activity2 = getActivity();
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        setMViewModel((PauseViewModel) AppCompatActivityExtKt.obtainViewModel((AppCompatActivity) activity2, PauseViewModel.class));
        this.mStopView = (CustomRoundProgressBar) view.findViewById(R.id.td_pause_finish_btn);
        e();
        EventBus.getDefault().register(this);
    }

    public final void setMViewModel(@NotNull PauseViewModel pauseViewModel) {
        this.mViewModel = pauseViewModel;
    }

    public final void showPauseFragment(@NotNull FragmentManager supportFragmentManager, int distance, @NotNull StatusListener listener) {
        if (this.mFragment == null) {
            this.mFragment = INSTANCE.newInstance();
        }
        Bundle bundle = new Bundle();
        bundle.putInt("distance", distance);
        PauseFragment pauseFragment = this.mFragment;
        if (pauseFragment != null) {
            pauseFragment.setArguments(bundle);
        }
        PauseFragment pauseFragment2 = this.mFragment;
        if (pauseFragment2 != null) {
            pauseFragment2.mListener = listener;
        }
        if (pauseFragment2 != null) {
            pauseFragment2.setStyle(0, R.style.Dialog_FullScreen);
        }
        if (isAdded() || isVisible()) {
            return;
        }
        String str = g;
        if (supportFragmentManager.findFragmentByTag(str) == null) {
            supportFragmentManager.beginTransaction().add(this.mFragment, str).commitAllowingStateLoss();
            supportFragmentManager.executePendingTransactions();
        }
    }
}
