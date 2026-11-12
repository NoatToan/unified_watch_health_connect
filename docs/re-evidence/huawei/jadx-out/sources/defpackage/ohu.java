package defpackage;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.openplatform.abl.log.util.h;

/* JADX INFO: loaded from: classes12.dex */
public class ohu {
    public static String b() {
        String strA = h.a("ro.product.model");
        return TextUtils.isEmpty(strA) ? Build.MODEL : strA;
    }
}
