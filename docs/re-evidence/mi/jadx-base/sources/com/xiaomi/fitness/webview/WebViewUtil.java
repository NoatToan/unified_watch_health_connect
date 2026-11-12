package com.xiaomi.fitness.webview;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import defpackage.jz6;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/webview/WebViewUtil;", "", "", PluginDeviceInfo.FICONOFFLINE, "", "getThrowableString", "(Ljava/lang/Throwable;)Ljava/lang/String;", "Ljz6;", "disposable", "", "releaseDisposable", "(Ljz6;)V", "TAG", "Ljava/lang/String;", "OPTION_SHARE_TYPE", "", "isSupportHealth", "()Z", "isInnerCN", "<init>", "()V", "webview_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WebViewUtil {

    @NotNull
    public static final WebViewUtil INSTANCE = new WebViewUtil();

    @NotNull
    public static final String OPTION_SHARE_TYPE = "share";

    @NotNull
    public static final String TAG = "|WEBVIEW|";

    private WebViewUtil() {
    }

    @JvmStatic
    @Nullable
    public static final String getThrowableString(@NotNull Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, true);
            e.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            return stringWriter.toString();
        } catch (Exception e2) {
            return e2.getMessage();
        }
    }

    @JvmStatic
    public static final void releaseDisposable(@Nullable jz6 disposable) {
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        disposable.dispose();
    }

    public final boolean isInnerCN() {
        String currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = currentRegion.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return Intrinsics.areEqual(lowerCase, "cn");
    }

    public final boolean isSupportHealth() {
        return isInnerCN();
    }
}
