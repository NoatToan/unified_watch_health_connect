package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class kg extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20260e;

    static {
        bk bkVar = new bk("hr", 132);
        f20260e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("fractional_timestamp", 0, 132, 32768.0d, 0.0d, "s", false, znVar));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("time256", 1, 2, 256.0d, 0.0d, "s", false, znVar2));
        bkVar.f19753c.get(2).f20459h.add(new vc(0, false, 8, 256.0d, 0.0d));
        bkVar.e(new rc("hr_event_timestamp", 2, 132, 1024.0d, 0.0d, "s", true, znVar));
        zn znVar3 = zn.BYTE;
        bkVar.e(new rc("hr_event_timestamp_12", 3, 13, 1.0d, 0.0d, "", false, znVar3));
        bkVar.f19753c.get(4).f20459h.add(new vc(2, true, 12, 1024.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(2, true, 12, 1024.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(2, true, 12, 1024.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(2, true, 12, 1024.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(2, true, 12, 1024.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(2, true, 12, 1024.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(2, true, 12, 1024.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(2, true, 12, 1024.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(2, true, 12, 1024.0d, 0.0d));
        bkVar.f19753c.get(4).f20459h.add(new vc(2, true, 12, 1024.0d, 0.0d));
        bkVar.e(new rc("status", 4, 2, 1.0d, 0.0d, "", false, zn.HR_STATUS));
        bkVar.e(new rc("confidence", 5, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("filtered_bpm", 6, 2, 1.0d, 0.0d, "bpm", false, znVar2));
        bkVar.e(new rc("pulse_width", 7, 2, 1024.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("beat_count", 8, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("event_timestamp", 9, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1024.0d, 0.0d, "s", true, zn.UINT32));
        bkVar.e(new rc("event_timestamp_12", 10, 13, 1.0d, 0.0d, "", false, znVar3));
        bkVar.f19753c.get(11).f20459h.add(new vc(9, true, 12, 1024.0d, 0.0d));
        bkVar.f19753c.get(11).f20459h.add(new vc(9, true, 12, 1024.0d, 0.0d));
        bkVar.f19753c.get(11).f20459h.add(new vc(9, true, 12, 1024.0d, 0.0d));
        bkVar.f19753c.get(11).f20459h.add(new vc(9, true, 12, 1024.0d, 0.0d));
        bkVar.f19753c.get(11).f20459h.add(new vc(9, true, 12, 1024.0d, 0.0d));
        bkVar.f19753c.get(11).f20459h.add(new vc(9, true, 12, 1024.0d, 0.0d));
        bkVar.f19753c.get(11).f20459h.add(new vc(9, true, 12, 1024.0d, 0.0d));
        bkVar.f19753c.get(11).f20459h.add(new vc(9, true, 12, 1024.0d, 0.0d));
        bkVar.f19753c.get(11).f20459h.add(new vc(9, true, 12, 1024.0d, 0.0d));
        bkVar.f19753c.get(11).f20459h.add(new vc(9, true, 12, 1024.0d, 0.0d));
        bkVar.e(new rc("cadence_masking_status", 11, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar3));
    }

    public kg() {
        super(wb.b(132));
    }

    public kg(bk bkVar) {
        super(bkVar);
    }
}
