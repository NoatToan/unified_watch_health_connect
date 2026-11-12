package lib.android.paypal.com.magnessdk;

import android.content.Context;
import defpackage.znh;
import defpackage.znp;
import defpackage.zoe;

/* JADX INFO: loaded from: classes46.dex */
public class MagnesSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f40190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f40192c;
    private boolean d;
    private boolean e;
    private String f;
    private zoe g;
    private Environment h;
    private int i;
    private boolean j;

    public static class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f40194b;
        private boolean d;
        private String e;
        private zoe f;
        private String h;
        private int g = MagnesSource.DEFAULT.getVersion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f40193a = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f40195c = false;
        private Environment j = Environment.LIVE;
        private boolean i = false;

        public Builder e(MagnesSource magnesSource) {
            this.g = magnesSource.getVersion();
            return this;
        }

        public Builder b(Environment environment) {
            this.j = environment;
            return this;
        }

        public Builder c(boolean z) {
            this.i = z;
            return this;
        }

        public Builder e(String str) throws znh {
            if (!znp.e(str)) {
                throw new znh(lib.android.paypal.com.magnessdk.c.b.EnumC0334c.APPGUID_EXCEPTION_MESSAGE.toString());
            }
            this.e = str;
            return this;
        }

        public Builder d(boolean z) {
            this.f40195c = z;
            return this;
        }

        public MagnesSettings e() {
            return new MagnesSettings(this);
        }

        public Builder(Context context) {
            this.f40194b = context;
        }
    }

    public boolean i() {
        return this.e;
    }

    public boolean j() {
        return this.f40191b;
    }

    public boolean g() {
        return this.d;
    }

    public boolean f() {
        return this.j;
    }

    public String h() {
        return this.f;
    }

    public int e() {
        return this.i;
    }

    public zoe d() {
        return this.g;
    }

    public Environment c() {
        return this.h;
    }

    public Context a() {
        return this.f40190a;
    }

    public String b() {
        return this.f40192c;
    }

    private MagnesSettings(Builder builder) {
        this.f40191b = false;
        this.d = false;
        this.j = false;
        this.i = builder.g;
        this.f40192c = builder.e;
        this.f = builder.h;
        this.f40191b = builder.f40193a;
        this.d = builder.f40195c;
        this.f40190a = builder.f40194b;
        this.g = builder.f;
        this.e = builder.d;
        this.h = builder.j;
        this.j = builder.i;
    }
}
