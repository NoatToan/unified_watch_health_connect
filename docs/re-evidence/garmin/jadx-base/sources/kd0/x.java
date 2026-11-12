package kd0;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkd0/x;", "Lzy0/b;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lc22/o;", "appUtilDelegate", "<init>", "(Lc22/o;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x implements zy0.b, com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f104414b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c22.o f104415a;

    static {
        new a(null);
    }

    public x(c22.o oVar) {
        oVar.getClass();
        this.f104415a = oVar;
    }

    public static zy0.p f(jw.c0 c0Var, boolean z14, e23.l lVar) {
        String strA = z14 ? c0Var.a() : c0Var.c();
        if (strA == null) {
            return new zy0.p(new com.garmin.android.apps.connectmobile.v2.a(new Exception("No data"), null, null, 6, null), zy0.c.CACHE);
        }
        try {
            Object objInvoke = lVar.invoke(strA);
            return objInvoke != null ? new zy0.p(new com.garmin.android.apps.connectmobile.v2.b(objInvoke, 200, null, null, 12, null), zy0.c.CACHE) : new zy0.p(new com.garmin.android.apps.connectmobile.v2.a(new Exception("No data"), null, null, 6, null), zy0.c.CACHE);
        } catch (Exception e4) {
            String strJ = androidx.room.a0.j("Error while parsing cache: ", c0Var.f101228a, StringUtils.SPACE, e4.getMessage());
            com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "CachedDataDelegateImpl", strJ);
            return new zy0.p(new com.garmin.android.apps.connectmobile.v2.a(e4, null, null, 6, null), zy0.c.CACHE);
        }
    }

    @Override // zy0.b
    public final Object a(e23.l lVar, TypeToken typeToken, String str, v13.c cVar) {
        return d(str, null, true, new a0(this, lVar, null), new w(typeToken, 1), cVar);
    }

    @Override // zy0.b
    public final Object c(e23.l lVar, TypeToken typeToken, boolean z14, String str, Long l14, v13.c cVar) {
        return d(str, l14, z14, new y(this, lVar, null), new w(typeToken, 0), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, Long l14, boolean z14, e23.l lVar, e23.l lVar2, v13.c cVar) {
        z zVar;
        jw.c0 c0Var;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i14 = zVar.f104464d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zVar.f104464d = i14 - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, cVar);
            }
        } else {
            zVar = new z(this, cVar);
        }
        Object objInvoke = zVar.f104462b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = zVar.f104464d;
        if (i15 == 0) {
            o13.r.b(objInvoke);
            jw.c0 c0Var2 = new jw.c0(l14 != null ? l14.longValue() : AbstractComponentTracker.LINGERING_TIMEOUT, 2592000000L);
            c0Var2.e(str);
            if (!z14) {
                zy0.p pVarF = f(c0Var2, true, lVar2);
                if (pVarF.f207459a instanceof com.garmin.android.apps.connectmobile.v2.b) {
                    return pVarF;
                }
            }
            if (!this.f104415a.a()) {
                return f(c0Var2, false, lVar2);
            }
            zVar.f104461a = c0Var2;
            zVar.f104464d = 1;
            objInvoke = lVar.invoke(zVar);
            if (objInvoke == aVar) {
                return aVar;
            }
            c0Var = c0Var2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0Var = zVar.f104461a;
            o13.r.b(objInvoke);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objInvoke;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            c0Var.d(Unit.INSTANCE, new Gson().toJson(((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a).toString());
        }
        return new zy0.p(v2Var, zy0.c.SERVER);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkd0/x$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
