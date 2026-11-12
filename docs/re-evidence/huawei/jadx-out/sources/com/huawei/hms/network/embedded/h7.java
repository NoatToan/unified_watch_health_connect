package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class h7 extends u7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o7 f14872c = o7.a("application/x-www-form-urlencoded");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f14873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f14874b;

    @Override // com.huawei.hms.network.embedded.u7
    public void writeTo(cb cbVar) throws IOException {
        a(cbVar, false);
    }

    public String d(int i) {
        return m7.a(b(i), true);
    }

    @Override // com.huawei.hms.network.embedded.u7
    public o7 contentType() {
        return f14872c;
    }

    @Override // com.huawei.hms.network.embedded.u7
    public long contentLength() {
        return a(null, true);
    }

    public String c(int i) {
        return m7.a(a(i), true);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f14875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<String> f14876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Charset f14877c;

        public a b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f14875a.add(m7.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f14877c));
            this.f14876b.add(m7.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f14877c));
            return this;
        }

        public h7 a() {
            return new h7(this.f14875a, this.f14876b);
        }

        public a a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f14875a.add(m7.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f14877c));
            this.f14876b.add(m7.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f14877c));
            return this;
        }

        public a(@Nullable Charset charset) {
            this.f14875a = new ArrayList();
            this.f14876b = new ArrayList();
            this.f14877c = charset;
        }

        public a() {
            this(null);
        }
    }

    public String b(int i) {
        return this.f14874b.get(i);
    }

    public String a(int i) {
        return this.f14873a.get(i);
    }

    public int a() {
        return this.f14873a.size();
    }

    private long a(@Nullable cb cbVar, boolean z) {
        bb bbVar = z ? new bb() : cbVar.a();
        int size = this.f14873a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                bbVar.writeByte(38);
            }
            bbVar.a(this.f14873a.get(i));
            bbVar.writeByte(61);
            bbVar.a(this.f14874b.get(i));
        }
        if (!z) {
            return 0L;
        }
        long jB = bbVar.B();
        bbVar.s();
        return jB;
    }

    public h7(List<String> list, List<String> list2) {
        this.f14873a = f8.a(list);
        this.f14874b = f8.a(list2);
    }
}
