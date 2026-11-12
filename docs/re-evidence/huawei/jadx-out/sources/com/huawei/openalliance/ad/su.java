package com.huawei.openalliance.ad;

import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.db.bean.EventRecord;

/* JADX INFO: loaded from: classes12.dex */
public class su implements qs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EventRecord f20285a;

    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:23:0x009b A[PHI: r5
      0x009b: PHI (r5v5 java.lang.String) = (r5v4 java.lang.String), (r5v0 java.lang.String), (r5v0 java.lang.String) binds: [B:22:0x005b, B:14:0x004f, B:18:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r0 != 6) goto L24;
     */
    @Override // com.huawei.openalliance.ad.qs.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String a(String str) {
        if (TextUtils.isEmpty(str) || this.f20285a == null) {
            hw.a("clickInfoFormatStrategy", "invalid para");
            return str;
        }
        if (!EventType.CLICK.value().equals(this.f20285a.j())) {
            hw.a("clickInfoFormatStrategy", "event type not match click, is %s", this.f20285a.j());
            return str;
        }
        hw.a("clickInfoFormatStrategy", "sld = %s", Integer.valueOf(this.f20285a.af()));
        int iAf = this.f20285a.af();
        if (iAf == 0 || iAf == 1) {
            str = str.replace("__HW_DOWN_X__", String.valueOf(this.f20285a.V())).replace("__HW_DOWN_Y__", String.valueOf(this.f20285a.Y())).replace("__HW_UP_X__", String.valueOf(this.f20285a.ah())).replace("__HW_UP_Y__", String.valueOf(this.f20285a.ai()));
            str = str.replace("__HW_SLD__", String.valueOf(this.f20285a.af()));
        } else if (iAf == 2) {
            str = str.replace("__HW_SLD__", String.valueOf(this.f20285a.af()));
        } else if (iAf == 3) {
            str = str.replace("__HW_DOWN_X__", String.valueOf(this.f20285a.V())).replace("__HW_DOWN_Y__", String.valueOf(this.f20285a.Y())).replace("__HW_UP_X__", String.valueOf(this.f20285a.ah())).replace("__HW_UP_Y__", String.valueOf(this.f20285a.ai()));
            str = str.replace("__HW_SLD__", String.valueOf(this.f20285a.af()));
        } else if (iAf == 5) {
            str = str.replace("__HW_SLD__", String.valueOf(this.f20285a.af()));
        }
        if (this.f20285a.ag() > 0.0f) {
            str = str.replace("__HW_DENSITY__", String.valueOf(this.f20285a.ag()));
        }
        String strZ = this.f20285a.Z();
        if (strZ == null || strZ.trim().length() <= 2) {
            return str;
        }
        String[] strArrSplit = strZ.trim().split("\\*");
        return (strArrSplit.length != 2 || com.huawei.openalliance.ad.utils.dg.a(strArrSplit[0]) == null || com.huawei.openalliance.ad.utils.dg.a(strArrSplit[1]) == null) ? str : str.replace("__HW_W__", com.huawei.openalliance.ad.utils.dg.a(strArrSplit[0]).toString()).replace("__HW_H__", com.huawei.openalliance.ad.utils.dg.a(strArrSplit[1]).toString());
    }

    public su(EventRecord eventRecord) {
        this.f20285a = eventRecord;
    }
}
