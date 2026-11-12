package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class t extends bk implements jk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20566e;

    static {
        bk bkVar = new bk("activity", 34);
        f20566e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("total_timer_time", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, zn.UINT32));
        bkVar.e(new rc("num_sessions", 1, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 2, 0, 1.0d, 0.0d, "", false, zn.ACTIVITY));
        bkVar.e(new rc("event", 3, 0, 1.0d, 0.0d, "", false, zn.EVENT));
        bkVar.e(new rc("event_type", 4, 0, 1.0d, 0.0d, "", false, zn.EVENT_TYPE));
        bkVar.e(new rc("local_timestamp", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.LOCAL_DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("event_group", 6, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("perceived_workout_effort", 7, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("name", 8, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("workout_feel", 9, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("workout_rpe", 10, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("server_enhanced", 11, 140, 1.0d, 0.0d, "", false, zn.SERVER_ENHANCED_TYPE));
        bkVar.e(new rc("workout_compliance_score", 12, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public t() {
        super(wb.b(34));
    }

    @Override // bs2.jk
    public final void a(l6 l6Var) {
        n(253, l6Var.a());
    }

    @Override // bs2.jk
    public final Short b() {
        return k(6);
    }

    @Override // bs2.jk
    public final ab c() {
        Short shK = k(3);
        if (shK == null) {
            return null;
        }
        return ab.a(shK);
    }

    @Override // bs2.jk
    public final void d(fb fbVar) {
        n(4, Short.valueOf(fbVar.f20128a));
    }

    @Override // bs2.jk
    public final fb getEventType() {
        Short shK = k(4);
        if (shK == null) {
            return null;
        }
        return fb.a(shK);
    }

    @Override // bs2.jk
    public final l6 getTimestamp() {
        return p(j(253, 65535));
    }

    public t(bk bkVar) {
        super(bkVar);
    }
}
