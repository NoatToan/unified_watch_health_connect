package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes11.dex */
public class sf extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20508e;

    static {
        bk bkVar = new bk("gun_profile", 299);
        f20508e = bkVar;
        bkVar.e(new rc("gauge", 0, 0, 1.0d, 0.0d, "", false, zn.GAUGE));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("barrel_length", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "cm", false, znVar));
        bkVar.e(new rc("choke", 2, 0, 1.0d, 0.0d, "", false, zn.CHOKE));
        bkVar.e(new rc("shell_length", 3, 132, 1.0d, 0.0d, "mm", false, zn.UINT16));
        bkVar.e(new rc("shot_size", 4, 0, 1.0d, 0.0d, "", false, zn.SHOT_SIZE));
        bkVar.e(new rc("shot_weight", 5, 0, 1.0d, 0.0d, "", false, zn.SHOT_WEIGHT));
        bkVar.e(new rc("shot_material", 6, 0, 1.0d, 0.0d, "", false, zn.SHOT_MATERIAL));
        zn znVar2 = zn.STRING;
        bkVar.e(new rc("gun_name", 7, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("ammunition_name", 8, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc(TtmlNode.ATTR_ID, 9, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public sf() {
        super(wb.b(299));
    }

    public sf(bk bkVar) {
        super(bkVar);
    }
}
