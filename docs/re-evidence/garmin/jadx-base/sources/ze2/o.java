package ze2;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lze2/o;", "", "<init>", "()V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {
    static {
        new o();
    }

    private o() {
    }

    public static final k a(Intent intent) {
        intent.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            Object parcelableExtra = intent.getParcelableExtra("mfa.error", k.class);
            parcelableExtra.getClass();
            return (k) parcelableExtra;
        }
        Parcelable parcelableExtra2 = intent.getParcelableExtra("mfa.error");
        parcelableExtra2.getClass();
        return (k) parcelableExtra2;
    }
}
