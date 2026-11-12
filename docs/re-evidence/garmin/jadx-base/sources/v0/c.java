package v0;

import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.q2;
import b0.i1;
import j0.u;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements l2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f174156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f174157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f174158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b3 f174159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q2 f174160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q2 f174161f;

    public /* synthetic */ c(d dVar, String str, String str2, b3 b3Var, q2 q2Var, q2 q2Var2) {
        this.f174156a = dVar;
        this.f174157b = str;
        this.f174158c = str2;
        this.f174159d = b3Var;
        this.f174160e = q2Var;
        this.f174161f = q2Var2;
    }

    @Override // androidx.camera.core.impl.l2.d
    public final void a(l2 l2Var, l2.g gVar) {
        d dVar = this.f174156a;
        if (dVar.c() == null) {
            return;
        }
        dVar.F();
        dVar.E(dVar.H(this.f174157b, this.f174158c, this.f174159d, this.f174160e, this.f174161f));
        dVar.q();
        h hVar = dVar.f174163s;
        hVar.getClass();
        u.a();
        Iterator<i1> it = hVar.f174176a.iterator();
        while (it.hasNext()) {
            hVar.k(it.next());
        }
    }
}
