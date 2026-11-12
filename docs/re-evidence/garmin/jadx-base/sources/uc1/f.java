package uc1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b63.o;
import b63.q;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import fg0.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import o13.r;
import o53.b0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p3.c2;
import p3.p0;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Luc1/f;", "Landroidx/lifecycle/u1;", "Lqc1/a;", "raceTimePredictionRepository", "<init>", "(Lqc1/a;)V", "a", "gcm-race-time-prediction_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qc1.a f169983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f169984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f169985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f169986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c2 f169987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c2 f169988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2 f169989g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.race_time_prediction.presentation.RaceTimePredictionViewModel$fetchRaceTimePredictionMetrics$1", f = "RaceTimePredictionViewModel.kt", l = {54}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f169990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f169991b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f169993d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o f169994e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ o f169995f;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                return r13.a.b(((tc1.b) t14).getCalendarDate(), ((tc1.b) t7).getCalendarDate());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, o oVar, o oVar2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f169993d = kVar;
            this.f169994e = oVar;
            this.f169995f = oVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = f.this.new b(this.f169993d, this.f169994e, this.f169995f, dVar);
            bVar.f169991b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objA;
            b0 b0Var = (b0) this.f169991b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f169990a;
            f fVar = f.this;
            if (i14 == 0) {
                r.b(obj);
                ((e) fVar.f169984b.f150540a.getValue()).f169980a.setValue(Boolean.TRUE);
                qc1.a aVar2 = fVar.f169983a;
                k kVar = this.f169993d;
                String strValueOf = String.valueOf(kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != null ? kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() : kVar.getShareableEventUuid());
                this.f169991b = b0Var;
                this.f169990a = 1;
                objA = aVar2.a(strValueOf, this.f169994e, this.f169995f, this);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                objA = obj;
            }
            v2 v2Var = (v2) objA;
            if (v2Var instanceof v2.b) {
                ((e) fVar.f169984b.f150540a.getValue()).f169980a.setValue(Boolean.FALSE);
                T t7 = ((v2.b) v2Var).f47386a;
                if (!((Collection) t7).isEmpty()) {
                    List<tc1.b> listN0 = h0.N0((Iterable) t7, new a());
                    ArrayList arrayList = new ArrayList();
                    for (tc1.b bVar : listN0) {
                        Double lowerBoundProjectionRaceSpeed = null;
                        String calendarDate = bVar != null ? bVar.getCalendarDate() : null;
                        Long predictedRaceTime = bVar != null ? bVar.getPredictedRaceTime() : null;
                        Long projectionRaceTime = bVar != null ? bVar.getProjectionRaceTime() : null;
                        Long upperBoundProjectionRaceTime = bVar != null ? bVar.getUpperBoundProjectionRaceTime() : null;
                        Long lowerBoundProjectionRaceTime = bVar != null ? bVar.getLowerBoundProjectionRaceTime() : null;
                        String eventRacePredictionsFeedbackPhrase = bVar != null ? bVar.getEventRacePredictionsFeedbackPhrase() : null;
                        Double speedPrediction = bVar != null ? bVar.getSpeedPrediction() : null;
                        Double speedProjection = bVar != null ? bVar.getSpeedProjection() : null;
                        Double upperBoundProjectionRaceSpeed = bVar != null ? bVar.getUpperBoundProjectionRaceSpeed() : null;
                        if (bVar != null) {
                            lowerBoundProjectionRaceSpeed = bVar.getLowerBoundProjectionRaceSpeed();
                        }
                        arrayList.add(new tc1.a(calendarDate, predictedRaceTime, projectionRaceTime, upperBoundProjectionRaceTime, lowerBoundProjectionRaceTime, eventRacePredictionsFeedbackPhrase, speedPrediction, speedProjection, upperBoundProjectionRaceSpeed, lowerBoundProjectionRaceSpeed));
                    }
                    fVar.f169987e.setValue(arrayList);
                }
            } else if (v2Var instanceof v2.a) {
                ((e) fVar.f169984b.f150540a.getValue()).f169980a.setValue(Boolean.FALSE);
                String strH = f3.h(((v2.a) v2Var).f47383a, "Error fetching race time prediction data [", "]");
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var, "RaceTimePredictionViewModel", strH);
            } else {
                ((e) fVar.f169984b.f150540a.getValue()).f169980a.setValue(Boolean.FALSE);
                i2.a aVar4 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var2, "RaceTimePredictionViewModel", "Error fetching race time prediction data [" + v2Var + "]");
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public f(qc1.a aVar) {
        aVar.getClass();
        this.f169983a = aVar;
        b2 b2VarD = s.d(q2.a(new e(null, null, null, 7, null)));
        this.f169984b = b2VarD;
        this.f169985c = ((e) b2VarD.f150540a.getValue()).f169982c;
        this.f169986d = q2.a(new k(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null));
        c2 c2VarN = p0.n(null);
        this.f169987e = c2VarN;
        this.f169988f = c2VarN;
        this.f169989g = p0.n(sc1.a.Time);
    }

    public final void x4(k kVar) {
        kVar.getClass();
        LocalDate date = kVar.getDate();
        o oVarT = date != null ? g22.k.t(date) : null;
        o oVarD = oVarT != null ? q.d(oVarT, new b63.d(0, 0, 180, 3, null)) : null;
        if (oVarT != null && oVarD != null) {
            ge1.b.T(v1.a(this), null, null, new b(kVar, oVarD, oVarT, null), 3);
        } else {
            ((e) this.f169984b.f150540a.getValue()).f169980a.setValue(Boolean.FALSE);
            this.f169987e.setValue(null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Luc1/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ERROR", "", "MAX_DAYS", "I", "gcm-race-time-prediction_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
