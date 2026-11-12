package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gie implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("userDefinedType")
    private int f35172b;

    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String d;

    private gie(a aVar) {
        this.d = aVar.e;
        this.f35172b = aVar.d;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.cl();
    }

    public static final class a {
        private int d;
        private String e;

        public a c(String str) {
            this.e = str;
            return this;
        }

        public a d(int i) {
            this.d = i;
            return this;
        }

        public gie b() {
            return new gie(this);
        }
    }
}
