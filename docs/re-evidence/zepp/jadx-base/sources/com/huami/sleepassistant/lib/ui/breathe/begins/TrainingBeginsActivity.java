package com.huami.sleepassistant.lib.ui.breathe.begins;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.mifit.analytics.helper.ActivityTrackHelper;
import com.huami.sleepassistant.lib.R;
import com.huami.sleepassistant.lib.ui.base.ext.ViewExKt;
import com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsActivity;
import com.huami.sleepassistant.lib.ui.breathe.begins.utils.BreatheMediaPlayUtils;
import com.huami.sleepassistant.lib.utils.SlRecorderEventHelper;
import com.huami.sleepassistant.lib.widget.BubbleMaskView;
import com.huami.sleepassistant.lib.widget.HollowTextView;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.typeface.TypefaceTextView;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0014J\b\u0010\u0010\u001a\u00020\u0002H\u0014R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/breathe/begins/TrainingBeginsActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "C", "v", "G", LogUtil.I, "H", "", "alpha", "J", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "finish", "onResume", "onPause", "Lcom/huami/sleepassistant/lib/ui/breathe/begins/TrainingBeginsModel;", "x", "Lkotlin/Lazy;", "u", "()Lcom/huami/sleepassistant/lib/ui/breathe/begins/TrainingBeginsModel;", "viewModel", "Lcom/huami/sleepassistant/lib/ui/breathe/begins/utils/BreatheMediaPlayUtils;", "y", "Lcom/huami/sleepassistant/lib/ui/breathe/begins/utils/BreatheMediaPlayUtils;", "mediaUtils", "Lcom/huami/mifit/analytics/helper/ActivityTrackHelper;", "z", "Lcom/huami/mifit/analytics/helper/ActivityTrackHelper;", "tracker", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class TrainingBeginsActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    private BreatheMediaPlayUtils mediaUtils;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final ActivityTrackHelper tracker;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "duration", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Long, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            SlRecorderEventHelper.BreatheTrainHelper.INSTANCE.breatheTrainingTime(j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrainingBeginsActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TrainingBeginsModel>() { // from class: com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TrainingBeginsModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(TrainingBeginsModel.class), function0, objArr);
            }
        });
        this.tracker = new ActivityTrackHelper(a.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(TrainingBeginsActivity trainingBeginsActivity, Integer num) throws IOException {
        if (num != null && num.intValue() == 4000) {
            ((BubbleMaskView) trainingBeginsActivity.findViewById(R.id.sls_bubble_mask_view)).startBigSync(4000);
            BreatheMediaPlayUtils breatheMediaPlayUtils = trainingBeginsActivity.mediaUtils;
            if (breatheMediaPlayUtils == null) {
                return;
            }
            breatheMediaPlayUtils.playTypeMusic(BreatheMediaPlayUtils.PlayType.INHALE);
            return;
        }
        if (num != null && num.intValue() == 7000) {
            ((BubbleMaskView) trainingBeginsActivity.findViewById(R.id.sls_bubble_mask_view)).startStatusSync();
            BreatheMediaPlayUtils breatheMediaPlayUtils2 = trainingBeginsActivity.mediaUtils;
            if (breatheMediaPlayUtils2 == null) {
                return;
            }
            breatheMediaPlayUtils2.playTypeMusic(BreatheMediaPlayUtils.PlayType.HOLD_YOUR_BREATH);
            return;
        }
        ((BubbleMaskView) trainingBeginsActivity.findViewById(R.id.sls_bubble_mask_view)).startSmallSync(8000);
        BreatheMediaPlayUtils breatheMediaPlayUtils3 = trainingBeginsActivity.mediaUtils;
        if (breatheMediaPlayUtils3 == null) {
            return;
        }
        breatheMediaPlayUtils3.playTypeMusic(BreatheMediaPlayUtils.PlayType.EXPIRATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(TrainingBeginsActivity trainingBeginsActivity, Unit unit) {
        ((BubbleMaskView) trainingBeginsActivity.findViewById(R.id.sls_bubble_mask_view)).clearBubble();
    }

    private final void C() {
        this.mediaUtils = BreatheMediaPlayUtils.INSTANCE.getInstance(getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(TrainingBeginsActivity trainingBeginsActivity, View view) {
        trainingBeginsActivity.u().startCountdown();
        SlRecorderEventHelper.BreatheTrainHelper.INSTANCE.breatheTrainingCount();
        trainingBeginsActivity.getWindow().addFlags(128);
        trainingBeginsActivity.getWindow().addFlags(4194304);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(TrainingBeginsActivity trainingBeginsActivity, View view) {
        trainingBeginsActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(TrainingBeginsActivity trainingBeginsActivity, View view) {
        trainingBeginsActivity.u().finishCountdown();
        BreatheMediaPlayUtils breatheMediaPlayUtils = trainingBeginsActivity.mediaUtils;
        if (breatheMediaPlayUtils != null) {
            breatheMediaPlayUtils.finishAll();
        }
        trainingBeginsActivity.G();
    }

    private final void G() {
        getWindow().clearFlags(128);
        getWindow().clearFlags(4194304);
        ViewExKt.setVisible((TypefaceTextView) findViewById(R.id.sls_btn_start), true);
        ViewExKt.setVisible((ConstraintLayout) findViewById(R.id.sls_breathe_ready), true);
        ViewExKt.setVisible((ImageView) findViewById(R.id.back), true);
        ViewExKt.setVisible((TypefaceTextView) findViewById(R.id.user_name), true);
        ViewExKt.setVisible((HollowTextView) findViewById(R.id.sls_tv_time), false);
        ViewExKt.setVisible((TypefaceTextView) findViewById(R.id.sls_tv_1), false);
        ViewExKt.setVisible((TypefaceTextView) findViewById(R.id.sls_tv_2), false);
        int i = R.id.sls_bubble_mask_view;
        ViewExKt.setVisible((BubbleMaskView) findViewById(i), false);
        J(1.0f);
        ViewExKt.setVisible((TypefaceTextView) findViewById(R.id.sls_over_training), false);
        ((BubbleMaskView) findViewById(i)).initBubble();
    }

    private final void H() {
        ViewExKt.setVisible((BubbleMaskView) findViewById(R.id.sls_bubble_mask_view), true);
        ViewExKt.setVisible((TypefaceTextView) findViewById(R.id.sls_over_training), true);
        ViewExKt.setVisible((ImageView) findViewById(R.id.back), false);
        ViewExKt.setVisible((TypefaceTextView) findViewById(R.id.user_name), false);
        ViewExKt.setVisible((ConstraintLayout) findViewById(R.id.sls_breathe_ready), false);
        ViewExKt.setVisible((TypefaceTextView) findViewById(R.id.sls_btn_start), false);
        ViewExKt.setVisible((HollowTextView) findViewById(R.id.sls_tv_time), false);
        ViewExKt.setVisible((TypefaceTextView) findViewById(R.id.sls_tv_1), false);
        ViewExKt.setVisible((TypefaceTextView) findViewById(R.id.sls_tv_2), false);
    }

    private final void I() {
        ViewExKt.setVisible((TypefaceTextView) findViewById(R.id.sls_btn_start), false);
        ViewExKt.setVisible((ConstraintLayout) findViewById(R.id.sls_breathe_ready), false);
        ViewExKt.setVisible((HollowTextView) findViewById(R.id.sls_tv_time), true);
        ViewExKt.setVisible((TypefaceTextView) findViewById(R.id.sls_tv_1), true);
        ViewExKt.setVisible((TypefaceTextView) findViewById(R.id.sls_tv_2), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(float alpha) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.alpha = alpha;
        getWindow().addFlags(2);
        getWindow().setAttributes(attributes);
    }

    private final TrainingBeginsModel u() {
        return (TrainingBeginsModel) this.viewModel.getValue();
    }

    private final void v() {
        u().getStartFirstInitViewLiveData().observe(this, new Observer() { // from class: bu7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TrainingBeginsActivity.w(this.a, (Unit) obj);
            }
        });
        u().getShowBubbleViewLiveData().observe(this, new Observer() { // from class: du7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) throws IOException {
                TrainingBeginsActivity.x(this.a, (Unit) obj);
            }
        });
        u().getResetViewLiveData().observe(this, new Observer() { // from class: au7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TrainingBeginsActivity.y(this.a, (Unit) obj);
            }
        });
        u().getCountDownLiveData().observe(this, new Observer() { // from class: zt7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TrainingBeginsActivity.z(this.a, (String) obj);
            }
        });
        u().getBubbleChangeLiveData().observe(this, new Observer() { // from class: yt7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) throws IOException {
                TrainingBeginsActivity.A(this.a, (Integer) obj);
            }
        });
        u().getClearBubbleLiveData().observe(this, new Observer() { // from class: cu7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TrainingBeginsActivity.B(this.a, (Unit) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(TrainingBeginsActivity trainingBeginsActivity, Unit unit) {
        trainingBeginsActivity.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(TrainingBeginsActivity trainingBeginsActivity, Unit unit) throws IOException {
        BreatheMediaPlayUtils breatheMediaPlayUtils = trainingBeginsActivity.mediaUtils;
        if (breatheMediaPlayUtils != null) {
            breatheMediaPlayUtils.playBackgroundMusic();
        }
        trainingBeginsActivity.H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(TrainingBeginsActivity trainingBeginsActivity, Unit unit) {
        BreatheMediaPlayUtils breatheMediaPlayUtils = trainingBeginsActivity.mediaUtils;
        if (breatheMediaPlayUtils != null) {
            breatheMediaPlayUtils.finishAll();
        }
        trainingBeginsActivity.G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(TrainingBeginsActivity trainingBeginsActivity, String str) {
        int i = R.id.sls_tv_time;
        ((HollowTextView) trainingBeginsActivity.findViewById(i)).setText(str);
        ((HollowTextView) trainingBeginsActivity.findViewById(i)).startAnim();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        u().finishCountdown();
        BreatheMediaPlayUtils breatheMediaPlayUtils = this.mediaUtils;
        if (breatheMediaPlayUtils == null) {
            return;
        }
        breatheMediaPlayUtils.finishAll();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sls_activity_training_begins);
        setStyle(BaseTitleActivity.STYLE.NONE);
        ((TypefaceTextView) findViewById(R.id.sls_btn_start)).setOnClickListener(new View.OnClickListener() { // from class: vt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingBeginsActivity.D(this.a, view);
            }
        });
        ((ImageView) findViewById(R.id.back)).setOnClickListener(new View.OnClickListener() { // from class: xt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingBeginsActivity.E(this.a, view);
            }
        });
        ((TypefaceTextView) findViewById(R.id.sls_over_training)).setOnClickListener(new View.OnClickListener() { // from class: wt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingBeginsActivity.F(this.a, view);
            }
        });
        ((BubbleMaskView) findViewById(R.id.sls_bubble_mask_view)).setAlphaChangeCallback(new BubbleMaskView.AlphaChangeCallback() { // from class: com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsActivity.onCreate.4
            @Override // com.huami.sleepassistant.lib.widget.BubbleMaskView.AlphaChangeCallback
            public void alphaChange(float alpha) {
                TrainingBeginsActivity.this.J(alpha);
            }
        });
        v();
        C();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.tracker.onActivityPaused();
        u().finishCountdown();
        BreatheMediaPlayUtils breatheMediaPlayUtils = this.mediaUtils;
        if (breatheMediaPlayUtils != null) {
            breatheMediaPlayUtils.finishAll();
        }
        G();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.tracker.onActivityResumed();
    }
}
