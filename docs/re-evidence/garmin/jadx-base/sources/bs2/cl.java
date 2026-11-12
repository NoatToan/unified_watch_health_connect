package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class cl extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20037e;

    static {
        bk bkVar = new bk("mtb_settings", 309);
        f20037e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.BOOL;
        bkVar.e(new rc("fork_preview_enabled", 0, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("grit_flow_jump_recording_enabled", 1, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("jump_alerts_enabled", 2, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public cl() {
        super(wb.b(309));
    }

    public cl(bk bkVar) {
        super(bkVar);
    }
}
