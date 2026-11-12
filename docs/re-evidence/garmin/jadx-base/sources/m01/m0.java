package m01;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ll01/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$getSettings$2", f = "NutritionRepositoryImpl.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR}, m = "invokeSuspend", v = 2)
public final class m0 extends v13.i implements e23.l<t13.d<? super c83.a0<l01.k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b63.o f115637c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(h hVar, b63.o oVar, t13.d<? super m0> dVar) {
        super(1, dVar);
        this.f115636b = hVar;
        this.f115637c = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m0(this.f115636b, this.f115637c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<l01.k>> dVar) {
        return ((m0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115635a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115636b.f115594a;
        fz0.c cVarA = fz0.d.a(this.f115637c);
        this.f115635a = 1;
        Object objS = bVar.s(cVarA, this);
        return objS == aVar ? aVar : objS;
    }
}
