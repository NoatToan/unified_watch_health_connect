package com.xiaomi.hm.health.device.agps;

import com.huami.device.core.agps.impl.store.AgpsTimeStore;
import com.huami.device.core.agps.impl.store.HuamiOSUpgradeCondition;
import com.huami.passport.Configs;
import com.huami.tools.log.HMLog;
import com.twitter.sdk.android.core.identity.AuthHandler;
import com.xiaomi.hm.health.bt.profile.base.AGpsDto;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016R\u0019\u0010\u0016\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/device/agps/HuamiOSAgpsTimeStore;", "Lcom/huami/device/core/agps/impl/store/AgpsTimeStore;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", Constants.JSON_FEATURE, "", "getAGPSExpireTime", "getAgpsUpdateTime", "getAutoAgpsCheckTime", "", com.xmlywind.sdk.common.Constants.IS_EXPIRED, "", Configs.Params.RESET, "time", "setAgpsUpdateTime", AuthHandler.d, "setAutoAgpsCheckTime", "Lcom/xiaomi/hm/health/bt/profile/base/AGpsDto;", "a", "Lcom/xiaomi/hm/health/bt/profile/base/AGpsDto;", "getAgpsVo", "()Lcom/xiaomi/hm/health/bt/profile/base/AGpsDto;", "agpsVo", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/base/AGpsDto;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HuamiOSAgpsTimeStore implements AgpsTimeStore, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AGpsDto agpsVo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ HuamiOSAgpsTimeStore b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, HuamiOSAgpsTimeStore huamiOSAgpsTimeStore) {
            super(0);
            this.a = z;
            this.b = huamiOSAgpsTimeStore;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return " isExpired : " + this.a + " | " + this.b.getAgpsVo() + " ";
        }
    }

    public HuamiOSAgpsTimeStore(@NotNull AGpsDto aGpsDto) {
        this.agpsVo = aGpsDto;
    }

    @Override // com.huami.device.core.agps.impl.store.AgpsTimeStore
    public long getAGPSExpireTime(@Nullable Feature feature) {
        return -1L;
    }

    @Override // com.huami.device.core.agps.impl.store.AgpsTimeStore
    public long getAgpsUpdateTime() {
        Long aGpsUpgradeTime = this.agpsVo.getAGpsUpgradeTime();
        if (aGpsUpgradeTime == null) {
            return -1L;
        }
        return aGpsUpgradeTime.longValue();
    }

    @NotNull
    public final AGpsDto getAgpsVo() {
        return this.agpsVo;
    }

    @Override // com.huami.device.core.agps.impl.store.AgpsTimeStore
    public long getAutoAgpsCheckTime() {
        return 1L;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.device.core.agps.impl.store.AgpsTimeStore
    public boolean isExpired() {
        Long aGpsUpgradeTime = this.agpsVo.getAGpsUpgradeTime();
        if (aGpsUpgradeTime == null) {
            return false;
        }
        aGpsUpgradeTime.longValue();
        Long aGpsExpirationTime = this.agpsVo.getAGpsExpirationTime();
        if (aGpsExpirationTime == null) {
            return false;
        }
        aGpsExpirationTime.longValue();
        boolean zNeedUpgrade = new HuamiOSUpgradeCondition(this.agpsVo.getAGpsUpgradeTime().longValue(), this.agpsVo.getAGpsExpirationTime().longValue()).needUpgrade();
        HMLog.info("AgpsUpgradeTimeStore", new a(zNeedUpgrade, this));
        return zNeedUpgrade;
    }

    @Override // com.huami.device.core.agps.impl.store.AgpsTimeStore
    public void reset() {
    }

    @Override // com.huami.device.core.agps.impl.store.AgpsTimeStore
    public void setAgpsUpdateTime(long time) {
    }

    @Override // com.huami.device.core.agps.impl.store.AgpsTimeStore
    public void setAutoAgpsCheckTime(long ts) {
    }
}
