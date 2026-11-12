package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: loaded from: classes5.dex */
public final class xns {
    public static final pbt c = new pbt("PackMetadataManager");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tbs f39296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dos f39297b;

    public xns(tbs tbsVar, dos dosVar) {
        this.f39296a = tbsVar;
        this.f39297b = dosVar;
    }

    public final String a(String str) {
        if (!this.f39296a.f(str)) {
            return "";
        }
        dos dosVar = this.f39297b;
        tbs tbsVar = this.f39296a;
        int iA = dosVar.a();
        File fileW = tbsVar.w(str, iA, tbsVar.q(str));
        try {
            if (!fileW.exists()) {
                return String.valueOf(iA);
            }
            FileInputStream fileInputStream = new FileInputStream(fileW);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                String property = properties.getProperty("moduleVersionTag");
                return property == null ? String.valueOf(iA) : property;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            c.b("Failed to read pack version tag for pack %s", str);
            return "";
        }
    }

    public final void b(String str, int i, long j, String str2) throws IOException {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        File fileW = this.f39296a.w(str, i, j);
        fileW.getParentFile().mkdirs();
        fileW.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(fileW);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
