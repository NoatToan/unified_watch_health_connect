package p006l2;

import a2.b;
import a2.c;
import a2.e;
import a2.f;
import a2.h;
import a2.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.q0;
import r53.j;
import t13.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class c2<T> implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0<h> f108429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d2 f108430b;

    public c2(q0<h> q0Var, d2 d2Var) {
        this.f108429a = q0Var;
        this.f108430b = d2Var;
    }

    @Override // r53.j
    public final Object emit(Object obj, d dVar) {
        h hVar = (h) obj;
        boolean z14 = hVar instanceof e;
        q0<h> q0Var = this.f108429a;
        if (z14 || (hVar instanceof b) || (hVar instanceof l.b)) {
            q0Var.g(hVar);
        } else if (hVar instanceof f) {
            q0Var.k(((f) hVar).f489a);
        } else if (hVar instanceof c) {
            q0Var.k(((c) hVar).f483a);
        } else if (hVar instanceof l.c) {
            q0Var.k(((l.c) hVar).f498a);
        } else if (hVar instanceof l.a) {
            q0Var.k(((l.a) hVar).f496a);
        }
        Object[] objArr = q0Var.f134667a;
        int i14 = q0Var.f134668b;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            d2 d2Var = this.f108430b;
            if (i15 >= i14) {
                d2Var.f108443b.t(i16);
                return Unit.INSTANCE;
            }
            h hVar2 = (h) objArr[i15];
            if (hVar2 instanceof e) {
                d2Var.getClass();
                i16 |= 2;
            } else if (hVar2 instanceof b) {
                d2Var.getClass();
                i16 |= 1;
            } else if (hVar2 instanceof l.b) {
                d2Var.getClass();
                i16 |= 4;
            }
            i15++;
        }
    }
}
