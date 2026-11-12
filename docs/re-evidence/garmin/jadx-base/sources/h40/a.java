package h40;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import c60.e;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import fe2.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lh40/a;", "Lcom/garmin/android/apps/connectmobile/c0;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends c0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C1617a f81589i = new C1617a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e.b f81590h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h40/a$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            a aVar = a.this;
            e.b bVar = aVar.f81590h;
            if (bVar != null) {
                bVar.a(i14, aVar.w6().getPeekHeight());
            }
        }
    }

    public a() {
        super(R.layout.course_hazard_details_bottom_sheet_header, null, R.layout.course_bottom_sheet_empty_content, false, 10, null);
    }

    @Override // com.garmin.android.apps.connectmobile.c0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        w6().addBottomSheetCallback(new b());
        View view3 = getView();
        if (view3 != null) {
            if (!view3.isLaidOut() || view3.isLayoutRequested()) {
                view3.addOnLayoutChangeListener(new h40.b(this));
                return;
            }
            View viewFindViewById = view3.findViewById(R.id.bottom_sheet_header);
            View viewFindViewById2 = view3.findViewById(R.id.scroll_view_content);
            w6().setPeekHeight(viewFindViewById2.getMeasuredHeight() + viewFindViewById.getMeasuredHeight());
            e.b bVar = this.f81590h;
            if (bVar != null) {
                bVar.a(w6().getState(), w6().getPeekHeight());
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c0
    public final void u6(View view2) {
    }

    @Override // com.garmin.android.apps.connectmobile.c0
    public final void v6(View view2) {
        Parcelable parcelable;
        Bundle arguments = getArguments();
        fn0.a aVar = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("HAZARD_DETAILS", fn0.a.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("HAZARD_DETAILS");
                parcelable = (fn0.a) (parcelable2 instanceof fn0.a ? parcelable2 : null);
            }
            aVar = (fn0.a) parcelable;
        }
        if (aVar != null) {
            c cVar = new c(view2, new z(this, 28));
            fn0.c cVarH = aVar.h();
            cVar.f81595c.setImageResource(cVarH.f72176d);
            Context context = cVar.f81594b;
            context.getClass();
            cVar.f81596d.setText(dh.b.A(context, cVarH.f72174b));
            String string = context.getString(R.string.lbl_hazard_last_reported, cVar.a(aVar.getLastReportedDateTime(), false));
            TextView textView = cVar.f81597e;
            textView.setText(string);
            textView.setContentDescription(context.getString(R.string.lbl_hazard_last_reported, cVar.a(aVar.getLastReportedDateTime(), true)));
        }
    }

    public final void z6() {
        e.b bVar = this.f81590h;
        if (bVar != null) {
            e.d(bVar.f24623a, "HazardDetailsBottomSheet");
            bVar.f24624b.invoke();
        }
    }

    /* JADX INFO: renamed from: h40.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lh40/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_HAZARD_DETAILS", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1617a {
        public /* synthetic */ C1617a(j jVar) {
            this();
        }

        private C1617a() {
        }
    }
}
