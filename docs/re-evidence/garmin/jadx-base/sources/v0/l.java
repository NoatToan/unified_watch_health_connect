package v0;

import androidx.camera.core.impl.i1;
import androidx.camera.core.impl.k0;
import j0.v;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class l extends i1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f174196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f174197c;

    public l(k0 k0Var) {
        super(k0Var);
        this.f174196b = "virtual-" + k0Var.q() + "-" + UUID.randomUUID().toString();
    }

    @Override // androidx.camera.core.impl.i1, b0.r
    public final int h() {
        return r(0);
    }

    @Override // androidx.camera.core.impl.i1, androidx.camera.core.impl.k0
    public final String q() {
        return this.f174196b;
    }

    @Override // androidx.camera.core.impl.i1, b0.r
    public final int r(int i14) {
        return v.l(super.r(i14) - this.f174197c);
    }
}
