package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import am.a2;
import am.x0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.TrainingInitiativeEventActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.j0;
import ty1.n2;
import z10.p3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/TrainingInitiativeEventActivity;", "Lz10/p3;", "Lry1/a;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TrainingInitiativeEventActivity extends p3 implements ry1.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static TrainingInitiativeEventActivity f45719p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fg0.k f45725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f45726h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f45727i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f45728j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f45729k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f45730l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o13.t f45731m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w1 f45732n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f45718o = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f45720q = -1;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45733a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f45733a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f45734a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f45734a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f45734a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45734a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f45735a;

        public d(b.g gVar) {
            this.f45735a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45735a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f45737b;

        public e(e23.a aVar, b.g gVar) {
            this.f45736a = aVar;
            this.f45737b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45736a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45737b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public TrainingInitiativeEventActivity() {
        final int i14 = 0;
        this.f45731m = o13.m.b(new e23.a(this) { // from class: ty1.o2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrainingInitiativeEventActivity f167204b;

            {
                this.f167204b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Object serializableExtra;
                int i15 = i14;
                TrainingInitiativeEventActivity trainingInitiativeEventActivity = this.f167204b;
                switch (i15) {
                    case 0:
                        TrainingInitiativeEventActivity.a aVar = TrainingInitiativeEventActivity.f45718o;
                        Intent intent = trainingInitiativeEventActivity.getIntent();
                        if (intent != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializableExtra = intent.getSerializableExtra("extra.date.time", DateTime.class);
                            } else {
                                Object serializableExtra2 = intent.getSerializableExtra("extra.date.time");
                                if (!(serializableExtra2 instanceof DateTime)) {
                                    serializableExtra2 = null;
                                }
                                serializableExtra = (DateTime) serializableExtra2;
                            }
                            DateTime dateTime = (DateTime) serializableExtra;
                            if (dateTime != null) {
                                return dateTime;
                            }
                        }
                        return new DateTime();
                    default:
                        TrainingInitiativeEventActivity.a aVar2 = TrainingInitiativeEventActivity.f45718o;
                        return new mz1.b0(trainingInitiativeEventActivity.f45721c);
                }
            }
        });
        final int i15 = 1;
        this.f45732n = new w1(s0.f105811a.b(AddTIEventViewModel.class), new d(this), new e23.a(this) { // from class: ty1.o2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrainingInitiativeEventActivity f167204b;

            {
                this.f167204b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Object serializableExtra;
                int i16 = i15;
                TrainingInitiativeEventActivity trainingInitiativeEventActivity = this.f167204b;
                switch (i16) {
                    case 0:
                        TrainingInitiativeEventActivity.a aVar = TrainingInitiativeEventActivity.f45718o;
                        Intent intent = trainingInitiativeEventActivity.getIntent();
                        if (intent != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializableExtra = intent.getSerializableExtra("extra.date.time", DateTime.class);
                            } else {
                                Object serializableExtra2 = intent.getSerializableExtra("extra.date.time");
                                if (!(serializableExtra2 instanceof DateTime)) {
                                    serializableExtra2 = null;
                                }
                                serializableExtra = (DateTime) serializableExtra2;
                            }
                            DateTime dateTime = (DateTime) serializableExtra;
                            if (dateTime != null) {
                                return dateTime;
                            }
                        }
                        return new DateTime();
                    default:
                        TrainingInitiativeEventActivity.a aVar2 = TrainingInitiativeEventActivity.f45718o;
                        return new mz1.b0(trainingInitiativeEventActivity.f45721c);
                }
            }
        }, new e(null, this));
    }

    @Override // z10.p3
    public final Fragment ca() {
        Parcelable parcelable;
        if (this.f45721c && this.f45725g != null) {
            hideToolBar();
            hideActionBar();
            a0.a aVar = a0.I1;
            fg0.k kVar = this.f45725g;
            kVar.getClass();
            com.garmin.android.apps.connectmobile.courses.model.e eVar = this.f45726h;
            aVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putParcelable("GCM_extra_sharable_event_dto", kVar);
            bundle.putParcelable("GCM_extra_sharable_course_dto", eVar);
            a0 a0Var = new a0();
            l2.f37135b.getClass();
            l2.a.c(a0Var, bundle);
            return a0Var;
        }
        Integer num = this.f45728j;
        zf0.a aVar2 = zf0.a.CREATE_EVENT;
        int iOrdinal = aVar2.ordinal();
        if (num != null && num.intValue() == iOrdinal) {
            ((y0) ka().Y.getValue()).m(aVar2);
            o.f46150j.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("extra.date.time", new DateTime());
            o oVar = new o();
            oVar.setArguments(bundle2);
            return oVar;
        }
        Integer num2 = this.f45728j;
        zf0.a aVar3 = zf0.a.FIND_EVENT_W_TYPE_SELECTION;
        int iOrdinal2 = aVar3.ordinal();
        if (num2 != null && num2.intValue() == iOrdinal2) {
            ((y0) ka().Y.getValue()).m(aVar3);
            r.f46219c.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putSerializable("extra.date.time", new DateTime());
            r rVar = new r();
            rVar.setArguments(bundle3);
            return rVar;
        }
        if (this.f45723e || this.f45724f) {
            b0.f45848e.getClass();
            return new b0();
        }
        if (ka().f46443w2) {
            AddTIEventViewModel addTIEventViewModelKa = ka();
            Bundle extras = getIntent().getExtras();
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = extras != null ? (Parcelable) extras.getParcelable("extra_fbt_location_time_dto", ww1.v.class) : null;
            } else {
                Parcelable parcelable2 = extras != null ? extras.getParcelable("extra_fbt_location_time_dto") : null;
                if (!(parcelable2 instanceof ww1.v)) {
                    parcelable2 = null;
                }
                parcelable = (ww1.v) parcelable2;
            }
            ww1.v vVar = (ww1.v) parcelable;
            addTIEventViewModelKa.A2 = vVar;
            if (vVar != null) {
                ge1.b.T(v1.a(addTIEventViewModelKa), null, null, new mz1.y(addTIEventViewModelKa, vVar, null), 3);
            }
            t.a aVar4 = t.f46255f;
            DateTime dateTimeLa = la();
            aVar4.getClass();
            Bundle bundle4 = new Bundle();
            if (dateTimeLa == null) {
                dateTimeLa = new DateTime();
            }
            bundle4.putSerializable("extra.date.time", dateTimeLa);
            t tVar = new t();
            tVar.setArguments(bundle4);
            return tVar;
        }
        if (!ka().D2) {
            vy1.e.a aVar5 = vy1.e.T;
            DateTime dateTimeLa2 = la();
            aVar5.getClass();
            Bundle bundle5 = new Bundle();
            if (dateTimeLa2 == null) {
                dateTimeLa2 = new DateTime();
            }
            bundle5.putSerializable("extra.date.time", dateTimeLa2);
            vy1.e eVar2 = new vy1.e();
            eVar2.setArguments(bundle5);
            return eVar2;
        }
        if (ka().F2 != null) {
            u.A.getClass();
            Bundle bundle6 = new Bundle();
            bundle6.putParcelable("TRIATHLON_TYPE_DISTANCE", null);
            bundle6.putBoolean("IS_FROM_REVIEW_ENTRY_SCREEN", false);
            u uVar = new u();
            uVar.setArguments(bundle6);
            return uVar;
        }
        v.a aVar6 = v.f46300e;
        j0 j0Var = j0.f134944a;
        aVar6.getClass();
        Bundle bundle7 = new Bundle();
        bundle7.putParcelableArrayList("TRIATHLON_TYPE_DISTANCE", j0Var != null ? new ArrayList<>(j0Var) : null);
        v vVar2 = new v();
        vVar2.setArguments(bundle7);
        return vVar2;
    }

    @Override // z10.p3
    public final String da() {
        String string = getString(R.string.add_event);
        string.getClass();
        return string;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (this.f45729k) {
            overridePendingTransition(0, 0);
        }
    }

    @Override // ry1.a
    public final void g(int i14, String str) {
        updateActionBar(str, 2);
    }

    @Override // z10.p3
    public final boolean ia() {
        return true;
    }

    public final AddTIEventViewModel ka() {
        return (AddTIEventViewModel) this.f45732n.getValue();
    }

    public final DateTime la() {
        return (DateTime) this.f45731m.getValue();
    }

    public final void ma(Fragment fragment, String str) {
        androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarC = n23.j.c(supportFragmentManager, supportFragmentManager, R.id.content_frame, fragment, str);
        aVarC.d(str);
        aVarC.e();
    }

    public final void na() {
        List<Fragment> listF = getSupportFragmentManager().f7372c.f();
        listF.getClass();
        if (p005kotlin.jvm.internal.s.g(((Fragment) h0.m0(listF)).getTag(), "TIAddEventImageFragment")) {
            ka().O5().m("TIAddEventWebsiteNotesFragment");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF;
        String str;
        String str2;
        Object next;
        Parcelable parcelable;
        super.onActivityResult(i14, i15, intent);
        if (intent == null) {
            if (i15 == 2) {
                setResult(i15);
                finish();
                return;
            }
            return;
        }
        boolean z14 = true;
        Parcelable fVar = null;
        if (i14 != 99) {
            if (i14 != 123) {
                if (i14 != 99999) {
                    return;
                }
                Intent intentPutExtra = p005kotlin.jvm.internal.s.g(ka().f204392i, Boolean.TRUE) ? new Intent().putExtra("extra_event_dashboard_refresh_needed", true) : intent;
                intentPutExtra.getClass();
                setResult(-1, intentPutExtra);
                finish();
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("GCM_extra_events_filter_dto", my1.d.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("GCM_extra_events_filter_dto");
                parcelable = (my1.d) (parcelableExtra instanceof my1.d ? parcelableExtra : null);
            }
            my1.d dVar = (my1.d) parcelable;
            if (dVar != null) {
                ka().Q6(dVar);
                return;
            }
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            boolean z15 = extras.getBoolean("GCM_extra_navigate_to_courses_from_reviewentries", false);
            x0 x0Var = (x0) extras.getParcelable("GCM_extra_activity_type");
            ArrayList parcelableArrayList = extras.getParcelableArrayList("GCM_extra_activity_type_list");
            com.garmin.android.apps.connectmobile.courses.model.d dVar2 = (com.garmin.android.apps.connectmobile.courses.model.d) a2.c(extras, "GCM_extra_course");
            AddTIEventViewModel addTIEventViewModelKa = ka();
            if (dVar2 == null) {
                List<com.garmin.android.apps.connectmobile.courses.model.d> listD = addTIEventViewModelKa.m5().d();
                ArrayList arrayList = listD != null ? new ArrayList(listD) : null;
                if (x0Var != null && arrayList != null && !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((com.garmin.android.apps.connectmobile.courses.model.d) next).C() != x0Var);
                    com.garmin.android.apps.connectmobile.courses.model.d dVar3 = (com.garmin.android.apps.connectmobile.courses.model.d) next;
                    if (dVar3 != null) {
                        arrayList.remove(dVar3);
                    }
                }
                if (arrayList != null && arrayList.isEmpty()) {
                    arrayList = null;
                }
                addTIEventViewModelKa.m5().j(arrayList);
            }
            addTIEventViewModelKa.B6(dVar2);
            com.garmin.android.apps.connectmobile.workouts.data.model.f fVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.f) extras.getParcelable("GCM_extra_event_leg_distance");
            ?? F = fVar2 != null ? fVar2.f() : 0;
            if (ka().p6()) {
                F = new ArrayList();
                if (fVar2 != null && (listF = fVar2.f()) != null) {
                    for (com.garmin.android.apps.connectmobile.workouts.data.model.k kVar : listF) {
                        if (x0Var != null && am.z0.g0(x0Var) == z14 && kVar.getEventLegActivityType() == m52.c.CYCLING) {
                            F.add(com.garmin.android.apps.connectmobile.workouts.data.model.k.b(kVar, (dVar2 == null || (str2 = dVar2.courseId) == null) ? null : Integer.valueOf(Integer.parseInt(str2)), null, null, 62));
                        } else if (x0Var != null && am.z0.h0(x0Var) && kVar.getEventLegActivityType() == m52.c.RUNNING) {
                            F.add(com.garmin.android.apps.connectmobile.workouts.data.model.k.b(kVar, (dVar2 == null || (str = dVar2.courseId) == null) ? null : Integer.valueOf(Integer.parseInt(str)), null, null, 62));
                        } else {
                            F.add(kVar);
                        }
                        z14 = true;
                    }
                }
            }
            if (fVar2 != null) {
                AddTIEventViewModel addTIEventViewModelKa2 = ka();
                if (F != 0) {
                    m52.i iVarG = fVar2.getName();
                    ka();
                    og0.a.f131967a.getClass();
                    fVar = new com.garmin.android.apps.connectmobile.workouts.data.model.f(F, iVarG, og0.a.f(F));
                }
                addTIEventViewModelKa2.W5().m(fVar);
            }
            if (parcelableArrayList != null) {
                if (parcelableArrayList.isEmpty()) {
                    ka().v6();
                } else {
                    parcelableArrayList.remove((x0) parcelableArrayList.get(0));
                    if (parcelableArrayList.isEmpty()) {
                        ka().v6();
                    } else {
                        AddTIEventViewModel addTIEventViewModelKa3 = ka();
                        addTIEventViewModelKa3.f46427o2.y(this, null, parcelableArrayList, addTIEventViewModelKa3.A5().d(), addTIEventViewModelKa3.p6(), fVar2, ka().I5(), addTIEventViewModelKa3.f204395l);
                    }
                }
            }
            if (z15) {
                super.onActivityResult(i14, i15, intent);
            } else if (x0Var != null) {
                ka().v6();
            }
        }
    }

    @Override // z10.p3, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (p005kotlin.jvm.internal.s.g(ka().f204392i, Boolean.TRUE)) {
            setResult(0);
        } else {
            setResult(-1);
        }
        super.onBackPressed();
    }

    /* JADX WARN: Code duplicated, block: B:198:0x0396  */
    /* JADX WARN: Code duplicated, block: B:204:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:219:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:249:0x047d  */
    /* JADX WARN: Code duplicated, block: B:263:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:277:0x04db  */
    @Override // z10.p3, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        fg0.k kVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        fg0.x xVar;
        String string;
        String string2;
        ww1.w wVar;
        double d14;
        gg0.f fVar;
        DateTime dateTimeNow;
        DateTime dateTimeNow2;
        DateTime dateTimeNow3;
        ww1.w wVar2;
        bg0.a.b bVarB;
        bg0.a.b bVarA;
        bg0.a.b bVarA2;
        bg0.a.c cVarE;
        String string3;
        String string4;
        Object serializable;
        Object serializable2;
        Object serializable3;
        Bundle extras;
        Bundle extras2;
        DateTime dateTime;
        DateTime dateTime2;
        String str;
        Parcelable parcelable;
        Object serializable4;
        Object serializable5;
        Object serializable6;
        fg0.x xVar2;
        Double dValueOf;
        bg0.a.c cVarE2;
        Integer num;
        Bundle extras3;
        Parcelable parcelable2;
        Parcelable parcelable3;
        Parcelable parcelable4;
        Parcelable parcelable5;
        super.onCreate(bundle);
        f45718o.getClass();
        f45719p = this;
        Bundle extras4 = getIntent().getExtras();
        boolean z14 = true;
        this.f45721c = extras4 != null && extras4.getBoolean("GCM_extra_is_sharable_event");
        Bundle extras5 = getIntent().getExtras();
        boolean z15 = extras5 != null && extras5.getBoolean("navigating_from_event_dashboard");
        Bundle extras6 = getIntent().getExtras();
        this.f45722d = extras6 != null && extras6.getBoolean("GCM_extra_is_duplicate_event");
        Bundle extras7 = getIntent().getExtras();
        if (extras7 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable5 = (Parcelable) extras7.getParcelable("GCM_extra_sharable_event_dto", fg0.k.class);
            } else {
                Parcelable parcelable6 = extras7.getParcelable("GCM_extra_sharable_event_dto");
                if (!(parcelable6 instanceof fg0.k)) {
                    parcelable6 = null;
                }
                parcelable5 = (fg0.k) parcelable6;
            }
            kVar = (fg0.k) parcelable5;
        } else {
            kVar = null;
        }
        this.f45725g = kVar;
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        if (bundleA != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable4 = (Parcelable) bundleA.getParcelable("GCM_extra_sharable_course_dto", com.garmin.android.apps.connectmobile.courses.model.e.class);
            } else {
                Parcelable parcelable7 = bundleA.getParcelable("GCM_extra_sharable_course_dto");
                if (!(parcelable7 instanceof com.garmin.android.apps.connectmobile.courses.model.e)) {
                    parcelable7 = null;
                }
                parcelable4 = (com.garmin.android.apps.connectmobile.courses.model.e) parcelable7;
            }
            eVar = (com.garmin.android.apps.connectmobile.courses.model.e) parcelable4;
        } else {
            eVar = null;
        }
        this.f45726h = eVar;
        Bundle extras8 = getIntent().getExtras();
        this.f45727i = extras8 != null ? extras8.getParcelableArrayList("GCM_extra_course_detail_list") : null;
        Bundle extras9 = getIntent().getExtras();
        this.f45728j = extras9 != null ? Integer.valueOf(extras9.getInt("extra_create_event_type", -1)) : null;
        AddTIEventViewModel addTIEventViewModelKa = ka();
        Bundle extras10 = getIntent().getExtras();
        if (extras10 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable3 = (Parcelable) extras10.getParcelable("GCM_extra_is_garmin_coach_dto", fg0.x.class);
            } else {
                Parcelable parcelable8 = extras10.getParcelable("GCM_extra_is_garmin_coach_dto");
                if (!(parcelable8 instanceof fg0.x)) {
                    parcelable8 = null;
                }
                parcelable3 = (fg0.x) parcelable8;
            }
            xVar = (fg0.x) parcelable3;
        } else {
            xVar = null;
        }
        addTIEventViewModelKa.f204394k = xVar;
        Bundle extras11 = getIntent().getExtras();
        this.f45723e = extras11 != null ? extras11.getBoolean("GCM_extra_is_garmin_coach_flow", false) : false;
        AddTIEventViewModel addTIEventViewModelKa2 = ka();
        Bundle extras12 = getIntent().getExtras();
        addTIEventViewModelKa2.f46443w2 = extras12 != null ? extras12.getBoolean("extra_launch_fbt_location_screen", false) : false;
        AddTIEventViewModel addTIEventViewModelKa3 = ka();
        Bundle extras13 = getIntent().getExtras();
        if (extras13 == null || (string = extras13.getString("extra_fbt_location_header", "")) == null) {
            string = "";
        }
        addTIEventViewModelKa3.f46445x2 = string;
        Bundle extras14 = getIntent().getExtras();
        this.f45724f = extras14 != null ? extras14.getBoolean("extra_is_fbt_flow", false) : false;
        AddTIEventViewModel addTIEventViewModelKa4 = ka();
        Bundle extras15 = getIntent().getExtras();
        if (extras15 == null || (string2 = extras15.getString("GCM_extra_training_plan_name", "")) == null) {
            string2 = "";
        }
        addTIEventViewModelKa4.f204400q = string2;
        AddTIEventViewModel addTIEventViewModelKa5 = ka();
        Bundle extras16 = getIntent().getExtras();
        addTIEventViewModelKa5.k5().m(extras16 != null ? extras16.getParcelableArrayList("GCM_extra_available_activity_types") : null);
        AddTIEventViewModel addTIEventViewModelKa6 = ka();
        Bundle extras17 = getIntent().getExtras();
        addTIEventViewModelKa6.D2 = extras17 != null ? extras17.getBoolean("extra_launch_fbt_select_triathlon_event_screen") : false;
        AddTIEventViewModel addTIEventViewModelKa7 = ka();
        Bundle bundleA2 = l2.a.a(getIntent());
        if (bundleA2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = (Parcelable) bundleA2.getParcelable("extra_fbt_triathlon_leg_targets", ww1.w.class);
            } else {
                Parcelable parcelable9 = bundleA2.getParcelable("extra_fbt_triathlon_leg_targets");
                if (!(parcelable9 instanceof ww1.w)) {
                    parcelable9 = null;
                }
                parcelable2 = (ww1.w) parcelable9;
            }
            wVar = (ww1.w) parcelable2;
        } else {
            wVar = null;
        }
        addTIEventViewModelKa7.F2 = wVar;
        AddTIEventViewModel addTIEventViewModelKa8 = ka();
        Bundle extras18 = getIntent().getExtras();
        addTIEventViewModelKa8.G2 = extras18 != null ? extras18.getInt("extra_fbt_setup_flow_step", 0) : 0;
        AddTIEventViewModel addTIEventViewModelKa9 = ka();
        Bundle extras19 = getIntent().getExtras();
        addTIEventViewModelKa9.H2 = extras19 != null ? extras19.getInt("extra_fbt_setup_flow_total_steps", 0) : 0;
        AddTIEventViewModel addTIEventViewModelKa10 = ka();
        Bundle extras20 = getIntent().getExtras();
        addTIEventViewModelKa10.I2 = extras20 != null ? extras20.getBoolean("extra_is_fbt_editing", false) : false;
        AddTIEventViewModel addTIEventViewModelKa11 = ka();
        Intent intent2 = getIntent();
        addTIEventViewModelKa11.J2 = (intent2 == null || (extras3 = intent2.getExtras()) == null) ? false : extras3.getBoolean("extra_is_fbt_find_create_event", false);
        Bundle extras21 = getIntent().getExtras();
        this.f45730l = extras21 != null ? extras21.getString("GCM_extra_find_event_type") : null;
        this.f45729k = ka().D2 || ka().f46443w2 || this.f45724f;
        if (this.f45730l != null) {
            AddTIEventViewModel addTIEventViewModelKa12 = ka();
            gg0.f.a aVar2 = gg0.f.f77128d;
            String str2 = this.f45730l;
            aVar2.getClass();
            addTIEventViewModelKa12.F6(gg0.f.a.a(str2));
        }
        if (this.f45729k) {
            overridePendingTransition(0, 0);
        }
        if (this.f45723e) {
            ka().f204393j = Boolean.TRUE;
            fg0.x xVar3 = (fg0.x) a2.c(getIntent().getExtras(), "extra_garmin_coach_dto");
            if (xVar3 != null) {
                ka().f204394k = xVar3;
            } else {
                Bundle extras22 = getIntent().getExtras();
                if (extras22 != null) {
                    rt1.r rVar = rt1.r.values()[extras22.getInt("extra_atp_training_plan_enum_ordinal", -1)];
                    AddTIEventViewModel addTIEventViewModelKa13 = ka();
                    int i14 = rVar.f154561b;
                    Bundle extras23 = getIntent().getExtras();
                    if (extras23 != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable6 = extras23.getSerializable("extra_race_start_date", DateTime.class);
                        } else {
                            Object serializable7 = extras23.getSerializable("extra_race_start_date");
                            if (!(serializable7 instanceof DateTime)) {
                                serializable7 = null;
                            }
                            serializable6 = (DateTime) serializable7;
                        }
                        dateTime = (DateTime) serializable6;
                    } else {
                        dateTime = null;
                    }
                    Bundle extras24 = getIntent().getExtras();
                    if (extras24 != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable5 = extras24.getSerializable("extra_race_end_date", DateTime.class);
                        } else {
                            Object serializable8 = extras24.getSerializable("extra_race_end_date");
                            if (!(serializable8 instanceof DateTime)) {
                                serializable8 = null;
                            }
                            serializable5 = (DateTime) serializable8;
                        }
                        dateTime2 = (DateTime) serializable5;
                    } else {
                        dateTime2 = null;
                    }
                    Bundle extras25 = getIntent().getExtras();
                    if (extras25 != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable4 = extras25.getSerializable("GCM_tp_plan_name", String.class);
                        } else {
                            Object serializable9 = extras25.getSerializable("GCM_tp_plan_name");
                            if (!(serializable9 instanceof String)) {
                                serializable9 = null;
                            }
                            serializable4 = (String) serializable9;
                        }
                        str = (String) serializable4;
                    } else {
                        str = null;
                    }
                    Bundle extras26 = getIntent().getExtras();
                    d14 = 0.0d;
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = extras26 != null ? (Parcelable) extras26.getParcelable("GCM_race_dto", xw1.k.class) : null;
                    } else {
                        Parcelable parcelable10 = extras26 != null ? extras26.getParcelable("GCM_race_dto") : null;
                        if (!(parcelable10 instanceof xw1.k)) {
                            parcelable10 = null;
                        }
                        parcelable = (xw1.k) parcelable10;
                    }
                    addTIEventViewModelKa13.f204394k = new fg0.x(rVar, str, null, Integer.valueOf(i14), null, dateTime, dateTime2, null, (xw1.k) parcelable, null, 660, null);
                }
                xVar2 = ka().f204394k;
                if (xVar2 != null || (num = xVar2.f71368d) == null) {
                    dValueOf = null;
                } else {
                    dValueOf = Double.valueOf(num.intValue());
                }
                if (dValueOf != null || dValueOf.doubleValue() <= d14) {
                    cVarE2 = null;
                } else {
                    lz1.f.a aVar3 = lz1.f.f115404a;
                    double dDoubleValue = dValueOf.doubleValue();
                    aVar3.getClass();
                    cVarE2 = lz1.f.a.e(dDoubleValue);
                }
                ka().C6(cVarE2);
            }
            d14 = 0.0d;
            xVar2 = ka().f204394k;
            if (xVar2 != null) {
                dValueOf = null;
            } else {
                dValueOf = null;
            }
            if (dValueOf != null) {
                cVarE2 = null;
            } else {
                cVarE2 = null;
            }
            ka().C6(cVarE2);
        } else {
            d14 = 0.0d;
        }
        if (this.f45724f) {
            ka().f204395l = true;
            AddTIEventViewModel addTIEventViewModelKa14 = ka();
            Bundle extras27 = getIntent().getExtras();
            addTIEventViewModelKa14.f204396m = extras27 != null ? extras27.getBoolean("extra_fbt_navigate_event_creation_flow") : false;
            Bundle extras28 = getIntent().getExtras();
            if (extras28 != null) {
                fVar = ((gg0.f[]) gg0.f.f77146x.toArray(new gg0.f[0]))[extras28.getInt("GCM_extra_event_type")];
                if (fVar == null) {
                    fVar = gg0.f.f77130f;
                }
            } else {
                fVar = gg0.f.f77130f;
            }
            gg0.f fVar2 = fVar;
            Bundle extras29 = getIntent().getExtras();
            Double dValueOf2 = (extras29 == null || !extras29.containsKey("extra_fbt_race_distance") || (extras2 = getIntent().getExtras()) == null) ? null : Double.valueOf(extras2.getDouble("extra_fbt_race_distance"));
            Bundle extras30 = getIntent().getExtras();
            Double dValueOf3 = (extras30 == null || !extras30.containsKey("extra_fbt_race_duration") || (extras = getIntent().getExtras()) == null) ? null : Double.valueOf(extras.getDouble("extra_fbt_race_duration"));
            AddTIEventViewModel addTIEventViewModelKa15 = ka();
            Bundle extras31 = getIntent().getExtras();
            if (extras31 == null) {
                dateTimeNow = DateTime.now();
                dateTimeNow.getClass();
            } else {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable3 = extras31.getSerializable("extra_race_start_date", DateTime.class);
                } else {
                    Object serializable10 = extras31.getSerializable("extra_race_start_date");
                    if (!(serializable10 instanceof DateTime)) {
                        serializable10 = null;
                    }
                    serializable3 = (DateTime) serializable10;
                }
                dateTimeNow = (DateTime) serializable3;
                if (dateTimeNow == null) {
                    dateTimeNow = DateTime.now();
                    dateTimeNow.getClass();
                }
            }
            DateTime dateTime3 = dateTimeNow;
            Bundle extras32 = getIntent().getExtras();
            if (extras32 == null) {
                dateTimeNow2 = DateTime.now();
                dateTimeNow2.getClass();
            } else {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable2 = extras32.getSerializable("extra_race_end_date", DateTime.class);
                } else {
                    Object serializable11 = extras32.getSerializable("extra_race_end_date");
                    if (!(serializable11 instanceof DateTime)) {
                        serializable11 = null;
                    }
                    serializable2 = (DateTime) serializable11;
                }
                dateTimeNow2 = (DateTime) serializable2;
                if (dateTimeNow2 == null) {
                    dateTimeNow2 = DateTime.now();
                    dateTimeNow2.getClass();
                }
            }
            DateTime dateTime4 = dateTimeNow2;
            Bundle extras33 = getIntent().getExtras();
            if (extras33 == null) {
                dateTimeNow3 = DateTime.now();
            } else {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = extras33.getSerializable("extra_calendar_selection_date", DateTime.class);
                } else {
                    Object serializable12 = extras33.getSerializable("extra_calendar_selection_date");
                    if (!(serializable12 instanceof DateTime)) {
                        serializable12 = null;
                    }
                    serializable = (DateTime) serializable12;
                }
                dateTimeNow3 = (DateTime) serializable;
                if (dateTimeNow3 == null) {
                    dateTimeNow3 = DateTime.now();
                }
            }
            DateTime dateTime5 = dateTimeNow3;
            Bundle extras34 = getIntent().getExtras();
            boolean z16 = extras34 != null ? extras34.getBoolean("extra_prompt_if_selected_date_before_minimum", false) : false;
            Bundle extras35 = getIntent().getExtras();
            String str3 = (extras35 == null || (string4 = extras35.getString("extra_fbt_duration_display_text", "")) == null) ? "" : string4;
            Bundle extras36 = getIntent().getExtras();
            boolean z17 = extras36 != null ? extras36.getBoolean("extra_fbt_has_primary_event", false) : false;
            Bundle extras37 = getIntent().getExtras();
            addTIEventViewModelKa15.f204397n = new fg0.u(fVar2, z17, (extras37 == null || (string3 = extras37.getString("extra_fbt_primary_event_name")) == null) ? "" : string3, dateTime3, dateTime4, dateTime5, z16, dValueOf2, dValueOf3, str3);
            if (dValueOf2 != null) {
                double dDoubleValue2 = dValueOf2.doubleValue();
                ka().G6(ny1.e.DISTANCE);
                AddTIEventViewModel addTIEventViewModelKa16 = ka();
                if (dDoubleValue2 <= d14) {
                    cVarE = null;
                } else {
                    lz1.f.f115404a.getClass();
                    cVarE = lz1.f.a.e(dDoubleValue2);
                }
                addTIEventViewModelKa16.C6(cVarE);
            }
            if (dValueOf3 != null) {
                double dDoubleValue3 = dValueOf3.doubleValue();
                ka().G6(ny1.e.TIME);
                ka().D6(Integer.valueOf((int) dDoubleValue3));
            }
            if (ka().J2 && (wVar2 = ka().F2) != null) {
                com.garmin.android.apps.connectmobile.workouts.data.model.k kVar2 = wVar2.f187885d;
                com.garmin.android.apps.connectmobile.workouts.data.model.k kVar3 = wVar2.f187884c;
                com.garmin.android.apps.connectmobile.workouts.data.model.k kVar4 = wVar2.f187883b;
                ka().O6(wVar2.f187882a);
                Double value = kVar4.getValue();
                gg0.i unit = kVar4.getUnit();
                if (unit == null || (bVarB = unit.b()) == null) {
                    bVarB = bg0.a.b.METER;
                }
                ka().N6(new bg0.a.c(value, bVarB), m52.c.LAP_SWIMMING);
                Double value2 = kVar3.getValue();
                gg0.i unit2 = kVar3.getUnit();
                if (unit2 == null || (bVarA = unit2.b()) == null) {
                    bg0.a.f17827a.getClass();
                    bVarA = bg0.a.C0255a.a();
                }
                ka().N6(new bg0.a.c(value2, bVarA), m52.c.CYCLING);
                Double value3 = kVar2.getValue();
                gg0.i unit3 = kVar2.getUnit();
                if (unit3 == null || (bVarA2 = unit3.b()) == null) {
                    bg0.a.f17827a.getClass();
                    bVarA2 = bg0.a.C0255a.a();
                }
                ka().N6(new bg0.a.c(value3, bVarA2), m52.c.RUNNING);
            }
        }
        if (z15) {
            ka().f204392i = Boolean.TRUE;
        }
        if (this.f45722d) {
            AddTIEventViewModel addTIEventViewModelKa17 = ka();
            DateTime dateTime6 = this.f45722d ? null : new DateTime();
            addTIEventViewModelKa17.L6(dateTime6);
            ((y0) addTIEventViewModelKa17.K0.getValue()).m(dateTime6 != null ? dateTime6.toLocalDate() : null);
        } else {
            AddTIEventViewModel addTIEventViewModelKa18 = ka();
            DateTime dateTimeLa = la();
            if (dateTimeLa == null) {
                dateTimeLa = new DateTime();
            }
            addTIEventViewModelKa18.L6(dateTimeLa);
            ((y0) addTIEventViewModelKa18.K0.getValue()).m(dateTimeLa.toLocalDate());
        }
        AddTIEventViewModel addTIEventViewModelKa19 = ka();
        boolean z18 = this.f45721c;
        addTIEventViewModelKa19.f46439u2 = z18 && !this.f45722d;
        if (z18) {
            hideActionBar();
            fg0.k kVar5 = this.f45725g;
            if (kVar5 != null) {
                AddTIEventViewModel addTIEventViewModelKa20 = ka();
                fg0.j eventCustomization = kVar5.getEventCustomization();
                if (eventCustomization == null || (!eventCustomization.t() && !eventCustomization.z() && !eventCustomization.u())) {
                    z14 = false;
                }
                addTIEventViewModelKa20.f46449z2 = z14;
                addTIEventViewModelKa20.f46437t2 = kVar5;
                ge1.b.T(v1.a(addTIEventViewModelKa20), null, null, new mz1.f(this.f45722d, kVar5, this.f45726h, this.f45727i, addTIEventViewModelKa20, null), 3);
                String url = kVar5.getUrl();
                if (url != null) {
                    addTIEventViewModelKa20.T6(url);
                }
            }
        }
        if (ka().D2) {
            ka().F6(gg0.f.f77136l);
            ka().Y5().f(this, new c(new n2(this, 0)));
        }
        ((y0) ka().f46406e2.getValue()).f(this, new c(new n2(this, 1)));
        ka().X.f(this, new c(new n2(this, 2)));
    }

    @Override // z10.p3, com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((y0) ka().f46434s1.getValue()).m(Boolean.FALSE);
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final boolean shouldConsumeInsets() {
        return false;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/TrainingInitiativeEventActivity$a;", "", "<init>", "()V", "", "EXTRA_CREATE_EVENT_TYPE", "Ljava/lang/String;", "EXTRA_ATP_TRAINING_PLAN_ENUM_ORDINAL", "EXTRA_RACE_START_DATE", "EXTRA_RACE_END_DATE", "EXTRA_CALENDAR_SELECTION_DATE", "EXTRA_PROMPT_IF_SELECTED_DATE_BEFORE_MINIMUM", "EXTRA_LAUNCH_FBT_LOCATION_SCREEN", "EXTRA_LAUNCH_FBT_SELECT_TRIATHLON_EVENT", "EXTRA_IS_FBT_EDITING", "", "LAUNCH_COURSE_FROM_TI_EVENT_CREATION", "I", "LAUNCH_REVIEW_FROM_TI_EVENT_DETAILS", "EXTRA_IS_FBT_FIND_CREATE_EVENT", "REQ_CODE_FILTER", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(int i14, Context context) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) TrainingInitiativeEventActivity.class);
            intent.putExtra("extra_create_event_type", i14);
            return intent;
        }

        public static TrainingInitiativeEventActivity b() {
            TrainingInitiativeEventActivity trainingInitiativeEventActivity = TrainingInitiativeEventActivity.f45719p;
            if (trainingInitiativeEventActivity != null) {
                return trainingInitiativeEventActivity;
            }
            p005kotlin.jvm.internal.s.m("instance");
            throw null;
        }

        public static void c(Activity activity, DateTime dateTime, String str, Boolean bool) {
            activity.getClass();
            Intent intent = new Intent(activity, (Class<?>) TrainingInitiativeEventActivity.class);
            if (dateTime == null) {
                dateTime = new DateTime();
            }
            intent.putExtra("extra.date.time", dateTime);
            intent.putExtra("navigating_from_event_dashboard", bool);
            intent.putExtra("GCM_extra_find_event_type", str);
            activity.startActivityForResult(intent, DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE);
        }

        private a() {
        }
    }
}
