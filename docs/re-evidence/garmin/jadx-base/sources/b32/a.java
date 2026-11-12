package b32;

import android.annotation.SuppressLint;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f15667a;

    @Override // b32.d
    public void e(c cVar) {
    }

    public final c f() {
        c cVar = this.f15667a;
        if (cVar != null) {
            return cVar;
        }
        h.z("Section has not registered.");
        return null;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void g() {
        f().notifyDataSetChanged();
    }

    public void h(c cVar) {
        this.f15667a = cVar;
    }

    @Override // b32.d
    /* JADX INFO: renamed from: isVisible */
    public boolean getF120672c() {
        return true;
    }
}
