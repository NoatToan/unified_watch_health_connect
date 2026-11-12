package vy0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.b2;
import r53.e2;
import r53.k2;
import uy0.h1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvy0/n;", "Landroidx/lifecycle/u1;", "Lty0/b;", "startDestinationItem", "Luy0/z;", "getNavigationItemDataUseCase", "Luy0/h1;", "handleMoreItemClickUseCase", "<init>", "(Lty0/b;Luy0/z;Luy0/h1;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f180751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f180752b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements r53.i<q.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f180753a;

        /* JADX INFO: renamed from: vy0.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3366a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f180754a;

            /* JADX INFO: renamed from: vy0.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.navigation.more.MoreFeatureViewModel$special$$inlined$map$1$2", f = "MoreFeatureViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C3367a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f180755a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f180756b;

                public C3367a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f180755a = obj;
                    this.f180756b |= Integer.MIN_VALUE;
                    return C3366a.this.emit(null, this);
                }
            }

            public C3366a(r53.j jVar) {
                this.f180754a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C3367a c3367a;
                if (dVar instanceof C3367a) {
                    c3367a = (C3367a) dVar;
                    int i14 = c3367a.f180756b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3367a.f180756b = i14 - Integer.MIN_VALUE;
                    } else {
                        c3367a = new C3367a(dVar);
                    }
                } else {
                    c3367a = new C3367a(dVar);
                }
                Object obj2 = c3367a.f180755a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3367a.f180756b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    q.a aVar2 = new q.a((List) obj);
                    c3367a.f180756b = 1;
                    if (this.f180754a.emit(aVar2, c3367a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public a(r53.i iVar) {
            this.f180753a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super q.a> jVar, t13.d dVar) {
            Object objCollect = this.f180753a.collect(new C3366a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isWheelchairModeEnabled", "Lvy0/q$a;", "availableItems", "Lvy0/d;", "<anonymous>", "(ZLvy0/q$a;)Lvy0/d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.navigation.more.MoreFeatureViewModel$uiState$1", f = "MoreFeatureViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.q<Boolean, q.a, t13.d<? super d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ boolean f180758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ q.a f180759b;

        public b(t13.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(Boolean bool, q.a aVar, t13.d<? super d> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            b bVar = new b(dVar);
            bVar.f180758a = zBooleanValue;
            bVar.f180759b = aVar;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean z14 = this.f180758a;
            q.a aVar = this.f180759b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return new d(z14, aVar);
        }
    }

    public n(ty0.b bVar, uy0.z zVar, h1 h1Var) {
        bVar.getClass();
        zVar.getClass();
        h1Var.getClass();
        this.f180751a = h1Var;
        f12.l.f68084a.getClass();
        e2 f68089c = f12.l.a.a().getF68089c();
        w9.a aVarA = v1.a(this);
        k2.a aVar = k2.f150703a;
        this.f180752b = r53.s.K(new r53.u1(r53.s.K(f68089c, aVarA, k2.a.a(aVar, 2), Boolean.valueOf(f12.l.a.a().B3())), r53.s.K(new a(zVar.a(bVar)), v1.a(this), k2.a.a(aVar, 2), new q.a(j0.f134944a)), new b(null)), v1.a(this), k2.a.a(aVar, 2), new d(false, null, 3, null));
    }
}
