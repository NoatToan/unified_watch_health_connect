package com.huawei.hms.network.embedded;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public abstract class u7 {
    public long contentLength() throws IOException {
        return -1L;
    }

    @Nullable
    public abstract o7 contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(cb cbVar) throws IOException;

    public static u7 create(@Nullable o7 o7Var, byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        f8.a(bArr.length, i, i2);
        return new b(o7Var, i2, bArr, i);
    }

    public class a extends u7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o7 f15443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eb f15444b;

        @Override // com.huawei.hms.network.embedded.u7
        public void writeTo(cb cbVar) throws IOException {
            cbVar.a(this.f15444b);
        }

        @Override // com.huawei.hms.network.embedded.u7
        @Nullable
        public o7 contentType() {
            return this.f15443a;
        }

        @Override // com.huawei.hms.network.embedded.u7
        public long contentLength() throws IOException {
            return this.f15444b.j();
        }

        public a(o7 o7Var, eb ebVar) {
            this.f15443a = o7Var;
            this.f15444b = ebVar;
        }
    }

    public class b extends u7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o7 f15445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f15446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f15447c;
        public final /* synthetic */ int d;

        @Override // com.huawei.hms.network.embedded.u7
        public void writeTo(cb cbVar) throws IOException {
            cbVar.write(this.f15447c, this.d, this.f15446b);
        }

        @Override // com.huawei.hms.network.embedded.u7
        @Nullable
        public o7 contentType() {
            return this.f15445a;
        }

        @Override // com.huawei.hms.network.embedded.u7
        public long contentLength() {
            return this.f15446b;
        }

        public b(o7 o7Var, int i, byte[] bArr, int i2) {
            this.f15445a = o7Var;
            this.f15446b = i;
            this.f15447c = bArr;
            this.d = i2;
        }
    }

    public class c extends u7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o7 f15448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f15449b;

        @Override // com.huawei.hms.network.embedded.u7
        public void writeTo(cb cbVar) throws IOException {
            zb zbVarC = ob.c(this.f15449b);
            try {
                cbVar.a(zbVarC);
                if (zbVarC != null) {
                    zbVarC.close();
                }
            } catch (Throwable th) {
                if (zbVarC != null) {
                    try {
                        zbVarC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // com.huawei.hms.network.embedded.u7
        @Nullable
        public o7 contentType() {
            return this.f15448a;
        }

        @Override // com.huawei.hms.network.embedded.u7
        public long contentLength() {
            return this.f15449b.length();
        }

        public c(o7 o7Var, File file) {
            this.f15448a = o7Var;
            this.f15449b = file;
        }
    }

    public static u7 create(@Nullable o7 o7Var, byte[] bArr) {
        return create(o7Var, bArr, 0, bArr.length);
    }

    public static u7 create(@Nullable o7 o7Var, String str) {
        Charset charsetA = StandardCharsets.UTF_8;
        if (o7Var != null && (charsetA = o7Var.a()) == null) {
            charsetA = StandardCharsets.UTF_8;
            o7Var = o7.b(o7Var + "; charset=utf-8");
        }
        return create(o7Var, str.getBytes(charsetA));
    }

    public static u7 create(@Nullable o7 o7Var, File file) {
        if (file != null) {
            return new c(o7Var, file);
        }
        throw new NullPointerException("file == null");
    }

    public static u7 create(@Nullable o7 o7Var, eb ebVar) {
        return new a(o7Var, ebVar);
    }
}
