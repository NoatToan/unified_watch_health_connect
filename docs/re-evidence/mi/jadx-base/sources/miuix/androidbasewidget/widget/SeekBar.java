package miuix.androidbasewidget.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.alb;
import defpackage.e5j;
import defpackage.qki;
import defpackage.y2j;
import defpackage.y94;
import defpackage.yhi;
import defpackage.zkb;
import java.lang.ref.WeakReference;
import java.util.Collection;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes3.dex */
public class SeekBar extends AppCompatSeekBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f26252b;
    public float c;
    public float d;
    public boolean e;
    public boolean f;
    public boolean g;
    public float h;
    public float i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26253k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public IStateStyle f26254r;
    public android.widget.SeekBar.OnSeekBarChangeListener s;
    public ColorStateList t;
    public int u;
    public float v;
    public boolean w;
    public final android.widget.SeekBar.OnSeekBarChangeListener x;

    public class a implements android.widget.SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public zkb f26255a;

        /* JADX INFO: renamed from: miuix.androidbasewidget.widget.SeekBar$a$a, reason: collision with other inner class name */
        public class C1020a extends TransitionListener {
            public C1020a() {
            }

            @Override // miuix.animation.listener.TransitionListener
            public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
                UpdateInfo updateInfoFindByName = UpdateInfo.findByName(collection, BroadcastsKt.SILENT_PUSHING_PROGRESS);
                if (updateInfoFindByName != null) {
                    SeekBar.this.setProgress(updateInfoFindByName.getIntValue());
                }
            }
        }

        public a() {
        }

        public final zkb a() {
            if (this.f26255a == null) {
                this.f26255a = new zkb(SeekBar.this.getContext());
            }
            return this.f26255a;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
            if (SeekBar.this.f && z) {
                int max = SeekBar.this.getMax() - SeekBar.this.getMinWrapper();
                float f = max;
                int iRound = Math.round(0.5f * f);
                float minWrapper = max > 0 ? (i - SeekBar.this.getMinWrapper()) / f : 0.0f;
                if (minWrapper <= SeekBar.this.c || minWrapper >= SeekBar.this.d) {
                    SeekBar.this.n = Math.round(i);
                    SeekBar.this.f26254r.setTo(BroadcastsKt.SILENT_PUSHING_PROGRESS, Integer.valueOf(SeekBar.this.n));
                } else {
                    SeekBar.this.n = iRound;
                }
                if (SeekBar.this.getProgress() != SeekBar.this.n) {
                    SeekBar.this.f26254r.to(BroadcastsKt.SILENT_PUSHING_PROGRESS, Integer.valueOf(SeekBar.this.n), new AnimConfig().setEase(-2, 0.9f, 0.15f).addListeners(new C1020a()));
                }
            }
            SeekBar seekBar2 = SeekBar.this;
            int iO = seekBar2.o(seekBar2.h);
            SeekBar seekBar3 = SeekBar.this;
            int iO2 = seekBar3.o(seekBar3.i);
            if (i < iO) {
                SeekBar.this.setProgress(iO);
                i = iO;
            } else if (i > iO2) {
                SeekBar.this.setProgress(iO2);
                i = iO2;
            }
            boolean z2 = i == iO || i == iO2;
            if (z) {
                if (!z2 || SeekBar.this.g) {
                    if (!SeekBar.this.g && HapticCompat.c("2.0")) {
                        HapticCompat.performHapticFeedback(seekBar, alb.B);
                    }
                } else if (!HapticCompat.c("2.0")) {
                    HapticCompat.performHapticFeedback(seekBar, alb.f1169k);
                } else if (i == iO2) {
                    a().c(203);
                } else {
                    a().c(202);
                }
            }
            SeekBar.this.g = z2;
            if (SeekBar.this.s != null) {
                SeekBar.this.s.onProgressChanged(seekBar, i, z);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
            if (SeekBar.this.s != null) {
                SeekBar.this.s.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
            if (SeekBar.this.s != null) {
                SeekBar.this.s.onStopTrackingTouch(seekBar);
            }
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<SeekBar> f26258a;

        public b(SeekBar seekBar) {
            this.f26258a = new WeakReference<>(seekBar);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<SeekBar> weakReference = this.f26258a;
            SeekBar seekBar = weakReference == null ? null : weakReference.get();
            if (seekBar != null) {
                seekBar.r();
            }
        }
    }

    public SeekBar(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getMinWrapper() {
        return super.getMin();
    }

    private synchronized int getRange() {
        return getMax() - getMinWrapper();
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        r();
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setAlpha(isEnabled() ? 255 : (int) (this.f26252b * 255.0f));
        }
    }

    @ViewDebug.ExportedProperty(category = "draggableProgress")
    public synchronized float getDraggableMaxPercentProgress() {
        return this.i;
    }

    @ViewDebug.ExportedProperty(category = "draggableProgress")
    public synchronized float getDraggableMinPercentProgress() {
        return this.h;
    }

    public final synchronized int o(float f) {
        return ((int) (f * getRange())) + getMinWrapper();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.w = false;
            this.v = motionEvent.getX();
        } else if (action == 1) {
            this.w = false;
        } else if (action != 2) {
            if (action == 3) {
                this.w = false;
            }
        } else if (!this.w && Math.abs(motionEvent.getX() - this.v) > this.u) {
            this.w = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return zOnTouchEvent;
    }

    public final float p(TypedArray typedArray, int i, float f) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        return (typedValuePeekValue == null || typedValuePeekValue.type != 6) ? f : typedValuePeekValue.getFraction(1.0f, 1.0f);
    }

    public final boolean q(int i, int i2) {
        float minWrapper = i > 0 ? (i2 - getMinWrapper()) / i : 0.0f;
        return minWrapper > this.c && minWrapper < this.d;
    }

    public final void r() {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
            if (drawableFindDrawableByLayerId instanceof ClipDrawable) {
                Drawable drawable = ((ClipDrawable) drawableFindDrawableByLayerId).getDrawable();
                if (drawable instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                    ColorStateList color = gradientDrawable.getColor();
                    if (this.t == null && color != null) {
                        this.t = color;
                    }
                    ColorStateList colorStateList = this.t;
                    if (colorStateList != null && (colorStateList.getColorForState(new int[]{-16842910}, this.p) != this.f26253k || this.t.getColorForState(android.widget.SeekBar.ENABLED_STATE_SET, this.o) != this.j)) {
                        GradientDrawable gradientDrawable2 = (GradientDrawable) gradientDrawable.mutate();
                        ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{this.f26253k, this.j});
                        this.t = colorStateList2;
                        gradientDrawable2.setColor(colorStateList2);
                    }
                }
            }
            Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.icon);
            if (drawableFindDrawableByLayerId2 instanceof GradientDrawable) {
                drawableFindDrawableByLayerId2.setColorFilter(this.f ? this.m : this.l, PorterDuff.Mode.SRC);
            }
        }
    }

    public synchronized void setDraggableMaxPercentProcess(float f) {
        float f2 = 1.0f;
        if (f > 1.0d || f < 0.0f) {
            f = 1.0f;
        }
        if (f >= this.h) {
            f2 = f;
        }
        this.i = f2;
        int iO = o(f2);
        if (getProgress() > iO) {
            setProgress(iO);
        }
    }

    public synchronized void setDraggableMinPercentProgress(float f) {
        double d = f;
        float f2 = 0.0f;
        if (d > 1.0d || d < 0.0d) {
            f = 0.0f;
        }
        if (f <= this.i) {
            f2 = f;
        }
        this.h = f2;
        int iO = o(f2);
        if (getProgress() < iO) {
            setProgress(iO);
        }
    }

    public void setIconPrimaryColor(int i) {
        this.m = i;
        r();
    }

    public void setMiddleEnabled(boolean z) {
        if (z != this.f) {
            this.f = z;
            r();
        }
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = this.x;
        if (onSeekBarChangeListener == onSeekBarChangeListener2) {
            super.setOnSeekBarChangeListener(onSeekBarChangeListener2);
        } else {
            this.s = onSeekBarChangeListener;
        }
    }

    public SeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, yhi.i);
    }

    public SeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a aVar = new a();
        this.x = aVar;
        y94.b(this, false);
        this.u = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e5j.d0, i, y2j.d);
        this.o = context.getResources().getColor(qki.e);
        this.p = context.getResources().getColor(qki.d);
        this.q = context.getResources().getColor(qki.c);
        this.f = typedArrayObtainStyledAttributes.getBoolean(e5j.l0, false);
        this.j = typedArrayObtainStyledAttributes.getColor(e5j.h0, this.o);
        this.f26253k = typedArrayObtainStyledAttributes.getColor(e5j.i0, this.p);
        this.m = typedArrayObtainStyledAttributes.getColor(e5j.j0, this.q);
        this.f26252b = typedArrayObtainStyledAttributes.getFloat(e5j.e0, 0.5f);
        this.c = typedArrayObtainStyledAttributes.getFloat(e5j.m0, 0.46f);
        this.d = typedArrayObtainStyledAttributes.getFloat(e5j.k0, 0.54f);
        this.h = p(typedArrayObtainStyledAttributes, e5j.g0, 0.0f);
        this.i = p(typedArrayObtainStyledAttributes, e5j.f0, 1.0f);
        setDraggableMinPercentProgress(this.h);
        setDraggableMaxPercentProcess(this.i);
        typedArrayObtainStyledAttributes.recycle();
        this.l = context.getResources().getColor(qki.h);
        float f = this.c;
        if (f > 0.5f || f < 0.0f) {
            this.c = 0.46f;
        }
        float f2 = this.d;
        if (f2 < 0.5f || f2 > 1.0f) {
            this.d = 0.54f;
        }
        int max = getMax() - getMinWrapper();
        this.e = q(max, getProgress());
        this.n = getProgress();
        if (this.e) {
            int iRound = Math.round(max * 0.5f);
            this.n = iRound;
            setProgress(iRound);
        }
        IStateStyle iStateStyleUseValue = Folme.useValue(Integer.valueOf(this.n));
        this.f26254r = iStateStyleUseValue;
        iStateStyleUseValue.setTo(BroadcastsKt.SILENT_PUSHING_PROGRESS, Integer.valueOf(this.n));
        Folme.getTarget(Integer.valueOf(this.n)).setMinVisibleChange(BroadcastsKt.SILENT_PUSHING_PROGRESS, 0.1f);
        setOnSeekBarChangeListener(aVar);
        post(new b(this));
        Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.NORMAL).handleHoverOf(this, new AnimConfig[0]);
    }
}
