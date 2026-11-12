package defpackage;

import java.io.File;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes46.dex */
public class zqj {
    public static void d(zpy zpyVar, File file) {
        try {
            Path path = file.toPath();
            zqk.a(path, zpyVar.d());
            zqk.d(path, zpyVar.getLastModifiedTime());
        } catch (NoSuchMethodError unused) {
            zqk.c(file, zpyVar.getLastModifiedTime());
        }
    }
}
