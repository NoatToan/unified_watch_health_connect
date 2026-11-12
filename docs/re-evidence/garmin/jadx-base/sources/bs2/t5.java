package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class t5 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20572e;

    static {
        bk bkVar = new bk("connect_iq_data_fields", 170);
        f20572e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("app_uuid", 1, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("data_fields_attribute", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public t5() {
        super(wb.b(170));
    }

    public t5(bk bkVar) {
        super(bkVar);
    }
}
