package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class m7 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20305e;

    static {
        bk bkVar = new bk("device_field_map", 263);
        f20305e = bkVar;
        zn znVar = zn.UINT16;
        bkVar.e(new rc("map_mesg_num", 0, 132, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("field_num", 1, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("device_index", 2, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("developer_index", 3, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public m7() {
        super(wb.b(263));
    }

    public m7(bk bkVar) {
        super(bkVar);
    }
}
