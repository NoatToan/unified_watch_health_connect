package kk0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.data.repository.GearRepositoryImpl$reorderCollectionImages$2", f = "GearRepositoryImpl.kt", l = {292}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f105005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f105006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<String> f105007d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(h0 h0Var, String str, List<String> list, t13.d<? super b0> dVar) {
        super(1, dVar);
        this.f105005b = h0Var;
        this.f105006c = str;
        this.f105007d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b0(this.f105005b, this.f105006c, this.f105007d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((b0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105004a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = this.f105005b.f105050a;
        this.f105004a = 1;
        Object objU = aVar2.u(this.f105006c, this.f105007d, this);
        return objU == aVar ? aVar : objU;
    }
}
