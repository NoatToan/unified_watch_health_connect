package m01;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lf01/h;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$getNutritionMetadata$2", f = "NutritionRepositoryImpl.kt", l = {SyslogConstants.LOG_LOCAL6}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.l<t13.d<? super c83.a0<f01.h>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<String> f115576c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h hVar, List<String> list, t13.d<? super e0> dVar) {
        super(1, dVar);
        this.f115575b = hVar;
        this.f115576c = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e0(this.f115575b, this.f115576c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<f01.h>> dVar) {
        return ((e0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115574a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115575b.f115594a;
        this.f115574a = 1;
        Object objP = bVar.P(this.f115576c, this);
        return objP == aVar ? aVar : objP;
    }
}
