package bs2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* JADX INFO: loaded from: classes11.dex */
public class lx extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20289e;

    static {
        bk bkVar = new bk("temp_cal_error", 119);
        f20289e = bkVar;
        zn znVar = zn.UINT16;
        bkVar.e(new rc("error_code", 0, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("min_temp", 1, 132, 32.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("max_temp", 2, 132, 32.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("init_temp", 3, 132, 32.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("rise_temp", 4, 132, 32.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("start_temp", 5, 132, 32.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("stop_temp", 6, 132, 32.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(RemoteConfigConstants.ResponseFieldKey.STATE, 7, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public lx() {
        super(wb.b(119));
    }

    public lx(bk bkVar) {
        super(bkVar);
    }
}
