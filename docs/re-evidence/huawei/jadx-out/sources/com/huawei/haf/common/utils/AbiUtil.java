package com.huawei.haf.common.utils;

import android.os.Build;
import com.huawei.haf.common.exception.HafRuntimeException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AbiUtil {
    private AbiUtil() {
    }

    public static String e(List<String> list) {
        List<String> listA = a();
        if (list == null && !listA.isEmpty()) {
            return listA.get(0);
        }
        for (String str : listA) {
            if (list.contains(str)) {
                return str;
            }
        }
        throw new HafRuntimeException("No supported abi for this device.");
    }

    private static List<String> a() {
        return Arrays.asList(Build.SUPPORTED_ABIS);
    }
}
