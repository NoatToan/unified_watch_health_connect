package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ork {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29628b;
    public final Map<String, List<String>> c;
    public final String d;
    public final String e;
    public long f;

    public ork(a aVar) {
        this.f29627a = aVar.f29630b;
        this.f29628b = aVar.c;
        this.c = aVar.f29629a;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
    }

    public String toString() {
        return "{code:" + this.f29627a + ", body:" + this.f29628b + "}";
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map<String, List<String>> f29629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f29630b;
        public String c;
        public String d;
        public String e;
        public long f;

        public a() {
            this.f = 0L;
        }

        public a a(String str) {
            this.c = str;
            return this;
        }

        public ork b() {
            return new ork(this);
        }

        public a c(int i) {
            this.f29630b = i;
            return this;
        }

        public a d(Map<String, List<String>> map) {
            this.f29629a = map;
            return this;
        }

        public a e(String str) {
            this.e = str;
            return this;
        }

        public a f(String str) {
            this.d = str;
            return this;
        }

        public a g(long j) {
            this.f = j;
            return this;
        }

        public a(ork orkVar) {
            this.f = 0L;
            this.f29630b = orkVar.f29627a;
            this.c = orkVar.f29628b;
            this.f29629a = orkVar.c;
            this.d = orkVar.d;
            this.e = orkVar.e;
            this.f = orkVar.f;
        }
    }
}
