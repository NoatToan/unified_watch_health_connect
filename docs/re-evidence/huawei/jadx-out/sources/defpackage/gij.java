package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;

/* JADX INFO: loaded from: classes29.dex */
public class gij implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("pageStart")
    private Integer f35191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("fuzzyKeyWords")
    private String f35192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("userDefinedType")
    private Integer f35193c;

    @SerializedName(IAchieveDBMgr.PARAM_PAGE_SIZE)
    private Integer d;

    @SerializedName("trainingPoints")
    private Integer e;

    private gij(d dVar) {
        this.f35191a = dVar.f35196c;
        this.d = dVar.f35195b;
        this.e = dVar.d;
        this.f35192b = dVar.e;
        this.f35193c = dVar.f35194a;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.p();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f35194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f35195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f35196c;
        private Integer d;
        private String e;

        public d e(Integer num) {
            this.f35196c = num;
            return this;
        }

        public d d(Integer num) {
            this.f35195b = num;
            return this;
        }

        public d a(Integer num) {
            this.d = num;
            return this;
        }

        public d d(String str) {
            this.e = str;
            return this;
        }

        public d c(Integer num) {
            this.f35194a = num;
            return this;
        }

        public gij e() {
            return new gij(this);
        }
    }
}
