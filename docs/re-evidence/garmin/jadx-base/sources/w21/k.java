package w21;

import d53.y;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.voicelogging.screen.VoiceDictationScreenKt$VoiceDictationScreen$4$1", f = "VoiceDictationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x21.c f181546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<String, Unit> f181547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f181548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f181549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f181550e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(x21.c cVar, e23.l<? super String, Unit> lVar, p1<Boolean> p1Var, p1<Boolean> p1Var2, p1<Boolean> p1Var3, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f181546a = cVar;
        this.f181547b = lVar;
        this.f181548c = p1Var;
        this.f181549d = p1Var2;
        this.f181550e = p1Var3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f181546a, this.f181547b, this.f181548c, this.f181549d, this.f181550e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x003e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        x21.c cVar = this.f181546a;
        String str = (String) cVar.f188492b.getF182175a();
        int length = str.length();
        e23.l<String, Unit> lVar = this.f181547b;
        if (length >= 1000) {
            p1<Boolean> p1Var = this.f181548c;
            if (m.i(p1Var)) {
                lVar.invoke(y.s0(1000, str));
            } else {
                lVar.invoke(y.s0(1000, str));
                Boolean bool = Boolean.TRUE;
                p1Var.setValue(bool);
                m.h(this.f181549d, false);
                cVar.f188496f.h();
                this.f181550e.setValue(bool);
            }
        } else {
            lVar.invoke(y.s0(1000, str));
        }
        return Unit.INSTANCE;
    }
}
