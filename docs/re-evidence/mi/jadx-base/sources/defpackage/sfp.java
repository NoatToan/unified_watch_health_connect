package defpackage;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes4.dex */
public final class sfp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<rfp> f33597a = new SparseArray<>();

    public rfp a(int i) {
        rfp rfpVar = this.f33597a.get(i);
        if (rfpVar != null) {
            return rfpVar;
        }
        rfp rfpVar2 = new rfp(Long.MAX_VALUE);
        this.f33597a.put(i, rfpVar2);
        return rfpVar2;
    }

    public void b() {
        this.f33597a.clear();
    }
}
