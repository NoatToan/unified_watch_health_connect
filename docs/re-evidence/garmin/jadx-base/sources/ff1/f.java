package ff1;

import b63.o;
import com.garmin.android.apps.connectmobile.f0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lff1/f;", "Lff1/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "Ldf1/a;", "runningToleranceApiService", "<init>", "(Ldf1/a;)V", "gcm-running-tolerance_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements a, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final df1.a f71132a;

    public f(df1.a aVar) {
        aVar.getClass();
        this.f71132a = aVar;
    }

    @Override // ff1.a
    public final Object a(jf1.d dVar) {
        return f0.J(this, new c(this, null), dVar);
    }

    @Override // ff1.a
    public final Object b(o oVar, o oVar2, jf1.b.c cVar) {
        return f0.J(this, new d(this, oVar, oVar2, "weekly", null), cVar);
    }

    @Override // ff1.a
    public final Object c(o oVar, o oVar2, jf1.b.C1896b c1896b) {
        return f0.J(this, new b(this, oVar, oVar2, "daily", null), c1896b);
    }

    @Override // ff1.a
    public final Object d(ef1.c cVar, jf1.e eVar) {
        return f0.J(this, new e(this, cVar, null), eVar);
    }
}
