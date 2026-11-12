package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class bu extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19761e;

    static {
        bk bkVar = new bk("software_image", 278);
        f19761e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("version", 0, 132, 100.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("part_number", 1, 132, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("dash_number", 2, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("antfs_index", 3, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("hwm_rgn", 4, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("byte_update_rate", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "bytes/sec", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public bu() {
        super(wb.b(278));
    }

    public bu(bk bkVar) {
        super(bkVar);
    }
}
