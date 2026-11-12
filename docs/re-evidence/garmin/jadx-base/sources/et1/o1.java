package et1;

import i3.mc;
import i3.pc;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.screen.TrailsMainScreenKt$TrailsBottomSheetMainScreen$4$2$1$5$1$1", f = "TrailsMainScreen.kt", l = {375, 377}, m = "invokeSuspend", v = 2)
public final class o1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f65726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i3.a1 f65727b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(i3.a1 a1Var, t13.d<? super o1> dVar) {
        super(2, dVar);
        this.f65727b = a1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o1(this.f65727b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r6.f(r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r6.b(r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        return r0;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f65726a;
        if (i14 == 0) {
            o13.r.b(obj);
            i3.a1 a1Var = this.f65727b;
            pc pcVarC = a1Var.f87409a.c();
            pc pcVar = pc.Expanded;
            mc mcVar = a1Var.f87409a;
            if (pcVarC == pcVar) {
                this.f65726a = 1;
            } else {
                this.f65726a = 2;
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
