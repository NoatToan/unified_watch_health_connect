package com.huami.wallet.ui.helper;

import com.huami.wallet.ui.utils.AnalyticConst;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/huami/wallet/ui/helper/BusDetailOutType;", "", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "BUS_DETAIL_OUT_CHARGE", "BUS_DETAIL_OUT_TRADING_RECORD", "BUS_DETAIL_OUT_ENABLED", "BUS_DETAIL_OUT_SWITCHCARD", "BUS_DETAIL_OUT_FAQ", "BUS_DETAIL_OUT_ADD", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public enum BusDetailOutType {
    BUS_DETAIL_OUT_CHARGE(AnalyticConst.BusDetailOuValue.BUS_DETAIL_OUT_CHARGE),
    BUS_DETAIL_OUT_TRADING_RECORD(AnalyticConst.BusDetailOuValue.BUS_DETAIL_OUT_TRADING_RECORD),
    BUS_DETAIL_OUT_ENABLED(AnalyticConst.BusDetailOuValue.BUS_DETAIL_OUT_ENABLED),
    BUS_DETAIL_OUT_SWITCHCARD(AnalyticConst.BusDetailOuValue.BUS_DETAIL_OUT_SWITCHCARD),
    BUS_DETAIL_OUT_FAQ("FAQ"),
    BUS_DETAIL_OUT_ADD("Add");


    @NotNull
    private final String type;

    BusDetailOutType(String str) {
        this.type = str;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
