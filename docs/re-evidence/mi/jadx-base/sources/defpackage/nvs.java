package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes11.dex */
public class nvs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f28491a = Log.isLoggable("BCompressed", 3);

    public static byte[] a(mvs mvsVar, byte[] bArr) {
        try {
            byte[] bArrA = uvs.a.a(bArr);
            if (f28491a) {
                x9s.p("BCompressed", "decompress " + bArr.length + " to " + bArrA.length + " for " + mvsVar);
                if (mvsVar.e == 1) {
                    x9s.p("BCompressed", "decompress not support upStream");
                }
            }
            return bArrA;
        } catch (Exception e) {
            x9s.p("BCompressed", "decompress error " + e);
            return bArr;
        }
    }
}
