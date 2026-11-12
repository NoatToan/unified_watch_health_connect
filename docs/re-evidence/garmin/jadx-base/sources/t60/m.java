package t60;

import android.util.Pair;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import d53.w;
import java.util.ArrayList;
import java.util.Locale;
import lc.u0;
import o13.r;
import o53.s0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt60/m;", "Lt60/h;", "<init>", "()V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w60.d f162728a = new w60.d(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<g3<v60.a>> f162729b = new y0<>(g3.a.c(g3.f35298f));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f162730c;

    @Override // t60.h
    /* JADX INFO: renamed from: a, reason: from getter */
    public final y0 getF162729b() {
        return this.f162729b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        if (e(r9, r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // t60.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(a aVar, v13.c cVar) {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f162720d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f162720d = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objD = jVar.f162718b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f162720d;
        y0<g3<v60.a>> y0Var = this.f162729b;
        if (i15 != 0) {
            if (i15 == 1) {
                aVar = jVar.f162717a;
                r.b(objD);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objD);
            }
            return Unit.INSTANCE;
        }
        r.b(objD);
        y0Var.m(g3.a.c(g3.f35298f));
        if (!((c) KoinJavaComponent.get$default(c.class, null, null, 6, null)).c()) {
            y0Var.m(g3.a.d(new v60.a(false, null)));
            return Unit.INSTANCE;
        }
        jVar.f162717a = aVar;
        jVar.f162720d = 1;
        objD = d(aVar, jVar);
        if (objD != obj) {
        }
        return obj;
        v2 v2Var = (v2) objD;
        if (v2Var instanceof v2.b) {
            v60.c cVar2 = (v60.c) ((v2.b) v2Var).f47386a;
            if (cVar2.getAvailableForPurchase()) {
                this.f162730c = cVar2.getShopUrl();
                jVar.f162717a = null;
                jVar.f162720d = 2;
            } else {
                g3.a aVar2 = g3.f35298f;
                v60.a aVar3 = new v60.a(false, null);
                aVar2.getClass();
                y0Var.m(g3.a.d(aVar3));
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            g3.a aVar4 = g3.f35298f;
            v60.a aVar5 = new v60.a(false, null);
            aVar4.getClass();
            y0Var.m(g3.a.d(aVar5));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t60.h
    public final Object c(a aVar, DateTime dateTime, v13.c cVar) throws Throwable {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f162723c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f162723c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objE0 = kVar.f162721a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f162723c;
        if (i15 == 0) {
            r.b(objE0);
            x53.c cVar2 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            l lVar = new l(dateTime, this, aVar, null);
            kVar.f162723c = 1;
            objE0 = ge1.b.e0(bVar, lVar, kVar);
            if (objE0 == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE0);
        }
        v2 v2Var = (v2) objE0;
        boolean z14 = v2Var instanceof v2.b;
        y0<g3<v60.a>> y0Var = this.f162729b;
        if (z14) {
            g3.a aVar3 = g3.f35298f;
            v60.a aVar4 = new v60.a(false, null);
            aVar3.getClass();
            y0Var.m(g3.a.d(aVar4));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar5 = (v2.a) v2Var;
            y0Var.m(g3.a.a(g3.f35298f, aVar5.f47383a.toString(), aVar5.f47383a, null, null, 12));
        }
        return Unit.INSTANCE;
    }

    @Override // t60.h
    public final Object d(a aVar, v13.c cVar) {
        String country;
        String str;
        w60.d dVar = this.f162728a;
        dVar.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String languageTag = locale.toLanguageTag();
        languageTag.getClass();
        String strF0 = w.f0(languageTag, '-');
        Pair<String, Long> pairU0 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).U0();
        if (pairU0 == null || (str = (String) pairU0.first) == null) {
            country = locale.getCountry();
        } else {
            country = str.toUpperCase(Locale.ROOT);
            country.getClass();
        }
        return f0.J(dVar, new w60.a(dVar, aVar, country, strF0, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object e(a aVar, v13.c cVar) {
        i iVar;
        ArrayList arrayListD;
        Object objJ;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f162716e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f162716e = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object obj = iVar.f162714c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f162716e;
        if (i15 == 0) {
            r.b(obj);
            rd2.f.a().f152045a.getClass();
            arrayListD = rd2.j.d();
            iVar.f162712a = aVar;
            iVar.f162713b = arrayListD;
            iVar.f162716e = 1;
            w60.d dVar = this.f162728a;
            dVar.getClass();
            objJ = f0.J(dVar, new w60.b(dVar, aVar, null), iVar);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList = iVar.f162713b;
            a aVar3 = iVar.f162712a;
            r.b(obj);
            arrayListD = arrayList;
            aVar = aVar3;
            objJ = obj;
        }
        v2 v2Var = (v2) objJ;
        boolean z14 = v2Var instanceof v2.b;
        y0<g3<v60.a>> y0Var = this.f162729b;
        if (z14) {
            boolean zB = ((c) KoinJavaComponent.get$default(c.class, null, null, 6, null)).b(aVar, ((v60.b) ((v2.b) v2Var).f47386a).getValue(), arrayListD);
            g3.a aVar4 = g3.f35298f;
            v60.a aVar5 = new v60.a(zB, this.f162730c);
            aVar4.getClass();
            y0Var.m(g3.a.d(aVar5));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar6 = (v2.a) v2Var;
            y0Var.m(g3.a.a(g3.f35298f, aVar6.f47383a.toString(), aVar6.f47383a, null, null, 12));
        }
        return Unit.INSTANCE;
    }
}
