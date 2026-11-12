package w21;

import e23.p;
import j20.x;
import j23.t;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import s1.j1;
import s1.n;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.voicelogging.screen.VoiceDictationScreenKt$ListeningBadge$2$1", f = "VoiceDictationScreen.kt", l = {567}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f181528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f181529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f181530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f181531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1.b<Float, n> f181532e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z14, float f14, float f15, s1.b<Float, n> bVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f181529b = z14;
        this.f181530c = f14;
        this.f181531d = f15;
        this.f181532e = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f181529b, this.f181530c, this.f181531d, this.f181532e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f181528a;
        if (i14 == 0) {
            r.b(obj);
            boolean z14 = this.f181529b;
            float fD = this.f181530c;
            if (z14) {
                fD = t.d(x.a(1.0f, fD, t.d(this.f181531d, 0.0f, 1.0f), fD), 0.0f, 1.0f);
            }
            Float f14 = new Float(fD);
            j1 j1VarC = s1.l.c(4, 0.7f, 350.0f, null);
            this.f181528a = 1;
            if (s1.b.c(this.f181532e, f14, j1VarC, null, this, 12) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
