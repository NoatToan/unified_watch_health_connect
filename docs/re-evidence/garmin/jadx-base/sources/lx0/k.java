package lx0;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import c83.a0;
import com.garmin.android.apps.connectmobile.menstrualcycle.network.ServerResponseException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import o13.m;
import o13.p;
import o13.r;
import o13.t;
import o53.b0;
import o53.e2;
import o53.s;
import o53.s0;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llx0/k;", "Landroidx/lifecycle/u1;", "Lo53/b0;", "Lyw0/a;", "repository", "<init>", "(Lyw0/a;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends u1 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw0.a f115185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f115186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f115187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f115188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f115189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ww0.a f115190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Date f115191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f115192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f115193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ww0.i f115194j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<LocalDate> f115195k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LocalDate f115196l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f115197m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ww0.j f115198n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y0<cx0.a<Unit>> f115199o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y0<Boolean> f115200p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f115201q;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"lx0/k$a", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            k kVar = k.this;
            kVar.f115188d = -1L;
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            s sVar = kVar.f115187c;
            if (cVar == cVar2) {
                if (sVar != null) {
                    sVar.g0(null);
                }
            } else if (sVar != null) {
                sVar.O(new ServerResponseException(cVar));
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            eVar.getClass();
            obj.getClass();
        }
    }

    public k(yw0.a aVar) {
        aVar.getClass();
        this.f115185a = aVar;
        this.f115186b = ge1.b.h();
        this.f115189e = new a();
        this.f115190f = ww0.a.REGULAR;
        this.f115191g = new Date();
        this.f115192h = 5;
        this.f115193i = 28;
        this.f115194j = ww0.i.NONE;
        this.f115195k = new ArrayList<>();
        LocalDate localDateMinusMonths = new LocalDate().minusMonths(12);
        localDateMinusMonths.getClass();
        this.f115196l = localDateMinusMonths;
        this.f115199o = new y0<>();
        this.f115200p = new y0<>();
        this.f115201q = m.b(new ll0.b(9));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable x4(k kVar, v13.c cVar) {
        h hVar;
        kVar.getClass();
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f115168c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f115168c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(kVar, cVar);
            }
        } else {
            hVar = new h(kVar, cVar);
        }
        Object objP = hVar.f115166a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f115168c;
        ww0.j jVar = null;
        try {
            if (i15 == 0) {
                r.b(objP);
                ax0.a aVar2 = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
                hVar.f115168c = 1;
                objP = aVar2.p(hVar);
                if (objP == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objP);
            }
            jVar = (ww0.j) ((a0) objP).f25746b;
            th = null;
        } catch (Throwable th3) {
            th = th3;
        }
        return new p(jVar, th);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r5v10, types: [T, java.util.ArrayList] */
    public static final Serializable y4(k kVar, v13.c cVar) {
        j jVar;
        r0 r0Var;
        kVar.getClass();
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f115184d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f115184d = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(kVar, cVar);
            }
        } else {
            jVar = new j(kVar, cVar);
        }
        Object obj = jVar.f115182b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f115184d;
        Object obj2 = null;
        if (i15 == 0) {
            r0 r0VarS = wr.g.s(obj);
            try {
                ax0.a aVar2 = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
                jVar.f115181a = r0VarS;
                jVar.f115184d = 1;
                Object objB = aVar2.B(jVar);
                if (objB == aVar) {
                    return aVar;
                }
                r0Var = r0VarS;
                obj = objB;
            } catch (Throwable th3) {
                obj2 = th3;
                r0Var = r0VarS;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var = jVar.f115181a;
            try {
                r.b(obj);
            } catch (Throwable th4) {
                obj2 = th4;
            }
        }
        List list = (List) ((a0) obj).f25746b;
        if (list != null) {
            i52.a aVar3 = i52.a.f91796a;
            boolean z14 = !list.isEmpty();
            aVar3.getClass();
            i52.a.s(z14);
            r0Var.f105810a = h0.Z(list);
        }
        return new p(r0Var.f105810a, obj2);
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF7937b() {
        return s0.f129406a.plus(this.f115186b);
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        this.f115186b.c(null);
        com.garmin.android.library.backgroundtaskmanagement.c cVar = com.garmin.android.library.backgroundtaskmanagement.c.f50123c;
        if (cVar.e(this.f115188d)) {
            cVar.b(this.f115188d);
        }
        super.onCleared();
    }
}
