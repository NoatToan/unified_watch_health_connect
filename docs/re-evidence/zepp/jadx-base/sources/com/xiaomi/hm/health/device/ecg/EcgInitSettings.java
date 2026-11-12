package com.xiaomi.hm.health.device.ecg;

import android.app.Application;
import com.huami.ecg.core.web.EcgWebSetting;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.passport.AccountManager;
import com.huami.watch.companion.cloud.Cloud;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/ecg/EcgInitSettings;", "Lcom/huami/ecg/core/web/EcgWebSetting;", "", "appName", "host", "", "isStaging", "userId", "userToken", "Landroid/app/Application;", "a", "Landroid/app/Application;", "getApp", "()Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EcgInitSettings implements EcgWebSetting {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Application app;

    public EcgInitSettings(@NotNull Application application) {
        this.app = application;
    }

    @Override // com.huami.ecg.core.web.EcgWebSetting
    @NotNull
    public String appName() {
        return Cloud.SysParams.APP_NAME;
    }

    @NotNull
    public final Application getApp() {
        return this.app;
    }

    @Override // com.huami.ecg.core.web.EcgWebSetting
    @NotNull
    public Map<String, String> getSystemHeader() {
        return EcgWebSetting.DefaultImpls.getSystemHeader(this);
    }

    @Override // com.huami.ecg.core.web.EcgWebSetting
    @NotNull
    public Map<String, String> getSystemParam() {
        return EcgWebSetting.DefaultImpls.getSystemParam(this);
    }

    @Override // com.huami.ecg.core.web.EcgWebSetting
    @NotNull
    public String host() {
        return Cloud.get().getAmazfitHost();
    }

    @Override // com.huami.ecg.core.web.EcgWebSetting
    public boolean isStaging() {
        return !HMServerDef.isProductUrl();
    }

    @Override // com.huami.ecg.core.web.EcgWebSetting
    @NotNull
    public String userId() {
        String currentUid = AccountManager.getDefault(this.app).getCurrentUid();
        return currentUid == null ? "" : currentUid;
    }

    @Override // com.huami.ecg.core.web.EcgWebSetting
    @NotNull
    public String userToken() {
        return AccountManager.getDefault(this.app).getAccessToken();
    }
}
