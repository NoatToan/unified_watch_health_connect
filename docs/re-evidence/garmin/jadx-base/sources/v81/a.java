package v81;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import f32.e;
import f32.l;
import f32.m;
import g22.k;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o13.r;
import o53.b0;
import o53.j0;
import o72.t;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.t0;
import p13.y;
import rd2.f;
import rd2.j;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lv81/a;", "Landroidx/lifecycle/u1;", "Ll81/a;", "repo", "Lr71/a;", "delegate", "<init>", "(Ll81/a;Lr71/a;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l81.a f176222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r71.a f176223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f176224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f176225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f176226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f176227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f176228g;

    /* JADX INFO: renamed from: v81.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"v81/a$a", "Lf32/e;", "Lu81/a;", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3286a implements e<u81.a> {

        /* JADX INFO: renamed from: v81.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.viewmodel.HillScoreViewModel$dailyDetailsDataAdapter$1", f = "HillScoreViewModel.kt", l = {44, 49}, m = "requestDetails", v = 2)
        public static final class C3287a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public j0 f176230a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f176231b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f176233d;

            public C3287a(t13.d<? super C3287a> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f176231b = obj;
                this.f176233d |= Integer.MIN_VALUE;
                return C3286a.this.a(null, this);
            }
        }

        /* JADX INFO: renamed from: v81.a$a$b */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lk81/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.viewmodel.HillScoreViewModel$dailyDetailsDataAdapter$1$requestDetails$deferredLatestHillScore$1", f = "HillScoreViewModel.kt", l = {43}, m = "invokeSuspend", v = 2)
        public static final class b extends i implements p<b0, t13.d<? super v2<? extends k81.a>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f176234a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f176235b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DateTime f176236c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, DateTime dateTime, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f176235b = aVar;
                this.f176236c = dateTime;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f176235b, this.f176236c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends k81.a>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f176234a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                l81.a aVar2 = this.f176235b.f176222a;
                LocalDate localDate = this.f176236c.toLocalDate();
                this.f176234a = 1;
                Object objW = aVar2.w(localDate, this);
                return objW == aVar ? aVar : objW;
            }
        }

        /* JADX INFO: renamed from: v81.a$a$c */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/p;", "", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.viewmodel.HillScoreViewModel$dailyDetailsDataAdapter$1$requestDetails$deferredPrimaryTrainingDevice$1", f = "HillScoreViewModel.kt", l = {41}, m = "invokeSuspend", v = 2)
        public static final class c extends i implements p<b0, t13.d<? super o13.p<? extends Long, ? extends String>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f176237a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f176238b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(a aVar, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f176238b = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f176238b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super o13.p<? extends Long, ? extends String>> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f176237a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                r71.a aVar2 = this.f176238b.f176223b;
                this.f176237a = 1;
                Serializable serializableA = aVar2.a(this);
                return serializableA == aVar ? aVar : serializableA;
            }
        }

        public C3286a() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
        
            if (r11 == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
        
            if (r11 == r1) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f32.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(DateTime dateTime, t13.d<? super u81.a> dVar) {
            C3287a c3287a;
            j0 j0VarJ;
            k81.a aVar;
            if (dVar instanceof C3287a) {
                c3287a = (C3287a) dVar;
                int i14 = c3287a.f176233d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3287a.f176233d = i14 - Integer.MIN_VALUE;
                } else {
                    c3287a = new C3287a(dVar);
                }
            } else {
                c3287a = new C3287a(dVar);
            }
            Object objC = c3287a.f176231b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3287a.f176233d;
            a aVar3 = a.this;
            if (i15 == 0) {
                r.b(objC);
                j0 j0VarJ2 = aVar3.f176224c == null ? ge1.b.j(v1.a(aVar3), null, null, new c(aVar3, null), 3) : null;
                j0VarJ = ge1.b.j(v1.a(aVar3), null, null, new b(aVar3, dateTime, null), 3);
                if (j0VarJ2 != null) {
                    c3287a.f176230a = j0VarJ;
                    c3287a.f176233d = 1;
                    objC = j0VarJ2.C(c3287a);
                } else {
                    c3287a.f176230a = null;
                    c3287a.f176233d = 2;
                    objC = j0VarJ.await(c3287a);
                }
                return aVar2;
            }
            if (i15 == 1) {
                j0VarJ = c3287a.f176230a;
                r.b(objC);
            } else {
                if (i15 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objC);
            }
            v2 v2Var = (v2) objC;
            if (!(v2Var instanceof v2.b) || (aVar = (k81.a) ((v2.b) v2Var).f47386a) == null) {
                return null;
            }
            return t.q(aVar, aVar3.f176224c);
            o13.p pVar = (o13.p) objC;
            if (pVar != null) {
                j jVar = f.a().f152045a;
                long jLongValue = ((Number) pVar.f128594a).longValue();
                jVar.getClass();
                sd2.f fVarI = j.i(jLongValue, null);
                if (fVarI != null && fVarI.O0()) {
                    aVar3.f176224c = (String) pVar.f128595b;
                }
            }
            c3287a.f176230a = null;
            c3287a.f176233d = 2;
            objC = j0VarJ.await(c3287a);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"v81/a$b", "Lf32/p;", "Lu81/b;", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends f32.p<u81.b> {

        /* JADX INFO: renamed from: v81.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.viewmodel.HillScoreViewModel$dailySummaryDataAdapter$1", f = "HillScoreViewModel.kt", l = {65}, m = "requestSafeSummary", v = 2)
        public static final class C3288a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public a f176240a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f176241b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f176243d;

            public C3288a(t13.d<? super C3288a> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f176241b = obj;
                this.f176243d |= Integer.MIN_VALUE;
                return b.this.b(null, null, this);
            }
        }

        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // f32.p
        public final Object b(DateTime dateTime, DateTime dateTime2, t13.d<? super v2<? extends u81.b>> dVar) {
            C3288a c3288a;
            a aVar;
            if (dVar instanceof C3288a) {
                c3288a = (C3288a) dVar;
                int i14 = c3288a.f176243d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3288a.f176243d = i14 - Integer.MIN_VALUE;
                } else {
                    c3288a = new C3288a(dVar);
                }
            } else {
                c3288a = new C3288a(dVar);
            }
            Object objR1 = c3288a.f176241b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3288a.f176243d;
            a aVar3 = a.this;
            if (i15 == 0) {
                r.b(objR1);
                l81.a aVar4 = aVar3.f176222a;
                LocalDate localDate = dateTime.toLocalDate();
                localDate.getClass();
                LocalDate localDate2 = dateTime2.toLocalDate();
                localDate2.getClass();
                m61.a aVar5 = m61.a.DAILY;
                c3288a.f176240a = aVar3;
                c3288a.f176243d = 1;
                objR1 = aVar4.r1(localDate, localDate2, aVar5, c3288a);
                if (objR1 == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = c3288a.f176240a;
                r.b(objR1);
            }
            v2 v2Var = (v2) objR1;
            k81.a aVarQ0 = aVar3.f176222a.getF111499b();
            return a.x4(aVar, v2Var, aVarQ0 != null ? aVarQ0.getHillScoreFeedbackPhraseId() : null);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"v81/a$c", "Lf32/p;", "Lu81/b;", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends f32.p<u81.b> {

        /* JADX INFO: renamed from: v81.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.viewmodel.HillScoreViewModel$monthlySummaryDataAdapter$1", f = "HillScoreViewModel.kt", l = {97}, m = "requestSafeSummary", v = 2)
        public static final class C3289a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public a f176245a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f176246b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f176248d;

            public C3289a(t13.d<? super C3289a> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f176246b = obj;
                this.f176248d |= Integer.MIN_VALUE;
                return c.this.b(null, null, this);
            }
        }

        public c() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // f32.p
        public final Object b(DateTime dateTime, DateTime dateTime2, t13.d<? super v2<? extends u81.b>> dVar) {
            C3289a c3289a;
            a aVar;
            if (dVar instanceof C3289a) {
                c3289a = (C3289a) dVar;
                int i14 = c3289a.f176248d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3289a.f176248d = i14 - Integer.MIN_VALUE;
                } else {
                    c3289a = new C3289a(dVar);
                }
            } else {
                c3289a = new C3289a(dVar);
            }
            Object objR1 = c3289a.f176246b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3289a.f176248d;
            a aVar3 = a.this;
            if (i15 == 0) {
                r.b(objR1);
                l81.a aVar4 = aVar3.f176222a;
                LocalDate localDate = dateTime.toLocalDate();
                localDate.getClass();
                LocalDate localDate2 = dateTime2.toLocalDate();
                localDate2.getClass();
                LocalDate localDateT = jg.b.t(localDate2);
                m61.a aVar5 = m61.a.MONTHLY;
                c3289a.f176245a = aVar3;
                c3289a.f176248d = 1;
                objR1 = aVar4.r1(localDate, localDateT, aVar5, c3289a);
                if (objR1 == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = c3289a.f176245a;
                r.b(objR1);
            }
            v2 v2Var = (v2) objR1;
            k81.a aVarQ0 = aVar3.f176222a.getF111499b();
            return a.x4(aVar, v2Var, aVarQ0 != null ? aVarQ0.getHillScoreFeedbackPhraseId() : null);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"v81/a$d", "Lf32/p;", "Lu81/b;", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends f32.p<u81.b> {

        /* JADX INFO: renamed from: v81.a$d$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.viewmodel.HillScoreViewModel$weeklySummaryDataAdapter$1", f = "HillScoreViewModel.kt", l = {81}, m = "requestSafeSummary", v = 2)
        public static final class C3290a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public a f176250a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f176251b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f176253d;

            public C3290a(t13.d<? super C3290a> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f176251b = obj;
                this.f176253d |= Integer.MIN_VALUE;
                return d.this.b(null, null, this);
            }
        }

        public d() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // f32.p
        public final Object b(DateTime dateTime, DateTime dateTime2, t13.d<? super v2<? extends u81.b>> dVar) {
            C3290a c3290a;
            a aVar;
            if (dVar instanceof C3290a) {
                c3290a = (C3290a) dVar;
                int i14 = c3290a.f176253d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3290a.f176253d = i14 - Integer.MIN_VALUE;
                } else {
                    c3290a = new C3290a(dVar);
                }
            } else {
                c3290a = new C3290a(dVar);
            }
            Object objR1 = c3290a.f176251b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3290a.f176253d;
            a aVar3 = a.this;
            if (i15 == 0) {
                r.b(objR1);
                l81.a aVar4 = aVar3.f176222a;
                LocalDate localDate = dateTime.toLocalDate();
                localDate.getClass();
                LocalDate localDate2 = dateTime2.toLocalDate();
                localDate2.getClass();
                m61.a aVar5 = m61.a.WEEKLY;
                c3290a.f176250a = aVar3;
                c3290a.f176253d = 1;
                objR1 = aVar4.r1(localDate, localDate2, aVar5, c3290a);
                if (objR1 == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = c3290a.f176250a;
                r.b(objR1);
            }
            v2 v2Var = (v2) objR1;
            k81.a aVarQ0 = aVar3.f176222a.getF111499b();
            return a.x4(aVar, v2Var, aVarQ0 != null ? aVarQ0.getHillScoreFeedbackPhraseId() : null);
        }
    }

    public a(l81.a aVar, r71.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        this.f176222a = aVar;
        this.f176223b = aVar2;
        this.f176225d = new l(new f32.a(v1.a(this), new C3286a(), null, 4, null));
        this.f176226e = new m(new f32.j(v1.a(this), new b(), null, 4, null));
        this.f176227f = new m(new f32.j(v1.a(this), new d(), null, 4, null));
        this.f176228g = new m(new f32.j(v1.a(this), new c(), null, 4, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final v2 x4(a aVar, v2 v2Var, Integer num) {
        Exception exc;
        List listG0;
        aVar.getClass();
        LinkedHashMap linkedHashMap = null;
        if (!(v2Var instanceof v2.b)) {
            v2.a aVar2 = v2Var instanceof v2.a ? (v2.a) v2Var : null;
            if (aVar2 == null || (exc = aVar2.f47383a) == null) {
                exc = new Exception();
            }
            return new v2.a(exc, aVar2 != null ? aVar2.f47384b : null, aVar2 != null ? aVar2.f47385c : null);
        }
        v2.b bVar = (v2.b) v2Var;
        k81.b bVar2 = (k81.b) bVar.f47386a;
        bVar2.getClass();
        String startDate = bVar2.getStartDate();
        LocalDate localDateV = startDate != null ? k.v(startDate, "yyyy-MM-dd") : null;
        String endDate = bVar2.getEndDate();
        LocalDate localDateV2 = endDate != null ? k.v(endDate, "yyyy-MM-dd") : null;
        LocalDate localDateNow = (localDateV2 == null || !localDateV2.isAfter(LocalDate.now())) ? localDateV2 : LocalDate.now();
        ArrayList arrayList = new ArrayList();
        if (localDateV != null) {
            if (localDateNow == null) {
                localDateNow = LocalDate.now();
            }
            localDateNow.getClass();
            List listQ = jg.b.q(localDateV, localDateNow);
            if (listQ != null && (listG0 = h0.G0(listQ)) != null) {
                ArrayList arrayList2 = new ArrayList(y.r(listG0, 10));
                Iterator it = listG0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new u81.a(null, null, (LocalDate) it.next(), null, null, null, null, null, null, null, null, null, 4091, null));
                }
                arrayList.addAll(arrayList2);
            }
        }
        List<k81.a> listD = bVar2.d();
        if (listD != null) {
            ArrayList<u81.a> arrayList3 = new ArrayList(y.r(listD, 10));
            Iterator<T> it3 = listD.iterator();
            while (it3.hasNext()) {
                arrayList3.add(t.q((k81.a) it3.next(), null));
            }
            for (u81.a aVar3 : arrayList3) {
                Iterator it4 = arrayList.iterator();
                int i14 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i14 = -1;
                        break;
                    }
                    if (k.g(((u81.a) it4.next()).f169461c, aVar3.f169461c)) {
                        break;
                    }
                    i14++;
                }
                if (i14 != -1) {
                    arrayList.set(i14, aVar3);
                }
            }
        }
        Long userProfilePk = bVar2.getUserProfilePk();
        Map<String, Integer> mapG = bVar2.g();
        if (mapG != null) {
            linkedHashMap = new LinkedHashMap(t0.a(mapG.size()));
            Iterator<T> it5 = mapG.entrySet().iterator();
            while (it5.hasNext()) {
                Map.Entry entry = (Map.Entry) it5.next();
                linkedHashMap.put(k.v((String) entry.getKey(), "yyyy-MM-dd"), entry.getValue());
            }
        }
        return new v2.b(new u81.b(userProfilePk, localDateV, localDateV2, linkedHashMap, bVar2.getMaxScore(), arrayList, num), bVar.f47387b, bVar.f47388c, null, 8, null);
    }
}
