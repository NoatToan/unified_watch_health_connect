package no.nordicsemi.android.ble;

import androidx.annotation.IntRange;
import defpackage.a83;
import defpackage.a89;
import defpackage.cpo;
import defpackage.ehd;
import defpackage.mok;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends a0 {
    public final byte[] q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f28165r;

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public z i(cpo cpoVar) {
        super.i(cpoVar);
        return this;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public z k(a89 a89Var) {
        super.k(a89Var);
        return this;
    }

    public byte[] G(@IntRange(from = 23, to = 517) int i) {
        int i2 = this.f28165r ? 512 : i - 3;
        byte[] bArr = this.q;
        return bArr.length < i2 ? bArr : a83.a(bArr, 0, i2);
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public z l(ehd ehdVar) {
        super.l(ehdVar);
        return this;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public z D(mok mokVar) {
        super.D(mokVar);
        return this;
    }
}
