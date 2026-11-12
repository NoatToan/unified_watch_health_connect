package ke;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a implements ke.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f104524c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104526b;

    /* JADX INFO: renamed from: ke.a$a, reason: collision with other inner class name */
    public static class C1999a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashSet f104527a = new HashSet(Arrays.asList(ke.h.b.f104536a.a()));

        private C1999a() {
        }
    }

    public static class b extends a {
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // ke.a
        public final boolean b() {
            return true;
        }
    }

    public static class c extends a {
        public c(String str, String str2) {
            super(str, str2);
        }

        @Override // ke.a
        public final boolean b() {
            return true;
        }
    }

    public static class d extends a {
        public d(String str, String str2) {
            super(str, str2);
        }

        @Override // ke.a
        public final boolean b() {
            return false;
        }
    }

    public static class e extends a {
        public e(String str, String str2) {
            super(str, str2);
        }

        @Override // ke.a
        public final boolean b() {
            return true;
        }
    }

    public static class f extends a {
        public f(String str, String str2) {
            super(str, str2);
        }

        @Override // ke.a
        public final boolean b() {
            return true;
        }
    }

    public static class g extends a {
        public g(String str, String str2) {
            super(str, str2);
        }

        @Override // ke.a
        public final boolean b() {
            return true;
        }
    }

    public static class h extends a {
        public h(String str, String str2) {
            super(str, str2);
        }

        @Override // ke.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    public static class i extends a {
        public i(String str, String str2) {
            super(str, str2);
        }

        @Override // ke.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public a(String str, String str2) {
        this.f104525a = str;
        this.f104526b = str2;
        f104524c.add(this);
    }

    @Override // ke.b
    public final String a() {
        return this.f104525a;
    }

    public abstract boolean b();

    public boolean c() {
        HashSet hashSet = C1999a.f104527a;
        String str = this.f104526b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(":dev");
        return hashSet.contains(sb3.toString());
    }

    @Override // ke.b
    public final boolean isSupported() {
        return b() || c();
    }
}
