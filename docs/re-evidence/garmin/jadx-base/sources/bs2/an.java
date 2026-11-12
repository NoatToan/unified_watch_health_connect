package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class an extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19682e;

    static {
        bk bkVar = new bk("payment_user_behavior", 293);
        f19682e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("payment_event", 0, 140, 1.0d, 0.0d, "", false, zn.UINT32Z));
        bkVar.e(new rc("payment_popup", 1, 0, 1.0d, 0.0d, "", false, zn.PAYMENT_POPUP));
        bkVar.e(new rc("wallet_status", 2, 0, 1.0d, 0.0d, "", false, zn.WALLET_STATUS));
        bkVar.e(new rc("payment_entry_point", 3, 0, 1.0d, 0.0d, "", false, zn.PAYMENT_ENTRY_POINT));
        bkVar.e(new rc("card_type", 4, 0, 1.0d, 0.0d, "", false, zn.CARD_TYPE));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("active_card_count", 5, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("inactive_card_count", 6, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transit_provider", 7, 0, 1.0d, 0.0d, "", false, zn.TRANSIT_PROVIDER));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("topup_time", 8, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("transaction_time", 9, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("express_status", 10, 0, 1.0d, 0.0d, "", false, zn.EXPRESS_STATUS));
        bkVar.e(new rc("alipay_state", 11, 2, 1.0d, 0.0d, "", false, zn.ALIPAY_STATE));
        zn znVar3 = zn.STRING;
        bkVar.e(new rc("active_card_list", 12, 7, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("inactive_card_list", 13, 7, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("wechatpay_state", 14, 2, 1.0d, 0.0d, "", false, zn.WECHATPAY_STATE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public an() {
        super(wb.b(293));
    }

    public an(bk bkVar) {
        super(bkVar);
    }
}
