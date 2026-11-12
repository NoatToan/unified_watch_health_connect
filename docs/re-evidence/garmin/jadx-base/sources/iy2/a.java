package iy2;

import bs2.b7;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liy2/a;", "", "<init>", "()V", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f95840a = new a();

    private a() {
    }

    public static boolean a(String str, String str2) {
        str.getClass();
        str2.getClass();
        FileInputStream fileInputStream = new FileInputStream(new File(str, str2));
        try {
            boolean zB = new b7().b(fileInputStream);
            fileInputStream.close();
            return zB;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(fileInputStream, th3);
                throw th4;
            }
        }
    }

    public static boolean b(File file) throws IOException {
        file.getClass();
        byte[] bArr = new byte[(int) Math.min(8192L, file.length())];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            fileInputStream.read(bArr);
            Unit unit = Unit.INSTANCE;
            fileInputStream.close();
            return gg.b.I(bArr);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(fileInputStream, th3);
                throw th4;
            }
        }
    }
}
