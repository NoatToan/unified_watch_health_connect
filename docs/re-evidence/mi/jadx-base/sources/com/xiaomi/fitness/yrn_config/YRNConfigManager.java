package com.xiaomi.fitness.yrn_config;

import android.util.Log;
import com.dylanvann.fastimage.a;
import com.horcrux.svg.SvgPackage;
import com.reactnativepagerview.PagerViewPackage;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.exception.export.ExceptionHelper;
import com.xiaomi.fitness.exception.export.ExceptionHelperExtKt;
import com.xiaomi.smarthome.setting.ServerSetting;
import com.xiaomi.wearable.yrn.WearableRNManager;
import com.xiaomi.wearable.yrn.components.YRNComponentsPackage;
import com.xiaomi.wearable.yrn.env.RNEnvironmentPreference;
import com.xiaomi.wearable.yrn.internal.CommonPackage;
import com.xiaomi.wearable.yrn.internal.Utils;
import com.xiaomi.wearable.yrn.internal.imageload.FrescoConfigUtils;
import com.xiaomi.wearable.yrn.internal.imageload.FrescoMemoryTrimmableRegistry;
import com.xiaomi.wearable.yrn.provider.WearableCaptureProvider;
import com.xiaomi.wearable.yrn.provider.WearableInfoProvider;
import com.xiaomi.wearable.yrn.provider.WearableNetFrameProvider;
import com.xiaomi.wearable.yrn.provider.WearableNetInfoProvider;
import com.xiaomi.wearable.yrn.provider.WearableRNContainerProvider;
import com.xiaomi.wearable.yrn.provider.WearableRNExceptionListener;
import com.zoontek.rnlocalize.RNLocalizePackage;
import defpackage.a9j;
import defpackage.c7j;
import defpackage.cej;
import defpackage.chj;
import defpackage.d8j;
import defpackage.d9j;
import defpackage.gur;
import defpackage.i5d;
import defpackage.lk4;
import defpackage.mge;
import defpackage.p7j;
import defpackage.tej;
import defpackage.vdj;
import defpackage.vh3;
import defpackage.w1f;
import defpackage.x1f;
import defpackage.x6j;
import defpackage.x8l;
import io.expo.appearance.RNCAppearancePackage;
import io.sentry.SentryLevel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u000bJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/yrn_config/YRNConfigManager;", "", "", "Lgur;", "appConfigs", "()Ljava/util/List;", "Lx1f;", "getMainReactPackage", "()Lx1f;", "", "yrnInit", "()V", "preloadBundle", "", "TAG", "Ljava/lang/String;", "", "MAX_API_LEVEL", "I", "APP_NAME", "RN_ENGINE_VERSION", "Lcom/xiaomi/wearable/yrn/provider/WearableRNExceptionListener;", "mRNExceptionListener", "Lcom/xiaomi/wearable/yrn/provider/WearableRNExceptionListener;", "<init>", "yrn-config_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class YRNConfigManager {

    @NotNull
    private static final String APP_NAME = "miwear";
    private static final int MAX_API_LEVEL = 4;

    @NotNull
    private static final String RN_ENGINE_VERSION = "610";

    @NotNull
    private static final String TAG = "YRNConfigManager";

    @NotNull
    public static final YRNConfigManager INSTANCE = new YRNConfigManager();

    @NotNull
    private static WearableRNExceptionListener mRNExceptionListener = new WearableRNExceptionListener() { // from class: com.xiaomi.fitness.yrn_config.YRNConfigManager$mRNExceptionListener$1
        @Override // com.xiaomi.wearable.yrn.provider.WearableRNExceptionListener
        public void nativeModuleCallException(Exception exception) {
            if (exception == null) {
                return;
            }
            try {
                String stackTraceString = Log.getStackTraceString(exception);
                Intrinsics.checkNotNullExpressionValue(stackTraceString, "getStackTraceString(...)");
                ExceptionHelper.DefaultImpls.uploadEvent$default(ExceptionHelperExtKt.getInstance(ExceptionHelper.INSTANCE), CollectionsKt__CollectionsJVMKt.listOf("YRNRuntimeFatalException"), (SentryLevel) null, stackTraceString, 2, (Object) null);
            } catch (Exception unused) {
            }
        }
    };

    private YRNConfigManager() {
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0109  */
    private final List<gur> appConfigs() {
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new cej[]{getMainReactPackage(), new CommonPackage(), new d8j(), new chj(), new a9j(), new PagerViewPackage(), new a(), new RNCAppearancePackage(), new x8l(), new SvgPackage(), new RNLocalizePackage(), new p7j(), new mge(), new x6j(), new vdj(), new vh3(), new tej(), new com.reactnative.ivpusic.imagepicker.a(), new d9j(), new i5d(), new c7j(), new lk4(), new YRNComponentsPackage()});
        String rn_environment = RNEnvironmentPreference.INSTANCE.getRN_ENVIRONMENT();
        int iHashCode = rn_environment.hashCode();
        String str = ServerSetting.SERVER_ENV_PREVIEW;
        if (iHashCode != 3123) {
            if (iHashCode != 111267) {
                if (iHashCode == 3556498 && rn_environment.equals("test")) {
                    str = "staging";
                } else {
                    str = "production";
                }
            } else if (!rn_environment.equals("pre")) {
                str = "production";
            }
        } else if (!rn_environment.equals("at")) {
            str = "production";
        }
        return CollectionsKt__CollectionsJVMKt.listOf(new gur.b().a("miwear").j("610").i(4).g(str).h(new WearableInfoProvider(listListOf)).d(new WearableRNContainerProvider()).e(new WearableNetFrameProvider("miwear")).c(new WearableCaptureProvider(mRNExceptionListener)).f(new WearableNetInfoProvider("miwear")).b());
    }

    private final x1f getMainReactPackage() {
        return new x1f(new w1f.b().c(FrescoConfigUtils.INSTANCE.getDefaultConfig(Utils.INSTANCE.getApp(), new FrescoMemoryTrimmableRegistry())).b());
    }

    public final void preloadBundle() {
        WearableRNManager.INSTANCE.preLoadBundle();
    }

    public final void yrnInit() {
        Logger.i(TAG, "yrnInit");
        WearableRNManager.INSTANCE.init(appConfigs(), ApplicationExtKt.getApplication());
    }
}
