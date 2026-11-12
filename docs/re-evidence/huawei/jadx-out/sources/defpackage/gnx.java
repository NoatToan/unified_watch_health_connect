package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes29.dex */
public class gnx implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("operType")
    private int f35851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("courseBelongType")
    private int f35852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("workoutPackageId")
    private String f35853c;

    @SerializedName("version")
    private String d;

    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String e;

    private gnx(e eVar) {
        this.e = eVar.f35855b;
        this.f35853c = eVar.f35856c;
        this.f35852b = eVar.d;
        this.d = eVar.f35854a;
        this.f35851a = eVar.e;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl") + "/postBhavior";
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f35856c;
        private int d;
        private int e;

        public e e(String str) {
            this.f35855b = str;
            return this;
        }

        public e c(String str) {
            this.f35856c = str;
            return this;
        }

        public e e(int i) {
            this.d = i;
            return this;
        }

        public e b(int i) {
            this.e = i;
            return this;
        }

        public gnx b() {
            return new gnx(this);
        }
    }
}
