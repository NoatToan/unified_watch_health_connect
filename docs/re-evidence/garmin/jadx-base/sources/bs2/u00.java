package bs2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes11.dex */
public class u00 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20589e;

    static {
        bk bkVar = new bk("vector_command", 111);
        f20589e = bkVar;
        bkVar.e(new rc(TtmlNode.ATTR_ID, 0, 0, 1.0d, 0.0d, "", false, zn.VECTOR_COMMAND));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public u00() {
        super(wb.b(111));
    }

    public u00(bk bkVar) {
        super(bkVar);
    }
}
