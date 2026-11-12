package a91;

import c83.a0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import z70.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lz70/u;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.data.LanguageSelectionRepository$getShownLanguagePrompts$result$1", f = "LanguageSelectionRepository.kt", l = {82}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.l<t13.d<? super a0<z70.u>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f2159b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m mVar, t13.d<? super q> dVar) {
        super(1, dVar);
        this.f2159b = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new q(this.f2159b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<z70.u>> dVar) {
        return ((q) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f2158a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        j0 j0Var = this.f2159b.f2147b;
        this.f2158a = 1;
        Object objA = j0Var.a("personalized.message.supported.language.prompt.shown", this);
        return objA == aVar ? aVar : objA;
    }
}
