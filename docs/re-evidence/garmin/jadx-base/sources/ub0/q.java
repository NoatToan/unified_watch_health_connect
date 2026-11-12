package ub0;

import e2.i0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.tutorials.components.TutorialPagerIndicatorKt$TutorialPagerIndicator$1$1", f = "TutorialPagerIndicator.kt", l = {66, 68}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f169781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f169782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f169783c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(i0 i0Var, int i14, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f169782b = i0Var;
        this.f169783c = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f169782b, this.f169783c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (e2.i0.f(r7, r5 - 3, r6) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (e2.i0.f(r7, r5, r6) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        return r0;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169781a;
        if (i14 == 0) {
            o13.r.b(obj);
            i0 i0Var = this.f169782b;
            int iH = i0Var.h();
            int i15 = iH + 3;
            int i16 = this.f169783c;
            if (i16 > i15) {
                this.f169781a = 1;
            } else if (i16 <= iH + 1) {
                int i17 = i16 - 1;
                if (i17 < 0) {
                    i17 = 0;
                }
                this.f169781a = 2;
            }
        } else {
            if (i14 != 1 && i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
