package fd;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceParams;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerParams;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.view.InputEvent;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0097@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0097@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0097@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0097@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0018H\u0097@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u001bH\u0097@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0097@¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lfd/f;", "Lfd/c;", "Landroid/adservices/measurement/MeasurementManager;", "mMeasurementManager", "<init>", "(Landroid/adservices/measurement/MeasurementManager;)V", "Lfd/a;", "deletionRequest", "", "a", "(Lfd/a;Lt13/d;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;Lt13/d;)Ljava/lang/Object;", "trigger", JWKParameterNames.RSA_EXPONENT, "(Landroid/net/Uri;Lt13/d;)Ljava/lang/Object;", "Lfd/j;", "request", "f", "(Lfd/j;Lt13/d;)Ljava/lang/Object;", "Lfd/g;", "d", "(Lfd/g;Lt13/d;)Ljava/lang/Object;", "Lfd/l;", "g", "(Lfd/l;Lt13/d;)Ljava/lang/Object;", "", "b", "(Lt13/d;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
public class f extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MeasurementManager f70422b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", f = "MeasurementManagerImplCommon.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f70423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f70424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f70425c;

        /* JADX INFO: renamed from: fd.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1", f = "MeasurementManagerImplCommon.kt", l = {131}, m = "invokeSuspend")
        public static final class C1445a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f70426a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f70427b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Uri f70428c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ g f70429d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1445a(f fVar, Uri uri, g gVar, t13.d<? super C1445a> dVar) {
                super(2, dVar);
                this.f70427b = fVar;
                this.f70428c = uri;
                this.f70429d = gVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1445a(this.f70427b, this.f70428c, this.f70429d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C1445a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f70426a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f70426a = 1;
                    o53.k kVar = new o53.k(u13.f.b(this), 1);
                    kVar.q();
                    this.f70427b.f70422b.registerSource(this.f70428c, this.f70429d.f70431b, new bv2.g(1), new h7.f(kVar));
                    if (kVar.p() == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f70424b = gVar;
            this.f70425c = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f70424b, this.f70425c, dVar);
            aVar.f70423a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            b0 b0Var = (b0) this.f70423a;
            g gVar = this.f70424b;
            Iterator<T> it = gVar.f70430a.iterator();
            while (it.hasNext()) {
                ge1.b.T(b0Var, null, null, new C1445a(this.f70425c, (Uri) it.next(), gVar, null), 3);
            }
            return Unit.INSTANCE;
        }
    }

    public f(MeasurementManager measurementManager) {
        measurementManager.getClass();
        this.f70422b = measurementManager;
    }

    public static Object h(f fVar, fd.a aVar, t13.d<? super Unit> dVar) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(dVar), 1);
        kVar.q();
        MeasurementManager measurementManager = fVar.f70422b;
        aVar.getClass();
        DeletionRequest deletionRequestBuild = dj.r.a().setDeletionMode(aVar.f70414a).setMatchBehavior(aVar.f70415b).setStart(aVar.f70416c).setEnd(aVar.f70417d).setDomainUris(aVar.f70418e).setOriginUris(aVar.f70419f).build();
        deletionRequestBuild.getClass();
        measurementManager.deleteRegistrations(deletionRequestBuild, new bv2.g(1), new h7.f(kVar));
        Object objP = kVar.p();
        return objP == u13.a.COROUTINE_SUSPENDED ? objP : Unit.INSTANCE;
    }

    public static Object i(f fVar, t13.d<? super Integer> dVar) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(dVar), 1);
        kVar.q();
        fVar.f70422b.getMeasurementApiStatus(new bv2.g(1), new h7.f(kVar));
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    public static Object j(f fVar, Uri uri, InputEvent inputEvent, t13.d<? super Unit> dVar) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(dVar), 1);
        kVar.q();
        fVar.f70422b.registerSource(uri, inputEvent, new bv2.g(1), new h7.f(kVar));
        Object objP = kVar.p();
        return objP == u13.a.COROUTINE_SUSPENDED ? objP : Unit.INSTANCE;
    }

    public static Object k(f fVar, g gVar, t13.d<? super Unit> dVar) {
        Object objE = c0.e(new a(gVar, fVar, null), dVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }

    public static Object l(f fVar, Uri uri, t13.d<? super Unit> dVar) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(dVar), 1);
        kVar.q();
        fVar.f70422b.registerTrigger(uri, new bv2.g(1), new h7.f(kVar));
        Object objP = kVar.p();
        return objP == u13.a.COROUTINE_SUSPENDED ? objP : Unit.INSTANCE;
    }

    public static Object m(f fVar, j jVar, t13.d<? super Unit> dVar) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(dVar), 1);
        kVar.q();
        MeasurementManager measurementManager = fVar.f70422b;
        jVar.getClass();
        i.s();
        h.a aVar = h.f70432c;
        List<h> list = jVar.f70435a;
        aVar.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (h hVar : list) {
            dj.r.n();
            WebSourceParams webSourceParamsBuild = dj.r.i(hVar.f70433a).setDebugKeyAllowed(hVar.f70434b).build();
            webSourceParamsBuild.getClass();
            arrayList.add(webSourceParamsBuild);
        }
        WebSourceRegistrationRequest webSourceRegistrationRequestBuild = i.d(arrayList, jVar.f70436b).setWebDestination(jVar.f70439e).setAppDestination(jVar.f70438d).setInputEvent(jVar.f70437c).setVerifiedDestination(jVar.f70440f).build();
        webSourceRegistrationRequestBuild.getClass();
        measurementManager.registerWebSource(webSourceRegistrationRequestBuild, new bv2.g(1), new h7.f(kVar));
        Object objP = kVar.p();
        return objP == u13.a.COROUTINE_SUSPENDED ? objP : Unit.INSTANCE;
    }

    public static Object n(f fVar, l lVar, t13.d<? super Unit> dVar) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(dVar), 1);
        kVar.q();
        MeasurementManager measurementManager = fVar.f70422b;
        lVar.getClass();
        i.D();
        k.a aVar = k.f70441c;
        List<k> list = lVar.f70444a;
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (k kVar2 : list) {
            i.C();
            WebTriggerParams webTriggerParamsBuild = i.g(kVar2.f70442a).setDebugKeyAllowed(kVar2.f70443b).build();
            webTriggerParamsBuild.getClass();
            arrayList.add(webTriggerParamsBuild);
        }
        WebTriggerRegistrationRequest webTriggerRegistrationRequestBuild = i.i(arrayList, lVar.f70445b).build();
        webTriggerRegistrationRequestBuild.getClass();
        measurementManager.registerWebTrigger(webTriggerRegistrationRequestBuild, new bv2.g(1), new h7.f(kVar));
        Object objP = kVar.p();
        return objP == u13.a.COROUTINE_SUSPENDED ? objP : Unit.INSTANCE;
    }

    @Override // fd.c
    public Object a(fd.a aVar, t13.d<? super Unit> dVar) {
        return h(this, aVar, dVar);
    }

    @Override // fd.c
    public Object b(t13.d<? super Integer> dVar) {
        return i(this, dVar);
    }

    @Override // fd.c
    public Object c(Uri uri, InputEvent inputEvent, t13.d<? super Unit> dVar) {
        return j(this, uri, inputEvent, dVar);
    }

    @Override // fd.c
    public Object d(g gVar, t13.d<? super Unit> dVar) {
        return k(this, gVar, dVar);
    }

    @Override // fd.c
    public Object e(Uri uri, t13.d<? super Unit> dVar) {
        return l(this, uri, dVar);
    }

    @Override // fd.c
    public Object f(j jVar, t13.d<? super Unit> dVar) {
        return m(this, jVar, dVar);
    }

    @Override // fd.c
    public Object g(l lVar, t13.d<? super Unit> dVar) {
        return n(this, lVar, dVar);
    }
}
