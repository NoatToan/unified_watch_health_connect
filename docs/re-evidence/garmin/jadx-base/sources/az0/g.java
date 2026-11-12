package az0;

import android.content.Context;
import c22.s1;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Laz0/h;", "<anonymous>", "(Lo53/b0;)Laz0/h;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.network.connectivity.ServerStatusRepo$fetchLocalizedMessage$2", f = "ServerStatusRepo.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g extends i implements p<b0, t13.d<? super h>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f13698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f13700c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, String str, Context context, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f13698a = fVar;
        this.f13699b = str;
        this.f13700c = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f13698a, this.f13699b, this.f13700c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super h> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        s1.f23251a.getClass();
        String strE = s1.e(this.f13700c);
        f fVar = this.f13698a;
        String str = this.f13699b;
        h hVarB = f.b(fVar, f.a(fVar, str, strE));
        return hVarB == null ? f.b(fVar, f.a(fVar, str, "en")) : hVarB;
    }
}
