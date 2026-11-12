package com.xiaomi.hm.health.devicex;

import android.app.Application;
import com.huami.devicex.DeviceXBuilder;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.devicex.factory.SportInfoActionFactoryImpl;
import com.xiaomi.hm.health.devicex.proxy.AppStateProxy;
import com.xiaomi.hm.health.devicex.proxy.data.AgpsTimeStoreImpl;
import com.xiaomi.hm.health.devicex.proxy.data.PropertyStoreImpl;
import com.xiaomi.hm.health.devicex.proxy.data.WeatherProxyImpl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/devicex/DeviceXConfig;", "", "Landroid/app/Application;", DbUtils.Const.Table.CONTEXT, "", "a", "setup", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceXConfig {

    @NotNull
    public static final DeviceXConfig INSTANCE = new DeviceXConfig();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "初始化失败";
        }
    }

    private DeviceXConfig() {
    }

    private final void a(Application context) {
        DeviceXBuilder.INSTANCE.setContext(context).setAppStateApi(new AppStateProxy()).setSportInfoActionFactory(new SportInfoActionFactoryImpl()).setAgpsTimeStoreApi(new AgpsTimeStoreImpl()).setPropertyStoreApi(new PropertyStoreImpl()).setWeatherApi(new WeatherProxyImpl());
    }

    public final void setup(@NotNull Application context) {
        try {
            a(context);
        } catch (Throwable th) {
            HMLog.error$default(null, null, th, a.a, 3, null);
        }
    }
}
