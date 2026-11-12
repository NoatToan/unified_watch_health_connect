package qv1;

import am.x0;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.e3;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.mlkit.common.MlKitException;
import e23.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jv1.e0;
import kv1.y;
import lc.u0;
import o13.r;
import o53.b0;
import o53.c0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import r53.b2;
import r53.p2;
import r53.q2;
import tw1.m;
import tw1.n;
import tw1.t;
import vt1.o;
import ww1.d0;
import ww1.x;
import yw1.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lqv1/b;", "Landroidx/lifecycle/u1;", "Ltv1/c;", "progressReportRepo", "Lou1/i;", "fitnessStatsUseCase", "Lkv1/b;", "fbtPlansRepo", "Lkv1/y;", "userSettingsRepo", "Luw1/b;", "trainingPlansRepo", "Lgu1/b;", "atpRepo", "Ld60/b;", "courseRepo", "Lzf0/d;", "eventRepo", "<init>", "(Ltv1/c;Lou1/i;Lkv1/b;Lkv1/y;Luw1/b;Lgu1/b;Ld60/b;Lzf0/d;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f147933y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tv1.c f147934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ou1.i f147935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kv1.b f147936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f147937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uw1.b f147938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gu1.b f147939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d60.b f147940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zf0.d f147941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f147942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f147943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f147944k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b2 f147945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f147946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b2 f147947n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<jv1.b> f147948o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<m> f147949p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f147950q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f147951r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m f147952t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e0 f147953v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LocalDate f147954w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public fg0.k f147955x;

    /* JADX INFO: renamed from: qv1.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C2785b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f147956a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.f180175f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.f180176g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.f180178i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o.f180179j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o.f180180k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f147956a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$createNewOpenLoopPlan$1$1", f = "FBTProgressReportViewModel.kt", l = {634}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public jv1.j f147957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f147958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f147959c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m f147961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ LocalDate f147962f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e0 f147963g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f147964h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ List<jv1.b> f147965i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m mVar, LocalDate localDate, e0 e0Var, int i14, List<jv1.b> list, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f147961e = mVar;
            this.f147962f = localDate;
            this.f147963g = e0Var;
            this.f147964h = i14;
            this.f147965i = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = b.this.new c(this.f147961e, this.f147962f, this.f147963g, this.f147964h, this.f147965i, dVar);
            cVar.f147959c = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            jv1.j jVar;
            Object objJ;
            b0 b0Var = (b0) this.f147959c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f147958b;
            b bVar = b.this;
            if (i14 == 0) {
                r.b(obj);
                bVar.f147944k.k(null, g3.a.c(g3.f35298f));
                m mVar = this.f147961e;
                String trainingPlanName = mVar.getTrainingPlanName();
                String string = this.f147962f.toString();
                hv1.i swimAbility = mVar.getSwimAbility();
                String strName = swimAbility != null ? swimAbility.name() : null;
                List<tw1.h> listS = mVar.s();
                if (listS != null) {
                    ArrayList arrayList2 = new ArrayList(p13.y.r(listS, 10));
                    Iterator<T> it = listS.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((tw1.h) it.next()).f166715a);
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                fy1.i.f73924a.getClass();
                String strF = fy1.i.a.f();
                e0 e0Var = this.f147963g;
                List<String> listB = e0Var.b();
                List<String> listD = e0Var.d();
                if (listD == null) {
                    listD = j0.f134944a;
                }
                jVar = new jv1.j(trainingPlanName, string, new Integer(this.f147964h), listB, listD, e0Var.h(), strName, strF, arrayList, this.f147965i);
                kv1.b bVar2 = bVar.f147936c;
                this.f147959c = b0Var;
                this.f147957a = jVar;
                this.f147958b = 1;
                bVar2.getClass();
                objJ = f0.J(bVar2, new kv1.d(bVar2, jVar, null), this);
                if (objJ == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jv1.j jVar2 = this.f147957a;
                r.b(obj);
                jVar = jVar2;
                objJ = obj;
            }
            v2 v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                m mVar2 = (m) ((v2.b) v2Var).f47386a;
                p2 p2Var = bVar.f147944k;
                g3.f35298f.getClass();
                p2Var.k(null, g3.a.d(mVar2));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                v2.a aVar2 = (v2.a) v2Var;
                bVar.f147944k.k(null, g3.a.a(g3.f35298f, aVar2.f47385c, aVar2.f47383a, null, null, 12));
                String str = "Error creating new open loop plan. RequestData=" + jVar + " Exception=" + aVar2.f47383a;
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var, "FBTProgressReportViewModel", str);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$loadScreen$1", f = "FBTProgressReportViewModel.kt", l = {167, 187, 190, 192, 194, 197, 199, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 211, 232, 245, 250, 254, TsExtractor.TS_STREAM_TYPE_AIT, 262, 266, 271, 280, 286, 291, 292, 299, 300}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {
        public vt1.o A;
        public LocalDate B;
        public List C;
        public Iterator D;
        public Serializable E;
        public boolean F;
        public /* synthetic */ Object H0;
        public boolean I;
        public final /* synthetic */ vt1.o J0;
        public final /* synthetic */ uv1.c K0;
        public final /* synthetic */ uv1.b L0;
        public final /* synthetic */ long M0;
        public final /* synthetic */ LocalDate N0;
        public final /* synthetic */ LocalDate O0;
        public int P;
        public final /* synthetic */ LocalDate P0;
        public final /* synthetic */ pi0.e Q0;
        public final /* synthetic */ String R0;
        public final /* synthetic */ boolean S0;
        public int T;
        public final /* synthetic */ List<tw1.a> T0;
        public int X;
        public double Y;
        public long Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public vv1.b f147966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public r0 f147967b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public r0 f147968c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public r0 f147969d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public r0 f147970e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public r0 f147971f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public r0 f147972g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public r0 f147973h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public r0 f147974i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public r0 f147975j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public r0 f147976k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public int f147977k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public r0 f147978l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public r0 f147979m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public r0 f147980n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public r0 f147981o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public r0 f147982p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public m0 f147983q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public r0 f147984r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public m0 f147985t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public LocalDate f147986v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f147987w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public LocalDate f147988x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public b f147989y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public LocalDate f147990z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$loadScreen$1$1", f = "FBTProgressReportViewModel.kt", l = {197}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f147991a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f147992b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LocalDate f147993c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LocalDate f147994d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, LocalDate localDate, LocalDate localDate2, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f147992b = bVar;
                this.f147993c = localDate;
                this.f147994d = localDate2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f147992b, this.f147993c, this.f147994d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f147991a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    ou1.i iVar = this.f147992b.f147935b;
                    LocalDate localDate = this.f147994d;
                    localDate.getClass();
                    this.f147991a = 1;
                    if (iVar.i(this.f147993c, localDate, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: qv1.b$d$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$loadScreen$1$2", f = "FBTProgressReportViewModel.kt", l = {199}, m = "invokeSuspend", v = 2)
        public static final class C2786b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f147995a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f147996b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LocalDate f147997c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LocalDate f147998d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2786b(b bVar, LocalDate localDate, LocalDate localDate2, t13.d<? super C2786b> dVar) {
                super(2, dVar);
                this.f147996b = bVar;
                this.f147997c = localDate;
                this.f147998d = localDate2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2786b(this.f147996b, this.f147997c, this.f147998d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C2786b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f147995a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    ou1.i iVar = this.f147996b.f147935b;
                    LocalDate localDate = this.f147998d;
                    localDate.getClass();
                    this.f147995a = 1;
                    if (iVar.g(this.f147997c, localDate, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lyw1/u;", "<anonymous>", "(Lo53/b0;)Lyw1/u;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$loadScreen$1$3$10", f = "FBTProgressReportViewModel.kt", l = {271}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements e23.p<b0, t13.d<? super u>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f147999a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f148000b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LocalDate f148001c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LocalDate f148002d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, LocalDate localDate, LocalDate localDate2, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f148000b = bVar;
                this.f148001c = localDate;
                this.f148002d = localDate2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f148000b, this.f148001c, this.f148002d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super u> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f147999a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                ou1.i iVar = this.f148000b.f147935b;
                LocalDate localDate = this.f148002d;
                localDate.getClass();
                this.f147999a = 1;
                Object objN = iVar.n(this.f148001c, localDate, this);
                return objN == aVar ? aVar : objN;
            }
        }

        /* JADX INFO: renamed from: qv1.b$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lir0/e;", "<anonymous>", "(Lo53/b0;)Lir0/e;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$loadScreen$1$3$11", f = "FBTProgressReportViewModel.kt", l = {279}, m = "invokeSuspend", v = 2)
        public static final class C2787d extends v13.i implements e23.p<b0, t13.d<? super ir0.e>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f148003a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LocalDate f148004b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LocalDate f148005c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ m0 f148006d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2787d(LocalDate localDate, LocalDate localDate2, m0 m0Var, t13.d<? super C2787d> dVar) {
                super(2, dVar);
                this.f148004b = localDate;
                this.f148005c = localDate2;
                this.f148006d = m0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2787d(this.f148004b, this.f148005c, this.f148006d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super ir0.e> dVar) {
                return ((C2787d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f148003a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                e3 e3Var = (e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null);
                DateTime dateTimeAtStartOfDay = this.f148004b.toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay.getClass();
                DateTime dateTimeAtStartOfDay2 = this.f148005c.toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay2.getClass();
                boolean z14 = this.f148006d.f105804a;
                this.f148003a = 1;
                Object objO = e3Var.o(dateTimeAtStartOfDay, dateTimeAtStartOfDay2, z14, this);
                return objO == aVar ? aVar : objO;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lj61/i;", "<anonymous>", "(Lo53/b0;)Lj61/i;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$loadScreen$1$3$12", f = "FBTProgressReportViewModel.kt", l = {291}, m = "invokeSuspend", v = 2)
        public static final class e extends v13.i implements e23.p<b0, t13.d<? super j61.i>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f148007a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f148008b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(b bVar, t13.d<? super e> dVar) {
                super(2, dVar);
                this.f148008b = bVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new e(this.f148008b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super j61.i> dVar) {
                return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f148007a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f148007a = 1;
                    Object objZ4 = b.z4(this.f148008b, this);
                    return objZ4 == aVar ? aVar : objZ4;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lj61/d;", "<anonymous>", "(Lo53/b0;)Lj61/d;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$loadScreen$1$3$13", f = "FBTProgressReportViewModel.kt", l = {292}, m = "invokeSuspend", v = 2)
        public static final class f extends v13.i implements e23.p<b0, t13.d<? super j61.d>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f148009a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f148010b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f148011c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(b bVar, long j8, t13.d<? super f> dVar) {
                super(2, dVar);
                this.f148010b = bVar;
                this.f148011c = j8;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new f(this.f148010b, this.f148011c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super j61.d> dVar) {
                return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f148009a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f148009a = 1;
                    Object objY4 = b.y4(this.f148010b, this.f148011c, this);
                    return objY4 == aVar ? aVar : objY4;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lk61/b;", "<anonymous>", "(Lo53/b0;)Lk61/b;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$loadScreen$1$3$14", f = "FBTProgressReportViewModel.kt", l = {299}, m = "invokeSuspend", v = 2)
        public static final class g extends v13.i implements e23.p<b0, t13.d<? super k61.b>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f148012a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f148013b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LocalDate f148014c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LocalDate f148015d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ List<x> f148016e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(b bVar, LocalDate localDate, LocalDate localDate2, List<x> list, t13.d<? super g> dVar) {
                super(2, dVar);
                this.f148013b = bVar;
                this.f148014c = localDate;
                this.f148015d = localDate2;
                this.f148016e = list;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new g(this.f148013b, this.f148014c, this.f148015d, this.f148016e, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super k61.b> dVar) {
                return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f148012a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f148012a = 1;
                    Object objA4 = b.A4(this.f148013b, this.f148014c, this.f148015d, this.f148016e, this);
                    return objA4 == aVar ? aVar : objA4;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lj61/d;", "<anonymous>", "(Lo53/b0;)Lj61/d;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$loadScreen$1$3$15", f = "FBTProgressReportViewModel.kt", l = {300}, m = "invokeSuspend", v = 2)
        public static final class h extends v13.i implements e23.p<b0, t13.d<? super j61.d>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f148017a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f148018b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f148019c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(b bVar, long j8, t13.d<? super h> dVar) {
                super(2, dVar);
                this.f148018b = bVar;
                this.f148019c = j8;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new h(this.f148018b, this.f148019c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super j61.d> dVar) {
                return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f148017a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f148017a = 1;
                    Object objY4 = b.y4(this.f148018b, this.f148019c, this);
                    return objY4 == aVar ? aVar : objY4;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "", "Lpu1/c;", "", "<anonymous>", "(Lo53/b0;)Ljava/util/Map;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$loadScreen$1$3$1", f = "FBTProgressReportViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class i extends v13.i implements e23.p<b0, t13.d<? super Map<pu1.c, ? extends Integer>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f148020a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(b bVar, t13.d<? super i> dVar) {
                super(2, dVar);
                this.f148020a = bVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new i(this.f148020a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Map<pu1.c, ? extends Integer>> dVar) {
                return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                ArrayList arrayList;
                List listB1;
                List listN0;
                yw1.g gVar;
                Map<String, yw1.e> map;
                Object next;
                Integer num;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                ou1.i iVar = this.f148020a.f147935b;
                iVar.getClass();
                pu1.c.f141303c.getClass();
                ArrayList arrayListA = pu1.c.a.a();
                List<yw1.g> list = iVar.f134062e;
                if (list == null || (gVar = (yw1.g) h0.d0(list)) == null || (map = gVar.f199923c) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(map.size());
                    for (Map.Entry<String, yw1.e> entry : map.entrySet()) {
                        pu1.c.a aVar2 = pu1.c.f141303c;
                        String key = entry.getKey();
                        aVar2.getClass();
                        key.getClass();
                        Iterator<T> it = pu1.c.f141313m.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!s.g(((pu1.c) next).f141314a, key));
                        pu1.c cVar = (pu1.c) next;
                        yw1.f fVar = entry.getValue().f199908f;
                        arrayList.add(new o13.p(cVar, Integer.valueOf((fVar == null || (num = fVar.f199915b) == null) ? 0 : num.intValue())));
                    }
                }
                if (arrayList == null || (listB1 = h0.b1(h0.Z(arrayList))) == null || (listN0 = h0.N0(listB1, new ou1.r(new ou1.q(), arrayListA))) == null) {
                    return null;
                }
                return p13.u0.l(listN0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lvv1/d;", "<anonymous>", "(Lo53/b0;)Lvv1/d;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$loadScreen$1$3$2", f = "FBTProgressReportViewModel.kt", l = {220}, m = "invokeSuspend", v = 2)
        public static final class j extends v13.i implements e23.p<b0, t13.d<? super vv1.d>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f148021a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f148022b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f148023c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(b bVar, t13.d<? super j> dVar) {
                super(2, dVar);
                this.f148023c = bVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                j jVar = new j(this.f148023c, dVar);
                jVar.f148022b = obj;
                return jVar;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super vv1.d> dVar) {
                return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                b0 b0Var = (b0) this.f148022b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f148021a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
                    tv1.c cVar = this.f148023c.f147934a;
                    this.f148022b = b0Var;
                    this.f148021a = 1;
                    cVar.getClass();
                    obj = f0.J(cVar, new tv1.a(cVar, userDisplayName, null), this);
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
                    T t7 = ((v2.b) v2Var).f47386a;
                    if (s.g(t7, Unit.INSTANCE)) {
                        return null;
                    }
                    return (vv1.d) t7;
                }
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error occurred while getting Race prediction latest data ");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "FBTProgressReportViewModel", strD);
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lyw1/m;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$loadScreen$1$3$4", f = "FBTProgressReportViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class k extends v13.i implements e23.p<b0, t13.d<? super List<? extends yw1.m>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f148024a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ double f148025b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f148026c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(b bVar, double d14, boolean z14, t13.d<? super k> dVar) {
                super(2, dVar);
                this.f148024a = bVar;
                this.f148025b = d14;
                this.f148026c = z14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new k(this.f148024a, this.f148025b, this.f148026c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super List<? extends yw1.m>> dVar) {
                return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                yw1.g gVar;
                Double dValueOf;
                Double dValueOf2;
                Double dValueOf3;
                Double dValueOf4;
                Map<String, yw1.e> map;
                Map<String, yw1.e> map2;
                Map<String, yw1.e> map3;
                Map<String, yw1.e> map4;
                Map<String, yw1.e> map5;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                List<yw1.g> list = this.f148024a.f147935b.f134062e;
                Long lValueOf = null;
                if (list == null || !((gVar = (yw1.g) h0.d0(list)) == null || (map5 = gVar.f199923c) == null || !map5.isEmpty())) {
                    return null;
                }
                yw1.g gVar2 = (yw1.g) h0.d0(list);
                if (gVar2 == null || (map4 = gVar2.f199923c) == null) {
                    dValueOf = null;
                } else {
                    ArrayList arrayList = new ArrayList(map4.size());
                    Iterator<Map.Entry<String, yw1.e>> it = map4.entrySet().iterator();
                    while (it.hasNext()) {
                        yw1.f fVar = it.next().getValue().f199905c;
                        arrayList.add(fVar != null ? fVar.f199918e : null);
                    }
                    dValueOf = Double.valueOf(h0.P0(h0.Z(arrayList)));
                }
                yw1.g gVar3 = (yw1.g) h0.d0(list);
                if (gVar3 == null || (map3 = gVar3.f199923c) == null) {
                    dValueOf2 = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(map3.size());
                    Iterator<Map.Entry<String, yw1.e>> it3 = map3.entrySet().iterator();
                    while (it3.hasNext()) {
                        yw1.f fVar2 = it3.next().getValue().f199908f;
                        arrayList2.add(fVar2 != null ? fVar2.f199918e : null);
                    }
                    dValueOf2 = Double.valueOf(h0.P0(h0.Z(arrayList2)));
                }
                yw1.g gVar4 = (yw1.g) h0.d0(list);
                if (gVar4 == null || (map2 = gVar4.f199923c) == null) {
                    dValueOf3 = null;
                } else {
                    ArrayList arrayList3 = new ArrayList(map2.size());
                    Iterator<Map.Entry<String, yw1.e>> it4 = map2.entrySet().iterator();
                    while (it4.hasNext()) {
                        yw1.f fVar3 = it4.next().getValue().f199910h;
                        arrayList3.add(fVar3 != null ? fVar3.f199918e : null);
                    }
                    dValueOf3 = Double.valueOf(h0.P0(h0.Z(arrayList3)));
                }
                yw1.g gVar5 = (yw1.g) h0.d0(list);
                if (gVar5 == null || (map = gVar5.f199923c) == null) {
                    dValueOf4 = null;
                } else {
                    ArrayList arrayList4 = new ArrayList(map.size());
                    Iterator<Map.Entry<String, yw1.e>> it5 = map.entrySet().iterator();
                    while (it5.hasNext()) {
                        yw1.f fVar4 = it5.next().getValue().f199909g;
                        arrayList4.add(fVar4 != null ? fVar4.f199918e : null);
                    }
                    dValueOf4 = Double.valueOf(h0.P0(h0.Z(arrayList4)));
                }
                if (dValueOf3 != null && dValueOf4 != null) {
                    dValueOf4 = Double.valueOf((dValueOf3.doubleValue() * ((double) 2)) + dValueOf4.doubleValue());
                } else if (dValueOf3 != null) {
                    dValueOf4 = Double.valueOf(dValueOf3.doubleValue() * ((double) 2));
                }
                boolean zC = s.c(dValueOf, 0.0d);
                double d14 = this.f148025b;
                yw1.n nVar = new yw1.n((zC || dValueOf == null) ? null : u0.h(d14, dValueOf), (s.c(dValueOf2, 0.0d) || dValueOf2 == null) ? null : fy1.b.c(dValueOf2.doubleValue() / d14), (s.c(dValueOf4, 0.0d) || dValueOf4 == null) ? null : Long.valueOf(MathKt.d(dValueOf4.doubleValue() / d14)));
                if (s.c(dValueOf, 0.0d)) {
                    dValueOf = null;
                }
                String strC = (s.c(dValueOf2, 0.0d) || dValueOf2 == null) ? null : fy1.b.c(dValueOf2.doubleValue());
                if (!s.c(dValueOf4, 0.0d) && dValueOf4 != null) {
                    lValueOf = Long.valueOf(MathKt.d(dValueOf4.doubleValue()));
                }
                yw1.o oVar = new yw1.o(dValueOf, strC, lValueOf);
                return this.f148026c ? p13.x.k(oVar, nVar) : p13.x.k(nVar, oVar);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lyw1/b;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$loadScreen$1$3$5", f = "FBTProgressReportViewModel.kt", l = {249}, m = "invokeSuspend", v = 2)
        public static final class l extends v13.i implements e23.p<b0, t13.d<? super List<? extends yw1.b>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f148027a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f148028b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LocalDate f148029c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LocalDate f148030d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f148031e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ double f148032f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ boolean f148033g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(b bVar, LocalDate localDate, LocalDate localDate2, boolean z14, double d14, boolean z15, t13.d<? super l> dVar) {
                super(2, dVar);
                this.f148028b = bVar;
                this.f148029c = localDate;
                this.f148030d = localDate2;
                this.f148031e = z14;
                this.f148032f = d14;
                this.f148033g = z15;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new l(this.f148028b, this.f148029c, this.f148030d, this.f148031e, this.f148032f, this.f148033g, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super List<? extends yw1.b>> dVar) {
                return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f148027a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                ou1.i iVar = this.f148028b.f147935b;
                LocalDate localDate = this.f148030d;
                localDate.getClass();
                String str = x0.f4308n.f4358a;
                this.f148027a = 1;
                Object objB = iVar.b(this.f148029c, localDate, str, this.f148031e, this.f148032f, this.f148033g, this);
                return objB == aVar ? aVar : objB;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lyw1/b;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$loadScreen$1$3$6", f = "FBTProgressReportViewModel.kt", l = {253}, m = "invokeSuspend", v = 2)
        public static final class m extends v13.i implements e23.p<b0, t13.d<? super List<? extends yw1.b>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f148034a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f148035b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LocalDate f148036c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LocalDate f148037d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f148038e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ double f148039f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ boolean f148040g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(b bVar, LocalDate localDate, LocalDate localDate2, boolean z14, double d14, boolean z15, t13.d<? super m> dVar) {
                super(2, dVar);
                this.f148035b = bVar;
                this.f148036c = localDate;
                this.f148037d = localDate2;
                this.f148038e = z14;
                this.f148039f = d14;
                this.f148040g = z15;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new m(this.f148035b, this.f148036c, this.f148037d, this.f148038e, this.f148039f, this.f148040g, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super List<? extends yw1.b>> dVar) {
                return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f148034a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                ou1.i iVar = this.f148035b.f147935b;
                LocalDate localDate = this.f148037d;
                localDate.getClass();
                String str = x0.f4312o.f4358a;
                this.f148034a = 1;
                Object objB = iVar.b(this.f148036c, localDate, str, this.f148038e, this.f148039f, this.f148040g, this);
                return objB == aVar ? aVar : objB;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lyw1/b;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$loadScreen$1$3$7", f = "FBTProgressReportViewModel.kt", l = {256}, m = "invokeSuspend", v = 2)
        public static final class n extends v13.i implements e23.p<b0, t13.d<? super List<? extends yw1.b>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f148041a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f148042b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LocalDate f148043c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LocalDate f148044d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f148045e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ double f148046f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ boolean f148047g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(b bVar, LocalDate localDate, LocalDate localDate2, boolean z14, double d14, boolean z15, t13.d<? super n> dVar) {
                super(2, dVar);
                this.f148042b = bVar;
                this.f148043c = localDate;
                this.f148044d = localDate2;
                this.f148045e = z14;
                this.f148046f = d14;
                this.f148047g = z15;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new n(this.f148042b, this.f148043c, this.f148044d, this.f148045e, this.f148046f, this.f148047g, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super List<? extends yw1.b>> dVar) {
                return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f148041a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                ou1.i iVar = this.f148042b.f147935b;
                LocalDate localDate = this.f148044d;
                localDate.getClass();
                String str = x0.f4324r.f4358a;
                this.f148041a = 1;
                Object objB = iVar.b(this.f148043c, localDate, str, this.f148045e, this.f148046f, this.f148047g, this);
                return objB == aVar ? aVar : objB;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lyw1/b;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$loadScreen$1$3$8", f = "FBTProgressReportViewModel.kt", l = {261}, m = "invokeSuspend", v = 2)
        public static final class o extends v13.i implements e23.p<b0, t13.d<? super List<? extends yw1.b>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f148048a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f148049b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LocalDate f148050c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LocalDate f148051d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f148052e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ double f148053f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ boolean f148054g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o(b bVar, LocalDate localDate, LocalDate localDate2, boolean z14, double d14, boolean z15, t13.d<? super o> dVar) {
                super(2, dVar);
                this.f148049b = bVar;
                this.f148050c = localDate;
                this.f148051d = localDate2;
                this.f148052e = z14;
                this.f148053f = d14;
                this.f148054g = z15;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new o(this.f148049b, this.f148050c, this.f148051d, this.f148052e, this.f148053f, this.f148054g, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super List<? extends yw1.b>> dVar) {
                return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f148048a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                ou1.i iVar = this.f148049b.f147935b;
                LocalDate localDate = this.f148051d;
                localDate.getClass();
                String str = x0.f4308n.f4358a;
                this.f148048a = 1;
                Object objB = iVar.b(this.f148050c, localDate, str, this.f148052e, this.f148053f, this.f148054g, this);
                return objB == aVar ? aVar : objB;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lyw1/b;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$loadScreen$1$3$9", f = "FBTProgressReportViewModel.kt", l = {265}, m = "invokeSuspend", v = 2)
        public static final class p extends v13.i implements e23.p<b0, t13.d<? super List<? extends yw1.b>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f148055a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f148056b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LocalDate f148057c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LocalDate f148058d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f148059e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ double f148060f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ boolean f148061g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public p(b bVar, LocalDate localDate, LocalDate localDate2, boolean z14, double d14, boolean z15, t13.d<? super p> dVar) {
                super(2, dVar);
                this.f148056b = bVar;
                this.f148057c = localDate;
                this.f148058d = localDate2;
                this.f148059e = z14;
                this.f148060f = d14;
                this.f148061g = z15;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new p(this.f148056b, this.f148057c, this.f148058d, this.f148059e, this.f148060f, this.f148061g, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super List<? extends yw1.b>> dVar) {
                return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f148055a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                ou1.i iVar = this.f148056b.f147935b;
                LocalDate localDate = this.f148058d;
                localDate.getClass();
                String str = x0.f4312o.f4358a;
                this.f148055a = 1;
                Object objB = iVar.b(this.f148057c, localDate, str, this.f148059e, this.f148060f, this.f148061g, this);
                return objB == aVar ? aVar : objB;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusReportDTO;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusReportDTO;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$loadScreen$1$3$trainingLoadDTO$1", f = "FBTProgressReportViewModel.kt", l = {211}, m = "invokeSuspend", v = 2)
        public static final class q extends v13.i implements e23.p<b0, t13.d<? super TrainingStatusReportDTO>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f148062a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f148063b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LocalDate f148064c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LocalDate f148065d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public q(b bVar, LocalDate localDate, LocalDate localDate2, t13.d<? super q> dVar) {
                super(2, dVar);
                this.f148063b = bVar;
                this.f148064c = localDate;
                this.f148065d = localDate2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new q(this.f148063b, this.f148064c, this.f148065d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super TrainingStatusReportDTO> dVar) {
                return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f148062a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
                LocalDate localDate = this.f148064c;
                localDate.getClass();
                LocalDate localDate2 = this.f148065d;
                localDate2.getClass();
                this.f148062a = 1;
                Object objF4 = b.F4(this.f148063b, userDisplayName, localDate, localDate2, this);
                return objF4 == aVar ? aVar : objF4;
            }
        }

        public static final /* synthetic */ class r {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f148066a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f148067b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ int[] f148068c;

            static {
                int[] iArr = new int[uv1.b.values().length];
                try {
                    iArr[uv1.b.IN_PROGRESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[uv1.b.COMPLETED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f148066a = iArr;
                int[] iArr2 = new int[vt1.o.values().length];
                try {
                    iArr2[vt1.o.f180178i.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[vt1.o.f180175f.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[vt1.o.f180176g.ordinal()] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[vt1.o.f180179j.ordinal()] = 4;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[vt1.o.f180180k.ordinal()] = 5;
                } catch (NoSuchFieldError unused7) {
                }
                f148067b = iArr2;
                int[] iArr3 = new int[uv1.d.values().length];
                try {
                    iArr3[uv1.d.f172952p.ordinal()] = 1;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr3[uv1.d.f172944h.ordinal()] = 2;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr3[uv1.d.f172941e.ordinal()] = 3;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr3[uv1.d.f172948l.ordinal()] = 4;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr3[uv1.d.f172951o.ordinal()] = 5;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr3[uv1.d.f172949m.ordinal()] = 6;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr3[uv1.d.f172945i.ordinal()] = 7;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr3[uv1.d.f172946j.ordinal()] = 8;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr3[uv1.d.f172950n.ordinal()] = 9;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr3[uv1.d.f172953q.ordinal()] = 10;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr3[uv1.d.f172954r.ordinal()] = 11;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr3[uv1.d.f172942f.ordinal()] = 12;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr3[uv1.d.f172943g.ordinal()] = 13;
                } catch (NoSuchFieldError unused20) {
                }
                f148068c = iArr3;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(vt1.o oVar, uv1.c cVar, uv1.b bVar, long j8, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, pi0.e eVar, String str, boolean z14, List<tw1.a> list, t13.d<? super d> dVar) {
            super(2, dVar);
            this.J0 = oVar;
            this.K0 = cVar;
            this.L0 = bVar;
            this.M0 = j8;
            this.N0 = localDate;
            this.O0 = localDate2;
            this.P0 = localDate3;
            this.Q0 = eVar;
            this.R0 = str;
            this.S0 = z14;
            this.T0 = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = b.this.new d(this.J0, this.K0, this.L0, this.M0, this.N0, this.O0, this.P0, this.Q0, this.R0, this.S0, this.T0, dVar);
            dVar2.H0 = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:228:0x2b20  */
        /* JADX WARN: Code duplicated, block: B:231:0x2bf0  */
        /* JADX WARN: Code duplicated, block: B:264:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:0x16c7  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v108, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v54, types: [T, vv1.e] */
        /* JADX WARN: Type inference failed for: r0v65, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v128, types: [T, java.util.List] */
        /* JADX WARN: Type inference failed for: r13v102, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r1v700, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v146, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v156, types: [T, java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r5v125, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x18ed -> B:109:0x1924). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r206) {
            /*
                Method dump skipped, instruction units count: 11732
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qv1.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    public b(tv1.c cVar, ou1.i iVar, kv1.b bVar, y yVar, uw1.b bVar2, gu1.b bVar3, d60.b bVar4, zf0.d dVar) {
        cVar.getClass();
        iVar.getClass();
        bVar.getClass();
        yVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        bVar4.getClass();
        dVar.getClass();
        this.f147934a = cVar;
        this.f147935b = iVar;
        this.f147936c = bVar;
        this.f147937d = yVar;
        this.f147938e = bVar2;
        this.f147939f = bVar3;
        this.f147940g = bVar4;
        this.f147941h = dVar;
        p2 p2VarA = q2.a(null);
        this.f147942i = p2VarA;
        this.f147943j = r53.s.d(p2VarA);
        p2 p2VarA2 = q2.a(null);
        this.f147944k = p2VarA2;
        this.f147945l = r53.s.d(p2VarA2);
        p2 p2VarA3 = q2.a(Boolean.TRUE);
        this.f147946m = p2VarA3;
        this.f147947n = r53.s.d(p2VarA3);
        this.f147949p = j0.f134944a;
        this.f147950q = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object A4(b bVar, LocalDate localDate, LocalDate localDate2, List list, v13.c cVar) {
        f fVar;
        bVar.getClass();
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f148135d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f148135d = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar, cVar);
            }
        } else {
            fVar = new f(bVar, cVar);
        }
        Object objD = fVar.f148133b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f148135d;
        if (i15 == 0) {
            r.b(objD);
            rt1.m mVar = (rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null);
            fz0.c cVarC = fz0.d.c(localDate);
            fz0.c cVarC2 = fz0.d.c(localDate2);
            j61.h hVar = j61.h.DAILY;
            fVar.f148132a = list;
            fVar.f148135d = 1;
            objD = mVar.D(cVarC, cVarC2, fVar);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = fVar.f148132a;
            r.b(objD);
        }
        v2 v2Var = (v2) objD;
        if (v2Var instanceof v2.b) {
            return i61.a.a((j61.j) ((v2.b) v2Var).f47386a, list, j61.h.WEEKLY);
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "FBTProgressReportViewModel", "Error getting data for cycling ability");
        return null;
    }

    public static final Object B4(b bVar, uv1.c cVar, long j8, d dVar) {
        bVar.getClass();
        Object objE = c0.e(new g(bVar, j8, cVar, null), dVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }

    public static final vv1.b E4(b bVar, o oVar, uv1.c cVar, uv1.b bVar2) {
        List listK;
        bVar.getClass();
        int i14 = oVar == null ? -1 : C2785b.f147956a[oVar.ordinal()];
        if (i14 == 1) {
            uv1.d.f172939c.getClass();
            cVar.getClass();
            bVar2.getClass();
            int i15 = uv1.d.a.C3234a.f172959b[cVar.ordinal()];
            if (i15 == 1) {
                int i16 = uv1.d.a.C3234a.f172958a[bVar2.ordinal()];
                if (i16 == 1) {
                    listK = p13.x.k(uv1.d.f172945i, uv1.d.f172950n, uv1.d.f172954r);
                } else {
                    if (i16 != 2) {
                        u0.r();
                        return null;
                    }
                    listK = p13.x.k(uv1.d.f172940d, uv1.d.f172945i, uv1.d.f172950n, uv1.d.f172944h);
                }
            } else {
                if (i15 != 2) {
                    u0.r();
                    return null;
                }
                int i17 = uv1.d.a.C3234a.f172958a[bVar2.ordinal()];
                if (i17 == 1) {
                    listK = p13.x.k(uv1.d.f172941e, uv1.d.f172945i, uv1.d.f172950n, uv1.d.f172954r);
                } else {
                    if (i17 != 2) {
                        u0.r();
                        return null;
                    }
                    listK = p13.x.k(uv1.d.f172941e, uv1.d.f172945i, uv1.d.f172950n, uv1.d.f172944h);
                }
            }
        } else if (i14 == 2) {
            uv1.d.f172939c.getClass();
            cVar.getClass();
            bVar2.getClass();
            int i18 = uv1.d.a.C3234a.f172959b[cVar.ordinal()];
            if (i18 == 1) {
                int i19 = uv1.d.a.C3234a.f172958a[bVar2.ordinal()];
                if (i19 == 1) {
                    listK = p13.x.k(uv1.d.f172943g, uv1.d.f172946j, uv1.d.f172950n, uv1.d.f172954r);
                } else {
                    if (i19 != 2) {
                        u0.r();
                        return null;
                    }
                    listK = p13.x.k(uv1.d.f172942f, uv1.d.f172946j, uv1.d.f172950n, uv1.d.f172944h);
                }
            } else {
                if (i18 != 2) {
                    u0.r();
                    return null;
                }
                int i24 = uv1.d.a.C3234a.f172958a[bVar2.ordinal()];
                if (i24 == 1) {
                    listK = p13.x.k(uv1.d.f172942f, uv1.d.f172946j, uv1.d.f172950n, uv1.d.f172954r);
                } else {
                    if (i24 != 2) {
                        u0.r();
                        return null;
                    }
                    listK = p13.x.k(uv1.d.f172942f, uv1.d.f172946j, uv1.d.f172950n, uv1.d.f172944h);
                }
            }
        } else if (i14 == 3) {
            uv1.d.f172939c.getClass();
            cVar.getClass();
            bVar2.getClass();
            int i25 = uv1.d.a.C3234a.f172959b[cVar.ordinal()];
            if (i25 == 1) {
                int i26 = uv1.d.a.C3234a.f172958a[bVar2.ordinal()];
                if (i26 == 1) {
                    listK = p13.x.k(uv1.d.f172949m, uv1.d.f172950n, uv1.d.f172954r);
                } else {
                    if (i26 != 2) {
                        u0.r();
                        return null;
                    }
                    listK = p13.x.k(uv1.d.f172949m, uv1.d.f172950n, uv1.d.f172944h);
                }
            } else {
                if (i25 != 2) {
                    u0.r();
                    return null;
                }
                int i27 = uv1.d.a.C3234a.f172958a[bVar2.ordinal()];
                if (i27 == 1) {
                    listK = p13.x.k(uv1.d.f172949m, uv1.d.f172950n, uv1.d.f172954r);
                } else {
                    if (i27 != 2) {
                        u0.r();
                        return null;
                    }
                    listK = p13.x.k(uv1.d.f172949m, uv1.d.f172950n, uv1.d.f172944h);
                }
            }
        } else if (i14 == 4) {
            uv1.d.f172939c.getClass();
            bVar2.getClass();
            int i28 = uv1.d.a.C3234a.f172958a[bVar2.ordinal()];
            if (i28 == 1) {
                listK = p13.x.k(uv1.d.f172952p, uv1.d.f172951o, uv1.d.f172950n, uv1.d.f172954r);
            } else {
                if (i28 != 2) {
                    u0.r();
                    return null;
                }
                listK = p13.x.k(uv1.d.f172952p, uv1.d.f172951o, uv1.d.f172950n, uv1.d.f172944h);
            }
        } else if (i14 != 5) {
            listK = null;
        } else {
            uv1.d.f172939c.getClass();
            bVar2.getClass();
            int i29 = uv1.d.a.C3234a.f172958a[bVar2.ordinal()];
            if (i29 == 1) {
                listK = p13.x.k(uv1.d.f172953q, uv1.d.f172948l, uv1.d.f172954r);
            } else {
                if (i29 != 2) {
                    u0.r();
                    return null;
                }
                listK = p13.x.k(uv1.d.f172953q, uv1.d.f172948l);
            }
        }
        return new vv1.b(listK, null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object F4(b bVar, String str, LocalDate localDate, LocalDate localDate2, v13.c cVar) {
        j jVar;
        bVar.getClass();
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f148164c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f148164c = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(bVar, cVar);
            }
        } else {
            jVar = new j(bVar, cVar);
        }
        Object objJ = jVar.f148162a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f148164c;
        if (i15 == 0) {
            r.b(objJ);
            tv1.c cVar2 = bVar.f147934a;
            String string = localDate.toString();
            string.getClass();
            String string2 = localDate2.toString();
            string2.getClass();
            jVar.f148164c = 1;
            cVar2.getClass();
            objJ = f0.J(cVar2, new tv1.b(cVar2, str, string, string2, null), jVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            return (TrainingStatusReportDTO) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error occurred while fetching FitnessCoach activities info ");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "FBTProgressReportViewModel", strD);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G4(b bVar, v13.c cVar) {
        k kVar;
        bVar.getClass();
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f148167c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f148167c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(bVar, cVar);
            }
        } else {
            kVar = new k(bVar, cVar);
        }
        Object objA = kVar.f148165a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f148167c;
        boolean z14 = true;
        if (i15 == 0) {
            r.b(objA);
            gu1.b bVar2 = bVar.f147939f;
            kVar.f148167c = 1;
            objA = bVar2.a(kVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            if (((v2.b) v2Var).f47387b == 204) {
                z14 = false;
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error retrieving list of active ATP plans. Error=");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "FBTProgressReportViewModel", strD);
        }
        return Boolean.valueOf(z14);
    }

    public static final Object x4(b bVar, o oVar, LocalDate localDate, LocalDate localDate2, List list, boolean z14, d dVar) {
        bVar.getClass();
        return c0.e(new qv1.c(list, bVar, z14, oVar, localDate, localDate2, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object y4(b bVar, long j8, v13.c cVar) {
        qv1.d dVar;
        fg0.k kVar;
        bVar.getClass();
        if (cVar instanceof qv1.d) {
            dVar = (qv1.d) cVar;
            int i14 = dVar.f148128c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f148128c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new qv1.d(bVar, cVar);
            }
        } else {
            dVar = new qv1.d(bVar, cVar);
        }
        Object objK4 = dVar.f148126a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f148128c;
        if (i15 == 0) {
            r.b(objK4);
            fg0.k kVar2 = bVar.f147955x;
            if (kVar2 != null) {
                return kVar2.getCourseDemandsDTO();
            }
            dVar.f148128c = 1;
            objK4 = bVar.K4(j8, dVar);
            if (objK4 == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objK4);
        }
        List list = (List) objK4;
        if (list == null || (kVar = (fg0.k) h0.d0(list)) == null) {
            return null;
        }
        return kVar.getCourseDemandsDTO();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object z4(b bVar, v13.c cVar) {
        e eVar;
        bVar.getClass();
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f148131c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f148131c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(bVar, cVar);
            }
        } else {
            eVar = new e(bVar, cVar);
        }
        Object objH = eVar.f148129a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f148131c;
        if (i15 == 0) {
            r.b(objH);
            d60.b bVar2 = bVar.f147940g;
            eVar.f148131c = 1;
            bVar2.getClass();
            objH = ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).h(eVar);
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objH);
        }
        v2 v2Var = (v2) objH;
        if (v2Var instanceof v2.b) {
            return (j61.i) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "FBTProgressReportViewModel", "Error getting data for cycling ability chart");
        return null;
    }

    public final void I4(LocalDate localDate) {
        ww1.l lVar;
        Object next;
        t trainingVersion;
        String versionName;
        n trainingPlanType;
        localDate.getClass();
        this.f147954w = localDate;
        m mVar = this.f147952t;
        o oVarB = (mVar == null || (trainingPlanType = mVar.getTrainingPlanType()) == null) ? null : trainingPlanType.b();
        int i14 = oVarB == null ? -1 : C2785b.f147956a[oVarB.ordinal()];
        if (i14 == 1) {
            lVar = ww1.l.RUNNING_OPEN_LOOP;
        } else if (i14 == 2) {
            lVar = ww1.l.CYCLING_OPEN_LOOP;
        } else if (i14 == 3) {
            lVar = ww1.l.TRIATHLON_OPEN_LOOP;
        } else if (i14 != 4) {
            lVar = i14 != 5 ? null : ww1.l.FROG_OPEN_LOOP;
        } else {
            lVar = ww1.l.FITNESS_OPEN_LOOP;
        }
        String str = oVarB == o.f180179j ? fx1.d.HEART_RATE.f73839b : fx1.d.GENERIC.f73839b;
        Iterator<T> it = this.f147949p.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            m mVar2 = (m) next;
            d0 trainingPlanSubType = mVar2.getTrainingPlanSubType();
            if (trainingPlanSubType != null && trainingPlanSubType.b(lVar) && (trainingVersion = mVar2.getTrainingVersion()) != null && (versionName = trainingVersion.getVersionName()) != null && versionName.equalsIgnoreCase(str)) {
                break;
            }
        }
        m mVar3 = (m) next;
        Integer numValueOf = mVar3 != null ? Integer.valueOf((int) mVar3.getTrainingPlanId()) : null;
        if (numValueOf == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "FBTProgressReportViewModel", "Unable to determine trainingPlanId for subType=" + lVar);
        }
        m mVar4 = this.f147952t;
        List<jv1.b> list = this.f147948o;
        e0 e0Var = this.f147953v;
        if (mVar4 == null || list == null || e0Var == null || numValueOf == null) {
            return;
        }
        ge1.b.T(v1.a(this), null, null, new c(mVar4, localDate, e0Var, numValueOf.intValue(), list, null), 3);
    }

    /* JADX INFO: renamed from: J4, reason: from getter */
    public final fg0.k getF147955x() {
        return this.f147955x;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K4(long j8, v13.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f148155c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f148155c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objC = hVar.f148153a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f148155c;
        if (i15 == 0) {
            r.b(objC);
            hVar.f148155c = 1;
            objC = this.f147941h.c(j8, hVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objC);
        }
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            return (List) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "FBTProgressReportViewModel", "Error getting data for cycling ability");
        return null;
    }

    public final void L4(m mVar, uv1.c cVar, pi0.e eVar) {
        mVar.getClass();
        cVar.getClass();
        eVar.getClass();
        LocalDate localDateNow = LocalDate.now();
        long trainingPlanId = mVar.getTrainingPlanId();
        String trainingPlanName = mVar.getTrainingPlanName();
        DateTime startDate = mVar.getStartDate();
        LocalDate localDate = startDate != null ? startDate.toLocalDate() : null;
        DateTime dateTimeO = mVar.o();
        LocalDate localDate2 = dateTimeO != null ? dateTimeO.toLocalDate() : null;
        n trainingPlanType = mVar.getTrainingPlanType();
        o oVarB = trainingPlanType != null ? trainingPlanType.b() : null;
        uv1.b bVar = mVar.e0() ? uv1.b.COMPLETED : uv1.b.IN_PROGRESS;
        List<tw1.a> listK = mVar.k();
        boolean zI0 = mVar.i0();
        if (trainingPlanName == null || localDate == null || localDate2 == null || oVarB == null) {
            return;
        }
        ge1.b.T(v1.a(this), null, null, new d(oVarB, cVar, bVar, trainingPlanId, localDateNow, localDate2, localDate, eVar, trainingPlanName, zI0, listK, null), 3);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqv1/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "TRAINING_LOAD_RANGE", "I", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
