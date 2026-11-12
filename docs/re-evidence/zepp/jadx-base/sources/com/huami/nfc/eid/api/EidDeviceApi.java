package com.huami.nfc.eid.api;

import com.huami.nfc.base.PayResponse;
import com.huami.nfc.eid.entities.EidInfoEntity;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\r"}, d2 = {"Lcom/huami/nfc/eid/api/EidDeviceApi;", "", "", Constant.h, "Lcom/huami/nfc/base/PayResponse;", "writeCert", "getRequestId", "Lcom/huami/nfc/eid/entities/EidInfoEntity;", "getEidInfo", "", "checkPwdStatus", "unlock", "sign", "nfc-eid_release"}, k = 1, mv = {1, 5, 1})
public interface EidDeviceApi {
    @NotNull
    PayResponse<Boolean> checkPwdStatus();

    @NotNull
    PayResponse<EidInfoEntity> getEidInfo();

    @NotNull
    PayResponse<String> getRequestId();

    @NotNull
    PayResponse<String> sign(@NotNull String cmd);

    @NotNull
    PayResponse<Boolean> unlock();

    @NotNull
    PayResponse<String> writeCert(@NotNull String cmd);
}
