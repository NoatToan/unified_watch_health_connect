package vx0;

import android.view.KeyEvent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.view.ExpandableTextView;
import p005kotlin.jvm.internal.s;
import x22.d;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f180645b;

    public /* synthetic */ a(KeyEvent.Callback callback, int i14) {
        this.f180644a = i14;
        this.f180645b = callback;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f180644a) {
            case 0:
                ExpandableTextView.setExpandableText$lambda$0((ExpandableTextView) this.f180645b);
                return;
            default:
                d dVar = (d) this.f180645b;
                FrameLayout frameLayout = dVar.f188537i;
                if (frameLayout == null) {
                    s.m("notificationLayout");
                    throw null;
                }
                int height = frameLayout.getHeight();
                CoordinatorLayout coordinatorLayout = dVar.f188536h;
                if (height != 0) {
                    if (coordinatorLayout != null) {
                        coordinatorLayout.setImportantForAccessibility(4);
                        return;
                    } else {
                        s.m("rootLayout");
                        throw null;
                    }
                }
                if (coordinatorLayout != null) {
                    coordinatorLayout.setImportantForAccessibility(1);
                    return;
                } else {
                    s.m("rootLayout");
                    throw null;
                }
        }
    }
}
