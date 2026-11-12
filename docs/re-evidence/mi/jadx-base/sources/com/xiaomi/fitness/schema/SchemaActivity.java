package com.xiaomi.fitness.schema;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.wearable.yrn.export.YRNPushHandler;
import com.xiaomi.wearable.yrn.export.YRNPushHandlerExtKt;
import defpackage.fgl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/schema/SchemaActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "processIntent", "intent", "Landroid/content/Intent;", "checkScheme", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "Companion", "schema_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SchemaActivity extends FragmentActivity {

    @NotNull
    public static final String TAG = "SchemaActivity";

    private final boolean checkScheme(Uri uri) {
        String scheme = uri.getScheme();
        if (Intrinsics.areEqual("wearable", scheme) || Intrinsics.areEqual("mihealth", scheme) || Intrinsics.areEqual(ThirdPartAccessConstants.STRAVA_SCHEME, scheme)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("error schema:");
        sb.append(scheme);
        return false;
    }

    private final void processIntent(Intent intent) {
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            Intrinsics.checkNotNull(data);
            boolean zCheckScheme = checkScheme(data);
            Logger.i(TAG, "processIntent uri=" + data + " schemaSupported=" + zCheckScheme);
            if (zCheckScheme) {
                boolean zIsLogin = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin();
                boolean z = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().length() > 0;
                boolean privacy_agree = RegionPreference.INSTANCE.getPRIVACY_AGREE();
                Logger.i(TAG, "processIntent isLoggedIn=" + zIsLogin + " curtRegionNotEmpty=" + z + " privacyAgreed=" + privacy_agree);
                if (!zIsLogin || !z || !privacy_agree) {
                    fgl.b(intent.getData());
                    CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).startSplashActivity(this, Boolean.FALSE);
                } else if (YRNPushHandlerExtKt.isVirtualPage(data)) {
                    Application application = getApplication();
                    Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
                    MainExtKt.showTabWithIndex(application, MainTab.INSTANCE.getINDEX_HEALTH());
                    YRNPushHandlerExtKt.getInstance(YRNPushHandler.INSTANCE).handleSchemeMessage(data);
                } else {
                    fgl.a(this, data);
                }
            }
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        processIntent(getIntent());
    }
}
