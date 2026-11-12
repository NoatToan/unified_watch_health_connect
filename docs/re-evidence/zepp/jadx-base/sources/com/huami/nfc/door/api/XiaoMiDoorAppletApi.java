package com.huami.nfc.door.api;

import com.huami.nfc.base.PayResponse;
import com.huami.nfc.door.NfcTag;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/huami/nfc/door/api/XiaoMiDoorAppletApi;", "", "Lcom/huami/nfc/door/NfcTag;", "tag", "Lcom/huami/nfc/base/PayResponse;", "", "install", "aid", "deleteApp", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public interface XiaoMiDoorAppletApi {
    @NotNull
    PayResponse<String> deleteApp(@NotNull String aid);

    @NotNull
    PayResponse<String> install(@Nullable NfcTag tag);
}
