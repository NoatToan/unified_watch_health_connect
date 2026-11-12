package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class ghy implements IRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("operType")
    private Integer f35151c;

    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String d;

    @SerializedName("courseBelongType")
    private Integer e;

    private ghy(b bVar) {
        this.d = bVar.f35152a;
        this.f35151c = bVar.f35153b;
        this.e = bVar.d;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.i();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f35153b;
        private Integer d;

        public b e(String str) {
            this.f35152a = str;
            return this;
        }

        public b d(Integer num) {
            this.f35153b = num;
            return this;
        }

        public b c(Integer num) {
            this.d = num;
            return this;
        }

        public ghy e() {
            return new ghy(this);
        }
    }
}
