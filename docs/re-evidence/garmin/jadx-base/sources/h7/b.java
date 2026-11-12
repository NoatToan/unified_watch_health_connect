package h7;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    public static class a {
        private a() {
        }

        public static Object a(Bundle bundle, Class cls, String str) {
            return bundle.getParcelable(str, cls);
        }

        public static Object[] b(Bundle bundle, Class cls, String str) {
            return bundle.getParcelableArray(str, cls);
        }

        public static ArrayList c(Bundle bundle, Class cls, String str) {
            return bundle.getParcelableArrayList(str, cls);
        }

        public static Serializable d(Bundle bundle, Class cls, String str) {
            return bundle.getSerializable(str, cls);
        }

        public static SparseArray e(Bundle bundle, Class cls, String str) {
            return bundle.getSparseParcelableArray(str, cls);
        }
    }

    private b() {
    }

    public static Object a(Bundle bundle, Class cls, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(bundle, cls, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static Serializable b(Bundle bundle, Class cls, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.d(bundle, cls, str);
        }
        Serializable serializable = bundle.getSerializable(str);
        if (cls.isInstance(serializable)) {
            return serializable;
        }
        return null;
    }
}
