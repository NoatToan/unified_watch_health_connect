package sz0;

import android.content.Context;
import androidx.lifecycle.h1;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.NotificationsFragment$observeViewModel$2", f = "NotificationsFragment.kt", l = {657}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f161522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f161523b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.notifications.NotificationsFragment$observeViewModel$2$1", f = "NotificationsFragment.kt", l = {658}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f161524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u f161525b;

        /* JADX INFO: renamed from: sz0.x$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3045a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ u f161526a;

            /* JADX INFO: renamed from: sz0.x$a$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C3046a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f161527a;

                static {
                    int[] iArr = new int[fw.p.values().length];
                    try {
                        iArr[fw.p.LOADING.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[fw.p.ERROR.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[fw.p.SUCCESS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f161527a = iArr;
                }
            }

            public C3045a(u uVar) {
                this.f161526a = uVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                Integer num;
                ue0.n nVar;
                fw.m mVar = (fw.m) obj;
                fw.p pVar = mVar != null ? mVar.f73769b : null;
                int i14 = pVar == null ? -1 : C3046a.f161527a[pVar.ordinal()];
                if (i14 != -1) {
                    u uVar = this.f161526a;
                    if (i14 == 1) {
                        g22.e.l(uVar);
                    } else if (i14 == 2) {
                        int i15 = u.E;
                        uVar.d7().f161426n.setValue(null);
                        i0.a aVar = (i0.a) mVar.f73770c;
                        if (aVar == null || (num = aVar.f161431b) == null || num.intValue() != 400) {
                            g22.e.c(uVar);
                        } else {
                            Context contextRequireContext = uVar.requireContext();
                            contextRequireContext.getClass();
                            g.a(contextRequireContext, uVar.C);
                        }
                        g22.e.f(uVar);
                    } else {
                        if (i14 != 3) {
                            u0.r();
                            return null;
                        }
                        int i16 = u.E;
                        uVar.d7().f161426n.setValue(null);
                        g22.e.f(uVar);
                        i0.a aVar2 = (i0.a) mVar.f73770c;
                        if (aVar2 != null && (nVar = aVar2.f161430a) != null) {
                            i0 i0VarD7 = uVar.d7();
                            Context contextRequireContext2 = uVar.requireContext();
                            contextRequireContext2.getClass();
                            i0VarD7.B4(contextRequireContext2, nVar);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u uVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f161525b = uVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f161525b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f161524a;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = u.E;
                u uVar = this.f161525b;
                p2 p2Var = uVar.d7().f161427o;
                C3045a c3045a = new C3045a(uVar);
                this.f161524a = 1;
                if (p2Var.collect(c3045a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            o2.c.f();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(u uVar, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f161523b = uVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f161523b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f161522a;
        if (i14 == 0) {
            o13.r.b(obj);
            u uVar = this.f161523b;
            androidx.lifecycle.n0 viewLifecycleOwner = uVar.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
            a aVar2 = new a(uVar, null);
            this.f161522a = 1;
            if (h1.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
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
