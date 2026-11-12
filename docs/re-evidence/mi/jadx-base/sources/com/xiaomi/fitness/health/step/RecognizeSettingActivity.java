package com.xiaomi.fitness.health.step;

import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.utils.NotificationPermission;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AlarmManagerExtKt;
import com.xiaomi.fitness.health.step.RecognizeSettingActivity;
import com.xiaomi.fitness.motion.recognition.MotionRecognizer;
import com.xiaomi.fitness.motion.recognition.extensions.RecognizerExtKt;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.c0j;
import defpackage.jui;
import defpackage.tnb;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u0006R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/health/step/RecognizeSettingActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/health/step/RecognizeViewModel;", "Ltnb;", "", "checkNotifyPermission", "()V", "requestAlarmPermission", "", "isEnable", "()Z", "bindView", "(Ltnb;)V", LifecycleConstantKt.ON_RESUME, "Lcom/xiaomi/fitness/motion/recognition/MotionRecognizer;", "mMotionRecognizer$delegate", "Lkotlin/Lazy;", "getMMotionRecognizer", "()Lcom/xiaomi/fitness/motion/recognition/MotionRecognizer;", "mMotionRecognizer", "Lcom/xiaomi/fitness/widget/SwitchButtonBindingTwoLineTextView;", "recognizeSwitch", "Lcom/xiaomi/fitness/widget/SwitchButtonBindingTwoLineTextView;", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RecognizeSettingActivity extends Hilt_RecognizeSettingActivity<RecognizeViewModel, tnb> {

    /* JADX INFO: renamed from: mMotionRecognizer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mMotionRecognizer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gjj
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecognizeSettingActivity.mMotionRecognizer_delegate$lambda$0();
        }
    });
    private SwitchButtonBindingTwoLineTextView recognizeSwitch;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(RecognizeSettingActivity this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.checkNotifyPermission();
        } else {
            this$0.getMMotionRecognizer().setEnable(false);
        }
    }

    private final void checkNotifyPermission() {
        SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView = null;
        if (AlarmManagerExtKt.canScheduleExactAlarms(this)) {
            SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView2 = this.recognizeSwitch;
            if (switchButtonBindingTwoLineTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recognizeSwitch");
            } else {
                switchButtonBindingTwoLineTextView = switchButtonBindingTwoLineTextView2;
            }
            switchButtonBindingTwoLineTextView.setSwitch(true);
            getMMotionRecognizer().setEnable(true);
            return;
        }
        SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView3 = this.recognizeSwitch;
        if (switchButtonBindingTwoLineTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recognizeSwitch");
        } else {
            switchButtonBindingTwoLineTextView = switchButtonBindingTwoLineTextView3;
        }
        switchButtonBindingTwoLineTextView.setSwitch(false);
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        String string = getString(c0j.Lb);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        CommonDialog notifyAlarmGuideDialogForSingleFunction$default = NotificationPermission.getNotifyAlarmGuideDialogForSingleFunction$default(notificationPermission, this, string, 3, false, new Function1() { // from class: fjj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecognizeSettingActivity.checkNotifyPermission$lambda$2(this.f17850a, ((Boolean) obj).booleanValue());
            }
        }, 8, null);
        if (notifyAlarmGuideDialogForSingleFunction$default != null) {
            notifyAlarmGuideDialogForSingleFunction$default.showIfNeed(getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkNotifyPermission$lambda$2(RecognizeSettingActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.requestAlarmPermission();
        } else {
            this$0.getMMotionRecognizer().setEnable(false);
        }
        return Unit.INSTANCE;
    }

    private final MotionRecognizer getMMotionRecognizer() {
        return (MotionRecognizer) this.mMotionRecognizer.getValue();
    }

    private final boolean isEnable() {
        return getMMotionRecognizer().isEnable() && AlarmManagerExtKt.canScheduleExactAlarms(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MotionRecognizer mMotionRecognizer_delegate$lambda$0() {
        return RecognizerExtKt.getInstance(MotionRecognizer.INSTANCE);
    }

    private final void requestAlarmPermission() {
        NotificationPermission.requestAlarmPermissionIfNeed$default(NotificationPermission.INSTANCE, this, c0j.Lb, false, new Function1() { // from class: ijj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecognizeSettingActivity.requestAlarmPermission$lambda$3(this.f21232a, ((Boolean) obj).booleanValue());
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestAlarmPermission$lambda$3(RecognizeSettingActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMMotionRecognizer().setEnable(z);
        if (z) {
            SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView = this$0.recognizeSwitch;
            if (switchButtonBindingTwoLineTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recognizeSwitch");
                switchButtonBindingTwoLineTextView = null;
            }
            switchButtonBindingTwoLineTextView.setSwitch(true);
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull tnb tnbVar) {
        Intrinsics.checkNotNullParameter(tnbVar, "<this>");
        setTitle(c0j.W9);
        SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView = tnbVar.A;
        this.recognizeSwitch = switchButtonBindingTwoLineTextView;
        switchButtonBindingTwoLineTextView.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: hjj
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                RecognizeSettingActivity.bindView$lambda$1(this.f20134a, z, iSwitchButton);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.C2;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((tnb) getMBinding()).A.setSwitch(isEnable());
    }
}
