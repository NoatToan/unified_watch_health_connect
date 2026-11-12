package com.huami.wallet.ui.utils;

import com.huami.nfc.bus.PayChannel;
import com.huami.wallet.lib.entity.CitySimpleInfo;
import com.huami.wallet.ui.entity.RichPayMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\"\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b\"\u0016\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\b\"\u0016\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\b\"\u0016\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\b\"\u0016\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\b\"\u0016\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/huami/wallet/lib/entity/CitySimpleInfo;", "", "isMi", "", "Lcom/huami/wallet/ui/entity/RichPayMode;", "toRichPayModeList", "", "KEY_BUS_ID", "Ljava/lang/String;", "KEY_BUS_DETAIL_DATA", "KEY_INVOICE_INFO", "KEY_INVOICE_ADDRESS", "KEY_INVOICE_AMOUNT", "KEY_INVOICE_VERSION", "KEY_HUAMI_WECHAT_PAY", "KEY_HUAMI_ALI_PAY", "core-ui_release"}, k = 2, mv = {1, 5, 1})
public final class BusConstKt {

    @NotNull
    public static final String KEY_BUS_DETAIL_DATA = "bus_detail_data";

    @NotNull
    public static final String KEY_BUS_ID = "bus_id";

    @NotNull
    public static final String KEY_HUAMI_ALI_PAY = "huami_ali_pay";

    @NotNull
    public static final String KEY_HUAMI_WECHAT_PAY = "huami_wechat_pay";

    @NotNull
    public static final String KEY_INVOICE_ADDRESS = "bus_invoice_address";

    @NotNull
    public static final String KEY_INVOICE_AMOUNT = "bus_invoice_amount";

    @NotNull
    public static final String KEY_INVOICE_INFO = "bus_invoice_info";

    @NotNull
    public static final String KEY_INVOICE_VERSION = "bus_invoice_version";

    @NotNull
    public static final List<RichPayMode> toRichPayModeList(@Nullable CitySimpleInfo citySimpleInfo, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (citySimpleInfo == null) {
            return arrayList;
        }
        for (String str : citySimpleInfo.getPaymentList()) {
            if (z) {
                if (Intrinsics.areEqual(str, PayChannel.MiPay.getValue())) {
                    arrayList.add(RichPayMode.MI_PAY);
                } else if (Intrinsics.areEqual(str, PayChannel.WeChatMi.getValue())) {
                    arrayList.add(RichPayMode.WECHAT_PAY);
                } else if (Intrinsics.areEqual(str, PayChannel.AlipayMi.getValue())) {
                    arrayList.add(RichPayMode.ALIPAY);
                }
            } else if (Intrinsics.areEqual(str, KEY_HUAMI_WECHAT_PAY)) {
                arrayList.add(RichPayMode.WECHAT_PAY);
            } else if (Intrinsics.areEqual(str, KEY_HUAMI_ALI_PAY)) {
                arrayList.add(RichPayMode.ALIPAY);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List toRichPayModeList$default(CitySimpleInfo citySimpleInfo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return toRichPayModeList(citySimpleInfo, z);
    }
}
