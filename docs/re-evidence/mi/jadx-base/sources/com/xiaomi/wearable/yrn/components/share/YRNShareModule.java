package com.xiaomi.wearable.yrn.components.share;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.wearable.yrn.components.share.YRNShareModule;
import defpackage.o3r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J<\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\tH\u0007J \u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\u0013\u001a\u00020\fH\u0016¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/share/YRNShareModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "isWechatInstalledAndSupported", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "shareUrlToWx", "url", "", "title", "scene", "", "description", Constants.KEY_RECHARGE_ICON_URL, "shareUrlToSystem", "getName", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class YRNShareModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YRNShareModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shareUrlToWx$lambda$0(Promise promise, boolean z, String str) {
        Intrinsics.checkNotNullParameter(promise, "$promise");
        if (z) {
            promise.resolve(Boolean.TRUE);
        } else {
            promise.reject("WX_CANNOT_SHARE", str);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "YRNShareModule";
    }

    @ReactMethod
    public final void isWechatInstalledAndSupported(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(Boolean.valueOf(o3r.i().p()));
    }

    @ReactMethod
    public final void shareUrlToSystem(@NotNull String url, @NotNull String title, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("LACK_ACTIVITY", "no current activity");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/*");
        intent.putExtra("android.intent.extra.TEXT", url);
        Intent intentCreateChooser = Intent.createChooser(intent, title);
        ComponentName[] componentNameArr = {new ComponentName(ApplicationExtKt.getApplication().getPackageName(), "")};
        if (Build.VERSION.SDK_INT > 33) {
            intentCreateChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", componentNameArr);
        }
        currentActivity.startActivity(intentCreateChooser);
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod
    public final void shareUrlToWx(@NotNull String url, @NotNull String title, int scene, @Nullable String description, @Nullable String iconUrl, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(promise, "promise");
        o3r.i().F(url, title, description, iconUrl, scene, new o3r.b() { // from class: ryr
            @Override // o3r.b
            public final void a(boolean z, String str) {
                YRNShareModule.shareUrlToWx$lambda$0(promise, z, str);
            }
        });
    }
}
