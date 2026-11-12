package hx0;

import o53.l1;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsViewModel$confirmCycle$1$1", f = "MenstrualCycleDetailsViewModel.kt", l = {233}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f86176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f86177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww0.l f86178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xw0.b f86179e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsViewModel$confirmCycle$1$1$1", f = "MenstrualCycleDetailsViewModel.kt", l = {235, 236}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f86180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l1 f86181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s f86182c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ww0.l f86183d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ xw0.b f86184e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l1 l1Var, s sVar, ww0.l lVar, xw0.b bVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f86181b = l1Var;
            this.f86182c = sVar;
            this.f86183d = lVar;
            this.f86184e = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f86181b, this.f86182c, this.f86183d, this.f86184e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
        
            if (r13 == r0) goto L22;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f86180a;
            s sVar = this.f86182c;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    l1 l1Var = this.f86181b;
                    if (l1Var != null) {
                        this.f86180a = 1;
                        if (l1Var.P(this) == aVar) {
                        }
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    throw new Exception("Server call failure");
                }
                sVar.f86149m.j(new cx0.a<>(null, null, null, false, 12, null));
                return Unit.INSTANCE;
                yw0.a aVar2 = sVar.f86137a;
                LocalDate localDateH = this.f86183d.getStartDate();
                xw0.b bVar = this.f86184e;
                this.f86180a = 2;
                obj = aVar2.e(localDateH, bVar, this);
            } catch (Throwable th3) {
                sVar.f86149m.j(new cx0.a<>(null, th3, null, false, 12, null));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(l1 l1Var, s sVar, ww0.l lVar, xw0.b bVar, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f86176b = l1Var;
        this.f86177c = sVar;
        this.f86178d = lVar;
        this.f86179e = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f86176b, this.f86177c, this.f86178d, this.f86179e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86175a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(this.f86176b, this.f86177c, this.f86178d, this.f86179e, null);
            this.f86175a = 1;
            if (ge1.b.Y(aVar2, this) == aVar) {
                return aVar;
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
