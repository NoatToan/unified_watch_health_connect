package hs2;

import com.google.common.base.Optional;
import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import ps2.h;
import ps2.l;
import ps2.m;
import zn2.s3;

/* JADX INFO: loaded from: classes11.dex */
public interface d {
    Object A(f fVar, bo2.e.c cVar);

    ListenableFuture B(List list, boolean z14);

    sl2.f C();

    int D(ul2.d dVar);

    ListenableFuture E(Set set, boolean z14);

    void F(String str, long j8, zi2.a aVar, h hVar);

    void G(boolean z14);

    void H(String str, m mVar);

    ListenableFuture<Boolean> I();

    void J(long j8, zi2.a aVar, cs2.a<Boolean> aVar2);

    String getMacAddress();

    long getUnitId();

    ListenableFuture<Optional<c>> o();

    ListenableFuture<Boolean> p(byte[] bArr, String str, float f14);

    g q();

    void r(jn2.g gVar);

    boolean s();

    void t(String str, String str2, m mVar);

    int u(wl2.f fVar);

    void v(String str);

    FluentFuture w(is2.b bVar, Set set);

    void y(l lVar);

    void z(s3 s3Var);
}
