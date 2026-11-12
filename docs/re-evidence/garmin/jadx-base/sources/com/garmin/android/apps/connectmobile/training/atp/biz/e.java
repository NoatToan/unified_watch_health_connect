package com.garmin.android.apps.connectmobile.training.atp.biz;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import fu1.v;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/e;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lfu1/v;", "", "athletePlanId", "", "language", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JLjava/lang/String;Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends com.garmin.android.library.backgroundtaskmanagement.b<v> {

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/e$a", "Liu1/k;", "Lxw1/d;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements iu1.k<xw1.d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f45141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f45142c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f45143d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f45144e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b f45145f;

        public a(long j8, String str, f fVar, d dVar, b bVar) {
            this.f45141b = j8;
            this.f45142c = str;
            this.f45143d = fVar;
            this.f45144e = dVar;
            this.f45145f = bVar;
        }

        @Override // iu1.k
        public final void onSuccess(xw1.d dVar) {
            xw1.i contentfulModel;
            xw1.d dVar2 = dVar;
            boolean Z = dVar2.Z();
            e eVar = e.this;
            String contentfulContentId = null;
            if (Z) {
                DateTime dateTime = new DateTime();
                cw.e.a(eVar, new xt1.m(this.f45141b, dateTime, g22.k.b(((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().f77271c, dateTime), this.f45142c, this.f45143d));
                cw.e.a(eVar, new xt1.g(this.f45141b, this.f45144e));
            }
            xw1.e coach = dVar2.getCoach();
            if (coach != null && (contentfulModel = coach.getContentfulModel()) != null) {
                contentfulContentId = contentfulModel.getContentfulContentId();
            }
            if (contentfulContentId != null) {
                fy1.i.f73924a.getClass();
                cw.e.a(eVar, new xt1.c(new fu1.k("coaches", new fu1.c(contentfulContentId, fy1.i.a.e()).a(), null, 4, null), this.f45145f));
            }
            ((v) eVar.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE)).f73560a = dVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/e$b", "Liu1/j;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements iu1.j {
        public b() {
        }

        @Override // iu1.j
        public final void c(String str) {
            xw1.e coach;
            xw1.g gVarA = new h.a(str).a();
            if (gVarA != null) {
                xw1.d dVar = ((v) e.this.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE)).f73560a;
                if (dVar == null || (coach = dVar.getCoach()) == null) {
                    return;
                }
                coach.f192366c = gVarA.getFirstName();
                coach.f192367d = gVarA.getLastName();
                coach.f192370g = gVarA.getTagLine();
                coach.f192370g = gVarA.getTagLine();
                coach.f192369f = gVarA.getXhdpiUrl();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/e$c", "Liu1/i;", "Lfu1/d;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements iu1.i<fu1.d> {

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                return r13.a.b(((fu1.d) t14).getDate(), ((fu1.d) t7).getDate());
            }
        }

        public c() {
        }

        @Override // iu1.i
        public final void b(List<? extends fu1.d> list) {
            v vVar = (v) e.this.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                fu1.d dVar = (fu1.d) obj;
                if (dVar.getTip() != null || dVar.getGradedWorkout() != null) {
                    arrayList.add(obj);
                }
            }
            vVar.f73562c = h0.N0(arrayList, new a());
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/e$d", "Liu1/j;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements iu1.j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<WorkoutDTO, Unit> f45149b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(e23.l<? super WorkoutDTO, Unit> lVar) {
            this.f45149b = lVar;
        }

        @Override // iu1.j
        public final void c(String str) {
            fu1.q qVar = (fu1.q) new iu1.g().b(fu1.q.class, str);
            if (qVar != null) {
                com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
                e eVar2 = e.this;
                fu1.t tVar = ((v) eVar2.f50097g.get(eVar)).f73561b;
                if (tVar != null) {
                    tVar.f73554a = new fu1.a(qVar, null, 2, null);
                }
                if (qVar.getWorkoutId() != null) {
                    eVar2.b(new iy1.a(qVar.k(), e.this, this.f45149b, null, 8, null));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.training.atp.biz.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/e$e", "Liu1/i;", "Lxw1/p;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0866e implements iu1.i<xw1.p> {
        public C0866e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // iu1.i
        public final void b(List<? extends xw1.p> list) {
            ((v) e.this.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE)).f73563d = list;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/e$f", "Liu1/i;", "Lfu1/q;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements iu1.i<fu1.q> {
        public f() {
        }

        @Override // iu1.i
        public final void b(List<? extends fu1.q> list) {
            v vVar = (v) e.this.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((fu1.q) obj).getActivityId() == null) {
                    arrayList.add(obj);
                }
            }
            fu1.t tVar = vVar.f73561b;
            if (tVar != null) {
                tVar.f73555b = arrayList.size();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j8, String str, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        str.getClass();
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new v(null, new fu1.t(null, 0, 3, null), null, null, 13, null));
        a aVar2 = new a(j8, str, new f(), new d(new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(this, 1)), new b());
        cw.e.b(this, x.m(new xt1.e(j8, str, new c()), new xt1.d(j8, str, aVar2), new xt1.f(str, new C0866e())));
    }
}
