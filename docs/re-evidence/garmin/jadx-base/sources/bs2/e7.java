package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes11.dex */
public class e7 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20074e;

    static {
        bk bkVar = new bk("developer_data_id", MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD);
        f20074e = bkVar;
        zn znVar = zn.BYTE;
        bkVar.e(new rc("developer_id", 0, 13, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("application_id", 1, 13, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("manufacturer_id", 2, 132, 1.0d, 0.0d, "", false, zn.MANUFACTURER));
        bkVar.e(new rc("developer_data_index", 3, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("application_version", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar));
    }

    public e7() {
        super(wb.b(MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD));
    }

    public e7(bk bkVar) {
        super(bkVar);
    }
}
