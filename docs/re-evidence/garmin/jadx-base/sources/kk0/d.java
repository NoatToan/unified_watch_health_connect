package kk0;

import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ljk0/n;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.data.repository.GearRepositoryImpl$addImage$2", f = "GearRepositoryImpl.kt", l = {247}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.l<t13.d<? super c83.a0<jk0.n>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f105017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f105018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MultipartBody.Part f105019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h0 h0Var, String str, MultipartBody.Part part, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f105017b = h0Var;
        this.f105018c = str;
        this.f105019d = part;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f105017b, this.f105018c, this.f105019d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<jk0.n>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105016a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = this.f105017b.f105050a;
        this.f105016a = 1;
        Object objR = aVar2.r(this.f105018c, this.f105019d, this);
        return objR == aVar ? aVar : objR;
    }
}
