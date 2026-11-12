package kotlin;

import ch.qos.logback.core.net.SyslogConstants;
import e23.l;
import e23.p;
import h5.h2;
import o13.r;
import o53.k;
import p005kotlin.jvm.internal.w;
import q3.c;
import t13.d;
import u13.f;
import v13.e;
import v13.i;
import vb.h;
import x5.g0;
import x5.m0;
import x5.p0;
import x5.x;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li5/j2;", "methodSession", "", "<anonymous>", "(Li5/j2;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
@e(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {SyslogConstants.LOG_LOCAL7}, m = "invokeSuspend", v = 1)
public final class n0 extends i implements p<j2, d<?>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f91350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f91351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f91352c;

    @p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends w implements l<Throwable, p005kotlin.Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j2 f91353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o0 f91354b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j2 j2Var, o0 o0Var) {
            super(1);
            this.f91353a = j2Var;
            this.f91354b = o0Var;
        }

        @Override // e23.l
        public final p005kotlin.Unit invoke(Throwable th3) {
            j2 j2Var = this.f91353a;
            synchronized (j2Var.f91231c) {
                try {
                    j2Var.f91233e = true;
                    c<h2<x>> cVar = j2Var.f91232d;
                    h2<x>[] h2VarArr = cVar.f142356a;
                    int i14 = cVar.f142358c;
                    for (int i15 = 0; i15 < i14; i15++) {
                        x xVar = h2VarArr[i15].get();
                        if (xVar != null) {
                            xVar.a();
                        }
                    }
                    j2Var.f91232d.g();
                    p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            m0 m0Var = this.f91354b.f91362b;
            m0Var.f188887b.set(null);
            m0Var.f188886a.b();
            return p005kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, d<? super n0> dVar) {
        super(2, dVar);
        this.f91352c = o0Var;
    }

    @Override // v13.a
    public final d<p005kotlin.Unit> create(Object obj, d<?> dVar) {
        n0 n0Var = new n0(this.f91352c, dVar);
        n0Var.f91351b = obj;
        return n0Var;
    }

    @Override // e23.p
    public final Object invoke(j2 j2Var, d<?> dVar) {
        return ((n0) create(j2Var, dVar)).invokeSuspend(p005kotlin.Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f91350a;
        if (i14 == 0) {
            r.b(obj);
            j2 j2Var = (j2) this.f91351b;
            this.f91351b = j2Var;
            this.f91350a = 1;
            k kVar = new k(f.b(this), 1);
            kVar.q();
            o0 o0Var = this.f91352c;
            m0 m0Var = o0Var.f91362b;
            g0 g0Var = m0Var.f188886a;
            g0Var.e();
            m0Var.f188887b.set(new p0(m0Var, g0Var));
            kVar.r(new a(j2Var, o0Var));
            if (kVar.p() == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        o2.c.f();
        return null;
    }
}
