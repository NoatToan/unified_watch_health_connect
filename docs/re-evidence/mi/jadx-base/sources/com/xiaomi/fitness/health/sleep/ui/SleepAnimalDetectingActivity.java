package com.xiaomi.fitness.health.sleep.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.LottieAnimationView;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncCallback;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalDetectingActivity;
import com.xiaomi.fitness.health.sleep.utils.SleepAnimalExtKt;
import com.xiaomi.fitness.health.sleep.utils.SyncHelper;
import com.xiaomi.fitness.health.sleep.view.SleepViewModel;
import defpackage.bo0;
import defpackage.c0j;
import defpackage.cv1;
import defpackage.jui;
import defpackage.nte;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001+B\u0007¢\u0006\u0004\b*\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u0019\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0007J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/SleepAnimalDetectingActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/health/sleep/view/SleepViewModel;", "Lbo0;", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncCallback;", "", "initAnimation", "()V", "startCloudSync", "triggerComputeSleepAnimal", "loadingAnimalGeneratingAndJumpReportPage", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "", "success", "onSyncResult", "(Z)V", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "latestAnimalReport", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "animalReport", "Lcom/airbnb/lottie/LottieAnimationView;", "lottieAnimationView", "Lcom/airbnb/lottie/LottieAnimationView;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "timedFinishRunnable$delegate", "Lkotlin/Lazy;", "getTimedFinishRunnable", "()Ljava/lang/Runnable;", "timedFinishRunnable", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepAnimalDetectingActivity extends Hilt_SleepAnimalDetectingActivity<SleepViewModel, bo0> implements FitnessServerSyncCallback {

    @NotNull
    public static final String PARAM_LATEST_ANIMAL_REPORT = "latest_animal_report";

    @NotNull
    public static final String TAG = "SleepAnimalDetectingUI";

    @Nullable
    private SleepAnimalReport animalReport;

    @Nullable
    private SleepAnimalReport latestAnimalReport;
    private LottieAnimationView lottieAnimationView;
    private Handler mainHandler;

    /* JADX INFO: renamed from: timedFinishRunnable$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy timedFinishRunnable = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fgm
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepAnimalDetectingActivity.timedFinishRunnable_delegate$lambda$1(this.f17768a);
        }
    });

    private final Runnable getTimedFinishRunnable() {
        return (Runnable) this.timedFinishRunnable.getValue();
    }

    private final void initAnimation() {
        LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        LottieAnimationView lottieAnimationView2 = null;
        if (lottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lottieAnimationView");
            lottieAnimationView = null;
        }
        lottieAnimationView.B(SleepAnimalExtKt.SLEEP_DETECTING_ANIMATION_URL, "detecting_loading");
        LottieAnimationView lottieAnimationView3 = this.lottieAnimationView;
        if (lottieAnimationView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lottieAnimationView");
            lottieAnimationView3 = null;
        }
        lottieAnimationView3.setFailureListener(new nte() { // from class: dgm
            @Override // defpackage.nte
            public final void onResult(Object obj) {
                SleepAnimalDetectingActivity.initAnimation$lambda$2((Throwable) obj);
            }
        });
        LottieAnimationView lottieAnimationView4 = this.lottieAnimationView;
        if (lottieAnimationView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lottieAnimationView");
            lottieAnimationView4 = null;
        }
        lottieAnimationView4.setRepeatCount(-1);
        LottieAnimationView lottieAnimationView5 = this.lottieAnimationView;
        if (lottieAnimationView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lottieAnimationView");
        } else {
            lottieAnimationView2 = lottieAnimationView5;
        }
        lottieAnimationView2.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initAnimation$lambda$2(Throwable th) {
        Logger.i(TAG, "animation load fail " + th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadingAnimalGeneratingAndJumpReportPage() {
        ((bo0) getMBinding()).D.setText(getString(c0j.bd));
        if (this.mainHandler == null) {
            this.mainHandler = new Handler(Looper.getMainLooper());
        }
        Handler handler = this.mainHandler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainHandler");
            handler = null;
        }
        handler.postDelayed(getTimedFinishRunnable(), VibrateModeProgressBar.sLongToLong);
    }

    private final void startCloudSync() {
        SyncHelper.INSTANCE.syncServerWithCallback(true, "sleep_animal_generate", new WeakReference<>(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Runnable timedFinishRunnable_delegate$lambda$1(final SleepAnimalDetectingActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Runnable() { // from class: cgm
            @Override // java.lang.Runnable
            public final void run() {
                SleepAnimalDetectingActivity.timedFinishRunnable_delegate$lambda$1$lambda$0(this.f5313a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void timedFinishRunnable_delegate$lambda$1$lambda$0(SleepAnimalDetectingActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepAnimalExtKt.gotoSleepAnimalReportActivity$default(this$0, this$0.animalReport, null, false, null, 14, null);
        this$0.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void triggerComputeSleepAnimal() {
        ((SleepViewModel) getMViewModel()).triggerComputeAnimalReport().observe(this, new SleepAnimalDetectingActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: egm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepAnimalDetectingActivity.triggerComputeSleepAnimal$lambda$3(this.f16624a, (SleepAnimalReport) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit triggerComputeSleepAnimal$lambda$3(SleepAnimalDetectingActivity this$0, SleepAnimalReport sleepAnimalReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "triggerComputeSleepAnimal result:" + sleepAnimalReport);
        this$0.animalReport = sleepAnimalReport;
        if ((sleepAnimalReport != null ? sleepAnimalReport.getAnimal() : null) != null) {
            this$0.loadingAnimalGeneratingAndJumpReportPage();
        } else {
            SleepAnimalExtKt.gotoSleepAnimalReportActivity$default(this$0, this$0.animalReport, this$0.latestAnimalReport, true, null, 8, null);
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.e;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return cv1.f14763a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.sleep.ui.Hilt_SleepAnimalDetectingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(c0j.Xf);
        this.lottieAnimationView = ((bo0) getMBinding()).B;
        Intent intent = getIntent();
        SleepAnimalReport sleepAnimalReport = (SleepAnimalReport) (intent != null ? intent.getSerializableExtra("latest_animal_report") : null);
        this.latestAnimalReport = sleepAnimalReport;
        Logger.i(TAG, "getExtra latestReport " + sleepAnimalReport + ";");
        ((bo0) getMBinding()).D.setText(getString(c0j.Ue));
        startCloudSync();
        initAnimation();
    }

    @Override // com.xiaomi.fitness.health.sleep.ui.Hilt_SleepAnimalDetectingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.mainHandler;
        if (handler != null) {
            if (handler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mainHandler");
                handler = null;
            }
            handler.removeCallbacks(getTimedFinishRunnable());
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessServerSyncCallback
    public void onSyncResult(boolean success) {
        Logger.i(TAG, "onSyncResult " + success);
        if (success) {
            triggerComputeSleepAnimal();
        } else {
            ToastExtKt.toastLong(this, c0j.common_network_error_retry_later);
            finish();
        }
    }
}
