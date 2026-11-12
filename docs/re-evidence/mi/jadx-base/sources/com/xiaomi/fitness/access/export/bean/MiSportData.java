package com.xiaomi.fitness.access.export.bean;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import com.xiaomi.onetrack.b.g;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class MiSportData {

    public static class AuthListParams {
        public String locale;

        @SerializedName(g.d)
        public String mAppId = "v2N0da410c4d77c4d2fa8b3cd5e4d08ec2b";

        public AuthListParams(String str) {
            this.locale = str;
        }
    }

    public static class DataMigrateParams {

        @SerializedName(g.d)
        public String mAppId = "v2N0da410c4d77c4d2fa8b3cd5e4d08ec2b";

        @SerializedName(ThirdPartAccessConstants.PARAM_AUTH_CODE)
        public String mAuthCode;

        public DataMigrateParams(String str) {
            this.mAuthCode = str;
        }
    }

    public static class DeviceDid {

        @SerializedName("did")
        public String mDid;

        public DeviceDid(String str) {
            this.mDid = str;
        }
    }

    public static class MiSportDataItem {

        @SerializedName("description")
        public String mItemDesc;

        @SerializedName("item")
        public String mItemName;
    }

    public static class MiSportDataList {

        @SerializedName("list")
        public List<MiSportDataItem> dataList;
    }

    public static class MiSportStatus {

        @SerializedName("completion_time")
        public long mCompleteTime;
        public int status;
    }

    public static class MiSportStatusList {

        @SerializedName("list")
        public List<MiSportUpdateStatusItem> dataList;
        public int interval;

        @SerializedName("migrate_status")
        public int status;

        public String toString() {
            return "MiSportStatusList{dataList=" + this.dataList + ", interval=" + this.interval + ", status=" + this.status + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class MiSportUpdateStatusItem {

        @SerializedName("item")
        public String mItemName;
        public int status;

        public String toString() {
            return "MiSportUpdateStatusItem{mItemName='" + this.mItemName + "', status=" + this.status + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class MigrateResponse {

        @SerializedName("ret_code")
        public int retCode;

        public String toString() {
            return "MigrateResponse{retCode=" + this.retCode + AbstractJsonLexerKt.END_OBJ;
        }
    }
}
