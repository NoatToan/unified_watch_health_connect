package sg0;

import android.content.Context;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ChildAccountScreenKt$ChildAccountScreen$3$1", f = "ChildAccountScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f159139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<fw.m<ve0.a>> f159140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f159141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f159142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f159143e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f159144a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f159144a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(f0 f0Var, x3<fw.m<ve0.a>> x3Var, Context context, p1<Boolean> p1Var, p1<Boolean> p1Var2, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f159139a = f0Var;
        this.f159140b = x3Var;
        this.f159141c = context;
        this.f159142d = p1Var;
        this.f159143e = p1Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f159139a, this.f159140b, this.f159141c, this.f159142d, this.f159143e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ve0.a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        x3<fw.m<ve0.a>> x3Var = this.f159140b;
        if (x3Var.getF182175a() == null) {
            return Unit.INSTANCE;
        }
        fw.m<ve0.a> f182175a = x3Var.getF182175a();
        fw.p pVar = f182175a != null ? f182175a.f73769b : null;
        int i14 = pVar == null ? -1 : a.f159144a[pVar.ordinal()];
        f0 f0Var = this.f159139a;
        if (i14 == 1) {
            f0Var.f159088g.setValue(null);
            fw.m<ve0.a> f182175a2 = x3Var.getF182175a();
            if (f182175a2 != null && (aVar = f182175a2.f73770c) != null) {
                aVar.b(this.f159141c);
                return Unit.INSTANCE;
            }
        } else if (i14 == 2) {
            fw.m<ve0.a> f182175a3 = x3Var.getF182175a();
            if ((f182175a3 != null ? f182175a3.f73771d : null) instanceof fw.t) {
                this.f159142d.setValue(Boolean.TRUE);
            } else {
                this.f159143e.setValue(Boolean.TRUE);
            }
            f0Var.f159088g.setValue(null);
        }
        return Unit.INSTANCE;
    }
}
