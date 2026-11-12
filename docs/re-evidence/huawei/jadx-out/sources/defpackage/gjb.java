package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.basefitnessadvice.model.SearchCondition;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;

/* JADX INFO: loaded from: classes29.dex */
public class gjb implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(WorkoutRecord.Extend.FIT_EXTEND_COURSE_TYPE)
    private int f35252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("workoutRank")
    private Integer f35253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(IAchieveDBMgr.PARAM_PAGE_SIZE)
    private int f35254c;

    @SerializedName("pageNo")
    private int d;

    @SerializedName("searchCondition")
    private SearchCondition e;

    private gjb(e eVar) {
        this.d = eVar.f35255a;
        this.f35254c = eVar.f35257c;
        this.f35252a = eVar.e;
        this.f35253b = eVar.f35256b;
        this.e = eVar.d;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.bc();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f35255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f35256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35257c;
        private SearchCondition d;
        private int e;

        public e e(int i) {
            this.f35255a = i;
            return this;
        }

        public e d(int i) {
            this.f35257c = i;
            return this;
        }

        public e a(int i) {
            this.e = i;
            return this;
        }

        public e c(Integer num) {
            this.f35256b = num;
            return this;
        }

        public e c(SearchCondition searchCondition) {
            this.d = searchCondition;
            return this;
        }

        public gjb d() {
            return new gjb(this);
        }
    }
}
