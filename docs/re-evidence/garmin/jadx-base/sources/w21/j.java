package w21;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.voicelogging.screen.VoiceDictationScreenKt$VoiceDictationScreen$3$1", f = "VoiceDictationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<Boolean, Unit> f181543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x21.c f181544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f181545c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(e23.l<? super Boolean, Unit> lVar, x21.c cVar, p1<Boolean> p1Var, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f181543a = lVar;
        this.f181544b = cVar;
        this.f181545c = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f181543a, this.f181544b, this.f181545c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        x21.c cVar = this.f181544b;
        boolean zBooleanValue = ((Boolean) cVar.f188491a.getF182175a()).booleanValue();
        p1<Boolean> p1Var = this.f181545c;
        this.f181543a.invoke(Boolean.valueOf(zBooleanValue && !m.i(p1Var)));
        if (m.i(p1Var) && ((Boolean) cVar.f188491a.getF182175a()).booleanValue()) {
            cVar.f188496f.h();
        }
        return Unit.INSTANCE;
    }
}
