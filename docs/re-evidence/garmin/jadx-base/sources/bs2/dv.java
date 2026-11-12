package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class dv extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20063e;

    static {
        bk bkVar = new bk("spindle_temperature_data", 112);
        f20063e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("bridge", 0, 132, 16.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("accel", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 256.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("vex", 2, 132, 16.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("temperature", 3, 132, 16.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public dv() {
        super(wb.b(112));
    }

    public dv(bk bkVar) {
        super(bkVar);
    }
}
