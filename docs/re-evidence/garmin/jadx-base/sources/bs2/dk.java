package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class dk extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20056e;

    static {
        bk bkVar = new bk("mesg_capabilities", 38);
        f20056e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("file", 0, 0, 1.0d, 0.0d, "", false, zn.FILE));
        bkVar.e(new rc("mesg_num", 1, 132, 1.0d, 0.0d, "", false, zn.MESG_NUM));
        bkVar.e(new rc("count_type", 2, 0, 1.0d, 0.0d, "", false, zn.MESG_COUNT));
        bkVar.e(new rc("count", 3, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.f19753c.get(4).f20460i.add(new pw("num_per_file", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(0).b(2, 0L);
        bkVar.f19753c.get(4).f20460i.add(new pw("max_per_file", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(1).b(2, 1L);
        bkVar.f19753c.get(4).f20460i.add(new pw("max_per_file_type", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(2).b(2, 2L);
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public dk() {
        super(wb.b(38));
    }

    public dk(bk bkVar) {
        super(bkVar);
    }
}
