package w21;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.m2;
import s1.j1;
import u1.d2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.voicelogging.screen.VoiceDictationScreenKt$VoiceDictationContent$2$1", f = "VoiceDictationScreen.kt", l = {364}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f181533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d2 f181534b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d2 d2Var, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f181534b = d2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f181534b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f181533a;
        if (i14 == 0) {
            r.b(obj);
            d2 d2Var = this.f181534b;
            int intValue = d2Var.f167437e.getIntValue();
            this.f181533a = 1;
            Object objA = m2.a(d2Var, intValue - d2Var.f167433a.getIntValue(), new j1(0.0f, 0.0f, null, 7, null), this);
            if (objA != obj2) {
                objA = Unit.INSTANCE;
            }
            if (objA == obj2) {
                return obj2;
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
