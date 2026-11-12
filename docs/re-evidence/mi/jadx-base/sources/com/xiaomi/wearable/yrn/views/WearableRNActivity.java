package com.xiaomi.wearable.yrn.views;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.wearable.yrn.helper.WearableRNPageStackControl;
import com.xiaomi.yrn.controller.ui.YRNCMainActivity;
import defpackage.vgi;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0014J\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/wearable/yrn/views/WearableRNActivity;", "Lcom/xiaomi/yrn/controller/ui/YRNCMainActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "updateNavigationBarColor", LifecycleConstantKt.ON_DESTROY, "enablePadOrientationRotate", "", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWearableRNActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WearableRNActivity.kt\ncom/xiaomi/wearable/yrn/views/WearableRNActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
public final class WearableRNActivity extends YRNCMainActivity {
    private final void updateNavigationBarColor() {
        getWindow().setNavigationBarColor((getResources().getConfiguration().uiMode & 48) == 32 ? -16777216 : -1);
    }

    public final boolean enablePadOrientationRotate() {
        return true;
    }

    @Override // com.xiaomi.yrn.controller.ui.YRNCMainActivity, com.xiaomi.yrn.view.base.YRNBaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (UIUtils.INSTANCE.isTablet() && enablePadOrientationRotate()) {
            setRequestedOrientation(-1);
        }
        String queryParameter = Uri.parse(this.mUrl).getQueryParameter("_transitionAnimate");
        if (queryParameter != null && !Boolean.parseBoolean(queryParameter)) {
            overridePendingTransition(0, 0);
        } else if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(0, vgi.f36878b, vgi.c);
        } else {
            overridePendingTransition(vgi.f36878b, vgi.c);
        }
        WearableRNPageStackControl wearableRNPageStackControl = WearableRNPageStackControl.INSTANCE;
        WeakReference<Activity> mActReference = this.mActReference;
        Intrinsics.checkNotNullExpressionValue(mActReference, "mActReference");
        String mUrl = this.mUrl;
        Intrinsics.checkNotNullExpressionValue(mUrl, "mUrl");
        wearableRNPageStackControl.addPageRecord(mActReference, mUrl, getInstanceId());
        updateNavigationBarColor();
    }

    @Override // com.xiaomi.yrn.controller.ui.YRNCMainActivity, com.xiaomi.yrn.view.base.YRNBaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WeakReference<Activity> weakReference = this.mActReference;
        if (weakReference != null) {
            WearableRNPageStackControl.INSTANCE.removePageRecord(weakReference);
        }
    }
}
