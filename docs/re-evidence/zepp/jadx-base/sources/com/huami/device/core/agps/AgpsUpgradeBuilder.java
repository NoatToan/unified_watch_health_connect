package com.huami.device.core.agps;

import android.app.Application;
import com.amap.api.mapcore.util.hl;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.device.core.agps.api.AgpsHttpClient;
import com.huami.device.core.agps.api.UpgradeTarget;
import com.huami.device.core.agps.api.bean.AppInfo;
import com.huami.device.core.agps.comm.AGPSGroup;
import com.huami.device.core.agps.impl.factory.FanaticAgpsStoreFactory;
import com.huami.device.core.agps.impl.factory.HuamiOSAgpsStoreFactory;
import com.huami.device.core.agps.impl.upgrade.Listener;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.market.sdk.Constants;
import com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bU\u0010VJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ \u0010\u0010\u001a\u00020\u00002\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000bJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 R\u0016\u0010%\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$R+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001d8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00109\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R(\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010N\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR4\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006W"}, d2 = {"Lcom/huami/device/core/agps/AgpsUpgradeBuilder;", "", "Lcom/huami/device/core/agps/api/UpgradeTarget;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "Lcom/huami/device/core/agps/comm/AGPSGroup;", "types", "setAgpsTypes", "Lcom/huami/device/core/agps/api/AgpsHttpClient;", OpenSdkPlayStatisticUpload.KEY_CLIENT, "setHttpClient", "Lkotlin/Function2;", "", "", "", "onMessage", "setOnMessageEvent", "Lcom/huami/device/core/agps/impl/upgrade/Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setUpgradeListener", "", "isUserIdentified", "setIsUserIdentified", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "setDevice", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", Constants.JSON_FEATURE, "setFeature", "Landroid/app/Application;", DbUtils.Const.Table.CONTEXT, "setContext", "Lcom/huami/device/core/agps/api/bean/AppInfo;", "info", "setAppInfo", "b", "Ljava/lang/String;", "TAG", "<set-?>", "c", "Lkotlin/properties/ReadWriteProperty;", "getContext$agps_impl_release", "()Landroid/app/Application;", "setContext$agps_impl_release", "(Landroid/app/Application;)V", GoogleApiAvailabilityLight.a, "Z", "isUserIdentified$agps_impl_release", "()Z", "setUserIdentified$agps_impl_release", "(Z)V", "e", "Lcom/huami/device/core/agps/impl/upgrade/Listener;", "getUpgradeListener$agps_impl_release", "()Lcom/huami/device/core/agps/impl/upgrade/Listener;", "setUpgradeListener$agps_impl_release", "(Lcom/huami/device/core/agps/impl/upgrade/Listener;)V", "upgradeListener", "f", "Lcom/huami/device/core/agps/api/bean/AppInfo;", "appInfo", "g", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "h", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "i", "Ljava/lang/Iterable;", "getAgpsTypes$agps_impl_release", "()Ljava/lang/Iterable;", "setAgpsTypes$agps_impl_release", "(Ljava/lang/Iterable;)V", "agpsTypes", z.j, "Lcom/huami/device/core/agps/api/AgpsHttpClient;", "getHttpClient$agps_impl_release", "()Lcom/huami/device/core/agps/api/AgpsHttpClient;", "setHttpClient$agps_impl_release", "(Lcom/huami/device/core/agps/api/AgpsHttpClient;)V", "httpClient", hl.k, "Lkotlin/jvm/functions/Function2;", "getOnMessage$agps_impl_release", "()Lkotlin/jvm/functions/Function2;", "setOnMessage$agps_impl_release", "(Lkotlin/jvm/functions/Function2;)V", "<init>", "()V", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final class AgpsUpgradeBuilder {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String TAG = "AgpsUpgradeBuilder";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static boolean isUserIdentified;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private static Listener upgradeListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static AppInfo appInfo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static HMBaseDevice device;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static Feature feature;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private static AgpsHttpClient httpClient;
    public static final /* synthetic */ KProperty[] a = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(AgpsUpgradeBuilder.class), DbUtils.Const.Table.CONTEXT, "getContext$agps_impl_release()Landroid/app/Application;"))};
    public static final AgpsUpgradeBuilder INSTANCE = new AgpsUpgradeBuilder();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty context = Delegates.INSTANCE.notNull();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static Iterable<? extends AGPSGroup> agpsTypes = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private static Function2<? super String, ? super Integer, Unit> onMessage = c.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "Huami OS AGPS upgrade.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "Use Normal AGPS upgrade.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "msg", "", com.google.android.exoplayer2.text.ttml.b.r, "", "a", "(Ljava/lang/String;I)V"}, k = 3, mv = {1, 4, 0})
    public static final class c extends Lambda implements Function2<String, Integer, Unit> {
        public static final c a = new c();

        public c() {
            super(2);
        }

        public final void a(@NotNull String str, int i) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
            a(str, num.intValue());
            return Unit.INSTANCE;
        }
    }

    private AgpsUpgradeBuilder() {
    }

    @NotNull
    public final UpgradeTarget build() throws Exception {
        if (device == null) {
            throw new Exception("Device can not be null");
        }
        if (appInfo == null) {
            throw new Exception("app info can not be null.");
        }
        if (!agpsTypes.iterator().hasNext() && feature == null) {
            throw new Exception("Config error please set one of feature and AGPS Groups before!!!!");
        }
        if (agpsTypes.iterator().hasNext()) {
            HMLog.info(TAG, a.a);
            HMBaseDevice hMBaseDevice = device;
            if (hMBaseDevice == null) {
                Intrinsics.throwNpe();
            }
            AppInfo appInfo2 = appInfo;
            if (appInfo2 == null) {
                Intrinsics.throwNpe();
            }
            return new HuamiOSAgpsStoreFactory(hMBaseDevice, appInfo2, agpsTypes, onMessage).createTarget();
        }
        if (feature == null) {
            throw new Exception(" feature can not be null .");
        }
        HMLog.info(TAG, b.a);
        HMBaseDevice hMBaseDevice2 = device;
        if (hMBaseDevice2 == null) {
            Intrinsics.throwNpe();
        }
        Feature feature2 = feature;
        if (feature2 == null) {
            Intrinsics.throwNpe();
        }
        AppInfo appInfo3 = appInfo;
        if (appInfo3 == null) {
            Intrinsics.throwNpe();
        }
        return new FanaticAgpsStoreFactory(hMBaseDevice2, feature2, appInfo3).createTarget();
    }

    @NotNull
    public final Iterable<AGPSGroup> getAgpsTypes$agps_impl_release() {
        return agpsTypes;
    }

    @NotNull
    public final Application getContext$agps_impl_release() {
        return (Application) context.getValue(this, a[0]);
    }

    @Nullable
    public final AgpsHttpClient getHttpClient$agps_impl_release() {
        return httpClient;
    }

    @NotNull
    public final Function2<String, Integer, Unit> getOnMessage$agps_impl_release() {
        return onMessage;
    }

    @Nullable
    public final Listener getUpgradeListener$agps_impl_release() {
        return upgradeListener;
    }

    public final boolean isUserIdentified$agps_impl_release() {
        return isUserIdentified;
    }

    @NotNull
    public final AgpsUpgradeBuilder setAgpsTypes(@NotNull Iterable<? extends AGPSGroup> types) {
        agpsTypes = types;
        feature = null;
        return this;
    }

    public final void setAgpsTypes$agps_impl_release(@NotNull Iterable<? extends AGPSGroup> iterable) {
        agpsTypes = iterable;
    }

    @NotNull
    public final AgpsUpgradeBuilder setAppInfo(@NotNull AppInfo info) {
        appInfo = info;
        return this;
    }

    @NotNull
    public final AgpsUpgradeBuilder setContext(@NotNull Application context2) {
        setContext$agps_impl_release(context2);
        return this;
    }

    public final void setContext$agps_impl_release(@NotNull Application application) {
        context.setValue(this, a[0], application);
    }

    @NotNull
    public final AgpsUpgradeBuilder setDevice(@NotNull HMBaseDevice device2) {
        device = device2;
        return this;
    }

    @NotNull
    public final AgpsUpgradeBuilder setFeature(@NotNull Feature feature2) {
        feature = feature2;
        agpsTypes = CollectionsKt__CollectionsKt.emptyList();
        return this;
    }

    @NotNull
    public final AgpsUpgradeBuilder setHttpClient(@NotNull AgpsHttpClient client) {
        httpClient = client;
        return this;
    }

    public final void setHttpClient$agps_impl_release(@Nullable AgpsHttpClient agpsHttpClient) {
        httpClient = agpsHttpClient;
    }

    @NotNull
    public final AgpsUpgradeBuilder setIsUserIdentified(boolean isUserIdentified2) {
        isUserIdentified = isUserIdentified2;
        return this;
    }

    public final void setOnMessage$agps_impl_release(@NotNull Function2<? super String, ? super Integer, Unit> function2) {
        onMessage = function2;
    }

    @NotNull
    public final AgpsUpgradeBuilder setOnMessageEvent(@NotNull Function2<? super String, ? super Integer, Unit> onMessage2) {
        onMessage = onMessage2;
        return this;
    }

    @NotNull
    public final AgpsUpgradeBuilder setUpgradeListener(@NotNull Listener listener) {
        upgradeListener = listener;
        return this;
    }

    public final void setUpgradeListener$agps_impl_release(@Nullable Listener listener) {
        upgradeListener = listener;
    }

    public final void setUserIdentified$agps_impl_release(boolean z) {
        isUserIdentified = z;
    }
}
