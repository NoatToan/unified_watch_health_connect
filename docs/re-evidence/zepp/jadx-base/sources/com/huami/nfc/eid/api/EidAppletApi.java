package com.huami.nfc.eid.api;

import com.huami.nfc.base.PayResponse;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/huami/nfc/eid/api/EidAppletApi;", "", "", "bizSerialNumber", "Lcom/huami/nfc/base/PayResponse;", "", "issueEid", "deleteEid", "nfc-eid_release"}, k = 1, mv = {1, 5, 1})
public interface EidAppletApi {
    @NotNull
    PayResponse<Unit> deleteEid(@NotNull String bizSerialNumber);

    @NotNull
    PayResponse<Unit> issueEid(@NotNull String bizSerialNumber);
}
