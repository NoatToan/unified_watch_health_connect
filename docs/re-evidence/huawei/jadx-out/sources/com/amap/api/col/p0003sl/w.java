package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements kv.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    a f3298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f3299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RandomAccessFile f3300c;
    private lc d;
    private String e;

    @Override // com.amap.api.col.3sl.kv.a
    public final void onStop() {
    }

    public w(Context context, a aVar) {
        this.f3299b = context.getApplicationContext();
        this.f3298a = aVar;
        this.d = new lc(new b(aVar));
        this.e = aVar.c();
    }

    public final void a() {
        lc lcVar;
        if (ad.f2193a == null || iu.a(ad.f2193a, eb.a()).f2835a == iu.c.SuccessCode) {
            try {
                if (!b() || (lcVar = this.d) == null) {
                    return;
                }
                lcVar.a(this);
            } catch (Throwable th) {
                jv.c(th, "AuthTaskDownload", "startDownload()");
            }
        }
    }

    private boolean b() {
        c cVarE = this.f3298a.e();
        return (cVarE != null && cVarE.c() && dr.a(this.f3299b, cVarE.a(), cVarE.b(), "").equalsIgnoreCase(this.f3298a.b())) ? false : true;
    }

    @Override // com.amap.api.col.3sl.kv.a
    public final void onDownload(byte[] bArr, long j) {
        try {
            if (this.f3300c == null) {
                File file = new File(this.e);
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                this.f3300c = new RandomAccessFile(file, "rw");
            }
            this.f3300c.seek(j);
            this.f3300c.write(bArr);
        } catch (Throwable th) {
            jv.c(th, "AuthTaskDownload", "onDownload()");
        }
    }

    @Override // com.amap.api.col.3sl.kv.a
    public final void onFinish() {
        try {
            RandomAccessFile randomAccessFile = this.f3300c;
            if (randomAccessFile == null) {
                return;
            }
            try {
                randomAccessFile.close();
            } catch (Throwable th) {
                jv.c(th, "AuthTaskDownload", "onFinish3");
            }
            String strB = this.f3298a.b();
            String strA = it.a(this.e);
            if (strA != null && strB.equalsIgnoreCase(strA)) {
                String strD = this.f3298a.d();
                try {
                    bt btVar = new bt();
                    File file = new File(this.e);
                    btVar.a(file, new File(strD), -1L, bz.a(file), null);
                    c cVarE = this.f3298a.e();
                    if (cVarE != null && cVarE.c()) {
                        dr.a(this.f3299b, cVarE.a(), cVarE.b(), (Object) strA);
                    }
                    new File(this.e).delete();
                    return;
                } catch (Throwable th2) {
                    jv.c(th2, "AuthTaskDownload", "onFinish1");
                    return;
                }
            }
            try {
                new File(this.e).delete();
                return;
            } catch (Throwable th3) {
                jv.c(th3, "AuthTaskDownload", "onFinish");
                return;
            }
            jv.c(th, "AuthTaskDownload", "onFinish()");
        } catch (Throwable th4) {
            jv.c(th4, "AuthTaskDownload", "onFinish()");
        }
    }

    @Override // com.amap.api.col.3sl.kv.a
    public final void onException(Throwable th) {
        try {
            RandomAccessFile randomAccessFile = this.f3300c;
            if (randomAccessFile == null) {
                return;
            }
            randomAccessFile.close();
        } catch (Throwable th2) {
            jv.c(th2, "AuthTaskDownload", "onException()");
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected String f3305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected String f3306b;

        public c(String str, String str2) {
            this.f3305a = str;
            this.f3306b = str2;
        }

        public final String a() {
            return this.f3305a;
        }

        public final String b() {
            return this.f3306b;
        }

        public final boolean c() {
            return (TextUtils.isEmpty(this.f3305a) || TextUtils.isEmpty(this.f3306b)) ? false : true;
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected String f3301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected String f3302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected String f3303c;
        protected String d;
        protected String e;
        protected c f;

        public a(String str, String str2, String str3, String str4) {
            this.f3301a = str;
            this.f3302b = str2;
            this.f3303c = str3;
            this.d = str4 + ".tmp";
            this.e = str4;
        }

        public final String a() {
            return this.f3301a;
        }

        public final String b() {
            return this.f3302b;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.e;
        }

        public final void a(c cVar) {
            this.f = cVar;
        }

        public final c e() {
            return this.f;
        }
    }

    static final class d extends a {
        public d(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        public final void a(String str, String str2) {
            a(new c(str, str2));
        }
    }

    static final class b extends df {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f3304a;

        @Override // com.amap.api.col.p0003sl.df, com.amap.api.col.p0003sl.la
        public final Map<String, String> getParams() {
            return null;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final Map<String, String> getRequestHead() {
            return null;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final boolean isSupportIPV6() {
            return false;
        }

        b(a aVar) {
            this.f3304a = aVar;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getURL() {
            a aVar = this.f3304a;
            if (aVar != null) {
                return aVar.a();
            }
            return null;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getIPV6URL() {
            return getURL();
        }
    }
}
