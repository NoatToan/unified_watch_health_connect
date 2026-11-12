package com.danikula.videocache.file;

import android.text.TextUtils;
import com.danikula.videocache.ProxyCacheUtils;

/* JADX INFO: loaded from: classes2.dex */
public class Md5FileNameGenerator implements FileNameGenerator {
    private static final int a = 4;

    private String a(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return (iLastIndexOf == -1 || iLastIndexOf <= str.lastIndexOf(47) || (iLastIndexOf + 2) + 4 <= str.length()) ? "" : str.substring(iLastIndexOf + 1, str.length());
    }

    @Override // com.danikula.videocache.file.FileNameGenerator
    public String generate(String str) {
        String strA = a(str);
        String strComputeMD5 = ProxyCacheUtils.computeMD5(str);
        if (TextUtils.isEmpty(strA)) {
            return strComputeMD5;
        }
        return strComputeMD5 + "." + strA;
    }
}
