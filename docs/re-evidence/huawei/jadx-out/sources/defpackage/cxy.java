package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class cxy extends CloudCommonReponse {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("followUsers")
    private List<Long> f31476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("familyCareRelations")
    private List<e> f31477c;

    public List<Long> e() {
        return this.f31476b;
    }

    public List<e> a() {
        return this.f31477c;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("createTime")
        private long f31478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("emergencyName")
        private String f31479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("devId")
        private String f31480c;

        @SerializedName("emergencyPhoneNum")
        private String d;

        @SerializedName("followUser")
        private long e;

        @SerializedName("status")
        private int f;

        @SerializedName("followedUser")
        private long g;

        @SerializedName("locationTime")
        private long i;

        @SerializedName(ParsedFieldTag.TASK_MODIFY_TIME)
        private long j;

        public long b() {
            return this.e;
        }

        public String d() {
            return this.f31479b;
        }

        public String c() {
            return this.d;
        }
    }
}
