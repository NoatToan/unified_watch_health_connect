package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class pq extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20406e;

    static {
        bk bkVar = new bk("routing_profile", 71);
        f20406e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("mode", 0, 0, 1.0d, 0.0d, "", false, zn.ROUTING_MODE));
        bkVar.e(new rc("guidance_mode", 1, 0, 1.0d, 0.0d, "", false, zn.GUIDANCE_MODE));
        zn znVar = zn.BOOL;
        bkVar.e(new rc("lock_on_road", 2, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("avoidance", 3, 132, 1.0d, 0.0d, "", false, zn.ROUTING_AVOIDANCE));
        bkVar.e(new rc("recalculate_mode", 4, 0, 1.0d, 0.0d, "", false, zn.RECALCULATE_MODE));
        bkVar.e(new rc("course_navigation_enabled", 5, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("turn_guidance_popup", 6, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("course_recalculate_mode", 7, 0, 1.0d, 0.0d, "", false, zn.COURSE_RECALCULATE_MODE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public pq() {
        super(wb.b(71));
    }

    public pq(bk bkVar) {
        super(bkVar);
    }
}
