package com.xiaomi.wearable.yrn.provider;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.WritableMap;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.onetrack.c.i;
import com.xiaomi.wearable.yrn.helper.WearableRNPageHelper;
import defpackage.ayr;
import defpackage.e1d;
import defpackage.hvr;
import defpackage.i1d;
import defpackage.jwr;
import defpackage.uvr;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b:\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0016J+\u0010\u001d\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010#J9\u0010)\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010%H\u0016¢\u0006\u0004\b)\u0010*J)\u0010)\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b)\u0010,J\u001f\u0010.\u001a\u00020\u00022\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010-H\u0016¢\u0006\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lcom/xiaomi/wearable/yrn/provider/WearableRNProvider;", "Le1d;", "", "showUnInitError", "()V", "Landroid/app/Application;", "application", "Li1d;", "provider", "init", "(Landroid/app/Application;Li1d;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "", "appName", "initReactNative", "(Ljava/lang/String;)V", "getInfoProvider", "()Li1d;", "url", "getRNAppNameByUrl", "(Ljava/lang/String;)Ljava/lang/String;", "getRNModuleByUrl", "getRNPathByUrl", "Landroid/app/Activity;", LifecycleConstantKt.TYPE_ACTIVITY, "", AccountInteractActivity.KEY_REQUEST_CODE, "openPage", "(Landroid/app/Activity;Ljava/lang/String;I)V", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "Landroidx/fragment/app/Fragment;", "newYRNFragment", "(Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/Fragment;", i.d, "", "", "param", "", "sendJSEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Z", "Lcom/facebook/react/bridge/WritableMap;", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)Z", "Ljava/lang/ref/WeakReference;", "setResumeActivity", "(Ljava/lang/ref/WeakReference;)V", "getResumeActivity", "()Ljava/lang/ref/WeakReference;", "mIYRNControllerInfoProvider", "Li1d;", "mContext", "Landroid/app/Application;", "mResumeActivity", "Ljava/lang/ref/WeakReference;", "mInit", "Z", "<init>", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WearableRNProvider implements e1d {

    @Nullable
    private Application mContext;

    @Nullable
    private i1d mIYRNControllerInfoProvider;
    private boolean mInit;

    @Nullable
    private WeakReference<Activity> mResumeActivity;

    private final void showUnInitError() {
        Logger.e("YRNCProviderImpl", "Please init! YRNCProviderImpl did not call init() method!");
    }

    @Override // defpackage.e1d
    @Nullable
    public Context getContext() {
        return this.mContext;
    }

    @Override // defpackage.e1d
    @Nullable
    /* JADX INFO: renamed from: getInfoProvider, reason: from getter */
    public i1d getMIYRNControllerInfoProvider() {
        return this.mIYRNControllerInfoProvider;
    }

    @Override // defpackage.e1d
    @NotNull
    public String getRNAppNameByUrl(@Nullable String url) {
        String strB = uvr.b(url);
        Intrinsics.checkNotNullExpressionValue(strB, "getRNAppNameByUrl(...)");
        return strB;
    }

    @Override // defpackage.e1d
    @NotNull
    public String getRNModuleByUrl(@Nullable String url) {
        String strC = uvr.c(url);
        Intrinsics.checkNotNullExpressionValue(strC, "getRNModuleByUrl(...)");
        return strC;
    }

    @Override // defpackage.e1d
    @NotNull
    public String getRNPathByUrl(@Nullable String url) {
        String strD = uvr.d(url);
        Intrinsics.checkNotNullExpressionValue(strD, "getRNPathByUrl(...)");
        return strD;
    }

    @Nullable
    public WeakReference<Activity> getResumeActivity() {
        return this.mResumeActivity;
    }

    @Override // defpackage.e1d
    public void init(@Nullable Application application, @Nullable i1d provider) {
        if (this.mInit) {
            return;
        }
        this.mInit = true;
        this.mContext = application;
        this.mIYRNControllerInfoProvider = provider;
        hvr.l(application);
        jwr.b(application, provider);
    }

    @Override // defpackage.e1d
    public void initReactNative(@Nullable String appName) {
        if (!this.mInit) {
            showUnInitError();
            return;
        }
        ayr ayrVarB = ayr.b();
        Intrinsics.checkNotNull(appName);
        ayrVarB.d(appName, null);
    }

    @Override // defpackage.e1d
    @NotNull
    public Fragment newYRNFragment(@NotNull String url, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.mInit) {
            return WearableRNPageHelper.INSTANCE.newYRNFragment(url, bundle);
        }
        showUnInitError();
        return new Fragment();
    }

    @Override // defpackage.e1d
    public void openPage(@Nullable Activity activity, @Nullable String url, int requestCode) {
        if (this.mInit) {
            WearableRNPageHelper.INSTANCE.openRNPage(activity, url, requestCode);
        } else {
            showUnInitError();
        }
    }

    @Override // defpackage.e1d
    public boolean sendJSEvent(@NotNull String appName, @NotNull String eventName, @Nullable Map<String, ? extends Object> param) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return this.mInit && ayr.b().f(appName, eventName, param);
    }

    @Override // defpackage.e1d
    public void setResumeActivity(@Nullable WeakReference<Activity> activity) {
        this.mResumeActivity = activity;
    }

    @Override // defpackage.e1d
    public boolean sendJSEvent(@NotNull String appName, @NotNull String eventName, @Nullable WritableMap param) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return this.mInit && ayr.b().g(appName, eventName, param);
    }
}
