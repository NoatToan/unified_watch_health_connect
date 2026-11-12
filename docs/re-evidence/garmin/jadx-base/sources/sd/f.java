package sd;

import android.os.Bundle;
import android.os.IBinder;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsd/f;", "Li63/c;", "Landroid/os/IBinder;", "<init>", "()V", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements i63.c<IBinder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f158573a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k63.f f158574b = k63.k.d("android.os.IBinder", new k63.e[0]);

    private f() {
    }

    public static IBinder a(l63.e eVar) {
        eVar.getClass();
        if (!(eVar instanceof rd.f)) {
            f158573a.getClass();
            vb.h.x(oe2.f.m(f158574b.f103233a, eVar));
            return null;
        }
        rd.f fVar = (rd.f) eVar;
        Bundle bundle = fVar.f151998b;
        bundle.getClass();
        String str = fVar.f152000d;
        str.getClass();
        IBinder binder = bundle.getBinder(str);
        if (binder != null) {
            return binder;
        }
        gg.b.J(str);
        throw null;
    }

    public static void b(l63.f fVar, IBinder iBinder) {
        iBinder.getClass();
        if (!(fVar instanceof rd.g)) {
            f158573a.getClass();
            vb.h.x(oe2.f.n(f158574b.f103233a, fVar));
            return;
        }
        rd.g gVar = (rd.g) fVar;
        Bundle bundle = gVar.f152002a;
        bundle.getClass();
        String str = gVar.f152004c;
        str.getClass();
        bundle.putBinder(str, iBinder);
    }

    @Override // i63.b
    public final /* bridge */ /* synthetic */ Object deserialize(l63.e eVar) {
        return a(eVar);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return f158574b;
    }

    @Override // i63.i
    public final /* bridge */ /* synthetic */ void serialize(l63.f fVar, Object obj) {
        b(fVar, (IBinder) obj);
    }
}
