package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class bc extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19747e;

    static {
        bk bkVar = new bk("fbt_lha_internal_instance", 383);
        f19747e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("data_format_version", 0, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("time_current", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("time_id_first_use", 2, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("time_id_last_rolling", 3, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public bc() {
        super(wb.b(383));
    }

    public bc(bk bkVar) {
        super(bkVar);
    }
}
