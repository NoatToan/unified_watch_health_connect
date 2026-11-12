package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class mm extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20317e;

    static {
        bk bkVar = new bk("omp_raster_layers", 419);
        f20317e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("layer_type", 0, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public mm() {
        super(wb.b(419));
    }

    public mm(bk bkVar) {
        super(bkVar);
    }
}
