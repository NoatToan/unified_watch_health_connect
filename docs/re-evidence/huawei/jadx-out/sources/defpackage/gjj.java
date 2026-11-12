package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.basefitnessadvice.model.SearchCondition;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gjj implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("difficulty")
    private List<Integer> f35276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("fuzzyKeyWords")
    private String f35277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("equipments")
    private List<Integer> f35278c;

    @SerializedName("commodityFlag")
    private Integer d;

    @SerializedName("classList")
    private List<Integer> e;

    @SerializedName("my")
    private Integer f;

    @SerializedName("lang")
    private String g;

    @SerializedName("replacedWorkoutId")
    private String h;

    @SerializedName("searchCondition")
    private SearchCondition i;

    @SerializedName("coachGender")
    private Integer j;

    @SerializedName("secondClassifyId")
    private Integer k;

    @SerializedName("pageStart")
    private Integer l;

    @SerializedName("primaryClassifyId")
    private Integer m;

    @SerializedName("secondClassifyList")
    private List<Integer> n;

    @SerializedName(IAchieveDBMgr.PARAM_PAGE_SIZE)
    private Integer o;

    @SerializedName("supportWear")
    private Integer p;

    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_TYPE)
    private List<Integer> q;

    @SerializedName("workoutRank")
    private Integer r;

    @SerializedName("userDefinedType")
    private Integer s;

    @SerializedName("trainingPoints")
    private List<Integer> t;

    private gjj(e eVar) {
        this.l = eVar.n;
        this.o = eVar.m;
        this.g = eVar.j;
        this.p = eVar.q;
        this.m = eVar.o;
        this.e = eVar.f35280b;
        this.n = eVar.l;
        this.k = eVar.k;
        this.t = eVar.r;
        this.f35276a = eVar.d;
        this.f35278c = eVar.f35281c;
        this.f = eVar.g;
        this.r = eVar.s;
        this.q = eVar.t;
        this.d = eVar.e;
        this.f35277b = eVar.f35279a;
        this.s = eVar.p;
        this.i = eVar.i;
        this.j = eVar.h;
        this.h = eVar.f;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.ao();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<Integer> f35280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<Integer> f35281c;
        private List<Integer> d;
        private Integer e;
        private String f;
        private Integer g;
        private Integer h;
        private SearchCondition i;
        private String j;
        private Integer k;
        private List<Integer> l;
        private Integer m;
        private Integer n;
        private Integer o;
        private Integer p;
        private Integer q;
        private List<Integer> r;
        private Integer s;
        private List<Integer> t;

        public e c(Integer num) {
            this.n = num;
            return this;
        }

        public e e(Integer num) {
            this.m = num;
            return this;
        }

        public e b(String str) {
            this.j = str;
            return this;
        }

        public e i(Integer num) {
            this.q = num;
            return this;
        }

        public e h(Integer num) {
            this.o = num;
            return this;
        }

        public e a(List<Integer> list) {
            this.f35280b = list;
            return this;
        }

        public e d(List<Integer> list) {
            this.l = list;
            return this;
        }

        public e f(Integer num) {
            this.k = num;
            return this;
        }

        public e b(List<Integer> list) {
            this.r = list;
            return this;
        }

        public e e(List<Integer> list) {
            this.d = list;
            return this;
        }

        public e c(List<Integer> list) {
            this.f35281c = list;
            return this;
        }

        public e d(Integer num) {
            this.g = num;
            return this;
        }

        public e j(Integer num) {
            this.s = num;
            return this;
        }

        public e i(List<Integer> list) {
            this.t = list;
            return this;
        }

        public e a(Integer num) {
            this.e = num;
            return this;
        }

        public e a(String str) {
            this.f35279a = str;
            return this;
        }

        public e g(Integer num) {
            this.p = num;
            return this;
        }

        public e b(Integer num) {
            this.h = num;
            return this;
        }

        public e d(SearchCondition searchCondition) {
            this.i = searchCondition;
            return this;
        }

        public e c(String str) {
            this.f = str;
            return this;
        }

        public gjj d() {
            return new gjj(this);
        }
    }
}
