package et1;

import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.screen.UserTrailReviewsScreenKt$UserTrailReviewsScreen$4$1$3$1$3$1", f = "UserTrailReviewsScreen.kt", l = {260}, m = "invokeSuspend", v = 2)
public final class j2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f65674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pt1.a0 f65675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e2.i0 f65676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f65677d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(pt1.a0 a0Var, e2.i0 i0Var, int i14, t13.d<? super j2> dVar) {
        super(2, dVar);
        this.f65675b = a0Var;
        this.f65676c = i0Var;
        this.f65677d = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j2(this.f65675b, this.f65676c, this.f65677d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f65674a;
        if (i14 == 0) {
            o13.r.b(obj);
            pt1.a0 a0Var = this.f65675b;
            Long l14 = a0Var.f140810h;
            if (l14 != null && l14.longValue() > 0) {
                Iterator<pt1.x> it = a0Var.f140806d.iterator();
                int i15 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i15 = -1;
                        break;
                    }
                    if (it.next().f141004a == l14.longValue()) {
                        break;
                    }
                    i15++;
                }
                if (i15 >= 0) {
                    this.f65674a = 1;
                    if (this.f65676c.l(i15 + 1, this.f65677d, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
