package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class g10 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20150e;

    static {
        bk bkVar = new bk("video_description", 186);
        f20150e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("message_count", 0, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("text", 1, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public g10() {
        super(wb.b(186));
    }

    public g10(bk bkVar) {
        super(bkVar);
    }
}
