package com.xiaomi.fitness.sport_eco_manager_export.data;

import com.xiaomi.passport.ui.internal.SNSAuthProvider;
import defpackage.a8r;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public class SportResponseData implements Serializable {
    public final byte[] ids;
    public boolean isNotSport;
    public final int responseCode;
    public int selectVersion;
    public int sentCode;
    public final a8r wearSportStatus;

    public SportResponseData(int i, byte[] bArr, a8r a8rVar) {
        this.responseCode = i;
        this.ids = bArr;
        this.wearSportStatus = a8rVar;
    }

    private String getResponseCodeMsg() {
        int i = this.responseCode;
        if (i == 0) {
            return SNSAuthProvider.VALUE_SNS_OK;
        }
        switch (i) {
            case 2:
                return "busy";
            case 3:
                return "stateNotMatch";
            case 4:
                return "notSupportSport";
            case 5:
                return "NoGpsPermission";
            case 6:
                return "noBackgroundGpsPermission,lackOfAccuracy";
            case 7:
                return "peer device notSupport sportRequest";
            default:
                return "unknown";
        }
    }

    public boolean hasOngoingSport() {
        a8r a8rVar;
        return this.responseCode == 2 && (a8rVar = this.wearSportStatus) != null && a8rVar.a();
    }

    public boolean isRequestSuccess() {
        return this.responseCode == 0;
    }

    public void setSentCode(int i) {
        this.sentCode = i;
    }

    public String toString() {
        return "sentCode = " + this.sentCode + ", responseCode = " + this.responseCode + ", responseMsg = " + getResponseCodeMsg() + ", selectVersion = " + this.selectVersion;
    }
}
