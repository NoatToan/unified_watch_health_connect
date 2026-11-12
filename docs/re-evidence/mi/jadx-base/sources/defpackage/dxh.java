package defpackage;

import android.content.res.Resources;
import com.facebook.common.internal.ImmutableList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class dxh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Resources f16033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public jy5 f16034b;
    public m47 c;
    public Executor d;
    public gpf<c93, u14> e;
    public ImmutableList<m47> f;
    public tpo<Boolean> g;

    public void a(Resources resources, jy5 jy5Var, m47 m47Var, Executor executor, gpf<c93, u14> gpfVar, ImmutableList<m47> immutableList, tpo<Boolean> tpoVar) {
        this.f16033a = resources;
        this.f16034b = jy5Var;
        this.c = m47Var;
        this.d = executor;
        this.e = gpfVar;
        this.f = immutableList;
        this.g = tpoVar;
    }

    public axh b(Resources resources, jy5 jy5Var, m47 m47Var, Executor executor, gpf<c93, u14> gpfVar, ImmutableList<m47> immutableList) {
        return new axh(resources, jy5Var, m47Var, executor, gpfVar, immutableList);
    }

    public axh c() {
        axh axhVarB = b(this.f16033a, this.f16034b, this.c, this.d, this.e, this.f);
        tpo<Boolean> tpoVar = this.g;
        if (tpoVar != null) {
            axhVarB.h0(tpoVar.get().booleanValue());
        }
        return axhVarB;
    }
}
