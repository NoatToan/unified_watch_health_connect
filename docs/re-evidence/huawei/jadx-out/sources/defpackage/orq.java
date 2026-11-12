package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.seuqneceutils.SequenceDetailFieldConfig;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes13.dex */
public final class orq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SecureRandom f44611b = EncryptUtil.genSecureRandom();

    public static String e(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            if (SequenceDetailFieldConfig.CHAR.equalsIgnoreCase(f44611b.nextInt(2) % 2 == 0 ? SequenceDetailFieldConfig.CHAR : "num")) {
                sb.append((char) (f44611b.nextInt(26) + (f44611b.nextInt(2) % 2 == 0 ? 65 : 97)));
            } else {
                sb.append(String.valueOf(f44611b.nextInt(10)));
            }
        }
        return sb.toString();
    }
}
