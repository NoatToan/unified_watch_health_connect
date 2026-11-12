package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gjc implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("lang")
    private String f35258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("version")
    private String f35259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("operationSchemeId")
    private String f35260c;

    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String d;

    @SerializedName("userDefinedType")
    private Integer e;

    private gjc(d dVar) {
        this.d = dVar.f35261a;
        this.f35258a = dVar.d;
        this.f35259b = dVar.f35263c;
        this.f35260c = dVar.e;
        this.e = dVar.f35262b;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.am();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f35262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f35263c;
        private String d;
        private String e;

        public d c(String str) {
            this.f35261a = str;
            return this;
        }

        public d d(String str) {
            this.d = str;
            return this;
        }

        public d a(String str) {
            this.f35263c = str;
            return this;
        }

        public d b(String str) {
            this.e = str;
            return this;
        }

        public d d(Integer num) {
            this.f35262b = num;
            return this;
        }

        public gjc e() {
            return new gjc(this);
        }
    }
}
