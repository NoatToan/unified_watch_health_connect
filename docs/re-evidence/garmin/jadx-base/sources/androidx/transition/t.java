package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"UnknownNullness"})
    public View f11164b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11163a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<m> f11165c = new ArrayList<>();

    public t(View view2) {
        this.f11164b = view2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f11164b == tVar.f11164b && this.f11163a.equals(tVar.f11163a);
    }

    public final int hashCode() {
        return this.f11163a.hashCode() + (this.f11164b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbI = sn.a.i("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbI.append(this.f11164b);
        sbI.append("\n");
        String strConcat = sbI.toString().concat("    values:");
        HashMap map = this.f11163a;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }

    @Deprecated
    public t() {
    }
}
