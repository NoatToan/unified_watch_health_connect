package com.huami.watchfacesstore.ext;

import com.huami.arch.core.State;
import com.huami.arch.core.Success;
import com.huami.watchfacesstore.bean.WatchData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000¨\u0006\u0004"}, d2 = {"Lcom/huami/arch/core/State;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "toHistoryData", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class StateKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final State<List<WatchData>> toHistoryData(@NotNull State<? extends List<WatchData>> state) {
        ArrayList arrayList;
        if (!(state instanceof Success)) {
            return state;
        }
        List<WatchData> list = (List) ((Success) state).getValue();
        if (list == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (WatchData watchData : list) {
                arrayList2.add(watchData.copy((499575 & 1) != 0 ? watchData.customizable : null, (499575 & 2) != 0 ? watchData.id : 0, (499575 & 4) != 0 ? watchData.image : null, (499575 & 8) != 0 ? watchData.isFree : null, (499575 & 16) != 0 ? watchData.metas : null, (499575 & 32) != 0 ? watchData.name : null, (499575 & 64) != 0 ? watchData.price : null, (499575 & 128) != 0 ? watchData.rank : null, (499575 & 256) != 0 ? watchData.size : null, (499575 & 512) != 0 ? watchData.color : null, (499575 & 1024) != 0 ? watchData.status : 0, (499575 & 2048) != 0 ? watchData.dialPath : null, (499575 & 4096) != 0 ? watchData.publisherId : null, (499575 & 8192) != 0 ? watchData.currencyCode : null, (499575 & 16384) != 0 ? watchData.isPurchased : null, (499575 & 32768) != 0 ? watchData.version : null, (499575 & 65536) != 0 ? watchData.thirdPartyProductId : null, (499575 & 131072) != 0 ? watchData.skuId : null, (499575 & 262144) != 0 ? watchData.publisher : null));
            }
            arrayList = arrayList2;
        }
        return new Success(arrayList);
    }
}
