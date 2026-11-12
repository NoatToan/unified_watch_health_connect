package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class dfk {

    @SerializedName("reminderPlans")
    private List<e> d;

    public List<e> a() {
        return this.d;
    }

    public void b(List<e> list) {
        this.d = list;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("endHour")
        private int f31740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("enabled")
        private int f31741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("dataType")
        private int f31742c;

        @SerializedName("createTime")
        private long d;

        @SerializedName("daysOfWeek")
        private int e;

        @SerializedName("startHour")
        private int f;

        @SerializedName("hour")
        private int g;

        @SerializedName("endMinute")
        private int h;

        @SerializedName("minute")
        private int i;

        @SerializedName("remindInterval")
        private int j;

        @SerializedName("updateTime")
        private long l;

        @SerializedName("startMinute")
        private int n;

        public void b(long j) {
            this.d = j;
        }

        public int b() {
            return this.e;
        }

        public void a(int i) {
            this.e = i;
        }

        public int a() {
            return this.f31741b;
        }

        public void e(int i) {
            this.f31741b = i;
        }

        public int c() {
            return this.f31742c;
        }

        public void c(int i) {
            this.f31742c = i;
        }

        public int f() {
            return this.g;
        }

        public void h(int i) {
            this.g = i;
        }

        public int g() {
            return this.i;
        }

        public void f(int i) {
            this.i = i;
        }

        public int j() {
            return this.f;
        }

        public void j(int i) {
            this.f = i;
        }

        public int i() {
            return this.n;
        }

        public void g(int i) {
            this.n = i;
        }

        public int d() {
            return this.f31740a;
        }

        public void b(int i) {
            this.f31740a = i;
        }

        public int e() {
            return this.h;
        }

        public void d(int i) {
            this.h = i;
        }

        public int h() {
            return this.j;
        }

        public void i(int i) {
            this.j = i;
        }

        public void e(long j) {
            this.l = j;
        }

        public String toString() {
            return "ReminderPlan{createTime=" + this.d + ",daysOfWeek=" + this.e + ",enabled=" + this.f31741b + ",dataType=" + this.f31742c + ",hour=" + this.g + ",minute=" + this.i + ",startHour=" + this.f + ",startMinute=" + this.n + ",endHour=" + this.f31740a + ",endMinute=" + this.h + ",remindInterval=" + this.j + ",updateTime=" + this.l + "}";
        }
    }
}
