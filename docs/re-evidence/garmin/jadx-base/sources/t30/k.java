package t30;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.v0;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me2.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.y;
import s70.b0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lt30/k;", "Lcom/garmin/android/apps/connectmobile/v0;", "<init>", "()V", "b", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends v0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f162180q = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<ClimbDTO> f162181k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f162182l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f162183m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f162184n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f162185o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f162186p;

    public interface a {
        void a(com.garmin.android.library.mapsdkadapter.f fVar);

        void b(ClimbDTO climbDTO, int i14, int i15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k() {
        super(R.layout.climb_system_bottom_sheet_content, null, 2, 0 == true ? 1 : 0);
        this.f162182l = new ArrayList();
    }

    @Override // com.garmin.android.apps.connectmobile.v0
    public final String A6() {
        List<ClimbDTO> list = this.f162181k;
        if (list == null) {
            s.m("climbs");
            throw null;
        }
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((ClimbDTO) it.next()).getCategory().ordinal()));
        }
        int iIntValue = ((Number) h0.x0(arrayList)).intValue();
        int iIntValue2 = ((Number) h0.s0(arrayList)).intValue();
        com.garmin.android.apps.connectmobile.courses.model.b bVar = com.garmin.android.apps.connectmobile.courses.model.b.INVALID;
        if (iIntValue == bVar.ordinal() || iIntValue2 == bVar.ordinal()) {
            return null;
        }
        if (iIntValue != iIntValue2) {
            w13.c cVar = com.garmin.android.apps.connectmobile.courses.model.b.f32827m;
            return getString(R.string.lbl_category_number, getString(R.string.string_line_string_pattern_no_space, C6((com.garmin.android.apps.connectmobile.courses.model.b) cVar.get(iIntValue)), C6((com.garmin.android.apps.connectmobile.courses.model.b) cVar.get(iIntValue2))));
        }
        String strC6 = C6((com.garmin.android.apps.connectmobile.courses.model.b) com.garmin.android.apps.connectmobile.courses.model.b.f32827m.get(iIntValue));
        j23.l lVar = new j23.l(com.garmin.android.apps.connectmobile.courses.model.b.FOURTH_CATEGORY.ordinal(), com.garmin.android.apps.connectmobile.courses.model.b.FIRST_CATEGORY.ordinal());
        return (iIntValue > lVar.f96797b || lVar.f96796a > iIntValue) ? strC6 : getString(R.string.lbl_category_number, strC6);
    }

    public final String C6(com.garmin.android.apps.connectmobile.courses.model.b bVar) {
        j23.i iVarA = j23.s.a(com.garmin.android.apps.connectmobile.courses.model.b.FOURTH_CATEGORY, com.garmin.android.apps.connectmobile.courses.model.b.FIRST_CATEGORY);
        if (bVar == com.garmin.android.apps.connectmobile.courses.model.b.NONE) {
            String string = getString(R.string.lbl_easy_category);
            string.getClass();
            return string;
        }
        if (bVar != com.garmin.android.apps.connectmobile.courses.model.b.HORS_CATEGORY) {
            return j23.g.a.a(iVarA, bVar) ? String.valueOf(bVar.f32830c) : "";
        }
        String string2 = getString(R.string.lbl_abbreviated_hors_category);
        string2.getClass();
        return string2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List<ClimbDTO> listB1;
        super.onCreate(bundle);
        l2.f37135b.getClass();
        Bundle bundleC = l2.a.b().c(this);
        List listB2 = null;
        if (bundleC == null) {
            listB1 = null;
        } else {
            ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundleC.getParcelableArrayList("EXTRA_CLIMBS", ClimbDTO.class) : bundleC.getParcelableArrayList("EXTRA_CLIMBS");
            if (parcelableArrayList != null) {
                listB1 = h0.b1(parcelableArrayList);
            } else {
                listB1 = null;
            }
        }
        if (listB1 == null) {
            listB1 = j0.f134944a;
        }
        this.f162181k = listB1;
        ArrayList arrayList = this.f162182l;
        arrayList.clear();
        if (bundleC != null) {
            ArrayList parcelableArrayList2 = Build.VERSION.SDK_INT >= 33 ? bundleC.getParcelableArrayList("EXTRA_COURSE_POINTS", com.garmin.android.library.mapsdkadapter.f.class) : bundleC.getParcelableArrayList("EXTRA_COURSE_POINTS");
            if (parcelableArrayList2 != null) {
                listB2 = h0.b1(parcelableArrayList2);
            }
        }
        if (listB2 == null) {
            listB2 = j0.f134944a;
        }
        arrayList.addAll(listB2);
        this.f162183m = bundleC != null ? bundleC.getBoolean("EXTRA_SHOW_ADD_POINT_TO_COURSE") : false;
    }

    @Override // com.garmin.android.apps.connectmobile.v0, com.garmin.android.apps.connectmobile.c0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        w6().setPeekHeight(getResources().getDisplayMetrics().heightPixels / 2);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    @Override // com.garmin.android.apps.connectmobile.c0
    public final void u6(View view2) {
        boolean z14;
        List<GeoPointDTO> listM;
        View viewFindViewById = view2.findViewById(R.id.add_point_to_course_btn);
        viewFindViewById.getClass();
        this.f162185o = viewFindViewById;
        final int i14 = 0;
        viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: t30.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f162179b;

            {
                this.f162179b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                List<GeoPointDTO> listM2;
                int i15 = i14;
                k kVar = this.f162179b;
                switch (i15) {
                    case 0:
                        List<ClimbDTO> list = kVar.f162181k;
                        GeoPointDTO geoPointDTO = null;
                        if (list == null) {
                            s.m("climbs");
                            throw null;
                        }
                        ClimbDTO climbDTO = (ClimbDTO) h0.d0(list);
                        if (climbDTO != null && (listM2 = climbDTO.m()) != null) {
                            geoPointDTO = (GeoPointDTO) h0.d0(listM2);
                        }
                        if (geoPointDTO != null) {
                            kVar.dismiss();
                            Bundle bundle = new Bundle(1);
                            bundle.putString("Screen", "Courses");
                            ht.a.f85464a.getClass();
                            ht.a.a(bundle, "AddStartOfClimbToCourse");
                            Double d14 = geoPointDTO.latitude;
                            double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                            Double d15 = geoPointDTO.longitude;
                            com.garmin.android.library.mapsdkadapter.f fVarB = z.b(new LatLng(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d));
                            k.a aVar = kVar.f162184n;
                            if (aVar != null) {
                                aVar.a(fVarB);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        k.b bVar = k.f162180q;
                        kVar.dismiss();
                        HelpActivity.a.e(HelpActivity.f36653a, kVar.requireActivity(), ro0.l.COURSE_CLIMB_PRO, null, null, 12);
                        return;
                }
            }
        });
        View viewFindViewById2 = view2.findViewById(R.id.add_point_to_course_tv);
        viewFindViewById2.getClass();
        this.f162186p = (TextView) viewFindViewById2;
        View view3 = this.f162185o;
        if (view3 != null) {
            boolean z15 = this.f162183m;
            ArrayList arrayList = this.f162182l;
            if (z15) {
                List<ClimbDTO> list = this.f162181k;
                if (list == null) {
                    s.m("climbs");
                    throw null;
                }
                ClimbDTO climbDTO = (ClimbDTO) h0.d0(list);
                GeoPointDTO geoPointDTO = (climbDTO == null || (listM = climbDTO.m()) == null) ? null : (GeoPointDTO) h0.d0(listM);
                if (geoPointDTO != null) {
                    Double d14 = geoPointDTO.latitude;
                    double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                    Double d15 = geoPointDTO.longitude;
                    com.garmin.android.library.mapsdkadapter.f fVarB = z.b(new LatLng(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d));
                    com.garmin.android.library.mapsdkadapter.f fVar = (com.garmin.android.library.mapsdkadapter.f) h0.n0(arrayList);
                    if (fVar != null && fVar.d(fVarB, -1.0f)) {
                        z14 = false;
                    }
                }
                z14 = true;
            } else {
                z14 = false;
            }
            v22.e.v(view3, z14);
            TextView textView = this.f162186p;
            if (textView == null) {
                s.m("addPointToCourseTV");
                throw null;
            }
            textView.setText(arrayList.isEmpty() ? R.string.start_course_here : R.string.add_this_point_to_course);
        }
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.climbs_rv);
        v30.b bVar = new v30.b();
        List<ClimbDTO> list2 = this.f162181k;
        if (list2 == null) {
            s.m("climbs");
            throw null;
        }
        ArrayList arrayList2 = bVar.f175390a;
        arrayList2.clear();
        arrayList2.addAll(list2);
        bVar.notifyDataSetChanged();
        bVar.f175391b = new b0(this, 16);
        recyclerView.setAdapter(bVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(view2.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setMotionEventSplittingEnabled(false);
        final int i15 = 1;
        view2.findViewById(R.id.help_link_tv).setOnClickListener(new View.OnClickListener(this) { // from class: t30.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f162179b;

            {
                this.f162179b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                List<GeoPointDTO> listM2;
                int i16 = i15;
                k kVar = this.f162179b;
                switch (i16) {
                    case 0:
                        List<ClimbDTO> list3 = kVar.f162181k;
                        GeoPointDTO geoPointDTO2 = null;
                        if (list3 == null) {
                            s.m("climbs");
                            throw null;
                        }
                        ClimbDTO climbDTO2 = (ClimbDTO) h0.d0(list3);
                        if (climbDTO2 != null && (listM2 = climbDTO2.m()) != null) {
                            geoPointDTO2 = (GeoPointDTO) h0.d0(listM2);
                        }
                        if (geoPointDTO2 != null) {
                            kVar.dismiss();
                            Bundle bundle = new Bundle(1);
                            bundle.putString("Screen", "Courses");
                            ht.a.f85464a.getClass();
                            ht.a.a(bundle, "AddStartOfClimbToCourse");
                            Double d16 = geoPointDTO2.latitude;
                            double dDoubleValue2 = d16 != null ? d16.doubleValue() : 0.0d;
                            Double d17 = geoPointDTO2.longitude;
                            com.garmin.android.library.mapsdkadapter.f fVarB2 = z.b(new LatLng(dDoubleValue2, d17 != null ? d17.doubleValue() : 0.0d));
                            k.a aVar = kVar.f162184n;
                            if (aVar != null) {
                                aVar.a(fVarB2);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        k.b bVar2 = k.f162180q;
                        kVar.dismiss();
                        HelpActivity.a.e(HelpActivity.f36653a, kVar.requireActivity(), ro0.l.COURSE_CLIMB_PRO, null, null, 12);
                        return;
                }
            }
        });
    }

    @Override // com.garmin.android.apps.connectmobile.v0
    public final String z6() {
        List<ClimbDTO> list = this.f162181k;
        if (list == null) {
            s.m("climbs");
            throw null;
        }
        if (list.size() <= 1) {
            String string = getString(R.string.lbl_single_climb);
            string.getClass();
            return string;
        }
        List<ClimbDTO> list2 = this.f162181k;
        if (list2 == null) {
            s.m("climbs");
            throw null;
        }
        String string2 = getString(R.string.lbl_climbs_number_format, String.valueOf(list2.size()));
        string2.getClass();
        return string2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lt30/k$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_CLIMBS", "EXTRA_COURSE_POINTS", "EXTRA_SHOW_ADD_POINT_TO_COURSE", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
