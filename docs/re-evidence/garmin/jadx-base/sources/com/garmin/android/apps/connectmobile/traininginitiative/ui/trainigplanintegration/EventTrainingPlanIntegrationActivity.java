package com.garmin.android.apps.connectmobile.traininginitiative.ui.trainigplanintegration;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.g1;
import androidx.core.view.s0;
import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.m2;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.EventGoalActivity;
import d92.b;
import fg0.k;
import g.h;
import h4.d;
import h4.r;
import h5.e0;
import i3.mh;
import j92.e;
import j92.f;
import java.util.WeakHashMap;
import kd0.h6;
import l72.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.y0;
import ww1.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/trainigplanintegration/EventTrainingPlanIntegrationActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EventTrainingPlanIntegrationActivity extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46267e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f46268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f46269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.c<Intent> f46271d = registerForActivityResult(new h(), new jp.a(this, 3));

    /* JADX WARN: Code duplicated, block: B:48:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:61:0x0257  */
    /* JADX WARN: Code duplicated, block: B:63:0x025e  */
    public final void ca(String str, g gVar, m mVar, int i14) {
        int i15;
        boolean z14;
        boolean z15;
        Object objQ;
        Object obj = gVar;
        o0 o0VarE = mVar.E(1669162792);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(obj) : o0VarE.r(obj) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(this) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarD = x2.d(aVar, 1.0f);
            b.f58623a.getClass();
            j92.b bVar = b.f58625c;
            bVar.getClass();
            e eVar = j92.b.f97899b;
            float f14 = eVar.f97922g;
            bVar.getClass();
            r rVarZ = l.z(rVarD, eVar.f97920e, f14);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            d.f81522a.getClass();
            z zVarA = y.a(kVar, d.a.f81537o, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            t4.d dVarA = n5.c.a(R.drawable.ic_event_icon, o0VarE, 0);
            bVar.getClass();
            j92.c cVar = j92.b.f97901d;
            float f15 = cVar.f97907f;
            bVar.getClass();
            r rVarR = x2.r(aVar, f15, cVar.f97907f);
            f5.k.f68985a.getClass();
            int i16 = i15;
            y0.a(dVarA, null, rVarR, null, f5.k.a.f68990e, 0.0f, null, o0VarE, 24624, 104);
            bVar.getClass();
            r rVarC2 = l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            String strQ = gl1.y.Q(o0VarE, R.string.event_added);
            f fVar = b.f58624b;
            fVar.getClass();
            mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(f.f97930g), o0VarE), o0VarE, 0, 0, 131068);
            r rVarF = x2.f(aVar, 1.0f);
            bVar.getClass();
            r rVarC3 = l.C(rVarF, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
            d6.h.f57752b.getClass();
            int i17 = d6.h.f57755e;
            String strP = gl1.y.P(R.string.event_added_create_training_plan, new Object[]{str}, o0VarE);
            fVar.getClass();
            mh.c(strP, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, d92.c.b(f.f97932i, o0VarE), o0VarE, 0, 0, 130044);
            l.f(b0Var.a(aVar, 1.0f, true), o0VarE);
            f0 f0Var = f0.f110999a;
            String strQ2 = gl1.y.Q(o0VarE, R.string.not_now_lbl);
            r rVarF2 = x2.f(aVar, 1.0f);
            bVar.getClass();
            r rVarC4 = l.C(rVarF2, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
            boolean zR = o0VarE.r(this);
            Object objQ2 = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (zR) {
                objQ2 = new jx0.e(this, 28);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new jx0.e(this, 28);
                    o0VarE.K(objQ2);
                }
            }
            f0Var.i(strQ2, rVarC4, false, (e23.a) objQ2, o0VarE, 0, 4);
            o0VarE = o0VarE;
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_setup_plan);
            r rVarF3 = x2.f(aVar, 1.0f);
            bVar.getClass();
            r rVarC5 = l.C(rVarF3, 0.0f, 0.0f, 0.0f, eVar.f97922g, 7);
            boolean zR2 = o0VarE.r(this);
            if ((i16 & 112) != 32) {
                obj = gVar;
                if ((i16 & 64) == 0 || !o0VarE.r(obj)) {
                    z14 = false;
                }
                z15 = zR2 | z14;
                objQ = o0VarE.q();
                if (z15) {
                    objQ = new k11.h(20, this, obj);
                    o0VarE.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new k11.h(20, this, obj);
                        o0VarE.K(objQ);
                    }
                }
                f0Var.d(0, 9, (e23.a) objQ, rVarC5, strQ3, o0VarE, null, false);
                o0VarE.g0(true);
            } else {
                obj = gVar;
            }
            z14 = true;
            z15 = zR2 | z14;
            objQ = o0VarE.q();
            if (z15) {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new k11.h(20, this, obj);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new k11.h(20, this, obj);
                o0VarE.K(objQ);
            }
            f0Var.d(0, 9, (e23.a) objQ, rVarC5, strQ3, o0VarE, null, false);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(this, str, obj, i14, 11);
        }
    }

    public final void da() {
        ht.a.f85464a.getClass();
        ht.a.a(null, "CreateTrainingPlanFromEventFlow");
        k kVar = this.f46268a;
        if (kVar == null) {
            p92.y.f136664a.getClass();
            p92.y.a.c("EventTrainingPlanIntegrationActivity", "Event DTO or ActiveTrainingPlanDTO is null which is not expected");
        } else {
            rt1.m mVar = (rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null);
            g gVar = this.f46269b;
            Bundle extras = getIntent().getExtras();
            this.f46271d.a(mVar.u(this, kVar, gVar, true, extras != null ? extras.getBoolean("extras_launch_event_details") : false), null);
        }
    }

    public final void ea(fg0.j jVar) {
        Boolean isShareable;
        k kVar = this.f46268a;
        if (kVar != null) {
            CalendarItemDTO calendarItemDTO = new CalendarItemDTO();
            fg0.c eventPrivacy = kVar.getEventPrivacy();
            calendarItemDTO.I1 = (eventPrivacy == null || (isShareable = eventPrivacy.getIsShareable()) == null) ? false : isShareable.booleanValue();
            calendarItemDTO.H1 = kVar.getShareableEventUuid();
            Long l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            calendarItemDTO.f30967a = l14 != null ? (int) l14.longValue() : 0;
            EventGoalActivity.a aVar = EventGoalActivity.f45976e;
            boolean z14 = false;
            int i14 = this.f46270c;
            g gVar = this.f46269b;
            if (gVar != null && gVar.f187763a && gVar.f187767e != null) {
                z14 = true;
            }
            aVar.getClass();
            this.f46271d.a(EventGoalActivity.a.a(this, kVar, calendarItemDTO, i14, z14, jVar), null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.composable_container_w_tool_bar);
        View viewFindViewById = findViewById(R.id.toolbar_actionbar_default);
        kg.f fVar = new kg.f(11);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        s0.d.c(viewFindViewById, fVar);
        Bundle extras = getIntent().getExtras();
        int i14 = Build.VERSION.SDK_INT;
        Parcelable parcelable2 = null;
        if (i14 >= 33) {
            parcelable = extras != null ? (Parcelable) extras.getParcelable("GCM_extra_event", k.class) : null;
        } else {
            Parcelable parcelable3 = extras != null ? extras.getParcelable("GCM_extra_event") : null;
            if (!(parcelable3 instanceof k)) {
                parcelable3 = null;
            }
            parcelable = (k) parcelable3;
        }
        this.f46268a = (k) parcelable;
        Bundle extras2 = getIntent().getExtras();
        if (i14 < 33) {
            Parcelable parcelable4 = extras2 != null ? extras2.getParcelable("extra_active_plan_info_dto") : null;
            parcelable2 = (g) (parcelable4 instanceof g ? parcelable4 : null);
        } else if (extras2 != null) {
            parcelable2 = (Parcelable) extras2.getParcelable("extra_active_plan_info_dto", g.class);
        }
        this.f46269b = (g) parcelable2;
        Bundle extras3 = getIntent().getExtras();
        int i15 = 0;
        this.f46270c = extras3 != null ? extras3.getInt("extra_no_upcoming_event") : 0;
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(-740343726, true, new kz1.a(this, i15)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final boolean shouldConsumeInsets() {
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/trainigplanintegration/EventTrainingPlanIntegrationActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(androidx.fragment.app.m mVar, k kVar, g gVar, int i14, boolean z14) {
            kVar.getClass();
            gVar.getClass();
            Intent intent = new Intent(mVar, (Class<?>) EventTrainingPlanIntegrationActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("GCM_extra_event", kVar);
            bundle.putParcelable("extra_active_plan_info_dto", gVar);
            bundle.putInt("extra_no_upcoming_event", i14);
            bundle.putBoolean("extras_launch_event_details", z14);
            m2.a(intent, bundle);
            mVar.startActivityForResult(intent, 500);
        }

        private a() {
        }
    }
}
