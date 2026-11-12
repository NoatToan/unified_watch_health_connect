package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class iy extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20224e;

    static {
        bk bkVar = new bk("training_file", 72);
        f20224e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 0, 0, 1.0d, 0.0d, "", false, zn.FILE));
        bkVar.e(new rc("manufacturer", 1, 132, 1.0d, 0.0d, "", false, zn.MANUFACTURER));
        bkVar.e(new rc("product", 2, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.f19753c.get(3).f20460i.add(new pw("favero_product", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(3).f20460i.get(0).b(1, 263L);
        bkVar.f19753c.get(3).f20460i.add(new pw("garmin_product", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(3).f20460i.get(1).b(1, 1L);
        bkVar.f19753c.get(3).f20460i.get(1).b(1, 15L);
        bkVar.f19753c.get(3).f20460i.get(1).b(1, 13L);
        bkVar.f19753c.get(3).f20460i.get(1).b(1, 89L);
        bkVar.e(new rc("serial_number", 3, 140, 1.0d, 0.0d, "", false, zn.UINT32Z));
        bkVar.e(new rc("time_created", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public iy() {
        super(wb.b(72));
    }

    public iy(bk bkVar) {
        super(bkVar);
    }
}
