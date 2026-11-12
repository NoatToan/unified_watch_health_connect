package a4;

import a61.d0;
import ab.j;
import am.x0;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.camera.core.impl.o0;
import androidx.camera.core.impl.t1;
import androidx.camera.core.impl.z1;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.v;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import aw1.h;
import b0.q;
import b0.u;
import c22.j0;
import c22.l3;
import com.garmin.android.apps.connectmobile.GCMActivityStartup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.bic.CollectDobActivity;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQStorageManagementActivity;
import com.garmin.android.apps.connectmobile.connectiq.n0;
import com.garmin.android.apps.connectmobile.consent.ConsentDeleteDataActivity;
import com.garmin.android.apps.connectmobile.contacts.ContactActivity;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.devices.setup.wizard.BLEDeviceSetupWizardActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.performance.trainingload.LoadFocusView;
import com.garmin.android.apps.connectmobile.s2;
import com.garmin.android.apps.connectmobile.startup.StartupChecksActivity;
import com.garmin.android.apps.connectmobile.strava.StravaConfigActivity;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.RescheduleWorkoutActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.editgoal.FBTEditGoalActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.workouts.FBTWorkoutScheduleActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.components.ui.GCMComplexTwoLineEventButton;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.w2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.o;
import com.garmin.android.livesessionview.LiveActivityActivity;
import com.garmin.feature.garminpay.ui.dev.devices.DevDevicesActivity;
import com.roomorama.caldroid.CaldroidFragment;
import d53.w;
import e71.g;
import ew1.a2;
import ew1.i1;
import ew1.w1;
import f12.l;
import f20.i;
import fg0.a0;
import fg0.k;
import fw.m;
import fw.p;
import g22.e;
import i3.e5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import jv1.f;
import jv1.n;
import l20.r;
import lc.u0;
import o53.l1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.h0;
import p3.p1;
import q53.t;
import xw1.d;
import y10.m0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f946b;

    public /* synthetic */ b(o0 o0Var, String str) {
        this.f945a = 4;
        this.f946b = o0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(Object obj) {
        RescheduleWorkoutActivity rescheduleWorkoutActivity = (RescheduleWorkoutActivity) this.f946b;
        v2 v2Var = (v2) obj;
        RescheduleWorkoutActivity.a aVar = RescheduleWorkoutActivity.f45357n;
        v2Var.getClass();
        rescheduleWorkoutActivity.hideProgressOverlay();
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return;
            }
            FrameLayout frameLayout = rescheduleWorkoutActivity.f45366i;
            if (frameLayout == null) {
                s.m("calendarContainer");
                throw null;
            }
            frameLayout.setVisibility(8);
            wt1.b bVar = rescheduleWorkoutActivity.f45364g;
            if (bVar != null) {
                bVar.g();
            }
            wt1.b bVar2 = rescheduleWorkoutActivity.f45364g;
            if (bVar2 != null) {
                bVar2.c(new cu1.s(rescheduleWorkoutActivity, 1));
                return;
            }
            return;
        }
        d dVar = (d) ((v2.b) v2Var).f47386a;
        if (dVar == null) {
            dVar = new d(null, 0L, 0L, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
        }
        rescheduleWorkoutActivity.f45362e = dVar;
        WorkoutScheduleDTO workoutScheduleDTO = rescheduleWorkoutActivity.f45363f;
        if (workoutScheduleDTO == null) {
            s.m("workoutScheduleDTO");
            throw null;
        }
        long j8 = workoutScheduleDTO.f48067c;
        DateTime dateTimeC = workoutScheduleDTO.C();
        d dVar2 = rescheduleWorkoutActivity.f45362e;
        if (dVar2 == null) {
            s.m("athletePlanDTO");
            throw null;
        }
        DateTime dateTimeR = dVar2.r();
        if (dateTimeC != null && dateTimeR != null) {
            com.garmin.android.apps.connectmobile.training.atp.dashboard.a.C0872a c0872a = com.garmin.android.apps.connectmobile.training.atp.dashboard.a.L0;
            int i14 = rescheduleWorkoutActivity.f45368k;
            c0872a.getClass();
            com.garmin.android.apps.connectmobile.training.atp.dashboard.a aVar2 = new com.garmin.android.apps.connectmobile.training.atp.dashboard.a();
            Bundle bundle = new Bundle();
            bundle.putLong("WORKOUT_SCHEDULE_ID", j8);
            bundle.putSerializable("WORKOUT_DATE", dateTimeC);
            bundle.putSerializable("RACE_DATE", dateTimeR);
            bundle.putInt(CaldroidFragment.MONTH, dateTimeC.getMonthOfYear());
            bundle.putInt(CaldroidFragment.YEAR, dateTimeC.getYear());
            bundle.putInt("CONTAINER_HEIGHT", i14);
            bundle.putBoolean(CaldroidFragment.ENABLE_SWIPE, true);
            bundle.putBoolean(CaldroidFragment.SIX_WEEKS_IN_CALENDAR, false);
            bundle.putInt(CaldroidFragment.START_DAY_OF_WEEK, ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().a());
            bundle.putInt(CaldroidFragment.THEME_RESOURCE, R.style.GCMCalendarDark);
            aVar2.setArguments(bundle);
            v supportFragmentManager = rescheduleWorkoutActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
            aVar3.l(R.id.calendar_content_frame, aVar2, null);
            aVar3.e();
            rescheduleWorkoutActivity.f45367j = aVar2;
        }
        Button button = rescheduleWorkoutActivity.f45361d;
        if (button == null) {
            s.m("rescheduleButton");
            throw null;
        }
        button.setVisibility(0);
        wt1.b bVar3 = rescheduleWorkoutActivity.f45364g;
        if (bVar3 != null) {
            bVar3.e();
        }
        FrameLayout frameLayout2 = rescheduleWorkoutActivity.f45366i;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        } else {
            s.m("calendarContainer");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b(Object obj) {
        i1 i1Var = (i1) this.f946b;
        g3 g3Var = (g3) obj;
        i1.a aVar = i1.f66514e;
        p pVar = g3Var != null ? g3Var.f35300a : null;
        int i14 = pVar == null ? -1 : i1.b.f66518a[pVar.ordinal()];
        if (i14 == 1) {
            e.l(i1Var);
            return;
        }
        if (i14 != 2) {
            if (i14 != 3) {
                return;
            }
            e.f(i1Var);
            e.a(i1Var, null);
            i1Var.y6().l5();
            return;
        }
        e.f(i1Var);
        f fVar = (f) g3Var.f35301b;
        if (fVar != null) {
            i1Var.y6().r7(fVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c(Object obj) {
        w1 w1Var = (w1) this.f946b;
        g3 g3Var = (g3) obj;
        w1.a aVar = w1.f66814e;
        if (g3Var != null) {
            int i14 = w1.b.f66818a[g3Var.f35300a.ordinal()];
            if (i14 == 1) {
                jv1.e eVar = (jv1.e) g3Var.f35301b;
                if (eVar == null || !eVar.f101032a) {
                    h hVarY6 = w1Var.y6();
                    if (hVarY6.Q6()) {
                        hVarY6.i7();
                    } else {
                        hVarY6.s6().j("FBTSelectDistanceOrTimeFragmentCompose");
                    }
                } else {
                    w1Var.y6().g7();
                }
                e.f(w1Var);
            } else if (i14 == 2) {
                e.a(w1Var, null);
                e.f(w1Var);
            } else {
                if (i14 != 3) {
                    u0.r();
                    return;
                }
                e.l(w1Var);
            }
            w1Var.y6().s7();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void d(Object obj) {
        a2 a2Var = (a2) this.f946b;
        g3 g3Var = (g3) obj;
        a2.a aVar = a2.f66311e;
        if (g3Var != null) {
            int i14 = a2.b.f66315a[g3Var.f35300a.ordinal()];
            if (i14 == 1) {
                jv1.e eVar = (jv1.e) g3Var.f35301b;
                if (eVar == null || !eVar.f101032a) {
                    a2Var.y6().i7();
                } else {
                    a2Var.y6().g7();
                }
                e.f(a2Var);
            } else if (i14 == 2) {
                e.a(a2Var, null);
                e.f(a2Var);
            } else {
                if (i14 != 3) {
                    u0.r();
                    return;
                }
                e.l(a2Var);
            }
            a2Var.y6().s7();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e(Object obj) {
        ContactActivity contactActivity = (ContactActivity) this.f946b;
        g3 g3Var = (g3) obj;
        ContactActivity.a aVar = ContactActivity.T;
        g3Var.getClass();
        String str = g3Var.f35302c;
        int i14 = ContactActivity.b.f32311a[g3Var.f35300a.ordinal()];
        if (i14 == 1) {
            contactActivity.showProgressOverlay();
            return;
        }
        if (i14 == 2) {
            contactActivity.hideProgressOverlay();
            contactActivity.f32293g = (r) g3Var.f35301b;
            contactActivity.ga().z4();
            contactActivity.setResult(-1, new Intent().putExtra("RESULT_EXTRA_USER_CONTACTS_DTO", contactActivity.f32293g));
            if (contactActivity.f32294h) {
                contactActivity.f32294h = false;
                u20.e eVarU6 = u20.e.u6(R.string.common_you_are_all_set, R.string.contact_management_all_set_message);
                eVarU6.setCancelable(false);
                eVarU6.g(contactActivity.getSupportFragmentManager());
                return;
            }
            return;
        }
        contactActivity.hideProgressOverlay();
        Integer num = g3Var.f35304e;
        if (num != null && num.intValue() == 403 && str != null && w.z(str, "ManagedChildAccountForbiddenException", false)) {
            contactActivity.ea(null);
            return;
        }
        if (str != null ? w.z(str, "responseCode=400", false) : false) {
            new androidx.appcompat.app.e.a(contactActivity).setTitle(contactActivity.getString(R.string.les_invalid_phone_number_dialog_title)).setMessage(contactActivity.getString(R.string.msg_invalid_contact_phone_number)).setPositiveButton(R.string.lbl_ok, new i(0)).show();
        } else {
            Toast.makeText(contactActivity, R.string.txt_error_occurred, 0).show();
        }
    }

    private final void f(Object obj) {
        g10.d dVar = (g10.d) this.f946b;
        m mVar = (m) obj;
        g10.d.a aVar = g10.d.f74830e;
        mVar.getClass();
        int i14 = g10.d.b.f74835a[mVar.f73769b.ordinal()];
        if (i14 == 1) {
            e.l(dVar);
            return;
        }
        if (i14 == 2) {
            e.f(dVar);
        } else if (i14 != 3) {
            u0.r();
        } else {
            e.f(dVar);
            e.a(dVar, null);
        }
    }

    private final void g(Object obj) {
        ArrayList<ActivityListItemDTO> arrayList;
        com.garmin.android.apps.connectmobile.userprofile.e.a aVar;
        ArrayList<ActivityListItemDTO> arrayList2;
        com.garmin.android.apps.connectmobile.userprofile.f fVar = (com.garmin.android.apps.connectmobile.userprofile.f) this.f946b;
        zy0.p pVar = (zy0.p) obj;
        com.garmin.android.apps.connectmobile.userprofile.f.a aVar2 = com.garmin.android.apps.connectmobile.userprofile.f.f46715v;
        pVar.getClass();
        Object obj2 = pVar.f207459a;
        zy0.c cVar = pVar.f207460b;
        boolean zIsEmpty = false;
        if (obj2 instanceof v2.b) {
            fVar.f46720q = cVar == zy0.c.CACHE;
            v2.b bVar = (v2.b) obj2;
            List list = (List) bVar.f47386a;
            boolean z14 = bVar.f47387b == 204;
            com.garmin.android.apps.connectmobile.userprofile.e eVar = fVar.f46719p;
            if (z14) {
                if (eVar != null) {
                    eVar.clear();
                }
                com.garmin.android.apps.connectmobile.userprofile.e eVar2 = fVar.f46719p;
                if (eVar2 != null) {
                    eVar2.C(false);
                }
                fVar.X6(0);
                fVar.T6(false);
            } else {
                if (eVar != null && (aVar = eVar.f46567c) != null && (arrayList2 = aVar.f46573d) != null) {
                    zIsEmpty = arrayList2.isEmpty();
                }
                com.garmin.android.apps.connectmobile.userprofile.e eVar3 = fVar.f46719p;
                if (eVar3 != null) {
                    list.getClass();
                    com.garmin.android.apps.connectmobile.userprofile.e.a aVar3 = eVar3.f46567c;
                    if (aVar3 != null && (arrayList = aVar3.f46573d) != null) {
                        int size = arrayList.size();
                        arrayList.addAll(list);
                        eVar3.u(eVar3.f46569e, size, list.size());
                    }
                }
                fVar.X6(list.size());
                com.garmin.android.apps.connectmobile.userprofile.e eVar4 = fVar.f46719p;
                if (eVar4 != null) {
                    eVar4.C(true);
                }
                if (zIsEmpty && !list.isEmpty()) {
                    fVar.f33121i.post(new eh2.b(fVar, 9));
                }
            }
        } else {
            if (!(obj2 instanceof v2.a)) {
                u0.r();
                return;
            }
            fVar.T6(true);
            if (w2.a((v2.a) obj2)) {
                com.garmin.android.apps.connectmobile.userprofile.e eVar5 = fVar.f46719p;
                if (eVar5 != null) {
                    eVar5.C(false);
                }
            } else {
                if (fVar.f33123k.f149677b == 1) {
                    fVar.f46720q = true;
                }
                fVar.Y6(true);
                if (cVar == zy0.c.SERVER) {
                    Toast.makeText(fVar.getContext(), fVar.getString(R.string.txt_error_occurred), 0).show();
                }
            }
        }
        fVar.f7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void h(Object obj) {
        tw1.m mVar;
        FBTWorkoutScheduleActivity fBTWorkoutScheduleActivity = (FBTWorkoutScheduleActivity) this.f946b;
        g3 g3Var = (g3) obj;
        FBTWorkoutScheduleActivity.a aVar = FBTWorkoutScheduleActivity.f45552c;
        g3Var.getClass();
        T t7 = g3Var.f35301b;
        int i14 = FBTWorkoutScheduleActivity.b.f45555a[g3Var.f35300a.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                fBTWorkoutScheduleActivity.hideProgressOverlay();
                return;
            } else if (i14 == 3) {
                fBTWorkoutScheduleActivity.showProgressOverlay();
                return;
            } else {
                u0.r();
                return;
            }
        }
        fBTWorkoutScheduleActivity.setResult(209);
        n nVar = (n) t7;
        fBTWorkoutScheduleActivity.da().U0 = nVar != null ? nVar.f101089k : null;
        fBTWorkoutScheduleActivity.da().R0 = nVar != null ? nVar.f101101w : null;
        fBTWorkoutScheduleActivity.da().T0 = nVar != null ? nVar.f101102x : null;
        fBTWorkoutScheduleActivity.da().Q0 = nVar != null ? nVar.f101088j : null;
        if (nVar != null && (mVar = nVar.f101079a) != null) {
            fBTWorkoutScheduleActivity.ca(mVar);
        }
        fBTWorkoutScheduleActivity.hideProgressOverlay();
    }

    private final void i(Object obj) {
        hr2.b bVar = (hr2.b) this.f946b;
        hr2.c.a aVar = (hr2.c.a) obj;
        Logger logger = hr2.b.f85292j;
        int i14 = aVar == null ? -1 : hr2.b.c.f85297a[aVar.ordinal()];
        if (i14 == 1) {
            hn2.c.ba(bVar, Boolean.FALSE, null, null, 14);
            WebView webView = bVar.f85295i;
            if (webView != null) {
                webView.setVisibility(0);
                return;
            } else {
                s.m("containedWebView");
                throw null;
            }
        }
        if (i14 == 2) {
            hn2.c.ba(bVar, Boolean.TRUE, null, null, 14);
            return;
        }
        if (i14 != 3) {
            hr2.b.f85292j.debug("ProviderWebViewPresenterViewModel : " + aVar + " not handled");
            return;
        }
        Boolean bool = Boolean.TRUE;
        hr2.a aVar2 = bVar.f85294h;
        if (aVar2 == null) {
            s.m("providerDataModel");
            throw null;
        }
        String string = bVar.getString(R.string.wallet_title_provisioning_device, aVar2.f85290c.getProductDisplayName());
        String string2 = bVar.getString(R.string.wallet_message_provisioning_device);
        hr2.a aVar3 = bVar.f85294h;
        if (aVar3 != null) {
            bVar.aa(bool, string, string2, w52.u0.t(aVar3.f85290c));
        } else {
            s.m("providerDataModel");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void j(Object obj) {
        com.garmin.android.apps.connectmobile.workouts.presentation.msn.a aVar = (com.garmin.android.apps.connectmobile.workouts.presentation.msn.a) this.f946b;
        m mVar = (m) obj;
        com.garmin.android.apps.connectmobile.workouts.presentation.msn.a.C0970a c0970a = com.garmin.android.apps.connectmobile.workouts.presentation.msn.a.P;
        mVar.getClass();
        int i14 = com.garmin.android.apps.connectmobile.workouts.presentation.msn.a.b.f49482a[mVar.f73769b.ordinal()];
        if (i14 == 1) {
            if (aVar.getUserVisibleHint()) {
                s2 s2Var = aVar.E;
                if (s2Var == null) {
                    s.m("progressOverlayListener");
                    throw null;
                }
                s2Var.showProgressOverlay();
            }
            aVar.C = true;
            aVar.D = false;
            return;
        }
        if (i14 == 2) {
            aVar.f49478w = (o) mVar.f73770c;
            aVar.y6();
            aVar.u6(false);
            if (aVar.getUserVisibleHint()) {
                s2 s2Var2 = aVar.E;
                if (s2Var2 == null) {
                    s.m("progressOverlayListener");
                    throw null;
                }
                s2Var2.hideProgressOverlay();
            }
            aVar.C = false;
            aVar.D = false;
            return;
        }
        if (i14 != 3) {
            u0.r();
            return;
        }
        if (aVar.getUserVisibleHint()) {
            s2 s2Var3 = aVar.E;
            if (s2Var3 == null) {
                s.m("progressOverlayListener");
                throw null;
            }
            s2Var3.hideProgressOverlay();
            aVar.w6();
        }
        aVar.C = false;
        aVar.D = true;
    }

    private final void k(Object obj) {
        DevDevicesActivity devDevicesActivity = (DevDevicesActivity) this.f946b;
        ArrayList arrayList = (ArrayList) obj;
        int i14 = DevDevicesActivity.f51893l;
        arrayList.getClass();
        devDevicesActivity.f51894g.debug("liveData observer hit, sending new data to adapter");
        devDevicesActivity.runOnUiThread(new a0.a((Object) devDevicesActivity, true, 9));
        boolean zIsEmpty = arrayList.isEmpty();
        RecyclerView recyclerView = devDevicesActivity.f51897j;
        if (zIsEmpty) {
            recyclerView.getClass();
            recyclerView.setVisibility(8);
            TextView textView = devDevicesActivity.f51898k;
            textView.getClass();
            textView.setVisibility(0);
        } else {
            recyclerView.getClass();
            recyclerView.setVisibility(0);
            TextView textView2 = devDevicesActivity.f51898k;
            textView2.getClass();
            textView2.setVisibility(8);
            com.garmin.feature.garminpay.ui.dev.devices.a aVar = devDevicesActivity.f51895h;
            aVar.getClass();
            aVar.f51921c = arrayList;
            com.garmin.feature.garminpay.ui.dev.devices.a aVar2 = devDevicesActivity.f51895h;
            aVar2.getClass();
            aVar2.notifyDataSetChanged();
        }
        devDevicesActivity.runOnUiThread(new a0.a((Object) devDevicesActivity, false, 9));
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0203  */
    /* JADX WARN: Code duplicated, block: B:129:0x0236  */
    /* JADX WARN: Code duplicated, block: B:244:0x0498  */
    /* JADX WARN: Code duplicated, block: B:296:0x0547  */
    /* JADX WARN: Code duplicated, block: B:311:0x058d  */
    /* JADX WARN: Code duplicated, block: B:313:0x0591  */
    /* JADX WARN: Code duplicated, block: B:315:0x0598  */
    /* JADX WARN: Code duplicated, block: B:316:0x059c  */
    /* JADX WARN: Code duplicated, block: B:318:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:410:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:412:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:414:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:415:0x06db  */
    /* JADX WARN: Code duplicated, block: B:417:0x06df  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) throws Throwable {
        String strA;
        HashMap map;
        Throwable th3;
        Object obj2;
        LocalDate date;
        TextView textView;
        TextView textView2;
        Object obj3;
        fg0.d customGoal;
        o13.p pVarB;
        Double value;
        o13.p pVarL;
        TextView textView3;
        TextView textView4;
        String strH;
        x0 x0Var;
        a0 a0Var;
        Intent intent;
        Class<?> cls;
        switch (this.f945a) {
            case 0:
                ((p1) this.f946b).setValue(obj);
                return;
            case 1:
                com.garmin.android.apps.connectmobile.performance.trainingload.b bVar = (com.garmin.android.apps.connectmobile.performance.trainingload.b) this.f946b;
                m mVar = (m) obj;
                com.garmin.android.apps.connectmobile.performance.trainingload.b.a aVar = com.garmin.android.apps.connectmobile.performance.trainingload.b.f40183k;
                mVar.getClass();
                int i14 = com.garmin.android.apps.connectmobile.performance.trainingload.b.C0750b.f40194a[mVar.f73769b.ordinal()];
                if (i14 == 1) {
                    e.l(bVar);
                    return;
                }
                if (i14 == 2) {
                    e.f(bVar);
                    e.a(bVar, mVar.f73771d);
                    bVar.u6(null);
                    return;
                } else if (i14 != 3) {
                    u0.r();
                    return;
                } else {
                    e.f(bVar);
                    bVar.u6((g) mVar.f73770c);
                    return;
                }
            case 2:
                com.garmin.android.apps.connectmobile.performance.trainingload.c cVar = (com.garmin.android.apps.connectmobile.performance.trainingload.c) this.f946b;
                m mVar2 = (m) obj;
                com.garmin.android.apps.connectmobile.performance.trainingload.c.a aVar2 = com.garmin.android.apps.connectmobile.performance.trainingload.c.f40195p;
                mVar2.getClass();
                int i15 = com.garmin.android.apps.connectmobile.performance.trainingload.c.b.f40211a[mVar2.f73769b.ordinal()];
                if (i15 == 1) {
                    e.l(cVar);
                    return;
                }
                if (i15 == 2) {
                    e.f(cVar);
                    e.a(cVar, mVar2.f73771d);
                    return;
                }
                if (i15 != 3) {
                    u0.r();
                    return;
                }
                e.f(cVar);
                x61.f fVar = (x61.f) mVar2.f73770c;
                if (fVar == null) {
                    View view2 = cVar.f40204i;
                    if (view2 != null) {
                        view2.setVisibility(8);
                        return;
                    } else {
                        s.m("loadFocusLayoutContainer");
                        throw null;
                    }
                }
                Double d14 = fVar.f189233k;
                String str = fVar.f189226d;
                boolean z14 = fVar.f189237o;
                String str2 = fVar.f189236n;
                if (str2 != null && str2.length() != 0) {
                    View view3 = cVar.f40203h;
                    if (view3 == null) {
                        s.m("noDataAvailableView");
                        throw null;
                    }
                    view3.setVisibility(8);
                    View view4 = cVar.f40204i;
                    if (view4 == null) {
                        s.m("loadFocusLayoutContainer");
                        throw null;
                    }
                    view4.setVisibility(8);
                    View view5 = cVar.f40205j;
                    if (view5 == null) {
                        s.m("showSelectorViewContainer");
                        throw null;
                    }
                    view5.setVisibility(8);
                    View view6 = cVar.f40206k;
                    if (view6 == null) {
                        s.m("loadFocusPauseLayout");
                        throw null;
                    }
                    view6.setVisibility(0);
                    TextView textView5 = cVar.f40199d;
                    if (textView5 != null) {
                        textView5.setText(str2);
                        return;
                    } else {
                        s.m("pauseDateString");
                        throw null;
                    }
                }
                if (!fVar.f189223a) {
                    if (z14) {
                        View view7 = cVar.f40205j;
                        if (view7 == null) {
                            s.m("showSelectorViewContainer");
                            throw null;
                        }
                        view7.setVisibility(0);
                        FrameLayout frameLayout = cVar.f40210o;
                        if (frameLayout == null) {
                            s.m("deviceSelectorContainer");
                            throw null;
                        }
                        frameLayout.setVisibility(0);
                        TextView textView6 = cVar.f40200e;
                        if (textView6 == null) {
                            s.m("focusDateRange");
                            throw null;
                        }
                        textView6.setVisibility(8);
                    }
                    View view8 = cVar.f40203h;
                    if (view8 == null) {
                        s.m("noDataAvailableView");
                        throw null;
                    }
                    view8.setVisibility(0);
                    View view9 = cVar.f40204i;
                    if (view9 != null) {
                        view9.setVisibility(8);
                        return;
                    } else {
                        s.m("loadFocusLayoutContainer");
                        throw null;
                    }
                }
                View view10 = cVar.f40203h;
                if (view10 == null) {
                    s.m("noDataAvailableView");
                    throw null;
                }
                view10.setVisibility(8);
                View view11 = cVar.f40205j;
                if (view11 == null) {
                    s.m("showSelectorViewContainer");
                    throw null;
                }
                view11.setVisibility(0);
                if (z14) {
                    FrameLayout frameLayout2 = cVar.f40210o;
                    if (frameLayout2 == null) {
                        s.m("deviceSelectorContainer");
                        throw null;
                    }
                    frameLayout2.setVisibility(0);
                }
                View view12 = cVar.f40204i;
                if (view12 == null) {
                    s.m("loadFocusLayoutContainer");
                    throw null;
                }
                view12.setVisibility(0);
                TextView textView7 = cVar.f40200e;
                if (textView7 == null) {
                    s.m("focusDateRange");
                    throw null;
                }
                v22.e.o(textView7, fVar.f189224b);
                TextView textView8 = cVar.f40201f;
                if (textView8 == null) {
                    s.m("focusFeedbackPhrase");
                    throw null;
                }
                v22.e.o(textView8, fVar.f189225c);
                TextView textView9 = cVar.f40202g;
                if (textView9 == null) {
                    s.m("focusFeedbackMessage");
                    throw null;
                }
                v22.e.o(textView9, str);
                TextView textView10 = cVar.f40202g;
                if (textView10 == null) {
                    s.m("focusFeedbackMessage");
                    throw null;
                }
                if (str != null) {
                    Context contextRequireContext = cVar.requireContext();
                    contextRequireContext.getClass();
                    strA = oi0.c.A(contextRequireContext, new a03.h(26), str);
                } else {
                    strA = null;
                }
                textView10.setContentDescription(strA);
                Double d15 = fVar.f189228f;
                Double d16 = fVar.f189229g;
                Double d17 = fVar.f189227e;
                Double d18 = fVar.f189231i;
                Double d19 = fVar.f189232j;
                Double d24 = fVar.f189230h;
                Double d25 = fVar.f189234l;
                Double d26 = fVar.f189235m;
                double dMax = Math.max(Math.max(d14 != null ? d14.doubleValue() : 0.0d, Math.max(d26 != null ? d26.doubleValue() : 0.0d, d25 != null ? d25.doubleValue() : 0.0d)), Math.max(Math.max(d24 != null ? d24.doubleValue() : 0.0d, Math.max(d19 != null ? d19.doubleValue() : 0.0d, d18 != null ? d18.doubleValue() : 0.0d)), Math.max(d17 != 0 ? d17.doubleValue() : 0.0d, Math.max(d16 != 0 ? d16.doubleValue() : 0.0d, d15 != 0 ? d15.doubleValue() : 0.0d))));
                LoadFocusView loadFocusView = cVar.f40207l;
                if (loadFocusView == null) {
                    s.m(r6);
                    throw null;
                }
                loadFocusView.setMaxValue(dMax);
                LoadFocusView loadFocusView2 = cVar.f40207l;
                if (loadFocusView2 == null) {
                    s.m(r6);
                    throw null;
                }
                loadFocusView2.setLoadFocusValue(d14 != 0 ? MathKt.b(d14.doubleValue()) : 0);
                LoadFocusView loadFocusView3 = cVar.f40207l;
                if (loadFocusView3 == null) {
                    s.m(r6);
                    throw null;
                }
                loadFocusView3.setLoadFocusOptMinValue(d25 != null ? MathKt.b(d25.doubleValue()) : 0);
                LoadFocusView loadFocusView4 = cVar.f40207l;
                if (loadFocusView4 == null) {
                    s.m(r6);
                    throw null;
                }
                loadFocusView4.setLoadFocusOptMaxValue(d26 != null ? MathKt.b(d26.doubleValue()) : 0);
                LoadFocusView loadFocusView5 = cVar.f40207l;
                if (loadFocusView5 == null) {
                    s.m(r6);
                    throw null;
                }
                String loadFocusLabel = loadFocusView5.getLoadFocusLabel();
                LoadFocusView loadFocusView6 = cVar.f40207l;
                if (loadFocusView6 == null) {
                    s.m("loadFocusAnaerobicBarView");
                    throw null;
                }
                loadFocusView5.setContentDescription(loadFocusLabel + StringUtils.SPACE + loadFocusView6.getLoadFocusValue());
                LoadFocusView loadFocusView7 = cVar.f40208m;
                if (loadFocusView7 == null) {
                    s.m(r5);
                    throw null;
                }
                loadFocusView7.setMaxValue(dMax);
                LoadFocusView loadFocusView8 = cVar.f40208m;
                if (loadFocusView8 == null) {
                    s.m(r5);
                    throw null;
                }
                loadFocusView8.setLoadFocusValue(d24 != null ? MathKt.b(d24.doubleValue()) : 0);
                LoadFocusView loadFocusView9 = cVar.f40208m;
                if (loadFocusView9 == null) {
                    s.m(r5);
                    throw null;
                }
                loadFocusView9.setLoadFocusOptMinValue(d18 != 0 ? MathKt.b(d18.doubleValue()) : 0);
                LoadFocusView loadFocusView10 = cVar.f40208m;
                if (loadFocusView10 == null) {
                    s.m(r5);
                    throw null;
                }
                loadFocusView10.setLoadFocusOptMaxValue(d19 != 0 ? MathKt.b(d19.doubleValue()) : 0);
                LoadFocusView loadFocusView11 = cVar.f40208m;
                if (loadFocusView11 == null) {
                    s.m(r5);
                    throw null;
                }
                String loadFocusLabel2 = loadFocusView11.getLoadFocusLabel();
                LoadFocusView loadFocusView12 = cVar.f40208m;
                if (loadFocusView12 == null) {
                    s.m("loadFocusAerobicHBarView");
                    throw null;
                }
                loadFocusView11.setContentDescription(loadFocusLabel2 + StringUtils.SPACE + loadFocusView12.getLoadFocusValue());
                LoadFocusView loadFocusView13 = cVar.f40209n;
                if (loadFocusView13 == null) {
                    s.m(r4);
                    throw null;
                }
                loadFocusView13.setMaxValue(dMax);
                LoadFocusView loadFocusView14 = cVar.f40209n;
                if (loadFocusView14 == null) {
                    s.m(r4);
                    throw null;
                }
                loadFocusView14.setLoadFocusValue(d17 != 0 ? MathKt.b(d17.doubleValue()) : 0);
                LoadFocusView loadFocusView15 = cVar.f40209n;
                if (loadFocusView15 == null) {
                    s.m(r4);
                    throw null;
                }
                loadFocusView15.setLoadFocusOptMinValue(d15 != 0 ? MathKt.b(d15.doubleValue()) : 0);
                LoadFocusView loadFocusView16 = cVar.f40209n;
                if (loadFocusView16 == null) {
                    s.m(r4);
                    throw null;
                }
                loadFocusView16.setLoadFocusOptMaxValue(d16 != 0 ? MathKt.b(d16.doubleValue()) : 0);
                LoadFocusView loadFocusView17 = cVar.f40209n;
                if (loadFocusView17 == null) {
                    s.m(r4);
                    throw null;
                }
                String loadFocusLabel3 = loadFocusView17.getLoadFocusLabel();
                LoadFocusView loadFocusView18 = cVar.f40209n;
                if (loadFocusView18 == null) {
                    s.m("loadFocusAerobicLBarView");
                    throw null;
                }
                loadFocusView17.setContentDescription(loadFocusLabel3 + StringUtils.SPACE + loadFocusView18.getLoadFocusValue());
                return;
            case 3:
                com.garmin.android.apps.connectmobile.performance.trainingload.e eVar = (com.garmin.android.apps.connectmobile.performance.trainingload.e) this.f946b;
                m mVar3 = (m) obj;
                com.garmin.android.apps.connectmobile.performance.trainingload.e.a aVar3 = com.garmin.android.apps.connectmobile.performance.trainingload.e.f40217t;
                mVar3.getClass();
                int i16 = com.garmin.android.apps.connectmobile.performance.trainingload.e.b.f40236a[mVar3.f73769b.ordinal()];
                if (i16 == 1) {
                    e.l(eVar);
                    return;
                }
                if (i16 == 2) {
                    e.f(eVar);
                    e.a(eVar, mVar3.f73771d);
                    eVar.v6(null);
                    return;
                } else if (i16 != 3) {
                    u0.r();
                    return;
                } else {
                    e.f(eVar);
                    eVar.v6((a71.e) mVar3.f73770c);
                    return;
                }
            case 4:
                o0 o0Var = (o0) this.f946b;
                u uVar = (u) obj;
                if (o0Var.f5672h.get()) {
                    if ((uVar != null ? uVar.a() : null) == null) {
                        if ((uVar != null ? uVar.b() : null) != u.b.CLOSED) {
                            return;
                        }
                    }
                    Objects.toString(uVar.b());
                    z1<List<q>> z1Var = o0Var.f5669e;
                    if (z1Var != null) {
                        z1Var.b();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                t1 t1Var = (t1) this.f946b;
                t1.a aVar4 = (t1.a) obj;
                synchronized (t1Var.f5754b) {
                    map = new HashMap(t1Var.f5754b);
                    break;
                }
                for (Map.Entry entry : map.entrySet()) {
                    ((Executor) entry.getValue()).execute(new j(9, entry, aVar4));
                }
                return;
            case 6:
                ((t) this.f946b).i(obj);
                return;
            case 7:
                ap2.h hVar = (ap2.h) this.f946b;
                ap2.h.a aVar5 = ap2.h.f11695y;
                ((gp2.f) obj).getClass();
                for (l1 l1Var : hVar.f11716v) {
                    l1Var.getClass();
                    l1Var.c(null);
                }
                return;
            case 8:
                az1.c cVar2 = (az1.c) this.f946b;
                az1.c.C0195c c0195c = cVar2.f13713e;
                g3 g3Var = (g3) obj;
                az1.c.a aVar6 = az1.c.f13708f;
                if (g3Var != null) {
                    int i17 = az1.c.b.f13714a[g3Var.f35300a.ordinal()];
                    if (i17 != 1) {
                        if (i17 != 2) {
                            if (i17 == 3) {
                                e.l(cVar2);
                                return;
                            } else {
                                u0.r();
                                return;
                            }
                        }
                        e.f(cVar2);
                        e.a(cVar2, null);
                        cVar2.u6().b5().m(null);
                        c0195c.f(false);
                        cVar2.requireActivity().onBackPressed();
                        return;
                    }
                    e.f(cVar2);
                    T t7 = g3Var.f35301b;
                    Boolean bool = Boolean.TRUE;
                    if (s.g(t7, bool)) {
                        boolean z15 = cVar2.f13710b;
                        if (z15) {
                            rt1.m mVar4 = (rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null);
                            Context contextRequireContext2 = cVar2.requireContext();
                            contextRequireContext2.getClass();
                            cVar2.startActivity(mVar4.g(contextRequireContext2));
                        } else {
                            if (z15) {
                                u0.r();
                                return;
                            }
                            ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).T3(true);
                            cVar2.u6().c5(bool);
                            c0195c.f(false);
                            cVar2.requireActivity().onBackPressed();
                        }
                    }
                    cVar2.u6().b5().m(null);
                    return;
                }
                return;
            case 9:
                az1.e eVar2 = (az1.e) this.f946b;
                g3 g3Var2 = (g3) obj;
                az1.e.a aVar7 = az1.e.f13722x;
                g3Var2.getClass();
                int i18 = az1.e.b.f13744a[g3Var2.f35300a.ordinal()];
                if (i18 == 1) {
                    e.l(eVar2);
                    return;
                }
                if (i18 != 2) {
                    if (i18 != 3) {
                        u0.r();
                        return;
                    } else {
                        e.f(eVar2);
                        e.a(eVar2, null);
                        return;
                    }
                }
                e.f(eVar2);
                bz1.b bVar2 = (bz1.b) g3Var2.f35301b;
                if (bVar2 == null) {
                    e.a(eVar2, null);
                    return;
                }
                k kVar = bVar2.f22290b;
                ConstraintLayout constraintLayout = eVar2.f13741t;
                if (constraintLayout == null) {
                    s.m("noUpcomingEventsView");
                    throw null;
                }
                constraintLayout.setVisibility(8);
                View view13 = eVar2.f13727e;
                if (view13 == null) {
                    s.m("addEventView");
                    throw null;
                }
                view13.setVisibility(0);
                LinearLayout linearLayout = eVar2.f13725c;
                if (linearLayout == null) {
                    s.m("primaryEventHeader");
                    throw null;
                }
                linearLayout.setVisibility(0);
                ConstraintLayout constraintLayout2 = eVar2.f13732j;
                if (constraintLayout2 == null) {
                    s.m("eventStatsView");
                    throw null;
                }
                constraintLayout2.setVisibility(0);
                GCMComplexTwoLineEventButton gCMComplexTwoLineEventButton = eVar2.f13726d;
                if (gCMComplexTwoLineEventButton == null) {
                    s.m("primaryButton");
                    throw null;
                }
                gCMComplexTwoLineEventButton.setVisibility(0);
                GCMComplexOneLineButton gCMComplexOneLineButton = eVar2.f13728f;
                if (gCMComplexOneLineButton == null) {
                    s.m("pastEventsView");
                    throw null;
                }
                gCMComplexOneLineButton.setVisibility(0);
                TextView textView11 = eVar2.f13736n;
                if (textView11 == null) {
                    s.m("weatherValTextview");
                    throw null;
                }
                textView11.setVisibility(0);
                TextView textView12 = eVar2.f13735m;
                if (textView12 == null) {
                    s.m("weatherLblTextView");
                    throw null;
                }
                textView12.setVisibility(0);
                int i19 = az1.e.b.f13745b[bVar2.f22289a.ordinal()];
                if (i19 == 1) {
                    eVar2.u6(true);
                    FragmentContainerView fragmentContainerView = eVar2.f13731i;
                    if (fragmentContainerView == null) {
                        s.m("upcomingViewLayout");
                        throw null;
                    }
                    fragmentContainerView.setVisibility(8);
                    GCMComplexOneLineButton gCMComplexOneLineButton2 = eVar2.f13728f;
                    if (gCMComplexOneLineButton2 == null) {
                        s.m("pastEventsView");
                        throw null;
                    }
                    gCMComplexOneLineButton2.setVisibility(8);
                } else if (i19 == 2) {
                    eVar2.u6(true);
                    FragmentContainerView fragmentContainerView2 = eVar2.f13731i;
                    if (fragmentContainerView2 == null) {
                        s.m("upcomingViewLayout");
                        throw null;
                    }
                    fragmentContainerView2.setVisibility(8);
                } else if (i19 != 3) {
                    eVar2.u6(false);
                    FragmentContainerView fragmentContainerView3 = eVar2.f13731i;
                    if (fragmentContainerView3 == null) {
                        s.m("upcomingViewLayout");
                        throw null;
                    }
                    fragmentContainerView3.setVisibility(0);
                    List<k> list = bVar2.f22292d;
                    if (list == null || list.isEmpty()) {
                        GCMComplexOneLineButton gCMComplexOneLineButton3 = eVar2.f13728f;
                        if (gCMComplexOneLineButton3 == null) {
                            s.m("pastEventsView");
                            throw null;
                        }
                        gCMComplexOneLineButton3.setVisibility(8);
                    } else {
                        GCMComplexOneLineButton gCMComplexOneLineButton4 = eVar2.f13728f;
                        if (gCMComplexOneLineButton4 == null) {
                            s.m("pastEventsView");
                            throw null;
                        }
                        gCMComplexOneLineButton4.setVisibility(0);
                    }
                } else {
                    eVar2.u6(false);
                    FragmentContainerView fragmentContainerView4 = eVar2.f13731i;
                    if (fragmentContainerView4 == null) {
                        s.m("upcomingViewLayout");
                        throw null;
                    }
                    fragmentContainerView4.setVisibility(8);
                    ConstraintLayout constraintLayout3 = eVar2.f13741t;
                    if (constraintLayout3 == null) {
                        s.m("noUpcomingEventsView");
                        throw null;
                    }
                    constraintLayout3.setVisibility(0);
                    View view14 = eVar2.f13727e;
                    if (view14 == null) {
                        s.m("addEventView");
                        throw null;
                    }
                    view14.setVisibility(8);
                    GCMComplexOneLineButton gCMComplexOneLineButton5 = eVar2.f13728f;
                    if (gCMComplexOneLineButton5 == null) {
                        s.m("pastEventsView");
                        throw null;
                    }
                    gCMComplexOneLineButton5.setVisibility(8);
                }
                if (kVar != null) {
                    List<a0> listS = kVar.s();
                    String url = (listS == null || (a0Var = (a0) h0.d0(listS)) == null) ? null : a0Var.getUrl();
                    zp0.c cVar3 = new zp0.c(eVar2);
                    cVar3.f206565e = url;
                    cVar3.f206570j = R.drawable.gcm3_calendar_list_icon_events;
                    cVar3.a("circle_mask");
                    GCMComplexTwoLineEventButton gCMComplexTwoLineEventButton2 = eVar2.f13726d;
                    if (gCMComplexTwoLineEventButton2 == null) {
                        s.m("primaryButton");
                        throw null;
                    }
                    cVar3.h(gCMComplexTwoLineEventButton2.getLeftIconView());
                    GCMComplexTwoLineEventButton gCMComplexTwoLineEventButton3 = eVar2.f13726d;
                    if (gCMComplexTwoLineEventButton3 == null) {
                        s.m("primaryButton");
                        throw null;
                    }
                    Resources resources = eVar2.getResources();
                    ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
                    gCMComplexTwoLineEventButton3.setLeftIconBackground(resources.getDrawable(R.drawable.round_image_border_white, null));
                    GCMComplexTwoLineEventButton gCMComplexTwoLineEventButton4 = eVar2.f13726d;
                    if (gCMComplexTwoLineEventButton4 == null) {
                        s.m("primaryButton");
                        throw null;
                    }
                    gCMComplexTwoLineEventButton4.getLeftIconView().setPadding(4, 4, 4, 4);
                    GCMComplexTwoLineEventButton gCMComplexTwoLineEventButton5 = eVar2.f13726d;
                    if (gCMComplexTwoLineEventButton5 == null) {
                        s.m("primaryButton");
                        throw null;
                    }
                    gCMComplexTwoLineEventButton5.setButtonTopLabel(kVar.r(false));
                    GCMComplexTwoLineEventButton gCMComplexTwoLineEventButton6 = eVar2.f13726d;
                    if (gCMComplexTwoLineEventButton6 == null) {
                        s.m("primaryButton");
                        throw null;
                    }
                    gg0.f eventType = kVar.getEventType();
                    gCMComplexTwoLineEventButton6.setLeftBottomIcon((eventType == null || (x0Var = eventType.f77149c) == null) ? null : eVar2.getResources().getDrawable(x0Var.f4361d, null));
                    LocalDateTime localDateTime = DateTimeFormat.forPattern("yyyy-MM-dd").parseLocalDateTime(String.valueOf(kVar.getDate()));
                    localDateTime.getClass();
                    DateTime dateTimeR = g22.k.r(localDateTime);
                    GCMComplexTwoLineEventButton gCMComplexTwoLineEventButton7 = eVar2.f13726d;
                    if (gCMComplexTwoLineEventButton7 == null) {
                        s.m("primaryButton");
                        throw null;
                    }
                    gCMComplexTwoLineEventButton7.i(j0.a(dateTimeR, 'L'));
                    fg0.d completionTarget = kVar.getCompletionTarget();
                    if (completionTarget != null) {
                        lz1.f.a aVar8 = lz1.f.f115404a;
                        Context contextRequireContext3 = eVar2.requireContext();
                        contextRequireContext3.getClass();
                        aVar8.getClass();
                        strH = lz1.f.a.h(contextRequireContext3, completionTarget);
                        if (strH == null) {
                            strH = "";
                        }
                    } else {
                        strH = "";
                    }
                    GCMComplexTwoLineEventButton gCMComplexTwoLineEventButton8 = eVar2.f13726d;
                    if (gCMComplexTwoLineEventButton8 == null) {
                        s.m("primaryButton");
                        throw null;
                    }
                    gCMComplexTwoLineEventButton8.j(strH);
                    GCMComplexTwoLineEventButton gCMComplexTwoLineEventButton9 = eVar2.f13726d;
                    if (gCMComplexTwoLineEventButton9 == null) {
                        s.m("primaryButton");
                        throw null;
                    }
                    gCMComplexTwoLineEventButton9.setOnClickListener(new d0(10, eVar2, kVar));
                } else {
                    LinearLayout linearLayout2 = eVar2.f13725c;
                    if (linearLayout2 == null) {
                        s.m("primaryEventHeader");
                        throw null;
                    }
                    linearLayout2.setVisibility(8);
                    ConstraintLayout constraintLayout4 = eVar2.f13732j;
                    if (constraintLayout4 == null) {
                        s.m("eventStatsView");
                        throw null;
                    }
                    constraintLayout4.setVisibility(8);
                    GCMComplexTwoLineEventButton gCMComplexTwoLineEventButton10 = eVar2.f13726d;
                    if (gCMComplexTwoLineEventButton10 == null) {
                        s.m("primaryButton");
                        throw null;
                    }
                    gCMComplexTwoLineEventButton10.setVisibility(8);
                }
                if (kVar != null) {
                    LocalDate date2 = kVar.getDate();
                    if (date2 != null) {
                        fg0.r eventTimeLocal = kVar.getEventTimeLocal();
                        if ((eventTimeLocal != null ? eventTimeLocal.getStartTimeHhMm() : null) == null) {
                            th3 = null;
                            lz1.f.a aVar9 = lz1.f.f115404a;
                            LocalDate localDateNow = LocalDate.now();
                            localDateNow.getClass();
                            Context contextRequireContext4 = eVar2.requireContext();
                            contextRequireContext4.getClass();
                            aVar9.getClass();
                            pVarL = lz1.f.a.l(contextRequireContext4, localDateNow, date2);
                        } else {
                            fg0.r eventTimeLocal2 = kVar.getEventTimeLocal();
                            if ((eventTimeLocal2 != null ? eventTimeLocal2.getTimeZoneId() : null) != null) {
                                fg0.r eventTimeLocal3 = kVar.getEventTimeLocal();
                                DateTime dateTimeD = eventTimeLocal3 != null ? eventTimeLocal3.d() : null;
                                lz1.f.a aVar10 = lz1.f.f115404a;
                                th3 = null;
                                fg0.r eventTimeLocal4 = kVar.getEventTimeLocal();
                                eventTimeLocal4.getClass();
                                aVar10.getClass();
                                DateTime dateTimeA = lz1.f.a.a(date2, eventTimeLocal4);
                                if (dateTimeD == null || dateTimeA == null) {
                                    pVarL = null;
                                } else {
                                    Context contextRequireContext5 = eVar2.requireContext();
                                    contextRequireContext5.getClass();
                                    pVarL = lz1.f.a.k(contextRequireContext5, dateTimeD, dateTimeA);
                                }
                            } else {
                                th3 = null;
                                lz1.f.a aVar11 = lz1.f.f115404a;
                                LocalDate localDateNow2 = LocalDate.now();
                                localDateNow2.getClass();
                                Context contextRequireContext6 = eVar2.requireContext();
                                contextRequireContext6.getClass();
                                aVar11.getClass();
                                pVarL = lz1.f.a.l(contextRequireContext6, localDateNow2, date2);
                            }
                        }
                        if (pVarL != null) {
                            B b14 = pVarL.f128595b;
                            CharSequence charSequence = (CharSequence) pVarL.f128594a;
                            if (charSequence.length() > 0) {
                                TextView textView13 = eVar2.f13734l;
                                if (textView13 == null) {
                                    s.m("countDownValTextview");
                                    throw th3;
                                }
                                textView13.setText(charSequence);
                                CharSequence charSequence2 = (CharSequence) b14;
                                if (charSequence2.length() > 0) {
                                    TextView textView14 = eVar2.f13734l;
                                    if (textView14 == null) {
                                        s.m("countDownValTextview");
                                        throw th3;
                                    }
                                    textView14.setContentDescription(charSequence2);
                                }
                            } else {
                                textView3 = eVar2.f13733k;
                                if (textView3 != null) {
                                    s.m("countDownLblTextView");
                                    throw th3;
                                }
                                textView3.setVisibility(8);
                                textView4 = eVar2.f13734l;
                                if (textView4 != null) {
                                    s.m("countDownValTextview");
                                    throw th3;
                                }
                                textView4.setVisibility(8);
                            }
                        } else {
                            textView3 = eVar2.f13733k;
                            if (textView3 != null) {
                                s.m("countDownLblTextView");
                                throw th3;
                            }
                            textView3.setVisibility(8);
                            textView4 = eVar2.f13734l;
                            if (textView4 != null) {
                                s.m("countDownValTextview");
                                throw th3;
                            }
                            textView4.setVisibility(8);
                        }
                    } else {
                        th3 = null;
                        TextView textView15 = eVar2.f13733k;
                        if (textView15 == null) {
                            s.m("countDownLblTextView");
                            throw null;
                        }
                        textView15.setVisibility(8);
                        TextView textView16 = eVar2.f13734l;
                        if (textView16 == null) {
                            s.m("countDownValTextview");
                            throw null;
                        }
                        textView16.setVisibility(8);
                    }
                    fg0.j eventCustomization = kVar.getEventCustomization();
                    fg0.d customGoal2 = eventCustomization != null ? eventCustomization.getCustomGoal() : th3;
                    l3.a aVar12 = l3.f23124b;
                    Long lValueOf = (customGoal2 == 0 || (value = customGoal2.getValue()) == null) ? th3 : Long.valueOf((long) value.doubleValue());
                    aVar12.getClass();
                    String strG1 = l3.a.g1(lValueOf);
                    if (customGoal2 == 0 || strG1 == null || strG1.length() == 0) {
                        TextView textView17 = eVar2.f13739q;
                        if (textView17 == null) {
                            s.m("goalTimeLblTextView");
                            throw th3;
                        }
                        textView17.setVisibility(8);
                        TextView textView18 = eVar2.f13740r;
                        if (textView18 == null) {
                            s.m("goalTimeValTextView");
                            throw th3;
                        }
                        textView18.setVisibility(8);
                    } else {
                        TextView textView19 = eVar2.f13740r;
                        if (textView19 == null) {
                            s.m("goalTimeValTextView");
                            throw th3;
                        }
                        textView19.setText(strG1);
                        TextView textView20 = eVar2.f13739q;
                        if (textView20 == null) {
                            s.m("goalTimeLblTextView");
                            throw th3;
                        }
                        textView20.setVisibility(0);
                        TextView textView21 = eVar2.f13740r;
                        if (textView21 == null) {
                            s.m("goalTimeValTextView");
                            throw th3;
                        }
                        textView21.setVisibility(0);
                    }
                    fg0.d completionTarget2 = kVar.getCompletionTarget();
                    if (completionTarget2 == null) {
                        textView = eVar2.f13737o;
                        if (textView != null) {
                            s.m("goalPaceLblTextview");
                            throw th3;
                        }
                        textView.setVisibility(8);
                        textView2 = eVar2.f13738p;
                        if (textView2 != null) {
                            s.m("goalPaceValTextView");
                            throw th3;
                        }
                        textView2.setVisibility(8);
                    } else {
                        fg0.j eventCustomization2 = kVar.getEventCustomization();
                        if (eventCustomization2 == null || (customGoal = eventCustomization2.getCustomGoal()) == null) {
                            obj3 = th3;
                        } else {
                            lz1.f.a aVar13 = lz1.f.f115404a;
                            Context contextRequireContext7 = eVar2.requireContext();
                            contextRequireContext7.getClass();
                            gg0.f eventType2 = kVar.getEventType();
                            boolean z16 = eventType2 != null && eventType2.e();
                            aVar13.getClass();
                            if (completionTarget2.getUnitType() == gg0.h.TIME) {
                                Double dB = customGoal.b();
                                double dDoubleValue = dB != null ? dB.doubleValue() : 0.0d;
                                Double value2 = completionTarget2.getValue();
                                pVarB = lz1.f.a.b(contextRequireContext7, dDoubleValue, value2 != null ? value2.doubleValue() : 0.0d, z16);
                            } else {
                                Double dB2 = completionTarget2.b();
                                double dDoubleValue2 = dB2 != null ? dB2.doubleValue() : 0.0d;
                                Double value3 = customGoal.getValue();
                                pVarB = lz1.f.a.b(contextRequireContext7, dDoubleValue2, value3 != null ? value3.doubleValue() : 0.0d, z16);
                            }
                            TextView textView22 = eVar2.f13737o;
                            if (textView22 == null) {
                                s.m("goalPaceLblTextview");
                                throw th3;
                            }
                            textView22.setText((CharSequence) pVarB.f128594a);
                            TextView textView23 = eVar2.f13738p;
                            if (textView23 == null) {
                                s.m("goalPaceValTextView");
                                throw th3;
                            }
                            textView23.setText((CharSequence) pVarB.f128595b);
                            TextView textView24 = eVar2.f13737o;
                            if (textView24 == null) {
                                s.m("goalPaceLblTextview");
                                throw th3;
                            }
                            textView24.setVisibility(0);
                            TextView textView25 = eVar2.f13738p;
                            if (textView25 == null) {
                                s.m("goalPaceValTextView");
                                throw th3;
                            }
                            textView25.setVisibility(0);
                            obj3 = Unit.INSTANCE;
                        }
                        if (obj3 == null) {
                            textView = eVar2.f13737o;
                            if (textView != null) {
                                s.m("goalPaceLblTextview");
                                throw th3;
                            }
                            textView.setVisibility(8);
                            textView2 = eVar2.f13738p;
                            if (textView2 != null) {
                                s.m("goalPaceValTextView");
                                throw th3;
                            }
                            textView2.setVisibility(8);
                        }
                    }
                } else {
                    th3 = null;
                }
                Double d27 = bVar2.f22293e;
                if (d27 != null) {
                    double dDoubleValue3 = d27.doubleValue();
                    if (kVar == null || (date = kVar.getDate()) == null) {
                        obj2 = th3;
                    } else {
                        if (date.isBefore(LocalDate.now())) {
                            TextView textView26 = eVar2.f13735m;
                            if (textView26 == null) {
                                s.m("weatherLblTextView");
                                throw th3;
                            }
                            textView26.setText(eVar2.getString(R.string.weather_options_title));
                        } else {
                            j0 j0Var = j0.f23099a;
                            fg0.r eventTimeLocal5 = kVar.getEventTimeLocal();
                            String startTimeHhMm = eventTimeLocal5 != null ? eventTimeLocal5.getStartTimeHhMm() : th3;
                            j0Var.getClass();
                            String strI = j0.i(startTimeHhMm);
                            String string = date.isAfter(LocalDate.now().plusDays(13)) ? eVar2.getString(R.string.pregnancy_avg_value) : eVar2.getString(R.string.weather_forecast_label);
                            string.getClass();
                            TextView textView27 = eVar2.f13735m;
                            if (textView27 == null) {
                                s.m("weatherLblTextView");
                                throw th3;
                            }
                            if (strI != null) {
                                string = e5.g(strI, StringUtils.SPACE, string);
                            }
                            textView27.setText(string);
                            l3.a aVar14 = l3.f23124b;
                            Context contextRequireContext8 = eVar2.requireContext();
                            contextRequireContext8.getClass();
                            l22.a aVar15 = new l22.a(contextRequireContext8);
                            og0.a.f131967a.getClass();
                            boolean zB = og0.a.B();
                            aVar14.getClass();
                            String strV0 = l3.a.V0(aVar15, dDoubleValue3, zB);
                            if (g22.n.d(strV0)) {
                                TextView textView28 = eVar2.f13736n;
                                if (textView28 == null) {
                                    s.m("weatherValTextview");
                                    throw th3;
                                }
                                textView28.setText(strV0);
                            } else {
                                TextView textView29 = eVar2.f13735m;
                                if (textView29 == null) {
                                    s.m("weatherLblTextView");
                                    throw th3;
                                }
                                textView29.setVisibility(8);
                                TextView textView30 = eVar2.f13736n;
                                if (textView30 == null) {
                                    s.m("weatherValTextview");
                                    throw th3;
                                }
                                textView30.setVisibility(8);
                            }
                        }
                        obj2 = Unit.INSTANCE;
                    }
                    if (obj2 != null) {
                        return;
                    }
                }
                TextView textView31 = eVar2.f13735m;
                if (textView31 == null) {
                    s.m("weatherLblTextView");
                    throw th3;
                }
                textView31.setVisibility(8);
                TextView textView32 = eVar2.f13736n;
                if (textView32 != null) {
                    textView32.setVisibility(8);
                    return;
                } else {
                    s.m("weatherValTextview");
                    throw th3;
                }
            case 10:
                ((com.garmin.android.apps.connectmobile.c) this.f946b).lambda$onCreate$0((vc2.b) obj);
                return;
            case 11:
                GCMActivityStartup gCMActivityStartup = (GCMActivityStartup) this.f946b;
                com.garmin.android.apps.connectmobile.startup.k.c cVar4 = (com.garmin.android.apps.connectmobile.startup.k.c) obj;
                Logger logger = GCMActivityStartup.f28658d;
                int i24 = GCMActivityStartup.a.f28663b[cVar4.f44889a.ordinal()];
                if (i24 == 1) {
                    CollectDobActivity.f30702e.getClass();
                    Intent intent2 = new Intent(gCMActivityStartup, (Class<?>) CollectDobActivity.class);
                    intent2.setFlags(268468224);
                    gCMActivityStartup.startActivity(intent2);
                    return;
                }
                if (i24 == 2) {
                    StartupChecksActivity.f44788d.getClass();
                    StartupChecksActivity.a.c(gCMActivityStartup);
                    return;
                }
                if (i24 == 3) {
                    q92.v vVar = cVar4.f44890b;
                    ConsentDeleteDataActivity.f32160d.getClass();
                    Intent intent3 = new Intent(gCMActivityStartup, (Class<?>) ConsentDeleteDataActivity.class);
                    intent3.putExtra("extra_consent_status", vVar);
                    intent3.setFlags(268468224);
                    gCMActivityStartup.startActivity(intent3);
                    return;
                }
                if (i24 == 4) {
                    z6.h0 h0VarE = z6.h0.e(gCMActivityStartup);
                    ArrayList<Intent> arrayList = h0VarE.f202637a;
                    com.garmin.android.apps.connectmobile.navigation.b.b();
                    arrayList.add(new Intent(gCMActivityStartup, (Class<?>) DashboardActivity.class));
                    LiveActivityActivity.f50544d.getClass();
                    arrayList.add(LiveActivityActivity.a.a(gCMActivityStartup));
                    h0VarE.g();
                    gCMActivityStartup.finish();
                    return;
                }
                if (i24 != 5) {
                    return;
                }
                Logger logger2 = GCMActivityStartup.f28658d;
                if (gCMActivityStartup.getIntent() != null) {
                    String stringExtra = gCMActivityStartup.getIntent().getStringExtra("GCM_extra_redirection");
                    if (TextUtils.isEmpty(stringExtra)) {
                        cls = null;
                    } else {
                        try {
                            cls = Class.forName(stringExtra);
                            try {
                                if (!com.garmin.android.apps.connectmobile.c.class.isAssignableFrom(cls)) {
                                    cls = null;
                                }
                            } catch (ClassNotFoundException unused) {
                                com.airbnb.lottie.animation.keyframe.a.w("Redirecting activity not found: ", stringExtra, logger2);
                            }
                        } catch (ClassNotFoundException unused2) {
                            cls = null;
                        }
                    }
                    if (cls != null) {
                        intent = new Intent(gCMActivityStartup, cls);
                        if (gCMActivityStartup.getIntent().getExtras() != null) {
                            intent.putExtras(gCMActivityStartup.getIntent().getExtras());
                        }
                        if (gCMActivityStartup.getIntent().getAction() != null) {
                            intent.setAction(gCMActivityStartup.getIntent().getAction());
                        }
                    } else {
                        intent = null;
                    }
                } else {
                    intent = null;
                }
                if (intent != null) {
                    logger2.debug("redirect: GCM startup has completed. Redirect to " + intent.getComponent().getClassName() + ".");
                    gCMActivityStartup.startActivity(intent);
                } else {
                    logger2.debug("redirect: Redirecting to MyDayActivity ");
                    com.garmin.android.apps.connectmobile.navigation.b.a(ty0.b.E1, gCMActivityStartup, null);
                }
                gCMActivityStartup.finish();
                return;
            case 12:
                ConnectIQStorageManagementActivity connectIQStorageManagementActivity = (ConnectIQStorageManagementActivity) this.f946b;
                m0 m0Var = (m0) obj;
                int i25 = ConnectIQStorageManagementActivity.f31803d;
                if (m0Var == null) {
                    return;
                }
                int i26 = ConnectIQStorageManagementActivity.a.f31807a[m0Var.f193947a.ordinal()];
                if (i26 == 1) {
                    connectIQStorageManagementActivity.showProgressOverlay(connectIQStorageManagementActivity.getString(R.string.txt_loading));
                    return;
                } else {
                    if (i26 != 2) {
                        return;
                    }
                    connectIQStorageManagementActivity.hideProgressOverlay();
                    return;
                }
            case 13:
                n0 n0Var = (n0) this.f946b;
                m0 m0Var2 = (m0) obj;
                if (m0Var2 == null) {
                    return;
                }
                int i27 = n0.c.f31922b[m0Var2.f193947a.ordinal()];
                if (i27 != 1) {
                    if (i27 != 2) {
                        return;
                    }
                    n0Var.z6();
                    return;
                } else {
                    List<o10.b> list2 = m0Var2.f193949c;
                    if (list2 != null) {
                        n0Var.f31911n.addAll(list2);
                    }
                    n0Var.z6();
                    return;
                }
            case 14:
                a(obj);
                return;
            case 15:
                BLEDeviceSetupWizardActivity bLEDeviceSetupWizardActivity = ((dd0.c) this.f946b).f59156a;
                if (bLEDeviceSetupWizardActivity.f34466i) {
                    return;
                }
                Intent intent4 = bLEDeviceSetupWizardActivity.f34465h;
                if (intent4 != null) {
                    bLEDeviceSetupWizardActivity.startActivity(intent4);
                }
                bLEDeviceSetupWizardActivity.finish();
                return;
            case 16:
                FBTEditGoalActivity fBTEditGoalActivity = (FBTEditGoalActivity) this.f946b;
                String str3 = (String) obj;
                FBTEditGoalActivity.a aVar16 = FBTEditGoalActivity.f45493c;
                str3.getClass();
                int iHashCode = str3.hashCode();
                if (iHashCode == -1288008481) {
                    if (str3.equals("FBTEditTrainingGoalFragment")) {
                        fv1.i.f73723f.getClass();
                        fBTEditGoalActivity.ca(new fv1.i(), str3);
                        return;
                    }
                    return;
                }
                if (iHashCode == -1129848785) {
                    if (str3.equals("FBTEditGoalDataFragment")) {
                        fv1.c.f73671x.getClass();
                        fBTEditGoalActivity.ca(new fv1.c(), str3);
                        return;
                    }
                    return;
                }
                if (iHashCode == 1860905189 && str3.equals("FBTEditGoalFragment")) {
                    fv1.g.f73711d.getClass();
                    fBTEditGoalActivity.ca(new fv1.g(), str3);
                    return;
                }
                return;
            case 17:
                b(obj);
                return;
            case 18:
                c(obj);
                return;
            case 19:
                d(obj);
                return;
            case 20:
                e(obj);
                return;
            case 21:
                StravaConfigActivity stravaConfigActivity = (StravaConfigActivity) this.f946b;
                d20.f fVar2 = (d20.f) obj;
                stravaConfigActivity.f44957n = fVar2;
                if (fVar2 == null) {
                    Toast.makeText(stravaConfigActivity, R.string.txt_error_occurred, 0).show();
                    return;
                }
                String str4 = stravaConfigActivity.f44947d;
                if (str4 == null) {
                    stravaConfigActivity.ga(null, null);
                    return;
                }
                com.garmin.android.apps.connectmobile.strava.a aVar17 = new com.garmin.android.apps.connectmobile.strava.a(stravaConfigActivity.f44952i, str4);
                stravaConfigActivity.f44944a = aVar17;
                aVar17.b();
                return;
            case 22:
                fr2.f.A4((fr2.f) this.f946b, (ArrayList) obj);
                return;
            case 23:
                f(obj);
                return;
            case 24:
                g(obj);
                return;
            case 25:
                h(obj);
                return;
            case 26:
                i(obj);
                return;
            case 27:
                j(obj);
                return;
            case 28:
                k(obj);
                return;
            default:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a aVar18 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a) this.f946b;
                g3 g3Var3 = (g3) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a.C0894a c0894a = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a.f46181e;
                if (g3Var3 != null) {
                    int i28 = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a.b.f46186a[g3Var3.f35300a.ordinal()];
                    if (i28 == 1) {
                        e.l(aVar18);
                        return;
                    }
                    if (i28 != 2) {
                        if (i28 != 3) {
                            u0.r();
                            return;
                        }
                        e.a(aVar18, null);
                        e.f(aVar18);
                        androidx.fragment.app.m activity = aVar18.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, new Intent().putExtra("GCM_extra_event_updated", true));
                            activity.finish();
                            return;
                        }
                        return;
                    }
                    e.f(aVar18);
                    ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).T3(true);
                    boolean z17 = aVar18.f46183b;
                    if (!z17) {
                        if (z17) {
                            u0.r();
                            return;
                        } else {
                            aVar18.v6();
                            return;
                        }
                    }
                    rt1.m mVar5 = (rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null);
                    Context contextRequireContext9 = aVar18.requireContext();
                    contextRequireContext9.getClass();
                    aVar18.startActivity(mVar5.g(contextRequireContext9));
                    aVar18.v6();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ b(Object obj, int i14) {
        this.f945a = i14;
        this.f946b = obj;
    }
}
