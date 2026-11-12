package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import defpackage.b4n;
import defpackage.nhg;
import defpackage.w68;
import defpackage.y68;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class a extends b4n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Set<String>> f7607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<String> f7608b;
    public final File c;

    public a(Context context) {
        this.f7607a = new HashMap();
        this.f7608b = h("");
        this.c = new File(context.getApplicationInfo().sourceDir);
    }

    private static String[] g(String str, w68 w68Var) throws IOException {
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

    public static Set<String> h(String str) {
        HashSet hashSet = new HashSet();
        String strA = SysUtil.Api14Utils.a();
        if (strA != null) {
            for (String str2 : strA.split(":")) {
                if (str2.contains(str + ".apk!/")) {
                    hashSet.add(str2);
                }
            }
        }
        return hashSet;
    }

    @Override // defpackage.b4n
    public int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.f7603b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        for (String str2 : this.f7608b) {
            Set<String> set = this.f7607a.get(str2);
            if (TextUtils.isEmpty(str2) || set == null || !set.contains(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" not found on ");
                sb.append(str2);
            } else {
                i(str, i, threadPolicy);
                try {
                    i |= 4;
                    SoLoader.f7603b.b(str2 + File.separator + str, i);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(" found on ");
                    sb2.append(str2);
                    return 1;
                } catch (UnsatisfiedLinkError unused) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(" not found on ");
                    sb3.append(str2);
                    sb3.append(" flag: ");
                    sb3.append(i);
                }
            }
        }
        return 0;
    }

    @Override // defpackage.b4n
    public void b(int i) throws IOException {
        int iIndexOf;
        int i2;
        String strSubstring = null;
        for (String str : this.f7608b) {
            if (!TextUtils.isEmpty(str) && (iIndexOf = str.indexOf(33)) >= 0 && (i2 = iIndexOf + 2) < str.length()) {
                strSubstring = str.substring(i2);
            }
            if (!TextUtils.isEmpty(strSubstring)) {
                ZipFile zipFile = new ZipFile(this.c);
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement != null && zipEntryNextElement.getName().startsWith(strSubstring) && zipEntryNextElement.getName().endsWith(".so") && zipEntryNextElement.getMethod() == 0) {
                            e(str, zipEntryNextElement.getName().substring(strSubstring.length() + 1));
                        }
                    }
                    zipFile.close();
                } catch (Throwable th) {
                    try {
                        zipFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.b4n
    public File c(String str) throws IOException {
        throw new UnsupportedOperationException("DirectAPKSoSource doesn't support unpackLibrary");
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        Iterator<String> it = this.f7608b.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(", ");
        }
        sb.append(')');
        return sb.toString();
    }

    public final synchronized void e(String str, String str2) {
        try {
            if (!this.f7607a.containsKey(str)) {
                this.f7607a.put(str, new HashSet());
            }
            this.f7607a.get(str).add(str2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean f(String str) {
        Iterator<Set<String>> it = this.f7607a.values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(str)) {
                return true;
            }
        }
        return false;
    }

    public final void i(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        ZipFile zipFile = new ZipFile(this.c);
        try {
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                if (zipEntryNextElement != null) {
                    if (zipEntryNextElement.getName().endsWith("/" + str)) {
                        y68 y68Var = new y68(zipFile, zipEntryNextElement);
                        try {
                            for (String str2 : g(str, y68Var)) {
                                if (!f(str2) && !str2.startsWith("/")) {
                                    SoLoader.s(str2, i | 1, threadPolicy);
                                }
                            }
                            y68Var.close();
                            break;
                        } catch (Throwable th) {
                            try {
                                y68Var.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }
            }
            zipFile.close();
        } catch (Throwable th3) {
            try {
                zipFile.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.b4n
    public String toString() {
        return getClass().getName() + "[root = " + d() + AbstractJsonLexerKt.END_LIST;
    }

    public a(File file) {
        this.f7607a = new HashMap();
        this.f7608b = h(SysUtil.h(file.getName()));
        this.c = file;
    }
}
