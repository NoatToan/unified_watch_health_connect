package en0;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Range;
import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.v1;
import bb.v;
import c22.l3;
import c22.z1;
import com.garmin.android.apps.connectmobile.contacts.ContactProfilesActivity;
import com.garmin.android.apps.connectmobile.contacts.details.ContactDetailsActivity;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.settings.devices.fr245m.FR245ActivityTrackingSettingsActivity;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import fa.z;
import fb1.k0;
import fb2.b0;
import g2.m1;
import hx0.a0;
import java.util.ArrayList;
import java.util.Iterator;
import l52.u;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p13.h0;
import p3.p1;
import r22.a2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements u03.d, u, MultiLineImeEditText.a, b0.a, a2.d, p.a, q1.a, com.garmin.android.library.mapsdkadapter.i.j, bb.e.d, xg1.j, OnCompleteListener, com.garmin.android.library.mapsdkadapter.i.o, jw.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f64713b;

    public /* synthetic */ n(Object obj, int i14) {
        this.f64712a = i14;
        this.f64713b = obj;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.j
    public void X(com.garmin.android.library.mapsdkadapter.f fVar) {
        com.garmin.android.apps.connectmobile.weather.defaultlocation.c cVar = (com.garmin.android.apps.connectmobile.weather.defaultlocation.c) this.f64713b;
        com.garmin.android.apps.connectmobile.weather.defaultlocation.c.a aVar = com.garmin.android.apps.connectmobile.weather.defaultlocation.c.f47939y;
        Logger loggerW6 = cVar.w6();
        z1.f23762a.getClass();
        loggerW6.debug("Map was clicked at point ".concat(z1.c(fVar)));
        g42.c cVar2 = cVar.f47942c;
        if (cVar2 == null) {
            p005kotlin.jvm.internal.s.m("preferenceListener");
            throw null;
        }
        if (!cVar2.R0()) {
            cVar.w6().warn("mapClicked: Internet is turned off");
        } else {
            if (cVar.f47941b == null) {
                p005kotlin.jvm.internal.s.m("viewModel");
                throw null;
            }
            Logger logger = g42.q.f75816h;
            androidx.lifecycle.m.a(null, new g42.r(fVar, null), 3).f(cVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.weather.defaultlocation.c.b(new m1(2, cVar, fVar)));
        }
        cVar.y6();
        TextInputEditText textInputEditText = cVar.f47944e;
        if (textInputEditText != null) {
            v22.e.b(textInputEditText);
        } else {
            p005kotlin.jvm.internal.s.m("postalCodeEditText");
            throw null;
        }
    }

    @Override // xg1.j
    public void a(nr0.a aVar) {
        FR245ActivityTrackingSettingsActivity fR245ActivityTrackingSettingsActivity = (FR245ActivityTrackingSettingsActivity) this.f64713b;
        int i14 = FR245ActivityTrackingSettingsActivity.H0;
        aVar.getClass();
        fR245ActivityTrackingSettingsActivity.oa(aVar);
    }

    @Override // u03.d
    public void accept(Object obj) {
        int i14 = this.f64712a;
        Object obj2 = this.f64713b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.handalignment.e.a aVar = com.garmin.android.apps.connectmobile.handalignment.e.f36611b;
                ((c31.e) obj2).invoke(obj);
                break;
            case 1:
                com.garmin.android.apps.connectmobile.handalignment.e.a aVar2 = com.garmin.android.apps.connectmobile.handalignment.e.f36611b;
                ((a42.b) obj2).invoke(obj);
                break;
            case 2:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar3 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                ((e70.a) obj2).invoke(obj);
                break;
            case 3:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar4 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                ((r) obj2).invoke(obj);
                break;
            case 4:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar5 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                ((r) obj2).invoke(obj);
                break;
            case 5:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar6 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                ((r) obj2).invoke(obj);
                break;
            case 6:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar7 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                ((r) obj2).invoke(obj);
                break;
            case 7:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar8 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                ((r) obj2).invoke(obj);
                break;
            case 8:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar9 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                ((e52.b) obj2).invoke(obj);
                break;
            case 9:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar10 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                ((e70.a) obj2).invoke(obj);
                break;
            case 10:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar11 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                ((r) obj2).invoke(obj);
                break;
            case 11:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar12 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                ((e70.a) obj2).invoke(obj);
                break;
            case 12:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar13 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                ((e70.a) obj2).invoke(obj);
                break;
            default:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar14 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                ((e70.a) obj2).invoke(obj);
                break;
        }
    }

    @Override // p.a, u03.f
    /* JADX INFO: renamed from: apply */
    public Object mo330apply(Object obj) {
        g1.r rVar = (g1.r) this.f64713b;
        long jLongValue = ((Long) obj).longValue();
        Range<Long> range = g1.r.H;
        return Long.valueOf(rVar.q(jLongValue));
    }

    @Override // com.garmin.android.apps.connectmobile.view.MultiLineImeEditText.a
    public void b() {
        ww0.b bVarA;
        ww0.b bVarD;
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o oVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o) this.f64713b;
        MultiLineImeEditText multiLineImeEditText = oVar.f40756h;
        if (multiLineImeEditText == null) {
            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
            throw null;
        }
        String strValueOf = String.valueOf(multiLineImeEditText.getText());
        LocalDate localDateU6 = oVar.u6();
        if (localDateU6 == null) {
            localDateU6 = new LocalDate();
        }
        ww0.c cVar = oVar.f40771y;
        if (cVar == null || (bVarA = cVar.getLog()) == null) {
            ww0.b.f187523n.getClass();
            bVarA = ww0.b.a.a(localDateU6);
        }
        String strJ = bVarA.getNotes();
        tb1.a.f163743a.getClass();
        if (tb1.a.C3081a.b(strJ, strValueOf)) {
            ww0.c cVar2 = oVar.f40771y;
            if (cVar2 != null && (bVarD = cVar2.getLog()) != null) {
                bVarD.s(strValueOf);
            }
            bVarA.s(strValueOf);
            g22.e.l(oVar);
            hx0.s sVarV6 = oVar.v6();
            sVarV6.getClass();
            ge1.b.T(v1.a(sVarV6), null, null, new a0(localDateU6, bVarA, sVarV6, null), 3);
            dh.b.L(sVarV6.f86150n, oVar, new com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.d(new k0(oVar, 1)));
        }
        oVar.C6();
    }

    public void c() {
        e23.p pVar = (e23.p) this.f64713b;
        synchronized (f4.l.f68775c) {
            f4.l.f68780h = h0.y0(f4.l.f68780h, pVar);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // fb2.b0.a
    public void e(Object obj) {
        fb2.m.p((fb2.m) this.f64713b, (String) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        g20.n nVar;
        l20.a aVar;
        ArrayList arrayListM;
        int i14 = this.f64712a;
        Object obj = this.f64713b;
        switch (i14) {
            case 21:
                ContactDetailsActivity contactDetailsActivity = (ContactDetailsActivity) obj;
                ContactDetailsActivity.a aVar2 = ContactDetailsActivity.f32429g;
                if (!z14 || (nVar = (g20.n) contactDetailsActivity.ca().f75347k.d()) == null || (aVar = nVar.f75368i) == null || (arrayListM = aVar.M()) == null) {
                    return;
                }
                f.c<Intent> cVar = contactDetailsActivity.f32435f;
                ContactProfilesActivity.a aVar3 = ContactProfilesActivity.f32317e;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = arrayListM.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.garmin.android.apps.connectmobile.contacts.b.n((l20.g) it.next()));
                }
                aVar3.getClass();
                Intent intent = new Intent(contactDetailsActivity, (Class<?>) ContactProfilesActivity.class);
                intent.putParcelableArrayListExtra("extra_key_profiles", arrayList);
                cVar.a(intent, null);
                return;
            default:
                com.garmin.android.apps.connectmobile.contacts.details.b bVar = (com.garmin.android.apps.connectmobile.contacts.details.b) obj;
                com.garmin.android.apps.connectmobile.contacts.details.b.a aVar4 = com.garmin.android.apps.connectmobile.contacts.details.b.f32471d;
                if (z14) {
                    g20.i iVarV6 = bVar.v6();
                    l20.a aVar5 = iVarV6.f75341e;
                    if (aVar5 == null) {
                        p005kotlin.jvm.internal.s.m("contactDTO");
                        throw null;
                    }
                    if (TextUtils.isEmpty(aVar5.getContactId())) {
                        return;
                    }
                    ge1.b.T(v1.a(iVarV6), null, null, new g20.j(iVarV6, null), 3);
                    return;
                }
                return;
        }
    }

    @Override // r22.a2.d
    public void i(String str, int i14, int i15, String str2, String str3, int i16) {
        fv1.c cVar = (fv1.c) this.f64713b;
        double d14 = fb1.c.d(i15, 60, i14 * DateTimeConstants.SECONDS_PER_HOUR, i16);
        cVar.f73690r = d14;
        boolean z14 = false;
        if (d14 <= 0.0d) {
            AppCompatButton appCompatButton = cVar.f73685m;
            if (appCompatButton != null) {
                appCompatButton.setEnabled(false);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("nextButton");
                throw null;
            }
        }
        cVar.F6((long) d14);
        cVar.y6(true);
        AppCompatButton appCompatButton2 = cVar.f73685m;
        if (appCompatButton2 == null) {
            p005kotlin.jvm.internal.s.m("nextButton");
            throw null;
        }
        if (cVar.u6().I != vt1.o.f180176g || (cVar.f73690r > 0.0d && cVar.f73689q > 0.0d)) {
            z14 = true;
        }
        appCompatButton2.setEnabled(z14);
    }

    @Override // l52.u
    public void o(l52.i.a aVar) {
        int i14 = this.f64712a;
        Object obj = this.f64713b;
        switch (i14) {
            case 15:
                m52.j jVar = (m52.j) obj;
                m52.j jVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.f49273q;
                j0 j0Var = (j0) aVar.getData();
                if (zf.b.D(Double.valueOf(j0Var.f48229n))) {
                    j0Var.f48231p = jVar;
                }
                if (zf.b.D(Double.valueOf(j0Var.F))) {
                    m52.j jVar3 = m52.j.f116748h;
                    m52.h hVar = jVar == jVar3 ? m52.h.YARD : m52.h.METER;
                    m52.h hVar2 = j0Var.P;
                    if (hVar2 != hVar) {
                        if (j0Var.E == m52.g.PACE) {
                            l3.a aVar2 = l3.f23124b;
                            double d14 = j0Var.F;
                            boolean z14 = hVar2 != m52.h.YARD;
                            aVar2.getClass();
                            j0Var.F = l3.a.n(l3.a.r(d14, z14), jVar != jVar3);
                        }
                        j0Var.P = hVar;
                    }
                }
                break;
            default:
                j23.l lVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c.C;
                j0 j0Var2 = (j0) aVar.getData();
                WorkoutDetailsDTO workoutDetailsDTO = ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c) obj).f49138r;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.T4(j0Var2, workoutDetailsDTO.f48048i, workoutDetailsDTO.f48047h);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        gh2.b.j((gh2.b) this.f64713b, task);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.o
    public void onSnapshotReady(Bitmap bitmap) {
        ((p1) this.f64713b).setValue(bitmap != null ? new o4.f(bitmap) : null);
    }

    @Override // bb.e.d
    public long timeUsToTargetTime(long j8) {
        v vVar = (v) this.f64713b;
        return z.j((j8 * ((long) vVar.f17261e)) / 1000000, 0L, vVar.f17266j - 1);
    }
}
