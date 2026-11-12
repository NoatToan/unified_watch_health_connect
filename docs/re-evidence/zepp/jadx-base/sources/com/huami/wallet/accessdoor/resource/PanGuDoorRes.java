package com.huami.wallet.accessdoor.resource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/huami/wallet/accessdoor/resource/PanGuDoorRes;", "Lcom/huami/wallet/accessdoor/resource/CincoDoorRes;", "", "startDetectionDrawable", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class PanGuDoorRes extends CincoDoorRes {
    @Override // com.huami.wallet.accessdoor.resource.CincoDoorRes, com.huami.wallet.accessdoor.resource.IAccessDoorRes
    @NotNull
    public String startDetectionDrawable() {
        return "nfc_ic_access_simulation_kongming";
    }
}
