package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.uimanager.e;
import com.facebook.react.views.art.ARTSurfaceView;

/* JADX INFO: loaded from: classes4.dex */
public class g9 extends cbe implements TextureView.SurfaceTextureListener, LifecycleEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Surface f18738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f18739b;

    public final void a(boolean z) {
        Surface surface = this.f18738a;
        if (surface == null || !surface.isValid()) {
            b(this);
            return;
        }
        try {
            Canvas canvasLockCanvas = this.f18738a.lockCanvas(null);
            canvasLockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            Integer num = this.f18739b;
            if (num != null) {
                canvasLockCanvas.drawColor(num.intValue());
            }
            Paint paint = new Paint();
            for (int i = 0; i < getChildCount(); i++) {
                jb jbVar = (jb) getChildAt(i);
                jbVar.a(canvasLockCanvas, paint, 1.0f);
                if (z) {
                    jbVar.markUpdated();
                } else {
                    jbVar.markUpdateSeen();
                }
            }
            Surface surface2 = this.f18738a;
            if (surface2 == null) {
                return;
            }
            surface2.unlockCanvasAndPost(canvasLockCanvas);
        } catch (IllegalArgumentException e) {
            e = e;
            cm8.i("ReactNative", e.getClass().getSimpleName() + " in Surface.unlockCanvasAndPost");
        } catch (IllegalStateException e2) {
            e = e2;
            cm8.i("ReactNative", e.getClass().getSimpleName() + " in Surface.unlockCanvasAndPost");
        }
    }

    public final void b(oej oejVar) {
        for (int i = 0; i < oejVar.getChildCount(); i++) {
            oej childAt = oejVar.getChildAt(i);
            if (childAt != null) {
                childAt.markUpdateSeen();
                b(childAt);
            }
        }
    }

    public void c(ARTSurfaceView aRTSurfaceView) {
        SurfaceTexture surfaceTexture = aRTSurfaceView.getSurfaceTexture();
        aRTSurfaceView.setSurfaceTextureListener(this);
        if (surfaceTexture == null || this.f18738a != null) {
            return;
        }
        this.f18738a = new Surface(surfaceTexture);
        a(true);
    }

    @Override // defpackage.pej, defpackage.oej
    public void dispose() {
        super.dispose();
        getThemedContext().removeLifecycleEventListener(this);
    }

    @Override // defpackage.pej, defpackage.oej
    public boolean isVirtual() {
        return false;
    }

    @Override // defpackage.pej
    public boolean isVirtualAnchor() {
        return true;
    }

    @Override // defpackage.pej
    public void onCollectExtraUpdates(e eVar) {
        super.onCollectExtraUpdates(eVar);
        a(false);
        eVar.K(getReactTag(), this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        a(false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f18738a = new Surface(surfaceTexture);
        a(false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f18738a.release();
        this.f18738a = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @iej(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        this.f18739b = num;
        markUpdated();
    }

    @Override // defpackage.pej, defpackage.oej
    public void setThemedContext(g9p g9pVar) {
        super.setThemedContext(g9pVar);
        g9pVar.addLifecycleEventListener(this);
    }
}
