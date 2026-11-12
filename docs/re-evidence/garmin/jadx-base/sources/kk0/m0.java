package kk0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.File;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Ljk0/i;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.data.repository.WebDataRepositoryImpl$readCachedBrandsModelsList$2", f = "WebDataRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m0 extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends jk0.i>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f105075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f105076b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(File file, t13.d<? super m0> dVar) {
        super(2, dVar);
        this.f105076b = file;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m0 m0Var = new m0(this.f105076b, dVar);
        m0Var.f105075a = obj;
        return m0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends jk0.i>> dVar) {
        return ((m0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        try {
            String strA = a23.e.a(this.f105076b, d53.c.f57666b);
            return (List) n63.b.f123892d.c(j63.a.b(jk0.i.INSTANCE.serializer()), strA);
        } catch (Exception e4) {
            a2 a2Var = a2.GEAR;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Failed to read cached brand/model list: ");
            i2.f36769a.getClass();
            i2.a.o(a2Var, strD);
            return null;
        }
    }
}
