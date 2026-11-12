package com.xiaomi.hm.health.devicex.proxy.data;

import com.huami.device.core.agps.impl.store.AgpsTimeStore;
import com.huami.passport.Configs;
import com.huami.tools.log.HMLog;
import com.twitter.sdk.android.core.identity.AuthHandler;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/data/AgpsTimeStoreImpl;", "Lcom/huami/device/core/agps/impl/store/AgpsTimeStore;", "", "message", "", "a", "", "getAgpsUpdateTime", "time", "setAgpsUpdateTime", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", Constants.JSON_FEATURE, "getAGPSExpireTime", AuthHandler.d, "setAutoAgpsCheckTime", "getAutoAgpsCheckTime", "", com.xmlywind.sdk.common.Constants.IS_EXPIRED, Configs.Params.RESET, "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AgpsTimeStoreImpl implements AgpsTimeStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long a = 86400000;

    @NotNull
    private static final String b = "AGPS-TimeStoreImpl";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/data/AgpsTimeStoreImpl$Companion;", "", "Lcom/huami/device/core/agps/impl/store/AgpsTimeStore;", "get", "", "SONY_AGPS_TIMEOUT", "J", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final AgpsTimeStore get() {
            return new AgpsTimeStoreImpl();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a;
        }
    }

    private final void a(String message) {
        HMLog.info(b, new a(message));
    }

    @JvmStatic
    @NotNull
    public static final AgpsTimeStore get() {
        return INSTANCE.get();
    }

    @Override // com.huami.device.core.agps.impl.store.AgpsTimeStore
    public long getAGPSExpireTime(@Nullable Feature feature) {
        a("call getAGPSExpireTime --> " + (feature == null ? null : feature.toString()));
        return 86400000L;
    }

    @Override // com.huami.device.core.agps.impl.store.AgpsTimeStore
    public long getAgpsUpdateTime() {
        a("call get agps update time");
        return HMKeeper.getAgpsUpdateTime();
    }

    @Override // com.huami.device.core.agps.impl.store.AgpsTimeStore
    public long getAutoAgpsCheckTime() {
        a("call get auto agps check time");
        return HMKeeper.getAutoAgpsCheckTime();
    }

    @Override // com.huami.device.core.agps.impl.store.AgpsTimeStore
    public boolean isExpired() {
        return false;
    }

    @Override // com.huami.device.core.agps.impl.store.AgpsTimeStore
    public void reset() {
        a("call reset");
        HMKeeper.setAgpsUpdateTime(-1L);
        HMKeeper.setAutoAgpsCheckTime(-1L);
    }

    @Override // com.huami.device.core.agps.impl.store.AgpsTimeStore
    public void setAgpsUpdateTime(long time) {
        a("call setAgpsUpdateTime " + time);
        HMKeeper.setAgpsUpdateTime(time);
    }

    @Override // com.huami.device.core.agps.impl.store.AgpsTimeStore
    public void setAutoAgpsCheckTime(long ts) {
        a("call setAutoAgpsCheckTime --> " + ts);
        HMKeeper.setAutoAgpsCheckTime(ts);
    }
}
