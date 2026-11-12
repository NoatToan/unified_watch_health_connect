package defpackage;

import miuix.appcompat.internal.view.menu.f;
import miuix.appcompat.view.menu.HyperMenuContract$CheckableType;

/* JADX INFO: loaded from: classes3.dex */
public class foc extends eoc {
    public boolean c;
    public HyperMenuContract$CheckableType d;
    public int e;
    public boolean f;

    public foc(f fVar) {
        super(fVar);
        this.d = HyperMenuContract$CheckableType.NON_SUPPORT;
        this.e = -1;
    }

    public boolean c() {
        return this.d == HyperMenuContract$CheckableType.CHECKED;
    }
}
