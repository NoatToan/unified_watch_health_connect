package kk0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.data.repository.GearRepositoryImpl$setGearStatus$2", f = "GearRepositoryImpl.kt", l = {220}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f105029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f105030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk0.p f105031d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h0 h0Var, String str, jk0.p pVar, t13.d<? super e0> dVar) {
        super(1, dVar);
        this.f105029b = h0Var;
        this.f105030c = str;
        this.f105031d = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e0(this.f105029b, this.f105030c, this.f105031d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((e0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105028a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = this.f105029b.f105050a;
        String string = this.f105031d.toString();
        this.f105028a = 1;
        Object objV = aVar2.v(this.f105030c, string, this);
        return objV == aVar ? aVar : objV;
    }
}
