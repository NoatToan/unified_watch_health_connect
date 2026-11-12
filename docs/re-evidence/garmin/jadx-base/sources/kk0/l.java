package kk0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.data.repository.GearRepositoryImpl$deleteImage$2", f = "GearRepositoryImpl.kt", l = {253}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f105067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f105068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f105069d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h0 h0Var, String str, String str2, t13.d<? super l> dVar) {
        super(1, dVar);
        this.f105067b = h0Var;
        this.f105068c = str;
        this.f105069d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l(this.f105067b, this.f105068c, this.f105069d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((l) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105066a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = this.f105067b.f105050a;
        this.f105066a = 1;
        Object objW = aVar2.w(this.f105068c, this.f105069d, this);
        return objW == aVar ? aVar : objW;
    }
}
