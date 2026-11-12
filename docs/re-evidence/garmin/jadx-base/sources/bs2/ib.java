package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class ib extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20212e;

    static {
        bk bkVar = new bk("exd_data_field_configuration", 201);
        f20212e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("screen_index", 0, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.BYTE;
        bkVar.e(new rc("concept_field", 1, 13, 1.0d, 0.0d, "", false, znVar2));
        bkVar.f19753c.get(2).f20459h.add(new vc(2, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(2).f20459h.add(new vc(3, false, 4, 1.0d, 0.0d));
        bkVar.e(new rc("field_id", 2, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("concept_count", 3, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("display_type", 4, 0, 1.0d, 0.0d, "", false, zn.EXD_DISPLAY_TYPE));
        bkVar.e(new rc("title", 5, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar2));
    }

    public ib() {
        super(wb.b(201));
    }

    public ib(bk bkVar) {
        super(bkVar);
    }
}
