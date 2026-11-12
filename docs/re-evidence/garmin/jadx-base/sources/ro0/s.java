package ro0;

import android.content.Context;
import android.net.Uri;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zb0.n0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.help.ProductSupportScreenKt$ProductSupportScreen$2$1$1$1$1$1", f = "ProductSupportScreen.kt", l = {71}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f153883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f153884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bm2.c f153885c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, bm2.c cVar, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f153884b = context;
        this.f153885c = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f153884b, this.f153885c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f153883a;
        if (i14 == 0) {
            o13.r.b(obj);
            Uri uriE = n0.e(this.f153885c.f18942x);
            uriE.getClass();
            this.f153883a = 1;
            if (w.a(this.f153884b, uriE, (m12.m) KoinJavaComponent.get$default(m12.m.class, null, null, 6, null), this) == aVar) {
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
