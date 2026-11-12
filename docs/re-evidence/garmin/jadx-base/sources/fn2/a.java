package fn2;

import android.util.Base64;
import d53.c;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfn2/a;", "", "<init>", "()V", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f72254a = new a();

    private a() {
    }

    public static byte[] a(String str) {
        if (str != null && str.length() != 0) {
            try {
                return Base64.decode(str, 0);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            byte[] bArrEncode = Base64.encode(bArr, 0);
            bArrEncode.getClass();
            return new String(bArrEncode, c.f57666b);
        } catch (Exception unused) {
            return null;
        }
    }
}
