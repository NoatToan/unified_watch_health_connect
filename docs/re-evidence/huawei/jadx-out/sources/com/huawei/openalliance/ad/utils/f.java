package com.huawei.openalliance.ad.utils;

import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class f {
    private static String g(ContentRecord contentRecord) {
        MetaData metaDataI = contentRecord.i();
        return metaDataI == null ? "" : metaDataI.R();
    }

    private static String f(ContentRecord contentRecord) {
        MetaData metaDataI = contentRecord.i();
        return metaDataI == null ? "" : metaDataI.S();
    }

    private static String e(ContentRecord contentRecord) {
        ApkInfo apkInfoS;
        MetaData metaDataI = contentRecord.i();
        return (metaDataI == null || (apkInfoS = metaDataI.s()) == null) ? "" : apkInfoS.Z();
    }

    private static String d(ContentRecord contentRecord) {
        ApkInfo apkInfoS;
        MetaData metaDataI = contentRecord.i();
        return (metaDataI == null || (apkInfoS = metaDataI.s()) == null) ? "" : apkInfoS.ad();
    }

    private static String c(ContentRecord contentRecord) {
        ApkInfo apkInfoS;
        MetaData metaDataI = contentRecord.i();
        return (metaDataI == null || (apkInfoS = metaDataI.s()) == null) ? "" : apkInfoS.a();
    }

    private static String b(ContentRecord contentRecord) {
        MetaData metaDataI = contentRecord.i();
        return metaDataI == null ? "" : metaDataI.h();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    public static List<String> a(ContentRecord contentRecord) {
        String strB;
        String strI;
        if (contentRecord == null) {
            return new ArrayList();
        }
        int iD = contentRecord.D();
        ArrayList arrayList = new ArrayList();
        if (iD != 1) {
            if (iD == 2) {
                strI = c(contentRecord);
                arrayList.add(strI);
            } else {
                if (iD == 3) {
                    arrayList.add(c(contentRecord));
                    arrayList.add(d(contentRecord));
                    arrayList.add(contentRecord.I());
                    strI = b(contentRecord);
                } else if (iD == 5 || iD == 7) {
                    strI = c(contentRecord);
                } else if (iD == 8) {
                    strI = e(contentRecord);
                } else if (iD == 10) {
                    strI = f(contentRecord);
                } else if (iD == 11) {
                    arrayList.add(f(contentRecord));
                    strB = g(contentRecord);
                }
                arrayList.add(strI);
            }
            hw.a("AdTargetUtil", "promotionTarget is " + arrayList);
            return arrayList;
        }
        strB = b(contentRecord);
        arrayList.add(strB);
        strI = contentRecord.I();
        arrayList.add(strI);
        hw.a("AdTargetUtil", "promotionTarget is " + arrayList);
        return arrayList;
    }
}
