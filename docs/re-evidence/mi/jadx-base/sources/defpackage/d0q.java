package defpackage;

import android.view.View;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class d0q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14938b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f14937a = new HashMap();
    public final ArrayList<Transition> c = new ArrayList<>();

    @Deprecated
    public d0q() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d0q)) {
            return false;
        }
        d0q d0qVar = (d0q) obj;
        return this.f14938b == d0qVar.f14938b && this.f14937a.equals(d0qVar.f14937a);
    }

    public int hashCode() {
        return (this.f14938b.hashCode() * 31) + this.f14937a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f14938b + "\n") + "    values:";
        for (String str2 : this.f14937a.keySet()) {
            str = str + "    " + str2 + ": " + this.f14937a.get(str2) + "\n";
        }
        return str;
    }

    public d0q(View view) {
        this.f14938b = view;
    }
}
