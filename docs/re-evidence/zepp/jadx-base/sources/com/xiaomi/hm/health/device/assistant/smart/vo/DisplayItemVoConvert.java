package com.xiaomi.hm.health.device.assistant.smart.vo;

import com.huami.bluetooth.profile.channel.module.assistant.dto.CardType;
import com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/vo/DisplayItemVoConvert;", "", "", "Lcom/xiaomi/hm/health/device/assistant/smart/vo/ItemVo;", "data", "convertListForDisplay", "items", "Lcom/huami/bluetooth/profile/channel/module/assistant/v2/QuickCardStruct$QueryCardsResponseItem;", "convertRequestListV2", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DisplayItemVoConvert {
    @NotNull
    public final List<ItemVo> convertListForDisplay(@NotNull List<? extends ItemVo> data) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : data) {
            if (((ItemVo) obj).getType() >= 0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((ItemVo) obj2).getIsEnable()) {
                arrayList3.add(obj2);
            }
        }
        arrayList.addAll(arrayList3);
        arrayList.add(new DisplayItemVo(0, 0, "", "", true, -1, CardType.ACTIVITY_GOAL));
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (!((ItemVo) obj3).getIsEnable()) {
                arrayList4.add(obj3);
            }
        }
        arrayList.addAll(arrayList4);
        return arrayList;
    }

    @NotNull
    public final List<QuickCardStruct.QueryCardsResponseItem> convertRequestListV2(@NotNull List<? extends ItemVo> items) throws Exception {
        if (items.isEmpty()) {
            throw new Exception("data is empty");
        }
        ArrayList<ItemVo> arrayList = new ArrayList();
        for (Object obj : items) {
            if (((ItemVo) obj).getType() >= 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (ItemVo itemVo : arrayList) {
            arrayList2.add(new QuickCardStruct.QueryCardsResponseItem(itemVo.getAppId(), itemVo.getCardId(), itemVo.getIsEnable()));
        }
        return arrayList2;
    }
}
