package com.huawei.agconnect.apms;

import android.text.TextUtils;
import com.squareup.okhttp.internal.Version;

/* JADX INFO: loaded from: classes22.dex */
public final class t {
    public static final String cde;
    public int abc;
    public int bcd;

    static {
        String strUserAgent;
        try {
            strUserAgent = Version.userAgent();
        } catch (Throwable unused) {
            strUserAgent = "";
        }
        cde = strUserAgent;
    }

    public t() {
        if (!TextUtils.isEmpty(cde)) {
            bcd();
        } else {
            this.abc = 2;
            this.bcd = 0;
        }
    }

    public static boolean abc() {
        t tVar = new t();
        return tVar.abc == 2 && tVar.bcd >= 7;
    }

    public final void bcd() {
        try {
            String[] strArrSplit = cde.split("/")[1].split("\\.");
            if (strArrSplit.length <= 2) {
                this.abc = 2;
                this.bcd = 0;
            } else {
                this.abc = Integer.parseInt(strArrSplit[0]);
                this.bcd = Integer.parseInt(strArrSplit[1]);
                Integer.parseInt(strArrSplit[2]);
            }
        } catch (Throwable unused) {
            this.abc = 2;
            this.bcd = 0;
        }
    }
}
