package com.xiaomi.hm.health.nfc.service;

import android.annotation.SuppressLint;
import com.huami.nfc.applet.CardInfo;
import com.huami.nfc.base.PayResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003\u001a \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001¨\u0006\u000b"}, d2 = {"", "", "patter", "a", "Lcom/xiaomi/hm/health/nfc/service/ICardInfoApi;", "", "type", "aid", "Lcom/xiaomi/hm/health/nfc/service/NfcOpenServiceResponse;", "Lcom/xiaomi/hm/health/nfc/service/CardInfoEntity;", "info", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class CardInfoApiKt {
    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SimpleDateFormat"})
    public static final String a(long j, String str) {
        return new SimpleDateFormat(str).format(new Date(j));
    }

    public static /* synthetic */ String b(long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "yyyyMMdd";
        }
        return a(j, str);
    }

    @NotNull
    public static final NfcOpenServiceResponse<CardInfoEntity> info(@NotNull ICardInfoApi iCardInfoApi, int i, @NotNull String str) {
        CardInfoEntity cardInfoEntity = new CardInfoEntity(null, null, null, null, null, 31, null);
        byte b = (byte) 5;
        byte b2 = (byte) i;
        if (((byte) (b2 & b)) == b) {
            PayResponse<CardInfo> cardInfo = iCardInfoApi.getCardInfo(str);
            CardInfo data = cardInfo.getData();
            cardInfoEntity.setLogicCardNo(data == null ? null : data.getNumber());
            String logicCardNo = cardInfoEntity.getLogicCardNo();
            if (logicCardNo != null) {
                if (!NfcOpenServiceKt.getNoNeedWebCardNumberCityList().contains(str)) {
                    logicCardNo = iCardInfoApi.getCardNumberFromWeb(str, logicCardNo).getData();
                }
                cardInfoEntity.setCardNo(logicCardNo);
            }
            CardInfo data2 = cardInfo.getData();
            cardInfoEntity.setValidityDate(data2 != null ? b(data2.getActivationDate(), null, 1, null) : null);
        } else {
            if (((byte) (b2 & 1)) == 1) {
                cardInfoEntity.setLogicCardNo(iCardInfoApi.getCardNumber(str).getData());
                String logicCardNo2 = cardInfoEntity.getLogicCardNo();
                if (logicCardNo2 != null) {
                    if (!NfcOpenServiceKt.getNoNeedWebCardNumberCityList().contains(str)) {
                        logicCardNo2 = iCardInfoApi.getCardNumberFromWeb(str, logicCardNo2).getData();
                    }
                    cardInfoEntity.setCardNo(logicCardNo2);
                }
            }
            if (((byte) (b2 & 4)) == 4) {
                cardInfoEntity.setValidityDate(iCardInfoApi.getValidityDate(str).getData());
            }
        }
        if (((byte) (b2 & 2)) == 2) {
            cardInfoEntity.setBalance(iCardInfoApi.getBalance(str).getData());
        }
        if (((byte) (b2 & 8)) == 8) {
            cardInfoEntity.setTradeRecords(iCardInfoApi.getTradeRecords(str).getData());
        }
        return NfcOpenServiceResponse.INSTANCE.success(cardInfoEntity);
    }
}
