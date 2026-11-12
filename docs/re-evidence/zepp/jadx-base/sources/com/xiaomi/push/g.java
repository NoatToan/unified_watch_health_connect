package com.xiaomi.push;

import com.huami.ad.Constants;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
public class g {
    private static final HashMap<String, String> a;

    static {
        HashMap<String, String> map = new HashMap<>();
        a = map;
        map.put("FFD8FF", "jpg");
        map.put("89504E47", "png");
        map.put("47494638", Constants.GIF_PATH);
        map.put("474946", Constants.GIF_PATH);
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
            com.xiaomi.channel.commonutils.logger.b.a(e);
        }
        return jA;
    }
}
