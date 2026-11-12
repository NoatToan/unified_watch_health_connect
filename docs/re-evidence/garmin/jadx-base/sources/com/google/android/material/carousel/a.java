package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.lifecycle.b0;
import androidx.media3.ui.c;
import com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.RescheduleWorkoutActivity;
import j1.k;
import kc.d;
import kc.f;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class a implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53169b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f53168a = i14;
        this.f53169b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        int height;
        int height2;
        int i26 = this.f53168a;
        int i27 = 1;
        Object obj = this.f53169b;
        switch (i26) {
            case 0:
                ((CarouselLayoutManager) obj).lambda$new$0(view2, i14, i15, i16, i17, i18, i19, i24, i25);
                break;
            case 1:
                RescheduleWorkoutActivity rescheduleWorkoutActivity = (RescheduleWorkoutActivity) obj;
                if (rescheduleWorkoutActivity.f45368k == -1) {
                    rescheduleWorkoutActivity.f45368k = i17 - i15;
                }
                break;
            case 2:
                GCMCalendarActivity gCMCalendarActivity = (GCMCalendarActivity) obj;
                if (gCMCalendarActivity.f31071h == -1) {
                    gCMCalendarActivity.f31071h = i17 - i15;
                    if (gCMCalendarActivity.getF158016a().getF7973d().a(b0.b.RESUMED)) {
                        gCMCalendarActivity.pa();
                    }
                }
                break;
            case 3:
                k kVar = (k) obj;
                k.c cVar = k.f96256p;
                if (i16 - i14 != i24 - i18 || i17 - i15 != i25 - i19) {
                    kVar.b();
                    kVar.a(true);
                }
                break;
            case 4:
                c cVar2 = (c) obj;
                int i28 = cVar2.f10060l;
                PopupWindow popupWindow = cVar2.f10057k;
                int i29 = i17 - i15;
                int i30 = i25 - i19;
                if ((i16 - i14 != i24 - i18 || i29 != i30) && popupWindow.isShowing()) {
                    cVar2.q();
                    popupWindow.update(view2, (cVar2.getWidth() - popupWindow.getWidth()) - i28, (-popupWindow.getHeight()) - i28, -1, -1);
                }
                break;
            default:
                f fVar = (f) obj;
                c cVar3 = fVar.f103853a;
                int width = (cVar3.getWidth() - cVar3.getPaddingLeft()) - cVar3.getPaddingRight();
                int height3 = (cVar3.getHeight() - cVar3.getPaddingBottom()) - cVar3.getPaddingTop();
                ViewGroup viewGroup = fVar.f103855c;
                int iC = f.c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax = Math.max(iC, f.c(fVar.f103863k) + f.c(fVar.f103861i));
                ViewGroup viewGroup2 = fVar.f103856d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                int i34 = 2;
                boolean z14 = width <= iMax || height3 <= (height2 * 2) + paddingBottom;
                if (fVar.A != z14) {
                    fVar.A = z14;
                    view2.post(new d(fVar, i27));
                }
                i27 = i16 - i14 == i24 - i18 ? 0 : 1;
                if (!fVar.A && i27 != 0) {
                    view2.post(new d(fVar, i34));
                    break;
                }
                break;
        }
    }
}
