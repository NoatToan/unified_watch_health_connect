package a91;

import c83.a0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.data.LanguageSelectionRepository$setSelectedLanguage$2", f = "LanguageSelectionRepository.kt", l = {73}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f2166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2167c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(m mVar, String str, t13.d<? super t> dVar) {
        super(1, dVar);
        this.f2166b = mVar;
        this.f2167c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new t(this.f2166b, this.f2167c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((t) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f2165a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        w wVar = this.f2166b.f2146a;
        d91.w wVar2 = new d91.w(this.f2167c);
        this.f2165a = 1;
        Object objE = wVar.e(wVar2, this);
        return objE == aVar ? aVar : objE;
    }
}
