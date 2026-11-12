package com.huami.wallet.lib.entity;

import com.huami.nfc.bus.CityInfoEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/nfc/bus/CityInfoEntity;", "Lcom/huami/wallet/lib/entity/CitySimpleInfo;", "toCitySimpleInfo", "core-api_release"}, k = 2, mv = {1, 5, 1})
public final class CitySimpleInfoKt {
    @NotNull
    public static final CitySimpleInfo toCitySimpleInfo(@NotNull CityInfoEntity cityInfoEntity) {
        String aid = cityInfoEntity.getAid();
        String appCode = cityInfoEntity.getAppCode();
        String cardName = cityInfoEntity.getCardName();
        String xiaomiCityCode = cityInfoEntity.getXiaomiCityCode();
        List<String> paymentChannelList = cityInfoEntity.getPaymentChannelList();
        if (paymentChannelList == null) {
            paymentChannelList = CollectionsKt__CollectionsKt.emptyList();
        }
        return new CitySimpleInfo(aid, appCode, cardName, xiaomiCityCode, paymentChannelList, cityInfoEntity.getOpenFeeRefundApplyFlg(), cityInfoEntity.getXmReturnCardFlg(), cityInfoEntity.getXmActionToken(), cityInfoEntity.getXmReturnFeeFlg(), cityInfoEntity.getRefundEnable(), cityInfoEntity.getRefundAccountCollectModes());
    }
}
