package lw;

import c22.b0;
import c22.o;
import com.garmin.android.apps.connectmobile.f0;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import kw.j;
import kw.m;
import kw.n;
import kw.q;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import qw.i;
import qw.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Llw/c;", "Llw/b;", "Lcom/garmin/android/apps/connectmobile/f0;", "Llw/a;", "api", "<init>", "(Llw/a;)V", "a", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements b, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw.a f115055a;

    static {
        new a(null);
    }

    public c(lw.a aVar) {
        aVar.getClass();
        this.f115055a = aVar;
    }

    @Override // lw.b
    public final c83.d<String> a() {
        return this.f115055a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lw.b
    public final Object b(v13.c cVar) {
        f fVar;
        l22.a aVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f115066d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f115066d = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objC = fVar.f115064b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f115066d;
        n nVar = null;
        Object obj = null;
        if (i15 == 0) {
            r.b(objC);
            nw.a aVar3 = (nw.a) KoinJavaComponent.get$default(nw.a.class, null, null, 6, null);
            l22.a aVar4 = new l22.a(((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c());
            fVar.f115063a = aVar4;
            fVar.f115066d = 1;
            objC = aVar3.c(fVar);
            if (objC == aVar2) {
                return aVar2;
            }
            aVar = aVar4;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = fVar.f115063a;
            r.b(objC);
        }
        kw.e eVar = (kw.e) objC;
        if (eVar == null) {
            return new m(null, null, null, null, null, null, null, 0, null, null, null, 2047, null);
        }
        aVar.getClass();
        bv.b.f21239a.getClass();
        bv.b.a();
        String strB = b0.b(null);
        Set<n> setB = eVar.b();
        if (setB != null) {
            loop0: for (Object obj2 : setB) {
                Set<String> setB2 = ((n) obj2).b();
                if (setB2 != null) {
                    Set<String> set = setB2;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        for (String str : set) {
                            String upperCase = strB.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            if (s.g(str, upperCase)) {
                                obj = obj2;
                                break loop0;
                            }
                        }
                    }
                }
            }
            nVar = (n) obj;
        }
        if (nVar == null) {
            m.a aVar5 = m.f106876l;
            j jVar = j.WORLD;
            Set<q> setD = eVar.d();
            aVar5.getClass();
            return m.a.a(aVar, jVar, setD);
        }
        m.a aVar6 = m.f106876l;
        String upperCase2 = strB.toUpperCase(Locale.ROOT);
        upperCase2.getClass();
        j jVarValueOf = j.valueOf(upperCase2);
        Set<q> setD2 = nVar.d();
        aVar6.getClass();
        return m.a.a(aVar, jVarValueOf, setD2);
    }

    @Override // lw.b
    public final Object c(pw.a aVar, k kVar) {
        return f0.J(this, new h(this, aVar, null), kVar);
    }

    @Override // lw.b
    public final i0<kw.o> d(DateTime dateTime) {
        return this.f115055a.f(fz0.d.b(dateTime));
    }

    @Override // lw.b
    public final Object f(pw.a aVar, rw.h hVar) {
        return f0.J(this, new d(this, aVar, null), hVar);
    }

    @Override // lw.b
    public final Object g(DateTime dateTime, DateTime dateTime2, i iVar) {
        return f0.J(this, new g(this, dateTime, dateTime2, null), iVar);
    }

    @Override // lw.b
    public final Object h(DateTime dateTime, long j8, qw.h hVar) {
        return f0.J(this, new e(this, dateTime, j8, null), hVar);
    }

    @Override // lw.b
    public final i0<kw.h> i(DateTime dateTime, DateTime dateTime2) {
        return this.f115055a.g(fz0.d.b(dateTime), fz0.d.b(dateTime2));
    }

    @Override // lw.b
    public final i0<kw.h> j(DateTime dateTime, DateTime dateTime2) {
        return this.f115055a.b(fz0.d.b(dateTime), fz0.d.b(dateTime2));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llw/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
