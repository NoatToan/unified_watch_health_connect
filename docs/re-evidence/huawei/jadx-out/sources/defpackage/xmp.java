package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes46.dex */
public class xmp {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f53168c = {"Service/app/v", "WiseCloudVirtualCardMgmtService/api/v1/client/getUserInfo"};
    private static volatile xmp d = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f53167b = false;

    public static boolean e(String str) {
        if (f53167b && !TextUtils.isEmpty(str)) {
            int length = f53168c.length;
            for (int i = 0; i < length; i++) {
                if (str.contains(f53168c[i])) {
                    return true;
                }
            }
        }
        return f53167b && str.contains("WiseCloudWalletMallSpikeService");
    }
}
