package p004k6;

import com.mapbox.maps.MapboxMap;
import g6.k;
import g6.l;
import g6.m;
import g6.o;
import h4.d;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk6/a;", "Lk6/c0;", "Lh4/d;", "alignment", "Lg6/k;", MapboxMap.QFE_OFFSET, "<init>", "(Lh4/d;JLkotlin/jvm/internal/j;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f103004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f103005b;

    private a(d dVar, long j8) {
        this.f103004a = dVar;
        this.f103005b = j8;
    }

    @Override // p004k6.c0
    public final long a(l lVar, long j8, o oVar, long j14) {
        m.a aVar = m.f76012b;
        aVar.getClass();
        long jA = this.f103004a.a(0L, (((long) lVar.d()) << 32) | (((long) lVar.b()) & 4294967295L), oVar);
        aVar.getClass();
        long jA2 = this.f103004a.a(0L, j14, oVar);
        k.a aVar2 = k.f76003b;
        long j15 = (((long) (-((int) (jA2 >> 32)))) << 32) | (((long) (-((int) (jA2 & 4294967295L)))) & 4294967295L);
        long j16 = this.f103005b;
        return k.e(k.e(k.e(lVar.c(), jA), j15), (((long) (((int) (j16 >> 32)) * (oVar == o.Ltr ? 1 : -1))) << 32) | (((long) ((int) (j16 & 4294967295L))) & 4294967295L));
    }

    public /* synthetic */ a(d dVar, long j8, j jVar) {
        this(dVar, j8);
    }
}
