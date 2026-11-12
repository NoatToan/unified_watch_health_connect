package ie0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.s;
import uy0.j;
import uy0.k;
import v13.e;
import v13.i;
import vb.h;
import z70.w;
import zd0.g1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lie0/a;", "Lz70/w;", "Luy0/j;", "bottomNavigationItemsUseCase", "<init>", "(Luy0/j;)V", "b", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f93070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<String> f93071b;

    /* JADX INFO: renamed from: ie0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.domain.watchers.BottomBarItemsPromoWatcher$1", f = "BottomBarItemsPromoWatcher.kt", l = {21}, m = "invokeSuspend", v = 2)
    public static final class C1777a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f93072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f93073b;

        /* JADX INFO: renamed from: ie0.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1778a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f93075a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f93076b;

            public C1778a(a aVar, b0 b0Var) {
                this.f93075a = aVar;
                this.f93076b = b0Var;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                List<String> list = (List) obj;
                a aVar = this.f93075a;
                if (aVar.f93071b == null) {
                    aVar.f93071b = list;
                    return Unit.INSTANCE;
                }
                i2.f36769a.getClass();
                i2.a.k(a2.PROMOTIONS, "BottomBarItemsPromoWatcher", "Bottom Navigation Items changed -> " + list);
                Object objW = ((g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null)).w(dVar);
                return objW == u13.a.COROUTINE_SUSPENDED ? objW : Unit.INSTANCE;
            }
        }

        public C1777a(t13.d<? super C1777a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C1777a c1777a = a.this.new C1777a(dVar);
            c1777a.f93073b = obj;
            return c1777a;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1777a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f93073b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f93072a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = a.this;
                r53.b bVarF = s.f(new k(aVar2.f93070a, null));
                C1778a c1778a = new C1778a(aVar2, b0Var);
                this.f93073b = null;
                this.f93072a = 1;
                if (bVarF.collect(c1778a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new b(null);
    }

    public a(j jVar) {
        jVar.getClass();
        this.f93070a = jVar;
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new C1777a(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lie0/a$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
