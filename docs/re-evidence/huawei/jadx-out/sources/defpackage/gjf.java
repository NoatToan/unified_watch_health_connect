package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.networkclient.IRequest;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gjf implements IRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_TYPE)
    private List<Integer> f35268c;

    @SerializedName("lang")
    private String d;

    private gjf(b bVar) {
        this.d = bVar.e;
        this.f35268c = bVar.f35269b;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.z();
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<Integer> f35269b;
        private String e;

        public b b(String str) {
            this.e = str;
            return this;
        }

        public b b(List<Integer> list) {
            this.f35269b = list;
            return this;
        }

        public gjf b() {
            return new gjf(this);
        }
    }
}
