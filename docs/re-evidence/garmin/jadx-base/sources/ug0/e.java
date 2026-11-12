package ug0;

import android.content.Context;
import fw.t;
import i3.mc;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.viewable.ViewableAccountsModalKt$ViewableAccountsModal$3$1", f = "ViewableAccountsModal.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f170577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<fw.m<ve0.a>> f170578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f170579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f170580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mc f170581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f170582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f170583g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.viewable.ViewableAccountsModalKt$ViewableAccountsModal$3$1$1$1", f = "ViewableAccountsModal.kt", l = {100}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f170584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f170585b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f170585b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f170585b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f170584a;
            if (i14 == 0) {
                r.b(obj);
                this.f170584a = 1;
                if (this.f170585b.d(this) == aVar) {
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

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f170586a;

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
            f170586a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, x3<fw.m<ve0.a>> x3Var, Context context, b0 b0Var, mc mcVar, p1<Boolean> p1Var, p1<Boolean> p1Var2, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f170577a = qVar;
        this.f170578b = x3Var;
        this.f170579c = context;
        this.f170580d = b0Var;
        this.f170581e = mcVar;
        this.f170582f = p1Var;
        this.f170583g = p1Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f170577a, this.f170578b, this.f170579c, this.f170580d, this.f170581e, this.f170582f, this.f170583g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ve0.a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        x3<fw.m<ve0.a>> x3Var = this.f170578b;
        if (x3Var.getF182175a() == null) {
            return Unit.INSTANCE;
        }
        fw.m<ve0.a> f182175a = x3Var.getF182175a();
        fw.p pVar = f182175a != null ? f182175a.f73769b : null;
        int i14 = pVar == null ? -1 : b.f170586a[pVar.ordinal()];
        q qVar = this.f170577a;
        if (i14 == 1) {
            qVar.f170632f.setValue(null);
            fw.m<ve0.a> f182175a2 = x3Var.getF182175a();
            if (f182175a2 != null && (aVar = f182175a2.f73770c) != null) {
                aVar.b(this.f170579c);
                ge1.b.T(this.f170580d, null, null, new a(this.f170581e, null), 3);
                return Unit.INSTANCE;
            }
        } else if (i14 == 2) {
            fw.m<ve0.a> f182175a3 = x3Var.getF182175a();
            if ((f182175a3 != null ? f182175a3.f73771d : null) instanceof t) {
                this.f170582f.setValue(Boolean.TRUE);
            } else {
                this.f170583g.setValue(Boolean.TRUE);
            }
            qVar.f170632f.setValue(null);
        }
        return Unit.INSTANCE;
    }
}
