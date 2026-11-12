package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gjk implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_TYPE)
    private Integer f35282a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("lang")
    private String f35283c;

    @SerializedName("topicId")
    private Integer e;

    private gjk(c cVar) {
        this.e = cVar.f35286c;
        this.f35282a = cVar.f35284a;
        this.f35283c = cVar.f35285b;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.aq();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f35284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f35286c;

        public c c(Integer num) {
            this.f35286c = num;
            return this;
        }

        public c a(Integer num) {
            this.f35284a = num;
            return this;
        }

        public c e(String str) {
            this.f35285b = str;
            return this;
        }

        public gjk d() {
            return new gjk(this);
        }
    }
}
