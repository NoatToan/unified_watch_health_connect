package com.huami.eid.ui.api;

import android.util.Base64;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.dev.Logcat;
import com.huami.eid.ui.extensions.EidStatusExtensionKt;
import com.huami.nfc.ble.AppletEntity;
import com.huami.nfc.ble.AppletType;
import com.huami.nfc.ble.IDeviceApi;
import com.huami.nfc.eid.entities.EidInfoEntity;
import com.huami.nfc.eid.entities.EidStatus;
import com.huami.wallet.common.config.NavigationConfig;
import com.huami.wallet.common.config.WebConfig;
import com.xiaomi.mipush.sdk.Constants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&¢\u0006\u0004\b*\u0010+J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016J \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0006H\u0016R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/huami/eid/ui/api/EidRepoImpl;", "Lcom/huami/eid/ui/api/EidRepo;", "Lorg/koin/core/component/KoinComponent;", "", "checkPwdState", "verifyWatchPwd", "", "getRequestId", "queryType", "requestId", "Lcom/huami/nfc/eid/entities/EidStatus;", "getEidStatus", "bizSerialNumber", "", "imageData", "", "faceCompare", "openEidCard", "deleteEidCard", "revokeEidCard", "url", "gotoWeb", "Lcom/huami/eid/ui/api/EidApi;", "a", "Lcom/huami/eid/ui/api/EidApi;", "eidApi", "Lcom/huami/nfc/ble/IDeviceApi;", "b", "Lcom/huami/nfc/ble/IDeviceApi;", "deviceApi", "Lcom/huami/eid/ui/api/EidConfig;", "c", "Lcom/huami/eid/ui/api/EidConfig;", "eidConfig", "Lcom/huami/wallet/common/config/WebConfig;", GoogleApiAvailabilityLight.a, "Lcom/huami/wallet/common/config/WebConfig;", "webConfig", "Lcom/huami/wallet/common/config/NavigationConfig;", "e", "Lcom/huami/wallet/common/config/NavigationConfig;", "navigationConfig", "<init>", "(Lcom/huami/eid/ui/api/EidApi;Lcom/huami/nfc/ble/IDeviceApi;Lcom/huami/eid/ui/api/EidConfig;Lcom/huami/wallet/common/config/WebConfig;Lcom/huami/wallet/common/config/NavigationConfig;)V", "eid_release"}, k = 1, mv = {1, 5, 1})
public final class EidRepoImpl implements EidRepo, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final EidApi eidApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IDeviceApi deviceApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final EidConfig eidConfig;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final WebConfig webConfig;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final NavigationConfig navigationConfig;

    public EidRepoImpl(@NotNull EidApi eidApi, @NotNull IDeviceApi iDeviceApi, @NotNull EidConfig eidConfig, @NotNull WebConfig webConfig, @NotNull NavigationConfig navigationConfig) {
        this.eidApi = eidApi;
        this.deviceApi = iDeviceApi;
        this.eidConfig = eidConfig;
        this.webConfig = webConfig;
        this.navigationConfig = navigationConfig;
    }

    @Override // com.huami.eid.ui.api.EidRepo
    public boolean checkPwdState() {
        return this.eidApi.checkPwdStatus();
    }

    @Override // com.huami.eid.ui.api.EidRepo
    public void deleteEidCard(@NotNull String bizSerialNumber) {
        this.eidApi.deleteEid(bizSerialNumber);
        Unit unit = Unit.INSTANCE;
        this.deviceApi.deleteAppletForWatch("A000000003454944", AppletType.EID);
    }

    @Override // com.huami.eid.ui.api.EidRepo
    public void faceCompare(@NotNull String bizSerialNumber, @NotNull String requestId, @NotNull byte[] imageData) {
        String strEncodeToString = Base64.encodeToString(imageData, 2);
        this.eidApi.auth(bizSerialNumber, requestId, m.replace$default(UUID.randomUUID().toString(), Constants.ACCEPT_TIME_SEPARATOR_SERVER, "", false, 4, (Object) null), strEncodeToString, "4");
    }

    @Override // com.huami.eid.ui.api.EidRepo
    @NotNull
    public EidStatus getEidStatus(@NotNull String queryType, @Nullable String requestId) {
        EidStatus eidStatus = this.eidApi.getEidStatus(queryType, requestId);
        Logcat.i("getEidStatus:" + eidStatus.getStatus() + ":" + eidStatus.getUserId());
        if (Intrinsics.areEqual(queryType, "2") && EidStatusExtensionKt.installedInCurrentDevice(eidStatus)) {
            this.deviceApi.notifyAppletInfoForWatch(new AppletEntity("A000000003454944", null, 5, null, null, 26, null));
        }
        return eidStatus;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.eid.ui.api.EidRepo
    @NotNull
    public String getRequestId() {
        return this.eidApi.getRequestId();
    }

    @Override // com.huami.eid.ui.api.EidRepo
    public void gotoWeb(@NotNull String url) {
        this.navigationConfig.goToWeb(this.webConfig.getWebHost() + url, null);
    }

    @Override // com.huami.eid.ui.api.EidRepo
    public boolean openEidCard(@NotNull String bizSerialNumber, @NotNull String requestId) {
        this.eidApi.issueEid(bizSerialNumber);
        EidInfoEntity eidInfo = this.eidApi.getEidInfo();
        boolean zPostResult$default = EidApi.DefaultImpls.postResult$default(this.eidApi, bizSerialNumber, requestId, null, this.eidConfig.getCarrierType(), null, eidInfo, 20, null);
        if (zPostResult$default) {
            this.deviceApi.notifyAppletInfoForWatch(new AppletEntity("A000000003454944", null, 5, null, null, 26, null));
        }
        return zPostResult$default;
    }

    @Override // com.huami.eid.ui.api.EidRepo
    public void revokeEidCard() {
        this.eidApi.revoke();
        Unit unit = Unit.INSTANCE;
        this.deviceApi.deleteAppletForWatch("A000000003454944", AppletType.EID);
    }

    @Override // com.huami.eid.ui.api.EidRepo
    public boolean verifyWatchPwd() {
        return this.eidApi.unlock();
    }
}
