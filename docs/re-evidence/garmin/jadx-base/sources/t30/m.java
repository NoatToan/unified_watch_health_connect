package t30;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.v0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e23.p;
import e23.q;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lt30/m;", "Lcom/garmin/android/apps/connectmobile/v0;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends v0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f162192o = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q<? super ClimbDTO, ? super Integer, ? super Integer, Unit> f162193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p<? super Integer, ? super Integer, Unit> f162194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<ClimbDTO> f162195m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f162196n;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"t30/m$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends BottomSheetBehavior.BottomSheetCallback {
        public b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onSlide(View view2, float f14) {
            view2.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onStateChanged(View view2, int i14) {
            view2.getClass();
            m mVar = m.this;
            p<? super Integer, ? super Integer, Unit> pVar = mVar.f162194l;
            if (pVar != null) {
                pVar.invoke(Integer.valueOf(i14), Integer.valueOf(mVar.w6().getPeekHeight()));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements View.OnLayoutChangeListener {
        public c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
            view2.removeOnLayoutChangeListener(this);
            View viewFindViewById = view2.findViewById(R.id.bottom_sheet_header);
            View viewFindViewById2 = view2.findViewById(R.id.scroll_view_content);
            a aVar = m.f162192o;
            m mVar = m.this;
            mVar.w6().setPeekHeight(Math.min(viewFindViewById2.getMeasuredHeight() + viewFindViewById.getMeasuredHeight(), mVar.getResources().getDisplayMetrics().heightPixels / 2));
            p<? super Integer, ? super Integer, Unit> pVar = mVar.f162194l;
            if (pVar != null) {
                pVar.invoke(Integer.valueOf(mVar.w6().getState()), Integer.valueOf(mVar.w6().getPeekHeight()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m() {
        super(R.layout.course_climbs_bottom_sheet_content, null, 2, 0 == true ? 1 : 0);
        this.f162196n = new b();
    }

    @Override // com.garmin.android.apps.connectmobile.v0
    public final String A6() {
        return null;
    }

    public final void C6() {
        View view2 = getView();
        if (view2 != null) {
            if (!view2.isLaidOut() || view2.isLayoutRequested()) {
                view2.addOnLayoutChangeListener(new c());
                return;
            }
            View viewFindViewById = view2.findViewById(R.id.bottom_sheet_header);
            View viewFindViewById2 = view2.findViewById(R.id.scroll_view_content);
            w6().setPeekHeight(Math.min(viewFindViewById2.getMeasuredHeight() + viewFindViewById.getMeasuredHeight(), getResources().getDisplayMetrics().heightPixels / 2));
            p<? super Integer, ? super Integer, Unit> pVar = this.f162194l;
            if (pVar != null) {
                pVar.invoke(Integer.valueOf(w6().getState()), Integer.valueOf(w6().getPeekHeight()));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List<ClimbDTO> listB1;
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
        this.f162195m = listB1;
    }

    @Override // com.garmin.android.apps.connectmobile.v0, com.garmin.android.apps.connectmobile.c0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        w6().addBottomSheetCallback(this.f162196n);
        C6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.c0
    public final void u6(View view2) {
        Context context = view2.getContext();
        context.getClass();
        m00.a aVar = new m00.a(context, null, 2, 0 == true ? 1 : 0);
        y30.a aVar2 = new y30.a(new l22.a(context));
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.course_climbs_container);
        if (composeView != null) {
            composeView.setContent(new z3.e(-353193580, true, new l(this, aVar, aVar2, context, 0)));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.v0
    public final String z6() {
        List<ClimbDTO> list = this.f162195m;
        if (list == null) {
            s.m("climbs");
            throw null;
        }
        if (list.size() <= 1) {
            String string = getString(R.string.lbl_single_climb);
            string.getClass();
            return string;
        }
        List<ClimbDTO> list2 = this.f162195m;
        if (list2 == null) {
            s.m("climbs");
            throw null;
        }
        String string2 = getString(R.string.lbl_climbs_number_format, String.valueOf(list2.size()));
        string2.getClass();
        return string2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lt30/m$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_CLIMBS", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
