package com.huami.wallet.accessdoor.resource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/wallet/accessdoor/resource/VeniceDoorRes;", "Lcom/huami/wallet/accessdoor/resource/DongTingHuDoorRes;", "", "selectOpenCardBackground", "startAccessDoorPicture", "startDetectionDrawable", "openDoorLoadingIntroPictureFirst", "openDoorLoadingIntroPictureSecond", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class VeniceDoorRes extends DongTingHuDoorRes {
    @Override // com.huami.wallet.accessdoor.resource.DongTingHuDoorRes, com.huami.wallet.accessdoor.resource.IAccessDoorRes
    @NotNull
    public String openDoorLoadingIntroPictureFirst() {
        return "nfc_ic_access_venice_loading_fragment_first";
    }

    @Override // com.huami.wallet.accessdoor.resource.DongTingHuDoorRes, com.huami.wallet.accessdoor.resource.IAccessDoorRes
    @NotNull
    public String openDoorLoadingIntroPictureSecond() {
        return "nfc_ic_access_venice_loading_fragment_second";
    }

    @Override // com.huami.wallet.accessdoor.resource.DongTingHuDoorRes, com.huami.wallet.accessdoor.resource.IAccessDoorRes
    @NotNull
    public String selectOpenCardBackground() {
        return "nfc_ic_access_door_venice_select_type";
    }

    @Override // com.huami.wallet.accessdoor.resource.DongTingHuDoorRes, com.huami.wallet.accessdoor.resource.IAccessDoorRes
    @NotNull
    public String startAccessDoorPicture() {
        return "nfc_ic_start_venice_background";
    }

    @Override // com.huami.wallet.accessdoor.resource.DongTingHuDoorRes, com.huami.wallet.accessdoor.resource.IAccessDoorRes
    @NotNull
    public String startDetectionDrawable() {
        return "nfc_ic_access_venice_detection";
    }
}
