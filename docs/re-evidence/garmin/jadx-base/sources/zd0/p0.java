package zd0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzd0/p0;", "", "<init>", "()V", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f204109b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f204108a = new p0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z53.b f204110c = z53.c.a();

    private p0() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v13.c cVar) {
        o0 o0Var;
        z53.b bVar;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i14 = o0Var.f204098d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o0Var.f204098d = i14 - Integer.MIN_VALUE;
            } else {
                o0Var = new o0(this, cVar);
            }
        } else {
            o0Var = new o0(this, cVar);
        }
        Object obj = o0Var.f204096b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = o0Var.f204098d;
        if (i15 == 0) {
            o13.r.b(obj);
            z53.b bVar2 = f204110c;
            o0Var.f204095a = bVar2;
            o0Var.f204098d = 1;
            if (bVar2.c(o0Var) == aVar) {
                return aVar;
            }
            bVar = bVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = o0Var.f204095a;
            o13.r.b(obj);
        }
        try {
            if (!f204109b) {
                q0 q0Var = (q0) KoinJavaComponent.get$default(q0.class, null, null, 6, null);
                m0.f204080a.getClass();
                m0.a(q0Var);
                n0.f204083a.getClass();
                n0.a(q0Var);
                ((z70.x) KoinJavaComponent.get$default(z70.x.class, null, null, 6, null)).a();
                f204109b = true;
                a2 a2Var = a2.PROMOTIONS;
                i2.f36769a.getClass();
                i2.a.k(a2Var, "PromosInitializer", "Promos module has been initialized.");
            }
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }
}
