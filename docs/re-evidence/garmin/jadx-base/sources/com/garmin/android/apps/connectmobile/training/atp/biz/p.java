package com.garmin.android.apps.connectmobile.training.atp.biz;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.p0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/p;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "", "Lfu1/u;", "", "athletePlanId", "Lorg/joda/time/DateTime;", "startDate", "endDate", "", "language", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends com.garmin.android.library.backgroundtaskmanagement.b<List<? extends fu1.u>> {

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/p$a", "Liu1/i;", "Lfu1/q;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements iu1.i<fu1.q> {

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.training.atp.biz.p$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/p$a$a", "Liu1/k;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/h;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0869a implements iu1.k<com.garmin.android.apps.connectmobile.activities.newmodel.h> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p f45192a;

            public C0869a(p pVar) {
                this.f45192a = pVar;
            }

            @Override // iu1.k
            public final void onSuccess(com.garmin.android.apps.connectmobile.activities.newmodel.h hVar) {
                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = hVar;
                p pVar = this.f45192a;
                pVar.getClass();
                List<fu1.u> list = (List) pVar.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE);
                list.getClass();
                for (fu1.u uVar : list) {
                    uVar.getClass();
                    fu1.q qVar = uVar.f73557b;
                    Long activityId = qVar != null ? qVar.getActivityId() : null;
                    if (activityId != null && activityId.longValue() == hVar2.f29448a) {
                        uVar.f73559d = hVar2;
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }

        public a() {
        }

        @Override // iu1.i
        public final void b(List<? extends fu1.q> list) {
            Object next;
            p pVar = p.this;
            pVar.getClass();
            List list2 = (List) pVar.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE);
            ArrayList<fu1.q> arrayList = new ArrayList();
            for (fu1.q qVar : list) {
                list2.getClass();
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    fu1.u uVar = (fu1.u) next;
                    DateTime dateTimeI = qVar.i();
                    if (dateTimeI != null && g22.k.f(uVar.f73556a, dateTimeI)) {
                        break;
                    }
                }
                fu1.u uVar2 = (fu1.u) next;
                if (uVar2 != null) {
                    if (uVar2.f73557b == null) {
                        uVar2.f73557b = qVar;
                        DateTime dateTimeI2 = qVar.i();
                        if (dateTimeI2 != null) {
                            uVar2.f73556a = dateTimeI2;
                        }
                    } else {
                        arrayList.add(qVar);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                list2.getClass();
                ArrayList arrayList2 = new ArrayList(list2);
                for (fu1.q qVar2 : arrayList) {
                    DateTime dateTimeI3 = qVar2.i();
                    if (dateTimeI3 != null) {
                        arrayList2.add(new fu1.u(dateTimeI3, qVar2, null, null, 12, null));
                    }
                }
                pVar.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, h0.N0(arrayList2, r13.a.a(new ch1.f(13), new ch1.f(14))));
            }
            ArrayList arrayList3 = new ArrayList();
            for (fu1.q qVar3 : list) {
                com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l lVar = new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(pVar, 2);
                if (qVar3.getWorkoutId() != null) {
                    arrayList3.add(new iy1.a(qVar3.k(), pVar, lVar, null, 8, null));
                }
            }
            pVar.c(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            for (fu1.q qVar4 : list) {
                if (qVar4.getActivityId() != null) {
                    arrayList4.add(new em.g(qVar4.d(), new C0869a(pVar), false, 4, null));
                }
            }
            cw.e.b(pVar, arrayList4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j8, DateTime dateTime, DateTime dateTime2, String str, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        dateTime.getClass();
        dateTime2.getClass();
        str.getClass();
        com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        Iterator<Integer> it = new j23.l(0, 6).iterator();
        while (((j23.k) it).f96801c) {
            DateTime dateTimePlusDays = dateTime.plusDays(((p0) it).nextInt());
            dateTimePlusDays.getClass();
            copyOnWriteArrayList.add(new fu1.u(dateTimePlusDays, null, null, null, 14, null));
        }
        i(eVar, copyOnWriteArrayList);
        cw.e.a(this, new xt1.m(j8, dateTime, dateTime2, str, new a()));
    }
}
