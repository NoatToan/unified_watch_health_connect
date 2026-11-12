package kn0;

import b63.o;
import com.garmin.android.apps.connectmobile.f0;
import mn0.g;
import mn0.j;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkn0/d;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lkn0/a;", "Lhn0/a;", "healthStatusApi", "Lo53/z;", "dispatcher", "<init>", "(Lhn0/a;Lo53/z;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements f0, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hn0.a f105641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f105642b;

    public d(hn0.a aVar, z zVar) {
        aVar.getClass();
        zVar.getClass();
        this.f105641a = aVar;
        this.f105642b = zVar;
    }

    @Override // kn0.a
    public final Object a(o oVar, j jVar) {
        return ge1.b.e0(this.f105642b, new b(this, oVar, null), jVar);
    }

    @Override // kn0.a
    public final Object b(o oVar, o oVar2, g.b bVar) {
        return ge1.b.e0(this.f105642b, new c(this, oVar, oVar2, null), bVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(hn0.a aVar, z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(aVar, zVar);
    }
}
