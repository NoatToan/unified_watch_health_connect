package defpackage;

import android.text.TextUtils;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsMax;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsMin;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsNotEmpty;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsSize;

/* JADX INFO: loaded from: classes20.dex */
public final class yoi {
    public static String b(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static String a(KfsNotEmpty kfsNotEmpty, String str) {
        return b(kfsNotEmpty.message(), str + " can't be empty");
    }

    public static String b(KfsSize kfsSize, String str) {
        return b(kfsSize.message(), str + " len must between [" + kfsSize.min() + ", " + kfsSize.max() + "]");
    }

    public static String e(KfsMin kfsMin, String str) {
        return b(kfsMin.message(), str + " must >= " + kfsMin.value());
    }

    public static String e(KfsMax kfsMax, String str) {
        return b(kfsMax.message(), str + " must <= " + kfsMax.value());
    }
}
