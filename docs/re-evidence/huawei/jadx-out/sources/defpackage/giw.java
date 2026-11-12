package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;

/* JADX INFO: loaded from: classes29.dex */
public class giw implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("pageStart")
    private Integer f35235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("planSource")
    private Integer f35236b;

    @SerializedName("planCategory")
    private Integer d;

    @SerializedName(IAchieveDBMgr.PARAM_PAGE_SIZE)
    private Integer e;

    private giw(a aVar) {
        this.f35235a = aVar.d;
        this.e = aVar.f35237a;
        this.f35236b = aVar.f35238b;
        this.d = aVar.f35239c;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.ab();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f35237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f35238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f35239c;
        private Integer d;

        public a a(Integer num) {
            this.d = num;
            return this;
        }

        public a e(Integer num) {
            this.f35237a = num;
            return this;
        }

        public a d(Integer num) {
            this.f35238b = num;
            return this;
        }

        public a c(Integer num) {
            this.f35239c = num;
            return this;
        }

        public giw e() {
            return new giw(this);
        }
    }
}
