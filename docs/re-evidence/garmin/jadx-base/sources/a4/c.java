package a4;

import androidx.lifecycle.s0;
import androidx.lifecycle.z0;
import p005kotlin.Metadata;
import p3.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"La4/c;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f948b;

    public c(s0 s0Var, z0 z0Var) {
        this.f947a = s0Var;
        this.f948b = z0Var;
    }

    @Override // p3.h0
    public final void dispose() {
        this.f947a.k(this.f948b);
    }
}
