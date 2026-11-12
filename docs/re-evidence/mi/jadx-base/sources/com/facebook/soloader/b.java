package com.facebook.soloader;

import android.os.StrictMode;
import defpackage.b4n;
import defpackage.nhg;
import defpackage.w68;
import defpackage.x68;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class b extends b4n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f7609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7610b;
    public final List<String> c;

    public b(File file, int i) {
        this(file, i, new String[0]);
    }

    @Override // defpackage.b4n
    public int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return h(str, i, this.f7609a, threadPolicy);
    }

    @Override // defpackage.b4n
    public File c(String str) throws IOException {
        return f(str);
    }

    public w68 d(File file) throws IOException {
        return new x68(file);
    }

    public String[] e(String str, w68 w68Var) throws IOException {
        if (SoLoader.f7602a) {
            Api18TraceUtils.a("SoLoader.getElfDependencies[", str, "]");
        }
        try {
            return nhg.b(str, w68Var);
        } finally {
            if (SoLoader.f7602a) {
                Api18TraceUtils.b();
            }
        }
    }

    public File f(String str) throws IOException {
        File file = new File(this.f7609a, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final void g(String str, w68 w68Var, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        String[] strArrE = e(str, w68Var);
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(str);
        sb.append("'s dependencies: ");
        sb.append(Arrays.toString(strArrE));
        for (String str2 : strArrE) {
            if (!str2.startsWith("/")) {
                SoLoader.s(str2, i | 1, threadPolicy);
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0087 */
    /* JADX WARN: Code duplicated, block: B:26:0x0083 A[Catch: all -> 0x0087, TryCatch #1 {, blocks: (B:26:0x0083, B:31:0x0098, B:34:0x00a4, B:38:0x00b3, B:44:0x00c6, B:29:0x0089, B:24:0x007d), top: B:52:0x007d, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0089 A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #1 {, blocks: (B:26:0x0083, B:31:0x0098, B:34:0x00a4, B:38:0x00b3, B:44:0x00c6, B:29:0x0089, B:24:0x007d), top: B:52:0x007d, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0098 A[Catch: all -> 0x0087, UnsatisfiedLinkError -> 0x00a2, TRY_ENTER, TryCatch #0 {UnsatisfiedLinkError -> 0x00a2, blocks: (B:31:0x0098, B:34:0x00a4), top: B:50:0x0096, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4 A[Catch: all -> 0x0087, UnsatisfiedLinkError -> 0x00a2, TRY_LEAVE, TryCatch #0 {UnsatisfiedLinkError -> 0x00a2, blocks: (B:31:0x0098, B:34:0x00a4), top: B:50:0x0096, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int h(java.lang.String r5, int r6, java.io.File r7, android.os.StrictMode.ThreadPolicy r8) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.b.h(java.lang.String, int, java.io.File, android.os.StrictMode$ThreadPolicy):int");
    }

    @Override // defpackage.b4n
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.f7609a.getCanonicalPath());
        } catch (IOException unused) {
            name = this.f7609a.getName();
        }
        return getClass().getName() + "[root = " + name + " flags = " + this.f7610b + AbstractJsonLexerKt.END_LIST;
    }

    public b(File file, int i, String[] strArr) {
        this.f7609a = file;
        this.f7610b = i;
        this.c = Arrays.asList(strArr);
    }
}
