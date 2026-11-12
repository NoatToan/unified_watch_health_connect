package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gjy implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(CommonUtil.PAGE_TYPE)
    private Integer f35349a;

    private gjy(e eVar) {
        this.f35349a = eVar.f35350c;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.bp();
    }

    public static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f35350c;

        public e b(Integer num) {
            this.f35350c = num;
            return this;
        }

        public gjy a() {
            return new gjy(this);
        }
    }
}
