package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class x6 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20665e;

    static {
        bk bkVar = new bk("debug_state", 41);
        f20665e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("time256", 0, 2, 256.0d, 0.0d, "s", false, zn.UINT8));
        bkVar.f19753c.get(1).f20459h.add(new vc(3, false, 8, 256.0d, 0.0d));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("battery_voltage", 1, 132, 1000.0d, 0.0d, "V", false, znVar));
        bkVar.e(new rc("temperature", 2, 131, 100.0d, 0.0d, "C", false, zn.SINT16));
        bkVar.e(new rc("fractional_timestamp", 3, 132, 32768.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("system_flags", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DEBUG_SYSTEM_FLAGS));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public x6() {
        super(wb.b(41));
    }

    public x6(bk bkVar) {
        super(bkVar);
    }
}
