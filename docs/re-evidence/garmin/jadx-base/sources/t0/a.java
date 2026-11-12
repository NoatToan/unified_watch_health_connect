package t0;

import am.j;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f161610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f161611d;

    public static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f161612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f161613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f161614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f161615d;
    }

    private a(String str, String str2, String str3, String str4) {
        this.f161608a = str;
        this.f161609b = str2;
        this.f161610c = str3;
        this.f161611d = str4;
    }

    @Override // t0.e
    public final String a() {
        return this.f161611d;
    }

    @Override // t0.e
    public final String b() {
        return this.f161609b;
    }

    @Override // t0.e
    public final String c() {
        return this.f161610c;
    }

    @Override // t0.e
    public final String d() {
        return this.f161608a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f161608a.equals(eVar.d()) && this.f161609b.equals(eVar.b()) && this.f161610c.equals(eVar.c()) && this.f161611d.equals(eVar.a());
    }

    public final int hashCode() {
        return ((((((this.f161608a.hashCode() ^ 1000003) * 1000003) ^ this.f161609b.hashCode()) * 1000003) ^ this.f161610c.hashCode()) * 1000003) ^ this.f161611d.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb3.append(this.f161608a);
        sb3.append(", eglVersion=");
        sb3.append(this.f161609b);
        sb3.append(", glExtensions=");
        sb3.append(this.f161610c);
        sb3.append(", eglExtensions=");
        return j.o(this.f161611d, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }
}
