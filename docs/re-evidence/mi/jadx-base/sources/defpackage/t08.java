package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class t08 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qpe f34163a = aqe.f(t08.class);

    public static InputStream a(String str) {
        String property = System.getProperty("edge.resource.update.folder", null);
        if (!q08.a(property)) {
            File file = new File(property + File.separator + str);
            if (file.exists()) {
                try {
                    f34163a.info("load resource[updated]: " + str);
                    return new FileInputStream(file);
                } catch (IOException unused) {
                    f34163a.info("load resource[updated]: FAIL: " + str);
                }
            }
        }
        return t08.class.getClassLoader().getResourceAsStream(str);
    }
}
