package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.CreateFileUtil;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.httpclient.Request;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes34.dex */
public final class n1 implements v1 {
    public static final int ENTRY_METADATA = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15105b = "Cache";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f15106c = "\n";
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 80001320;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.huawei.hms.network.embedded.a f15107a;

    public final class b implements o1 {
        public static final String f = "CacheBodyImpl";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f15108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public com.huawei.hms.network.embedded.a.c f15109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public OutputStream f15110c;
        public OutputStream d;

        /* JADX INFO: renamed from: com.huawei.hms.network.embedded.n1$b$b, reason: collision with other inner class name */
        public class C0162b extends OutputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OutputStream f15112a;

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
                this.f15112a.write(bArr, i, i2);
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr) throws IOException {
                this.f15112a.write(bArr);
            }

            @Override // java.io.OutputStream
            public void write(int i) throws IOException {
                this.f15112a.write(i);
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                this.f15112a.flush();
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f15112a.close();
            }

            public C0162b(OutputStream outputStream) {
                if (outputStream == null) {
                    throw new IllegalArgumentException("outputStream == null");
                }
                this.f15112a = outputStream;
            }
        }

        @Override // com.huawei.hms.network.embedded.o1
        public void write(byte[] bArr) throws IOException {
            OutputStream outputStream = this.d;
            if (outputStream != null) {
                outputStream.write(bArr);
            }
        }

        @Override // com.huawei.hms.network.embedded.o1
        public void close() throws IOException {
            OutputStream outputStream = this.d;
            if (outputStream != null) {
                outputStream.close();
            }
        }

        public class a extends C0162b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n1 f15111c;
            public final /* synthetic */ com.huawei.hms.network.embedded.a.c d;

            @Override // com.huawei.hms.network.embedded.n1.b.C0162b, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                synchronized (n1.this) {
                    if (b.this.f15108a) {
                        return;
                    }
                    b.this.f15108a = true;
                    super.close();
                    this.d.c();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OutputStream outputStream, n1 n1Var, com.huawei.hms.network.embedded.a.c cVar) {
                super(outputStream);
                this.f15111c = n1Var;
                this.d = cVar;
            }
        }

        @Override // com.huawei.hms.network.embedded.o1
        public void abort() {
            synchronized (n1.this) {
                if (this.f15108a) {
                    return;
                }
                this.f15108a = true;
                IoUtils.closeSecure(this.f15110c);
                try {
                    this.f15109b.a();
                } catch (IOException unused) {
                    Logger.w(f, "Terminating the cached file failed !");
                }
            }
        }

        public b(com.huawei.hms.network.embedded.a.c cVar) {
            this.f15109b = cVar;
            try {
                this.f15110c = new FileOutputStream(cVar.a(1));
                this.d = new a(this.f15110c, n1.this, cVar);
            } catch (IOException unused) {
                Logger.w(f, "An exception occurred during the commit.");
                try {
                    cVar.a();
                } catch (IOException unused2) {
                    Logger.w(f, "An exception occurred during the commit, Terminating the cached file failed !");
                }
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f15115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f15116c;
        public final Headers d;
        public final long e;
        public final long f;
        public final String g;

        public r1.c response(Request request, com.huawei.hms.network.embedded.a aVar, com.huawei.hms.network.embedded.a.e eVar) throws IOException {
            String str = this.d.get("Content-Type");
            long jStringToLong = u1.stringToLong(this.d.get("Content-Length"), -1L);
            return new r1.c(this.e, this.f, request, new u0.b().url(this.g).code(this.f15115b).message(this.f15116c).headers(this.d.toMultimap()).body(new h1.g(new f1.b().contentLength(jStringToLong).contentType(str).inputStream(new t1(aVar, this.f15114a, new FileInputStream(eVar.a(1)))).build())).build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(Request request) {
            return this.f15114a.equals(s1.key(request.getUrl()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.huawei.hms.network.embedded.a.c cVar) throws Throwable {
            BufferedWriter bufferedWriter;
            try {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(cVar.a(0)), Charset.forName("UTF-8")));
                try {
                    bufferedWriter.write(this.f15114a + '\n');
                    bufferedWriter.write(this.f15115b + "\n");
                    bufferedWriter.write(this.f15116c + '\n');
                    bufferedWriter.write(this.e + "\n");
                    bufferedWriter.write(this.f + "\n");
                    bufferedWriter.write(this.g + "\n");
                    int size = this.d.size();
                    bufferedWriter.write(size + "\n");
                    for (int i = 0; i < size; i++) {
                        bufferedWriter.write(this.d.name(i) + ":" + this.d.value(i) + '\n');
                    }
                    bufferedWriter.flush();
                    IoUtils.closeSecure((Writer) bufferedWriter);
                } catch (Throwable th) {
                    th = th;
                    IoUtils.closeSecure((Writer) bufferedWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = null;
            }
        }

        public c(File file) throws Throwable {
            Throwable th;
            InputStreamReader inputStreamReader;
            FileInputStream fileInputStream;
            if (file == null) {
                throw new IOException("Cached file is empty");
            }
            BufferedReader bufferedReader = null;
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    inputStreamReader = new InputStreamReader(fileInputStream, Charset.forName("UTF-8"));
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                        try {
                            this.f15114a = bufferedReader2.readLine();
                            this.f15115b = u1.stringToInteger(bufferedReader2.readLine(), -1);
                            this.f15116c = bufferedReader2.readLine();
                            this.e = u1.stringToLong(bufferedReader2.readLine(), -1L);
                            this.f = u1.stringToLong(bufferedReader2.readLine(), -1L);
                            this.g = bufferedReader2.readLine();
                            Headers.Builder builder = new Headers.Builder();
                            int iStringToInteger = u1.stringToInteger(bufferedReader2.readLine(), -1);
                            for (int i = 0; i < iStringToInteger; i++) {
                                String line = bufferedReader2.readLine();
                                if (line != null) {
                                    builder.addLenient(line);
                                }
                            }
                            this.d = builder.build();
                            IoUtils.closeSecure((Reader) bufferedReader2);
                            IoUtils.closeSecure((Reader) inputStreamReader);
                            IoUtils.closeSecure((InputStream) fileInputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            IoUtils.closeSecure((Reader) bufferedReader);
                            IoUtils.closeSecure((Reader) inputStreamReader);
                            IoUtils.closeSecure((InputStream) fileInputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamReader = null;
                }
            } catch (Throwable th5) {
                th = th5;
                inputStreamReader = null;
                fileInputStream = null;
            }
        }

        public c(r1.c cVar) {
            this.f15114a = s1.key(cVar.c().getUrl());
            this.f15115b = cVar.d().getCode();
            this.f15116c = cVar.d().getMessage();
            this.d = Headers.of(cVar.d().getHeaders());
            this.e = cVar.f();
            this.f = cVar.a();
            this.g = cVar.d().getUrl();
        }
    }

    @Override // com.huawei.hms.network.embedded.v1
    public void update(r1.c cVar) throws Throwable {
        com.huawei.hms.network.embedded.a.c cVarA;
        c cVar2 = new c(cVar);
        try {
            com.huawei.hms.network.embedded.a.e eVarC = this.f15107a.c(s1.key(cVar.c().getUrl()));
            if (eVarC == null) {
                return;
            }
            try {
                cVarA = eVarC.a();
                if (cVarA != null) {
                    try {
                        cVar2.a(cVarA);
                        cVarA.c();
                    } catch (IOException unused) {
                        a(cVarA);
                    }
                }
            } catch (IOException unused2) {
                cVarA = null;
            }
        } catch (IOException unused3) {
        }
    }

    @Override // com.huawei.hms.network.embedded.v1
    public void remove(c1 c1Var) {
        if (c1Var == null) {
            return;
        }
        String strKey = s1.key(c1Var.getUrl());
        if (TextUtils.isEmpty(strKey)) {
            return;
        }
        try {
            this.f15107a.d(strKey);
        } catch (IOException unused) {
            Logger.e(f15105b, "remove cached files of the request failed.");
        }
    }

    @Override // com.huawei.hms.network.embedded.v1
    public o1 put(r1.c cVar) throws Throwable {
        com.huawei.hms.network.embedded.a.c cVarB;
        String strKey = s1.key(cVar.c().getUrl());
        if (TextUtils.isEmpty(strKey)) {
            return null;
        }
        c cVar2 = new c(cVar);
        try {
            cVarB = this.f15107a.b(strKey);
            if (cVarB == null) {
                return null;
            }
            try {
                cVar2.a(cVarB);
                return new b(cVarB);
            } catch (IOException unused) {
                a(cVarB);
                return null;
            }
        } catch (IOException unused2) {
            cVarB = null;
        }
    }

    public boolean isInvalid() {
        return this.f15107a == null;
    }

    @Override // com.huawei.hms.network.embedded.v1
    public r1.c get(Request request) {
        String strKey = s1.key(request.getUrl());
        if (TextUtils.isEmpty(strKey)) {
            return null;
        }
        try {
            com.huawei.hms.network.embedded.a.e eVarC = this.f15107a.c(strKey);
            if (eVarC == null) {
                return null;
            }
            c cVar = new c(eVarC.a(0));
            r1.c cVarResponse = cVar.response(request, this.f15107a, eVarC);
            if (cVar.a(request)) {
                return cVarResponse;
            }
            IoUtils.closeSecure(cVarResponse.d().getBody());
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    private void a(com.huawei.hms.network.embedded.a.c cVar) {
        if (cVar != null) {
            try {
                cVar.a();
            } catch (IOException unused) {
                Logger.w(f15105b, "Terminating the cached file failed !");
            }
        }
    }

    public n1(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File fileNewFile = CreateFileUtil.newFile(ContextHolder.getAppContext().getCacheDir().getPath() + File.separator + str);
        try {
            this.f15107a = com.huawei.hms.network.embedded.a.a(fileNewFile.getCanonicalFile(), 80001320, 2, j);
        } catch (IOException unused) {
            CreateFileUtil.deleteSecure(fileNewFile);
            Logger.w(f15105b, "DiskLruCache failed to create.");
            this.f15107a = null;
        }
    }
}
