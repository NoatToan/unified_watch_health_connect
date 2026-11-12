package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gjt implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String f35321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("operType")
    private Integer f35322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("workoutPackageId")
    private String f35323c;

    @SerializedName("courseBelongType")
    private Integer d;

    @SerializedName("version")
    private String e;

    private gjt(e eVar) {
        this.f35321a = eVar.f35326c;
        this.f35323c = eVar.d;
        this.d = eVar.f35325b;
        this.e = eVar.e;
        this.f35322b = eVar.f35324a;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.ay();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f35324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f35325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f35326c;
        private String d;
        private String e;

        public e b(String str) {
            this.f35326c = str;
            return this;
        }

        public e a(String str) {
            this.d = str;
            return this;
        }

        public e b(Integer num) {
            this.f35325b = num;
            return this;
        }

        public e e(String str) {
            this.e = str;
            return this;
        }

        public e d(Integer num) {
            this.f35324a = num;
            return this;
        }

        public gjt d() {
            return new gjt(this);
        }
    }
}
