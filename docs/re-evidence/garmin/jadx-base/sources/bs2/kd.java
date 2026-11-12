package bs2;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class kd extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20258e;

    static {
        bk bkVar = new bk("file_import", PsExtractor.PRIVATE_STREAM_1);
        f20258e = bkVar;
        bkVar.e(new rc("import_mode", 0, 0, 1.0d, 0.0d, "", false, zn.FILE_IMPORT_MODE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public kd() {
        super(wb.b(PsExtractor.PRIVATE_STREAM_1));
    }

    public kd(bk bkVar) {
        super(bkVar);
    }
}
