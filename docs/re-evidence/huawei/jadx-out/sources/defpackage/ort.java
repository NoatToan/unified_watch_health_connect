package defpackage;

import android.text.TextUtils;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes13.dex */
public class ort {
    public static boolean d(String str) {
        return TextUtils.isEmpty(str) || TextUtils.equals(Constants.NULL, str) || TextUtils.equals("NULL", str);
    }

    public static boolean e(String str) {
        return str == null || str.length() == 0;
    }
}
