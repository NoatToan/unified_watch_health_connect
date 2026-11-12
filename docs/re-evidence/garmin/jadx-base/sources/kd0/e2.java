package kd0;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/e2;", "Lcom/garmin/android/library/livetrack/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e2 implements com.garmin.android.library.livetrack.a {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104041a;

        static {
            int[] iArr = new int[zi2.a.values().length];
            try {
                iArr[zi2.a.PROD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zi2.a.CHINA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f104041a = iArr;
        }
    }

    @Override // com.garmin.android.library.livetrack.a
    public final vc2.c a() {
        return az0.b.f13670a.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.garmin.android.library.livetrack.a
    public final Object b(v13.c cVar) {
        f2 f2Var;
        if (cVar instanceof f2) {
            f2Var = (f2) cVar;
            int i14 = f2Var.f104063c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f2Var.f104063c = i14 - Integer.MIN_VALUE;
            } else {
                f2Var = new f2(this, cVar);
            }
        } else {
            f2Var = new f2(this, cVar);
        }
        Object objJ = f2Var.f104061a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f2Var.f104063c;
        if (i15 == 0) {
            o13.r.b(objJ);
            f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
            f2Var.f104063c = 1;
            objJ = bVar.j(f2Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        return new wd2.i("Bearer", (String) objJ);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.garmin.android.library.livetrack.a
    public final Object c(v13.c cVar) {
        g2 g2Var;
        if (cVar instanceof g2) {
            g2Var = (g2) cVar;
            int i14 = g2Var.f104086c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g2Var.f104086c = i14 - Integer.MIN_VALUE;
            } else {
                g2Var = new g2(this, cVar);
            }
        } else {
            g2Var = new g2(this, cVar);
        }
        Object objS = g2Var.f104084a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = g2Var.f104086c;
        if (i15 == 0) {
            o13.r.b(objS);
            f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
            g2Var.f104086c = 1;
            objS = bVar.s(g2Var);
            if (objS == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objS);
        }
        return new wd2.i("Bearer", (String) objS);
    }
}
