package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.plan.model.UserFitnessPlanInfo;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;

/* JADX INFO: loaded from: classes29.dex */
public class ghz implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("excludedDate")
    private String f35154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("difficulty")
    private Integer f35155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("subType")
    private Integer f35156c;

    @SerializedName("movementTimes")
    private Integer d;

    @SerializedName(ParsedFieldTag.BEGIN_DATE)
    private Long e;

    @SerializedName("userFitnessPlanInfo")
    private UserFitnessPlanInfo i;

    @SerializedName("weight")
    private Float j;

    private ghz(a aVar) {
        this.i = aVar.g;
        this.e = aVar.d;
        this.f35156c = aVar.f35158b;
        this.f35155b = aVar.f35159c;
        this.d = aVar.f35157a;
        this.f35154a = aVar.e;
        this.j = aVar.j;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.f();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f35157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f35158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f35159c;
        private Long d;
        private String e;
        private UserFitnessPlanInfo g;
        private Float j;

        public a c(UserFitnessPlanInfo userFitnessPlanInfo) {
            this.g = userFitnessPlanInfo;
            return this;
        }

        public a a(Long l) {
            this.d = l;
            return this;
        }

        public a d(Integer num) {
            this.f35158b = num;
            return this;
        }

        public a c(Integer num) {
            this.f35159c = num;
            return this;
        }

        public a b(Integer num) {
            this.f35157a = num;
            return this;
        }

        public a c(String str) {
            this.e = str;
            return this;
        }

        public a c(Float f) {
            this.j = f;
            return this;
        }

        public ghz a() {
            return new ghz(this);
        }
    }
}
