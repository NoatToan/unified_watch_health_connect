package defpackage;

import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class myq {
    public static int b(byte[] bArr) throws eeu {
        String strE = eeq.e(bArr);
        if (strE == null) {
            ReleaseLogUtil.e("BTSYNC_AlarmData_FitnessUnPackage", "unGetBloodOxygenDownSampleCount tlv info is null");
            return 0;
        }
        return mym.b(new eet().b(strE.substring(4, strE.length())));
    }
}
