package t32;

import com.garmin.android.apps.connectmobile.f0;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lt32/e;", "Lt32/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "Ls32/a;", "vo2MaxAPI", "<init>", "(Ls32/a;)V", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements a, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s32.a f162235a;

    public e(s32.a aVar) {
        aVar.getClass();
        this.f162235a = aVar;
    }

    @Override // t32.a
    public final Object a(fz0.c cVar, fz0.c cVar2, List list, e42.b.e eVar) {
        return f0.J(this, new d(this, cVar, cVar2, list, null), eVar);
    }

    @Override // t32.a
    public final Object b(fz0.c cVar, List list, v13.c cVar2) {
        return f0.J(this, new c(this, cVar, list, null), cVar2);
    }

    @Override // t32.a
    public final Object c(fz0.c cVar, fz0.c cVar2, List list, e42.b.C1325b c1325b) {
        return f0.J(this, new b(this, cVar, cVar2, list, null), c1325b);
    }
}
