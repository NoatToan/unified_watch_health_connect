package com.garmin.android.apps.connectmobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/c0;", "Landroidx/fragment/app/Fragment;", "", "headerLayoutId", "stickyHeaderLayoutId", "contentLayoutId", "", "shouldScrollToBottom", "<init>", "(ILjava/lang/Integer;IZ)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c0 extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f30945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f30947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BottomSheetBehavior<View> f30948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e23.l<? super Integer, Unit> f30950g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/c0$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends BottomSheetBehavior.BottomSheetCallback {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onSlide(View view2, float f14) {
            view2.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onStateChanged(View view2, int i14) {
            view2.getClass();
            c0 c0Var = c0.this;
            c0Var.f30949f = i14;
            e23.l<? super Integer, Unit> lVar = c0Var.f30950g;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(i14));
            }
            c0Var.y6();
        }
    }

    public c0(int i14, Integer num, int i15, boolean z14) {
        this.f30944a = i14;
        this.f30945b = num;
        this.f30946c = i15;
        this.f30947d = z14;
        this.f30949f = 5;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.base_standard_bottom_sheet, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.bottom_sheet_header);
        viewFindViewById.getClass();
        ViewStub viewStub = (ViewStub) viewFindViewById;
        viewStub.setLayoutResource(this.f30944a);
        viewStub.inflate();
        Integer num = this.f30945b;
        if (num != null) {
            View viewFindViewById2 = viewInflate.findViewById(R.id.sticky_header);
            viewFindViewById2.getClass();
            ViewStub viewStub2 = (ViewStub) viewFindViewById2;
            viewStub2.setLayoutResource(num.intValue());
            viewStub2.inflate();
        }
        View viewFindViewById3 = viewInflate.findViewById(R.id.scroll_view_content);
        viewFindViewById3.getClass();
        ViewStub viewStub3 = (ViewStub) viewFindViewById3;
        viewStub3.setLayoutResource(this.f30946c);
        viewStub3.inflate();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        List<Fragment> listF = getParentFragmentManager().f7372c.f();
        listF.getClass();
        Iterator<T> it = listF.iterator();
        while (it.hasNext()) {
            View view2 = ((Fragment) it.next()).getView();
            if (view2 != null) {
                view2.setImportantForAccessibility(1);
            }
        }
        e23.l<? super Integer, Unit> lVar = this.f30950g;
        if (lVar != null) {
            lVar.invoke(5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        BottomSheetBehavior<View> bottomSheetBehaviorFrom = BottomSheetBehavior.from(view2.findViewById(R.id.bottom_sheet_container));
        bottomSheetBehaviorFrom.getClass();
        this.f30948e = bottomSheetBehaviorFrom;
        View viewFindViewById = view2.findViewById(R.id.bottom_sheet_header);
        viewFindViewById.getClass();
        v6(viewFindViewById);
        k32.o oVar = new k32.o(view2);
        k32.m mVar = new k32.m(oVar, 0);
        NestedScrollView nestedScrollView = oVar.f102716b;
        nestedScrollView.setOnScrollChangeListener(mVar);
        if (this.f30947d) {
            nestedScrollView.postDelayed(new k32.n(nestedScrollView, 0), 500L);
        }
        View viewFindViewById2 = view2.findViewById(R.id.scroll_view_content);
        viewFindViewById2.getClass();
        u6(viewFindViewById2);
        this.f30949f = w6().getState();
        y6();
        w6().addBottomSheetCallback(new a());
    }

    public abstract void u6(View view2);

    public abstract void v6(View view2);

    public final BottomSheetBehavior<View> w6() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.f30948e;
        if (bottomSheetBehavior != null) {
            return bottomSheetBehavior;
        }
        p005kotlin.jvm.internal.s.m("bottomSheetBehavior");
        throw null;
    }

    public final void y6() {
        List<Fragment> listF = getParentFragmentManager().f7372c.f();
        listF.getClass();
        Fragment fragment = (Fragment) p13.h0.m0(listF);
        List<Fragment> listF2 = getParentFragmentManager().f7372c.f();
        listF2.getClass();
        for (Fragment fragment2 : p13.h0.V(1, listF2)) {
            if (!(fragment instanceof c0)) {
                View view2 = fragment2.getView();
                if (view2 != null) {
                    view2.setImportantForAccessibility(1);
                }
            } else if (((c0) fragment).f30949f == 3) {
                View view3 = fragment2.getView();
                if (view3 != null) {
                    view3.setImportantForAccessibility(4);
                }
            } else if (fragment2 instanceof c0) {
                View view4 = ((c0) fragment2).getView();
                if (view4 != null) {
                    view4.setImportantForAccessibility(4);
                }
            } else {
                View view5 = fragment2.getView();
                if (view5 != null) {
                    view5.setImportantForAccessibility(1);
                }
            }
        }
    }

    public /* synthetic */ c0(int i14, Integer num, int i15, boolean z14, int i16, p005kotlin.jvm.internal.j jVar) {
        this(i14, (i16 & 2) != 0 ? null : num, i15, (i16 & 8) != 0 ? false : z14);
    }
}
