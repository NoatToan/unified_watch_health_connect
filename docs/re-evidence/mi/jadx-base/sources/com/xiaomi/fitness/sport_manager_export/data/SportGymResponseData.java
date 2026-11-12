package com.xiaomi.fitness.sport_manager_export.data;

import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.passport.ui.internal.SNSAuthProvider;
import defpackage.z7r;

/* JADX INFO: loaded from: classes10.dex */
public class SportGymResponseData extends SportResponseData {
    public final byte[] ids;
    public final int responseCode;
    public int selectVersion;
    public int sentCode;
    public final z7r wearSportStatus;

    public SportGymResponseData(int i, byte[] bArr, z7r z7rVar) {
        super(i, bArr, z7rVar);
        this.responseCode = i;
        this.ids = bArr;
        this.wearSportStatus = z7rVar;
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

    @Override // com.xiaomi.fitness.sport_manager_export.data.SportResponseData
    public boolean hasOngoingSport() {
        z7r z7rVar;
        return this.responseCode == 1 && (z7rVar = this.wearSportStatus) != null && z7rVar.a();
    }

    @Override // com.xiaomi.fitness.sport_manager_export.data.SportResponseData
    public boolean isRequestSuccess() {
        return this.responseCode == 0;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.data.SportResponseData
    public void setSentCode(int i) {
        this.sentCode = i;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.data.SportResponseData
    public String toString() {
        return "sentCode = " + this.sentCode + ", responseCode = " + this.responseCode + ", responseMsg = " + getResponseCodeMsg();
    }
}
