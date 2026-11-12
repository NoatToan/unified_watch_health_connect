package defpackage;

import android.text.TextUtils;
import com.amap.api.col.p0003sl.ik;
import com.smarthome.core.modelconfig.PluginDeviceInfo;

/* JADX INFO: loaded from: classes4.dex */
@c4t(a = PluginDeviceInfo.FMODEL)
public final class o0t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e4t(a = "a1", b = 6)
    public String f28630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e4t(a = "a2", b = 6)
    public String f28631b;

    @e4t(a = "a6", b = 2)
    public int c;

    @e4t(a = "a3", b = 6)
    public String d;

    @e4t(a = "a4", b = 6)
    public String e;

    @e4t(a = "a5", b = 6)
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f28632k;
    public String[] l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f28633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f28634b;
        public String c;
        public String d;
        public boolean e = true;
        public String f = "standard";
        public String[] g = null;

        public a(String str, String str2, String str3) {
            this.f28633a = str2;
            this.f28634b = str2;
            this.d = str3;
            this.c = str;
        }

        public final a a(String str) {
            this.f28634b = str;
            return this;
        }

        public final a b(boolean z) {
            this.e = z;
            return this;
        }

        public final a c(String[] strArr) {
            if (strArr != null) {
                this.g = (String[]) strArr.clone();
            }
            return this;
        }

        public final o0t d() throws ik {
            if (this.g != null) {
                return new o0t(this, (byte) 0);
            }
            throw new ik("sdk packages is null");
        }
    }

    public /* synthetic */ o0t(a aVar, byte b2) {
        this(aVar);
    }

    public static String b(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
                sb.append(";");
            }
            return sb.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String[] d(String str) {
        try {
            return str.split(";");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final String a() {
        if (TextUtils.isEmpty(this.j) && !TextUtils.isEmpty(this.f28630a)) {
            this.j = p0t.t(this.f28630a);
        }
        return this.j;
    }

    public final void c(boolean z) {
        this.c = z ? 1 : 0;
    }

    public final String e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (o0t.class != obj.getClass()) {
            return false;
        }
        try {
            return this.j.equals(((o0t) obj).j) && this.g.equals(((o0t) obj).g) && this.h.equals(((o0t) obj).h);
        } catch (Throwable unused) {
        }
    }

    public final String f() {
        if (TextUtils.isEmpty(this.h) && !TextUtils.isEmpty(this.f28631b)) {
            this.h = p0t.t(this.f28631b);
        }
        return this.h;
    }

    public final String g() {
        if (TextUtils.isEmpty(this.f28632k) && !TextUtils.isEmpty(this.f)) {
            this.f28632k = p0t.t(this.f);
        }
        if (TextUtils.isEmpty(this.f28632k)) {
            this.f28632k = "standard";
        }
        return this.f28632k;
    }

    public final boolean h() {
        return this.c == 1;
    }

    public final String[] i() {
        String[] strArr = this.l;
        if ((strArr == null || strArr.length == 0) && !TextUtils.isEmpty(this.e)) {
            this.l = d(p0t.t(this.e));
        }
        return (String[]) this.l.clone();
    }

    public o0t() {
        this.c = 1;
        this.l = null;
    }

    public o0t(a aVar) {
        this.c = 1;
        this.l = null;
        this.g = aVar.f28633a;
        this.h = aVar.f28634b;
        this.j = aVar.c;
        this.i = aVar.d;
        this.c = aVar.e ? 1 : 0;
        this.f28632k = aVar.f;
        this.l = aVar.g;
        this.f28631b = p0t.p(this.h);
        this.f28630a = p0t.p(this.j);
        this.d = p0t.p(this.i);
        this.e = p0t.p(b(this.l));
        this.f = p0t.p(this.f28632k);
    }
}
