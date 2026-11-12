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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lf32/j;", "SummaryData", "Lf32/k;", "Lo53/b0;", "coroutineScope", "Lf32/n;", "summaryRequester", "Lc22/a0;", "dispatcherProvider", "<init>", "(Lo53/b0;Lf32/n;Lc22/a0;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class j<SummaryData> implements k<SummaryData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f68685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n<SummaryData> f68686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f68687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f68688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f68689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f68690f;

    public j(b0 b0Var, n<SummaryData> nVar, a0 a0Var) {
        b0Var.getClass();
        nVar.getClass();
        a0Var.getClass();
        this.f68685a = b0Var;
        this.f68686b = nVar;
        this.f68687c = a0Var;
        this.f68688d = "";
        this.f68689e = new LinkedHashMap();
        this.f68690f = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(j jVar, DateTime dateTime, DateTime dateTime2, y0 y0Var, v13.c cVar) {
        i iVar;
        jVar.getClass();
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f68684f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f68684f = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(jVar, cVar);
            }
        } else {
            iVar = new i(jVar, cVar);
        }
        Object objA = iVar.f68682d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f68684f;
        try {
            if (i15 == 0) {
                r.b(objA);
                y0Var.j(fw.m.a.f(fw.m.f73767e, null, null, 3));
                n<SummaryData> nVar = jVar.f68686b;
                iVar.f68679a = dateTime;
                iVar.f68680b = dateTime2;
                iVar.f68681c = y0Var;
                iVar.f68684f = 1;
                objA = nVar.a(dateTime, dateTime2, iVar);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y0Var = iVar.f68681c;
                dateTime2 = iVar.f68680b;
                dateTime = iVar.f68679a;
                r.b(objA);
            }
            y0Var.j(fw.m.a.g(fw.m.f73767e, objA, 1));
            Thread.currentThread().getName();
            Objects.toString(dateTime);
            Objects.toString(dateTime2);
        } catch (Throwable th3) {
            fw.m.f73767e.getClass();
            y0Var.j(fw.m.a.a(null, th3));
        }
        return Unit.INSTANCE;
    }

    @Override // f32.k
    public final y0 a(DateTime dateTime, DateTime dateTime2) {
        return d(dateTime, dateTime2, false);
    }

    @Override // f32.k
    public final void b(DateTime dateTime, DateTime dateTime2) {
        d(dateTime, dateTime2, true);
    }

    public final y0 d(DateTime dateTime, DateTime dateTime2, boolean z14) {
        DateTime dateTime3;
        o13.p pVar = new o13.p(dateTime, dateTime2);
        Thread.currentThread().getName();
        pVar.toString();
        LinkedHashMap linkedHashMap = this.f68689e;
        Object y0Var = linkedHashMap.get(pVar);
        if (y0Var == null) {
            y0Var = new y0();
            linkedHashMap.put(pVar, y0Var);
        }
        y0 y0Var2 = (y0) y0Var;
        LinkedHashMap linkedHashMap2 = this.f68690f;
        l1 l1Var = (l1) linkedHashMap2.get(pVar);
        if ((l1Var == null || !l1Var.isActive()) && (z14 || y0Var2.d() == 0)) {
            dateTime3 = dateTime;
            linkedHashMap2.put(pVar, ge1.b.T(this.f68685a, null, null, new h(this, pVar, dateTime3, dateTime2, y0Var2, null), 3));
        } else {
            dateTime3 = dateTime;
        }
        Thread.currentThread().getName();
        Objects.toString(dateTime3);
        return y0Var2;
    }

    public /* synthetic */ j(b0 b0Var, n nVar, a0 a0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(b0Var, nVar, (i14 & 4) != 0 ? new a0(null, null, null, 7, null) : a0Var);
    }
}
