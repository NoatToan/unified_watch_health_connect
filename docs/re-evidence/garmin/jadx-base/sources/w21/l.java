package w21;

import android.content.Context;
import c.q;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.voicelogging.screen.VoiceDictationScreenKt$VoiceDictationScreen$5$1", f = "VoiceDictationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f181551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f181552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y21.a f181553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q<String, Boolean> f181554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f181555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x21.c f181556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f181557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f181558h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p1<Boolean> p1Var, Context context, y21.a aVar, q<String, Boolean> qVar, e23.a<Unit> aVar2, x21.c cVar, p1<Boolean> p1Var2, p1<Boolean> p1Var3, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f181551a = p1Var;
        this.f181552b = context;
        this.f181553c = aVar;
        this.f181554d = qVar;
        this.f181555e = aVar2;
        this.f181556f = cVar;
        this.f181557g = p1Var2;
        this.f181558h = p1Var3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f181551a, this.f181552b, this.f181553c, this.f181554d, this.f181555e, this.f181556f, this.f181557g, this.f181558h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        p1<Boolean> p1Var = this.f181551a;
        m.h(p1Var, true);
        int iCheckSelfPermission = a7.b.checkSelfPermission(this.f181552b, "android.permission.RECORD_AUDIO");
        p1<Boolean> p1Var2 = this.f181557g;
        if (iCheckSelfPermission == 0) {
            m.k(this.f181555e, p1Var2, p1Var, this.f181556f);
        } else if (this.f181553c.f194230g) {
            m.j(p1Var2, true);
            m.h(p1Var, false);
            this.f181558h.setValue(Boolean.TRUE);
        } else {
            this.f181554d.a("android.permission.RECORD_AUDIO", null);
        }
        return Unit.INSTANCE;
    }
}
