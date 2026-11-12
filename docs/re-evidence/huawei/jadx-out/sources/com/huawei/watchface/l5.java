package com.huawei.watchface;

import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import com.huawei.watchface.utils.HwLog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes20.dex */
public abstract class l5 {

    public interface b {
        void a();

        boolean a(String str, byte[] bArr);

        void b();
    }

    public static class c extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f30287b;

        public c(String str) {
            super(str);
        }

        @Override // com.huawei.watchface.l5.b
        public void a() {
        }

        @Override // com.huawei.watchface.l5.b
        public void b() {
            this.f30287b = new HashMap();
        }

        public Map c() {
            return this.f30287b;
        }

        @Override // com.huawei.watchface.l5.b
        public boolean a(String str, byte[] bArr) {
            if (this.f30288a.contains(str)) {
                this.f30287b.put(str, bArr);
            }
            return this.f30287b.size() >= this.f30288a.size();
        }
    }

    public static boolean a(byte[] bArr, b... bVarArr) throws IOException {
        for (b bVar : bVarArr) {
            bVar.b();
        }
        ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(bArr));
        int i = 0;
        boolean z = false;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                if (!nextEntry.isDirectory()) {
                    String name = nextEntry.getName();
                    if (name == null || !name.contains(FeedbackWebConstants.INVALID_FILE_NAME_PRE)) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        a(zipInputStream, byteArrayOutputStream, 0);
                        i++;
                        if (i > 2048) {
                            HwLog.e("ZipFileUtil", "unzip  entries over than top size");
                        } else {
                            boolean zA = true;
                            for (b bVar2 : bVarArr) {
                                zA &= bVar2.a(name, byteArrayOutputStream.toByteArray());
                            }
                            if (zA) {
                                HwLog.i("ZipFileUtil", "finish zip action earlier");
                            }
                        }
                    } else {
                        HwLog.e("ZipFileUtil", "unzip  fileName is Invalid");
                    }
                    z = true;
                    break;
                }
                z = true;
            } catch (Throwable th) {
                try {
                    zipInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        zipInputStream.close();
        for (b bVar3 : bVarArr) {
            bVar3.a();
        }
        return z;
    }

    public static abstract class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f30288a;

        public d() {
            this.f30288a = new HashSet();
        }

        public d(String str) {
            this();
            this.f30288a.add(str);
        }
    }

    public static class a extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f30285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ByteArrayOutputStream f30286c;
        public ZipOutputStream d;

        public a(String str) {
            super(str);
        }

        @Override // com.huawei.watchface.l5.b
        public void a() {
            try {
                this.d.close();
            } catch (IOException unused) {
                HwLog.e("ZipFileUtil", "DeleteAction finish: ignore Exception");
            }
            this.f30285b = this.f30286c.toByteArray();
        }

        @Override // com.huawei.watchface.l5.b
        public void b() {
            this.f30286c = new ByteArrayOutputStream();
            this.d = new ZipOutputStream(this.f30286c);
        }

        public byte[] c() {
            return this.f30285b;
        }

        @Override // com.huawei.watchface.l5.b
        public boolean a(String str, byte[] bArr) {
            if (this.f30288a.contains(str)) {
                return false;
            }
            try {
                this.d.putNextEntry(new ZipEntry(str));
                this.d.write(bArr);
            } catch (IOException unused) {
                HwLog.e("ZipFileUtil", "DeleteAction accept: ignore Exception");
            }
            return false;
        }
    }

    public static void a(ZipInputStream zipInputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[5120];
        while (true) {
            int i2 = zipInputStream.read(bArr, 0, 5120);
            if (i2 <= 0) {
                return;
            }
            i += i2;
            if (i > 209715200) {
                HwLog.e("ZipFileUtil", "unzip  over than top size");
                return;
            }
            outputStream.write(bArr, 0, i2);
        }
    }
}
