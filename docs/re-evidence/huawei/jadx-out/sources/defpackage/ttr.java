package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class ttr extends ttm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("taskList")
    private List<c> f49652a;

    public String i() {
        if (k()) {
            return "";
        }
        return this.f49652a.get(0).a();
    }

    public int j() {
        if (k()) {
            return -1;
        }
        return this.f49652a.get(0).g();
    }

    public int g() {
        if (k()) {
            return -1;
        }
        return this.f49652a.get(0).e();
    }

    public int e() {
        if (k()) {
            return -1;
        }
        return this.f49652a.get(0).c();
    }

    public int h() {
        if (k()) {
            return -1;
        }
        return this.f49652a.get(0).b();
    }

    public int d() {
        if (k()) {
            return -1;
        }
        return this.f49652a.get(0).d();
    }

    public int b() {
        if (k()) {
            return -1;
        }
        return ((a) this.f49652a.get(0).j().get(0)).c();
    }

    public int f() {
        if (k()) {
            return -1;
        }
        return ((a) this.f49652a.get(0).j().get(0)).d();
    }

    public boolean k() {
        return njy.e(this.f49652a) || njy.e(this.f49652a.get(0).j());
    }

    @Override // defpackage.ttm
    public String toString() {
        return "ThreeCircleTaskResponse{resultCode=" + a() + ", resultDesc=" + c() + ", ThreeRingTaskInfo=" + this.f49652a + '}';
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("subscriptionStatus")
        private int f49655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("dayGoalMap")
        private Map<String, Integer> f49656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("taskBeginTime")
        private long f49657c;

        @SerializedName("days")
        private int d;

        @SerializedName("lastAcquirePoints")
        private int e;

        @SerializedName("taskId")
        private String f;

        @SerializedName("taskPoints")
        private int g;

        @SerializedName("taskDays")
        private int h;

        @SerializedName(ParsedFieldTag.TASK_NAME)
        private String i;

        @SerializedName("taskEndTime")
        private long j;

        @SerializedName("taskSubscribeEndTime")
        private long k;

        @SerializedName(ParsedFieldTag.KAKA_TASK_RULE)
        private int m;

        @SerializedName("userPeriodInfos")
        private List<a> n;

        @SerializedName("taskScenarios")
        private int o;

        /* JADX INFO: Access modifiers changed from: private */
        public String a() {
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int g() {
            return this.g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int e() {
            return this.f49655a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int b() {
            return this.h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return this.d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int d() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List<a> j() {
            return this.n;
        }

        public String toString() {
            return " ThreeRingTaskInfo{taskId=" + this.f + ", taskName=" + this.i + ", taskScenarios=" + this.o + "taskRule=" + this.m + ", taskPoints=" + this.g + ", taskBeginTime=" + this.f49657c + ", taskEndTime=" + this.j + ", taskDays=" + this.h + "taskSubscribeEndTime=" + this.k + ", subscriptionStatus=" + this.f49655a + ", days=" + this.d + "dayGoalMap=" + this.f49656b + ", userPeriodInfo=" + this.n + '}';
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("periodTaskStatus")
        private int f49653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("periodTaskPoints")
        private int f49654b;

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return this.f49654b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int d() {
            return this.f49653a;
        }

        public String toString() {
            return "UserPeriodInfo{PeriodTaskPoints=" + this.f49654b + ", periodTaskStatus=" + this.f49653a + '}';
        }
    }
}
