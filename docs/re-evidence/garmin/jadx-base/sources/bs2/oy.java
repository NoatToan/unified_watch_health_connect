package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class oy extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20390e;

    static {
        bk bkVar = new bk("training_page_field_display_metadata", 463);
        f20390e = bkVar;
        zn znVar = zn.MESSAGE_INDEX;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("parent_index", 0, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("field_display_index", 1, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        zn znVar2 = zn.BYTE;
        bkVar.e(new rc("data", 2, 13, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar2));
    }

    public oy() {
        super(wb.b(463));
    }

    public oy(bk bkVar) {
        super(bkVar);
    }
}
