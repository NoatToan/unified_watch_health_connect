package ie0;

import androidx.lifecycle.v;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;
import v13.e;
import v13.i;
import vb.h;
import z70.w;
import zd0.g1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lie0/c;", "Lz70/w;", "<init>", "()V", "b", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f93081a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.domain.watchers.NewsFeedSettingPromoWatcher$1", f = "NewsFeedSettingPromoWatcher.kt", l = {20}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f93082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f93083b;

        /* JADX INFO: renamed from: ie0.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1781a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f93085a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f93086b;

            public C1781a(c cVar, b0 b0Var) {
                this.f93085a = cVar;
                this.f93086b = b0Var;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                int iIntValue = ((Number) obj).intValue();
                c cVar = this.f93085a;
                Integer num = cVar.f93081a;
                if (num == null) {
                    cVar.f93081a = new Integer(iIntValue);
                } else if (iIntValue != num.intValue()) {
                    a2 a2Var = a2.PROMOTIONS;
                    String strH = am.j.h(iIntValue, "Following count: ");
                    i2.f36769a.getClass();
                    i2.a.k(a2Var, "NFSPromoWatcher", strH);
                    Object objW = ((g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null)).w(dVar);
                    return objW == u13.a.COROUTINE_SUSPENDED ? objW : Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = c.this.new a(dVar);
            aVar.f93083b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f93083b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f93082a;
            if (i14 == 0) {
                r.b(obj);
                r53.i iVarA = v.a(((iz0.a) KoinJavaComponent.get$default(iz0.a.class, null, null, 6, null)).a().f86479a.V3());
                C1781a c1781a = new C1781a(c.this, b0Var);
                this.f93083b = null;
                this.f93082a = 1;
                if (iVarA.collect(c1781a, this) == aVar) {
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

    public c() {
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new a(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lie0/c$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
