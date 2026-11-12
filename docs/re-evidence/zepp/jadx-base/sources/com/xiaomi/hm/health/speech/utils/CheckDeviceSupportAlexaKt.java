package com.xiaomi.hm.health.speech.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huami.ai.helper.DeviceSpeechSupportFuncKt;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.util.AlexaUtils;
import com.xiaomi.hm.health.baseutil.Country;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.device.HMDeviceManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\t"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "isLoginCountrySupportAlexa", "isDeviceSupportAlexa", "isLoginCountryAndDeviceSupportAlexa", "", "countryCode", "a", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class CheckDeviceSupportAlexaKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "get login country empty";
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
            return "Login country not support alexa!";
        }
    }

    private static final boolean a(String str) {
        if (AlexaUtils.isSupportLoginCountry(str)) {
            return true;
        }
        if (HMDeviceManager.getInstance().getMiliDevice() == null) {
            return false;
        }
        return Intrinsics.areEqual(str, Country.BR);
    }

    public static final boolean isDeviceSupportAlexa(@NotNull Context context) {
        HMBaseDevice miliDevice = HMDeviceManager.getInstance().getMiliDevice();
        return (miliDevice == null ? false : DeviceSpeechSupportFuncKt.featureSupportAlexa(miliDevice)) || AlexaUtils.needShowAlexa(context);
    }

    public static final boolean isLoginCountryAndDeviceSupportAlexa(@NotNull Context context) {
        return isLoginCountrySupportAlexa(context) && isDeviceSupportAlexa(context);
    }

    public static final boolean isLoginCountrySupportAlexa(@NotNull Context context) {
        String loginCountry = AlexaUtils.getLoginCountry(context);
        if (TextUtils.isEmpty(loginCountry)) {
            LogcatKt.warn(Logcat.INSTANCE, "speech", a.a);
            return false;
        }
        boolean zA = a(loginCountry);
        if (!zA) {
            HMLog.info("speech", b.a);
        }
        return zA;
    }
}
