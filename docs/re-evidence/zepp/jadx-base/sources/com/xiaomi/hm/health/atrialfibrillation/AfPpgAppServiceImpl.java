package com.xiaomi.hm.health.atrialfibrillation;

import com.huami.health.afppg.app.IAfPpgAppService;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.xiaomi.hm.health.di.koin.module.UserModuleKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.qualifier.QualifierKt;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/atrialfibrillation/AfPpgAppServiceImpl;", "Lcom/huami/health/afppg/app/IAfPpgAppService;", "", "getAppName", "getUserId", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AfPpgAppServiceImpl implements IAfPpgAppService {
    @Override // com.huami.health.afppg.app.IAfPpgAppService
    @NotNull
    public String getAppName() {
        return HMAppConfig.getPackageName();
    }

    @Override // com.huami.health.afppg.app.IAfPpgAppService
    @NotNull
    public String getUserId() {
        return (String) UserModuleKt.userScope(KoinJavaComponent.getKoin()).get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named("UserId"), null);
    }
}
