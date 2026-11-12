package defpackage;

import android.content.LocusId;
import android.os.Build;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class soe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocusId f33839b;

    @RequiresApi(29)
    public static class a {
        public static LocusId a(String str) {
            return new LocusId(str);
        }
    }

    public soe(String str) {
        this.f33838a = (String) g6i.k(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f33839b = a.a(str);
        } else {
            this.f33839b = null;
        }
    }

    public String a() {
        return this.f33838a;
    }

    public final String b() {
        return this.f33838a.length() + "_chars";
    }

    @RequiresApi(29)
    public LocusId c() {
        return this.f33839b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || soe.class != obj.getClass()) {
            return false;
        }
        soe soeVar = (soe) obj;
        String str = this.f33838a;
        if (str == null) {
            return soeVar.f33838a == null;
        }
        return str.equals(soeVar.f33838a);
    }

    public int hashCode() {
        String str = this.f33838a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LocusIdCompat[" + b() + "]";
    }
}
