package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;

/* JADX INFO: loaded from: classes29.dex */
public class gjm implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("pageStart")
    private Integer f35292a;

    @SerializedName(IAchieveDBMgr.PARAM_PAGE_SIZE)
    private Integer d;

    private gjm(c cVar) {
        this.f35292a = cVar.f35293a;
        this.d = cVar.d;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.bb();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f35293a;
        private Integer d;

        public c e(Integer num) {
            this.f35293a = num;
            return this;
        }

        public c b(Integer num) {
            this.d = num;
            return this;
        }

        public gjm c() {
            return new gjm(this);
        }
    }
}
