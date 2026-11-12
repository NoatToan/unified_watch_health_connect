package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kc.h;

/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f9947d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f9948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f9949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9950c;

    public interface b {
    }

    public final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f9951a;

        private c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f9951a = false;
            int i14 = AspectRatioFrameLayout.f9947d;
            AspectRatioFrameLayout.this.getClass();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9950c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h.f103892a, 0, 0);
            try {
                this.f9950c = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th3) {
                typedArrayObtainStyledAttributes.recycle();
                throw th3;
            }
        }
        this.f9948a = new c();
    }

    public int getResizeMode() {
        return this.f9950c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r4 > 0.0f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        r2 = r2 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        r1 = r1 / r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r4 > 0.0f) goto L23;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i14, int i15) {
        float f14;
        super.onMeasure(i14, i15);
        if (this.f9949b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f15 = measuredWidth;
        float f16 = measuredHeight;
        float f17 = (this.f9949b / (f15 / f16)) - 1.0f;
        float fAbs = Math.abs(f17);
        c cVar = this.f9948a;
        if (fAbs <= 0.01f) {
            if (cVar.f9951a) {
                return;
            }
            cVar.f9951a = true;
            AspectRatioFrameLayout.this.post(cVar);
            return;
        }
        int i16 = this.f9950c;
        if (i16 == 0) {
            f14 = this.f9949b;
        } else if (i16 == 1) {
            float f18 = f15 / this.f9949b;
            measuredHeight = (int) f18;
        } else if (i16 == 2) {
            float f19 = f16 * this.f9949b;
            measuredWidth = (int) f19;
        } else if (i16 == 4) {
            f14 = this.f9949b;
        }
        if (!cVar.f9951a) {
            cVar.f9951a = true;
            AspectRatioFrameLayout.this.post(cVar);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f14) {
        if (this.f9949b != f14) {
            this.f9949b = f14;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
    }

    public void setResizeMode(int i14) {
        if (this.f9950c != i14) {
            this.f9950c = i14;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }
}
