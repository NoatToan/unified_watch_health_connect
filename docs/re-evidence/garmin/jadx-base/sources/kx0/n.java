package kx0;

import o53.b0;
import o53.l1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleSettingsViewModel$getSettings$1$1", f = "MenstrualCycleSettingsViewModel.kt", l = {115}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f107075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f107076b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleSettingsViewModel$getSettings$1$1$1", f = "MenstrualCycleSettingsViewModel.kt", l = {120}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f107078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f107079c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f107079c = mVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f107079c, dVar);
            aVar.f107078b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f107078b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107077a;
            m mVar = this.f107079c;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    t13.g.a aVar2 = b0Var.getF195311f().get(l1.f129368i0);
                    aVar2.getClass();
                    o53.s sVar = new o53.s((l1) aVar2);
                    mVar.f107061d = new Long(((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).i(new m.b(mVar, sVar)));
                    this.f107078b = null;
                    this.f107077a = 1;
                    if (sVar.C(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                mVar.f107059b.j(new cx0.a<>(((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).getUserSettings(), null, null, false, 12, null));
            } catch (Throwable th3) {
                mVar.f107059b.j(new cx0.a<>(null, th3, null, false, 12, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f107076b = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f107076b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f107075a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(this.f107076b, null);
            this.f107075a = 1;
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
