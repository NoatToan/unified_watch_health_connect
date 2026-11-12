package zf0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzf0/j0;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class j0 extends u1 {
    public static final /* synthetic */ int F = 0;
    public final o13.t A;
    public final o13.t B;
    public final o13.t C;
    public final o13.t D;
    public final o13.t E;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f204392i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f204393j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public fg0.x f204394k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f204395l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f204396m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public fg0.u f204397n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f204399p;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o13.t f204403v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o13.t f204405x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final androidx.lifecycle.y0<w61.f<o13.p<Object, Object>>> f204406y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final androidx.lifecycle.y0 f204407z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f204384a = d.a.a(d.f204343b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f204385b = o13.m.b(new zd0.r0(1));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f204386c = o13.m.b(new zd0.r0(11));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f204387d = o13.m.b(new zd0.r0(12));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f204388e = o13.m.b(new zd0.r0(2));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f204389f = o13.m.b(new zd0.r0(3));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o13.t f204390g = o13.m.b(new zd0.r0(4));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.t f204391h = o13.m.b(new zd0.r0(5));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f204398o = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f204400q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o13.t f204401r = o13.m.b(new zd0.r0(6));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o13.t f204402t = o13.m.b(new zd0.r0(7));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o13.t f204404w = o13.m.b(new zd0.r0(8));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.events.RaceAndEventBaseViewModel$quitTrainingPlan$4", f = "RaceAndEventBaseViewModel.kt", l = {382}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f204408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f204409b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f204411d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f204412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ gg0.d f204413f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j8, boolean z14, gg0.d dVar, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f204411d = j8;
            this.f204412e = z14;
            this.f204413f = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = j0.this.new b(this.f204411d, this.f204412e, this.f204413f, dVar);
            bVar.f204409b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f204409b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f204408a;
            j0 j0Var = j0.this;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = j0.F;
                ((androidx.lifecycle.y0) j0Var.f204404w.getValue()).j(g3.a.c(g3.f35298f));
                this.f204409b = b0Var;
                this.f204408a = 1;
                obj = j0Var.S4(this.f204411d, this, this.f204412e);
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
                int i16 = j0.F;
                androidx.lifecycle.y0 y0Var = (androidx.lifecycle.y0) j0Var.f204404w.getValue();
                g3.f35298f.getClass();
                y0Var.j(g3.a.d(this.f204413f));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                int i17 = j0.F;
                ((androidx.lifecycle.y0) j0Var.f204404w.getValue()).j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "quitTrainingPlan: error while removing the training plan ");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "EventBaseViewModel", strD);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.events.RaceAndEventBaseViewModel$updateEventCustomization$1", f = "RaceAndEventBaseViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f204414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f204415b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ fg0.k f204417d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fg0.k kVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f204417d = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = j0.this.new c(this.f204417d, dVar);
            cVar.f204415b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f204415b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f204414a;
            j0 j0Var = j0.this;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f204415b = b0Var;
                this.f204414a = 1;
                obj = j0Var.V4(this.f204417d, this);
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
                j0Var.O4().j(g3.a.e(g3.f35298f));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                j0Var.O4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                v2.a aVar2 = (v2.a) v2Var;
                String str = "Error while updating event to primary " + aVar2.f47384b + " :: " + aVar2.f47383a + StringUtils.SPACE;
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var, "EventBaseViewModel", str);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public j0() {
        final int i14 = 0;
        this.f204403v = o13.m.b(new e23.a(this) { // from class: zf0.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j0 f204381b;

            {
                this.f204381b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                j0 j0Var = this.f204381b;
                switch (i15) {
                    case 0:
                        int i16 = j0.F;
                        return (androidx.lifecycle.y0) j0Var.f204402t.getValue();
                    case 1:
                        int i17 = j0.F;
                        return (androidx.lifecycle.y0) j0Var.f204404w.getValue();
                    case 2:
                        int i18 = j0.F;
                        return j0Var.N4();
                    case 3:
                        int i19 = j0.F;
                        return j0Var.O4();
                    default:
                        int i24 = j0.F;
                        return new ou1.a(j0Var.D4(), j0Var.E4(), j0Var.f204384a);
                }
            }
        });
        final int i15 = 1;
        this.f204405x = o13.m.b(new e23.a(this) { // from class: zf0.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j0 f204381b;

            {
                this.f204381b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                j0 j0Var = this.f204381b;
                switch (i16) {
                    case 0:
                        int i17 = j0.F;
                        return (androidx.lifecycle.y0) j0Var.f204402t.getValue();
                    case 1:
                        int i18 = j0.F;
                        return (androidx.lifecycle.y0) j0Var.f204404w.getValue();
                    case 2:
                        int i19 = j0.F;
                        return j0Var.N4();
                    case 3:
                        int i110 = j0.F;
                        return j0Var.O4();
                    default:
                        int i24 = j0.F;
                        return new ou1.a(j0Var.D4(), j0Var.E4(), j0Var.f204384a);
                }
            }
        });
        androidx.lifecycle.y0<w61.f<o13.p<Object, Object>>> y0Var = new androidx.lifecycle.y0<>();
        this.f204406y = y0Var;
        this.f204407z = y0Var;
        this.A = o13.m.b(new zd0.r0(9));
        final int i16 = 2;
        this.B = o13.m.b(new e23.a(this) { // from class: zf0.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j0 f204381b;

            {
                this.f204381b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                j0 j0Var = this.f204381b;
                switch (i17) {
                    case 0:
                        int i18 = j0.F;
                        return (androidx.lifecycle.y0) j0Var.f204402t.getValue();
                    case 1:
                        int i19 = j0.F;
                        return (androidx.lifecycle.y0) j0Var.f204404w.getValue();
                    case 2:
                        int i110 = j0.F;
                        return j0Var.N4();
                    case 3:
                        int i111 = j0.F;
                        return j0Var.O4();
                    default:
                        int i24 = j0.F;
                        return new ou1.a(j0Var.D4(), j0Var.E4(), j0Var.f204384a);
                }
            }
        });
        this.C = o13.m.b(new zd0.r0(10));
        final int i17 = 3;
        this.D = o13.m.b(new e23.a(this) { // from class: zf0.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j0 f204381b;

            {
                this.f204381b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i18 = i17;
                j0 j0Var = this.f204381b;
                switch (i18) {
                    case 0:
                        int i19 = j0.F;
                        return (androidx.lifecycle.y0) j0Var.f204402t.getValue();
                    case 1:
                        int i110 = j0.F;
                        return (androidx.lifecycle.y0) j0Var.f204404w.getValue();
                    case 2:
                        int i111 = j0.F;
                        return j0Var.N4();
                    case 3:
                        int i112 = j0.F;
                        return j0Var.O4();
                    default:
                        int i24 = j0.F;
                        return new ou1.a(j0Var.D4(), j0Var.E4(), j0Var.f204384a);
                }
            }
        });
        final int i18 = 4;
        this.E = o13.m.b(new e23.a(this) { // from class: zf0.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j0 f204381b;

            {
                this.f204381b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i19 = i18;
                j0 j0Var = this.f204381b;
                switch (i19) {
                    case 0:
                        int i110 = j0.F;
                        return (androidx.lifecycle.y0) j0Var.f204402t.getValue();
                    case 1:
                        int i111 = j0.F;
                        return (androidx.lifecycle.y0) j0Var.f204404w.getValue();
                    case 2:
                        int i112 = j0.F;
                        return j0Var.N4();
                    case 3:
                        int i113 = j0.F;
                        return j0Var.O4();
                    default:
                        int i24 = j0.F;
                        return new ou1.a(j0Var.D4(), j0Var.E4(), j0Var.f204384a);
                }
            }
        });
    }

    public static boolean Q4(fg0.k kVar) {
        kVar.getClass();
        fg0.r eventTimeLocal = kVar.getEventTimeLocal();
        if ((eventTimeLocal != null ? eventTimeLocal.getStartTimeHhMm() : null) == null) {
            return false;
        }
        fg0.r eventTimeLocal2 = kVar.getEventTimeLocal();
        return (eventTimeLocal2 != null ? eventTimeLocal2.getTimeZoneId() : null) != null;
    }

    public static boolean T4(LocalDate localDate) {
        LocalDate localDate2 = new DateTime().toLocalDate();
        if (!g22.k.g(localDate2, localDate)) {
            localDate2.getClass();
            LocalDate localDatePlusDays = localDate2.plusDays(2);
            localDatePlusDays.getClass();
            if (!jg.b.D(localDate, localDate2, localDatePlusDays, true)) {
                return false;
            }
        }
        return true;
    }

    public static List x4(List list) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fg0.o oVar = (fg0.o) it.next();
            List<fg0.d> listG = oVar.g();
            if ((listG != null ? listG.size() : 0) <= 1) {
                arrayListL.add(oVar);
            } else {
                List<fg0.d> listG2 = oVar.g();
                if (listG2 != null) {
                    Iterator<T> it3 = listG2.iterator();
                    while (it3.hasNext()) {
                        arrayListL.add(fg0.o.b(oVar, p13.w.c((fg0.d) it3.next())));
                    }
                }
            }
        }
        return p13.h0.N0(arrayListL, new w0(DateTimeFormat.forPattern("yyyy-MM-dd")));
    }

    public final fg0.n A4(String str) {
        List list = (List) ((androidx.lifecycle.y0) this.f204402t.getValue()).d();
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (p005kotlin.jvm.internal.s.g(((fg0.n) obj2).getEventsProviderKey(), str)) {
                obj = obj2;
                break;
            }
        }
        return (fg0.n) obj;
    }

    public final hg0.b B4() {
        return (hg0.b) this.f204385b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object C4(long j8, v13.c cVar) {
        o0 o0Var;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i14 = o0Var.f204467c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o0Var.f204467c = i14 - Integer.MIN_VALUE;
            } else {
                o0Var = new o0(this, cVar);
            }
        } else {
            o0Var = new o0(this, cVar);
        }
        Object objJ = o0Var.f204465a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = o0Var.f204467c;
        if (i15 == 0) {
            o13.r.b(objJ);
            hg0.b bVarB4 = B4();
            o0Var.f204467c = 1;
            bVarB4.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVarB4, new hg0.f(bVarB4, j8, null), o0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            return (b2) ((v2.b) v2Var).f47386a;
        }
        if (v2Var instanceof v2.a) {
            return null;
        }
        lc.u0.r();
        return null;
    }

    public final ax1.b D4() {
        return (ax1.b) this.f204390g.getValue();
    }

    public final ax1.i E4() {
        return (ax1.i) this.f204391h.getValue();
    }

    public final d60.b F4() {
        return (d60.b) this.f204388e.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r10 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r10 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G4(String str, Long l14, v13.c cVar) {
        p0 p0Var;
        v2 v2Var;
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i14 = p0Var.f204475e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p0Var.f204475e = i14 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(this, cVar);
            }
        } else {
            p0Var = new p0(this, cVar);
        }
        Object objD = p0Var.f204473c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = p0Var.f204475e;
        if (i15 == 0) {
            o13.r.b(objD);
            boolean zD = g22.n.d(str);
            d dVar = this.f204384a;
            if (zD) {
                p0Var.f204471a = str;
                p0Var.f204472b = l14;
                p0Var.f204475e = 1;
                objD = dVar.f(str, p0Var);
            } else {
                if (l14 == null) {
                    return null;
                }
                long jLongValue = l14.longValue();
                p0Var.f204471a = str;
                p0Var.f204472b = l14;
                p0Var.f204475e = 2;
                objD = dVar.d(jLongValue, p0Var);
            }
            return aVar;
        }
        if (i15 == 1) {
            l14 = p0Var.f204472b;
            str = p0Var.f204471a;
            o13.r.b(objD);
            v2Var = (v2) objD;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l14 = p0Var.f204472b;
            str = p0Var.f204471a;
            o13.r.b(objD);
            v2Var = (v2) objD;
        }
        if (v2Var instanceof v2.b) {
            return (fg0.k) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        String str2 = "Error getting event dto for shareableUuid " + str + " or Event ID " + l14 + " : " + ((v2.a) v2Var).f47383a;
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "EventBaseViewModel", str2);
        return null;
    }

    public final ig0.b H4() {
        return (ig0.b) this.f204387d.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:77:0x015e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0175  */
    /* JADX WARN: Code duplicated, block: B:83:0x017d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0181  */
    /* JADX WARN: Code duplicated, block: B:87:0x018b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ad, code lost:
    
        if (r1 == r8) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object I4(fg0.k kVar, v13.c cVar) {
        r0 r0Var;
        long millis;
        Double lat;
        Double lon;
        Long associatedWithActivityId;
        r0 r0Var2;
        long j8;
        b2 b2Var;
        Double d14;
        Double d15;
        h42.c cVar2;
        long j14;
        h42.f temperature;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i14 = r0Var.f204490h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                r0Var.f204490h = i14 - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(this, cVar);
            }
        } else {
            r0Var = new r0(this, cVar);
        }
        r0 r0Var3 = r0Var;
        Object objJ4 = r0Var3.f204488f;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = r0Var3.f204490h;
        if (i15 != 0) {
            if (i15 == 1) {
                j8 = r0Var3.f204487e;
                long j15 = r0Var3.f204486d;
                associatedWithActivityId = r0Var3.f204485c;
                Double d16 = r0Var3.f204484b;
                Double d17 = r0Var3.f204483a;
                o13.r.b(objJ4);
                lon = d16;
                lat = d17;
                millis = j15;
                r0Var2 = r0Var3;
            } else if (i15 == 2) {
                j8 = r0Var3.f204487e;
                long j16 = r0Var3.f204486d;
                d15 = r0Var3.f204484b;
                d14 = r0Var3.f204483a;
                o13.r.b(objJ4);
                millis = j16;
                r0Var2 = r0Var3;
                b2Var = (b2) objJ4;
                lon = d15;
                lat = d14;
                j14 = j8;
                if (b2Var != null) {
                    return new fg0.t(b2Var.getTemp(), null);
                }
                int iA = lb2.b.a(lat.doubleValue());
                int iA2 = lb2.b.a(lon.doubleValue());
                r0Var2.f204483a = null;
                r0Var2.f204484b = null;
                r0Var2.f204485c = null;
                r0Var2.f204486d = millis;
                r0Var2.f204487e = j14;
                r0Var2.f204490h = 3;
                objJ4 = K4(iA, iA2, j14, r0Var2);
            } else {
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objJ4);
            }
            h42.e eVar = (h42.e) objJ4;
            return new fg0.t((eVar == null || (temperature = eVar.getTemperature()) == null) ? null : temperature.getValue(), eVar != null ? eVar.getIcon() : null);
        }
        o13.r.b(objJ4);
        if ((kVar != null ? kVar.getEventTimeLocal() : null) == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "EventBaseViewModel", "weather error: event time is null ");
            return null;
        }
        long j17 = 1000;
        millis = new DateTime().toLocalDate().toDateTimeAtCurrentTime().getMillis() / j17;
        fg0.y locationStartPoint = kVar.getLocationStartPoint();
        lat = locationStartPoint != null ? locationStartPoint.getLat() : null;
        fg0.y locationStartPoint2 = kVar.getLocationStartPoint();
        lon = locationStartPoint2 != null ? locationStartPoint2.getLon() : null;
        LocalDate date = kVar.getDate();
        fg0.r eventTimeLocal = kVar.getEventTimeLocal();
        LocalTime localTimeF = eventTimeLocal != null ? eventTimeLocal.f() : null;
        fg0.j eventCustomization = kVar.getEventCustomization();
        associatedWithActivityId = eventCustomization != null ? eventCustomization.getAssociatedWithActivityId() : null;
        if (lat != null && lon != null && date != null && localTimeF != null) {
            og0.a aVar2 = og0.a.f131967a;
            fg0.r eventTimeLocal2 = kVar.getEventTimeLocal();
            String timeZoneId = eventTimeLocal2 != null ? eventTimeLocal2.getTimeZoneId() : null;
            aVar2.getClass();
            long millis2 = og0.a.p(date, localTimeF, timeZoneId).getMillis() / j17;
            if (millis - millis2 <= 0) {
                double dDoubleValue = lat.doubleValue();
                double dDoubleValue2 = lon.doubleValue();
                r0Var3.f204483a = lat;
                r0Var3.f204484b = lon;
                r0Var3.f204485c = associatedWithActivityId;
                r0Var3.f204486d = millis;
                r0Var3.f204487e = millis2;
                r0Var3.f204490h = 1;
                r0Var2 = r0Var3;
                Long l14 = associatedWithActivityId;
                objJ4 = J4(dDoubleValue, dDoubleValue2, millis2, r0Var2);
                if (objJ4 != obj) {
                    j8 = millis2;
                    associatedWithActivityId = l14;
                }
            } else {
                r0Var2 = r0Var3;
                j8 = millis2;
                if (associatedWithActivityId != null) {
                    long jLongValue = associatedWithActivityId.longValue();
                    r0Var2.f204483a = lat;
                    r0Var2.f204484b = lon;
                    r0Var2.f204485c = null;
                    r0Var2.f204486d = millis;
                    r0Var2.f204487e = j8;
                    r0Var2.f204490h = 2;
                    objJ4 = C4(jLongValue, r0Var2);
                    if (objJ4 != obj) {
                        d14 = lat;
                        d15 = lon;
                        b2Var = (b2) objJ4;
                        lon = d15;
                        lat = d14;
                        j14 = j8;
                        if (b2Var != null) {
                            return new fg0.t(b2Var.getTemp(), null);
                        }
                        int iA3 = lb2.b.a(lat.doubleValue());
                        int iA4 = lb2.b.a(lon.doubleValue());
                        r0Var2.f204483a = null;
                        r0Var2.f204484b = null;
                        r0Var2.f204485c = null;
                        r0Var2.f204486d = millis;
                        r0Var2.f204487e = j14;
                        r0Var2.f204490h = 3;
                        objJ4 = K4(iA3, iA4, j14, r0Var2);
                    }
                } else {
                    b2Var = null;
                    j14 = j8;
                    if (b2Var != null) {
                        return new fg0.t(b2Var.getTemp(), null);
                    }
                    int iA5 = lb2.b.a(lat.doubleValue());
                    int iA6 = lb2.b.a(lon.doubleValue());
                    r0Var2.f204483a = null;
                    r0Var2.f204484b = null;
                    r0Var2.f204485c = null;
                    r0Var2.f204486d = millis;
                    r0Var2.f204487e = j14;
                    r0Var2.f204490h = 3;
                    objJ4 = K4(iA5, iA6, j14, r0Var2);
                }
            }
            return obj;
        }
        return null;
        h42.b bVar = (h42.b) objJ4;
        if (bVar != null) {
            h42.d historical = bVar.getHistorical();
            if (historical != null) {
                h42.f average = historical.getAverage();
                return new fg0.t(average != null ? average.getValue() : null, null);
            }
            List<h42.c> listB = bVar.b();
            if (listB != null && (cVar2 = listB.get(0)) != null) {
                h42.f temp = cVar2.getTemp();
                return new fg0.t(temp != null ? temp.getValue() : null, cVar2.getIcon());
            }
            return null;
        }
        if (associatedWithActivityId != null) {
            long jLongValue2 = associatedWithActivityId.longValue();
            r0Var2.f204483a = lat;
            r0Var2.f204484b = lon;
            r0Var2.f204485c = null;
            r0Var2.f204486d = millis;
            r0Var2.f204487e = j8;
            r0Var2.f204490h = 2;
            objJ4 = C4(jLongValue2, r0Var2);
            if (objJ4 != obj) {
                d14 = lat;
                d15 = lon;
                b2Var = (b2) objJ4;
                lon = d15;
                lat = d14;
                j14 = j8;
                if (b2Var != null) {
                    return new fg0.t(b2Var.getTemp(), null);
                }
                int iA7 = lb2.b.a(lat.doubleValue());
                int iA8 = lb2.b.a(lon.doubleValue());
                r0Var2.f204483a = null;
                r0Var2.f204484b = null;
                r0Var2.f204485c = null;
                r0Var2.f204486d = millis;
                r0Var2.f204487e = j14;
                r0Var2.f204490h = 3;
                objJ4 = K4(iA7, iA8, j14, r0Var2);
            }
        } else {
            b2Var = null;
            j14 = j8;
            if (b2Var != null) {
                return new fg0.t(b2Var.getTemp(), null);
            }
            int iA9 = lb2.b.a(lat.doubleValue());
            int iA10 = lb2.b.a(lon.doubleValue());
            r0Var2.f204483a = null;
            r0Var2.f204484b = null;
            r0Var2.f204485c = null;
            r0Var2.f204486d = millis;
            r0Var2.f204487e = j14;
            r0Var2.f204490h = 3;
            objJ4 = K4(iA9, iA10, j14, r0Var2);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object J4(double d14, double d15, long j8, v13.c cVar) {
        s0 s0Var;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i14 = s0Var.f204496c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s0Var.f204496c = i14 - Integer.MIN_VALUE;
            } else {
                s0Var = new s0(this, cVar);
            }
        } else {
            s0Var = new s0(this, cVar);
        }
        Object objJ = s0Var.f204494a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = s0Var.f204496c;
        if (i15 == 0) {
            o13.r.b(objJ);
            f42.b bVar = (f42.b) this.f204386c.getValue();
            int iA = lb2.b.a(d14);
            int iA2 = lb2.b.a(d15);
            s0Var.f204496c = 1;
            bVar.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new f42.c(bVar, iA, iA2, j8, 1, null), s0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            return (h42.b) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        String string = ((v2.a) v2Var).f47383a.toString();
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "EventBaseViewModel", string);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object K4(int i14, int i15, long j8, v13.c cVar) {
        t0 t0Var;
        if (cVar instanceof t0) {
            t0Var = (t0) cVar;
            int i16 = t0Var.f204503c;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                t0Var.f204503c = i16 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(this, cVar);
            }
        } else {
            t0Var = new t0(this, cVar);
        }
        Object objC = t0Var.f204501a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = t0Var.f204503c;
        if (i17 == 0) {
            o13.r.b(objC);
            f42.b bVar = (f42.b) this.f204386c.getValue();
            t0Var.f204503c = 1;
            bVar.getClass();
            objC = bVar.C(new f42.d(bVar, i14, i15, j8, null, null, null), t0Var);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            return (h42.e) ((v2.b) v2Var).f47386a;
        }
        if (v2Var instanceof v2.a) {
            return null;
        }
        lc.u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object L4(fg0.k kVar, v13.c cVar) {
        u0 u0Var;
        if (cVar instanceof u0) {
            u0Var = (u0) cVar;
            int i14 = u0Var.f204512d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                u0Var.f204512d = i14 - Integer.MIN_VALUE;
            } else {
                u0Var = new u0(this, cVar);
            }
        } else {
            u0Var = new u0(this, cVar);
        }
        Object objJ = u0Var.f204510b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = u0Var.f204512d;
        if (i15 == 0) {
            o13.r.b(objJ);
            Long l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            String eventImageUUID = kVar.getEventImageUUID();
            if (l14 == null || eventImageUUID == null) {
                return Boolean.FALSE;
            }
            long jLongValue = l14.longValue();
            u0Var.f204509a = kVar;
            u0Var.f204512d = 1;
            d dVar = this.f204384a;
            dVar.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(dVar, new n(dVar, jLongValue, eventImageUUID, null), u0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kVar = u0Var.f204509a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            T t7 = ((v2.b) v2Var).f47386a;
            if (!(t7 instanceof fg0.a0)) {
                return Boolean.FALSE;
            }
            kVar.J0(p13.w.c(t7));
            return Boolean.TRUE;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error fetching Event Image Url ");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "EventBaseViewModel", strD);
        return Boolean.FALSE;
    }

    public final androidx.lifecycle.s0<g3<Unit>> M4() {
        return (androidx.lifecycle.s0) this.D.getValue();
    }

    public final androidx.lifecycle.y0<g3<gg0.d>> N4() {
        return (androidx.lifecycle.y0) this.A.getValue();
    }

    public final androidx.lifecycle.y0<g3<Unit>> O4() {
        return (androidx.lifecycle.y0) this.C.getValue();
    }

    public final boolean P4() {
        return p005kotlin.jvm.internal.s.g(this.f204393j, Boolean.TRUE) || this.f204395l;
    }

    public final void R4(long j8, boolean z14, gg0.d dVar) {
        ge1.b.T(v1.a(this), null, null, new b(j8, z14, dVar, null), 3);
    }

    public final Object S4(long j8, v13.c cVar, boolean z14) {
        if (z14) {
            ax1.b bVarD4 = D4();
            bVarD4.getClass();
            return com.garmin.android.apps.connectmobile.f0.J(bVarD4, new ax1.g(bVarD4, j8, null), cVar);
        }
        ax1.i iVarE4 = E4();
        iVarE4.getClass();
        return com.garmin.android.apps.connectmobile.f0.J(iVarE4, new ax1.j(iVarE4, j8, null), cVar);
    }

    public final void U4(fg0.k kVar) {
        O4().j(g3.a.c(g3.f35298f));
        ge1.b.T(v1.a(this), null, null, new c(kVar, null), 3);
    }

    public final Object V4(fg0.k kVar, t13.d<? super v2<Unit>> dVar) {
        boolean zG = p005kotlin.jvm.internal.s.g(kVar.getEventOrganizer(), Boolean.TRUE);
        d dVar2 = this.f204384a;
        if (zG) {
            Long l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            l14.getClass();
            long jLongValue = l14.longValue();
            dVar2.getClass();
            return com.garmin.android.apps.connectmobile.f0.J(dVar2, new b0(dVar2, jLongValue, kVar, null), dVar);
        }
        if (kVar.getShareableEventUuid() == null) {
            return new v2.a(new IllegalStateException(), null, null, 6, null);
        }
        String shareableEventUuid = kVar.getShareableEventUuid();
        shareableEventUuid.getClass();
        fg0.j eventCustomization = kVar.getEventCustomization();
        eventCustomization.getClass();
        return dVar2.i(shareableEventUuid, eventCustomization, dVar);
    }

    public final void W4(fg0.k kVar, fg0.k kVar2) {
        kVar.getClass();
        O4().m(g3.a.c(g3.f35298f));
        ge1.b.T(v1.a(this), null, null, new x0(kVar2, null, this, kVar, null), 3);
    }

    public final p2 y4() {
        p2 p2VarA = q2.a(null);
        ge1.b.T(v1.a(this), null, null, new l0(p2VarA, this, null), 3);
        return p2VarA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z4(fg0.k kVar, v13.c cVar) {
        m0 m0Var;
        if (cVar instanceof m0) {
            m0Var = (m0) cVar;
            int i14 = m0Var.f204439d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                m0Var.f204439d = i14 - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(this, cVar);
            }
        } else {
            m0Var = new m0(this, cVar);
        }
        Object objG4 = m0Var.f204437b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = m0Var.f204439d;
        if (i15 == 0) {
            o13.r.b(objG4);
            gg0.f eventType = kVar.getEventType();
            if (eventType == null || !eventType.g()) {
                return kVar;
            }
            String shareableEventUuid = kVar.o0() ? kVar.getShareableEventUuid() : null;
            Long l14 = kVar.n0() ? kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() : null;
            m0Var.f204436a = kVar;
            m0Var.f204439d = 1;
            objG4 = G4(shareableEventUuid, l14, m0Var);
            if (objG4 == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kVar = m0Var.f204436a;
            o13.r.b(objG4);
        }
        fg0.k kVar2 = (fg0.k) objG4;
        if (kVar2 == null) {
            String str = "Error occurred while fetching the Triathlon event detailed dto " + kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() + " / " + kVar.getShareableEventUuid();
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "EventBaseViewModel", str);
        }
        return kVar2;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lzf0/j0$a;", "", "<init>", "()V", "", "DISTANCE", "Ljava/lang/String;", "TIME", "TAG", "", "WITH_IN_METERS", "I", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
