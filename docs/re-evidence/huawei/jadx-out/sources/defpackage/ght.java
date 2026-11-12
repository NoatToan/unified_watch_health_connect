package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class ght implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(TypedValues.CycleType.S_WAVE_PERIOD)
    private Integer f35135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("pb")
    private Integer f35136b;

    @SerializedName("pbType")
    private Integer d;

    @SerializedName("planType")
    private Integer e;

    private ght(d dVar) {
        this.d = dVar.f35137a;
        this.f35136b = dVar.f35138b;
        this.e = dVar.f35139c;
        this.f35135a = dVar.e;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.c();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f35137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f35138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f35139c;
        private Integer e;

        public d d(Integer num) {
            this.f35137a = num;
            return this;
        }

        public d e(Integer num) {
            this.f35138b = num;
            return this;
        }

        public d b(Integer num) {
            this.f35139c = num;
            return this;
        }

        public d c(Integer num) {
            this.e = num;
            return this;
        }

        public ght a() {
            return new ght(this);
        }
    }
}
