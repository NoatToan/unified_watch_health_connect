package gs2;

import android.text.TextUtils;
import is2.b;
import p005kotlin.Metadata;
import qs2.f;
import qs2.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs2/a;", "", "<init>", "()V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    public static qs2.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            str.getClass();
            return qs2.a.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static f b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            str.getClass();
            return f.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static g c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            str.getClass();
            return g.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static b d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        return b.valueOf(str);
    }
}
