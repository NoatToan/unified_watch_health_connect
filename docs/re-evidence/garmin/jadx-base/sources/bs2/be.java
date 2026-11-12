package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class be extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19749e;

    static {
        bk bkVar = new bk("glucose_influencer", 63);
        f19749e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 0, 0, 1.0d, 0.0d, "", false, zn.GLUCOSE_INFLUENCER_TYPE));
        bkVar.e(new rc("subtype", 1, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.f19753c.get(2).f20460i.add(new pw("calories_subtype", 0, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(0).b(0, 0L);
        bkVar.f19753c.get(2).f20460i.add(new pw("medication_subtype", 0, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(1).b(0, 1L);
        bkVar.f19753c.get(2).f20460i.add(new pw("health_subtype", 0, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(2).b(0, 2L);
        bkVar.e(new rc("amount", 2, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.f19753c.get(3).f20460i.add(new pw("calories_amount", 132, 1.0d, 0.0d, "kcal"));
        bkVar.f19753c.get(3).f20460i.get(0).b(0, 0L);
        bkVar.f19753c.get(3).f20460i.add(new pw("medication_amount", 132, 1.0d, 0.0d, "units"));
        bkVar.f19753c.get(3).f20460i.get(1).b(0, 1L);
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public be() {
        super(wb.b(63));
    }

    public be(bk bkVar) {
        super(bkVar);
    }
}
