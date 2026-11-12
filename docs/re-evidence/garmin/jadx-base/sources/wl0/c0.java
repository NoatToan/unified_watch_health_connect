package wl0;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.garmin.android.apps.connectmobile.golf.truswing.view.SwingAnimationControlView;
import com.garmin.android.golfswing.GolfSwingTextureView;
import com.garmin.android.golfswing.GolfSwingViewManager;

/* JADX INFO: loaded from: classes8.dex */
public class c0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f185902a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f185903b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f185904c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f185905d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f185906e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.golf.truswing.f f185907f;

    public c0(com.garmin.android.apps.connectmobile.golf.truswing.f fVar) {
        this.f185907f = fVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view2, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1) {
            this.f185906e = true;
        } else if (action == 2 && this.f185906e) {
            this.f185906e = false;
            com.garmin.android.apps.connectmobile.golf.truswing.f fVar = this.f185907f;
            GolfSwingTextureView golfSwingTextureView = fVar.f35832d;
            Rect rect = this.f185902a;
            golfSwingTextureView.getHitRect(rect);
            GolfSwingTextureView golfSwingTextureView2 = fVar.f35832d;
            Rect rect2 = this.f185904c;
            golfSwingTextureView2.getGlobalVisibleRect(rect2);
            SwingAnimationControlView swingAnimationControlView = fVar.f35834f;
            Rect rect3 = this.f185903b;
            swingAnimationControlView.getGlobalVisibleRect(rect3);
            this.f185905d = rect2.equals(rect) || !rect2.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()) || rect3.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
        if (this.f185905d) {
            view2.onTouchEvent(motionEvent);
        } else {
            GolfSwingViewManager.getInstance().onTouchEvent(motionEvent);
        }
        if (this.f185906e) {
            this.f185905d = true;
        }
        return true;
    }
}
