package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lyh {
    private int d;
    private List<c> e = new ArrayList(16);

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f41116a;
        private int d;
        private int e;

        public int d() {
            return this.f41116a;
        }

        public void d(int i) {
            this.f41116a = i;
        }

        public int b() {
            return this.e;
        }

        public void b(int i) {
            this.e = i;
        }

        public int c() {
            return this.d;
        }

        public void a(int i) {
            this.d = i;
        }

        public String toString() {
            return "DesFrame{, startTime=" + this.f41116a + ", endTime=" + this.e + ", sportType=" + this.d + '}';
        }
    }

    public List<c> a() {
        return this.e;
    }

    public void c(int i) {
        this.d = i;
    }

    public String toString() {
        return "DesFrame{index=" + this.d + ", datas=" + this.e + '}';
    }
}
