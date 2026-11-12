package hl1;

import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import ex2.w;
import gg1.v0;
import java.util.List;
import o53.b0;
import org.apache.commons.io.IOUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import uf2.r0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lhl1/v;", "Landroidx/lifecycle/u1;", "", "deviceId", "Lzf2/d;", "activityType", "<init>", "(JLzf2/d;)V", "a", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f84466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zf2.d f84467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f84468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f84469d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.SelectWorkoutViewModel$loadWorkouts$1", f = "SelectWorkoutViewModel.kt", l = {54, 66}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f84470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f84471b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = v.this.new b(dVar);
            bVar.f84471b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:26:0x00be  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a1, code lost:
        
            if (r1 == r0) goto L21;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            Object objD;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f84470a;
            v vVar = v.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                    objD = obj;
                }
                list = (List) objD;
                if (list != null) {
                    p2 p2Var = vVar.f84468c;
                    p2Var.k(null, u.a((u) p2Var.getValue(), false, false, i53.a.j(list), 2));
                } else {
                    p2 p2Var2 = vVar.f84468c;
                    p2Var2.k(null, u.a((u) p2Var2.getValue(), false, true, null, 4));
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            String str = (String) p13.u.H(da2.d.b().f58886a.f111646e.b(vVar.f84466a));
            if (str == null) {
                String strE = org.apache.commons.lang3.e.e(vVar.f84466a, "Cannot find mac addr for ");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.p(a2Var, "SelectWorkoutViewModel", strE);
                return Unit.INSTANCE;
            }
            w wVar = w.f67058a;
            Context context = (Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null);
            long j8 = vVar.f84466a;
            v0.T.getClass();
            String strL0 = d53.w.l0(v0.a.b().e(), IOUtils.DIR_SEPARATOR_UNIX);
            String strB = c22.b0.b(null);
            this.f84471b = null;
            this.f84470a = 1;
            if (wVar.c(context, j8, str, strL0, strB, this) != aVar) {
            }
            return aVar;
            r0 r0Var = (r0) zb0.k.b(r0.class, vVar.f84466a);
            if (r0Var != null) {
                zf2.d dVar = vVar.f84467b;
                this.f84471b = null;
                this.f84470a = 2;
                objD = r0Var.d(dVar, this);
            } else {
                list = null;
            }
            if (list != null) {
                p2 p2Var3 = vVar.f84468c;
                p2Var3.k(null, u.a((u) p2Var3.getValue(), false, false, i53.a.j(list), 2));
            } else {
                p2 p2Var4 = vVar.f84468c;
                p2Var4.k(null, u.a((u) p2Var4.getValue(), false, true, null, 4));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lhl1/u;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.SelectWorkoutViewModel$uiState$1", f = "SelectWorkoutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<r53.j<? super u>, t13.d<? super Unit>, Object> {
        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return v.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super u> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            v.this.x4();
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public v(long j8, zf2.d dVar) {
        dVar.getClass();
        this.f84466a = j8;
        this.f84467b = dVar;
        p2 p2VarA = q2.a(new u(false, false, null, 7, null));
        this.f84468c = p2VarA;
        r53.v vVar = new r53.v(new c(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f84469d = r53.s.K(vVar, aVarA, k2.a.f150706c, new u(false, false, null, 7, null));
    }

    public final void x4() {
        p2 p2Var = this.f84468c;
        p2Var.k(null, u.a((u) p2Var.getValue(), true, false, null, 4));
        ge1.b.T(v1.a(this), null, null, new b(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhl1/v$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
