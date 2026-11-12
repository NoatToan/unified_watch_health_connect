package com.garmin.android.apps.connectmobile;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v0;", "Lcom/garmin/android/apps/connectmobile/c0;", "", "contentLayoutId", "stickyHeaderLayoutId", "<init>", "(ILjava/lang/Integer;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class v0 extends c0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e23.a<Unit> f47369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f47370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k32.f f47371j;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/v0$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            v0 v0Var = v0.this;
            k32.f fVar = v0Var.f47371j;
            if (fVar != null) {
                ImageView imageView = fVar.f102681b;
                if (i14 == 3) {
                    String string = v0Var.getString(R.string.lbl_bottom_sheet_drag_handle);
                    string.getClass();
                    String string2 = v0Var.getString(R.string.lbl_slide_down_to_collapse);
                    string2.getClass();
                    if (imageView != null) {
                        v22.e.e(imageView, string, string2);
                        return;
                    }
                    return;
                }
                String string3 = v0Var.getString(R.string.lbl_bottom_sheet_drag_handle);
                string3.getClass();
                String string4 = v0Var.getString(R.string.lbl_swipe_up_to_expand);
                string4.getClass();
                if (imageView != null) {
                    v22.e.e(imageView, string3, string4);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/v0$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (i14 == 5) {
                v0.this.dismiss();
            }
        }
    }

    public v0(int i14, Integer num) {
        super(R.layout.close_action_bottom_sheet_header, num, i14, false, 8, null);
        this.f47370i = new b();
    }

    public abstract String A6();

    public void dismiss() {
        e23.a<Unit> aVar = this.f47369h;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        w6().removeBottomSheetCallback(this.f47370i);
        super.onDestroyView();
    }

    @Override // com.garmin.android.apps.connectmobile.c0, androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        w6().setHideable(true);
        w6().setSkipCollapsed(false);
        w6().addBottomSheetCallback(this.f47370i);
    }

    @Override // com.garmin.android.apps.connectmobile.c0
    public final void v6(View view2) {
        k32.f fVar = new k32.f(view2);
        this.f47371j = fVar;
        fVar.a(z6(), A6(), new c32.k(this, 18), true);
        if (w6().getState() == 4) {
            k32.f fVar2 = this.f47371j;
            if (fVar2 == null) {
                p005kotlin.jvm.internal.s.m("headerViewHolder");
                throw null;
            }
            String string = getString(R.string.lbl_bottom_sheet_drag_handle);
            string.getClass();
            String string2 = getString(R.string.lbl_swipe_up_to_expand);
            string2.getClass();
            ImageView imageView = fVar2.f102681b;
            if (imageView != null) {
                v22.e.e(imageView, string, string2);
            }
        }
        w6().addBottomSheetCallback(new a());
    }

    public abstract String z6();

    public /* synthetic */ v0(int i14, Integer num, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, (i15 & 2) != 0 ? null : num);
    }
}
