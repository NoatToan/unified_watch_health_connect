package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gip implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("operType")
    private Integer f35213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_TYPE)
    private List<Integer> f35214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(IAchieveDBMgr.PARAM_PAGE_SIZE)
    private Integer f35215c;

    @SerializedName("pageStart")
    private Integer d;

    @SerializedName("courseCategory")
    private Integer e;

    private gip(e eVar) {
        this.d = eVar.f35218c;
        this.f35215c = eVar.e;
        this.f35213a = eVar.f35216a;
        this.f35214b = eVar.f35217b;
        this.e = eVar.d;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.x();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f35216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<Integer> f35217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f35218c;
        private Integer d;
        private Integer e;

        public e b(Integer num) {
            this.f35218c = num;
            return this;
        }

        public e d(Integer num) {
            this.e = num;
            return this;
        }

        public e a(Integer num) {
            this.f35216a = num;
            return this;
        }

        public e d(List<Integer> list) {
            this.f35217b = list;
            return this;
        }

        public e c(Integer num) {
            this.d = num;
            return this;
        }

        public gip e() {
            return new gip(this);
        }
    }
}
