package com.huami.nfc.eid.api;

import com.huami.nfc.base.PayResponse;
import com.huami.nfc.eid.entities.DeviceCertificate;
import com.huami.nfc.eid.entities.EidInfoEntity;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J@\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH&J.\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H&¨\u0006\u0012"}, d2 = {"Lcom/huami/nfc/eid/api/PostResultApi;", "", "", "orderNum", "requestId", "eidLevel", "carrierType", "phoneNum", "Lcom/huami/nfc/eid/entities/EidInfoEntity;", "eidInfo", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/eid/entities/DeviceCertificate;", "getCertificate", "result", "errorCode", "idCarrier", "", "openStepTwo", "nfc-eid_release"}, k = 1, mv = {1, 5, 1})
public interface PostResultApi {
    @NotNull
    PayResponse<DeviceCertificate> getCertificate(@NotNull String orderNum, @NotNull String requestId, @NotNull String eidLevel, @NotNull String carrierType, @Nullable String phoneNum, @NotNull EidInfoEntity eidInfo);

    @NotNull
    PayResponse<Unit> openStepTwo(@NotNull String orderNum, @NotNull String result, @NotNull String errorCode, @NotNull String idCarrier);
}
