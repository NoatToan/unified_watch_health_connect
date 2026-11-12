package defpackage;

import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class uvy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<e> f50621b;
    private long e;

    public long a() {
        return this.e;
    }

    public void a(long j) {
        this.e = j;
    }

    public ArrayList<e> c() {
        return this.f50621b;
    }

    public void b(List<e> list) {
        if (list == null) {
            LogUtil.c("BloodSugarHistoryData", "BloodSugarHistoryData setOneDayList oneDayList is null");
        } else {
            this.f50621b = new ArrayList<>(list);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f50622a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f50623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f50624c;
        private int d;
        private String e;
        private double f;
        private String g;
        private double h;
        private long i;
        private int j;
        private long m;
        private long n;

        public long g() {
            return this.i;
        }

        public void a(long j) {
            this.i = j;
        }

        public long n() {
            return this.n;
        }

        public void d(long j) {
            this.n = j;
        }

        public int d() {
            return this.j;
        }

        public void a(int i) {
            this.j = i;
        }

        public double i() {
            return this.h;
        }

        public void b(double d) {
            this.h = d;
        }

        public int c() {
            return this.f50624c;
        }

        public void b(int i) {
            this.f50624c = i;
        }

        public boolean o() {
            return this.f50622a;
        }

        public void a(boolean z) {
            this.f50622a = z;
        }

        public String a() {
            return this.e;
        }

        public void d(String str) {
            this.e = str;
        }

        public String j() {
            return this.g;
        }

        public void b(String str) {
            this.g = str;
        }

        public int e() {
            return this.d;
        }

        public void e(int i) {
            this.d = i;
        }

        public long f() {
            return this.m;
        }

        public void e(long j) {
            this.m = j;
        }

        public double h() {
            return this.f;
        }

        public boolean b() {
            return this.f50623b;
        }

        public void c(boolean z) {
            this.f50623b = z;
        }
    }
}
