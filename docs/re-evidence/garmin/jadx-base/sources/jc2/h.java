package jc2;

import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;

/* JADX INFO: loaded from: classes11.dex */
public enum h {
    USER_VISIBLE("user-visible"),
    SILENT("silent"),
    PENDING("pending"),
    UNKNOWN(PrivacyUpdateRequestError.UNKNOWN),
    AUTOMATIC("automatic");

    private String synctype_value;

    h(String str) {
        this.synctype_value = str;
    }

    public String getSyncType() {
        return this.synctype_value;
    }
}
