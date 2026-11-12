package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class loq extends CloudCommonReponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("strategyId")
    private List<String> f40564a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("strategyName")
    private List<String> f40565c;

    @SerializedName("bucketId")
    private List<String> e;

    public List<String> e() {
        return this.f40564a;
    }

    public List<String> c() {
        return this.f40565c;
    }

    public List<String> a() {
        return this.e;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("arr_bucket_id")
        private List<String> f40566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("arr_strategy_id")
        private List<String> f40567b;

        public a(List<String> list, List<String> list2) {
            this.f40567b = list;
            this.f40566a = list2;
        }

        public a(loq loqVar) {
            this.f40567b = loqVar.f40564a;
            this.f40566a = loqVar.e;
        }

        public List<String> b() {
            return this.f40567b;
        }

        public List<String> a() {
            return this.f40566a;
        }

        public String toString() {
            return "AbTestBiInfo{strategyId=" + this.f40567b + ", bucketId=" + this.f40566a + '}';
        }
    }
}
