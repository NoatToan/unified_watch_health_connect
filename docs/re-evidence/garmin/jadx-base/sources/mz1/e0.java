package mz1;

import android.content.Intent;
import android.os.Parcelable;
import androidx.lifecycle.t1;
import androidx.lifecycle.v1;
import c22.l3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lmz1/e0;", "Lzf0/j0;", "Lca1/d$b;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 extends zf0.j0 implements ca1.d.b {
    public static final /* synthetic */ int K1 = 0;
    public final o13.t A1;
    public final o13.t B1;
    public final o13.t C1;
    public final androidx.lifecycle.y0<w61.f<String>> D1;
    public final o13.t E1;
    public final o13.t F1;
    public final o13.t G1;
    public final o13.t H0;
    public final o13.t H1;
    public fg0.p I;
    public final o13.t I0;
    public int I1;
    public final o13.t J0;
    public List<com.garmin.android.apps.connectmobile.workouts.data.model.f> J1;
    public final o13.t K0;
    public final o13.t L0;
    public final o13.t M0;
    public final o13.t N0;
    public final o13.t O0;
    public final o13.t P0;
    public final o13.t Q0;
    public final o13.t R0;
    public boolean S0;
    public final p2 T0;
    public final b2 U0;
    public final p2 V0;
    public final b2 W0;
    public ArrayList X;
    public final p2 X0;
    public final b2 Y0;
    public final o13.t Z;
    public final o13.t Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final o13.t f121679a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final o13.t f121680b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final o13.t f121681c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final o13.t f121682d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final o13.t f121683e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final o13.t f121684f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final o13.t f121685g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final o13.t f121686h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final androidx.lifecycle.y0 f121687i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final o13.t f121688j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final o13.t f121690k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final o13.t f121691l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public fg0.w f121692m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public fg0.k f121693n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public final o13.t f121694o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final o13.t f121695p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public final o13.t f121696q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public final o13.t f121697r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public final o13.t f121698s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public final o13.t f121699t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public final o13.t f121700u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public final o13.t f121701v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public final androidx.lifecycle.w0 f121702w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public final o13.t f121703x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public final o13.t f121704y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final o13.t f121705z1;
    public final int P = 1549;
    public final jy1.b T = (jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null);
    public final o13.t Y = o13.m.b(new mz1.c(13));

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final o13.t f121689k0 = o13.m.b(new mz1.c(22));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f121707b;

        static {
            int[] iArr = new int[gg0.i.values().length];
            try {
                iArr[gg0.i.METER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gg0.i.KILOMETER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gg0.i.MILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gg0.i.YARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f121706a = iArr;
            int[] iArr2 = new int[gg0.e.values().length];
            try {
                iArr2[gg0.e.FBT_ADAPTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[gg0.e.ITP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[gg0.e.COACH_ATP.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f121707b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$getUpcomingEventList$1", f = "EventDetailsViewModel.kt", l = {626}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f121708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f121709b;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = e0.this.new c(dVar);
            cVar.f121709b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f121709b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f121708a;
            e0 e0Var = e0.this;
            if (i14 == 0) {
                o13.r.b(obj);
                String string = LocalDate.now().toString("yyyy-MM-dd");
                String string2 = LocalDate.now().plusYears(1).toString("yyyy-MM-dd");
                zf0.d dVar = e0Var.f204384a;
                string.getClass();
                string2.getClass();
                this.f121709b = b0Var;
                this.f121708a = 1;
                dVar.getClass();
                obj = com.garmin.android.apps.connectmobile.f0.J(dVar, new zf0.v(dVar, string, string2, null), this);
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
            if (v2Var instanceof v2.b) {
                int i15 = e0.K1;
                androidx.lifecycle.y0 y0Var = (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : iterable) {
                    gg0.f eventType = ((fg0.k) obj2).getEventType();
                    if (eventType != null && eventType.d()) {
                        arrayList.add(obj2);
                    }
                }
                y0Var.j(new Integer(arrayList.size()));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                String string3 = ((v2.a) v2Var).f47383a.toString();
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "EventDetailsViewModel", string3);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$onSaveLinkActivity$1", f = "EventDetailsViewModel.kt", l = {967, 982, 989, 991}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public fg0.k f121711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e0 f121712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f121713c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f121714d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f121715e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f121716f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f121718h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean f121719i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j8, boolean z14, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f121718h = j8;
            this.f121719i = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e0.this.new d(this.f121718h, this.f121719i, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x008c  */
        /* JADX WARN: Code duplicated, block: B:42:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:51:0x0120  */
        /* JADX WARN: Code duplicated, block: B:54:0x0135  */
        /* JADX WARN: Code duplicated, block: B:57:0x013e  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            fg0.k kVar;
            e0 e0Var;
            int i14;
            int i15;
            long j8;
            e0 e0Var2;
            e0 e0Var3;
            e0 e0Var4;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i16 = this.f121716f;
            e0 e0Var5 = e0.this;
            if (i16 == 0) {
                o13.r.b(obj);
                int i17 = e0.K1;
                e0Var5.s5().j(g3.a.c(g3.f35298f));
                fg0.k kVarD = e0Var5.l5().d();
                if (kVarD != null) {
                    fg0.j eventCustomization = kVarD.getEventCustomization();
                    Long associatedWithActivityId = eventCustomization != null ? eventCustomization.getAssociatedWithActivityId() : null;
                    long j14 = this.f121718h;
                    if (associatedWithActivityId == null) {
                        ps.d dVarZ4 = e0.Z4(e0Var5, kVarD);
                        this.f121711a = null;
                        this.f121712b = e0Var5;
                        this.f121713c = 0;
                        this.f121714d = 0;
                        this.f121716f = 1;
                        obj = e0.a5(e0Var5, j14, dVarZ4, this);
                        if (obj != aVar) {
                            e0Var3 = e0Var5;
                            if (((Boolean) obj).booleanValue()) {
                                int i18 = e0.K1;
                                androidx.lifecycle.y0<g3<ny1.a>> y0VarS5 = e0Var3.s5();
                                g3.a aVar2 = g3.f35298f;
                                ny1.a aVar3 = ny1.a.LINKED;
                                aVar2.getClass();
                                y0VarS5.j(g3.a.d(aVar3));
                                return Unit.INSTANCE;
                            }
                        }
                    } else {
                        Long associatedWithActivityId2 = eventCustomization != null ? eventCustomization.getAssociatedWithActivityId() : null;
                        ps.d dVar = new ps.d(null, null, 3, null);
                        dVar.b(null);
                        ps.l lVar = new ps.l(null, 1, null);
                        lVar.a();
                        dVar.c(lVar);
                        if (this.f121719i && associatedWithActivityId2 != null) {
                            long jLongValue = associatedWithActivityId2.longValue();
                            this.f121711a = null;
                            this.f121712b = e0Var5;
                            this.f121713c = 0;
                            this.f121714d = 0;
                            this.f121716f = 2;
                            obj = e0.a5(e0Var5, jLongValue, dVar, this);
                            if (obj != aVar) {
                                e0Var2 = e0Var5;
                                if (((Boolean) obj).booleanValue()) {
                                    int i19 = e0.K1;
                                    androidx.lifecycle.y0<g3<ny1.a>> y0VarS6 = e0Var2.s5();
                                    g3.a aVar4 = g3.f35298f;
                                    ny1.a aVar5 = ny1.a.UN_LINKED;
                                    aVar4.getClass();
                                    y0VarS6.j(g3.a.d(aVar5));
                                    return Unit.INSTANCE;
                                }
                            }
                        } else if (associatedWithActivityId2 != null) {
                            long jLongValue2 = associatedWithActivityId2.longValue();
                            this.f121711a = kVarD;
                            this.f121712b = e0Var5;
                            this.f121715e = j14;
                            this.f121713c = 0;
                            this.f121714d = 0;
                            this.f121716f = 3;
                            Object objA5 = e0.a5(e0Var5, jLongValue2, dVar, this);
                            if (objA5 != aVar) {
                                kVar = kVarD;
                                obj = objA5;
                                e0Var = e0Var5;
                                i14 = 0;
                                i15 = 0;
                                j8 = j14;
                                if (((Boolean) obj).booleanValue()) {
                                    ps.d dVarZ5 = e0.Z4(e0Var, kVar);
                                    this.f121711a = null;
                                    this.f121712b = e0Var;
                                    this.f121713c = i15;
                                    this.f121714d = i14;
                                    this.f121716f = 4;
                                    obj = e0.a5(e0Var, j8, dVarZ5, this);
                                    if (obj != aVar) {
                                        e0Var4 = e0Var;
                                        if (((Boolean) obj).booleanValue()) {
                                            int i24 = e0.K1;
                                            androidx.lifecycle.y0<g3<ny1.a>> y0VarS7 = e0Var4.s5();
                                            g3.a aVar6 = g3.f35298f;
                                            ny1.a aVar7 = ny1.a.LINKED;
                                            aVar6.getClass();
                                            y0VarS7.j(g3.a.d(aVar7));
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return aVar;
                }
            } else if (i16 == 1) {
                e0Var3 = this.f121712b;
                o13.r.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    int i110 = e0.K1;
                    androidx.lifecycle.y0<g3<ny1.a>> y0VarS8 = e0Var3.s5();
                    g3.a aVar8 = g3.f35298f;
                    ny1.a aVar9 = ny1.a.LINKED;
                    aVar8.getClass();
                    y0VarS8.j(g3.a.d(aVar9));
                    return Unit.INSTANCE;
                }
            } else if (i16 != 2) {
                if (i16 == 3) {
                    i14 = this.f121714d;
                    i15 = this.f121713c;
                    j8 = this.f121715e;
                    e0Var = this.f121712b;
                    kVar = this.f121711a;
                    o13.r.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        ps.d dVarZ6 = e0.Z4(e0Var, kVar);
                        this.f121711a = null;
                        this.f121712b = e0Var;
                        this.f121713c = i15;
                        this.f121714d = i14;
                        this.f121716f = 4;
                        obj = e0.a5(e0Var, j8, dVarZ6, this);
                        if (obj != aVar) {
                            e0Var4 = e0Var;
                        }
                        return aVar;
                    }
                } else {
                    if (i16 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e0Var4 = this.f121712b;
                    o13.r.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    int i25 = e0.K1;
                    androidx.lifecycle.y0<g3<ny1.a>> y0VarS9 = e0Var4.s5();
                    g3.a aVar10 = g3.f35298f;
                    ny1.a aVar11 = ny1.a.LINKED;
                    aVar10.getClass();
                    y0VarS9.j(g3.a.d(aVar11));
                    return Unit.INSTANCE;
                }
            } else {
                e0Var2 = this.f121712b;
                o13.r.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    int i111 = e0.K1;
                    androidx.lifecycle.y0<g3<ny1.a>> y0VarS10 = e0Var2.s5();
                    g3.a aVar12 = g3.f35298f;
                    ny1.a aVar13 = ny1.a.UN_LINKED;
                    aVar12.getClass();
                    y0VarS10.j(g3.a.d(aVar13));
                    return Unit.INSTANCE;
                }
            }
            int i26 = e0.K1;
            e0Var5.s5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$updateEventDTO$1", f = "EventDetailsViewModel.kt", l = {1659, 1670}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e0 f121720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public fg0.k f121721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f121722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ fg0.k f121723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e0 f121724e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(fg0.k kVar, e0 e0Var, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f121723d = kVar;
            this.f121724e = e0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f121723d, this.f121724e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
        
            if (r2 == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
        
            if (r2 == r1) goto L35;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objH;
            Object objI;
            Boolean isShareable;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f121722c;
            e0 e0Var = this.f121724e;
            fg0.k kVar = this.f121723d;
            if (i14 == 0) {
                o13.r.b(obj);
                fg0.c eventPrivacy = kVar.getEventPrivacy();
                boolean zBooleanValue = (eventPrivacy == null || (isShareable = eventPrivacy.getIsShareable()) == null) ? false : isShareable.booleanValue();
                fg0.j eventCustomization = kVar.getEventCustomization();
                if (eventCustomization == null) {
                    eventCustomization = new fg0.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                }
                if (zBooleanValue) {
                    zf0.d dVar = e0Var.f204384a;
                    String strValueOf = String.valueOf(kVar.getShareableEventUuid());
                    this.f121722c = 1;
                    objI = dVar.i(strValueOf, eventCustomization, this);
                } else {
                    Long l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                    if (l14 != null) {
                        long jLongValue = l14.longValue();
                        zf0.d dVar2 = e0Var.f204384a;
                        this.f121720a = e0Var;
                        this.f121721b = kVar;
                        this.f121722c = 2;
                        objH = dVar2.h(jLongValue, kVar, this);
                    }
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                objI = obj;
                v2 v2Var = (v2) objI;
                if (v2Var instanceof v2.b) {
                    int i15 = e0.K1;
                    androidx.lifecycle.y0<g3<fg0.k>> y0VarO5 = e0Var.o5();
                    g3.f35298f.getClass();
                    y0VarO5.j(g3.a.d(kVar));
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        lc.u0.r();
                        return null;
                    }
                    int i16 = e0.K1;
                    e0Var.o5().j(g3.a.a(g3.f35298f, ((v2.a) v2Var).f47385c, null, null, null, 14));
                }
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kVar = this.f121721b;
                e0Var = this.f121720a;
                o13.r.b(obj);
                objH = obj;
                v2 v2Var2 = (v2) objH;
                if (v2Var2 instanceof v2.b) {
                    int i17 = e0.K1;
                    androidx.lifecycle.y0<g3<fg0.k>> y0VarO6 = e0Var.o5();
                    g3.f35298f.getClass();
                    y0VarO6.j(g3.a.d(kVar));
                } else {
                    if (!(v2Var2 instanceof v2.a)) {
                        lc.u0.r();
                        return null;
                    }
                    int i18 = e0.K1;
                    e0Var.o5().j(g3.a.a(g3.f35298f, ((v2.a) v2Var2).f47385c, null, null, null, 14));
                }
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public e0() {
        final int i14 = 0;
        this.Z = o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                e0 e0Var = this.f121664b;
                switch (i15) {
                    case 0:
                        int i16 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i17 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i18 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i19 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i24 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i25 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i26 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i27 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i28 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i29 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i30 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i34 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i35 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i36 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i37 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i38 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i39 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i44 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i45 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i46 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i48 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        final int i15 = 11;
        o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                e0 e0Var = this.f121664b;
                switch (i16) {
                    case 0:
                        int i17 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i18 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i19 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i110 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i24 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i25 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i26 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i27 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i28 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i29 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i30 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i34 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i35 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i36 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i37 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i38 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i39 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i44 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i45 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i46 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i48 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.H0 = o13.m.b(new d0(3));
        final int i16 = 18;
        this.I0 = o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                e0 e0Var = this.f121664b;
                switch (i17) {
                    case 0:
                        int i18 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i19 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i110 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i111 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i24 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i25 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i26 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i27 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i28 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i29 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i30 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i34 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i35 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i36 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i37 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i38 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i39 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i44 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i45 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i46 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i48 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.J0 = o13.m.b(new d0(5));
        final int i17 = 19;
        o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i18 = i17;
                e0 e0Var = this.f121664b;
                switch (i18) {
                    case 0:
                        int i19 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i110 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i111 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i112 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i24 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i25 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i26 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i27 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i28 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i29 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i30 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i34 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i35 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i36 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i37 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i38 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i39 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i44 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i45 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i46 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i48 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.K0 = o13.m.b(new d0(6));
        final int i18 = 21;
        o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i19 = i18;
                e0 e0Var = this.f121664b;
                switch (i19) {
                    case 0:
                        int i110 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i111 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i112 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i113 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i24 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i25 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i26 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i27 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i28 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i29 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i30 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i34 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i35 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i36 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i37 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i38 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i39 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i44 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i45 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i46 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i48 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.L0 = o13.m.b(new mz1.c(20));
        final int i19 = 9;
        this.M0 = o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i19;
                e0 e0Var = this.f121664b;
                switch (i110) {
                    case 0:
                        int i111 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i112 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i113 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i114 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i24 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i25 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i26 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i27 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i28 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i29 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i30 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i34 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i35 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i36 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i37 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i38 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i39 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i44 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i45 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i46 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i48 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.N0 = o13.m.b(new d0(0));
        final int i24 = 20;
        this.O0 = o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i24;
                e0 e0Var = this.f121664b;
                switch (i110) {
                    case 0:
                        int i111 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i112 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i113 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i114 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i25 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i26 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i27 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i28 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i29 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i210 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i30 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i34 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i35 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i36 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i37 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i38 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i39 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i44 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i45 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i46 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i48 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.P0 = o13.m.b(new d0(7));
        final int i25 = 22;
        o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i25;
                e0 e0Var = this.f121664b;
                switch (i110) {
                    case 0:
                        int i111 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i112 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i113 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i114 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i26 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i27 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i28 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i29 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i210 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i211 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i30 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i34 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i35 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i36 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i37 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i38 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i39 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i44 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i45 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i46 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i48 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.Q0 = o13.m.b(new d0(8));
        final int i26 = 23;
        this.R0 = o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i26;
                e0 e0Var = this.f121664b;
                switch (i110) {
                    case 0:
                        int i111 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i112 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i113 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i114 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i27 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i28 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i29 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i210 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i211 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i212 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i30 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i34 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i35 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i36 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i37 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i38 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i39 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i44 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i45 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i46 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i48 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        p2 p2VarA = q2.a(g3.a.c(g3.f35298f));
        this.T0 = p2VarA;
        this.U0 = r53.s.d(p2VarA);
        p2 p2VarA2 = q2.a(g3.a.b(null));
        this.V0 = p2VarA2;
        this.W0 = r53.s.d(p2VarA2);
        p2 p2VarA3 = q2.a(g3.a.b(null));
        this.X0 = p2VarA3;
        this.Y0 = r53.s.d(p2VarA3);
        this.Z0 = o13.m.b(new d0(9));
        this.f121679a1 = o13.m.b(new mz1.c(14));
        this.f121680b1 = o13.m.b(new mz1.c(15));
        final int i27 = 1;
        this.f121681c1 = o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i27;
                e0 e0Var = this.f121664b;
                switch (i110) {
                    case 0:
                        int i111 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i112 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i113 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i114 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i28 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i29 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i210 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i211 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i212 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i213 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i30 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i34 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i35 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i36 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i37 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i38 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i39 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i44 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i45 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i46 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i48 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.f121682d1 = o13.m.b(new mz1.c(16));
        final int i28 = 2;
        this.f121683e1 = o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i28;
                e0 e0Var = this.f121664b;
                switch (i110) {
                    case 0:
                        int i111 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i112 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i113 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i114 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i29 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i210 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i211 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i212 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i213 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i214 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i30 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i34 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i35 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i36 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i37 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i38 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i39 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i44 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i45 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i46 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i48 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.f121684f1 = o13.m.b(new mz1.c(17));
        final int i29 = 3;
        this.f121685g1 = o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i29;
                e0 e0Var = this.f121664b;
                switch (i110) {
                    case 0:
                        int i111 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i112 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i113 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i114 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i210 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i211 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i212 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i213 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i214 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i215 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i30 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i34 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i35 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i36 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i37 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i38 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i39 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i44 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i45 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i46 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i48 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        o13.t tVarB = o13.m.b(new mz1.c(18));
        this.f121686h1 = tVarB;
        this.f121687i1 = (androidx.lifecycle.y0) tVarB.getValue();
        this.f121688j1 = o13.m.b(new mz1.c(19));
        final int i30 = 4;
        o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i30;
                e0 e0Var = this.f121664b;
                switch (i110) {
                    case 0:
                        int i111 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i112 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i113 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i114 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i210 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i211 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i212 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i213 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i214 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i215 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i34 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i35 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i36 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i37 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i38 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i39 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i310 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i44 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i45 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i46 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i48 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.f121690k1 = o13.m.b(new mz1.c(21));
        final int i34 = 5;
        this.f121691l1 = o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i34;
                e0 e0Var = this.f121664b;
                switch (i110) {
                    case 0:
                        int i111 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i112 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i113 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i114 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i210 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i211 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i212 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i213 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i214 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i215 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i35 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i36 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i37 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i38 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i39 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i310 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i311 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i44 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i45 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i46 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i48 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.f121694o1 = o13.m.b(new mz1.c(23));
        final int i35 = 6;
        this.f121695p1 = o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i35;
                e0 e0Var = this.f121664b;
                switch (i110) {
                    case 0:
                        int i111 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i112 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i113 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i114 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i210 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i211 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i212 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i213 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i214 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i215 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i36 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i37 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i38 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i39 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i310 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i311 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i312 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i44 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i45 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i46 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i48 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.f121696q1 = o13.m.b(new mz1.c(24));
        final int i36 = 7;
        this.f121697r1 = o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i36;
                e0 e0Var = this.f121664b;
                switch (i110) {
                    case 0:
                        int i111 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i112 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i113 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i114 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i210 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i211 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i212 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i213 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i214 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i215 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i37 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i38 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i39 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i310 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i311 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i312 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i313 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i44 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i45 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i46 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i48 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.f121698s1 = o13.m.b(new mz1.c(25));
        final int i37 = 8;
        this.f121699t1 = o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i37;
                e0 e0Var = this.f121664b;
                switch (i110) {
                    case 0:
                        int i111 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i112 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i113 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i114 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i210 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i211 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i212 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i213 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i214 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i215 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i38 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i39 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i310 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i311 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i312 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i313 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i314 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i44 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i45 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i46 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i48 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.f121700u1 = o13.m.b(new mz1.c(26));
        final int i38 = 10;
        this.f121701v1 = o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i38;
                e0 e0Var = this.f121664b;
                switch (i110) {
                    case 0:
                        int i111 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i112 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i113 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i114 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i210 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i211 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i212 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i213 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i214 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i215 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i39 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i310 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i311 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i312 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i313 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i314 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i315 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i44 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i45 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i46 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i48 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.f121702w1 = t1.a(k5(), new mi0.i(this));
        this.f121703x1 = o13.m.b(new mz1.c(27));
        final int i39 = 12;
        this.f121704y1 = o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i39;
                e0 e0Var = this.f121664b;
                switch (i110) {
                    case 0:
                        int i111 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i112 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i113 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i114 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i210 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i211 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i212 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i213 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i214 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i215 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i310 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i311 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i312 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i313 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i314 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i315 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i316 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i44 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i45 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i46 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i48 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.f121705z1 = o13.m.b(new mz1.c(28));
        final int i44 = 13;
        o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i44;
                e0 e0Var = this.f121664b;
                switch (i110) {
                    case 0:
                        int i111 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i112 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i113 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i114 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i210 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i211 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i212 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i213 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i214 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i215 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i310 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i311 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i312 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i313 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i314 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i315 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i316 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i45 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i46 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i47 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i48 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i49 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.A1 = o13.m.b(new mz1.c(29));
        final int i45 = 14;
        o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i45;
                e0 e0Var = this.f121664b;
                switch (i110) {
                    case 0:
                        int i111 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i112 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i113 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i114 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i210 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i211 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i212 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i213 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i214 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i215 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i310 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i311 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i312 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i313 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i314 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i315 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i316 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i46 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i48 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i49 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i410 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.B1 = o13.m.b(new d0(1));
        final int i46 = 15;
        this.C1 = o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i46;
                e0 e0Var = this.f121664b;
                switch (i110) {
                    case 0:
                        int i111 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i112 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i113 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i114 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i210 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i211 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i212 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i213 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i214 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i215 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i310 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i311 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i312 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i313 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i314 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i315 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i316 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i47 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i48 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i49 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i410 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i411 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.D1 = new androidx.lifecycle.y0<>();
        this.E1 = o13.m.b(new d0(2));
        final int i47 = 16;
        this.F1 = o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i47;
                e0 e0Var = this.f121664b;
                switch (i110) {
                    case 0:
                        int i111 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i112 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i113 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i114 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i210 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i211 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i212 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i213 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i214 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i215 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i310 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i311 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i312 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i313 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i314 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i315 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i316 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i48 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i49 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i410 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i411 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i412 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.G1 = o13.m.b(new d0(4));
        final int i48 = 17;
        this.H1 = o13.m.b(new e23.a(this) { // from class: mz1.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f121664b;

            {
                this.f121664b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i48;
                e0 e0Var = this.f121664b;
                switch (i110) {
                    case 0:
                        int i111 = e0.K1;
                        return e0Var.l5();
                    case 1:
                        int i112 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121680b1.getValue();
                    case 2:
                        int i113 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
                    case 3:
                        int i114 = e0.K1;
                        return e0Var.s5();
                    case 4:
                        return (androidx.lifecycle.y0) e0Var.f121688j1.getValue();
                    case 5:
                        int i210 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121690k1.getValue();
                    case 6:
                        int i211 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121694o1.getValue();
                    case 7:
                        int i212 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121696q1.getValue();
                    case 8:
                        int i213 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121698s1.getValue();
                    case 9:
                        int i214 = e0.K1;
                        return e0Var.e5();
                    case 10:
                        int i215 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121700u1.getValue();
                    case 11:
                        int i310 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121689k0.getValue();
                    case 12:
                        int i311 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121703x1.getValue();
                    case 13:
                        int i312 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
                    case 14:
                        int i313 = e0.K1;
                        return e0Var.t5();
                    case 15:
                        int i314 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.B1.getValue();
                    case 16:
                        int i315 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.E1.getValue();
                    case 17:
                        int i316 = e0.K1;
                        return e0Var.o5();
                    case 18:
                        int i49 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.H0.getValue();
                    case 19:
                        int i410 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.J0.getValue();
                    case 20:
                        int i411 = e0.K1;
                        return e0Var.f5();
                    case 21:
                        return (androidx.lifecycle.y0) e0Var.K0.getValue();
                    case 22:
                        int i412 = e0.K1;
                        return (androidx.lifecycle.y0) e0Var.P0.getValue();
                    default:
                        int i413 = e0.K1;
                        return e0Var.r5();
                }
            }
        });
        this.J1 = p13.j0.f134944a;
        ge1.b.T(v1.a(this), null, null, new z0(this, null), 3);
        q5();
        ge1.b.T(v1.a(this), null, null, new zf0.q0(this, null), 3);
        ge1.b.T(v1.a(this), null, null, new b1(this, null), 3);
    }

    public static /* synthetic */ void D5(e0 e0Var, boolean z14, int i14) {
        if ((i14 & 1) != 0) {
            z14 = false;
        }
        e0Var.C5(z14, null);
    }

    public static boolean H5(fg0.k kVar) {
        fg0.d completionTarget;
        gg0.f eventType;
        return (kVar != null && (eventType = kVar.getEventType()) != null && eventType.f()) && (kVar != null ? kVar.getCourseId() : null) != null && (kVar != null && (completionTarget = kVar.getCompletionTarget()) != null && completionTarget.m());
    }

    public static boolean J5(fg0.k kVar) {
        fg0.d completionTarget;
        gg0.f eventType;
        return (kVar != null && (eventType = kVar.getEventType()) != null && eventType.g()) && n5(kVar) != null && (kVar != null && (completionTarget = kVar.getCompletionTarget()) != null && completionTarget.m());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object X4(e0 e0Var, Integer num, v13.c cVar) {
        f0 f0Var;
        fg0.k kVarD;
        fg0.k kVar;
        e0Var.getClass();
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i14 = f0Var.f121740d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f121740d = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(e0Var, cVar);
            }
        } else {
            f0Var = new f0(e0Var, cVar);
        }
        Object obj = f0Var.f121738b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var.f121740d;
        if (i15 == 0) {
            o13.r.b(obj);
            if (num != null && num.intValue() == 404 && (kVarD = e0Var.l5().d()) != null) {
                fg0.j eventCustomization = kVarD.getEventCustomization();
                kVarD.E0(eventCustomization != null ? fg0.j.b(eventCustomization, null, null, null, null, null, null, 7999) : new fg0.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null));
                f0Var.f121737a = kVarD;
                f0Var.f121740d = 1;
                Object objV4 = e0Var.V4(kVarD, f0Var);
                if (objV4 == obj2) {
                    return obj2;
                }
                kVar = kVarD;
                obj = objV4;
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kVar = f0Var.f121737a;
        o13.r.b(obj);
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.a) {
            String strH = f3.h(((v2.a) v2Var).f47383a, "Error unlinking missing training plan from the event ", StringUtils.SPACE);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "EventDetailsViewModel", strH);
        }
        e0Var.l5().j(kVar);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006f -> B:21:0x0072). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:25:0x0084
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object Y4(mz1.e0 r10, java.util.List r11, v13.c r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof mz1.l0
            if (r0 == 0) goto L16
            r0 = r12
            mz1.l0 r0 = (mz1.l0) r0
            int r1 = r0.f121831g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f121831g = r1
            goto L1b
        L16:
            mz1.l0 r0 = new mz1.l0
            r0.<init>(r10, r12)
        L1b:
            java.lang.Object r12 = r0.f121829e
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f121831g
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L32
            int r11 = r0.f121828d
            com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO r2 = r0.f121827c
            java.util.Iterator r4 = r0.f121826b
            java.util.List r5 = r0.f121825a
            o13.r.b(r12)
            goto L72
        L32:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r10)
        L37:
            r10 = 0
            return r10
        L39:
            java.util.ArrayList r12 = v.h.x(r12)
            java.util.Iterator r11 = r11.iterator()
            r2 = 0
            r4 = r11
            r5 = r12
            r11 = r2
        L45:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto La7
            java.lang.Object r12 = r4.next()
            r2 = r12
            com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO r2 = (com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO) r2
            hg0.b r12 = r10.B4()
            long r6 = r2.f29250b
            r0.f121825a = r5
            r0.f121826b = r4
            r0.f121827c = r2
            r0.f121828d = r11
            r0.f121831g = r3
            r12.getClass()
            hg0.e r8 = new hg0.e
            r9 = 0
            r8.<init>(r12, r6, r9)
            java.lang.Object r12 = com.garmin.android.apps.connectmobile.f0.J(r12, r8, r0)
            if (r12 != r1) goto L72
            return r1
        L72:
            com.garmin.android.apps.connectmobile.v2 r12 = (com.garmin.android.apps.connectmobile.v2) r12
            boolean r6 = r12 instanceof com.garmin.android.apps.connectmobile.v2.b
            if (r6 == 0) goto L88
            com.garmin.android.apps.connectmobile.v2$b r12 = (com.garmin.android.apps.connectmobile.v2.b) r12
            T r12 = r12.f47386a
            ps.r r12 = (ps.r) r12
            boolean r12 = r12.D()
            if (r12 == 0) goto L45
            r5.add(r2)
            goto L45
        L88:
            boolean r2 = r12 instanceof com.garmin.android.apps.connectmobile.v2.a
            if (r2 == 0) goto La3
            com.garmin.android.apps.connectmobile.v2$a r12 = (com.garmin.android.apps.connectmobile.v2.a) r12
            java.lang.Integer r12 = r12.f47384b
            java.lang.String r2 = "Failed to fetch Activity Summary"
            java.lang.String r12 = androidx.room.a0.g(r12, r2)
            com.garmin.android.apps.connectmobile.i2$a r2 = com.garmin.android.apps.connectmobile.i2.f36769a
            com.garmin.android.apps.connectmobile.a2 r6 = com.garmin.android.apps.connectmobile.a2.GENERAL
            r2.getClass()
            java.lang.String r2 = "EventDetailsViewModel"
            com.garmin.android.apps.connectmobile.i2.a.f(r6, r2, r12)
            goto L45
        La3:
            lc.u0.r()
            goto L37
        La7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mz1.e0.Y4(mz1.e0, java.util.List, v13.c):java.lang.Object");
    }

    public static final ps.d Z4(e0 e0Var, fg0.k kVar) {
        fg0.d customGoal;
        e0Var.getClass();
        ps.f fVar = new ps.f(p005kotlin.jvm.internal.s.g(kVar.getRace(), Boolean.TRUE) ? ps.e.RACE.f139802a : ps.e.SPECIAL_EVENT.f139802a);
        ps.c cVar = new ps.c(kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String(), null, null, null, null, null, 62, null);
        cVar.a(kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String());
        cVar.b(kVar.getShareableEventUuid());
        fg0.d completionTarget = kVar.getCompletionTarget();
        if (completionTarget != null) {
            gg0.h unitType = completionTarget.getUnitType();
            cVar.c(unitType != null ? unitType.f77161a : null);
            cVar.d(completionTarget.getUnitType() == gg0.h.DISTANCE ? completionTarget.b() : completionTarget.g());
        }
        fg0.j eventCustomization = kVar.getEventCustomization();
        if (eventCustomization != null && (customGoal = eventCustomization.getCustomGoal()) != null) {
            gg0.h unitType2 = customGoal.getUnitType();
            cVar.e(unitType2 != null ? unitType2.f77161a : null);
            cVar.f(customGoal.getUnitType() == gg0.h.DISTANCE ? customGoal.b() : customGoal.g());
        }
        ps.d dVar = new ps.d(null, null, 3, null);
        dVar.b(fVar);
        dVar.c(new ps.l(cVar));
        return dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (o53.m0.b(300, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a5(e0 e0Var, long j8, ps.d dVar, v13.c cVar) {
        e1 e1Var;
        long j14;
        e0Var.getClass();
        if (cVar instanceof e1) {
            e1Var = (e1) cVar;
            int i14 = e1Var.f121728d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e1Var.f121728d = i14 - Integer.MIN_VALUE;
            } else {
                e1Var = new e1(e0Var, cVar);
            }
        } else {
            e1Var = new e1(e0Var, cVar);
        }
        Object objJ = e1Var.f121726b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = e1Var.f121728d;
        boolean z14 = true;
        if (i15 != 0) {
            if (i15 == 1) {
                j14 = e1Var.f121725a;
                o13.r.b(objJ);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objJ);
            }
            return Boolean.valueOf(z14);
        }
        o13.r.b(objJ);
        hg0.b bVarB4 = e0Var.B4();
        e1Var.f121725a = j8;
        e1Var.f121728d = 1;
        bVarB4.getClass();
        objJ = com.garmin.android.apps.connectmobile.f0.J(bVarB4, new hg0.c(bVarB4, j8, dVar, null), e1Var);
        if (objJ != aVar) {
            j14 = j8;
        }
        return aVar;
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            e1Var.f121725a = j14;
            e1Var.f121728d = 2;
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            String strG = androidx.room.a0.g(((v2.a) v2Var).f47384b, "onSaveActivity: problem in deleting the existing activity id ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "EventDetailsViewModel", strG);
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }

    public static double b5(fg0.d dVar) {
        Double value;
        double dDoubleValue;
        double d14;
        if (dVar == null || (value = dVar.getValue()) == null) {
            return 0.0d;
        }
        gg0.i unit = dVar.getUnit();
        int i14 = unit == null ? -1 : b.f121706a[unit.ordinal()];
        if (i14 == 1) {
            return value.doubleValue();
        }
        if (i14 == 2) {
            l3.a aVar = l3.f23124b;
            dDoubleValue = value.doubleValue();
            aVar.getClass();
            d14 = 1000.0d;
        } else if (i14 == 3) {
            l3.a aVar2 = l3.f23124b;
            dDoubleValue = value.doubleValue();
            aVar2.getClass();
            d14 = 1609.344d;
        } else {
            if (i14 != 4) {
                return 0.0d;
            }
            l3.a aVar3 = l3.f23124b;
            dDoubleValue = value.doubleValue();
            aVar3.getClass();
            d14 = 0.9144d;
        }
        return dDoubleValue * d14;
    }

    public static com.garmin.android.apps.connectmobile.courses.model.e c5(List list) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) obj2;
            if (eVar.g() == am.x0.f4312o || eVar.g() == am.x0.V0 || eVar.g() == am.x0.Z0 || eVar.g() == am.x0.X0) {
                obj = obj2;
                break;
            }
        }
        return (com.garmin.android.apps.connectmobile.courses.model.e) obj;
    }

    public static com.garmin.android.apps.connectmobile.courses.model.e d5(List list) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) obj2;
            if (eVar.g() == am.x0.f4308n || eVar.g() == am.x0.J0) {
                obj = obj2;
                break;
            }
        }
        return (com.garmin.android.apps.connectmobile.courses.model.e) obj;
    }

    public static Long i5(fg0.k kVar) {
        gg0.f eventType;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH;
        Object next;
        Integer courseId;
        if (kVar != null && (eventType = kVar.getEventType()) != null && eventType.g() && (listH = kVar.h()) != null) {
            Iterator<T> it = listH.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next).getEventLegActivityType() != m52.c.CYCLING);
            com.garmin.android.apps.connectmobile.workouts.data.model.k kVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next;
            if (kVar2 != null && (courseId = kVar2.getCourseId()) != null) {
                return Long.valueOf(courseId.intValue());
            }
        }
        return null;
    }

    public static void m5(e0 e0Var, int i14, int i15, long j8) {
        e0Var.getClass();
        ge1.b.T(v1.a(e0Var), null, null, new y0(e0Var, i14, i15, j8, null, null, null), 3);
    }

    public static Long n5(fg0.k kVar) {
        gg0.f eventType;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH;
        Object next;
        Integer courseId;
        if (kVar != null && (eventType = kVar.getEventType()) != null && eventType.g() && (listH = kVar.h()) != null) {
            Iterator<T> it = listH.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next).getEventLegActivityType() != m52.c.RUNNING);
            com.garmin.android.apps.connectmobile.workouts.data.model.k kVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next;
            if (kVar2 != null && (courseId = kVar2.getCourseId()) != null) {
                return Long.valueOf(courseId.intValue());
            }
        }
        return null;
    }

    public static com.garmin.android.apps.connectmobile.workouts.data.model.k p5(List list, m52.c cVar) {
        cVar.getClass();
        Object obj = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (Object obj2 : list) {
            if (((com.garmin.android.apps.connectmobile.workouts.data.model.k) obj2).getEventLegActivityType() == cVar) {
                obj = obj2;
                break;
            }
        }
        return (com.garmin.android.apps.connectmobile.workouts.data.model.k) obj;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void A5(androidx.fragment.app.m mVar, com.garmin.android.apps.connectmobile.courses.model.d dVar) {
        jy1.b bVar = this.T;
        if (dVar == null) {
            com.garmin.android.apps.connectmobile.courses.model.e eVarD = e5().d();
            if (eVarD != null) {
                bVar.k(mVar, eVarD);
                return;
            }
            return;
        }
        List<com.garmin.android.apps.connectmobile.courses.model.e> listD = f5().d();
        com.garmin.android.apps.connectmobile.courses.model.e eVar = null;
        Object obj = null;
        if (listD != null) {
            for (Object obj2 : listD) {
                if (p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.courses.model.e) obj2).courseId, dVar.courseId)) {
                    obj = obj2;
                    break;
                }
            }
            eVar = (com.garmin.android.apps.connectmobile.courses.model.e) obj;
        }
        if (eVar != null) {
            bVar.k(mVar, eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca1.d.b
    public final androidx.lifecycle.s0<v2<da1.b>> A7(ea1.a aVar, String str) {
        aVar.getClass();
        fg0.k kVarD = k5().d();
        if (kVarD != null) {
            String eventImageUUID = kVarD.getEventImageUUID();
            fg0.c eventPrivacy = kVarD.getEventPrivacy();
            String shareableEventUuid = eventPrivacy != null ? p005kotlin.jvm.internal.s.g(eventPrivacy.getIsShareable(), Boolean.TRUE) : false ? kVarD.getShareableEventUuid() : String.valueOf(kVarD.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String());
            if (!(eventImageUUID == null || eventImageUUID.length() == 0)) {
                if (!(shareableEventUuid == null || shareableEventUuid.length() == 0)) {
                    o13.t tVar = this.Z0;
                    ((androidx.lifecycle.y0) tVar.getValue()).m(aVar);
                    o13.t tVar2 = this.f121679a1;
                    ((androidx.lifecycle.y0) tVar2.getValue()).m(str);
                    fg0.w wVar = new fg0.w(null, null, null, 7, null);
                    this.f121692m1 = wVar;
                    wVar.f((ea1.a) ((androidx.lifecycle.y0) tVar.getValue()).d());
                    fg0.w wVar2 = this.f121692m1;
                    if (wVar2 == null) {
                        p005kotlin.jvm.internal.s.m("flagEventImageDTO");
                        throw null;
                    }
                    wVar2.d((String) ((androidx.lifecycle.y0) tVar2.getValue()).d());
                    androidx.lifecycle.y0 y0Var = (androidx.lifecycle.y0) this.f121680b1.getValue();
                    fg0.w wVar3 = this.f121692m1;
                    if (wVar3 == null) {
                        p005kotlin.jvm.internal.s.m("flagEventImageDTO");
                        throw null;
                    }
                    wVar3.b(eventImageUUID);
                    ge1.b.T(v1.a(this), null, null, new d1(this, shareableEventUuid, null), 3);
                    return y0Var;
                }
            }
        }
        return null;
    }

    public final void B5(long j8, boolean z14) {
        ge1.b.T(v1.a(this), null, null, new d(j8, z14, null), 3);
    }

    public final void C5(boolean z14, Boolean bool) {
        Intent intent = new Intent();
        if (z14) {
            intent.putExtra("GCM_extra_sharable_event_search_dto", this.I);
            intent.putExtra("GCM_extra_selected_event_type", zf0.y0.EVENT_SEARCH.ordinal());
        } else {
            intent.putExtra("GCM_extra_sharable_event_dto", l5().d());
            intent.putExtra("GCM_extra_selected_event_type", zf0.y0.USER_CALENDAR_EVENT.ordinal());
        }
        intent.putExtra("GCM_extra_should_keep_linked_event", bool);
        ((androidx.lifecycle.y0) this.f121703x1.getValue()).m(new o13.p(-1, intent));
    }

    public final void E5(fg0.k kVar) {
        Unit unit;
        Long courseId;
        fg0.j eventCustomization;
        fg0.j eventCustomization2;
        if (this.f121693n1 == null) {
            this.f121693n1 = kVar;
        }
        l5().m(kVar);
        Long associatedWithActivityId = (kVar == null || (eventCustomization2 = kVar.getEventCustomization()) == null) ? null : eventCustomization2.getAssociatedWithActivityId();
        fg0.d customGoal = (kVar == null || (eventCustomization = kVar.getEventCustomization()) == null) ? null : eventCustomization.getCustomGoal();
        if (associatedWithActivityId == null || customGoal == null) {
            unit = null;
        } else {
            ge1.b.T(v1.a(this), null, null, new q0(this, associatedWithActivityId.longValue(), null), 3);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            ((androidx.lifecycle.y0) this.B1.getValue()).j(null);
        }
        if (kVar == null || (courseId = kVar.getCourseId()) == null) {
            e5().j(null);
        } else {
            ge1.b.T(v1.a(this), null, null, new o0(this, courseId.longValue(), null), 3);
        }
    }

    public final void F5(boolean z14) {
        Intent intent = new Intent();
        if (z14) {
            intent.putExtra("GCM_extra_sharable_event_search_dto", this.I);
            intent.putExtra("GCM_extra_selected_event_type", zf0.y0.EVENT_SEARCH.ordinal());
        } else {
            intent.putExtra("GCM_extra_sharable_event_dto", l5().d());
            intent.putExtra("GCM_extra_selected_event_type", zf0.y0.USER_CALENDAR_EVENT.ordinal());
        }
        ((androidx.lifecycle.y0) this.f121703x1.getValue()).m(new o13.p(-1, intent));
    }

    public final boolean G5(fg0.k kVar) {
        gg0.f eventType;
        boolean z14 = (kVar == null || (eventType = kVar.getEventType()) == null || !eventType.e()) ? false : true;
        Long courseId = kVar != null ? kVar.getCourseId() : null;
        boolean zA = this.T.a();
        double dB5 = b5(kVar != null ? kVar.getCompletionTarget() : null);
        return z14 && courseId != null && zA && !((dB5 > 15000.0d ? 1 : (dB5 == 15000.0d ? 0 : -1)) < 0 || (dB5 > 402500.0d ? 1 : (dB5 == 402500.0d ? 0 : -1)) > 0);
    }

    public final boolean I5(fg0.k kVar) {
        gg0.f eventType;
        boolean z14 = (kVar == null || (eventType = kVar.getEventType()) == null || !eventType.g()) ? false : true;
        Long lI5 = i5(kVar);
        boolean zA = this.T.a();
        double dB5 = b5(kVar != null ? kVar.getCompletionTarget() : null);
        return z14 && lI5 != null && zA && !((dB5 > 15000.0d ? 1 : (dB5 == 15000.0d ? 0 : -1)) < 0 || (dB5 > 402500.0d ? 1 : (dB5 == 402500.0d ? 0 : -1)) > 0);
    }

    public final boolean K5() {
        List<String> listG0;
        fg0.k kVarD = k5().d();
        if (kVarD != null && (listG0 = kVarD.g0()) != null && listG0.contains("OFFICIAL")) {
            return false;
        }
        if ((kVarD != null ? kVarD.getProvider() : null) != null) {
            String provider = kVarD != null ? kVarD.getProvider() : null;
            provider.getClass();
            fg0.n nVarA4 = A4(provider);
            if ((nVarA4 != null ? nVarA4.getVerifiedStatus() : null) == gg0.j.VERIFIED) {
                return false;
            }
        }
        return true;
    }

    public final void L5() {
        fg0.k kVarD = k5().d();
        if (kVarD != null) {
            Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
            String strR = kVarD.r(false);
            if (strR != null) {
                this.D1.m(new w61.f<>(strR));
            }
        }
    }

    public final void M5(fg0.k kVar) {
        kVar.getClass();
        o5().j(g3.a.c(g3.f35298f));
        ge1.b.T(v1.a(this), null, null, new e(kVar, this, null), 3);
    }

    public final androidx.lifecycle.y0<com.garmin.android.apps.connectmobile.courses.model.e> e5() {
        return (androidx.lifecycle.y0) this.L0.getValue();
    }

    public final androidx.lifecycle.y0<List<com.garmin.android.apps.connectmobile.courses.model.e>> f5() {
        return (androidx.lifecycle.y0) this.N0.getValue();
    }

    public final androidx.lifecycle.s0<List<com.garmin.android.apps.connectmobile.courses.model.e>> h5() {
        return (androidx.lifecycle.s0) this.O0.getValue();
    }

    public final void j5() {
        LocalDate date;
        gg0.f eventType;
        gg0.f fVar;
        gg0.f fVar2;
        fg0.k kVarD = l5().d();
        if (kVarD == null || (date = kVarD.getDate()) == null || (eventType = kVarD.getEventType()) == null) {
            return;
        }
        if (eventType == gg0.f.f77133i || eventType == gg0.f.f77134j || eventType == gg0.f.f77131g || eventType == (fVar2 = gg0.f.f77142r) || eventType == gg0.f.f77141q || eventType == fVar2 || z5()) {
            gg0.f fVar3 = gg0.f.f77141q;
            gg0.f fVarC = (eventType == fVar3 || eventType == gg0.f.f77142r) ? null : eventType.c();
            fVar = (eventType == fVar3 || eventType == gg0.f.f77142r) ? gg0.f.f77142r : null;
            eventType = fVarC;
        } else {
            fVar = null;
        }
        String str = eventType != null ? eventType.f77147a : null;
        String str2 = fVar != null ? fVar.f77147a : null;
        LocalDate localDateMinusDays = date.minusDays(2);
        localDateMinusDays.getClass();
        LocalDate localDatePlusDays = date.plusDays(2);
        localDatePlusDays.getClass();
        ge1.b.T(v1.a(this), null, null, new m0(this, str, str2, localDateMinusDays, localDatePlusDays, null), 3);
    }

    public final androidx.lifecycle.s0<fg0.k> k5() {
        return (androidx.lifecycle.s0) this.Z.getValue();
    }

    public final androidx.lifecycle.y0<fg0.k> l5() {
        return (androidx.lifecycle.y0) this.Y.getValue();
    }

    public final androidx.lifecycle.y0<g3<fg0.k>> o5() {
        return (androidx.lifecycle.y0) this.G1.getValue();
    }

    public final void q5() {
        ge1.b.T(v1.a(this), null, null, new c(null), 3);
    }

    public final androidx.lifecycle.y0<g3<o13.p<Boolean, fg0.k>>> r5() {
        return (androidx.lifecycle.y0) this.Q0.getValue();
    }

    public final androidx.lifecycle.y0<g3<ny1.a>> s5() {
        return (androidx.lifecycle.y0) this.f121684f1.getValue();
    }

    public final androidx.lifecycle.y0<ww1.i> t5() {
        return (androidx.lifecycle.y0) this.A1.getValue();
    }

    public final void u5(List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (com.garmin.android.apps.connectmobile.workouts.data.model.k kVar : list) {
            Integer courseId = kVar != null ? kVar.getCourseId() : null;
            f5().m(new ArrayList());
            if (courseId != null) {
                ge1.b.T(v1.a(this), null, null, new p0(this, courseId, null), 3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean v5(fg0.k kVar, double d14) {
        bg0.a.b bVarB;
        fg0.d completionTarget;
        Double value;
        fg0.d completionTarget2;
        gg0.i unit;
        bg0.a.b bVarB2;
        Double value2;
        gg0.i unit2;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH;
        double dJ = 0.0d;
        if (z5()) {
            com.garmin.android.apps.connectmobile.workouts.data.model.k kVar2 = null;
            Object obj = null;
            kVar2 = null;
            if (kVar != null && (listH = kVar.h()) != null) {
                for (Object obj2 : listH) {
                    if (((com.garmin.android.apps.connectmobile.workouts.data.model.k) obj2).getEventLegActivityType() == m52.c.RUNNING) {
                        obj = obj2;
                        break;
                    }
                }
                kVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) obj;
            }
            lz1.f.a aVar = lz1.f.f115404a;
            if (kVar2 == null || (unit2 = kVar2.getUnit()) == null || (bVarB2 = unit2.b()) == null) {
                bVarB2 = bg0.a.b.METER;
            }
            if (kVar2 != null && (value2 = kVar2.getValue()) != null) {
                dJ = value2.doubleValue();
            }
            aVar.getClass();
            dJ = lz1.f.a.j(bVarB2, dJ);
        } else if (y5()) {
            lz1.f.a aVar2 = lz1.f.f115404a;
            if (kVar == null || (completionTarget2 = kVar.getCompletionTarget()) == null || (unit = completionTarget2.getUnit()) == null || (bVarB = unit.b()) == null) {
                bVarB = bg0.a.b.METER;
            }
            if (kVar != null && (completionTarget = kVar.getCompletionTarget()) != null && (value = completionTarget.getValue()) != null) {
                dJ = value.doubleValue();
            }
            aVar2.getClass();
            dJ = lz1.f.a.j(bVarB, dJ);
        } else {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "EventDetailsViewModel", "Run course not available");
        }
        og0.a.f131967a.getClass();
        o13.p pVarX = og0.a.x(dJ, 0.05d);
        double dDoubleValue = ((Number) pVarX.f128594a).doubleValue();
        double dDoubleValue2 = ((Number) pVarX.f128595b).doubleValue();
        if (Double.isNaN(d14)) {
            return true;
        }
        return dDoubleValue <= d14 && d14 <= dDoubleValue2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean w5() {
        Object[] objArr;
        LocalTime localTimeF;
        fg0.k kVarD = l5().d();
        if (kVarD != null) {
            LocalDate localDate = new DateTime().toLocalDate();
            LocalDate date = kVarD.getDate();
            Object[] objArr2 = date != null && date.isEqual(localDate);
            LocalDate date2 = kVarD.getDate();
            Object[] objArr3 = date2 != null && date2.isAfter(localDate);
            fg0.r eventTimeLocal = kVarD.getEventTimeLocal();
            DateTime dateTimeToday = null;
            dateTimeToday = null;
            if ((eventTimeLocal != null ? eventTimeLocal.getStartTimeHhMm() : null) == null) {
                objArr = true;
            } else {
                fg0.r eventTimeLocal2 = kVarD.getEventTimeLocal();
                if ((eventTimeLocal2 != null ? eventTimeLocal2.getTimeZoneId() : null) == null) {
                    objArr = true;
                } else {
                    fg0.r eventTimeLocal3 = kVarD.getEventTimeLocal();
                    DateTime dateTimeD = eventTimeLocal3 != null ? eventTimeLocal3.d() : null;
                    fg0.r eventTimeLocal4 = kVarD.getEventTimeLocal();
                    if (eventTimeLocal4 != null && (localTimeF = eventTimeLocal4.f()) != null) {
                        fg0.r eventTimeLocal5 = kVarD.getEventTimeLocal();
                        dateTimeToday = localTimeF.toDateTimeToday(eventTimeLocal5 != null ? eventTimeLocal5.b() : null);
                    }
                    if (dateTimeToday == null || !(!dateTimeToday.isBefore(dateTimeD))) {
                        objArr = false;
                    } else {
                        objArr = true;
                    }
                }
            }
            if (!p005kotlin.jvm.internal.s.g(kVarD.getSubscribed(), Boolean.TRUE) && ((objArr2 != false && objArr != false) || objArr3 != false)) {
                return true;
            }
        }
        return false;
    }

    public final boolean x5() {
        LocalDate localDate = new DateTime().toLocalDate();
        fg0.k kVarD = l5().d();
        LocalDate date = kVarD != null ? kVarD.getDate() : null;
        if (date != null) {
            return date.isBefore(localDate);
        }
        return false;
    }

    public final boolean y5() {
        gg0.f eventType;
        fg0.k kVarD = l5().d();
        return (kVarD == null || (eventType = kVarD.getEventType()) == null || !eventType.f()) ? false : true;
    }

    public final boolean z5() {
        fg0.k kVarD = l5().d();
        return (kVarD != null ? kVarD.getEventType() : null) == gg0.f.f77136l;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lmz1/e0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "SHARE_URL_PATH", "", "NUMBER_OF_DAYS", "I", "UPCOMING_EVENTS_LIMIT", "MAX_ACTIVITY_DAYS_PLUS_MINUS", "MAX_ACTIVITY_FETCH_LIMIT", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
