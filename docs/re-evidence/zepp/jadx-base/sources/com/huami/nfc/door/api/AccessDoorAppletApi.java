package com.huami.nfc.door.api;

import com.huami.nfc.base.PayResponse;
import com.huami.nfc.door.NfcTag;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J:\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u000b\u001a\u00020\u0004H&¨\u0006\r"}, d2 = {"Lcom/huami/nfc/door/api/AccessDoorAppletApi;", "", "Lcom/huami/nfc/door/NfcTag;", "tag", "", "phoneNum", "districtName", "", "dataType", "Lcom/huami/nfc/base/PayResponse;", "install", "aid", "deleteApp", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public interface AccessDoorAppletApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ PayResponse install$default(AccessDoorAppletApi accessDoorAppletApi, NfcTag nfcTag, String str, String str2, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: install");
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            if ((i2 & 4) != 0) {
                str2 = null;
            }
            if ((i2 & 8) != 0) {
                i = 0;
            }
            return accessDoorAppletApi.install(nfcTag, str, str2, i);
        }
    }

    @NotNull
    PayResponse<String> deleteApp(@NotNull String aid);

    @NotNull
    PayResponse<String> install(@Nullable NfcTag tag, @Nullable String phoneNum, @Nullable String districtName, int dataType);
}
