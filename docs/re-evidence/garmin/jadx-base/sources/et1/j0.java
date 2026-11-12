package et1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.screen.TrailDetailsScreenKt$TrailDetailsScreen$16$1", f = "TrailDetailsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pt1.o f65664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1<Boolean> f65665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1<Boolean> f65666c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65667a;

        static {
            int[] iArr = new int[vs1.i.values().length];
            try {
                iArr[vs1.i.NO_COMPATIBLE_DEVICES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vs1.i.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f65667a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(pt1.o oVar, p3.p1<Boolean> p1Var, p3.p1<Boolean> p1Var2, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f65664a = oVar;
        this.f65665b = p1Var;
        this.f65666c = p1Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j0(this.f65664a, this.f65665b, this.f65666c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        pt1.o oVar = this.f65664a;
        vs1.i iVar = oVar != null ? oVar.f140924v : null;
        int i14 = iVar == null ? -1 : a.f65667a[iVar.ordinal()];
        if (i14 == 1) {
            this.f65665b.setValue(Boolean.TRUE);
        } else if (i14 == 2) {
            this.f65666c.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
