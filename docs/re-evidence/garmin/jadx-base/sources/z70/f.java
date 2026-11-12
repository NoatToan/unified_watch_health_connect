package z70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.data.DefaultPromosPreferences$getShouldIgnorePairedDeviceValidator$1", f = "PromosPreferences.kt", l = {220}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<q53.t<? super Boolean>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f202808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f202809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f202810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, t13.d<? super f> dVar2) {
        super(2, dVar2);
        this.f202810c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f202810c, dVar);
        fVar.f202809b = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(q53.t<? super Boolean> tVar, t13.d<? super Unit> dVar) {
        return ((f) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        q53.t tVar = (q53.t) this.f202809b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f202808a;
        if (i14 == 0) {
            o13.r.b(obj);
            d dVar = this.f202810c;
            tVar.i(Boolean.valueOf(dVar.r()));
            e eVar = new e(dVar, tVar, 0);
            dVar.f202789b.registerOnSharedPreferenceChangeListener(eVar);
            z10.d dVar2 = new z10.d(6, dVar, eVar);
            this.f202809b = null;
            this.f202808a = 1;
            if (q53.r.a(tVar, dVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
