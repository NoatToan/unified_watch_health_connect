package qh1;

import c22.n3;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lc22/n3;", "<anonymous>", "(Lo53/b0;)Lc22/n3;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.IndexScale2AdjustBodyCompositionViewModel$getUserMuscleMassUom$2", f = "IndexScale2AdjustBodyCompositionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<b0, t13.d<? super n3>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f144778a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p pVar, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f144778a = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f144778a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super n3> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f144778a.getClass();
        n3 n3Var = n3.KILOGRAM;
        String strA0 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).a0("key_pair_custom_metrics_muscle_mass_unit");
        return strA0.length() > 0 ? n3.valueOf(strA0) : n3Var;
    }
}
