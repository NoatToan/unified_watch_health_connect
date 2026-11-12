package mm0;

import androidx.lifecycle.t0;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lmm0/z;", "Landroidx/lifecycle/u1;", "Lca1/d$b;", "Lym0/a;", "groupRepo", "<init>", "(Lym0/a;)V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z extends u1 implements ca1.d.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f119597d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ym0.a f119598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GroupDTO f119599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f119600c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lda1/b;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.ViewGroupImageViewModel$flagImage$1$1", f = "ViewGroupImageViewModel.kt", l = {33, 40}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<t0<v2<? extends da1.b>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f119601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f119602b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f119604d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ea1.a f119605e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f119606f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lda1/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.ViewGroupImageViewModel$flagImage$1$1$result$1", f = "ViewGroupImageViewModel.kt", l = {34}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super v2<? extends da1.b>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f119607a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f119608b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f119609c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f119610d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ea1.a f119611e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f119612f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(z zVar, String str, ea1.a aVar, String str2, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f119609c = zVar;
                this.f119610d = str;
                this.f119611e = aVar;
                this.f119612f = str2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f119609c, this.f119610d, this.f119611e, this.f119612f, dVar);
                aVar.f119608b = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends da1.b>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                b0 b0Var = (b0) this.f119608b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f119607a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    ym0.a aVar2 = this.f119609c.f119598a;
                    da1.a aVar3 = new da1.a(this.f119611e, ea1.b.GROUP_PROFILE.f63645b, this.f119612f);
                    this.f119608b = b0Var;
                    this.f119607a = 1;
                    aVar2.getClass();
                    obj = f0.J(aVar2, new ym0.m(aVar2, this.f119610d, aVar3, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                v2 v2Var = (v2) obj;
                if (v2Var instanceof v2.a) {
                    String strG = a0.g(((v2.a) v2Var).f47384b, "Report image failed ");
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.f(a2Var, "ViewGroupImageViewModel", strG);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ea1.a aVar, String str2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f119604d = str;
            this.f119605e = aVar;
            this.f119606f = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = z.this.new b(this.f119604d, this.f119605e, this.f119606f, dVar);
            bVar.f119602b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(t0<v2<? extends da1.b>> t0Var, t13.d<? super Unit> dVar) {
            return ((b) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r0.emit((com.garmin.android.apps.connectmobile.v2) r13, r12) == r1) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            t0 t0Var = (t0) this.f119602b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f119601a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(z.this, this.f119604d, this.f119605e, this.f119606f, null);
            this.f119602b = t0Var;
            this.f119601a = 1;
            obj = ge1.b.e0(bVar, aVar2, this);
            if (obj != aVar) {
            }
            return aVar;
            this.f119602b = null;
            this.f119601a = 2;
        }
    }

    static {
        new a(null);
    }

    public z(ym0.a aVar) {
        aVar.getClass();
        this.f119598a = aVar;
        this.f119600c = o13.m.b(new mh1.q(8));
    }

    @Override // ca1.d.b
    public final androidx.lifecycle.s0<v2<da1.b>> A7(ea1.a aVar, String str) {
        String str2;
        aVar.getClass();
        GroupDTO groupDTO = this.f119599b;
        if (groupDTO == null || (str2 = groupDTO.f31558a) == null) {
            return null;
        }
        return androidx.lifecycle.m.a(v1.a(this).f183565a, new b(str2, aVar, str, null), 2);
    }

    @Override // ca1.d.b
    public final void w1() {
        ((y0) this.f119600c.getValue()).m(Unit.INSTANCE);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmm0/z$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ z(ym0.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            ym0.a.f197886f.getClass();
            aVar = ym0.a.C3709a.a();
        }
        this(aVar);
    }
}
