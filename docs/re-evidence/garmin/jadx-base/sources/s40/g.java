package s40;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c0;
import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls40/g;", "Lcom/garmin/android/apps/connectmobile/c0;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends c0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f157056i = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c60.e.c f157057h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"s40/g$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            g gVar = g.this;
            c60.e.c cVar = gVar.f157057h;
            if (cVar != null) {
                cVar.a(i14, gVar.w6().getPeekHeight());
            }
        }
    }

    public g() {
        super(R.layout.compose_bottom_sheet_header, null, R.layout.compose_bottom_sheet_content, false, 10, null);
    }

    @Override // com.garmin.android.apps.connectmobile.c0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        w6().addBottomSheetCallback(new b());
        View view3 = getView();
        if (view3 != null) {
            if (!view3.isLaidOut() || view3.isLayoutRequested()) {
                view3.addOnLayoutChangeListener(new h(this));
                return;
            }
            View viewFindViewById = view3.findViewById(R.id.bottom_sheet_header);
            View viewFindViewById2 = view3.findViewById(R.id.scroll_view_content);
            w6().setPeekHeight(viewFindViewById2.getMeasuredHeight() + viewFindViewById.getMeasuredHeight());
            c60.e.c cVar = this.f157057h;
            if (cVar != null) {
                cVar.a(w6().getState(), w6().getPeekHeight());
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c0
    public final void u6(View view2) {
        Parcelable parcelable;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i14 = Build.VERSION.SDK_INT;
            List listB1 = null;
            if (i14 >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("POI_DETAILS", PointOfInterestDTO.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("POI_DETAILS");
                if (!(parcelable2 instanceof PointOfInterestDTO)) {
                    parcelable2 = null;
                }
                parcelable = (PointOfInterestDTO) parcelable2;
            }
            PointOfInterestDTO pointOfInterestDTO = (PointOfInterestDTO) parcelable;
            if (pointOfInterestDTO == null) {
                return;
            }
            Bundle arguments2 = getArguments();
            boolean z14 = arguments2 != null ? arguments2.getBoolean("EXTRA_SHOW_EXIT_LINK") : false;
            Bundle arguments3 = getArguments();
            boolean z15 = arguments3 != null ? arguments3.getBoolean("EXTRA_COURSE_EDIT_MODE") : false;
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                ArrayList parcelableArrayList = i14 >= 33 ? arguments4.getParcelableArrayList("EXTRA_GEO_COURSE_POINTS", com.garmin.android.library.mapsdkadapter.f.class) : arguments4.getParcelableArrayList("EXTRA_GEO_COURSE_POINTS");
                if (parcelableArrayList != null) {
                    listB1 = h0.b1(parcelableArrayList);
                }
            }
            if (listB1 == null) {
                listB1 = j0.f134944a;
            }
            t40.a aVar = new t40.a(z14, z15, new d(this, 0), new rk0.f(17, this, pointOfInterestDTO), listB1.isEmpty());
            ComposeView composeView = (ComposeView) view2.findViewById(R.id.compose_content_view);
            if (composeView != null) {
                composeView.setContent(new z3.e(1579252240, true, new e(aVar, 0, (byte) 0)));
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c0
    public final void v6(View view2) {
        Parcelable parcelable;
        ComposeView composeView;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("POI_DETAILS", PointOfInterestDTO.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("POI_DETAILS");
                if (!(parcelable2 instanceof PointOfInterestDTO)) {
                    parcelable2 = null;
                }
                parcelable = (PointOfInterestDTO) parcelable2;
            }
            PointOfInterestDTO pointOfInterestDTO = (PointOfInterestDTO) parcelable;
            if (pointOfInterestDTO == null || (composeView = (ComposeView) view2.findViewById(R.id.compose_header_view)) == null) {
                return;
            }
            composeView.setContent(new z3.e(1234897584, true, new f(this, pointOfInterestDTO, 0)));
        }
    }

    public final void z6() {
        c60.e.c cVar = this.f157057h;
        if (cVar != null) {
            c60.e.d(cVar.f24626a, "POIDetailsBottomSheet");
            cVar.f24627b.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Ls40/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_POI_DETAILS", "EXTRA_GEO_COURSE_POINTS", "EXTRA_SHOW_EXIT_LINK", "EXTRA_COURSE_EDIT_MODE", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
