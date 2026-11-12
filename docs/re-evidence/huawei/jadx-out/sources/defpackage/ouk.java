package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class ouk {
    public static boolean a(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str) || context == null) {
            return false;
        }
        try {
            str2 = context.getFilesDir().getCanonicalPath() + File.separator + "achievemedal" + File.separator + str + File.separator;
        } catch (IOException unused) {
            LogUtil.e("PLGACHIEVE_AnimationUtil", "fileIsExist IOException");
            str2 = "";
        }
        LogUtil.d("PLGACHIEVE_AnimationUtil", "path=", str2);
        if ("".equals(str2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder(str2);
        StringBuilder sb2 = new StringBuilder(str2);
        StringBuilder sb3 = new StringBuilder(str2);
        StringBuilder sb4 = new StringBuilder(str2);
        sb.append("texture.jpg");
        if (!pax.c(sb.toString())) {
            return false;
        }
        sb3.append("medal.nXYZ");
        if (!pax.c(sb3.toString())) {
            return false;
        }
        sb2.append("medal.tST");
        if (!pax.c(sb2.toString())) {
            return false;
        }
        sb4.append("medal.vXYZ");
        return pax.c(sb4.toString());
    }
}
