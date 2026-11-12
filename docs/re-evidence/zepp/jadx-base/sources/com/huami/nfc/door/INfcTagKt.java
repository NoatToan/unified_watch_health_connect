package com.huami.nfc.door;

import com.huami.nfc.base.PayResponse;
import com.huami.nfc.web.BleException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0005"}, d2 = {"Lcom/huami/nfc/door/INfcTag;", "api", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/door/NfcTag;", "getNfcTagWithResponse", "nfc-door_release"}, k = 2, mv = {1, 5, 1})
public final class INfcTagKt {
    @NotNull
    public static final PayResponse<NfcTag> getNfcTagWithResponse(@NotNull INfcTag iNfcTag) {
        PayResponse<NfcTag> payResponseSuccess;
        try {
            NfcTag tag = iNfcTag.getTag();
            int result = tag.getResult();
            if (result == 0) {
                payResponseSuccess = PayResponse.INSTANCE.success("success", tag);
            } else if (result == 3) {
                payResponseSuccess = PayResponse.INSTANCE.error("3", "卡读取失败，未检测到卡信息");
            } else if (result == 8) {
                payResponseSuccess = PayResponse.INSTANCE.error("8", "卡片为非M1卡，暂不支持此卡片");
            } else if (result == 9) {
                payResponseSuccess = new PayResponse<>("9", "卡片为加密卡，无法读取扇区数据", tag);
            } else if (result != 64) {
                payResponseSuccess = result != 65 ? PayResponse.INSTANCE.error("254", "读取失败，未定义错误") : PayResponse.INSTANCE.error("65", "认证成功后,数据读取错误");
            } else {
                payResponseSuccess = PayResponse.INSTANCE.error("64", "不支持模拟该类型卡");
            }
            return payResponseSuccess;
        } catch (Exception e) {
            if (e instanceof BleException) {
                return PayResponse.INSTANCE.error("ble_NFC_TAG", "INfcTag接口中，获取NfcTag时发生未定义错误（" + ((Object) e.getMessage()) + "）,请检查INfcTag接口实现类");
            }
            return PayResponse.INSTANCE.error("255", "INfcTag接口中，获取NfcTag时发生未定义错误（" + ((Object) e.getMessage()) + "）,请检查INfcTag接口实现类");
        }
    }
}
