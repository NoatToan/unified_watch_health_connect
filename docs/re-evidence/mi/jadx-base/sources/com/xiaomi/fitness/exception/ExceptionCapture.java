package com.xiaomi.fitness.exception;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.exception.ExceptionCapture;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import defpackage.c8c;
import defpackage.cul;
import defpackage.dm1;
import defpackage.hgl;
import io.sentry.SentryOptions;
import io.sentry.a;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.r1;
import io.sentry.e;
import io.sentry.protocol.y;
import io.sentry.s;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/exception/ExceptionCapture;", "", "<init>", "()V", "mTag", "", "initExceptionMonitor", "", MiuiCursorConstants.CONTENT, "Landroid/content/Context;", "exception_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExceptionCapture {

    @NotNull
    public static final ExceptionCapture INSTANCE = new ExceptionCapture();

    @NotNull
    private static final String mTag = "ExceptionCapture";

    private ExceptionCapture() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initExceptionMonitor$lambda$2(String str, SentryAndroidOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        options.setDsn(str);
        options.setAttachThreads(true);
        options.setAttachStacktrace(true);
        options.setAnrEnabled(true);
        options.setAnrReportInDebug(true);
        options.setEnableUncaughtExceptionHandler(true);
        options.setSendDefaultPii(true);
        options.setEnableAutoActivityLifecycleTracing(false);
        options.setEnableActivityLifecycleTracingAutoFinish(false);
        try {
            options.setBeforeSend(new SentryOptions.d() { // from class: cf8
                @Override // io.sentry.SentryOptions.d
                public final s a(s sVar, c8c c8cVar) {
                    return ExceptionCapture.initExceptionMonitor$lambda$2$lambda$0(sVar, c8cVar);
                }
            });
            options.setBeforeBreadcrumb(new SentryOptions.a() { // from class: df8
                @Override // io.sentry.SentryOptions.a
                public final a a(a aVar, c8c c8cVar) {
                    return ExceptionCapture.initExceptionMonitor$lambda$2$lambda$1(aVar, c8cVar);
                }
            });
        } catch (Exception e) {
            Logger.i(mTag, "initExceptionMonitor  sentry beforeSend （" + e + "）");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s initExceptionMonitor$lambda$2$lambda$0(s event, c8c hint) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(hint, "hint");
        LocaleUtil localeUtil = LocaleUtil.INSTANCE;
        String currentLocale$default = LocaleUtil.getCurrentLocale$default(localeUtil, false, false, 3, null);
        event.d0("local", localeUtil.getCurrentCountyCode());
        event.d0("language", currentLocale$default);
        AccountManager.Companion companion = AccountManager.INSTANCE;
        if (AccountManagerExtKt.getInstance(companion).isLogin()) {
            y yVar = new y();
            yVar.n(AccountManagerExtKt.getInstance(companion).getUserId());
            event.f0(yVar);
        }
        hint.n(null);
        if (event.x0() && !TextUtils.isEmpty("")) {
            File file = new File("");
            if (file.exists() && file.isFile()) {
                if (file.length() < 5242880) {
                    hint.a(new dm1(""));
                } else {
                    byte[] bytes = "log too large, pls manually pull".getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    hint.a(new dm1(bytes, "missLog.txt"));
                }
            }
        }
        return event;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a initExceptionMonitor$lambda$2$lambda$1(a breadcrumb, c8c hint) {
        Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
        Intrinsics.checkNotNullParameter(hint, "hint");
        return breadcrumb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initExceptionMonitor$lambda$3(e scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        try {
            String strJoin = TextUtils.join(", ", Build.SUPPORTED_64_BIT_ABIS);
            String strJoin2 = TextUtils.join(", ", Build.SUPPORTED_32_BIT_ABIS);
            String property = System.getProperty("os.arch");
            boolean zIs64Bit = Process.is64Bit();
            StringBuilder sb = new StringBuilder();
            sb.append(zIs64Bit);
            scope.a("process_is64bit", sb.toString());
            scope.a("abis64", strJoin);
            scope.a("abis32", strJoin2);
            scope.a("os_arch", property);
            scope.a("buildNumber", System.getenv("BUILD_NUMBER"));
        } catch (Exception e) {
            Logger.i(mTag, "initExceptionMonitor  sentry configureScope （" + e + "）");
        }
    }

    public final void initExceptionMonitor(@NotNull Context content) {
        Intrinsics.checkNotNullParameter(content, "content");
        Logger.i(mTag, "initExceptionMonitor  start");
        Map mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to("cn", "https://01b17ab2b97b4480bdb8518165ef96b4@sentry.d.xiaomi.net/1538"), TuplesKt.to("sg", "https://8806568a39b04933b83d4aef46fb2167@alisgp-sentry.d.xiaomi.net/31"));
        String currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
        final String str = (String) mapMapOf.get(currentRegion);
        if (str == null) {
            Logger.i(mTag, "initExceptionMonitor (" + currentRegion + ") 地区不支持sentry");
            return;
        }
        r1.e(content, new cul.a() { // from class: ef8
            @Override // cul.a
            public final void a(SentryOptions sentryOptions) {
                ExceptionCapture.initExceptionMonitor$lambda$2(str, (SentryAndroidOptions) sentryOptions);
            }
        });
        cul.k(new hgl() { // from class: ff8
            @Override // defpackage.hgl
            public final void a(e eVar) {
                ExceptionCapture.initExceptionMonitor$lambda$3(eVar);
            }
        });
        Logger.i(mTag, "initExceptionMonitor  sentry 初始化完成 （" + currentRegion + "）");
    }
}
