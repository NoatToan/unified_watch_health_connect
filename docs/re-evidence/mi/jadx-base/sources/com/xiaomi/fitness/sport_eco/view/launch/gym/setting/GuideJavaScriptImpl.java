package com.xiaomi.fitness.sport_eco.view.launch.gym.setting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.GuideJavaScriptImpl;
import com.xiaomi.fitness.sport_eco.view.sporting.IndoorRidingActivity;
import com.xiaomi.fitness.sport_eco.view.sporting.IndoorRunningActivity;
import com.xiaomi.fitness.sport_eco.view.sporting.JumpingActivity;
import defpackage.iqc;
import defpackage.kad;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/GuideJavaScriptImpl;", "Lkad;", "", "isFastShake", "()Z", "", "onDeviceGuidFinish", "()V", "Liqc;", "healthWebViewPage", "Liqc;", "", "TAG", "Ljava/lang/String;", "", "lastClickTime", "J", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Liqc;)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GuideJavaScriptImpl extends kad {

    @NotNull
    private final String TAG;

    @NotNull
    private final iqc healthWebViewPage;
    private long lastClickTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideJavaScriptImpl(@NotNull Context context, @NotNull iqc healthWebViewPage) {
        super(context, healthWebViewPage);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(healthWebViewPage, "healthWebViewPage");
        this.healthWebViewPage = healthWebViewPage;
        this.TAG = "GuideJavaScriptImpl";
    }

    private final boolean isFastShake() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.lastClickTime;
        if (0 <= j && j < 1201) {
            return false;
        }
        this.lastClickTime = jCurrentTimeMillis;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDeviceGuidFinish$lambda$1(GuideJavaScriptImpl this$0, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        this$0.healthWebViewPage.finishFromWeb();
        bundle.putBoolean("LOCAL_DEVICE_LAUNCH", true);
        bundle.putInt("KEY_SPORT_TYPE", 3);
        bundle.putInt("DEVICE_TYPE", 1);
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity != null) {
            LaunchExtensionKt.startActivity(currentActivity, (Class<?>) IndoorRunningActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: u5b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GuideJavaScriptImpl.onDeviceGuidFinish$lambda$1$lambda$0(bundle, (Intent) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeviceGuidFinish$lambda$1$lambda$0(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDeviceGuidFinish$lambda$3(GuideJavaScriptImpl this$0, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        this$0.healthWebViewPage.finishFromWeb();
        bundle.putBoolean("LOCAL_DEVICE_LAUNCH", true);
        bundle.putInt("KEY_SPORT_TYPE", 7);
        bundle.putInt("DEVICE_TYPE", 1);
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity != null) {
            LaunchExtensionKt.startActivity(currentActivity, (Class<?>) IndoorRidingActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: b6b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GuideJavaScriptImpl.onDeviceGuidFinish$lambda$3$lambda$2(bundle, (Intent) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeviceGuidFinish$lambda$3$lambda$2(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDeviceGuidFinish$lambda$5(GuideJavaScriptImpl this$0, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        this$0.healthWebViewPage.finishFromWeb();
        bundle.putBoolean("LOCAL_DEVICE_LAUNCH", false);
        bundle.putInt("DEVICE_TYPE", 1);
        bundle.putInt("KEY_SPORT_TYPE", 14);
        bundle.putInt(SportConstants.TRAINING_MODE, 0);
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity != null) {
            LaunchExtensionKt.startActivity(currentActivity, (Class<?>) JumpingActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: a6b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GuideJavaScriptImpl.onDeviceGuidFinish$lambda$5$lambda$4(bundle, (Intent) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeviceGuidFinish$lambda$5$lambda$4(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDeviceGuidFinish$lambda$7(final Bundle bundle, GuideJavaScriptImpl this$0) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        bundle.putBoolean("LOCAL_DEVICE_LAUNCH", false);
        bundle.putInt("KEY_SPORT_TYPE", 7);
        bundle.putInt("DEVICE_TYPE", 1);
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity != null) {
            LaunchExtensionKt.startActivity(currentActivity, (Class<?>) IndoorRidingActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: q5b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GuideJavaScriptImpl.onDeviceGuidFinish$lambda$7$lambda$6(bundle, (Intent) obj);
                }
            });
        }
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeviceGuidFinish$lambda$7$lambda$6(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDeviceGuidFinish$lambda$9(GuideJavaScriptImpl this$0, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        this$0.healthWebViewPage.finishFromWeb();
        bundle.putBoolean("LOCAL_DEVICE_LAUNCH", false);
        bundle.putInt("DEVICE_TYPE", 1);
        bundle.putInt("KEY_SPORT_TYPE", 14);
        bundle.putInt(SportConstants.TRAINING_MODE, 0);
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity != null) {
            LaunchExtensionKt.startActivity(currentActivity, (Class<?>) JumpingActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: s5b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GuideJavaScriptImpl.onDeviceGuidFinish$lambda$9$lambda$8(bundle, (Intent) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeviceGuidFinish$lambda$9$lambda$8(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        if (r7.equals(com.xiaomi.fitness.sport_eco_manager_export.SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r7.equals("yunmai.jmprope.sr804") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r7.equals("yunmai.jmprope.sr803") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        r10.mainHandler.post(new defpackage.x5b(r10, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if (r7.equals("runmi.exbike.jscrm1") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (r7.equals("yesoul.exbike.jsc01y") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        r10.mainHandler.post(new defpackage.w5b(r10, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d1, code lost:
    
        if (r7.equals(com.xiaomi.fitness.sport_eco_manager_export.SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d8, code lost:
    
        if (r7.equals("yunmai.jmprope.sr804") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
    
        if (r7.equals("yunmai.jmprope.sr803") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
    
        r10.mainHandler.post(new defpackage.z5b(r10, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
    
        if (r7.equals("runmi.exbike.jscrm1") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f8, code lost:
    
        if (r7.equals("yesoul.exbike.jsc01y") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fa, code lost:
    
        r10.mainHandler.post(new defpackage.y5b(r0, r10));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.kad
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDeviceGuidFinish() {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.GuideJavaScriptImpl.onDeviceGuidFinish():void");
    }
}
