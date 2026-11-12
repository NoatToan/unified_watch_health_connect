package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ks extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20268e;

    static {
        bk bkVar = new bk("set", 225);
        f20268e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 254, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("duration", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, zn.UINT32));
        bkVar.e(new rc("movement", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.MOVEMENT_TYPE));
        bkVar.e(new rc("probability", 2, 10, 256.0d, 0.0d, "", false, zn.UINT8Z));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("repetitions", 3, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("weight", 4, 132, 16.0d, 0.0d, "kg", false, znVar2));
        bkVar.e(new rc("set_type", 5, 2, 1.0d, 0.0d, "", false, zn.SET_TYPE));
        bkVar.e(new rc("start_time", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("category", 7, 132, 1.0d, 0.0d, "", false, zn.EXERCISE_CATEGORY));
        bkVar.e(new rc("category_subtype", 8, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("weight_display_unit", 9, 132, 1.0d, 0.0d, "", false, zn.FIT_BASE_UNIT));
        zn znVar3 = zn.MESSAGE_INDEX;
        bkVar.e(new rc("message_index", 10, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("wkt_step_index", 11, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("start_stress", 12, 132, 100.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("end_stress", 13, 132, 100.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("active_set_index", 14, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ks() {
        super(wb.b(225));
    }

    public ks(bk bkVar) {
        super(bkVar);
    }
}
