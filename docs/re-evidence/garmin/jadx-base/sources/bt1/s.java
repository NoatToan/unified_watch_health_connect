package bt1;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import by1.z;
import c2.m3;
import c2.z2;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d53.w;
import i3.e5;
import java.util.HashSet;
import java.util.zip.ZipEntry;
import lc.p0;
import lc.q0;
import lc.u0;
import lc.y0;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.ScopeDSL;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import p5.h0;
import p5.k0;
import r1.l2;
import r1.o1;
import r1.o2;
import r1.r1;
import r1.v1;
import r1.x1;
import s1.b2;
import s1.d2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21138a;

    public /* synthetic */ s(int i14) {
        this.f21138a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = 8;
        boolean z14 = true;
        byte b14 = 0;
        Context context = null;
        switch (this.f21138a) {
            case 0:
                String str = (String) obj;
                u.a aVar = u.f21147q;
                str.getClass();
                return str;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                return str2;
            case 2:
                return Boolean.valueOf(((ZipEntry) obj).isDirectory());
            case 3:
                ZipEntry zipEntry = (ZipEntry) obj;
                String name = zipEntry.getName();
                name.getClass();
                if (!w.z(name, ".DS_Store", false)) {
                    String name2 = zipEntry.getName();
                    name2.getClass();
                    if (!w.z(name2, "__MACOSX", false)) {
                        z14 = false;
                    }
                }
                return Boolean.valueOf(z14);
            case 4:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                h0.f(k0Var);
                return Unit.INSTANCE;
            case 5:
                p0 p0Var = (p0) obj;
                by1.e eVar = by1.e.f22178a;
                p0Var.getClass();
                p0Var.c(by1.v.f22216a.c());
                p0Var.b(-1);
                y0 y0Var = new y0();
                y0Var.f111914a = true;
                Unit unit = Unit.INSTANCE;
                p0Var.f111833f = true;
                p0Var.f111834g = y0Var.f111915b;
                return Unit.INSTANCE;
            case 6:
                lc.u uVar = (lc.u) obj;
                by1.v vVar = by1.v.f22216a;
                uVar.getClass();
                uVar.b(q0.f111838c);
                uVar.a(0);
                return Unit.INSTANCE;
            case 7:
                lc.u uVar2 = (lc.u) obj;
                z zVar = z.f22228a;
                uVar2.getClass();
                uVar2.b(q0.f111838c);
                uVar2.a(0);
                uVar2.f111877a.f111872b = false;
                return Unit.INSTANCE;
            case 8:
                Context context2 = (Context) obj;
                bz0.o oVar = bz0.o.f22274a;
                context2.getClass();
                bz0.o.f22274a.getClass();
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "NetworkDI", "createHealthHtpClient");
                ed2.c cVar = new ed2.c(context2, 0, null, null, 0L, 0L, 0L, false, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0, 33554430, null);
                bz0.o.h().getClass();
                cVar.f63884a = 11657;
                cVar.f63893j = null;
                cVar.f63894k = az0.b.f13670a.c();
                cVar.f63895l = true;
                ed2.c.b(cVar, new bz0.h(null), null, null, 6);
                cVar.f63896m = new bz0.i(bz0.o.f22275b);
                dz0.f fVar = new dz0.f((dz0.e) KoinJavaComponent.get$default(dz0.e.class, null, null, 6, null));
                HashSet<Interceptor> hashSet = cVar.f63909z;
                hashSet.add(fVar);
                hashSet.add(new dz0.c());
                OkHttpClient okHttpClientA = cVar.a();
                if (bz0.o.f22282i) {
                    jd2.b.b(okHttpClientA, jd2.a.HTTP_EVENTS);
                } else {
                    jd2.b.a(okHttpClientA, jd2.a.HTTP_EVENTS);
                }
                return okHttpClientA;
            case 9:
                Context context3 = (Context) obj;
                bz0.o oVar2 = bz0.o.f22274a;
                context3.getClass();
                return bz0.o.a(bz0.o.f22274a, context3, null, bz0.o.f22278e, 6);
            case 10:
                Context context4 = (Context) obj;
                bz0.o oVar3 = bz0.o.f22274a;
                context4.getClass();
                bz0.o.f22274a.getClass();
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.b(a2Var2, "NetworkDI", "createInReachHttpClient");
                ed2.c cVar2 = new ed2.c(context4, 0, null, null, 0L, 0L, 0L, false, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0, 33554430, null);
                bz0.o.h().getClass();
                cVar2.f63884a = 11657;
                cVar2.f63893j = null;
                cVar2.f63894k = az0.b.f13670a.c();
                cVar2.f63895l = true;
                cVar2.f63896m = new bz0.j(bz0.o.f22275b);
                ed2.c.b(cVar2, new bz0.k(null), null, new bz0.l(null), 2);
                cVar2.f63909z.add(new bz0.a());
                OkHttpClient okHttpClientA2 = cVar2.a();
                if (bz0.o.f22282i) {
                    jd2.b.b(okHttpClientA2, jd2.a.HTTP_EVENTS);
                } else {
                    jd2.b.a(okHttpClientA2, jd2.a.HTTP_EVENTS);
                }
                return okHttpClientA2;
            case 11:
                String str3 = (String) obj;
                bz0.o oVar4 = bz0.o.f22274a;
                str3.getClass();
                bz0.o.f22275b.debug(str3);
                return Unit.INSTANCE;
            case 12:
                Module module = (Module) obj;
                bz0.o oVar5 = bz0.o.f22274a;
                module.getClass();
                module.scope(QualifierKt.named("network"), new s(13));
                SingleInstanceFactory<?> singleInstanceFactoryP = u0.p(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(OkHttpClient.class), QualifierKt.named("staticHttpClient"), new bb1.a(b14, 19), Kind.Singleton, j0.f134944a), module);
                if (module.get_createdAtStart()) {
                    module.prepareForCreationAtStart(singleInstanceFactoryP);
                }
                new KoinDefinition(module, singleInstanceFactoryP);
                return Unit.INSTANCE;
            case 13:
                ScopeDSL scopeDSL = (ScopeDSL) obj;
                bz0.o oVar6 = bz0.o.f22274a;
                scopeDSL.getClass();
                bz0.o oVar7 = bz0.o.f22274a;
                StringQualifier stringQualifierNamed = QualifierKt.named("omtHttpClient");
                s sVar = new s(14);
                oVar7.getClass();
                bz0.o.m(scopeDSL, stringQualifierNamed, sVar);
                bz0.o.m(scopeDSL, QualifierKt.named("gcHttpClient"), new s(15));
                bz0.o.m(scopeDSL, QualifierKt.named("gcTrackingHttpClient"), new s(16));
                bz0.o.m(scopeDSL, QualifierKt.named("gcOAuth1HttpClient"), new s(17));
                bz0.o.m(scopeDSL, QualifierKt.named("gcsApiUserHttpClient"), new s(18));
                bz0.o.m(scopeDSL, QualifierKt.named("healthHttpClient"), new s(i14));
                bz0.o.m(scopeDSL, QualifierKt.named("gcSyncHttpClient"), new s(9));
                bz0.o.m(scopeDSL, QualifierKt.named("inReachHttpClient"), new s(10));
                return Unit.INSTANCE;
            case 14:
                Context context5 = (Context) obj;
                bz0.o oVar8 = bz0.o.f22274a;
                context5.getClass();
                bz0.o.f22274a.getClass();
                i2.a aVar4 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar4.getClass();
                i2.a.b(a2Var3, "NetworkDI", "createOMTHttpClient");
                ed2.c cVar3 = new ed2.c(context5, 0, null, null, 0L, 0L, 0L, false, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0, 33554430, null);
                bz0.o.h().getClass();
                cVar3.f63884a = 11657;
                cVar3.f63890g = false;
                cVar3.f63892i = false;
                ed2.c.b(cVar3, new bz0.m(null), null, null, 6);
                cVar3.f63894k = az0.b.f13670a.c();
                cVar3.f63895l = true;
                cVar3.f63896m = new s(11);
                dz0.f fVar2 = new dz0.f((dz0.e) KoinJavaComponent.get$default(dz0.e.class, null, null, 6, null));
                HashSet<Interceptor> hashSet2 = cVar3.f63909z;
                hashSet2.add(fVar2);
                hashSet2.add(new id2.d(context5));
                hashSet2.add(new dz0.a(context5));
                cVar3.A.add(new dz0.d());
                OkHttpClient okHttpClientA3 = cVar3.a();
                if (bz0.o.f22282i) {
                    jd2.b.b(okHttpClientA3, jd2.a.HTTP_EVENTS);
                } else {
                    jd2.b.a(okHttpClientA3, jd2.a.HTTP_EVENTS);
                }
                return okHttpClientA3;
            case 15:
                Context context6 = (Context) obj;
                bz0.o oVar9 = bz0.o.f22274a;
                context6.getClass();
                return bz0.o.a(bz0.o.f22274a, context6, null, bz0.o.f22277d, 6);
            case 16:
                Context context7 = (Context) obj;
                bz0.o oVar10 = bz0.o.f22274a;
                context7.getClass();
                return bz0.o.a(bz0.o.f22274a, context7, bz0.o.f22281h, bz0.o.f22277d, 2);
            case 17:
                Context context8 = (Context) obj;
                bz0.o oVar11 = bz0.o.f22274a;
                context8.getClass();
                return bz0.o.a(bz0.o.f22274a, context8, null, bz0.o.f22277d, 4);
            case 18:
                Context context9 = (Context) obj;
                bz0.o oVar12 = bz0.o.f22274a;
                context9.getClass();
                bz0.o.f22274a.getClass();
                i2.a aVar5 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar5.getClass();
                i2.a.b(a2Var4, "NetworkDI", "createGcsApiHtpClient");
                ed2.c cVar4 = new ed2.c(context9, 0, null, null, 0L, 0L, 0L, false, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0, 33554430, null);
                bz0.o.h().getClass();
                cVar4.f63884a = 11657;
                cVar4.f63893j = null;
                cVar4.f63896m = new bz0.e(bz0.o.f22275b);
                ed2.c.b(cVar4, new bz0.f(null), null, new bz0.g(null), 2);
                Interceptor.Companion companion = Interceptor.INSTANCE;
                cVar4.f63909z.add(new bz0.d());
                OkHttpClient okHttpClientA4 = cVar4.a();
                if (bz0.o.f22282i) {
                    jd2.b.b(okHttpClientA4, jd2.a.HTTP_EVENTS);
                } else {
                    jd2.b.a(okHttpClientA4, jd2.a.HTTP_EVENTS);
                }
                return okHttpClientA4;
            case 19:
                Module module2 = (Module) obj;
                bz0.p pVar = bz0.p.f22283a;
                module2.getClass();
                bb1.a aVar6 = new bb1.a(b14, 20);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion2.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(dz0.e.class), null, aVar6, kind, j0Var), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var.b(zy0.l.class), null, new bb1.a(b14, 21), kind, j0Var), module2));
                return Unit.INSTANCE;
            case 20:
                for (Context baseContext = (Context) ((p3.u) obj).f(AndroidCompositionLocals_androidKt.f6042b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                    if (baseContext instanceof Activity) {
                        context = baseContext;
                        return (Activity) context;
                    }
                }
                return (Activity) context;
            case 21:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                h0.n(k0Var2, "");
                return Unit.INSTANCE;
            case 22:
                r1.n nVar = (r1.n) obj;
                nVar.getClass();
                boolean zG = p005kotlin.jvm.internal.s.g(((c12.h.b.C0339b) nVar.f()).f22563b, ((c12.h.b.C0339b) nVar.c()).f22562a);
                b2 b2VarD = s1.l.d(300, 0, null, 6);
                a81.j jVar = new a81.j(zG, 7);
                d2 d2Var = r1.u0.f149280a;
                return r1.b.c(new v1(new o2(null, new l2(new o1(jVar), b2VarD), null, null, null, false, null, 125, null)), new x1(new o2(null, new l2(new r1(new a81.j(zG, i14)), s1.l.d(300, 0, null, 6)), null, null, null, false, null, 125, null)));
            case 23:
                c2.q.a aVar7 = c2.q.a.f22833a;
                return Unit.INSTANCE;
            case 24:
                return Unit.INSTANCE;
            case 25:
                return Unit.INSTANCE;
            case 26:
                return Unit.INSTANCE;
            case 27:
                return Unit.INSTANCE;
            case 28:
                z2 z2Var = z2.f22964a;
                return Unit.INSTANCE;
            default:
                return ((m3) obj).f22761g;
        }
    }
}
