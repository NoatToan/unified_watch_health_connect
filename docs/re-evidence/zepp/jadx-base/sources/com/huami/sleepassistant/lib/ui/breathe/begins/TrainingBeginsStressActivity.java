package com.huami.sleepassistant.lib.ui.breathe.begins;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sleepassistant.lib.R;
import com.huami.sleepassistant.lib.ui.breathe.adapter.BreathePickAdapter;
import com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsStressActivity;
import com.huami.sleepassistant.lib.ui.breathe.begins.utils.BreatheMediaPlayUtils;
import com.huami.sleepassistant.lib.utils.SlRecorderEventHelper;
import com.huami.sleepassistant.lib.widget.AlertDialogFragment;
import com.huami.sleepassistant.lib.widget.BubbleMaskView;
import com.huami.sleepassistant.lib.widget.HollowTextView;
import com.huami.sleepassistant.lib.widget.ProgressView;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.typeface.TypefaceTextView;
import com.huami.widget.wheelview.WheelView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0014R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/breathe/begins/TrainingBeginsStressActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "y", "initView", "u", "J", LogUtil.I, "", "value", "H", "F", "G", "", "alpha", "K", "E", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "finish", "onPause", "Lcom/huami/sleepassistant/lib/ui/breathe/begins/TrainingBeginsModel;", "x", "Lkotlin/Lazy;", "t", "()Lcom/huami/sleepassistant/lib/ui/breathe/begins/TrainingBeginsModel;", "viewModel", "Lcom/huami/sleepassistant/lib/ui/breathe/begins/utils/BreatheMediaPlayUtils;", "Lcom/huami/sleepassistant/lib/ui/breathe/begins/utils/BreatheMediaPlayUtils;", "mediaUtils", "", "z", "Z", "mIsBreatheTraining", "Lcom/huami/sleepassistant/lib/widget/AlertDialogFragment;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/huami/sleepassistant/lib/widget/AlertDialogFragment;", "mReTrainingBeginDialogFragment", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class TrainingBeginsStressActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment mReTrainingBeginDialogFragment;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    private BreatheMediaPlayUtils mediaUtils;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private boolean mIsBreatheTraining;

    /* JADX WARN: Multi-variable type inference failed */
    public TrainingBeginsStressActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsStressActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TrainingBeginsModel>() { // from class: com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsStressActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final TrainingBeginsModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(TrainingBeginsModel.class), function0, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(TrainingBeginsStressActivity trainingBeginsStressActivity, Unit unit) throws IOException {
        trainingBeginsStressActivity.mIsBreatheTraining = true;
        BreatheMediaPlayUtils breatheMediaPlayUtils = trainingBeginsStressActivity.mediaUtils;
        if (breatheMediaPlayUtils != null) {
            breatheMediaPlayUtils.playBackgroundMusic();
        }
        trainingBeginsStressActivity.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(TrainingBeginsStressActivity trainingBeginsStressActivity, Integer num) throws IOException {
        if (num != null && num.intValue() == 1) {
            ((BubbleMaskView) trainingBeginsStressActivity.findViewById(R.id.sls_bubble_mask_view)).startBigSync(4000);
            BreatheMediaPlayUtils breatheMediaPlayUtils = trainingBeginsStressActivity.mediaUtils;
            if (breatheMediaPlayUtils == null) {
                return;
            }
            breatheMediaPlayUtils.playTypeMusic(BreatheMediaPlayUtils.PlayType.INHALE);
            return;
        }
        ((BubbleMaskView) trainingBeginsStressActivity.findViewById(R.id.sls_bubble_mask_view)).startSmallSync(4000);
        BreatheMediaPlayUtils breatheMediaPlayUtils2 = trainingBeginsStressActivity.mediaUtils;
        if (breatheMediaPlayUtils2 == null) {
            return;
        }
        breatheMediaPlayUtils2.playTypeMusic(BreatheMediaPlayUtils.PlayType.EXPIRATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(TrainingBeginsStressActivity trainingBeginsStressActivity, Integer num) {
        ((ProgressView) trainingBeginsStressActivity.findViewById(R.id.sls_progress_view)).updateProgress(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(TrainingBeginsStressActivity trainingBeginsStressActivity, Integer num) {
        trainingBeginsStressActivity.mIsBreatheTraining = false;
        BreatheMediaPlayUtils breatheMediaPlayUtils = trainingBeginsStressActivity.mediaUtils;
        if (breatheMediaPlayUtils != null) {
            breatheMediaPlayUtils.finishAll();
        }
        trainingBeginsStressActivity.H(num.intValue());
    }

    private final void E() {
        if (!this.mIsBreatheTraining) {
            finish();
            return;
        }
        BreatheMediaPlayUtils breatheMediaPlayUtils = this.mediaUtils;
        if (breatheMediaPlayUtils != null) {
            breatheMediaPlayUtils.pauseMediaPlayer();
        }
        ((BubbleMaskView) findViewById(R.id.sls_bubble_mask_view)).pauseBubbleView(true);
        t().pauseStressCountDown();
        AlertDialogFragment alertDialogFragment = new AlertDialogFragment();
        this.mReTrainingBeginDialogFragment = alertDialogFragment;
        alertDialogFragment.setListener(new AlertDialogFragment.OnClickListener() { // from class: com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsStressActivity$onClickBack$1
            @Override // com.huami.sleepassistant.lib.widget.AlertDialogFragment.OnClickListener
            public void onNegativeButtonClick() {
                this.a.mIsBreatheTraining = false;
                this.a.finish();
            }

            @Override // com.huami.sleepassistant.lib.widget.AlertDialogFragment.OnClickListener
            public void onPositiveButtonClick() {
                BreatheMediaPlayUtils breatheMediaPlayUtils2 = this.a.mediaUtils;
                if (breatheMediaPlayUtils2 != null) {
                    breatheMediaPlayUtils2.restartMediaPlayer();
                }
                ((BubbleMaskView) this.a.findViewById(R.id.sls_bubble_mask_view)).pauseBubbleView(false);
                this.a.t().restartStressCountDown((((WheelView) this.a.findViewById(R.id.sls_duration_picker)).getRealCurrentItem() + 1) * 60);
            }
        });
        AlertDialogFragment alertDialogFragment2 = this.mReTrainingBeginDialogFragment;
        if (alertDialogFragment2 != null) {
            alertDialogFragment2.setCancelable(false);
        }
        AlertDialogFragment alertDialogFragment3 = this.mReTrainingBeginDialogFragment;
        if (alertDialogFragment3 == null) {
            return;
        }
        alertDialogFragment3.show(getSupportFragmentManager(), "sls.training.begins.stress.dialog.tag");
    }

    private final void F() {
        ((ConstraintLayout) findViewById(R.id.sls_breathe_done_layout)).setVisibility(8);
        ((TypefaceTextView) findViewById(R.id.sls_btn_again)).setVisibility(8);
        ((HollowTextView) findViewById(R.id.sls_tv_time)).setVisibility(0);
        ((TypefaceTextView) findViewById(R.id.sls_tv_1)).setVisibility(0);
        ((ProgressView) findViewById(R.id.sls_progress_view)).updateProgress(0);
    }

    private final void G() {
        getWindow().clearFlags(128);
        getWindow().clearFlags(4194304);
        ((ConstraintLayout) findViewById(R.id.sls_breathe_ready)).setVisibility(0);
        ((TypefaceTextView) findViewById(R.id.sls_breathe_ready_msg)).setVisibility(0);
        ((TypefaceTextView) findViewById(R.id.sls_btn_start)).setVisibility(0);
        ((ConstraintLayout) findViewById(R.id.sls_breathe_done_layout)).setVisibility(8);
        ((TypefaceTextView) findViewById(R.id.sls_btn_again)).setVisibility(8);
        int i = R.id.sls_progress_view;
        ((ProgressView) findViewById(i)).setVisibility(8);
        ((BubbleMaskView) findViewById(R.id.sls_bubble_mask_view)).setVisibility(8);
        K(1.0f);
        ((HollowTextView) findViewById(R.id.sls_tv_time)).setVisibility(8);
        ((TypefaceTextView) findViewById(R.id.sls_tv_1)).setVisibility(8);
        ((ProgressView) findViewById(i)).updateProgress(0);
        ((WheelView) findViewById(R.id.sls_duration_picker)).setCurrentItem(0);
        AlertDialogFragment alertDialogFragment = this.mReTrainingBeginDialogFragment;
        if (alertDialogFragment == null || alertDialogFragment.getDialog() == null) {
            return;
        }
        alertDialogFragment.dismissAllowingStateLoss();
    }

    private final void H(int value) {
        getWindow().clearFlags(128);
        getWindow().clearFlags(4194304);
        ((TypefaceTextView) findViewById(R.id.sls_breathe_training_times)).setText(getResources().getQuantityString(R.plurals.sls_breathe_training_times, value, Integer.valueOf(value)));
        ((ConstraintLayout) findViewById(R.id.sls_breathe_done_layout)).setVisibility(0);
        ((TypefaceTextView) findViewById(R.id.sls_btn_again)).setVisibility(0);
        ((ProgressView) findViewById(R.id.sls_progress_view)).setVisibility(8);
        ((BubbleMaskView) findViewById(R.id.sls_bubble_mask_view)).setVisibility(8);
        K(1.0f);
    }

    private final void I() {
        ((HollowTextView) findViewById(R.id.sls_tv_time)).setVisibility(8);
        ((TypefaceTextView) findViewById(R.id.sls_tv_1)).setVisibility(8);
        ((ProgressView) findViewById(R.id.sls_progress_view)).setVisibility(0);
        ((BubbleMaskView) findViewById(R.id.sls_bubble_mask_view)).setVisibility(0);
    }

    private final void J() {
        ((ConstraintLayout) findViewById(R.id.sls_breathe_ready)).setVisibility(8);
        ((TypefaceTextView) findViewById(R.id.sls_breathe_ready_msg)).setVisibility(8);
        ((TypefaceTextView) findViewById(R.id.sls_btn_start)).setVisibility(8);
        ((HollowTextView) findViewById(R.id.sls_tv_time)).setVisibility(0);
        ((TypefaceTextView) findViewById(R.id.sls_tv_1)).setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(float alpha) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.alpha = alpha;
        getWindow().addFlags(2);
        getWindow().setAttributes(attributes);
    }

    private final void initView() {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (true) {
            int i2 = i + 1;
            arrayList.add(Integer.valueOf(i));
            if (i2 > 5) {
                int i3 = R.id.sls_duration_picker;
                BreathePickAdapter breathePickAdapter = new BreathePickAdapter(this, arrayList, (WheelView) findViewById(i3));
                ((WheelView) findViewById(i3)).setCenterDrawable(android.R.color.transparent);
                ((WheelView) findViewById(i3)).setVisibleItems(3);
                ((WheelView) findViewById(i3)).setViewAdapter(breathePickAdapter);
                int statusBarHeight = BaseTitleActivity.getStatusBarHeight(this);
                int i4 = R.id.back;
                ViewGroup.LayoutParams layoutParams = ((ImageView) findViewById(i4)).getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = statusBarHeight;
                ((ImageView) findViewById(i4)).setLayoutParams(layoutParams2);
                int i5 = R.id.user_name;
                ViewGroup.LayoutParams layoutParams3 = ((TypefaceTextView) findViewById(i5)).getLayoutParams();
                Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = statusBarHeight;
                ((TypefaceTextView) findViewById(i5)).setLayoutParams(layoutParams4);
                ((BubbleMaskView) findViewById(R.id.sls_bubble_mask_view)).setAlphaChangeCallback(new BubbleMaskView.AlphaChangeCallback() { // from class: com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsStressActivity.initView.1
                    @Override // com.huami.sleepassistant.lib.widget.BubbleMaskView.AlphaChangeCallback
                    public void alphaChange(float alpha) {
                        TrainingBeginsStressActivity.this.K(alpha);
                    }
                });
                return;
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrainingBeginsModel t() {
        return (TrainingBeginsModel) this.viewModel.getValue();
    }

    private final void u() {
        ((TypefaceTextView) findViewById(R.id.sls_btn_start)).setOnClickListener(new View.OnClickListener() { // from class: gu7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingBeginsStressActivity.v(this.a, view);
            }
        });
        ((TypefaceTextView) findViewById(R.id.sls_btn_again)).setOnClickListener(new View.OnClickListener() { // from class: eu7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingBeginsStressActivity.w(this.a, view);
            }
        });
        ((ImageView) findViewById(R.id.back)).setOnClickListener(new View.OnClickListener() { // from class: fu7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingBeginsStressActivity.x(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(TrainingBeginsStressActivity trainingBeginsStressActivity, View view) {
        trainingBeginsStressActivity.J();
        trainingBeginsStressActivity.t().startStressCountDown((((WheelView) trainingBeginsStressActivity.findViewById(R.id.sls_duration_picker)).getRealCurrentItem() + 1) * 60);
        SlRecorderEventHelper.BreatheTrainHelper.INSTANCE.uploadButtonEvent(SlRecorderEventHelper.DECOMPRESSION_READY_BEGIN_C);
        trainingBeginsStressActivity.getWindow().addFlags(128);
        trainingBeginsStressActivity.getWindow().addFlags(4194304);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(TrainingBeginsStressActivity trainingBeginsStressActivity, View view) {
        trainingBeginsStressActivity.F();
        trainingBeginsStressActivity.t().startStressCountDown((((WheelView) trainingBeginsStressActivity.findViewById(R.id.sls_duration_picker)).getRealCurrentItem() + 1) * 60);
        trainingBeginsStressActivity.getWindow().addFlags(128);
        trainingBeginsStressActivity.getWindow().addFlags(4194304);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(TrainingBeginsStressActivity trainingBeginsStressActivity, View view) {
        trainingBeginsStressActivity.E();
    }

    private final void y() {
        t().getCountDownLiveData().observe(this, new Observer() { // from class: ku7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TrainingBeginsStressActivity.z(this.a, (String) obj);
            }
        });
        t().getShowBubbleViewLiveData().observe(this, new Observer() { // from class: lu7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) throws IOException {
                TrainingBeginsStressActivity.A(this.a, (Unit) obj);
            }
        });
        t().getBubbleChangeLiveData().observe(this, new Observer() { // from class: ju7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) throws IOException {
                TrainingBeginsStressActivity.B(this.a, (Integer) obj);
            }
        });
        t().getProgressChangeLiveData().observe(this, new Observer() { // from class: hu7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TrainingBeginsStressActivity.C(this.a, (Integer) obj);
            }
        });
        t().getDoneLiveData().observe(this, new Observer() { // from class: iu7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TrainingBeginsStressActivity.D(this.a, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(TrainingBeginsStressActivity trainingBeginsStressActivity, String str) {
        int i = R.id.sls_tv_time;
        ((HollowTextView) trainingBeginsStressActivity.findViewById(i)).setText(str);
        ((HollowTextView) trainingBeginsStressActivity.findViewById(i)).startAnim();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.app.Activity
    public void finish() {
        setResult(-1);
        super.finish();
        BreatheMediaPlayUtils breatheMediaPlayUtils = this.mediaUtils;
        if (breatheMediaPlayUtils == null) {
            return;
        }
        breatheMediaPlayUtils.finishAll();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        E();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sls_activity_training__begins_stress);
        setStyle(BaseTitleActivity.STYLE.NONE);
        initView();
        u();
        this.mediaUtils = BreatheMediaPlayUtils.INSTANCE.getInstance(getApplicationContext());
        y();
        SlRecorderEventHelper.BreatheTrainHelper.INSTANCE.uploadButtonEvent(SlRecorderEventHelper.DECOMPRESSION_READY_BEGIN_V);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.mIsBreatheTraining) {
            this.mIsBreatheTraining = false;
            t().finishStressCountDown();
            BreatheMediaPlayUtils breatheMediaPlayUtils = this.mediaUtils;
            if (breatheMediaPlayUtils != null) {
                breatheMediaPlayUtils.finishAll();
            }
            G();
        }
    }
}
