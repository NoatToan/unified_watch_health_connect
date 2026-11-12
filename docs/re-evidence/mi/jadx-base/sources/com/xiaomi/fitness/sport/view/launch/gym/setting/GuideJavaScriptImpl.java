package com.xiaomi.fitness.sport.view.launch.gym.setting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport.view.launch.gym.setting.GuideJavaScriptImpl;
import com.xiaomi.fitness.sport.view.sporting.IndoorRunningActivity;
import defpackage.iqc;
import defpackage.kad;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/GuideJavaScriptImpl;", "Lkad;", "", "onDeviceGuidFinish", "()V", "Liqc;", "healthWebViewPage", "Liqc;", "", "TAG", "Ljava/lang/String;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Liqc;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GuideJavaScriptImpl extends kad {

    @NotNull
    private final String TAG;

    @NotNull
    private final iqc healthWebViewPage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideJavaScriptImpl(@NotNull Context context, @NotNull iqc healthWebViewPage) {
        super(context, healthWebViewPage);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(healthWebViewPage, "healthWebViewPage");
        this.healthWebViewPage = healthWebViewPage;
        this.TAG = "GuideJavaScriptImpl";
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
            LaunchExtensionKt.startActivity(currentActivity, (Class<?>) IndoorRunningActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: r5b
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

    @Override // defpackage.kad
    @JavascriptInterface
    public void onDeviceGuidFinish() {
        String str = this.TAG;
        GuideWebViewActivity.Companion companion = GuideWebViewActivity.INSTANCE;
        Logger.i(str, "isSportStart: " + companion.isSportStart());
        if (!companion.isSportStart()) {
            finish();
        } else {
            final Bundle bundle = new Bundle();
            this.mainHandler.post(new Runnable() { // from class: t5b
                @Override // java.lang.Runnable
                public final void run() {
                    GuideJavaScriptImpl.onDeviceGuidFinish$lambda$1(this.f34331a, bundle);
                }
            });
        }
    }
}
