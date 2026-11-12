package com.xiaomi.fitness.electronic.scale;

import android.app.Activity;
import android.content.Context;
import android.webkit.JavascriptInterface;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import defpackage.iqc;
import defpackage.kad;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\tR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/ElectronicScaleInnerJavaScriptImpl;", "Lkad;", "", "onDeviceGuidFinish", "()V", "onDeviceGuidNext", "", "did", "setDid", "(Ljava/lang/String;)V", "mac", "setMac", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "mDid", "Ljava/lang/String;", "mMac", "Liqc;", "healthWebViewPage", "<init>", "(Landroid/content/Context;Liqc;)V", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ElectronicScaleInnerJavaScriptImpl extends kad {

    @NotNull
    private static final String TAG = "ElectronicScaleInnerJavaScriptImpl";

    @NotNull
    private final Context context;

    @Nullable
    private String mDid;

    @Nullable
    private String mMac;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElectronicScaleInnerJavaScriptImpl(@NotNull Context context, @NotNull iqc healthWebViewPage) {
        super(context, healthWebViewPage);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(healthWebViewPage, "healthWebViewPage");
        this.context = context;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // defpackage.kad
    @JavascriptInterface
    public void onDeviceGuidFinish() {
        Logger.i(TAG, "onDeviceGuidFinish");
        String str = this.mDid;
        if (str == null || this.mMac == null) {
            Logger.e("onDeviceGuidNext mDid : " + str + " , mMac : " + this.mMac, new Object[0]);
        }
        ElectronicScaleManager electronicScaleManagerExtKt = ElectronicScaleManagerExtKt.getInstance(ElectronicScaleManager.INSTANCE);
        Context context = this.context;
        String str2 = this.mDid;
        Intrinsics.checkNotNull(str2);
        String str3 = this.mMac;
        Intrinsics.checkNotNull(str3);
        electronicScaleManagerExtKt.launchToElectronicScaleWeightGuideActivity(context, str2, str3, true);
        Context context2 = this.context;
        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) context2).finish();
    }

    @JavascriptInterface
    public final void onDeviceGuidNext() {
        Logger.i(TAG, "onDeviceGuidNext");
        String str = this.mDid;
        if (str == null || this.mMac == null) {
            Logger.e("onDeviceGuidFinish mDid : " + str + " , mMac : " + this.mMac, new Object[0]);
        }
        ElectronicScaleManager electronicScaleManagerExtKt = ElectronicScaleManagerExtKt.getInstance(ElectronicScaleManager.INSTANCE);
        Context context = this.context;
        String str2 = this.mDid;
        Intrinsics.checkNotNull(str2);
        String str3 = this.mMac;
        Intrinsics.checkNotNull(str3);
        electronicScaleManagerExtKt.launchToElectronicScaleMainActivity(context, str2, str3, false);
        Context context2 = this.context;
        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) context2).finish();
    }

    public final void setDid(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.mDid = did;
    }

    public final void setMac(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        this.mMac = mac;
    }
}
