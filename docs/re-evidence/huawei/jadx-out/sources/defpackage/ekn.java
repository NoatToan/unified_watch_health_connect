package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class ekn {
    public static boolean b(ArrayList<String> arrayList) {
        if (arrayList == null) {
            LogUtil.d("DirManager", "dirListExists filePathList is null");
            return false;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
        return true;
    }

    public static String a(String str, String str2) throws IOException {
        String canonicalPath = new File(str2, str).getCanonicalPath();
        if (canonicalPath.startsWith(new File(str2).getCanonicalPath())) {
            return canonicalPath;
        }
        throw new IllegalStateException("File is outside extraction target directory.");
    }

    public static boolean b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(dxc.d);
        sb.append(str);
        sb.append(File.separator);
        sb.append(str);
        return new File(sb.toString()).exists();
    }

    public static boolean c(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() || file.mkdirs();
    }
}
