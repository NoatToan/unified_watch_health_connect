package et1;

import i3.mc;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.screen.UserTrailReviewsScreenKt$UserTrailReviewsScreen$2$1", f = "UserTrailReviewsScreen.kt", l = {137, 140}, m = "invokeSuspend", v = 2)
public final class g2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f65626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pt1.a0 f65627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mc f65628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f65629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3.p1<pt1.n> f65630e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(pt1.a0 a0Var, mc mcVar, e23.a<Unit> aVar, p3.p1<pt1.n> p1Var, t13.d<? super g2> dVar) {
        super(2, dVar);
        this.f65627b = a0Var;
        this.f65628c = mcVar;
        this.f65629d = aVar;
        this.f65630e = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g2(this.f65627b, this.f65628c, this.f65629d, this.f65630e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r1.d(r5) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r1.g(r5) == r0) goto L18;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f65626a;
        pt1.a0 a0Var = this.f65627b;
        if (i14 == 0) {
            o13.r.b(obj);
            boolean zG = p005kotlin.jvm.internal.s.g(a0Var.f140809g, pt1.n.b.f140894a);
            mc mcVar = this.f65628c;
            if (zG) {
                this.f65626a = 1;
            } else {
                this.f65626a = 2;
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            this.f65629d.invoke();
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        this.f65630e.setValue(a0Var.f140809g);
        return Unit.INSTANCE;
    }
}
