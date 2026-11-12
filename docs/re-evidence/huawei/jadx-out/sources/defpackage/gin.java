package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;

/* JADX INFO: loaded from: classes29.dex */
public class gin implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("pageNo")
    private Integer f35208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("infoType")
    private Integer f35209b;

    @SerializedName("operType")
    private Integer d;

    @SerializedName(IAchieveDBMgr.PARAM_PAGE_SIZE)
    private Integer e;

    private gin(e eVar) {
        this.f35208a = eVar.f35211b;
        this.e = eVar.f35210a;
        this.d = eVar.d;
        this.f35209b = eVar.e;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.v();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f35210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f35211b;
        private Integer d;
        private Integer e;

        public e d(Integer num) {
            this.f35211b = num;
            return this;
        }

        public e a(Integer num) {
            this.f35210a = num;
            return this;
        }

        public e c(Integer num) {
            this.d = num;
            return this;
        }

        public e b(Integer num) {
            this.e = num;
            return this;
        }

        public gin e() {
            return new gin(this);
        }
    }
}
