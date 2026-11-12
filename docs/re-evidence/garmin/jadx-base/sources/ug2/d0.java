package ug2;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.main.MainViewKt$MainView$1$1", f = "MainView.kt", l = {231}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f170751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.n0 f170752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f170753c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r0 f170754a;

        /* JADX INFO: renamed from: ug2.d0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3183a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f170755a;

            static {
                int[] iArr = new int[androidx.lifecycle.b0.a.values().length];
                try {
                    iArr[androidx.lifecycle.b0.a.ON_RESUME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.lifecycle.b0.a.ON_PAUSE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f170755a = iArr;
            }
        }

        public a(r0 r0Var) {
            this.f170754a = r0Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            int i14 = C3183a.f170755a[((androidx.lifecycle.b0.a) obj).ordinal()];
            r0 r0Var = this.f170754a;
            if (i14 != 1) {
                if (i14 == 2 && r0Var.f170943v) {
                    of2.b bVar = (of2.b) r0Var.B4().f71478b.f131778g.getValue();
                    if (bVar != null) {
                        mf2.h hVar = bVar.f131725d;
                        zg2.c.f204692a.getClass();
                        zg2.c.d("Analytics", "Live Activity is in background");
                        hVar.f118311f.add(new mf2.h.e.a());
                        hVar.f118312g.add(mf2.h.a.C2246a.f118317a);
                        ArrayList arrayList = hVar.f118313h;
                        mf2.h.c.a aVar = mf2.h.c.a.f118323a;
                        arrayList.add(aVar);
                        hVar.f118314i.add(aVar);
                    }
                    r0Var.f170943v = false;
                }
            } else if (!r0Var.f170943v) {
                mf2.h hVarE = r0Var.B4().e();
                if (hVarE != null) {
                    ArrayList arrayList2 = hVarE.f118312g;
                    if (!(p13.h0.n0(arrayList2) instanceof mf2.h.a.b)) {
                        zg2.c.f204692a.getClass();
                        zg2.c.d("Analytics", "LiveActivity opened");
                        arrayList2.add(mf2.h.a.b.f118318a);
                    }
                }
                r0Var.f170943v = true;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(androidx.lifecycle.n0 n0Var, r0 r0Var, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f170752b = n0Var;
        this.f170753c = r0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d0(this.f170752b, this.f170753c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170751a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.i<androidx.lifecycle.b0.a> iVarA = androidx.lifecycle.l0.a(this.f170752b.getF158016a());
            a aVar2 = new a(this.f170753c);
            this.f170751a = 1;
            if (iVarA.collect(aVar2, this) == aVar) {
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
