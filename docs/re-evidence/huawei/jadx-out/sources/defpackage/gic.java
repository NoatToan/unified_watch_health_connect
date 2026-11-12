package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gic implements IRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String f35168c;

    @SerializedName("workoutPackageId")
    private String d;

    @SerializedName("courseBelongType")
    private int e;

    private gic(a aVar) {
        this.f35168c = aVar.d;
        this.e = aVar.e;
        this.d = aVar.f35169a;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.g();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35169a;
        private String d;
        private int e;

        public a a(String str) {
            this.d = str;
            return this;
        }

        public a d(int i) {
            this.e = i;
            return this;
        }

        public a d(String str) {
            this.f35169a = str;
            return this;
        }

        public gic d() {
            return new gic(this);
        }
    }
}
