package defpackage;

import com.huawei.openalliance.ad.constant.IntentFailError;

/* JADX INFO: loaded from: classes28.dex */
public class exm {
    public static int b(String str) {
        if (IntentFailError.NO_PERMISSION.equals(str)) {
            return 1001;
        }
        return "cancel operate".equals(str) ? 1002 : -1;
    }
}
