package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gkq implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("weekNum")
    private Integer f35419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String f35420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("planType")
    private Integer f35421c;

    @SerializedName("planId")
    private String d;

    @SerializedName("dayNum")
    private Integer e;

    private gkq(d dVar) {
        this.f35421c = dVar.f35423b;
        this.d = dVar.e;
        this.f35419a = dVar.f35424c;
        this.e = dVar.f35422a;
        this.f35420b = dVar.d;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.ce();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f35422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f35423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f35424c;
        private String d;
        private String e;

        public d b(Integer num) {
            this.f35423b = num;
            return this;
        }

        public d b(String str) {
            this.e = str;
            return this;
        }

        public d e(Integer num) {
            this.f35424c = num;
            return this;
        }

        public d d(Integer num) {
            this.f35422a = num;
            return this;
        }

        public d c(String str) {
            this.d = str;
            return this;
        }

        public gkq a() {
            return new gkq(this);
        }
    }
}
