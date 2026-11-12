package com.huawei.watchface;

import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.seuqneceutils.SequenceDetailFieldConfig;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.watchface.utils.HwLog;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes20.dex */
public abstract class r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SecureRandom f30554a = EncryptUtil.genSecureRandom();

    public static int a(int i) {
        return f30554a.nextInt(i);
    }

    public static String b(int i) {
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            try {
                if (SequenceDetailFieldConfig.CHAR.equalsIgnoreCase(f30554a.nextInt(2) % 2 == 0 ? SequenceDetailFieldConfig.CHAR : "num")) {
                    sb.append((char) (f30554a.nextInt(26) + (f30554a.nextInt(2) % 2 == 0 ? 65 : 97)));
                } else {
                    sb.append(String.valueOf(f30554a.nextInt(10)));
                }
            } catch (Exception e) {
                HwLog.e("RandomUtils", "getStringRandom Exception:" + HwLog.printException(e));
            }
        }
        return sb.toString();
    }
}
