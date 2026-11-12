package com.huami.nfc.ble;

import com.huami.nfc.applet.CardInfo;
import com.huami.nfc.applet.TransEntity;
import com.huami.nfc.base.PayResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H&J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0012\u001a\u00020\u0002H&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H&J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0012\u001a\u00020\u0002H&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H&J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&J\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006!"}, d2 = {"Lcom/huami/nfc/ble/NfcBleApi;", "", "", "aid", "Lcom/huami/nfc/ble/AppletType;", "type", "Lcom/huami/nfc/base/PayResponse;", "", "activeDefaultCard", "deactivateDefaultCard", "readDefaultCard", "", "updateNfcCardListSync", "", "readMasterSeFlag", "writeMasterSeFlagSync", "", "checkPinState", "password", "setWristLockToFlash", "queryCrsVersion", "updateWristLockToSe", "setWristLockToSe", "getBalance", "Lcom/huami/nfc/applet/CardInfo;", "getCardInfo", "getCplc", "getLingNanTongCityCode", "", "Lcom/huami/nfc/applet/TransEntity;", "getTransRecord", "isInstalled", "isSupport", "nfc-ble_release"}, k = 1, mv = {1, 5, 1})
public interface NfcBleApi {
    @NotNull
    PayResponse<Unit> activeDefaultCard(@NotNull String aid, @NotNull AppletType type);

    @NotNull
    PayResponse<Integer> checkPinState();

    @NotNull
    PayResponse<Unit> deactivateDefaultCard(@NotNull String aid, @NotNull AppletType type);

    @NotNull
    PayResponse<Integer> getBalance(@NotNull String aid);

    @NotNull
    PayResponse<CardInfo> getCardInfo(@NotNull String aid);

    @NotNull
    PayResponse<String> getCplc();

    @NotNull
    PayResponse<String> getLingNanTongCityCode();

    @NotNull
    PayResponse<List<TransEntity>> getTransRecord(@NotNull String aid);

    @NotNull
    PayResponse<Boolean> isInstalled(@NotNull String aid);

    @NotNull
    PayResponse<Boolean> isSupport(@NotNull String aid);

    @NotNull
    PayResponse<Boolean> queryCrsVersion();

    @NotNull
    PayResponse<String> readDefaultCard();

    @NotNull
    PayResponse<Boolean> readMasterSeFlag();

    @NotNull
    PayResponse<Boolean> setWristLockToFlash(@NotNull String password);

    @NotNull
    PayResponse<Boolean> setWristLockToSe();

    @NotNull
    PayResponse<Unit> updateNfcCardListSync(@NotNull List<String> aid, @NotNull AppletType type);

    @NotNull
    PayResponse<Boolean> updateWristLockToSe(@NotNull String password);

    @NotNull
    PayResponse<Boolean> writeMasterSeFlagSync();
}
