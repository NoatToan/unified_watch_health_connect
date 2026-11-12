package com.xiaomi.fitness.sport_manager_export.data;

import com.xiaomi.passport.ui.internal.SNSAuthProvider;
import defpackage.z7r;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public class SportResponseData implements Serializable {
    public SportResponseExtraData extraData;
    public final byte[] ids;
    public boolean isNotSport;
    public final int responseCode;
    public int selectVersion;
    public int sentCode;
    public int wearMode;
    public final z7r wearSportStatus;

    public SportResponseData(int i, byte[] bArr, z7r z7rVar) {
        this.responseCode = i;
        this.ids = bArr;
        this.wearSportStatus = z7rVar;
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
        z7r z7rVar;
        return this.responseCode == 2 && (z7rVar = this.wearSportStatus) != null && z7rVar.a();
    }

    public boolean isRequestSuccess() {
        return this.responseCode == 0;
    }

    public void setSentCode(int i) {
        this.sentCode = i;
    }

    public String toString() {
        return "sentCode = " + this.sentCode + ", responseCode = " + this.responseCode + ", responseMsg = " + getResponseCodeMsg() + ", selectVersion = " + this.selectVersion + ", SportResponseExtraData = " + this.extraData;
    }
}
