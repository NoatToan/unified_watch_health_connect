package fw;

import androidx.lifecycle.w0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f73763b;

    public /* synthetic */ d(e eVar, int i14) {
        this.f73762a = i14;
        this.f73763b = eVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f73762a) {
            case 0:
                e eVar = this.f73763b;
                w0<m<T>> w0Var = eVar.f73764l;
                m.a aVar = m.f73767e;
                Long lValueOf = Long.valueOf(eVar.f50096f);
                Object obj = eVar.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE);
                aVar.getClass();
                w0Var.m((m<T>) new m(lValueOf, p.SUCCESS, obj, null, 8, null));
                break;
            case 1:
                e eVar2 = this.f73763b;
                eVar2.f73764l.m((m<T>) m.a.f(m.f73767e, Long.valueOf(eVar2.f50096f), null, 2));
                break;
            default:
                e eVar3 = this.f73763b;
                eVar3.f73764l.m((m<T>) m.a.f(m.f73767e, Long.valueOf(eVar3.f50096f), null, 2));
                break;
        }
    }
}
