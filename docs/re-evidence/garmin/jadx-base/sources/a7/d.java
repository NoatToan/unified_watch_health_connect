package a7;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocusId f1715b;

    public static class a {
        private a() {
        }

        public static LocusId a(String str) {
            return new LocusId(str);
        }

        public static String b(LocusId locusId) {
            return locusId.getId();
        }
    }

    public d(String str) {
        if (TextUtils.isEmpty(str)) {
            h.s("id cannot be empty");
            throw null;
        }
        this.f1714a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1715b = a.a(str);
        } else {
            this.f1715b = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        String str = ((d) obj).f1714a;
        String str2 = this.f1714a;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f1714a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LocusIdCompat[");
        sb3.append(this.f1714a.length() + "_chars");
        sb3.append("]");
        return sb3.toString();
    }
}
