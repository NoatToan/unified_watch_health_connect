package bs2;

import ch.qos.logback.core.joran.action.Action;

/* JADX INFO: loaded from: classes11.dex */
public class tc extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20574e;

    static {
        bk bkVar = new bk("field_capabilities", 39);
        f20574e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("file", 0, 0, 1.0d, 0.0d, "", false, zn.FILE));
        bkVar.e(new rc("mesg_num", 1, 132, 1.0d, 0.0d, "", false, zn.MESG_NUM));
        bkVar.e(new rc("field_num", 2, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("count", 3, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc(Action.SCOPE_ATTRIBUTE, 4, 10, 1.0d, 0.0d, "", false, zn.FIELD_SCOPE));
        bkVar.e(new rc("applicability", 5, 10, 1.0d, 0.0d, "", false, zn.FIELD_CONFIG_APPLICABILITY));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public tc() {
        super(wb.b(39));
    }

    public tc(bk bkVar) {
        super(bkVar);
    }
}
