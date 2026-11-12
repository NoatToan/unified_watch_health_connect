package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class vi extends bk implements jk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20623e;

    static {
        bk bkVar = new bk("length", 101);
        f20623e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("event", 0, 0, 1.0d, 0.0d, "", false, zn.EVENT));
        bkVar.e(new rc("event_type", 1, 0, 1.0d, 0.0d, "", false, zn.EVENT_TYPE));
        bkVar.e(new rc("start_time", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("total_elapsed_time", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("total_timer_time", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar2));
        zn znVar3 = zn.UINT16;
        bkVar.e(new rc("total_strokes", 5, 132, 1.0d, 0.0d, "strokes", false, znVar3));
        bkVar.e(new rc("avg_speed", 6, 132, 1000.0d, 0.0d, "m/s", false, znVar3));
        bkVar.e(new rc("swim_stroke", 7, 0, 1.0d, 0.0d, "swim_stroke", false, zn.SWIM_STROKE));
        zn znVar4 = zn.UINT8;
        bkVar.e(new rc("avg_swimming_cadence", 9, 2, 1.0d, 0.0d, "strokes/min", false, znVar4));
        bkVar.e(new rc("event_group", 10, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("total_calories", 11, 132, 1.0d, 0.0d, "kcal", false, znVar3));
        bkVar.e(new rc("length_type", 12, 0, 1.0d, 0.0d, "", false, zn.LENGTH_TYPE));
        bkVar.e(new rc("reserved_1_jira_478", 13, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("reserved_2_jira_478", 14, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("reserved_3_jira_478", 15, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("reserved_4_jira_478", 16, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("reserved_5_jira_478", 17, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("player_score", 18, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("opponent_score", 19, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("stroke_count", 20, 132, 1.0d, 0.0d, "counts", false, znVar3));
        bkVar.e(new rc("zone_count", 21, 132, 1.0d, 0.0d, "counts", false, znVar3));
        bkVar.e(new rc("enhanced_avg_respiration_rate", 22, 132, 100.0d, 0.0d, "Breaths/min", false, znVar3));
        bkVar.e(new rc("enhanced_max_respiration_rate", 23, 132, 100.0d, 0.0d, "Breaths/min", false, znVar3));
        bkVar.e(new rc("avg_respiration_rate", 24, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.f19753c.get(25).f20459h.add(new vc(22, false, 8, 1.0d, 0.0d));
        bkVar.e(new rc("max_respiration_rate", 25, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.f19753c.get(26).f20459h.add(new vc(23, false, 8, 1.0d, 0.0d));
        bkVar.e(new rc("metabolic_calories", 26, 132, 1.0d, 0.0d, "kcal", false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public vi() {
        super(wb.b(101));
    }

    @Override // bs2.jk
    public final void a(l6 l6Var) {
        n(253, l6Var.a());
    }

    @Override // bs2.jk
    public final Short b() {
        return k(10);
    }

    @Override // bs2.jk
    public final ab c() {
        Short shK = k(0);
        if (shK == null) {
            return null;
        }
        return ab.a(shK);
    }

    @Override // bs2.jk
    public final void d(fb fbVar) {
        n(1, Short.valueOf(fbVar.f20128a));
    }

    @Override // bs2.jk
    public final fb getEventType() {
        Short shK = k(1);
        if (shK == null) {
            return null;
        }
        return fb.a(shK);
    }

    @Override // bs2.jk
    public final l6 getTimestamp() {
        return p(j(253, 65535));
    }

    public vi(bk bkVar) {
        super(bkVar);
    }
}
