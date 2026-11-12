package qa2;

import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.exportablereports.model.ReportsDataStore$ackReport$1", f = "ReportsDataStore.kt", l = {220}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f143908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f143909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f143910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l<Boolean, Unit> f143911d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(e eVar, l<? super Boolean, Unit> lVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f143910c = eVar;
        this.f143911d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f143910c, this.f143911d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        l<Boolean, Unit> lVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143909b;
        if (i14 == 0) {
            r.b(obj);
            pa2.b.f136781a.getClass();
            pa2.a aVarA = pa2.b.a.a();
            e eVar = this.f143910c;
            String str = eVar.f143903c;
            boolean zG = s.g(aVarA.f136770b, "ecg");
            l<Boolean, Unit> lVar2 = this.f143911d;
            if (!zG || str == null) {
                String str2 = eVar.f143903c;
                if (str2 != null) {
                    ra2.b bVar = eVar.f143907g;
                    this.f143908a = lVar2;
                    this.f143909b = 1;
                    obj = bVar.a(str2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    lVar = lVar2;
                } else {
                    lVar2.invoke(null);
                }
            } else {
                lVar2.invoke(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        lVar = this.f143908a;
        r.b(obj);
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        lVar.invoke(bool);
        return Unit.INSTANCE;
    }
}
