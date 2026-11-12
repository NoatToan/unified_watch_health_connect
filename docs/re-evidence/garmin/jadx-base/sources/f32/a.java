package f32;

import androidx.lifecycle.y0;
import c22.a0;
import java.util.LinkedHashMap;
import java.util.Objects;
import o13.r;
import o53.b0;
import o53.l1;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u000bB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lf32/a;", "DetailsData", "Lf32/d;", "Lo53/b0;", "coroutineScope", "Lf32/e;", "detailsRequester", "Lc22/a0;", "dispatcherProvider", "<init>", "(Lo53/b0;Lf32/e;Lc22/a0;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a<DetailsData> implements d<DetailsData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f68646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e<DetailsData> f68647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f68648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f68649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f68650e;

    static {
        new C1420a(null);
    }

    public a(b0 b0Var, e<DetailsData> eVar, a0 a0Var) {
        b0Var.getClass();
        eVar.getClass();
        a0Var.getClass();
        this.f68646a = b0Var;
        this.f68647b = eVar;
        this.f68648c = a0Var;
        this.f68649d = new LinkedHashMap();
        this.f68650e = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(a aVar, DateTime dateTime, y0 y0Var, v13.c cVar) {
        c cVar2;
        aVar.getClass();
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f68663e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f68663e = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(aVar, cVar);
            }
        } else {
            cVar2 = new c(aVar, cVar);
        }
        Object objA = cVar2.f68661c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f68663e;
        try {
            if (i15 == 0) {
                r.b(objA);
                y0Var.j(fw.m.a.f(fw.m.f73767e, null, null, 3));
                e<DetailsData> eVar = aVar.f68647b;
                cVar2.f68659a = dateTime;
                cVar2.f68660b = y0Var;
                cVar2.f68663e = 1;
                objA = eVar.a(dateTime, cVar2);
                if (objA == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y0Var = cVar2.f68660b;
                dateTime = cVar2.f68659a;
                r.b(objA);
            }
            y0Var.j(fw.m.a.g(fw.m.f73767e, objA, 1));
            Thread.currentThread().getName();
            Objects.toString(dateTime);
        } catch (Throwable th3) {
            fw.m.f73767e.getClass();
            y0Var.j(fw.m.a.a(null, th3));
        }
        return Unit.INSTANCE;
    }

    @Override // f32.d
    public final void a(DateTime dateTime) {
        d(dateTime, true);
    }

    @Override // f32.d
    public final y0 b(DateTime dateTime) {
        return d(dateTime, false);
    }

    public final y0 d(DateTime dateTime, boolean z14) {
        Thread.currentThread().getName();
        Objects.toString(dateTime);
        LinkedHashMap linkedHashMap = this.f68649d;
        Object y0Var = linkedHashMap.get(dateTime);
        if (y0Var == null) {
            y0Var = new y0();
            linkedHashMap.put(dateTime, y0Var);
        }
        y0 y0Var2 = (y0) y0Var;
        LinkedHashMap linkedHashMap2 = this.f68650e;
        l1 l1Var = (l1) linkedHashMap2.get(dateTime);
        if ((l1Var == null || !l1Var.isActive()) && (z14 || y0Var2.d() == 0)) {
            linkedHashMap2.put(dateTime, ge1.b.T(this.f68646a, null, null, new b(this, dateTime, y0Var2, null), 3));
        }
        Thread.currentThread().getName();
        Objects.toString(dateTime);
        return y0Var2;
    }

    /* JADX INFO: renamed from: f32.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf32/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1420a {
        public /* synthetic */ C1420a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1420a() {
        }
    }

    public /* synthetic */ a(b0 b0Var, e eVar, a0 a0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(b0Var, eVar, (i14 & 4) != 0 ? new a0(null, null, null, 7, null) : a0Var);
    }
}
