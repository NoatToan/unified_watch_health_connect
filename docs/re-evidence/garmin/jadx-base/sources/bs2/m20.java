package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes11.dex */
public class m20 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20294e;

    static {
        bk bkVar = new bk("whrm_ant_device_data", MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR);
        f20294e = bkVar;
        bkVar.e(new rc("timestamp", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.UINT32));
        bkVar.e(new rc("data_type", 1, 0, 1.0d, 0.0d, "", false, zn.WHRM_ANT_DEVICE_DATA_TYPE));
        zn znVar = zn.BYTE;
        bkVar.e(new rc("data", 2, 13, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar));
    }

    public m20() {
        super(wb.b(MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR));
    }

    public m20(bk bkVar) {
        super(bkVar);
    }
}
