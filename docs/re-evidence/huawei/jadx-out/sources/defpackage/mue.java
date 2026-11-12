package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes11.dex */
public class mue {
    private static int d(char c2) {
        if (c2 <= 127) {
            return 1;
        }
        return c2 <= 2047 ? 2 : 3;
    }

    public static boolean c(List<String> list, String str, String str2, int i) {
        LogUtil.a("SportContactFileUtils", "writeContactFiles syncFlag: ", Integer.valueOf(i), ", contactName = " + str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.a("SportContactFileUtils", "invalid parameters: contactPath dir = " + str + ", contactName = " + str2);
            return false;
        }
        try {
            FileOutputStream fileOutputStreamB = b(str + str2, false);
            fileOutputStreamB.write(eeq.g(i));
            if (njy.e(list)) {
                fileOutputStreamB.write(0);
            } else {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    byte[] bArrB = eeq.b(it.next());
                    fileOutputStreamB.write(eeq.h(bArrB.length));
                    fileOutputStreamB.write(bArrB);
                }
            }
            fileOutputStreamB.flush();
            return true;
        } catch (IOException unused) {
            LogUtil.a("SportContactFileUtils", "writeContactFiles IOException");
            return false;
        } catch (IllegalArgumentException unused2) {
            LogUtil.e("SportContactFileUtils", "writeContactFiles IllegalArgumentException: failed to write the file .");
            return false;
        }
    }

    private static FileOutputStream b(String str, boolean z) throws IOException, IllegalArgumentException {
        File file = new File(str);
        if (file.exists() && !z && !file.delete()) {
            LogUtil.a("SportContactFileUtils", "writeToFile: file delete failed.");
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            LogUtil.a("SportContactFileUtils", "writeToFile: failed to create file's parent.");
        }
        return FileUtils.openOutputStream(file, z);
    }

    public static String a(String str, int i) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int iD = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            int i3 = i2 + 1;
            if (i3 < str.length() && Character.isHighSurrogate(cCharAt) && Character.isLowSurrogate(str.charAt(i3))) {
                iD += 4;
                if (iD > i) {
                    break;
                }
                sb.append(cCharAt);
                sb.append(str.charAt(i3));
                i2 = i3;
                i2++;
            } else {
                iD += d(cCharAt);
                if (iD > i) {
                    break;
                }
                sb.append(cCharAt);
                i2++;
            }
        }
        return sb.toString();
    }
}
