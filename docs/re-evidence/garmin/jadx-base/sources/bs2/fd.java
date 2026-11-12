package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class fd extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20130e;

    static {
        bk bkVar = new bk("file_description", TsExtractor.TS_STREAM_TYPE_DTS);
        f20130e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("manufacturer", 0, 132, 1.0d, 0.0d, "", false, zn.MANUFACTURER));
        zn znVar = zn.STRING;
        bkVar.e(new rc("directory", 1, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("name", 2, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("flags", 3, 10, 1.0d, 0.0d, "", false, zn.FILE_FLAGS));
        bkVar.e(new rc("purpose", 4, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.f19753c.get(5).f20460i.add(new pw("garmin_file_purpose", 0, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(5).f20460i.get(0).b(0, 1L);
        bkVar.f19753c.get(5).f20460i.get(0).b(0, 15L);
        bkVar.f19753c.get(5).f20460i.get(0).b(0, 13L);
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public fd() {
        super(wb.b(TsExtractor.TS_STREAM_TYPE_DTS));
    }

    public fd(bk bkVar) {
        super(bkVar);
    }
}
