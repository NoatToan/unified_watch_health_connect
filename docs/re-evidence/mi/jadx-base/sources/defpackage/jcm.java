package defpackage;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class jcm extends i93 {
    public static final Pattern g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public jcm(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }

    public static jcm e(File file, long j, long j2, k93 k93Var) {
        File file2;
        String strK;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            File fileM = m(file, k93Var);
            if (fileM == null) {
                return null;
            }
            file2 = fileM;
            name = fileM.getName();
        }
        Matcher matcher = i.matcher(name);
        if (!matcher.matches() || (strK = k93Var.k(Integer.parseInt((String) rk1.e(matcher.group(1))))) == null) {
            return null;
        }
        long length = j == -1 ? file2.length() : j;
        if (length == 0) {
            return null;
        }
        return new jcm(strK, Long.parseLong((String) rk1.e(matcher.group(2))), length, j2 == -9223372036854775807L ? Long.parseLong((String) rk1.e(matcher.group(3))) : j2, file2);
    }

    public static jcm h(File file, long j, k93 k93Var) {
        return e(file, j, -9223372036854775807L, k93Var);
    }

    public static jcm i(String str, long j, long j2) {
        return new jcm(str, j, j2, -9223372036854775807L, null);
    }

    public static jcm k(String str, long j) {
        return new jcm(str, j, -1L, -9223372036854775807L, null);
    }

    public static File l(File file, int i2, long j, long j2) {
        StringBuilder sb = new StringBuilder(60);
        sb.append(i2);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        sb.append(j2);
        sb.append(".v3.exo");
        return new File(file, sb.toString());
    }

    public static File m(File file, k93 k93Var) {
        String strW0;
        String name = file.getName();
        Matcher matcher = h.matcher(name);
        if (matcher.matches()) {
            strW0 = wlq.W0((String) rk1.e(matcher.group(1)));
        } else {
            matcher = g.matcher(name);
            strW0 = matcher.matches() ? (String) rk1.e(matcher.group(1)) : null;
        }
        if (strW0 == null) {
            return null;
        }
        File fileL = l((File) rk1.i(file.getParentFile()), k93Var.f(strW0), Long.parseLong((String) rk1.e(matcher.group(2))), Long.parseLong((String) rk1.e(matcher.group(3))));
        if (file.renameTo(fileL)) {
            return fileL;
        }
        return null;
    }

    public jcm d(File file, long j) {
        rk1.g(this.d);
        return new jcm(this.f20897a, this.f20898b, this.c, j, file);
    }
}
