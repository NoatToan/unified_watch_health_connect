package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mqi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42177c;
    private List<d> d = new ArrayList(16);

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f42178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f42179b;
        private int d;

        public int c() {
            return this.d;
        }

        public void a(int i) {
            this.d = i;
        }

        public int a() {
            return this.f42179b;
        }

        public void c(int i) {
            this.f42179b = i;
        }

        public int d() {
            return this.f42178a;
        }

        public void e(int i) {
            this.f42178a = i;
        }

        public String toString() {
            return "DesFrame{, startTime=" + this.d + ", endTime=" + this.f42179b + ", sportType=" + this.f42178a + '}';
        }
    }

    public List<d> d() {
        return this.d;
    }

    public void e(int i) {
        this.f42177c = i;
    }

    public String toString() {
        return "DesFrame{index=" + this.f42177c + ", datas=" + this.d + '}';
    }
}
