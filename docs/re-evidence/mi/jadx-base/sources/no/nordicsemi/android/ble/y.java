package no.nordicsemi.android.ble;

import defpackage.a89;
import defpackage.cpo;
import defpackage.ehd;
import defpackage.mok;
import java.util.Deque;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public class y extends x {
    public final Deque<x> q;

    public y() {
        super(x.a.SET);
        this.q = new LinkedList();
    }

    public void E(x xVar) {
        this.q.addFirst(xVar);
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public y i(cpo cpoVar) {
        super.i(cpoVar);
        return this;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public y k(a89 a89Var) {
        super.k(a89Var);
        return this;
    }

    public x H() {
        try {
            return this.q.remove();
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean I() {
        return (this.p || this.q.isEmpty()) ? false : true;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public y l(ehd ehdVar) {
        super.l(ehdVar);
        return this;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public y D(mok mokVar) {
        super.D(mokVar);
        return this;
    }
}
