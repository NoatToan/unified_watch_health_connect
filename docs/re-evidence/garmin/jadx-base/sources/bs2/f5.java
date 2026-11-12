package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;

/* JADX INFO: loaded from: classes11.dex */
public class f5 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20114e;

    static {
        bk bkVar = new bk("challenge_participant", 271);
        f20114e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("unit_id", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("name", 1, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("data", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(ModelSourceWrapper.POSITION, 3, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public f5() {
        super(wb.b(271));
    }

    public f5(bk bkVar) {
        super(bkVar);
    }
}
