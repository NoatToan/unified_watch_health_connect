package r43;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import p13.a1;
import p13.j0;
import p13.l0;
import t23.r0;
import t23.x0;

/* JADX INFO: loaded from: classes3.dex */
public class g implements i43.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150345b;

    public g(h hVar, String... strArr) {
        hVar.getClass();
        strArr.getClass();
        String str = hVar.f150353a;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f150345b = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // i43.l
    public Set<x33.f> b() {
        return l0.f134950a;
    }

    @Override // i43.l
    public Set<x33.f> d() {
        return l0.f134950a;
    }

    @Override // i43.l
    public Set<x33.f> e() {
        return l0.f134950a;
    }

    @Override // i43.o
    public t23.h f(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        return new a(x33.f.g(String.format(b.ERROR_CLASS.f150337a, Arrays.copyOf(new Object[]{fVar}, 1))));
    }

    @Override // i43.o
    public Collection<t23.l> g(i43.d dVar, e23.l<? super x33.f, Boolean> lVar) {
        dVar.getClass();
        lVar.getClass();
        return j0.f134944a;
    }

    @Override // i43.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set<x0> c(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        l.f150388a.getClass();
        return a1.b(new c(l.f150390c));
    }

    @Override // i43.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set<r0> a(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        l.f150388a.getClass();
        return l.f150393f;
    }

    public String toString() {
        return a0.m(new StringBuilder("ErrorScope{"), this.f150345b, CoreConstants.CURLY_RIGHT);
    }
}
