package kc;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f103850b;

    public /* synthetic */ d(f fVar, int i14) {
        this.f103849a = i14;
        this.f103850b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be A[LOOP:3: B:37:0x00b8->B:39:0x00be, LOOP_END] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f103849a) {
            case 0:
                this.f103850b.k();
                break;
            case 1:
                f fVar = this.f103850b;
                View view2 = fVar.f103862j;
                ViewGroup viewGroup = fVar.f103857e;
                if (viewGroup != null) {
                    viewGroup.setVisibility(fVar.A ? 0 : 4);
                }
                if (view2 != null) {
                    int dimensionPixelSize = fVar.f103853a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (fVar.A) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view2.setLayoutParams(marginLayoutParams);
                    }
                    if (view2 instanceof androidx.media3.ui.b) {
                        androidx.media3.ui.b bVar = (androidx.media3.ui.b) view2;
                        Rect rect = bVar.f10011a;
                        ValueAnimator valueAnimator = bVar.I;
                        if (fVar.A) {
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            bVar.T = true;
                            bVar.P = 0.0f;
                            bVar.invalidate(rect);
                        } else {
                            int i14 = fVar.f103878z;
                            if (i14 == 1) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                bVar.T = false;
                                bVar.P = 0.0f;
                                bVar.invalidate(rect);
                            } else if (i14 != 3) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                bVar.T = false;
                                bVar.P = 1.0f;
                                bVar.invalidate(rect);
                            }
                        }
                    }
                }
                for (View view3 : fVar.f103877y) {
                    view3.setVisibility((fVar.A && f.j(view3)) ? 4 : 0);
                }
                break;
            case 2:
                f fVar2 = this.f103850b;
                ValueAnimator valueAnimator2 = fVar2.f103870r;
                View view4 = fVar2.f103863k;
                androidx.media3.ui.c cVar = fVar2.f103853a;
                ViewGroup viewGroup2 = fVar2.f103859g;
                ViewGroup viewGroup3 = fVar2.f103858f;
                if (viewGroup3 != null && viewGroup2 != null) {
                    int width = (cVar.getWidth() - cVar.getPaddingLeft()) - cVar.getPaddingRight();
                    while (true) {
                        if (viewGroup2.getChildCount() <= 1) {
                            if (view4 != null) {
                                view4.setVisibility(8);
                            }
                            int iC = f.c(fVar2.f103861i);
                            int childCount = viewGroup3.getChildCount() - 1;
                            for (int i15 = 0; i15 < childCount; i15++) {
                                iC += f.c(viewGroup3.getChildAt(i15));
                            }
                            if (iC > width) {
                                if (view4 != null) {
                                    view4.setVisibility(0);
                                    iC += f.c(view4);
                                }
                                ArrayList arrayList = new ArrayList();
                                for (int i16 = 0; i16 < childCount; i16++) {
                                    View childAt = viewGroup3.getChildAt(i16);
                                    iC -= f.c(childAt);
                                    arrayList.add(childAt);
                                    if (iC <= width) {
                                        if (!arrayList.isEmpty()) {
                                            viewGroup3.removeViews(0, arrayList.size());
                                            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                                viewGroup2.addView((View) arrayList.get(i17), viewGroup2.getChildCount() - 1);
                                            }
                                        }
                                    }
                                    break;
                                }
                                if (!arrayList.isEmpty()) {
                                    viewGroup3.removeViews(0, arrayList.size());
                                    while (i17 < arrayList.size()) {
                                        viewGroup2.addView((View) arrayList.get(i17), viewGroup2.getChildCount() - 1);
                                    }
                                }
                                break;
                            } else {
                                ViewGroup viewGroup4 = fVar2.f103860h;
                                if (viewGroup4 != null && viewGroup4.getVisibility() == 0 && !valueAnimator2.isStarted()) {
                                    fVar2.f103869q.cancel();
                                    valueAnimator2.start();
                                    break;
                                }
                            }
                        } else {
                            int childCount2 = viewGroup2.getChildCount() - 2;
                            View childAt2 = viewGroup2.getChildAt(childCount2);
                            viewGroup2.removeViewAt(childCount2);
                            viewGroup3.addView(childAt2, 0);
                        }
                    }
                }
                break;
            case 3:
                this.f103850b.f103866n.start();
                break;
            case 4:
                this.f103850b.f103865m.start();
                break;
            case 5:
                f fVar3 = this.f103850b;
                fVar3.f103864l.start();
                fVar3.e(fVar3.f103873u, 2000L);
                break;
            default:
                this.f103850b.i(2);
                break;
        }
    }
}
