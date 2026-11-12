package defpackage;

import cn.hutool.core.io.IORuntimeException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes.dex */
public class fmh {
    public static boolean a(Path path, Path path2) throws IORuntimeException {
        try {
            return Files.isSameFile(path, path2);
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    public static BufferedInputStream b(Path path) throws IORuntimeException {
        try {
            return cid.q(Files.newInputStream(path, new OpenOption[0]));
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    public static Path c(Path path) {
        return d(path, path.getNameCount() - 1);
    }

    public static Path d(Path path, int i) {
        return g(path, i, i == -1 ? path.getNameCount() : i + 1);
    }

    public static BufferedReader e(Path path, Charset charset) throws IORuntimeException {
        return cid.e(b(path), charset);
    }

    public static boolean f(Path path, Path path2) {
        return h(path2).startsWith(h(path));
    }

    public static Path g(Path path, int i, int i2) {
        if (path == null) {
            return null;
        }
        int nameCount = path.getNameCount();
        if (i < 0) {
            i += nameCount;
            if (i < 0) {
                i = 0;
            }
        } else if (i > nameCount) {
            i = nameCount;
        }
        if (i2 >= 0 ? i2 > nameCount : (i2 = i2 + nameCount) < 0) {
            i2 = nameCount;
        }
        if (i2 < i) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        if (i == i2) {
            return null;
        }
        return path.subpath(i, i2);
    }

    public static Path h(Path path) {
        qk1.t(path);
        return path.toAbsolutePath().normalize();
    }
}
