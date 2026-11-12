package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class og extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20379e;

    static {
        bk bkVar = new bk("hrm_data", 47);
        f20379e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("beat_timestamp", 0, 132, 1024.0d, 0.0d, "s", false, znVar));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("beat_count", 1, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("filtered_hr", 2, 2, 1.0d, 0.0d, "bpm", false, znVar2));
        bkVar.e(new rc("previous_beat_timestamp", 3, 132, 1024.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public og() {
        super(wb.b(47));
    }

    public og(bk bkVar) {
        super(bkVar);
    }
}
