package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class v6 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20613e;

    static {
        bk bkVar = new bk("debug_sample", 46);
        f20613e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("time256", 0, 2, 256.0d, 0.0d, "s", false, znVar));
        bkVar.f19753c.get(1).f20459h.add(new vc(8, false, 8, 256.0d, 0.0d));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("raw", 2, 132, 1.0d, 0.0d, "counts", false, znVar2));
        zn znVar3 = zn.SINT16;
        bkVar.e(new rc("diff", 3, 131, 1.0d, 0.0d, "counts", false, znVar3));
        zn znVar4 = zn.BYTE;
        bkVar.e(new rc("diff_4bit_8s_3ch", 5, 13, 1.0d, 0.0d, "", false, znVar4));
        bkVar.f19753c.get(4).f20459h.add(new vc(2, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(2, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(2, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.e(new rc("diff_8bit_8s_3ch", 6, 13, 1.0d, 0.0d, "", false, znVar4));
        bkVar.f19753c.get(5).f20459h.add(new vc(2, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(2, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(2, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(5).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.e(new rc("diff_13bit_8s_3ch", 7, 13, 1.0d, 0.0d, "", false, znVar4));
        bkVar.f19753c.get(6).f20459h.add(new vc(2, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(2, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(2, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(3, false, 13, 1.0d, 0.0d));
        bkVar.e(new rc("fractional_timestamp", 8, 132, 32768.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("stream_index", 11, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sample_status", 12, 13, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("raw32", 17, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "counts", false, zn.UINT32));
        bkVar.e(new rc("sraw16", 18, 131, 1.0d, 0.0d, "counts", false, znVar3));
        bkVar.e(new rc("sraw32", 19, 133, 1.0d, 0.0d, "counts", false, zn.SINT32));
        bkVar.e(new rc("rawf32", 20, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "counts", false, zn.FLOAT32));
        bkVar.e(new rc("rawd64", 21, 137, 1.0d, 0.0d, "counts", false, zn.FLOAT64));
        bkVar.e(new rc("sample_count", 22, 10, 1.0d, 0.0d, "", false, zn.UINT8Z));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar4));
    }

    public v6() {
        super(wb.b(46));
    }

    public v6(bk bkVar) {
        super(bkVar);
    }
}
