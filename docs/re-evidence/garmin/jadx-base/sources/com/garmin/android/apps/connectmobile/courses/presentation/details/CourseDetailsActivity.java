package com.garmin.android.apps.connectmobile.courses.presentation.details;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.g1;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.room.a0;
import b50.p;
import b50.x0;
import c60.e;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.i;
import com.garmin.android.apps.connectmobile.courses.presentation.chart.CourseFullscreenChartActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.q1;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e50.d;
import fg0.k;
import g.h;
import gg1.v0;
import i3.fe;
import java.io.Serializable;
import java.util.List;
import java.util.WeakHashMap;
import o13.m;
import o13.n;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import r22.m0;
import r53.b2;
import r53.c2;
import r53.m1;
import rd2.f;
import rd2.j;
import ro0.l;
import u20.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/details/CourseDetailsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lu20/g;", "Lu40/g;", "Ll40/b;", "<init>", "()V", "a", "Le50/d;", RemoteConfigConstants.ResponseFieldKey.STATE, "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CourseDetailsActivity extends c implements g, u40.g, l40.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f33024k = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f33025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f33026b = m.a(n.NONE, new b(this, null, null, new b50.g(this, 1)));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.c<Intent> f33027c = registerForActivityResult(new h(), new b50.h(0));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.c<Intent> f33028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f.c<Intent> f33029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.c<Intent> f33030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f33031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f33032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f33033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f33034j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f33035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f33036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f33037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f33038d;

        public b(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f33035a = gVar;
            this.f33036b = qualifier;
            this.f33037c = aVar;
            this.f33038d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, b50.p] */
        @Override // e23.a
        public final p invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f33035a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f33037c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(p.class), viewModelStore, null, defaultViewModelCreationExtras, this.f33036b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f33038d, 4, null);
        }
    }

    public CourseDetailsActivity() {
        final int i14 = 0;
        this.f33028d = registerForActivityResult(new h(), new f.b(this) { // from class: b50.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CourseDetailsActivity f15987b;

            {
                this.f15987b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Bundle extras;
                Parcelable parcelable;
                int i15 = i14;
                CourseDetailsActivity courseDetailsActivity = this.f15987b;
                f.a aVar = (f.a) obj;
                switch (i15) {
                    case 0:
                        CourseDetailsActivity.a aVar2 = CourseDetailsActivity.f33024k;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null && (extras = intent.getExtras()) != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_nutrition_hydration_details", w01.c.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("GCM_extra_nutrition_hydration_details");
                                if (!(parcelable2 instanceof w01.c)) {
                                    parcelable2 = null;
                                }
                                parcelable = (w01.c) parcelable2;
                            }
                            w01.c cVar = (w01.c) parcelable;
                            if (cVar != null) {
                                courseDetailsActivity.ia().B4(new e50.a.i0(cVar));
                            }
                            break;
                        }
                        break;
                    case 1:
                        CourseDetailsActivity.a aVar3 = CourseDetailsActivity.f33024k;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            courseDetailsActivity.ia().D4();
                        }
                        break;
                    default:
                        CourseDetailsActivity.a aVar4 = CourseDetailsActivity.f33024k;
                        aVar.getClass();
                        courseDetailsActivity.na();
                        break;
                }
            }
        });
        final int i15 = 1;
        this.f33029e = registerForActivityResult(new h(), new f.b(this) { // from class: b50.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CourseDetailsActivity f15987b;

            {
                this.f15987b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Bundle extras;
                Parcelable parcelable;
                int i16 = i15;
                CourseDetailsActivity courseDetailsActivity = this.f15987b;
                f.a aVar = (f.a) obj;
                switch (i16) {
                    case 0:
                        CourseDetailsActivity.a aVar2 = CourseDetailsActivity.f33024k;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null && (extras = intent.getExtras()) != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_nutrition_hydration_details", w01.c.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("GCM_extra_nutrition_hydration_details");
                                if (!(parcelable2 instanceof w01.c)) {
                                    parcelable2 = null;
                                }
                                parcelable = (w01.c) parcelable2;
                            }
                            w01.c cVar = (w01.c) parcelable;
                            if (cVar != null) {
                                courseDetailsActivity.ia().B4(new e50.a.i0(cVar));
                            }
                            break;
                        }
                        break;
                    case 1:
                        CourseDetailsActivity.a aVar3 = CourseDetailsActivity.f33024k;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            courseDetailsActivity.ia().D4();
                        }
                        break;
                    default:
                        CourseDetailsActivity.a aVar4 = CourseDetailsActivity.f33024k;
                        aVar.getClass();
                        courseDetailsActivity.na();
                        break;
                }
            }
        });
        final int i16 = 2;
        this.f33030f = registerForActivityResult(new h(), new f.b(this) { // from class: b50.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CourseDetailsActivity f15987b;

            {
                this.f15987b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Bundle extras;
                Parcelable parcelable;
                int i17 = i16;
                CourseDetailsActivity courseDetailsActivity = this.f15987b;
                f.a aVar = (f.a) obj;
                switch (i17) {
                    case 0:
                        CourseDetailsActivity.a aVar2 = CourseDetailsActivity.f33024k;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null && (extras = intent.getExtras()) != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_nutrition_hydration_details", w01.c.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("GCM_extra_nutrition_hydration_details");
                                if (!(parcelable2 instanceof w01.c)) {
                                    parcelable2 = null;
                                }
                                parcelable = (w01.c) parcelable2;
                            }
                            w01.c cVar = (w01.c) parcelable;
                            if (cVar != null) {
                                courseDetailsActivity.ia().B4(new e50.a.i0(cVar));
                            }
                            break;
                        }
                        break;
                    case 1:
                        CourseDetailsActivity.a aVar3 = CourseDetailsActivity.f33024k;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            courseDetailsActivity.ia().D4();
                        }
                        break;
                    default:
                        CourseDetailsActivity.a aVar4 = CourseDetailsActivity.f33024k;
                        aVar.getClass();
                        courseDetailsActivity.na();
                        break;
                }
            }
        });
    }

    public static String fa(long j8) {
        f.a().f152045a.getClass();
        String productDisplayName = null;
        sd2.f fVarI = j.i(j8, null);
        if (fVarI != null) {
            String displayName = fVarI.getDisplayName();
            productDisplayName = (displayName == null || displayName.length() == 0) ? fVarI.getProductDisplayName() : fVarI.getDisplayName();
        }
        return productDisplayName == null ? "" : productDisplayName;
    }

    @Override // l40.b
    public final void F3(l40.a aVar) {
        ia().F3(aVar);
    }

    @Override // l40.b
    /* JADX INFO: renamed from: S2 */
    public final b2 getF102929e() {
        return ia().D;
    }

    @Override // u20.g
    public final void c4(int i14, int i15, List list) {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        e.c(supportFragmentManager);
        p pVarIa = ia();
        pVarIa.getClass();
        pVarIa.z4(e50.b.e.f62955a);
        v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        e.g(list, i14, i15, supportFragmentManager2, new b50.f(this, 4), new b50.c(this, 6), new b50.c(this, 7));
        p pVarIa2 = ia();
        int i16 = getResources().getDisplayMetrics().heightPixels / 2;
        pVarIa2.getClass();
        pVarIa2.z4(new e50.b.o(i16));
        p pVarIa3 = ia();
        pVarIa3.getClass();
        pVarIa3.z4(new e50.b.g(i14));
    }

    public final void ca() {
        com.garmin.android.apps.connectmobile.courses.model.e eVarEa = ea();
        if (eVarEa != null) {
            String str = eVarEa.courseName;
            if (str == null) {
                str = "";
            }
            p pVarIa = ia();
            String string = getString(R.string.workout_duplicate_default_format, str);
            string.getClass();
            pVarIa.B4(new e50.a.g(string));
        }
    }

    public final void da(long j8, String str, String str2) {
        s20.h hVar = (s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null);
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        hVar.y(applicationContext, j8);
        m0 m0VarB = m0.a.b(m0.f149759e, str, str2, 376);
        m0VarB.show(getSupportFragmentManager(), "SEND_TO_DEVICE_SUCCESS_MESSAGE");
        new Handler(Looper.getMainLooper()).postDelayed(new b50.e(m0VarB, 0), 1500L);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        p pVarIa = ia();
        pVarIa.getClass();
        pVarIa.z4(e50.b.f.f62956a);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final com.garmin.android.apps.connectmobile.courses.model.e ea() {
        w20.a aVar = ((d) ia().f16042z.f150540a.getValue()).f62992d;
        if (aVar != null) {
            return aVar.f181476a;
        }
        return null;
    }

    public final List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> ga() {
        w20.d dVar = ((d) ia().f16042z.f150540a.getValue()).f62994f;
        if (dVar != null) {
            return dVar.f181493a;
        }
        return null;
    }

    public final ab1.g ha() {
        w20.e eVar = ((d) ia().f16042z.f150540a.getValue()).f62995g;
        if (eVar != null) {
            return eVar.f181494a;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final p ia() {
        return (p) this.f33026b.getValue();
    }

    @Override // u20.g
    /* JADX INFO: renamed from: j6 */
    public final i getF104023a() {
        Serializable serializable;
        i iVarM;
        com.garmin.android.apps.connectmobile.courses.model.e eVarEa = ea();
        if (eVarEa != null && (iVarM = eVarEa.m()) != null) {
            return iVarM;
        }
        Bundle bundle = this.f33025a;
        i iVar = null;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundle.getSerializable("GCM_extra_course_type", i.class);
            } else {
                Serializable serializable2 = bundle.getSerializable("GCM_extra_course_type");
                serializable = (i) (serializable2 instanceof i ? serializable2 : null);
            }
            iVar = (i) serializable;
        }
        return iVar == null ? i.OTHER : iVar;
    }

    public final boolean ja() {
        w20.c cVar = ((d) ia().f16042z.f150540a.getValue()).f62993e;
        List<k> list = cVar != null ? cVar.f181492a : null;
        return !(list == null || list.isEmpty());
    }

    public final boolean ka() {
        w20.c cVar = ((d) ia().f16042z.f150540a.getValue()).f62993e;
        Object obj = null;
        if (cVar != null) {
            for (Object obj2 : cVar.f181492a) {
                fg0.c cVarZ = ((k) obj2).getEventPrivacy();
                if (cVarZ != null ? s.g(cVarZ.getIsShareable(), Boolean.TRUE) : false) {
                    obj = obj2;
                    break;
                }
            }
            obj = (k) obj;
        }
        return obj != null;
    }

    @Override // u20.g
    public final void l8(fn0.a aVar) {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        e.c(supportFragmentManager);
        p pVarIa = ia();
        pVarIa.getClass();
        pVarIa.z4(e50.b.e.f62955a);
        v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        e.p(aVar, supportFragmentManager2, new ao1.i(27, this, aVar), new b50.f(this, 3), new b50.c(this, 5));
        p pVarIa2 = ia();
        pVarIa2.getClass();
        pVarIa2.z4(new e50.b.i(aVar));
    }

    public final void la() {
        Intent intentB = z6.i.b(this);
        if (intentB == null) {
            finish();
            return;
        }
        intentB.setFlags(67108864);
        startActivity(intentB);
        finish();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    public final void ma(e50.a aVar) {
        Boolean boolD;
        u20.d dVarU6;
        i iVarM;
        if (s.g(aVar, e50.a.b.f62908a)) {
            com.garmin.android.apps.connectmobile.courses.model.e eVarEa = ea();
            if (eVarEa != null) {
                t41.d dVar = new t41.d(this);
                if (dVar.a(eVarEa.q())) {
                    ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).o(this, eVarEa);
                } else {
                    dVar.b();
                }
            }
        } else {
            if (aVar instanceof e50.a.c) {
                ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).p(this, ((e50.a.c) aVar).f62910a);
                return;
            }
            boolean z14 = true;
            if (s.g(aVar, e50.a.d.f62913a)) {
                List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> listGa = ga();
                if (listGa == null || listGa.isEmpty()) {
                    com.garmin.android.apps.connectmobile.courses.model.e eVarEa2 = ea();
                    if (eVarEa2 != null && (iVarM = eVarEa2.m()) != null && iVarM.c() && ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).a() && ea() != null) {
                        com.garmin.android.apps.connectmobile.courses.model.e eVarEa3 = ea();
                        if (!sa1.h.e(eVarEa3 != null ? eVarEa3.q() : 0.0d) && ja()) {
                            dVarU6 = u20.d.u6(getString(R.string.ti_msg_course_confirm_delete, getString(R.string.power_guide_title)), getString(R.string.lbl_delete), getString(R.string.lbl_cancel));
                        } else if (ha() != null) {
                            dVarU6 = u20.d.u6(getString(R.string.power_guide_delete_course_msg), getString(R.string.lbl_delete), getString(R.string.lbl_cancel));
                        } else {
                            String string = getString(R.string.msg_course_confirm_delete);
                            u20.d dVar2 = new u20.d();
                            Bundle bundle = new Bundle();
                            bundle.putString("ENTITY_NAME_EXTRA", string);
                            dVar2.setArguments(bundle);
                            dVarU6 = dVar2;
                        }
                    } else if (ha() != null) {
                        dVarU6 = u20.d.u6(getString(R.string.power_guide_delete_course_msg), getString(R.string.lbl_delete), getString(R.string.lbl_cancel));
                    } else {
                        String string2 = getString(R.string.msg_course_confirm_delete);
                        u20.d dVar3 = new u20.d();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("ENTITY_NAME_EXTRA", string2);
                        dVar3.setArguments(bundle2);
                        dVarU6 = dVar3;
                    }
                } else {
                    dVarU6 = u20.d.u6(getString(R.string.lbl_pacepro_delete_course_message), getString(R.string.lbl_delete), getString(R.string.lbl_cancel));
                }
                dVarU6.f167881a = new b50.d(this, 0);
                dVarU6.show(getSupportFragmentManager(), "DeleteDialogFragment");
                return;
            }
            if (s.g(aVar, e50.a.C1326a.f62905a)) {
                ca();
                return;
            }
            if (s.g(aVar, e50.a.j.f62928a)) {
                onBackPressed();
                return;
            }
            if (s.g(aVar, e50.a.k.f62929a)) {
                w20.a aVar2 = ((d) ia().f16042z.f150540a.getValue()).f62992d;
                List<ClimbDTO> list = aVar2 != null ? aVar2.f181477b : null;
                if (list != null && !list.isEmpty()) {
                    v supportFragmentManager = getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    e.c(supportFragmentManager);
                    p pVarIa = ia();
                    pVarIa.getClass();
                    pVarIa.z4(e50.b.e.f62955a);
                    v supportFragmentManager2 = getSupportFragmentManager();
                    supportFragmentManager2.getClass();
                    e.i(list, supportFragmentManager2, new aa2.f(7, this, list), new b50.f(this, 0), new b50.c(this, 1), new b50.g(this, 0));
                }
            } else if (s.g(aVar, e50.a.l.f62930a)) {
                com.garmin.android.apps.connectmobile.courses.model.e eVarEa4 = ea();
                String str = eVarEa4 != null ? eVarEa4.courseId : null;
                if (str != null) {
                    w40.e.f181932h.getClass();
                    w40.e eVar = new w40.e();
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("COURSE_ID", str);
                    eVar.setArguments(bundle3);
                    eVar.show(getSupportFragmentManager(), "");
                }
            } else {
                if (!s.g(aVar, e50.a.n.f62932a)) {
                    if (aVar instanceof e50.a.o) {
                        k kVar = ((e50.a.o) aVar).f62933a;
                        CalendarItemDTO calendarItemDTO = new CalendarItemDTO();
                        fg0.c cVarZ = kVar.getEventPrivacy();
                        calendarItemDTO.I1 = (cVarZ == null || (boolD = cVarZ.getIsShareable()) == null) ? false : boolD.booleanValue();
                        calendarItemDTO.H1 = kVar.getShareableEventUuid();
                        Long lG = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                        calendarItemDTO.f30967a = lG != null ? (int) lG.longValue() : 0;
                        ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).b(this, calendarItemDTO);
                        return;
                    }
                    if (s.g(aVar, e50.a.p.f62934a)) {
                        HelpActivity.a.e(HelpActivity.f36653a, this, l.SAVED_COURSE, null, null, 12);
                        return;
                    }
                    if (aVar instanceof e50.a.q) {
                        ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).w(this, ((e50.a.q) aVar).f62935a, this.f33028d);
                        return;
                    }
                    if (aVar instanceof e50.a.r) {
                        ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).l(this, ((e50.a.r) aVar).f62936a);
                        return;
                    }
                    if (aVar instanceof e50.a.s) {
                        e50.a.s sVar = (e50.a.s) aVar;
                        ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).j(this, sVar.f62937a, String.valueOf(sVar.f62938b));
                        return;
                    }
                    if (aVar instanceof e50.a.a0) {
                        e50.a.a0 a0Var = (e50.a.a0) aVar;
                        double d14 = a0Var.f62906a;
                        double d15 = a0Var.f62907b;
                        StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("geo:0,0?q=", d14, ",");
                        sbA.append(d15);
                        Intent intentCreateChooser = Intent.createChooser(new Intent("android.intent.action.VIEW", Uri.parse(sbA.toString())), getString(R.string.lbl_driving_directions));
                        intentCreateChooser.getClass();
                        this.f33027c.a(intentCreateChooser, null);
                        return;
                    }
                    if (s.g(aVar, e50.a.t.f62939a)) {
                        com.garmin.android.apps.connectmobile.courses.model.e eVarEa5 = ea();
                        if (eVarEa5 != null) {
                            s20.h hVar = (s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null);
                            com.garmin.android.library.mapsdkadapter.i.b bVarZ = eVarEa5.z();
                            k30.h.f102548c.getClass();
                            boolean zG = eVarEa5.G();
                            if (!g22.n.d(eVarEa5.getFinishNote()) && !g22.n.d(eVarEa5.getStartNote()) && eVarEa5.getCutoffDuration() == null) {
                                List<com.garmin.android.apps.connectmobile.courses.model.g> listJ = eVarEa5.j();
                                if (listJ == null || listJ.isEmpty()) {
                                    z14 = false;
                                } else {
                                    for (com.garmin.android.apps.connectmobile.courses.model.g gVar : listJ) {
                                        if (gVar.cutoffDuration != null || gVar.restDuration != null || gVar.note != null) {
                                        }
                                    }
                                    z14 = false;
                                }
                            }
                            hVar.g(this, bVarZ, new k30.h(zG, z14));
                            ht.a.f85464a.getClass();
                            ht.a.a(null, "P2PSendCourseToDevice");
                            return;
                        }
                        return;
                    }
                    if (aVar instanceof e50.a.u) {
                        long j8 = ((e50.a.u) aVar).f62940a;
                        com.garmin.android.apps.connectmobile.courses.model.e eVarEa6 = ea();
                        if (eVarEa6 != null) {
                            this.f33031g = j8;
                            ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).e(this, eVarEa6.z());
                            return;
                        }
                        return;
                    }
                    if (aVar instanceof e50.a.v) {
                        com.garmin.android.apps.connectmobile.courses.model.e eVarEa7 = ea();
                        if (eVarEa7 != null) {
                            ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).d(this, eVarEa7.z());
                            return;
                        }
                        return;
                    }
                    if (!s.g(aVar, e50.a.e0.f62917a)) {
                        e50.a.f0 f0Var = e50.a.f0.f62919a;
                        if (!s.g(aVar, f0Var)) {
                            ia().B4(aVar);
                            return;
                        }
                        com.garmin.android.apps.connectmobile.courses.model.e eVarEa8 = ea();
                        if (eVarEa8 != null) {
                            boolean z15 = eVarEa8.isFavorite;
                            boolean zG2 = s.g(String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), eVarEa8.userProfilePk);
                            if (!z15 || zG2) {
                                ia().B4(f0Var);
                                return;
                            }
                            String string3 = getString(R.string.msg_remove_favorite_course);
                            string3.getClass();
                            q1.b bVar = q1.f41066b;
                            b50.d dVar4 = new b50.d(this, 3);
                            bVar.getClass();
                            q1 q1VarA = q1.b.a(0, string3, R.string.lbl_common_continue, R.string.lbl_cancel, dVar4);
                            v supportFragmentManager3 = getSupportFragmentManager();
                            supportFragmentManager3.getClass();
                            q1VarA.v6(supportFragmentManager3, "GCMFragTwoBttnAlertDialog");
                            return;
                        }
                        return;
                    }
                    com.garmin.android.apps.connectmobile.courses.model.e eVarEa9 = ea();
                    if (eVarEa9 == null) {
                        return;
                    }
                    if (eVarEa9.Z()) {
                        String string4 = getString(R.string.lbl_unable_to_share);
                        string4.getClass();
                        String string5 = getString(R.string.lbl_trail_course_unable_to_be_shared);
                        string5.getClass();
                        q1.f41066b.getClass();
                        q1 q1VarC = q1.b.c(string4, string5, R.string.lbl_ok, 0, null);
                        v supportFragmentManager4 = getSupportFragmentManager();
                        supportFragmentManager4.getClass();
                        q1VarC.v6(supportFragmentManager4, "GCMFragTwoBttnAlertDialog");
                        return;
                    }
                    if (eVarEa9.f0()) {
                        String str2 = eVarEa9.applicationName;
                        String string6 = getString(R.string.title_sharing_private_course);
                        string6.getClass();
                        String string7 = getString(R.string.msg_sharing_third_party_course, str2);
                        string7.getClass();
                        q1.b bVar2 = q1.f41066b;
                        b50.d dVar5 = new b50.d(this, 2);
                        bVar2.getClass();
                        q1 q1VarC2 = q1.b.c(string6, string7, R.string.lbl_create_a_duplicate, R.string.lbl_cancel, dVar5);
                        v supportFragmentManager5 = getSupportFragmentManager();
                        supportFragmentManager5.getClass();
                        q1VarC2.v6(supportFragmentManager5, "GCMFragTwoBttnAlertDialog");
                        return;
                    }
                    if (eVarEa9.e0()) {
                        oa();
                        return;
                    }
                    String string8 = getString(R.string.title_sharing_private_course);
                    string8.getClass();
                    String string9 = getString(R.string.msg_sharing_private_course_refined);
                    string9.getClass();
                    q1.b bVar3 = q1.f41066b;
                    b50.d dVar6 = new b50.d(this, 1);
                    bVar3.getClass();
                    q1 q1VarC3 = q1.b.c(string8, string9, R.string.lbl_course_make_public, R.string.lbl_cancel, dVar6);
                    v supportFragmentManager6 = getSupportFragmentManager();
                    supportFragmentManager6.getClass();
                    q1VarC3.v6(supportFragmentManager6, "GCMFragTwoBttnAlertDialog");
                    return;
                }
                com.garmin.android.apps.connectmobile.courses.model.e eVarEa10 = ea();
                if (((d) ia().f16041y.getValue()).f63000l == null && eVarEa10 != null) {
                    CourseFullscreenChartActivity.f33012a.getClass();
                    CourseFullscreenChartActivity.a.a(this, eVarEa10);
                }
            }
        }
    }

    public final void na() {
        com.garmin.android.apps.connectmobile.courses.model.e eVarEa = ea();
        if (eVarEa != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.EDIT");
            Bundle bundle = new Bundle();
            bundle.putParcelable("GCM_extra_course", new com.garmin.android.apps.connectmobile.courses.model.d(eVarEa));
            com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
            setResult(-1, intent);
        }
    }

    public final void oa() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.addFlags(1);
        p pVarIa = ia();
        pVarIa.getClass();
        v0.T.getClass();
        intent.putExtra("android.intent.extra.TEXT", v0.a.b().b() + "/modern/course/" + pVarIa.f16019a);
        Intent intentCreateChooser = Intent.createChooser(intent, getString(R.string.lbl_share));
        intentCreateChooser.getClass();
        this.f33030f.a(intentCreateChooser, null);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Long l14;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 4) {
            long jZ = ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).z();
            if (jZ > 0) {
                ia().B4(new e50.a.c0(this.f33031g, jZ));
                return;
            }
            return;
        }
        if (i14 == 55) {
            ia().E4();
            return;
        }
        if (i14 != 100) {
            if (i14 == 123) {
                ab1.g gVarHa = ha();
                long jLongValue = (gVarHa == null || (l14 = gVarHa.f2568a) == null) ? -1L : l14.longValue();
                if (jLongValue > -1) {
                    long jA = ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).A();
                    if (jA > -1) {
                        ia().B4(new e50.a.d0(jLongValue, jA));
                        return;
                    }
                    return;
                }
                return;
            }
            if (i14 == 345) {
                if (i15 == -1) {
                    ia().D4();
                    ia().E4();
                    return;
                }
                return;
            }
            if (i14 == 500) {
                long jU = ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).u();
                if (jU > 0) {
                    ia().B4(new e50.a.b0(jU));
                    return;
                }
                return;
            }
            if (i14 != 1555) {
                return;
            }
        }
        ia().D4();
        p pVarIa = ia();
        e30.l lVar = pVarIa.f16026h;
        String str = pVarIa.f16019a;
        boolean z14 = pVarIa.f16021c;
        lVar.getClass();
        m1 m1Var = new m1(new c2(new e30.k(str, z14, lVar, null)), new x0(pVarIa, null));
        x53.c cVar = o53.s0.f129406a;
        r53.s.C(r53.s.A(m1Var, x53.b.f189152a), v1.a(pVarIa));
        na();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (this.f33032h) {
            la();
        }
        na();
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.course_details_content);
        if (bundle == null) {
            Intent intent = getIntent();
            bundle = intent != null ? intent.getExtras() : null;
        }
        this.f33025a = bundle;
        this.f33032h = bundle != null ? bundle.getBoolean("GCM_extra_course_navigate_up", false) : false;
        Bundle bundle2 = this.f33025a;
        this.f33034j = bundle2 != null ? bundle2.getBoolean("startedFromCourseList", false) : false;
        Bundle bundle3 = this.f33025a;
        this.f33033i = bundle3 != null ? bundle3.getBoolean("deep_link", false) : false;
        Bundle bundle4 = this.f33025a;
        if (bundle4 != null ? bundle4.getBoolean("showElevationDialog", false) : false) {
            u20.e.u6(R.string.third_party_courses_elevation_lbl, R.string.third_party_courses_elevation_msg).g(getSupportFragmentManager());
        }
        View viewFindViewById = findViewById(R.id.course_details_layout);
        a0 a0Var = new a0(29);
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(viewFindViewById, a0Var);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(133582302, true, new b50.f(this, 2)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.f33033i) {
            ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).v(this);
        } else if (this.f33032h) {
            la();
        }
        na();
        finishAfterTransition();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putAll(this.f33025a);
    }

    @Override // u20.g
    public final void p5(com.garmin.android.library.mapsdkadapter.e eVar, List<? extends fn0.c> list) {
        list.getClass();
        p pVarIa = ia();
        w20.a aVar = ((d) pVarIa.f16041y.getValue()).f62992d;
        List<fn0.a> list2 = aVar != null ? aVar.f181478c : null;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        pVarIa.z4(new e50.b.w(list2));
    }

    public final void pa(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
        ia().F4(false);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        e.l(gVar, supportFragmentManager, new b50.b(this, gVar, 0), new b50.a(this, gVar, 1), null, null, new b50.c(this, 0), new b50.b(this, gVar, 1));
    }

    @Override // u20.g
    public final void q8() {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        e.b(supportFragmentManager);
    }

    public final void qa(fe feVar, String str, String str2) {
        ge1.b.T(f0.w(this), null, null, new b50.n(feVar, str, str2, null), 3);
    }

    @Override // u40.g
    public final void z4(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
        if (gVar.g()) {
            return;
        }
        bv.b.f21239a.getClass();
        bv.b.a();
        if (!k1.f37122a.s()) {
            v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            e.c(supportFragmentManager);
            p pVarIa = ia();
            pVarIa.getClass();
            pVarIa.z4(e50.b.e.f62955a);
            v supportFragmentManager2 = getSupportFragmentManager();
            supportFragmentManager2.getClass();
            e.k(gVar, supportFragmentManager2, new b50.c(this, 4), new b50.b(this, gVar, 5), false, null);
            ia().A4(gVar);
            return;
        }
        com.garmin.android.apps.connectmobile.courses.model.e eVarEa = ea();
        if (eVarEa == null) {
            return;
        }
        v supportFragmentManager3 = getSupportFragmentManager();
        supportFragmentManager3.getClass();
        e.c(supportFragmentManager3);
        p pVarIa2 = ia();
        pVarIa2.getClass();
        pVarIa2.z4(e50.b.e.f62955a);
        boolean z14 = eVarEa.c0() && !eVarEa.f0();
        v supportFragmentManager4 = getSupportFragmentManager();
        supportFragmentManager4.getClass();
        e.j(gVar, z14, supportFragmentManager4, new b50.c(this, 8), new b50.b(gVar, this), new b50.a(this, gVar, 2), null, null, new b50.b(this, gVar, 7), new b50.b(this, gVar, 8));
        ia().A4(gVar);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/details/CourseDetailsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "SEND_COURSE_TO_DEVICE_REQUEST_CODE", "I", "POWER_GUIDE_CREATE_REQUEST_CODE", "SEND_TO_DEVICE_SUCCESS_MESSAGE", "EXTRA_SHOW_ELEVATION_UPDATED_DIALOG", "EXTRA_STARTED_FROM_COURSE_LIST", "EXTRA_DEEP_LINK", "EXTRA_READ_ONLY_MODE", "", "SEND_TO_DEVICE_SUCCESS_DELAY", "J", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Activity activity, com.garmin.android.apps.connectmobile.courses.model.d dVar, int i14) {
            if (activity != null) {
                Intent intent = new Intent(activity, (Class<?>) CourseDetailsActivity.class);
                intent.putExtra("startedFromCourseList", false);
                intent.putExtra("GCM_extra_course_id", dVar.courseId);
                i.a aVar = i.f32968g;
                am.x0 x0VarC = dVar.C();
                aVar.getClass();
                intent.putExtra("GCM_extra_course_type", i.a.a(x0VarC));
                activity.startActivityForResult(intent, i14);
            }
        }

        public static void b(Activity activity, com.garmin.android.apps.connectmobile.courses.model.e eVar, int i14) {
            if (activity != null) {
                Intent intent = new Intent(activity, (Class<?>) CourseDetailsActivity.class);
                intent.putExtra("GCM_extra_course_navigate_up", true);
                intent.putExtra("GCM_extra_course_id", eVar.courseId);
                intent.putExtra("GCM_extra_course_type", eVar.m());
                activity.startActivityForResult(intent, i14);
            }
        }

        public static void c(Activity activity, com.garmin.android.apps.connectmobile.courses.model.e eVar, boolean z14) {
            eVar.getClass();
            if (activity != null) {
                Intent intent = new Intent(activity, (Class<?>) CourseDetailsActivity.class);
                intent.putExtra("GCM_extra_course_navigate_up", z14);
                intent.putExtra("GCM_extra_course_id", eVar.courseId);
                intent.putExtra("GCM_extra_course_type", eVar.m());
                activity.startActivity(intent);
            }
        }

        private a() {
        }
    }
}
