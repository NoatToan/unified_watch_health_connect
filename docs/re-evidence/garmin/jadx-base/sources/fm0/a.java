package fm0;

import am.j;
import android.content.Context;
import bi.q;
import c22.o;
import ci.g;
import ci.i;
import ci.k;
import fb1.d0;
import fi.d;
import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import o13.m;
import o13.t;
import oi.c;
import okhttp3.OkHttpClient;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import pi.e;
import ub2.g0;
import ub2.s;
import vb.h;
import vh.a0;
import vh.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lfm0/a;", "", "<init>", "()V", "a", "gcm-graphql_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f72093a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f72094b = m.b(new d0(10));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static uh.b f72095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static uh.b f72096d;

    /* JADX INFO: renamed from: fm0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfm0/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-graphql_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum EnumC1466a {
        Disk,
        None
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72100a;

        static {
            int[] iArr = new int[EnumC1466a.values().length];
            try {
                iArr[EnumC1466a.Disk.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1466a.None.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f72100a = iArr;
        }
    }

    private a() {
    }

    public static boolean a() {
        Object next;
        Iterator<T> it = c(EnumC1466a.Disk).f171102d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((ki.a) next) instanceof ei.a));
        ki.a aVar = (ki.a) next;
        if (aVar != null) {
            ((ei.a) aVar).f64080a.f();
            return true;
        }
        h.z("no cache configured");
        return false;
    }

    public static uh.b b(EnumC1466a enumC1466a) {
        Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
        uh.b.a aVar = new uh.b.a();
        aVar.f171117f = j.m("https://", ((im0.a) f72094b.getValue()).a(), "/gateway/graphql");
        s.f169889a.getClass();
        a0 a0Var = s.f169890b;
        ob2.a aVar2 = new ob2.a();
        a0Var.getClass();
        z.a aVar3 = aVar.f171112a;
        aVar3.getClass();
        aVar3.f178401a.put(a0Var.f178393a, aVar2);
        g0.f169835a.getClass();
        a0 a0Var2 = g0.f169836b;
        ob2.b bVar = new ob2.b();
        a0Var2.getClass();
        aVar3.getClass();
        aVar3.f178401a.put(a0Var2.f178393a, bVar);
        int i14 = b.f72100a[enumC1466a.ordinal()];
        if (i14 == 1) {
            i iVar = new i(10485760, 0L, 2, null);
            d dVar = new d(contextC, "gcm_graphql_cache", null, false, 12, null);
            k kVar = iVar;
            while (true) {
                d dVar2 = kVar.f27615a;
                if (dVar2 == null) {
                    break;
                }
                kVar = dVar2;
            }
            kVar.f27615a = dVar;
            ci.o oVar = ci.o.f27620a;
            g gVar = g.f27600a;
            oVar.getClass();
            gVar.getClass();
            ei.h hVar = new ei.h(iVar, oVar, gVar);
            ei.s sVar = new ei.s(hVar);
            ArrayList arrayList = aVar.f171113b;
            arrayList.add(sVar);
            bi.j.d dVar3 = bi.j.f17973f;
            dVar3.getClass();
            arrayList.add(dVar3);
            arrayList.add(new ei.a(hVar));
            vh.g0 g0VarC = aVar.f171116e.c(new q(true));
            g0VarC.getClass();
            aVar.f171116e = g0VarC;
        } else if (i14 != 2) {
            u0.r();
            return null;
        }
        uh.b.a aVar4 = aVar.a().f171109k;
        aVar4.getClass();
        uh.b.a aVar5 = new uh.b.a();
        z zVarA = aVar4.f171112a.a();
        z.a aVar6 = aVar5.f171112a;
        aVar6.f178401a.clear();
        aVar6.f178401a.putAll(zVarA.f178400d);
        ArrayList arrayList2 = aVar4.f171114c;
        arrayList2.getClass();
        ArrayList arrayList3 = aVar5.f171113b;
        arrayList3.clear();
        p13.d0.v(arrayList3, arrayList2);
        vh.g0 g0Var = aVar4.f171116e;
        g0Var.getClass();
        aVar5.f171116e = g0Var;
        String str = aVar4.f171117f;
        if (str != null) {
            aVar5.f171117f = str;
        }
        c cVar = aVar4.f171118g;
        if (cVar != null) {
            aVar5.f171118g = cVar;
        }
        Boolean bool = aVar4.f171120i;
        if (bool != null) {
            aVar5.f171120i = bool;
        }
        for (oi.g gVar2 : aVar4.f171115d) {
            gVar2.getClass();
            aVar5.f171115d.add(gVar2);
        }
        e eVar = aVar4.f171121j;
        if (eVar != null) {
            aVar5.f171121j = eVar;
        }
        Long l14 = aVar4.f171119h;
        if (l14 != null) {
            aVar5.f171119h = Long.valueOf(l14.longValue());
        }
        bz0.o.f22274a.getClass();
        OkHttpClient okHttpClientB = bz0.o.b();
        okHttpClientB.getClass();
        aVar5.f171118g = new c(okHttpClientB);
        aVar5.f171121j = new e(okHttpClientB);
        return aVar5.a();
    }

    public static uh.b c(EnumC1466a enumC1466a) {
        enumC1466a.getClass();
        int i14 = b.f72100a[enumC1466a.ordinal()];
        if (i14 == 1) {
            uh.b bVarB = f72095c;
            if (bVarB == null) {
                bVarB = b(enumC1466a);
            }
            f72095c = bVarB;
            return bVarB;
        }
        if (i14 != 2) {
            u0.r();
            return null;
        }
        uh.b bVarB2 = f72096d;
        if (bVarB2 == null) {
            bVarB2 = b(enumC1466a);
        }
        f72096d = bVarB2;
        return bVarB2;
    }
}
