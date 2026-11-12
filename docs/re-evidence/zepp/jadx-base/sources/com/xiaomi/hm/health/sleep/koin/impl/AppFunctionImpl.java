package com.xiaomi.hm.health.sleep.koin.impl;

import androidx.p008lifecycle.LiveData;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.koin.IAppFunctions;
import com.huami.watch.companion.config.Config;
import com.xiaomi.hm.health.databases.LiveDataSupportKt;
import com.xiaomi.hm.health.di.koin.spo2.Spo2Proxy;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/sleep/koin/impl/AppFunctionImpl;", "Lcom/huami/sleep/koin/IAppFunctions;", "Landroidx/lifecycle/LiveData;", "", "checkConfigChanged", "isOsaEnable", "supportOsa", "", "type", "getSmartAnalysis", "isSnoreShow", "isSupportMiliSleepHr", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AppFunctionImpl implements IAppFunctions {
    @Override // com.huami.sleep.koin.IAppFunctions
    @NotNull
    public LiveData<Boolean> checkConfigChanged() {
        return LiveDataSupportKt.queryByLiveData(new String[]{"HM_PROPERTY"}, new Function0<Boolean>() { // from class: com.xiaomi.hm.health.sleep.koin.impl.AppFunctionImpl.checkConfigChanged.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        });
    }

    @Override // com.huami.sleep.koin.IAppFunctions
    public boolean getSmartAnalysis(@NotNull String type) {
        return HMPropertyUtil.getSmartAnalysis(type);
    }

    @Override // com.huami.sleep.koin.IAppFunctions
    public boolean isOsaEnable() {
        return Spo2Proxy.INSTANCE.isOsaEnable();
    }

    @Override // com.huami.sleep.koin.IAppFunctions
    public boolean isSnoreShow() {
        return (Config.isUserOversea(KoinExtKt.getAppContext()) || Config.isLocaleOversea(KoinExtKt.getAppContext())) ? false : true;
    }

    @Override // com.huami.sleep.koin.IAppFunctions
    public boolean isSupportMiliSleepHr() {
        return false;
    }

    @Override // com.huami.sleep.koin.IAppFunctions
    public boolean supportOsa() {
        return Spo2Proxy.INSTANCE.supportOsa();
    }
}
