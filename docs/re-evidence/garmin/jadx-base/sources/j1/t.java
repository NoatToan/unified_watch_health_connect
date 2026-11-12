package j1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import b0.l0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends View {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f96310d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f96311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Window f96312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f96313c;

    public t(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        setBackgroundColor(-1);
        setAlpha(0.0f);
        setElevation(Float.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.f96312b;
        if (window == null) {
            return Float.NaN;
        }
        return window.getAttributes().screenBrightness;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f14) {
        if (this.f96312b == null || Float.isNaN(f14)) {
            return;
        }
        WindowManager.LayoutParams attributes = this.f96312b.getAttributes();
        attributes.screenBrightness = f14;
        this.f96312b.setAttributes(attributes);
    }

    private void setScreenFlashUiInfo(l0.j jVar) {
        b bVar = this.f96311a;
        if (bVar == null) {
            return;
        }
        l1.a aVar = new l1.a(l1.a.EnumC2071a.SCREEN_FLASH_VIEW, jVar);
        l1.a aVarH = bVar.h();
        bVar.D.put(aVar.f108045a, aVar);
        l1.a aVarH2 = bVar.h();
        if (aVarH2 == null || aVarH2.equals(aVarH)) {
            return;
        }
        l1.a aVarH3 = bVar.h();
        l0 l0Var = bVar.f96205d;
        if (aVarH3 == null) {
            b.a aVar2 = b.F;
            l0Var.getClass();
            m0.h.f115497e.getClass();
            m0.h hVar = new m0.h(aVar2, null);
            l0Var.f14020w = hVar;
            l0Var.d().k(hVar);
            return;
        }
        l0.j jVar2 = aVarH3.f108046b;
        l0Var.getClass();
        m0.h.f115497e.getClass();
        m0.h hVar2 = new m0.h(jVar2, null);
        l0Var.f14020w = hVar2;
        l0Var.d().k(hVar2);
        aVarH3.f108045a.name();
    }

    public l0.j getScreenFlash() {
        return this.f96313c;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(b bVar) {
        j0.u.a();
        b bVar2 = this.f96311a;
        if (bVar2 != null && bVar2 != bVar) {
            setScreenFlashUiInfo(null);
        }
        this.f96311a = bVar;
        if (bVar == null) {
            return;
        }
        j0.u.a();
        if (bVar.f96205d.H() == 3 && this.f96312b == null) {
            vb.h.z("No window set despite setting FLASH_MODE_SCREEN in CameraController");
        } else {
            setScreenFlashUiInfo(getScreenFlash());
        }
    }

    public void setScreenFlashWindow(Window window) {
        j0.u.a();
        if (this.f96312b != window) {
            this.f96313c = window == null ? null : new r(this);
        }
        this.f96312b = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    public t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public t(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0);
    }

    public t(Context context) {
        this(context, null);
    }
}
