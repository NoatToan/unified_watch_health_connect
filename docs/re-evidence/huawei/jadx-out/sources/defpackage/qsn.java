package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hihealthservice.db.table.DBSessionCommon;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.operation.utils.CloudParamKeys;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qsn extends CloudCommonReponse {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("globalConfig")
    private b f46747b;

    public b c() {
        return this.f46747b;
    }

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        return "OneClickGrayBean{, mGlobalConfig=" + this.f46747b + '}';
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("grayingConfig")
        private e f46748b;

        public e b() {
            return this.f46748b;
        }

        public String toString() {
            return "GlobalConfig{mGrayConfig=" + this.f46748b + '}';
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("startTime")
        private long f46749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("endTime")
        private long f46750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("pageTypes")
        private List<Integer> f46751c;

        @SerializedName("eventSubject")
        private String d;

        @SerializedName(CloudParamKeys.CLIENT_TYPE)
        private int e;

        @SerializedName(DBSessionCommon.COLUMN_TIME_ZONE)
        private String i;

        public long e() {
            return this.f46749a;
        }

        public long a() {
            return this.f46750b;
        }

        public int d() {
            return this.e;
        }

        public List<Integer> c() {
            return this.f46751c;
        }

        public String toString() {
            return "GrayingConfig{mStartTime=" + this.f46749a + ", mEndTime=" + this.f46750b + ", mClientType=" + this.e + ", mPagesTypeList=" + this.f46751c + ", mEventSubject='" + this.d + "', mTimezone='" + this.i + "'}";
        }
    }
}
