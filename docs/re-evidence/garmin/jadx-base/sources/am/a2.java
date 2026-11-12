package am;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lam/a2;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a2 f3853a = new a2();

    private a2() {
    }

    public static final void a(String str, Bundle bundle, List list) {
        if (list == null || !g22.n.d(str)) {
            return;
        }
        bundle.putParcelableArrayList(str, new ArrayList<>(list));
    }

    public static final <T extends Parcelable> void b(Bundle bundle, String str, T t7) {
        if (str.length() <= 0 || t7 == null) {
            return;
        }
        bundle.putParcelable(str, t7);
    }

    public static final <T extends Parcelable> T c(Bundle bundle, String str) {
        if (str.length() == 0 || bundle == null) {
            return null;
        }
        return (T) bundle.getParcelable(str);
    }

    public static final ArrayList d(Bundle bundle, String str) {
        if (str.length() == 0 || bundle == null) {
            return null;
        }
        return bundle.getParcelableArrayList(str);
    }

    public static Serializable e(Bundle bundle, String str) {
        if (str.length() != 0) {
            Serializable serializable = bundle != null ? bundle.getSerializable(str) : null;
            if (serializable instanceof Serializable) {
                return serializable;
            }
        }
        return null;
    }
}
