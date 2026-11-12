package mz1;

import android.net.Uri;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$bindEditEventsEntries$1", f = "AddTIEventViewModel.kt", l = {2140}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.y0 f121729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f121730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f121731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg0.k f121732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f121733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.courses.model.e> f121734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f121735g;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121736a;

        static {
            int[] iArr = new int[gg0.a.values().length];
            try {
                iArr[gg0.a.PRIVATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gg0.a.PUBLIC_SHAREABLE_DISCOVERABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gg0.a.PUBLIC_SHAREABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f121736a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z14, fg0.k kVar, com.garmin.android.apps.connectmobile.courses.model.e eVar, List<com.garmin.android.apps.connectmobile.courses.model.e> list, AddTIEventViewModel addTIEventViewModel, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f121731c = z14;
        this.f121732d = kVar;
        this.f121733e = eVar;
        this.f121734f = list;
        this.f121735g = addTIEventViewModel;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f121731c, this.f121732d, this.f121733e, this.f121734f, this.f121735g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:104:0x020a  */
    /* JADX WARN: Code duplicated, block: B:106:0x021e  */
    /* JADX WARN: Code duplicated, block: B:107:0x023a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0240  */
    /* JADX WARN: Code duplicated, block: B:124:0x028d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0297 A[LOOP:0: B:125:0x0291->B:127:0x0297, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0162  */
    /* JADX WARN: Code duplicated, block: B:73:0x0168  */
    /* JADX WARN: Code duplicated, block: B:74:0x016a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0174  */
    /* JADX WARN: Code duplicated, block: B:78:0x0177  */
    /* JADX WARN: Code duplicated, block: B:80:0x017a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0183  */
    /* JADX WARN: Code duplicated, block: B:82:0x018c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0195  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01df  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e8  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        LocalDate date;
        Object objD5;
        androidx.lifecycle.y0 y0Var;
        String str;
        String str2;
        com.garmin.android.library.mapsdkadapter.i.b bVarH;
        fg0.c eventPrivacy;
        String location;
        Boolean race;
        String note;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH;
        fg0.d completionTarget;
        List<fg0.a0> listS;
        List<com.garmin.android.apps.connectmobile.courses.model.e> list;
        Iterator<T> it;
        fg0.a0 a0Var;
        String strValueOf;
        ny1.e eVar;
        Double value;
        gg0.a aVar;
        int i14;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f121730b;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2 = this.f121733e;
        boolean z14 = this.f121731c;
        AddTIEventViewModel addTIEventViewModel = this.f121735g;
        fg0.k kVar = this.f121732d;
        if (i15 == 0) {
            o13.r.b(obj);
            if (z14) {
                kVar.J0(null);
                kVar.C0(null);
            }
            String eventName = kVar.getEventName();
            if (eventName != null) {
                addTIEventViewModel.K6(eventName);
            }
            LocalDate date2 = kVar.getDate();
            if (date2 != null) {
                ((androidx.lifecycle.y0) addTIEventViewModel.K0.getValue()).m(date2);
                DateTime dateTime = new DateTime(date2.toString());
                addTIEventViewModel.L6(dateTime);
                ((androidx.lifecycle.y0) addTIEventViewModel.K0.getValue()).m(dateTime.toLocalDate());
            }
            String url = kVar.getUrl();
            if (url != null) {
                addTIEventViewModel.A6(url);
            }
            gg0.f eventType = kVar.getEventType();
            if (eventType != null) {
                addTIEventViewModel.F6(eventType);
            }
            fg0.y locationStartPoint = kVar.getLocationStartPoint();
            if (locationStartPoint != null) {
                ny1.g gVar = ny1.g.IN_PERSON;
                addTIEventViewModel.getClass();
                gVar.getClass();
                addTIEventViewModel.Q5().m(gVar);
                if (eVar2 == null || (bVarH = eVar2.h()) == null) {
                    bVarH = com.garmin.android.library.mapsdkadapter.i.b.WGS84;
                }
                com.garmin.android.library.mapsdkadapter.i.b bVar = bVarH;
                androidx.lifecycle.y0<com.garmin.android.library.mapsdkadapter.f> y0VarH5 = addTIEventViewModel.H5();
                Double lat = locationStartPoint.getLat();
                double dDoubleValue = lat != null ? lat.doubleValue() : 0.0d;
                Double lon = locationStartPoint.getLon();
                y0VarH5.m(new com.garmin.android.library.mapsdkadapter.f(dDoubleValue, lon != null ? lon.doubleValue() : 0.0d, bVar));
            } else {
                ny1.g gVar2 = ny1.g.VIRTUAL;
                addTIEventViewModel.getClass();
                gVar2.getClass();
                addTIEventViewModel.Q5().m(gVar2);
            }
            fg0.r eventTimeLocal = kVar.getEventTimeLocal();
            if (eventTimeLocal != null && (date = kVar.getDate()) != null) {
                String startTimeHhMm = eventTimeLocal.getStartTimeHhMm();
                List listW = startTimeHhMm != null ? d53.w.W(startTimeHhMm, new String[]{":"}) : null;
                DateTime dateTime2 = new DateTime(date.getYear(), date.getMonthOfYear(), date.getDayOfMonth(), (listW == null || (str2 = (String) p13.h0.b0(listW)) == null) ? 8 : Integer.parseInt(str2), (listW == null || (str = (String) p13.h0.m0(listW)) == null) ? 0 : Integer.parseInt(str));
                String[] strArr = AddTIEventViewModel.V2;
                addTIEventViewModel.getClass();
                addTIEventViewModel.L6(dateTime2);
                ((androidx.lifecycle.y0) addTIEventViewModel.K0.getValue()).m(dateTime2.toLocalDate());
                String timeZoneId = eventTimeLocal.getTimeZoneId();
                if (timeZoneId != null) {
                    androidx.lifecycle.y0<my1.g> y0VarR5 = addTIEventViewModel.R5();
                    this.f121729a = y0VarR5;
                    this.f121730b = 1;
                    objD5 = addTIEventViewModel.d5(timeZoneId, this);
                    if (objD5 == aVar2) {
                        return aVar2;
                    }
                    y0Var = y0VarR5;
                }
            }
            eventPrivacy = kVar.getEventPrivacy();
            if (eventPrivacy != null) {
                aVar = eventPrivacy.getCom.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL java.lang.String();
                if (aVar == null) {
                    i14 = -1;
                } else {
                    i14 = a.f121736a[aVar.ordinal()];
                }
                if (i14 != 1) {
                    addTIEventViewModel.f46441v2 = false;
                    addTIEventViewModel.E6(false);
                    addTIEventViewModel.H6(false);
                } else if (i14 != 2) {
                    addTIEventViewModel.f46441v2 = true;
                    addTIEventViewModel.E6(true);
                    addTIEventViewModel.H6(true);
                } else if (i14 != 3) {
                    addTIEventViewModel.f46441v2 = false;
                    addTIEventViewModel.E6(false);
                    addTIEventViewModel.H6(false);
                } else {
                    addTIEventViewModel.f46441v2 = true;
                    addTIEventViewModel.E6(true);
                    addTIEventViewModel.H6(false);
                }
            }
            location = kVar.getLocation();
            if (location != null) {
                addTIEventViewModel.J6(location);
            }
            race = kVar.getRace();
            if (race != null) {
                if (race.booleanValue()) {
                    ny1.d dVar = ny1.d.YES;
                    addTIEventViewModel.getClass();
                    dVar.getClass();
                    ((androidx.lifecycle.y0) addTIEventViewModel.S0.getValue()).m(dVar);
                } else {
                    ny1.d dVar2 = ny1.d.NO;
                    addTIEventViewModel.getClass();
                    dVar2.getClass();
                    ((androidx.lifecycle.y0) addTIEventViewModel.S0.getValue()).m(dVar2);
                }
            }
            note = kVar.getNote();
            if (note != null) {
                addTIEventViewModel.z6(note);
            }
            listH = kVar.h();
            if (listH != null) {
                fg0.d completionTarget2 = kVar.getCompletionTarget();
                com.garmin.android.apps.connectmobile.workouts.data.model.f fVar = completionTarget2 != null ? new com.garmin.android.apps.connectmobile.workouts.data.model.f(listH, null, completionTarget2.q(), 2, null) : null;
                String[] strArr2 = AddTIEventViewModel.V2;
                addTIEventViewModel.W5().m(fVar);
            }
            completionTarget = kVar.getCompletionTarget();
            if (completionTarget != null) {
                strValueOf = String.valueOf(completionTarget.getUnitType());
                eVar = ny1.e.DISTANCE;
                if (strValueOf.equals(eVar.toString())) {
                    addTIEventViewModel.C6(new bg0.a.c(completionTarget.getValue(), bg0.a.b.valueOf(String.valueOf(completionTarget.getUnit()))));
                    addTIEventViewModel.G6(eVar);
                } else {
                    value = completionTarget.getValue();
                    if (value != null) {
                        addTIEventViewModel.D6(new Integer((int) value.doubleValue()));
                    }
                    addTIEventViewModel.G6(ny1.e.TIME);
                }
            }
            listS = kVar.s();
            if (listS != null && (a0Var = (fg0.a0) p13.h0.d0(listS)) != null) {
                addTIEventViewModel.a6().m(Uri.parse(a0Var.getUrl()));
            }
            if (eVar2 != null && ((p005kotlin.jvm.internal.s.g(kVar.getEventOrganizer(), Boolean.TRUE) && z14) || !z14)) {
                addTIEventViewModel.B6(new com.garmin.android.apps.connectmobile.courses.model.d(eVar2));
            }
            list = this.f121734f;
            if (list != null) {
                it = list.iterator();
                while (it.hasNext()) {
                    addTIEventViewModel.B6(new com.garmin.android.apps.connectmobile.courses.model.d((com.garmin.android.apps.connectmobile.courses.model.e) it.next()));
                }
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y0Var = this.f121729a;
        o13.r.b(obj);
        objD5 = obj;
        y0Var.m(objD5);
        Unit unit = Unit.INSTANCE;
        eventPrivacy = kVar.getEventPrivacy();
        if (eventPrivacy != null) {
            aVar = eventPrivacy.getCom.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL java.lang.String();
            if (aVar == null) {
                i14 = -1;
            } else {
                i14 = a.f121736a[aVar.ordinal()];
            }
            if (i14 != 1) {
                addTIEventViewModel.f46441v2 = false;
                addTIEventViewModel.E6(false);
                addTIEventViewModel.H6(false);
            } else if (i14 != 2) {
                addTIEventViewModel.f46441v2 = true;
                addTIEventViewModel.E6(true);
                addTIEventViewModel.H6(true);
            } else if (i14 != 3) {
                addTIEventViewModel.f46441v2 = false;
                addTIEventViewModel.E6(false);
                addTIEventViewModel.H6(false);
            } else {
                addTIEventViewModel.f46441v2 = true;
                addTIEventViewModel.E6(true);
                addTIEventViewModel.H6(false);
            }
        }
        location = kVar.getLocation();
        if (location != null) {
            addTIEventViewModel.J6(location);
        }
        race = kVar.getRace();
        if (race != null) {
            if (race.booleanValue()) {
                ny1.d dVar3 = ny1.d.YES;
                addTIEventViewModel.getClass();
                dVar3.getClass();
                ((androidx.lifecycle.y0) addTIEventViewModel.S0.getValue()).m(dVar3);
            } else {
                ny1.d dVar4 = ny1.d.NO;
                addTIEventViewModel.getClass();
                dVar4.getClass();
                ((androidx.lifecycle.y0) addTIEventViewModel.S0.getValue()).m(dVar4);
            }
        }
        note = kVar.getNote();
        if (note != null) {
            addTIEventViewModel.z6(note);
        }
        listH = kVar.h();
        if (listH != null) {
            fg0.d completionTarget3 = kVar.getCompletionTarget();
            if (completionTarget3 != null) {
            }
            String[] strArr3 = AddTIEventViewModel.V2;
            addTIEventViewModel.W5().m(fVar);
        }
        completionTarget = kVar.getCompletionTarget();
        if (completionTarget != null) {
            strValueOf = String.valueOf(completionTarget.getUnitType());
            eVar = ny1.e.DISTANCE;
            if (strValueOf.equals(eVar.toString())) {
                addTIEventViewModel.C6(new bg0.a.c(completionTarget.getValue(), bg0.a.b.valueOf(String.valueOf(completionTarget.getUnit()))));
                addTIEventViewModel.G6(eVar);
            } else {
                value = completionTarget.getValue();
                if (value != null) {
                    addTIEventViewModel.D6(new Integer((int) value.doubleValue()));
                }
                addTIEventViewModel.G6(ny1.e.TIME);
            }
        }
        listS = kVar.s();
        if (listS != null) {
            addTIEventViewModel.a6().m(Uri.parse(a0Var.getUrl()));
        }
        if (eVar2 != null) {
            addTIEventViewModel.B6(new com.garmin.android.apps.connectmobile.courses.model.d(eVar2));
        }
        list = this.f121734f;
        if (list != null) {
            it = list.iterator();
            while (it.hasNext()) {
                addTIEventViewModel.B6(new com.garmin.android.apps.connectmobile.courses.model.d((com.garmin.android.apps.connectmobile.courses.model.e) it.next()));
            }
        }
        return Unit.INSTANCE;
    }
}
