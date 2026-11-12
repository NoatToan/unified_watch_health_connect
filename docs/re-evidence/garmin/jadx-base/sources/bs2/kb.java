package bs2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes11.dex */
public class kb extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20257e;

    static {
        bk bkVar = new bk("exd_screen_configuration", 200);
        f20257e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("screen_index", 0, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("field_count", 1, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(TtmlNode.TAG_LAYOUT, 2, 0, 1.0d, 0.0d, "", false, zn.EXD_LAYOUT));
        bkVar.e(new rc("screen_enabled", 3, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public kb() {
        super(wb.b(200));
    }

    public kb(bk bkVar) {
        super(bkVar);
    }
}
