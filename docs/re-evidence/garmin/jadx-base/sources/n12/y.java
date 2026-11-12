package n12;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class y implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122348a;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view2, MotionEvent motionEvent) {
        switch (this.f122348a) {
            case 0:
                int i14 = com.garmin.android.apps.connectmobile.userprofile.editimage.c.f46657x;
                return true;
            default:
                int i15 = tm0.c.f165349i;
                view2.getParent().requestDisallowInterceptTouchEvent(true);
                int action = motionEvent.getAction() & 255;
                if (action == 1 || action == 3) {
                    view2.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
        }
    }
}
