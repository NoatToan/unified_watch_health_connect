package com.google.firebase.perf.util;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.core.view.x0;
import c53.c0;
import cl0.b;
import com.garmin.android.apps.connectmobile.golf.truswing.h;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53809c;

    public /* synthetic */ a(int i14, Object obj, Object obj2) {
        this.f53807a = i14;
        this.f53808b = obj;
        this.f53809c = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewGroup.LayoutParams layoutParams;
        switch (this.f53807a) {
            case 0:
                ((FirstDrawDoneListener) this.f53808b).lambda$onDraw$0((View) this.f53809c);
                break;
            case 1:
                h hVar = (h) this.f53808b;
                b bVar = (b) this.f53809c;
                if (bVar.x() < 0) {
                    Rect rect = new Rect();
                    hVar.f35833e.getGlobalVisibleRect(rect);
                    int iHeight = rect.height() - hVar.f35851x.getHeight();
                    if (iHeight > 0) {
                        bVar.n(iHeight);
                        ViewGroup viewGroup = hVar.f35831c;
                        if (viewGroup != null) {
                            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                            layoutParams2.height = iHeight;
                            hVar.f35831c.setLayoutParams(layoutParams2);
                        }
                    }
                }
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f53808b;
                LinearLayout linearLayout2 = (LinearLayout) this.f53809c;
                View view2 = (View) c0.j(new x0(linearLayout));
                if (view2 != null) {
                    int height = view2.getHeight();
                    View view3 = (View) c0.j(new x0(linearLayout2));
                    if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
                        layoutParams.height = height;
                    }
                    View view4 = (View) c0.j(new x0(linearLayout2));
                    if (view4 != null) {
                        view4.requestLayout();
                    }
                }
                break;
        }
    }
}
