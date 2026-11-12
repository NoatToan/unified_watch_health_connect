package bs2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes11.dex */
public class qy extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20443e;

    static {
        bk bkVar = new bk("training_pages", 14);
        f20443e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.BOOL;
        bkVar.e(new rc("enabled", 1, 0, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("num_zones", 3, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("field_zone", 4, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("field_display", 5, 0, 1.0d, 0.0d, "", false, zn.DISPLAY_FIELD));
        bkVar.e(new rc("name", 6, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("field_display_ext", 7, 132, 1.0d, 0.0d, "", false, zn.DISPLAY_FIELD_EXTENDED));
        bkVar.e(new rc(TtmlNode.TAG_LAYOUT, 8, 0, 1.0d, 0.0d, "", false, zn.TRAINING_PAGE_LAYOUT));
        bkVar.e(new rc("order", 9, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("data_screen_type", 10, 0, 1.0d, 0.0d, "", false, zn.DATA_SCREEN));
        bkVar.e(new rc("visibility_mode", 11, 0, 1.0d, 0.0d, "", false, zn.VISIBILITY_MODE));
        bkVar.e(new rc("hidden", 12, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("training_page_visibility_bits", 13, 10, 1.0d, 0.0d, "", false, zn.TRAINING_PAGE_VISIBILITY_BITS));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public qy() {
        super(wb.b(14));
    }

    public qy(bk bkVar) {
        super(bkVar);
    }
}
