package zr0;

import com.garmin.android.apps.connectmobile.f0;
import ls0.c0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import v13.i;
import yr0.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzr0/g;", "Lzr0/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lxr0/a;", "api", "<init>", "(Lxr0/a;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements a, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xr0.a f206765a;

    public g(xr0.a aVar) {
        aVar.getClass();
        this.f206765a = aVar;
    }

    @Override // zr0.a
    public final Object a(LocalDate localDate, is0.c.a.b bVar) {
        return f0.J(this, new d(this, localDate, null), bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zr0.a
    public final Object b(DateTime dateTime, is0.c.a.C1816c c1816c) {
        return new is1.e(null, 1, 0 == true ? 1 : 0).a(dateTime, c1816c);
    }

    @Override // zr0.a
    public final Object c(long j8, i iVar) {
        return f0.J(this, new c(this, j8, null), iVar);
    }

    @Override // zr0.a
    public final Object d(o oVar, c0 c0Var) {
        return f0.J(this, new f(this, oVar, null), c0Var);
    }

    @Override // zr0.a
    public final Object f(i iVar) {
        return f0.J(this, new e(this, null), iVar);
    }

    @Override // zr0.a
    public final Object g(o oVar, c0 c0Var) {
        return f0.J(this, new b(this, oVar, null), c0Var);
    }
}
