package s;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2944b f155245d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f155246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<String> f155247b;

        public a(String str, List<String> list) {
            this.f155246a = str;
            this.f155247b = Collections.unmodifiableList(list);
        }
    }

    /* JADX INFO: renamed from: s.b$b, reason: collision with other inner class name */
    public static class C2944b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f155248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f155249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<a> f155250c;

        public C2944b(String str, String str2, List<a> list) {
            this.f155248a = str;
            this.f155249b = str2;
            this.f155250c = list;
        }
    }

    public b(String str, String str2, String str3, C2944b c2944b) {
        this.f155242a = str;
        this.f155243b = str2;
        this.f155244c = str3;
        this.f155245d = c2944b;
    }
}
