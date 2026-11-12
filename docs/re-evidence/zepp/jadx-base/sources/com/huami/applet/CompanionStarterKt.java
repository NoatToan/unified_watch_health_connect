package com.huami.applet;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.huami.applet.jsengine.engine.DefaultEngineImpl;
import com.huami.applet.jslog.JsLog;
import com.huami.applet.jslog.JsLogConsoleActivity;
import com.huami.applet.jslog.JsLogTree;
import com.huami.applet.setting.JsSettingActivity;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a:\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u001a*\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0002\u001a\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u001a\"\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "hmBaseDevice", "", "appId", "url", "", "Lokhttp3/Interceptor;", "interceptors", "", "startCompanionService", "Landroid/os/IBinder;", "binder", "a", "appletCompanionInitJsAppLogConfig", "stopCompanionService", "title", "startSettingActivity", "startJsAppLogActivity", "applet_release"}, k = 2, mv = {1, 5, 1})
public final class CompanionStarterKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Js log tree init exception >", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start CompanionService";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("appId: ", AppletConfig.INSTANCE.getUserId());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("bootUrl: ", DefaultEngineImpl.INSTANCE.getBootUrl());
        }
    }

    private static final void a(Context context, IBinder iBinder, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) CompanionService.class);
        Bundle bundle = new Bundle();
        bundle.putBinder("messageBinder", iBinder);
        intent.putExtra("appId", str);
        intent.putExtra("url", str2);
        intent.putExtras(bundle);
        context.startService(intent);
    }

    public static final void appletCompanionInitJsAppLogConfig(@NotNull Context context) {
        try {
            JsLog.plant(new JsLogTree(0, context.getFilesDir() + "/jslog", 1, null));
        } catch (Exception e) {
            HMLog.error$default(null, null, null, new a(e), 7, null);
        }
    }

    public static /* synthetic */ void b(Context context, IBinder iBinder, String str, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = DefaultEngineImpl.INSTANCE.getBootUrl();
        }
        a(context, iBinder, str, str2);
    }

    public static final void startCompanionService(@NotNull Context context, @NotNull HMBaseDevice hMBaseDevice, @NotNull String str, @NotNull String str2, @Nullable List<? extends Interceptor> list) {
        AppletConfig.Companion companion = AppletConfig.INSTANCE;
        companion.setInterceptors(list);
        companion.setAppContext(context.getApplicationContext());
        companion.setHmBaseDevice(hMBaseDevice);
        companion.setUserId(str);
        DefaultEngineImpl.INSTANCE.setBootUrl(str2);
        HMLog.info(ConstantKt.TAG_APPLET, b.a);
        HMLog.info(ConstantKt.TAG_APPLET, c.a);
        HMLog.info(ConstantKt.TAG_APPLET, d.a);
        context.bindService(new Intent(context, (Class<?>) CompanionService.class), new ServiceConnection() { // from class: com.huami.applet.CompanionStarterKt$startCompanionService$4$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onServiceConnected连接成功";
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "companionServiceBinder为null，获取失败";
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public static final c a = new c();

                public c() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onServiceConnected断开连接";
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(@Nullable ComponentName name, @Nullable IBinder service) {
                HMLog.info(ConstantKt.TAG_APPLET, a.a);
                Unit unit = null;
                CompanionService.ServiceBinder serviceBinder = service instanceof CompanionService.ServiceBinder ? (CompanionService.ServiceBinder) service : null;
                if (serviceBinder != null) {
                    serviceBinder.appleManagerStart();
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    HMLog.error$default(ConstantKt.TAG_APPLET, "200700003", null, b.a, 4, null);
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(@Nullable ComponentName name) {
                HMLog.info(ConstantKt.TAG_APPLET, c.a);
            }
        }, 1);
    }

    public static /* synthetic */ void startCompanionService$default(Context context, HMBaseDevice hMBaseDevice, String str, String str2, List list, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = DefaultEngineImpl.INSTANCE.getBootUrl();
        }
        if ((i & 16) != 0) {
            list = null;
        }
        startCompanionService(context, hMBaseDevice, str, str2, list);
    }

    public static final void startJsAppLogActivity(@NotNull Context context, @Nullable String str, @Nullable String str2) {
        Intent intent = new Intent(context, (Class<?>) JsLogConsoleActivity.class);
        intent.putExtra("title", str);
        intent.putExtra("appId", str2);
        context.startActivity(intent.setFlags(268435456));
    }

    public static final void startSettingActivity(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        JsSettingActivity.Companion companion = JsSettingActivity.INSTANCE;
        String str3 = String.format(companion.getSettingBootUrl(), Arrays.copyOf(new Object[]{str2}, 1));
        String str4 = String.format(companion.getStagingSettingBootUrl(), Arrays.copyOf(new Object[]{str2}, 1));
        boolean zIsProductUrl = HMServerDef.isProductUrl();
        Intent intent = new Intent(context, (Class<?>) JsSettingActivity.class);
        if (!zIsProductUrl) {
            str3 = str4;
        }
        intent.putExtra(JsSettingActivity.WEB_URL, str3);
        intent.putExtra("title", str);
        context.startActivity(intent.setFlags(268435456));
    }

    public static final void stopCompanionService(@NotNull Context context) {
        context.stopService(new Intent(context, (Class<?>) CompanionService.class));
    }
}
