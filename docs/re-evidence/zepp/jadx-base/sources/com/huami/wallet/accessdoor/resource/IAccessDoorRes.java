package com.huami.wallet.accessdoor.resource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u0004H&J\b\u0010\u000b\u001a\u00020\u0002H&J\b\u0010\f\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\u0002H&J\b\u0010\u000e\u001a\u00020\u0004H&J\b\u0010\u000f\u001a\u00020\u0002H&J\b\u0010\u0010\u001a\u00020\u0004H&J\b\u0010\u0011\u001a\u00020\u0002H&J\b\u0010\u0012\u001a\u00020\u0004H&J\b\u0010\u0013\u001a\u00020\u0004H&J\b\u0010\u0014\u001a\u00020\u0004H&J\b\u0010\u0015\u001a\u00020\u0004H&¨\u0006\u0016"}, d2 = {"Lcom/huami/wallet/accessdoor/resource/IAccessDoorRes;", "", "", "selectOpenCardBackground", "", "selectOpenCardTitle", "selectOpenCardMessage", "selectOpenWhiteCardMessage", "selectOpenWhiteCardTitle", "startAccessDoorTitle", "startAccessDoorMessage", "startAccessDoorPicture", "startDetectionMessage", "startDetectionDrawable", "openDoorLoadingIntroFirst", "openDoorLoadingIntroPictureFirst", "openDoorLoadingIntroSecond", "openDoorLoadingIntroPictureSecond", "setDefaultCardMessage", "setDefaultCardSuccessMessage", "getSimulationFailTipsRes", "getOpenCardTip", "access-door_release"}, k = 1, mv = {1, 5, 1})
public interface IAccessDoorRes {
    int getOpenCardTip();

    int getSimulationFailTipsRes();

    int openDoorLoadingIntroFirst();

    @NotNull
    String openDoorLoadingIntroPictureFirst();

    @NotNull
    String openDoorLoadingIntroPictureSecond();

    int openDoorLoadingIntroSecond();

    @NotNull
    String selectOpenCardBackground();

    int selectOpenCardMessage();

    int selectOpenCardTitle();

    int selectOpenWhiteCardMessage();

    int selectOpenWhiteCardTitle();

    int setDefaultCardMessage();

    int setDefaultCardSuccessMessage();

    int startAccessDoorMessage();

    @NotNull
    String startAccessDoorPicture();

    int startAccessDoorTitle();

    @NotNull
    String startDetectionDrawable();

    int startDetectionMessage();
}
