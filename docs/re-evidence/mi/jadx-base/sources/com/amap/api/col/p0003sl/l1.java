package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import defpackage.bes;
import defpackage.m0t;
import defpackage.m2t;
import defpackage.nls;
import defpackage.p4s;
import defpackage.y5t;
import defpackage.zns;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class l1 implements c1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RandomAccessFile f6191b;
    public y5t c;
    public String d;
    public a e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f6192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f6193b;
        public String c;
        public String d;
        public String e;
        public c f;

        public a(String str, String str2, String str3, String str4) {
            this.f6192a = str;
            this.f6193b = str2;
            this.c = str3;
            this.d = str4 + ".tmp";
            this.e = str4;
        }

        public final String a() {
            return this.f6192a;
        }

        public final void b(c cVar) {
            this.f = cVar;
        }

        public final String c() {
            return this.f6193b;
        }

        public final String d() {
            return this.d;
        }

        public final String e() {
            return this.e;
        }

        public final c f() {
            return this.f;
        }
    }

    public static class b extends l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final a f6194r;

        public b(a aVar) {
            this.f6194r = aVar;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getIPV6URL() {
            return getURL();
        }

        @Override // com.amap.api.col.p0003sl.l, com.amap.api.col.p0003sl.la
        public final Map<String, String> getParams() {
            return null;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final Map<String, String> getRequestHead() {
            return null;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getURL() {
            a aVar = this.f6194r;
            if (aVar != null) {
                return aVar.a();
            }
            return null;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final boolean isSupportIPV6() {
            return false;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f6195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f6196b;

        public c(String str, String str2) {
            this.f6195a = str;
            this.f6196b = str2;
        }

        public final String a() {
            return this.f6195a;
        }

        public final String b() {
            return this.f6196b;
        }

        public final boolean c() {
            return (TextUtils.isEmpty(this.f6195a) || TextUtils.isEmpty(this.f6196b)) ? false : true;
        }
    }

    public static class d extends a {
        public d(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        public final void g(String str, String str2) {
            b(new c(str, str2));
        }
    }

    public l1(Context context, a aVar) {
        this.f6190a = context.getApplicationContext();
        this.e = aVar;
        this.c = new y5t(new b(aVar));
        this.d = aVar.d();
    }

    public final void a() {
        y5t y5tVar;
        if (p4s.f == null || iu.a(p4s.f, zns.t()).f6352a == iu.c.SuccessCode) {
            try {
                if (!b() || (y5tVar = this.c) == null) {
                    return;
                }
                y5tVar.b(this);
            } catch (Throwable th) {
                m2t.r(th, "AuthTaskDownload", "startDownload()");
            }
        }
    }

    public final boolean b() {
        c cVarF = this.e.f();
        return (cVarF != null && cVarF.c() && nls.b(this.f6190a, cVarF.a(), cVarF.b(), "").equalsIgnoreCase(this.e.c())) ? false : true;
    }

    @Override // com.amap.api.col.3sl.c1.a
    public final void onDownload(byte[] bArr, long j) {
        try {
            if (this.f6191b == null) {
                File file = new File(this.d);
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                this.f6191b = new RandomAccessFile(file, "rw");
            }
            this.f6191b.seek(j);
            this.f6191b.write(bArr);
        } catch (Throwable th) {
            m2t.r(th, "AuthTaskDownload", "onDownload()");
        }
    }

    @Override // com.amap.api.col.3sl.c1.a
    public final void onException(Throwable th) {
        try {
            RandomAccessFile randomAccessFile = this.f6191b;
            if (randomAccessFile == null) {
                return;
            }
            randomAccessFile.close();
        } catch (Throwable th2) {
            m2t.r(th2, "AuthTaskDownload", "onException()");
        }
    }

    @Override // com.amap.api.col.3sl.c1.a
    public final void onFinish() {
        try {
            RandomAccessFile randomAccessFile = this.f6191b;
            if (randomAccessFile == null) {
                return;
            }
            try {
                randomAccessFile.close();
            } catch (Throwable th) {
                m2t.r(th, "AuthTaskDownload", "onFinish3");
            }
            String strC = this.e.c();
            String strA = m0t.a(this.d);
            if (strA == null || !strC.equalsIgnoreCase(strA)) {
                try {
                    new File(this.d).delete();
                    return;
                } catch (Throwable th2) {
                    m2t.r(th2, "AuthTaskDownload", "onFinish");
                    return;
                }
            }
            String strE = this.e.e();
            try {
                e eVar = new e();
                File file = new File(this.d);
                eVar.b(file, new File(strE), -1L, bes.b(file), null);
                c cVarF = this.e.f();
                if (cVarF != null && cVarF.c()) {
                    nls.c(this.f6190a, cVarF.a(), cVarF.b(), strA);
                }
                new File(this.d).delete();
                return;
            } catch (Throwable th3) {
                m2t.r(th3, "AuthTaskDownload", "onFinish1");
                return;
            }
            m2t.r(th, "AuthTaskDownload", "onFinish()");
        } catch (Throwable th4) {
            m2t.r(th4, "AuthTaskDownload", "onFinish()");
        }
    }

    @Override // com.amap.api.col.3sl.c1.a
    public final void onStop() {
    }
}
