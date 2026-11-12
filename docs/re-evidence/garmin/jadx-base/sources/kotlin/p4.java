package kotlin;

import androidx.lifecycle.k0;
import androidx.lifecycle.n0;
import e23.p;
import java.util.ArrayList;
import lc.u0;
import o13.q;
import o13.r;
import o53.b0;
import o53.c0;
import o53.d0;
import o53.j;
import o53.k;
import p005kotlin.jvm.internal.r0;
import p3.a1;
import p3.e2;
import p3.g1;
import p3.s2;
import p3.u2;
import p3.v2;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li5/p4;", "Landroidx/lifecycle/k0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p4 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f91385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f91386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s2 f91387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0<u2> f91388d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91389a;

        static {
            int[] iArr = new int[androidx.lifecycle.b0.a.values().length];
            try {
                iArr[androidx.lifecycle.b0.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.b0.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.lifecycle.b0.a.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.lifecycle.b0.a.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.lifecycle.b0.a.ON_PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.lifecycle.b0.a.ON_RESUME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[androidx.lifecycle.b0.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f91389a = iArr;
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {379}, m = "invokeSuspend", v = 1)
    public static final class b extends i implements p<b0, d<? super p005kotlin.Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f91390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0<u2> f91391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s2 f91392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n0 f91393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p4 f91394e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r0<u2> r0Var, s2 s2Var, n0 n0Var, p4 p4Var, d<? super b> dVar) {
            super(2, dVar);
            this.f91391b = r0Var;
            this.f91392c = s2Var;
            this.f91393d = n0Var;
            this.f91394e = p4Var;
        }

        @Override // v13.a
        public final d<p005kotlin.Unit> create(Object obj, d<?> dVar) {
            return new b(this.f91391b, this.f91392c, this.f91393d, this.f91394e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super p005kotlin.Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(p005kotlin.Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f91390a;
            p4 p4Var = this.f91394e;
            n0 n0Var = this.f91393d;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    u2 u2Var = this.f91391b.f105810a;
                    s2 s2Var = this.f91392c;
                    if (u2Var != null) {
                        u2Var.f91586b = c0.a(s2Var.f135297x);
                    }
                    this.f91390a = 1;
                    s2Var.getClass();
                    Object objE0 = ge1.b.e0(s2Var.f135274a, new u2(s2Var, new v2(s2Var, null), g1.a(getF157466b()), null), this);
                    if (objE0 != obj2) {
                        objE0 = p005kotlin.Unit.INSTANCE;
                    }
                    if (objE0 != obj2) {
                        objE0 = p005kotlin.Unit.INSTANCE;
                    }
                    if (objE0 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                n0Var.getF158016a().d(p4Var);
                return p005kotlin.Unit.INSTANCE;
            } catch (Throwable th3) {
                n0Var.getF158016a().d(p4Var);
                throw th3;
            }
        }
    }

    public p4(b0 b0Var, e2 e2Var, s2 s2Var, r0<u2> r0Var) {
        this.f91385a = b0Var;
        this.f91386b = e2Var;
        this.f91387c = s2Var;
        this.f91388d = r0Var;
    }

    @Override // androidx.lifecycle.k0
    public final void onStateChanged(n0 n0Var, androidx.lifecycle.b0.a aVar) {
        boolean z14;
        j<p005kotlin.Unit> jVarC = null;
        switch (a.f91389a[aVar.ordinal()]) {
            case 1:
                ge1.b.T(this.f91385a, null, d0.UNDISPATCHED, new b(this.f91388d, this.f91387c, n0Var, this, null), 1);
                return;
            case 2:
                e2 e2Var = this.f91386b;
                if (e2Var != null) {
                    a1 a1Var = e2Var.f135072b;
                    synchronized (a1Var.f135030a) {
                        try {
                            synchronized (a1Var.f135030a) {
                                z14 = a1Var.f135033d;
                            }
                            if (!z14) {
                                ArrayList arrayList = a1Var.f135031b;
                                a1Var.f135031b = a1Var.f135032c;
                                a1Var.f135032c = arrayList;
                                a1Var.f135033d = true;
                                int size = arrayList.size();
                                for (int i14 = 0; i14 < size; i14++) {
                                    d dVar = (d) arrayList.get(i14);
                                    int i15 = q.f128596b;
                                    dVar.resumeWith(p005kotlin.Unit.INSTANCE);
                                }
                                arrayList.clear();
                                p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                s2 s2Var = this.f91387c;
                synchronized (s2Var.f135276c) {
                    if (s2Var.f135293t) {
                        s2Var.f135293t = false;
                        jVarC = s2Var.C();
                    }
                    break;
                }
                if (jVarC != null) {
                    int i16 = q.f128596b;
                    ((k) jVarC).resumeWith(p005kotlin.Unit.INSTANCE);
                    return;
                }
                return;
            case 3:
                s2 s2Var2 = this.f91387c;
                synchronized (s2Var2.f135276c) {
                    s2Var2.f135293t = true;
                    p005kotlin.Unit unit2 = p005kotlin.Unit.INSTANCE;
                }
                return;
            case 4:
                this.f91387c.A();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                u0.r();
                return;
        }
    }
}
