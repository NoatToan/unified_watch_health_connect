package com.huami.wallet.accessdoor.resource;

import com.huami.wallet.accessdoor.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016¨\u0006\u0018"}, d2 = {"Lcom/huami/wallet/accessdoor/resource/CincoDoorRes;", "Lcom/huami/wallet/accessdoor/resource/IAccessDoorRes;", "", "selectOpenCardBackground", "", "selectOpenCardTitle", "selectOpenCardMessage", "selectOpenWhiteCardMessage", "selectOpenWhiteCardTitle", "startAccessDoorTitle", "startAccessDoorMessage", "startAccessDoorPicture", "startDetectionMessage", "startDetectionDrawable", "openDoorLoadingIntroFirst", "openDoorLoadingIntroSecond", "openDoorLoadingIntroPictureFirst", "openDoorLoadingIntroPictureSecond", "setDefaultCardMessage", "setDefaultCardSuccessMessage", "getSimulationFailTipsRes", "getOpenCardTip", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public class CincoDoorRes implements IAccessDoorRes {
    @Override // com.huami.wallet.accessdoor.resource.IAccessDoorRes
    public int getOpenCardTip() {
        return R.string.access_door_open_card_tip;
    }

    @Override // com.huami.wallet.accessdoor.resource.IAccessDoorRes
    public int getSimulationFailTipsRes() {
        return R.string.access_door_simulation_result_fail_tips_msg_band;
    }

    @Override // com.huami.wallet.accessdoor.resource.IAccessDoorRes
    public int openDoorLoadingIntroFirst() {
        return R.string.access_loading_intro1;
    }

    @Override // com.huami.wallet.accessdoor.resource.IAccessDoorRes
    @NotNull
    public String openDoorLoadingIntroPictureFirst() {
        return "nfc_ic_access_loading_fragment_first";
    }

    @Override // com.huami.wallet.accessdoor.resource.IAccessDoorRes
    @NotNull
    public String openDoorLoadingIntroPictureSecond() {
        return "nfc_ic_access_loading_fragment_second";
    }

    @Override // com.huami.wallet.accessdoor.resource.IAccessDoorRes
    public int openDoorLoadingIntroSecond() {
        return R.string.access_loading_intro2;
    }

    @Override // com.huami.wallet.accessdoor.resource.IAccessDoorRes
    @NotNull
    public String selectOpenCardBackground() {
        return "nfc_ic_access_door_select_type";
    }

    @Override // com.huami.wallet.accessdoor.resource.IAccessDoorRes
    public int selectOpenCardMessage() {
        return R.string.access_door_message;
    }

    @Override // com.huami.wallet.accessdoor.resource.IAccessDoorRes
    public int selectOpenCardTitle() {
        return R.string.access_door_select_title;
    }

    @Override // com.huami.wallet.accessdoor.resource.IAccessDoorRes
    public int selectOpenWhiteCardMessage() {
        return R.string.access_door_mi_card_message;
    }

    @Override // com.huami.wallet.accessdoor.resource.IAccessDoorRes
    public int selectOpenWhiteCardTitle() {
        return R.string.access_door_mi_card;
    }

    @Override // com.huami.wallet.accessdoor.resource.IAccessDoorRes
    public int setDefaultCardMessage() {
        return R.string.access_card_default_message;
    }

    @Override // com.huami.wallet.accessdoor.resource.IAccessDoorRes
    public int setDefaultCardSuccessMessage() {
        return R.string.access_card_set_default_success_message;
    }

    @Override // com.huami.wallet.accessdoor.resource.IAccessDoorRes
    public int startAccessDoorMessage() {
        return R.string.access_door_card_feature_tip;
    }

    @Override // com.huami.wallet.accessdoor.resource.IAccessDoorRes
    @NotNull
    public String startAccessDoorPicture() {
        return "nfc_ic_start_access_background";
    }

    @Override // com.huami.wallet.accessdoor.resource.IAccessDoorRes
    public int startAccessDoorTitle() {
        return R.string.access_door_card_feature;
    }

    @Override // com.huami.wallet.accessdoor.resource.IAccessDoorRes
    @NotNull
    public String startDetectionDrawable() {
        return "nfc_ic_access_simulation_cinco";
    }

    @Override // com.huami.wallet.accessdoor.resource.IAccessDoorRes
    public int startDetectionMessage() {
        return R.string.access_door_stay_close;
    }
}
