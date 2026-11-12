package tm0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lzp0/f;", "<anonymous>", "(Lo53/b0;)Lzp0/f;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.feed.create.CreatePostViewModel$processImageInformation$2", f = "CreatePostViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super zp0.f>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f165407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f165408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f165409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bq0.k f165410d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l lVar, Context context, bq0.k kVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f165408b = lVar;
        this.f165409c = context;
        this.f165410d = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f165408b, this.f165409c, this.f165410d, dVar);
        oVar.f165407a = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super zp0.f> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        try {
            bq0.c cVar = this.f165408b.f165397c;
            Context context = this.f165409c;
            bq0.k kVar = this.f165410d;
            int i14 = bq0.c.f19481c;
            return cVar.a(context, kVar, null);
        } catch (Exception e4) {
            a2 a2Var = a2.GENERAL;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Invalid image information: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "CreatePostViewModel", strD);
            return null;
        }
    }
}
