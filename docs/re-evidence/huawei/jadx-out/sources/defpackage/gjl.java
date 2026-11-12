package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gjl implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mediaType")
    private Integer f35287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("operationSchemeId")
    private String f35288b;

    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String d;

    @SerializedName("actionVersion")
    private String e;

    private gjl(d dVar) {
        this.d = dVar.f35291c;
        this.e = dVar.f35289a;
        this.f35288b = dVar.f35290b;
        this.f35287a = dVar.e;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.as();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f35291c;
        private Integer e;

        public d d(String str) {
            this.f35291c = str;
            return this;
        }

        public d e(String str) {
            this.f35289a = str;
            return this;
        }

        public d c(String str) {
            this.f35290b = str;
            return this;
        }

        public d b(Integer num) {
            this.e = num;
            return this;
        }

        public gjl b() {
            return new gjl(this);
        }
    }
}
