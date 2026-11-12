package r43;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import t23.r0;
import t23.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h hVar, String... strArr) {
        super(hVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        hVar.getClass();
        strArr.getClass();
    }

    @Override // r43.g, i43.l
    public final /* bridge */ /* synthetic */ Collection a(x33.f fVar, b33.b bVar) {
        a(fVar, bVar);
        throw null;
    }

    @Override // r43.g, i43.l
    public final Set<x33.f> b() {
        throw new IllegalStateException();
    }

    @Override // r43.g, i43.l
    public final /* bridge */ /* synthetic */ Collection c(x33.f fVar, b33.b bVar) {
        c(fVar, bVar);
        throw null;
    }

    @Override // r43.g, i43.l
    public final Set<x33.f> d() {
        throw new IllegalStateException();
    }

    @Override // r43.g, i43.l
    public final Set<x33.f> e() {
        throw new IllegalStateException();
    }

    @Override // r43.g, i43.o
    public final t23.h f(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        throw new IllegalStateException(this.f150345b + ", required name: " + fVar);
    }

    @Override // r43.g, i43.o
    public final Collection<t23.l> g(i43.d dVar, e23.l<? super x33.f, Boolean> lVar) {
        dVar.getClass();
        lVar.getClass();
        throw new IllegalStateException(this.f150345b);
    }

    @Override // r43.g
    /* JADX INFO: renamed from: h */
    public final Set<x0> c(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        throw new IllegalStateException(this.f150345b + ", required name: " + fVar);
    }

    @Override // r43.g
    /* JADX INFO: renamed from: i */
    public final Set<r0> a(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        throw new IllegalStateException(this.f150345b + ", required name: " + fVar);
    }

    @Override // r43.g
    public final String toString() {
        return a0.m(new StringBuilder("ThrowingScope{"), this.f150345b, CoreConstants.CURLY_RIGHT);
    }
}
