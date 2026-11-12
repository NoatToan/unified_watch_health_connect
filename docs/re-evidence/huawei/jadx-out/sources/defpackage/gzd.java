package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;

/* JADX INFO: loaded from: classes8.dex */
public class gzd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("timbre")
    private String f36259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("userDefinedType")
    private int f36260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String f36261c;

    @SerializedName("version")
    private String d;

    private gzd(d dVar) {
        this.f36261c = dVar.e;
        this.d = dVar.f36263c;
        this.f36260b = dVar.f36262b;
        this.f36259a = dVar.d;
    }

    public String d() {
        return this.f36261c;
    }

    public String e() {
        return this.d;
    }

    public int c() {
        return this.f36260b;
    }

    public String b() {
        return this.f36259a;
    }

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f36262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f36263c;
        private String d;
        private String e;

        public d c(String str) {
            this.e = str;
            return this;
        }

        public d d(String str) {
            this.f36263c = str;
            return this;
        }

        public d a(int i) {
            this.f36262b = i;
            return this;
        }

        public d b(String str) {
            this.d = str;
            return this;
        }

        public gzd b() {
            return new gzd(this);
        }
    }
}
