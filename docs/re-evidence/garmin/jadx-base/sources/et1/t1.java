package et1;

import com.google.mlkit.common.MlKitException;
import i3.mc;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.screen.TrailsMainScreenKt$TrailsBottomSheetMainScreen$handleBottomSheetChange$1$1", f = "TrailsMainScreen.kt", l = {198, 200, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "invokeSuspend", v = 2)
public final class t1 extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f65880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pt1.c f65881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3.a1 f65882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pt1.a f65883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(pt1.c cVar, i3.a1 a1Var, pt1.a aVar, t13.d<? super t1> dVar) {
        super(1, dVar);
        this.f65881b = cVar;
        this.f65882c = a1Var;
        this.f65883d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new t1(this.f65881b, this.f65882c, this.f65883d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((t1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (r6.d(r5) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r6.b(r5) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r6.f(r5) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        return r0;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f65880a;
        if (i14 == 0) {
            o13.r.b(obj);
            boolean z14 = this.f65881b.f140817b;
            i3.a1 a1Var = this.f65882c;
            if (z14) {
                mc mcVar = a1Var.f87409a;
                this.f65880a = 1;
            } else {
                kt1.a aVar2 = this.f65883d.f140798a;
                if (aVar2 == kt1.a.LOADING || aVar2 == kt1.a.NEARBY_TRAILS) {
                    mc mcVar2 = a1Var.f87409a;
                    this.f65880a = 2;
                } else {
                    mc mcVar3 = a1Var.f87409a;
                    this.f65880a = 3;
                }
            }
        } else {
            if (i14 != 1 && i14 != 2 && i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
