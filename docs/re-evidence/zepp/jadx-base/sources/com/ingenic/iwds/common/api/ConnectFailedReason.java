package com.ingenic.iwds.common.api;

import com.ingenic.iwds.utils.IwdsAssert;

/* JADX INFO: loaded from: classes18.dex */
public class ConnectFailedReason {
    public static final int R_SERVICE_AUTH_FALIED = 2;
    public static final int R_SERVICE_UNAVAILABLE = 1;
    public static final int R_SUCCESS = 0;
    private int a;

    public ConnectFailedReason(int i) {
        this.a = i;
    }

    public int getReasonCode() {
        return this.a;
    }

    public String toString() {
        int i = this.a;
        if (i == 0) {
            return "success";
        }
        if (i == 1) {
            return "service is unavailable";
        }
        if (i == 2) {
            return "service authentication failure";
        }
        IwdsAssert.dieIf((Object) this, true, "Implement me.");
        return "Assert";
    }
}
