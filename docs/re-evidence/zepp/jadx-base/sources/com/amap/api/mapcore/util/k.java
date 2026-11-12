package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements im.a {
    public a a;
    private final Context b;
    private RandomAccessFile c;
    private it d;
    private String e;

    public static class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public c f;

        public a(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4 + ".tmp";
            this.e = str4;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.e;
        }

        public final c e() {
            return this.f;
        }

        public final void a(c cVar) {
            this.f = cVar;
        }
    }

    public static class b extends dq {
        private final a e;

        public b(a aVar) {
            this.e = aVar;
        }

        @Override // com.amap.api.mapcore.util.ir
        public final String getIPV6URL() {
            return getURL();
        }

        @Override // com.amap.api.mapcore.util.dq, com.amap.api.mapcore.util.ir
        public final Map<String, String> getParams() {
            return null;
        }

        @Override // com.amap.api.mapcore.util.ir
        public final Map<String, String> getRequestHead() {
            return null;
        }

        @Override // com.amap.api.mapcore.util.ir
        public final String getURL() {
            a aVar = this.e;
            if (aVar != null) {
                return aVar.a();
            }
            return null;
        }

        @Override // com.amap.api.mapcore.util.ir
        public final boolean isSupportIPV6() {
            return false;
        }
    }

    public static class c {
        public String a;
        public String b;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final boolean c() {
            return (TextUtils.isEmpty(this.a) || TextUtils.isEmpty(this.b)) ? false : true;
        }
    }

    public static class d extends a {
        public d(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        public final void a(String str, String str2) {
            a(new c(str, str2));
        }
    }

    public k(Context context, a aVar) {
        this.b = context.getApplicationContext();
        this.a = aVar;
        this.d = new it(new b(aVar));
        this.e = aVar.c();
    }

    public final void a() {
        it itVar;
        try {
            c cVarE = this.a.e();
            if (!((cVarE != null && cVarE.c() && eh.a(this.b, cVarE.a(), cVarE.b(), "").equalsIgnoreCase(this.a.b())) ? false : true) || (itVar = this.d) == null) {
                return;
            }
            itVar.a(this);
        } catch (Throwable th) {
            hn.c(th, "AuthTaskDownload", "startDownload()");
        }
    }

    @Override // com.amap.api.mapcore.util.im.a
    public final void onDownload(byte[] bArr, long j) {
        try {
            if (this.c == null) {
                File file = new File(this.e);
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                this.c = new RandomAccessFile(file, "rw");
            }
            this.c.seek(j);
            this.c.write(bArr);
        } catch (Throwable th) {
            hn.c(th, "AuthTaskDownload", "onDownload()");
        }
    }

    @Override // com.amap.api.mapcore.util.im.a
    public final void onException(Throwable th) {
        try {
            RandomAccessFile randomAccessFile = this.c;
            if (randomAccessFile == null) {
                return;
            }
            randomAccessFile.close();
        } catch (Throwable th2) {
            hn.c(th2, "AuthTaskDownload", "onException()");
        }
    }

    @Override // com.amap.api.mapcore.util.im.a
    public final void onFinish() {
        try {
            RandomAccessFile randomAccessFile = this.c;
            if (randomAccessFile == null) {
                return;
            }
            try {
                randomAccessFile.close();
            } catch (Throwable th) {
                hn.c(th, "AuthTaskDownload", "onFinish3");
            }
            String strB = this.a.b();
            String strA = gr.a(this.e);
            if (strA == null || !strB.equalsIgnoreCase(strA)) {
                try {
                    new File(this.e).delete();
                    return;
                } catch (Throwable th2) {
                    hn.c(th2, "AuthTaskDownload", "onFinish");
                    return;
                }
            }
            String strD = this.a.d();
            try {
                bp bpVar = new bp();
                File file = new File(this.e);
                bpVar.a(file, new File(strD), -1L, bv.a(file), null);
                c cVarE = this.a.e();
                if (cVarE != null && cVarE.c()) {
                    eh.a(this.b, cVarE.a(), cVarE.b(), (Object) strA);
                }
                new File(this.e).delete();
                return;
            } catch (Throwable th3) {
                hn.c(th3, "AuthTaskDownload", "onFinish1");
                return;
            }
            hn.c(th, "AuthTaskDownload", "onFinish()");
        } catch (Throwable th4) {
            hn.c(th4, "AuthTaskDownload", "onFinish()");
        }
    }

    @Override // com.amap.api.mapcore.util.im.a
    public final void onStop() {
    }
}
