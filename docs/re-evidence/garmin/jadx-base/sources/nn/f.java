package nn;

import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.o2;
import r53.q2;
import r53.z1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Lnn/f;", "", "T", "Lnn/g;", "Lr53/z1;", "origin", "<init>", "(Lr53/z1;)V", "value", "(Ljava/lang/Object;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f<T> extends g<T> implements z1<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1<T> f126670b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.health.CMutableStateFlow", f = "FlowExtensions.kt", l = {29}, m = "collect", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f126671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f<T> f126672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f126673c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f<T> fVar, t13.d<? super a> dVar) {
            super(dVar);
            this.f126672b = fVar;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f126671a = obj;
            this.f126673c |= Integer.MIN_VALUE;
            return this.f126672b.collect(null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(T t7) {
        this((z1) q2.a(t7));
        t7.getClass();
    }

    @Override // nn.g, r53.d2
    public final List<T> a() {
        return this.f126670b.a();
    }

    @Override // r53.z1
    public final boolean b(T t7, T t14) {
        t7.getClass();
        t14.getClass();
        return this.f126670b.b(t7, t14);
    }

    @Override // r53.y1
    public final void c() {
        this.f126670b.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // nn.g, r53.i
    public final Object collect(r53.j<? super T> jVar, t13.d<?> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f126673c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f126673c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f126671a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f126673c;
        if (i15 == 0) {
            r.b(obj);
            aVar.f126673c = 1;
            if (this.f126670b.collect(jVar, aVar) == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        o2.c.f();
        return null;
    }

    @Override // r53.y1
    public final boolean d(T t7) {
        t7.getClass();
        return this.f126670b.d(t7);
    }

    @Override // r53.y1, r53.j
    public final Object emit(T t7, t13.d<? super Unit> dVar) {
        return this.f126670b.emit(t7, dVar);
    }

    @Override // r53.y1
    public final o2<Integer> f() {
        return this.f126670b.f();
    }

    @Override // nn.g, r53.o2, r53.z1
    public final T getValue() {
        return this.f126670b.getValue();
    }

    @Override // r53.z1
    public final void setValue(T t7) {
        t7.getClass();
        this.f126670b.setValue(t7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(z1<T> z1Var) {
        super(z1Var);
        z1Var.getClass();
        this.f126670b = z1Var;
    }
}
