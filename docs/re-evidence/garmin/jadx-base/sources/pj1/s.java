package pj1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.t1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import c22.s3;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectionTermsActivity;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import f20.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import lc.u0;
import m20.m0;
import m20.n0;
import m20.p0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lpj1/s;", "Lpj1/e;", "Lyj1/m;", "configuration", "Lhl/a;", "screenAccessRole", "<init>", "(Lyj1/m;Lhl/a;)V", "c", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends pj1.e {

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final /* synthetic */ int f137969j1 = 0;
    public boolean A;
    public List<l20.a> B;
    public final w0 C;
    public final w0 D;
    public final w0<g3<yj1.k>> E;
    public final w0 F;
    public final w0 H0;
    public List<ue0.h> I;
    public final w0 I0;
    public final y0<String> J0;
    public final y0 K0;
    public final y0<w61.f<o13.p<Integer, Integer>>> L0;
    public final y0 M0;
    public final y0<w61.f<Unit>> N0;
    public final y0 O0;
    public final ArrayList P;
    public final y0<yj1.e> P0;
    public final y0 Q0;
    public final y0<w61.f<wj1.a>> R0;
    public final y0 S0;
    public final y0<Boolean> T;
    public final y0<w61.f<o13.p<sd2.f, Integer>>> T0;
    public final y0 U0;
    public final y0<Boolean> V0;
    public final y0 W0;
    public final y0 X;
    public final y0<w61.f<Long>> X0;
    public final y0<List<sd2.f>> Y;
    public final y0 Y0;
    public final y0 Z;
    public final o13.t Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final y0<w61.f<g3<yj1.i>>> f137970a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final y0 f137971b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final y0<Boolean> f137972c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final y0 f137973d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final o13.t f137974e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final o13.t f137975f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final o13.t f137976g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final w0 f137977h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f137978i1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final y0 f137979k0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yj1.m f137980p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hl.a f137981q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f137982r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f137983t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final yj1.n f137984v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Long f137985w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f137986x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f137987y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f137988z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.SafetyFeaturesViewModel$1", f = "SafetyFeaturesViewModel.kt", l = {258, 259, 262, 267}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public vi1.b f137989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f137990b;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return s.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0049  */
        /* JADX WARN: Code duplicated, block: B:26:0x0066  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        
            if (r9 == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
        
            if (r7.z4(r9, r8) == r0) goto L29;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z14;
            vi1.b bVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f137990b;
            s sVar = s.this;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f137990b = 1;
                if (sVar.x4(this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 == 2) {
                    o13.r.b(obj);
                    z14 = sVar.f137911m;
                    bVar = sVar.f137903e;
                    if (z14) {
                        tj1.h hVar = (tj1.h) sVar.f137899a.getValue();
                        this.f137989a = bVar;
                        this.f137990b = 3;
                        obj = hVar.b(this);
                    } else {
                        bVar.m(null);
                        hl.a aVar2 = sVar.f137981q;
                        this.f137989a = null;
                        this.f137990b = 4;
                    }
                    return aVar;
                }
                if (i14 == 3) {
                    bVar = this.f137989a;
                    o13.r.b(obj);
                    bVar.m(Boolean.valueOf(obj instanceof v2.b));
                    hl.a aVar3 = sVar.f137981q;
                    this.f137989a = null;
                    this.f137990b = 4;
                } else {
                    if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
            }
            return Unit.INSTANCE;
            this.f137990b = 2;
            if (sVar.A4(this) != aVar) {
                z14 = sVar.f137911m;
                bVar = sVar.f137903e;
                if (z14) {
                    tj1.h hVar2 = (tj1.h) sVar.f137899a.getValue();
                    this.f137989a = bVar;
                    this.f137990b = 3;
                    obj = hVar2.b(this);
                } else {
                    bVar.m(null);
                    hl.a aVar4 = sVar.f137981q;
                    this.f137989a = null;
                    this.f137990b = 4;
                }
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.SafetyFeaturesViewModel$2", f = "SafetyFeaturesViewModel.kt", l = {272, 278}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f137992a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return s.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        
            if (r4.z4(r8, r7) == r0) goto L21;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f137992a;
            s sVar = s.this;
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
            re0.o oVar = (re0.o) sVar.f137902d.getValue();
            long j8 = ((hl.a.b) sVar.f137981q).f84252b;
            this.f137992a = 1;
            obj = oVar.m(j8, this);
            if (obj != aVar) {
            }
            return aVar;
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                sVar.I = (List) ((v2.b) v2Var).f47386a;
            } else if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            sVar.T.j(Boolean.TRUE);
            sVar.f5();
            hl.a aVar2 = sVar.f137981q;
            this.f137992a = 2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f137994a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f137994a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f137994a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f137994a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.SafetyFeaturesViewModel$validateUserPhoneNumbers$1", f = "SafetyFeaturesViewModel.kt", l = {1463, 1495}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f137995a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f137997c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f137998d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f137997c = str;
            this.f137998d = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return s.this.new e(this.f137997c, this.f137998d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x0124  */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
        
            if (r2 == r1) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x013a, code lost:
        
            if (r2 == r1) goto L44;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objJ;
            String str;
            Object objJ2;
            g3<yj1.i> g3VarA;
            g3<yj1.i> g3VarA2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f137995a;
            yj1.i iVar = null;
            s sVar = s.this;
            if (i14 == 0) {
                o13.r.b(obj);
                sVar.f137970a1.j(new w61.f<>(g3.a.c(g3.f35298f)));
                String str2 = this.f137997c;
                if (str2.length() <= 0) {
                    str = this.f137998d;
                    if (str.length() > 0) {
                        n0 n0Var = (n0) sVar.f137974e1.getValue();
                        this.f137995a = 2;
                        n0Var.getClass();
                        objJ2 = f0.J(n0Var, new m0(str, n0Var, null), this);
                    }
                    return Unit.INSTANCE;
                }
                n0 n0Var2 = (n0) sVar.f137974e1.getValue();
                this.f137995a = 1;
                n0Var2.getClass();
                objJ = f0.J(n0Var2, new m0(str2, n0Var2, null), this);
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                objJ = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objJ2 = obj;
            }
            v2 v2Var = (v2) objJ2;
            if (v2Var instanceof v2.b) {
                p0 p0Var = (p0) ((v2.b) v2Var).f47386a;
                Boolean valid = p0Var.getValid();
                Boolean bool = Boolean.TRUE;
                boolean z14 = p005kotlin.jvm.internal.s.g(valid, bool) && p005kotlin.jvm.internal.s.g(p0Var.getCanReceiveText(), bool);
                int i15 = s.f137969j1;
                sVar.m5(false, z14);
                if (p005kotlin.jvm.internal.s.g(p0Var.getValid(), bool) && p005kotlin.jvm.internal.s.g(p0Var.getCanReceiveText(), bool)) {
                    yj1.i iVar2 = (yj1.i) sVar.Z0.getValue();
                    iVar2.getClass();
                    p0Var.getClass();
                    iVar2.f197553b = p0Var;
                }
                y0<w61.f<g3<yj1.i>>> y0Var = sVar.f137970a1;
                g3.a aVar2 = g3.f35298f;
                w61.f<g3<yj1.i>> fVarD = y0Var.d();
                if (fVarD != null && (g3VarA2 = fVarD.a()) != null) {
                    iVar = g3VarA2.f35301b;
                }
                yj1.i iVarJ5 = s.j5(iVar, p0Var, false);
                aVar2.getClass();
                y0Var.j(new w61.f<>(g3.a.d(iVarJ5)));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                int i16 = s.f137969j1;
                sVar.m5(false, false);
                v2.a aVar3 = (v2.a) v2Var;
                sVar.f137970a1.j(new w61.f<>(g3.a.a(g3.f35298f, String.valueOf(aVar3.f47384b), aVar3.f47383a, new yj1.i(new p0(null, null, null, null, Boolean.FALSE, null, null, 111, null), null, 2, null), null, 8)));
            }
            return Unit.INSTANCE;
            v2 v2Var2 = (v2) objJ;
            if (v2Var2 instanceof v2.b) {
                p0 p0Var2 = (p0) ((v2.b) v2Var2).f47386a;
                Boolean valid2 = p0Var2.getValid();
                Boolean bool2 = Boolean.TRUE;
                boolean z15 = p005kotlin.jvm.internal.s.g(valid2, bool2) && p005kotlin.jvm.internal.s.g(p0Var2.getCanReceiveText(), bool2);
                int i17 = s.f137969j1;
                sVar.m5(true, z15);
                if (p005kotlin.jvm.internal.s.g(p0Var2.getValid(), bool2) && p005kotlin.jvm.internal.s.g(p0Var2.getCanReceiveText(), bool2)) {
                    yj1.i iVar3 = (yj1.i) sVar.Z0.getValue();
                    iVar3.getClass();
                    p0Var2.getClass();
                    iVar3.f197552a = p0Var2;
                }
                y0<w61.f<g3<yj1.i>>> y0Var2 = sVar.f137970a1;
                g3.a aVar4 = g3.f35298f;
                w61.f<g3<yj1.i>> fVarD2 = y0Var2.d();
                yj1.i iVarJ6 = s.j5((fVarD2 == null || (g3VarA = fVarD2.a()) == null) ? null : g3VarA.f35301b, p0Var2, true);
                aVar4.getClass();
                y0Var2.j(new w61.f<>(g3.a.d(iVarJ6)));
            } else {
                if (!(v2Var2 instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                int i18 = s.f137969j1;
                sVar.m5(true, false);
                v2.a aVar5 = (v2.a) v2Var2;
                sVar.f137970a1.j(new w61.f<>(g3.a.a(g3.f35298f, String.valueOf(aVar5.f47384b), aVar5.f47383a, new yj1.i(new p0(null, null, null, null, Boolean.FALSE, null, null, 111, null), null, 2, null), null, 8)));
            }
            str = this.f137998d;
            if (str.length() > 0) {
                n0 n0Var3 = (n0) sVar.f137974e1.getValue();
                this.f137995a = 2;
                n0Var3.getClass();
                objJ2 = f0.J(n0Var3, new m0(str, n0Var3, null), this);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new c(null);
    }

    public s(yj1.m mVar, hl.a aVar) {
        tj1.e eVar;
        Boolean assistancePlusEnabled;
        mVar.getClass();
        aVar.getClass();
        this.f137980p = mVar;
        this.f137981q = aVar;
        this.f137982r = s3.b();
        this.f137983t = mVar.f197568a;
        this.f137984v = mVar.f197570c;
        this.f137985w = mVar.f197569b;
        g3<tj1.e> g3VarD = C4().d();
        final int i14 = 0;
        this.f137986x = (g3VarD == null || (eVar = g3VarD.f35301b) == null || (assistancePlusEnabled = eVar.getAssistancePlusEnabled()) == null) ? false : assistancePlusEnabled.booleanValue();
        this.B = j0.f134944a;
        this.C = t1.a(C4(), new e23.l(this) { // from class: pj1.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f137958b;

            {
                this.f137958b = this;
            }

            /* JADX WARN: Code duplicated, block: B:142:0x0215  */
            /* JADX WARN: Code duplicated, block: B:146:0x0221  */
            /* JADX WARN: Code duplicated, block: B:152:0x0247  */
            /* JADX WARN: Code duplicated, block: B:208:0x0306  */
            /* JADX WARN: Code duplicated, block: B:244:0x0385 A[PHI: r14
              0x0385: PHI (r14v17 boolean) = (r14v16 boolean), (r14v20 boolean) binds: [B:243:0x0383, B:235:0x0368] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:308:0x0442  */
            /* JADX WARN: Code duplicated, block: B:417:0x038a A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:419:0x032f A[SYNTHETIC] */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                Boolean assistancePlusEnabled2;
                l20.r userContactsDTO;
                List<l20.a> listF;
                l20.r userContactsDTO2;
                List<l20.a> listF2;
                Boolean assistancePlusEnabled3;
                ArrayList arrayList;
                ArrayList arrayList2;
                boolean z14;
                String strK0;
                List listN0;
                boolean z15;
                boolean z16;
                boolean z17;
                boolean z18;
                l20.r userContactsDTO3;
                l20.q selfUserContactDTO;
                ArrayList arrayList3;
                boolean z19;
                boolean z24;
                boolean z25;
                l20.q selfUserContactDTO2;
                ArrayList arrayList4;
                ArrayList arrayList5;
                boolean z26;
                boolean z27;
                boolean z28;
                boolean z29;
                l20.r userContactsDTO4;
                List<l20.a> listF3;
                l20.r userContactsDTO5;
                int i15 = i14;
                s sVar = this.f137958b;
                switch (i15) {
                    case 0:
                        boolean zBooleanValue = false;
                        g3 g3Var = (g3) obj;
                        int i16 = s.f137969j1;
                        tj1.e eVar2 = (tj1.e) g3Var.f35301b;
                        boolean zBooleanValue2 = (eVar2 == null || (assistancePlusEnabled3 = eVar2.getAssistancePlusEnabled()) == null) ? false : assistancePlusEnabled3.booleanValue();
                        List listT = (eVar2 == null || (userContactsDTO2 = eVar2.getUserContactsDTO()) == null || (listF2 = userContactsDTO2.f()) == null) ? j0.f134944a : ge1.b.t(listF2);
                        Iterable<l20.a> iterableT = (eVar2 == null || (userContactsDTO = eVar2.getUserContactsDTO()) == null || (listF = userContactsDTO.f()) == null) ? j0.f134944a : ge1.b.t(listF);
                        if (eVar2 != null && (assistancePlusEnabled2 = eVar2.getAssistancePlusEnabled()) != null) {
                            zBooleanValue = assistancePlusEnabled2.booleanValue();
                        }
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        for (l20.a aVar2 : iterableT) {
                            if (aVar2.D()) {
                                if (arrayList7.isEmpty()) {
                                    arrayList7.add(new yj1.f.d(R.string.confirmed));
                                }
                                new yj1.f.b(null, 0, 0, null, false, null, 63, null);
                                GarminConnectMobileApp.f28685g.getClass();
                                arrayList7.add(yj1.f.b.a(aVar2, new e0(GarminConnectMobileApp.a.a()), zBooleanValue, com.garmin.android.apps.connectmobile.contacts.model.a.ACCEPTED));
                            } else if (aVar2.d()) {
                                if (arrayList9.isEmpty()) {
                                    arrayList9.add(new yj1.f.d(R.string.declined));
                                }
                                new yj1.f.b(null, 0, 0, null, false, null, 63, null);
                                GarminConnectMobileApp.f28685g.getClass();
                                arrayList9.add(yj1.f.b.a(aVar2, new e0(GarminConnectMobileApp.a.a()), zBooleanValue, com.garmin.android.apps.connectmobile.contacts.model.a.DECLINED));
                            } else {
                                if (arrayList8.isEmpty()) {
                                    arrayList8.add(new yj1.f.d(R.string.unconfirmed));
                                }
                                new yj1.f.b(null, 0, 0, null, false, null, 63, null);
                                GarminConnectMobileApp.f28685g.getClass();
                                arrayList8.add(yj1.f.b.a(aVar2, new e0(GarminConnectMobileApp.a.a()), zBooleanValue, com.garmin.android.apps.connectmobile.contacts.model.a.UNCONFIRMED));
                            }
                        }
                        if (!arrayList9.isEmpty()) {
                            arrayList9.add(new yj1.f.c(R.string.any_requests_will_not_be_sent));
                        }
                        arrayList6.addAll(arrayList7);
                        arrayList6.addAll(arrayList8);
                        arrayList6.addAll(arrayList9);
                        yj1.g gVar = new yj1.g(zBooleanValue2, listT, eVar2, false, arrayList6, 8, null);
                        if (g3Var.f35300a == fw.p.SUCCESS) {
                            int size = sVar.B.size();
                            List<l20.a> list = gVar.f197543b;
                            if (size > list.size()) {
                                List<yj1.f> list2 = gVar.f197546e;
                                list2.getClass();
                                gVar = new yj1.g(gVar.f197542a, list, gVar.f197544c, true, list2);
                            }
                            sVar.B = gVar.f197543b;
                        }
                        return new g3(g3Var.f35300a, gVar, g3Var.f35302c, null, g3Var.f35304e);
                    case 1:
                        g3 g3Var2 = (g3) obj;
                        int i17 = s.f137969j1;
                        fw.p pVar = g3Var2.f35300a;
                        tj1.e eVar3 = (tj1.e) g3Var2.f35301b;
                        vi1.b bVar = sVar.f137903e;
                        hl.a aVar3 = sVar.f137981q;
                        if (eVar3 == null || (userContactsDTO4 = eVar3.getUserContactsDTO()) == null || (listF3 = userContactsDTO4.f()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList();
                            for (Object obj2 : listF3) {
                                if (ge1.b.Q((l20.a) obj2)) {
                                    arrayList.add(obj2);
                                }
                            }
                        }
                        if (arrayList != null) {
                            arrayList2 = new ArrayList();
                            for (Object obj3 : arrayList) {
                                l20.a aVar4 = (l20.a) obj3;
                                if (sVar.f137982r) {
                                    List<l20.c> listZ = aVar4.z();
                                    if (listZ == null) {
                                        z26 = false;
                                    } else {
                                        if (!listZ.isEmpty()) {
                                            Iterator<T> it = listZ.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    l20.c cVar = (l20.c) it.next();
                                                    if (cVar.getConfirmationStatus() == com.garmin.android.apps.connectmobile.contacts.model.a.ACCEPTED || cVar.getConfirmationStatus() == com.garmin.android.apps.connectmobile.contacts.model.a.PENDING) {
                                                        z26 = false;
                                                    }
                                                }
                                            }
                                        }
                                        z26 = true;
                                    }
                                    List<l20.c> listR = aVar4.r();
                                    if (listR != null) {
                                        if (!listR.isEmpty()) {
                                            Iterator<T> it3 = listR.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    l20.c cVar2 = (l20.c) it3.next();
                                                    if (cVar2.getConfirmationStatus() == com.garmin.android.apps.connectmobile.contacts.model.a.ACCEPTED || cVar2.getConfirmationStatus() == com.garmin.android.apps.connectmobile.contacts.model.a.PENDING) {
                                                    }
                                                }
                                            }
                                        }
                                        z27 = true;
                                        if (z26 || !z27) {
                                            arrayList2.add(obj3);
                                        }
                                    }
                                    z27 = false;
                                    if (z26) {
                                    }
                                    arrayList2.add(obj3);
                                } else {
                                    List<l20.c> listZ2 = aVar4.z();
                                    if (listZ2 == null || listZ2.isEmpty()) {
                                        z28 = false;
                                    } else {
                                        Iterator<T> it4 = listZ2.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                z28 = false;
                                            } else if (((l20.c) it4.next()).getConfirmationStatus() != com.garmin.android.apps.connectmobile.contacts.model.a.ACCEPTED) {
                                                z28 = true;
                                            }
                                        }
                                    }
                                    List<l20.c> listR2 = aVar4.r();
                                    if (listR2 == null || listR2.isEmpty()) {
                                        z29 = false;
                                    } else {
                                        Iterator<T> it5 = listR2.iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                z29 = false;
                                            } else if (((l20.c) it5.next()).getConfirmationStatus() != com.garmin.android.apps.connectmobile.contacts.model.a.ACCEPTED) {
                                                z29 = true;
                                            }
                                        }
                                    }
                                    if (!z28 && !z29) {
                                        arrayList2.add(obj3);
                                    }
                                }
                            }
                        } else {
                            arrayList2 = null;
                        }
                        if (!(eVar3 != null ? p005kotlin.jvm.internal.s.g(eVar3.getAssistancePlusEnabled(), Boolean.TRUE) : false)) {
                            if (arrayList == null && (!arrayList.isEmpty())) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14 || arrayList2 == null || (listN0 = h0.N0(arrayList2, new u())) == null) {
                                strK0 = null;
                            } else {
                                strK0 = h0.k0(listN0, null, null, null, new p40.h(9), 31);
                            }
                        } else if (arrayList != null && (arrayList.isEmpty() ^ true)) {
                            if (arrayList2 != null) {
                                arrayList5 = new ArrayList();
                                for (Object obj4 : arrayList2) {
                                    List<l20.c> listZ3 = ((l20.a) obj4).z();
                                    if (listZ3 != null && listZ3.isEmpty()) {
                                        arrayList5.add(obj4);
                                    }
                                }
                            } else {
                                arrayList5 = null;
                            }
                            strK0 = arrayList5 != null && arrayList5.isEmpty() ? h0.k0(h0.N0(arrayList2, new t()), null, null, null, new p40.h(8), 31) : "";
                        } else {
                            if (arrayList == null) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                strK0 = null;
                            } else {
                                strK0 = null;
                            }
                        }
                        if (arrayList != null && (arrayList.isEmpty() ^ true)) {
                            if (arrayList2 != null) {
                                arrayList4 = new ArrayList();
                                for (Object obj5 : arrayList2) {
                                    List<l20.c> listZ4 = ((l20.a) obj5).z();
                                    if (listZ4 != null && listZ4.isEmpty()) {
                                        arrayList4.add(obj5);
                                    }
                                }
                            } else {
                                arrayList4 = null;
                            }
                            if (arrayList4 != null && arrayList4.isEmpty()) {
                                Iterator it6 = arrayList2.iterator();
                                while (it6.hasNext()) {
                                    List<l20.c> listZ5 = ((l20.a) it6.next()).z();
                                    if (listZ5 != null) {
                                        for (l20.c cVar3 : listZ5) {
                                            GarminConnectMobileApp.f28685g.getClass();
                                            if (!gl1.d.K(cVar3, new e0(GarminConnectMobileApp.a.a()))) {
                                                strK0 = "";
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        String str = strK0;
                        if (!(eVar3 != null && d0.i(eVar3, false))) {
                            if (eVar3 != null ? p005kotlin.jvm.internal.s.g(eVar3.getAssistancePlusEnabled(), Boolean.FALSE) : false) {
                                l20.r userContactsDTO6 = eVar3.getUserContactsDTO();
                                z15 = (userContactsDTO6 == null || (selfUserContactDTO2 = userContactsDTO6.getSelfUserContactDTO()) == null || !d0.k(selfUserContactDTO2)) ? false : true;
                            }
                        }
                        if (eVar3 != null ? p005kotlin.jvm.internal.s.g(eVar3.getAssistancePlusEnabled(), Boolean.FALSE) : false) {
                            if (arrayList != null && (arrayList.isEmpty() ^ true)) {
                                arrayList3 = new ArrayList();
                                for (Object obj6 : arrayList) {
                                    l20.a aVar5 = (l20.a) obj6;
                                    List<l20.c> listZ6 = aVar5.z();
                                    Integer numValueOf = listZ6 != null ? Integer.valueOf(listZ6.size()) : null;
                                    numValueOf.getClass();
                                    if (numValueOf.intValue() > 0) {
                                        List<l20.c> listZ7 = aVar5.z();
                                        if (listZ7 != null) {
                                            z19 = true;
                                            z25 = cq0.k.a(listZ7);
                                            if (!z25) {
                                                z24 = z19;
                                            }
                                            if (z24) {
                                                arrayList3.add(obj6);
                                            }
                                        } else {
                                            z19 = true;
                                        }
                                        if (!z25) {
                                            z24 = z19;
                                        }
                                        if (z24) {
                                            arrayList3.add(obj6);
                                        }
                                    } else {
                                        z19 = true;
                                    }
                                    List<l20.c> listR3 = aVar5.r();
                                    Integer numValueOf2 = listR3 != null ? Integer.valueOf(listR3.size()) : null;
                                    numValueOf2.getClass();
                                    if (numValueOf2.intValue() > 0) {
                                        z24 = z19;
                                    } else {
                                        z24 = false;
                                    }
                                    if (z24) {
                                        arrayList3.add(obj6);
                                    }
                                }
                            } else {
                                arrayList3 = null;
                            }
                            z16 = true;
                            z17 = !(arrayList3 == null || arrayList3.isEmpty()) && z15;
                        } else {
                            z16 = true;
                            z17 = true;
                        }
                        boolean z34 = (!(eVar3 != null ? p005kotlin.jvm.internal.s.g(eVar3.getAssistancePlusEnabled(), Boolean.TRUE) : false) || sVar.M4()) ? z16 : false;
                        hl.a.c cVar4 = hl.a.c.f84256b;
                        boolean z35 = (p005kotlin.jvm.internal.s.g(aVar3, cVar4) && sVar.f137911m) ? z16 : false;
                        boolean zG = eVar3 != null ? p005kotlin.jvm.internal.s.g(eVar3.getAssistancePlusEnabled(), Boolean.TRUE) : false;
                        String emergencyNotes = (eVar3 == null || (userContactsDTO3 = eVar3.getUserContactsDTO()) == null || (selfUserContactDTO = userContactsDTO3.getSelfUserContactDTO()) == null) ? null : selfUserContactDTO.getEmergencyNotes();
                        boolean z36 = (z15 && z34) ? z16 : false;
                        boolean z37 = (p005kotlin.jvm.internal.s.g(aVar3, cVar4) && bVar.l()) ? z16 : false;
                        boolean z38 = (p005kotlin.jvm.internal.s.g(aVar3, cVar4) && bVar.e()) ? z16 : false;
                        if (p005kotlin.jvm.internal.s.g(aVar3, cVar4)) {
                            Map<zb0.u0, vg1.t> map = zb0.n0.f203577a;
                            if (bo1.a.a().c().t()) {
                                z18 = z16;
                            } else {
                                z18 = false;
                            }
                        } else {
                            z18 = false;
                        }
                        return new g3(pVar, new yj1.l(z35, zG, emergencyNotes, z36, str, z37, z38, z17, z18), g3Var2.f35302c, null, g3Var2.f35304e);
                    default:
                        g3 g3Var3 = (g3) obj;
                        int i18 = s.f137969j1;
                        fw.p pVar2 = g3Var3.f35300a;
                        tj1.e eVar4 = (tj1.e) g3Var3.f35301b;
                        vi1.b bVar2 = sVar.f137903e;
                        hl.a aVar6 = sVar.f137981q;
                        Boolean assistancePlusEnabled4 = eVar4 != null ? eVar4.getAssistancePlusEnabled() : null;
                        l20.q selfUserContactDTO3 = (eVar4 == null || (userContactsDTO5 = eVar4.getUserContactsDTO()) == null) ? null : userContactsDTO5.getSelfUserContactDTO();
                        boolean z39 = aVar6 instanceof hl.a.b;
                        return new g3(pVar2, new yj1.h(assistancePlusEnabled4, selfUserContactDTO3, p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b) && bVar2.e(), z39 ? null : bVar2.c(), z39 ? null : bVar2.g()), null, null, null, 16, null);
                }
            }
        });
        w0 w0VarA = t1.a(C4(), new p40.h(10));
        this.D = w0VarA;
        w0<g3<yj1.k>> w0Var = new w0<>();
        this.E = w0Var;
        this.F = w0Var;
        Boolean bool = Boolean.FALSE;
        y0<Boolean> y0Var = new y0<>(bool);
        this.T = y0Var;
        this.X = y0Var;
        y0<List<sd2.f>> y0Var2 = new y0<>();
        this.Y = y0Var2;
        this.Z = y0Var2;
        y0 y0Var3 = new y0();
        this.f137979k0 = y0Var3;
        final int i15 = 1;
        w0 w0VarA2 = t1.a(C4(), new e23.l(this) { // from class: pj1.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f137958b;

            {
                this.f137958b = this;
            }

            /* JADX WARN: Code duplicated, block: B:142:0x0215  */
            /* JADX WARN: Code duplicated, block: B:146:0x0221  */
            /* JADX WARN: Code duplicated, block: B:152:0x0247  */
            /* JADX WARN: Code duplicated, block: B:208:0x0306  */
            /* JADX WARN: Code duplicated, block: B:244:0x0385 A[PHI: r14
              0x0385: PHI (r14v17 boolean) = (r14v16 boolean), (r14v20 boolean) binds: [B:243:0x0383, B:235:0x0368] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:308:0x0442  */
            /* JADX WARN: Code duplicated, block: B:417:0x038a A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:419:0x032f A[SYNTHETIC] */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                Boolean assistancePlusEnabled2;
                l20.r userContactsDTO;
                List<l20.a> listF;
                l20.r userContactsDTO2;
                List<l20.a> listF2;
                Boolean assistancePlusEnabled3;
                ArrayList arrayList;
                ArrayList arrayList2;
                boolean z14;
                String strK0;
                List listN0;
                boolean z15;
                boolean z16;
                boolean z17;
                boolean z18;
                l20.r userContactsDTO3;
                l20.q selfUserContactDTO;
                ArrayList arrayList3;
                boolean z19;
                boolean z24;
                boolean z25;
                l20.q selfUserContactDTO2;
                ArrayList arrayList4;
                ArrayList arrayList5;
                boolean z26;
                boolean z27;
                boolean z28;
                boolean z29;
                l20.r userContactsDTO4;
                List<l20.a> listF3;
                l20.r userContactsDTO5;
                int i16 = i15;
                s sVar = this.f137958b;
                switch (i16) {
                    case 0:
                        boolean zBooleanValue = false;
                        g3 g3Var = (g3) obj;
                        int i17 = s.f137969j1;
                        tj1.e eVar2 = (tj1.e) g3Var.f35301b;
                        boolean zBooleanValue2 = (eVar2 == null || (assistancePlusEnabled3 = eVar2.getAssistancePlusEnabled()) == null) ? false : assistancePlusEnabled3.booleanValue();
                        List listT = (eVar2 == null || (userContactsDTO2 = eVar2.getUserContactsDTO()) == null || (listF2 = userContactsDTO2.f()) == null) ? j0.f134944a : ge1.b.t(listF2);
                        Iterable<l20.a> iterableT = (eVar2 == null || (userContactsDTO = eVar2.getUserContactsDTO()) == null || (listF = userContactsDTO.f()) == null) ? j0.f134944a : ge1.b.t(listF);
                        if (eVar2 != null && (assistancePlusEnabled2 = eVar2.getAssistancePlusEnabled()) != null) {
                            zBooleanValue = assistancePlusEnabled2.booleanValue();
                        }
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        for (l20.a aVar2 : iterableT) {
                            if (aVar2.D()) {
                                if (arrayList7.isEmpty()) {
                                    arrayList7.add(new yj1.f.d(R.string.confirmed));
                                }
                                new yj1.f.b(null, 0, 0, null, false, null, 63, null);
                                GarminConnectMobileApp.f28685g.getClass();
                                arrayList7.add(yj1.f.b.a(aVar2, new e0(GarminConnectMobileApp.a.a()), zBooleanValue, com.garmin.android.apps.connectmobile.contacts.model.a.ACCEPTED));
                            } else if (aVar2.d()) {
                                if (arrayList9.isEmpty()) {
                                    arrayList9.add(new yj1.f.d(R.string.declined));
                                }
                                new yj1.f.b(null, 0, 0, null, false, null, 63, null);
                                GarminConnectMobileApp.f28685g.getClass();
                                arrayList9.add(yj1.f.b.a(aVar2, new e0(GarminConnectMobileApp.a.a()), zBooleanValue, com.garmin.android.apps.connectmobile.contacts.model.a.DECLINED));
                            } else {
                                if (arrayList8.isEmpty()) {
                                    arrayList8.add(new yj1.f.d(R.string.unconfirmed));
                                }
                                new yj1.f.b(null, 0, 0, null, false, null, 63, null);
                                GarminConnectMobileApp.f28685g.getClass();
                                arrayList8.add(yj1.f.b.a(aVar2, new e0(GarminConnectMobileApp.a.a()), zBooleanValue, com.garmin.android.apps.connectmobile.contacts.model.a.UNCONFIRMED));
                            }
                        }
                        if (!arrayList9.isEmpty()) {
                            arrayList9.add(new yj1.f.c(R.string.any_requests_will_not_be_sent));
                        }
                        arrayList6.addAll(arrayList7);
                        arrayList6.addAll(arrayList8);
                        arrayList6.addAll(arrayList9);
                        yj1.g gVar = new yj1.g(zBooleanValue2, listT, eVar2, false, arrayList6, 8, null);
                        if (g3Var.f35300a == fw.p.SUCCESS) {
                            int size = sVar.B.size();
                            List<l20.a> list = gVar.f197543b;
                            if (size > list.size()) {
                                List<yj1.f> list2 = gVar.f197546e;
                                list2.getClass();
                                gVar = new yj1.g(gVar.f197542a, list, gVar.f197544c, true, list2);
                            }
                            sVar.B = gVar.f197543b;
                        }
                        return new g3(g3Var.f35300a, gVar, g3Var.f35302c, null, g3Var.f35304e);
                    case 1:
                        g3 g3Var2 = (g3) obj;
                        int i18 = s.f137969j1;
                        fw.p pVar = g3Var2.f35300a;
                        tj1.e eVar3 = (tj1.e) g3Var2.f35301b;
                        vi1.b bVar = sVar.f137903e;
                        hl.a aVar3 = sVar.f137981q;
                        if (eVar3 == null || (userContactsDTO4 = eVar3.getUserContactsDTO()) == null || (listF3 = userContactsDTO4.f()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList();
                            for (Object obj2 : listF3) {
                                if (ge1.b.Q((l20.a) obj2)) {
                                    arrayList.add(obj2);
                                }
                            }
                        }
                        if (arrayList != null) {
                            arrayList2 = new ArrayList();
                            for (Object obj3 : arrayList) {
                                l20.a aVar4 = (l20.a) obj3;
                                if (sVar.f137982r) {
                                    List<l20.c> listZ = aVar4.z();
                                    if (listZ == null) {
                                        z26 = false;
                                    } else {
                                        if (!listZ.isEmpty()) {
                                            Iterator<T> it = listZ.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    l20.c cVar = (l20.c) it.next();
                                                    if (cVar.getConfirmationStatus() == com.garmin.android.apps.connectmobile.contacts.model.a.ACCEPTED || cVar.getConfirmationStatus() == com.garmin.android.apps.connectmobile.contacts.model.a.PENDING) {
                                                        z26 = false;
                                                    }
                                                }
                                            }
                                        }
                                        z26 = true;
                                    }
                                    List<l20.c> listR = aVar4.r();
                                    if (listR != null) {
                                        if (!listR.isEmpty()) {
                                            Iterator<T> it3 = listR.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    l20.c cVar2 = (l20.c) it3.next();
                                                    if (cVar2.getConfirmationStatus() == com.garmin.android.apps.connectmobile.contacts.model.a.ACCEPTED || cVar2.getConfirmationStatus() == com.garmin.android.apps.connectmobile.contacts.model.a.PENDING) {
                                                    }
                                                }
                                            }
                                        }
                                        z27 = true;
                                        if (z26 || !z27) {
                                            arrayList2.add(obj3);
                                        }
                                    }
                                    z27 = false;
                                    if (z26) {
                                    }
                                    arrayList2.add(obj3);
                                } else {
                                    List<l20.c> listZ2 = aVar4.z();
                                    if (listZ2 == null || listZ2.isEmpty()) {
                                        z28 = false;
                                    } else {
                                        Iterator<T> it4 = listZ2.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                z28 = false;
                                            } else if (((l20.c) it4.next()).getConfirmationStatus() != com.garmin.android.apps.connectmobile.contacts.model.a.ACCEPTED) {
                                                z28 = true;
                                            }
                                        }
                                    }
                                    List<l20.c> listR2 = aVar4.r();
                                    if (listR2 == null || listR2.isEmpty()) {
                                        z29 = false;
                                    } else {
                                        Iterator<T> it5 = listR2.iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                z29 = false;
                                            } else if (((l20.c) it5.next()).getConfirmationStatus() != com.garmin.android.apps.connectmobile.contacts.model.a.ACCEPTED) {
                                                z29 = true;
                                            }
                                        }
                                    }
                                    if (!z28 && !z29) {
                                        arrayList2.add(obj3);
                                    }
                                }
                            }
                        } else {
                            arrayList2 = null;
                        }
                        if (!(eVar3 != null ? p005kotlin.jvm.internal.s.g(eVar3.getAssistancePlusEnabled(), Boolean.TRUE) : false)) {
                            if (arrayList == null && (!arrayList.isEmpty())) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14 || arrayList2 == null || (listN0 = h0.N0(arrayList2, new u())) == null) {
                                strK0 = null;
                            } else {
                                strK0 = h0.k0(listN0, null, null, null, new p40.h(9), 31);
                            }
                        } else if (arrayList != null && (arrayList.isEmpty() ^ true)) {
                            if (arrayList2 != null) {
                                arrayList5 = new ArrayList();
                                for (Object obj4 : arrayList2) {
                                    List<l20.c> listZ3 = ((l20.a) obj4).z();
                                    if (listZ3 != null && listZ3.isEmpty()) {
                                        arrayList5.add(obj4);
                                    }
                                }
                            } else {
                                arrayList5 = null;
                            }
                            strK0 = arrayList5 != null && arrayList5.isEmpty() ? h0.k0(h0.N0(arrayList2, new t()), null, null, null, new p40.h(8), 31) : "";
                        } else {
                            if (arrayList == null) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                strK0 = null;
                            } else {
                                strK0 = null;
                            }
                        }
                        if (arrayList != null && (arrayList.isEmpty() ^ true)) {
                            if (arrayList2 != null) {
                                arrayList4 = new ArrayList();
                                for (Object obj5 : arrayList2) {
                                    List<l20.c> listZ4 = ((l20.a) obj5).z();
                                    if (listZ4 != null && listZ4.isEmpty()) {
                                        arrayList4.add(obj5);
                                    }
                                }
                            } else {
                                arrayList4 = null;
                            }
                            if (arrayList4 != null && arrayList4.isEmpty()) {
                                Iterator it6 = arrayList2.iterator();
                                while (it6.hasNext()) {
                                    List<l20.c> listZ5 = ((l20.a) it6.next()).z();
                                    if (listZ5 != null) {
                                        for (l20.c cVar3 : listZ5) {
                                            GarminConnectMobileApp.f28685g.getClass();
                                            if (!gl1.d.K(cVar3, new e0(GarminConnectMobileApp.a.a()))) {
                                                strK0 = "";
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        String str = strK0;
                        if (!(eVar3 != null && d0.i(eVar3, false))) {
                            if (eVar3 != null ? p005kotlin.jvm.internal.s.g(eVar3.getAssistancePlusEnabled(), Boolean.FALSE) : false) {
                                l20.r userContactsDTO6 = eVar3.getUserContactsDTO();
                                z15 = (userContactsDTO6 == null || (selfUserContactDTO2 = userContactsDTO6.getSelfUserContactDTO()) == null || !d0.k(selfUserContactDTO2)) ? false : true;
                            }
                        }
                        if (eVar3 != null ? p005kotlin.jvm.internal.s.g(eVar3.getAssistancePlusEnabled(), Boolean.FALSE) : false) {
                            if (arrayList != null && (arrayList.isEmpty() ^ true)) {
                                arrayList3 = new ArrayList();
                                for (Object obj6 : arrayList) {
                                    l20.a aVar5 = (l20.a) obj6;
                                    List<l20.c> listZ6 = aVar5.z();
                                    Integer numValueOf = listZ6 != null ? Integer.valueOf(listZ6.size()) : null;
                                    numValueOf.getClass();
                                    if (numValueOf.intValue() > 0) {
                                        List<l20.c> listZ7 = aVar5.z();
                                        if (listZ7 != null) {
                                            z19 = true;
                                            z25 = cq0.k.a(listZ7);
                                            if (!z25) {
                                                z24 = z19;
                                            }
                                            if (z24) {
                                                arrayList3.add(obj6);
                                            }
                                        } else {
                                            z19 = true;
                                        }
                                        if (!z25) {
                                            z24 = z19;
                                        }
                                        if (z24) {
                                            arrayList3.add(obj6);
                                        }
                                    } else {
                                        z19 = true;
                                    }
                                    List<l20.c> listR3 = aVar5.r();
                                    Integer numValueOf2 = listR3 != null ? Integer.valueOf(listR3.size()) : null;
                                    numValueOf2.getClass();
                                    if (numValueOf2.intValue() > 0) {
                                        z24 = z19;
                                    } else {
                                        z24 = false;
                                    }
                                    if (z24) {
                                        arrayList3.add(obj6);
                                    }
                                }
                            } else {
                                arrayList3 = null;
                            }
                            z16 = true;
                            z17 = !(arrayList3 == null || arrayList3.isEmpty()) && z15;
                        } else {
                            z16 = true;
                            z17 = true;
                        }
                        boolean z34 = (!(eVar3 != null ? p005kotlin.jvm.internal.s.g(eVar3.getAssistancePlusEnabled(), Boolean.TRUE) : false) || sVar.M4()) ? z16 : false;
                        hl.a.c cVar4 = hl.a.c.f84256b;
                        boolean z35 = (p005kotlin.jvm.internal.s.g(aVar3, cVar4) && sVar.f137911m) ? z16 : false;
                        boolean zG = eVar3 != null ? p005kotlin.jvm.internal.s.g(eVar3.getAssistancePlusEnabled(), Boolean.TRUE) : false;
                        String emergencyNotes = (eVar3 == null || (userContactsDTO3 = eVar3.getUserContactsDTO()) == null || (selfUserContactDTO = userContactsDTO3.getSelfUserContactDTO()) == null) ? null : selfUserContactDTO.getEmergencyNotes();
                        boolean z36 = (z15 && z34) ? z16 : false;
                        boolean z37 = (p005kotlin.jvm.internal.s.g(aVar3, cVar4) && bVar.l()) ? z16 : false;
                        boolean z38 = (p005kotlin.jvm.internal.s.g(aVar3, cVar4) && bVar.e()) ? z16 : false;
                        if (p005kotlin.jvm.internal.s.g(aVar3, cVar4)) {
                            Map<zb0.u0, vg1.t> map = zb0.n0.f203577a;
                            if (bo1.a.a().c().t()) {
                                z18 = z16;
                            } else {
                                z18 = false;
                            }
                        } else {
                            z18 = false;
                        }
                        return new g3(pVar, new yj1.l(z35, zG, emergencyNotes, z36, str, z37, z38, z17, z18), g3Var2.f35302c, null, g3Var2.f35304e);
                    default:
                        g3 g3Var3 = (g3) obj;
                        int i19 = s.f137969j1;
                        fw.p pVar2 = g3Var3.f35300a;
                        tj1.e eVar4 = (tj1.e) g3Var3.f35301b;
                        vi1.b bVar2 = sVar.f137903e;
                        hl.a aVar6 = sVar.f137981q;
                        Boolean assistancePlusEnabled4 = eVar4 != null ? eVar4.getAssistancePlusEnabled() : null;
                        l20.q selfUserContactDTO3 = (eVar4 == null || (userContactsDTO5 = eVar4.getUserContactsDTO()) == null) ? null : userContactsDTO5.getSelfUserContactDTO();
                        boolean z39 = aVar6 instanceof hl.a.b;
                        return new g3(pVar2, new yj1.h(assistancePlusEnabled4, selfUserContactDTO3, p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b) && bVar2.e(), z39 ? null : bVar2.c(), z39 ? null : bVar2.g()), null, null, null, 16, null);
                }
            }
        });
        this.H0 = w0VarA2;
        final int i16 = 2;
        this.I0 = t1.a(C4(), new e23.l(this) { // from class: pj1.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f137958b;

            {
                this.f137958b = this;
            }

            /* JADX WARN: Code duplicated, block: B:142:0x0215  */
            /* JADX WARN: Code duplicated, block: B:146:0x0221  */
            /* JADX WARN: Code duplicated, block: B:152:0x0247  */
            /* JADX WARN: Code duplicated, block: B:208:0x0306  */
            /* JADX WARN: Code duplicated, block: B:244:0x0385 A[PHI: r14
              0x0385: PHI (r14v17 boolean) = (r14v16 boolean), (r14v20 boolean) binds: [B:243:0x0383, B:235:0x0368] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:308:0x0442  */
            /* JADX WARN: Code duplicated, block: B:417:0x038a A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:419:0x032f A[SYNTHETIC] */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                Boolean assistancePlusEnabled2;
                l20.r userContactsDTO;
                List<l20.a> listF;
                l20.r userContactsDTO2;
                List<l20.a> listF2;
                Boolean assistancePlusEnabled3;
                ArrayList arrayList;
                ArrayList arrayList2;
                boolean z14;
                String strK0;
                List listN0;
                boolean z15;
                boolean z16;
                boolean z17;
                boolean z18;
                l20.r userContactsDTO3;
                l20.q selfUserContactDTO;
                ArrayList arrayList3;
                boolean z19;
                boolean z24;
                boolean z25;
                l20.q selfUserContactDTO2;
                ArrayList arrayList4;
                ArrayList arrayList5;
                boolean z26;
                boolean z27;
                boolean z28;
                boolean z29;
                l20.r userContactsDTO4;
                List<l20.a> listF3;
                l20.r userContactsDTO5;
                int i17 = i16;
                s sVar = this.f137958b;
                switch (i17) {
                    case 0:
                        boolean zBooleanValue = false;
                        g3 g3Var = (g3) obj;
                        int i18 = s.f137969j1;
                        tj1.e eVar2 = (tj1.e) g3Var.f35301b;
                        boolean zBooleanValue2 = (eVar2 == null || (assistancePlusEnabled3 = eVar2.getAssistancePlusEnabled()) == null) ? false : assistancePlusEnabled3.booleanValue();
                        List listT = (eVar2 == null || (userContactsDTO2 = eVar2.getUserContactsDTO()) == null || (listF2 = userContactsDTO2.f()) == null) ? j0.f134944a : ge1.b.t(listF2);
                        Iterable<l20.a> iterableT = (eVar2 == null || (userContactsDTO = eVar2.getUserContactsDTO()) == null || (listF = userContactsDTO.f()) == null) ? j0.f134944a : ge1.b.t(listF);
                        if (eVar2 != null && (assistancePlusEnabled2 = eVar2.getAssistancePlusEnabled()) != null) {
                            zBooleanValue = assistancePlusEnabled2.booleanValue();
                        }
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        for (l20.a aVar2 : iterableT) {
                            if (aVar2.D()) {
                                if (arrayList7.isEmpty()) {
                                    arrayList7.add(new yj1.f.d(R.string.confirmed));
                                }
                                new yj1.f.b(null, 0, 0, null, false, null, 63, null);
                                GarminConnectMobileApp.f28685g.getClass();
                                arrayList7.add(yj1.f.b.a(aVar2, new e0(GarminConnectMobileApp.a.a()), zBooleanValue, com.garmin.android.apps.connectmobile.contacts.model.a.ACCEPTED));
                            } else if (aVar2.d()) {
                                if (arrayList9.isEmpty()) {
                                    arrayList9.add(new yj1.f.d(R.string.declined));
                                }
                                new yj1.f.b(null, 0, 0, null, false, null, 63, null);
                                GarminConnectMobileApp.f28685g.getClass();
                                arrayList9.add(yj1.f.b.a(aVar2, new e0(GarminConnectMobileApp.a.a()), zBooleanValue, com.garmin.android.apps.connectmobile.contacts.model.a.DECLINED));
                            } else {
                                if (arrayList8.isEmpty()) {
                                    arrayList8.add(new yj1.f.d(R.string.unconfirmed));
                                }
                                new yj1.f.b(null, 0, 0, null, false, null, 63, null);
                                GarminConnectMobileApp.f28685g.getClass();
                                arrayList8.add(yj1.f.b.a(aVar2, new e0(GarminConnectMobileApp.a.a()), zBooleanValue, com.garmin.android.apps.connectmobile.contacts.model.a.UNCONFIRMED));
                            }
                        }
                        if (!arrayList9.isEmpty()) {
                            arrayList9.add(new yj1.f.c(R.string.any_requests_will_not_be_sent));
                        }
                        arrayList6.addAll(arrayList7);
                        arrayList6.addAll(arrayList8);
                        arrayList6.addAll(arrayList9);
                        yj1.g gVar = new yj1.g(zBooleanValue2, listT, eVar2, false, arrayList6, 8, null);
                        if (g3Var.f35300a == fw.p.SUCCESS) {
                            int size = sVar.B.size();
                            List<l20.a> list = gVar.f197543b;
                            if (size > list.size()) {
                                List<yj1.f> list2 = gVar.f197546e;
                                list2.getClass();
                                gVar = new yj1.g(gVar.f197542a, list, gVar.f197544c, true, list2);
                            }
                            sVar.B = gVar.f197543b;
                        }
                        return new g3(g3Var.f35300a, gVar, g3Var.f35302c, null, g3Var.f35304e);
                    case 1:
                        g3 g3Var2 = (g3) obj;
                        int i19 = s.f137969j1;
                        fw.p pVar = g3Var2.f35300a;
                        tj1.e eVar3 = (tj1.e) g3Var2.f35301b;
                        vi1.b bVar = sVar.f137903e;
                        hl.a aVar3 = sVar.f137981q;
                        if (eVar3 == null || (userContactsDTO4 = eVar3.getUserContactsDTO()) == null || (listF3 = userContactsDTO4.f()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList();
                            for (Object obj2 : listF3) {
                                if (ge1.b.Q((l20.a) obj2)) {
                                    arrayList.add(obj2);
                                }
                            }
                        }
                        if (arrayList != null) {
                            arrayList2 = new ArrayList();
                            for (Object obj3 : arrayList) {
                                l20.a aVar4 = (l20.a) obj3;
                                if (sVar.f137982r) {
                                    List<l20.c> listZ = aVar4.z();
                                    if (listZ == null) {
                                        z26 = false;
                                    } else {
                                        if (!listZ.isEmpty()) {
                                            Iterator<T> it = listZ.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    l20.c cVar = (l20.c) it.next();
                                                    if (cVar.getConfirmationStatus() == com.garmin.android.apps.connectmobile.contacts.model.a.ACCEPTED || cVar.getConfirmationStatus() == com.garmin.android.apps.connectmobile.contacts.model.a.PENDING) {
                                                        z26 = false;
                                                    }
                                                }
                                            }
                                        }
                                        z26 = true;
                                    }
                                    List<l20.c> listR = aVar4.r();
                                    if (listR != null) {
                                        if (!listR.isEmpty()) {
                                            Iterator<T> it3 = listR.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    l20.c cVar2 = (l20.c) it3.next();
                                                    if (cVar2.getConfirmationStatus() == com.garmin.android.apps.connectmobile.contacts.model.a.ACCEPTED || cVar2.getConfirmationStatus() == com.garmin.android.apps.connectmobile.contacts.model.a.PENDING) {
                                                    }
                                                }
                                            }
                                        }
                                        z27 = true;
                                        if (z26 || !z27) {
                                            arrayList2.add(obj3);
                                        }
                                    }
                                    z27 = false;
                                    if (z26) {
                                    }
                                    arrayList2.add(obj3);
                                } else {
                                    List<l20.c> listZ2 = aVar4.z();
                                    if (listZ2 == null || listZ2.isEmpty()) {
                                        z28 = false;
                                    } else {
                                        Iterator<T> it4 = listZ2.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                z28 = false;
                                            } else if (((l20.c) it4.next()).getConfirmationStatus() != com.garmin.android.apps.connectmobile.contacts.model.a.ACCEPTED) {
                                                z28 = true;
                                            }
                                        }
                                    }
                                    List<l20.c> listR2 = aVar4.r();
                                    if (listR2 == null || listR2.isEmpty()) {
                                        z29 = false;
                                    } else {
                                        Iterator<T> it5 = listR2.iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                z29 = false;
                                            } else if (((l20.c) it5.next()).getConfirmationStatus() != com.garmin.android.apps.connectmobile.contacts.model.a.ACCEPTED) {
                                                z29 = true;
                                            }
                                        }
                                    }
                                    if (!z28 && !z29) {
                                        arrayList2.add(obj3);
                                    }
                                }
                            }
                        } else {
                            arrayList2 = null;
                        }
                        if (!(eVar3 != null ? p005kotlin.jvm.internal.s.g(eVar3.getAssistancePlusEnabled(), Boolean.TRUE) : false)) {
                            if (arrayList == null && (!arrayList.isEmpty())) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14 || arrayList2 == null || (listN0 = h0.N0(arrayList2, new u())) == null) {
                                strK0 = null;
                            } else {
                                strK0 = h0.k0(listN0, null, null, null, new p40.h(9), 31);
                            }
                        } else if (arrayList != null && (arrayList.isEmpty() ^ true)) {
                            if (arrayList2 != null) {
                                arrayList5 = new ArrayList();
                                for (Object obj4 : arrayList2) {
                                    List<l20.c> listZ3 = ((l20.a) obj4).z();
                                    if (listZ3 != null && listZ3.isEmpty()) {
                                        arrayList5.add(obj4);
                                    }
                                }
                            } else {
                                arrayList5 = null;
                            }
                            strK0 = arrayList5 != null && arrayList5.isEmpty() ? h0.k0(h0.N0(arrayList2, new t()), null, null, null, new p40.h(8), 31) : "";
                        } else {
                            if (arrayList == null) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                strK0 = null;
                            } else {
                                strK0 = null;
                            }
                        }
                        if (arrayList != null && (arrayList.isEmpty() ^ true)) {
                            if (arrayList2 != null) {
                                arrayList4 = new ArrayList();
                                for (Object obj5 : arrayList2) {
                                    List<l20.c> listZ4 = ((l20.a) obj5).z();
                                    if (listZ4 != null && listZ4.isEmpty()) {
                                        arrayList4.add(obj5);
                                    }
                                }
                            } else {
                                arrayList4 = null;
                            }
                            if (arrayList4 != null && arrayList4.isEmpty()) {
                                Iterator it6 = arrayList2.iterator();
                                while (it6.hasNext()) {
                                    List<l20.c> listZ5 = ((l20.a) it6.next()).z();
                                    if (listZ5 != null) {
                                        for (l20.c cVar3 : listZ5) {
                                            GarminConnectMobileApp.f28685g.getClass();
                                            if (!gl1.d.K(cVar3, new e0(GarminConnectMobileApp.a.a()))) {
                                                strK0 = "";
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        String str = strK0;
                        if (!(eVar3 != null && d0.i(eVar3, false))) {
                            if (eVar3 != null ? p005kotlin.jvm.internal.s.g(eVar3.getAssistancePlusEnabled(), Boolean.FALSE) : false) {
                                l20.r userContactsDTO6 = eVar3.getUserContactsDTO();
                                z15 = (userContactsDTO6 == null || (selfUserContactDTO2 = userContactsDTO6.getSelfUserContactDTO()) == null || !d0.k(selfUserContactDTO2)) ? false : true;
                            }
                        }
                        if (eVar3 != null ? p005kotlin.jvm.internal.s.g(eVar3.getAssistancePlusEnabled(), Boolean.FALSE) : false) {
                            if (arrayList != null && (arrayList.isEmpty() ^ true)) {
                                arrayList3 = new ArrayList();
                                for (Object obj6 : arrayList) {
                                    l20.a aVar5 = (l20.a) obj6;
                                    List<l20.c> listZ6 = aVar5.z();
                                    Integer numValueOf = listZ6 != null ? Integer.valueOf(listZ6.size()) : null;
                                    numValueOf.getClass();
                                    if (numValueOf.intValue() > 0) {
                                        List<l20.c> listZ7 = aVar5.z();
                                        if (listZ7 != null) {
                                            z19 = true;
                                            z25 = cq0.k.a(listZ7);
                                            if (!z25) {
                                                z24 = z19;
                                            }
                                            if (z24) {
                                                arrayList3.add(obj6);
                                            }
                                        } else {
                                            z19 = true;
                                        }
                                        if (!z25) {
                                            z24 = z19;
                                        }
                                        if (z24) {
                                            arrayList3.add(obj6);
                                        }
                                    } else {
                                        z19 = true;
                                    }
                                    List<l20.c> listR3 = aVar5.r();
                                    Integer numValueOf2 = listR3 != null ? Integer.valueOf(listR3.size()) : null;
                                    numValueOf2.getClass();
                                    if (numValueOf2.intValue() > 0) {
                                        z24 = z19;
                                    } else {
                                        z24 = false;
                                    }
                                    if (z24) {
                                        arrayList3.add(obj6);
                                    }
                                }
                            } else {
                                arrayList3 = null;
                            }
                            z16 = true;
                            z17 = !(arrayList3 == null || arrayList3.isEmpty()) && z15;
                        } else {
                            z16 = true;
                            z17 = true;
                        }
                        boolean z34 = (!(eVar3 != null ? p005kotlin.jvm.internal.s.g(eVar3.getAssistancePlusEnabled(), Boolean.TRUE) : false) || sVar.M4()) ? z16 : false;
                        hl.a.c cVar4 = hl.a.c.f84256b;
                        boolean z35 = (p005kotlin.jvm.internal.s.g(aVar3, cVar4) && sVar.f137911m) ? z16 : false;
                        boolean zG = eVar3 != null ? p005kotlin.jvm.internal.s.g(eVar3.getAssistancePlusEnabled(), Boolean.TRUE) : false;
                        String emergencyNotes = (eVar3 == null || (userContactsDTO3 = eVar3.getUserContactsDTO()) == null || (selfUserContactDTO = userContactsDTO3.getSelfUserContactDTO()) == null) ? null : selfUserContactDTO.getEmergencyNotes();
                        boolean z36 = (z15 && z34) ? z16 : false;
                        boolean z37 = (p005kotlin.jvm.internal.s.g(aVar3, cVar4) && bVar.l()) ? z16 : false;
                        boolean z38 = (p005kotlin.jvm.internal.s.g(aVar3, cVar4) && bVar.e()) ? z16 : false;
                        if (p005kotlin.jvm.internal.s.g(aVar3, cVar4)) {
                            Map<zb0.u0, vg1.t> map = zb0.n0.f203577a;
                            if (bo1.a.a().c().t()) {
                                z18 = z16;
                            } else {
                                z18 = false;
                            }
                        } else {
                            z18 = false;
                        }
                        return new g3(pVar, new yj1.l(z35, zG, emergencyNotes, z36, str, z37, z38, z17, z18), g3Var2.f35302c, null, g3Var2.f35304e);
                    default:
                        g3 g3Var3 = (g3) obj;
                        int i110 = s.f137969j1;
                        fw.p pVar2 = g3Var3.f35300a;
                        tj1.e eVar4 = (tj1.e) g3Var3.f35301b;
                        vi1.b bVar2 = sVar.f137903e;
                        hl.a aVar6 = sVar.f137981q;
                        Boolean assistancePlusEnabled4 = eVar4 != null ? eVar4.getAssistancePlusEnabled() : null;
                        l20.q selfUserContactDTO3 = (eVar4 == null || (userContactsDTO5 = eVar4.getUserContactsDTO()) == null) ? null : userContactsDTO5.getSelfUserContactDTO();
                        boolean z39 = aVar6 instanceof hl.a.b;
                        return new g3(pVar2, new yj1.h(assistancePlusEnabled4, selfUserContactDTO3, p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b) && bVar2.e(), z39 ? null : bVar2.c(), z39 ? null : bVar2.g()), null, null, null, 16, null);
                }
            }
        });
        y0<String> y0Var4 = new y0<>();
        this.J0 = y0Var4;
        this.K0 = y0Var4;
        y0<w61.f<o13.p<Integer, Integer>>> y0Var5 = new y0<>();
        this.L0 = y0Var5;
        this.M0 = y0Var5;
        y0<w61.f<Unit>> y0Var6 = new y0<>();
        this.N0 = y0Var6;
        this.O0 = y0Var6;
        y0<yj1.e> y0Var7 = new y0<>();
        this.P0 = y0Var7;
        this.Q0 = y0Var7;
        y0<w61.f<wj1.a>> y0Var8 = new y0<>();
        this.R0 = y0Var8;
        this.S0 = y0Var8;
        y0<w61.f<o13.p<sd2.f, Integer>>> y0Var9 = new y0<>();
        this.T0 = y0Var9;
        this.U0 = y0Var9;
        y0<Boolean> y0Var10 = new y0<>(bool);
        this.V0 = y0Var10;
        this.W0 = y0Var10;
        y0<w61.f<Long>> y0Var11 = new y0<>();
        this.X0 = y0Var11;
        this.Y0 = y0Var11;
        this.Z0 = o13.m.b(new p40.f(25));
        y0<w61.f<g3<yj1.i>>> y0Var12 = new y0<>();
        this.f137970a1 = y0Var12;
        this.f137971b1 = y0Var12;
        y0<Boolean> y0Var13 = new y0<>();
        this.f137972c1 = y0Var13;
        this.f137973d1 = y0Var13;
        this.f137974e1 = o13.m.b(new p40.f(26));
        this.f137975f1 = o13.m.b(new p40.f(27));
        this.f137976g1 = o13.m.b(new p40.f(28));
        final w0 w0Var2 = new w0();
        w0Var2.n(w0VarA2, new d(new e23.l(this) { // from class: pj1.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f137960b;

            {
                this.f137960b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        s.e5(this.f137960b, w0Var2);
                        break;
                    case 1:
                        s.e5(this.f137960b, w0Var2);
                        break;
                    case 2:
                        s.e5(this.f137960b, w0Var2);
                        break;
                    default:
                        s.e5(this.f137960b, w0Var2);
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        w0Var2.n(y0Var, new d(new e23.l(this) { // from class: pj1.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f137960b;

            {
                this.f137960b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        s.e5(this.f137960b, w0Var2);
                        break;
                    case 1:
                        s.e5(this.f137960b, w0Var2);
                        break;
                    case 2:
                        s.e5(this.f137960b, w0Var2);
                        break;
                    default:
                        s.e5(this.f137960b, w0Var2);
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        w0Var2.n(y0Var3, new d(new e23.l(this) { // from class: pj1.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f137960b;

            {
                this.f137960b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        s.e5(this.f137960b, w0Var2);
                        break;
                    case 1:
                        s.e5(this.f137960b, w0Var2);
                        break;
                    case 2:
                        s.e5(this.f137960b, w0Var2);
                        break;
                    default:
                        s.e5(this.f137960b, w0Var2);
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i17 = 3;
        w0Var2.n(w0VarA, new d(new e23.l(this) { // from class: pj1.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f137960b;

            {
                this.f137960b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (i17) {
                    case 0:
                        s.e5(this.f137960b, w0Var2);
                        break;
                    case 1:
                        s.e5(this.f137960b, w0Var2);
                        break;
                    case 2:
                        s.e5(this.f137960b, w0Var2);
                        break;
                    default:
                        s.e5(this.f137960b, w0Var2);
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        this.f137977h1 = w0Var2;
        if (this.f137983t) {
            y0Var4.m("SafetyFeatureSetupWizardFragment_BLANK");
            this.f137986x = aVar.equals(hl.a.c.f84256b);
        } else {
            y0Var4.m("SafetyFeaturesMainFragment");
        }
        C4().j(g3.a.c(g3.f35298f));
        if (!aVar.equals(hl.a.c.f84256b)) {
            if (!(aVar instanceof hl.a.b)) {
                u0.r();
                throw null;
            }
            w9.a aVarA = v1.a(this);
            x53.c cVar = s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new b(null), 2);
            return;
        }
        rd2.f.a().f152045a.getClass();
        ArrayList arrayListD = rd2.j.d();
        this.P = arrayListD;
        y0Var3.j(arrayListD);
        y0Var.j(Boolean.TRUE);
        f5();
        w9.a aVarA2 = v1.a(this);
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(aVarA2, x53.b.f189152a, null, new a(null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void I4(s sVar, w0<yj1.b> w0Var, long j8) {
        String strB;
        sd2.f fVar;
        Object next;
        wj1.a aVar;
        w0 w0Var2 = sVar.H0;
        boolean z14 = sVar.f137982r;
        g3 g3Var = (g3) w0Var2.d();
        Object obj = null;
        ue0.h hVar = null;
        yj1.l lVar = g3Var != null ? (yj1.l) g3Var.f35301b : null;
        g3 g3Var2 = (g3) sVar.D.d();
        if (g3Var2 == null) {
            strB = null;
        } else {
            if (g3Var2.f35300a != fw.p.SUCCESS) {
                g3Var2 = null;
            }
            if (g3Var2 == null || (aVar = (wj1.a) g3Var2.f35301b) == null) {
                strB = null;
            } else {
                vj1.g gVar = (vj1.g) sVar.f137976g1.getValue();
                GarminConnectMobileApp.f28685g.getClass();
                strB = gVar.b(GarminConnectMobileApp.a.a(), aVar, z14);
            }
        }
        if (!(sVar.f137981q instanceof hl.a.b)) {
            List list = (List) sVar.f137979k0.d();
            if (list != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((sd2.f) next).getUnitID() != j8);
                fVar = (sd2.f) next;
            } else {
                fVar = null;
            }
            w0Var.m(new yj1.b(lVar != null && lVar.f197566h, fVar != null && fVar.u0(), km2.a.i(j8, null, SupportedCapability.REALTIME_SETTINGS.ordinal()), fVar != 0 && fVar.B2(), strB, (fVar == 0 || !fVar.y0() || p005kotlin.jvm.internal.s.g(sVar.f137903e.b(), Boolean.FALSE) || z14) ? false : true, lVar != null && lVar.f197560b && lVar.f197559a, lVar != null ? lVar.f197561c : null));
            return;
        }
        List<ue0.h> list2 = sVar.I;
        if (list2 != null) {
            for (Object obj2 : list2) {
                Long deviceId = ((ue0.h) obj2).getDeviceId();
                if (deviceId != null && deviceId.longValue() == j8) {
                    obj = obj2;
                    break;
                }
            }
            hVar = (ue0.h) obj;
        }
        w0Var.m(new yj1.b(lVar != null && lVar.f197566h, hVar != null ? p005kotlin.jvm.internal.s.g(hVar.getFallDetectionCapable(), Boolean.TRUE) : false, false, hVar != null ? p005kotlin.jvm.internal.s.g(hVar.getEmergencyCallingCapable(), Boolean.TRUE) : false, strB, false, false, null));
    }

    public static boolean O4() {
        eq0.a.f65038b.a().getClass();
        Set<String> stringSet = eq0.a.P().getStringSet(eq0.a.O(R.string.key_safety_feature_setup_first_time), null);
        if (stringSet == null || stringSet.isEmpty()) {
            return true;
        }
        Object obj = KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
        obj.getClass();
        String userDisplayName = ((f12.b) obj).getUserDisplayName();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = userDisplayName.toLowerCase(locale);
        lowerCase.getClass();
        return !stringSet.contains(lowerCase);
    }

    public static boolean P4(l20.q qVar, boolean z14) {
        boolean zD;
        List<l20.c> listJ;
        if (qVar != null) {
            if (z14) {
                if (g22.n.d(qVar.getFullName()) && g22.n.d(qVar.getCountryOfCitizenship()) && (listJ = qVar.j()) != null && !listJ.isEmpty()) {
                    Iterator<T> it = listJ.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (gl1.d.J((l20.c) it.next())) {
                                List<l20.c> listS = qVar.s();
                                if (listS != null && d0.h(listS)) {
                                    zD = true;
                                    break;
                                }
                                break;
                            }
                        }
                        zD = false;
                        break;
                    }
                }
                zD = false;
                break;
            }
            zD = g22.n.d(qVar.getFullName());
            if (zD && d0.g(qVar, z14)) {
                return true;
            }
        }
        return false;
    }

    public static void Z4(s sVar, tj1.e eVar, int i14) {
        boolean z14 = true;
        if ((i14 & 1) != 0) {
            g3<tj1.e> g3VarD = sVar.C4().d();
            eVar = g3VarD != null ? g3VarD.f35301b : null;
        }
        tj1.e eVar2 = eVar;
        hl.a aVar = sVar.f137981q;
        ad0.f fVar = new ad0.f(sVar, eVar2, z14, 16);
        aVar.getClass();
        w9.a aVarA = v1.a(sVar);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new k(eVar2, aVar, sVar, fVar, null), 2);
    }

    public static void c5(s sVar) {
        tj1.e eVar;
        Boolean assistancePlusEnabled;
        g3<tj1.e> g3VarD = sVar.C4().d();
        sVar.b5((g3VarD == null || (eVar = g3VarD.f35301b) == null || (assistancePlusEnabled = eVar.getAssistancePlusEnabled()) == null) ? false : assistancePlusEnabled.booleanValue());
    }

    public static void d5(s sVar, Activity activity, String str, Bundle bundle, int i14) {
        boolean z14 = (i14 & 4) != 0;
        if ((i14 & 8) != 0) {
            bundle = null;
        }
        sVar.getClass();
        IncidentDetectionTermsActivity.a aVar = IncidentDetectionTermsActivity.f36839e;
        hl.a aVar2 = sVar.f137981q;
        aVar.getClass();
        aVar2.getClass();
        Intent intent = new Intent(activity, (Class<?>) IncidentDetectionTermsActivity.class);
        intent.putExtra(str, true);
        intent.putExtra("GCM_extra_activity_extras", bundle);
        intent.putExtra("GCM_extra_screen_access_role", aVar2);
        activity.startActivity(intent);
        if (z14) {
            activity.finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:148:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    /* JADX WARN: Code duplicated, block: B:92:0x0176  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v21, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.util.ArrayList] */
    public static final void e5(s sVar, w0<yj1.o> w0Var) {
        String strB;
        yj1.d bVar;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        ?? arrayList;
        wj1.a aVar;
        w0 w0Var2 = sVar.H0;
        y0 y0Var = sVar.f137979k0;
        g3 g3Var = (g3) w0Var2.d();
        boolean z18 = true;
        boolean z19 = g3Var == null || g3Var.f35300a == fw.p.LOADING;
        Boolean bool = (Boolean) sVar.X.d();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        List list = (List) y0Var.d();
        g3 g3Var2 = (g3) sVar.D.d();
        if (g3Var2 == null) {
            strB = null;
        } else {
            if (g3Var2.f35300a != fw.p.SUCCESS) {
                g3Var2 = null;
            }
            if (g3Var2 == null || (aVar = (wj1.a) g3Var2.f35301b) == null) {
                strB = null;
            } else {
                vj1.g gVar = (vj1.g) sVar.f137976g1.getValue();
                GarminConnectMobileApp.f28685g.getClass();
                strB = gVar.b(GarminConnectMobileApp.a.a(), aVar, sVar.f137982r);
            }
        }
        yj1.l lVar = g3Var != null ? (yj1.l) g3Var.f35301b : null;
        hl.a aVar2 = sVar.f137981q;
        if (zBooleanValue) {
            boolean z24 = aVar2 instanceof hl.a.b;
            if (z24) {
                List<ue0.h> list2 = sVar.I;
                if ((list2 != null ? d0.c(list2).size() : 0) > 1) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            } else {
                List list3 = (List) y0Var.d();
                if ((list3 != null ? d0.d(list3).size() : 0) > 1) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (z15) {
                if (z24) {
                    List<ue0.h> list4 = sVar.I;
                    if (list4 != null) {
                        ArrayList<ue0.h> arrayListC = d0.c(list4);
                        arrayList = new ArrayList(p13.y.r(arrayListC, 10));
                        for (ue0.h hVar : arrayListC) {
                            Long deviceId = hVar.getDeviceId();
                            long jLongValue = deviceId != null ? deviceId.longValue() : -1L;
                            String displayName = hVar.getDisplayName();
                            if (displayName == null && (displayName = hVar.getProductDisplayName()) == null) {
                                displayName = "";
                            }
                            arrayList.add(new yj1.c(jLongValue, displayName, false));
                        }
                    } else {
                        arrayList = j0.f134944a;
                    }
                } else if (list != null) {
                    ArrayList<sd2.f> arrayListD = d0.d(list);
                    ArrayList arrayList2 = new ArrayList(p13.y.r(arrayListD, 10));
                    for (sd2.f fVar : arrayListD) {
                        long unitID = fVar.getUnitID();
                        String displayName2 = fVar.getDisplayName();
                        if (displayName2 == null) {
                            displayName2 = fVar.getProductDisplayName();
                            displayName2.getClass();
                        }
                        arrayList2.add(new yj1.c(unitID, displayName2, sVar.H4(fVar)));
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = j0.f134944a;
                }
                bVar = new yj1.d.a(arrayList);
            } else {
                boolean z25 = lVar != null && lVar.f197566h;
                boolean z26 = sVar.A;
                if (list != null) {
                    ArrayList arrayListD2 = d0.d(list);
                    if (arrayListD2.isEmpty()) {
                        z17 = false;
                        break;
                    }
                    Iterator it = arrayListD2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (km2.a.i(((sd2.f) it.next()).getUnitID(), null, SupportedCapability.REALTIME_SETTINGS.ordinal())) {
                                z17 = true;
                                break;
                            }
                        } else {
                            z17 = false;
                            break;
                        }
                    }
                    if (z17) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                } else {
                    z16 = false;
                }
                bVar = new yj1.d.b(new yj1.b(z25, z26, z16, sVar.f137988z, strB, sVar.N4(), (lVar != null && lVar.f197560b) && lVar.f197559a, lVar != null ? lVar.f197561c : null));
            }
        } else {
            bVar = null;
        }
        boolean z27 = lVar != null && lVar.f197562d;
        if (z19) {
            z14 = false;
        } else if (lVar != null && lVar.f197565g) {
            z14 = true;
        } else {
            z14 = false;
        }
        yj1.j jVar = new yj1.j(z27, z14);
        String str = lVar != null ? lVar.f197563e : null;
        if (z19) {
            z18 = false;
        } else {
            String str2 = lVar != null ? lVar.f197563e : null;
            if (!(str2 == null || str2.length() == 0)) {
                z18 = false;
            } else if (!(lVar != null && lVar.f197564f) && !(aVar2 instanceof hl.a.b)) {
                z18 = false;
            }
        }
        new yj1.o(z19, bVar, jVar, new yj1.a(str, z18));
        w0Var.m(r10);
    }

    public static yj1.i j5(yj1.i iVar, p0 p0Var, boolean z14) {
        if (z14) {
            return iVar != null ? yj1.i.a(iVar, p0Var, null, 2) : new yj1.i(p0Var, null, 2, null);
        }
        return iVar != null ? yj1.i.a(iVar, null, p0Var, 1) : new yj1.i(null, p0Var, 1, null);
    }

    public static List l5(String str, List list) {
        str.getClass();
        if (list == null || list.isEmpty()) {
            return p13.w.c(new l20.c(null, str, Boolean.FALSE, Integer.valueOf(l20.m.NONE.f109026a), Integer.valueOf(l20.p.MOBILE.f109040a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048545, null));
        }
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        boolean z14 = false;
        while (it.hasNext()) {
            l20.c cVarB = (l20.c) it.next();
            if (!p005kotlin.jvm.internal.s.g(cVarB.getIsPrimary(), Boolean.TRUE) && !z14) {
                cVarB = l20.c.b(cVarB, null, str, null, null, null, null, null, null, null, null, 0, 1048573);
                z14 = true;
            }
            arrayList.add(cVarB);
        }
        if (!list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                if (!p005kotlin.jvm.internal.s.g(((l20.c) it3.next()).getIsPrimary(), Boolean.TRUE)) {
                    return arrayList;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.add(new l20.c(null, str, Boolean.FALSE, Integer.valueOf(l20.m.NONE.f109026a), Integer.valueOf(l20.p.MOBILE.f109040a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048545, null));
        return arrayList2;
    }

    public static boolean n5(tj1.e eVar, e23.s sVar) {
        l20.r userContactsDTO;
        l20.q selfUserContactDTO;
        l20.r userContactsDTO2;
        List<l20.a> listF;
        ArrayList arrayListT = (eVar == null || (userContactsDTO2 = eVar.getUserContactsDTO()) == null || (listF = userContactsDTO2.f()) == null) ? null : ge1.b.t(listF);
        boolean z14 = false;
        boolean z15 = arrayListT != null && (arrayListT.isEmpty() ^ true);
        boolean z16 = arrayListT != null && d0.f(arrayListT);
        boolean z17 = (eVar == null || (userContactsDTO = eVar.getUserContactsDTO()) == null || (selfUserContactDTO = userContactsDTO.getSelfUserContactDTO()) == null || !d0.k(selfUserContactDTO)) ? false : true;
        if (eVar != null && d0.i(eVar, false)) {
            z14 = true;
        }
        return ((Boolean) sVar.invoke(arrayListT, Boolean.valueOf(z15), Boolean.valueOf(z16), Boolean.valueOf(z17), Boolean.valueOf(z14))).booleanValue();
    }

    public final boolean H4(sd2.f fVar) {
        if (!this.f137982r) {
            boolean z14 = fVar.y0() && O4();
            boolean z15 = fVar.B2() && !((qj1.a) this.f137975f1.getValue()).f145046a.W2("key_emergency_calling_setup_completed", false);
            if (z14 || z15) {
                return true;
            }
        }
        return false;
    }

    public final String J4(String str) {
        ((tj1.h) this.f137899a.getValue()).getClass();
        LinkedHashMap linkedHashMapA = tj1.h.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapA.entrySet()) {
            if (p005kotlin.jvm.internal.s.g((String) entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        String str2 = (String) h0.c0(linkedHashMap.keySet());
        return str2 == null ? str : str2;
    }

    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final boolean K4(boolean z14, boolean z15) {
        String str;
        boolean z16;
        boolean z17;
        ?? r14;
        tj1.e eVarB;
        Boolean bool;
        l20.r rVarB;
        String str2;
        boolean z18;
        boolean z19;
        tj1.e eVar;
        l20.r userContactsDTO;
        g3<tj1.e> g3VarD = C4().d();
        l20.q selfUserContactDTO = (g3VarD == null || (eVar = g3VarD.f35301b) == null || (userContactsDTO = eVar.getUserContactsDTO()) == null) ? null : userContactsDTO.getSelfUserContactDTO();
        yj1.i iVar = (yj1.i) this.Z0.getValue();
        String phoneNumber = iVar.f197552a.getPhoneNumber();
        Boolean valid = iVar.f197553b.getValid();
        Boolean bool2 = Boolean.TRUE;
        String phoneNumber2 = (p005kotlin.jvm.internal.s.g(valid, bool2) && p005kotlin.jvm.internal.s.g(iVar.f197553b.getCanReceiveText(), bool2)) ? iVar.f197553b.getPhoneNumber() : null;
        if (z14 && z15 && g22.n.d(phoneNumber) && g22.n.d(phoneNumber2)) {
            if (phoneNumber != null) {
                if (selfUserContactDTO != null) {
                    z19 = true;
                    str2 = phoneNumber;
                    selfUserContactDTO = l20.q.b(selfUserContactDTO, null, null, null, null, null, null, null, null, null, null, k5(phoneNumber), null, null, 16515071);
                } else {
                    str2 = phoneNumber;
                    z19 = true;
                    selfUserContactDTO = null;
                }
                m5(z19, z19);
                z18 = z19;
            } else {
                str2 = phoneNumber;
                z18 = true;
            }
            l20.q qVar = selfUserContactDTO;
            if (phoneNumber2 != null) {
                selfUserContactDTO = qVar != null ? l20.q.b(qVar, null, null, null, null, null, null, null, null, null, null, l5(phoneNumber2, qVar.s()), null, null, 16515071) : null;
                z16 = false;
                m5(false, z18);
                str = str2;
                r14 = z18;
            } else {
                str = str2;
                selfUserContactDTO = qVar;
                z17 = z18;
                z17 = z;
                z17 = z;
                z16 = false;
                r14 = z17;
            }
        } else {
            boolean z24 = true;
            if (!z14 || !g22.n.d(phoneNumber)) {
                str = phoneNumber;
                z17 = z24;
                if (z15 && g22.n.d(phoneNumber2) && phoneNumber2 != null) {
                    selfUserContactDTO = selfUserContactDTO != null ? l20.q.b(selfUserContactDTO, null, null, null, null, null, null, null, null, null, null, l5(phoneNumber2, selfUserContactDTO.s()), null, null, 16515071) : null;
                    z16 = false;
                    m5(false, true);
                    r14 = z24;
                }
            } else if (phoneNumber != null) {
                if (selfUserContactDTO != null) {
                    str = phoneNumber;
                    selfUserContactDTO = l20.q.b(selfUserContactDTO, null, null, null, null, null, null, null, null, null, null, k5(phoneNumber), null, null, 16515071);
                } else {
                    str = phoneNumber;
                    selfUserContactDTO = null;
                }
                m5(true, true);
                z17 = z24;
            } else {
                str = phoneNumber;
                z17 = z24;
            }
            z17 = z24;
            z17 = z24;
            z16 = false;
            r14 = z17;
        }
        if (!g22.n.d(str) && !g22.n.d(phoneNumber2)) {
            return z16;
        }
        g3<tj1.e> g3VarD2 = C4().d();
        tj1.e eVar2 = g3VarD2 != null ? g3VarD2.f35301b : null;
        if (eVar2 != null) {
            l20.r userContactsDTO2 = eVar2.getUserContactsDTO();
            if (userContactsDTO2 != null) {
                bool = null;
                rVarB = l20.r.b(userContactsDTO2, null, null, selfUserContactDTO, 55);
            } else {
                bool = null;
                rVarB = null;
            }
            eVarB = tj1.e.b(eVar2, bool, rVarB, r14);
        } else {
            eVarB = null;
        }
        y0<g3<tj1.e>> y0VarC4 = C4();
        g3.f35298f.getClass();
        y0VarC4.m(g3.a.d(eVarB));
        return r14;
    }

    public final void L4() {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = this.P;
        if (arrayList3 != null) {
            arrayList = new ArrayList();
            for (Object obj : arrayList3) {
                sd2.f fVar = (sd2.f) obj;
                if (fVar.y0() && km2.a.i(fVar.getUnitID(), null, SupportedCapability.LTE_SUPPORT.ordinal())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && arrayList.size() == 1) {
            this.X0.m(new w61.f<>(Long.valueOf(((sd2.f) arrayList.get(0)).getUnitID())));
            return;
        }
        if ((arrayList != null ? arrayList.size() : -1) <= 1) {
            a2 a2Var = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "SafetyFeaturesViewModel", "why is the list empty? ");
            return;
        }
        this.J0.m("LTEDeviceSelectorFragment");
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                sd2.f fVar2 = (sd2.f) obj2;
                if (fVar2.y0() && km2.a.i(fVar2.getUnitID(), null, SupportedCapability.LTE_SUPPORT.ordinal())) {
                    arrayList4.add(obj2);
                }
            }
            arrayList2 = arrayList4;
        }
        this.Y.m(arrayList2);
    }

    public final boolean M4() {
        tj1.e eVar;
        g3<tj1.e> g3VarD = C4().d();
        String strE = (g3VarD == null || (eVar = g3VarD.f35301b) == null) ? "" : d0.e(eVar, false);
        vi1.b bVar = this.f137903e;
        Boolean boolC = bVar.c();
        Boolean bool = Boolean.FALSE;
        return !boolC.equals(bool) && (strE.length() <= 0 || !bVar.g().equals(bool));
    }

    public final boolean N4() {
        return (!this.f137987y || p005kotlin.jvm.internal.s.g(this.f137903e.b(), Boolean.FALSE) || this.f137982r) ? false : true;
    }

    public final void Q4(l20.r rVar) {
        ArrayList arrayList;
        l20.r userContactsDTO;
        List<l20.a> listF;
        g3<tj1.e> g3VarD = C4().d();
        tj1.e eVarB = g3VarD != null ? g3VarD.f35301b : null;
        List<l20.a> listF2 = rVar.f();
        if (listF2 != null) {
            for (l20.a aVar : listF2) {
                if (eVarB == null || (userContactsDTO = eVarB.getUserContactsDTO()) == null || (listF = userContactsDTO.f()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(listF);
                    cw.j.a(arrayList, aVar);
                }
                if (eVarB != null) {
                    l20.r userContactsDTO2 = eVarB.getUserContactsDTO();
                    eVarB = tj1.e.b(eVarB, null, userContactsDTO2 != null ? l20.r.b(userContactsDTO2, arrayList, null, null, 62) : null, 1);
                } else {
                    eVarB = null;
                }
            }
        }
        y0<g3<tj1.e>> y0VarC4 = C4();
        g3.f35298f.getClass();
        y0VarC4.m(g3.a.d(eVarB));
    }

    public final void R4(l20.a aVar) {
        ArrayList arrayList;
        tj1.e eVar;
        l20.r userContactsDTO;
        List<l20.a> listF;
        l20.r userContactsDTO2;
        List<l20.a> listF2;
        g3<tj1.e> g3VarD = C4().d();
        tj1.e eVar2 = g3VarD != null ? g3VarD.f35301b : null;
        Boolean assistancePlusEnabled = eVar2 != null ? eVar2.getAssistancePlusEnabled() : null;
        if (!ge1.b.Q(aVar) && eVar2 != null && (userContactsDTO2 = eVar2.getUserContactsDTO()) != null && (listF2 = userContactsDTO2.f()) != null) {
            if (!listF2.isEmpty()) {
                Iterator<T> it = listF2.iterator();
                do {
                    if (!it.hasNext()) {
                        assistancePlusEnabled = Boolean.FALSE;
                        break;
                    }
                } while (!ge1.b.Q((l20.a) it.next()));
            } else {
                assistancePlusEnabled = Boolean.FALSE;
                break;
            }
        }
        if (eVar2 == null || (userContactsDTO = eVar2.getUserContactsDTO()) == null || (listF = userContactsDTO.f()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(listF);
            cw.j.a(arrayList, aVar);
        }
        if (eVar2 != null) {
            l20.r userContactsDTO3 = eVar2.getUserContactsDTO();
            eVar = new tj1.e(assistancePlusEnabled, userContactsDTO3 != null ? l20.r.b(userContactsDTO3, arrayList, null, null, 62) : null);
        } else {
            eVar = null;
        }
        ad0.f fVar = new ad0.f((Object) this, (Object) eVar, false, 16);
        hl.a aVar2 = this.f137981q;
        aVar2.getClass();
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new k(eVar, aVar2, this, fVar, null), 2);
    }

    public final void S4() {
        this.P0.m(null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void T4() {
        wj1.a aVar;
        tj1.e eVar;
        List listT;
        l20.r userContactsDTO;
        List<l20.a> listF;
        l20.r userContactsDTO2;
        g3 g3Var = (g3) this.D.d();
        if (g3Var == null || (aVar = (wj1.a) g3Var.f35301b) == null) {
            return;
        }
        yj1.e bVar = null;
        boolean z14 = this.f137982r;
        if (z14) {
            tj1.e eVar2 = aVar.f185783a;
            l20.a emergencyServiceContact = (eVar2 == null || (userContactsDTO2 = eVar2.getUserContactsDTO()) == null) ? null : userContactsDTO2.getEmergencyServiceContact();
            ArrayList arrayListB = aVar.b();
            if (emergencyServiceContact == null || !vj1.f.d(emergencyServiceContact)) {
                emergencyServiceContact = vj1.f.a(arrayListB);
            }
            if (emergencyServiceContact == null) {
                bVar = yj1.e.a.f197531a;
            } else if (z14) {
                eVar = aVar.f185783a;
                if (eVar != null) {
                    listT = j0.f134944a;
                } else {
                    listT = j0.f134944a;
                }
                if (listT.isEmpty()) {
                    bVar = new yj1.e.c(aVar);
                } else if (!z14) {
                    bVar = new yj1.e.b(aVar);
                }
            } else if (!z14) {
                bVar = new yj1.e.b(aVar);
            }
        } else if (z14) {
            eVar = aVar.f185783a;
            if (eVar != null || (userContactsDTO = eVar.getUserContactsDTO()) == null || (listF = userContactsDTO.f()) == null) {
                listT = j0.f134944a;
            } else {
                listT = ge1.b.t(listF);
            }
            if (listT.isEmpty()) {
                bVar = new yj1.e.c(aVar);
            } else if (!z14) {
                bVar = new yj1.e.b(aVar);
            }
        } else if (!z14 && aVar.b().isEmpty()) {
            bVar = new yj1.e.b(aVar);
        }
        if (bVar != null) {
            this.P0.m(bVar);
        } else {
            this.R0.m(new w61.f<>(aVar));
        }
    }

    public final void U4(boolean z14) {
        this.f137911m = z14;
        C4().m(C4().d());
        if (z14) {
            eq0.a.f65038b.a().getClass();
            eq0.a.Q();
            this.J0.m("AssistanceTypeFragment");
        }
    }

    public final void V4(l20.q qVar) {
        g3<tj1.e> g3VarD = C4().d();
        tj1.e eVarB = null;
        tj1.e eVar = g3VarD != null ? g3VarD.f35301b : null;
        if (eVar != null) {
            l20.r userContactsDTO = eVar.getUserContactsDTO();
            eVarB = tj1.e.b(eVar, null, userContactsDTO != null ? l20.r.b(userContactsDTO, null, null, qVar, 55) : null, 1);
        }
        y0<g3<tj1.e>> y0VarC4 = C4();
        g3.f35298f.getClass();
        y0VarC4.m(g3.a.d(eVarB));
    }

    public final void W4(String str) {
        l20.r rVarB;
        l20.q selfUserContactDTO;
        str.getClass();
        g3<tj1.e> g3VarD = C4().d();
        tj1.e eVarB = null;
        tj1.e eVar = g3VarD != null ? g3VarD.f35301b : null;
        if (eVar != null) {
            l20.r userContactsDTO = eVar.getUserContactsDTO();
            if (userContactsDTO != null) {
                l20.r userContactsDTO2 = eVar.getUserContactsDTO();
                rVarB = l20.r.b(userContactsDTO, null, null, (userContactsDTO2 == null || (selfUserContactDTO = userContactsDTO2.getSelfUserContactDTO()) == null) ? null : l20.q.b(selfUserContactDTO, null, null, null, null, null, null, str, null, null, null, null, null, null, 16776959), 55);
            } else {
                rVarB = null;
            }
            eVarB = tj1.e.b(eVar, null, rVarB, 1);
        }
        y0<g3<tj1.e>> y0VarC4 = C4();
        g3.f35298f.getClass();
        y0VarC4.m(g3.a.d(eVarB));
    }

    public final void X4() {
        this.f137903e.o(true);
        this.J0.m("EmergencyContactsFragment");
        y0<g3<tj1.e>> y0VarC4 = C4();
        g3.a aVar = g3.f35298f;
        g3<tj1.e> g3VarD = C4().d();
        tj1.e eVar = g3VarD != null ? g3VarD.f35301b : null;
        aVar.getClass();
        y0VarC4.m(g3.a.d(eVar));
    }

    public final void Y4(int i14, Long l14) {
        Object obj = null;
        y0 y0Var = this.f137979k0;
        if (l14 != null) {
            List list = (List) y0Var.d();
            if (list != null) {
                for (Object obj2 : list) {
                    if (((sd2.f) obj2).getUnitID() == l14.longValue()) {
                        obj = obj2;
                        break;
                    }
                }
                obj = (sd2.f) obj;
            }
        } else {
            List list2 = (List) y0Var.d();
            if (list2 != null) {
                for (Object obj3 : d0.d(list2)) {
                    if (km2.a.i(((sd2.f) obj3).getUnitID(), null, SupportedCapability.REALTIME_SETTINGS.ordinal())) {
                        obj = obj3;
                        break;
                    }
                }
                obj = (sd2.f) obj;
            }
        }
        if (obj == null) {
            return;
        }
        this.V0.m(Boolean.TRUE);
        this.T0.m(new w61.f<>(new o13.p(obj, Integer.valueOf(i14))));
    }

    public final void a5(boolean z14) {
        ArrayList arrayList;
        ArrayList arrayList2;
        tj1.e eVar;
        tj1.e eVar2;
        g3<tj1.e> g3VarD;
        tj1.e eVar3;
        List<l20.c> listZ;
        tj1.e eVar4;
        l20.r userContactsDTO;
        List<l20.a> listF;
        tj1.e eVar5;
        tj1.e eVar6;
        tj1.e eVar7;
        boolean z15 = false;
        ArrayList arrayList3 = this.P;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList3) {
                if (((sd2.f) obj).y0()) {
                    arrayList4.add(obj);
                }
            }
            if (!arrayList4.isEmpty()) {
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    if (this.f137903e.k(((sd2.f) it.next()).getUnitID())) {
                        z15 = true;
                        break;
                    }
                }
            }
        }
        y0<w61.f<o13.p<Integer, Integer>>> y0Var = this.L0;
        tj1.e eVarB = null;
        if (z14 && !this.f137911m && z15) {
            y0<g3<tj1.e>> y0VarC4 = C4();
            g3.a aVar = g3.f35298f;
            g3<tj1.e> g3VarD2 = C4().d();
            if (g3VarD2 != null && (eVar7 = g3VarD2.f35301b) != null) {
                eVarB = tj1.e.b(eVar7, Boolean.FALSE, null, 2);
            }
            aVar.getClass();
            y0VarC4.m(g3.a.d(eVarB));
            y0Var.m(new w61.f<>(new o13.p(Integer.valueOf(R.string.lte_activation_in_progress_dialog_title), Integer.valueOf(R.string.lte_activation_in_progress_dialog_desc))));
            return;
        }
        if (z14 && !this.f137911m) {
            y0<g3<tj1.e>> y0VarC5 = C4();
            g3.a aVar2 = g3.f35298f;
            g3<tj1.e> g3VarD3 = C4().d();
            if (g3VarD3 != null && (eVar6 = g3VarD3.f35301b) != null) {
                eVarB = tj1.e.b(eVar6, Boolean.FALSE, null, 2);
            }
            aVar2.getClass();
            y0VarC5.m(g3.a.d(eVarB));
            y0Var.m(new w61.f<>(new o13.p(Integer.valueOf(R.string.lte_not_activated), Integer.valueOf(R.string.safety_features_wizard_lte_activation_2))));
            return;
        }
        if (this.f137983t) {
            y0<g3<tj1.e>> y0VarC6 = C4();
            g3.a aVar3 = g3.f35298f;
            g3<tj1.e> g3VarD4 = C4().d();
            if (g3VarD4 != null && (eVar5 = g3VarD4.f35301b) != null) {
                eVarB = tj1.e.b(eVar5, Boolean.valueOf(z14), null, 2);
            }
            aVar3.getClass();
            y0VarC6.m(g3.a.d(eVarB));
            this.f137986x = z14;
            return;
        }
        g3<tj1.e> g3VarD5 = C4().d();
        if (g3VarD5 == null || (eVar4 = g3VarD5.f35301b) == null || (userContactsDTO = eVar4.getUserContactsDTO()) == null || (listF = userContactsDTO.f()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj2 : listF) {
                if (ge1.b.Q((l20.a) obj2)) {
                    arrayList.add(obj2);
                }
            }
        }
        if (arrayList == null || !(!arrayList.isEmpty())) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                l20.a aVar4 = (l20.a) obj3;
                List<l20.c> listZ2 = aVar4.z();
                Integer numValueOf = listZ2 != null ? Integer.valueOf(listZ2.size()) : null;
                numValueOf.getClass();
                if (numValueOf.intValue() <= 0 || (listZ = aVar4.z()) == null || !cq0.k.a(listZ)) {
                    List<l20.c> listR = aVar4.r();
                    Integer numValueOf2 = listR != null ? Integer.valueOf(listR.size()) : null;
                    numValueOf2.getClass();
                    if (numValueOf2.intValue() > 0) {
                    }
                }
                arrayList2.add(obj3);
            }
        }
        if ((!z14 || (g3VarD = C4().d()) == null || (eVar3 = g3VarD.f35301b) == null || d0.i(eVar3, z14)) && arrayList2 != null && !arrayList2.isEmpty() && (!z14 || M4())) {
            y0<g3<tj1.e>> y0VarC7 = C4();
            g3.a aVar5 = g3.f35298f;
            g3<tj1.e> g3VarD6 = C4().d();
            if (g3VarD6 != null && (eVar = g3VarD6.f35301b) != null) {
                eVarB = tj1.e.b(eVar, Boolean.valueOf(z14), null, 2);
            }
            aVar5.getClass();
            y0VarC7.m(g3.a.d(eVarB));
            this.f137986x = z14;
            return;
        }
        y0<g3<tj1.e>> y0VarC8 = C4();
        g3.a aVar6 = g3.f35298f;
        g3<tj1.e> g3VarD7 = C4().d();
        if (g3VarD7 != null && (eVar2 = g3VarD7.f35301b) != null) {
            eVarB = tj1.e.b(eVar2, Boolean.FALSE, null, 2);
        }
        aVar6.getClass();
        y0VarC8.m(g3.a.d(eVarB));
        y0Var.m(new w61.f<>(new o13.p(Integer.valueOf(R.string.more_information_needed_title), Integer.valueOf(R.string.more_information_and_assistance_contact_needed_desc))));
    }

    public final void b5(boolean z14) {
        tj1.e eVar;
        this.f137986x = z14;
        y0<g3<tj1.e>> y0VarC4 = C4();
        g3.a aVar = g3.f35298f;
        g3<tj1.e> g3VarD = C4().d();
        tj1.e eVarB = (g3VarD == null || (eVar = g3VarD.f35301b) == null) ? null : tj1.e.b(eVar, Boolean.valueOf(z14), null, 2);
        aVar.getClass();
        y0VarC4.m(g3.a.d(eVarB));
        this.J0.m("MyInformationFragment");
        y0<g3<tj1.e>> y0VarC5 = C4();
        g3<tj1.e> g3VarD2 = C4().d();
        y0VarC5.m(g3.a.d(g3VarD2 != null ? g3VarD2.f35301b : null));
    }

    public final void f5() {
        ue0.h hVar;
        Object next;
        boolean zT;
        boolean zF;
        boolean zH;
        hl.a.c cVar = hl.a.c.f84256b;
        hl.a aVar = this.f137981q;
        ue0.h hVar2 = null;
        Object obj = null;
        sd2.f fVar = null;
        Object obj2 = null;
        if (!p005kotlin.jvm.internal.s.g(aVar, cVar)) {
            if (!(aVar instanceof hl.a.b)) {
                u0.r();
                return;
            }
            this.f137987y = false;
            List<ue0.h> list = this.I;
            if (list != null) {
                Iterator<T> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((ue0.h) next).getEmergencyCallingCapable(), Boolean.TRUE));
                hVar = (ue0.h) next;
            } else {
                hVar = null;
            }
            this.f137988z = hVar != null;
            List<ue0.h> list2 = this.I;
            if (list2 != null) {
                for (Object obj3 : list2) {
                    if (p005kotlin.jvm.internal.s.g(((ue0.h) obj3).getFallDetectionCapable(), Boolean.TRUE)) {
                        obj2 = obj3;
                        break;
                    }
                }
                hVar2 = (ue0.h) obj2;
            }
            this.A = hVar2 != null;
            return;
        }
        ArrayList arrayList = this.P;
        if (arrayList != null) {
            for (Object obj4 : arrayList) {
                long unitID = ((sd2.f) obj4).getUnitID();
                Long l14 = this.f137985w;
                if (l14 != null && unitID == l14.longValue()) {
                    obj = obj4;
                    break;
                }
            }
            fVar = (sd2.f) obj;
        }
        yj1.n nVar = this.f137984v;
        if (fVar != null) {
            zT = fVar.y0();
        } else if (nVar != null) {
            zT = nVar.equals(yj1.n.ASSISTANCE_PLUS);
        } else {
            Map<zb0.u0, vg1.t> map = zb0.n0.f203577a;
            zT = bo1.a.a().c().t();
        }
        this.f137987y = zT;
        if (fVar != null) {
            zF = fVar.B2();
        } else if (nVar != null) {
            zF = nVar.equals(yj1.n.EMERGENCY_CALLING);
        } else {
            Map<zb0.u0, vg1.t> map2 = zb0.n0.f203577a;
            zF = bo1.a.a().c().F();
        }
        this.f137988z = zF;
        if (fVar != null) {
            zH = fVar.u0();
        } else {
            Map<zb0.u0, vg1.t> map3 = zb0.n0.f203577a;
            zH = bo1.a.a().c().H();
        }
        this.A = zH;
    }

    public final void h5(l20.r rVar) {
        g3<tj1.e> g3VarD = C4().d();
        tj1.e eVarB = null;
        tj1.e eVar = g3VarD != null ? g3VarD.f35301b : null;
        if (eVar != null) {
            l20.r userContactsDTO = eVar.getUserContactsDTO();
            eVarB = tj1.e.b(eVar, null, userContactsDTO != null ? l20.r.b(userContactsDTO, rVar.f(), null, null, 62) : null, 1);
        }
        y0<g3<tj1.e>> y0VarC4 = C4();
        g3.f35298f.getClass();
        y0VarC4.m(g3.a.d(eVarB));
    }

    public final void i5(l20.a aVar) {
        g3<tj1.e> g3VarD = C4().d();
        tj1.e eVar = g3VarD != null ? g3VarD.f35301b : null;
        tj1.e eVarN = eVar != null ? d0.n(eVar, aVar) : null;
        y0<g3<tj1.e>> y0VarC4 = C4();
        g3.f35298f.getClass();
        y0VarC4.j(g3.a.d(eVarN));
    }

    public final List<l20.c> k5(String str) {
        tj1.e eVar;
        l20.r userContactsDTO;
        l20.q selfUserContactDTO;
        str.getClass();
        g3<tj1.e> g3VarD = C4().d();
        List<l20.c> listS = (g3VarD == null || (eVar = g3VarD.f35301b) == null || (userContactsDTO = eVar.getUserContactsDTO()) == null || (selfUserContactDTO = userContactsDTO.getSelfUserContactDTO()) == null) ? null : selfUserContactDTO.s();
        if (listS == null || listS.isEmpty()) {
            return p13.w.c(new l20.c(null, str, Boolean.TRUE, Integer.valueOf(l20.m.PRIMARY.f109026a), Integer.valueOf(l20.p.MOBILE.f109040a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048545, null));
        }
        ArrayList arrayList = new ArrayList(p13.y.r(listS, 10));
        for (l20.c cVarB : listS) {
            if (p005kotlin.jvm.internal.s.g(cVarB.getIsPrimary(), Boolean.TRUE)) {
                cVarB = l20.c.b(cVarB, null, str, null, null, null, null, null, null, null, null, 0, 1048573);
            }
            arrayList.add(cVarB);
        }
        if (!listS.isEmpty()) {
            Iterator<T> it = listS.iterator();
            while (it.hasNext()) {
                if (p005kotlin.jvm.internal.s.g(((l20.c) it.next()).getIsPrimary(), Boolean.TRUE)) {
                    return arrayList;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(listS);
        arrayList2.add(new l20.c(null, str, Boolean.TRUE, Integer.valueOf(l20.m.PRIMARY.f109026a), Integer.valueOf(l20.p.MOBILE.f109040a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048545, null));
        return arrayList2;
    }

    public final void m5(boolean z14, boolean z15) {
        vi1.b bVar = this.f137903e;
        if (z14) {
            bVar.a(z15);
        } else {
            bVar.d(z15);
        }
    }

    public final void o5() {
        g3<tj1.e> g3VarD = C4().d();
        tj1.e eVar = g3VarD != null ? g3VarD.f35301b : null;
        if (eVar != null && com.garmin.android.apps.connectmobile.contacts.b.e() && N4()) {
            p5(d0.e(eVar, true), d0.e(eVar, false));
        }
    }

    public final void p5(String str, String str2) {
        g3<yj1.i> g3VarA;
        str.getClass();
        str2.getClass();
        yj1.i iVar = null;
        if (str.length() != 0) {
            ge1.b.T(v1.a(this), null, null, new e(str, str2, null), 3);
            return;
        }
        g3.a aVar = g3.f35298f;
        y0<w61.f<g3<yj1.i>>> y0Var = this.f137970a1;
        w61.f<g3<yj1.i>> fVarD = y0Var.d();
        if (fVarD != null && (g3VarA = fVarD.a()) != null) {
            iVar = g3VarA.f35301b;
        }
        y0Var.j(new w61.f<>(g3.a.a(aVar, null, null, j5(iVar, new p0(null, null, null, null, Boolean.FALSE, null, null, 111, null), true), null, 11)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    public final void q5(final boolean z14) {
        final tj1.e eVarB;
        tj1.e eVar;
        if (this.f137983t) {
            g3<tj1.e> g3VarD = C4().d();
            if (g3VarD == null || (eVar = g3VarD.f35301b) == null) {
                eVarB = null;
            } else {
                eVarB = tj1.e.b(eVar, Boolean.valueOf(z14), null, 2);
            }
        } else {
            g3<tj1.e> g3VarD2 = C4().d();
            if (g3VarD2 != null) {
                eVarB = g3VarD2.f35301b;
            } else {
                eVarB = null;
            }
        }
        if (n5(eVarB, new e23.s() { // from class: pj1.q
            /* JADX WARN: Code duplicated, block: B:58:0x00d2 A[EDGE_INSN: B:42:0x00a5->B:58:0x00d2 BREAK  A[LOOP:0: B:37:0x008f->B:104:?]
                EDGE_INSN: B:44:0x00ab->B:58:0x00d2 BREAK  A[LOOP:0: B:37:0x008f->B:104:?]
                EDGE_INSN: B:46:0x00b1->B:58:0x00d2 BREAK  A[LOOP:0: B:37:0x008f->B:104:?]
                EDGE_INSN: B:48:0x00b7->B:58:0x00d2 BREAK  A[LOOP:0: B:37:0x008f->B:104:?]
                EDGE_INSN: B:49:0x00b9->B:58:0x00d2 BREAK  A[LOOP:0: B:37:0x008f->B:104:?]
                EDGE_INSN: B:50:0x00bb->B:58:0x00d2 BREAK  A[LOOP:0: B:37:0x008f->B:104:?]] */
            /* JADX WARN: Code duplicated, block: B:60:0x00d5  */
            /* JADX WARN: Code duplicated, block: B:61:0x00e0  */
            /* JADX WARN: Code duplicated, block: B:63:0x00e3 A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:66:0x00e9 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:67:0x00eb  */
            /* JADX WARN: Code duplicated, block: B:68:0x00f6  */
            /* JADX WARN: Code duplicated, block: B:71:0x00fb  */
            /* JADX WARN: Code duplicated, block: B:72:0x00fd A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:74:0x0100  */
            /* JADX WARN: Code duplicated, block: B:76:0x0103 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:77:0x0105  */
            /* JADX WARN: Code duplicated, block: B:79:0x011c  */
            /* JADX WARN: Code duplicated, block: B:80:0x0131  */
            /* JADX WARN: Code duplicated, block: B:81:0x0133 A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:84:0x014c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:85:0x014e A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:87:0x0165 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:88:0x0167  */
            /* JADX WARN: Code duplicated, block: B:89:0x017f A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:90:0x0181  */
            /* JADX WARN: Code duplicated, block: B:91:0x0196  */
            /* JADX WARN: Code duplicated, block: B:92:0x01a4  */
            /* JADX WARN: Code duplicated, block: B:93:0x01a6 A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:95:0x01be A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:96:0x01c0  */
            /* JADX WARN: Code duplicated, block: B:97:0x01d6 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:98:0x01d8  */
            /* JADX WARN: Code duplicated, block: B:99:0x01ee  */
            @Override // e23.s
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                boolean zG;
                boolean zG2;
                l20.r userContactsDTO;
                l20.q selfUserContactDTO;
                String fullName;
                l20.r userContactsDTO2;
                l20.q selfUserContactDTO2;
                l20.r userContactsDTO3;
                l20.q selfUserContactDTO3;
                String countryOfCitizenship;
                l20.r userContactsDTO4;
                l20.q selfUserContactDTO4;
                List<l20.c> listJ;
                l20.q selfUserContactDTO5;
                List<l20.c> listS;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj5).booleanValue();
                Integer numValueOf = Integer.valueOf(R.string.lte_exit_safety_features);
                s sVar = this.f137962a;
                boolean z15 = sVar.f137983t;
                y0<w61.f<o13.p<Integer, Integer>>> y0Var = sVar.L0;
                tj1.e eVar2 = eVarB;
                boolean z16 = true;
                if (z15) {
                    if (eVar2 == null || (userContactsDTO = eVar2.getUserContactsDTO()) == null || (selfUserContactDTO = userContactsDTO.getSelfUserContactDTO()) == null || (fullName = selfUserContactDTO.getFullName()) == null || !(!d53.w.J(fullName)) || (userContactsDTO2 = eVar2.getUserContactsDTO()) == null || (selfUserContactDTO2 = userContactsDTO2.getSelfUserContactDTO()) == null || !d0.g(selfUserContactDTO2, true) || (userContactsDTO3 = eVar2.getUserContactsDTO()) == null || (selfUserContactDTO3 = userContactsDTO3.getSelfUserContactDTO()) == null || (countryOfCitizenship = selfUserContactDTO3.getCountryOfCitizenship()) == null || !(!d53.w.J(countryOfCitizenship)) || (userContactsDTO4 = eVar2.getUserContactsDTO()) == null || (selfUserContactDTO4 = userContactsDTO4.getSelfUserContactDTO()) == null || (listJ = selfUserContactDTO4.j()) == null || listJ.isEmpty()) {
                        if (eVar2 != null) {
                            zG = p005kotlin.jvm.internal.s.g(eVar2.getAssistancePlusEnabled(), Boolean.FALSE);
                        } else {
                            zG = false;
                        }
                        if (zG || !zBooleanValue3 || !zBooleanValue) {
                            if (eVar2 != null) {
                                zG2 = p005kotlin.jvm.internal.s.g(eVar2.getAssistancePlusEnabled(), Boolean.TRUE);
                            } else {
                                zG2 = false;
                            }
                            if (zG2) {
                                if (zBooleanValue4 && zBooleanValue3) {
                                    if (zBooleanValue2) {
                                        y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_contacts_notify))));
                                    } else {
                                        y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_contacts))));
                                    }
                                } else if (!zBooleanValue4 && zBooleanValue && !zBooleanValue2) {
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_assistance_contact_assistance_plus))));
                                } else if (zBooleanValue4 && !zBooleanValue) {
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contacts_and_safety))));
                                } else if (!zBooleanValue) {
                                    sVar.a5(false);
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contacts_and_other_safety))));
                                } else if (zBooleanValue4) {
                                    a2 a2Var = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var, "SafetyFeaturesViewModel", "verifyAllFields(), assistancePlusEnabled why are we here? ");
                                } else {
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_and_safety))));
                                }
                            } else if (zBooleanValue3 && !zBooleanValue) {
                                y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_safety_features_assistance_contact))));
                            } else if (!zBooleanValue) {
                                y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contact_safety_features))));
                            } else if (zBooleanValue3) {
                                a2 a2Var2 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var2, "SafetyFeaturesViewModel", "verifyAllFields(), why are we here? ");
                            } else {
                                y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_generic_safety_features))));
                            }
                            z16 = false;
                        }
                    } else {
                        Iterator<T> it = listJ.iterator();
                        while (it.hasNext()) {
                            if (gl1.d.J((l20.c) it.next())) {
                                l20.r userContactsDTO5 = eVar2.getUserContactsDTO();
                                if (userContactsDTO5 == null || (selfUserContactDTO5 = userContactsDTO5.getSelfUserContactDTO()) == null || (listS = selfUserContactDTO5.s()) == null || !d0.h(listS) || !zBooleanValue || !zBooleanValue2) {
                                    break;
                                }
                                sVar.a5(z14);
                            }
                        }
                        if (eVar2 != null) {
                            zG = p005kotlin.jvm.internal.s.g(eVar2.getAssistancePlusEnabled(), Boolean.FALSE);
                        } else {
                            zG = false;
                        }
                        if (zG) {
                            if (eVar2 != null) {
                                zG2 = p005kotlin.jvm.internal.s.g(eVar2.getAssistancePlusEnabled(), Boolean.TRUE);
                            } else {
                                zG2 = false;
                            }
                            if (zG2) {
                                if (zBooleanValue4 && zBooleanValue3) {
                                    if (zBooleanValue2) {
                                        y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_contacts_notify))));
                                    } else {
                                        y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_contacts))));
                                    }
                                } else if (!zBooleanValue4) {
                                    if (zBooleanValue4) {
                                        if (!zBooleanValue) {
                                            sVar.a5(false);
                                            y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contacts_and_other_safety))));
                                        } else if (zBooleanValue4) {
                                            y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_and_safety))));
                                        } else {
                                            a2 a2Var3 = a2.SAFETY_FEATURES;
                                            i2.f36769a.getClass();
                                            i2.a.f(a2Var3, "SafetyFeaturesViewModel", "verifyAllFields(), assistancePlusEnabled why are we here? ");
                                        }
                                    } else if (!zBooleanValue) {
                                        sVar.a5(false);
                                        y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contacts_and_other_safety))));
                                    } else if (zBooleanValue4) {
                                        y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_and_safety))));
                                    } else {
                                        a2 a2Var4 = a2.SAFETY_FEATURES;
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var4, "SafetyFeaturesViewModel", "verifyAllFields(), assistancePlusEnabled why are we here? ");
                                    }
                                } else if (zBooleanValue4) {
                                    if (!zBooleanValue) {
                                        sVar.a5(false);
                                        y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contacts_and_other_safety))));
                                    } else if (zBooleanValue4) {
                                        y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_and_safety))));
                                    } else {
                                        a2 a2Var5 = a2.SAFETY_FEATURES;
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var5, "SafetyFeaturesViewModel", "verifyAllFields(), assistancePlusEnabled why are we here? ");
                                    }
                                } else if (!zBooleanValue) {
                                    sVar.a5(false);
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contacts_and_other_safety))));
                                } else if (zBooleanValue4) {
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_and_safety))));
                                } else {
                                    a2 a2Var6 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var6, "SafetyFeaturesViewModel", "verifyAllFields(), assistancePlusEnabled why are we here? ");
                                }
                            } else if (zBooleanValue3) {
                                if (!zBooleanValue) {
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contact_safety_features))));
                                } else if (zBooleanValue3) {
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_generic_safety_features))));
                                } else {
                                    a2 a2Var7 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var7, "SafetyFeaturesViewModel", "verifyAllFields(), why are we here? ");
                                }
                            } else if (!zBooleanValue) {
                                y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contact_safety_features))));
                            } else if (zBooleanValue3) {
                                y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_generic_safety_features))));
                            } else {
                                a2 a2Var8 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var8, "SafetyFeaturesViewModel", "verifyAllFields(), why are we here? ");
                            }
                            z16 = false;
                        } else {
                            if (eVar2 != null) {
                                zG2 = p005kotlin.jvm.internal.s.g(eVar2.getAssistancePlusEnabled(), Boolean.TRUE);
                            } else {
                                zG2 = false;
                            }
                            if (zG2) {
                                if (zBooleanValue4 && zBooleanValue3) {
                                    if (zBooleanValue2) {
                                        y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_contacts_notify))));
                                    } else {
                                        y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_contacts))));
                                    }
                                } else if (!zBooleanValue4) {
                                    if (zBooleanValue4) {
                                        if (!zBooleanValue) {
                                            sVar.a5(false);
                                            y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contacts_and_other_safety))));
                                        } else if (zBooleanValue4) {
                                            y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_and_safety))));
                                        } else {
                                            a2 a2Var9 = a2.SAFETY_FEATURES;
                                            i2.f36769a.getClass();
                                            i2.a.f(a2Var9, "SafetyFeaturesViewModel", "verifyAllFields(), assistancePlusEnabled why are we here? ");
                                        }
                                    } else if (!zBooleanValue) {
                                        sVar.a5(false);
                                        y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contacts_and_other_safety))));
                                    } else if (zBooleanValue4) {
                                        y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_and_safety))));
                                    } else {
                                        a2 a2Var10 = a2.SAFETY_FEATURES;
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var10, "SafetyFeaturesViewModel", "verifyAllFields(), assistancePlusEnabled why are we here? ");
                                    }
                                } else if (zBooleanValue4) {
                                    if (!zBooleanValue) {
                                        sVar.a5(false);
                                        y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contacts_and_other_safety))));
                                    } else if (zBooleanValue4) {
                                        y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_and_safety))));
                                    } else {
                                        a2 a2Var11 = a2.SAFETY_FEATURES;
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var11, "SafetyFeaturesViewModel", "verifyAllFields(), assistancePlusEnabled why are we here? ");
                                    }
                                } else if (!zBooleanValue) {
                                    sVar.a5(false);
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contacts_and_other_safety))));
                                } else if (zBooleanValue4) {
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_and_safety))));
                                } else {
                                    a2 a2Var12 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var12, "SafetyFeaturesViewModel", "verifyAllFields(), assistancePlusEnabled why are we here? ");
                                }
                            } else if (zBooleanValue3) {
                                if (!zBooleanValue) {
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contact_safety_features))));
                                } else if (zBooleanValue3) {
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_generic_safety_features))));
                                } else {
                                    a2 a2Var13 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var13, "SafetyFeaturesViewModel", "verifyAllFields(), why are we here? ");
                                }
                            } else if (!zBooleanValue) {
                                y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contact_safety_features))));
                            } else if (zBooleanValue3) {
                                y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_generic_safety_features))));
                            } else {
                                a2 a2Var14 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var14, "SafetyFeaturesViewModel", "verifyAllFields(), why are we here? ");
                            }
                            z16 = false;
                        }
                    }
                } else if (!zBooleanValue4 || !zBooleanValue || !zBooleanValue2 || !sVar.M4()) {
                    if (eVar2 != null) {
                        zG = p005kotlin.jvm.internal.s.g(eVar2.getAssistancePlusEnabled(), Boolean.FALSE);
                    } else {
                        zG = false;
                    }
                    if (zG) {
                        if (eVar2 != null) {
                            zG2 = p005kotlin.jvm.internal.s.g(eVar2.getAssistancePlusEnabled(), Boolean.TRUE);
                        } else {
                            zG2 = false;
                        }
                        if (zG2) {
                            if (zBooleanValue4 && zBooleanValue3) {
                                if (zBooleanValue2) {
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_contacts_notify))));
                                } else {
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_contacts))));
                                }
                            } else if (!zBooleanValue4) {
                                if (zBooleanValue4) {
                                    if (!zBooleanValue) {
                                        sVar.a5(false);
                                        y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contacts_and_other_safety))));
                                    } else if (zBooleanValue4) {
                                        y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_and_safety))));
                                    } else {
                                        a2 a2Var15 = a2.SAFETY_FEATURES;
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var15, "SafetyFeaturesViewModel", "verifyAllFields(), assistancePlusEnabled why are we here? ");
                                    }
                                } else if (!zBooleanValue) {
                                    sVar.a5(false);
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contacts_and_other_safety))));
                                } else if (zBooleanValue4) {
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_and_safety))));
                                } else {
                                    a2 a2Var16 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var16, "SafetyFeaturesViewModel", "verifyAllFields(), assistancePlusEnabled why are we here? ");
                                }
                            } else if (zBooleanValue4) {
                                if (!zBooleanValue) {
                                    sVar.a5(false);
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contacts_and_other_safety))));
                                } else if (zBooleanValue4) {
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_and_safety))));
                                } else {
                                    a2 a2Var17 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var17, "SafetyFeaturesViewModel", "verifyAllFields(), assistancePlusEnabled why are we here? ");
                                }
                            } else if (!zBooleanValue) {
                                sVar.a5(false);
                                y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contacts_and_other_safety))));
                            } else if (zBooleanValue4) {
                                y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_and_safety))));
                            } else {
                                a2 a2Var18 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var18, "SafetyFeaturesViewModel", "verifyAllFields(), assistancePlusEnabled why are we here? ");
                            }
                        } else if (zBooleanValue3) {
                            if (!zBooleanValue) {
                                y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contact_safety_features))));
                            } else if (zBooleanValue3) {
                                y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_generic_safety_features))));
                            } else {
                                a2 a2Var19 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var19, "SafetyFeaturesViewModel", "verifyAllFields(), why are we here? ");
                            }
                        } else if (!zBooleanValue) {
                            y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contact_safety_features))));
                        } else if (zBooleanValue3) {
                            y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_generic_safety_features))));
                        } else {
                            a2 a2Var110 = a2.SAFETY_FEATURES;
                            i2.f36769a.getClass();
                            i2.a.f(a2Var110, "SafetyFeaturesViewModel", "verifyAllFields(), why are we here? ");
                        }
                        z16 = false;
                    } else {
                        if (eVar2 != null) {
                            zG2 = p005kotlin.jvm.internal.s.g(eVar2.getAssistancePlusEnabled(), Boolean.TRUE);
                        } else {
                            zG2 = false;
                        }
                        if (zG2) {
                            if (zBooleanValue4 && zBooleanValue3) {
                                if (zBooleanValue2) {
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_contacts_notify))));
                                } else {
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_contacts))));
                                }
                            } else if (!zBooleanValue4) {
                                if (zBooleanValue4) {
                                    if (!zBooleanValue) {
                                        sVar.a5(false);
                                        y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contacts_and_other_safety))));
                                    } else if (zBooleanValue4) {
                                        y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_and_safety))));
                                    } else {
                                        a2 a2Var111 = a2.SAFETY_FEATURES;
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var111, "SafetyFeaturesViewModel", "verifyAllFields(), assistancePlusEnabled why are we here? ");
                                    }
                                } else if (!zBooleanValue) {
                                    sVar.a5(false);
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contacts_and_other_safety))));
                                } else if (zBooleanValue4) {
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_and_safety))));
                                } else {
                                    a2 a2Var112 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var112, "SafetyFeaturesViewModel", "verifyAllFields(), assistancePlusEnabled why are we here? ");
                                }
                            } else if (zBooleanValue4) {
                                if (!zBooleanValue) {
                                    sVar.a5(false);
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contacts_and_other_safety))));
                                } else if (zBooleanValue4) {
                                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_and_safety))));
                                } else {
                                    a2 a2Var113 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var113, "SafetyFeaturesViewModel", "verifyAllFields(), assistancePlusEnabled why are we here? ");
                                }
                            } else if (!zBooleanValue) {
                                sVar.a5(false);
                                y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contacts_and_other_safety))));
                            } else if (zBooleanValue4) {
                                y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_plus_and_safety))));
                            } else {
                                a2 a2Var114 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var114, "SafetyFeaturesViewModel", "verifyAllFields(), assistancePlusEnabled why are we here? ");
                            }
                        } else if (zBooleanValue3) {
                            if (!zBooleanValue) {
                                y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contact_safety_features))));
                            } else if (zBooleanValue3) {
                                y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_generic_safety_features))));
                            } else {
                                a2 a2Var115 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var115, "SafetyFeaturesViewModel", "verifyAllFields(), why are we here? ");
                            }
                        } else if (!zBooleanValue) {
                            y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contact_safety_features))));
                        } else if (zBooleanValue3) {
                            y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_generic_safety_features))));
                        } else {
                            a2 a2Var116 = a2.SAFETY_FEATURES;
                            i2.f36769a.getClass();
                            i2.a.f(a2Var116, "SafetyFeaturesViewModel", "verifyAllFields(), why are we here? ");
                        }
                        z16 = false;
                    }
                }
                return Boolean.valueOf(z16);
            }
        })) {
            y0<g3<tj1.e>> y0VarC4 = C4();
            g3.a aVar = g3.f35298f;
            g3<tj1.e> g3VarD3 = C4().d();
            tj1.e eVar2 = g3VarD3 != null ? g3VarD3.f35301b : null;
            aVar.getClass();
            y0VarC4.m(g3.a.b(eVar2));
            Z4(this, eVarB, 2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpj1/s$c;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ s(yj1.m mVar, hl.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new yj1.m(false, null, null, 7, null) : mVar, (i14 & 2) != 0 ? hl.a.c.f84256b : aVar);
    }
}
