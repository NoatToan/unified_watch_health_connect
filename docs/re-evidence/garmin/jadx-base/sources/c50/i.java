package c50;

import am.x0;
import am.z0;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.m;
import c22.r2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.library.mapsdkadapter.q;
import com.google.android.gms.maps.model.LatLng;
import f12.l;
import ie2.p;
import java.util.ArrayList;
import java.util.List;
import k30.t;
import k30.x;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lc50/i;", "Lj40/c;", "", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends j40.c {

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final a f24502a1 = new a(null);
    public boolean W0 = true;
    public boolean X0;
    public com.garmin.android.library.mapsdkadapter.e Y0;
    public List<Integer> Z0;

    /* JADX WARN: Code duplicated, block: B:85:0x023d  */
    public final void b8(com.garmin.android.apps.connectmobile.courses.model.e eVar, boolean z14, boolean z15) {
        qe2.h hVar;
        boolean z16;
        boolean z17;
        List<Integer> list;
        i iVar = this;
        if (iVar.getActivity() == null || (hVar = iVar.f148294e) == null) {
            return;
        }
        List<GeoPointDTO> list2 = eVar != null ? eVar.geoPoints : null;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        com.garmin.android.library.mapsdkadapter.i.b bVarH = eVar.h();
        iVar.L0 = bVarH;
        ArrayList arrayList = iVar.J0;
        if (z15) {
            iVar.I6();
            arrayList.clear();
        }
        com.garmin.android.library.mapsdkadapter.e.a aVar = new com.garmin.android.library.mapsdkadapter.e.a();
        k40.e eVar2 = iVar.f97005i;
        q qVarA = eVar2.a();
        p pVar = qVarA.f50328a;
        if (z14) {
            m mVarRequireActivity = iVar.requireActivity();
            x0 x0VarG = eVar.g();
            boolean zG0 = z0.g0(x0VarG);
            int i14 = R.color.gcm_polyline_activity_lap_descent;
            iVar.Z.add(new sw0.g(z0.e(eVar.g(), true), Integer.valueOf(R.drawable.legend_thick_line), Integer.valueOf(a7.b.getColor(mVarRequireActivity, zG0 ? R.color.gcm_polyline_activity_lap_ascent : z0.h0(x0VarG) ? R.color.gcm_polyline_activity_lap_descent : k40.e.f102838b)), null, null, 24, null));
            m mVarRequireActivity2 = iVar.requireActivity();
            x0 x0VarG2 = eVar.g();
            if (z0.g0(x0VarG2)) {
                i14 = R.color.gcm_polyline_activity_lap_ascent;
            } else if (!z0.h0(x0VarG2)) {
                i14 = k40.e.f102838b;
            }
            pVar.f93156d = a7.b.getColor(mVarRequireActivity2, i14);
            pVar.f93161i = true;
        }
        List<Integer> list3 = iVar.Z0;
        k40.d dVar = iVar.f97011n;
        if (list3 == null || list3.isEmpty() || z14) {
            q qVarA2 = eVar2.a();
            p pVar2 = qVarA2.f50328a;
            pVar2.f93156d = a7.b.getColor(iVar.requireContext(), R.color.gcm_system_static_black);
            pVar2.f93155c = 17.0f;
            pVar2.f93158f = -110.0f;
            pVar.f93155c = 13.0f;
            pVar.f93158f = -100.0f;
            boolean z18 = false;
            for (GeoPointDTO geoPointDTO : list2) {
                dVar.getClass();
                com.garmin.android.library.mapsdkadapter.f fVarB = k40.d.b(geoPointDTO, bVarH);
                if (fVarB != null) {
                    pVar.f93153a.add(fVarB);
                    pVar2.f93153a.add(fVarB);
                    arrayList.add(fVarB);
                    aVar.b(fVarB);
                    z18 = true;
                }
            }
            hVar.h(qVarA2);
            hVar.h(qVarA);
            z16 = z18;
        } else {
            List<com.garmin.android.apps.connectmobile.courses.model.g> list4 = eVar.intervalMarkers;
            if (list4 != null && !list4.isEmpty()) {
                List list5 = iVar.Z0;
                if (list5 == null) {
                    list5 = j0.f134944a;
                }
                int size = list4.size() - 1;
                int i15 = 0;
                while (i15 < size) {
                    com.garmin.android.apps.connectmobile.courses.model.g gVar = list4.get(i15);
                    int i16 = i15 + 1;
                    com.garmin.android.apps.connectmobile.courses.model.g gVar2 = list4.get(i16);
                    int size2 = i15 % list5.size();
                    int color = a7.b.getColor(iVar.requireContext(), R.color.gcm_surface_3);
                    q qVarA3 = eVar2.a();
                    List<com.garmin.android.apps.connectmobile.courses.model.g> list6 = list4;
                    int i17 = size;
                    List list7 = list5;
                    iVar.c7(list2, gVar, gVar2, color, aVar, bVarH, qVarA3);
                    p pVar3 = qVarA3.f50328a;
                    pVar3.f93155c = 15.0f;
                    pVar3.f93158f = -100.0f;
                    pVar3.f93166n = true;
                    hVar.h(qVarA3);
                    int iIntValue = ((Number) list7.get(size2)).intValue();
                    q qVarA4 = eVar2.a();
                    iVar = this;
                    iVar.c7(list2, gVar, gVar2, iIntValue, aVar, bVarH, qVarA4);
                    p pVar4 = qVarA4.f50328a;
                    pVar4.f93155c = 15.0f;
                    pVar4.f93158f = 0.0f;
                    hVar.h(qVarA4);
                    i15 = i16;
                    list5 = list7;
                    list4 = list6;
                    size = i17;
                }
            }
            z16 = false;
        }
        List<Integer> list8 = iVar.Z0;
        if (list8 == null || list8.isEmpty()) {
            j40.c.Q7(iVar, arrayList);
        }
        GeoPointDTO geoPointDTOD = eVar.D();
        if (geoPointDTOD == null || !geoPointDTOD.b()) {
            geoPointDTOD = (GeoPointDTO) h0.d0(list2);
        }
        GeoPointDTO geoPointDTO2 = (GeoPointDTO) h0.n0(list2);
        if (geoPointDTOD != null) {
            dVar.getClass();
            com.garmin.android.library.mapsdkadapter.f fVarB2 = k40.d.b(geoPointDTOD, bVarH);
            if (fVarB2 != null) {
                com.garmin.android.library.mapsdkadapter.p pVar5 = new com.garmin.android.library.mapsdkadapter.p();
                pVar5.b(2131232000);
                pVar5.d(fVarB2);
                pVar5.a(0.5f, 0.9f);
                Context contextRequireContext = iVar.requireContext();
                contextRequireContext.getClass();
                if (c22.b.f(contextRequireContext)) {
                    pVar5.f50327a.f50312d = iVar.getString(R.string.lbl_start);
                }
                hVar.x(pVar5);
                aVar.b(fVarB2);
                z16 = true;
            }
        }
        if (geoPointDTO2 != null) {
            dVar.getClass();
            com.garmin.android.library.mapsdkadapter.f fVarB3 = k40.d.b(geoPointDTO2, bVarH);
            if (fVarB3 != null) {
                com.garmin.android.library.mapsdkadapter.p pVar6 = new com.garmin.android.library.mapsdkadapter.p();
                pVar6.b(2131232001);
                pVar6.d(fVarB3);
                pVar6.a(0.5f, 0.9f);
                Context contextRequireContext2 = iVar.requireContext();
                contextRequireContext2.getClass();
                if (c22.b.f(contextRequireContext2)) {
                    pVar6.f50327a.f50312d = iVar.getString(R.string.lbl_stop);
                }
                hVar.x(pVar6);
                aVar.b(fVarB3);
                z17 = true;
            } else {
                z17 = z16;
            }
        } else {
            z17 = z16;
        }
        List<Integer> list9 = iVar.Z0;
        if (list9 == null || list9.isEmpty()) {
            iVar.C6(eVar.j(), ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y());
        }
        iVar.L7(eVar, hVar);
        boolean zG = eVar.G();
        iVar.P = zG;
        iVar.T7(!zG && (iVar.V6().f109894b || !((list = iVar.Z0) == null || list.isEmpty())));
        if (z17) {
            iVar.f97019x = aVar.a();
            iVar.X6().setRecenterMapClickListener(new r2(0, new b41.a(iVar, 15), 1, null));
            if (iVar.W0) {
                iVar.u6(iVar.f97019x, iVar.f148290a);
            }
        }
    }

    public final void c8(LatLng latLng) {
        v6(new com.garmin.android.library.mapsdkadapter.f(latLng, com.garmin.android.library.mapsdkadapter.i.b.WGS84), 15);
    }

    @Override // j40.c
    public final void d7(com.garmin.android.library.mapsdkadapter.f fVar) {
    }

    public final void e8(w20.a aVar) {
        ArrayList arrayListN;
        ArrayList arrayListQ;
        aVar.getClass();
        List<fn0.a> list = aVar.f181478c;
        com.garmin.android.apps.connectmobile.courses.model.e eVar = aVar.f181476a;
        f8(eVar);
        this.K0 = eVar.y();
        List<ClimbDTO> list2 = aVar.f181477b;
        if (list2 != null && !list2.isEmpty()) {
            P7(list2);
        }
        if (list != null && !list.isEmpty()) {
            G6(list);
        }
        x xVar = aVar.f181479d;
        if (xVar != null && (arrayListQ = f0.q(xVar, eVar)) != null && !arrayListQ.isEmpty()) {
            U7(arrayListQ);
        }
        t tVar = aVar.f181480e;
        if (tVar == null || (arrayListN = lg.d.n(tVar, eVar)) == null || arrayListN.isEmpty()) {
            return;
        }
        R7(arrayListN);
    }

    public final void f8(com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        eVar.getClass();
        this.J0.clear();
        b8(eVar, false, true);
    }

    @Override // j40.c, qw0.a, com.garmin.android.library.mapsdkadapter.i.l
    public final void h1(com.garmin.android.library.mapsdkadapter.i iVar) {
        List<Integer> list;
        qe2.h hVar;
        super.h1(iVar);
        M6();
        K6();
        boolean z14 = false;
        if (this.X0) {
            com.garmin.android.library.mapsdkadapter.e eVar = this.Y0;
            if (eVar != null && (hVar = this.f148294e) != null) {
                hVar.v(eVar, 125);
            }
            this.X0 = false;
        } else {
            u6(this.f97019x, this.f148290a);
        }
        if (!this.P && (V6().f109894b || ((list = this.Z0) != null && !list.isEmpty()))) {
            z14 = true;
        }
        T7(z14);
    }

    @Override // j40.c, qw0.a, com.garmin.android.library.mapsdkadapter.i.g
    public final void onCameraIdle() {
        a8();
        C7();
        s30.c cVar = this.R0;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // j40.c, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.D = false;
        this.E = false;
        this.F = false;
        this.O0 = false;
    }

    @Override // j40.c, qw0.a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        M6();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lc50/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MAIN_POLYLINE_Z_INDEX", "F", "UNDERLAY_MAIN_POLYLINE_Z_INDEX", "", "COURSE_BOUNDS_PADDING", "I", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
