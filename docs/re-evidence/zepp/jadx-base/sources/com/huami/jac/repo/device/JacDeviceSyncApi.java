package com.huami.jac.repo.device;

import com.huami.nfc.base.PayResponse;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\f"}, d2 = {"Lcom/huami/jac/repo/device/JacDeviceSyncApi;", "", "", "aid", "Lcom/huami/nfc/base/PayResponse;", "", "issueApplet", "deleteApplet", "activeApplet", "updateCarCardList", "", "isDefaultCard", "jac-repo_release"}, k = 1, mv = {1, 5, 1})
public interface JacDeviceSyncApi {
    @NotNull
    PayResponse<Unit> activeApplet(@NotNull String aid);

    @NotNull
    PayResponse<Unit> deleteApplet(@NotNull String aid);

    @NotNull
    PayResponse<Boolean> isDefaultCard(@NotNull String aid);

    @NotNull
    PayResponse<Unit> issueApplet(@NotNull String aid);

    @NotNull
    PayResponse<Unit> updateCarCardList(@NotNull String aid);
}
