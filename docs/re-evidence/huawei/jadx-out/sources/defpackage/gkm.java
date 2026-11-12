package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.basefitnessadvice.model.intplan.AdjustmentExercisePlan;
import com.huawei.basefitnessadvice.model.intplan.DayInfo;
import com.huawei.networkclient.IRequest;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gkm implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("adjustmentExercisePlan")
    private AdjustmentExercisePlan f35399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("category")
    private Integer f35400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("days")
    private List<DayInfo> f35401c;

    @SerializedName("planId")
    private String d;

    @SerializedName("operationType")
    private Integer e;

    @SerializedName("subCategory")
    private Integer h;

    private gkm(a aVar) {
        this.d = aVar.f35403b;
        this.f35400b = aVar.e;
        this.h = aVar.j;
        this.e = aVar.f35404c;
        this.f35401c = aVar.d;
        this.f35399a = aVar.f35402a;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.cd();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AdjustmentExercisePlan f35402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f35404c;
        private List<DayInfo> d;
        private Integer e;
        private Integer j;

        public a e(String str) {
            this.f35403b = str;
            return this;
        }

        public a b(Integer num) {
            this.e = num;
            return this;
        }

        public a d(Integer num) {
            this.j = num;
            return this;
        }

        public a c(Integer num) {
            this.f35404c = num;
            return this;
        }

        public a d(List<DayInfo> list) {
            this.d = list;
            return this;
        }

        public a b(AdjustmentExercisePlan adjustmentExercisePlan) {
            this.f35402a = adjustmentExercisePlan;
            return this;
        }

        public gkm e() {
            return new gkm(this);
        }
    }
}
