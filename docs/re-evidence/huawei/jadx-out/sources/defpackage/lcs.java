package defpackage;

import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lcs {
    public static boolean a(int i) {
        return i == 2104 || i == HiHealthDataType.d || i == 2103 || i == 2109;
    }

    public static boolean d(int i) {
        return i == DicDataTypeUtil.DataType.OSA_DETAIL_HALF_HOUR.value();
    }
}
