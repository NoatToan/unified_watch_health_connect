package t30;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.v0;
import com.google.android.gms.maps.model.LatLng;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import me2.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lt30/c;", "Lcom/garmin/android/apps/connectmobile/v0;", "<init>", "()V", "b", "a", "Lx30/a;", "actionsUiState", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends v0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f162148z = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<ClimbDTO> f162149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ClimbDTO f162150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f162151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f162152n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f162153o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f162154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f162155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f162156r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p2 f162157t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f162158v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a f162159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p<? super Integer, ? super Integer, Unit> f162160x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e23.l<? super Integer, Unit> f162161y;

    public interface a {
        void a(com.garmin.android.library.mapsdkadapter.f fVar);

        void b(List<GeoPointDTO> list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        super(R.layout.compose_bottom_sheet_content, null, 2, 0 == true ? 1 : 0);
        this.f162151m = -1;
        this.f162152n = -1;
        this.f162153o = new ArrayList();
        this.f162157t = q2.a(null);
        this.f162158v = -1;
    }

    @Override // com.garmin.android.apps.connectmobile.v0
    public final String A6() {
        return null;
    }

    @Override // com.garmin.android.apps.connectmobile.v0
    public final void dismiss() {
        super.dismiss();
        e23.l<? super Integer, Unit> lVar = this.f162161y;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(this.f162158v));
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    /* JADX WARN: Code duplicated, block: B:74:0x0118  */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List<ClimbDTO> listB1;
        List listB2;
        boolean z14;
        super.onCreate(bundle);
        l2.f37135b.getClass();
        Bundle bundleC = l2.a.b().c(this);
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
        this.f162149k = listB1;
        if (listB1 == null) {
            s.m("climbs");
            throw null;
        }
        if (listB1.isEmpty()) {
            dismiss();
            return;
        }
        this.f162151m = bundleC != null ? bundleC.getInt("EXTRA_CLIMB_INDEX", -1) : -1;
        this.f162152n = bundleC != null ? bundleC.getInt("EXTRA_NO_OF_CLIMBS", -1) : -1;
        ArrayList arrayList = this.f162153o;
        arrayList.clear();
        if (bundleC == null) {
            listB2 = null;
        } else {
            ArrayList parcelableArrayList2 = Build.VERSION.SDK_INT >= 33 ? bundleC.getParcelableArrayList("EXTRA_COURSE_POINTS", com.garmin.android.library.mapsdkadapter.f.class) : bundleC.getParcelableArrayList("EXTRA_COURSE_POINTS");
            if (parcelableArrayList2 != null) {
                listB2 = h0.b1(parcelableArrayList2);
            } else {
                listB2 = null;
            }
        }
        if (listB2 == null) {
            listB2 = j0.f134944a;
        }
        arrayList.addAll(listB2);
        this.f162154p = bundleC != null ? bundleC.getBoolean("EXTRA_SHOW_ADD_TO_COURSE") : false;
        this.f162155q = bundleC != null ? bundleC.getBoolean("EXTRA_SHOW_EXIT_LINK") : false;
        this.f162156r = bundleC != null ? bundleC.getBoolean("EXTRA_COURSE_EDIT_MODE") : false;
        List<ClimbDTO> list = this.f162149k;
        if (list == null) {
            s.m("climbs");
            throw null;
        }
        ClimbDTO climbDTO = (ClimbDTO) h0.e0(this.f162151m, list);
        if (climbDTO == null) {
            List<ClimbDTO> list2 = this.f162149k;
            if (list2 == null) {
                s.m("climbs");
                throw null;
            }
            climbDTO = (ClimbDTO) h0.b0(list2);
        }
        this.f162150l = climbDTO;
        this.f162158v = this.f162151m;
        t30.b bVar = new t30.b(this, 0);
        t30.b bVar2 = new t30.b(this, 1);
        boolean z15 = this.f162154p;
        boolean zIsEmpty = arrayList.isEmpty();
        ClimbDTO climbDTO2 = this.f162150l;
        if (climbDTO2 == null) {
            s.m("climbDTO");
            throw null;
        }
        GeoPointDTO geoPointDTO = (GeoPointDTO) h0.d0(climbDTO2.m());
        if (geoPointDTO != null) {
            Double d14 = geoPointDTO.latitude;
            double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
            Double d15 = geoPointDTO.longitude;
            com.garmin.android.library.mapsdkadapter.f fVarB = z.b(new LatLng(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d));
            com.garmin.android.library.mapsdkadapter.f fVar = (com.garmin.android.library.mapsdkadapter.f) h0.n0(arrayList);
            if (fVar == null || !fVar.d(fVarB, -1.0f)) {
                z14 = false;
            } else {
                z14 = true;
            }
        } else {
            z14 = false;
        }
        this.f162157t.k(null, new x30.a(z15, zIsEmpty, z14, bVar, bVar2));
    }

    @Override // com.garmin.android.apps.connectmobile.v0, com.garmin.android.apps.connectmobile.c0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        w6().setPeekHeight(getResources().getDisplayMetrics().heightPixels / 2);
    }

    @Override // com.garmin.android.apps.connectmobile.c0
    public final void u6(View view2) {
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.compose_content_view);
        if (composeView != null) {
            composeView.setContent(new z3.e(-1005718660, true, new t30.a(this, 0)));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.v0
    public final String z6() {
        String string = getString(R.string.climb_details);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lt30/c$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_CLIMBS", "EXTRA_CLIMB_INDEX", "EXTRA_NO_OF_CLIMBS", "EXTRA_COURSE_POINTS", "EXTRA_SHOW_ADD_TO_COURSE", "EXTRA_SHOW_EXIT_LINK", "EXTRA_COURSE_EDIT_MODE", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static c a(ArrayList arrayList, int i14, int i15, List list, boolean z14, boolean z15, boolean z16) {
            list.getClass();
            c cVar = new c();
            l2.a aVar = l2.f37135b;
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("EXTRA_CLIMBS", arrayList);
            bundle.putInt("EXTRA_CLIMB_INDEX", i14);
            bundle.putInt("EXTRA_NO_OF_CLIMBS", i15);
            bundle.putParcelableArrayList("EXTRA_COURSE_POINTS", new ArrayList<>(list));
            bundle.putBoolean("EXTRA_SHOW_ADD_TO_COURSE", z14);
            bundle.putBoolean("EXTRA_SHOW_EXIT_LINK", z15);
            bundle.putBoolean("EXTRA_COURSE_EDIT_MODE", z16);
            Unit unit = Unit.INSTANCE;
            aVar.getClass();
            l2.a.c(cVar, bundle);
            return cVar;
        }

        private b() {
        }
    }
}
