package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes3.dex */
class k implements n {

    @NonNull
    private final File a;

    @NonNull
    private final String b;

    @NonNull
    private final String c;

    public k(@NonNull String str, @NonNull String str2, @NonNull File file) {
        this.b = str;
        this.c = str2;
        this.a = file;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    private byte[] c() {
        byte[] bArr = new byte[8192];
        try {
            InputStream stream = getStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (stream == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (stream != null) {
                            stream.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int i = stream.read(bArr);
                            if (i <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                stream.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, i);
                        } catch (Throwable th) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    byteArrayOutputStream.close();
                    throw th4;
                }
            } catch (Throwable th5) {
                if (stream != null) {
                    try {
                        stream.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
            if (stream != null) {
                stream.close();
            }
            throw th5;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.common.n
    @NonNull
    public String a() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.n
    @Nullable
    public CrashlyticsReport.FilesPayload.File b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return CrashlyticsReport.FilesPayload.File.builder().setContents(bArrC).setFilename(this.b).build();
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.n
    @Nullable
    public InputStream getStream() {
        if (this.a.exists() && this.a.isFile()) {
            try {
                return new FileInputStream(this.a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
