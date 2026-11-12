package w21;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.voicelogging.screen.VoiceDictationScreenKt$VoiceDictationScreen$2$1", f = "VoiceDictationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x21.c f181539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f181540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f181541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f181542d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(x21.c cVar, e23.a<Unit> aVar, p1<Boolean> p1Var, p1<Boolean> p1Var2, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f181539a = cVar;
        this.f181540b = aVar;
        this.f181541c = p1Var;
        this.f181542d = p1Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f181539a, this.f181540b, this.f181541c, this.f181542d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        x21.c cVar = this.f181539a;
        if (((Boolean) cVar.f188495e.getF182175a()).booleanValue()) {
            m.j(this.f181541c, true);
            m.h(this.f181542d, false);
            this.f181540b.invoke();
            cVar.f188495e.setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
