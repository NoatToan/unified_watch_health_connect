package qa2;

import e23.l;
import e23.p;
import java.util.Objects;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.exportablereports.model.ReportsDataStore$getReportStatus$1", f = "ReportsDataStore.kt", l = {146}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f143924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f143925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f143926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f143927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f143928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l<d, Unit> f143929f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(e eVar, l<? super d, Unit> lVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f143928e = eVar;
        this.f143929f = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f143928e, this.f143929f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String str;
        e eVar;
        e eVar2;
        l<d, Unit> lVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143927d;
        if (i14 == 0) {
            r.b(obj);
            pa2.b.f136781a.getClass();
            pa2.a aVarA = pa2.b.a.a();
            e eVar3 = this.f143928e;
            String str2 = eVar3.f143903c;
            boolean zG = s.g(aVarA.f136770b, "ecg");
            l<d, Unit> lVar2 = this.f143929f;
            if ((!zG || str2 == null) && (str = eVar3.f143903c) != null) {
                ra2.b bVar = eVar3.f143907g;
                this.f143924a = eVar3;
                this.f143925b = lVar2;
                this.f143926c = eVar3;
                this.f143927d = 1;
                obj = bVar.d(str, this);
                if (obj == aVar) {
                    return aVar;
                }
                eVar = eVar3;
                eVar2 = eVar;
                lVar = lVar2;
            } else {
                lVar2.invoke(null);
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        eVar = this.f143926c;
        lVar = this.f143925b;
        eVar2 = this.f143924a;
        r.b(obj);
        eVar.f143904d = (d) obj;
        wa2.b bVar2 = e.f143900h;
        Objects.toString(eVar2.f143904d);
        bVar2.getClass();
        lVar.invoke(eVar2.f143904d);
        return Unit.INSTANCE;
    }
}
