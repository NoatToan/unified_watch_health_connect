package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class szf extends CloudCommonReponse {

    @SerializedName("sportTypeInfo")
    private e d;

    public szf() {
    }

    public szf(e eVar) {
        this.d = eVar;
    }

    public e c() {
        return this.d;
    }

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        return "SportTabOrderData{" + super.toString() + "mSportTypeInfo='" + this.d + "'}";
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("resourceIdList")
        private List<String> f48825a;

        public e() {
        }

        public e(List<String> list) {
            this.f48825a = list;
        }

        public List<String> b() {
            return this.f48825a;
        }

        public String toString() {
            return "SportTypeInfo{mResourceIds='" + this.f48825a + "'}";
        }
    }
}
