package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class id extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20213e;

    static {
        bk bkVar = new bk("file_id", 0);
        f20213e = bkVar;
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 0, 0, 1.0d, 0.0d, "", false, zn.FILE));
        bkVar.e(new rc("manufacturer", 1, 132, 1.0d, 0.0d, "", false, zn.MANUFACTURER));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("product", 2, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(2).f20460i.add(new pw("favero_product", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(0).b(1, 263L);
        bkVar.f19753c.get(2).f20460i.add(new pw("garmin_product", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(1).b(1, 1L);
        bkVar.f19753c.get(2).f20460i.get(1).b(1, 15L);
        bkVar.f19753c.get(2).f20460i.get(1).b(1, 13L);
        bkVar.f19753c.get(2).f20460i.get(1).b(1, 89L);
        bkVar.e(new rc("serial_number", 3, 140, 1.0d, 0.0d, "", false, zn.UINT32Z));
        zn znVar2 = zn.DATE_TIME;
        bkVar.e(new rc("time_created", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("number", 5, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("manufacturer_partner", 6, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(6).f20460i.add(new pw("garmin_partner", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(6).f20460i.get(0).b(1, 1L);
        bkVar.f19753c.get(6).f20460i.get(0).b(1, 15L);
        bkVar.f19753c.get(6).f20460i.get(0).b(1, 13L);
        bkVar.e(new rc("original_time_created", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("product_name", 8, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public id() {
        super(wb.b(0));
    }

    public final l6 r() {
        return p(j(4, 65535));
    }

    public id(bk bkVar) {
        super(bkVar);
    }
}
