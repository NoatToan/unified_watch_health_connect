package bo2;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.room.a0;
import b21.s4;
import bm.y;
import e23.p;
import fo2.e0;
import fo2.s;
import lc.u0;
import o13.r;
import o13.t;
import o53.b0;
import o53.m0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps2.w;
import zn2.g1;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lbo2/e;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f19250d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f19252b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f19251a = o13.m.b(new y(13));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f19253c = o13.m.b(new s4(this, 19));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19255a;

        static {
            int[] iArr = new int[e0.a.values().length];
            try {
                iArr[e0.a.DELETE_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e0.a.DELETE_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e0.a.INITIALIZING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e0.a.INITIALIZATION_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e0.a.INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f19255a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$sendNotification$1", f = "AlipayAppletInstallationViewModel.kt", l = {278}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19256a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ hs2.f f19258c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(hs2.f fVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f19258c = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new c(this.f19258c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            hs2.d dVar;
            e eVar = e.this;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f19256a;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    w wVar = w.f140538a;
                    a aVar2 = e.f19250d;
                    long jB4 = eVar.B4();
                    wVar.getClass();
                    ps2.n nVarI = w.i(jB4);
                    if (nVarI == null || (dVar = nVarI.f140499b) == null) {
                        throw new RuntimeException("Cannot get PayDevice for ESN " + eVar.B4());
                    }
                    hs2.f fVar = this.f19258c;
                    this.f19256a = 1;
                    if (dVar.A(fVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (Throwable th3) {
                e.f19250d.f19254a.a().warn("Failed to notify device about the installation complete", th3);
            }
            return Unit.INSTANCE;
        }
    }

    public static final boolean x4(e eVar, e0.a aVar) {
        eVar.getClass();
        int i14 = aVar == null ? -1 : b.f19255a[aVar.ordinal()];
        if (i14 == -1) {
            return true;
        }
        if (i14 == 1) {
            return false;
        }
        if (i14 == 2) {
            kg.f.n("Failed to install applet");
            return false;
        }
        if (i14 == 3 || i14 == 4 || i14 == 5) {
            androidx.core.view.j.r(aVar, "Unexpected security domain state: ");
            return false;
        }
        u0.r();
        return false;
    }

    public static final boolean y4(e eVar, e0.a aVar) {
        eVar.getClass();
        int i14 = aVar == null ? -1 : b.f19255a[aVar.ordinal()];
        if (i14 == -1 || i14 == 1 || i14 == 2) {
            androidx.core.view.j.r(aVar, "Unexpected security domain state: ");
            return false;
        }
        if (i14 == 3) {
            return false;
        }
        if (i14 == 4) {
            kg.f.n("Failed to install applet");
            return false;
        }
        if (i14 == 5) {
            return true;
        }
        u0.r();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r7 == r10) goto L24;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0062 -> B:13:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object z4(e eVar, e23.l lVar, e23.l lVar2, v13.c cVar) {
        n nVar;
        e23.l lVar3;
        e23.l lVar4;
        eVar.getClass();
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f19355e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f19355e = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(eVar, cVar);
            }
        } else {
            nVar = new n(eVar, cVar);
        }
        Object objInvoke = nVar.f19353c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f19355e;
        if (i15 == 0) {
            r.b(objInvoke);
            nVar.f19351a = lVar;
            nVar.f19352b = lVar2;
            nVar.f19355e = 1;
            if (m0.b(5000L, nVar) != aVar) {
                e23.l lVar5 = lVar2;
                lVar3 = lVar;
                lVar4 = lVar5;
                nVar.f19351a = lVar3;
                nVar.f19352b = lVar4;
                nVar.f19355e = 2;
                objInvoke = lVar3.invoke(nVar);
            }
            return aVar;
        }
        if (i15 == 1) {
            lVar4 = nVar.f19352b;
            lVar3 = nVar.f19351a;
            r.b(objInvoke);
            nVar.f19351a = lVar3;
            nVar.f19352b = lVar4;
            nVar.f19355e = 2;
            objInvoke = lVar3.invoke(nVar);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lVar4 = nVar.f19352b;
            lVar3 = nVar.f19351a;
            r.b(objInvoke);
        }
        e23.l lVar6 = lVar3;
        lVar2 = lVar4;
        lVar = lVar6;
        e0 e0Var = (e0) objInvoke;
        if (((Boolean) lVar2.invoke(e0Var != null ? e0Var.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String() : null)).booleanValue()) {
            return Unit.INSTANCE;
        }
        nVar.f19351a = lVar;
        nVar.f19352b = lVar2;
        nVar.f19355e = 1;
        if (m0.b(5000L, nVar) != aVar) {
            e23.l lVar7 = lVar2;
            lVar3 = lVar;
            lVar4 = lVar7;
            nVar.f19351a = lVar3;
            nVar.f19352b = lVar4;
            nVar.f19355e = 2;
            objInvoke = lVar3.invoke(nVar);
        }
        return aVar;
    }

    public final sd2.f A4() {
        rd2.j jVar = rd2.f.a().f152045a;
        long jB4 = B4();
        jVar.getClass();
        sd2.f fVarI = rd2.j.i(jB4, null);
        if (fVarI != null) {
            return fVarI;
        }
        kg.f.n(a0.f(B4(), "No device(", ") record"));
        return null;
    }

    public final long B4() {
        return ((Number) this.f19253c.getValue()).longValue();
    }

    public final z0 C4() {
        return (z0) this.f19251a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D4(v13.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f19350c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f19350c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objG = mVar.f19348a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f19350c;
        boolean z14 = true;
        if (i15 == 0) {
            r.b(objG);
            g1 g1Var = C4().f205979a;
            long jB4 = B4();
            mVar.f19350c = 1;
            objG = g1Var.G(jB4, mVar, true);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objG);
        }
        s sVar = (s) objG;
        if (sVar != null && sVar.f73106f == zn2.y.INITIALIZED) {
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }

    public final void E4(hs2.f fVar) {
        fVar.getClass();
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        gl.b.I(aVarA, x53.b.f189152a, new c(fVar, null), 2);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbo2/e$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wr2.m f19254a;

        private a() {
            wr2.n nVar = o.f19356b.f19357a;
            nVar.getClass();
            this.f19254a = new wr2.m(nVar, "AlipayAppletInstallationViewModel");
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }
}
