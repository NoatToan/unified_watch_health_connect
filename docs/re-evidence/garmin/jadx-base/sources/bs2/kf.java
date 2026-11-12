package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class kf extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20259e;

    static {
        bk bkVar = new bk("graph_data_point", 100);
        f20259e = bkVar;
        bkVar.e(new rc("series_index", 0, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        zn znVar = zn.SINT8;
        bkVar.e(new rc("x_sint8", 1, 1, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.SINT16;
        bkVar.e(new rc("x_sint16", 2, 131, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.SINT32;
        bkVar.e(new rc("x_sint32", 3, 133, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("x_sint8_width", 4, 1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("x_sint16_width", 5, 131, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("x_sint32_width", 6, 133, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("y_sint8", 7, 1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("y_sint16", 8, 131, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("y_sint32", 9, 133, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public kf() {
        super(wb.b(100));
    }

    public kf(bk bkVar) {
        super(bkVar);
    }
}
