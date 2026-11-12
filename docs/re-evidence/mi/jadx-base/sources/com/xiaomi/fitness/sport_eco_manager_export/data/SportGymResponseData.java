package com.xiaomi.fitness.sport_eco_manager_export.data;

import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.passport.ui.internal.SNSAuthProvider;
import defpackage.a8r;

/* JADX INFO: loaded from: classes10.dex */
public class SportGymResponseData extends SportResponseData {
    public final byte[] ids;
    public final int responseCode;
    public int selectVersion;
    public int sentCode;
    public final a8r wearSportStatus;

    public SportGymResponseData(int i, byte[] bArr, a8r a8rVar) {
        super(i, bArr, a8rVar);
        this.responseCode = i;
        this.ids = bArr;
        this.wearSportStatus = a8rVar;
    }

    private String getResponseCodeMsg() {
        int i = this.responseCode;
        if (i == 0) {
            return SNSAuthProvider.VALUE_SNS_OK;
        }
        if (i == 1) {
            return "busy";
        }
        if (i == 3) {
            return "notSupportSport";
        }
        if (i == 5) {
            return Feature.CHILD_LOCK;
        }
        if (i != 6) {
            return i != 7 ? "unknown" : "device_lock";
        }
        return "safety_lock";
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.data.SportResponseData
    public boolean hasOngoingSport() {
        a8r a8rVar;
        return this.responseCode == 1 && (a8rVar = this.wearSportStatus) != null && a8rVar.a();
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.data.SportResponseData
    public boolean isRequestSuccess() {
        return this.responseCode == 0;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.data.SportResponseData
    public void setSentCode(int i) {
        this.sentCode = i;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.data.SportResponseData
    public String toString() {
        return "sentCode = " + this.sentCode + ", responseCode = " + this.responseCode + ", responseMsg = " + getResponseCodeMsg();
    }
}
