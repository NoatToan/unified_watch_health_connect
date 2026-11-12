package qc;

import android.os.Bundle;
import androidx.lifecycle.b0;
import androidx.lifecycle.j1;
import androidx.lifecycle.m1;
import androidx.lifecycle.o0;
import androidx.lifecycle.p1;
import androidx.lifecycle.u1;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import lc.h0;
import lc.s0;
import lc.v;
import o13.p;
import o13.t;
import p005kotlin.Metadata;
import p13.k0;
import q53.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lqc/d;", "", "Llc/v;", "entry", "<init>", "(Llc/v;)V", "a", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f144293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f144294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f144295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0.b f144296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s0 f144297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f144298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f144299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nd.d f144300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f144301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o0 f144302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b0.b f144303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p1 f144304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f144305m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqc/d$a;", "Landroidx/lifecycle/u1;", "Landroidx/lifecycle/j1;", "handle", "<init>", "(Landroidx/lifecycle/j1;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j1 f144306a;

        public a(j1 j1Var) {
            j1Var.getClass();
            this.f144306a = j1Var;
        }
    }

    public d(v vVar) {
        vVar.getClass();
        this.f144293a = vVar;
        this.f144294b = vVar.f111882b;
        this.f144295c = vVar.f111883c;
        this.f144296d = vVar.f111884d;
        this.f144297e = vVar.f111885e;
        this.f144298f = vVar.f111886f;
        this.f144299g = vVar.f111887g;
        nd.d.f125385c.getClass();
        this.f144300h = nd.d.a.a(vVar);
        t tVarB = o13.m.b(new q(14));
        this.f144302j = new o0(vVar);
        this.f144303k = b0.b.INITIALIZED;
        this.f144304l = (p1) tVarB.getValue();
        this.f144305m = o13.m.b(new q(15));
    }

    public final Bundle a() {
        Bundle bundle = this.f144295c;
        if (bundle == null) {
            return null;
        }
        k0.f134949a.getClass();
        Bundle bundleA = h7.c.a((p[]) Arrays.copyOf(new p[0], 0));
        bundleA.putAll(bundle);
        return bundleA;
    }

    public final void b() {
        if (!this.f144301i) {
            nd.d dVar = this.f144300h;
            dVar.f125386a.a();
            this.f144301i = true;
            if (this.f144297e != null) {
                m1.b(this.f144293a);
            }
            dVar.a(this.f144299g);
        }
        int iOrdinal = this.f144296d.ordinal();
        int iOrdinal2 = this.f144303k.ordinal();
        o0 o0Var = this.f144302j;
        if (iOrdinal < iOrdinal2) {
            o0Var.i(this.f144296d);
        } else {
            o0Var.i(this.f144303k);
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(p005kotlin.jvm.internal.s0.f105811a.b(v.class).D());
        sb3.append("(" + this.f144298f + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        sb3.append(" destination=");
        sb3.append(this.f144294b);
        return sb3.toString();
    }
}
