package defpackage;

import com.xiaomi.fitness.sleep.behavior.AudioFileCacheConfig;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class egt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap<String, String> f16629a;

    static {
        HashMap<String, String> map = new HashMap<>();
        f16629a = map;
        map.put("FFD8FF", "jpg");
        map.put("89504E47", "png");
        map.put("47494638", "gif");
        map.put("474946", "gif");
        map.put("424D", "bmp");
    }

    public static long a(File file) {
        long jA = 0;
        try {
            File[] fileArrListFiles = file.listFiles();
            for (int i = 0; i < fileArrListFiles.length; i++) {
                jA += fileArrListFiles[i].isDirectory() ? a(fileArrListFiles[i]) : fileArrListFiles[i].length();
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Get folder size error: ");
            sb.append(e.getMessage());
        }
        return jA;
    }

    public static boolean b(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.exists()) {
                return (file.isDirectory() ? a(file) : file.length()) < AudioFileCacheConfig.CACHE_MAX_SIZE;
            }
            return true;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Check if internal file can be written error :");
            sb.append(e.getMessage());
            return false;
        }
    }
}
