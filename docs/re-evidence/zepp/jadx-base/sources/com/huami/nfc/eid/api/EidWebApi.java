package com.huami.nfc.eid.api;

import com.huami.nfc.base.PayResponse;
import com.huami.nfc.eid.entities.EidDigitalInfo;
import com.huami.nfc.eid.entities.EidInfoEntity;
import com.huami.nfc.eid.entities.EidStatus;
import com.unionpay.tsmservice.data.Constant;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H&J@\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0011H&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005H&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H&¨\u0006\u0018"}, d2 = {"Lcom/huami/nfc/eid/api/EidWebApi;", "Lcom/huami/nfc/eid/api/EidAppletApi;", "", "queryType", "requestId", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/eid/entities/EidStatus;", "getEidStatus", "bizSerialNumber", Constant.KEY_SESSION_KEY, "image", "imageType", "", "auth", "eidLevel", "carrierType", "phoneNum", "Lcom/huami/nfc/eid/entities/EidInfoEntity;", "eidInfo", "", "postResult", "Lcom/huami/nfc/eid/entities/EidDigitalInfo;", "getEidQrCode", "revoke", "nfc-eid_release"}, k = 1, mv = {1, 5, 1})
public interface EidWebApi extends EidAppletApi {
    @NotNull
    PayResponse<Unit> auth(@NotNull String bizSerialNumber, @NotNull String requestId, @NotNull String sessionKey, @NotNull String image, @NotNull String imageType);

    @NotNull
    PayResponse<EidDigitalInfo> getEidQrCode();

    @NotNull
    PayResponse<EidStatus> getEidStatus(@NotNull String queryType, @Nullable String requestId);

    @NotNull
    PayResponse<Boolean> postResult(@NotNull String bizSerialNumber, @NotNull String requestId, @NotNull String eidLevel, @NotNull String carrierType, @Nullable String phoneNum, @NotNull EidInfoEntity eidInfo);

    @NotNull
    PayResponse<Unit> revoke();
}
