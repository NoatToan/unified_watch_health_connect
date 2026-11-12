package com.mi.health.router.framework;

import android.app.ActivityOptions;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.mi.health.a;
import com.mi.health.router.business.IntentHelper;
import com.xiaomi.aicr.vision.VisionAttribute;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
import com.xiaomi.passport.ui.onetrack.TrackConstants;
import com.xiaomi.wearable.yrn.export.YRNHelper;
import com.xiaomi.wearable.yrn.export.YRNHelperExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import miuix.appcompat.app.AppCompatActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/mi/health/router/framework/RouterActivity;", "Lmiuix/appcompat/app/AppCompatActivity;", "<init>", "()V", "TAG", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouterActivity extends AppCompatActivity {

    @NotNull
    private final String TAG = "RouterActivity";

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        boolean privacy_agree = RegionPreference.INSTANCE.getPRIVACY_AGREE();
        boolean z = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().length() > 0;
        Logger.i(this.TAG, TrackConstants.PRIVACY + privacy_agree + "region:" + z);
        if (!privacy_agree || !z) {
            startActivity(new Intent(a.f9964a));
            super.onCreate(savedInstanceState);
            finish();
            return;
        }
        try {
            Intent fitnessIntent = IntentHelper.INSTANCE.parseFitnessIntent(getIntent());
            Logger.i(this.TAG, "intent:tarIntent = " + (fitnessIntent != null ? fitnessIntent.toUri(0) : null));
            if (fitnessIntent == null) {
                Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(32768);
                    startActivity(launchIntentForPackage);
                }
                return;
            }
            int intExtra = fitnessIntent.getIntExtra("key_tab", -1);
            if (intExtra != -1) {
                Bundle bundle = new Bundle();
                bundle.putInt("key_tab", intExtra);
                Application application = getApplication();
                Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
                MainExtKt.showMainActivity(application, null, bundle);
            } else {
                Intrinsics.checkNotNull(fitnessIntent.addFlags(VisionAttribute.VISION_TYPE_CLASS_FACE));
            }
            boolean booleanExtra = fitnessIntent.getBooleanExtra("rn_route", false);
            String stringExtra = fitnessIntent.getStringExtra(FaceDetailFragment.PAGE_NAME);
            if (stringExtra == null) {
                stringExtra = "";
            }
            if (!booleanExtra || stringExtra.length() <= 0) {
                startActivity(fitnessIntent, ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle());
            } else {
                YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).openPage(this, stringExtra);
            }
        } finally {
            super.onCreate(savedInstanceState);
            finish();
        }
    }
}
